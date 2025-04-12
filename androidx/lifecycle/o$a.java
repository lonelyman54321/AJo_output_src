/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

public final class o$a {
    public i$b a;
    public n b;

    public final void a(mu1_1 mu1_12, i$a i$a) {
        int n3;
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        i$b i$b = i$a.getTargetState();
        i$b i$b2 = this.a;
        String string2 = "state1";
        Intrinsics.checkNotNullParameter((Object)i$b2, string2);
        if (i$b != null && (n3 = i$b.compareTo(i$b2)) < 0) {
            i$b2 = i$b;
        }
        this.a = i$b2;
        Intrinsics.checkNotNull(mu1_12);
        this.b.k(mu1_12, i$a);
        this.a = i$b;
    }
}

