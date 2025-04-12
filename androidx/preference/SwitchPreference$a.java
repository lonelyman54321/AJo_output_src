/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
package androidx.preference;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;

public final class SwitchPreference$a
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreference a;

    public SwitchPreference$a(SwitchPreference switchPreference) {
        this.a = switchPreference;
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        object = this.a;
        object.getClass();
        ((TwoStatePreference)object).l(bl2);
    }
}

