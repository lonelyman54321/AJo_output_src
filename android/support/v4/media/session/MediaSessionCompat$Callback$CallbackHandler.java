/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl;
import java.lang.ref.Reference;

class MediaSessionCompat$Callback$CallbackHandler
extends Handler {
    private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;
    final /* synthetic */ MediaSessionCompat$Callback this$0;

    public MediaSessionCompat$Callback$CallbackHandler(MediaSessionCompat$Callback callback2, Looper looper) {
        this.this$0 = callback2;
        super(looper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void handleMessage(Message object) {
        MediaSessionCompat$Callback$CallbackHandler mediaSessionCompat$Callback$CallbackHandler;
        MediaSessionCompat$Callback mediaSessionCompat$Callback;
        Object object2;
        int n3 = object.what;
        int n4 = 1;
        if (n3 != n4) return;
        Object object3 = this.this$0.mLock;
        synchronized (object3) {
            object2 = this.this$0;
            object2 = ((MediaSessionCompat$Callback)object2).mSessionImpl;
            object2 = ((Reference)object2).get();
            object2 = (MediaSessionCompat$MediaSessionImpl)object2;
            mediaSessionCompat$Callback = this.this$0;
            mediaSessionCompat$Callback$CallbackHandler = mediaSessionCompat$Callback.mCallbackHandler;
        }
        if (object2 == null) return;
        object3 = object2.getCallback();
        if (mediaSessionCompat$Callback != object3) return;
        if (mediaSessionCompat$Callback$CallbackHandler == null) {
            return;
        }
        object = (fn1_0)object.obj;
        object2.setCurrentControllerInfo((fn1_0)object);
        this.this$0.handleMediaPlayPauseIfPendingOnHandler((MediaSessionCompat$MediaSessionImpl)object2, mediaSessionCompat$Callback$CallbackHandler);
        object = null;
        object2.setCurrentControllerInfo(null);
    }
}

