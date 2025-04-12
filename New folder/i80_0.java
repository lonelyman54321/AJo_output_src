/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from I80
 */
public final class i80_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Vt1 b;
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ Al3 d;
    public final /* synthetic */ Sk3 e;
    public final /* synthetic */ Se1 f;

    public i80_0(Vt1 vt1, tr1_0 tr1_02, Al3 al3, Sk3 sk3, Se1 se1, f80_0 f80_02) {
        this.b = vt1;
        this.c = tr1_02;
        this.d = al3;
        this.e = sk3;
        this.f = se1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Al3 al3 = this.d;
        Object object2 = this.c;
        ib3_0 ib3_02 = object2;
        ib3_02 = (tr1_0)object2;
        Vt1 vt1 = this.b;
        Sk3 sk3 = this.e;
        Se1 se1 = this.f;
        object2 = object;
        object = new i80_0(vt1, (tr1_0)ib3_02, al3, sk3, se1, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (i80_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((i80_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        Vt1 vt1;
        block6: {
            block5: {
                j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
                int n3 = this.a;
                int n4 = 1;
                vt1 = this.b;
                if (n3 != 0) {
                    if (n3 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    try {
                        vl2_2.b(object);
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                vl2_2.b(object);
                {
                    Object object2 = this.c;
                    object2 = (tr1_0)object2;
                    object = new I80$a((tr1_0)object2);
                    object = J83.k((Function0)object);
                    Al3 al3 = this.d;
                    Sk3 sk3 = this.e;
                    Se1 se1 = this.f;
                    object2 = new I80$b(vt1, al3, sk3, se1);
                    this.a = n4;
                    object = ((m0_0)object).collect((fs0_2)object2, this);
                    if (object != j90_02) break block5;
                    return j90_02;
                }
            }
            o90.e(vt1);
            return Unit.a;
        }
        o90.e(vt1);
        throw throwable2;
    }
}

