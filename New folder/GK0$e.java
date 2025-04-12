/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class GK0$e
extends qg3_2
implements Function2 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ dr0_0 c;

    public GK0$e(ib3_0 ib3_02, ft1_2 ft1_22, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = ib3_02;
        this.b = ft1_22;
        this.c = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ft1_2 ft1_22 = this.b;
        dr0_0 dr0_02 = this.c;
        ib3_0 ib3_02 = this.a;
        object = new GK0$e(ib3_02, ft1_22, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (GK0$e)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((GK0$e)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (Integer)this.a.getValue();
        int n3 = object != null ? (Integer)object : -9;
        object2 = this.b.j();
        int n4 = object2.g() + -4;
        if (n3 >= n4) {
            hv1_1 hv1_12;
            object = this.c;
            object2 = (Boolean)((dr0_0)object).d.getValue();
            n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
            if (n4 != 0 && (object2 = (hv1_1)((Object)((dr0_0)object).e.getValue())) == (hv1_12 = hv1_1.IDLE)) {
                object2 = vJ0$a.a;
                ((dr0_0)object).M((vj0_0)object2);
            }
        }
        return Unit.a;
    }
}

