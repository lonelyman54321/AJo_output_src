/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class e5$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ h5_0 b;
    public final /* synthetic */ String c;

    public e5$a(h5_0 h5_02, f80_0 f80_02) {
        this.b = h5_02;
        this.c = "UpdateAddress";
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        h5_0 h5_02 = this.b;
        object = new e5$a(h5_02, (f80_0)object3);
        ((e5$a)object).a = object2;
        object2 = Unit.a;
        return ((e5$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = this.b;
        zr1_1 zr1_12 = ((h5_0)object2).d;
        String string2 = this.c;
        object = ((h5_0)object2).a.handleApiException((Throwable)object, string2);
        zr1_12.k(object);
        return Unit.a;
    }
}

