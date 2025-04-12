/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;

public final class rJ$a
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;

    public rJ$a() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        rJ$a rJ$a = new qg3_2(2, f80_02);
        rJ$a.a = object;
        return rJ$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (IndexedValue)object;
        object2 = (f80_0)object2;
        object = (rJ$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rJ$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        vl2_2.b(object);
        object = (IndexedValue)this.a;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

