/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 */
package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
import androidx.preference.EditTextPreferenceDialogFragmentCompat$1;
import androidx.preference.a;

public class EditTextPreferenceDialogFragmentCompat
extends a {
    public EditText i;
    public CharSequence j;
    public final Runnable k;
    public long l;

    public EditTextPreferenceDialogFragmentCompat() {
        EditTextPreferenceDialogFragmentCompat$1 editTextPreferenceDialogFragmentCompat$1 = new EditTextPreferenceDialogFragmentCompat$1(this);
        this.k = editTextPreferenceDialogFragmentCompat$1;
        this.l = -1;
    }

    public final void Pa(View object) {
        super.Pa((View)object);
        int n3 = 16908291;
        object = (EditText)object.findViewById(n3);
        this.i = object;
        if (object != null) {
            object.requestFocus();
            object = this.i;
            CharSequence charSequence = this.j;
            object.setText(charSequence);
            object = this.i;
            n3 = object.getText().length();
            object.setSelection(n3);
            ((EditTextPreference)this.Oa()).getClass();
            return;
        }
        object = new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        throw object;
    }

    public final void Qa(boolean bl2) {
        if (bl2) {
            String string2 = this.i.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference)this.Oa();
            editTextPreference.getClass();
            boolean bl3 = editTextPreference.k();
            editTextPreference.A = string2;
            bl2 = editTextPreference.k();
            if (bl2 != bl3) {
                editTextPreference.e(bl2);
            }
            editTextPreference.d();
        }
    }

    public final void Sa() {
        long l2;
        this.l = l2 = SystemClock.currentThreadTimeMillis();
        this.Ta();
    }

    public final void Ta() {
        long l2;
        long l3;
        long l4;
        long l7 = this.l;
        long l8 = -1;
        long l12 = l7 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false && (l4 = (l3 = (l7 += 1000L) - (l2 = SystemClock.currentThreadTimeMillis())) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            boolean bl2;
            EditText editText = this.i;
            if (editText != null && (bl2 = editText.isFocused())) {
                editText = (InputMethodManager)this.i.getContext().getSystemService("input_method");
                Object object2 = this.i;
                object = 0;
                bl2 = editText.showSoftInput((View)object2, 0);
                if (bl2) {
                    this.l = l8;
                } else {
                    editText = this.i;
                    object2 = this.k;
                    editText.removeCallbacks((Runnable)object2);
                    editText = this.i;
                    l8 = 50;
                    editText.postDelayed((Runnable)object2, l8);
                }
            } else {
                this.l = l8;
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        if (object == null) {
            object = ((EditTextPreference)this.Oa()).A;
            this.j = object;
        } else {
            String string2 = "EditTextPreferenceDialogFragment.text";
            object = object.getCharSequence(string2);
            this.j = object;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CharSequence charSequence = this.j;
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", charSequence);
    }
}

