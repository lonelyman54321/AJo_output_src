/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.LocaleManager
 *  android.os.LocaleList
 */
package androidx.appcompat.app;

import android.app.LocaleManager;
import android.os.LocaleList;

public final class g$b {
    public static LocaleList a(Object object) {
        return ((LocaleManager)object).getApplicationLocales();
    }

    public static void b(Object object, LocaleList localeList) {
        ((LocaleManager)object).setApplicationLocales(localeList);
    }
}

