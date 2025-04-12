/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.provider.MediaStore
 */
import android.net.Uri;
import android.provider.MediaStore;

public final class nC2 {
    public static /* bridge */ /* synthetic */ Uri a(Uri uri) {
        return MediaStore.setRequireOriginal((Uri)uri);
    }
}

