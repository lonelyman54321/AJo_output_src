/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from L11
 */
public final class l11_0
implements mr1_2 {
    public final Function2 a;
    public long b;
    public float c;
    public lr1_1 d;

    public l11_0(bq1_1 bq1_12) {
        long l2;
        this.a = bq1_12;
        this.b = l2 = f60.b(0, 0, 15);
    }

    public final lr1_1 a(long l2, Vo0 vo0) {
        lr1_1 lr1_12;
        float f5;
        float f6;
        float f7;
        long l3;
        boolean bl2;
        Object object = this.d;
        if (object != null && (bl2 = c60.c(l3 = this.b, l2)) && !(bl2 = (f7 = (f6 = this.c) - (f5 = vo0.getDensity())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) {
            lr1_1 lr1_13 = this.d;
            Intrinsics.checkNotNull(lr1_13);
            return lr1_13;
        }
        this.b = l2;
        this.c = f6 = vo0.getDensity();
        object = new c60(l2);
        this.d = lr1_12 = (lr1_1)this.a.invoke(vo0, object);
        return lr1_12;
    }
}

