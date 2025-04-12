/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.CycleDetector$1;
import com.google.firebase.components.Qualified;

class CycleDetector$Dep {
    private final Qualified anInterface;
    private final boolean set;

    private CycleDetector$Dep(Qualified qualified, boolean bl2) {
        this.anInterface = qualified;
        this.set = bl2;
    }

    public /* synthetic */ CycleDetector$Dep(Qualified qualified, boolean bl2, CycleDetector$1 cycleDetector$1) {
        this(qualified, bl2);
    }

    public static /* synthetic */ boolean access$100(CycleDetector$Dep cycleDetector$Dep) {
        return cycleDetector$Dep.set;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof CycleDetector$Dep;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            object = (CycleDetector$Dep)object;
            Qualified qualified = ((CycleDetector$Dep)object).anInterface;
            Qualified qualified2 = this.anInterface;
            bl2 = qualified.equals(qualified2);
            if (bl2 && (bl4 = ((CycleDetector$Dep)object).set) == (bl2 = this.set)) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public int hashCode() {
        int n3 = this.anInterface.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        n4 = Boolean.valueOf(this.set).hashCode();
        return n3 ^ n4;
    }
}

