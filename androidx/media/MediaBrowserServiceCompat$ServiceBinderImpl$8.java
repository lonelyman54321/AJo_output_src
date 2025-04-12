/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$j;

class MediaBrowserServiceCompat$ServiceBinderImpl$8
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$i a;
    public final /* synthetic */ ResultReceiver b;
    public final /* synthetic */ MediaBrowserServiceCompat$h c;

    public MediaBrowserServiceCompat$ServiceBinderImpl$8(MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j, String string2, Bundle bundle, ResultReceiver resultReceiver) {
        this.c = mediaBrowserServiceCompat$h;
        this.a = mediaBrowserServiceCompat$j;
        this.b = resultReceiver;
    }

    public final void run() {
        Object object = ((MediaBrowserServiceCompat$j)this.a).a.getBinder();
        MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h = this.c;
        Jp jp = mediaBrowserServiceCompat$h.a.e;
        if ((object = (MediaBrowserServiceCompat$ConnectionRecord)jp.get(object)) == null) {
            return;
        }
        ((Object)((Object)mediaBrowserServiceCompat$h.a)).getClass();
        this.b.send(-1, null);
    }
}

