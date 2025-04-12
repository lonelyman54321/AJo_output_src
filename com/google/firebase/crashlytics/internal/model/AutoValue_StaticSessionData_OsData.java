/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData;

final class AutoValue_StaticSessionData_OsData
extends StaticSessionData$OsData {
    private final boolean isRooted;
    private final String osCodeName;
    private final String osRelease;

    public AutoValue_StaticSessionData_OsData(String object, String string2, boolean bl2) {
        if (object != null) {
            this.osRelease = object;
            if (string2 != null) {
                this.osCodeName = string2;
                this.isRooted = bl2;
                return;
            }
            object = new NullPointerException("Null osCodeName");
            throw object;
        }
        object = new NullPointerException("Null osRelease");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof StaticSessionData$OsData;
        if (bl3) {
            boolean bl4;
            String string2 = this.osRelease;
            String string3 = ((StaticSessionData$OsData)(object = (StaticSessionData$OsData)object)).osRelease();
            bl3 = string2.equals(string3);
            if (!bl3 || !(bl3 = (string2 = this.osCodeName).equals(string3 = ((StaticSessionData$OsData)object).osCodeName())) || (bl3 = this.isRooted) != (bl4 = ((StaticSessionData$OsData)object).isRooted())) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.osRelease;
        int n3 = string2.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        String string3 = this.osCodeName;
        int n7 = string3.hashCode();
        n3 = (n3 ^ n7) * n4;
        n4 = (int)(this.isRooted ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 ^ n4;
    }

    public boolean isRooted() {
        return this.isRooted;
    }

    public String osCodeName() {
        return this.osCodeName;
    }

    public String osRelease() {
        return this.osRelease;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("OsData{osRelease=");
        String string2 = this.osRelease;
        stringBuilder.append(string2);
        stringBuilder.append(", osCodeName=");
        string2 = this.osCodeName;
        stringBuilder.append(string2);
        stringBuilder.append(", isRooted=");
        boolean bl2 = this.isRooted;
        return Vm.a("}", bl2, stringBuilder);
    }
}

