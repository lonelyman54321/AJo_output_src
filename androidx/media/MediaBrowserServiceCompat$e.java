/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.media;

import android.content.Context;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$d;
import androidx.media.MediaBrowserServiceCompat$e$a;

public class MediaBrowserServiceCompat$e
extends MediaBrowserServiceCompat$d {
    public final /* synthetic */ MediaBrowserServiceCompat f;

    public MediaBrowserServiceCompat$e(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.f = mediaBrowserServiceCompat;
        super(mediaBrowserServiceCompat);
    }

    public final void onCreate() {
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f;
        MediaBrowserServiceCompat$e$a mediaBrowserServiceCompat$e$a = new MediaBrowserServiceCompat$e$a(this, (Context)mediaBrowserServiceCompat);
        this.b = mediaBrowserServiceCompat$e$a;
        mediaBrowserServiceCompat$e$a.onCreate();
    }
}

