/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media;

import android.support.v4.media.MediaBrowserCompat$ItemCallback;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21;

class MediaBrowserCompat$MediaBrowserImplApi21$3
implements Runnable {
    final /* synthetic */ MediaBrowserCompat$MediaBrowserImplApi21 this$0;
    final /* synthetic */ MediaBrowserCompat$ItemCallback val$cb;
    final /* synthetic */ String val$mediaId;

    public MediaBrowserCompat$MediaBrowserImplApi21$3(MediaBrowserCompat$MediaBrowserImplApi21 mediaBrowserCompat$MediaBrowserImplApi21, MediaBrowserCompat$ItemCallback mediaBrowserCompat$ItemCallback, String string2) {
        this.this$0 = mediaBrowserCompat$MediaBrowserImplApi21;
        this.val$cb = mediaBrowserCompat$ItemCallback;
        this.val$mediaId = string2;
    }

    public void run() {
        MediaBrowserCompat$ItemCallback mediaBrowserCompat$ItemCallback = this.val$cb;
        String string2 = this.val$mediaId;
        mediaBrowserCompat$ItemCallback.onError(string2);
    }
}

