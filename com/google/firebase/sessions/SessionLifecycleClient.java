/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.RemoteException
 */
package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler;
import com.google.firebase.sessions.SessionLifecycleClient$Companion;
import com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1;
import com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1;
import com.google.firebase.sessions.SessionLifecycleServiceBinder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;
import kotlinx.coroutines.i;

public final class SessionLifecycleClient {
    public static final SessionLifecycleClient$Companion Companion;
    private static final int MAX_QUEUED_MESSAGES = 20;
    public static final String TAG = "SessionLifecycleClient";
    private final CoroutineContext backgroundDispatcher;
    private final LinkedBlockingDeque queuedMessages;
    private Messenger service;
    private boolean serviceBound;
    private final SessionLifecycleClient$serviceConnection$1 serviceConnection;

    static {
        SessionLifecycleClient$Companion sessionLifecycleClient$Companion;
        Companion = sessionLifecycleClient$Companion = new SessionLifecycleClient$Companion(null);
    }

    public SessionLifecycleClient(CoroutineContext object) {
        Intrinsics.checkNotNullParameter(object, "backgroundDispatcher");
        this.backgroundDispatcher = object;
        object = new LinkedBlockingDeque(20);
        this.queuedMessages = object;
        this.serviceConnection = object = new SessionLifecycleClient$serviceConnection$1(this);
    }

    public static final /* synthetic */ List access$drainQueue(SessionLifecycleClient sessionLifecycleClient) {
        return sessionLifecycleClient.drainQueue();
    }

    public static final /* synthetic */ Message access$getLatestByCode(SessionLifecycleClient sessionLifecycleClient, List list, int n3) {
        return sessionLifecycleClient.getLatestByCode(list, n3);
    }

    public static final /* synthetic */ LinkedBlockingDeque access$getQueuedMessages$p(SessionLifecycleClient sessionLifecycleClient) {
        return sessionLifecycleClient.queuedMessages;
    }

    public static final /* synthetic */ i access$sendLifecycleEvents(SessionLifecycleClient sessionLifecycleClient, List list) {
        return sessionLifecycleClient.sendLifecycleEvents(list);
    }

    public static final /* synthetic */ void access$sendMessageToServer(SessionLifecycleClient sessionLifecycleClient, Message message) {
        sessionLifecycleClient.sendMessageToServer(message);
    }

    public static final /* synthetic */ void access$setService$p(SessionLifecycleClient sessionLifecycleClient, Messenger messenger) {
        sessionLifecycleClient.service = messenger;
    }

    public static final /* synthetic */ void access$setServiceBound$p(SessionLifecycleClient sessionLifecycleClient, boolean bl2) {
        sessionLifecycleClient.serviceBound = bl2;
    }

    private final List drainQueue() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final Message getLatestByCode(List iterator, int n3) {
        void var8_12;
        int n4;
        boolean bl2;
        iterator = (Iterable)((Object)iterator);
        Message message = new ArrayList();
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            Object t3;
            Object t4 = t3 = iterator.next();
            Message message2 = (Message)t3;
            n4 = message2.what;
            if (n4 != n3) continue;
            message.add(t3);
        }
        iterator = message.iterator();
        n3 = (int)(iterator.hasNext() ? 1 : 0);
        if (n3 == 0) {
            iterator = null;
            return (Message)iterator;
        }
        Object t7 = iterator.next();
        boolean bl3 = iterator.hasNext();
        if (bl3) {
            message = t7;
            message = (Message)t7;
            long l2 = message.getWhen();
            do {
                Object t9;
                Object t12 = t9 = iterator.next();
                Message message3 = (Message)t9;
                long l3 = message3.getWhen();
                long l4 = l2 - l3;
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object >= 0) continue;
                Object t14 = t9;
                l2 = l3;
            } while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0);
        }
        iterator = var8_12;
        return (Message)iterator;
    }

    private final void queueMessage(Message object) {
        LinkedBlockingDeque linkedBlockingDeque = this.queuedMessages;
        boolean bl2 = linkedBlockingDeque.offer(object);
        if (bl2) {
            int cfr_ignored_0 = ((Message)object).what;
            object = this.queuedMessages;
            ((LinkedBlockingDeque)object).size();
        } else {
            int cfr_ignored_1 = ((Message)object).what;
        }
    }

    private final void sendLifecycleEvent(int n3) {
        List list = this.drainQueue();
        Message message = Message.obtain(null, (int)n3, (int)0, (int)0);
        Intrinsics.checkNotNullExpressionValue(message, "obtain(null, messageCode, 0, 0)");
        list.add(message);
        this.sendLifecycleEvents(list);
    }

    private final i sendLifecycleEvents(List list) {
        c80 c802 = d.a(this.backgroundDispatcher);
        SessionLifecycleClient$sendLifecycleEvents$1 sessionLifecycleClient$sendLifecycleEvents$1 = new SessionLifecycleClient$sendLifecycleEvents$1(this, list, null);
        return Ae3.d(c802, null, null, sessionLifecycleClient$sendLifecycleEvents$1, 3);
    }

    private final void sendMessageToServer(Message message) {
        block4: {
            block3: {
                Messenger messenger = this.service;
                if (messenger == null) break block3;
                int cfr_ignored_0 = message.what;
                if (messenger == null) break block4;
                try {
                    messenger.send(message);
                }
                catch (RemoteException remoteException) {
                    int cfr_ignored_1 = message.what;
                    this.queueMessage(message);
                }
                break block4;
            }
            this.queueMessage(message);
        }
    }

    public final void backgrounded() {
        this.sendLifecycleEvent(2);
    }

    public final void bindToService(SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        CoroutineContext coroutineContext = this.backgroundDispatcher;
        Object object = new SessionLifecycleClient$ClientUpdateHandler(coroutineContext);
        Messenger messenger = new Messenger((Handler)object);
        object = this.serviceConnection;
        sessionLifecycleServiceBinder.bindToService(messenger, (ServiceConnection)object);
    }

    public final void foregrounded() {
        this.sendLifecycleEvent(1);
    }
}

