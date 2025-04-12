/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.browse.MediaBrowser$MediaItem
 *  android.os.Parcel
 *  android.service.media.MediaBrowserService$Result
 */
package androidx.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

public final class MediaBrowserServiceCompat$g {
    public final MediaBrowserService.Result a;

    public MediaBrowserServiceCompat$g(MediaBrowserService.Result result2) {
        this.a = result2;
    }

    public final void a(Object iterator) {
        int n3 = iterator instanceof List;
        ArrayList<MediaBrowser.MediaItem> arrayList = null;
        MediaBrowserService.Result result2 = this.a;
        if (n3 != 0) {
            if ((iterator = (List)((Object)iterator)) != null) {
                n3 = iterator.size();
                arrayList = new ArrayList<MediaBrowser.MediaItem>(n3);
                iterator = iterator.iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    Parcel parcel = (Parcel)iterator.next();
                    parcel.setDataPosition(0);
                    MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel);
                    arrayList.add(mediaItem);
                    parcel.recycle();
                }
            }
            result2.sendResult((Object)arrayList);
        } else {
            n3 = iterator instanceof Parcel;
            if (n3 != 0) {
                iterator = (Parcel)iterator;
                iterator.setDataPosition(0);
                Object object = MediaBrowser.MediaItem.CREATOR.createFromParcel((Parcel)iterator);
                result2.sendResult(object);
                iterator.recycle();
            } else {
                result2.sendResult(null);
            }
        }
    }
}

