/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class l$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ long c;

    public l$a(l l2, long l3, f80_0 f80_02) {
        this.b = l2;
        this.c = l3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        l l2 = this.b;
        long l3 = this.c;
        object = new l$a(l2, l3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (l$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((l$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        boolean bl2;
        dU2 dU22;
        boolean bl3;
        long l2;
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
        object = this.b.C;
        this.a = n4;
        pg2_0 pg2_02 = ((ku2_0)object).d;
        pg2_0 pg2_03 = pg2_0.Horizontal;
        Pg2 pg2 = null;
        long l3 = this.c;
        if (pg2_02 == pg2_03) {
            l2 = WA3.a(0.0f, 0.0f, n4, l3);
        } else {
            n3 = 2;
            l2 = WA3.a(0.0f, 0.0f, n3, l3);
        }
        lu2_2 lu2_22 = new lu2_2((ku2_0)object, null);
        pg2 = ((ku2_0)object).b;
        if (pg2 != null && ((bl3 = (dU22 = ((ku2_0)object).a).d()) || (bl2 = (object = ((ku2_0)object).a).c()))) {
            object = pg2.b(l2, lu2_22, this);
            if (object != j90_02) {
                object = Unit.a;
            }
        } else {
            ku2_0 ku2_02 = lu2_22.d;
            object = new lu2_2(ku2_02, (f80_0)this);
            ((lu2_2)object).c = l2;
            Unit unit = Unit.a;
            if ((object = ((lu2_2)object).invokeSuspend(unit)) != j90_02) {
                object = Unit.a;
            }
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

