/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.Messenger
 */
package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import com.google.firebase.sessions.SessionLifecycleClient;
import java.util.List;

public final class SessionLifecycleClient$serviceConnection$1
implements ServiceConnection {
    final /* synthetic */ SessionLifecycleClient this$0;

    public SessionLifecycleClient$serviceConnection$1(SessionLifecycleClient sessionLifecycleClient) {
        this.this$0 = sessionLifecycleClient;
    }

    public void onServiceConnected(ComponentName object, IBinder object2) {
        SessionLifecycleClient.access$getQueuedMessages$p(this.this$0).size();
        object = this.this$0;
        Messenger messenger = new Messenger(object2);
        SessionLifecycleClient.access$setService$p((SessionLifecycleClient)object, messenger);
        SessionLifecycleClient.access$setServiceBound$p(this.this$0, true);
        object = this.this$0;
        object2 = SessionLifecycleClient.access$drainQueue((SessionLifecycleClient)object);
        SessionLifecycleClient.access$sendLifecycleEvents((SessionLifecycleClient)object, (List)object2);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        SessionLifecycleClient.access$setService$p(this.this$0, null);
        SessionLifecycleClient.access$setServiceBound$p(this.this$0, false);
    }
}

