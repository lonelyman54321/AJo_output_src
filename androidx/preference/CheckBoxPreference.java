/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.accessibility.AccessibilityManager
 *  android.widget.Checkable
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference$a;
import androidx.preference.R$attr;
import androidx.preference.R$styleable;
import androidx.preference.TwoStatePreference;

public class CheckBoxPreference
extends TwoStatePreference {
    public final CheckBoxPreference$a F;

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.checkBoxPreferenceStyle;
        n3 = dt3.a(context, n3, 16842895);
        this(context, attributeSet, n3);
    }

    public CheckBoxPreference(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object, n3, 0);
        Object object2 = new CheckBoxPreference$a(this);
        this.F = object2;
        object2 = R$styleable.CheckBoxPreference;
        context = context.obtainStyledAttributes(object, (int[])object2, n3, 0);
        int n4 = R$styleable.CheckBoxPreference_summaryOn;
        n3 = R$styleable.CheckBoxPreference_android_summaryOn;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.B = object;
        n4 = (int)(this.A ? 1 : 0);
        if (n4 != 0) {
            this.d();
        }
        n4 = R$styleable.CheckBoxPreference_summaryOff;
        n3 = R$styleable.CheckBoxPreference_android_summaryOff;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.C = object;
        n4 = (int)(this.A ? 1 : 0);
        if (n4 == 0) {
            this.d();
        }
        n4 = R$styleable.CheckBoxPreference_disableDependentsState;
        n3 = R$styleable.CheckBoxPreference_android_disableDependentsState;
        n3 = (int)(context.getBoolean(n3, false) ? 1 : 0);
        n4 = (int)(context.getBoolean(n4, n3 != 0) ? 1 : 0);
        this.E = n4;
        context.recycle();
    }

    public final void f(ly2_1 ly2_12) {
        super.f(ly2_12);
        View view = ly2_12.w(0x1020001);
        this.n(view);
        ly2_12 = ly2_12.w(0x1020010);
        this.m((View)ly2_12);
    }

    public final void i(View view) {
        super.i(view);
        Context context = this.a;
        AccessibilityManager accessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
        int n3 = accessibilityManager.isEnabled();
        if (n3 != 0) {
            accessibilityManager = view.findViewById(0x1020001);
            this.n((View)accessibilityManager);
            n3 = 0x1020010;
            view = view.findViewById(n3);
            this.m(view);
        }
    }

    public final void n(View view) {
        boolean bl2;
        boolean bl3;
        View view2;
        boolean bl4 = view instanceof CompoundButton;
        if (bl4) {
            view2 = view;
            view2 = (CompoundButton)view;
            bl3 = false;
            view2.setOnCheckedChangeListener(null);
        }
        if (bl2 = view instanceof Checkable) {
            view2 = view;
            view2 = (Checkable)view;
            bl3 = this.A;
            view2.setChecked(bl3);
        }
        if (bl4) {
            view = (CompoundButton)view;
            CheckBoxPreference$a checkBoxPreference$a = this.F;
            view.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)checkBoxPreference$a);
        }
    }
}

