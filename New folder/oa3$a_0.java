/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oa3$a
 */
public final class oa3$a_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ na3_2 c;

    public oa3$a_0(na3_2 na3_22, f80_0 f80_02) {
        this.c = na3_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        na3_2 na3_22 = this.c;
        oa3$a_0 oa3$a_0 = new oa3$a_0(na3_22, f80_02);
        oa3$a_0.b = object;
        return oa3$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Ml2)object;
        object2 = (f80_0)object2;
        object = (oa3$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((oa3$a_0)object).invokeSuspend(object2);
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
        ia3_0 ia3_02 = this.c.d;
        if (ia3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spendHistoryAdapter");
            n3 = 0;
            ia3_02 = null;
        }
        this.a = n4;
        if ((object = ia3_02.i((Ml2)object, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

