/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.ActionBar$b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ScrollingTabContainerView;

public final class ScrollingTabContainerView$b
extends LinearLayout {
    public ActionBar$b a;
    public AppCompatTextView b;
    public AppCompatImageView c;
    public View d;
    public final /* synthetic */ ScrollingTabContainerView e;

    public ScrollingTabContainerView$b(ScrollingTabContainerView object, Context context, ActionBar$b actionBar$b) {
        this.e = object;
        int n3 = R$attr.actionBarTabStyle;
        super(context, null, n3);
        n3 = 16842964;
        object = new int[]{n3};
        this.a = actionBar$b;
        int n4 = R$attr.actionBarTabStyle;
        object = Tn3.f(context, null, (int[])object, n4, 0);
        context = ((Tn3)object).b;
        boolean bl2 = context.hasValue(0);
        if (bl2) {
            context = ((Tn3)object).b(0);
            this.setBackgroundDrawable((Drawable)context);
        }
        ((Tn3)object).g();
        this.setGravity(8388627);
        this.a();
    }

    public final void a() {
        Object object = this.a;
        Object object2 = ((ActionBar$b)object).b();
        int n3 = 8;
        CharSequence charSequence = null;
        if (object2 != null) {
            object = object2.getParent();
            if (object != this) {
                if (object != null) {
                    object = (ViewGroup)object;
                    object.removeView(object2);
                }
                this.addView((View)object2);
            }
            this.d = object2;
            object = this.b;
            if (object != null) {
                object.setVisibility(n3);
            }
            if ((object = this.c) != null) {
                object.setVisibility(n3);
                object = this.c;
                ((AppCompatImageView)((Object)object)).setImageDrawable(null);
            }
        } else {
            Object object3;
            AppCompatImageView appCompatImageView;
            object2 = this.d;
            if (object2 != null) {
                this.removeView((View)object2);
                this.d = null;
            }
            object2 = ((ActionBar$b)object).c();
            Object object4 = ((ActionBar$b)object).d();
            int n4 = 16;
            int n7 = -2;
            if (object2 != null) {
                appCompatImageView = this.c;
                if (appCompatImageView == null) {
                    Context context = this.getContext();
                    appCompatImageView = new AppCompatImageView(context);
                    context = new LinearLayout.LayoutParams(n7, n7);
                    context.gravity = n4;
                    appCompatImageView.setLayoutParams((ViewGroup.LayoutParams)context);
                    this.addView((View)appCompatImageView, 0);
                    this.c = appCompatImageView;
                }
                appCompatImageView = this.c;
                appCompatImageView.setImageDrawable((Drawable)object2);
                object2 = this.c;
                object2.setVisibility(0);
            } else {
                object2 = this.c;
                if (object2 != null) {
                    object2.setVisibility(n3);
                    object2 = this.c;
                    object2.setImageDrawable(null);
                }
            }
            boolean bl2 = TextUtils.isEmpty((CharSequence)object4) ^ true;
            if (bl2) {
                object3 = this.b;
                if (object3 == null) {
                    appCompatImageView = this.getContext();
                    int n8 = R$attr.actionBarTabTextStyle;
                    object3 = new AppCompatTextView((Context)appCompatImageView, null, n8);
                    appCompatImageView = TextUtils.TruncateAt.END;
                    object3.setEllipsize((TextUtils.TruncateAt)appCompatImageView);
                    appCompatImageView = new LinearLayout.LayoutParams(n7, n7);
                    ((LinearLayout.LayoutParams)appCompatImageView).gravity = n4;
                    object3.setLayoutParams((ViewGroup.LayoutParams)appCompatImageView);
                    this.addView((View)object3);
                    this.b = object3;
                }
                this.b.setText((CharSequence)object4);
                object3 = this.b;
                object3.setVisibility(0);
            } else {
                object4 = this.b;
                if (object4 != null) {
                    object4.setVisibility(n3);
                    object3 = this.b;
                    object3.setText(null);
                }
            }
            object3 = this.c;
            if (object3 != null) {
                object4 = ((ActionBar$b)object).a();
                object3.setContentDescription((CharSequence)object4);
            }
            if (!bl2) {
                charSequence = ((ActionBar$b)object).a();
            }
            vo3_0.a((View)this, charSequence);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
    }

    public final void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        ScrollingTabContainerView scrollingTabContainerView = this.e;
        int n7 = scrollingTabContainerView.e;
        if (n7 > 0 && (n7 = this.getMeasuredWidth()) > (n3 = scrollingTabContainerView.e)) {
            n7 = 0x40000000;
            n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n7);
            super.onMeasure(n3, n4);
        }
    }

    public final void setSelected(boolean bl2) {
        boolean bl3 = this.isSelected();
        bl3 = bl3 != bl2;
        super.setSelected(bl2);
        if (bl3 && bl2) {
            int n3 = 4;
            this.sendAccessibilityEvent(n3);
        }
    }
}

