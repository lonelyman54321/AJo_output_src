/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Ce
extends qg3_2
implements gx0_2 {
    public /* synthetic */ i90_0 a;
    public /* synthetic */ float b;
    public final /* synthetic */ Re c;

    public Ce(Re re, f80_0 f80_02) {
        this.c = re;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (i90_0)object;
        float f5 = ((Number)object2).floatValue();
        object3 = (f80_0)object3;
        Re re = this.c;
        Ce ce2 = new Ce(re, (f80_0)object3);
        ce2.a = object;
        ce2.b = f5;
        object = Unit.a;
        return ce2.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = this.a;
        float f5 = this.b;
        Re re = this.c;
        Ce$a ce$a = new Ce$a(re, f5, null);
        Ae3.d((i90_0)object, null, null, ce$a, 3);
        return Unit.a;
    }
}

