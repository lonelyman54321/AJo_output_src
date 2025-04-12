/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder$DeathRecipient
 */
package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$j;

class MediaBrowserServiceCompat$ServiceBinderImpl$2
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$i a;
    public final /* synthetic */ MediaBrowserServiceCompat$h b;

    public MediaBrowserServiceCompat$ServiceBinderImpl$2(MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j) {
        this.b = mediaBrowserServiceCompat$h;
        this.a = mediaBrowserServiceCompat$j;
    }

    public final void run() {
        Object object = ((MediaBrowserServiceCompat$j)this.a).a.getBinder();
        Jp jp = this.b.a.e;
        if ((object = (MediaBrowserServiceCompat$ConnectionRecord)jp.remove(object)) != null) {
            jp = ((MediaBrowserServiceCompat$j)object.d).a.getBinder();
            jp.unlinkToDeath((IBinder.DeathRecipient)object, 0);
        }
    }
}

