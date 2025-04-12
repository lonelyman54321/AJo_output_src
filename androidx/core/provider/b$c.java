/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProviderClient
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.RemoteException
 */
package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import androidx.core.provider.b$a;

public final class b$c
implements b$a {
    public final ContentProviderClient a;

    public b$c(Context context, Uri uri) {
        context = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        this.a = context;
    }

    public final Cursor a(Uri uri, String[] stringArray, String[] stringArray2) {
        String string2 = "query = ?";
        ContentProviderClient contentProviderClient = this.a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, stringArray, string2, stringArray2, null, null);
        }
        catch (RemoteException remoteException) {
            return null;
        }
    }

    public final void close() {
        ContentProviderClient contentProviderClient = this.a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }
}

