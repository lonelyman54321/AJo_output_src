/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.ril.ajio.ondemand.customercare.viewmodel;

import android.app.Application;
import androidx.lifecycle.E$c;
import com.ril.ajio.data.repo.BaseRepo;

public class CCViewModelFactory
extends E$c {
    private static volatile CCViewModelFactory INSTANCE;
    private Application application;
    private BaseRepo repo;

    private CCViewModelFactory() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CCViewModelFactory getVMInstance() {
        Object object = INSTANCE;
        if (object != null) return INSTANCE;
        object = CCViewModelFactory.class;
        synchronized (object) {
            try {
                CCViewModelFactory cCViewModelFactory = INSTANCE;
                if (cCViewModelFactory != null) return INSTANCE;
                INSTANCE = cCViewModelFactory = new CCViewModelFactory();
                return INSTANCE;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public jD3 create(Class object) {
        Class<hy3_0> clazz = hy3_0.class;
        boolean bl2 = ((Class)object).isAssignableFrom(clazz);
        if (bl2) {
            clazz = this.application;
            BaseRepo baseRepo = this.repo;
            object = new hy3_0((Application)clazz, baseRepo);
            return object;
        }
        object = ((Class)object).getName();
        object = "Unknown ViewModel class: ".concat((String)object);
        clazz = new IllegalArgumentException((String)object);
        throw clazz;
    }

    public void setRepo(BaseRepo baseRepo, Application application) {
        this.repo = baseRepo;
        this.application = application;
    }
}

