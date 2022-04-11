package guru.ioio.aspectjdemo;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class JavaAspect {
    @Before("execution(* android.app.Activity+.onCreate(..))")
    public void before(JoinPoint joinPoint) {
        Log.i("JA", "before onCreate " + joinPoint.getTarget());
    }
}
