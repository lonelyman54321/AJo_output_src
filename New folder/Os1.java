/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class Os1
extends Lambda
implements Function0 {
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ xr1_2 e;

    public Os1(mp0 mp02, ft1_2 ft1_22, xr1_2 xr1_22) {
        this.c = mp02;
        this.d = ft1_22;
        this.e = xr1_22;
        super(0);
    }

    public final Object invoke() {
        Is1 is1 = (Is1)this.c.getValue();
        ft1_2 ft1_22 = this.d;
        Object object = (IntRange)ft1_22.d.e.getValue();
        g g3 = new g((IntRange)object, is1);
        xr1_2 xr1_22 = this.e;
        object = new Ls1(ft1_22, is1, xr1_22, g3);
        return object;
    }
}

