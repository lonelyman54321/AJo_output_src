/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Vg1$b$c
extends qg3_2
implements Function2 {
    public /* synthetic */ float a;

    public Vg1$b$c() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        float f5;
        Vg1$b$c vg1$b$c = new qg3_2(2, f80_02);
        vg1$b$c.a = f5 = ((Number)object).floatValue();
        return vg1$b$c;
    }

    public final Object invoke(Object object, Object object2) {
        float f5 = ((Number)object).floatValue();
        object2 = (f80_0)object2;
        object = Float.valueOf(f5);
        object = (Vg1$b$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Vg1$b$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        float f5 = this.a;
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 > 0) {
            f7 = 1.0f;
            f5 = Float.MIN_VALUE;
        } else {
            f7 = 0.0f;
            f5 = 0.0f;
            object = null;
        }
        return (boolean)f7;
    }
}

