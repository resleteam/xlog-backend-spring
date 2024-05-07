import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/api/register")
    public ResponseEntity<String> register(@RequestBody RegistrationRequest request) {

        if (!isValid(request)) {
            return ResponseEntity.badRequest().body("Невірний формат даних");
        }


        boolean isRegistered = registerUser(request);

        if (isRegistered) {
            return ResponseEntity.ok("Користувач успішно зареєстрований!");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Помилка при реєстрації");
        }
    }

    private boolean isValid(RegistrationRequest request) {

        return true;
    }

    private boolean registerUser(RegistrationRequest request) {

        return true;
    }
}
