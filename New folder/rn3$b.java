/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.Cursor
 *  android.net.Uri
 *  android.provider.MediaStore$Video$Thumbnails
 */
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

public final class rn3$b
implements sn3 {
    public static final String[] b = new String[]{"_data"};
    public final ContentResolver a;

    public rn3$b(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final Cursor a(Uri object) {
        object = object.getLastPathSegment();
        Uri uri = MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI;
        String[] stringArray = b;
        String[] stringArray2 = new String[]{object};
        return this.a.query(uri, stringArray, "kind = 1 AND video_id = ?", stringArray2, null);
    }
}

