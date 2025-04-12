/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class fV1$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ gv1_0 b;
    public final /* synthetic */ pz2_2 c;

    public fV1$b(gv1_0 gv1_02, pz2_2 pz2_22, f80_0 f80_02) {
        this.b = gv1_02;
        this.c = pz2_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gv1_0 gv1_02 = this.b;
        pz2_2 pz2_22 = this.c;
        object = new fV1$b(gv1_02, pz2_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fV1$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fV1$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        gv1_0 gv1_02 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            long l2 = gv1_02.b;
            this.a = n4;
            object = bo0_2.a(l2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = qx1.a();
        long cfr_ignored_0 = gv1_02.b;
        object.getClass();
        object = new k60$b(7);
        this.c.j(object);
        return Unit.a;
    }
}

