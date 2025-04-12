/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 */
import android.content.ContentResolver;
import android.net.Uri;

public final class ax3$d
implements CP1,
ax3$c {
    public final ContentResolver a;

    public ax3$d(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final ei0_0 a(Uri uri) {
        ContentResolver contentResolver = this.a;
        xd3_0 xd3_02 = new fw1(contentResolver, uri);
        return xd3_02;
    }

    public final BP1 c(OQ1 object) {
        object = new ax3(this);
        return object;
    }
}

