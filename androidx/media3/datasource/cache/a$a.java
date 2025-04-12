/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.datasource.cache;

import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.FileDataSource$a;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.a;
import androidx.media3.datasource.cache.c;

public final class a$a
implements DataSource$Factory {
    public Cache a;
    public final FileDataSource$a b;
    public boolean c;
    public DataSource$Factory d;
    public int e;

    public a$a() {
        FileDataSource$a fileDataSource$a;
        this.b = fileDataSource$a;
    }

    public final DataSource a() {
        Object object = this.d;
        Object object2 = null;
        Object object3 = object != null ? (object = object.a()) : null;
        int n3 = this.e;
        object = this.a;
        object.getClass();
        boolean bl2 = this.c;
        if (!bl2 && object3 != null) {
            object2 = new CacheDataSink((Cache)object);
        }
        CacheDataSink cacheDataSink = object2;
        DataSource dataSource = this.b.a();
        Object object4 = object;
        object4 = (c)object;
        object2 = new a((c)object4, (DataSource)object3, dataSource, cacheDataSink, n3);
        return object2;
    }
}

