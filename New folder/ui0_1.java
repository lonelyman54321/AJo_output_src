/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import com.facebook.j;

/*
 * Renamed from uI0
 */
public final class ui0_1
implements kJ0$a {
    public static String a(StringBuilder stringBuilder, String string2, char c2) {
        stringBuilder.append(string2);
        stringBuilder.append(c2);
        return stringBuilder.toString();
    }

    public void b(boolean bl2) {
        Object object = FacebookSdk.a;
        if (bl2 && (bl2 = j.c())) {
            kJ0$b kJ0$b = kJ0$b.CrashReport;
            object = new Object();
            kj0_0.a((kJ0$a)object, kJ0$b);
            kJ0$b = kJ0$b.ErrorReport;
            object = new Object();
            kj0_0.a((kJ0$a)object, kJ0$b);
            kJ0$b = kJ0$b.AnrReport;
            object = new Object();
            kj0_0.a((kJ0$a)object, kJ0$b);
        }
    }
}

