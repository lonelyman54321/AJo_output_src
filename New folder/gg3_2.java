/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Gg3
 */
public final class gg3_2
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ i13 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ nz g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public gg3_2(LP1 lP1, i13 i132, long l2, long l3, nz nz4, float f5, u10 u102, int n3, int n4) {
        this.c = lP1;
        this.d = i132;
        this.e = l2;
        this.f = l3;
        this.g = nz4;
        this.h = f5;
        this.i = u102;
        this.j = n3;
        this.k = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.j | 1);
        int n4 = this.k;
        Object object4 = object = this.i;
        object4 = (u10)object;
        LP1 lP1 = this.c;
        i13 i132 = this.d;
        long l2 = this.e;
        long l3 = this.f;
        nz nz4 = this.g;
        float f5 = this.h;
        jg3_0.a(lP1, i132, l2, l3, nz4, f5, (u10)object4, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

