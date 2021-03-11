package edu.kpi.testcourse.auth;

/**
 Аккаунт имееться введу юзер.
 */
public class Account {
  private int id;
  private String email;
  private String hashPass;

  /**
   Конструктор для email и hashPass
   */
  public Account(String email, String hashPass) {
    this.email = email;
    this.hashPass = hashPass;
  }

  /**
   Меняем id
   */
  public void setId(int i) {
    this.id = i;
  }

  /**
   Получаем id
   */
  public int getId() {
    return id;
  }

  /**
   Получем email
   */
  public String getAccountEmail() {
    return email;
  }

  /**
   Получаем hashPass
   */
  public String getAccountHashPass() {
    return hashPass;
  }
}
