/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package androidx.browser.customtabs;

import android.content.Intent;
import java.util.Locale;

public final class CustomTabsIntent$a {
    public static Locale a(Intent object) {
        String string2 = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";
        object = (object = object.getStringExtra(string2)) != null ? Locale.forLanguageTag((String)object) : null;
        return object;
    }

    public static void b(Intent intent, Locale object) {
        object = ((Locale)object).toLanguageTag();
        intent.putExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG", (String)object);
    }
}

