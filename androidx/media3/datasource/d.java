/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public final class d
implements DataSource {
    public static final d a;

    static {
        d d2;
        a = d2 = new Object();
    }

    public final long a(ti0_1 object) {
        object = new IOException("PlaceholderDataSource cannot be opened");
        throw object;
    }

    public final Map c() {
        return Collections.emptyMap();
    }

    public final void close() {
    }

    public final void g(Kq3 kq3) {
    }

    public final Uri k() {
        return null;
    }

    public final int read(byte[] object, int n3, int n4) {
        object = new UnsupportedOperationException;
        object();
        throw object;
    }
}

