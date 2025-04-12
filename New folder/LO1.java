/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.internal.ads.zzfk;
import com.jio.jioads.adinterfaces.l_0;

public final class LO1 {
    public static String a(int n3, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public static void b(String string2, Exception exception) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        l_0.f(exception, stringBuilder);
    }

    public static void c(String string2, String string3, String string4) {
        string2 = String.valueOf(string2);
        string2 = string3.concat(string2);
        zzfk.zzf(string4, string2);
    }
}

