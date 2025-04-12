/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.f$a;
import androidx.compose.foundation.gestures.g$a;
import androidx.compose.foundation.gestures.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class g
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ h d;

    public g(f$a f$a, h h3, f80_0 f80_02) {
        this.c = f$a;
        this.d = h3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        h h3 = this.d;
        f$a f$a = (f$a)this.c;
        g g3 = new g(f$a, h3, f80_02);
        g3.b = object;
        return g3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Ws0)object;
        object2 = (f80_0)object2;
        object = (g)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((g)object).invokeSuspend(object2);
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
            object = (Ws0)this.b;
            h h3 = this.d;
            g$a g$a = new g$a((Ws0)object, h3);
            this.a = n4;
            object = this.c.invoke(g$a, this);
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

