/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.e_0;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from androidx.lifecycle.c
 */
public final class c_0
implements n {
    public final e_0[] a;

    public c_0(e_0[] e_0Array) {
        Intrinsics.checkNotNullParameter(e_0Array, "generatedAdapters");
        this.a = e_0Array;
    }

    public final void k(mu1_1 e_0Array, i$a i$a) {
        Intrinsics.checkNotNullParameter(e_0Array, "source");
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        new HashMap();
        e_0Array = this.a;
        int n3 = e_0Array.length;
        int n4 = 0;
        e_0 e_02 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            e_0 e_03 = e_0Array[i3];
            e_03.a();
        }
        n3 = e_0Array.length;
        while (n4 < n3) {
            e_02 = e_0Array[n4];
            e_02.a();
            ++n4;
        }
    }
}

