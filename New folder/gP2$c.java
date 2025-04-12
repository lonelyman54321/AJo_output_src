/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

public final class gP2$c
extends Lambda
implements Function1 {
    public final /* synthetic */ gp2_0 c;

    public gP2$c(gp2_0 gp2_02) {
        this.c = gp2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        double d2 = ((Number)object).doubleValue();
        object = this.c;
        double d5 = ((gp2_0)object).k.c(d2);
        double d7 = ((gp2_0)object).e;
        double d9 = ((gp2_0)object).f;
        return f.e(d5, d7, d9);
    }
}

