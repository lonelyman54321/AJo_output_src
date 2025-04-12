/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ku
 */
public final class ku_1
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ gx0_2 e;
    public final /* synthetic */ int f;

    public ku_1(u10 u102, LP1 lP1, u10 u103, int n3) {
        this.c = u102;
        this.d = lP1;
        this.e = u103;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        u10 u102 = (u10)this.c;
        u10 u103 = (u10)this.e;
        LP1 lP1 = this.d;
        Iu.b(u102, lP1, u103, (b30_0)object, n3);
        return Unit.a;
    }
}

