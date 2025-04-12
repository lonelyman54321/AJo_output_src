/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pa3
 */
public final class pa3_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ na3_2 b;

    public pa3_2(na3_2 na3_22, f80_0 f80_02) {
        this.b = na3_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        na3_2 na3_22 = this.b;
        object = new pa3_2(na3_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pa3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pa3_2)object).invokeSuspend(object2);
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
        Object object2 = ((na3_2)object).d;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spendHistoryAdapter");
            n3 = 0;
            object2 = null;
        }
        object2 = ((Ql2)object2).c;
        pa3$a_0 pa3$a_0 = new pa3$a_0((na3_2)object, null);
        this.a = n4;
        object = ms0_1.f((es0_2)object2, pa3$a_0, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

