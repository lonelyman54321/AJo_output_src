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
import java.util.Objects;

class MediaBrowserServiceCompat$ServiceBinderImpl$9
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$i a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ ResultReceiver c;
    public final /* synthetic */ MediaBrowserServiceCompat$h d;

    public MediaBrowserServiceCompat$ServiceBinderImpl$9(MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j, String string2, Bundle bundle, ResultReceiver resultReceiver) {
        this.d = mediaBrowserServiceCompat$h;
        this.a = mediaBrowserServiceCompat$j;
        this.b = bundle;
        this.c = resultReceiver;
    }

    public final void run() {
        Object object = ((MediaBrowserServiceCompat$j)this.a).a.getBinder();
        MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h = this.d;
        Jp jp = mediaBrowserServiceCompat$h.a.e;
        if ((object = (MediaBrowserServiceCompat$ConnectionRecord)jp.get(object)) == null) {
            Objects.toString(this.b);
            return;
        }
        ((Object)((Object)mediaBrowserServiceCompat$h.a)).getClass();
        this.c.send(-1, null);
    }
}

