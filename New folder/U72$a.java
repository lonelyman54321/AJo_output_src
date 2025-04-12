/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class U72$a
extends qg3_2
implements gx0_2 {
    public final /* synthetic */ Ref$BooleanRef a;

    public U72$a(Ref$BooleanRef ref$BooleanRef, f80_0 f80_02) {
        this.a = ref$BooleanRef;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        object2 = this.a;
        object = new U72$a((Ref$BooleanRef)object2, (f80_0)object3);
        object2 = Unit.a;
        return ((U72$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.element = true;
        return Unit.a;
    }
}

