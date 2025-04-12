/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.browse.MediaBrowser$ConnectionCallback
 */
package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21;
import android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal;

public class MediaBrowserCompat$ConnectionCallback {
    final MediaBrowser.ConnectionCallback mConnectionCallbackFwk;
    MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal mConnectionCallbackInternal;

    public MediaBrowserCompat$ConnectionCallback() {
        MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21 mediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21 = new MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21(this);
        this.mConnectionCallbackFwk = mediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21;
    }

    public void onConnected() {
    }

    public void onConnectionFailed() {
    }

    public void onConnectionSuspended() {
    }

    public void setInternalConnectionCallback(MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal mediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal) {
        this.mConnectionCallbackInternal = mediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal;
    }
}

