/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Cz
 */
public final class cz_0
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ gx0_2 g;
    public final /* synthetic */ int h;

    public cz_0(LP1 lP1, long l2, long l3, float f5, u10 u102, int n3) {
        this.c = lP1;
        this.d = l2;
        this.e = l3;
        this.f = f5;
        this.g = u102;
        this.h = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.h | 1);
        long l2 = this.e;
        Object object4 = object = this.g;
        object4 = (u10)object;
        LP1 lP1 = this.c;
        long l3 = this.d;
        float f5 = this.f;
        Mz.a(lP1, l3, l2, f5, (u10)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

