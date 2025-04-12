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

/*
 * Renamed from z51
 */
public abstract class z51_0
extends uq2_0 {
    public gc3_2 A;
    public boolean B;
    public boolean C = false;

    public final void Pa() {
        boolean bl2 = this.C;
        if (!bl2) {
            this.C = bl2 = true;
            O81 o81 = (O81)this.generatedComponent();
            N81 cfr_ignored_0 = (N81)this;
            o81.getClass();
        }
    }

    public final void Ta() {
        gc3_2 gc3_22 = this.A;
        if (gc3_22 == null) {
            boolean bl2;
            gc3_2 gc3_23;
            gc3_22 = super.getContext();
            this.A = gc3_23 = new gc3_2((Context)gc3_22, (Fragment)this);
            gc3_22 = super.getContext();
            this.B = bl2 = kw0_1.a((Context)gc3_22);
        }
    }

    public final Context getContext() {
        boolean bl2;
        Context context = super.getContext();
        if (context == null && !(bl2 = this.B)) {
            return null;
        }
        this.Ta();
        return this.A;
    }

    public final void onAttach(Activity activity) {
        boolean bl2;
        super.onAttach(activity);
        gc3_2 gc3_22 = this.A;
        Object[] objectArray = null;
        if (gc3_22 != null && (gc3_22 = zv0_2.b((Context)gc3_22)) != activity) {
            bl2 = false;
            activity = null;
        } else {
            bl2 = true;
        }
        objectArray = new Object[]{};
        mx2_2.a(bl2, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", objectArray);
        this.Ta();
        this.Pa();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.Ta();
        this.Pa();
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        bundle = super.onGetLayoutInflater(bundle);
        gc3_2 gc3_22 = new gc3_2((LayoutInflater)bundle, (Fragment)this);
        return bundle.cloneInContext((Context)gc3_22);
    }
}

