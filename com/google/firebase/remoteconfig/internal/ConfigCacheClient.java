/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient$AwaitListener;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ConfigCacheClient {
    private static final Executor DIRECT_EXECUTOR;
    static final long DISK_READ_TIMEOUT_IN_SECONDS = 5L;
    private static final Map clientInstances;
    private Task cachedContainerTask;
    private final Executor executor;
    private final ConfigStorageClient storageClient;

    static {
        Object object = new HashMap();
        clientInstances = object;
        DIRECT_EXECUTOR = object = new Object();
    }

    private ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.executor = executor;
        this.storageClient = configStorageClient;
        this.cachedContainerTask = null;
    }

    public static /* synthetic */ Task a(ConfigCacheClient configCacheClient, boolean bl2, ConfigContainer configContainer, Void void_) {
        return configCacheClient.lambda$put$1(bl2, configContainer, void_);
    }

    private static Object await(Task object, long l2, TimeUnit timeUnit) {
        ConfigCacheClient$AwaitListener configCacheClient$AwaitListener = new ConfigCacheClient$AwaitListener(null);
        Executor executor = DIRECT_EXECUTOR;
        ((Task)object).addOnSuccessListener(executor, (OnSuccessListener)configCacheClient$AwaitListener);
        ((Task)object).addOnFailureListener(executor, (OnFailureListener)configCacheClient$AwaitListener);
        ((Task)object).addOnCanceledListener(executor, (OnCanceledListener)configCacheClient$AwaitListener);
        boolean bl2 = configCacheClient$AwaitListener.await(l2, timeUnit);
        if (bl2) {
            bl2 = ((Task)object).isSuccessful();
            if (bl2) {
                return ((Task)object).getResult();
            }
            object = ((Task)object).getException();
            ExecutionException executionException = new ExecutionException((Throwable)object);
            throw executionException;
        }
        object = new TimeoutException("Task await timed out.");
        throw object;
    }

    public static /* synthetic */ Void b(ConfigCacheClient configCacheClient, ConfigContainer configContainer) {
        return configCacheClient.lambda$put$0(configContainer);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void clearInstancesForTest() {
        Class<ConfigCacheClient> clazz = ConfigCacheClient.class;
        synchronized (clazz) {
            Map map2 = clientInstances;
            map2.clear();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigCacheClient getInstance(Executor object, ConfigStorageClient configStorageClient) {
        Class<ConfigCacheClient> clazz = ConfigCacheClient.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                Map map2;
                String string2;
                block4: {
                    try {
                        string2 = configStorageClient.getFileName();
                        map2 = clientInstances;
                        boolean bl2 = map2.containsKey(string2);
                        if (bl2) break block4;
                        ConfigCacheClient configCacheClient = new ConfigCacheClient((Executor)object, configStorageClient);
                        map2.put(string2, configCacheClient);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = map2.get(string2);
                return (ConfigCacheClient)object;
            }
            throw throwable2;
        }
    }

    private /* synthetic */ Void lambda$put$0(ConfigContainer configContainer) {
        return this.storageClient.write(configContainer);
    }

    private /* synthetic */ Task lambda$put$1(boolean bl2, ConfigContainer configContainer, Void void_) {
        if (bl2) {
            this.updateInMemoryConfigContainer(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void updateInMemoryConfigContainer(ConfigContainer object) {
        synchronized (this) {
            this.cachedContainerTask = object = Tasks.forResult(object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void clear() {
        synchronized (this) {
            Task task2 = null;
            this.cachedContainerTask = task2 = Tasks.forResult(null);
        }
        this.storageClient.clear();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task get() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    try {
                        object = this.cachedContainerTask;
                        if (object == null) break block4;
                        boolean bl2 = ((Task)object).isComplete();
                        if (!bl2) return this.cachedContainerTask;
                        object = this.cachedContainerTask;
                        bl2 = ((Task)object).isSuccessful();
                        if (bl2) return this.cachedContainerTask;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = this.executor;
                ConfigStorageClient configStorageClient = this.storageClient;
                Objects.requireNonNull(configStorageClient);
                m40 m402 = new m40(configStorageClient);
                this.cachedContainerTask = object = Tasks.call((Executor)object, m402);
                return this.cachedContainerTask;
            }
            throw throwable2;
        }
    }

    public ConfigContainer getBlocking() {
        return this.getBlocking(5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public ConfigContainer getBlocking(long l2) {
        boolean bl2;
        // MONITORENTER : this
        Task task2 = this.cachedContainerTask;
        if (task2 != null && (bl2 = task2.isSuccessful())) {
            Object object = this.cachedContainerTask;
            object = ((Task)object).getResult();
            object = (ConfigContainer)object;
            // MONITOREXIT : this
            return object;
        }
        try {
            task2 = this.get();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Object object = ConfigCacheClient.await(task2, l2, timeUnit);
            return (ConfigContainer)object;
        }
        catch (InterruptedException | ExecutionException | TimeoutException exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task getCachedContainerTask() {
        synchronized (this) {
            return this.cachedContainerTask;
        }
    }

    public Task put(ConfigContainer configContainer) {
        return this.put(configContainer, true);
    }

    public Task put(ConfigContainer configContainer, boolean bl2) {
        Object object = this.executor;
        Object object2 = new k40_0(this, configContainer);
        object = Tasks.call((Executor)object, (Callable)object2);
        object2 = this.executor;
        l40 l402 = new l40(this, bl2, configContainer);
        return ((Task)object).onSuccessTask((Executor)object2, l402);
    }
}

