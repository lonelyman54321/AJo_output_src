/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.RemoteControlClient$OnPlaybackPositionUpdateListener
 */
package android.support.v4.media.session;

import android.media.RemoteControlClient;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18;

class MediaSessionCompat$MediaSessionImplApi18$1
implements RemoteControlClient.OnPlaybackPositionUpdateListener {
    final /* synthetic */ MediaSessionCompat$MediaSessionImplApi18 this$0;

    public MediaSessionCompat$MediaSessionImplApi18$1(MediaSessionCompat$MediaSessionImplApi18 mediaSessionImplApi18) {
        this.this$0 = mediaSessionImplApi18;
    }

    public void onPlaybackPositionUpdate(long l2) {
        MediaSessionCompat$MediaSessionImplApi18 mediaSessionCompat$MediaSessionImplApi18 = this.this$0;
        Long l3 = l2;
        mediaSessionCompat$MediaSessionImplApi18.postToHandler(18, -1, -1, l3, null);
    }
}

