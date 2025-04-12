/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class xq2$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wq2_1 c;

    public xq2$a(wq2_1 wq2_12, f80_0 f80_02) {
        this.c = wq2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wq2_1 wq2_12 = this.c;
        xq2$a xq2$a = new xq2$a(wq2_12, f80_02);
        xq2$a.b = object;
        return xq2$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Ml2)object;
        object2 = (f80_0)object2;
        object = (xq2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xq2$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
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
        object = (Ml2)this.b;
        aq2_0 aq2_02 = this.c.g;
        if (aq2_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pendingPointsAdapter");
            n3 = 0;
            aq2_02 = null;
        }
        this.a = n4;
        if ((object = aq2_02.i((Ml2)object, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

