package anggytriputra.restful.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterUserRequest {


    @NotBlank    // notBlank saat register username tidak boleh kosong
    @Size(max = 100)   // size charcter paling banyak 100
    private String username;

    @NotBlank
    @Size(max = 100)
    private String password;

    @NotBlank
    @Size(max = 100)
    private String name;
}
