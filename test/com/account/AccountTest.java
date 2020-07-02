/**
 * 
 */
package com.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author USER
 *
 */
class AccountTest {
	Account account;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp()  {
		
		account = new Account();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void accountObjectIsNotNullTest() {
		
		assertNotNull(account);
		
	}
@Test
void accountObjectCanReceiveDepositTest() {
	
	account.depositMoney(2500);
	assertEquals(2500,account.getAccountBalance());
	
	account.depositMoney(5000);
	assertEquals(7500,account.getAccountBalance());

}
	
	@Test
	void accountWillNotTakeNegativeAmountTest() {
		account.depositMoney(5000);
		account.depositMoney(-1500);
		int accountBalance = account.getAccountBalance();
		assertEquals(5000,account.getAccountBalance());

	}
	
//	@Test
//	void accountObjectCanWithdrawCashTest() {
//		account.depositMoney(5000);
//		account.withdrawCash(2000);
//		assertEquals(3000, account.getAccountBalance());
//	}
//	
//	@Test
//	void accountObjectCanWithdrawWithPinTest() {
//		account.depositMoney(5000);
//		account.withdrawCashWithPin(3000, 5555);
//		assertEquals(2000, account.getAccountBalance());
//	}
//	
//	@Test
//	void accountObjectWithdrawWithinBalanceTest() {
//		account.depositMoney(5000);
///		account.withdrawWithinBalance(6500);
//		assertNotEquals(6500, account.getAccountBalance());
//	}
//	
	@Test
	void accountObjectMinimumBalanceTest() {
		account.depositMoney(5000);
		account.withdrawCashWithPin(4000, 5555);
		
		assertEquals(1000, account.getAccountBalance());
	}
}
