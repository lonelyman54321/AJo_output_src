/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class b63$a
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gb3_0 b;

    public b63$a(gb3_0 gb3_02, f80_0 f80_02) {
        this.b = gb3_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gb3_0 gb3_02 = this.b;
        b63$a b63$a = new b63$a(gb3_02, f80_02);
        b63$a.a = object;
        return b63$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (gb3_0)object;
        object2 = (f80_0)object2;
        object = (b63$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((b63$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (gb3_0)this.a;
        object2 = this.b;
        boolean bl2 = object2 instanceof Yh0;
        boolean bl3 = false;
        if (!bl2 && !(bl2 = object2 instanceof ln0_0) && object == object2) {
            bl3 = true;
        }
        return bl3;
    }
}

