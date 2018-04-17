package daggerok;

import lombok.NoArgsConstructor;

import javax.jws.WebMethod;
import javax.jws.WebService;

import static java.lang.String.format;

@WebService
@NoArgsConstructor
public class App {

  @WebMethod(operationName = "greeting")
  public String greeting(final String name) {
    final String username = null == name ? "Guest" : name;
    return format("Hello, %s!", username);
  }
}
