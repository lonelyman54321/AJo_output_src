/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package android.support.v4.media;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2;
import java.util.Objects;

class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection
implements ServiceConnection {
    final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase this$0;

    public MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase) {
        this.this$0 = mediaBrowserCompat$MediaBrowserImplBase;
    }

    private void postOrRun(Runnable runnable2) {
        Thread thread2;
        Object object = Thread.currentThread();
        if (object == (thread2 = this.this$0.mHandler.getLooper().getThread())) {
            runnable2.run();
        } else {
            object = this.this$0.mHandler;
            object.post(runnable2);
        }
    }

    public boolean isCurrent(String object) {
        boolean bl2;
        object = this.this$0;
        MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection = ((MediaBrowserCompat$MediaBrowserImplBase)object).mServiceConnection;
        boolean bl3 = true;
        if (mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection == this && (bl2 = ((MediaBrowserCompat$MediaBrowserImplBase)object).mState) && bl2 != bl3) {
            return bl3;
        }
        bl2 = ((MediaBrowserCompat$MediaBrowserImplBase)object).mState;
        if (bl2 && bl2 != bl3) {
            Objects.toString(((MediaBrowserCompat$MediaBrowserImplBase)object).mServiceComponent);
            object = this.this$0.mServiceConnection;
            Objects.toString(object);
            this.toString();
        }
        return false;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1 mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1 = new MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1(this, componentName, iBinder);
        this.postOrRun(mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2 mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2 = new MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2(this, componentName);
        this.postOrRun(mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2);
    }
}

