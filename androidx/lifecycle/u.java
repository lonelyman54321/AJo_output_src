/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.u$a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class u
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i c;
    public final /* synthetic */ i$b d;
    public final /* synthetic */ Function2 e;

    public u(i i3, i$b i$b, Function2 function2, f80_0 f80_02) {
        this.c = i3;
        this.d = i$b;
        this.e = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        i$b i$b = this.d;
        Function2 function2 = this.e;
        i i3 = this.c;
        u u3 = new u(i3, i$b, function2, f80_02);
        u3.b = object;
        return u3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (u)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((u)object).invokeSuspend(object2);
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
            Object object2 = object = this.b;
            object2 = (i90_0)object;
            object = ir0_2.a;
            object = bg1_1.a.N0();
            i i3 = this.c;
            i$b i$b = this.d;
            Function2 function2 = this.e;
            u$a u$a = new u$a(i3, i$b, (i90_0)object2, function2, null);
            this.a = n4;
            object = Ae3.g(this, (CoroutineContext)object, u$a);
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

