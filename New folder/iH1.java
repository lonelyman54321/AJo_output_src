/*
 * Decompiled with CFR 0.152.
 */
import java.io.FilterInputStream;

public final class iH1
extends FilterInputStream {
    public int a = -1 << -1;

    public iH1(vC0 vC02) {
        super(vC02);
    }

    public final long a(long l2) {
        long l3;
        long l4;
        long l7;
        int n3 = this.a;
        if (n3 == 0) {
            return -1;
        }
        int n4 = -1 << -1;
        if (n3 != n4 && (l7 = (l4 = l2 - (l3 = (long)n3)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            l2 = n3;
        }
        return l2;
    }

    public final int available() {
        int n3 = this.a;
        int n4 = -1 << -1;
        if (n3 == n4) {
            n3 = super.available();
        } else {
            n4 = super.available();
            n3 = Math.min(n3, n4);
        }
        return n3;
    }

    public final void b(long l2) {
        long l3;
        long l4;
        long l7;
        int n3 = this.a;
        int n4 = -1 << -1;
        if (n3 != n4 && (l7 = (l4 = l2 - (l3 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            int n7;
            long l8 = (long)n3 - l2;
            this.a = n7 = (int)l8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void mark(int n3) {
        synchronized (this) {
            super.mark(n3);
            this.a = n3;
            return;
        }
    }

    public final int read() {
        long l2;
        long l3 = 1L;
        long l4 = this.a(l3);
        long l7 = l4 - (l2 = (long)-1);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            return -1;
        }
        int n3 = super.read();
        this.b(l3);
        return n3;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7;
        long l2 = n4;
        n4 = (int)(l2 = this.a(l2));
        if (n4 == (n7 = -1)) {
            return n7;
        }
        int n8 = super.read(byArray, n3, n4);
        long l3 = n8;
        this.b(l3);
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void reset() {
        synchronized (this) {
            int n3;
            super.reset();
            this.a = n3 = -1 << -1;
            return;
        }
    }

    public final long skip(long l2) {
        long l3;
        long l4 = (l2 = this.a(l2)) - (l3 = (long)-1);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return 0L;
        }
        l2 = super.skip(l2);
        this.b(l2);
        return l2;
    }
}

