/*
 * Decompiled with CFR 0.152.
 */
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ZQ1
 */
public final class zq1_2
extends Lambda
implements Function0 {
    public final /* synthetic */ ar1_0 c;

    public zq1_2(ar1_0 ar1_02) {
        this.c = ar1_02;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        rk2_0 rk2_02 = (rk2_0)CollectionsKt.firstOrNull(this.c.c.a.a.b());
        rk2_0 rk2_03 = null;
        if (rk2_02 != null && (bl2 = rk2_02 instanceof rk2$b)) {
            rk2_02 = (rk2$b)rk2_02;
            Rv1 rv1 = ((rk2$b)rk2_02).a;
            Rv1 rv12 = Rv1.REFRESH;
            if (rv1 == rv12) {
                rk2_03 = rk2_02;
            }
        }
        return rk2_03;
    }
}

