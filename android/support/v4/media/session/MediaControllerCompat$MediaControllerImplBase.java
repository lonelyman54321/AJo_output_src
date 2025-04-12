/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IBinder$DeathRecipient
 *  android.os.RemoteException
 *  android.os.ResultReceiver
 *  android.view.KeyEvent
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession$Stub;
import android.support.v4.media.session.MediaControllerCompat$Callback;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl;
import android.support.v4.media.session.MediaControllerCompat$PlaybackInfo;
import android.support.v4.media.session.MediaControllerCompat$TransportControls;
import android.support.v4.media.session.MediaControllerCompat$TransportControlsBase;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import java.util.List;

class MediaControllerCompat$MediaControllerImplBase
implements MediaControllerCompat$MediaControllerImpl {
    private IMediaSession mBinder;
    private Bundle mSessionInfo;
    private MediaControllerCompat$TransportControls mTransportControls;

    public MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat$Token object) {
        this.mBinder = object = IMediaSession$Stub.asInterface((IBinder)((MediaSessionCompat$Token)object).getToken());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void addQueueItem(MediaDescriptionCompat object) {
        Object object2;
        block7: {
            try {
                object2 = this.mBinder;
            }
            catch (RemoteException remoteException) {
                return;
            }
            long l2 = object2.getFlags() & (long)4;
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) break block7;
            object2 = this.mBinder;
            object2.addQueueItem((MediaDescriptionCompat)object);
            return;
        }
        object2 = "This session doesn't support queue management operations";
        object = new UnsupportedOperationException((String)object2);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void addQueueItem(MediaDescriptionCompat object, int n3) {
        block7: {
            IMediaSession iMediaSession;
            try {
                iMediaSession = this.mBinder;
            }
            catch (RemoteException remoteException) {
                return;
            }
            long l2 = iMediaSession.getFlags() & (long)4;
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) break block7;
            iMediaSession = this.mBinder;
            iMediaSession.addQueueItemAt((MediaDescriptionCompat)object, n3);
            return;
        }
        String string2 = "This session doesn't support queue management operations";
        object = new UnsupportedOperationException(string2);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void adjustVolume(int n3, int n4) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.adjustVolume(n3, n4, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean dispatchMediaButtonEvent(KeyEvent object) {
        if (object == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("event may not be null.");
            throw illegalArgumentException;
        }
        try {
            IMediaSession iMediaSession = this.mBinder;
            iMediaSession.sendMediaButton((KeyEvent)object);
            return false;
        }
        catch (RemoteException remoteException) {
            return false;
        }
    }

    public Bundle getExtras() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return null;
        }
        return iMediaSession.getExtras();
    }

    public long getFlags() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return 0L;
        }
        return iMediaSession.getFlags();
    }

    public Object getMediaController() {
        return null;
    }

    public MediaMetadataCompat getMetadata() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return null;
        }
        return iMediaSession.getMetadata();
    }

    public String getPackageName() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return null;
        }
        return iMediaSession.getPackageName();
    }

    public MediaControllerCompat$PlaybackInfo getPlaybackInfo() {
        Object object;
        try {
            object = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return null;
        }
        object = object.getVolumeAttributes();
        int n3 = ((ParcelableVolumeInfo)object).volumeType;
        int n4 = ((ParcelableVolumeInfo)object).audioStream;
        int n7 = ((ParcelableVolumeInfo)object).controlType;
        int n8 = ((ParcelableVolumeInfo)object).maxVolume;
        int n10 = ((ParcelableVolumeInfo)object).currentVolume;
        MediaControllerCompat$PlaybackInfo mediaControllerCompat$PlaybackInfo = new MediaControllerCompat$PlaybackInfo(n3, n4, n7, n8, n10);
        return mediaControllerCompat$PlaybackInfo;
    }

    public PlaybackStateCompat getPlaybackState() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return null;
        }
        return iMediaSession.getPlaybackState();
    }

    public List getQueue() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return null;
        }
        return iMediaSession.getQueue();
    }

    public CharSequence getQueueTitle() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return null;
        }
        return iMediaSession.getQueueTitle();
    }

    public int getRatingType() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return 0;
        }
        return iMediaSession.getRatingType();
    }

    public int getRepeatMode() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return -1;
        }
        return iMediaSession.getRepeatMode();
    }

    public PendingIntent getSessionActivity() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return null;
        }
        return iMediaSession.getLaunchPendingIntent();
    }

    public Bundle getSessionInfo() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {}
        iMediaSession = iMediaSession.getSessionInfo();
        this.mSessionInfo = iMediaSession;
        iMediaSession = MediaSessionCompat.unparcelWithClassLoader(this.mSessionInfo);
        this.mSessionInfo = iMediaSession;
        if (iMediaSession == null) {
            iMediaSession = Bundle.EMPTY;
        } else {
            Bundle bundle = this.mSessionInfo;
            iMediaSession = new Bundle(bundle);
        }
        return iMediaSession;
    }

    public int getShuffleMode() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return -1;
        }
        return iMediaSession.getShuffleMode();
    }

    public MediaControllerCompat$TransportControls getTransportControls() {
        MediaControllerCompat$TransportControls mediaControllerCompat$TransportControls = this.mTransportControls;
        if (mediaControllerCompat$TransportControls == null) {
            IMediaSession iMediaSession = this.mBinder;
            this.mTransportControls = mediaControllerCompat$TransportControls = new MediaControllerCompat$TransportControlsBase(iMediaSession);
        }
        return this.mTransportControls;
    }

    public boolean isCaptioningEnabled() {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return false;
        }
        return iMediaSession.isCaptioningEnabled();
    }

    public boolean isSessionReady() {
        return true;
    }

    public void registerCallback(MediaControllerCompat$Callback object, Handler handler) {
        if (object != null) {
            IMediaSession iMediaSession = this.mBinder;
            iMediaSession = iMediaSession.asBinder();
            IMediaControllerCallback iMediaControllerCallback = null;
            iMediaSession.linkToDeath((IBinder.DeathRecipient)object, 0);
            iMediaSession = this.mBinder;
            iMediaControllerCallback = ((MediaControllerCompat$Callback)object).mIControllerCallback;
            iMediaSession.registerCallbackListener(iMediaControllerCallback);
            int n3 = 13;
            try {
                ((MediaControllerCompat$Callback)object).postToHandler(n3, null, null);
            }
            catch (RemoteException remoteException) {
                n3 = 8;
                ((MediaControllerCompat$Callback)object).postToHandler(n3, null, null);
            }
            return;
        }
        object = new IllegalArgumentException("callback may not be null.");
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void removeQueueItem(MediaDescriptionCompat object) {
        Object object2;
        block7: {
            try {
                object2 = this.mBinder;
            }
            catch (RemoteException remoteException) {
                return;
            }
            long l2 = object2.getFlags() & (long)4;
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) break block7;
            object2 = this.mBinder;
            object2.removeQueueItem((MediaDescriptionCompat)object);
            return;
        }
        object2 = "This session doesn't support queue management operations";
        object = new UnsupportedOperationException((String)object2);
        throw object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void sendCommand(String string2, Bundle bundle, ResultReceiver object) {
        void var3_6;
        IMediaSession iMediaSession;
        block7: {
            MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper;
            block6: {
                try {
                    iMediaSession = this.mBinder;
                    if (object != null) break block6;
                    Object var3_4 = null;
                    break block7;
                }
                catch (RemoteException remoteException) {
                    return;
                }
            }
            MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper2 = mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper((ResultReceiver)object);
        }
        iMediaSession.sendCommand(string2, bundle, (MediaSessionCompat$ResultReceiverWrapper)var3_6);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setVolumeTo(int n3, int n4) {
        IMediaSession iMediaSession;
        try {
            iMediaSession = this.mBinder;
        }
        catch (RemoteException remoteException) {
            return;
        }
        iMediaSession.setVolumeTo(n3, n4, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterCallback(MediaControllerCompat$Callback object) {
        if (object == null) {
            object = new IllegalArgumentException("callback may not be null.");
            throw object;
        }
        try {
            IMediaSession iMediaSession = this.mBinder;
            IMediaControllerCallback iMediaControllerCallback = ((MediaControllerCompat$Callback)object).mIControllerCallback;
            iMediaSession.unregisterCallbackListener(iMediaControllerCallback);
            iMediaSession = this.mBinder;
            iMediaSession = iMediaSession.asBinder();
            iMediaControllerCallback = null;
            iMediaSession.unlinkToDeath((IBinder.DeathRecipient)object, 0);
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }
}

