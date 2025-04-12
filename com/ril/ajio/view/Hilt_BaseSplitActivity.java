/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.E$b;
import com.ril.ajio.view.BaseSplitActivity;
import com.ril.ajio.view.Hilt_BaseSplitActivity$a;

public abstract class Hilt_BaseSplitActivity
extends AppCompatActivity
implements az0_2 {
    private volatile g3_0 componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private ts2_2 savedStateHandleHolder;

    public Hilt_BaseSplitActivity() {
        Object object;
        this.componentManagerLock = object = new Object();
        this.injected = false;
        this._initHiltInternal();
    }

    public Hilt_BaseSplitActivity(int n3) {
        super(n3);
        Object object;
        this.componentManagerLock = object = new Object();
        this.injected = false;
        this._initHiltInternal();
    }

    private void _initHiltInternal() {
        Hilt_BaseSplitActivity$a hilt_BaseSplitActivity$a = new Hilt_BaseSplitActivity$a(this);
        this.addOnContextAvailableListener(hilt_BaseSplitActivity$a);
    }

    private void initSavedStateHandleHolder() {
        Object object = this.getApplication();
        boolean bl2 = object instanceof az0_2;
        if (bl2) {
            object = ((g3_0)this.componentManager()).b();
            this.savedStateHandleHolder = object;
            bl2 = ((ts2_2)object).a();
            if (bl2) {
                Wd0 wd0;
                object = this.savedStateHandleHolder;
                ((ts2_2)object).a = wd0 = this.getDefaultViewModelCreationExtras();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final g3_0 componentManager() {
        Object object = this.componentManager;
        if (object != null) return this.componentManager;
        object = this.componentManagerLock;
        synchronized (object) {
            try {
                g3_0 g3_02 = this.componentManager;
                if (g3_02 != null) return this.componentManager;
                this.componentManager = g3_02 = this.createComponentManager();
                return this.componentManager;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public g3_0 createComponentManager() {
        g3_0 g3_02 = new g3_0(this);
        return g3_02;
    }

    public final Object generatedComponent() {
        return ((g3_0)this.componentManager()).generatedComponent();
    }

    public E$b getDefaultViewModelProviderFactory() {
        E$b e$b = super.getDefaultViewModelProviderFactory();
        return sn0_2.a(this, e$b);
    }

    public void inject() {
        boolean bl2 = this.injected;
        if (!bl2) {
            this.injected = bl2 = true;
            ew_1 ew_12 = (ew_1)this.generatedComponent();
            BaseSplitActivity cfr_ignored_0 = (BaseSplitActivity)this;
            ew_12.getClass();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.initSavedStateHandleHolder();
    }

    public void onDestroy() {
        super.onDestroy();
        ts2_2 ts2_22 = this.savedStateHandleHolder;
        if (ts2_22 != null) {
            ts2_22.a = null;
        }
    }
}

