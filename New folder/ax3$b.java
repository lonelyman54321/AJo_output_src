/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 */
import android.content.ContentResolver;
import android.net.Uri;

public final class ax3$b
implements CP1,
ax3$c {
    public final ContentResolver a;

    public ax3$b(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final ei0_0 a(Uri uri) {
        ContentResolver contentResolver = this.a;
        nl0_2 nl0_22 = new fw1(contentResolver, uri);
        return nl0_22;
    }

    public final BP1 c(OQ1 object) {
        object = new ax3(this);
        return object;
    }
}

