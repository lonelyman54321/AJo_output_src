/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.TextView
 */
package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

class MaterialAutoCompleteTextView$MaterialArrayAdapter
extends ArrayAdapter {
    private ColorStateList pressedRippleColor;
    private ColorStateList selectedItemRippleOverlaidColor;
    final /* synthetic */ MaterialAutoCompleteTextView this$0;

    public MaterialAutoCompleteTextView$MaterialArrayAdapter(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int n3, String[] stringArray) {
        this.this$0 = materialAutoCompleteTextView;
        super(context, n3, (Object[])stringArray);
        this.updateSelectedItemColorStateList();
    }

    private ColorStateList createItemSelectedColorStateList() {
        ColorStateList colorStateList = null;
        boolean bl2 = this.hasSelectedColor();
        if (bl2 && (bl2 = this.hasSelectedRippleColor())) {
            int n3 = -16842919;
            int[] nArray = new int[]{16843623, n3};
            int[] nArray2 = new int[]{0x10100A1, n3};
            int n4 = MaterialAutoCompleteTextView.access$300(this.this$0).getColorForState(nArray2, 0);
            int n7 = MaterialAutoCompleteTextView.access$300(this.this$0).getColorForState(nArray, 0);
            n4 = MaterialColors.layer(MaterialAutoCompleteTextView.access$200(this.this$0), n4);
            n7 = MaterialColors.layer(MaterialAutoCompleteTextView.access$200(this.this$0), n7);
            int n8 = MaterialAutoCompleteTextView.access$200(this.this$0);
            int[] nArray3 = new int[]{n4, n7, n8};
            int[] nArray4 = new int[]{};
            int[][] nArrayArray = new int[][]{nArray2, nArray, nArray4};
            colorStateList = new ColorStateList((int[][])nArrayArray, nArray3);
            return colorStateList;
        }
        return null;
    }

    private Drawable getSelectedItemDrawable() {
        boolean bl2 = this.hasSelectedColor();
        if (bl2) {
            int n3 = MaterialAutoCompleteTextView.access$200(this.this$0);
            ColorDrawable colorDrawable = new ColorDrawable(n3);
            ColorStateList colorStateList = this.pressedRippleColor;
            if (colorStateList != null) {
                colorStateList = this.selectedItemRippleOverlaidColor;
                colorDrawable.setTintList(colorStateList);
                ColorStateList colorStateList2 = this.pressedRippleColor;
                colorStateList = new RippleDrawable(colorStateList2, (Drawable)colorDrawable, null);
                return colorStateList;
            }
            return colorDrawable;
        }
        return null;
    }

    private boolean hasSelectedColor() {
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.this$0;
        int n3 = MaterialAutoCompleteTextView.access$200(materialAutoCompleteTextView);
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            materialAutoCompleteTextView = null;
        }
        return n3 != 0;
    }

    private boolean hasSelectedRippleColor() {
        boolean bl2;
        ColorStateList colorStateList = MaterialAutoCompleteTextView.access$300(this.this$0);
        if (colorStateList != null) {
            bl2 = true;
        } else {
            bl2 = false;
            colorStateList = null;
        }
        return bl2;
    }

    private ColorStateList sanitizeDropdownItemSelectedRippleColor() {
        ColorStateList colorStateList = null;
        boolean bl2 = this.hasSelectedRippleColor();
        if (!bl2) {
            return null;
        }
        int[] nArray = new int[]{16842919};
        int n3 = MaterialAutoCompleteTextView.access$300(this.this$0).getColorForState(nArray, 0);
        int[] nArray2 = new int[]{n3, 0};
        int[] nArray3 = new int[]{};
        int[][] nArrayArray = new int[][]{nArray, nArray3};
        colorStateList = new ColorStateList((int[][])nArrayArray, nArray2);
        return colorStateList;
    }

    public View getView(int n3, View view, ViewGroup object) {
        View view2 = super.getView(n3, view, (ViewGroup)object);
        boolean bl2 = view2 instanceof TextView;
        if (bl2) {
            Object object2;
            view = view2;
            view = (TextView)view2;
            object = this.this$0.getText().toString();
            boolean bl3 = ((String)object).contentEquals((CharSequence)(object2 = view.getText()));
            if (bl3) {
                object = this.getSelectedItemDrawable();
            } else {
                bl3 = false;
                object = null;
            }
            object2 = ViewCompat.a;
            view.setBackground((Drawable)object);
        }
        return view2;
    }

    public void updateSelectedItemColorStateList() {
        ColorStateList colorStateList;
        this.pressedRippleColor = colorStateList = this.sanitizeDropdownItemSelectedRippleColor();
        this.selectedItemRippleOverlaidColor = colorStateList = this.createItemSelectedColorStateList();
    }
}

