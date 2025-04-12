/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.browse.MediaBrowser$SubscriptionCallback
 *  android.os.Binder
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 */
package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat$Subscription;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class MediaBrowserCompat$SubscriptionCallback {
    final MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk;
    WeakReference mSubscriptionRef;
    final IBinder mToken;

    public MediaBrowserCompat$SubscriptionCallback() {
        Object object = new Binder();
        this.mToken = object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            super(this);
            this.mSubscriptionCallbackFwk = object;
        } else {
            super(this);
            this.mSubscriptionCallbackFwk = object;
        }
    }

    public void onChildrenLoaded(String string2, List list) {
    }

    public void onChildrenLoaded(String string2, List list, Bundle bundle) {
    }

    public void onError(String string2) {
    }

    public void onError(String string2, Bundle bundle) {
    }

    public void setSubscription(MediaBrowserCompat$Subscription mediaBrowserCompat$Subscription) {
        WeakReference<MediaBrowserCompat$Subscription> weakReference;
        this.mSubscriptionRef = weakReference = new WeakReference<MediaBrowserCompat$Subscription>(mediaBrowserCompat$Subscription);
    }
}

