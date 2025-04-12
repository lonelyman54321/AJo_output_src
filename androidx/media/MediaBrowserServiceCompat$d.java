/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.media;

import android.content.Context;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$c;
import androidx.media.MediaBrowserServiceCompat$d$a;

public class MediaBrowserServiceCompat$d
extends MediaBrowserServiceCompat$c {
    public final /* synthetic */ MediaBrowserServiceCompat e;

    public MediaBrowserServiceCompat$d(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.e = mediaBrowserServiceCompat;
        super(mediaBrowserServiceCompat);
    }

    public void onCreate() {
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.e;
        MediaBrowserServiceCompat$d$a mediaBrowserServiceCompat$d$a = new MediaBrowserServiceCompat$d$a(this, (Context)mediaBrowserServiceCompat);
        this.b = mediaBrowserServiceCompat$d$a;
        mediaBrowserServiceCompat$d$a.onCreate();
    }
}

