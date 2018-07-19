package mum.edu.booking_system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column
	private Integer paymentId;
	
	@Column
	@NotNull
	private Integer cardNumber;
	
	@Column
	@NotEmpty
	private String ExpirationDate;
	
	@Column
	@NotEmpty
	private String cvCode;

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}

	public String getCvCode() {
		return cvCode;
	}

	public void setCvCode(String cvCode) {
		this.cvCode = cvCode;
	}
	

}
