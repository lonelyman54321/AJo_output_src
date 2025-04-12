/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from Zi3
 */
public final class zi3_0
implements a93_0 {
    public final a93_0 a;
    public final y63_0 b;
    public final ce_2 c;
    public boolean d;

    public zi3_0(se_1 se_12, ij2_0 ij2_02) {
        Intrinsics.checkNotNullParameter(se_12, "upstream");
        Intrinsics.checkNotNullParameter(ij2_02, "sideStream");
        this.a = se_12;
        this.b = ij2_02;
        this.c = se_12;
    }

    public final long a0(ce_2 ce_22, long l2) {
        Intrinsics.checkNotNullParameter(ce_22, "sink");
        a93_0 a93_02 = this.a;
        l2 = a93_02.a0(ce_22, l2);
        boolean bl2 = true;
        y63_0 y63_02 = this.b;
        long l3 = -1;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            try {
                y63_02.close();
            }
            catch (IOException iOException) {
                this.d = bl2;
            }
            return l3;
        }
        boolean bl3 = this.d;
        if (!bl3) {
            l3 = ce_22.b;
            long l7 = l3 - l2;
            ce_2 ce_23 = this.c;
            ce_22.k(ce_23, l7, l2);
            ce_22 = this.c;
            try {
                y63_02.s0(ce_22, l2);
            }
            catch (IOException iOException) {
                this.d = bl2;
                try {
                    y63_02.close();
                }
                catch (IOException iOException2) {
                    this.d = bl2;
                }
            }
        }
        return l2;
    }

    public final void close() {
        y63_0 y63_02 = this.b;
        try {
            y63_02.close();
        }
        catch (IOException iOException) {
            boolean bl2;
            this.d = bl2 = true;
        }
        this.a.close();
    }

    public final a timeout() {
        a a2 = this.a.timeout();
        Intrinsics.checkNotNullExpressionValue(a2, "upstream.timeout()");
        return a2;
    }
}

