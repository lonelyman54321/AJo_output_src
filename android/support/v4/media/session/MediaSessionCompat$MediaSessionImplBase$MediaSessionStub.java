/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.media.AudioManager
 *  android.net.Uri
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IInterface
 *  android.os.RemoteCallbackList
 *  android.os.ResultReceiver
 *  android.view.KeyEvent
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession$Stub;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$Command;
import android.support.v4.media.session.MediaSessionCompat$RegistrationCallbackHandler;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub
extends IMediaSession$Stub {
    private final AtomicReference mMediaSessionImplRef;
    private final String mPackageName;
    private final String mTag;

    public MediaSessionCompat$MediaSessionImplBase$MediaSessionStub(MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase, String string2, String string3) {
        AtomicReference<MediaSessionCompat$MediaSessionImplBase> atomicReference;
        this.mMediaSessionImplRef = atomicReference = new AtomicReference<MediaSessionCompat$MediaSessionImplBase>(mediaSessionCompat$MediaSessionImplBase);
        this.mPackageName = string2;
        this.mTag = string3;
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.postToHandler(25, mediaDescriptionCompat);
    }

    public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int n3) {
        this.postToHandler(26, mediaDescriptionCompat, n3, null);
    }

    public void adjustVolume(int n3, int n4, String object) {
        object = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (object != null) {
            ((MediaSessionCompat$MediaSessionImplBase)object).adjustVolume(n3, n4);
        }
    }

    public void fastForward() {
        this.postToHandler(16);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Bundle getExtras() {
        MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (mediaSessionCompat$MediaSessionImplBase == null) {
            return null;
        }
        Object object = mediaSessionCompat$MediaSessionImplBase.mLock;
        synchronized (object) {
            return mediaSessionCompat$MediaSessionImplBase.mExtras;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long getFlags() {
        MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (mediaSessionCompat$MediaSessionImplBase == null) {
            return 0L;
        }
        Object object = mediaSessionCompat$MediaSessionImplBase.mLock;
        synchronized (object) {
            int n3 = mediaSessionCompat$MediaSessionImplBase.mFlags;
            return n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PendingIntent getLaunchPendingIntent() {
        MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (mediaSessionCompat$MediaSessionImplBase == null) {
            return null;
        }
        Object object = mediaSessionCompat$MediaSessionImplBase.mLock;
        synchronized (object) {
            return mediaSessionCompat$MediaSessionImplBase.mSessionActivity;
        }
    }

    public MediaMetadataCompat getMetadata() {
        Object object = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        object = object != null ? ((MediaSessionCompat$MediaSessionImplBase)object).mMetadata : null;
        return object;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PlaybackStateCompat getPlaybackState() {
        Object object = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (object == null) {
            return null;
        }
        Object object2 = ((MediaSessionCompat$MediaSessionImplBase)object).mLock;
        synchronized (object2) {
            PlaybackStateCompat playbackStateCompat = ((MediaSessionCompat$MediaSessionImplBase)object).mState;
            object = ((MediaSessionCompat$MediaSessionImplBase)object).mMetadata;
            return MediaSessionCompat.getStateWithUpdatedPosition(playbackStateCompat, (MediaMetadataCompat)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List getQueue() {
        MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (mediaSessionCompat$MediaSessionImplBase == null) {
            return null;
        }
        Object object = mediaSessionCompat$MediaSessionImplBase.mLock;
        synchronized (object) {
            return mediaSessionCompat$MediaSessionImplBase.mQueue;
        }
    }

    public CharSequence getQueueTitle() {
        Object object = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        object = object != null ? ((MediaSessionCompat$MediaSessionImplBase)object).mQueueTitle : null;
        return object;
    }

    public int getRatingType() {
        int n3;
        MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (mediaSessionCompat$MediaSessionImplBase != null) {
            n3 = mediaSessionCompat$MediaSessionImplBase.mRatingType;
        } else {
            n3 = 0;
            mediaSessionCompat$MediaSessionImplBase = null;
        }
        return n3;
    }

    public int getRepeatMode() {
        MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        int n3 = mediaSessionCompat$MediaSessionImplBase != null ? mediaSessionCompat$MediaSessionImplBase.mRepeatMode : -1;
        return n3;
    }

    public Bundle getSessionInfo() {
        Bundle bundle;
        MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (mediaSessionCompat$MediaSessionImplBase != null && (bundle = mediaSessionCompat$MediaSessionImplBase.mSessionInfo) != null) {
            mediaSessionCompat$MediaSessionImplBase = mediaSessionCompat$MediaSessionImplBase.mSessionInfo;
            bundle = new Bundle((Bundle)mediaSessionCompat$MediaSessionImplBase);
        } else {
            bundle = null;
        }
        return bundle;
    }

    public int getShuffleMode() {
        MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        int n3 = mediaSessionCompat$MediaSessionImplBase != null ? mediaSessionCompat$MediaSessionImplBase.mShuffleMode : -1;
        return n3;
    }

    public String getTag() {
        return this.mTag;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ParcelableVolumeInfo getVolumeAttributes() {
        Object object = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        AudioManager audioManager = null;
        if (object == null) {
            return null;
        }
        Object object2 = ((MediaSessionCompat$MediaSessionImplBase)object).mLock;
        synchronized (object2) {
            try {
                int n3 = ((MediaSessionCompat$MediaSessionImplBase)object).mVolumeType;
                int n4 = ((MediaSessionCompat$MediaSessionImplBase)object).mLocalStream;
                int n7 = 2;
                if (n3 == n7) throw null;
                audioManager = ((MediaSessionCompat$MediaSessionImplBase)object).mAudioManager;
                int n8 = audioManager.getStreamMaxVolume(n4);
                object = ((MediaSessionCompat$MediaSessionImplBase)object).mAudioManager;
                int n10 = object.getStreamVolume(n4);
                int n14 = 2;
                return new ParcelableVolumeInfo(n3, n4, n14, n8, n10);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public boolean isCaptioningEnabled() {
        boolean bl2;
        MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (mediaSessionCompat$MediaSessionImplBase != null && (bl2 = mediaSessionCompat$MediaSessionImplBase.mCaptioningEnabled)) {
            bl2 = true;
        } else {
            bl2 = false;
            mediaSessionCompat$MediaSessionImplBase = null;
        }
        return bl2;
    }

    public boolean isShuffleModeEnabledRemoved() {
        return false;
    }

    public boolean isTransportControlEnabled() {
        return true;
    }

    public void next() {
        this.postToHandler(14);
    }

    public void pause() {
        this.postToHandler(12);
    }

    public void play() {
        this.postToHandler(7);
    }

    public void playFromMediaId(String string2, Bundle bundle) {
        this.postToHandler(8, string2, bundle);
    }

    public void playFromSearch(String string2, Bundle bundle) {
        this.postToHandler(9, string2, bundle);
    }

    public void playFromUri(Uri uri, Bundle bundle) {
        this.postToHandler(10, uri, bundle);
    }

    public void postToHandler(int n3) {
        this.postToHandler(n3, null, 0, null);
    }

    public void postToHandler(int n3, int n4) {
        this.postToHandler(n3, null, n4, null);
    }

    public void postToHandler(int n3, Object object) {
        this.postToHandler(n3, object, 0, null);
    }

    public void postToHandler(int n3, Object object, int n4, Bundle bundle) {
        Object v4 = this.mMediaSessionImplRef.get();
        Object object2 = v4;
        object2 = (MediaSessionCompat$MediaSessionImplBase)v4;
        if (object2 != null) {
            ((MediaSessionCompat$MediaSessionImplBase)object2).postToHandler(n3, n4, 0, object, bundle);
        }
    }

    public void postToHandler(int n3, Object object, Bundle bundle) {
        this.postToHandler(n3, object, 0, bundle);
    }

    public void prepare() {
        this.postToHandler(3);
    }

    public void prepareFromMediaId(String string2, Bundle bundle) {
        this.postToHandler(4, string2, bundle);
    }

    public void prepareFromSearch(String string2, Bundle bundle) {
        this.postToHandler(5, string2, bundle);
    }

    public void prepareFromUri(Uri uri, Bundle bundle) {
        this.postToHandler(6, uri, bundle);
    }

    public void previous() {
        this.postToHandler(15);
    }

    public void rate(RatingCompat ratingCompat) {
        this.postToHandler(19, ratingCompat);
    }

    public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
        this.postToHandler(31, ratingCompat, bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerCallbackListener(IMediaControllerCallback object) {
        Object object2 = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (object2 == null) {
            try {
                object.onSessionDestroyed();
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        int n3 = Binder.getCallingPid();
        int n4 = Binder.getCallingUid();
        String string2 = ((MediaSessionCompat$MediaSessionImplBase)object2).getPackageNameForUid(n4);
        fn1_0 fn1_02 = new fn1_0(string2, n3, n4);
        string2 = ((MediaSessionCompat$MediaSessionImplBase)object2).mControllerCallbacks;
        string2.register((IInterface)object, (Object)fn1_02);
        object = ((MediaSessionCompat$MediaSessionImplBase)object2).mLock;
        synchronized (object) {
            try {
                object2 = ((MediaSessionCompat$MediaSessionImplBase)object2).mRegistrationCallbackHandler;
                if (object2 == null) return;
                ((MediaSessionCompat$RegistrationCallbackHandler)((Object)object2)).postCallbackRegistered(n3, n4);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.postToHandler(27, mediaDescriptionCompat);
    }

    public void removeQueueItemAt(int n3) {
        this.postToHandler(28, n3);
    }

    public void rewind() {
        this.postToHandler(17);
    }

    public void seekTo(long l2) {
        Long l3 = l2;
        this.postToHandler(18, l3);
    }

    public void sendCommand(String string2, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        mediaSessionCompat$ResultReceiverWrapper = mediaSessionCompat$ResultReceiverWrapper == null ? null : mediaSessionCompat$ResultReceiverWrapper.mResultReceiver;
        MediaSessionCompat$MediaSessionImplBase$Command mediaSessionCompat$MediaSessionImplBase$Command = new MediaSessionCompat$MediaSessionImplBase$Command(string2, bundle, (ResultReceiver)mediaSessionCompat$ResultReceiverWrapper);
        this.postToHandler(1, mediaSessionCompat$MediaSessionImplBase$Command);
    }

    public void sendCustomAction(String string2, Bundle bundle) {
        this.postToHandler(20, string2, bundle);
    }

    public boolean sendMediaButton(KeyEvent keyEvent) {
        this.postToHandler(21, keyEvent);
        return true;
    }

    public void setCaptioningEnabled(boolean bl2) {
        Boolean bl3 = bl2;
        this.postToHandler(29, bl3);
    }

    public void setPlaybackSpeed(float f5) {
        Float f6 = Float.valueOf(f5);
        this.postToHandler(32, f6);
    }

    public void setRepeatMode(int n3) {
        this.postToHandler(23, n3);
    }

    public void setShuffleMode(int n3) {
        this.postToHandler(30, n3);
    }

    public void setShuffleModeEnabledRemoved(boolean bl2) {
    }

    public void setVolumeTo(int n3, int n4, String object) {
        object = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (object != null) {
            ((MediaSessionCompat$MediaSessionImplBase)object).setVolumeTo(n3, n4);
        }
    }

    public void skipToQueueItem(long l2) {
        Long l3 = l2;
        this.postToHandler(11, l3);
    }

    public void stop() {
        this.postToHandler(13);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
        Object object = (MediaSessionCompat$MediaSessionImplBase)this.mMediaSessionImplRef.get();
        if (object == null) {
            return;
        }
        RemoteCallbackList remoteCallbackList = ((MediaSessionCompat$MediaSessionImplBase)object).mControllerCallbacks;
        remoteCallbackList.unregister((IInterface)iMediaControllerCallback);
        int n3 = Binder.getCallingPid();
        int n4 = Binder.getCallingUid();
        Object object2 = ((MediaSessionCompat$MediaSessionImplBase)object).mLock;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object = ((MediaSessionCompat$MediaSessionImplBase)object).mRegistrationCallbackHandler;
                        if (object == null) break block4;
                        ((MediaSessionCompat$RegistrationCallbackHandler)((Object)object)).postCallbackUnregistered(n3, n4);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

