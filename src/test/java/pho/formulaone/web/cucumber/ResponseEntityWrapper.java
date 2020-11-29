package pho.formulaone.web.cucumber;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseEntityWrapper {
    protected ResponseEntity<String> response;
}
