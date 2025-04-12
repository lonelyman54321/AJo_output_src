/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 */
package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaBrowserCompat$SearchCallback;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserCompat$SearchResultReceiver
extends ResultReceiver {
    private final MediaBrowserCompat$SearchCallback mCallback;
    private final Bundle mExtras;
    private final String mQuery;

    public MediaBrowserCompat$SearchResultReceiver(String string2, Bundle bundle, MediaBrowserCompat$SearchCallback mediaBrowserCompat$SearchCallback, Handler handler) {
        super(handler);
        this.mQuery = string2;
        this.mExtras = bundle;
        this.mCallback = mediaBrowserCompat$SearchCallback;
    }

    public void onReceiveResult(int n3, Bundle object) {
        Object object2;
        int n4;
        if (object != null) {
            object = MediaSessionCompat.unparcelWithClassLoader((Bundle)object);
        }
        if (n3 == 0 && object != null && (n4 = object.containsKey((String)(object2 = "search_results"))) != 0) {
            if ((object2 = object.getParcelableArray((String)object2)) != null) {
                n4 = ((Parcelable[])object2).length;
                object = new ArrayList(n4);
                n4 = ((Parcelable[])object2).length;
                Bundle bundle = null;
                for (int i3 = 0; i3 < n4; ++i3) {
                    MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem)object2[i3];
                    ((ArrayList)object).add(mediaBrowserCompat$MediaItem);
                }
                object2 = this.mCallback;
                String string2 = this.mQuery;
                bundle = this.mExtras;
                ((MediaBrowserCompat$SearchCallback)object2).onSearchResult(string2, bundle, (List)object);
            } else {
                object2 = this.mCallback;
                object = this.mQuery;
                Bundle bundle = this.mExtras;
                ((MediaBrowserCompat$SearchCallback)object2).onError((String)object, bundle);
            }
            return;
        }
        object2 = this.mCallback;
        object = this.mQuery;
        Bundle bundle = this.mExtras;
        ((MediaBrowserCompat$SearchCallback)object2).onError((String)object, bundle);
    }
}

