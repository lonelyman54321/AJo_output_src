/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.browse.MediaBrowser$ItemCallback
 *  android.os.Build$VERSION
 */
package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat$ItemCallback$ItemCallbackApi23;
import android.support.v4.media.MediaBrowserCompat$MediaItem;

public abstract class MediaBrowserCompat$ItemCallback {
    final MediaBrowser.ItemCallback mItemCallbackFwk;

    public MediaBrowserCompat$ItemCallback() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            MediaBrowserCompat$ItemCallback$ItemCallbackApi23 mediaBrowserCompat$ItemCallback$ItemCallbackApi23 = new MediaBrowserCompat$ItemCallback$ItemCallbackApi23(this);
            this.mItemCallbackFwk = mediaBrowserCompat$ItemCallback$ItemCallbackApi23;
        } else {
            n3 = 0;
            Object var3_4 = null;
            this.mItemCallbackFwk = null;
        }
    }

    public void onError(String string2) {
    }

    public void onItemLoaded(MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
    }
}

