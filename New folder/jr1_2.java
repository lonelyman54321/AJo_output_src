/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Jr1
 */
public final class jr1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Gr1 b;

    public jr1_2(Gr1 gr1, f80_0 f80_02) {
        this.b = gr1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Gr1 gr1 = this.b;
        object = new jr1_2(gr1, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jr1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jr1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        long l2 = 0L;
        int n4 = 1;
        Gr1 gr1 = this.b;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = gr1.o;
            Si1 si1 = new Si1(l2);
            this.a = n4;
            object = ((Lj)object).e(this, si1);
            if (object == j90_02) {
                return j90_02;
            }
        }
        gr1.g(l2);
        gr1.f(false);
        return Unit.a;
    }
}

