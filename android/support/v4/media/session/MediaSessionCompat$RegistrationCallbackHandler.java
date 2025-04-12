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
import android.support.v4.media.session.MediaSessionCompat$RegistrationCallback;

final class MediaSessionCompat$RegistrationCallbackHandler
extends Handler {
    private static final int MSG_CALLBACK_REGISTERED = 1001;
    private static final int MSG_CALLBACK_UNREGISTERED = 1002;
    private final MediaSessionCompat$RegistrationCallback mCallback;

    public MediaSessionCompat$RegistrationCallbackHandler(Looper looper, MediaSessionCompat$RegistrationCallback mediaSessionCompat$RegistrationCallback) {
        super(looper);
        this.mCallback = mediaSessionCompat$RegistrationCallback;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        int n3 = message.what;
        int n4 = 1001;
        if (n3 != n4) {
            n4 = 1002;
            if (n3 == n4) {
                MediaSessionCompat$RegistrationCallback mediaSessionCompat$RegistrationCallback = this.mCallback;
                n4 = message.arg1;
                int n7 = message.arg2;
                mediaSessionCompat$RegistrationCallback.onCallbackUnregistered(n4, n7);
            }
        } else {
            MediaSessionCompat$RegistrationCallback mediaSessionCompat$RegistrationCallback = this.mCallback;
            n4 = message.arg1;
            int n8 = message.arg2;
            mediaSessionCompat$RegistrationCallback.onCallbackRegistered(n4, n8);
        }
    }

    public void postCallbackRegistered(int n3, int n4) {
        this.obtainMessage(1001, n3, n4).sendToTarget();
    }

    public void postCallbackUnregistered(int n3, int n4) {
        this.obtainMessage(1002, n3, n4).sendToTarget();
    }
}

