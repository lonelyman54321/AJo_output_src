/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device;

final class AutoValue_CrashlyticsReport_Session_Device
extends CrashlyticsReport$Session$Device {
    private final int arch;
    private final int cores;
    private final long diskSpace;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final long ram;
    private final boolean simulator;
    private final int state;

    private AutoValue_CrashlyticsReport_Session_Device(int n3, String string2, int n4, long l2, long l3, boolean bl2, int n7, String string3, String string4) {
        this.arch = n3;
        this.model = string2;
        this.cores = n4;
        this.ram = l2;
        this.diskSpace = l3;
        this.simulator = bl2;
        this.state = n7;
        this.manufacturer = string3;
        this.modelClass = string4;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Device(int n3, String string2, int n4, long l2, long l3, boolean bl2, int n7, String string3, String string4, AutoValue_CrashlyticsReport_Session_Device$1 autoValue_CrashlyticsReport_Session_Device$1) {
        this(n3, string2, n4, l2, l3, bl2, n7, string3, string4);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof CrashlyticsReport$Session$Device;
        if (n3 != 0) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            String string2;
            String string3;
            n3 = this.arch;
            int n4 = ((CrashlyticsReport$Session$Device)(object = (CrashlyticsReport$Session$Device)object)).getArch();
            if (n3 != n4 || (n3 = (int)((string3 = this.model).equals(string2 = ((CrashlyticsReport$Session$Device)object).getModel()) ? 1 : 0)) == 0 || (n3 = this.cores) != (n4 = ((CrashlyticsReport$Session$Device)object).getCores()) || (n3 = (int)((l7 = (l4 = this.ram) - (l3 = ((CrashlyticsReport$Session$Device)object).getRam())) == 0L ? 0 : (l7 < 0L ? -1 : 1))) != 0 || (n3 = (int)((l2 = (l4 = this.diskSpace) - (l3 = ((CrashlyticsReport$Session$Device)object).getDiskSpace())) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0 || (n3 = (int)(this.simulator ? 1 : 0)) != (n4 = (int)(((CrashlyticsReport$Session$Device)object).isSimulator() ? 1 : 0)) || (n3 = this.state) != (n4 = ((CrashlyticsReport$Session$Device)object).getState()) || (n3 = (int)((string3 = this.manufacturer).equals(string2 = ((CrashlyticsReport$Session$Device)object).getManufacturer()) ? 1 : 0)) == 0 || !(bl3 = (string3 = this.modelClass).equals(object = ((CrashlyticsReport$Session$Device)object).getModelClass()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int getArch() {
        return this.arch;
    }

    public int getCores() {
        return this.cores;
    }

    public long getDiskSpace() {
        return this.diskSpace;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getModelClass() {
        return this.modelClass;
    }

    public long getRam() {
        return this.ram;
    }

    public int getState() {
        return this.state;
    }

    public int hashCode() {
        int n3 = this.arch;
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        String string2 = this.model;
        int n7 = string2.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.cores;
        n3 = (n3 ^ n7) * n4;
        long l2 = this.ram;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^ l3);
        n3 = (n3 ^ n10) * n4;
        l2 = this.diskSpace;
        long l4 = l2 >>> n8;
        n10 = (int)(l2 ^= l4);
        n3 = (n3 ^ n10) * n4;
        n7 = (int)(this.simulator ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 ^ n7) * n4;
        n7 = this.state;
        n3 = (n3 ^ n7) * n4;
        n7 = this.manufacturer.hashCode();
        n3 = (n3 ^ n7) * n4;
        n4 = this.modelClass.hashCode();
        return n3 ^ n4;
    }

    public boolean isSimulator() {
        return this.simulator;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Device{arch=");
        int n3 = this.arch;
        stringBuilder.append(n3);
        stringBuilder.append(", model=");
        String string2 = this.model;
        stringBuilder.append(string2);
        stringBuilder.append(", cores=");
        n3 = this.cores;
        stringBuilder.append(n3);
        stringBuilder.append(", ram=");
        long l2 = this.ram;
        stringBuilder.append(l2);
        stringBuilder.append(", diskSpace=");
        l2 = this.diskSpace;
        stringBuilder.append(l2);
        stringBuilder.append(", simulator=");
        n3 = (int)(this.simulator ? 1 : 0);
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
}

