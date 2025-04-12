/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from aw0
 */
public final class aw0_2
implements Sequence,
fw0_2 {
    public final Sequence a;
    public final int b;

    public aw0_2(Sequence object, int n3) {
        String string2 = "sequence";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        this.b = n3;
        if (n3 >= 0) {
            return;
        }
        object = new StringBuilder("count must be non-negative, but was ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append('.');
        object = ((StringBuilder)object).toString();
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final Sequence a(int n3) {
        aw0_2 aw0_22;
        int n4 = this.b + n3;
        if (n4 < 0) {
            aw0_22 = new aw0_2(this, n3);
        } else {
            aw0_2 aw0_23;
            Sequence sequence = this.a;
            aw0_22 = aw0_23 = new aw0_2(sequence, n4);
        }
        return aw0_22;
    }

    public final Iterator iterator() {
        aw0$a aw0$a = new aw0$a(this);
        return aw0$a;
    }

    public final Sequence take() {
        fw0_2 fw0_22;
        int n3 = this.b;
        int n4 = n3 + 100;
        if (n4 < 0) {
            fw0_22 = new bi3_2(this);
        } else {
            Sequence sequence = this.a;
            rf3_2 rf3_22 = new rf3_2(sequence, n3, n4);
            fw0_22 = rf3_22;
        }
        return fw0_22;
    }
}

