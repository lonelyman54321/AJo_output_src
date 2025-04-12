/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class h$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h c;
    public final /* synthetic */ long d;

    public h$b(h h3, long l2, f80_0 f80_02) {
        this.c = h3;
        this.d = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        h h3 = this.c;
        long l2 = this.d;
        h$b h$b = new h$b(h3, l2, f80_02);
        h$b.b = object;
        return h$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (h$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((h$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        float f5;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (i90_0)this.b;
        h h3 = this.c;
        gx0_2 gx0_22 = h3.B;
        int n7 = h3.C;
        long l2 = this.d;
        if (n7 != 0) {
            n7 = -1082130432;
            f5 = -1.0f;
        } else {
            n7 = 1065353216;
            f5 = 1.0f;
        }
        long l3 = WA3.f(l2, f5);
        pg2_0 pg2_02 = h3.y;
        Zs0$a zs0$a = Zs0.a;
        pg2_0 pg2_03 = pg2_0.Vertical;
        float f6 = pg2_02 == pg2_03 ? WA3.c(l3) : WA3.b(l3);
        Float f7 = new Float(f6);
        this.a = n4;
        object = gx0_22.invoke(object, f7, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

