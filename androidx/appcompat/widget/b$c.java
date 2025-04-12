/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;

public final class b$c {
    public static LocaleList a(String string2) {
        return LocaleList.forLanguageTags((String)string2);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}

