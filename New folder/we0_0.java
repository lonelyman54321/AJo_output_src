/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

/*
 * Renamed from wE0
 */
public final class we0_0
extends InputStream {
    public final InputStream a;
    public int b;

    public we0_0(InputStream inputStream) {
        this.a = inputStream;
        this.b = 0x40000000;
    }

    public final int available() {
        return this.b;
    }

    public final void close() {
        this.a.close();
    }

    public final int read() {
        int n3;
        InputStream inputStream = this.a;
        int n4 = inputStream.read();
        if (n4 == (n3 = -1)) {
            n3 = 0;
            this.b = 0;
        }
        return n4;
    }

    public final int read(byte[] byArray) {
        int n3;
        InputStream inputStream = this.a;
        int n4 = inputStream.read(byArray);
        if (n4 == (n3 = -1)) {
            n3 = 0;
            inputStream = null;
            this.b = 0;
        }
        return n4;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        InputStream inputStream = this.a;
        int n7 = inputStream.read(byArray, n3, n4);
        if (n7 == (n3 = -1)) {
            n3 = 0;
            this.b = 0;
        }
        return n7;
    }

    public final long skip(long l2) {
        return this.a.skip(l2);
    }
}

