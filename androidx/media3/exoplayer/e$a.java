/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.metrics.LogSessionId
 *  android.media.metrics.MediaMetricsManager
 *  android.media.metrics.PlaybackSession
 */
package androidx.media3.exoplayer;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import androidx.media3.exoplayer.e;

public final class e$a {
    public static nu2 a(Context object, e object2, boolean bl2, String string2) {
        MediaMetricsManager mediaMetricsManager = sm1_0.a(object.getSystemService("media_metrics"));
        if (mediaMetricsManager == null) {
            object = null;
        } else {
            mediaMetricsManager = CM1.a(mediaMetricsManager);
            xm1_1 xm1_12 = new xm1_1((Context)object, (PlaybackSession)mediaMetricsManager);
            object = xm1_12;
        }
        if (object == null) {
            Cx.f("MediaMetricsService unavailable.");
            object2 = sF0.a();
            object = new nu2((LogSessionId)object2, string2);
            return object;
        }
        if (bl2) {
            object2.getClass();
            object2 = ((e)object2).r;
            object2.f0((oe)object);
        }
        object = JM1.a(object.c);
        object2 = new nu2((LogSessionId)object, string2);
        return object2;
    }
}

