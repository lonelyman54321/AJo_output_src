/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Rr0$a
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public Rr0$a(LP1 lP1, long l2, float f5, float f6, int n3, int n4) {
        this.c = lP1;
        this.d = l2;
        this.e = f5;
        this.f = f6;
        this.g = n3;
        this.h = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        float f5 = this.e;
        float f6 = this.f;
        LP1 lP1 = this.c;
        long l2 = this.d;
        int n4 = this.h;
        Rr0.a(lP1, l2, f5, f6, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

