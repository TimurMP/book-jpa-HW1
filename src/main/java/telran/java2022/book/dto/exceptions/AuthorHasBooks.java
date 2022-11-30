package telran.java2022.book.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class AuthorHasBooks extends RuntimeException {
	private static final long serialVersionUID = 8647573866454320680L;


}
