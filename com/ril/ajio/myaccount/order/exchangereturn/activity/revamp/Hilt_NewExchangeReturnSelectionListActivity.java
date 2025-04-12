/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity.revamp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.E$b;

public abstract class Hilt_NewExchangeReturnSelectionListActivity
extends AppCompatActivity
implements az0_2 {
    public ts2_2 X;
    public volatile g3_0 Y;
    public final Object Z;
    public boolean k0;

    public Hilt_NewExchangeReturnSelectionListActivity() {
        Object object;
        this.Z = object = new Object();
        this.k0 = false;
        object = new W51(this);
        this.addOnContextAvailableListener((u82_0)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final g3_0 componentManager() {
        Object object = this.Y;
        if (object != null) return this.Y;
        object = this.Z;
        synchronized (object) {
            try {
                g3_0 g3_02 = this.Y;
                if (g3_02 != null) return this.Y;
                this.Y = g3_02 = new g3_0(this);
                return this.Y;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Object generatedComponent() {
        return this.componentManager().generatedComponent();
    }

    public final E$b getDefaultViewModelProviderFactory() {
        E$b e$b = super.getDefaultViewModelProviderFactory();
        return sn0_2.a(this, e$b);
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getApplication();
        boolean bl2 = object instanceof az0_2;
        if (bl2) {
            object = this.componentManager().b();
            this.X = object;
            bl2 = ((ts2_2)object).a();
            if (bl2) {
                Wd0 wd0;
                object = this.X;
                ((ts2_2)object).a = wd0 = this.getDefaultViewModelCreationExtras();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ts2_2 ts2_22 = this.X;
        if (ts2_22 != null) {
            ts2_22.a = null;
        }
    }
}

