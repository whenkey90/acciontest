package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AL1782 on 15-May-17.
 */
@RestController
public class PersonController {

    @RequestMapping(value = "/getData", produces = "application/json")
    public String getData(){
        return "hi AWS !! get the data !!";
    }

    @RequestMapping(value = "/test1", produces = "application/json")
    public String test1(){
        return "{'message':'Test1_v1'}";
    }

    @RequestMapping(value = "/test2", produces = "application/json")
    public String test2(){
        return "{'message':'Test2_v2'}";
    }
}
