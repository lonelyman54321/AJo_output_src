/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;

class MediaControllerCompat$MediaControllerImplApi29
extends MediaControllerCompat$MediaControllerImplApi21 {
    public MediaControllerCompat$MediaControllerImplApi29(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        super(context, mediaSessionCompat$Token);
    }

    public Bundle getSessionInfo() {
        Bundle bundle = this.mSessionInfo;
        if (bundle != null) {
            Bundle bundle2 = this.mSessionInfo;
            bundle = new Bundle(bundle2);
            return bundle;
        }
        this.mSessionInfo = bundle = YL1.a(this.mControllerFwk);
        this.mSessionInfo = bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        } else {
            Bundle bundle3 = this.mSessionInfo;
            bundle = new Bundle(bundle3);
        }
        return bundle;
    }
}

