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

public abstract class a51
extends q22_0 {
    public gc3_2 i1;
    public boolean j1;
    public boolean k1 = false;

    public final void Jb() {
        gc3_2 gc3_22 = this.i1;
        if (gc3_22 == null) {
            boolean bl2;
            gc3_2 gc3_23;
            gc3_22 = super.getContext();
            this.i1 = gc3_23 = new gc3_2((Context)gc3_22, (Fragment)this);
            gc3_22 = super.getContext();
            this.j1 = bl2 = kw0_1.a((Context)gc3_22);
        }
    }

    public final void Qa() {
        boolean bl2 = this.k1;
        if (!bl2) {
            this.k1 = bl2 = true;
            ka_0 ka_02 = (ka_0)this.generatedComponent();
            ia_0 cfr_ignored_0 = (ia_0)this;
            ka_02.getClass();
        }
    }

    public final Context getContext() {
        boolean bl2;
        Context context = super.getContext();
        if (context == null && !(bl2 = this.j1)) {
            return null;
        }
        this.Jb();
        return this.i1;
    }

    public final void onAttach(Activity activity) {
        boolean bl2;
        super.onAttach(activity);
        gc3_2 gc3_22 = this.i1;
        Object[] objectArray = null;
        if (gc3_22 != null && (gc3_22 = zv0_2.b((Context)gc3_22)) != activity) {
            bl2 = false;
            activity = null;
        } else {
            bl2 = true;
        }
        objectArray = new Object[]{};
        mx2_2.a(bl2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", objectArray);
        this.Jb();
        this.Qa();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.Jb();
        this.Qa();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        bundle = super.onGetLayoutInflater(bundle);
        gc3_2 gc3_22 = new gc3_2((LayoutInflater)bundle, (Fragment)this);
        return bundle.cloneInContext((Context)gc3_22);
    }
}

