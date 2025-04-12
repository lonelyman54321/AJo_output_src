/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package androidx.media;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$j;

class MediaBrowserServiceCompat$ServiceBinderImpl$1
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$i a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ MediaBrowserServiceCompat$h e;

    public MediaBrowserServiceCompat$ServiceBinderImpl$1(int n3, int n4, Bundle bundle, MediaBrowserServiceCompat$h h3, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j, String string2) {
        this.e = h3;
        this.a = mediaBrowserServiceCompat$j;
        this.b = string2;
        this.c = n3;
        this.d = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        int n3;
        MediaBrowserServiceCompat$i mediaBrowserServiceCompat$i = this.a;
        Object object = mediaBrowserServiceCompat$i;
        object = ((MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i).a.getBinder();
        MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h = this.e;
        Jp jp = mediaBrowserServiceCompat$h.a.e;
        jp.remove(object);
        int n4 = this.d;
        MediaBrowserServiceCompat$i mediaBrowserServiceCompat$i2 = mediaBrowserServiceCompat$i;
        mediaBrowserServiceCompat$i2 = (MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = mediaBrowserServiceCompat$h.a;
        String string2 = this.b;
        int n7 = this.c;
        MediaBrowserServiceCompat$ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord = new MediaBrowserServiceCompat$ConnectionRecord(mediaBrowserServiceCompat, string2, n7, n4, (MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i2);
        object = mediaBrowserServiceCompat$h.a;
        object.getClass();
        ((MediaBrowserServiceCompat)((Object)object)).a();
        object.getClass();
        try {
            mediaBrowserServiceCompat$i = (MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i;
            n3 = 2;
            mediaBrowserServiceCompat$h = null;
        }
        catch (RemoteException remoteException) {
            return;
        }
        ((MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i).a(n3, null);
    }
}

