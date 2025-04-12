/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import androidx.preference.R$attr;
import androidx.preference.R$styleable;
import java.util.HashSet;

public class MultiSelectListPreference
extends DialogPreference {
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.dialogPreferenceStyle;
        n3 = dt3.a(context, n3, 0x1010091);
        this(context, attributeSet, n3);
    }

    public MultiSelectListPreference(Context context, AttributeSet charSequenceArray, int n3) {
        super(context, (AttributeSet)charSequenceArray, n3, 0);
        new HashSet();
        int[] nArray = R$styleable.MultiSelectListPreference;
        context = context.obtainStyledAttributes((AttributeSet)charSequenceArray, nArray, n3, 0);
        int n4 = R$styleable.MultiSelectListPreference_entries;
        n3 = R$styleable.MultiSelectListPreference_android_entries;
        charSequenceArray = context.getTextArray(n4);
        if (charSequenceArray == null) {
            context.getTextArray(n3);
        }
        n4 = R$styleable.MultiSelectListPreference_entryValues;
        n3 = R$styleable.MultiSelectListPreference_android_entryValues;
        charSequenceArray = context.getTextArray(n4);
        if (charSequenceArray == null) {
            context.getTextArray(n3);
        }
        context.recycle();
    }

    public final Object h(TypedArray charSequenceArray, int n3) {
        charSequenceArray = charSequenceArray.getTextArray(n3);
        HashSet<String> hashSet = new HashSet<String>();
        int n4 = charSequenceArray.length;
        for (int i3 = 0; i3 < n4; ++i3) {
            String string2 = charSequenceArray[i3].toString();
            hashSet.add(string2);
        }
        return hashSet;
    }
}

