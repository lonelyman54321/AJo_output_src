/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData;

final class AutoValue_StaticSessionData_DeviceData
extends StaticSessionData$DeviceData {
    private final int arch;
    private final int availableProcessors;
    private final long diskSpace;
    private final boolean isEmulator;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final int state;
    private final long totalRam;

    public AutoValue_StaticSessionData_DeviceData(int n3, String string2, int n4, long l2, long l3, boolean bl2, int n7, String string3, String string4) {
        this.arch = n3;
        if (string2 != null) {
            this.model = string2;
            this.availableProcessors = n4;
            this.totalRam = l2;
            this.diskSpace = l3;
            this.isEmulator = bl2;
            this.state = n7;
            if (string3 != null) {
                this.manufacturer = string3;
                if (string4 != null) {
                    this.modelClass = string4;
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Null modelClass");
                throw nullPointerException;
            }
            NullPointerException nullPointerException = new NullPointerException("Null manufacturer");
            throw nullPointerException;
        }
        NullPointerException nullPointerException = new NullPointerException("Null model");
        throw nullPointerException;
    }

    public int arch() {
        return this.arch;
    }

    public int availableProcessors() {
        return this.availableProcessors;
    }

    public long diskSpace() {
        return this.diskSpace;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof StaticSessionData$DeviceData;
        if (n3 != 0) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            String string2;
            String string3;
            n3 = this.arch;
            int n4 = ((StaticSessionData$DeviceData)(object = (StaticSessionData$DeviceData)object)).arch();
            if (n3 != n4 || (n3 = (int)((string3 = this.model).equals(string2 = ((StaticSessionData$DeviceData)object).model()) ? 1 : 0)) == 0 || (n3 = this.availableProcessors) != (n4 = ((StaticSessionData$DeviceData)object).availableProcessors()) || (n3 = (int)((l7 = (l4 = this.totalRam) - (l3 = ((StaticSessionData$DeviceData)object).totalRam())) == 0L ? 0 : (l7 < 0L ? -1 : 1))) != 0 || (n3 = (int)((l2 = (l4 = this.diskSpace) - (l3 = ((StaticSessionData$DeviceData)object).diskSpace())) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0 || (n3 = (int)(this.isEmulator ? 1 : 0)) != (n4 = (int)(((StaticSessionData$DeviceData)object).isEmulator() ? 1 : 0)) || (n3 = this.state) != (n4 = ((StaticSessionData$DeviceData)object).state()) || (n3 = (int)((string3 = this.manufacturer).equals(string2 = ((StaticSessionData$DeviceData)object).manufacturer()) ? 1 : 0)) == 0 || !(bl3 = (string3 = this.modelClass).equals(object = ((StaticSessionData$DeviceData)object).modelClass()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.arch;
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        String string2 = this.model;
        int n7 = string2.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.availableProcessors;
        n3 = (n3 ^ n7) * n4;
        long l2 = this.totalRam;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^ l3);
        n3 = (n3 ^ n10) * n4;
        l2 = this.diskSpace;
        long l4 = l2 >>> n8;
        n10 = (int)(l2 ^= l4);
        n3 = (n3 ^ n10) * n4;
        n7 = (int)(this.isEmulator ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 ^ n7) * n4;
        n7 = this.state;
        n3 = (n3 ^ n7) * n4;
        n7 = this.manufacturer.hashCode();
        n3 = (n3 ^ n7) * n4;
        n4 = this.modelClass.hashCode();
        return n3 ^ n4;
    }

    public boolean isEmulator() {
        return this.isEmulator;
    }

    public String manufacturer() {
        return this.manufacturer;
    }

    public String model() {
        return this.model;
    }

    public String modelClass() {
        return this.modelClass;
    }

    public int state() {
        return this.state;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeviceData{arch=");
        int n3 = this.arch;
        stringBuilder.append(n3);
        stringBuilder.append(", model=");
        String string2 = this.model;
        stringBuilder.append(string2);
        stringBuilder.append(", availableProcessors=");
        n3 = this.availableProcessors;
        stringBuilder.append(n3);
        stringBuilder.append(", totalRam=");
        long l2 = this.totalRam;
        stringBuilder.append(l2);
        stringBuilder.append(", diskSpace=");
        l2 = this.diskSpace;
        stringBuilder.append(l2);
        stringBuilder.append(", isEmulator=");
        n3 = (int)(this.isEmulator ? 1 : 0);
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", state=");
        n3 = this.state;
        stringBuilder.append(n3);
        stringBuilder.append(", manufacturer=");
        string2 = this.manufacturer;
        stringBuilder.append(string2);
        stringBuilder.append(", modelClass=");
        string2 = this.modelClass;
        return h30_0.a(stringBuilder, string2, "}");
    }

    public long totalRam() {
        return this.totalRam;
    }
}

