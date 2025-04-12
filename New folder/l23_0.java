/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from l23
 */
public final class l23_0
extends r1_0 {
    public long a = -1;
    public CancellableContinuationImpl b;

    public final boolean a(p1_0 p1_02) {
        boolean bl2;
        p1_02 = (i23_0)p1_02;
        long l2 = this.a;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            bl2 = false;
            p1_02 = null;
        } else {
            l2 = ((i23_0)p1_02).i;
            l3 = ((i23_0)p1_02).j;
            long l7 = l2 - l3;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object < 0) {
                ((i23_0)p1_02).j = l2;
            }
            this.a = l2;
            bl2 = true;
        }
        return bl2;
    }

    public final f80_0[] b(p1_0 p1_02) {
        p1_02 = (i23_0)p1_02;
        long l2 = this.a;
        this.a = -1;
        this.b = null;
        return ((i23_0)p1_02).v(l2);
    }
}

