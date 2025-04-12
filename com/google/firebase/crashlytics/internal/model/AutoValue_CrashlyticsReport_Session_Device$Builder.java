/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder;

final class AutoValue_CrashlyticsReport_Session_Device$Builder
extends CrashlyticsReport$Session$Device$Builder {
    private int arch;
    private int cores;
    private long diskSpace;
    private String manufacturer;
    private String model;
    private String modelClass;
    private long ram;
    private byte set$0;
    private boolean simulator;
    private int state;

    public CrashlyticsReport$Session$Device build() {
        Object object;
        String string2;
        String string3;
        String string4;
        int n3 = this.set$0;
        int n4 = 63;
        if (n3 == n4 && (string4 = this.model) != null && (string3 = this.manufacturer) != null && (string2 = this.modelClass) != null) {
            int n7 = this.arch;
            int n8 = this.cores;
            long l2 = this.ram;
            long l3 = this.diskSpace;
            boolean bl2 = this.simulator;
            int n10 = this.state;
            AutoValue_CrashlyticsReport_Session_Device autoValue_CrashlyticsReport_Session_Device = new AutoValue_CrashlyticsReport_Session_Device(n7, string4, n8, l2, l3, bl2, n10, string3, string2, null);
            return autoValue_CrashlyticsReport_Session_Device;
        }
        CharSequence charSequence = new StringBuilder();
        n4 = this.set$0 & 1;
        if (n4 == 0) {
            object = " arch";
            charSequence.append((String)object);
        }
        if ((object = this.model) == null) {
            object = " model";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 2) == 0) {
            object = " cores";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 4) == 0) {
            object = " ram";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 8) == 0) {
            object = " diskSpace";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 0x10) == 0) {
            object = " simulator";
            charSequence.append((String)object);
        }
        if ((n4 = this.set$0 & 0x20) == 0) {
            object = " state";
            charSequence.append((String)object);
        }
        if ((object = this.manufacturer) == null) {
            object = " manufacturer";
            charSequence.append((String)object);
        }
        if ((object = this.modelClass) == null) {
            object = " modelClass";
            charSequence.append((String)object);
        }
        charSequence = Gs.a("Missing required properties:", charSequence);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public CrashlyticsReport$Session$Device$Builder setArch(int n3) {
        this.arch = n3;
        n3 = (byte)(this.set$0 | 1);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Device$Builder setCores(int n3) {
        this.cores = n3;
        n3 = (byte)(this.set$0 | 2);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Device$Builder setDiskSpace(long l2) {
        byte by2;
        this.diskSpace = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 8);
        return this;
    }

    public CrashlyticsReport$Session$Device$Builder setManufacturer(String object) {
        if (object != null) {
            this.manufacturer = object;
            return this;
        }
        object = new NullPointerException("Null manufacturer");
        throw object;
    }

    public CrashlyticsReport$Session$Device$Builder setModel(String object) {
        if (object != null) {
            this.model = object;
            return this;
        }
        object = new NullPointerException("Null model");
        throw object;
    }

    public CrashlyticsReport$Session$Device$Builder setModelClass(String object) {
        if (object != null) {
            this.modelClass = object;
            return this;
        }
        object = new NullPointerException("Null modelClass");
        throw object;
    }

    public CrashlyticsReport$Session$Device$Builder setRam(long l2) {
        byte by2;
        this.ram = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 4);
        return this;
    }

    public CrashlyticsReport$Session$Device$Builder setSimulator(boolean bl2) {
        byte by2;
        this.simulator = bl2;
        this.set$0 = by2 = (byte)(this.set$0 | 0x10);
        return this;
    }

    public CrashlyticsReport$Session$Device$Builder setState(int n3) {
        this.state = n3;
        n3 = (byte)(this.set$0 | 0x20);
        this.set$0 = (byte)n3;
        return this;
    }
}

