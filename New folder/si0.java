/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.datasource.DataSource;
import java.io.InputStream;

public final class si0
extends InputStream {
    public final DataSource a;
    public final ti0_1 b;
    public final byte[] c;
    public boolean d = false;
    public boolean e = false;

    public si0(ti0_1 object, DataSource dataSource) {
        this.a = dataSource;
        this.b = object;
        object = new byte[1];
        this.c = (byte[])object;
    }

    public final void close() {
        boolean bl2 = this.e;
        if (!bl2) {
            DataSource dataSource = this.a;
            dataSource.close();
            this.e = bl2 = true;
        }
    }

    public final int read() {
        int n3;
        byte[] byArray = this.c;
        int n4 = byArray.length;
        if ((n4 = this.read(byArray, 0, n4)) != (n3 = -1)) {
            byte by2 = byArray[0];
            n3 = by2 & 0xFF;
        }
        return n3;
    }

    public final int read(byte[] byArray) {
        int n3 = byArray.length;
        return this.read(byArray, 0, n3);
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7;
        boolean bl2 = this.e;
        boolean bl3 = true;
        ct3.f(bl2 ^ bl3);
        bl2 = this.d;
        DataSource dataSource = this.a;
        if (!bl2) {
            ti0_1 ti0_12 = this.b;
            dataSource.a(ti0_12);
            this.d = bl3;
        }
        if ((n7 = dataSource.read(byArray, n3, n4)) == (n3 = -1)) {
            return n3;
        }
        return n7;
    }
}

