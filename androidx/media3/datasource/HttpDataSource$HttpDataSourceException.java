/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.datasource;

import androidx.media3.datasource.DataSourceException;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class HttpDataSource$HttpDataSourceException
extends DataSourceException {
    public final int c;

    public HttpDataSource$HttpDataSourceException() {
        super(2008);
        this.c = 1;
    }

    public HttpDataSource$HttpDataSourceException(int n3, IOException iOException, String string2) {
        int n4 = 1;
        n3 = HttpDataSource$HttpDataSourceException.a(n3, n4);
        super(string2, iOException, n3);
        this.c = n4;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, int n3, int n4) {
        n3 = HttpDataSource$HttpDataSourceException.a(n3, n4);
        super(iOException, n3);
        this.c = n4;
    }

    public HttpDataSource$HttpDataSourceException(String string2, int n3) {
        int n4 = 1;
        n3 = HttpDataSource$HttpDataSourceException.a(n3, n4);
        super(string2, n3);
        this.c = n4;
    }

    public static int a(int n3, int n4) {
        int n7 = 2000;
        if (n3 == n7 && n4 == (n7 = 1)) {
            n3 = 2001;
        }
        return n3;
    }

    public static HttpDataSource$HttpDataSourceException b(IOException iOException, int n3) {
        Object object;
        int n4;
        Object object2;
        int n7;
        String string2 = iOException.getMessage();
        boolean bl2 = iOException instanceof SocketTimeoutException;
        n7 = bl2 ? 2002 : ((bl2 = iOException instanceof InterruptedIOException) ? 1004 : (string2 != null && (n7 = (int)((string2 = Ascii.toLowerCase(string2)).matches((String)(object2 = "cleartext.*not permitted.*")) ? 1 : 0)) != 0 ? 2007 : 2001));
        if (n7 == (n4 = 2007)) {
            string2 = "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted";
            object = new HttpDataSource$HttpDataSourceException(n4, iOException, string2);
        } else {
            object = object2 = new HttpDataSource$HttpDataSourceException(iOException, n7, n3);
        }
        return object;
    }
}

