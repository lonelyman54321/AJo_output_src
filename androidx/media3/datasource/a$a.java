/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.media3.datasource;

import android.content.Context;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c$a;

public final class a$a
implements DataSource$Factory {
    public final Context a;
    public final DataSource$Factory b;

    public a$a(Context context, c$a c$a) {
        this.a = context = context.getApplicationContext();
        this.b = c$a;
    }

    public final DataSource a() {
        DataSource dataSource = this.b.a();
        Context context = this.a;
        a a2 = new a(context, dataSource);
        return a2;
    }
}

