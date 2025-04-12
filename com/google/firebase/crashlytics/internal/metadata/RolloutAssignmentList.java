/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RolloutAssignmentList {
    static final String ROLLOUTS_STATE = "rolloutsState";
    private final int maxEntries;
    private final List rolloutsState;

    public RolloutAssignmentList(int n3) {
        ArrayList arrayList;
        this.rolloutsState = arrayList = new ArrayList();
        this.maxEntries = n3;
    }

    public List getReportRolloutsState() {
        int n3;
        List list = this.getRolloutAssignmentList();
        ArrayList<CrashlyticsReport$Session$Event$RolloutAssignment> arrayList = new ArrayList<CrashlyticsReport$Session$Event$RolloutAssignment>();
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            CrashlyticsReport$Session$Event$RolloutAssignment crashlyticsReport$Session$Event$RolloutAssignment = ((RolloutAssignment)list.get(i3)).toReportProto();
            arrayList.add(crashlyticsReport$Session$Event$RolloutAssignment);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List getRolloutAssignmentList() {
        synchronized (this) {
            List list = this.rolloutsState;
            List list2 = new List(list);
            return Collections.unmodifiableList(list2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean updateRolloutAssignmentList(List list) {
        Object object = "Ignored 0 entries when adding rollout assignments. Maximum allowable: ";
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    Object object2 = this.rolloutsState;
                    object2.clear();
                    int n3 = list.size();
                    int n4 = this.maxEntries;
                    if (n3 > n4) {
                        object2 = Logger.getLogger();
                        StringBuilder stringBuilder = new StringBuilder((String)object);
                        int n7 = this.maxEntries;
                        stringBuilder.append(n7);
                        object = stringBuilder.toString();
                        ((Logger)object2).w((String)object);
                        n7 = this.maxEntries;
                        n3 = 0;
                        object2 = null;
                        list = list.subList(0, n7);
                        object = this.rolloutsState;
                        return object.addAll(list);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    object = this.rolloutsState;
                    return object.addAll(list);
                }
            }
            throw throwable2;
        }
    }
}

