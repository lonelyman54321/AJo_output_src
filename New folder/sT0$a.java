/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class sT0$a
extends qg3_2
implements Function2 {
    public /* synthetic */ int a;

    public sT0$a() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3;
        sT0$a sT0$a = new qg3_2(2, f80_02);
        sT0$a.a = n3 = ((Number)object).intValue();
        return sT0$a;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = ((Number)object).intValue();
        object2 = (f80_0)object2;
        object = n3;
        object = (sT0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sT0$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     */
    public final Object invokeSuspend(Object object) {
        void var2_5;
        vl2_2.b(object);
        int bl2 = this.a;
        if (bl2 > 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        return (boolean)var2_5;
    }
}

