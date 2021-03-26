package org.acme;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.util.Date;

@ApplicationScoped
public class GreetingService {

    Date date;
    public String greeting(String name) {
        return "hello " + name;
    }
}
