package mum.edu.booking_system.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

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
	//@DateTimeFormat(pattern="MM/YY")
	private String ExpirationDate;
	
	@Column
	@NotNull
	@Range(min=111, max=999, message="{Range.cvCode}")
	private Integer cvCode;

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

	public Integer getCvCode() {
		return cvCode;
	}

	public void setCvCode(Integer cvCode) {
		this.cvCode = cvCode;
	}
	

}
