/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zaab;
import com.google.android.gms.common.api.internal.zaac;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zaad {
    private final Map zaa;
    private final Map zab;

    public zaad() {
        Map map2 = new Map();
        map2 = Collections.synchronizedMap(map2);
        this.zaa = map2;
        map2 = new Map();
        this.zab = map2 = Collections.synchronizedMap(map2);
    }

    public static /* bridge */ /* synthetic */ Map zaa(zaad zaad2) {
        return zaad2.zaa;
    }

    public static /* bridge */ /* synthetic */ Map zab(zaad zaad2) {
        return zaad2.zab;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zah(boolean bl2, Status status) {
        boolean bl3;
        Object object;
        Object object2;
        Object object3;
        Object object4 = this.zaa;
        synchronized (object4) {
            object3 = this.zaa;
            object2 = new HashMap(object3);
        }
        object3 = this.zab;
        synchronized (object3) {
            object = this.zab;
            object4 = new HashMap(object);
        }
        object2 = ((HashMap)object2).entrySet().iterator();
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            object3 = (Map.Entry)object2.next();
            if (!bl2 && !(bl4 = ((Boolean)(object = (Boolean)object3.getValue())).booleanValue())) continue;
            object3 = (BasePendingResult)object3.getKey();
            ((BasePendingResult)object3).forceFailureUnlessReady(status);
        }
        object4 = ((HashMap)object4).entrySet().iterator();
        boolean bl5;
        while (bl5 = object4.hasNext()) {
            object2 = (Map.Entry)object4.next();
            if (!bl2 && !(bl3 = ((Boolean)(object3 = (Boolean)object2.getValue())).booleanValue())) continue;
            object2 = (TaskCompletionSource)object2.getKey();
            object3 = new ApiException(status);
            ((TaskCompletionSource)object2).trySetException((Exception)object3);
        }
        return;
    }

    public final void zac(BasePendingResult basePendingResult, boolean bl2) {
        Object object = bl2;
        this.zaa.put(basePendingResult, object);
        object = new zaab(this, basePendingResult);
        basePendingResult.addStatusListener((PendingResult$StatusListener)object);
    }

    public final void zad(TaskCompletionSource taskCompletionSource, boolean bl2) {
        Object object = bl2;
        this.zab.put(taskCompletionSource, object);
        object = taskCompletionSource.getTask();
        zaac zaac2 = new zaac(this, taskCompletionSource);
        ((Task)object).addOnCompleteListener(zaac2);
    }

    public final void zae(int n3, String object) {
        String string2;
        String string3 = "The connection to Google Play services was lost";
        StringBuilder stringBuilder = new StringBuilder(string3);
        int n4 = 1;
        if (n3 == n4) {
            string2 = " due to service disconnection.";
            stringBuilder.append(string2);
        } else {
            int n7 = 3;
            if (n3 == n7) {
                string2 = " due to dead object exception.";
                stringBuilder.append(string2);
            }
        }
        if (object != null) {
            string2 = " Last reason for disconnect: ";
            stringBuilder.append(string2);
            stringBuilder.append((String)object);
        }
        string2 = stringBuilder.toString();
        object = new Status(20, string2);
        this.zah(n4 != 0, (Status)object);
    }

    public final void zaf() {
        Status status = GoogleApiManager.zaa;
        this.zah(false, status);
    }

    public final boolean zag() {
        Map map2 = this.zaa;
        boolean bl2 = map2.isEmpty();
        return !bl2 || !(bl2 = (map2 = this.zab).isEmpty());
        {
        }
    }
}

