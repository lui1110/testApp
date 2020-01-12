import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Pojo {

    @JsonProperty("bgd")
    @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = BG.class)
    public BigDecimal bg;

    public static class BG {
        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }

}
