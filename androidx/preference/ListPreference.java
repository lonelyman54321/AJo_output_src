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
import androidx.preference.ListPreference$a;
import androidx.preference.R$attr;
import androidx.preference.R$styleable;

public class ListPreference
extends DialogPreference {
    public final CharSequence[] A;
    public final CharSequence[] B;
    public String C;
    public final String D;
    public boolean E;

    public ListPreference(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.dialogPreferenceStyle;
        n3 = dt3.a(context, n3, 0x1010091);
        this(context, attributeSet, n3);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int n3) {
        this(context, attributeSet, n3, 0);
    }

    public ListPreference(Context context, AttributeSet object, int n3, int n4) {
        super(context, (AttributeSet)object, n3, 0);
        Object object2 = R$styleable.ListPreference;
        object2 = context.obtainStyledAttributes((AttributeSet)object, object2, n3, 0);
        int n7 = R$styleable.ListPreference_entries;
        int bl2 = R$styleable.ListPreference_android_entries;
        Object object3 = object2.getTextArray(n7);
        if (object3 == null) {
            object3 = object2.getTextArray(bl2);
        }
        this.A = object3;
        n7 = R$styleable.ListPreference_entryValues;
        int n8 = R$styleable.ListPreference_android_entryValues;
        object3 = object2.getTextArray(n7);
        if (object3 == null) {
            object3 = object2.getTextArray(n8);
        }
        this.B = object3;
        n7 = R$styleable.ListPreference_useSimpleSummaryProvider;
        boolean bl3 = object2.getBoolean(n7, false);
        if ((n7 = (int)(object2.getBoolean(n7, bl3) ? 1 : 0)) != 0) {
            object3 = ListPreference$a.a;
            if (object3 == null) {
                super();
                ListPreference$a.a = object3;
            }
            this.y = object3 = ListPreference$a.a;
            this.d();
        }
        object2.recycle();
        object2 = R$styleable.Preference;
        context = context.obtainStyledAttributes((AttributeSet)object, object2, n3, 0);
        int n10 = R$styleable.Preference_summary;
        n3 = R$styleable.Preference_android_summary;
        object = context.getString(n10);
        if (object == null) {
            object = context.getString(n3);
        }
        this.D = object;
        context.recycle();
    }

    public final CharSequence b() {
        Object object = this.y;
        if (object != null) {
            return object.a(this);
        }
        object = this.m();
        CharSequence charSequence = super.b();
        String string2 = this.D;
        if (string2 == null) {
            return charSequence;
        }
        if (object == null) {
            object = "";
        }
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        object = String.format(string2, objectArray);
        boolean bl2 = TextUtils.equals((CharSequence)object, (CharSequence)charSequence);
        if (bl2) {
            return charSequence;
        }
        return object;
    }

    public final Object h(TypedArray typedArray, int n3) {
        return typedArray.getString(n3);
    }

    public final int l(String string2) {
        CharSequence[] charSequenceArray;
        if (string2 != null && (charSequenceArray = this.B) != null) {
            for (int i3 = charSequenceArray.length + -1; i3 >= 0; i3 += -1) {
                String string3 = charSequenceArray[i3].toString();
                boolean bl2 = TextUtils.equals((CharSequence)string3, (CharSequence)string2);
                if (!bl2) continue;
                return i3;
            }
        }
        return -1;
    }

    public final CharSequence m() {
        CharSequence[] charSequenceArray;
        CharSequence charSequence = this.C;
        int n3 = this.l((String)charSequence);
        if (n3 >= 0 && (charSequenceArray = this.A) != null) {
            charSequence = charSequenceArray[n3];
        } else {
            n3 = 0;
            charSequence = null;
        }
        return charSequence;
    }

    public final void n(String string2) {
        boolean bl2;
        String string3 = this.C;
        boolean bl3 = TextUtils.equals((CharSequence)string3, (CharSequence)string2);
        boolean bl4 = true;
        if ((bl3 ^= bl4) || !(bl2 = this.E)) {
            this.C = string2;
            this.E = bl4;
            if (bl3) {
                this.d();
            }
        }
    }
}

