/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.os.LocaleList
 */
package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;

public final class AppCompatDelegateImpl$f {
    public static void a(Configuration object, Configuration configuration, Configuration configuration2) {
        object = Zm.b(object);
        LocaleList localeList = Zm.b(configuration);
        boolean bl2 = an_0.a(localeList, (LocaleList)object);
        if (!bl2) {
            bn_0.a(configuration2, localeList);
            object = configuration.locale;
            configuration2.locale = object;
        }
    }

    public static jw1 b(Configuration configuration) {
        return jw1.b(en_0.a(Zm.b(configuration)));
    }

    public static void c(jw1 jw12) {
        dn_0.a(cn_0.a(jw12.a.a()));
    }

    public static void d(Configuration configuration, jw1 jw12) {
        jw12 = cn_0.a(jw12.a.a());
        bn_0.a(configuration, (LocaleList)jw12);
    }
}

