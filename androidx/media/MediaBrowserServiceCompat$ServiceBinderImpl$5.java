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

class MediaBrowserServiceCompat$ServiceBinderImpl$5
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$i a;
    public final /* synthetic */ ResultReceiver b;
    public final /* synthetic */ MediaBrowserServiceCompat$h c;

    public MediaBrowserServiceCompat$ServiceBinderImpl$5(MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j, String string2, ResultReceiver resultReceiver) {
        this.c = mediaBrowserServiceCompat$h;
        this.a = mediaBrowserServiceCompat$j;
        this.b = resultReceiver;
    }

    public final void run() {
        Object object = ((MediaBrowserServiceCompat$j)this.a).a.getBinder();
        Object object2 = this.c;
        Jp jp = ((MediaBrowserServiceCompat$h)object2).a.e;
        if ((object = (MediaBrowserServiceCompat$ConnectionRecord)jp.get(object)) == null) {
            return;
        }
        object = ((MediaBrowserServiceCompat$h)object2).a;
        object.getClass();
        int n3 = 2;
        n3 &= n3;
        object2 = this.b;
        jp = null;
        if (n3 != 0) {
            n3 = -1;
            ((ResultReceiver)object2).send(n3, null);
        } else {
            object = new Bundle();
            String string2 = "media_item";
            object.putParcelable(string2, null);
            jp = null;
            ((ResultReceiver)object2).send(0, (Bundle)object);
        }
    }
}

