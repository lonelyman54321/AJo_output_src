/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Messenger
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat$CallbackHandler;
import android.support.v4.media.MediaBrowserCompat$ConnectionCallback;
import android.support.v4.media.MediaBrowserCompat$CustomActionCallback;
import android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver;
import android.support.v4.media.MediaBrowserCompat$ItemCallback;
import android.support.v4.media.MediaBrowserCompat$ItemReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$1;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$2;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl;
import android.support.v4.media.MediaBrowserCompat$SearchCallback;
import android.support.v4.media.MediaBrowserCompat$SearchResultReceiver;
import android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper;
import android.support.v4.media.MediaBrowserCompat$Subscription;
import android.support.v4.media.MediaBrowserCompat$SubscriptionCallback;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class MediaBrowserCompat$MediaBrowserImplBase
implements MediaBrowserCompat$MediaBrowserImpl,
MediaBrowserCompat$MediaBrowserServiceCallbackImpl {
    static final int CONNECT_STATE_CONNECTED = 3;
    static final int CONNECT_STATE_CONNECTING = 2;
    static final int CONNECT_STATE_DISCONNECTED = 1;
    static final int CONNECT_STATE_DISCONNECTING = 0;
    static final int CONNECT_STATE_SUSPENDED = 4;
    final MediaBrowserCompat$ConnectionCallback mCallback;
    Messenger mCallbacksMessenger;
    final Context mContext;
    private Bundle mExtras;
    final MediaBrowserCompat$CallbackHandler mHandler;
    private MediaSessionCompat$Token mMediaSessionToken;
    private Bundle mNotifyChildrenChangedOptions;
    final Bundle mRootHints;
    private String mRootId;
    MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper;
    final ComponentName mServiceComponent;
    MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection;
    int mState;
    private final Jp mSubscriptions;

    public MediaBrowserCompat$MediaBrowserImplBase(Context object, ComponentName componentName, MediaBrowserCompat$ConnectionCallback mediaBrowserCompat$ConnectionCallback, Bundle bundle) {
        int n3;
        Object object2;
        this.mHandler = object2 = new MediaBrowserCompat$CallbackHandler(this);
        this.mSubscriptions = object2;
        this.mState = n3 = 1;
        if (object != null) {
            if (componentName != null) {
                if (mediaBrowserCompat$ConnectionCallback != null) {
                    this.mContext = object;
                    this.mServiceComponent = componentName;
                    this.mCallback = mediaBrowserCompat$ConnectionCallback;
                    if (bundle == null) {
                        object = null;
                    } else {
                        super(bundle);
                    }
                    this.mRootHints = object;
                    return;
                }
                super("connection callback must not be null");
                throw object;
            }
            super("service component must not be null");
            throw object;
        }
        super("context must not be null");
        throw object;
    }

    private static String getStateLabel(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            return hj0_0.a(n3, "UNKNOWN/");
                        }
                        return "CONNECT_STATE_SUSPENDED";
                    }
                    return "CONNECT_STATE_CONNECTED";
                }
                return "CONNECT_STATE_CONNECTING";
            }
            return "CONNECT_STATE_DISCONNECTED";
        }
        return "CONNECT_STATE_DISCONNECTING";
    }

    private boolean isCurrent(Messenger messenger, String string2) {
        boolean bl2;
        string2 = this.mCallbacksMessenger;
        boolean bl3 = true;
        if (string2 == messenger && (bl2 = this.mState) && bl2 != bl3) {
            return bl3;
        }
        bl2 = this.mState;
        if (bl2 && bl2 != bl3) {
            Objects.toString(this.mServiceComponent);
            messenger = this.mCallbacksMessenger;
            Objects.toString(messenger);
            this.toString();
        }
        return false;
    }

    public void connect() {
        int n3;
        int n4 = this.mState;
        if (n4 != 0 && n4 != (n3 = 1)) {
            CharSequence charSequence = new StringBuilder("connect() called while neigther disconnecting nor disconnected (state=");
            String string2 = MediaBrowserCompat$MediaBrowserImplBase.getStateLabel(this.mState);
            charSequence = h30_0.a(charSequence, string2, ")");
            IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
            throw illegalStateException;
        }
        this.mState = 2;
        MediaBrowserCompat$CallbackHandler mediaBrowserCompat$CallbackHandler = this.mHandler;
        MediaBrowserCompat$MediaBrowserImplBase$1 mediaBrowserCompat$MediaBrowserImplBase$1 = new MediaBrowserCompat$MediaBrowserImplBase$1(this);
        mediaBrowserCompat$CallbackHandler.post(mediaBrowserCompat$MediaBrowserImplBase$1);
    }

    public void disconnect() {
        this.mState = 0;
        MediaBrowserCompat$CallbackHandler mediaBrowserCompat$CallbackHandler = this.mHandler;
        MediaBrowserCompat$MediaBrowserImplBase$2 mediaBrowserCompat$MediaBrowserImplBase$2 = new MediaBrowserCompat$MediaBrowserImplBase$2(this);
        mediaBrowserCompat$CallbackHandler.post(mediaBrowserCompat$MediaBrowserImplBase$2);
    }

    public void dump() {
        Objects.toString(this.mServiceComponent);
        Objects.toString(this.mCallback);
        Objects.toString(this.mRootHints);
        MediaBrowserCompat$MediaBrowserImplBase.getStateLabel(this.mState);
        Objects.toString(this.mServiceConnection);
        Objects.toString(this.mServiceBinderWrapper);
        Objects.toString(this.mCallbacksMessenger);
        Objects.toString(this.mMediaSessionToken);
    }

    public void forceCloseConnection() {
        MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection = this.mServiceConnection;
        if (mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection != null) {
            Context context = this.mContext;
            context.unbindService((ServiceConnection)mediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection);
        }
        this.mState = 1;
        this.mServiceConnection = null;
        this.mServiceBinderWrapper = null;
        this.mCallbacksMessenger = null;
        this.mHandler.setCallbacksMessenger(null);
        this.mRootId = null;
        this.mMediaSessionToken = null;
    }

    public Bundle getExtras() {
        boolean bl2 = this.isConnected();
        if (bl2) {
            return this.mExtras;
        }
        CharSequence charSequence = new StringBuilder("getExtras() called while not connected (state=");
        String string2 = MediaBrowserCompat$MediaBrowserImplBase.getStateLabel(this.mState);
        charSequence = h30_0.a(charSequence, string2, ")");
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public void getItem(String object, MediaBrowserCompat$ItemCallback mediaBrowserCompat$ItemCallback) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            if (mediaBrowserCompat$ItemCallback != null) {
                bl2 = this.isConnected();
                if (!bl2) {
                    MediaBrowserCompat$CallbackHandler mediaBrowserCompat$CallbackHandler = this.mHandler;
                    MediaBrowserCompat$MediaBrowserImplBase$3 mediaBrowserCompat$MediaBrowserImplBase$3 = new MediaBrowserCompat$MediaBrowserImplBase$3(this, mediaBrowserCompat$ItemCallback, (String)object);
                    mediaBrowserCompat$CallbackHandler.post(mediaBrowserCompat$MediaBrowserImplBase$3);
                    return;
                }
                Object object2 = this.mHandler;
                Object object3 = new MediaBrowserCompat$ItemReceiver((String)object, mediaBrowserCompat$ItemCallback, (Handler)object2);
                object2 = this.mServiceBinderWrapper;
                Messenger messenger = this.mCallbacksMessenger;
                try {
                    ((MediaBrowserCompat$ServiceBinderWrapper)object2).getMediaItem((String)object, (ResultReceiver)object3, messenger);
                }
                catch (RemoteException remoteException) {
                    object3 = this.mHandler;
                    object2 = new MediaBrowserCompat$MediaBrowserImplBase$4(this, mediaBrowserCompat$ItemCallback, (String)object);
                    object3.post((Runnable)object2);
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
        boolean bl2 = this.isConnected();
        if (bl2) {
            return this.mRootId;
        }
        CharSequence charSequence = new StringBuilder("getRoot() called while not connected(state=");
        String string2 = MediaBrowserCompat$MediaBrowserImplBase.getStateLabel(this.mState);
        charSequence = h30_0.a(charSequence, string2, ")");
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public ComponentName getServiceComponent() {
        boolean bl2 = this.isConnected();
        if (bl2) {
            return this.mServiceComponent;
        }
        CharSequence charSequence = new StringBuilder("getServiceComponent() called while not connected (state=");
        charSequence = g30.a(this.mState, ")", charSequence);
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public MediaSessionCompat$Token getSessionToken() {
        boolean bl2 = this.isConnected();
        if (bl2) {
            return this.mMediaSessionToken;
        }
        CharSequence charSequence = new StringBuilder("getSessionToken() called while not connected(state=");
        charSequence = g30.a(this.mState, ")", charSequence);
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public boolean isConnected() {
        int n3 = this.mState;
        int n4 = 3;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public void onConnectionFailed(Messenger messenger) {
        Objects.toString(this.mServiceComponent);
        String string2 = "onConnectFailed";
        int n3 = this.isCurrent(messenger, string2);
        if (n3 == 0) {
            return;
        }
        n3 = this.mState;
        int n4 = 2;
        if (n3 != n4) {
            MediaBrowserCompat$MediaBrowserImplBase.getStateLabel(n3);
            return;
        }
        this.forceCloseConnection();
        this.mCallback.onConnectionFailed();
    }

    public void onLoadChildren(Messenger object, String string2, List list, Bundle bundle, Bundle bundle2) {
        String string3 = "onLoadChildren";
        boolean bl2 = this.isCurrent((Messenger)object, string3);
        if (!bl2) {
            return;
        }
        bl2 = MediaBrowserCompat.DEBUG;
        if (bl2) {
            object = this.mServiceComponent;
            Objects.toString(object);
        }
        if ((object = (MediaBrowserCompat$Subscription)this.mSubscriptions.get(string2)) == null) {
            return;
        }
        if ((object = ((MediaBrowserCompat$Subscription)object).getCallback(bundle)) != null) {
            string3 = null;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onServiceConnected(Messenger object, String object2, MediaSessionCompat$Token object3, Bundle object4) {
        String string2 = "onConnect";
        int n3 = this.isCurrent((Messenger)object, string2);
        if (n3 == 0) {
            return;
        }
        n3 = this.mState;
        int n4 = 2;
        if (n3 != n4) {
            MediaBrowserCompat$MediaBrowserImplBase.getStateLabel(n3);
            return;
        }
        this.mRootId = object2;
        this.mMediaSessionToken = object3;
        this.mExtras = object4;
        this.mState = 3;
        n3 = (int)(MediaBrowserCompat.DEBUG ? 1 : 0);
        if (n3 != 0) {
            this.dump();
        }
        object = this.mCallback;
        ((MediaBrowserCompat$ConnectionCallback)object).onConnected();
        try {
            boolean bl2;
            object = this.mSubscriptions;
            object = ((Jp)object).entrySet();
            object = (Jp$a)object;
            object = ((Jp$a)object).iterator();
            while (bl2 = object.hasNext()) {
                int n7;
                object2 = object.next();
                object2 = (Map.Entry)object2;
                object3 = object2.getKey();
                object3 = (String)object3;
                object2 = object2.getValue();
                object2 = (MediaBrowserCompat$Subscription)object2;
                object4 = ((MediaBrowserCompat$Subscription)object2).getCallbacks();
                object2 = ((MediaBrowserCompat$Subscription)object2).getOptionsList();
                string2 = null;
                for (n4 = 0; n4 < (n7 = object4.size()); ++n4) {
                    MediaBrowserCompat$ServiceBinderWrapper mediaBrowserCompat$ServiceBinderWrapper = this.mServiceBinderWrapper;
                    Object object5 = object4.get(n4);
                    object5 = (MediaBrowserCompat$SubscriptionCallback)object5;
                    object5 = ((MediaBrowserCompat$SubscriptionCallback)object5).mToken;
                    Object object6 = object2.get(n4);
                    object6 = (Bundle)object6;
                    Messenger messenger = this.mCallbacksMessenger;
                    mediaBrowserCompat$ServiceBinderWrapper.addSubscription((String)object3, (IBinder)object5, (Bundle)object6, messenger);
                }
            }
            return;
        }
        catch (RemoteException remoteException) {}
    }

    public void search(String object, Bundle object2, MediaBrowserCompat$SearchCallback object3) {
        boolean bl2 = this.isConnected();
        if (bl2) {
            Object object4 = this.mHandler;
            Object object5 = new MediaBrowserCompat$SearchResultReceiver((String)object, (Bundle)object2, (MediaBrowserCompat$SearchCallback)object3, (Handler)object4);
            object4 = this.mServiceBinderWrapper;
            Messenger messenger = this.mCallbacksMessenger;
            try {
                ((MediaBrowserCompat$ServiceBinderWrapper)object4).search((String)object, (Bundle)object2, (ResultReceiver)object5, messenger);
            }
            catch (RemoteException remoteException) {
                object5 = this.mHandler;
                object4 = new MediaBrowserCompat$MediaBrowserImplBase$5(this, (MediaBrowserCompat$SearchCallback)object3, (String)object, (Bundle)object2);
                object5.post((Runnable)object4);
            }
            return;
        }
        object2 = new StringBuilder("search() called while not connected (state=");
        object3 = MediaBrowserCompat$MediaBrowserImplBase.getStateLabel(this.mState);
        object2 = h30_0.a((StringBuilder)object2, (String)object3, ")");
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public void sendCustomAction(String string2, Bundle bundle, MediaBrowserCompat$CustomActionCallback object) {
        boolean bl2 = this.isConnected();
        if (bl2) {
            block5: {
                Object object2 = this.mHandler;
                Object object3 = new MediaBrowserCompat$CustomActionResultReceiver(string2, bundle, (MediaBrowserCompat$CustomActionCallback)object, (Handler)object2);
                object2 = this.mServiceBinderWrapper;
                Messenger messenger = this.mCallbacksMessenger;
                try {
                    ((MediaBrowserCompat$ServiceBinderWrapper)object2).sendCustomAction(string2, bundle, (ResultReceiver)object3, messenger);
                }
                catch (RemoteException remoteException) {
                    Objects.toString(bundle);
                    if (object == null) break block5;
                    object3 = this.mHandler;
                    object2 = new MediaBrowserCompat$MediaBrowserImplBase$6(this, (MediaBrowserCompat$CustomActionCallback)object, string2, bundle);
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void subscribe(String string2, Bundle bundle, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
        Object object;
        Object object2 = (MediaBrowserCompat$Subscription)this.mSubscriptions.get(string2);
        if (object2 == null) {
            object2 = new MediaBrowserCompat$Subscription();
            object = this.mSubscriptions;
            ((a53)object).put(string2, object2);
        }
        if (bundle == null) {
            bundle = null;
        } else {
            object = new Bundle(bundle);
            bundle = object;
        }
        ((MediaBrowserCompat$Subscription)object2).putCallback(bundle, mediaBrowserCompat$SubscriptionCallback);
        boolean bl2 = this.isConnected();
        if (!bl2) return;
        try {
            object2 = this.mServiceBinderWrapper;
            mediaBrowserCompat$SubscriptionCallback = mediaBrowserCompat$SubscriptionCallback.mToken;
            object = this.mCallbacksMessenger;
            ((MediaBrowserCompat$ServiceBinderWrapper)object2).addSubscription(string2, (IBinder)mediaBrowserCompat$SubscriptionCallback, bundle, (Messenger)object);
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unsubscribe(String var1_1, MediaBrowserCompat$SubscriptionCallback var2_2) {
        block9: {
            var3_3 = (MediaBrowserCompat$Subscription)this.mSubscriptions.get(var1_1);
            if (var3_3 == null) {
                return;
            }
            if (var2_2 != null) ** GOTO lbl14
            try {
                var4_4 = this.isConnected();
                if (var4_4) {
                    var5_5 = this.mServiceBinderWrapper;
                    var6_7 = this.mCallbacksMessenger;
                    var7_9 = false;
                    var5_5.removeSubscription(var1_1, null, var6_7);
                }
                break block9;
lbl14:
                // 1 sources

                var5_6 = var3_3.getCallbacks();
                var6_8 = var3_3.getOptionsList();
            }
            catch (RemoteException v0) {}
            break block9;
            for (var7_10 = var5_6.size() + -1; var7_10 >= 0; var7_10 += -1) {
                var8_11 /* !! */  = var5_6.get(var7_10);
                if (var8_11 /* !! */  != var2_2) continue;
                {
                    var9_12 = this.isConnected();
                    if (var9_12) {
                        var8_11 /* !! */  = this.mServiceBinderWrapper;
                        var10_13 = var2_2.mToken;
                        var11_14 = this.mCallbacksMessenger;
                        var8_11 /* !! */ .removeSubscription(var1_1, var10_13, var11_14);
                    }
                    var5_6.remove(var7_10);
                    var6_8.remove(var7_10);
                }
            }
        }
        if ((var12_15 = var3_3.isEmpty()) || var2_2 == null) {
            var2_2 = this.mSubscriptions;
            var2_2.remove(var1_1);
        }
    }
}

