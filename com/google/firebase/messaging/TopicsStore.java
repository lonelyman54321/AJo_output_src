/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.SharedPreferencesQueue;
import com.google.firebase.messaging.TopicOperation;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

final class TopicsStore {
    private static final String DIVIDER_QUEUE_OPERATIONS = ",";
    static final String KEY_TOPIC_OPERATIONS_QUEUE = "topic_operation_queue";
    static final String PREFERENCES = "com.google.android.gms.appid";
    private static WeakReference topicsStoreWeakReference;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;
    private SharedPreferencesQueue topicOperationsQueue;

    private TopicsStore(SharedPreferences sharedPreferences2, Executor executor) {
        this.syncExecutor = executor;
        this.sharedPreferences = sharedPreferences2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void clearCaches() {
        Class<TopicsStore> clazz = TopicsStore.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        WeakReference weakReference = topicsStoreWeakReference;
                        if (weakReference == null) break block4;
                        weakReference.clear();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static TopicsStore getInstance(Context object, Executor executor) {
        Class<TopicsStore> clazz = TopicsStore.class;
        synchronized (clazz) {
            Throwable throwable2;
            block6: {
                Object object2;
                block5: {
                    block4: {
                        try {
                            object2 = topicsStoreWeakReference;
                            if (object2 == null) break block4;
                            object2 = ((Reference)object2).get();
                            object2 = (TopicsStore)object2;
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object2 = null;
                }
                if (object2 == null) {
                    object2 = PREFERENCES;
                    object = object.getSharedPreferences((String)object2, 0);
                    object2 = new TopicsStore((SharedPreferences)object, executor);
                    super.initStore();
                    object = new WeakReference(object2);
                    topicsStoreWeakReference = object;
                }
                return object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void initStore() {
        synchronized (this) {
            Object object = this.sharedPreferences;
            String string2 = KEY_TOPIC_OPERATIONS_QUEUE;
            String string3 = DIVIDER_QUEUE_OPERATIONS;
            Executor executor = this.syncExecutor;
            object = SharedPreferencesQueue.createInstance(object, string2, string3, executor);
            this.topicOperationsQueue = object;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean addTopicOperation(TopicOperation object) {
        synchronized (this) {
            SharedPreferencesQueue sharedPreferencesQueue = this.topicOperationsQueue;
            object = ((TopicOperation)object).serialize();
            return sharedPreferencesQueue.add((String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void clearTopicOperations() {
        synchronized (this) {
            SharedPreferencesQueue sharedPreferencesQueue = this.topicOperationsQueue;
            sharedPreferencesQueue.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TopicOperation getNextTopicOperation() {
        synchronized (this) {
            Object object = this.topicOperationsQueue;
            object = ((SharedPreferencesQueue)object).peek();
            return TopicOperation.from((String)object);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List getOperations() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ArrayList arrayList;
                try {
                    Iterator iterator = this.topicOperationsQueue;
                    iterator = ((SharedPreferencesQueue)((Object)iterator)).toList();
                    int n3 = iterator.size();
                    arrayList = new ArrayList(n3);
                    iterator = iterator.iterator();
                    while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        Object object = iterator.next();
                        object = (String)object;
                        object = TopicOperation.from(object);
                        arrayList.add(object);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return arrayList;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TopicOperation pollTopicOperation() {
        synchronized (this) {
            try {
                Object object = this.topicOperationsQueue;
                object = ((SharedPreferencesQueue)object).remove();
                return TopicOperation.from((String)object);
            }
            catch (NoSuchElementException noSuchElementException) {
                return null;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean removeTopicOperation(TopicOperation object) {
        synchronized (this) {
            SharedPreferencesQueue sharedPreferencesQueue = this.topicOperationsQueue;
            object = ((TopicOperation)object).serialize();
            return sharedPreferencesQueue.remove(object);
        }
    }
}

