/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase;
import android.support.v4.media.MediaBrowserCompat$SearchCallback;

class MediaBrowserCompat$MediaBrowserImplBase$5
implements Runnable {
    final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase this$0;
    final /* synthetic */ MediaBrowserCompat$SearchCallback val$callback;
    final /* synthetic */ Bundle val$extras;
    final /* synthetic */ String val$query;

    public MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback mediaBrowserCompat$SearchCallback, String string2, Bundle bundle) {
        this.this$0 = mediaBrowserCompat$MediaBrowserImplBase;
        this.val$callback = mediaBrowserCompat$SearchCallback;
        this.val$query = string2;
        this.val$extras = bundle;
    }

    public void run() {
        MediaBrowserCompat$SearchCallback mediaBrowserCompat$SearchCallback = this.val$callback;
        String string2 = this.val$query;
        Bundle bundle = this.val$extras;
        mediaBrowserCompat$SearchCallback.onError(string2, bundle);
    }
}

