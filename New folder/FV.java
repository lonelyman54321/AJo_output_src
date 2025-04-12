/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlinx.coroutines.d;

public final class FV
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ cy2_0 b;
    public /* synthetic */ long c;
    public final /* synthetic */ hv_0 d;

    public FV(hv_0 hv_02, f80_0 f80_02) {
        this.d = hv_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (cy2_0)object;
        long l2 = ((e72)object2).a;
        object3 = (f80_0)object3;
        hv_0 hv_02 = this.d;
        object2 = new FV(hv_02, (f80_0)object3);
        ((FV)object2).b = object;
        ((FV)object2).c = l2;
        object = Unit.a;
        return ((FV)object2).invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        E0 e02;
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
        object = this.b;
        long l2 = this.c;
        hv_0 hv_02 = this.d;
        n3 = (int)(hv_02.t ? 1 : 0);
        if (n3 == 0) return Unit.a;
        this.a = n4;
        wr1_1 wr1_12 = hv_02.p;
        if (wr1_12 == null || (object = kotlinx.coroutines.d.c(e02 = new E0((cy2_0)object, l2, wr1_12, hv_02, null), this)) != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

