/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

public final class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;
    private final String processName;

    public ProcessDetails(String string2, int n3, int n4, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "processName");
        this.processName = string2;
        this.pid = n3;
        this.importance = n4;
        this.isDefaultProcess = bl2;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String string2, int n3, int n4, boolean bl2, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            string2 = processDetails.processName;
        }
        if ((n8 = n7 & 2) != 0) {
            n3 = processDetails.pid;
        }
        if ((n8 = n7 & 4) != 0) {
            n4 = processDetails.importance;
        }
        if ((n7 &= 8) != 0) {
            bl2 = processDetails.isDefaultProcess;
        }
        return processDetails.copy(string2, n3, n4, bl2);
    }

    public final String component1() {
        return this.processName;
    }

    public final int component2() {
        return this.pid;
    }

    public final int component3() {
        return this.importance;
    }

    public final boolean component4() {
        return this.isDefaultProcess;
    }

    public final ProcessDetails copy(String string2, int n3, int n4, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "processName");
        ProcessDetails processDetails = new ProcessDetails(string2, n3, n4, bl2);
        return processDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ProcessDetails;
        if (n3 == 0) {
            return false;
        }
        object = (ProcessDetails)object;
        String string2 = this.processName;
        String string3 = ((ProcessDetails)object).processName;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.pid;
        int n4 = ((ProcessDetails)object).pid;
        if (n3 != n4) {
            return false;
        }
        n3 = this.importance;
        n4 = ((ProcessDetails)object).importance;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.isDefaultProcess ? 1 : 0);
        int n7 = ((ProcessDetails)object).isDefaultProcess;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    public final String getProcessName() {
        return this.processName;
    }

    public int hashCode() {
        String string2 = this.processName;
        int n3 = string2.hashCode() * 31;
        int n4 = this.pid;
        n3 = (n3 + n4) * 31;
        n4 = this.importance;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.isDefaultProcess ? 1 : 0);
        if (n4 != 0) {
            n4 = 1;
        }
        return n3 + n4;
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProcessDetails(processName=");
        String string2 = this.processName;
        stringBuilder.append(string2);
        stringBuilder.append(", pid=");
        int bl2 = this.pid;
        stringBuilder.append(bl2);
        stringBuilder.append(", importance=");
        int n3 = this.importance;
        stringBuilder.append(n3);
        stringBuilder.append(", isDefaultProcess=");
        boolean bl3 = this.isDefaultProcess;
        return AR.a(stringBuilder, bl3, ')');
    }
}

