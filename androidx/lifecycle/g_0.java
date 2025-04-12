/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$a$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from androidx.lifecycle.G
 */
public final class g_0
implements n {
    public final /* synthetic */ i$b a;
    public final /* synthetic */ i b;
    public final /* synthetic */ bl_2 c;
    public final /* synthetic */ Function0 d;

    public g_0(i$b i$b, i i3, bl_2 bl_22, Function0 function0) {
        this.a = i$b;
        this.b = i3;
        this.c = bl_22;
        this.d = function0;
    }

    public final void k(mu1_1 object, i$a object2) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter(object2, "event");
        i$a.Companion.getClass();
        object = i$a$a.c(this.a);
        bl_2 bl_22 = this.c;
        i i3 = this.b;
        if (object2 == object) {
            i3.c(this);
            object = this.d;
            object2 = tl2_2.b;
            try {
                object = object.invoke();
            }
            catch (Throwable throwable) {
                object2 = tl2_2.b;
                object = vl2_2.a(throwable);
            }
            bl_22.resumeWith(object);
        } else {
            object = i$a.ON_DESTROY;
            if (object2 == object) {
                i3.c(this);
                object = tl2_2.b;
                object = new LifecycleDestroyedException();
                object = vl2_2.a((Throwable)object);
                bl_22.resumeWith(object);
            }
        }
    }
}

