package sergei.tsapko.test.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import sergei.tsapko.test.model.entity.Result;

import java.io.IOException;
import java.net.URL;

public class Service {

    public static Result getData() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Result result = mapper.readValue(new URL("https://randomuser.me/api/?results=5&inc=name,email&noinfo"), Result.class);
        return result;
        }
    }

