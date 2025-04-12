/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.BadParcelableException
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.os.Messenger
 */
package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

class MediaBrowserCompat$CallbackHandler
extends Handler {
    private final WeakReference mCallbackImplRef;
    private WeakReference mCallbacksMessengerRef;

    public MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
        WeakReference<MediaBrowserCompat$MediaBrowserServiceCallbackImpl> weakReference;
        this.mCallbackImplRef = weakReference = new WeakReference<MediaBrowserCompat$MediaBrowserServiceCallbackImpl>(mediaBrowserServiceCallbackImpl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void handleMessage(Message message) {
        int n3;
        Object object;
        MediaBrowserCompat$MediaBrowserServiceCallbackImpl mediaBrowserCompat$MediaBrowserServiceCallbackImpl;
        block7: {
            String string2;
            Object object2;
            Object object3;
            block6: {
                object3 = this.mCallbacksMessengerRef;
                if (object3 == null) return;
                if ((object3 = ((Reference)object3).get()) == null) return;
                object3 = this.mCallbackImplRef.get();
                if (object3 == null) {
                    return;
                }
                object3 = message.getData();
                MediaSessionCompat.ensureClassLoader((Bundle)object3);
                mediaBrowserCompat$MediaBrowserServiceCallbackImpl = (MediaBrowserCompat$MediaBrowserServiceCallbackImpl)this.mCallbackImplRef.get();
                object = object2 = this.mCallbacksMessengerRef.get();
                object = (Messenger)object2;
                n3 = 1;
                try {
                    int n4 = message.what;
                    string2 = "data_media_item_id";
                    if (n4 == n3) break block6;
                    int n7 = 2;
                    if (n4 != n7) {
                        n7 = 3;
                        if (n4 != n7) {
                            message.toString();
                            return;
                        }
                        object2 = "data_options";
                        Bundle bundle = object3.getBundle(object2);
                        MediaSessionCompat.ensureClassLoader(bundle);
                        object2 = "data_notify_children_changed_options";
                        Bundle bundle2 = object3.getBundle(object2);
                        MediaSessionCompat.ensureClassLoader(bundle2);
                        String string3 = object3.getString(string2);
                        object2 = "data_media_item_list";
                        ArrayList arrayList = object3.getParcelableArrayList(object2);
                        object2 = mediaBrowserCompat$MediaBrowserServiceCallbackImpl;
                        string2 = object;
                        mediaBrowserCompat$MediaBrowserServiceCallbackImpl.onLoadChildren((Messenger)object, string3, arrayList, bundle, bundle2);
                        return;
                    }
                }
                catch (BadParcelableException badParcelableException) {
                    break block7;
                }
                mediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed((Messenger)object);
                return;
            }
            object2 = "data_root_hints";
            object2 = object3.getBundle(object2);
            MediaSessionCompat.ensureClassLoader(object2);
            string2 = object3.getString(string2);
            String string4 = "data_media_session_token";
            object3 = object3.getParcelable(string4);
            object3 = (MediaSessionCompat$Token)object3;
            mediaBrowserCompat$MediaBrowserServiceCallbackImpl.onServiceConnected((Messenger)object, string2, (MediaSessionCompat$Token)object3, (Bundle)object2);
            return;
        }
        int n8 = message.what;
        if (n8 != n3) return;
        mediaBrowserCompat$MediaBrowserServiceCallbackImpl.onConnectionFailed((Messenger)object);
    }

    public void setCallbacksMessenger(Messenger messenger) {
        WeakReference<Messenger> weakReference;
        this.mCallbacksMessengerRef = weakReference = new WeakReference<Messenger>(messenger);
    }
}

