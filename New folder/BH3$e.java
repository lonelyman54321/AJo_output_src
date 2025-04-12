/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class BH3$e
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ BH3 b;

    public BH3$e(BH3 bH3, f80_0 f80_02) {
        this.b = bH3;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        BH3 bH3 = this.b;
        object = new BH3$e(bH3, (f80_0)object3);
        ((BH3$e)object).a = object2;
        object2 = Unit.a;
        return ((BH3$e)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = this.b;
        zr1_1 zr1_12 = ((BH3)object2).f;
        object = ((BH3)object2).a.handleApiException((Throwable)object, "RemoveFromWishList");
        zr1_12.k(object);
        return Unit.a;
    }
}

