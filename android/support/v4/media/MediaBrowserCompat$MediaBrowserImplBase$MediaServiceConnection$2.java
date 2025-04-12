/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 */
package android.support.v4.media;

import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection;
import java.util.Objects;

class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2
implements Runnable {
    final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1;
    final /* synthetic */ ComponentName val$name;

    public MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2(MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection, ComponentName componentName) {
        this.this$1 = mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection;
        this.val$name = componentName;
    }

    public void run() {
        String string2;
        Object object;
        boolean bl2 = MediaBrowserCompat.DEBUG;
        if (bl2) {
            Objects.toString(this.val$name);
            this.toString();
            Objects.toString(this.this$1.this$0.mServiceConnection);
            object = this.this$1.this$0;
            ((MediaBrowserCompat$MediaBrowserImplBase)object).dump();
        }
        if (!(bl2 = ((MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection)(object = this.this$1)).isCurrent(string2 = "onServiceDisconnected"))) {
            return;
        }
        object = this.this$1.this$0;
        ((MediaBrowserCompat$MediaBrowserImplBase)object).mServiceBinderWrapper = null;
        ((MediaBrowserCompat$MediaBrowserImplBase)object).mCallbacksMessenger = null;
        ((MediaBrowserCompat$MediaBrowserImplBase)object).mHandler.setCallbacksMessenger(null);
        object = this.this$1.this$0;
        ((MediaBrowserCompat$MediaBrowserImplBase)object).mState = 4;
        ((MediaBrowserCompat$MediaBrowserImplBase)object).mCallback.onConnectionSuspended();
    }
}

