/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.database.DataSetObserver
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow$OnDismissListener
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.ActivityChooserView$2;
import androidx.appcompat.widget.ActivityChooserView$a;
import androidx.appcompat.widget.ActivityChooserView$e;
import androidx.appcompat.widget.ActivityChooserView$f;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.view.ViewCompat;

public class ActivityChooserView
extends ViewGroup {
    public final ActivityChooserView$e a;
    public final ActivityChooserView$f b;
    public final View c;
    public final FrameLayout d;
    public final ImageView e;
    public final FrameLayout f;
    public Q2 g;
    public final ViewTreeObserver.OnGlobalLayoutListener h;
    public ListPopupWindow i;
    public PopupWindow.OnDismissListener j;
    public boolean k;

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet object, int n3) {
        super(context, object, n3);
        new ActivityChooserView$a(this);
        ActivityChooserView$2 activityChooserView$2 = new ActivityChooserView$2(this);
        this.h = activityChooserView$2;
        Object object2 = R$styleable.ActivityChooserView;
        object2 = context.obtainStyledAttributes(object, object2, n3, 0);
        int[] nArray = R$styleable.ActivityChooserView;
        ViewCompat.r((View)this, context, nArray, object, (TypedArray)object2, n3, 0);
        int n4 = R$styleable.ActivityChooserView_initialActivityCount;
        object2.getInt(n4, 4);
        n4 = R$styleable.ActivityChooserView_expandActivityOverflowButtonDrawable;
        object = object2.getDrawable(n4);
        object2.recycle();
        Object object3 = LayoutInflater.from((Context)this.getContext());
        int n7 = R$layout.abc_activity_chooser_view;
        object3.inflate(n7, (ViewGroup)this, true);
        super(this);
        this.b = object3;
        n7 = R$id.activity_chooser_view_content;
        activityChooserView$2 = this.findViewById(n7);
        this.c = activityChooserView$2;
        activityChooserView$2.getBackground();
        n7 = R$id.default_activity_button;
        activityChooserView$2 = (FrameLayout)this.findViewById(n7);
        this.f = activityChooserView$2;
        activityChooserView$2.setOnClickListener((View.OnClickListener)object3);
        activityChooserView$2.setOnLongClickListener((View.OnLongClickListener)object3);
        int n8 = R$id.image;
        activityChooserView$2 = (ImageView)activityChooserView$2.findViewById(n8);
        n7 = R$id.expand_activities_button;
        activityChooserView$2 = (FrameLayout)this.findViewById(n7);
        activityChooserView$2.setOnClickListener((View.OnClickListener)object3);
        super();
        activityChooserView$2.setAccessibilityDelegate((View.AccessibilityDelegate)object3);
        super(this, (FrameLayout)activityChooserView$2);
        activityChooserView$2.setOnTouchListener((View.OnTouchListener)object3);
        this.d = activityChooserView$2;
        n3 = R$id.image;
        object3 = (ImageView)activityChooserView$2.findViewById(n3);
        this.e = object3;
        object3.setImageDrawable((Drawable)object);
        super(this);
        this.a = object;
        super(this);
        object.registerDataSetObserver((DataSetObserver)object3);
        context = context.getResources();
        n4 = context.getDisplayMetrics().widthPixels / 2;
        n3 = R$dimen.abc_config_prefDialogWidth;
        int n10 = context.getDimensionPixelSize(n3);
        Math.max(n4, n10);
    }

    public final void a() {
        boolean bl2 = this.b();
        if (bl2) {
            this.getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            boolean bl3 = viewTreeObserver.isAlive();
            if (bl3) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.h;
                viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener2);
            }
        }
    }

    public final boolean b() {
        return this.getListPopupWindow().z.isShowing();
    }

    public c3_0 getDataModel() {
        ((Object)((Object)this.a)).getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        ListPopupWindow listPopupWindow = this.i;
        if (listPopupWindow == null) {
            boolean bl2;
            Object object = this.getContext();
            this.i = listPopupWindow = new ListPopupWindow((Context)object);
            object = this.a;
            listPopupWindow.m((ListAdapter)object);
            listPopupWindow = this.i;
            listPopupWindow.o = this;
            listPopupWindow.y = bl2 = true;
            listPopupWindow.z.setFocusable(bl2);
            listPopupWindow = this.i;
            object = this.b;
            listPopupWindow.p = object;
            listPopupWindow = listPopupWindow.z;
            listPopupWindow.setOnDismissListener((PopupWindow.OnDismissListener)object);
        }
        return this.i;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((Object)((Object)this.a)).getClass();
        this.k = true;
    }

    public final void onDetachedFromWindow() {
        boolean bl2;
        super.onDetachedFromWindow();
        ((Object)((Object)this.a)).getClass();
        ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
        boolean bl3 = viewTreeObserver.isAlive();
        if (bl3) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.h;
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener2);
        }
        if (bl2 = this.b()) {
            this.a();
        }
        this.k = false;
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        n7 -= n3;
        View view = this.c;
        n3 = 0;
        view.layout(0, 0, n7, n8 -= n4);
        bl2 = this.b();
        if (!bl2) {
            this.a();
        }
    }

    public final void onMeasure(int n3, int n4) {
        FrameLayout frameLayout = this.f;
        int n7 = frameLayout.getVisibility();
        if (n7 != 0) {
            n4 = View.MeasureSpec.getSize((int)n4);
            n7 = 0x40000000;
            n4 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n7);
        }
        frameLayout = this.c;
        this.measureChild((View)frameLayout, n3, n4);
        n3 = frameLayout.getMeasuredWidth();
        n4 = frameLayout.getMeasuredHeight();
        this.setMeasuredDimension(n3, n4);
    }

    public void setActivityChooserModel(c3_0 object) {
        object = this.a;
        ActivityChooserView$e activityChooserView$e = ((ActivityChooserView$e)((Object)object)).a.a;
        ((Object)((Object)activityChooserView$e)).getClass();
        object.notifyDataSetChanged();
        boolean bl2 = this.b();
        if (bl2) {
            this.a();
            bl2 = this.b();
            if (!bl2 && (bl2 = this.k)) {
                object.getClass();
                object = new IllegalStateException("No data model. Did you call #setDataModel?");
                throw object;
            }
        }
    }

    public void setDefaultActionButtonContentDescription(int n3) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int n3) {
        String string2 = this.getContext().getString(n3);
        this.e.setContentDescription((CharSequence)string2);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable2) {
        this.e.setImageDrawable(drawable2);
    }

    public void setInitialActivityCount(int n3) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.j = onDismissListener;
    }

    public void setProvider(Q2 q2) {
        this.g = q2;
    }
}

