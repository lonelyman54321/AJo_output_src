/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Kk3$a
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ cy2_0 b;
    public /* synthetic */ long c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ tr1_0 e;
    public final /* synthetic */ wr1_1 f;

    public Kk3$a(c80 c802, tr1_0 tr1_02, wr1_1 wr1_12, f80_0 f80_02) {
        this.d = c802;
        this.e = tr1_02;
        this.f = wr1_12;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (cy2_0)object;
        long l2 = ((e72)object2).a;
        object3 = (f80_0)object3;
        tr1_0 tr1_02 = this.e;
        c80 c802 = (c80)this.d;
        wr1_1 wr1_12 = this.f;
        object2 = new Kk3$a(c802, tr1_02, wr1_12, (f80_0)object3);
        ((Kk3$a)object2).b = object;
        ((Kk3$a)object2).c = l2;
        object = Unit.a;
        return ((Kk3$a)object2).invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        i90_0 i90_02 = this.d;
        int n4 = 3;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 != n7) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.b;
            long l2 = this.c;
            tr1_0 tr1_02 = this.e;
            wr1_1 wr1_12 = this.f;
            object2 = new Kk3$a$a(tr1_02, l2, wr1_12, null);
            Ae3.d(i90_02, null, null, (Function2)object2, n4);
            this.a = n7;
            object = object.T(this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        boolean bl2 = (Boolean)object;
        object2 = this.f;
        tr1_0 tr1_03 = this.e;
        Kk3$a$b kk3$a$b = new Kk3$a$b(tr1_03, bl2, (wr1_1)object2, null);
        Ae3.d(i90_02, null, null, kk3$a$b, n4);
        return Unit.a;
    }
}

