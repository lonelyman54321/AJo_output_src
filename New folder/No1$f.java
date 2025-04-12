/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class No1$f
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;

    public No1$f() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        No1$f no1$f = new qg3_2(2, f80_02);
        no1$f.a = object;
        return no1$f;
    }

    public final Object invoke(Object object, Object object2) {
        object = (bg2_2)object;
        object2 = (f80_0)object2;
        object = (No1$f)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((No1$f)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        vl2_2.b(object);
        object = (bg2_2)this.a;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

