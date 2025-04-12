/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.source.f$a;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.n$b;
import java.util.Map;

public final class f
implements DataSource {
    public final DataSource a;
    public final int b;
    public final f$a c;
    public final byte[] d;
    public int e;

    public f(DataSource object, int n3, f$a f$a) {
        int n4 = 1;
        boolean bl2 = n3 > 0;
        ct3.a(bl2);
        this.a = object;
        this.b = n3;
        this.c = f$a;
        object = new byte[n4];
        this.d = (byte[])object;
        this.e = n3;
    }

    public final long a(ti0_1 object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final Map c() {
        return this.a.c();
    }

    public final void close() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void g(Kq3 kq3) {
        kq3.getClass();
        this.a.g(kq3);
    }

    public final Uri k() {
        return this.a.k();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int read(byte[] byArray, int n3, int n4) {
        int n7;
        f f5 = this;
        int n8 = 1;
        int n10 = this.e;
        DataSource dataSource = this.a;
        int n14 = -1;
        if (n10 == 0) {
            byte[] byArray2 = this.d;
            n7 = 0;
            Xm2 xm2 = null;
            int n15 = dataSource.read(byArray2, 0, n8);
            if (n15 == n14) return n14;
            n10 = (byArray2[0] & 0xFF) << 4;
            if (n10 != 0) {
                int n16;
                Object object = new byte[n10];
                for (int i3 = n10; i3 > 0; i3 -= n16) {
                    n16 = dataSource.read((byte[])object, n7, i3);
                    if (n16 == n14) {
                        return n14;
                    }
                    n7 += n16;
                }
                while (n10 > 0) {
                    n7 = n10 + -1;
                    if ((n7 = object[n7]) != 0) break;
                    n10 += n14;
                }
                if (n10 > 0) {
                    long l2;
                    xm2 = new Xm2((byte[])object, n10);
                    n$b n$b = (n$b)f5.c;
                    n15 = (int)(n$b.m ? 1 : 0);
                    if (n15 == 0) {
                        l2 = n$b.j;
                    } else {
                        object = n.Q;
                        object = n$b.n;
                        l2 = ((n)object).u(n8 != 0);
                        long l3 = n$b.j;
                        l2 = Math.max(l2, l3);
                    }
                    int n17 = xm2.a();
                    wp3 wp32 = n$b.l;
                    wp32.getClass();
                    wp32.f(n17, xm2);
                    int n18 = 1;
                    wp32.a(l2, n18, n17, 0, null);
                    n$b.m = n8;
                }
            }
            f5.e = n8 = f5.b;
        }
        n8 = f5.e;
        n10 = n4;
        n8 = Math.min(n8, n4);
        byte[] byArray3 = byArray;
        n7 = n3;
        if ((n8 = dataSource.read(byArray, n3, n8)) == n14) return n8;
        f5.e = n10 = f5.e - n8;
        return n8;
    }
}

