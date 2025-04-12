/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.service.media.MediaBrowserService$Result
 */
package androidx.media;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$d$a;
import androidx.media.MediaBrowserServiceCompat$e;

public final class MediaBrowserServiceCompat$e$a
extends MediaBrowserServiceCompat$d$a {
    public final /* synthetic */ MediaBrowserServiceCompat$e c;

    public MediaBrowserServiceCompat$e$a(MediaBrowserServiceCompat$e mediaBrowserServiceCompat$e, Context context) {
        this.c = mediaBrowserServiceCompat$e;
        super(mediaBrowserServiceCompat$e, context);
    }

    public final void onLoadChildren(String object, MediaBrowserService.Result object2, Bundle object3) {
        MediaSessionCompat.ensureClassLoader(object3);
        object = this.c;
        object2 = ((MediaBrowserServiceCompat$e)object).f;
        object3 = ((MediaBrowserServiceCompat)((Object)object2)).c;
        ((MediaBrowserServiceCompat)((Object)object2)).b();
        ((Object)((Object)((MediaBrowserServiceCompat$e)object).f)).getClass();
    }
}

