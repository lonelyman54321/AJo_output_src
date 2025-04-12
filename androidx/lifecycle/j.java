/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import kotlin.jvm.internal.Intrinsics;

public final class j {
    public final i a;
    public final i$b b;
    public final cr0_0 c;
    public final gu1_0 d;

    public j(i i3, i$b object, cr0_0 object2, kotlinx.coroutines.i i8) {
        Intrinsics.checkNotNullParameter(i3, "lifecycle");
        Intrinsics.checkNotNullParameter(object, "minState");
        Intrinsics.checkNotNullParameter(object2, "dispatchQueue");
        Intrinsics.checkNotNullParameter(i8, "parentJob");
        this.a = i3;
        this.b = object;
        this.c = object2;
        super(this, i8);
        this.d = object;
        object2 = i3.b();
        i$b i$b = i$b.DESTROYED;
        if (object2 == i$b) {
            i3 = null;
            i8.d(null);
            this.a();
        } else {
            i3.a((lu1)object);
        }
    }

    public final void a() {
        Object object = this.a;
        gu1_0 gu1_02 = this.d;
        ((i)object).c(gu1_02);
        object = this.c;
        ((cr0_0)object).b = true;
        ((cr0_0)object).a();
    }
}

