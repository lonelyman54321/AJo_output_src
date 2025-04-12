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
 */
package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.R$attr;
import androidx.preference.R$id;
import androidx.preference.R$styleable;
import androidx.preference.SwitchPreferenceCompat$a;
import androidx.preference.TwoStatePreference;

public class SwitchPreferenceCompat
extends TwoStatePreference {
    public final SwitchPreferenceCompat$a F;
    public final CharSequence G;
    public final CharSequence H;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.switchPreferenceCompatStyle;
        this(context, attributeSet, n3);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object, n3, 0);
        Object object2 = new SwitchPreferenceCompat$a(this);
        this.F = object2;
        object2 = R$styleable.SwitchPreferenceCompat;
        context = context.obtainStyledAttributes(object, (int[])object2, n3, 0);
        int n4 = R$styleable.SwitchPreferenceCompat_summaryOn;
        n3 = R$styleable.SwitchPreferenceCompat_android_summaryOn;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.B = object;
        n4 = (int)(this.A ? 1 : 0);
        if (n4 != 0) {
            this.d();
        }
        n4 = R$styleable.SwitchPreferenceCompat_summaryOff;
        n3 = R$styleable.SwitchPreferenceCompat_android_summaryOff;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.C = object;
        n4 = (int)(this.A ? 1 : 0);
        if (n4 == 0) {
            this.d();
        }
        n4 = R$styleable.SwitchPreferenceCompat_switchTextOn;
        n3 = R$styleable.SwitchPreferenceCompat_android_switchTextOn;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.G = object;
        this.d();
        n4 = R$styleable.SwitchPreferenceCompat_switchTextOff;
        n3 = R$styleable.SwitchPreferenceCompat_android_switchTextOff;
        object = context.getString(n4);
        if (object == null) {
            object = context.getString(n3);
        }
        this.H = object;
        this.d();
        n4 = R$styleable.SwitchPreferenceCompat_disableDependentsState;
        n3 = R$styleable.SwitchPreferenceCompat_android_disableDependentsState;
        n3 = (int)(context.getBoolean(n3, false) ? 1 : 0);
        n4 = (int)(context.getBoolean(n4, n3 != 0) ? 1 : 0);
        this.E = n4;
        context.recycle();
    }

    public final void f(ly2_1 ly2_12) {
        super.f(ly2_12);
        int n3 = R$id.switchWidget;
        View view = ly2_12.w(n3);
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
            n3 = R$id.switchWidget;
            accessibilityManager = view.findViewById(n3);
            this.n((View)accessibilityManager);
            n3 = 0x1020010;
            view = view.findViewById(n3);
            this.m(view);
        }
    }

    public final void n(View object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        boolean bl4 = object instanceof SwitchCompat;
        if (bl4) {
            object2 = object;
            object2 = (SwitchCompat)((Object)object);
            bl3 = false;
            object2.setOnCheckedChangeListener(null);
        }
        if (bl2 = object instanceof Checkable) {
            object2 = object;
            object2 = (Checkable)object;
            bl3 = this.A;
            object2.setChecked(bl3);
        }
        if (bl4) {
            object = (SwitchCompat)((Object)object);
            Object object3 = this.G;
            ((SwitchCompat)((Object)object)).setTextOn((CharSequence)object3);
            object3 = this.H;
            ((SwitchCompat)((Object)object)).setTextOff((CharSequence)object3);
            object3 = this.F;
            object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object3);
        }
    }
}

