package hr.algebra.pi.gradecalculator.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class HttpSessionCalculatorListener implements HttpSessionListener {
    @Override
    public void sessionCreated(final HttpSessionEvent event) {
        Object source = event.getSource();

        String ipAddr = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                .getRequest().getRemoteAddr();
        //Spremanje IP adrese u bazu
    }
    @Override
    public void sessionDestroyed(final HttpSessionEvent event) {
        System.out.println("Session destroyed");

    }
}
