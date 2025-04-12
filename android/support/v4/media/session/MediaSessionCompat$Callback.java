/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.media.session.MediaSession$Callback
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.ResultReceiver
 *  android.view.KeyEvent
 *  android.view.ViewConfiguration
 */
package android.support.v4.media.session;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Callback$CallbackHandler;
import android.support.v4.media.session.MediaSessionCompat$Callback$MediaSessionCallbackApi21;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class MediaSessionCompat$Callback {
    final MediaSession.Callback mCallbackFwk;
    MediaSessionCompat$Callback$CallbackHandler mCallbackHandler;
    final Object mLock;
    private boolean mMediaPlayPausePendingOnHandler;
    WeakReference mSessionImpl;

    public MediaSessionCompat$Callback() {
        Object object;
        this.mLock = object = new Object();
        object = new MediaSessionCompat$Callback$MediaSessionCallbackApi21(this);
        this.mCallbackFwk = object;
        object = new WeakReference(null);
        this.mSessionImpl = object;
    }

    public void handleMediaPlayPauseIfPendingOnHandler(MediaSessionCompat$MediaSessionImpl object, Handler handler) {
        int n3;
        int n4;
        boolean bl2 = this.mMediaPlayPausePendingOnHandler;
        if (!bl2) {
            return;
        }
        bl2 = false;
        this.mMediaPlayPausePendingOnHandler = false;
        int n7 = 1;
        handler.removeMessages(n7);
        object = object.getPlaybackState();
        long l2 = 0L;
        long l3 = object == null ? l2 : ((PlaybackStateCompat)object).getActions();
        if (object != null && (n4 = ((PlaybackStateCompat)object).getState()) == (n3 = 3)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        long l4 = 0x204L & l3;
        n3 = (int)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1));
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            handler = null;
        }
        l4 = 514L;
        long l7 = (l3 &= l4) - l2;
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (l8 != false) {
            bl2 = true;
        }
        if (n4 != 0 && bl2) {
            this.onPause();
        } else if (n4 == 0 && n3 != 0) {
            this.onPlay();
        }
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int n3) {
    }

    public void onCommand(String string2, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void onCustomAction(String string2, Bundle bundle) {
    }

    public void onFastForward() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onMediaButtonEvent(Intent object) {
        int n3;
        MediaSessionCompat$Callback$CallbackHandler mediaSessionCompat$Callback$CallbackHandler;
        Object object2;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 27;
        if (n4 >= n7) {
            return false;
        }
        Object object3 = this.mLock;
        synchronized (object3) {
            object2 = this.mSessionImpl;
            object2 = ((Reference)object2).get();
            object2 = (MediaSessionCompat$MediaSessionImpl)object2;
            mediaSessionCompat$Callback$CallbackHandler = this.mCallbackHandler;
        }
        if (object2 == null) return false;
        if (mediaSessionCompat$Callback$CallbackHandler == null) {
            return false;
        }
        object3 = "android.intent.extra.KEY_EVENT";
        if ((object = (KeyEvent)object.getParcelableExtra((String)object3)) == null) return false;
        n4 = object.getAction();
        if (n4 != 0) {
            return false;
        }
        object3 = object2.getCurrentControllerInfo();
        int n8 = object.getKeyCode();
        if (n8 != (n3 = 79) && n8 != (n3 = 85)) {
            this.handleMediaPlayPauseIfPendingOnHandler((MediaSessionCompat$MediaSessionImpl)object2, mediaSessionCompat$Callback$CallbackHandler);
            return false;
        }
        int n10 = object.getRepeatCount();
        n8 = 1;
        if (n10 != 0) {
            this.handleMediaPlayPauseIfPendingOnHandler((MediaSessionCompat$MediaSessionImpl)object2, mediaSessionCompat$Callback$CallbackHandler);
            return n8 != 0;
        }
        n10 = (int)(this.mMediaPlayPausePendingOnHandler ? 1 : 0);
        if (n10 == 0) {
            this.mMediaPlayPausePendingOnHandler = n8;
            object = mediaSessionCompat$Callback$CallbackHandler.obtainMessage(n8, object3);
            n4 = ViewConfiguration.getDoubleTapTimeout();
            long l2 = n4;
            mediaSessionCompat$Callback$CallbackHandler.sendMessageDelayed((Message)object, l2);
            return n8 != 0;
        }
        mediaSessionCompat$Callback$CallbackHandler.removeMessages(n8);
        this.mMediaPlayPausePendingOnHandler = false;
        object = object2.getPlaybackState();
        long l3 = 0L;
        long l4 = object == null ? l3 : ((PlaybackStateCompat)object).getActions();
        long l7 = 32;
        long l8 = (l4 &= l7) - l3;
        n10 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
        if (n10 == 0) return n8 != 0;
        this.onSkipToNext();
        return n8 != 0;
    }

    public void onPause() {
    }

    public void onPlay() {
    }

    public void onPlayFromMediaId(String string2, Bundle bundle) {
    }

    public void onPlayFromSearch(String string2, Bundle bundle) {
    }

    public void onPlayFromUri(Uri uri, Bundle bundle) {
    }

    public void onPrepare() {
    }

    public void onPrepareFromMediaId(String string2, Bundle bundle) {
    }

    public void onPrepareFromSearch(String string2, Bundle bundle) {
    }

    public void onPrepareFromUri(Uri uri, Bundle bundle) {
    }

    public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void onRemoveQueueItemAt(int n3) {
    }

    public void onRewind() {
    }

    public void onSeekTo(long l2) {
    }

    public void onSetCaptioningEnabled(boolean bl2) {
    }

    public void onSetPlaybackSpeed(float f5) {
    }

    public void onSetRating(RatingCompat ratingCompat) {
    }

    public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
    }

    public void onSetRepeatMode(int n3) {
    }

    public void onSetShuffleMode(int n3) {
    }

    public void onSkipToNext() {
    }

    public void onSkipToPrevious() {
    }

    public void onSkipToQueueItem(long l2) {
    }

    public void onStop() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSessionImpl(MediaSessionCompat$MediaSessionImpl mediaSessionCompat$MediaSessionImpl, Handler handler) {
        Object object = this.mLock;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                MediaSessionCompat$Callback$CallbackHandler mediaSessionCompat$Callback$CallbackHandler;
                block4: {
                    try {
                        Object object2;
                        this.mSessionImpl = object2 = new Object(mediaSessionCompat$MediaSessionImpl);
                        object2 = this.mCallbackHandler;
                        mediaSessionCompat$Callback$CallbackHandler = null;
                        if (object2 == null) break block4;
                        object2.removeCallbacksAndMessages(null);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (mediaSessionCompat$MediaSessionImpl != null && handler != null) {
                    mediaSessionCompat$MediaSessionImpl = handler.getLooper();
                    mediaSessionCompat$Callback$CallbackHandler = new MediaSessionCompat$Callback$CallbackHandler(this, (Looper)mediaSessionCompat$MediaSessionImpl);
                }
                this.mCallbackHandler = mediaSessionCompat$Callback$CallbackHandler;
                return;
            }
            throw throwable2;
        }
    }
}

