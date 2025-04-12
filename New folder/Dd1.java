/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$Source
 *  android.net.Uri
 */
import android.content.ContentResolver;
import android.graphics.ImageDecoder;
import android.net.Uri;

public final class Dd1 {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source a(ContentResolver contentResolver, Uri uri) {
        return ImageDecoder.createSource((ContentResolver)contentResolver, (Uri)uri);
    }
}

