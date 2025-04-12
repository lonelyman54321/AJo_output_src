/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.media.browse.MediaBrowser
 *  android.media.browse.MediaBrowser$ConnectionCallback
 *  android.media.browse.MediaBrowser$SubscriptionCallback
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Messenger
 *  android.os.Process
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat$CallbackHandler;
import android.support.v4.media.MediaBrowserCompat$ConnectionCallback;
import android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal;
import android.support.v4.media.MediaBrowserCompat$CustomActionCallback;
import android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver;
import android.support.v4.media.MediaBrowserCompat$ItemCallback;
import android.support.v4.media.MediaBrowserCompat$ItemReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl;
import android.support.v4.media.MediaBrowserCompat$SearchCallback;
import android.support.v4.media.MediaBrowserCompat$SearchResultReceiver;
import android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper;
import android.support.v4.media.MediaBrowserCompat$Subscription;
import android.support.v4.media.MediaBrowserCompat$SubscriptionCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession$Stub;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;

class MediaBrowserCompat$MediaBrowserImplApi21
implements MediaBrowserCompat$MediaBrowserImpl,
MediaBrowserCompat$MediaBrowserServiceCallbackImpl,
MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal {
    protected final MediaBrowser mBrowserFwk;
    protected Messenger mCallbacksMessenger;
    final Context mContext;
    protected final MediaBrowserCompat$CallbackHandler mHandler;
    private MediaSessionCompat$Token mMediaSessionToken;
    private Bundle mNotifyChildrenChangedOptions;
    protected final Bundle mRootHints;
    protected MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper;
    protected int mServiceVersion;
    private final Jp mSubscriptions;

    public MediaBrowserCompat$MediaBrowserImplApi21(Context context, ComponentName componentName, MediaBrowserCompat$ConnectionCallback mediaBrowserCompat$ConnectionCallback, Bundle bundle) {
        Object object;
        this.mHandler = object = new MediaBrowserCompat$CallbackHandler(this);
        this.mSubscriptions = object;
        this.mContext = context;
        if (bundle != null) {
            super(bundle);
        } else {
            super();
        }
        this.mRootHints = object;
        object.putInt("extra_client_version", 1);
        int n3 = Process.myPid();
        object.putInt("extra_calling_pid", n3);
        mediaBrowserCompat$ConnectionCallback.setInternalConnectionCallback(this);
        mediaBrowserCompat$ConnectionCallback = mediaBrowserCompat$ConnectionCallback.mConnectionCallbackFwk;
        super(context, componentName, (MediaBrowser.ConnectionCallback)mediaBrowserCompat$ConnectionCallback, (Bundle)object);
        this.mBrowserFwk = bundle;
    }

    public void connect() {
        this.mBrowserFwk.connect();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void disconnect() {
        Messenger messenger;
        MediaBrowserCompat$ServiceBinderWrapper mediaBrowserCompat$ServiceBinderWrapper = this.mServiceBinderWrapper;
        if (mediaBrowserCompat$ServiceBinderWrapper != null && (messenger = this.mCallbacksMessenger) != null) {
            try {
                mediaBrowserCompat$ServiceBinderWrapper.unregisterCallbackMessenger(messenger);
            }
            catch (RemoteException remoteException) {}
        }
        this.mBrowserFwk.disconnect();
    }

    public Bundle getExtras() {
        return this.mBrowserFwk.getExtras();
    }

    public void getItem(String object, MediaBrowserCompat$ItemCallback mediaBrowserCompat$ItemCallback) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            if (mediaBrowserCompat$ItemCallback != null) {
                Object object2 = this.mBrowserFwk;
                bl2 = object2.isConnected();
                if (!bl2) {
                    object2 = this.mHandler;
                    MediaBrowserCompat$MediaBrowserImplApi21$1 mediaBrowserCompat$MediaBrowserImplApi21$1 = new MediaBrowserCompat$MediaBrowserImplApi21$1(this, mediaBrowserCompat$ItemCallback, (String)object);
                    object2.post((Runnable)mediaBrowserCompat$MediaBrowserImplApi21$1);
                    return;
                }
                object2 = this.mServiceBinderWrapper;
                if (object2 == null) {
                    object2 = this.mHandler;
                    MediaBrowserCompat$MediaBrowserImplApi21$2 mediaBrowserCompat$MediaBrowserImplApi21$2 = new MediaBrowserCompat$MediaBrowserImplApi21$2(this, mediaBrowserCompat$ItemCallback, (String)object);
                    object2.post((Runnable)mediaBrowserCompat$MediaBrowserImplApi21$2);
                    return;
                }
                Object object3 = this.mHandler;
                object2 = new MediaBrowserCompat$ItemReceiver((String)object, mediaBrowserCompat$ItemCallback, (Handler)object3);
                object3 = this.mServiceBinderWrapper;
                Messenger messenger = this.mCallbacksMessenger;
                try {
                    ((MediaBrowserCompat$ServiceBinderWrapper)object3).getMediaItem((String)object, (ResultReceiver)object2, messenger);
                }
                catch (RemoteException remoteException) {
                    object2 = this.mHandler;
                    object3 = new MediaBrowserCompat$MediaBrowserImplApi21$3(this, mediaBrowserCompat$ItemCallback, (String)object);
                    object2.post((Runnable)object3);
                }
                return;
            }
            object = new IllegalArgumentException("cb is null");
            throw object;
        }
        object = new IllegalArgumentException("mediaId is empty");
        throw object;
    }

    public Bundle getNotifyChildrenChangedOptions() {
        return this.mNotifyChildrenChangedOptions;
    }

    public String getRoot() {
        return this.mBrowserFwk.getRoot();
    }

    public ComponentName getServiceComponent() {
        return this.mBrowserFwk.getServiceComponent();
    }

    public MediaSessionCompat$Token getSessionToken() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.mMediaSessionToken;
        if (mediaSessionCompat$Token == null) {
            this.mMediaSessionToken = mediaSessionCompat$Token = MediaSessionCompat$Token.fromToken(this.mBrowserFwk.getSessionToken());
        }
        return this.mMediaSessionToken;
    }

    public boolean isConnected() {
        return this.mBrowserFwk.isConnected();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onConnected() {
        MediaSessionCompat$Token mediaSessionCompat$Token;
        IMediaSession iMediaSession;
        int n3;
        Object object;
        Bundle bundle;
        try {
            MediaBrowser mediaBrowser = this.mBrowserFwk;
            bundle = mediaBrowser.getExtras();
            if (bundle == null) {
                return;
            }
            object = null;
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
        this.mServiceVersion = n3 = bundle.getInt("extra_service_version", 0);
        Object object2 = bundle.getBinder("extra_messenger");
        if (object2 != null) {
            Bundle bundle2 = this.mRootHints;
            object = new MediaBrowserCompat$ServiceBinderWrapper((IBinder)object2, bundle2);
            this.mServiceBinderWrapper = object;
            object = this.mHandler;
            object2 = new Messenger((Handler)object);
            this.mCallbacksMessenger = object2;
            object = this.mHandler;
            ((MediaBrowserCompat$CallbackHandler)((Object)object)).setCallbacksMessenger((Messenger)object2);
            try {
                object2 = this.mServiceBinderWrapper;
                object = this.mContext;
                bundle2 = this.mCallbacksMessenger;
                ((MediaBrowserCompat$ServiceBinderWrapper)object2).registerCallbackMessenger((Context)object, (Messenger)bundle2);
            }
            catch (RemoteException remoteException) {}
        }
        if ((iMediaSession = IMediaSession$Stub.asInterface(bundle.getBinder((String)(object2 = "extra_session_binder")))) == null) return;
        object2 = this.mBrowserFwk.getSessionToken();
        this.mMediaSessionToken = mediaSessionCompat$Token = MediaSessionCompat$Token.fromToken(object2, iMediaSession);
    }

    public void onConnectionFailed() {
    }

    public void onConnectionFailed(Messenger messenger) {
    }

    public void onConnectionSuspended() {
        this.mServiceBinderWrapper = null;
        this.mCallbacksMessenger = null;
        this.mMediaSessionToken = null;
        this.mHandler.setCallbacksMessenger(null);
    }

    public void onLoadChildren(Messenger object, String string2, List list, Bundle bundle, Bundle bundle2) {
        Messenger messenger = this.mCallbacksMessenger;
        if (messenger != object) {
            return;
        }
        object = (MediaBrowserCompat$Subscription)this.mSubscriptions.get(string2);
        if (object == null) {
            object = MediaBrowserCompat.EXTRA_PAGE;
            return;
        }
        if ((object = ((MediaBrowserCompat$Subscription)object).getCallback(bundle)) != null) {
            messenger = null;
            if (bundle == null) {
                if (list == null) {
                    ((MediaBrowserCompat$SubscriptionCallback)object).onError(string2);
                } else {
                    this.mNotifyChildrenChangedOptions = bundle2;
                    ((MediaBrowserCompat$SubscriptionCallback)object).onChildrenLoaded(string2, list);
                    this.mNotifyChildrenChangedOptions = null;
                }
            } else if (list == null) {
                ((MediaBrowserCompat$SubscriptionCallback)object).onError(string2, bundle);
            } else {
                this.mNotifyChildrenChangedOptions = bundle2;
                ((MediaBrowserCompat$SubscriptionCallback)object).onChildrenLoaded(string2, list, bundle);
                this.mNotifyChildrenChangedOptions = null;
            }
        }
    }

    public void onServiceConnected(Messenger messenger, String string2, MediaSessionCompat$Token mediaSessionCompat$Token, Bundle bundle) {
    }

    public void search(String object, Bundle bundle, MediaBrowserCompat$SearchCallback mediaBrowserCompat$SearchCallback) {
        boolean bl2 = this.isConnected();
        if (bl2) {
            Object object2 = this.mServiceBinderWrapper;
            if (object2 == null) {
                object2 = this.mHandler;
                MediaBrowserCompat$MediaBrowserImplApi21$4 mediaBrowserCompat$MediaBrowserImplApi21$4 = new MediaBrowserCompat$MediaBrowserImplApi21$4(this, mediaBrowserCompat$SearchCallback, (String)object, bundle);
                object2.post((Runnable)mediaBrowserCompat$MediaBrowserImplApi21$4);
                return;
            }
            Object object3 = this.mHandler;
            object2 = new MediaBrowserCompat$SearchResultReceiver((String)object, bundle, mediaBrowserCompat$SearchCallback, (Handler)object3);
            object3 = this.mServiceBinderWrapper;
            Messenger messenger = this.mCallbacksMessenger;
            try {
                ((MediaBrowserCompat$ServiceBinderWrapper)object3).search((String)object, bundle, (ResultReceiver)object2, messenger);
            }
            catch (RemoteException remoteException) {
                object2 = this.mHandler;
                object3 = new MediaBrowserCompat$MediaBrowserImplApi21$5(this, mediaBrowserCompat$SearchCallback, (String)object, bundle);
                object2.post((Runnable)object3);
            }
            return;
        }
        object = new IllegalStateException("search() called while not connected");
        throw object;
    }

    public void sendCustomAction(String string2, Bundle bundle, MediaBrowserCompat$CustomActionCallback object) {
        boolean bl2 = this.isConnected();
        if (bl2) {
            block6: {
                Object object2;
                Object object3 = this.mServiceBinderWrapper;
                if (object3 == null && object != null) {
                    object3 = this.mHandler;
                    object2 = new MediaBrowserCompat$MediaBrowserImplApi21$6(this, (MediaBrowserCompat$CustomActionCallback)object, string2, bundle);
                    object3.post((Runnable)object2);
                }
                object2 = this.mHandler;
                object3 = new MediaBrowserCompat$CustomActionResultReceiver(string2, bundle, (MediaBrowserCompat$CustomActionCallback)object, (Handler)object2);
                object2 = this.mServiceBinderWrapper;
                Messenger messenger = this.mCallbacksMessenger;
                try {
                    ((MediaBrowserCompat$ServiceBinderWrapper)object2).sendCustomAction(string2, bundle, (ResultReceiver)object3, messenger);
                }
                catch (RemoteException remoteException) {
                    Objects.toString(bundle);
                    if (object == null) break block6;
                    object3 = this.mHandler;
                    object2 = new MediaBrowserCompat$MediaBrowserImplApi21$7(this, (MediaBrowserCompat$CustomActionCallback)object, string2, bundle);
                    object3.post((Runnable)object2);
                }
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot send a custom action (");
        stringBuilder.append(string2);
        stringBuilder.append(") with extras ");
        stringBuilder.append(bundle);
        stringBuilder.append(" because the browser is not connected to the service.");
        string2 = stringBuilder.toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void subscribe(String string2, Bundle object, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
        void var2_5;
        IBinder iBinder;
        Jp jp;
        Object object2 = (MediaBrowserCompat$Subscription)this.mSubscriptions.get(string2);
        if (object2 == null) {
            object2 = new MediaBrowserCompat$Subscription();
            jp = this.mSubscriptions;
            jp.put(string2, object2);
        }
        iBinder.setSubscription((MediaBrowserCompat$Subscription)object2);
        if (object == null) {
            Object var2_3 = null;
        } else {
            Jp jp2 = jp = new Bundle(object);
        }
        ((MediaBrowserCompat$Subscription)object2).putCallback((Bundle)var2_5, (MediaBrowserCompat$SubscriptionCallback)iBinder);
        object2 = this.mServiceBinderWrapper;
        if (object2 == null) {
            MediaBrowser mediaBrowser = this.mBrowserFwk;
            iBinder = iBinder.mSubscriptionCallbackFwk;
            mediaBrowser.subscribe(string2, (MediaBrowser.SubscriptionCallback)iBinder);
            return;
        }
        try {
            iBinder = iBinder.mToken;
        }
        catch (RemoteException remoteException) {
            return;
        }
        jp = this.mCallbacksMessenger;
        ((MediaBrowserCompat$ServiceBinderWrapper)object2).addSubscription(string2, iBinder, (Bundle)var2_5, (Messenger)jp);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unsubscribe(String var1_1, MediaBrowserCompat$SubscriptionCallback var2_2) {
        block10: {
            block8: {
                block9: {
                    var3_3 = (MediaBrowserCompat$Subscription)this.mSubscriptions.get(var1_1);
                    if (var3_3 == null) {
                        return;
                    }
                    var4_4 = this.mServiceBinderWrapper;
                    if (var4_4 != null) break block8;
                    if (var2_2 != null) break block9;
                    var4_4 = this.mBrowserFwk;
                    var4_4.unsubscribe(var1_1);
                    break block10;
                }
                var4_4 = var3_3.getCallbacks();
                var5_5 = var3_3.getOptionsList();
                for (var6_8 = var4_4.size() + -1; var6_8 >= 0; var6_8 += -1) {
                    var7_11 = var4_4.get(var6_8);
                    if (var7_11 != var2_2) continue;
                    var4_4.remove(var6_8);
                    var5_5.remove(var6_8);
                }
                var8_13 = var4_4.size();
                if (var8_13 != 0) break block10;
                var4_4 = this.mBrowserFwk;
                var4_4.unsubscribe(var1_1);
                break block10;
            }
            if (var2_2 != null) ** GOTO lbl33
            try {
                var5_6 = this.mCallbacksMessenger;
                var6_9 = false;
                var4_4.removeSubscription(var1_1, null, var5_6);
lbl33:
                // 1 sources

                var4_4 = var3_3.getCallbacks();
                var5_7 = var3_3.getOptionsList();
            }
            catch (RemoteException v0) {}
            break block10;
            for (var6_10 = var4_4.size() + -1; var6_10 >= 0; var6_10 += -1) {
                var7_12 /* !! */  = var4_4.get(var6_10);
                if (var7_12 /* !! */  != var2_2) continue;
                {
                    var7_12 /* !! */  = this.mServiceBinderWrapper;
                    var9_14 = var2_2.mToken;
                    var10_15 = this.mCallbacksMessenger;
                    var7_12 /* !! */ .removeSubscription(var1_1, var9_14, var10_15);
                    var4_4.remove(var6_10);
                    var5_7.remove(var6_10);
                }
            }
        }
        var11_16 = var3_3.isEmpty();
        if (var11_16 || var2_2 == null) {
            var2_2 = this.mSubscriptions;
            var2_2.remove(var1_1);
        }
    }
}

