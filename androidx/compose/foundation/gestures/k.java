/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.f$a;
import androidx.compose.foundation.gestures.k$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class k
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ ku2_0 d;

    public k(f$a f$a, ku2_0 ku2_02, f80_0 f80_02) {
        this.c = f$a;
        this.d = ku2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ku2_0 ku2_02 = this.d;
        f$a f$a = (f$a)this.c;
        k k2 = new k(f$a, ku2_02, f80_02);
        k2.b = object;
        return k2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (tU1)object;
        object2 = (f80_0)object2;
        object = (k)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((k)object).invokeSuspend(object2);
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
            object = (tU1)this.b;
            ku2_0 ku2_02 = this.d;
            k$a k$a = new k$a((tU1)object, ku2_02);
            this.a = n4;
            object = this.c.invoke(k$a, this);
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

