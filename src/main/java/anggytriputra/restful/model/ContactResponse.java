package anggytriputra.restful.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactResponse {

    private String id;

    private String fisrtName;

    private String lastName;

    private String email;

    private String phone;
    
}
