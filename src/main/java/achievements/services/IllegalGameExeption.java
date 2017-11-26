package achievements.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IllegalGameExeption extends RuntimeException {
    public IllegalGameExeption() {
        super("Game doesn't exist!");
    }
}