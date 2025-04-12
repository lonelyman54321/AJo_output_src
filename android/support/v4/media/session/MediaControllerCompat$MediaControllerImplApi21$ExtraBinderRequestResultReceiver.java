/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.ResultReceiver
 */
package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession$Stub;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
extends ResultReceiver {
    private WeakReference mMediaControllerImpl;

    public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerImplApi21) {
        super(null);
        WeakReference<MediaControllerCompat$MediaControllerImplApi21> weakReference;
        this.mMediaControllerImpl = weakReference = new WeakReference<MediaControllerCompat$MediaControllerImplApi21>(mediaControllerImplApi21);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onReceiveResult(int n3, Bundle object) {
        MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21)this.mMediaControllerImpl.get();
        if (mediaControllerCompat$MediaControllerImplApi21 == null) return;
        if (object == null) {
            return;
        }
        Object object2 = mediaControllerCompat$MediaControllerImplApi21.mLock;
        synchronized (object2) {
            MediaSessionCompat$Token mediaSessionCompat$Token = mediaControllerCompat$MediaControllerImplApi21.mSessionToken;
            Object object3 = "android.support.v4.media.session.EXTRA_BINDER";
            object3 = object.getBinder((String)object3);
            object3 = IMediaSession$Stub.asInterface((IBinder)object3);
            mediaSessionCompat$Token.setExtraBinder((IMediaSession)object3);
            mediaSessionCompat$Token = mediaControllerCompat$MediaControllerImplApi21.mSessionToken;
            object = Qm2.a(object);
            mediaSessionCompat$Token.setSession2Token((qB3)object);
            mediaControllerCompat$MediaControllerImplApi21.processPendingCallbacksLocked();
            return;
        }
    }
}

