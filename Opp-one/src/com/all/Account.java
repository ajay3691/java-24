package com.all;

public class Account extends Bank{
	private int acc_Id;
	public int getAcc_Id() {
		return acc_Id;
	}

	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}

	public String getAcc_Name() {
		return acc_Name;
	}

	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}

	public double getAcc_Amount() {
		return acc_Amount;
	}

	public void setAcc_Amount(double acc_Amount) {
		this.acc_Amount = acc_Amount;
	}

	private String acc_Name;
	private double acc_Amount;
	
	public void cal_Bal() {}
	
}
