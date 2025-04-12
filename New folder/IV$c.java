/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class IV$c
extends Lambda
implements Function2 {
    public final /* synthetic */ Sl c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ xm3 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public IV$c(Sl sl, LP1 lP1, xm3 xm32, boolean bl2, int n3, int n4, Function1 function1, Function1 function12, int n7, int n8) {
        this.c = sl;
        this.d = lP1;
        this.e = xm32;
        this.f = bl2;
        this.g = n3;
        this.h = n4;
        this.i = function1;
        this.j = function12;
        this.k = n7;
        this.l = n8;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.k | 1);
        Function1 function1 = this.i;
        Function1 function12 = this.j;
        Sl sl = this.c;
        LP1 lP1 = this.d;
        xm3 xm32 = this.e;
        boolean bl2 = this.f;
        int n4 = this.g;
        int n7 = this.h;
        int n8 = this.l;
        IV.a(sl, lP1, xm32, bl2, n4, n7, function1, function12, (b30_0)object3, n3, n8);
        return Unit.a;
    }
}

