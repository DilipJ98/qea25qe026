package com.cognizant.qea25qe026;

public class PaymentGateWay {
	public void makePya(AbstractClassEx pay) {
		pay.payment();
	}
	
	
	public static void main(String[] args) {
		UpiPaymentClass upi = new UpiPaymentClass();
		CrediCardClass cred = new CrediCardClass();
		PaymentGateWay pay = new PaymentGateWay();
//		pay.makePayment(cred);
	}
}
