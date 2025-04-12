/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$j;

class MediaBrowserServiceCompat$ConnectionRecord$1
implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat$ConnectionRecord a;

    public MediaBrowserServiceCompat$ConnectionRecord$1(MediaBrowserServiceCompat$ConnectionRecord connectionRecord) {
        this.a = connectionRecord;
    }

    public final void run() {
        MediaBrowserServiceCompat$ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord = this.a;
        Jp jp = mediaBrowserServiceCompat$ConnectionRecord.f.e;
        mediaBrowserServiceCompat$ConnectionRecord = ((MediaBrowserServiceCompat$j)mediaBrowserServiceCompat$ConnectionRecord.d).a.getBinder();
        jp.remove(mediaBrowserServiceCompat$ConnectionRecord);
    }
}

