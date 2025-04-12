/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipDescription
 *  android.net.Uri
 *  android.view.inputmethod.InputContentInfo
 */
import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class Lh1$a
implements Lh1$c {
    public final InputContentInfo a;

    public Lh1$a(Uri uri, ClipDescription clipDescription, Uri uri2) {
        InputContentInfo inputContentInfo;
        this.a = inputContentInfo = new InputContentInfo(uri, clipDescription, uri2);
    }

    public Lh1$a(Object object) {
        object = (InputContentInfo)object;
        this.a = object;
    }

    public final Object a() {
        return this.a;
    }

    public final Uri b() {
        return this.a.getContentUri();
    }

    public final void c() {
        this.a.requestPermission();
    }

    public final Uri d() {
        return this.a.getLinkUri();
    }

    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }
}

