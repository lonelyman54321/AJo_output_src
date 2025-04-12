/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from LM2
 */
public final class lm2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ NM2 b;

    public lm2_1(NM2 nM2, f80_0 f80_02) {
        this.b = nM2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        NM2 nM2 = this.b;
        object = new lm2_1(nM2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (lm2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lm2_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            this.a = n4;
            long l2 = 200L;
            object = bo0_2.a(l2, this);
            if (object == object2) {
                return object2;
            }
        }
        object2 = this.b;
        ((NM2)object2).c = false;
        object = Boolean.TRUE;
        object2 = ((NM2)object2).f;
        object2.getClass();
        ((kb3_2)object2).k(null, object);
        return Unit.a;
    }
}

