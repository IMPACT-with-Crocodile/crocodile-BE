package impact.crocodile.response;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

public class ResBody {
    public static ResponseEntity<Object> successResponse() {
        SuccessBody successBody = new SuccessBody();
        return ResponseEntity.ok(successBody);
    }

    public static ResponseEntity<Object> successResponse(Object data) {
        SuccessBody successBody = new SuccessBody(data);
        return ResponseEntity.ok(successBody);
    }


}