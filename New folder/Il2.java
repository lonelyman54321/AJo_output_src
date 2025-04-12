/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Il2
extends Lambda
implements Function1 {
    public final /* synthetic */ jl2_0 c;
    public final /* synthetic */ QT2 d;

    public Il2(jl2_0 jl2_02, kU2$b$a kU2$b$a) {
        this.c = jl2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        object = (Number)object;
        float f5 = ((Number)object).floatValue();
        Object object2 = this.c;
        Cl2 cl2 = ((jl2_0)object2).b;
        int n4 = cl2.o();
        object2 = ((jl2_0)object2).b;
        if (n4 != 0) {
            n4 = ((Cl2)object2).o();
            float f6 = n4;
            f5 /= f6;
        } else {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        }
        n3 = ok1_1.b(f5);
        n4 = ((Cl2)object2).j() + n3;
        n3 = ((Cl2)object2).i(n4);
        ((Cl2)object2).r.e(n3);
        return Unit.a;
    }
}

