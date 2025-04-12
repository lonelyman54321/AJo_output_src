/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 *  android.os.Handler
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.MediaSessionCompat$RegistrationCallback;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;

interface MediaSessionCompat$MediaSessionImpl {
    public MediaSessionCompat$Callback getCallback();

    public String getCallingPackage();

    public fn1_0 getCurrentControllerInfo();

    public Object getMediaSession();

    public PlaybackStateCompat getPlaybackState();

    public Object getRemoteControlClient();

    public MediaSessionCompat$Token getSessionToken();

    public boolean isActive();

    public void release();

    public void sendSessionEvent(String var1, Bundle var2);

    public void setActive(boolean var1);

    public void setCallback(MediaSessionCompat$Callback var1, Handler var2);

    public void setCaptioningEnabled(boolean var1);

    public void setCurrentControllerInfo(fn1_0 var1);

    public void setExtras(Bundle var1);

    public void setFlags(int var1);

    public void setMediaButtonReceiver(PendingIntent var1);

    public void setMetadata(MediaMetadataCompat var1);

    public void setPlaybackState(PlaybackStateCompat var1);

    public void setPlaybackToLocal(int var1);

    public void setPlaybackToRemote(HE3 var1);

    public void setQueue(List var1);

    public void setQueueTitle(CharSequence var1);

    public void setRatingType(int var1);

    public void setRegistrationCallback(MediaSessionCompat.RegistrationCallback var1, Handler var2);

    public void setRepeatMode(int var1);

    public void setSessionActivity(PendingIntent var1);

    public void setShuffleMode(int var1);
}

