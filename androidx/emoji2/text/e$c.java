/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import androidx.emoji2.text.e$b;

public final class e$c
implements e$b {
    public final int a;
    public int b;
    public int c;

    public e$c(int n3) {
        int n4;
        this.b = n4 = -1;
        this.c = n4;
        this.a = n3;
    }

    public final boolean a(CharSequence charSequence, int n3, int n4, rt3 rt32) {
        boolean bl2 = false;
        int n7 = this.a;
        if (n3 <= n7 && n7 < n4) {
            this.b = n3;
            this.c = n4;
            return false;
        }
        if (n4 <= n7) {
            bl2 = true;
        }
        return bl2;
    }

    public final Object getResult() {
        return this;
    }
}

