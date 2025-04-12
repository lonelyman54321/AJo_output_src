/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.session.MediaController$TransportControls
 */
package android.support.v4.media.session;

import android.media.session.MediaController;
import android.support.v4.media.session.MediaControllerCompat$TransportControlsApi24;

class MediaControllerCompat$TransportControlsApi29
extends MediaControllerCompat$TransportControlsApi24 {
    public MediaControllerCompat$TransportControlsApi29(MediaController.TransportControls transportControls) {
        super(transportControls);
    }

    public void setPlaybackSpeed(float f5) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object != false) {
            em1_0.a(this.mControlsFwk, f5);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("speed must not be zero");
        throw illegalArgumentException;
    }
}

