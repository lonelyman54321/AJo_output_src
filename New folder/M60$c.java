/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

public final class M60$c
implements M60$b {
    public ClipData a;
    public int b;
    public int c;
    public Uri d;
    public Bundle e;

    public final void a(Uri uri) {
        this.d = uri;
    }

    public final M60 build() {
        M60$f m60$f = new M60$f(this);
        M60 m60 = new M60(m60$f);
        return m60;
    }

    public final void setExtras(Bundle bundle) {
        this.e = bundle;
    }

    public final void setFlags(int n3) {
        this.c = n3;
    }
}

