/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Hr1
 */
public final class hr1_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Gr1 b;
    public final /* synthetic */ un0_0 c;
    public final /* synthetic */ W01 d;

    public hr1_1(Gr1 gr1, W01 w01, f80_0 f80_02) {
        this.b = gr1;
        this.c = null;
        this.d = w01;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        W01 w01 = this.d;
        Gr1 gr1 = this.b;
        object = new hr1_1(gr1, w01, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hr1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hr1_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        Gr1 gr1;
        Object object2;
        block6: {
            object2 = j90_0.COROUTINE_SUSPENDED;
            int n3 = this.a;
            int n4 = 1;
            gr1 = this.b;
            if (n3 != 0) {
                if (n3 != n4) {
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                break block6;
            }
            vl2_2.b(object);
            try {
                Lj lj = gr1.p;
                object = null;
                Float f5 = new Float(0.0f);
                un0_0 un0_02 = this.c;
                object = this.d;
                Hr1$a hr1$a = new Hr1$a((W01)object, gr1);
                this.a = n4;
                int n7 = 4;
                object = Lj.c(lj, f5, un0_02, hr1$a, this, n7);
                if (object != object2) break block6;
                return object2;
            }
            catch (Throwable throwable2) {}
        }
        object = gr1.k;
        object2 = Boolean.TRUE;
        ((h83_0)object).setValue(object2);
        gr1.e(false);
        return Unit.a;
        gr1.e(false);
        throw throwable2;
    }
}

