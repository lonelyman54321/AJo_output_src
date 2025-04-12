/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from rd
 */
public final class rd_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ dr0_0 b;

    public rd_2(ib3_0 ib3_02, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = ib3_02;
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ib3_0 ib3_02 = this.a;
        dr0_0 dr0_02 = this.b;
        object = new rd_2(ib3_02, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rd_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rd_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Enum enum_ = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (Boolean)this.a.getValue();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            hv1_1 hv1_12;
            object = this.b;
            enum_ = (hv1_1)((Object)((dr0_0)object).k.getValue());
            if (enum_ == (hv1_12 = hv1_1.IDLE)) {
                ((dr0_0)object).s();
            }
        }
        return Unit.a;
    }
}

