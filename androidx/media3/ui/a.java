/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Html
 */
package androidx.media3.ui;

import android.text.Html;
import java.util.regex.Pattern;

public final class a {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        charSequence = Html.escapeHtml((CharSequence)charSequence);
        return a.matcher(charSequence).replaceAll("<br>");
    }
}

