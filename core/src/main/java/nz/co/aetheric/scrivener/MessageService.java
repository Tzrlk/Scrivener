package nz.co.aetheric.scrivener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Locale;

/** This service acts as an intermediary to the spring MessageSource service (making it a little easier to use). */
@Service("messages")
public class MessageService implements MessageSource {
    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    @Resource
    MessageSource messageSource;

    /**
     * Exactly the same as {@link #getMessage(String, Object[], java.util.Locale)}, but the Locale is always default,
     * and the message arguments are of variable length.
     * @param code The code to find the message by.
     * @param args Variable arguments parameter.
     * @return The message, or an exception.
     */
    public String getMessage(String code, Object... args) throws NoSuchMessageException {
        return messageSource.getMessage(code, args, null);
    }

    /**
     * Exactly the same as {@link #getMessage(String, Object[], String, java.util.Locale)}, but the Locale is always
     * default, and the message arguments are of variable length.
     * @param code The code to find the message by.
     * @param defaultMessage The message to use if the code doesn't resolve.
     * @param args Variable arguments parameter.
     * @return The message, or an exception.
     */
    public String getMessage(String code, String defaultMessage, Object... args) {
        return messageSource.getMessage(code, args, defaultMessage, null);
    }

    /** Pass-through */
    @Override
    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return messageSource.getMessage(code, args, defaultMessage, locale);
    }

    /** Pass-through */
    @Override
    public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
        return messageSource.getMessage(code, args, locale);
    }

    /** Pass-through */
    @Override
    public String getMessage(MessageSourceResolvable resolvable, Locale locale)
            throws NoSuchMessageException {
        return messageSource.getMessage(resolvable, locale);
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}