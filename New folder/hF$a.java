/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class hF$a
extends InputStream {
    public final ByteBuffer a;
    public int b = -1;

    public hF$a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final int available() {
        return this.a.remaining();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void mark(int n3) {
        synchronized (this) {
            ByteBuffer byteBuffer = this.a;
            this.b = n3 = byteBuffer.position();
            return;
        }
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        ByteBuffer byteBuffer = this.a;
        boolean bl2 = byteBuffer.hasRemaining();
        if (!bl2) {
            return -1;
        }
        return byteBuffer.get() & 0xFF;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        ByteBuffer byteBuffer = this.a;
        int n7 = byteBuffer.hasRemaining();
        if (n7 == 0) {
            return -1;
        }
        n7 = byteBuffer.remaining();
        n4 = Math.min(n4, n7);
        byteBuffer.get(byArray, n3, n4);
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void reset() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    int n3 = this.b;
                    int n4 = -1;
                    if (n3 != n4) {
                        ByteBuffer byteBuffer = this.a;
                        byteBuffer.position(n3);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "Cannot reset to unset mark position";
                IOException iOException = new IOException(string2);
                throw iOException;
            }
            throw throwable2;
        }
    }

    public final long skip(long l2) {
        ByteBuffer byteBuffer = this.a;
        boolean bl2 = byteBuffer.hasRemaining();
        if (!bl2) {
            return -1;
        }
        long l3 = byteBuffer.remaining();
        l2 = Math.min(l2, l3);
        int n3 = (int)((long)byteBuffer.position() + l2);
        byteBuffer.position(n3);
        return l2;
    }
}

