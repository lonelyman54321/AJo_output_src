/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

/*
 * Renamed from bB1
 */
public final class bb1_0 {
    public int a;
    public int b;
    public long[] c;
    public int d;

    public final long a() {
        int n3 = this.b;
        if (n3 != 0) {
            int n4 = this.a;
            long l2 = this.c[n4];
            ++n4;
            int n7 = this.d;
            this.a = n4 &= n7;
            this.b = n3 += -1;
            return l2;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

