/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.service.media.MediaBrowserService$Result
 */
package androidx.media;

import android.content.Context;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompat$c$a;
import androidx.media.MediaBrowserServiceCompat$d;
import androidx.media.MediaBrowserServiceCompat$g;

public class MediaBrowserServiceCompat$d$a
extends MediaBrowserServiceCompat$c$a {
    public final /* synthetic */ MediaBrowserServiceCompat$d b;

    public MediaBrowserServiceCompat$d$a(MediaBrowserServiceCompat$d mediaBrowserServiceCompat$d, Context context) {
        this.b = mediaBrowserServiceCompat$d;
        super(mediaBrowserServiceCompat$d, context);
    }

    public final void onLoadItem(String object, MediaBrowserService.Result object2) {
        object = new MediaBrowserServiceCompat$g((MediaBrowserService.Result)object2);
        object2 = this.b.e.c;
        ((MediaBrowserServiceCompat$g)object).a(null);
    }
}

