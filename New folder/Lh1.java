/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipDescription
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

public final class Lh1 {
    public final Lh1$c a;

    public Lh1(Lh1$a lh1$a) {
        this.a = lh1$a;
    }

    public Lh1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 25;
        if (n3 >= n4) {
            Lh1$a lh1$a = new Lh1$a(uri, clipDescription, uri2);
            this.a = lh1$a;
        } else {
            Lh1$b lh1$b = new Lh1$b(uri, clipDescription, uri2);
            this.a = lh1$b;
        }
    }
}

