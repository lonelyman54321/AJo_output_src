/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.AttributeSet
 */
package androidx.preference;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.R$styleable;
import java.util.ArrayList;

public abstract class PreferenceGroup
extends Preference {
    public final ArrayList A;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int n3) {
        this(context, attributeSet, n3, 0);
    }

    public PreferenceGroup(Context context, AttributeSet object, int n3, int n4) {
        super(context, (AttributeSet)object, n3, 0);
        new a53();
        Object object2 = Looper.getMainLooper();
        Handler handler = new Handler(object2);
        int n7 = -1 >>> 1;
        super();
        this.A = object2;
        object2 = R$styleable.PreferenceGroup;
        context = context.obtainStyledAttributes(object, (int[])object2, n3, 0);
        int n8 = R$styleable.PreferenceGroup_orderingFromXml;
        n3 = (int)(context.getBoolean(n8, true) ? 1 : 0);
        context.getBoolean(n8, n3 != 0);
        n8 = R$styleable.PreferenceGroup_initialExpandedChildrenCount;
        n8 = (int)(context.hasValue(n8) ? 1 : 0);
        if (n8 != 0) {
            n8 = R$styleable.PreferenceGroup_initialExpandedChildrenCount;
            n3 = context.getInt(n8, n7);
            if ((n8 = context.getInt(n8, n3)) != n7) {
                object = this.g;
                TextUtils.isEmpty((CharSequence)object);
            }
        }
        context.recycle();
    }

    public final void e(boolean bl2) {
        super.e(bl2);
        int n3 = this.m();
        for (int i3 = 0; i3 < n3; ++i3) {
            Preference preference = this.l(i3);
            boolean bl3 = preference.m;
            if (bl3 != bl2) continue;
            preference.m = bl3 = bl2 ^ true;
            bl3 = preference.k();
            preference.e(bl3);
            preference.d();
        }
    }

    public final Preference l(int n3) {
        return (Preference)this.A.get(n3);
    }

    public final int m() {
        return this.A.size();
    }
}

