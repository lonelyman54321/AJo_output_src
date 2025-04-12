/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class VS$b
extends Lambda
implements Function2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ao3 d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ RS f;
    public final /* synthetic */ int g;

    public VS$b(boolean bl2, ao3 ao32, LP1 lP1, RS rS, int n3) {
        this.c = bl2;
        this.d = ao32;
        this.e = lP1;
        this.f = rS;
        this.g = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        LP1 lP1 = this.e;
        RS rS = this.f;
        boolean bl2 = this.c;
        ao3 ao32 = this.d;
        VS.b(bl2, ao32, lP1, rS, (b30_0)object3, n3);
        return Unit.a;
    }
}

