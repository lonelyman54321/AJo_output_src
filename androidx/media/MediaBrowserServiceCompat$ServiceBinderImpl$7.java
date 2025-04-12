/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IBinder$DeathRecipient
 */
package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$j;

class MediaBrowserServiceCompat$ServiceBinderImpl$7
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$i a;
    public final /* synthetic */ MediaBrowserServiceCompat$h b;

    public MediaBrowserServiceCompat$ServiceBinderImpl$7(MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j) {
        this.b = mediaBrowserServiceCompat$h;
        this.a = mediaBrowserServiceCompat$j;
    }

    public final void run() {
        IBinder iBinder = ((MediaBrowserServiceCompat$j)this.a).a.getBinder();
        MediaBrowserServiceCompat$ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord = (MediaBrowserServiceCompat$ConnectionRecord)this.b.a.e.remove(iBinder);
        if (mediaBrowserServiceCompat$ConnectionRecord != null) {
            iBinder.unlinkToDeath((IBinder.DeathRecipient)mediaBrowserServiceCompat$ConnectionRecord, 0);
        }
    }
}

