/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DV0
 */
public final class dv0_2
extends pj2_2 {
    public static final jn1_0 c = JN1$a.a("application/x-www-form-urlencoded");
    public final List a;
    public final List b;

    public dv0_2(List list, List list2) {
        Intrinsics.checkNotNullParameter(list, "encodedNames");
        Intrinsics.checkNotNullParameter(list2, "encodedValues");
        this.a = list = ez3.x(list);
        this.b = list = ez3.x(list2);
    }

    public final long a(re_2 re_22, boolean bl2) {
        long l2;
        if (bl2) {
            re_22 = new ce_2();
        } else {
            Intrinsics.checkNotNull(re_22);
            re_22 = re_22.e();
        }
        List list = this.a;
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            if (i3 > 0) {
                n4 = 38;
                ((ce_2)re_22).U(n4);
            }
            String string2 = (String)list.get(i3);
            ((ce_2)re_22).I0(string2);
            n4 = 61;
            ((ce_2)re_22).U(n4);
            string2 = (String)this.b.get(i3);
            ((ce_2)re_22).I0(string2);
        }
        if (bl2) {
            l2 = ((ce_2)re_22).b;
            ((ce_2)re_22).b();
        } else {
            l2 = 0L;
        }
        return l2;
    }

    public final long contentLength() {
        return this.a(null, true);
    }

    public final jn1_0 contentType() {
        return c;
    }

    public final void writeTo(re_2 re_22) {
        Intrinsics.checkNotNullParameter(re_22, "sink");
        this.a(re_22, false);
    }
}

