/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package androidx.emoji2.text;

import android.text.TextUtils;
import androidx.emoji2.text.e$b;

public final class e$d
implements e$b {
    public final String a;

    public e$d(String string2) {
        this.a = string2;
    }

    public final boolean a(CharSequence charSequence, int n3, int n4, rt3 rt32) {
        String string2;
        int n7 = TextUtils.equals((CharSequence)(charSequence = charSequence.subSequence(n3, n4)), (CharSequence)(string2 = this.a));
        if (n7 != 0) {
            rt32.c = n7 = rt32.c & 3 | 4;
            return false;
        }
        return true;
    }

    public final Object getResult() {
        return this;
    }
}

