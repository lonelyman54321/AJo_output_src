/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Messenger
 *  android.os.RemoteException
 */
package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection;
import android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper;
import java.util.Objects;

class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1
implements Runnable {
    final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1;
    final /* synthetic */ IBinder val$binder;
    final /* synthetic */ ComponentName val$name;

    public MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1(MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection, ComponentName componentName, IBinder iBinder) {
        this.this$1 = mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection;
        this.val$name = componentName;
        this.val$binder = iBinder;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        block5: {
            var1_1 = MediaBrowserCompat.DEBUG;
            if (var1_1) {
                Objects.toString(this.val$name);
                Objects.toString(this.val$binder);
                var2_2 = this.this$1.this$0;
                var2_2.dump();
            }
            if (!(var4_4 = (var2_2 = this.this$1).isCurrent((String)(var3_3 = "onServiceConnected")))) {
                return;
            }
            var2_2 = this.this$1.this$0;
            var5_5 /* !! */  = this.val$binder;
            var6_6 = var2_2.mRootHints;
            var2_2.mServiceBinderWrapper = var3_3 = new MediaBrowserCompat$ServiceBinderWrapper(var5_5 /* !! */ , var6_6);
            var2_2 = this.this$1.this$0;
            var5_5 /* !! */  = this.this$1.this$0.mHandler;
            var3_3 = new Messenger((Handler)var5_5 /* !! */ );
            var2_2.mCallbacksMessenger = var3_3;
            var2_2 = this.this$1.this$0;
            var3_3 = var2_2.mHandler;
            var2_2 = var2_2.mCallbacksMessenger;
            var3_3.setCallbacksMessenger((Messenger)var2_2);
            var2_2 = this.this$1.this$0;
            var2_2.mState = var7_7 = 2;
            if (!var1_1) ** GOTO lbl-1000
            try {
                var2_2.dump();
            }
            catch (RemoteException v0) {
                break block5;
            }
lbl-1000:
            // 2 sources

            {
                var8_8 = this.this$1;
                var8_8 = var8_8.this$0;
                var2_2 = var8_8.mServiceBinderWrapper;
                var3_3 = var8_8.mContext;
                var8_8 = var8_8.mCallbacksMessenger;
                var2_2.connect((Context)var3_3, (Messenger)var8_8);
                return;
            }
        }
        var8_9 = this.this$1.this$0.mServiceComponent;
        Objects.toString(var8_9);
        var1_1 = MediaBrowserCompat.DEBUG;
        if (var1_1 == false) return;
        var8_9 = this.this$1.this$0;
        var8_9.dump();
    }
}

