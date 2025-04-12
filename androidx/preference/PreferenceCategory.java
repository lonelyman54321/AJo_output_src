/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 */
package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.PreferenceGroup;
import androidx.preference.R$attr;

public class PreferenceCategory
extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.preferenceCategoryStyle;
        n3 = dt3.a(context, n3, 16842892);
        this(context, attributeSet, n3);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3, 0);
    }

    public final boolean c() {
        return false;
    }

    public final void f(ly2_1 ly2_12) {
        super.f(ly2_12);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            ly2_12 = ly2_12.itemView;
            Xx2.a((View)ly2_12);
        }
    }

    public final boolean k() {
        return super.c() ^ true;
    }
}

