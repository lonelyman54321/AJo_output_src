/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.w$a;

public final class r$b
implements w$a {
    public final /* synthetic */ r a;

    public r$b(r r5) {
        this.a = r5;
    }

    public final void onResume() {
        this.a.a();
    }

    public final void onStart() {
        r r5 = this.a;
        int n3 = r5.a;
        int n4 = 1;
        r5.a = n3 += n4;
        if (n3 == n4 && (n3 = (int)(r5.d ? 1 : 0)) != 0) {
            o o3 = r5.f;
            i$a i$a = i$a.ON_START;
            o3.f(i$a);
            n3 = 0;
            o3 = null;
            r5.d = false;
        }
    }
}

