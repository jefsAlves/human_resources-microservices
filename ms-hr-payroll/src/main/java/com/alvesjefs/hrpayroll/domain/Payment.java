package com.alvesjefs.hrpayroll.domain;

import java.io.Serializable;
import java.util.Objects;

public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private String office;
	private String cpf;
	private String rg;
	private Double dailyIncome;
	private Integer days;

	public Payment() {
	}

	public Payment(String name, String email, String office, String cpf, String rg, Double dailyIncome, Integer days) {
		this.name = name;
		this.email = email;
		this.office = office;
		this.cpf = cpf;
		this.rg = rg;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Double getTotal() {
		return dailyIncome * days;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", office=");
		builder.append(office);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", rg=");
		builder.append(rg);
		builder.append(", dailyIncome=");
		builder.append(dailyIncome);
		builder.append(", days=");
		builder.append(days);
		builder.append("]");
		return builder.toString();
	}

}
