/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class No1$c
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ uf_1 b;

    public No1$c(uf_1 uf_12, f80_0 f80_02) {
        this.b = uf_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        uf_1 uf_12 = this.b;
        No1$c no1$c = new No1$c(uf_12, f80_02);
        no1$c.a = object;
        return no1$c;
    }

    public final Object invoke(Object object, Object object2) {
        object2 = (f80_0)object2;
        object = (No1$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((No1$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        vl2_2.b(object);
        object = this.a;
        if (object == null && !(bl2 = (object = this.b).i())) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

