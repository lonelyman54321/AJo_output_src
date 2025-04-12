/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.InputStream;

public final class uE0$f
extends uE0$b {
    public uE0$f(InputStream object) {
        super((InputStream)object);
        boolean bl2 = ((InputStream)object).markSupported();
        if (bl2) {
            ((InputStream)this.a).mark(-1 >>> 1);
            return;
        }
        object = new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        throw object;
    }

    public uE0$f(byte[] byArray) {
        super(byArray);
        ((InputStream)this.a).mark(-1 >>> 1);
    }

    public final void b(long l2) {
        int n3 = this.b;
        long l3 = n3;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            n3 = 0;
            this.b = 0;
            DataInputStream dataInputStream = this.a;
            ((InputStream)dataInputStream).reset();
        } else {
            long l7 = n3;
            l2 -= l7;
        }
        int n4 = (int)l2;
        this.a(n4);
    }
}

