/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.accessibility.AccessibilityManager
 *  android.widget.Checkable
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.Switch
 */
package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.preference.R$attr;
import androidx.preference.R$styleable;
import androidx.preference.SwitchPreference$a;
import androidx.preference.TwoStatePreference;

public class SwitchPreference
extends TwoStatePreference {
    public final SwitchPreference$a F;
    public final CharSequence G;
    public final CharSequence H;

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.switchPreferenceStyle;
        n3 = dt3.a(context, n3, 16843629);
        this(context, attributeSet, n3);
    }

    public SwitchPreference(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object, n3, 0);
        Object object2 = new SwitchPreference$a(this);
        this.F = object2;
        object2 = R$styleable.SwitchPreference;
        context = context.obtainStyledAttributes(object, (int[])object2, n3, 0);
        int n4 = R$styleable.SwitchPreference_summaryOn;
        n3 = R$styleable.SwitchPreference_android_summaryOn;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.B = object;
        n4 = (int)(this.A ? 1 : 0);
        if (n4 != 0) {
            this.d();
        }
        n4 = R$styleable.SwitchPreference_summaryOff;
        n3 = R$styleable.SwitchPreference_android_summaryOff;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.C = object;
        n4 = (int)(this.A ? 1 : 0);
        if (n4 == 0) {
            this.d();
        }
        n4 = R$styleable.SwitchPreference_switchTextOn;
        n3 = R$styleable.SwitchPreference_android_switchTextOn;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.G = object;
        this.d();
        n4 = R$styleable.SwitchPreference_switchTextOff;
        n3 = R$styleable.SwitchPreference_android_switchTextOff;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.H = object;
        this.d();
        n4 = R$styleable.SwitchPreference_disableDependentsState;
        n3 = R$styleable.SwitchPreference_android_disableDependentsState;
        n3 = (int)(context.getBoolean(n3, false) ? 1 : 0);
        n4 = (int)(context.getBoolean(n4, n3 != 0) ? 1 : 0);
        this.E = n4;
        context.recycle();
    }

    public final void f(ly2_1 ly2_12) {
        super.f(ly2_12);
        View view = ly2_12.w(16908352);
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
            accessibilityManager = view.findViewById(16908352);
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
        boolean bl4 = view instanceof Switch;
        if (bl4) {
            view2 = view;
            view2 = (Switch)view;
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
            view = (Switch)view;
            Object object = this.G;
            view.setTextOn((CharSequence)object);
            object = this.H;
            view.setTextOff((CharSequence)object);
            object = this.F;
            view.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object);
        }
    }
}

