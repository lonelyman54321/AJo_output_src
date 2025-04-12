/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class KF2$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ yp1_2 d;

    public KF2$a(LF2 lF2, yp1_2 yp1_22, f80_0 f80_02) {
        this.c = lF2;
        this.d = yp1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yp1_2 yp1_22 = this.d;
        LF2 lF2 = (LF2)this.c;
        KF2$a kF2$a = new KF2$a(lF2, yp1_22, f80_02);
        kF2$a.b = object;
        return kF2$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (KF2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((KF2$a)object).invokeSuspend(object2);
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
            object = (i90_0)this.b;
            this.a = n4;
            gx0_2 gx0_22 = this.c;
            yp1_2 yp1_22 = this.d;
            object = gx0_22.invoke(object, yp1_22, this);
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

