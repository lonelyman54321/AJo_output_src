/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;

public final class WT2$a
extends Lambda
implements Function2 {
    public final /* synthetic */ Ref$FloatRef c;
    public final /* synthetic */ ku2_0 d;
    public final /* synthetic */ tU1 e;

    public WT2$a(Ref$FloatRef ref$FloatRef, ku2_0 ku2_02, tU1 tU12) {
        this.c = ref$FloatRef;
        this.d = ku2_02;
        this.e = tU12;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        float f5 = ((Number)object).floatValue();
        ((Number)object2).floatValue();
        object2 = this.c;
        float f6 = ((Ref$FloatRef)object2).element;
        f5 -= f6;
        ku2_0 ku2_02 = this.d;
        f5 = ku2_02.c(f5);
        long l2 = ku2_02.g(f5);
        l2 = this.e.a(l2);
        f5 = ku2_02.f(l2);
        f5 = ku2_02.c(f5);
        ((Ref$FloatRef)object2).element = f6 = ((Ref$FloatRef)object2).element + f5;
        return Unit.a;
    }
}

