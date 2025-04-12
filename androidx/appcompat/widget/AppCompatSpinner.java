/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.ArrayAdapter
 *  android.widget.ListAdapter
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  android.widget.ThemedSpinnerAdapter
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatSpinner$2;
import androidx.appcompat.widget.AppCompatSpinner$DropdownPopup;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import androidx.appcompat.widget.AppCompatSpinner$a;
import androidx.appcompat.widget.AppCompatSpinner$b;
import androidx.appcompat.widget.AppCompatSpinner$c;
import androidx.appcompat.widget.AppCompatSpinner$d;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.a;

public class AppCompatSpinner
extends Spinner {
    public static final int[] i = new int[]{16843505};
    public final Qm a;
    public final Context b;
    public final a c;
    public SpinnerAdapter d;
    public final boolean e;
    public final AppCompatSpinner$d f;
    public int g;
    public final Rect h;

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.spinnerStyle;
        this(context, attributeSet, n3);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int n3) {
        int n4;
        int n7;
        TypedArray typedArray;
        int n8;
        Object object;
        Object object2;
        int n10;
        Object object3;
        block23: {
            void var11_19;
            block20: {
                block22: {
                    void var1_4;
                    void var10_16;
                    block21: {
                        super(context, attributeSet, n3);
                        object3 = new Rect();
                        this.h = object3;
                        Um3.a(this.getContext(), (View)this);
                        object3 = R$styleable.Spinner;
                        n10 = 0;
                        object2 = null;
                        object3 = Tn3.f(context, attributeSet, (int[])object3, n3, 0);
                        object = new Qm((View)this);
                        this.a = object;
                        n8 = R$styleable.Spinner_popupTheme;
                        typedArray = ((Tn3)object3).b;
                        n8 = typedArray.getResourceId(n8, 0);
                        if (n8 != 0) {
                            d80 d802 = new d80(context, n8);
                            this.b = d802;
                        } else {
                            this.b = context;
                        }
                        n8 = -1;
                        Object var10_14 = null;
                        int[] nArray = i;
                        TypedArray typedArray2 = context.obtainStyledAttributes(attributeSet, nArray, n3, 0);
                        try {
                            n7 = typedArray2.hasValue(0);
                            if (n7 != 0) {
                                n8 = typedArray2.getInt(0, 0);
                            }
                            break block20;
                        }
                        catch (Throwable throwable) {
                            TypedArray typedArray3 = typedArray2;
                            break block21;
                        }
                        catch (Exception exception) {
                            break block22;
                        }
                        catch (Throwable throwable) {
                        }
                        catch (Exception exception) {
                            n4 = 0;
                            Object var11_20 = null;
                            break block22;
                        }
                    }
                    if (var10_16 != null) {
                        var10_16.recycle();
                    }
                    throw var1_4;
                }
                if (var11_19 == null) break block23;
            }
            var11_19.recycle();
        }
        n4 = 1;
        if (n8 != 0) {
            if (n8 == n4) {
                Context context2 = this.b;
                object = new AppCompatSpinner$DropdownPopup(this, context2, attributeSet, n3);
                Context context3 = this.b;
                int[] nArray = R$styleable.Spinner;
                object2 = Tn3.f(context3, attributeSet, nArray, n3, 0);
                n7 = R$styleable.Spinner_android_dropDownWidth;
                TypedArray typedArray4 = ((Tn3)object2).b;
                int n14 = -2;
                this.g = n7 = typedArray4.getLayoutDimension(n7, n14);
                n7 = R$styleable.Spinner_android_popupBackground;
                Drawable drawable2 = ((Tn3)object2).b(n7);
                ((ListPopupWindow)object).setBackgroundDrawable(drawable2);
                n7 = R$styleable.Spinner_android_prompt;
                String string2 = typedArray.getString(n7);
                ((AppCompatSpinner$DropdownPopup)object).D = string2;
                ((Tn3)object2).g();
                this.f = object;
                this.c = object2 = new a(this, (View)this, (AppCompatSpinner$DropdownPopup)object);
            }
        } else {
            object2 = new AppCompatSpinner$b(this);
            this.f = object2;
            n8 = R$styleable.Spinner_android_prompt;
            ((AppCompatSpinner$b)object2).c = object = typedArray.getString(n8);
        }
        n10 = R$styleable.Spinner_android_entries;
        object2 = typedArray.getTextArray(n10);
        if (object2 != null) {
            int n15 = 17367048;
            object = new ArrayAdapter(context, n15, (Object[])object2);
            int n16 = R$layout.support_simple_spinner_dropdown_item;
            object.setDropDownViewResource(n16);
            this.setAdapter((SpinnerAdapter)object);
        }
        ((Tn3)object3).g();
        this.e = n4;
        context = this.d;
        if (context != null) {
            this.setAdapter((SpinnerAdapter)context);
            this.d = null;
        }
        this.a.d(attributeSet, n3);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable2) {
        int n3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int n4 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0);
        int n7 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0);
        int n8 = this.getSelectedItemPosition();
        n8 = Math.max(0, n8);
        int n10 = spinnerAdapter.getCount();
        int n14 = n8 + 15;
        n10 = Math.min(n10, n14);
        n14 = n10 - n8;
        n14 = 15 - n14;
        n8 -= n14;
        n8 = Math.max(0, n8);
        n14 = 0;
        int n15 = n8;
        View view = null;
        n8 = 0;
        while (n15 < n10) {
            ViewGroup.LayoutParams layoutParams;
            int n16 = spinnerAdapter.getItemViewType(n15);
            if (n16 != n3) {
                view = null;
                n3 = n16;
            }
            if ((layoutParams = (view = spinnerAdapter.getView(n15, view, (ViewGroup)this)).getLayoutParams()) == null) {
                int n17 = -2;
                layoutParams = new ViewGroup.LayoutParams(n17, n17);
                view.setLayoutParams(layoutParams);
            }
            view.measure(n4, n7);
            n16 = view.getMeasuredWidth();
            n8 = Math.max(n8, n16);
            ++n15;
        }
        if (drawable2 != null) {
            spinnerAdapter = this.h;
            drawable2.getPadding((Rect)spinnerAdapter);
            int n18 = spinnerAdapter.left;
            int n19 = spinnerAdapter.right;
            n8 += (n18 += n19);
        }
        return n8;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Qm qm = this.a;
        if (qm != null) {
            qm.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            return appCompatSpinner$d.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            return appCompatSpinner$d.k();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            return this.g;
        }
        return super.getDropDownWidth();
    }

    public final AppCompatSpinner$d getInternalPopup() {
        return this.f;
    }

    public Drawable getPopupBackground() {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            return appCompatSpinner$d.f();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.b;
    }

    public CharSequence getPrompt() {
        Object object = this.f;
        object = object != null ? object.e() : super.getPrompt();
        return object;
    }

    public ColorStateList getSupportBackgroundTintList() {
        Qm qm = this.a;
        qm = qm != null ? qm.b() : null;
        return qm;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Qm qm = this.a;
        qm = qm != null ? qm.c() : null;
        return qm;
    }

    public final void onDetachedFromWindow() {
        boolean bl2;
        super.onDetachedFromWindow();
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null && (bl2 = appCompatSpinner$d.a())) {
            appCompatSpinner$d.dismiss();
        }
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        super.onMeasure(n3, n4);
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null && (n4 = View.MeasureSpec.getMode((int)n3)) == (n7 = -1 << -1)) {
            n4 = this.getMeasuredWidth();
            SpinnerAdapter spinnerAdapter = this.getAdapter();
            Drawable drawable2 = this.getBackground();
            n7 = this.a(spinnerAdapter, drawable2);
            n4 = Math.max(n4, n7);
            n3 = View.MeasureSpec.getSize((int)n3);
            n3 = Math.min(n4, n3);
            n4 = this.getMeasuredHeight();
            this.setMeasuredDimension(n3, n4);
        }
    }

    public final void onRestoreInstanceState(Parcelable object) {
        object = (AppCompatSpinner$SavedState)((Object)object);
        Object object2 = object.getSuperState();
        super.onRestoreInstanceState(object2);
        boolean bl2 = object.a;
        if (bl2 && (object = this.getViewTreeObserver()) != null) {
            object2 = new AppCompatSpinner$2(this);
            object.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object2);
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean bl2;
        Object object = super.onSaveInstanceState();
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new View.BaseSavedState((Parcelable)object);
        object = this.f;
        if (object != null && (bl2 = object.a())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        appCompatSpinner$SavedState.a = bl2;
        return appCompatSpinner$SavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        a a2 = this.c;
        if (a2 != null && (bl2 = a2.onTouch((View)this, motionEvent))) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean performClick() {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            int n3 = appCompatSpinner$d.a();
            if (n3 == 0) {
                n3 = this.getTextDirection();
                int n4 = this.getTextAlignment();
                AppCompatSpinner$d appCompatSpinner$d2 = this.f;
                appCompatSpinner$d2.j(n3, n4);
            }
            return true;
        }
        return super.performClick();
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        boolean bl2 = this.e;
        if (!bl2) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            Context context = this.b;
            if (context == null) {
                context = this.getContext();
            }
            context = context.getTheme();
            AppCompatSpinner$c appCompatSpinner$c = new Object();
            appCompatSpinner$c.a = spinnerAdapter;
            int n3 = spinnerAdapter instanceof ListAdapter;
            if (n3 != 0) {
                SpinnerAdapter spinnerAdapter2 = spinnerAdapter;
                spinnerAdapter2 = (ListAdapter)spinnerAdapter;
                appCompatSpinner$c.b = spinnerAdapter2;
            }
            if (context != null) {
                n3 = Build.VERSION.SDK_INT;
                int n4 = 23;
                if (n3 >= n4 && (n3 = (int)(zn.a(spinnerAdapter) ? 1 : 0)) != 0) {
                    spinnerAdapter = An.a(spinnerAdapter);
                    AppCompatSpinner$a.a((ThemedSpinnerAdapter)spinnerAdapter, (Resources.Theme)context);
                } else {
                    boolean bl3 = spinnerAdapter instanceof Vm3;
                    if (bl3 && (context = (spinnerAdapter = (Vm3)spinnerAdapter).getDropDownViewTheme()) == null) {
                        spinnerAdapter.a();
                    }
                }
            }
            appCompatSpinner$d.m(appCompatSpinner$c);
        }
    }

    public void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((Qm)object).e();
        }
    }

    public void setBackgroundResource(int n3) {
        super.setBackgroundResource(n3);
        Qm qm = this.a;
        if (qm != null) {
            qm.f(n3);
        }
    }

    public void setDropDownHorizontalOffset(int n3) {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            appCompatSpinner$d.i(n3);
            appCompatSpinner$d.d(n3);
        } else {
            super.setDropDownHorizontalOffset(n3);
        }
    }

    public void setDropDownVerticalOffset(int n3) {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            appCompatSpinner$d.h(n3);
        } else {
            super.setDropDownVerticalOffset(n3);
        }
    }

    public void setDropDownWidth(int n3) {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            this.g = n3;
        } else {
            super.setDropDownWidth(n3);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable2) {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            appCompatSpinner$d.setBackgroundDrawable(drawable2);
        } else {
            super.setPopupBackgroundDrawable(drawable2);
        }
    }

    public void setPopupBackgroundResource(int n3) {
        Drawable drawable2 = xn.a(this.getPopupContext(), n3);
        this.setPopupBackgroundDrawable(drawable2);
    }

    public void setPrompt(CharSequence charSequence) {
        AppCompatSpinner$d appCompatSpinner$d = this.f;
        if (appCompatSpinner$d != null) {
            appCompatSpinner$d.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Qm qm = this.a;
        if (qm != null) {
            qm.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Qm qm = this.a;
        if (qm != null) {
            qm.i(mode);
        }
    }
}

