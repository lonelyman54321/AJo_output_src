/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package androidx.preference;

import android.view.View;
import androidx.preference.Preference;

public final class Preference$a
implements View.OnClickListener {
    public final /* synthetic */ Preference a;

    public Preference$a(Preference preference) {
        this.a = preference;
    }

    public final void onClick(View view) {
        this.a.i(view);
    }
}

