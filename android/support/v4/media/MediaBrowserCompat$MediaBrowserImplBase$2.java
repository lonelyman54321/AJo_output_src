/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Messenger
 *  android.os.RemoteException
 */
package android.support.v4.media;

import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase;
import android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper;
import java.util.Objects;

class MediaBrowserCompat$MediaBrowserImplBase$2
implements Runnable {
    final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase this$0;

    public MediaBrowserCompat$MediaBrowserImplBase$2(MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase) {
        this.this$0 = mediaBrowserCompat$MediaBrowserImplBase;
    }

    public void run() {
        boolean bl2;
        Object object = this.this$0;
        Messenger messenger = ((MediaBrowserCompat$MediaBrowserImplBase)object).mCallbacksMessenger;
        if (messenger != null) {
            object = ((MediaBrowserCompat$MediaBrowserImplBase)object).mServiceBinderWrapper;
            try {
                ((MediaBrowserCompat$ServiceBinderWrapper)object).disconnect(messenger);
            }
            catch (RemoteException remoteException) {
                object = this.this$0.mServiceComponent;
                Objects.toString(object);
            }
        }
        object = this.this$0;
        int n3 = ((MediaBrowserCompat$MediaBrowserImplBase)object).mState;
        ((MediaBrowserCompat$MediaBrowserImplBase)object).forceCloseConnection();
        if (n3 != 0) {
            object = this.this$0;
            ((MediaBrowserCompat$MediaBrowserImplBase)object).mState = n3;
        }
        if (bl2 = MediaBrowserCompat.DEBUG) {
            object = this.this$0;
            ((MediaBrowserCompat$MediaBrowserImplBase)object).dump();
        }
    }
}

