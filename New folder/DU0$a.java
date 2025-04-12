/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class DU0$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wr1_1 b;
    public final /* synthetic */ kj1 c;
    public final /* synthetic */ fr0_1 d;

    public DU0$a(wr1_1 wr1_12, kj1 kj12, fr0_1 fr0_12, f80_0 f80_02) {
        this.b = wr1_12;
        this.c = kj12;
        this.d = fr0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        kj1 kj12 = this.c;
        fr0_1 fr0_12 = this.d;
        wr1_1 wr1_12 = this.b;
        object = new DU0$a(wr1_12, kj12, fr0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DU0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DU0$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
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
            object = this.b;
            kj1 kj12 = this.c;
            object = object.a(kj12, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = this.d;
        if (object != null) {
            object.dispose();
        }
        return Unit.a;
    }
}

