/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Ll3$b
extends Lambda
implements Function2 {
    public final /* synthetic */ xm3 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public Ll3$b(xm3 xm32, Function2 function2, int n3) {
        this.c = xm32;
        this.d = function2;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        xm3 xm32 = this.c;
        Function2 function2 = this.d;
        Ll3.a(xm32, function2, (b30_0)object, n3);
        return Unit.a;
    }
}

