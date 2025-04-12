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
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21;

class MediaSessionCompat$MediaSessionImplApi22
extends MediaSessionCompat$MediaSessionImplApi21 {
    public MediaSessionCompat$MediaSessionImplApi22(Context context, String string2, qB3 qB32, Bundle bundle) {
        super(context, string2, qB32, bundle);
    }

    public MediaSessionCompat$MediaSessionImplApi22(Object object) {
        super(object);
    }

    public void setRatingType(int n3) {
        cn1_0.a(this.mSessionFwk, n3);
    }
}

