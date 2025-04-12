/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Bq
 */
public final class bq_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ es0_2 c;
    public final /* synthetic */ Cq d;

    public bq_1(es0_2 es0_22, f80_0 f80_02, Cq cq2) {
        this.c = es0_22;
        this.d = cq2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        es0_2 es0_22 = this.c;
        Cq cq2 = this.d;
        bq_1 bq_12 = new bq_1(es0_22, f80_02, cq2);
        bq_12.b = object;
        return bq_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (bq_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bq_1)object).invokeSuspend(object2);
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
            object = (fs0_2)this.b;
            Cq cq2 = this.d;
            Bq$a bq$a = new Bq$a((fs0_2)object, cq2);
            this.a = n4;
            object = this.c.collect(bq$a, this);
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

