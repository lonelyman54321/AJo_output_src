/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Gk2$a
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ yk2_1 b;

    public Gk2$a(yk2_1 yk2_12, f80_0 f80_02) {
        this.b = yk2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yk2_1 yk2_12 = this.b;
        Gk2$a gk2$a = new Gk2$a(yk2_12, f80_02);
        gk2$a.a = object;
        return gk2$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (re3_0)object;
        object2 = (f80_0)object2;
        object = (Gk2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Gk2$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        vl2_2.b(object);
        object = (re3_0)this.a;
        int n4 = ((re3_0)object).a * -1;
        Kl2 kl2 = this.b.c;
        int n7 = kl2.f;
        if (n4 <= n7 && (n3 = ((re3_0)object).b * -1) <= n7) {
            n3 = 0;
            object = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }
}

