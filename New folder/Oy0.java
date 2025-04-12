/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.InputFilter
 *  android.text.Spanned
 */
import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;

public final class Oy0
implements InputFilter {
    public final CharSequence filter(CharSequence charSequence, int n3, int n4, Spanned spanned, int n7, int n8) {
        Intrinsics.checkNotNullParameter(charSequence, "source");
        String string2 = "dest";
        Intrinsics.checkNotNullParameter(spanned, string2);
        while (n3 < n4) {
            int n10 = Character.getType(charSequence.charAt(n3));
            if (n10 != (n7 = 19) && n10 != (n7 = 28)) {
                ++n3;
                continue;
            }
            return "";
        }
        return null;
    }
}

