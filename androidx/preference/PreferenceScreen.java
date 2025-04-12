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
import androidx.preference.PreferenceGroup;
import androidx.preference.R$attr;

public final class PreferenceScreen
extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.preferenceScreenStyle;
        n3 = dt3.a(context, n3, 16842891);
        super(context, attributeSet, n3);
    }

    public final void g() {
        int n3;
        String string2 = this.h;
        if (string2 == null && (n3 = this.m()) != 0) {
            throw null;
        }
    }
}

