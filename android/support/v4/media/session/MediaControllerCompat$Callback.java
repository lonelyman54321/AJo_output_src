/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.session.MediaController$Callback
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder$DeathRecipient
 *  android.os.Looper
 *  android.os.Message
 */
package android.support.v4.media.session;

import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaControllerCompat$Callback$MediaControllerCallbackApi21;
import android.support.v4.media.session.MediaControllerCompat$Callback$MessageHandler;
import android.support.v4.media.session.MediaControllerCompat$PlaybackInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;

public abstract class MediaControllerCompat$Callback
implements IBinder.DeathRecipient {
    final MediaController.Callback mCallbackFwk;
    MediaControllerCompat$Callback$MessageHandler mHandler;
    IMediaControllerCallback mIControllerCallback;

    public MediaControllerCompat$Callback() {
        MediaControllerCompat$Callback$MediaControllerCallbackApi21 mediaControllerCompat$Callback$MediaControllerCallbackApi21 = new MediaControllerCompat$Callback$MediaControllerCallbackApi21(this);
        this.mCallbackFwk = mediaControllerCompat$Callback$MediaControllerCallbackApi21;
    }

    public void binderDied() {
        this.postToHandler(8, null, null);
    }

    public IMediaControllerCallback getIControllerCallback() {
        return this.mIControllerCallback;
    }

    public void onAudioInfoChanged(MediaControllerCompat$PlaybackInfo mediaControllerCompat$PlaybackInfo) {
    }

    public void onCaptioningEnabledChanged(boolean bl2) {
    }

    public void onExtrasChanged(Bundle bundle) {
    }

    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
    }

    public void onQueueChanged(List list) {
    }

    public void onQueueTitleChanged(CharSequence charSequence) {
    }

    public void onRepeatModeChanged(int n3) {
    }

    public void onSessionDestroyed() {
    }

    public void onSessionEvent(String string2, Bundle bundle) {
    }

    public void onSessionReady() {
    }

    public void onShuffleModeChanged(int n3) {
    }

    public void postToHandler(int n3, Object object, Bundle bundle) {
        MediaControllerCompat$Callback$MessageHandler mediaControllerCompat$Callback$MessageHandler = this.mHandler;
        if (mediaControllerCompat$Callback$MessageHandler != null) {
            Message message = mediaControllerCompat$Callback$MessageHandler.obtainMessage(n3, object);
            message.setData(bundle);
            message.sendToTarget();
        }
    }

    public void setHandler(Handler handler) {
        if (handler == null) {
            handler = this.mHandler;
            if (handler != null) {
                handler.mRegistered = false;
                Object var2_2 = null;
                handler.removeCallbacksAndMessages(null);
                this.mHandler = null;
            }
        } else {
            boolean bl2;
            MediaControllerCompat$Callback$MessageHandler mediaControllerCompat$Callback$MessageHandler;
            handler = handler.getLooper();
            this.mHandler = mediaControllerCompat$Callback$MessageHandler = new MediaControllerCompat$Callback$MessageHandler(this, (Looper)handler);
            mediaControllerCompat$Callback$MessageHandler.mRegistered = bl2 = true;
        }
    }
}

