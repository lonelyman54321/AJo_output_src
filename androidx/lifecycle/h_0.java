/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from androidx.lifecycle.h
 */
public final class h_0
implements n {
    public final /* synthetic */ i a;
    public final /* synthetic */ xs2_1 b;

    public h_0(i i3, xs2_1 xs2_12) {
        this.a = i3;
        this.b = xs2_12;
    }

    public final void k(mu1_1 object, i$a i$a) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        object = i$a.ON_START;
        if (i$a == object) {
            this.a.c(this);
            object = this.b;
            ((xs2_1)object).d();
        }
    }
}

