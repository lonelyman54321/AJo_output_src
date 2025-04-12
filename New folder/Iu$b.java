/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Iu$b
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public Iu$b(LP1 lP1, long l2, long l3, gx0_2 gx0_22, int n3, int n4) {
        this.c = lP1;
        this.d = l2;
        this.e = l3;
        this.f = gx0_22;
        this.g = n3;
        this.h = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        long l2 = this.e;
        gx0_2 gx0_22 = this.f;
        LP1 lP1 = this.c;
        long l3 = this.d;
        int n4 = this.h;
        Iu.a(lP1, l3, l2, gx0_22, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

