/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package android.support.v4.media.session;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback$Stub;
import android.support.v4.media.session.MediaControllerCompat$Callback;
import android.support.v4.media.session.MediaControllerCompat$PlaybackInfo;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.List;

class MediaControllerCompat$Callback$StubCompat
extends IMediaControllerCallback$Stub {
    private final WeakReference mCallback;

    public MediaControllerCompat$Callback$StubCompat(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
        WeakReference<MediaControllerCompat$Callback> weakReference;
        this.mCallback = weakReference = new WeakReference<MediaControllerCompat$Callback>(mediaControllerCompat$Callback);
    }

    public void onCaptioningEnabledChanged(boolean bl2) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            Boolean bl3 = bl2;
            int n3 = 11;
            mediaControllerCompat$Callback.postToHandler(n3, bl3, null);
        }
    }

    public void onEvent(String string2, Bundle bundle) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            int n3 = 1;
            mediaControllerCompat$Callback.postToHandler(n3, string2, bundle);
        }
    }

    public void onExtrasChanged(Bundle bundle) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            int n3 = 7;
            mediaControllerCompat$Callback.postToHandler(n3, bundle, null);
        }
    }

    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            int n3 = 3;
            mediaControllerCompat$Callback.postToHandler(n3, mediaMetadataCompat, null);
        }
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            int n3 = 2;
            mediaControllerCompat$Callback.postToHandler(n3, playbackStateCompat, null);
        }
    }

    public void onQueueChanged(List list) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            int n3 = 5;
            mediaControllerCompat$Callback.postToHandler(n3, list, null);
        }
    }

    public void onQueueTitleChanged(CharSequence charSequence) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            int n3 = 6;
            mediaControllerCompat$Callback.postToHandler(n3, charSequence, null);
        }
    }

    public void onRepeatModeChanged(int n3) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            Integer n4 = n3;
            int n7 = 9;
            mediaControllerCompat$Callback.postToHandler(n7, n4, null);
        }
    }

    public void onSessionDestroyed() {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            int n3 = 8;
            mediaControllerCompat$Callback.postToHandler(n3, null, null);
        }
    }

    public void onSessionReady() {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            int n3 = 13;
            mediaControllerCompat$Callback.postToHandler(n3, null, null);
        }
    }

    public void onShuffleModeChanged(int n3) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            Integer n4 = n3;
            int n7 = 12;
            mediaControllerCompat$Callback.postToHandler(n7, n4, null);
        }
    }

    public void onShuffleModeChangedRemoved(boolean bl2) {
    }

    public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
        MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)this.mCallback.get();
        if (mediaControllerCompat$Callback != null) {
            MediaControllerCompat$PlaybackInfo mediaControllerCompat$PlaybackInfo;
            if (parcelableVolumeInfo != null) {
                int n3 = parcelableVolumeInfo.volumeType;
                int n4 = parcelableVolumeInfo.audioStream;
                int n7 = parcelableVolumeInfo.controlType;
                int n8 = parcelableVolumeInfo.maxVolume;
                int n10 = parcelableVolumeInfo.currentVolume;
                mediaControllerCompat$PlaybackInfo = new MediaControllerCompat$PlaybackInfo(n3, n4, n7, n8, n10);
            } else {
                mediaControllerCompat$PlaybackInfo = null;
            }
            int n14 = 4;
            mediaControllerCompat$Callback.postToHandler(n14, mediaControllerCompat$PlaybackInfo, null);
        }
    }
}

