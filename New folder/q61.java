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
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public abstract class q61
extends BottomSheetDialogFragment
implements az0_2 {
    public gc3_2 a;
    public boolean b;
    public volatile zv0_2 c;
    public final Object d;
    public boolean e;

    public q61() {
        Object object;
        this.d = object = new Object();
        this.e = false;
    }

    public final void Oa() {
        gc3_2 gc3_22 = this.a;
        if (gc3_22 == null) {
            boolean bl2;
            gc3_2 gc3_23;
            gc3_22 = super.getContext();
            this.a = gc3_23 = new gc3_2((Context)gc3_22, (Fragment)this);
            gc3_22 = super.getContext();
            this.b = bl2 = kw0_1.a((Context)gc3_22);
        }
    }

    public void Pa() {
        boolean bl2 = this.e;
        if (!bl2) {
            this.e = bl2 = true;
            vQ2 vQ22 = (vQ2)this.generatedComponent();
            uq2_0 cfr_ignored_0 = (uq2_0)this;
            vQ22.getClass();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object generatedComponent() {
        Object object = this.c;
        if (object != null) return this.c.generatedComponent();
        object = this.d;
        synchronized (object) {
            try {
                zv0_2 zv0_22 = this.c;
                if (zv0_22 != null) return this.c.generatedComponent();
                this.c = zv0_22 = new zv0_2(this);
                return this.c.generatedComponent();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Context getContext() {
        boolean bl2;
        Context context = super.getContext();
        if (context == null && !(bl2 = this.b)) {
            return null;
        }
        this.Oa();
        return this.a;
    }

    public final E$b getDefaultViewModelProviderFactory() {
        E$b e$b = super.getDefaultViewModelProviderFactory();
        return sn0_2.b(this, e$b);
    }

    public void onAttach(Activity activity) {
        boolean bl2;
        super.onAttach(activity);
        gc3_2 gc3_22 = this.a;
        Object[] objectArray = null;
        if (gc3_22 != null && (gc3_22 = zv0_2.b((Context)gc3_22)) != activity) {
            bl2 = false;
            activity = null;
        } else {
            bl2 = true;
        }
        objectArray = new Object[]{};
        mx2_2.a(bl2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", objectArray);
        this.Oa();
        this.Pa();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.Oa();
        this.Pa();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        bundle = super.onGetLayoutInflater(bundle);
        gc3_2 gc3_22 = new gc3_2((LayoutInflater)bundle, (Fragment)this);
        return bundle.cloneInContext((Context)gc3_22);
    }
}

