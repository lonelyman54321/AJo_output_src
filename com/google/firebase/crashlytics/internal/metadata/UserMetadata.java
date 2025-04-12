/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.KeysMap;
import com.google.firebase.crashlytics.internal.metadata.MetaDataStore;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;

public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";
    public static final int MAX_ATTRIBUTES = 64;
    public static final int MAX_ATTRIBUTE_SIZE = 1024;
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final UserMetadata$SerializeableKeysMap customKeys;
    private final UserMetadata$SerializeableKeysMap internalKeys;
    private final MetaDataStore metaDataStore;
    private final RolloutAssignmentList rolloutsState;
    private String sessionIdentifier;
    private final AtomicMarkableReference userId;

    public UserMetadata(String object, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        AtomicMarkableReference<Object> atomicMarkableReference = new AtomicMarkableReference<Object>(this, false);
        this.customKeys = atomicMarkableReference;
        atomicMarkableReference = new AtomicMarkableReference<Object>(this, true);
        this.internalKeys = atomicMarkableReference;
        atomicMarkableReference = new AtomicMarkableReference<Object>(128);
        this.rolloutsState = atomicMarkableReference;
        this.userId = atomicMarkableReference = new AtomicMarkableReference<Object>(null, false);
        this.sessionIdentifier = object;
        this.metaDataStore = object = new MetaDataStore(fileStore);
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    public static /* synthetic */ void a(UserMetadata userMetadata) {
        userMetadata.serializeUserDataIfNeeded();
    }

    public static /* synthetic */ CrashlyticsWorkers access$000(UserMetadata userMetadata) {
        return userMetadata.crashlyticsWorkers;
    }

    public static /* synthetic */ String access$100(UserMetadata userMetadata) {
        return userMetadata.sessionIdentifier;
    }

    public static /* synthetic */ MetaDataStore access$200(UserMetadata userMetadata) {
        return userMetadata.metaDataStore;
    }

    public static /* synthetic */ void b(UserMetadata userMetadata, List list) {
        userMetadata.lambda$updateRolloutsState$1(list);
    }

    public static /* synthetic */ void c(UserMetadata userMetadata, String string2, Map map2, List list) {
        userMetadata.lambda$setNewSession$0(string2, map2, list);
    }

    private /* synthetic */ void lambda$setNewSession$0(String string2, Map object, List list) {
        boolean bl2;
        boolean bl3;
        Object object2 = this.getUserId();
        if (object2 != null) {
            object2 = this.metaDataStore;
            String string3 = this.getUserId();
            ((MetaDataStore)object2).writeUserData(string2, string3);
        }
        if (!(bl3 = object.isEmpty())) {
            object2 = this.metaDataStore;
            ((MetaDataStore)object2).writeKeyData(string2, (Map)object);
        }
        if (!(bl2 = list.isEmpty())) {
            object = this.metaDataStore;
            ((MetaDataStore)object).writeRolloutState(string2, list);
        }
    }

    private /* synthetic */ void lambda$updateRolloutsState$1(List list) {
        MetaDataStore metaDataStore = this.metaDataStore;
        String string2 = this.sessionIdentifier;
        metaDataStore.writeRolloutState(string2, list);
    }

    public static UserMetadata loadFromExistingSession(String object, FileStore object2, CrashlyticsWorkers crashlyticsWorkers) {
        MetaDataStore metaDataStore = new MetaDataStore((FileStore)object2);
        UserMetadata userMetadata = new UserMetadata((String)object, (FileStore)object2, crashlyticsWorkers);
        object2 = (KeysMap)userMetadata.customKeys.map.getReference();
        Object object3 = metaDataStore.readKeyData((String)object, false);
        ((KeysMap)object2).setKeys((Map)object3);
        object2 = (KeysMap)userMetadata.internalKeys.map.getReference();
        object3 = metaDataStore.readKeyData((String)object, true);
        ((KeysMap)object2).setKeys((Map)object3);
        object2 = userMetadata.userId;
        object3 = metaDataStore.readUserId((String)object);
        ((AtomicMarkableReference)object2).set(object3, false);
        object2 = userMetadata.rolloutsState;
        object = metaDataStore.readRolloutsState((String)object);
        ((RolloutAssignmentList)object2).updateRolloutAssignmentList((List)object);
        return userMetadata;
    }

    public static String readUserId(String string2, FileStore fileStore) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        return metaDataStore.readUserId(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void serializeUserDataIfNeeded() {
        Object object = this.userId;
        synchronized (object) {
            try {
                Object object2 = this.userId;
                boolean bl2 = ((AtomicMarkableReference)object2).isMarked();
                boolean bl3 = false;
                String string2 = null;
                if (bl2) {
                    object2 = this.getUserId();
                    AtomicMarkableReference atomicMarkableReference = this.userId;
                    atomicMarkableReference.set(object2, false);
                    bl3 = true;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl16 : MonitorExitStatement: MONITOREXIT : var1_1
                if (bl3) {
                    object = this.metaDataStore;
                    string2 = this.sessionIdentifier;
                    ((MetaDataStore)object).writeUserData(string2, (String)object2);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Map getCustomKeys() {
        return this.customKeys.getKeys();
    }

    public Map getCustomKeys(Map object) {
        String string2;
        Object object2;
        boolean bl2;
        int n3 = object.isEmpty();
        if (n3 != 0) {
            return this.customKeys.getKeys();
        }
        Object object3 = this.customKeys.getKeys();
        HashMap<String, Object> hashMap = new HashMap<String, Object>((Map<String, Object>)object3);
        object = object.entrySet().iterator();
        n3 = 0;
        object3 = null;
        while (bl2 = object.hasNext()) {
            int n4;
            object2 = (Map.Entry)object.next();
            string2 = (String)object2.getKey();
            int n7 = 1024;
            string2 = KeysMap.sanitizeString(string2, n7);
            int n8 = hashMap.size();
            if (n8 >= (n4 = 64) && (n8 = (int)(hashMap.containsKey(string2) ? 1 : 0)) == 0) {
                ++n3;
                continue;
            }
            object2 = KeysMap.sanitizeString((String)object2.getValue(), n7);
            hashMap.put(string2, object2);
        }
        if (n3 > 0) {
            object = Logger.getLogger();
            string2 = "Ignored ";
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(n3);
            ((StringBuilder)object2).append(" keys when adding event specific keys. Maximum allowable: 1024");
            object3 = ((StringBuilder)object2).toString();
            ((Logger)object).w((String)object3);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Map getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public List getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    public String getUserId() {
        return (String)this.userId.getReference();
    }

    public boolean setCustomKey(String string2, String string3) {
        return this.customKeys.setKey(string2, string3);
    }

    public void setCustomKeys(Map map2) {
        this.customKeys.setKeys(map2);
    }

    public boolean setInternalKey(String string2, String string3) {
        return this.internalKeys.setKey(string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setNewSession(String string2) {
        String string3 = this.sessionIdentifier;
        synchronized (string3) {
            this.sessionIdentifier = string2;
            Object object = this.customKeys;
            object = ((UserMetadata$SerializeableKeysMap)object).getKeys();
            Object object2 = this.rolloutsState;
            object2 = ((RolloutAssignmentList)object2).getRolloutAssignmentList();
            Object object3 = this.crashlyticsWorkers;
            object3 = ((CrashlyticsWorkers)object3).diskWrite;
            Dx3 dx3 = new Dx3(this, string2, (Map)object, (List)object2);
            ((CrashlyticsWorker)object3).submit(dx3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void setUserId(String object) {
        int n3 = 1024;
        object = KeysMap.sanitizeString((String)object, n3);
        Object object2 = this.userId;
        // MONITORENTER : object2
        Object object3 = this.userId;
        object3 = ((AtomicMarkableReference)object3).getReference();
        object3 = (String)object3;
        boolean bl2 = CommonUtils.nullSafeEquals((String)object, (String)object3);
        if (bl2) {
            // MONITOREXIT : object2
            return;
        }
        object3 = this.userId;
        boolean bl3 = true;
        ((AtomicMarkableReference)object3).set(object, bl3);
        // MONITOREXIT : object2
        object = this.crashlyticsWorkers.diskWrite;
        object2 = new Ex3(this);
        ((CrashlyticsWorker)object).submit((Runnable)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean updateRolloutsState(List object) {
        RolloutAssignmentList rolloutAssignmentList = this.rolloutsState;
        synchronized (rolloutAssignmentList) {
            Throwable throwable2;
            block4: {
                Object object2;
                try {
                    object2 = this.rolloutsState;
                    boolean bl2 = ((RolloutAssignmentList)object2).updateRolloutAssignmentList((List)object);
                    if (!bl2) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = this.rolloutsState;
                object = ((RolloutAssignmentList)object).getRolloutAssignmentList();
                object2 = this.crashlyticsWorkers;
                object2 = ((CrashlyticsWorkers)object2).diskWrite;
                Cx3 cx3 = new Cx3(this, (List)object);
                ((CrashlyticsWorker)object2).submit(cx3);
                return true;
            }
            throw throwable2;
        }
    }
}

