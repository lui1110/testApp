import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.math.BigDecimal;

public class TestPojo {

    @Test
    public void serialiation() throws JsonProcessingException {
        Pojo ob = new Pojo();

        ob.bg = null;

        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.writeValueAsString(ob));
    }

}
