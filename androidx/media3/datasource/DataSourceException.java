/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.datasource;

import java.io.IOException;

public class DataSourceException
extends IOException {
    public static final /* synthetic */ int b;
    public final int a;

    public DataSourceException(int n3) {
        this.a = n3;
    }

    public DataSourceException(String string2, int n3) {
        super(string2);
        this.a = n3;
    }

    public DataSourceException(String string2, Throwable throwable, int n3) {
        super(string2, throwable);
        this.a = n3;
    }

    public DataSourceException(Throwable throwable, int n3) {
        super(throwable);
        this.a = n3;
    }
}

