/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class h$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h c;
    public final /* synthetic */ long d;

    public h$a(h h3, long l2, f80_0 f80_02) {
        this.c = h3;
        this.d = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        h h3 = this.c;
        long l2 = this.d;
        h$a h$a = new h$a(h3, l2, f80_02);
        h$a.b = object;
        return h$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (h$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((h$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (i90_0)this.b;
            gx0_2 gx0_22 = this.c.A;
            long l2 = this.d;
            e72 e722 = new e72(l2);
            this.a = n4;
            object = gx0_22.invoke(object, e722, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

