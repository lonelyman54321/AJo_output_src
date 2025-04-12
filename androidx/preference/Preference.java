/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.preference.Preference$a;
import androidx.preference.Preference$b;
import androidx.preference.Preference$c;
import androidx.preference.Preference$d;
import androidx.preference.PreferenceGroupAdapter;
import androidx.preference.R$attr;
import androidx.preference.R$id;
import androidx.preference.R$layout;
import androidx.preference.R$styleable;

public class Preference
implements Comparable {
    public final Context a;
    public final int b;
    public final CharSequence c;
    public final CharSequence d;
    public final int e;
    public Drawable f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final Object k;
    public boolean l;
    public boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final int v;
    public Preference$b w;
    public Preference$c x;
    public Preference$d y;
    public final Preference$a z;

    public Preference(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.preferenceStyle;
        n3 = dt3.a(context, n3, 16842894);
        this(context, attributeSet, n3);
    }

    public Preference(Context context, AttributeSet attributeSet, int n3) {
        this(context, attributeSet, n3, 0);
    }

    public Preference(Context context, AttributeSet object, int n3, int n4) {
        int n7;
        boolean bl2;
        this.b = n4 = -1 >>> 1;
        this.i = bl2 = true;
        this.j = bl2;
        this.l = bl2;
        this.m = bl2;
        this.n = bl2;
        this.o = bl2;
        this.q = bl2;
        this.t = bl2;
        this.u = n7 = R$layout.preference;
        Object object2 = new Preference$a(this);
        this.z = object2;
        this.a = context;
        object2 = R$styleable.Preference;
        context = context.obtainStyledAttributes(object, (int[])object2, n3, 0);
        int n8 = R$styleable.Preference_icon;
        n3 = R$styleable.Preference_android_icon;
        n3 = context.getResourceId(n3, 0);
        this.e = n8 = context.getResourceId(n8, n3);
        n8 = R$styleable.Preference_key;
        n3 = R$styleable.Preference_android_key;
        object = context.getString(n8);
        if (object == null) {
            object = context.getString(n3);
        }
        this.g = object;
        n8 = R$styleable.Preference_title;
        n3 = R$styleable.Preference_android_title;
        object = context.getText(n8);
        if (object == null) {
            object = context.getText(n3);
        }
        this.c = object;
        n8 = R$styleable.Preference_summary;
        n3 = R$styleable.Preference_android_summary;
        object = context.getText(n8);
        if (object == null) {
            object = context.getText(n3);
        }
        this.d = object;
        n8 = R$styleable.Preference_order;
        n3 = R$styleable.Preference_android_order;
        n3 = context.getInt(n3, n4);
        this.b = n8 = context.getInt(n8, n3);
        n8 = R$styleable.Preference_fragment;
        n3 = R$styleable.Preference_android_fragment;
        object = context.getString(n8);
        if (object == null) {
            object = context.getString(n3);
        }
        this.h = object;
        n8 = R$styleable.Preference_layout;
        n3 = R$styleable.Preference_android_layout;
        n4 = R$layout.preference;
        n3 = context.getResourceId(n3, n4);
        this.u = n8 = context.getResourceId(n8, n3);
        n8 = R$styleable.Preference_widgetLayout;
        n3 = R$styleable.Preference_android_widgetLayout;
        n3 = context.getResourceId(n3, 0);
        this.v = n8 = context.getResourceId(n8, n3);
        n8 = R$styleable.Preference_enabled;
        n3 = R$styleable.Preference_android_enabled;
        n3 = (int)(context.getBoolean(n3, bl2) ? 1 : 0);
        n8 = (int)(context.getBoolean(n8, n3 != 0) ? 1 : 0);
        this.i = n8;
        n8 = R$styleable.Preference_selectable;
        n3 = R$styleable.Preference_android_selectable;
        n3 = (int)(context.getBoolean(n3, bl2) ? 1 : 0);
        n8 = (int)(context.getBoolean(n8, n3 != 0) ? 1 : 0);
        this.j = n8;
        n3 = R$styleable.Preference_persistent;
        n4 = R$styleable.Preference_android_persistent;
        n4 = (int)(context.getBoolean(n4, bl2) ? 1 : 0);
        context.getBoolean(n3, n4 != 0);
        n3 = R$styleable.Preference_dependency;
        n4 = R$styleable.Preference_android_dependency;
        String string2 = context.getString(n3);
        if (string2 == null) {
            context.getString(n4);
        }
        n3 = R$styleable.Preference_allowDividerAbove;
        n4 = (int)(context.getBoolean(n3, n8 != 0) ? 1 : 0);
        n3 = (int)(context.getBoolean(n3, n4 != 0) ? 1 : 0);
        this.n = n3;
        n3 = R$styleable.Preference_allowDividerBelow;
        n8 = context.getBoolean(n3, n8 != 0);
        this.o = n8 = context.getBoolean(n3, n8 != 0);
        n8 = R$styleable.Preference_defaultValue;
        if ((n8 = (int)(context.hasValue(n8) ? 1 : 0)) != 0) {
            n8 = R$styleable.Preference_defaultValue;
            object = this.h((TypedArray)context, n8);
            this.k = object;
        } else {
            n8 = R$styleable.Preference_android_defaultValue;
            if ((n8 = (int)(context.hasValue(n8) ? 1 : 0)) != 0) {
                n8 = R$styleable.Preference_android_defaultValue;
                object = this.h((TypedArray)context, n8);
                this.k = object;
            }
        }
        n8 = R$styleable.Preference_shouldDisableView;
        n3 = R$styleable.Preference_android_shouldDisableView;
        n3 = (int)(context.getBoolean(n3, bl2) ? 1 : 0);
        n8 = (int)(context.getBoolean(n8, n3 != 0) ? 1 : 0);
        this.t = n8;
        n8 = R$styleable.Preference_singleLineTitle;
        n8 = (int)(context.hasValue(n8) ? 1 : 0);
        this.p = n8;
        if (n8 != 0) {
            n8 = R$styleable.Preference_singleLineTitle;
            n3 = R$styleable.Preference_android_singleLineTitle;
            n3 = (int)(context.getBoolean(n3, bl2) ? 1 : 0);
            n8 = (int)(context.getBoolean(n8, n3 != 0) ? 1 : 0);
            this.q = n8;
        }
        n8 = R$styleable.Preference_iconSpaceReserved;
        n3 = R$styleable.Preference_android_iconSpaceReserved;
        n3 = (int)(context.getBoolean(n3, false) ? 1 : 0);
        n8 = (int)(context.getBoolean(n8, n3 != 0) ? 1 : 0);
        this.r = n8;
        n8 = R$styleable.Preference_isPreferenceVisible;
        n3 = (int)(context.getBoolean(n8, bl2) ? 1 : 0);
        context.getBoolean(n8, n3 != 0);
        n8 = R$styleable.Preference_enableCopying;
        n3 = (int)(context.getBoolean(n8, false) ? 1 : 0);
        n8 = (int)(context.getBoolean(n8, n3 != 0) ? 1 : 0);
        this.s = n8;
        context.recycle();
    }

    public static void j(View view, boolean bl2) {
        view.setEnabled(bl2);
        int n3 = view instanceof ViewGroup;
        if (n3 != 0) {
            view = (ViewGroup)view;
            for (n3 = view.getChildCount() + -1; n3 >= 0; n3 += -1) {
                View view2 = view.getChildAt(n3);
                Preference.j(view2, bl2);
            }
        }
    }

    public long a() {
        return 0L;
    }

    public CharSequence b() {
        Preference$d preference$d = this.y;
        if (preference$d != null) {
            return preference$d.a(this);
        }
        return this.d;
    }

    public boolean c() {
        boolean bl2 = this.i;
        bl2 = bl2 && (bl2 = this.l) && (bl2 = this.m);
        return bl2;
    }

    public final int compareTo(Object object) {
        object = (Preference)object;
        int n3 = this.b;
        int n4 = ((Preference)object).b;
        if (n3 != n4) {
            n3 -= n4;
        } else {
            CharSequence charSequence = this.c;
            CharSequence charSequence2 = ((Preference)object).c;
            if (charSequence == charSequence2) {
                n3 = 0;
                charSequence = null;
            } else if (charSequence == null) {
                n3 = 1;
            } else if (charSequence2 == null) {
                n3 = -1;
            } else {
                charSequence = charSequence.toString();
                object = ((Preference)object).c.toString();
                n3 = ((String)charSequence).compareToIgnoreCase((String)object);
            }
        }
        return n3;
    }

    public void d() {
        Preference$b preference$b = this.w;
        if (preference$b == null) {
            return;
        }
        ((PreferenceGroupAdapter)preference$b).getClass();
        throw null;
    }

    public void e(boolean bl2) {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void f(ly2_1 var1_1) {
        var2_2 = var1_1.itemView;
        var3_3 = this.z;
        var2_2.setOnClickListener((View.OnClickListener)var3_3);
        var4_4 = false;
        var3_3 = null;
        var2_2.setId(0);
        var5_5 = 0x1020010;
        var6_6 = (TextView)var1_1.w(var5_5);
        var7_7 = 8;
        if (var6_6 == null) ** GOTO lbl20
        var8_8 = this.b();
        var9_9 = TextUtils.isEmpty((CharSequence)var8_8);
        if (!var9_9) {
            var6_6.setText(var8_8);
            var6_6.setVisibility(0);
            var5_5 = var6_6.getCurrentTextColor();
            var6_6 = var5_5;
        } else {
            var6_6.setVisibility(var7_7);
lbl20:
            // 2 sources

            var5_5 = 0;
            var6_6 = null;
        }
        var10_10 = 16908310;
        var8_8 = (TextView)var1_1.w(var10_10);
        var9_9 = this.j;
        if (var8_8 != null) {
            var11_11 = this.c;
            var12_12 = TextUtils.isEmpty((CharSequence)var11_11);
            if (var12_12 == 0) {
                var8_8.setText(var11_11);
                var8_8.setVisibility(0);
                var13_13 = this.p;
                if (var13_13) {
                    var13_13 = this.q;
                    var8_8.setSingleLine(var13_13);
                }
                if (!var9_9 && (var13_13 = (boolean)this.c()) && var6_6 != null) {
                    var5_5 = var6_6.intValue();
                    var8_8.setTextColor(var5_5);
                }
            } else {
                var8_8.setVisibility(var7_7);
            }
        }
        var5_5 = 16908294;
        var6_6 = (ImageView)var1_1.w(var5_5);
        var10_10 = (int)this.r;
        var13_13 = 4 != 0;
        if (var6_6 != null) {
            var12_12 = this.e;
            if (var12_12 != 0 || (var14_14 = this.f) != null) {
                var14_14 = this.f;
                if (var14_14 == null) {
                    var14_14 = this.a;
                    this.f = var15_15 = xn.a((Context)var14_14, var12_12);
                }
                if ((var15_15 = this.f) != null) {
                    var6_6.setImageDrawable(var15_15);
                }
            }
            if ((var15_15 = this.f) != null) {
                var6_6.setVisibility(0);
            } else {
                var12_12 = var10_10 != 0 ? 4 : 8;
                var6_6.setVisibility(var12_12);
            }
        }
        if ((var6_6 = var1_1.w(var5_5 = R$id.icon_frame)) == null) {
            var5_5 = 16908350;
            var6_6 = var1_1.w(var5_5);
        }
        if (var6_6 != null) {
            var15_15 = this.f;
            if (var15_15 != null) {
                var6_6.setVisibility(0);
            } else {
                if (var10_10 != 0) {
                    var7_7 = 4;
                }
                var6_6.setVisibility(var7_7);
            }
        }
        if (var4_4 = this.t) {
            var4_4 = this.c();
            Preference.j(var2_2, var4_4);
        } else {
            var4_4 = true;
            Preference.j(var2_2, var4_4);
        }
        var2_2.setFocusable(var9_9);
        var2_2.setClickable(var9_9);
        var1_1.d = var4_4 = this.n;
        var1_1.e = var4_4 = this.o;
        var16_16 = this.s;
        if (var16_16 && (var3_3 = this.x) == null) {
            this.x = var3_3 = new Preference$c(this);
        }
        if (var16_16) {
            var3_3 = this.x;
        } else {
            var4_4 = false;
            var3_3 = null;
        }
        var2_2.setOnCreateContextMenuListener((View.OnCreateContextMenuListener)var3_3);
        var2_2.setLongClickable(var16_16);
        if (var16_16 && !var9_9) {
            var1_1 = ViewCompat.a;
            var2_2.setBackground(null);
        }
    }

    public void g() {
    }

    public Object h(TypedArray typedArray, int n3) {
        return null;
    }

    public void i(View view) {
        boolean bl2 = this.c();
        if (bl2 && (bl2 = this.j)) {
            this.g();
        }
    }

    public boolean k() {
        return this.c() ^ true;
    }

    public final String toString() {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = this.c;
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        char c2 = ' ';
        if (!bl2) {
            stringBuilder.append(charSequence);
            stringBuilder.append(c2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(charSequence = this.b())))) {
            stringBuilder.append(charSequence);
            stringBuilder.append(c2);
        }
        if ((n3 = stringBuilder.length()) > 0) {
            n3 = stringBuilder.length() + -1;
            stringBuilder.setLength(n3);
        }
        return stringBuilder.toString();
    }
}

