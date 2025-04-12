/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 */
package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class MediaBrowserServiceCompat$ServiceBinderImpl$4
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$i a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ MediaBrowserServiceCompat$h d;

    public MediaBrowserServiceCompat$ServiceBinderImpl$4(MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j, String string2, IBinder iBinder) {
        this.d = mediaBrowserServiceCompat$h;
        this.a = mediaBrowserServiceCompat$j;
        this.b = string2;
        this.c = iBinder;
    }

    public final void run() {
        Object object = ((MediaBrowserServiceCompat$j)this.a).a.getBinder();
        Object object2 = this.d;
        Jp jp = ((MediaBrowserServiceCompat$h)object2).a.e;
        if ((object = (MediaBrowserServiceCompat$ConnectionRecord)jp.get(object)) == null) {
            return;
        }
        ((Object)((Object)((MediaBrowserServiceCompat$h)object2).a)).getClass();
        object = ((MediaBrowserServiceCompat$ConnectionRecord)object).e;
        object2 = this.b;
        jp = this.c;
        if (jp == null) {
            ((HashMap)object).remove(object2);
        } else {
            List list = (List)((HashMap)object).get(object2);
            if (list != null) {
                boolean bl2;
                Iterator iterator = list.iterator();
                while (bl2 = iterator.hasNext()) {
                    Object object3 = ((lm2)iterator.next()).a;
                    if (jp != object3) continue;
                    iterator.remove();
                }
                int n3 = list.size();
                if (n3 == 0) {
                    ((HashMap)object).remove(object2);
                }
            }
        }
    }
}

