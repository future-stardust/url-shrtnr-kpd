package edu.kpi.testcourse.auth;

/**
 Класс для ссылок.
 */
public class Url {
  private Account account;
  private String shortUrl;
  private String url;


  /**
   Конструктор для email и hashPass.
   */
  public Url(Account account, String shortUrl, String url) {
    this.account = account;
    this.shortUrl = shortUrl;
    this.url = url;

  }

  /*
  Получаем ссылку
  */
  public String getUrl() {
    return url;
  }

  /*
   Получаем аккаунт
   */
  public Account getAccount() {
    return account;
  }

  /*
  Получаем алиас
  */
  public String getAlias() {
    return shortUrl;
  }

}


