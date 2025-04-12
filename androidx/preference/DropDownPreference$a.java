/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 */
package androidx.preference;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;

public final class DropDownPreference$a
implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ DropDownPreference a;

    public DropDownPreference$a(DropDownPreference dropDownPreference) {
        this.a = dropDownPreference;
    }

    public final void onItemSelected(AdapterView object, View object2, int n3, long l2) {
        if (n3 >= 0) {
            String string2;
            object = this.a;
            object2 = ((ListPreference)object).B[n3].toString();
            if ((n3 = (int)(((String)object2).equals(string2 = ((ListPreference)object).C) ? 1 : 0)) == 0) {
                object.getClass();
                ((ListPreference)object).n((String)object2);
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}

