/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yq2
 */
public final class yq2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wq2_1 b;

    public yq2_2(wq2_1 wq2_12, f80_0 f80_02) {
        this.b = wq2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wq2_1 wq2_12 = this.b;
        object = new yq2_2(wq2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yq2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yq2_2)object).invokeSuspend(object2);
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
        object = this.b;
        Object object2 = ((wq2_1)object).g;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pendingPointsAdapter");
            n3 = 0;
            object2 = null;
        }
        object2 = ((Ql2)object2).c;
        yq2$a yq2$a = new yq2$a((wq2_1)object, null);
        this.a = n4;
        object = ms0_1.f((es0_2)object2, yq2$a, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

