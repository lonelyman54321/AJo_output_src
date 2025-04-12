/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;

public final class LV0
implements W83 {
    public static final LV0 a;

    static {
        LV0 lV0;
        a = lV0 = new Object();
    }

    public static String a(long l2) {
        int n3 = 2;
        int n4 = 1;
        int n7 = 1000;
        long l3 = n7;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            return UX.b(l2, " B");
        }
        double d2 = l2;
        double d5 = Math.log(d2);
        double d7 = n7;
        double d9 = Math.log(d7);
        n7 = (int)(d5 / d9);
        int c2 = n7 + -1;
        char c3 = "kMGTPE".charAt(c2);
        Object object2 = new StringBuilder();
        String string2 = String.valueOf(c3);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("");
        string2 = ((StringBuilder)object2).toString();
        object2 = StringCompanionObject.INSTANCE;
        object2 = Locale.US;
        d9 = n7;
        d7 = Math.pow(d7, d9);
        Double d12 = d2 / d7;
        Object[] objectArray = new Object[n3];
        objectArray[0] = d12;
        objectArray[n4] = string2;
        return IV0.a(objectArray, n3, (Locale)object2, "%.1f %sB", "java.lang.String.format(locale, format, *args)");
    }
}

