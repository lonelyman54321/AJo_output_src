/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import androidx.lifecycle.u$a$a$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.i;

public final class u$a$a
implements n {
    public final /* synthetic */ i$a a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ i$a d;
    public final /* synthetic */ bl_2 e;
    public final /* synthetic */ hs1_2 f;
    public final /* synthetic */ Function2 g;

    public u$a$a(i$a i$a, Ref$ObjectRef ref$ObjectRef, i90_0 i90_02, i$a i$a2, bl_2 bl_22, hs1_2 hs1_22, Function2 function2) {
        this.a = i$a;
        this.b = ref$ObjectRef;
        this.c = i90_02;
        this.d = i$a2;
        this.e = bl_22;
        this.f = hs1_22;
        this.g = function2;
    }

    public final void k(mu1_1 object, i$a object2) {
        Intrinsics.checkNotNullParameter(object, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(object2, "event");
        object = this.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        if (object2 == object) {
            object2 = this.f;
            Function2 function2 = this.g;
            object = new u$a$a$a((hs1_2)object2, function2, null);
            object = Ae3.d(this.c, null, null, (Function2)object, 3);
            ref$ObjectRef.element = object;
            return;
        }
        object = this.d;
        if (object2 == object) {
            object = (i)ref$ObjectRef.element;
            if (object != null) {
                object.d(null);
            }
            ref$ObjectRef.element = null;
        }
        if (object2 == (object = i$a.ON_DESTROY)) {
            object = tl2_2.b;
            object = Unit.a;
            object2 = this.e;
            object2.resumeWith(object);
        }
    }
}

