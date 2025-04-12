/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class bC3$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ tr1_0 e;
    public final /* synthetic */ tr1_0 f;

    public bC3$a(tr1_0 tr1_02, long l2, long l3, tr1_0 tr1_03, tr1_0 tr1_04, f80_0 f80_02) {
        this.b = tr1_02;
        this.c = l2;
        this.d = l3;
        this.e = tr1_03;
        this.f = tr1_04;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = this.e;
        tr1_0 tr1_03 = this.f;
        tr1_0 tr1_04 = this.b;
        long l2 = this.c;
        long l3 = this.d;
        object = new bC3$a(tr1_04, l2, l3, tr1_02, tr1_03, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bC3$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bC3$a)object).invokeSuspend(object2);
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
        long l2 = this.d;
        long l3 = 0L;
        long l4 = this.c;
        long l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        object = l7 > 0 ? nc3_1.c(l4 -= l2) : "";
        Object object2 = this.b;
        object2.setValue(object);
        object = cp_1.Companion;
        l7 = (long)km_1.b((cp$a)object);
        if (l7 != false) {
            long l8;
            l2 = TimeUnit.MILLISECONDS.toSeconds(l2);
            object = this.e;
            n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n3 == 0) {
                object2 = Boolean.FALSE;
                object.setValue(object2);
            }
            if ((n3 = (int)((l8 = l2 - (l3 = (long)3)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) >= 0 && (l7 = (long)((Boolean)(object = (Boolean)object.getValue())).booleanValue()) == false) {
                object = Boolean.TRUE;
                object2 = this.f;
                object2.setValue(object);
            }
        }
        this.a = n4;
        long l12 = 500L;
        object = bo0_2.a(l12, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

