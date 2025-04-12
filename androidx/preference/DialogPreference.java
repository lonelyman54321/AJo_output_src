/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.R$attr;
import androidx.preference.R$styleable;

public abstract class DialogPreference
extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.dialogPreferenceStyle;
        n3 = dt3.a(context, n3, 0x1010091);
        this(context, attributeSet, n3);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int n3) {
        this(context, attributeSet, n3, 0);
    }

    public DialogPreference(Context context, AttributeSet object, int n3, int n4) {
        super(context, (AttributeSet)object, n3, 0);
        int[] nArray = R$styleable.DialogPreference;
        context = context.obtainStyledAttributes(object, nArray, n3, 0);
        int n7 = R$styleable.DialogPreference_dialogTitle;
        n3 = R$styleable.DialogPreference_android_dialogTitle;
        object = context.getString(n7);
        if (object == null) {
            context.getString(n3);
        }
        n7 = R$styleable.DialogPreference_dialogMessage;
        n3 = R$styleable.DialogPreference_android_dialogMessage;
        object = context.getString(n7);
        if (object == null) {
            context.getString(n3);
        }
        n7 = R$styleable.DialogPreference_dialogIcon;
        n3 = R$styleable.DialogPreference_android_dialogIcon;
        object = context.getDrawable(n7);
        if (object == null) {
            context.getDrawable(n3);
        }
        n7 = R$styleable.DialogPreference_positiveButtonText;
        n3 = R$styleable.DialogPreference_android_positiveButtonText;
        object = context.getString(n7);
        if (object == null) {
            context.getString(n3);
        }
        n7 = R$styleable.DialogPreference_negativeButtonText;
        n3 = R$styleable.DialogPreference_android_negativeButtonText;
        object = context.getString(n7);
        if (object == null) {
            context.getString(n3);
        }
        n7 = R$styleable.DialogPreference_dialogLayout;
        n3 = R$styleable.DialogPreference_android_dialogLayout;
        n3 = context.getResourceId(n3, 0);
        context.getResourceId(n7, n3);
        context.recycle();
    }

    public void g() {
        throw null;
    }
}

