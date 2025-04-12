/*
 * Decompiled with CFR 0.152.
 */
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mi0
 */
public final class mi0_2 {
    public static final Mi0$a a;
    public static final String[] b;
    public static final DateFormat[] c;

    static {
        String[] stringArray = new ThreadLocal();
        a = stringArray;
        stringArray = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        b = stringArray;
        c = new DateFormat[stringArray.length];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Date a(String object) {
        int n3;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = object.length();
        if (n4 == 0) {
            return null;
        }
        object2 = new ParsePosition(0);
        String[] stringArray = ((DateFormat)a.get()).parse((String)object, (ParsePosition)object2);
        int n7 = ((ParsePosition)object2).getIndex();
        if (n7 == (n3 = ((String)object).length())) {
            return stringArray;
        }
        stringArray = b;
        synchronized (stringArray) {
            Throwable throwable2;
            block8: {
                Object object3;
                try {
                    n7 = stringArray.length;
                    for (n3 = 0; n3 < n7; ++n3) {
                        object3 = c;
                        DateFormat dateFormat = object3[n3];
                        if (dateFormat == null) {
                            Object object4 = b;
                            object4 = object4[n3];
                            Locale locale = Locale.US;
                            dateFormat = new SimpleDateFormat((String)object4, locale);
                            object4 = ez3.e;
                            dateFormat.setTimeZone((TimeZone)object4);
                            object3[n3] = dateFormat;
                        }
                        ((ParsePosition)object2).setIndex(0);
                        object3 = dateFormat.parse((String)object, (ParsePosition)object2);
                        int n8 = ((ParsePosition)object2).getIndex();
                        if (n8 == 0) continue;
                    }
                }
                catch (Throwable throwable2) {}
                return object3;
                object = Unit.a;
                break block8;
                return null;
            }
            throw throwable2;
        }
    }
}

