/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Sh3
 */
public final class sh3_1
extends Lambda
implements Function2 {
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public sh3_1(long l2, long l3, boolean bl2, u10 u102, int n3) {
        this.c = l2;
        this.d = l3;
        this.e = bl2;
        this.f = u102;
        this.g = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        long l2 = this.d;
        Object object4 = object = this.f;
        object4 = (u10)object;
        long l3 = this.c;
        boolean bl2 = this.e;
        Uh3.c(l3, l2, bl2, (u10)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

