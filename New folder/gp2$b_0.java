/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

/*
 * Renamed from gP2$b
 */
public final class gp2$b_0
extends Lambda
implements Function1 {
    public final /* synthetic */ gp2_0 c;

    public gp2$b_0(gp2_0 gp2_02) {
        this.c = gp2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        double d2 = ((Number)object).doubleValue();
        object = this.c;
        js0_0 js0_02 = ((gp2_0)object).n;
        double d5 = ((gp2_0)object).e;
        double d7 = ((gp2_0)object).f;
        d2 = f.e(d2, d5, d7);
        return js0_02.c(d2);
    }
}

