/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.ContentInfo
 *  android.view.ContentInfo$Builder
 */
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

public final class M60$a
implements M60$b {
    public final ContentInfo.Builder a;

    public M60$a(ClipData clipData, int n3) {
        clipData = L60.a(clipData, n3);
        this.a = clipData;
    }

    public final void a(Uri uri) {
        J60.b(this.a, uri);
    }

    public final M60 build() {
        ContentInfo contentInfo = H60.b(this.a);
        M60$d m60$d = new M60$d(contentInfo);
        M60 m60 = new M60(m60$d);
        return m60;
    }

    public final void setExtras(Bundle bundle) {
        K60.b(this.a, bundle);
    }

    public final void setFlags(int n3) {
        I60.b(this.a, n3);
    }
}

