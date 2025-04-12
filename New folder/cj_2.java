/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from cJ
 */
public final class cj_2
implements a93_0 {
    public boolean a;
    public final /* synthetic */ se_1 b;
    public final /* synthetic */ gj_1 c;
    public final /* synthetic */ re_2 d;

    public cj_2(se_1 se_12, RI$b rI$b, he2_2 he2_22) {
        this.b = se_12;
        this.c = rI$b;
        this.d = he2_22;
    }

    public final long a0(ce_2 ce_22, long l2) {
        se_1 se_12;
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(ce_22, string2);
        boolean bl2 = true;
        try {
            se_12 = this.b;
        }
        catch (IOException iOException) {
            boolean bl3 = this.a;
            if (!bl3) {
                this.a = bl2;
                gj_1 gj_12 = this.c;
                gj_12.a();
            }
            throw iOException;
        }
        l2 = se_12.a0(ce_22, l2);
        long l3 = -1;
        re_2 re_22 = this.d;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            boolean bl4 = this.a;
            if (!bl4) {
                this.a = bl2;
                re_22.close();
            }
            return l3;
        }
        ce_2 ce_23 = re_22.e();
        long l7 = ce_22.b - l2;
        ce_22.k(ce_23, l7, l2);
        re_22.v();
        return l2;
    }

    public final void close() {
        Object object;
        boolean bl2 = this.a;
        if (!bl2 && !(bl2 = ez3.h(this, (TimeUnit)((Object)(object = TimeUnit.MILLISECONDS))))) {
            this.a = bl2 = true;
            object = this.c;
            object.a();
        }
        this.b.close();
    }

    public final a timeout() {
        return this.b.timeout();
    }
}

