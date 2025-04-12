/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class lk3$d
extends Lambda
implements Function2 {
    public final /* synthetic */ long c;
    public final /* synthetic */ xm3 d;
    public final /* synthetic */ Float e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public lk3$d(long l2, xm3 xm32, Float f5, Function2 function2, int n3, int n4) {
        this.c = l2;
        this.d = xm32;
        this.e = f5;
        this.f = function2;
        this.g = n3;
        this.h = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        Float f5 = this.e;
        Function2 function2 = this.f;
        long l2 = this.c;
        xm3 xm32 = this.d;
        int n4 = this.h;
        lk3_0.b(l2, xm32, f5, function2, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

