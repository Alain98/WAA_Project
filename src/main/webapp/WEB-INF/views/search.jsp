<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
	<jsp:include page="header.jsp" />  
		<div id="page">

			<jsp:include page="slide.jsp"/>
		
           <div id="loginForm">
    		
		    		<div class="row">
		    			Search for hotel rooms by location
		  			</div> 
		  			
					<div class="row">
		    			<input type="text" id="searchInput" placeholder="City, postcode or state...">
					</div>	
					
					<div class="row">	
						<button type="button" id="searchGoButton">Go</button>
					</div>	 
 		 </div>
 		 
 		 <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAkFrdKaIKvDxBmmCOV-PNjyS5TNUY8AII&libraries=places&callback=initMap"
                async defer></script>

        <script>
            // Populated with search location on autocomplete place_changed event.
            var searchLocation = { state: '', city: '', postcode: '' };

            // https://developers.google.com/maps/documentation/javascript/reference/3.exp/places-widget
            function initMap() {
                var searchInput = document.getElementById('searchInput');

                var searchOptions = {
                    componentRestrictions: {
                        country: 'us'
                    },
                    types: ['(regions)']
                };
                var autocomplete = new google.maps.places.Autocomplete(searchInput, searchOptions);

                // https://console.developers.google.com/apis/dashboard?project=hotels-200012&showFTMessage=false&duration=PT1H
                // https://developers.google.com/places/supported_types#table3
                // SET API key to my IP only seems key is public in html ...
                autocomplete.addListener('place_changed', function () {
                    // searchInputWrapper.toggleClass("loading");
                    var place = autocomplete.getPlace();

                    searchLocation = place.address_components.reduce(function(acc, curr) {
                        if (curr.types.includes('postal_code')) {
                            acc.postcode = curr.long_name;
                        }
                        if (curr.types.includes('locality')) {
                            acc.city = curr.long_name;
                        }
                        if (curr.types.includes('administrative_area_level_1')) {
                            acc.state = curr.short_name;
                        }
                        return acc;
                    }, searchLocation);
                });
            }

            $(document).ready(function () {
                $("#searchGoButton").click(function() {
                    var originalQueryString = locationQueryString(searchLocation) ;//+ "&" + pagingAndSortingQueryString();
                    window.location = "/" + window.location.pathname.split('/')[1] +'/hotels/search?' + originalQueryString;
                });
            });

            function locationQueryString(searchLocation) {
                for (var key in searchLocation) {
                    if (searchLocation.hasOwnProperty(key) && searchLocation[key] === '') {
                        delete searchLocation[key]
                    }
                }
                return $.param(searchLocation);
            }

            function pagingAndSortingQueryString() {
                return "page=0&sort=stars,desc&sort=name"
            }


        </script>
 
 </div>

 <jsp:include page="footer.jsp"/>