package com.rjpard.jenkinsrd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBankAccount {
	
	@Test
	public void testDebit(){
		BankAccount bankAccount = new BankAccount(10);
		bankAccount.debit(5);
		assertEquals(5, bankAccount.getBalance(),0);
	}
}