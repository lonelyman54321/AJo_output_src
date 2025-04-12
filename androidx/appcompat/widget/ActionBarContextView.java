/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView$a;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;

public class ActionBarContextView
extends z0 {
    public CharSequence i;
    public CharSequence j;
    public View k;
    public View l;
    public View m;
    public LinearLayout n;
    public TextView o;
    public TextView p;
    public final int q;
    public final int r;
    public boolean s;
    public final int t;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.actionModeStyle;
        this(context, attributeSet, n3);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int[] nArray = R$styleable.ActionMode;
        attributeSet = context.obtainStyledAttributes(attributeSet, nArray, n3, 0);
        n3 = R$styleable.ActionMode_background;
        int n4 = attributeSet.hasValue(n3);
        context = n4 != 0 && (n4 = attributeSet.getResourceId(n3, 0)) != 0 ? xn.a(context, n4) : attributeSet.getDrawable(n3);
        this.setBackground((Drawable)context);
        int n7 = R$styleable.ActionMode_titleTextStyle;
        this.q = n7 = attributeSet.getResourceId(n7, 0);
        n7 = R$styleable.ActionMode_subtitleTextStyle;
        this.r = n7 = attributeSet.getResourceId(n7, 0);
        n7 = R$styleable.ActionMode_height;
        this.e = n7 = attributeSet.getLayoutDimension(n7, 0);
        n7 = R$styleable.ActionMode_closeItemLayout;
        n3 = R$layout.abc_action_mode_close_item_material;
        this.t = n7 = attributeSet.getResourceId(n7, n3);
        attributeSet.recycle();
    }

    public final void f(P2 object) {
        boolean bl2;
        Object object2 = this.k;
        i i3 = null;
        if (object2 == null) {
            object2 = LayoutInflater.from((Context)this.getContext());
            int bl22 = this.t;
            object2 = object2.inflate(bl22, (ViewGroup)this, false);
            this.k = object2;
            this.addView((View)object2);
        } else if ((object2 = object2.getParent()) == null) {
            object2 = this.k;
            this.addView((View)object2);
        }
        object2 = this.k;
        int n3 = R$id.action_mode_close_button;
        object2 = object2.findViewById(n3);
        this.l = object2;
        Object object3 = new ActionBarContextView$a((P2)object);
        object2.setOnClickListener((View.OnClickListener)object3);
        object = ((P2)object).c();
        object2 = this.d;
        if (object2 != null) {
            boolean bl3;
            ((ActionMenuPresenter)object2).b();
            object2 = ((ActionMenuPresenter)object2).u;
            if (object2 != null && (bl3 = ((g)object2).b())) {
                object2 = ((g)object2).j;
                object2.dismiss();
            }
        }
        object3 = this.getContext();
        this.d = object2 = new ActionMenuPresenter((Context)object3);
        ((ActionMenuPresenter)object2).m = bl2 = true;
        ((ActionMenuPresenter)object2).n = bl2;
        int n4 = -2;
        int n7 = -1;
        object2 = new ViewGroup.LayoutParams(n4, n7);
        Object object4 = this.d;
        Object object5 = this.b;
        ((d)object).addMenuPresenter((h)object4, (Context)object5);
        object = this.d;
        object4 = ((a)object).h;
        if (object4 == null) {
            object5 = ((a)object).d;
            int n8 = ((a)object).f;
            ((a)object).h = i3 = (i)object5.inflate(n8, (ViewGroup)this, false);
            object5 = ((a)object).c;
            i3.initialize((d)object5);
            ((ActionMenuPresenter)object).updateMenuView(bl2);
        }
        if (object4 != (i3 = ((a)object).h)) {
            object3 = i3;
            object3 = (ActionMenuView)i3;
            ((ActionMenuView)object3).setPresenter((ActionMenuPresenter)object);
        }
        i3 = (ActionMenuView)i3;
        this.c = i3;
        i3.setBackground(null);
        object = this.c;
        this.addView((View)object, (ViewGroup.LayoutParams)object2);
    }

    public final void g() {
        TextView textView;
        CharSequence charSequence;
        int n3;
        int n4;
        Object object = this.n;
        if (object == null) {
            object = LayoutInflater.from((Context)this.getContext());
            n4 = R$layout.abc_action_bar_title_item;
            object.inflate(n4, (ViewGroup)this);
            n3 = this.getChildCount() + -1;
            this.n = object = (LinearLayout)this.getChildAt(n3);
            n4 = R$id.action_bar_title;
            object = (TextView)object.findViewById(n4);
            this.o = object;
            object = this.n;
            n4 = R$id.action_bar_subtitle;
            object = (TextView)object.findViewById(n4);
            this.p = object;
            n3 = this.q;
            if (n3 != 0) {
                charSequence = this.o;
                textView = this.getContext();
                charSequence.setTextAppearance((Context)textView, n3);
            }
            if ((n3 = this.r) != 0) {
                charSequence = this.p;
                textView = this.getContext();
                charSequence.setTextAppearance((Context)textView, n3);
            }
        }
        object = this.o;
        charSequence = this.i;
        object.setText(charSequence);
        object = this.p;
        charSequence = this.j;
        object.setText(charSequence);
        object = this.i;
        n3 = TextUtils.isEmpty((CharSequence)object) ^ 1;
        charSequence = this.j;
        n4 = TextUtils.isEmpty((CharSequence)charSequence) ^ 1;
        textView = this.p;
        int n7 = 8;
        int n8 = n4 != 0 ? 0 : 8;
        textView.setVisibility(n8);
        textView = this.n;
        if (n3 != 0 || n4 != 0) {
            n7 = 0;
        }
        textView.setVisibility(n7);
        object = this.n.getParent();
        if (object == null) {
            object = this.n;
            this.addView((View)object);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        return marginLayoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        return marginLayoutParams;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    public final void h() {
        this.removeAllViews();
        this.m = null;
        this.c = null;
        this.d = null;
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object object = this.d;
        if (object != null) {
            boolean bl2;
            ((ActionMenuPresenter)object).b();
            object = this.d.u;
            if (object != null && (bl2 = ((g)object).b())) {
                object = ((g)object).j;
                object.dismiss();
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        View view;
        LinearLayout linearLayout;
        void var5_11;
        View view2;
        int n10;
        int n14;
        int n15;
        int n16;
        void var4_10;
        void var1_6;
        int n17;
        boolean bl3 = dE3.a;
        int n18 = this.getLayoutDirection();
        if (n18 == (n17 = 1)) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
        }
        if (var1_6 != false) {
            n15 = var4_10 - n16;
            n14 = this.getPaddingRight();
            n15 -= n14;
        } else {
            n15 = this.getPaddingLeft();
        }
        n14 = this.getPaddingTop();
        var5_11 -= n10;
        n10 = this.getPaddingTop();
        var5_11 -= n10;
        n10 = this.getPaddingBottom();
        var5_11 -= n10;
        View view3 = this.k;
        int n19 = 8;
        if (view3 != null && (n10 = view3.getVisibility()) != n19) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
            int n20 = var1_6 != false ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            n10 = var1_6 != false ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            n15 = var1_6 != false ? (n15 -= n20) : (n15 += n20);
            view2 = this.k;
            n20 = z0.d(view2, (boolean)var1_6, n15, n14, (int)var5_11) + n15;
            n20 = var1_6 != false ? (n20 -= n10) : (n20 += n10);
            n15 = n20;
        }
        if ((linearLayout = this.n) != null && (view2 = this.m) == null && (n10 = linearLayout.getVisibility()) != n19) {
            LinearLayout linearLayout2 = this.n;
            n10 = z0.d((View)linearLayout2, (boolean)var1_6, n15, n14, (int)var5_11);
            n15 += n10;
        }
        if ((view = this.m) != null) {
            z0.d(view, (boolean)var1_6, n15, n14, (int)var5_11);
        }
        if (var1_6 != false) {
            n16 = this.getPaddingLeft();
        } else {
            var4_10 -= n16;
            n16 = this.getPaddingRight();
            n16 = var4_10 - n16;
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            boolean bl6 = var1_6 ^ n17;
            z0.d((View)actionMenuView, bl6, n16, n14, (int)var5_11);
        }
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        int n8 = View.MeasureSpec.getMode((int)n3);
        if (n8 == (n7 = 0x40000000)) {
            n8 = View.MeasureSpec.getMode((int)n4);
            if (n8 != 0) {
                View view;
                int n10;
                View view2;
                int n14;
                int n15;
                n3 = View.MeasureSpec.getSize((int)n3);
                n8 = this.e;
                if (n8 <= 0) {
                    n8 = View.MeasureSpec.getSize((int)n4);
                }
                n4 = this.getPaddingTop();
                int n16 = this.getPaddingBottom() + n4;
                n4 = this.getPaddingLeft();
                n4 = n3 - n4;
                int n17 = this.getPaddingRight();
                n4 -= n17;
                n17 = n8 - n16;
                int n18 = -1 << -1;
                int n19 = View.MeasureSpec.makeMeasureSpec((int)n17, (int)n18);
                Object object = this.k;
                if (object != null) {
                    n4 = z0.c(object, n4, n19);
                    object = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
                    n15 = object.leftMargin;
                    n14 = object.rightMargin;
                    n4 -= (n15 += n14);
                }
                if ((object = this.c) != null && (object = object.getParent()) == this) {
                    object = this.c;
                    n4 = z0.c(object, n4, n19);
                }
                object = this.n;
                n15 = 0;
                if (object != null && (view2 = this.m) == null) {
                    n10 = this.s;
                    if (n10 != 0) {
                        n14 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                        view2 = this.n;
                        view2.measure(n14, n19);
                        view = this.n;
                        n19 = view.getMeasuredWidth();
                        if (n19 <= n4) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            object = null;
                        }
                        if (n14 != 0) {
                            n4 -= n19;
                        }
                        view = this.n;
                        if (n14 != 0) {
                            n14 = 0;
                            object = null;
                        } else {
                            n14 = 8;
                        }
                        view.setVisibility(n14);
                    } else {
                        n4 = z0.c(object, n4, n19);
                    }
                }
                if ((view = this.m) != null) {
                    view = view.getLayoutParams();
                    n14 = view.width;
                    n10 = -2;
                    int n20 = n14 != n10 ? 0x40000000 : -1 << -1;
                    if (n14 >= 0) {
                        n4 = Math.min(n14, n4);
                    }
                    if ((n19 = view.height) == n10) {
                        n7 = -1 << -1;
                    }
                    if (n19 >= 0) {
                        n17 = Math.min(n19, n17);
                    }
                    View view3 = this.m;
                    n4 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n20);
                    n7 = View.MeasureSpec.makeMeasureSpec((int)n17, (int)n7);
                    view3.measure(n4, n7);
                }
                if ((n4 = this.e) <= 0) {
                    n4 = this.getChildCount();
                    n8 = 0;
                    while (n15 < n4) {
                        View view4 = this.getChildAt(n15);
                        n7 = view4.getMeasuredHeight() + n16;
                        if (n7 > n8) {
                            n8 = n7;
                        }
                        ++n15;
                    }
                    this.setMeasuredDimension(n3, n8);
                } else {
                    this.setMeasuredDimension(n3, n8);
                }
                return;
            }
            String string2 = ((Object)((Object)this)).getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\"");
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        String string3 = ((Object)((Object)this)).getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        IllegalStateException illegalStateException = new IllegalStateException(string3);
        throw illegalStateException;
    }

    public void setContentHeight(int n3) {
        this.e = n3;
    }

    public void setCustomView(View view) {
        View view2 = this.m;
        if (view2 != null) {
            this.removeView(view2);
        }
        this.m = view;
        if (view != null && (view2 = this.n) != null) {
            this.removeView(view2);
            view2 = null;
            this.n = null;
        }
        if (view != null) {
            this.addView(view);
        }
        this.requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        this.g();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        this.g();
        ViewCompat.t((View)this, charSequence);
    }

    public void setTitleOptional(boolean bl2) {
        boolean bl3 = this.s;
        if (bl2 != bl3) {
            this.requestLayout();
        }
        this.s = bl2;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

