/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Cb3$b
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;

    public Cb3$b() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Cb3$b cb3$b = new qg3_2(2, f80_02);
        cb3$b.a = object;
        return cb3$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b33)((Object)object);
        object2 = (f80_0)object2;
        object = (Cb3$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Cb3$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Enum enum_ = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (b33)((Object)this.a);
        enum_ = b33.START;
        if (object != enum_) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

