/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class zq
extends qg3_2
implements Function2 {
    public /* synthetic */ boolean a;

    public zq() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2;
        zq zq2 = new qg3_2(2, f80_02);
        zq2.a = bl2 = ((Boolean)object).booleanValue();
        return zq2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Boolean)object;
        ((Boolean)object).booleanValue();
        object2 = (f80_0)object2;
        object = (zq)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zq)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        return this.a ^ true;
    }
}

