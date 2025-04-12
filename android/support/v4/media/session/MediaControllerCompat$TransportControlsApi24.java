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
import android.support.v4.media.session.MediaControllerCompat$TransportControlsApi23;

class MediaControllerCompat$TransportControlsApi24
extends MediaControllerCompat$TransportControlsApi23 {
    public MediaControllerCompat$TransportControlsApi24(MediaController.TransportControls transportControls) {
        super(transportControls);
    }

    public void prepare() {
        dm1_0.a(this.mControlsFwk);
    }

    public void prepareFromMediaId(String string2, Bundle bundle) {
        am1_0.a(this.mControlsFwk, string2, bundle);
    }

    public void prepareFromSearch(String string2, Bundle bundle) {
        bm1_0.a(this.mControlsFwk, string2, bundle);
    }

    public void prepareFromUri(Uri uri, Bundle bundle) {
        cm1_0.a(this.mControlsFwk, uri, bundle);
    }
}

