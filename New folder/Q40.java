/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.os.LocaleList
 */
import android.content.res.Configuration;
import android.os.LocaleList;

public final class Q40 {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, jw1 jw12) {
        jw12 = (LocaleList)jw12.a.b();
        configuration.setLocales((LocaleList)jw12);
    }
}

