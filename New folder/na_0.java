/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from NA
 */
public final class na_0
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ Nc d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public na_0(LP1 lP1, Nc nc, boolean bl2, u10 u102, int n3, int n4) {
        this.c = lP1;
        this.d = nc;
        this.e = bl2;
        this.f = u102;
        this.g = n3;
        this.h = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        int n4 = this.h;
        Object object4 = object = this.f;
        object4 = (u10)object;
        LP1 lP1 = this.c;
        Nc nc = this.d;
        boolean bl2 = this.e;
        OA.a(lP1, nc, bl2, (u10)object4, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

