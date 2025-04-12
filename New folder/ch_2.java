/*
 * Decompiled with CFR 0.152.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/*
 * Renamed from cH
 */
public final class ch_2 {
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static int d = 0;
    public static int e = 0;
    public static int f = 255;
    public static String g;
    public static String h;
    public static String i;
    public static String j;
    public static String k;
    public static String l;
    public static String m;
    public static boolean n = true;
    public static boolean o;

    public static String a() {
        int n3 = c;
        String string2 = null;
        if (n3 > 0 && (n3 = d) >= 0 && (n3 = e) > 0) {
            Object object = Calendar.getInstance();
            int n4 = 14;
            int n7 = 0;
            Object object2 = null;
            ((Calendar)object).set(n4, 0);
            n4 = 13;
            ((Calendar)object).set(n4, 0);
            n4 = a;
            n7 = 12;
            ((Calendar)object).set(n7, n4);
            n4 = b;
            n7 = 11;
            ((Calendar)object).set(n7, n4);
            n4 = c;
            n7 = 5;
            ((Calendar)object).set(n7, n4);
            n4 = d;
            n7 = 2;
            ((Calendar)object).set(n7, n4);
            n4 = e;
            n7 = 1;
            ((Calendar)object).set(n7, n4);
            object2 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
            Object object3 = new SimpleDateFormat((String)object2);
            object2 = "GMT";
            object2 = TimeZone.getTimeZone((String)object2);
            ((DateFormat)object3).setTimeZone((TimeZone)object2);
            object = ((Calendar)object).getTime();
            object = ((DateFormat)object3).format((Date)object);
            try {
                string2 = ((String)object).toString();
            }
            catch (Exception exception) {
                object3 = yn3_0.a;
                ((yn3$a)object3).e(exception);
            }
        }
        return string2;
    }
}

