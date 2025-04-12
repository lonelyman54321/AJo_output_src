/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from pq$b
 */
public final class pq$b_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ pq_0 b;

    public pq$b_0(pq_0 pq_02, f80_0 f80_02) {
        this.b = pq_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        pq_0 pq_02 = this.b;
        object = new pq$b_0(pq_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pq$b_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pq$b_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            pq_0 pq_02 = this.b;
            object = new qq_0(pq_02, 0);
            object = J83.k((Function0)object);
            Object object2 = new pq$b$a(pq_02, null);
            kt0_2 kt0_22 = new kt0_2((Function2)object2, null);
            object = ms0_1.n((es0_2)object, kt0_22);
            object2 = new pq$b$b(pq_02);
            this.a = n4;
            object = ((or_2)object).collect((fs0_2)object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

