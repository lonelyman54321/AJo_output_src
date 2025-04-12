/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.datasource;

import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import java.util.Map;

public final class HttpDataSource$InvalidResponseCodeException
extends HttpDataSource$HttpDataSourceException {
    public final int d;
    public final Map e;

    public HttpDataSource$InvalidResponseCodeException(int n3, DataSourceException dataSourceException, Map map2) {
        String string2 = hj0_0.a(n3, "Response code: ");
        super(2004, dataSourceException, string2);
        this.d = n3;
        this.e = map2;
    }
}

