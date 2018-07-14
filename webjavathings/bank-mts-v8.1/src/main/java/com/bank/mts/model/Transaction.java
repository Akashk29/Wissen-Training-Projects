package com.bank.mts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "num")
	private String accountNum;
	
	public Transaction( String accountNum, Date date, String type, double amount, double closingBalance,
			String description) {
		super();
		this.accountNum = accountNum;
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.closingBalance = closingBalance;
		this.description = description;
	}
	private Date date;
	private String type;
	private double amount;
	private double closingBalance;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(double closingBalance) {
		this.closingBalance = closingBalance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", accountNum=" + accountNum + ", date=" + date + ", type=" + type
				+ ", amount=" + amount + ", closingBalance=" + closingBalance + ", description=" + description + "]";
	}
	
	
	
	
	
}
