/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.view.KeyEvent
 */
package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat$ConnectionCallback;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.view.KeyEvent;

public final class MediaButtonReceiver$b
extends MediaBrowserCompat$ConnectionCallback {
    public final Context a;
    public final Intent b;
    public final BroadcastReceiver.PendingResult c;
    public MediaBrowserCompat d;

    public MediaButtonReceiver$b(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
        this.a = context;
        this.b = intent;
        this.c = pendingResult;
    }

    public final void onConnected() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.d.getSessionToken();
        Context context = this.a;
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(context, mediaSessionCompat$Token);
        mediaSessionCompat$Token = (KeyEvent)this.b.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaControllerCompat.dispatchMediaButtonEvent((KeyEvent)mediaSessionCompat$Token);
        this.d.disconnect();
        this.c.finish();
    }

    public final void onConnectionFailed() {
        this.d.disconnect();
        this.c.finish();
    }

    public final void onConnectionSuspended() {
        this.d.disconnect();
        this.c.finish();
    }
}

