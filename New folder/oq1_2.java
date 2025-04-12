/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

/*
 * Renamed from Oq1
 */
public final class oq1_2
extends Lambda
implements Function0 {
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ qr1_0 d;

    public oq1_2(mp0 mp02, qr1_0 qr1_02) {
        this.c = mp02;
        this.d = qr1_02;
        super(0);
    }

    public final Object invoke() {
        eq1_1 eq1_12 = (eq1_1)this.c.getValue();
        qr1_0 qr1_02 = this.d;
        Object object = (IntRange)qr1_02.b.e.getValue();
        g g3 = new g((IntRange)object, eq1_12);
        object = new lq1_1(qr1_02, eq1_12, g3);
        return object;
    }
}

