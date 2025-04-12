/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.widget.Button
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.ActionMenuItemView$a;
import androidx.appcompat.view.menu.ActionMenuItemView$b;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d$b;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.i$a;
import androidx.appcompat.widget.ActionMenuView$a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;

public class ActionMenuItemView
extends AppCompatTextView
implements i$a,
View.OnClickListener,
ActionMenuView$a {
    public f a;
    public CharSequence b;
    public Drawable c;
    public d$b d;
    public ActionMenuItemView$a e;
    public ActionMenuItemView$b f;
    public boolean g;
    public boolean h;
    public final int i;
    public int j;
    public final int k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        boolean bl2;
        Resources resources = context.getResources();
        this.g = bl2 = this.a();
        int[] nArray = R$styleable.ActionMenuItemView;
        context = context.obtainStyledAttributes(attributeSet, nArray, n3, 0);
        int n7 = R$styleable.ActionMenuItemView_android_minWidth;
        this.i = n7 = context.getDimensionPixelSize(n7, 0);
        context.recycle();
        this.k = n4 = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener(this);
        this.j = -1;
        this.setSaveEnabled(false);
    }

    public final boolean a() {
        int n3;
        int n4;
        Configuration configuration = this.getContext().getResources().getConfiguration();
        int n7 = configuration.screenWidthDp;
        int n8 = configuration.screenHeightDp;
        int n10 = 480;
        if (n7 < n10 && (n7 < (n4 = 640) || n8 < n10) && (n3 = configuration.orientation) != (n7 = 2)) {
            n3 = 0;
            configuration = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    public final boolean b() {
        return TextUtils.isEmpty((CharSequence)this.getText()) ^ true;
    }

    public final boolean c() {
        CharSequence charSequence = this.getText();
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        boolean bl3 = true;
        if (!(bl2 ^= bl3) || (charSequence = this.a.getIcon()) != null) {
            bl3 = false;
        }
        return bl3;
    }

    public final void d() {
        CharSequence charSequence;
        int n3;
        int n4;
        Object object = this.b;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        boolean bl3 = true;
        bl2 ^= bl3;
        Object object2 = this.c;
        if (object2 != null) {
            object2 = this.a;
            n4 = object2.y;
            n3 = 4;
            if ((n4 &= n3) != n3 || (n4 = (int)(this.g ? 1 : 0)) == 0 && (n4 = (int)(this.h ? 1 : 0)) == 0) {
                bl3 = false;
                charSequence = null;
            }
        }
        bl2 &= bl3;
        bl3 = false;
        charSequence = null;
        if (bl2) {
            object2 = this.b;
        } else {
            n4 = 0;
            object2 = null;
        }
        this.setText((CharSequence)object2);
        object2 = this.a.q;
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 != 0) {
            if (bl2) {
                n4 = 0;
                object2 = null;
            } else {
                object2 = this.a.e;
            }
            this.setContentDescription((CharSequence)object2);
        } else {
            this.setContentDescription((CharSequence)object2);
        }
        object2 = this.a.r;
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 != 0) {
            if (!bl2) {
                object = this.a;
                charSequence = ((f)object).e;
            }
            vo3_0.a((View)this, charSequence);
        } else {
            vo3_0.a((View)this, (CharSequence)object2);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public f getItemData() {
        return this.a;
    }

    public final void initialize(f object, int n3) {
        this.a = object;
        Object object2 = ((f)object).getIcon();
        this.setIcon((Drawable)object2);
        object2 = ((f)object).getTitleCondensed();
        this.setTitle((CharSequence)object2);
        n3 = ((f)object).a;
        this.setId(n3);
        n3 = (int)(((f)object).isVisible() ? 1 : 0);
        if (n3 != 0) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = 8;
        }
        this.setVisibility(n3);
        n3 = (int)(((f)object).isEnabled() ? 1 : 0);
        this.setEnabled(n3 != 0);
        boolean bl2 = ((f)object).hasSubMenu();
        if (bl2 && (object = this.e) == null) {
            this.e = object = new ActionMenuItemView$a(this);
        }
    }

    public final void onClick(View object) {
        object = this.d;
        if (object != null) {
            f f5 = this.a;
            object.b(f5);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        boolean bl2;
        super.onConfigurationChanged(configuration);
        this.g = bl2 = this.a();
        this.d();
    }

    public final void onMeasure(int n3, int n4) {
        Drawable drawable2;
        int n7;
        int n8;
        int n10;
        int n14;
        CharSequence charSequence = this.getText();
        int n15 = TextUtils.isEmpty((CharSequence)charSequence) ^ 1;
        if (n15 != 0 && (n14 = this.j) >= 0) {
            n10 = this.getPaddingTop();
            n8 = this.getPaddingRight();
            n7 = this.getPaddingBottom();
            super.setPadding(n14, n10, n8, n7);
        }
        super.onMeasure(n3, n4);
        n14 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        n10 = this.getMeasuredWidth();
        n8 = this.i;
        n7 = -1 << -1;
        n3 = n14 == n7 ? Math.min(n3, n8) : n8;
        n7 = 0x40000000;
        if (n14 != n7 && n8 > 0 && n10 < n3) {
            n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n7);
            super.onMeasure(n3, n4);
        }
        if (n15 == 0 && (drawable2 = this.c) != null) {
            n3 = this.getMeasuredWidth();
            Rect rect = this.c.getBounds();
            n4 = rect.width();
            n3 = (n3 - n4) / 2;
            n4 = this.getPaddingTop();
            n15 = this.getPaddingRight();
            n14 = this.getPaddingBottom();
            super.setPadding(n3, n4, n15, n14);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object object = this.a;
        boolean bl2 = ((f)object).hasSubMenu();
        if (bl2 && (object = this.e) != null && (bl2 = ((ForwardingListener)object).onTouch((View)this, motionEvent))) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean bl2) {
    }

    public void setChecked(boolean bl2) {
    }

    public void setExpandedFormat(boolean bl2) {
        boolean bl3 = this.h;
        if (bl3 != bl2) {
            this.h = bl2;
            f f5 = this.a;
            if (f5 != null) {
                d d2 = f5.n;
                d2.onItemActionRequestChanged(f5);
            }
        }
    }

    public void setIcon(Drawable drawable2) {
        this.c = drawable2;
        if (drawable2 != null) {
            float f5;
            float f6;
            float f7;
            int n3 = drawable2.getIntrinsicWidth();
            int n4 = drawable2.getIntrinsicHeight();
            int n7 = this.k;
            if (n3 > n7) {
                f7 = n7;
                f6 = n3;
                f7 /= f6;
                f6 = (float)n4 * f7;
                n4 = (int)f6;
                n3 = n7;
            }
            if (n4 > n7) {
                f7 = n7;
                f5 = n4;
                f6 = (float)n3 * (f7 /= f5);
                n3 = (int)f6;
            } else {
                n7 = n4;
            }
            n4 = 0;
            f5 = 0.0f;
            drawable2.setBounds(0, 0, n3, n7);
        }
        this.setCompoundDrawables(drawable2, null, null, null);
        this.d();
    }

    public void setItemInvoker(d$b d$b) {
        this.d = d$b;
    }

    public void setPadding(int n3, int n4, int n7, int n8) {
        this.j = n3;
        super.setPadding(n3, n4, n7, n8);
    }

    public void setPopupCallback(ActionMenuItemView$b actionMenuItemView$b) {
        this.f = actionMenuItemView$b;
    }

    public void setShortcut(boolean bl2, char c2) {
    }

    public void setTitle(CharSequence charSequence) {
        this.b = charSequence;
        this.d();
    }
}

