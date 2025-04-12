/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.CacheDataSink;
import java.util.Map;

/*
 * Renamed from Yi3
 */
public final class yi3_0
implements DataSource {
    public final DataSource a;
    public final oi0_1 b;
    public boolean c;
    public long d;

    public yi3_0(DataSource dataSource, CacheDataSink cacheDataSink) {
        this.a = dataSource;
        cacheDataSink.getClass();
        this.b = cacheDataSink;
    }

    public final long a(ti0_1 ti0_12) {
        long l2;
        yi3_0 yi3_02 = this;
        Object object = ti0_12;
        Object object2 = this.a;
        this.d = l2 = object2.a(ti0_12);
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 == false) {
            return l3;
        }
        l3 = ti0_12.g;
        long l7 = -1;
        long l8 = l3 - l7;
        Object object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object4 == false && (object4 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1)) != false && (object3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) != false) {
            int n3 = ti0_12.i;
            Object object5 = ti0_12.j;
            Uri uri = ti0_12.a;
            long l12 = ti0_12.b;
            int n4 = ti0_12.c;
            byte[] byArray = ti0_12.d;
            Map map2 = ti0_12.e;
            long l14 = ti0_12.f;
            object = ti0_12.h;
            Object object6 = object5;
            object5 = object;
            object = object2 = new ti0_1(uri, l12, n4, byArray, map2, l14, l2, (String)object, n3, object6);
        }
        yi3_02.c = true;
        yi3_02.b.a((ti0_1)object);
        return yi3_02.d;
    }

    public final Map c() {
        return this.a.c();
    }

    public final void close() {
        oi0_1 oi0_12 = this.b;
        try {
            DataSource dataSource = this.a;
            dataSource.close();
            return;
        }
        finally {
            boolean bl2 = this.c;
            if (bl2) {
                this.c = false;
                oi0_12.close();
            }
        }
    }

    public final void g(Kq3 kq3) {
        kq3.getClass();
        this.a.g(kq3);
    }

    public final Uri k() {
        return this.a.k();
    }

    public final int read(byte[] byArray, int n3, int n4) {
        long l2 = this.d;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return -1;
        }
        Object object2 = this.a;
        if ((n4 = object2.read(byArray, n3, n4)) > 0) {
            object2 = this.b;
            object2.write(byArray, n3, n4);
            long l7 = this.d;
            l2 = -1;
            long l8 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
            if (l8 != false) {
                l2 = n4;
                this.d = l7 -= l2;
            }
        }
        return n4;
    }
}

