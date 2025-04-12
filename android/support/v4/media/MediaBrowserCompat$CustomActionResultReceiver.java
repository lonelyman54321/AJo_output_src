/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 */
package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaBrowserCompat$CustomActionCallback;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.util.Objects;

class MediaBrowserCompat$CustomActionResultReceiver
extends ResultReceiver {
    private final String mAction;
    private final MediaBrowserCompat$CustomActionCallback mCallback;
    private final Bundle mExtras;

    public MediaBrowserCompat$CustomActionResultReceiver(String string2, Bundle bundle, MediaBrowserCompat$CustomActionCallback mediaBrowserCompat$CustomActionCallback, Handler handler) {
        super(handler);
        this.mAction = string2;
        this.mExtras = bundle;
        this.mCallback = mediaBrowserCompat$CustomActionCallback;
    }

    public void onReceiveResult(int n3, Bundle bundle) {
        Object object = this.mCallback;
        if (object == null) {
            return;
        }
        MediaSessionCompat.ensureClassLoader(bundle);
        int n4 = -1;
        if (n3 != n4) {
            if (n3 != 0) {
                n4 = 1;
                if (n3 != n4) {
                    Bundle bundle2 = this.mExtras;
                    Objects.toString(bundle2);
                    Objects.toString(bundle);
                } else {
                    MediaBrowserCompat$CustomActionCallback mediaBrowserCompat$CustomActionCallback = this.mCallback;
                    object = this.mAction;
                    Bundle bundle3 = this.mExtras;
                    mediaBrowserCompat$CustomActionCallback.onProgressUpdate((String)object, bundle3, bundle);
                }
            } else {
                MediaBrowserCompat$CustomActionCallback mediaBrowserCompat$CustomActionCallback = this.mCallback;
                object = this.mAction;
                Bundle bundle4 = this.mExtras;
                mediaBrowserCompat$CustomActionCallback.onResult((String)object, bundle4, bundle);
            }
        } else {
            MediaBrowserCompat$CustomActionCallback mediaBrowserCompat$CustomActionCallback = this.mCallback;
            object = this.mAction;
            Bundle bundle5 = this.mExtras;
            mediaBrowserCompat$CustomActionCallback.onError((String)object, bundle5, bundle);
        }
    }
}

