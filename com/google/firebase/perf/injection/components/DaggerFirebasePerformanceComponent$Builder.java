/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.injection.components;

import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent$1;
import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent$FirebasePerformanceComponentImpl;
import com.google.firebase.perf.injection.components.FirebasePerformanceComponent;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;

public final class DaggerFirebasePerformanceComponent$Builder {
    private FirebasePerformanceModule firebasePerformanceModule;

    private DaggerFirebasePerformanceComponent$Builder() {
    }

    public /* synthetic */ DaggerFirebasePerformanceComponent$Builder(DaggerFirebasePerformanceComponent$1 daggerFirebasePerformanceComponent$1) {
        this();
    }

    public FirebasePerformanceComponent build() {
        Object object = this.firebasePerformanceModule;
        if (object != null) {
            DaggerFirebasePerformanceComponent$FirebasePerformanceComponentImpl daggerFirebasePerformanceComponent$FirebasePerformanceComponentImpl = new DaggerFirebasePerformanceComponent$FirebasePerformanceComponentImpl((FirebasePerformanceModule)object, null);
            return daggerFirebasePerformanceComponent$FirebasePerformanceComponentImpl;
        }
        CharSequence charSequence = new StringBuilder();
        String string2 = FirebasePerformanceModule.class.getCanonicalName();
        charSequence.append(string2);
        charSequence.append(" must be set");
        charSequence = charSequence.toString();
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public DaggerFirebasePerformanceComponent$Builder firebasePerformanceModule(FirebasePerformanceModule firebasePerformanceModule) {
        firebasePerformanceModule.getClass();
        this.firebasePerformanceModule = firebasePerformanceModule;
        return this;
    }
}

