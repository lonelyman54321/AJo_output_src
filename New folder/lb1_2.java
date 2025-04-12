/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;

/*
 * Renamed from lB1
 */
public final class lb1_2
extends db1_1 {
    public final long a;
    public final long b;
    public boolean c;
    public long d;

    /*
     * Enabled aggressive block sorting
     */
    public lb1_2(long l2, long l3, long l4) {
        this.a = l4;
        this.b = l3;
        long l7 = 0L;
        boolean bl2 = false;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        long l12 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l8 > 0 ? l12 <= 0 : l12 >= 0) {
            bl2 = true;
        }
        this.c = bl2;
        if (!bl2) {
            l2 = l3;
        }
        this.d = l2;
    }

    public final boolean hasNext() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long nextLong() {
        long l2 = this.d;
        long l3 = this.b;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            this.d = l3 = this.a + l2;
            return l2;
        }
        boolean bl2 = this.c;
        if (bl2) {
            bl2 = false;
            this.c = false;
            return l2;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

