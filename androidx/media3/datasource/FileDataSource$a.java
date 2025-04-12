/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.datasource;

import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.FileDataSource;

public final class FileDataSource$a
implements DataSource$Factory {
    public final DataSource a() {
        FileDataSource fileDataSource = new Yv(false);
        return fileDataSource;
    }
}

