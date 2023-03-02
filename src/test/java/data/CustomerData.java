package data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CustomerData {
        @JsonProperty("id")
        String email;
        @JsonProperty("pass")
        String password;
}
