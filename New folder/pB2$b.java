/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class pB2$b
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public pB2$b(LP1 lP1, long l2, float f5, long l3, int n3, int n4, int n7) {
        this.c = lP1;
        this.d = l2;
        this.e = f5;
        this.f = l3;
        this.g = n3;
        this.h = n4;
        this.i = n7;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.h | 1);
        long l2 = this.f;
        int n4 = this.g;
        LP1 lP1 = this.c;
        long l3 = this.d;
        float f5 = this.e;
        int n7 = this.i;
        pB2.a(lP1, l3, f5, l2, n4, (b30_0)object3, n3, n7);
        return Unit.a;
    }
}

