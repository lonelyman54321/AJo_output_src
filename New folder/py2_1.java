/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from pY2
 */
public final class py2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Lj b;
    public final /* synthetic */ long c;

    public py2_1(Lj lj, long l2, f80_0 f80_02) {
        this.b = lj;
        this.c = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Lj lj = this.b;
        long l2 = this.c;
        object = new py2_1(lj, l2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (py2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((py2_1)object).invokeSuspend(object2);
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
            long l2 = this.c;
            object = new e72(l2);
            xa3_2 xa3_22 = ly2_0.d;
            this.a = n4;
            int n7 = 12;
            Lj lj = this.b;
            object = Lj.c(lj, object, xa3_22, null, this, n7);
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

