/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 */
import android.content.ContentResolver;
import android.net.Uri;

public final class ax3$a
implements CP1,
ax3$c {
    public final ContentResolver a;

    public ax3$a(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final ei0_0 a(Uri uri) {
        ContentResolver contentResolver = this.a;
        cq_1 cq_12 = new fw1(contentResolver, uri);
        return cq_12;
    }

    public final BP1 c(OQ1 object) {
        object = new ax3(this);
        return object;
    }
}

