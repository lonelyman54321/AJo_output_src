/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.preference;

import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

class PreferenceFragmentCompat$2
implements Runnable {
    public final /* synthetic */ PreferenceFragmentCompat a;

    public PreferenceFragmentCompat$2(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.a = preferenceFragmentCompat;
    }

    public final void run() {
        RecyclerView recyclerView = this.a.c;
        recyclerView.focusableViewAvailable((View)recyclerView);
    }
}

