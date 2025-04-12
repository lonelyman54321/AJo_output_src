/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.RequestDeduplicator$GetTokenRequest;
import com.google.firebase.messaging.k;
import java.util.Map;
import java.util.concurrent.Executor;

class RequestDeduplicator {
    private final Executor executor;
    private final Map getTokenRequests;

    public RequestDeduplicator(Executor executor) {
        Jp jp = new Jp();
        this.getTokenRequests = jp;
        this.executor = executor;
    }

    public static /* synthetic */ Task a(RequestDeduplicator requestDeduplicator, String string2, Task task2) {
        return requestDeduplicator.lambda$getOrStartGetTokenRequest$0(string2, task2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Task lambda$getOrStartGetTokenRequest$0(String string2, Task task2) {
        synchronized (this) {
            Map map2 = this.getTokenRequests;
            map2.remove(string2);
            return task2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task getOrStartGetTokenRequest(String string2, RequestDeduplicator$GetTokenRequest object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                int n3;
                Object object2;
                try {
                    object2 = this.getTokenRequests;
                    object2 = object2.get(string2);
                    object2 = (Task)object2;
                    n3 = 3;
                    if (object2 != null) {
                        string2 = "FirebaseMessaging";
                        Log.isLoggable((String)string2, (int)n3);
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = "FirebaseMessaging";
                Log.isLoggable((String)object2, (int)n3);
                object = object.start();
                object2 = this.executor;
                k k2 = new k(this, string2);
                object = ((Task)object).continueWithTask((Executor)object2, k2);
                object2 = this.getTokenRequests;
                object2.put(string2, object);
                return object;
            }
            throw throwable2;
        }
    }
}

