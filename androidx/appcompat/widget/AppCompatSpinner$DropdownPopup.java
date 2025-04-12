/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.SpinnerAdapter
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$2;
import androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$b;
import androidx.appcompat.widget.AppCompatSpinner$d;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ListPopupWindow;

public final class AppCompatSpinner$DropdownPopup
extends ListPopupWindow
implements AppCompatSpinner$d {
    public CharSequence D;
    public ListAdapter E;
    public final Rect F;
    public int G;
    public final /* synthetic */ AppCompatSpinner H;

    public AppCompatSpinner$DropdownPopup(AppCompatSpinner object, Context context, AttributeSet attributeSet, int n3) {
        boolean bl2;
        this.H = object;
        super(context, attributeSet, n3);
        super();
        this.F = context;
        this.o = object;
        this.y = bl2 = true;
        this.z.setFocusable(bl2);
        super(this);
        this.p = object;
    }

    public final CharSequence e() {
        return this.D;
    }

    public final void g(CharSequence charSequence) {
        this.D = charSequence;
    }

    public final void i(int n3) {
        this.G = n3;
    }

    public final void j(int n3, int n4) {
        PopupWindow popupWindow = this.z;
        boolean bl2 = popupWindow.isShowing();
        this.q();
        this.z.setInputMethodMode(2);
        this.show();
        DropDownListView dropDownListView = this.c;
        boolean bl3 = true;
        dropDownListView.setChoiceMode((int)(bl3 ? 1 : 0));
        dropDownListView.setTextDirection(n3);
        dropDownListView.setTextAlignment(n4);
        Object object = this.H;
        n4 = object.getSelectedItemPosition();
        dropDownListView = this.c;
        int n7 = popupWindow.isShowing();
        if (n7 != 0 && dropDownListView != null) {
            popupWindow = null;
            dropDownListView.setListSelectionHidden(false);
            dropDownListView.setSelection(n4);
            n7 = dropDownListView.getChoiceMode();
            if (n7 != 0) {
                dropDownListView.setItemChecked(n4, bl3);
            }
        }
        if (bl2) {
            return;
        }
        if ((object = object.getViewTreeObserver()) != null) {
            AppCompatSpinner$DropdownPopup$2 appCompatSpinner$DropdownPopup$2 = new AppCompatSpinner$DropdownPopup$2(this);
            object.addOnGlobalLayoutListener(appCompatSpinner$DropdownPopup$2);
            object = new AppCompatSpinner$DropdownPopup$b(this, appCompatSpinner$DropdownPopup$2);
            appCompatSpinner$DropdownPopup$2 = this.z;
            appCompatSpinner$DropdownPopup$2.setOnDismissListener((PopupWindow.OnDismissListener)object);
        }
    }

    public final void m(ListAdapter listAdapter) {
        super.m(listAdapter);
        this.E = listAdapter;
    }

    public final void q() {
        int n3;
        int n4;
        int n7;
        PopupWindow popupWindow = this.z;
        Drawable drawable2 = popupWindow.getBackground();
        int n8 = 1;
        AppCompatSpinner appCompatSpinner = this.H;
        if (drawable2 != null) {
            Rect rect = appCompatSpinner.h;
            drawable2.getPadding(rect);
            n7 = dE3.a;
            n7 = appCompatSpinner.getLayoutDirection();
            rect = appCompatSpinner.h;
            n7 = n7 == n8 ? rect.right : -rect.left;
        } else {
            drawable2 = appCompatSpinner.h;
            n4 = 0;
            Object var5_6 = null;
            drawable2.right = 0;
            drawable2.left = 0;
            n7 = 0;
            drawable2 = null;
        }
        n4 = appCompatSpinner.getPaddingLeft();
        int n10 = appCompatSpinner.getPaddingRight();
        int n14 = appCompatSpinner.getWidth();
        int n15 = appCompatSpinner.g;
        int n16 = -2;
        if (n15 == n16) {
            SpinnerAdapter spinnerAdapter = (SpinnerAdapter)this.E;
            popupWindow = popupWindow.getBackground();
            n3 = appCompatSpinner.a(spinnerAdapter, (Drawable)popupWindow);
            spinnerAdapter = appCompatSpinner.getContext().getResources().getDisplayMetrics();
            n15 = spinnerAdapter.widthPixels;
            Rect rect = appCompatSpinner.h;
            int n17 = rect.left;
            n15 -= n17;
            n16 = rect.right;
            if (n3 > (n15 -= n16)) {
                n3 = n15;
            }
            n15 = n14 - n4 - n10;
            n3 = Math.max(n3, n15);
            this.p(n3);
        } else {
            n3 = -1;
            if (n15 == n3) {
                n3 = n14 - n4 - n10;
                this.p(n3);
            } else {
                this.p(n15);
            }
        }
        n3 = (int)(dE3.a ? 1 : 0);
        n3 = appCompatSpinner.getLayoutDirection();
        if (n3 == n8) {
            n14 -= n10;
            n3 = this.e;
            n14 -= n3;
            n3 = this.G;
            n14 = n14 - n3 + n7;
        } else {
            n3 = this.G;
            n14 = (n4 += n3) + n7;
        }
        this.f = n14;
    }
}

