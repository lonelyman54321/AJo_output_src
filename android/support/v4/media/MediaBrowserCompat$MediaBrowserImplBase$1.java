/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Messenger
 */
package android.support.v4.media;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat$ConnectionCallback;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection;
import android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper;
import java.util.Objects;

class MediaBrowserCompat$MediaBrowserImplBase$1
implements Runnable {
    final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase this$0;

    public MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat$MediaBrowserImplBase mediaBrowserImplBase) {
        this.this$0 = mediaBrowserImplBase;
    }

    public void run() {
        Object object;
        Object object2 = this.this$0;
        int n3 = ((MediaBrowserCompat$MediaBrowserImplBase)object2).mState;
        if (n3 == 0) {
            return;
        }
        ((MediaBrowserCompat$MediaBrowserImplBase)object2).mState = 2;
        n3 = (int)(MediaBrowserCompat.DEBUG ? 1 : 0);
        if (n3 != 0 && (object = ((MediaBrowserCompat$MediaBrowserImplBase)object2).mServiceConnection) != null) {
            object = new StringBuilder("mServiceConnection should be null. Instead it is ");
            MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection = this.this$0.mServiceConnection;
            ((StringBuilder)object).append(mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection);
            object = ((StringBuilder)object).toString();
            object2 = new RuntimeException((String)object);
            throw object2;
        }
        object = ((MediaBrowserCompat$MediaBrowserImplBase)object2).mServiceBinderWrapper;
        if (object == null) {
            object2 = ((MediaBrowserCompat$MediaBrowserImplBase)object2).mCallbacksMessenger;
            if (object2 == null) {
                boolean bl2;
                MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection;
                object2 = new Intent("android.media.browse.MediaBrowserService");
                object = this.this$0.mServiceComponent;
                object2.setComponent((ComponentName)object);
                object = this.this$0;
                ((MediaBrowserCompat$MediaBrowserImplBase)object).mServiceConnection = mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection = new MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection((MediaBrowserCompat$MediaBrowserImplBase)object);
                object = this.this$0;
                mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection = ((MediaBrowserCompat$MediaBrowserImplBase)object).mContext;
                object = ((MediaBrowserCompat$MediaBrowserImplBase)object).mServiceConnection;
                int n4 = 1;
                try {
                    bl2 = mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.bindService((Intent)object2, (ServiceConnection)object, n4);
                }
                catch (Exception exception) {
                    Objects.toString(this.this$0.mServiceComponent);
                    bl2 = false;
                    object2 = null;
                }
                if (!bl2) {
                    this.this$0.forceCloseConnection();
                    object2 = this.this$0.mCallback;
                    ((MediaBrowserCompat$ConnectionCallback)object2).onConnectionFailed();
                }
                if (bl2 = MediaBrowserCompat.DEBUG) {
                    object2 = this.this$0;
                    ((MediaBrowserCompat$MediaBrowserImplBase)object2).dump();
                }
                return;
            }
            object = new StringBuilder("mCallbacksMessenger should be null. Instead it is ");
            Messenger messenger = this.this$0.mCallbacksMessenger;
            ((StringBuilder)object).append(messenger);
            object = ((StringBuilder)object).toString();
            object2 = new RuntimeException((String)object);
            throw object2;
        }
        object = new StringBuilder("mServiceBinderWrapper should be null. Instead it is ");
        MediaBrowserCompat$ServiceBinderWrapper mediaBrowserCompat$ServiceBinderWrapper = this.this$0.mServiceBinderWrapper;
        ((StringBuilder)object).append(mediaBrowserCompat$ServiceBinderWrapper);
        object = ((StringBuilder)object).toString();
        object2 = new RuntimeException((String)object);
        throw object2;
    }
}

