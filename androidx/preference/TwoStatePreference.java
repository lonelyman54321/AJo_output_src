/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.TextView
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;

public abstract class TwoStatePreference
extends Preference {
    public boolean A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public boolean E;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3, 0);
    }

    public final void g() {
        boolean bl2 = this.A ^ true;
        this.l(bl2);
    }

    public final Object h(TypedArray typedArray, int n3) {
        return typedArray.getBoolean(n3, false);
    }

    public final boolean k() {
        boolean bl2 = this.E;
        boolean bl3 = false;
        bl2 = bl2 ? this.A : !(bl2 = this.A);
        if (bl2 || (bl2 = super.k())) {
            bl3 = true;
        }
        return bl3;
    }

    public final void l(boolean bl2) {
        boolean bl3;
        boolean bl4 = this.A;
        boolean bl5 = true;
        if ((bl4 = bl4 != bl2) || !(bl3 = this.D)) {
            this.A = bl2;
            this.D = bl5;
            if (bl4) {
                bl2 = this.k();
                this.e(bl2);
                this.d();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void m(View var1_1) {
        var2_2 = var1_1 instanceof TextView;
        if (var2_2 == 0) {
            return;
        }
        var1_1 = (TextView)var1_1;
        var2_2 = this.A;
        var3_3 = 0;
        if (var2_2 != 0 && (var2_2 = TextUtils.isEmpty((CharSequence)(var4_4 = this.B))) == 0) {
            var4_4 = this.B;
            var1_1.setText(var4_4);
lbl10:
            // 2 sources

            while (true) {
                var2_2 = 0;
                var4_4 = null;
                break;
            }
        } else {
            var2_2 = this.A;
            if (var2_2 == 0 && (var2_2 = TextUtils.isEmpty((CharSequence)(var4_4 = this.C))) == 0) {
                var4_4 = this.C;
                var1_1.setText(var4_4);
                ** continue;
            }
            var2_2 = 1;
        }
        if (var2_2 != 0 && !(var6_6 = TextUtils.isEmpty((CharSequence)(var5_5 = this.b())))) {
            var1_1.setText(var5_5);
            var2_2 = 0;
            var4_4 = null;
        }
        if (var2_2 != 0) {
            var3_3 = 8;
        }
        var2_2 = var1_1.getVisibility();
        if (var3_3 != var2_2) {
            var1_1.setVisibility(var3_3);
        }
    }
}

