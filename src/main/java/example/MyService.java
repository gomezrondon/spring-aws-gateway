package example;


import org.springframework.stereotype.Service;
import java.time.LocalDateTime;


@Service
public class MyService {

    public String getTime(){
        return " Time: "+ LocalDateTime.now().toString();
    }

}
