/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.media.AudioManager
 *  android.media.RemoteControlClient
 *  android.media.RemoteControlClient$OnPlaybackPositionUpdateListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.SystemClock
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18$1;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase;
import android.support.v4.media.session.PlaybackStateCompat;

class MediaSessionCompat$MediaSessionImplApi18
extends MediaSessionCompat$MediaSessionImplBase {
    private static boolean sIsMbrPendingIntentSupported = true;

    public MediaSessionCompat$MediaSessionImplApi18(Context context, String string2, ComponentName componentName, PendingIntent pendingIntent, qB3 qB32, Bundle bundle) {
        super(context, string2, componentName, pendingIntent, qB32, bundle);
    }

    public int getRccTransportControlFlagsFromActions(long l2) {
        int n3 = super.getRccTransportControlFlagsFromActions(l2);
        long l3 = 0L;
        long l4 = (l2 &= 0x100L) - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            n3 |= 0x100;
        }
        return n3;
    }

    public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
        boolean bl2 = sIsMbrPendingIntentSupported;
        if (bl2) {
            AudioManager audioManager = this.mAudioManager;
            try {
                audioManager.registerMediaButtonEventReceiver(pendingIntent);
            }
            catch (NullPointerException nullPointerException) {
                bl2 = false;
                audioManager = null;
                sIsMbrPendingIntentSupported = false;
            }
        }
        if (!(bl2 = sIsMbrPendingIntentSupported)) {
            super.registerMediaButtonEventReceiver(pendingIntent, componentName);
        }
    }

    public void setCallback(MediaSessionCompat$Callback object, Handler handler) {
        super.setCallback((MediaSessionCompat$Callback)object, handler);
        if (object == null) {
            object = this.mRcc;
            handler = null;
            object.setPlaybackPositionUpdateListener(null);
        } else {
            object = new MediaSessionCompat$MediaSessionImplApi18$1(this);
            handler = this.mRcc;
            handler.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener)object);
        }
    }

    public void setRccState(PlaybackStateCompat playbackStateCompat) {
        RemoteControlClient remoteControlClient;
        long l2;
        long l3;
        Object object;
        int n3;
        long l4 = playbackStateCompat.getPosition();
        float f5 = playbackStateCompat.getPlaybackSpeed();
        long l7 = playbackStateCompat.getLastPositionUpdateTime();
        long l8 = SystemClock.elapsedRealtime();
        int n4 = playbackStateCompat.getState();
        if (n4 == (n3 = 3) && (object = (l3 = l4 - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            object = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
            if (object > 0) {
                float f6;
                l2 = l8 - l7;
                float f7 = 0.0f;
                remoteControlClient = null;
                float f8 = f5 - 0.0f;
                Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                if (object2 > 0 && (object2 = (f6 = f5 - (f7 = 1.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
                    f7 = (float)l2 * f5;
                    l2 = (long)f7;
                }
            }
            l4 += l2;
        }
        remoteControlClient = this.mRcc;
        int n7 = playbackStateCompat.getState();
        n7 = this.getRccStateFromState(n7);
        remoteControlClient.setPlaybackState(n7, l4, f5);
    }

    public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
        boolean bl2 = sIsMbrPendingIntentSupported;
        if (bl2) {
            componentName = this.mAudioManager;
            componentName.unregisterMediaButtonEventReceiver(pendingIntent);
        } else {
            super.unregisterMediaButtonEventReceiver(pendingIntent, componentName);
        }
    }
}

