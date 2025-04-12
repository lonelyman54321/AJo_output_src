/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from zD
 */
public final class zd_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ dr0_0 b;

    public zd_2(ft1_2 ft1_22, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = ft1_22;
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ft1_2 ft1_22 = this.a;
        dr0_0 dr0_02 = this.b;
        object = new zd_2(ft1_22, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zd_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zd_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = (Js1)CollectionsKt.T(((ft1_2)object).j().i());
        int n3 = object2 != null ? object2.getIndex() : -9;
        object = ((ft1_2)object).j();
        int n4 = object.g() + -4;
        if (n3 >= n4) {
            hv1_1 hv1_12;
            object = this.b;
            object2 = (Boolean)((dr0_0)object).g.getValue();
            n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
            if (n3 != 0 && (object2 = ((dr0_0)object).D()) == (hv1_12 = hv1_1.IDLE)) {
                ((dr0_0)object).B();
            }
        }
        return Unit.a;
    }
}

