/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Messenger
 */
package com.google.firebase.sessions;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.firebase.sessions.SessionDatastore;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.SessionFirelogPublisher;
import com.google.firebase.sessions.SessionGenerator;
import com.google.firebase.sessions.SessionGenerator$Companion;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;

public final class SessionLifecycleService$MessageHandler
extends Handler {
    private final ArrayList boundClients;
    private boolean hasForegrounded;
    private long lastMsgTimeMs;

    public SessionLifecycleService$MessageHandler(Looper object) {
        Intrinsics.checkNotNullParameter(object, "looper");
        super(object);
        super();
        this.boundClients = object;
    }

    private final void broadcastSession() {
        boolean bl2;
        Object object = SessionFirelogPublisher.Companion.getInstance();
        Object object2 = SessionGenerator.Companion.getInstance().getCurrentSession();
        object.logSession((SessionDetails)object2);
        object2 = this.boundClients;
        object = new ArrayList(object2);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Messenger)object.next();
            String string2 = "it";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            this.maybeSendSessionToClient((Messenger)object2);
        }
    }

    private final void handleBackgrounding(Message message) {
        long l2;
        message.getWhen();
        this.lastMsgTimeMs = l2 = message.getWhen();
    }

    private final void handleClientBound(Message message) {
        ArrayList arrayList = this.boundClients;
        Messenger messenger = message.replyTo;
        arrayList.add(messenger);
        arrayList = message.replyTo;
        Intrinsics.checkNotNullExpressionValue(arrayList, "msg.replyTo");
        this.maybeSendSessionToClient((Messenger)arrayList);
        Objects.toString(message.replyTo);
        message.getWhen();
        this.boundClients.size();
    }

    private final void handleForegrounding(Message message) {
        long l2;
        message.getWhen();
        boolean bl2 = this.hasForegrounded;
        if (!bl2) {
            this.hasForegrounded = bl2 = true;
            this.newSession();
        } else {
            l2 = message.getWhen();
            bl2 = this.isSessionRestart(l2);
            if (bl2) {
                this.newSession();
            }
        }
        this.lastMsgTimeMs = l2 = message.getWhen();
    }

    private final boolean isSessionRestart(long l2) {
        long l3 = this.lastMsgTimeMs;
        SessionsSettings sessionsSettings = SessionsSettings.Companion.getInstance();
        long l4 = (l2 -= l3) - (l3 = a.c(sessionsSettings.getSessionRestartTimeout-UwyO8pc()));
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        return bl2;
    }

    private final void maybeSendSessionToClient(Messenger messenger) {
        boolean bl2 = this.hasForegrounded;
        if (bl2) {
            String string2 = SessionGenerator.Companion.getInstance().getCurrentSession().getSessionId();
            this.sendSessionToClient(messenger, string2);
        } else {
            String string3 = SessionDatastore.Companion.getInstance().getCurrentSessionId();
            if (string3 != null) {
                this.sendSessionToClient(messenger, string3);
            }
        }
    }

    private final void newSession() {
        Object object = SessionGenerator.Companion;
        ((SessionGenerator$Companion)object).getInstance().generateNewSession();
        this.broadcastSession();
        SessionDatastore sessionDatastore = SessionDatastore.Companion.getInstance();
        object = ((SessionGenerator$Companion)object).getInstance().getCurrentSession().getSessionId();
        sessionDatastore.updateSessionId((String)object);
    }

    private final void sendSessionToClient(Messenger messenger, String object) {
        Bundle bundle = new Bundle();
        String string2 = "SessionUpdateExtra";
        bundle.putString(string2, (String)object);
        object = null;
        int n3 = 3;
        object = Message.obtain(null, (int)n3, (int)0, (int)0);
        object.setData(bundle);
        try {
            messenger.send((Message)object);
        }
        catch (Exception exception) {
            Objects.toString(messenger);
        }
        catch (DeadObjectException deadObjectException) {
            Objects.toString(messenger);
            object = this.boundClients;
            ((ArrayList)object).remove(messenger);
        }
    }

    public void handleMessage(Message message) {
        String string2 = "msg";
        Intrinsics.checkNotNullParameter(message, string2);
        long l2 = this.lastMsgTimeMs;
        long l3 = message.getWhen();
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            message.getWhen();
            return;
        }
        int n3 = message.what;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4) {
                    message.toString();
                    super.handleMessage(message);
                } else {
                    this.handleClientBound(message);
                }
            } else {
                this.handleBackgrounding(message);
            }
        } else {
            this.handleForegrounding(message);
        }
    }
}

