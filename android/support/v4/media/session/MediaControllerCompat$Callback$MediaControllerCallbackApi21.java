/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaMetadata
 *  android.media.session.MediaController$Callback
 *  android.media.session.MediaController$PlaybackInfo
 *  android.media.session.PlaybackState
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaControllerCompat$Callback;
import android.support.v4.media.session.MediaControllerCompat$PlaybackInfo;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

class MediaControllerCompat$Callback$MediaControllerCallbackApi21
extends MediaController.Callback {
    private final WeakReference mCallback;

    public MediaControllerCompat$Callback$MediaControllerCallbackApi21(MediaControllerCompat$Callback callback2) {
        WeakReference<MediaControllerCompat$Callback> weakReference;
        this.mCallback = weakReference = new WeakReference<MediaControllerCompat$Callback>(callback2);
    }

    public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            int n3 = playbackInfo.getPlaybackType();
            AudioAttributesCompat audioAttributesCompat = AudioAttributesCompat.c(playbackInfo.getAudioAttributes());
            int n4 = playbackInfo.getVolumeControl();
            int n7 = playbackInfo.getMaxVolume();
            int n8 = playbackInfo.getCurrentVolume();
            MediaControllerCompat$PlaybackInfo mediaControllerCompat$PlaybackInfo = new MediaControllerCompat$PlaybackInfo(n3, audioAttributesCompat, n4, n7, n8);
            mediaControllerCompat$Callback.onAudioInfoChanged(mediaControllerCompat$PlaybackInfo);
        }
    }

    public void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.ensureClassLoader(bundle);
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            mediaControllerCompat$Callback.onExtrasChanged(bundle);
        }
    }

    public void onMetadataChanged(MediaMetadata object) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            object = MediaMetadataCompat.fromMediaMetadata(object);
            mediaControllerCompat$Callback.onMetadataChanged((MediaMetadataCompat)object);
        }
    }

    public void onPlaybackStateChanged(PlaybackState object) {
        IMediaControllerCallback iMediaControllerCallback;
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null && (iMediaControllerCallback = mediaControllerCompat$Callback.mIControllerCallback) == null) {
            object = PlaybackStateCompat.fromPlaybackState(object);
            mediaControllerCompat$Callback.onPlaybackStateChanged((PlaybackStateCompat)object);
        }
    }

    public void onQueueChanged(List list) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            list = MediaSessionCompat$QueueItem.fromQueueItemList(list);
            mediaControllerCompat$Callback.onQueueChanged(list);
        }
    }

    public void onQueueTitleChanged(CharSequence charSequence) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            mediaControllerCompat$Callback.onQueueTitleChanged(charSequence);
        }
    }

    public void onSessionDestroyed() {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            mediaControllerCompat$Callback.onSessionDestroyed();
        }
    }

    public void onSessionEvent(String string2, Bundle bundle) {
        int n3;
        int n4;
        IMediaControllerCallback iMediaControllerCallback;
        MediaSessionCompat.ensureClassLoader(bundle);
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null && ((iMediaControllerCallback = mediaControllerCompat$Callback.mIControllerCallback) == null || (n4 = Build.VERSION.SDK_INT) >= (n3 = 23))) {
            mediaControllerCompat$Callback.onSessionEvent(string2, bundle);
        }
    }
}

