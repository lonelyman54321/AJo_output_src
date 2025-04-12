/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/*
 * Renamed from rf3
 */
public final class rf3_2
implements Sequence,
fw0_2 {
    public final Sequence a;
    public final int b;
    public final int c;

    public rf3_2(Sequence object, int n3, int n4) {
        String string2 = "sequence";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        this.b = n3;
        this.c = n4;
        if (n3 >= 0) {
            if (n4 >= 0) {
                if (n4 >= n3) {
                    return;
                }
                object = D70.b(n4, n3, "endIndex should be not less than startIndex, but was ", " < ");
                object = object.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            object = hj0_0.a(n4, "endIndex should be non-negative, but is ");
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        object = hj0_0.a(n3, "startIndex should be non-negative, but is ");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final Sequence a(int n3) {
        Sequence sequence;
        int n4 = this.c;
        int n7 = this.b;
        int n8 = n4 - n7;
        if (n3 >= n8) {
            sequence = uz0_2.a;
        } else {
            sequence = this.a;
            rf3_2 rf3_22 = new rf3_2(sequence, n7 += n3, n4);
            sequence = rf3_22;
        }
        return sequence;
    }

    public final Iterator iterator() {
        rf3$a_0 rf3$a_0 = new rf3$a_0(this);
        return rf3$a_0;
    }

    public final Sequence take() {
        rf3_2 rf3_22;
        int n3 = this.c;
        int n4 = 100;
        int n7 = this.b;
        if (n4 >= (n3 -= n7)) {
            rf3_22 = this;
        } else {
            n4 = n7 + 100;
            Sequence sequence = this.a;
            rf3_22 = new rf3_2(sequence, n7, n4);
        }
        return rf3_22;
    }
}

