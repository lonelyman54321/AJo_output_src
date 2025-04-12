/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.media.session.MediaController
 *  android.media.session.MediaController$Callback
 *  android.media.session.MediaController$PlaybackInfo
 *  android.media.session.MediaController$TransportControls
 *  android.media.session.MediaSession$Token
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.os.ResultReceiver
 *  android.view.KeyEvent
 */
package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat$Callback;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback;
import android.support.v4.media.session.MediaControllerCompat$PlaybackInfo;
import android.support.v4.media.session.MediaControllerCompat$TransportControls;
import android.support.v4.media.session.MediaControllerCompat$TransportControlsApi21;
import android.support.v4.media.session.MediaControllerCompat$TransportControlsApi23;
import android.support.v4.media.session.MediaControllerCompat$TransportControlsApi24;
import android.support.v4.media.session.MediaControllerCompat$TransportControlsApi29;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21
implements MediaControllerCompat$MediaControllerImpl {
    private HashMap mCallbackMap;
    protected final MediaController mControllerFwk;
    final Object mLock;
    private final List mPendingCallbacks;
    protected Bundle mSessionInfo;
    final MediaSessionCompat$Token mSessionToken;

    public MediaControllerCompat$MediaControllerImplApi21(Context object, MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaController mediaController = new Object();
        this.mLock = mediaController;
        mediaController = new ArrayList();
        this.mPendingCallbacks = mediaController;
        this.mCallbackMap = mediaController;
        this.mSessionToken = mediaSessionCompat$Token;
        MediaSession.Token token = (MediaSession.Token)mediaSessionCompat$Token.getToken();
        this.mControllerFwk = mediaController = new MediaController(object, token);
        object = mediaSessionCompat$Token.getExtraBinder();
        if (object == null) {
            this.requestExtraBinder();
        }
    }

    public static MediaControllerCompat getMediaController(Activity activity) {
        Object object = activity.getMediaController();
        if (object == null) {
            return null;
        }
        object = object.getSessionToken();
        object = MediaSessionCompat$Token.fromToken(object);
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat((Context)activity, (MediaSessionCompat$Token)object);
        return mediaControllerCompat;
    }

    private void requestExtraBinder() {
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(this);
        this.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
    }

    public static void setMediaController(Activity activity, MediaControllerCompat object) {
        MediaController mediaController;
        if (object != null) {
            object = ((MediaControllerCompat)object).getSessionToken().getToken();
            object = (MediaSession.Token)object;
            mediaController = new MediaController((Context)activity, (MediaSession.Token)object);
        } else {
            mediaController = null;
        }
        activity.setMediaController(mediaController);
    }

    public void addQueueItem(MediaDescriptionCompat object) {
        long l2;
        long l3 = this.getFlags() & (long)4;
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", (Parcelable)object);
            this.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, null);
            return;
        }
        object = new UnsupportedOperationException("This session doesn't support queue management operations");
        throw object;
    }

    public void addQueueItem(MediaDescriptionCompat object, int n3) {
        long l2;
        long l3 = this.getFlags() & (long)4;
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", (Parcelable)object);
            bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", n3);
            this.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
            return;
        }
        object = new UnsupportedOperationException("This session doesn't support queue management operations");
        throw object;
    }

    public void adjustVolume(int n3, int n4) {
        this.mControllerFwk.adjustVolume(n3, n4);
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        return this.mControllerFwk.dispatchMediaButtonEvent(keyEvent);
    }

    public Bundle getExtras() {
        return this.mControllerFwk.getExtras();
    }

    public long getFlags() {
        return this.mControllerFwk.getFlags();
    }

    public Object getMediaController() {
        return this.mControllerFwk;
    }

    public MediaMetadataCompat getMetadata() {
        Object object = this.mControllerFwk.getMetadata();
        object = object != null ? MediaMetadataCompat.fromMediaMetadata(object) : null;
        return object;
    }

    public String getPackageName() {
        return this.mControllerFwk.getPackageName();
    }

    public MediaControllerCompat$PlaybackInfo getPlaybackInfo() {
        MediaControllerCompat$PlaybackInfo mediaControllerCompat$PlaybackInfo;
        MediaController.PlaybackInfo playbackInfo = this.mControllerFwk.getPlaybackInfo();
        if (playbackInfo != null) {
            int n3 = playbackInfo.getPlaybackType();
            AudioAttributesCompat audioAttributesCompat = AudioAttributesCompat.c(playbackInfo.getAudioAttributes());
            int n4 = playbackInfo.getVolumeControl();
            int n7 = playbackInfo.getMaxVolume();
            int n8 = playbackInfo.getCurrentVolume();
            mediaControllerCompat$PlaybackInfo = new MediaControllerCompat$PlaybackInfo(n3, audioAttributesCompat, n4, n7, n8);
        } else {
            mediaControllerCompat$PlaybackInfo = null;
        }
        return mediaControllerCompat$PlaybackInfo;
    }

    public PlaybackStateCompat getPlaybackState() {
        Object object = this.mSessionToken.getExtraBinder();
        if (object != null) {
            try {
                object = this.mSessionToken;
            }
            catch (RemoteException remoteException) {}
            object = ((MediaSessionCompat$Token)object).getExtraBinder();
            return object.getPlaybackState();
        }
        object = (object = this.mControllerFwk.getPlaybackState()) != null ? PlaybackStateCompat.fromPlaybackState(object) : null;
        return object;
    }

    public List getQueue() {
        List list = this.mControllerFwk.getQueue();
        list = list != null ? MediaSessionCompat$QueueItem.fromQueueItemList(list) : null;
        return list;
    }

    public CharSequence getQueueTitle() {
        return this.mControllerFwk.getQueueTitle();
    }

    public int getRatingType() {
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 22;
        if (n3 < n4 && (object = this.mSessionToken.getExtraBinder()) != null) {
            try {
                object = this.mSessionToken;
            }
            catch (RemoteException remoteException) {}
            object = ((MediaSessionCompat$Token)object).getExtraBinder();
            return object.getRatingType();
        }
        return this.mControllerFwk.getRatingType();
    }

    public int getRepeatMode() {
        Object object = this.mSessionToken.getExtraBinder();
        if (object != null) {
            try {
                object = this.mSessionToken;
            }
            catch (RemoteException remoteException) {}
            object = ((MediaSessionCompat$Token)object).getExtraBinder();
            return object.getRepeatMode();
        }
        return -1;
    }

    public PendingIntent getSessionActivity() {
        return this.mControllerFwk.getSessionActivity();
    }

    public Bundle getSessionInfo() {
        Object object = this.mSessionInfo;
        if (object != null) {
            Bundle bundle = this.mSessionInfo;
            object = new Bundle(bundle);
            return object;
        }
        object = this.mSessionToken.getExtraBinder();
        if (object != null) {
            object = this.mSessionToken;
            object = ((MediaSessionCompat$Token)object).getExtraBinder();
            object = object.getSessionInfo();
            try {
                this.mSessionInfo = object;
            }
            catch (RemoteException remoteException) {
                object = Bundle.EMPTY;
                this.mSessionInfo = object;
            }
        }
        object = MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);
        this.mSessionInfo = object;
        if (object == null) {
            object = Bundle.EMPTY;
        } else {
            Bundle bundle = this.mSessionInfo;
            object = new Bundle(bundle);
        }
        return object;
    }

    public int getShuffleMode() {
        Object object = this.mSessionToken.getExtraBinder();
        if (object != null) {
            try {
                object = this.mSessionToken;
            }
            catch (RemoteException remoteException) {}
            object = ((MediaSessionCompat$Token)object).getExtraBinder();
            return object.getShuffleMode();
        }
        return -1;
    }

    public MediaControllerCompat$TransportControls getTransportControls() {
        MediaController.TransportControls transportControls = this.mControllerFwk.getTransportControls();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            MediaControllerCompat$TransportControlsApi29 mediaControllerCompat$TransportControlsApi29 = new MediaControllerCompat$TransportControlsApi29(transportControls);
            return mediaControllerCompat$TransportControlsApi29;
        }
        n4 = 24;
        if (n3 >= n4) {
            MediaControllerCompat$TransportControlsApi24 mediaControllerCompat$TransportControlsApi24 = new MediaControllerCompat$TransportControlsApi24(transportControls);
            return mediaControllerCompat$TransportControlsApi24;
        }
        n4 = 23;
        if (n3 >= n4) {
            MediaControllerCompat$TransportControlsApi23 mediaControllerCompat$TransportControlsApi23 = new MediaControllerCompat$TransportControlsApi23(transportControls);
            return mediaControllerCompat$TransportControlsApi23;
        }
        MediaControllerCompat$TransportControlsApi21 mediaControllerCompat$TransportControlsApi21 = new MediaControllerCompat$TransportControlsApi21(transportControls);
        return mediaControllerCompat$TransportControlsApi21;
    }

    public boolean isCaptioningEnabled() {
        Object object = this.mSessionToken.getExtraBinder();
        if (object != null) {
            try {
                object = this.mSessionToken;
            }
            catch (RemoteException remoteException) {}
            object = ((MediaSessionCompat$Token)object).getExtraBinder();
            return object.isCaptioningEnabled();
        }
        return false;
    }

    public boolean isSessionReady() {
        boolean bl2;
        IMediaSession iMediaSession = this.mSessionToken.getExtraBinder();
        if (iMediaSession != null) {
            bl2 = true;
        } else {
            bl2 = false;
            iMediaSession = null;
        }
        return bl2;
    }

    public void processPendingCallbacksLocked() {
        boolean bl2;
        Object object = this.mSessionToken.getExtraBinder();
        if (object == null) {
            return;
        }
        object = this.mPendingCallbacks.iterator();
        while (bl2 = object.hasNext()) {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = (MediaControllerCompat$Callback)object.next();
            MediaControllerCompat$MediaControllerImplApi21$ExtraCallback mediaControllerCompat$MediaControllerImplApi21$ExtraCallback = new MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(mediaControllerCompat$Callback);
            Object object2 = this.mCallbackMap;
            ((HashMap)object2).put(mediaControllerCompat$Callback, mediaControllerCompat$MediaControllerImplApi21$ExtraCallback);
            mediaControllerCompat$Callback.mIControllerCallback = mediaControllerCompat$MediaControllerImplApi21$ExtraCallback;
            try {
                object2 = this.mSessionToken;
            }
            catch (RemoteException remoteException) {}
            object2 = ((MediaSessionCompat$Token)object2).getExtraBinder();
            object2.registerCallbackListener(mediaControllerCompat$MediaControllerImplApi21$ExtraCallback);
            int n3 = 13;
            object2 = null;
            mediaControllerCompat$Callback.postToHandler(n3, null, null);
            continue;
            break;
        }
        this.mPendingCallbacks.clear();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void registerCallback(MediaControllerCompat$Callback mediaControllerCompat$Callback, Handler object) {
        Object object2 = this.mControllerFwk;
        MediaController.Callback callback2 = mediaControllerCompat$Callback.mCallbackFwk;
        object2.registerCallback(callback2, object);
        object = this.mLock;
        synchronized (object) {
            block6: {
                Throwable throwable2;
                block7: {
                    block5: {
                        try {
                            object2 = this.mSessionToken;
                            object2 = ((MediaSessionCompat$Token)object2).getExtraBinder();
                            callback2 = null;
                            if (object2 == null) break block5;
                            object2 = new MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(mediaControllerCompat$Callback);
                            Object object3 = this.mCallbackMap;
                            ((HashMap)object3).put(mediaControllerCompat$Callback, object2);
                            mediaControllerCompat$Callback.mIControllerCallback = object2;
                            object3 = this.mSessionToken;
                            object3 = ((MediaSessionCompat$Token)object3).getExtraBinder();
                            object3.registerCallbackListener((IMediaControllerCallback)object2);
                            int n3 = 13;
                            mediaControllerCompat$Callback.postToHandler(n3, null, null);
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    mediaControllerCompat$Callback.mIControllerCallback = null;
                    object2 = this.mPendingCallbacks;
                    object2.add(mediaControllerCompat$Callback);
                    break block6;
                }
                throw throwable2;
                catch (RemoteException remoteException) {}
            }
            return;
        }
    }

    public void removeQueueItem(MediaDescriptionCompat object) {
        long l2;
        long l3 = this.getFlags() & (long)4;
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", (Parcelable)object);
            this.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
            return;
        }
        object = new UnsupportedOperationException("This session doesn't support queue management operations");
        throw object;
    }

    public void sendCommand(String string2, Bundle bundle, ResultReceiver resultReceiver) {
        this.mControllerFwk.sendCommand(string2, bundle, resultReceiver);
    }

    public void setVolumeTo(int n3, int n4) {
        this.mControllerFwk.setVolumeTo(n3, n4);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void unregisterCallback(MediaControllerCompat$Callback object) {
        Object object2 = this.mControllerFwk;
        Object object3 = ((MediaControllerCompat$Callback)object).mCallbackFwk;
        object2.unregisterCallback(object3);
        object2 = this.mLock;
        synchronized (object2) {
            block7: {
                Throwable throwable2;
                block8: {
                    block6: {
                        try {
                            object3 = this.mSessionToken;
                            object3 = object3.getExtraBinder();
                            if (object3 == null) break block6;
                            object3 = this.mCallbackMap;
                            object3 = object3.remove(object);
                            object3 = (MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)object3;
                            if (object3 != null) {
                                ((MediaControllerCompat$Callback)object).mIControllerCallback = null;
                                object = this.mSessionToken;
                                object = ((MediaSessionCompat$Token)object).getExtraBinder();
                                object.unregisterCallbackListener((IMediaControllerCallback)object3);
                            }
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    object3 = this.mPendingCallbacks;
                    object3.remove(object);
                    break block7;
                }
                throw throwable2;
                catch (RemoteException remoteException) {}
            }
            return;
        }
    }
}

