/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class HF2
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;

    public HF2() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        HF2 hF2 = new qg3_2(2, f80_02);
        hF2.a = object;
        return hF2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (FF2$d)((Object)object);
        object2 = (f80_0)object2;
        object = (HF2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((HF2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Enum enum_ = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (FF2$d)((Object)this.a);
        enum_ = FF2$d.ShutDown;
        if (object == enum_) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

