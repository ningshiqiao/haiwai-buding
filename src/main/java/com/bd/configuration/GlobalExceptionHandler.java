package com.bd.configuration;

import com.bd.helper.AppException;
import com.bd.helper.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Locale;

@Service
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler(value = Exception.class)
    public Result defaultErrorHandler(HttpServletRequest req, Exception exception) throws Exception {
        logger.info("=========Exception[begin]==========");
        StringBuilder sb = new StringBuilder(req.getRequestURL().toString());
        if (exception instanceof AppException) {
            AppException e = (AppException) exception;
            sb.append("  CODE:");
            sb.append(e.getErrorCode().getCode().toString());
            sb.append("  MESSAGE:");
            sb.append(e.getErrorCode().getMessage().toString());
            logger.error(sb.toString());
            e.printStackTrace();
            logger.info("=========Exception[end]==========");
            Locale locale = LocaleContextHolder.getLocale();
            return new Result(e.getErrorCode(),messageSource,locale);
        }else if (exception instanceof UndeclaredThrowableException) {
            UndeclaredThrowableException e = (UndeclaredThrowableException) exception;
            AppException appException = (AppException) e.getCause();
            sb.append("  CODE:");
            sb.append(appException.getErrorCode().getCode().toString());
            sb.append("  MESSAGE:");
            sb.append(appException.getErrorCode().getMessage().toString());
            logger.error(sb.toString());
            appException.printStackTrace();
            logger.info("=========Exception[end]==========");
            Locale locale = LocaleContextHolder.getLocale();
            return new Result(appException.getErrorCode());
        } else {
            sb.append("  CODE:");
            sb.append("");
            sb.append("  MESSAGE:");
            sb.append(exception.getMessage());
            logger.error(sb.toString());
            exception.printStackTrace();
            logger.info("=========Exception[end]==========");
            return new Result(Result.Status.ERROR,"",exception.getMessage());
        }
    }

}

