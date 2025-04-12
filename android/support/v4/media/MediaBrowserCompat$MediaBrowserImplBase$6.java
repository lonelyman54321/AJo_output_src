/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$CustomActionCallback;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase;

class MediaBrowserCompat$MediaBrowserImplBase$6
implements Runnable {
    final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase this$0;
    final /* synthetic */ String val$action;
    final /* synthetic */ MediaBrowserCompat$CustomActionCallback val$callback;
    final /* synthetic */ Bundle val$extras;

    public MediaBrowserCompat$MediaBrowserImplBase$6(MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$CustomActionCallback mediaBrowserCompat$CustomActionCallback, String string2, Bundle bundle) {
        this.this$0 = mediaBrowserCompat$MediaBrowserImplBase;
        this.val$callback = mediaBrowserCompat$CustomActionCallback;
        this.val$action = string2;
        this.val$extras = bundle;
    }

    public void run() {
        MediaBrowserCompat$CustomActionCallback mediaBrowserCompat$CustomActionCallback = this.val$callback;
        String string2 = this.val$action;
        Bundle bundle = this.val$extras;
        mediaBrowserCompat$CustomActionCallback.onError(string2, bundle, null);
    }
}

