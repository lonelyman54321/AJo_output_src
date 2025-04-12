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
import kotlin.text.Regex;

/*
 * Renamed from Kz1
 */
public final class kz1_0
implements InputFilter {
    public final CharSequence filter(CharSequence charSequence, int n3, int n4, Spanned object, int n7, int n8) {
        String string2;
        String string3;
        String string4 = "";
        n4 = (int)(Intrinsics.areEqual(charSequence, string4) ? 1 : 0);
        if (n4 == 0 && (n4 = (int)(((Regex)(object = new Regex(string3 = "[a-zA-Z 0-9]+"))).c(string2 = ((Object)charSequence).toString()) ? 1 : 0)) == 0) {
            charSequence = string4;
        }
        return charSequence;
    }
}

