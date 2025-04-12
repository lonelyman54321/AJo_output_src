/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Bz
 */
public final class bz_1
extends Lambda
implements Function2 {
    public final /* synthetic */ lg3_0 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ gx0_2 h;
    public final /* synthetic */ int i;

    public bz_1(oO0 oO02, LP1 lP1, long l2, long l3, float f5, u10 u102, int n3) {
        this.c = oO02;
        this.d = lP1;
        this.e = l2;
        this.f = l3;
        this.g = f5;
        this.h = u102;
        this.i = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.i | 1);
        Object object4 = object = this.c;
        object4 = (oO0)object;
        Object object5 = object = this.h;
        object5 = (u10)object;
        LP1 lP1 = this.d;
        long l2 = this.e;
        long l3 = this.f;
        float f5 = this.g;
        Mz.b((oO0)object4, lP1, l2, l3, f5, (u10)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

