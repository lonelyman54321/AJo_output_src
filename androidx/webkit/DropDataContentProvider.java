/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.ParcelFileDescriptor
 */
package androidx.webkit;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;

public final class DropDataContentProvider
extends ContentProvider {
    public DropDataContentProviderBoundaryInterface a;

    public final DropDataContentProviderBoundaryInterface a() {
        DropDataContentProviderBoundaryInterface dropDataContentProviderBoundaryInterface = this.a;
        if (dropDataContentProviderBoundaryInterface == null) {
            this.a = dropDataContentProviderBoundaryInterface = DF3$a.a.getDropDataProvider();
            dropDataContentProviderBoundaryInterface.onCreate();
        }
        return this.a;
    }

    public final Bundle call(String string2, String string3, Bundle bundle) {
        return this.a().call(string2, string3, bundle);
    }

    public final int delete(Uri object, String string2, String[] stringArray) {
        object = new UnsupportedOperationException("delete method is not supported.");
        throw object;
    }

    public final String getType(Uri uri) {
        return this.a().getType(uri);
    }

    public final Uri insert(Uri object, ContentValues contentValues) {
        object = new UnsupportedOperationException("Insert method is not supported.");
        throw object;
    }

    public final boolean onCreate() {
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String string2) {
        return this.a().openFile(this, uri);
    }

    public final Cursor query(Uri uri, String[] stringArray, String string2, String[] stringArray2, String string3) {
        return this.a().query(uri, stringArray, string2, stringArray2, string3);
    }

    public final int update(Uri object, ContentValues contentValues, String string2, String[] stringArray) {
        object = new UnsupportedOperationException("update method is not supported.");
        throw object;
    }
}

