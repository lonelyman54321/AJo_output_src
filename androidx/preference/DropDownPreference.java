/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ArrayAdapter
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 */
package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.preference.DropDownPreference$a;
import androidx.preference.ListPreference;
import androidx.preference.R$attr;
import androidx.preference.R$id;

public class DropDownPreference
extends ListPreference {
    public final ArrayAdapter F;
    public Spinner G;
    public final DropDownPreference$a H;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.dropdownPreferenceStyle;
        this(context, attributeSet, n3);
    }

    public DropDownPreference(Context charSequenceArray, AttributeSet object, int n3) {
        super((Context)charSequenceArray, (AttributeSet)object, n3, 0);
        super(this);
        this.H = object;
        n3 = 0x1090009;
        super((Context)charSequenceArray, n3);
        this.F = object;
        object.clear();
        charSequenceArray = this.A;
        if (charSequenceArray != null) {
            n3 = charSequenceArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = charSequenceArray[i3].toString();
                object.add((Object)string2);
            }
        }
    }

    public final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.F;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public final void f(ly2_1 ly2_12) {
        int n3;
        CharSequence[] charSequenceArray;
        View view = ly2_12.itemView;
        int n4 = R$id.spinner;
        view = (Spinner)view.findViewById(n4);
        this.G = view;
        Object object = this.F;
        view.setAdapter((SpinnerAdapter)object);
        view = this.G;
        object = this.H;
        view.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)object);
        view = this.G;
        object = this.C;
        if (object != null && (charSequenceArray = this.B) != null) {
            for (n3 = charSequenceArray.length + -1; n3 >= 0; n3 += -1) {
                String string2 = charSequenceArray[n3].toString();
                boolean bl2 = TextUtils.equals((CharSequence)string2, (CharSequence)object);
                if (!bl2) {
                    continue;
                }
                break;
            }
        } else {
            n3 = -1;
        }
        view.setSelection(n3);
        super.f(ly2_12);
    }

    public final void g() {
        this.G.performClick();
    }
}

