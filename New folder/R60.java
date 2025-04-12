/*
 * Decompiled with CFR 0.152.
 */
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class R60
extends FilterInputStream {
    public final long a;
    public int b;

    public R60(InputStream inputStream, long l2) {
        super(inputStream);
        this.a = l2;
    }

    public final void a(int n3) {
        long l2;
        block4: {
            block3: {
                block2: {
                    int n4;
                    if (n3 < 0) break block2;
                    this.b = n4 = this.b + n3;
                    break block3;
                }
                long l3 = this.b;
                l2 = this.a;
                long l4 = 0L;
                long l7 = (l3 = l2 - l3) - l4;
                n3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (n3 > 0) break block4;
            }
            return;
        }
        CharSequence charSequence = D70.c(l2, "Failed to read all expected data, expected: ", ", but read: ");
        int n7 = this.b;
        charSequence.append(n7);
        charSequence = charSequence.toString();
        IOException iOException = new IOException((String)charSequence);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int available() {
        synchronized (this) {
            long l2 = this.a;
            int n3 = this.b;
            long l3 = n3;
            l2 -= l3;
            InputStream inputStream = this.in;
            n3 = inputStream.available();
            l3 = n3;
            return (int)Math.max(l2, l3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int read() {
        synchronized (this) {
            int n3 = super.read();
            int n4 = n3 >= 0 ? 1 : -1;
            this.a(n4);
            return n3;
        }
    }

    public final int read(byte[] byArray) {
        int n3 = byArray.length;
        return this.read(byArray, 0, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int read(byte[] byArray, int n3, int n4) {
        synchronized (this) {
            int n7 = super.read(byArray, n3, n4);
            this.a(n7);
            return n7;
        }
    }
}

