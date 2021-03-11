package edu.kpi.testcourse.base;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import edu.kpi.testcourse.auth.Account;
import edu.kpi.testcourse.auth.Url;
import java.io.FileWriter;
import java.io.IOException;

/**
 Класс для хранения данных.
 */
public class DataBox {
  JSONObject obj = new JSONObject();
  JSONArray accountsList = new JSONArray();
  JSONArray linksList = new JSONArray();
  private FileWriter fileWriter;
  private final String fileName = "box.txt";

  /**
   Добавление шорт Url.
   */
  public boolean addShortUrl(Url url) {
    JSONObject newL = new JSONObject();
    newL.put("link", url.getUrl());
    newL.put("accountId", url.getAccount().getId());
    newL.put("id", linksList.size());
    newL.put("short_link", url.getAlias());
    linksList.add(newL);
    return true;
  }

  /**
   Добавление аккаунта в дата бокс.
   */
  public boolean addAccount(Account account) {
    account.setId(accountsList.size());
    JSONObject newAccount = new JSONObject();
    newAccount.put("id", accountsList.size());
    newAccount.put("email", account.getAccountEmail());
    newAccount.put("hashPass", account.getAccountHashPass());
    accountsList.add(newAccount);
    return true;
  }

  /**
   Получение шорт Url.
   */
  public String getShortUrl(String url) {
    return "";
  }

  /**
   Удаление шорт Url.
   */
  public boolean deleteShortUrl(String url) {

    return true;
  }

  /**
   Сохранение данных.
   */
  private boolean saveToFile() {
    obj.put("accounts", accountsList);
    obj.put("links", linksList);

    try {
      fileWriter = new FileWriter(fileName);
      fileWriter.write(obj.toJSONString());
      fileWriter.close();
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }

  }

}