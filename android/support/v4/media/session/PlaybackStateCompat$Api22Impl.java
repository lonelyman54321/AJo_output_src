/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.session.PlaybackState
 *  android.media.session.PlaybackState$Builder
 *  android.os.Bundle
 */
package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;

class PlaybackStateCompat$Api22Impl {
    private PlaybackStateCompat$Api22Impl() {
    }

    public static Bundle getExtras(PlaybackState playbackState) {
        return Rt2.a(playbackState);
    }

    public static void setExtras(PlaybackState.Builder builder, Bundle bundle) {
        qt2_0.a(builder, bundle);
    }
}

