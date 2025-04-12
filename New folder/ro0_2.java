/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rO0
 */
public final class ro0_2
extends pv0_2 {
    public final long b;
    public final boolean c;
    public long d;

    public ro0_2(a93_0 a93_02, long l2, boolean bl2) {
        Intrinsics.checkNotNullParameter(a93_02, "delegate");
        super(a93_02);
        this.b = l2;
        this.c = bl2;
    }

    public final long a0(ce_2 object, long l2) {
        long l3;
        long l4;
        long l7;
        Object object2 = "sink";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        long l8 = this.d;
        long l12 = -1;
        long l14 = 0L;
        long l15 = this.b;
        Object object3 = l8 == l15 ? 0 : (l8 < l15 ? -1 : 1);
        if (object3 > 0) {
            l2 = l14;
        } else {
            object3 = this.c;
            if (object3 != false) {
                long l16 = (l8 = l15 - l8) - l14;
                object3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                if (object3 == false) {
                    return l12;
                }
                l2 = Math.min(l2, l8);
            }
        }
        l2 = super.a0((ce_2)object, l2);
        Object object4 = l2 == l12 ? 0 : (l2 < l12 ? -1 : 1);
        if (object4 != false) {
            this.d = l7 = this.d + l2;
        }
        if ((l4 = (l3 = (l7 = this.d) - l15) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0 && object4 == false || (object4 = l7 == l15 ? 0 : (l7 < l15 ? -1 : 1)) > 0) {
            long l17;
            object4 = l2 == l14 ? 0 : (l2 < l14 ? -1 : 1);
            if (object4 > 0 && (l17 = l7 == l15 ? 0 : (l7 < l15 ? -1 : 1)) > 0) {
                l2 = ((ce_2)object).b;
                object2 = new ce_2();
                ((ce_2)object2).s((a93_0)object);
                ((ce_2)object).s0((ce_2)object2, l2 -= (l7 -= l15));
                ((ce_2)object2).b();
            }
            CharSequence charSequence = new StringBuilder("expected ");
            charSequence.append(l15);
            charSequence.append(" bytes but got ");
            l8 = this.d;
            charSequence.append(l8);
            charSequence = charSequence.toString();
            object = new IOException((String)charSequence);
            throw object;
        }
        return l2;
    }
}

