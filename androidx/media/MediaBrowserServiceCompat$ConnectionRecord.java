/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.IBinder$DeathRecipient
 *  android.text.TextUtils
 */
package androidx.media;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord$1;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$j;
import androidx.media.MediaBrowserServiceCompat$k;
import java.util.HashMap;

public final class MediaBrowserServiceCompat$ConnectionRecord
implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final MediaBrowserServiceCompat$i d;
    public final HashMap e;
    public final /* synthetic */ MediaBrowserServiceCompat f;

    public MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat object, String string2, int n3, int n4, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j) {
        this.f = object;
        this.e = object;
        this.a = string2;
        this.b = n3;
        this.c = n4;
        if (string2 != null) {
            int n7 = TextUtils.isEmpty((CharSequence)string2);
            if (n7 == 0) {
                n7 = Build.VERSION.SDK_INT;
                int n8 = 28;
                if (n7 >= n8) {
                    jN1.a(n3, n4, string2);
                }
                this.d = mediaBrowserServiceCompat$j;
                return;
            }
            super("packageName should be nonempty");
            throw object;
        }
        super("package shouldn't be null");
        throw object;
    }

    public final void binderDied() {
        MediaBrowserServiceCompat$k mediaBrowserServiceCompat$k = this.f.f;
        MediaBrowserServiceCompat$ConnectionRecord$1 mediaBrowserServiceCompat$ConnectionRecord$1 = new MediaBrowserServiceCompat$ConnectionRecord$1(this);
        mediaBrowserServiceCompat$k.post(mediaBrowserServiceCompat$ConnectionRecord$1);
    }
}

