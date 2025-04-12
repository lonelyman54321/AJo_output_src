/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class RolloutsStateSubscriptionsHandler {
    private ConfigCacheClient activatedConfigsCache;
    private Executor executor;
    private RolloutsStateFactory rolloutsStateFactory;
    private Set subscribers;

    public RolloutsStateSubscriptionsHandler(ConfigCacheClient configCacheClient, RolloutsStateFactory rolloutsStateFactory, Executor executor) {
        Object object = new ConcurrentHashMap();
        this.subscribers = object = Collections.newSetFromMap(object);
        this.activatedConfigsCache = configCacheClient;
        this.rolloutsStateFactory = rolloutsStateFactory;
        this.executor = executor;
    }

    public static /* synthetic */ void a(RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler, Task task2, RolloutsStateSubscriber rolloutsStateSubscriber, ConfigContainer configContainer) {
        rolloutsStateSubscriptionsHandler.lambda$registerRolloutsStateSubscriber$1(task2, rolloutsStateSubscriber, configContainer);
    }

    public static /* synthetic */ void b(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState) {
        rolloutsStateSubscriber.onRolloutsStateChanged(rolloutsState);
    }

    public static /* synthetic */ void c(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState) {
        rolloutsStateSubscriber.onRolloutsStateChanged(rolloutsState);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$registerRolloutsStateSubscriber$1(Task object, RolloutsStateSubscriber rolloutsStateSubscriber, ConfigContainer object2) {
        try {
            object = ((Task)object).getResult();
            object = (ConfigContainer)object;
            if (object == null) return;
            object2 = this.rolloutsStateFactory;
            object = ((RolloutsStateFactory)object2).getActiveRolloutsState((ConfigContainer)object);
            object2 = this.executor;
            int n3 = 1;
            M50 m50 = new M50(n3, rolloutsStateSubscriber, object);
            object2.execute(m50);
            return;
        }
        catch (FirebaseRemoteConfigException firebaseRemoteConfigException) {
            return;
        }
    }

    public void publishActiveRolloutsState(ConfigContainer object) {
        block13: {
            Iterator iterator = this.rolloutsStateFactory;
            object = ((RolloutsStateFactory)((Object)iterator)).getActiveRolloutsState((ConfigContainer)object);
            iterator = this.subscribers;
            try {
                iterator = iterator.iterator();
            }
            catch (FirebaseRemoteConfigException firebaseRemoteConfigException) {}
            while (true) {
                boolean bl2 = iterator.hasNext();
                if (!bl2) break block13;
                break;
            }
            {
                Object object2 = iterator.next();
                object2 = (RolloutsStateSubscriber)object2;
                Executor executor = this.executor;
                int n3 = 1;
                xa0_0 xa0_02 = new xa0_0(n3, object2, object);
                executor.execute(xa0_02);
                continue;
            }
        }
    }

    public void registerRolloutsStateSubscriber(RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.subscribers.add(rolloutsStateSubscriber);
        Task task2 = this.activatedConfigsCache.get();
        Executor executor = this.executor;
        dp2_0 dp2_02 = new dp2_0(this, task2, rolloutsStateSubscriber);
        task2.addOnSuccessListener(executor, (OnSuccessListener)dp2_02);
    }
}

