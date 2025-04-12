/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.session.MediaController$TransportControls
 *  android.net.Uri
 *  android.os.Bundle
 */
package android.support.v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.MediaControllerCompat$TransportControlsApi21;

class MediaControllerCompat$TransportControlsApi23
extends MediaControllerCompat$TransportControlsApi21 {
    public MediaControllerCompat$TransportControlsApi23(MediaController.TransportControls transportControls) {
        super(transportControls);
    }

    public void playFromUri(Uri uri, Bundle bundle) {
        ZL1.a(this.mControlsFwk, uri, bundle);
    }
}

