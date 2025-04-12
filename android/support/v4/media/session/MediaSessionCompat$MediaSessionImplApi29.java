/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.session.MediaSession
 *  android.os.Bundle
 */
package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi28;

class MediaSessionCompat$MediaSessionImplApi29
extends MediaSessionCompat$MediaSessionImplApi28 {
    public MediaSessionCompat$MediaSessionImplApi29(Context context, String string2, qB3 qB32, Bundle bundle) {
        super(context, string2, qB32, bundle);
    }

    public MediaSessionCompat$MediaSessionImplApi29(Object object) {
        super(object);
        object = YL1.a(((MediaSession)object).getController());
        this.mSessionInfo = object;
    }

    public MediaSession createFwkMediaSession(Context context, String string2, Bundle bundle) {
        return eN1.a(context, string2, bundle);
    }
}

