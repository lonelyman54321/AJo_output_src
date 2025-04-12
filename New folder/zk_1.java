/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Zk
 */
public final class zk_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ ib3_0 d;

    public zk_1(gr3 gr32, tr1_0 tr1_02, f80_0 f80_02) {
        this.c = gr32;
        this.d = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = (tr1_0)this.d;
        gr3 gr32 = this.c;
        zk_1 zk_12 = new zk_1(gr32, tr1_02, f80_02);
        zk_12.b = object;
        return zk_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Mz2)object;
        object2 = (f80_0)object2;
        object = (zk_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zk_1)object).invokeSuspend(object2);
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
            object = (Mz2)this.b;
            gr3 gr32 = this.c;
            Object object2 = new zk$a_0(gr32);
            object2 = J83.k((Function0)object2);
            tr1_0 tr1_02 = (tr1_0)this.d;
            Zk$b zk$b = new Zk$b((Mz2)object, gr32, tr1_02);
            this.a = n4;
            object = ((m0_0)object2).collect(zk$b, this);
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

