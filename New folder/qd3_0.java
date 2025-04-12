/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from QD3
 */
public final class qd3_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ RD3 a;

    public qd3_0(RD3 rD3, f80_0 f80_02) {
        this.a = rD3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        RD3 rD3 = this.a;
        object = new qd3_0(rD3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qd3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qd3_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((RD3)object).d;
        if (object2 != null) {
            ((pd3_0)object2).e.d(null);
            Object object3 = ((pd3_0)object2).c;
            boolean bl2 = object3 instanceof lu1;
            i i3 = ((pd3_0)object2).d;
            if (bl2) {
                object3 = (lu1)object3;
                i3.c((lu1)object3);
            }
            i3.c((lu1)object2);
        }
        ((RD3)object).d = null;
        return Unit.a;
    }
}

