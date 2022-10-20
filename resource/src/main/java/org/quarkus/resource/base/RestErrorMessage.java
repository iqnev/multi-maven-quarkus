package org.quarkus.resource.base;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "error")
@Getter
public class RestErrorMessage {
    private String code;
    private String message;
}
