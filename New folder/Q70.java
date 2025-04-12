/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Q70
extends Lambda
implements Function2 {
    public final /* synthetic */ E70 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ gx0_2 e;
    public final /* synthetic */ int f;

    public Q70(E70 e70, LP1 lP1, u10 u102, int n3) {
        this.c = e70;
        this.d = lP1;
        this.e = u102;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        E70 e70 = this.c;
        u10 u102 = (u10)this.e;
        LP1 lP1 = this.d;
        X70.a(e70, lP1, u102, (b30_0)object, n3);
        return Unit.a;
    }
}

