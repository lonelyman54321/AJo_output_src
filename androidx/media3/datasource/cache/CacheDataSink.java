/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.datasource.cache;

import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class CacheDataSink
implements oi0_1 {
    public final Cache a;
    public final long b;
    public final int c;
    public ti0_1 d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public sO2 j;

    public CacheDataSink(Cache cache) {
        cache.getClass();
        this.a = cache;
        this.b = 0x500000L;
        this.c = 20480;
    }

    public final void a(ti0_1 ti0_12) {
        int n3;
        int n4;
        Object object = ti0_12.h;
        object.getClass();
        long l2 = ti0_12.g;
        long l3 = -1;
        int n7 = ti0_12.i;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false && (n4 = n7 & 2) == (n3 = 2)) {
            this.d = null;
            return;
        }
        this.d = ti0_12;
        n3 = n7 & 4;
        n4 = 4;
        l2 = n3 == n4 ? this.b : Long.MAX_VALUE;
        this.e = l2;
        this.i = l2 = 0L;
        try {
            this.c(ti0_12);
            return;
        }
        catch (IOException iOException) {
            object = new IOException(iOException);
            throw object;
        }
    }

    public final void b() {
        Object object = this.g;
        if (object == null) {
            return;
        }
        Cache cache = null;
        try {
            ((OutputStream)object).flush();
        }
        catch (Throwable throwable) {
            gz3.f(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            file.delete();
            throw throwable;
        }
        gz3.f(this.g);
        this.g = null;
        object = this.f;
        this.f = null;
        cache = this.a;
        long l2 = this.h;
        cache.e((File)object, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c(ti0_1 object) {
        long l2 = ((ti0_1)object).g;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            l3 = this.i;
            l2 -= l3;
            l3 = this.e;
            l3 = Math.min(l2, l3);
        }
        long l7 = l3;
        int n3 = gz3.a;
        l2 = ((ti0_1)object).f;
        l3 = this.i;
        long l8 = l2 + l3;
        Cache cache = this.a;
        String string2 = ((ti0_1)object).h;
        this.f = object = cache.h(l8, string2, l7);
        File file = this.f;
        object = new FileOutputStream(file);
        n3 = this.c;
        if (n3 > 0) {
            sO2 sO22 = this.j;
            if (sO22 == null) {
                this.j = sO22 = new BufferedOutputStream((OutputStream)object, n3);
            } else {
                sO22.a((OutputStream)object);
            }
            this.g = object = this.j;
        } else {
            this.g = object;
        }
        this.h = 0L;
    }

    public final void close() {
        ti0_1 ti0_12 = this.d;
        if (ti0_12 == null) {
            return;
        }
        try {
            this.b();
            return;
        }
        catch (IOException iOException) {
            CacheDataSink$CacheDataSinkException cacheDataSink$CacheDataSinkException = new IOException(iOException);
            throw cacheDataSink$CacheDataSinkException;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void write(byte[] byArray, int n3, int n4) {
        IOException iOException2;
        ti0_1 ti0_12 = this.d;
        if (ti0_12 == null) {
            return;
        }
        int n7 = 0;
        while (true) {
            long l2;
            long l3;
            long l4;
            block7: {
                if (n7 >= n4) {
                    return;
                }
                try {
                    l4 = this.h;
                    l3 = this.e;
                    long l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
                    if (l7 != false) break block7;
                    this.b();
                    this.c(ti0_12);
                }
                catch (IOException iOException2) {
                    break;
                }
            }
            int n8 = n4 - n7;
            l4 = n8;
            {
                l3 = this.e;
                l2 = this.h;
            }
            {
                l4 = Math.min(l4, l3 -= l2);
                int n10 = (int)l4;
                OutputStream outputStream = this.g;
                int n14 = gz3.a;
                n14 = n3 + n7;
                outputStream.write(byArray, n14, n10);
                n7 += n10;
                l3 = this.h;
                l4 = n10;
                this.h = l3 += l4;
                this.i = l3 = this.i + l4;
                continue;
            }
            break;
        }
        CacheDataSink$CacheDataSinkException cacheDataSink$CacheDataSinkException = new IOException(iOException2);
        throw cacheDataSink$CacheDataSinkException;
    }
}

