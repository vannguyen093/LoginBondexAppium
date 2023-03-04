package data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CustomerData {
        @JsonProperty("id")
        String email;
        @JsonProperty("pass")
        String password;
        @JsonProperty("pass1")
        String password1;
        @JsonProperty("pass2")
        String password2;
}
