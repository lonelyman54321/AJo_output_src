/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 */
package androidx.browser.customtabs;

import android.os.LocaleList;

public final class CustomTabsIntent$c {
    public static String a() {
        Object object = LocaleList.getAdjustedDefault();
        int n3 = object.size();
        if (n3 > 0) {
            n3 = 0;
            object = object.get(0).toLanguageTag();
        } else {
            object = null;
        }
        return object;
    }
}

