/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Messenger
 */
package androidx.media;

import android.content.Context;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$b;
import androidx.media.MediaBrowserServiceCompat$c$a;
import java.util.ArrayList;

public class MediaBrowserServiceCompat$c
implements MediaBrowserServiceCompat$b {
    public final ArrayList a;
    public MediaBrowserServiceCompat$c$a b;
    public Messenger c;
    public final /* synthetic */ MediaBrowserServiceCompat d;

    public MediaBrowserServiceCompat$c(MediaBrowserServiceCompat object) {
        this.d = object;
        this.a = object;
    }

    public void onCreate() {
        MediaBrowserServiceCompat$c$a mediaBrowserServiceCompat$c$a;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.d;
        this.b = mediaBrowserServiceCompat$c$a = new MediaBrowserServiceCompat$c$a(this, (Context)mediaBrowserServiceCompat);
        mediaBrowserServiceCompat$c$a.onCreate();
    }
}

