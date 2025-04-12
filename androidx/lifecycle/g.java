/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.h_0;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.x;
import androidx.lifecycle.x$a;
import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

public final class g {
    public static final void a(jD3 object, xs2_1 xs2_12, i i3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "viewModel");
        Intrinsics.checkNotNullParameter(xs2_12, "registry");
        Intrinsics.checkNotNullParameter(i3, "lifecycle");
        String string2 = "androidx.lifecycle.savedstate.vm.tag";
        object = (z)((jD3)object).getCloseable(string2);
        if (object != null && !(bl2 = ((z)object).c)) {
            ((z)object).b(i3, xs2_12);
            g.c(i3, xs2_12);
        }
    }

    public static final z b(xs2_1 xs2_12, i i3, String string2, Bundle object) {
        Intrinsics.checkNotNullParameter(xs2_12, "registry");
        Intrinsics.checkNotNullParameter(i3, "lifecycle");
        Intrinsics.checkNotNull(string2);
        Object object2 = xs2_12.a(string2);
        object = x$a.a((Bundle)object2, object);
        object2 = new z(string2, (x)object);
        ((z)object2).b(i3, xs2_12);
        g.c(i3, xs2_12);
        return object2;
    }

    public static void c(i i3, xs2_1 xs2_12) {
        boolean bl2;
        i$b i$b;
        Object object = i3.b();
        if (object != (i$b = i$b.INITIALIZED) && !(bl2 = object.isAtLeast(i$b = i$b.STARTED))) {
            object = new h_0(i3, xs2_12);
            i3.a((lu1)object);
        } else {
            xs2_12.d();
        }
    }
}

