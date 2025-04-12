/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View$OnKeyListener
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  android.widget.TextView
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.R$attr;
import androidx.preference.R$id;
import androidx.preference.R$styleable;
import androidx.preference.SeekBarPreference$a;
import androidx.preference.SeekBarPreference$b;
import androidx.recyclerview.widget.RecyclerView$B;

public class SeekBarPreference
extends Preference {
    public int A;
    public final int B;
    public final int C;
    public int D;
    public boolean E;
    public SeekBar F;
    public TextView G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final SeekBarPreference$a K;
    public final SeekBarPreference$b L;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.seekBarPreferenceStyle;
        this(context, attributeSet, n3);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3, 0);
        Object object = new SeekBarPreference$a(this);
        this.K = object;
        this.L = object = new SeekBarPreference$b(this);
        object = R$styleable.SeekBarPreference;
        context = context.obtainStyledAttributes(attributeSet, (int[])object, n3, 0);
        int n4 = R$styleable.SeekBarPreference_min;
        this.B = n4 = context.getInt(n4, 0);
        n4 = R$styleable.SeekBarPreference_android_max;
        n4 = context.getInt(n4, 100);
        n3 = this.B;
        if (n4 < n3) {
            n4 = n3;
        }
        if (n4 != (n3 = this.C)) {
            this.C = n4;
            this.d();
        }
        n4 = R$styleable.SeekBarPreference_seekBarIncrement;
        if ((n4 = context.getInt(n4, 0)) != (n3 = this.D)) {
            n3 = this.C;
            int n7 = this.B;
            n4 = Math.abs(n4);
            this.D = n4 = Math.min(n3 -= n7, n4);
            this.d();
        }
        n4 = R$styleable.SeekBarPreference_adjustable;
        n4 = (int)(context.getBoolean(n4, true) ? 1 : 0);
        this.H = n4;
        n4 = R$styleable.SeekBarPreference_showSeekBarValue;
        n4 = (int)(context.getBoolean(n4, false) ? 1 : 0);
        this.I = n4;
        n4 = R$styleable.SeekBarPreference_updatesContinuously;
        n4 = (int)(context.getBoolean(n4, false) ? 1 : 0);
        this.J = n4;
        context.recycle();
    }

    public final void f(ly2_1 object) {
        int n3;
        super.f((ly2_1)object);
        Object object2 = ((RecyclerView$B)object).itemView;
        SeekBarPreference$b seekBarPreference$b = this.L;
        object2.setOnKeyListener((View.OnKeyListener)seekBarPreference$b);
        int bl2 = R$id.seekbar;
        object2 = (SeekBar)((ly2_1)object).w(bl2);
        this.F = object2;
        int n4 = R$id.seekbar_value;
        object = (TextView)((ly2_1)object).w(n4);
        this.G = object;
        boolean bl3 = this.I;
        if (bl3) {
            boolean bl4 = false;
            object2 = null;
            object.setVisibility(0);
        } else {
            int n7 = 8;
            object.setVisibility(n7);
            n3 = 0;
            object = null;
            this.G = null;
        }
        object = this.F;
        if (object == null) {
            return;
        }
        object2 = this.K;
        object.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)object2);
        object = this.F;
        int n8 = this.C;
        int n10 = this.B;
        int n14 = n8 - n10;
        object.setMax(n14);
        n3 = this.D;
        if (n3 != 0) {
            object2 = this.F;
            object2.setKeyProgressIncrement(n3);
        } else {
            object = this.F;
            this.D = n3 = object.getKeyProgressIncrement();
        }
        object = this.F;
        int n15 = this.A;
        n10 = this.B;
        int n16 = n15 - n10;
        object.setProgress(n16);
        n3 = this.A;
        object2 = this.G;
        if (object2 != null) {
            object = String.valueOf(n3);
            object2.setText((CharSequence)object);
        }
        object = this.F;
        boolean bl5 = this.c();
        object.setEnabled(bl5);
    }

    public final Object h(TypedArray typedArray, int n3) {
        return typedArray.getInt(n3, 0);
    }

    public final void l(SeekBar object) {
        int n3 = this.B;
        int n4 = object.getProgress() + n3;
        if (n4 != (n3 = this.A)) {
            int n7 = this.B;
            if (n4 < n7) {
                n4 = n7;
            }
            if (n4 > (n7 = this.C)) {
                n4 = n7;
            }
            if (n4 != n3) {
                this.A = n4;
                TextView textView = this.G;
                if (textView != null) {
                    object = String.valueOf(n4);
                    textView.setText((CharSequence)object);
                }
            }
        }
    }
}

