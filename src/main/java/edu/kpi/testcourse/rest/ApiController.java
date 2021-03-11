package edu.kpi.testcourse.rest;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

/**
 * Контроллер REST API, который обеспечивает логику для фреймворка Micronaut.
 */
@Secured(SecurityRule.IS_ANONYMOUS) // IS_AUTHENTICATED
@Controller
public class ApiController {

  /*
  Дефолтный пример
   @Get(value = "/hello", produces = MediaType.APPLICATION_JSON)
   public String hello() {
   return Main.getGson().toJson(new ExampleClass("Hello", "world!"));
   }
   */
  
  @Get(value = "/urls", produces = MediaType.APPLICATION_JSON)
  public String[] getAccount() {
    return new String[]{"Url array"};
  }

  /*
    Ответ singUp
   */
  @Post(value = "/signup", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<Object> signUp(String string) {
    return HttpResponse.ok();
  }

  /*
    Ответ deleteUrl
   */
  @Delete(value = "/urls/{alias}")
  public HttpResponse<Object> deleteUrl(String alias) {
    return HttpResponse.ok();
  }

  /*
    Ответ shortenUrl
   */
  @Post(value = "/urls/shorten", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<Object> shortenUrl(String shortenData) {
    return HttpResponse.ok();
  }
}
