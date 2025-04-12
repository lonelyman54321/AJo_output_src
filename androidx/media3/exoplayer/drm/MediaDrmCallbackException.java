/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

public final class MediaDrmCallbackException
extends IOException {
    public final Map a;

    public MediaDrmCallbackException(ti0_1 ti0_12, Uri uri, Map map2, long l2, Exception exception) {
        super(exception);
        this.a = map2;
    }
}

