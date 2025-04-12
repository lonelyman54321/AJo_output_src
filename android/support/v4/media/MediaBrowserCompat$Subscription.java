/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$SubscriptionCallback;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserCompat$Subscription {
    private final List mCallbacks;
    private final List mOptionsList;

    public MediaBrowserCompat$Subscription() {
        ArrayList arrayList;
        this.mCallbacks = arrayList = new ArrayList();
        this.mOptionsList = arrayList = new ArrayList();
    }

    public MediaBrowserCompat$SubscriptionCallback getCallback(Bundle bundle) {
        List list;
        int n3;
        for (int i3 = 0; i3 < (n3 = (list = this.mOptionsList).size()); ++i3) {
            list = (Bundle)this.mOptionsList.get(i3);
            n3 = (int)(AL1.a((Bundle)list, bundle) ? 1 : 0);
            if (n3 == 0) continue;
            return (MediaBrowserCompat$SubscriptionCallback)this.mCallbacks.get(i3);
        }
        return null;
    }

    public List getCallbacks() {
        return this.mCallbacks;
    }

    public List getOptionsList() {
        return this.mOptionsList;
    }

    public boolean isEmpty() {
        return this.mCallbacks.isEmpty();
    }

    public void putCallback(Bundle bundle, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
        List list;
        int n3;
        for (int i3 = 0; i3 < (n3 = (list = this.mOptionsList).size()); ++i3) {
            list = (Bundle)this.mOptionsList.get(i3);
            n3 = (int)(AL1.a((Bundle)list, bundle) ? 1 : 0);
            if (n3 == 0) continue;
            this.mCallbacks.set(i3, mediaBrowserCompat$SubscriptionCallback);
            return;
        }
        this.mCallbacks.add(mediaBrowserCompat$SubscriptionCallback);
        this.mOptionsList.add(bundle);
    }
}

