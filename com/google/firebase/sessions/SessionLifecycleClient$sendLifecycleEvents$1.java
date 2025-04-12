/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
package com.google.firebase.sessions;

import android.os.Message;
import com.google.firebase.sessions.SessionLifecycleClient;
import com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

final class SessionLifecycleClient$sendLifecycleEvents$1
extends qg3_2
implements Function2 {
    final /* synthetic */ List $messages;
    int label;
    final /* synthetic */ SessionLifecycleClient this$0;

    public SessionLifecycleClient$sendLifecycleEvents$1(SessionLifecycleClient sessionLifecycleClient, List list, f80_0 f80_02) {
        this.this$0 = sessionLifecycleClient;
        this.$messages = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SessionLifecycleClient sessionLifecycleClient = this.this$0;
        List list = this.$messages;
        object = new SessionLifecycleClient$sendLifecycleEvents$1(sessionLifecycleClient, list, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (SessionLifecycleClient$sendLifecycleEvents$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SessionLifecycleClient$sendLifecycleEvents$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object iterator) {
        int n3 = 2;
        int n4 = 1;
        Object object = j90_0.COROUTINE_SUSPENDED;
        int n7 = this.label;
        if (n7 != 0) {
            if (n7 != n4) {
                iterator = new Iterator("call to 'resume' before 'invoke' with coroutine");
                throw iterator;
            }
            vl2_2.b(iterator);
        } else {
            vl2_2.b(iterator);
            iterator = FirebaseSessionsDependencies.INSTANCE;
            this.label = n4;
            iterator = ((FirebaseSessionsDependencies)((Object)iterator)).getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (iterator == object) {
                return object;
            }
        }
        iterator = (Map)((Object)iterator);
        boolean bl2 = iterator.isEmpty();
        if (bl2) {
            return Unit.a;
        }
        bl2 = (iterator = (Iterable)iterator.values()) instanceof Collection;
        if (bl2) {
            object = iterator;
            object = (Collection)((Object)iterator);
            bl2 = object.isEmpty();
            if (bl2) {
                return Unit.a;
            }
        }
        iterator = ((Iterable)((Object)iterator)).iterator();
        do {
            if (!(bl2 = iterator.hasNext())) return Unit.a;
        } while (!(bl2 = (object = (SessionSubscriber)iterator.next()).isDataCollectionEnabled()));
        iterator = this.this$0;
        object = this.$messages;
        iterator = SessionLifecycleClient.access$getLatestByCode((SessionLifecycleClient)((Object)iterator), (List)object, n3);
        object = this.this$0;
        List list = this.$messages;
        object = SessionLifecycleClient.access$getLatestByCode((SessionLifecycleClient)object, list, n4);
        Object[] objectArray = new Message[n3];
        n7 = 0;
        list = null;
        objectArray[0] = iterator;
        objectArray[n4] = object;
        iterator = CollectionsKt.J(xx_2.j(objectArray));
        SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1 sessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1 = new SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1();
        iterator = CollectionsKt.e0((Iterable)((Object)iterator), sessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1);
        SessionLifecycleClient sessionLifecycleClient = this.this$0;
        iterator = iterator.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Message message = (Message)iterator.next();
            SessionLifecycleClient.access$sendMessageToServer(sessionLifecycleClient, message);
        }
        return Unit.a;
    }
}

