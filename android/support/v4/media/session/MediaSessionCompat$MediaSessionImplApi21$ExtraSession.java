/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.net.Uri
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IInterface
 *  android.os.RemoteCallbackList
 *  android.view.KeyEvent
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession$Stub;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21;
import android.support.v4.media.session.MediaSessionCompat$RegistrationCallbackHandler;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

class MediaSessionCompat$MediaSessionImplApi21$ExtraSession
extends IMediaSession$Stub {
    private final AtomicReference mMediaSessionImplRef;

    public MediaSessionCompat$MediaSessionImplApi21$ExtraSession(MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21) {
        AtomicReference<MediaSessionCompat$MediaSessionImplApi21> atomicReference;
        this.mMediaSessionImplRef = atomicReference = new AtomicReference<MediaSessionCompat$MediaSessionImplApi21>(mediaSessionCompat$MediaSessionImplApi21);
    }

    public void addQueueItem(MediaDescriptionCompat object) {
        object = new AssertionError();
        throw object;
    }

    public void addQueueItemAt(MediaDescriptionCompat object, int n3) {
        object = new AssertionError();
        throw object;
    }

    public void adjustVolume(int n3, int n4, String string2) {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void fastForward() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public Bundle getExtras() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public long getFlags() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public PendingIntent getLaunchPendingIntent() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public MediaMetadataCompat getMetadata() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public String getPackageName() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public PlaybackStateCompat getPlaybackState() {
        Object object = (MediaSessionCompat$MediaSessionImplApi21)this.mMediaSessionImplRef.get();
        if (object != null) {
            PlaybackStateCompat playbackStateCompat = ((MediaSessionCompat$MediaSessionImplApi21)object).mPlaybackState;
            object = ((MediaSessionCompat$MediaSessionImplApi21)object).mMetadata;
            return MediaSessionCompat.getStateWithUpdatedPosition(playbackStateCompat, (MediaMetadataCompat)object);
        }
        return null;
    }

    public List getQueue() {
        return null;
    }

    public CharSequence getQueueTitle() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public int getRatingType() {
        int n3;
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = (MediaSessionCompat$MediaSessionImplApi21)this.mMediaSessionImplRef.get();
        if (mediaSessionCompat$MediaSessionImplApi21 != null) {
            n3 = mediaSessionCompat$MediaSessionImplApi21.mRatingType;
        } else {
            n3 = 0;
            mediaSessionCompat$MediaSessionImplApi21 = null;
        }
        return n3;
    }

    public int getRepeatMode() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = (MediaSessionCompat$MediaSessionImplApi21)this.mMediaSessionImplRef.get();
        int n3 = mediaSessionCompat$MediaSessionImplApi21 != null ? mediaSessionCompat$MediaSessionImplApi21.mRepeatMode : -1;
        return n3;
    }

    public Bundle getSessionInfo() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = (MediaSessionCompat$MediaSessionImplApi21)this.mMediaSessionImplRef.get();
        Bundle bundle = mediaSessionCompat$MediaSessionImplApi21.mSessionInfo;
        if (bundle == null) {
            mediaSessionCompat$MediaSessionImplApi21 = null;
        } else {
            mediaSessionCompat$MediaSessionImplApi21 = mediaSessionCompat$MediaSessionImplApi21.mSessionInfo;
            bundle = new Bundle((Bundle)mediaSessionCompat$MediaSessionImplApi21);
            mediaSessionCompat$MediaSessionImplApi21 = bundle;
        }
        return mediaSessionCompat$MediaSessionImplApi21;
    }

    public int getShuffleMode() {
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = (MediaSessionCompat$MediaSessionImplApi21)this.mMediaSessionImplRef.get();
        int n3 = mediaSessionCompat$MediaSessionImplApi21 != null ? mediaSessionCompat$MediaSessionImplApi21.mShuffleMode : -1;
        return n3;
    }

    public String getTag() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public ParcelableVolumeInfo getVolumeAttributes() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public boolean isCaptioningEnabled() {
        boolean bl2;
        MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = (MediaSessionCompat$MediaSessionImplApi21)this.mMediaSessionImplRef.get();
        if (mediaSessionCompat$MediaSessionImplApi21 != null && (bl2 = mediaSessionCompat$MediaSessionImplApi21.mCaptioningEnabled)) {
            bl2 = true;
        } else {
            bl2 = false;
            mediaSessionCompat$MediaSessionImplApi21 = null;
        }
        return bl2;
    }

    public boolean isShuffleModeEnabledRemoved() {
        return false;
    }

    public boolean isTransportControlEnabled() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void next() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void pause() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void play() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void playFromMediaId(String object, Bundle bundle) {
        object = new AssertionError();
        throw object;
    }

    public void playFromSearch(String object, Bundle bundle) {
        object = new AssertionError();
        throw object;
    }

    public void playFromUri(Uri object, Bundle bundle) {
        object = new AssertionError();
        throw object;
    }

    public void prepare() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void prepareFromMediaId(String object, Bundle bundle) {
        object = new AssertionError();
        throw object;
    }

    public void prepareFromSearch(String object, Bundle bundle) {
        object = new AssertionError();
        throw object;
    }

    public void prepareFromUri(Uri object, Bundle bundle) {
        object = new AssertionError();
        throw object;
    }

    public void previous() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void rate(RatingCompat object) {
        object = new AssertionError();
        throw object;
    }

    public void rateWithExtras(RatingCompat object, Bundle bundle) {
        object = new AssertionError();
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerCallbackListener(IMediaControllerCallback object) {
        Object object2 = (MediaSessionCompat$MediaSessionImplApi21)this.mMediaSessionImplRef.get();
        if (object2 == null) {
            return;
        }
        int n3 = Binder.getCallingPid();
        int n4 = Binder.getCallingUid();
        fn1_0 fn1_02 = new fn1_0("android.media.session.MediaController", n3, n4);
        RemoteCallbackList remoteCallbackList = ((MediaSessionCompat$MediaSessionImplApi21)object2).mExtraControllerCallbacks;
        remoteCallbackList.register((IInterface)object, (Object)fn1_02);
        object = ((MediaSessionCompat$MediaSessionImplApi21)object2).mLock;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object2 = ((MediaSessionCompat$MediaSessionImplApi21)object2).mRegistrationCallbackHandler;
                        if (object2 == null) break block4;
                        ((MediaSessionCompat$RegistrationCallbackHandler)((Object)object2)).postCallbackRegistered(n3, n4);
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

    public void release() {
        this.mMediaSessionImplRef.set(null);
    }

    public void removeQueueItem(MediaDescriptionCompat object) {
        object = new AssertionError();
        throw object;
    }

    public void removeQueueItemAt(int n3) {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void rewind() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void seekTo(long l2) {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void sendCommand(String object, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        object = new AssertionError();
        throw object;
    }

    public void sendCustomAction(String object, Bundle bundle) {
        object = new AssertionError();
        throw object;
    }

    public boolean sendMediaButton(KeyEvent object) {
        object = new AssertionError();
        throw object;
    }

    public void setCaptioningEnabled(boolean bl2) {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void setPlaybackSpeed(float f5) {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void setRepeatMode(int n3) {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void setShuffleMode(int n3) {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void setShuffleModeEnabledRemoved(boolean bl2) {
    }

    public void setVolumeTo(int n3, int n4, String string2) {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void skipToQueueItem(long l2) {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public void stop() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
        Object object = (MediaSessionCompat$MediaSessionImplApi21)this.mMediaSessionImplRef.get();
        if (object == null) {
            return;
        }
        RemoteCallbackList remoteCallbackList = ((MediaSessionCompat$MediaSessionImplApi21)object).mExtraControllerCallbacks;
        remoteCallbackList.unregister((IInterface)iMediaControllerCallback);
        int n3 = Binder.getCallingPid();
        int n4 = Binder.getCallingUid();
        Object object2 = ((MediaSessionCompat$MediaSessionImplApi21)object).mLock;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object = ((MediaSessionCompat$MediaSessionImplApi21)object).mRegistrationCallbackHandler;
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

