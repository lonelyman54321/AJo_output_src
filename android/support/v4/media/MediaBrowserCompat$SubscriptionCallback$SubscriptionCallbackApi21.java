/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.browse.MediaBrowser$SubscriptionCallback
 *  android.os.Bundle
 */
package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaBrowserCompat$Subscription;
import android.support.v4.media.MediaBrowserCompat$SubscriptionCallback;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.List;

class MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi21
extends MediaBrowser.SubscriptionCallback {
    final /* synthetic */ MediaBrowserCompat$SubscriptionCallback this$0;

    public MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi21(MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
        this.this$0 = mediaBrowserCompat$SubscriptionCallback;
    }

    public List applyOptions(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        String string2 = "android.media.browse.extra.PAGE";
        int n3 = -1;
        int n4 = bundle.getInt(string2, n3);
        String string3 = "android.media.browse.extra.PAGE_SIZE";
        int n7 = bundle.getInt(string3, n3);
        if (n4 == n3 && n7 == n3) {
            return list;
        }
        n3 = n7 * n4;
        int n8 = n3 + n7;
        if (n4 >= 0 && n7 >= (n4 = 1) && n3 < (n7 = list.size())) {
            n7 = list.size();
            if (n8 > n7) {
                n8 = list.size();
            }
            return list.subList(n3, n8);
        }
        return Collections.emptyList();
    }

    public void onChildrenLoaded(String string2, List list) {
        Object object = this.this$0.mSubscriptionRef;
        object = object == null ? null : (MediaBrowserCompat$Subscription)((Reference)object).get();
        if (object == null) {
            object = this.this$0;
            list = MediaBrowserCompat$MediaItem.fromMediaItemList(list);
            ((MediaBrowserCompat$SubscriptionCallback)object).onChildrenLoaded(string2, list);
        } else {
            int n3;
            list = MediaBrowserCompat$MediaItem.fromMediaItemList(list);
            List list2 = ((MediaBrowserCompat$Subscription)object).getCallbacks();
            object = ((MediaBrowserCompat$Subscription)object).getOptionsList();
            for (int i3 = 0; i3 < (n3 = list2.size()); ++i3) {
                Object object2 = (Bundle)object.get(i3);
                if (object2 == null) {
                    object2 = this.this$0;
                    ((MediaBrowserCompat$SubscriptionCallback)object2).onChildrenLoaded(string2, list);
                    continue;
                }
                MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback = this.this$0;
                List list3 = this.applyOptions(list, (Bundle)object2);
                mediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(string2, list3, (Bundle)object2);
            }
        }
    }

    public void onError(String string2) {
        this.this$0.onError(string2);
    }
}

