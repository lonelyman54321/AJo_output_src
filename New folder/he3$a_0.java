/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from he3$a
 */
public final class he3$a_0 {
    public static List a(String object) {
        if (object != null) {
            String[] stringArray = new String[]{"star"};
            int n3 = 6;
            object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n3);
        } else {
            object = null;
        }
        return object;
    }

    public static String b(String string2) {
        String string3 = "stringToConvert";
        Intrinsics.checkNotNullParameter(string2, string3);
        char c2 = TextUtils.isEmpty((CharSequence)string2);
        if (c2 != '\u0000') {
            return "";
        }
        c2 = Character.toUpperCase(string2.charAt(0));
        string2 = string2.substring(1);
        Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
        Serializable serializable = Locale.ROOT;
        string2 = string2.toLowerCase((Locale)serializable);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(c2);
        ((StringBuilder)serializable).append(string2);
        return ((StringBuilder)serializable).toString();
    }
}

