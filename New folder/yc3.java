/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.media3.datasource.DataSource;
import java.util.Collections;
import java.util.Map;

public final class yc3
implements DataSource {
    public final DataSource a;
    public long b;
    public Uri c;
    public Map d;

    public yc3(DataSource object) {
        object.getClass();
        this.a = object;
        object = Uri.EMPTY;
        this.c = object;
        this.d = object = Collections.emptyMap();
    }

    public final long a(ti0_1 object) {
        Object object2;
        DataSource dataSource = this.a;
        this.c = object2 = ((ti0_1)object).a;
        object2 = Collections.emptyMap();
        this.d = object2;
        try {
            long l2 = dataSource.a((ti0_1)object);
            return l2;
        }
        finally {
            object = dataSource.k();
            if (object != null) {
                this.c = object;
            }
            this.d = object = dataSource.c();
        }
    }

    public final Map c() {
        return this.a.c();
    }

    public final void close() {
        this.a.close();
    }

    public final void g(Kq3 kq3) {
        kq3.getClass();
        this.a.g(kq3);
    }

    public final Uri k() {
        return this.a.k();
    }

    public final int read(byte[] byArray, int n3, int n4) {
        DataSource dataSource = this.a;
        int n7 = dataSource.read(byArray, n3, n4);
        if (n7 != (n3 = -1)) {
            long l2 = this.b;
            long l3 = n7;
            this.b = l2 += l3;
        }
        return n7;
    }
}

