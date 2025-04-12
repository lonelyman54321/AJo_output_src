/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

public final class DL0$c
extends InputStream {
    public final InputStream a;
    public final OutputStream b;

    public DL0$c(re1$a re1$a, BufferedOutputStream bufferedOutputStream) {
        Intrinsics.checkNotNullParameter(re1$a, "input");
        Intrinsics.checkNotNullParameter(bufferedOutputStream, "output");
        this.a = re1$a;
        this.b = bufferedOutputStream;
    }

    public final int available() {
        return this.a.available();
    }

    public final void close() {
        OutputStream outputStream = this.b;
        try {
            InputStream inputStream = this.a;
            inputStream.close();
            return;
        }
        finally {
            outputStream.close();
        }
    }

    public final void mark(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        InputStream inputStream = this.a;
        int n3 = inputStream.read();
        if (n3 >= 0) {
            OutputStream outputStream = this.b;
            outputStream.write(n3);
        }
        return n3;
    }

    public final int read(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "buffer");
        InputStream inputStream = this.a;
        int n3 = inputStream.read(byArray);
        if (n3 > 0) {
            OutputStream outputStream = this.b;
            outputStream.write(byArray, 0, n3);
        }
        return n3;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "buffer");
        Closeable closeable = this.a;
        n4 = ((InputStream)closeable).read(byArray, n3, n4);
        if (n4 > 0) {
            closeable = this.b;
            ((OutputStream)closeable).write(byArray, n3, n4);
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void reset() {
        synchronized (this) {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            throw unsupportedOperationException;
        }
    }

    public final long skip(long l2) {
        long l3;
        int n3 = 1024;
        byte[] byArray = new byte[n3];
        long l4 = 0L;
        while ((l3 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) < 0) {
            long l7 = l2 - l4;
            long l8 = n3;
            int n4 = (int)(l7 = Math.min(l7, l8));
            l3 = this.read(byArray, 0, n4);
            if (l3 < 0) {
                return l4;
            }
            l7 = l3;
            l4 += l7;
        }
        return l4;
    }
}

