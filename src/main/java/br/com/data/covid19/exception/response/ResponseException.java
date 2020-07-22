package br.com.data.covid19.exception.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import javax.servlet.http.HttpServletRequest;

@Getter
@AllArgsConstructor
public class ResponseException {
        public final String path;
        public final String message;

        public ResponseException(HttpServletRequest path, RuntimeException ex) {
            this.path = path.getRequestURI();
            this.message = ex.getLocalizedMessage();
        }
}
