/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 */
package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$i;
import androidx.media.MediaBrowserServiceCompat$j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MediaBrowserServiceCompat$ServiceBinderImpl$3
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$i a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ MediaBrowserServiceCompat$h e;

    public MediaBrowserServiceCompat$ServiceBinderImpl$3(MediaBrowserServiceCompat$h mediaBrowserServiceCompat$h, MediaBrowserServiceCompat$j mediaBrowserServiceCompat$j, String string2, IBinder iBinder, Bundle bundle) {
        this.e = mediaBrowserServiceCompat$h;
        this.a = mediaBrowserServiceCompat$j;
        this.b = string2;
        this.c = iBinder;
        this.d = bundle;
    }

    public final void run() {
        Bundle bundle;
        IBinder iBinder;
        Object object;
        ArrayList<Object> arrayList;
        String string2;
        Map map2;
        Object object2;
        Object object3;
        block3: {
            boolean bl2;
            lm2 lm22;
            Object object4;
            object3 = ((MediaBrowserServiceCompat$j)this.a).a.getBinder();
            object2 = this.e;
            map2 = ((MediaBrowserServiceCompat$h)object2).a.e;
            if ((object3 = (MediaBrowserServiceCompat$ConnectionRecord)((a53)((Object)map2)).get(object3)) == null) {
                return;
            }
            object2 = ((MediaBrowserServiceCompat$h)object2).a;
            object2.getClass();
            map2 = object3.e;
            string2 = this.b;
            arrayList = (ArrayList<Object>)((HashMap)map2).get(string2);
            if (arrayList == null) {
                arrayList = new ArrayList<Object>();
            }
            object = arrayList.iterator();
            do {
                bl2 = object.hasNext();
                iBinder = this.c;
                bundle = this.d;
                if (!bl2) break block3;
                lm22 = (lm2)object.next();
            } while (iBinder != (object4 = lm22.a) || !(bl2 = AL1.a(bundle, (Bundle)(lm22 = (Bundle)lm22.b))));
            return;
        }
        object = new lm2(iBinder, bundle);
        arrayList.add(object);
        ((HashMap)map2).put(string2, arrayList);
        ((MediaBrowserServiceCompat)((Object)object2)).c(string2, (MediaBrowserServiceCompat$ConnectionRecord)object3, bundle);
        throw null;
    }
}

