/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from Bi3
 */
public final class bi3_2
implements Sequence,
fw0_2 {
    public final Sequence a;
    public final int b;

    public bi3_2(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.a = sequence;
        this.b = 100;
    }

    public final Sequence a(int n3) {
        fw0_2 fw0_22;
        int n4 = this.b;
        if (n3 >= n4) {
            fw0_22 = uz0_2.a;
        } else {
            Sequence sequence = this.a;
            rf3_2 rf3_22 = new rf3_2(sequence, n3, n4);
            fw0_22 = rf3_22;
        }
        return fw0_22;
    }

    public final Iterator iterator() {
        Bi3$a bi3$a = new Bi3$a(this);
        return bi3$a;
    }

    public final Sequence take() {
        bi3_2 bi3_22;
        int n3 = 100;
        int n4 = this.b;
        if (n3 >= n4) {
            bi3_22 = this;
        } else {
            Sequence sequence = this.a;
            bi3_22 = new bi3_2(sequence);
        }
        return bi3_22;
    }
}

