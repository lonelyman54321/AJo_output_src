/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.text.TextUtils
 *  android.util.AttributeSet
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import androidx.preference.EditTextPreference$a;
import androidx.preference.R$attr;
import androidx.preference.R$styleable;

public class EditTextPreference
extends DialogPreference {
    public String A;

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.editTextPreferenceStyle;
        n3 = dt3.a(context, n3, 16842898);
        this(context, attributeSet, n3);
    }

    public EditTextPreference(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object, n3, 0);
        int[] nArray = R$styleable.EditTextPreference;
        context = context.obtainStyledAttributes(object, nArray, n3, 0);
        int n4 = R$styleable.EditTextPreference_useSimpleSummaryProvider;
        n3 = (int)(context.getBoolean(n4, false) ? 1 : 0);
        n4 = (int)(context.getBoolean(n4, n3 != 0) ? 1 : 0);
        if (n4 != 0) {
            object = EditTextPreference$a.a;
            if (object == null) {
                super();
                EditTextPreference$a.a = object;
            }
            object = EditTextPreference$a.a;
            this.y = object;
            this.d();
        }
        context.recycle();
    }

    public final Object h(TypedArray typedArray, int n3) {
        return typedArray.getString(n3);
    }

    public final boolean k() {
        String string2 = this.A;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && !(bl2 = super.k())) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

