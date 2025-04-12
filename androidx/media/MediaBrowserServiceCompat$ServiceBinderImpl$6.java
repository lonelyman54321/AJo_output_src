/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package androidx.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$j;
import java.util.Iterator;

class MediaBrowserServiceCompat$ServiceBinderImpl$6
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$i a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ MediaBrowserServiceCompat$h e;

    public MediaBrowserServiceCompat$ServiceBinderImpl$6(int n3, int n4, Bundle bundle, MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j, String string2) {
        this.e = mediaBrowserServiceCompat$h;
        this.a = mediaBrowserServiceCompat$j;
        this.b = n3;
        this.c = string2;
        this.d = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        int n3;
        Object object;
        MediaBrowserServiceCompat$ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord;
        MediaBrowserServiceCompat mediaBrowserServiceCompat;
        MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h;
        MediaBrowserServiceCompat$i mediaBrowserServiceCompat$i;
        MediaBrowserServiceCompat$i mediaBrowserServiceCompat$i2;
        block6: {
            int n4;
            MediaBrowserServiceCompat$ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord2;
            int n7;
            mediaBrowserServiceCompat$i = mediaBrowserServiceCompat$i2 = this.a;
            mediaBrowserServiceCompat$i = ((MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i2).a.getBinder();
            mediaBrowserServiceCompat$h = this.e;
            mediaBrowserServiceCompat$h.a.e.remove(mediaBrowserServiceCompat$i);
            mediaBrowserServiceCompat = mediaBrowserServiceCompat$h.a;
            Iterator iterator = mediaBrowserServiceCompat.d.iterator();
            do {
                boolean bl2 = iterator.hasNext();
                mediaBrowserServiceCompat$ConnectionRecord = null;
                if (!bl2) break block6;
                mediaBrowserServiceCompat$ConnectionRecord2 = (MediaBrowserServiceCompat$ConnectionRecord)iterator.next();
            } while ((n7 = mediaBrowserServiceCompat$ConnectionRecord2.c) != (n4 = this.b));
            object = this.c;
            n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n7 != 0 || (n7 = this.d) <= 0) {
                int n8 = mediaBrowserServiceCompat$ConnectionRecord2.c;
                MediaBrowserServiceCompat$i mediaBrowserServiceCompat$i3 = mediaBrowserServiceCompat$i2;
                mediaBrowserServiceCompat$i3 = (MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i2;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = mediaBrowserServiceCompat$h.a;
                String string2 = mediaBrowserServiceCompat$ConnectionRecord2.a;
                n3 = mediaBrowserServiceCompat$ConnectionRecord2.b;
                MediaBrowserServiceCompat$ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord3 = mediaBrowserServiceCompat$ConnectionRecord;
                mediaBrowserServiceCompat$ConnectionRecord = new MediaBrowserServiceCompat$ConnectionRecord(mediaBrowserServiceCompat2, string2, n3, n8, (MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i3);
            }
            iterator.remove();
        }
        if (mediaBrowserServiceCompat$ConnectionRecord == null) {
            n3 = this.b;
            MediaBrowserServiceCompat$i mediaBrowserServiceCompat$i4 = mediaBrowserServiceCompat$i2;
            mediaBrowserServiceCompat$i4 = (MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i2;
            MediaBrowserServiceCompat mediaBrowserServiceCompat3 = mediaBrowserServiceCompat$h.a;
            String string3 = this.c;
            int n10 = this.d;
            object = mediaBrowserServiceCompat$ConnectionRecord;
            mediaBrowserServiceCompat$ConnectionRecord = new MediaBrowserServiceCompat$ConnectionRecord(mediaBrowserServiceCompat3, string3, n10, n3, (MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$i4);
        }
        mediaBrowserServiceCompat.e.put(mediaBrowserServiceCompat$i, mediaBrowserServiceCompat$ConnectionRecord);
        mediaBrowserServiceCompat$i2 = null;
        try {
            mediaBrowserServiceCompat$i.linkToDeath(mediaBrowserServiceCompat$ConnectionRecord, 0);
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }
}

