package edu.kpi.testcourse.logic;

import edu.kpi.testcourse.auth.Account;
import edu.kpi.testcourse.base.DataBox;

/**
 * Аккаунт логика.
 */
public class AccountLog {

  private DataBox base;

  public AccountLog() {
    base = new DataBox();
  }

  public void createAccount() {
    Account account1 = new Account("ilya@gmail.com", "qwerty");
    base.addAccount(account1);
  }
}
