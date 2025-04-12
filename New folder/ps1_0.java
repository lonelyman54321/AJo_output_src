/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

/*
 * Renamed from ps1
 */
public final class ps1_0
extends Lambda
implements Function0 {
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ Cl2 d;

    public ps1_0(mp0 mp02, hm0_0 hm0_02) {
        this.c = mp02;
        this.d = hm0_02;
        super(0);
    }

    public final Object invoke() {
        ll2 ll22 = (ll2)this.c.getValue();
        Cl2 cl2 = this.d;
        Object object = (IntRange)cl2.c.f.getValue();
        g g3 = new g((IntRange)object, ll22);
        cl2 = (hm0_0)cl2;
        object = new nl2_0((hm0_0)cl2, ll22, g3);
        return object;
    }
}

