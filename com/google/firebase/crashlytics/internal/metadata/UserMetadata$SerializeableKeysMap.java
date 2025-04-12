/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.metadata.KeysMap;
import com.google.firebase.crashlytics.internal.metadata.MetaDataStore;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.metadata.a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

class UserMetadata$SerializeableKeysMap {
    private final boolean isInternal;
    final AtomicMarkableReference map;
    private final AtomicReference queuedSerializer;
    final /* synthetic */ UserMetadata this$0;

    /*
     * WARNING - void declaration
     */
    public UserMetadata$SerializeableKeysMap(UserMetadata object, boolean bl2) {
        AtomicMarkableReference<Object> atomicMarkableReference;
        void var2_5;
        this.this$0 = object;
        object = new AtomicReference(null);
        this.queuedSerializer = object;
        this.isInternal = bl2;
        if (bl2) {
            int n3 = 8192;
        } else {
            int n4 = 1024;
        }
        object = new KeysMap(64, (int)var2_5);
        this.map = atomicMarkableReference = new AtomicMarkableReference<Object>(object, false);
    }

    public static /* synthetic */ void a(UserMetadata$SerializeableKeysMap userMetadata$SerializeableKeysMap) {
        userMetadata$SerializeableKeysMap.lambda$scheduleSerializationTaskIfNeeded$0();
    }

    private /* synthetic */ void lambda$scheduleSerializationTaskIfNeeded$0() {
        this.queuedSerializer.set(null);
        this.serializeIfMarked();
    }

    private void scheduleSerializationTaskIfNeeded() {
        Object var3_3;
        a a2 = new a(this);
        Object object = this.queuedSerializer;
        do {
            var3_3 = null;
            boolean bl2 = ((AtomicReference)object).compareAndSet(null, a2);
            if (!bl2) continue;
            object = UserMetadata.access$000((UserMetadata)this.this$0).diskWrite;
            ((CrashlyticsWorker)object).submit(a2);
            break;
        } while ((var3_3 = ((AtomicReference)object).get()) == null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void serializeIfMarked() {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        block5: {
            boolean bl3;
            block4: {
                // MONITORENTER : this
                object3 = this.map;
                bl3 = ((AtomicMarkableReference)object3).isMarked();
                if (!bl3) break block4;
                object3 = this.map;
                object3 = ((AtomicMarkableReference)object3).getReference();
                object3 = (KeysMap)object3;
                object3 = ((KeysMap)object3).getKeys();
                object2 = this.map;
                object = ((AtomicMarkableReference)object2).getReference();
                object = (KeysMap)object;
                bl2 = false;
                ((AtomicMarkableReference)object2).set(object, false);
                break block5;
            }
            bl3 = false;
            object3 = null;
        }
        // MONITOREXIT : this
        if (object3 == null) return;
        object2 = UserMetadata.access$200(this.this$0);
        object = UserMetadata.access$100(this.this$0);
        bl2 = this.isInternal;
        ((MetaDataStore)object2).writeKeyData((String)object, (Map)object3, bl2);
    }

    public Map getKeys() {
        return ((KeysMap)this.map.getReference()).getKeys();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean setKey(String object, String object2) {
        synchronized (this) {
            try {
                Object object3 = this.map;
                object3 = ((AtomicMarkableReference)object3).getReference();
                object3 = (KeysMap)object3;
                boolean bl2 = ((KeysMap)object3).setKey((String)object, (String)object2);
                if (!bl2) {
                    return false;
                }
                object = this.map;
                object2 = ((AtomicMarkableReference)object).getReference();
                object2 = (KeysMap)object2;
                boolean bl3 = true;
                ((AtomicMarkableReference)object).set(object2, bl3);
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl15 : MonitorExitStatement: MONITOREXIT : this
                this.scheduleSerializationTaskIfNeeded();
                return bl3;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setKeys(Map object) {
        synchronized (this) {
            Object object2 = this.map;
            object2 = ((AtomicMarkableReference)object2).getReference();
            object2 = (KeysMap)object2;
            ((KeysMap)object2).setKeys((Map)object);
            object = this.map;
            object2 = ((AtomicMarkableReference)object).getReference();
            object2 = (KeysMap)object2;
            boolean bl2 = true;
            ((AtomicMarkableReference)object).set(object2, bl2);
        }
        this.scheduleSerializationTaskIfNeeded();
    }
}

