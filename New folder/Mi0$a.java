/*
 * Decompiled with CFR 0.152.
 */
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class Mi0$a
extends ThreadLocal {
    public final Object initialValue() {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", locale);
        simpleDateFormat.setLenient(false);
        TimeZone timeZone = ez3.e;
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat;
    }
}

