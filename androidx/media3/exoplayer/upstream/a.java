/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.media3.exoplayer.upstream.b;
import androidx.media3.exoplayer.upstream.b$a;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class a
implements b {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long a(b$a b$a) {
        void var2_3;
        IOException iOException = b$a.a;
        int n3 = iOException instanceof ParserException;
        if (n3 != 0) return -9223372036854775807L;
        n3 = iOException instanceof FileNotFoundException;
        if (n3 != 0) return -9223372036854775807L;
        n3 = iOException instanceof HttpDataSource$CleartextNotPermittedException;
        if (n3 != 0) return -9223372036854775807L;
        n3 = iOException instanceof Loader$UnexpectedLoaderException;
        if (n3 != 0) return -9223372036854775807L;
        n3 = DataSourceException.b;
        while (var2_3 != null) {
            n3 = var2_3 instanceof DataSourceException;
            if (n3 != 0) {
                DataSourceException dataSourceException = var2_3;
                dataSourceException = (DataSourceException)var2_3;
                n3 = dataSourceException.a;
                int n4 = 2008;
                if (n3 == n4) return -9223372036854775807L;
            }
            Throwable throwable = ((Throwable)var2_3).getCause();
        }
        int n7 = (b$a.b + -1) * 1000;
        int n8 = 5000;
        n7 = Math.min(n7, n8);
        return n7;
    }

    public final int b(int n3) {
        int n4 = 7;
        n3 = n3 == n4 ? 6 : 3;
        return n3;
    }
}

