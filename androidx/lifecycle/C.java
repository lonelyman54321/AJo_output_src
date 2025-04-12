/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.e_0;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

public final class C
implements n {
    public final e_0 a;

    public C(e_0 e_02) {
        Intrinsics.checkNotNullParameter(e_02, "generatedAdapter");
        this.a = e_02;
    }

    public final void k(mu1_1 object, i$a i$a) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        object = this.a;
        object.a();
        object.a();
    }
}

