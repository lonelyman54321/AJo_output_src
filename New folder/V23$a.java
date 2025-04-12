/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class V23$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ w23_0 b;

    public V23$a(w23_0 w23_02, f80_0 f80_02) {
        this.b = w23_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        w23_0 w23_02 = this.b;
        object = new V23$a(w23_02, (f80_0)object3);
        ((V23$a)object).a = object2;
        object2 = Unit.a;
        return ((V23$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = this.b;
        zr1_1 zr1_12 = ((w23_0)object2).q;
        object = ((w23_0)object2).c.handleApiException((Throwable)object, "AddtoCloset");
        zr1_12.k(object);
        return Unit.a;
    }
}

