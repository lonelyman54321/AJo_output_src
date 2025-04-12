/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Y2
 */
public final class y2_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ w2_0 b;

    public y2_0(w2_0 w2_02, f80_0 f80_02) {
        this.b = w2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        w2_0 w2_02 = this.b;
        object = new y2_0(w2_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (y2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((y2_0)object).invokeSuspend(object2);
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
        Object object2 = ((w2_0)object).h;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activePointsAdapter");
            n3 = 0;
            object2 = null;
        }
        object2 = ((Ql2)object2).c;
        Y2$a y2$a = new Y2$a((w2_0)object, null);
        this.a = n4;
        object = ms0_1.f((es0_2)object2, y2$a, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

