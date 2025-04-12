/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from C60
 */
public final class c60_0
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ uf_1 b;

    public c60_0(uf_1 uf_12, f80_0 f80_02) {
        this.b = uf_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        uf_1 uf_12 = this.b;
        c60_0 c60_02 = new c60_0(uf_12, f80_02);
        c60_02.a = object;
        return c60_02;
    }

    public final Object invoke(Object object, Object object2) {
        object2 = (f80_0)object2;
        object = (c60_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((c60_0)object).invokeSuspend(object2);
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

