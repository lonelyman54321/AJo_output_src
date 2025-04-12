/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Lp1
 */
public final class lp1_2
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ al1_1 e;
    public final /* synthetic */ int f;

    public lp1_2(LP1 lP1, u10 u102, al1_1 al1_12, int n3) {
        this.c = lP1;
        this.d = u102;
        this.e = al1_12;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        LP1 lP1 = this.c;
        u10 u102 = (u10)this.d;
        al1_1 al1_12 = this.e;
        Mp1.a(lP1, u102, al1_12, (b30_0)object, n3);
        return Unit.a;
    }
}

