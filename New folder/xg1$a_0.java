/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from xG1$a
 */
public final class xg1$a_0
extends Lambda
implements Function0 {
    public final /* synthetic */ xg1_0 c;

    public xg1$a_0(xg1_0 xg1_02) {
        this.c = xg1_02;
        super(0);
    }

    public final Object invoke() {
        long l2;
        zp1 zp12 = (zp1)this.c.A.getValue();
        if (zp12 != null) {
            long l3 = 0L;
            l2 = zp12.a0(l3);
        } else {
            l2 = 9205357640488583168L;
        }
        e72 e722 = new e72(l2);
        return e722;
    }
}

