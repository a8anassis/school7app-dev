package gr.aueb.cf.schoolapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
//public class ResponseMessageDTO {
//    private String code;
//    private String description;
//
//    public ResponseMessageDTO(String code) {
//        this.code = code;
//        this.description = "";
//    }
//}

public record ResponseMessageDTO(
        String code,
        String description
) {
    public ResponseMessageDTO(String code) {
        this(code, ""); // auxiliary constructor, must call canonical
    }
}
