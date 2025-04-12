/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 */
package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.firebase.messaging.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

final class SharedPreferencesQueue {
    private boolean bulkOperation;
    final ArrayDeque internalQueue;
    private final String itemSeparator;
    private final String queueName;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;

    private SharedPreferencesQueue(SharedPreferences sharedPreferences2, String string2, String string3, Executor executor) {
        ArrayDeque arrayDeque;
        this.internalQueue = arrayDeque = new ArrayDeque();
        this.bulkOperation = false;
        this.sharedPreferences = sharedPreferences2;
        this.queueName = string2;
        this.itemSeparator = string3;
        this.syncExecutor = executor;
    }

    public static /* synthetic */ void a(SharedPreferencesQueue sharedPreferencesQueue) {
        sharedPreferencesQueue.syncState();
    }

    private String checkAndSyncState(String string2) {
        boolean bl2 = string2 != null;
        this.checkAndSyncState(bl2);
        return string2;
    }

    private boolean checkAndSyncState(boolean bl2) {
        boolean bl3;
        if (bl2 && !(bl3 = this.bulkOperation)) {
            this.syncStateAsync();
        }
        return bl2;
    }

    public static SharedPreferencesQueue createInstance(SharedPreferences sharedPreferences2, String string2, String string3, Executor executor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences2, string2, string3, executor);
        sharedPreferencesQueue.initQueue();
        return sharedPreferencesQueue;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void initQueue() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            Throwable throwable2;
            int n3;
            int n4;
            String[] stringArray;
            block7: {
                block6: {
                    try {
                        stringArray = this.internalQueue;
                        stringArray.clear();
                        stringArray = this.sharedPreferences;
                        String string2 = this.queueName;
                        String string3 = "";
                        stringArray = stringArray.getString(string2, string3);
                        n4 = TextUtils.isEmpty((CharSequence)stringArray);
                        if (n4 != 0 || (n4 = stringArray.contains(string2 = this.itemSeparator)) == 0) break block6;
                        string2 = this.itemSeparator;
                        n3 = -1;
                        stringArray = stringArray.split(string2, n3);
                        n4 = stringArray.length;
                        n4 = stringArray.length;
                        n3 = 0;
                        string3 = null;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                return;
            }
            throw throwable2;
            while (n3 < n4) {
                String string4 = stringArray[n3];
                boolean bl2 = TextUtils.isEmpty((CharSequence)string4);
                if (!bl2) {
                    ArrayDeque arrayDeque2 = this.internalQueue;
                    arrayDeque2.add(string4);
                }
                ++n3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void syncState() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            SharedPreferences sharedPreferences2 = this.sharedPreferences;
            sharedPreferences2 = sharedPreferences2.edit();
            String string2 = this.queueName;
            String string3 = this.serialize();
            sharedPreferences2 = sharedPreferences2.putString(string2, string3);
            sharedPreferences2.commit();
            return;
        }
    }

    private void syncStateAsync() {
        Executor executor = this.syncExecutor;
        l l2 = new l(this);
        executor.execute(l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean add(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) return false;
        Object object = this.itemSeparator;
        bl2 = string2.contains((CharSequence)object);
        if (bl2) {
            return false;
        }
        object = this.internalQueue;
        synchronized (object) {
            ArrayDeque arrayDeque = this.internalQueue;
            boolean bl3 = arrayDeque.add(string2);
            return this.checkAndSyncState(bl3);
        }
    }

    public void beginTransaction() {
        this.bulkOperation = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void beginTransactionSync() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            this.beginTransaction();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void clear() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            ArrayDeque arrayDeque2 = this.internalQueue;
            arrayDeque2.clear();
            boolean bl2 = true;
            this.checkAndSyncState(bl2);
            return;
        }
    }

    public void commitTransaction() {
        this.bulkOperation = false;
        this.syncStateAsync();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void commitTransactionSync() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            this.commitTransaction();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String peek() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            Object object = this.internalQueue;
            object = ((ArrayDeque)object).peek();
            return (String)object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String remove() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            Object object = this.internalQueue;
            object = ((ArrayDeque)object).remove();
            object = (String)object;
            return this.checkAndSyncState((String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean remove(Object object) {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            ArrayDeque arrayDeque2 = this.internalQueue;
            boolean bl2 = arrayDeque2.remove(object);
            return this.checkAndSyncState(bl2);
        }
    }

    public String serialize() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.internalQueue.iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            stringBuilder.append(string2);
            string2 = this.itemSeparator;
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String serializeSync() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            return this.serialize();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int size() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            ArrayDeque arrayDeque2 = this.internalQueue;
            return arrayDeque2.size();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List toList() {
        ArrayDeque arrayDeque = this.internalQueue;
        synchronized (arrayDeque) {
            ArrayDeque arrayDeque2 = this.internalQueue;
            return new ArrayList(arrayDeque2);
        }
    }
}

