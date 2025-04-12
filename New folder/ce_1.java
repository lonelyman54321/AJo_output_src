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

/*
 * Renamed from ce
 */
public final class ce_1
implements InputFilter {
    public final boolean a;

    public ce_1(boolean bl2) {
        this.a = bl2;
    }

    public final CharSequence filter(CharSequence charSequence, int n3, int n4, Spanned object, int n7, int n8) {
        Intrinsics.checkNotNullParameter(charSequence, "source");
        String string2 = "dest";
        Intrinsics.checkNotNullParameter(object, string2);
        object = new StringBuilder();
        for (n7 = n3; n7 < n4; ++n7) {
            n8 = charSequence.charAt(n7);
            boolean bl2 = this.a;
            if (bl2) {
                bl2 = Character.isLetterOrDigit((char)n8);
                if (!bl2 && !(bl2 = Character.isSpaceChar((char)n8))) continue;
                ((StringBuilder)object).append((char)n8);
                continue;
            }
            bl2 = Character.isLetterOrDigit((char)n8);
            if (!bl2) continue;
            ((StringBuilder)object).append((char)n8);
        }
        int n10 = ((StringBuilder)object).length();
        if (n10 == (n4 -= n3)) {
            n10 = 0;
            charSequence = null;
        } else {
            charSequence = ((StringBuilder)object).toString();
        }
        return charSequence;
    }
}

