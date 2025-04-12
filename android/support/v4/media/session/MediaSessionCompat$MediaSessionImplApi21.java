/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  android.media.MediaMetadata
 *  android.media.session.MediaSession
 *  android.media.session.MediaSession$Callback
 *  android.media.session.MediaSession$QueueItem
 *  android.media.session.PlaybackState
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.RemoteCallbackList
 *  android.os.RemoteException
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21$ExtraSession;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$RegistrationCallback;
import android.support.v4.media.session.MediaSessionCompat$RegistrationCallbackHandler;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class MediaSessionCompat$MediaSessionImplApi21
implements MediaSessionCompat$MediaSessionImpl {
    MediaSessionCompat$Callback mCallback;
    boolean mCaptioningEnabled;
    boolean mDestroyed;
    final RemoteCallbackList mExtraControllerCallbacks;
    final MediaSessionCompat$MediaSessionImplApi21$ExtraSession mExtraSession;
    final Object mLock;
    MediaMetadataCompat mMetadata;
    PlaybackStateCompat mPlaybackState;
    List mQueue;
    int mRatingType;
    MediaSessionCompat$RegistrationCallbackHandler mRegistrationCallbackHandler;
    fn1_0 mRemoteUserInfo;
    int mRepeatMode;
    final MediaSession mSessionFwk;
    Bundle mSessionInfo;
    int mShuffleMode;
    final MediaSessionCompat$Token mToken;

    public MediaSessionCompat$MediaSessionImplApi21(Context context, String object, qB3 qB32, Bundle bundle) {
        Object object2;
        this.mLock = object2 = new Object();
        this.mDestroyed = false;
        object2 = new RemoteCallbackList();
        this.mExtraControllerCallbacks = object2;
        context = this.createFwkMediaSession(context, (String)object, bundle);
        this.mSessionFwk = context;
        this.mExtraSession = object = new MediaSessionCompat$MediaSessionImplApi21$ExtraSession(this);
        context = context.getSessionToken();
        this.mToken = object2 = new MediaSessionCompat$Token(context, (IMediaSession)object, qB32);
        this.mSessionInfo = bundle;
        this.setFlags(3);
    }

    public MediaSessionCompat$MediaSessionImplApi21(Object object) {
        Object object2;
        this.mLock = object2 = new Object();
        this.mDestroyed = false;
        object2 = new RemoteCallbackList();
        this.mExtraControllerCallbacks = object2;
        boolean bl2 = object instanceof MediaSession;
        if (bl2) {
            MediaSessionCompat$Token mediaSessionCompat$Token;
            object = (MediaSession)object;
            this.mSessionFwk = object;
            this.mExtraSession = object2 = new MediaSessionCompat$MediaSessionImplApi21$ExtraSession(this);
            object = object.getSessionToken();
            this.mToken = mediaSessionCompat$Token = new MediaSessionCompat$Token(object, (IMediaSession)object2);
            this.mSessionInfo = null;
            this.setFlags(3);
            return;
        }
        object = new IllegalArgumentException("mediaSession is not a valid MediaSession object");
        throw object;
    }

    public MediaSession createFwkMediaSession(Context context, String string2, Bundle bundle) {
        bundle = new MediaSession(context, string2);
        return bundle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MediaSessionCompat$Callback getCallback() {
        Object object = this.mLock;
        synchronized (object) {
            return this.mCallback;
        }
    }

    public String getCallingPackage() {
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 < n4) {
            return null;
        }
        try {
            object = this.mSessionFwk;
        }
        catch (Exception exception) {
            return null;
        }
        object = object.getClass();
        String string2 = "getCallingPackage";
        object = ((Class)object).getMethod(string2, null);
        string2 = this.mSessionFwk;
        object = ((Method)object).invoke((Object)string2, null);
        return (String)object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public fn1_0 getCurrentControllerInfo() {
        Object object = this.mLock;
        synchronized (object) {
            return this.mRemoteUserInfo;
        }
    }

    public Object getMediaSession() {
        return this.mSessionFwk;
    }

    public PlaybackStateCompat getPlaybackState() {
        return this.mPlaybackState;
    }

    public Object getRemoteControlClient() {
        return null;
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.mToken;
    }

    public boolean isActive() {
        return this.mSessionFwk.isActive();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void release() {
        boolean bl2;
        this.mDestroyed = bl2 = true;
        Object object = this.mExtraControllerCallbacks;
        object.kill();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 27;
        if (n3 == n4) {
            try {
                object = this.mSessionFwk;
                object = object.getClass();
                String string2 = "mCallback";
                object = ((Class)object).getDeclaredField(string2);
                ((AccessibleObject)object).setAccessible(bl2);
                MediaSession mediaSession = this.mSessionFwk;
                Object object2 = ((Field)object).get(mediaSession);
                Handler handler = (Handler)object2;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            }
            catch (Exception exception) {}
        }
        this.mSessionFwk.setCallback(null);
        this.mExtraSession.release();
        this.mSessionFwk.release();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void sendSessionEvent(String string2, Bundle bundle) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 < n4) {
            Object object = this.mLock;
            synchronized (object) {
                try {
                    RemoteCallbackList remoteCallbackList = this.mExtraControllerCallbacks;
                    for (n4 = remoteCallbackList.beginBroadcast() + -1; n4 >= 0; n4 += -1) {
                        Object object2 = this.mExtraControllerCallbacks;
                        object2 = object2.getBroadcastItem(n4);
                        object2 = (IMediaControllerCallback)object2;
                        try {
                            object2.onEvent(string2, bundle);
                            continue;
                        }
                        catch (RemoteException remoteException) {}
                    }
                    remoteCallbackList = this.mExtraControllerCallbacks;
                    remoteCallbackList.finishBroadcast();
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
        this.mSessionFwk.sendSessionEvent(string2, bundle);
    }

    public void setActive(boolean bl2) {
        this.mSessionFwk.setActive(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCallback(MediaSessionCompat$Callback mediaSessionCompat$Callback, Handler handler) {
        Object object = this.mLock;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.mCallback = mediaSessionCompat$Callback;
                        MediaSession mediaSession = this.mSessionFwk;
                        MediaSession.Callback callback2 = mediaSessionCompat$Callback == null ? null : mediaSessionCompat$Callback.mCallbackFwk;
                        mediaSession.setCallback(callback2, handler);
                        if (mediaSessionCompat$Callback == null) break block3;
                        mediaSessionCompat$Callback.setSessionImpl(this, handler);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCaptioningEnabled(boolean bl2) {
        boolean bl3 = this.mCaptioningEnabled;
        if (bl3 == bl2) return;
        this.mCaptioningEnabled = bl2;
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mExtraControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mExtraControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onCaptioningEnabledChanged(bl2);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                RemoteCallbackList remoteCallbackList2 = this.mExtraControllerCallbacks;
                remoteCallbackList2.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCurrentControllerInfo(fn1_0 fn1_02) {
        Object object = this.mLock;
        synchronized (object) {
            this.mRemoteUserInfo = fn1_02;
            return;
        }
    }

    public void setExtras(Bundle bundle) {
        this.mSessionFwk.setExtras(bundle);
    }

    public void setFlags(int n3) {
        MediaSession mediaSession = this.mSessionFwk;
        mediaSession.setFlags(n3 |= 3);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.mSessionFwk.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.mMetadata = mediaMetadataCompat;
        MediaSession mediaSession = this.mSessionFwk;
        mediaMetadataCompat = mediaMetadataCompat == null ? null : (MediaMetadata)mediaMetadataCompat.getMediaMetadata();
        mediaSession.setMetadata((MediaMetadata)mediaMetadataCompat);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.mPlaybackState = playbackStateCompat;
        Object object = this.mLock;
        // MONITORENTER : object
        RemoteCallbackList remoteCallbackList = this.mExtraControllerCallbacks;
        for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
            Object object2 = this.mExtraControllerCallbacks;
            object2 = object2.getBroadcastItem(i3);
            object2 = (IMediaControllerCallback)object2;
            try {
                object2.onPlaybackStateChanged(playbackStateCompat);
                continue;
            }
            catch (RemoteException remoteException) {}
        }
        remoteCallbackList = this.mExtraControllerCallbacks;
        remoteCallbackList.finishBroadcast();
        // MONITOREXIT : object
        object = this.mSessionFwk;
        playbackStateCompat = playbackStateCompat == null ? null : (PlaybackState)playbackStateCompat.getPlaybackState();
        object.setPlaybackState((PlaybackState)playbackStateCompat);
    }

    public void setPlaybackToLocal(int n3) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(n3);
        MediaSession mediaSession = this.mSessionFwk;
        builder = builder.build();
        mediaSession.setPlaybackToLocal((AudioAttributes)builder);
    }

    public void setPlaybackToRemote(HE3 hE3) {
        throw null;
    }

    public void setQueue(List object) {
        this.mQueue = object;
        if (object == null) {
            this.mSessionFwk.setQueue(null);
            return;
        }
        int n3 = object.size();
        ArrayList<MediaSession.QueueItem> arrayList = new ArrayList<MediaSession.QueueItem>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem)((MediaSessionCompat$QueueItem)object.next()).getQueueItem();
            arrayList.add(queueItem);
        }
        this.mSessionFwk.setQueue(arrayList);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mSessionFwk.setQueueTitle(charSequence);
    }

    public void setRatingType(int n3) {
        this.mRatingType = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setRegistrationCallback(MediaSessionCompat$RegistrationCallback mediaSessionCompat$RegistrationCallback, Handler handler) {
        Object object = this.mLock;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                MediaSessionCompat$RegistrationCallbackHandler mediaSessionCompat$RegistrationCallbackHandler;
                block5: {
                    try {
                        mediaSessionCompat$RegistrationCallbackHandler = this.mRegistrationCallbackHandler;
                        if (mediaSessionCompat$RegistrationCallbackHandler == null) break block5;
                        mediaSessionCompat$RegistrationCallbackHandler.removeCallbacksAndMessages(null);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (mediaSessionCompat$RegistrationCallback != null) {
                    handler = handler.getLooper();
                    this.mRegistrationCallbackHandler = mediaSessionCompat$RegistrationCallbackHandler = new MediaSessionCompat$RegistrationCallbackHandler((Looper)handler, mediaSessionCompat$RegistrationCallback);
                } else {
                    this.mRegistrationCallbackHandler = null;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setRepeatMode(int n3) {
        int n4 = this.mRepeatMode;
        if (n4 == n3) return;
        this.mRepeatMode = n3;
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mExtraControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mExtraControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onRepeatModeChanged(n3);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                RemoteCallbackList remoteCallbackList2 = this.mExtraControllerCallbacks;
                remoteCallbackList2.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.mSessionFwk.setSessionActivity(pendingIntent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setShuffleMode(int n3) {
        int n4 = this.mShuffleMode;
        if (n4 == n3) return;
        this.mShuffleMode = n3;
        Object object = this.mLock;
        synchronized (object) {
            try {
                RemoteCallbackList remoteCallbackList = this.mExtraControllerCallbacks;
                for (int i3 = remoteCallbackList.beginBroadcast() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = this.mExtraControllerCallbacks;
                    object2 = object2.getBroadcastItem(i3);
                    object2 = (IMediaControllerCallback)object2;
                    try {
                        object2.onShuffleModeChanged(n3);
                        continue;
                    }
                    catch (RemoteException remoteException) {}
                }
                RemoteCallbackList remoteCallbackList2 = this.mExtraControllerCallbacks;
                remoteCallbackList2.finishBroadcast();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

