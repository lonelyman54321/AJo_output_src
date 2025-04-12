/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Html
 *  android.text.Spanned
 */
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

public final class D91 {
    public static Spanned a(int n3, String string2) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 24;
        if (n4 >= n7) {
            return D91$a.a(n3, string2);
        }
        return Html.fromHtml((String)string2);
    }
}

