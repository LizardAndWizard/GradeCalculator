package hr.algebra.pi.gradecalculator.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(2)
@Slf4j
public class HttpMethodFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String httpMethod = ((HttpServletRequest) servletRequest).getMethod();
        // Log HTTP metodu i usera po dokumentaciji
    }
}
