/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;

public abstract class Z51
extends sm3_0
implements az0_2 {
    public gc3_2 b;
    public boolean c;
    public volatile zv0_2 d;
    public final Object e;
    public boolean f;

    public Z51() {
        Object object;
        this.e = object = new Object();
        this.f = false;
    }

    public final void Pa() {
        gc3_2 gc3_22 = this.b;
        if (gc3_22 == null) {
            boolean bl2;
            gc3_2 gc3_23;
            gc3_22 = super.getContext();
            this.b = gc3_23 = new gc3_2((Context)gc3_22, (Fragment)this);
            gc3_22 = super.getContext();
            this.c = bl2 = kw0_1.a((Context)gc3_22);
        }
    }

    public void Qa() {
        boolean bl2 = this.f;
        if (!bl2) {
            this.f = bl2 = true;
            W22 w22 = (W22)this.generatedComponent();
            q22_0 cfr_ignored_0 = (q22_0)this;
            w22.getClass();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object generatedComponent() {
        Object object = this.d;
        if (object != null) return this.d.generatedComponent();
        object = this.e;
        synchronized (object) {
            try {
                zv0_2 zv0_22 = this.d;
                if (zv0_22 != null) return this.d.generatedComponent();
                this.d = zv0_22 = new zv0_2(this);
                return this.d.generatedComponent();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Context getContext() {
        boolean bl2;
        Context context = super.getContext();
        if (context == null && !(bl2 = this.c)) {
            return null;
        }
        this.Pa();
        return this.b;
    }

    public final E$b getDefaultViewModelProviderFactory() {
        E$b e$b = super.getDefaultViewModelProviderFactory();
        return sn0_2.b(this, e$b);
    }

    public void onAttach(Activity activity) {
        boolean bl2;
        super.onAttach(activity);
        gc3_2 gc3_22 = this.b;
        Object[] objectArray = null;
        if (gc3_22 != null && (gc3_22 = zv0_2.b((Context)gc3_22)) != activity) {
            bl2 = false;
            activity = null;
        } else {
            bl2 = true;
        }
        objectArray = new Object[]{};
        mx2_2.a(bl2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", objectArray);
        this.Pa();
        this.Qa();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.Pa();
        this.Qa();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        bundle = super.onGetLayoutInflater(bundle);
        gc3_2 gc3_22 = new gc3_2((LayoutInflater)bundle, (Fragment)this);
        return bundle.cloneInContext((Context)gc3_22);
    }
}

