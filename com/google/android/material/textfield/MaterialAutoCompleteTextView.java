/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accessibilityservice.AccessibilityServiceInfo
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityManager
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 */
package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.textfield.MaterialAutoCompleteTextView$MaterialArrayAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialAutoCompleteTextView
extends AppCompatAutoCompleteTextView {
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final String SWITCH_ACCESS_ACTIVITY_NAME = "SwitchAccess";
    private final AccessibilityManager accessibilityManager;
    private ColorStateList dropDownBackgroundTint;
    private final ListPopupWindow modalListPopup;
    private final float popupElevation;
    private final int simpleItemLayout;
    private int simpleItemSelectedColor;
    private ColorStateList simpleItemSelectedRippleColor;
    private final Rect tempRect;

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.autoCompleteTextViewStyle;
        this(context, attributeSet, n3);
    }

    public MaterialAutoCompleteTextView(Context object, AttributeSet attributeSet, int n3) {
        int n4;
        Object object2;
        float f5;
        object = MaterialThemeOverlay.wrap(object, attributeSet, n3, 0);
        super((Context)object, attributeSet, n3);
        super();
        this.tempRect = object;
        object = this.getContext();
        int[] nArray = R$styleable.MaterialAutoCompleteTextView;
        int n7 = R$style.Widget_AppCompat_AutoCompleteTextView;
        int[] nArray2 = new int[]{};
        Context context = object;
        attributeSet = ThemeEnforcement.obtainStyledAttributes(object, attributeSet, nArray, n3, n7, nArray2);
        n3 = R$styleable.MaterialAutoCompleteTextView_android_inputType;
        n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
        if (n3 != 0) {
            n3 = R$styleable.MaterialAutoCompleteTextView_android_inputType;
            if ((n3 = attributeSet.getInt(n3, 0)) == 0) {
                n3 = 0;
                f5 = 0.0f;
                object2 = null;
                this.setKeyListener(null);
            }
        }
        n3 = R$styleable.MaterialAutoCompleteTextView_simpleItemLayout;
        int n8 = R$layout.mtrl_auto_complete_simple_item;
        this.simpleItemLayout = n3 = attributeSet.getResourceId(n3, n8);
        n3 = R$styleable.MaterialAutoCompleteTextView_android_popupElevation;
        n8 = R$dimen.mtrl_exposed_dropdown_menu_popup_elevation;
        this.popupElevation = f5 = (float)attributeSet.getDimensionPixelOffset(n3, n8);
        n3 = R$styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint;
        if ((n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0)) != 0) {
            n3 = R$styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint;
            n3 = attributeSet.getColor(n3, 0);
            object2 = ColorStateList.valueOf((int)n3);
            this.dropDownBackgroundTint = object2;
        }
        n3 = R$styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor;
        this.simpleItemSelectedColor = n3 = attributeSet.getColor(n3, 0);
        n3 = R$styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor;
        object2 = MaterialResources.getColorStateList(object, (TypedArray)attributeSet, n3);
        this.simpleItemSelectedRippleColor = object2;
        object2 = (AccessibilityManager)object.getSystemService("accessibility");
        this.accessibilityManager = object2;
        super((Context)object);
        this.modalListPopup = object2;
        ((ListPopupWindow)object2).y = n4 = 1;
        context = ((ListPopupWindow)object2).z;
        context.setFocusable(n4 != 0);
        ((ListPopupWindow)object2).o = this;
        object = ((ListPopupWindow)object2).z;
        n8 = 2;
        object.setInputMethodMode(n8);
        object = this.getAdapter();
        ((ListPopupWindow)object2).m((ListAdapter)object);
        super(this);
        ((ListPopupWindow)object2).p = object;
        n4 = R$styleable.MaterialAutoCompleteTextView_simpleItems;
        n4 = (int)(attributeSet.hasValue(n4) ? 1 : 0);
        if (n4 != 0) {
            n4 = R$styleable.MaterialAutoCompleteTextView_simpleItems;
            n4 = attributeSet.getResourceId(n4, 0);
            this.setSimpleItems(n4);
        }
        attributeSet.recycle();
    }

    public static /* synthetic */ ListPopupWindow access$000(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.modalListPopup;
    }

    public static /* synthetic */ void access$100(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object object) {
        materialAutoCompleteTextView.updateText(object);
    }

    public static /* synthetic */ int access$200(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.simpleItemSelectedColor;
    }

    public static /* synthetic */ ColorStateList access$300(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.simpleItemSelectedRippleColor;
    }

    private TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent viewParent = this.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            boolean bl2 = viewParent instanceof TextInputLayout;
            if (!bl2) continue;
            return (TextInputLayout)viewParent;
        }
        return null;
    }

    private boolean isPopupRequired() {
        boolean bl2 = this.isTouchExplorationEnabled();
        bl2 = bl2 || (bl2 = this.isSwitchAccessEnabled());
        return bl2;
    }

    private boolean isSwitchAccessEnabled() {
        boolean bl2;
        Object object = this.accessibilityManager;
        if (object != null && (bl2 = object.isEnabled())) {
            object = this.accessibilityManager;
            int n3 = 16;
            if ((object = object.getEnabledAccessibilityServiceList(n3)) != null) {
                object = object.iterator();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    Object object2 = (AccessibilityServiceInfo)object.next();
                    String string2 = object2.getSettingsActivityName();
                    if (string2 == null || (n3 = (int)(((String)(object2 = object2.getSettingsActivityName())).contains(string2 = SWITCH_ACCESS_ACTIVITY_NAME) ? 1 : 0)) == 0) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isTouchExplorationEnabled() {
        boolean bl2;
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && (bl2 = accessibilityManager.isTouchExplorationEnabled())) {
            bl2 = true;
        } else {
            bl2 = false;
            accessibilityManager = null;
        }
        return bl2;
    }

    private int measureContentWidth() {
        ListAdapter listAdapter = this.getAdapter();
        TextInputLayout textInputLayout = this.findTextInputLayoutAncestor();
        int n3 = 0;
        Rect rect = null;
        if (listAdapter != null && textInputLayout != null) {
            int n4;
            int n7 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0);
            int n8 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0);
            Object object = this.modalListPopup;
            PopupWindow popupWindow = object.z;
            int n10 = popupWindow.isShowing();
            if (n10 == 0) {
                n4 = -1;
            } else {
                object = object.c;
                n4 = object.getSelectedItemPosition();
            }
            n4 = Math.max(0, n4);
            n10 = listAdapter.getCount();
            n4 += 15;
            n4 = Math.min(n10, n4);
            n10 = n4 + -15;
            int n14 = Math.max(0, n10);
            View view = null;
            n10 = 0;
            popupWindow = null;
            while (n14 < n4) {
                ViewGroup.LayoutParams layoutParams;
                int n15 = listAdapter.getItemViewType(n14);
                if (n15 != n3) {
                    view = null;
                    n3 = n15;
                }
                if ((layoutParams = (view = listAdapter.getView(n14, view, (ViewGroup)textInputLayout)).getLayoutParams()) == null) {
                    int n16 = -2;
                    layoutParams = new ViewGroup.LayoutParams(n16, n16);
                    view.setLayoutParams(layoutParams);
                }
                view.measure(n7, n8);
                n15 = view.getMeasuredWidth();
                n10 = Math.max(n10, n15);
                ++n14;
            }
            listAdapter = this.modalListPopup.z.getBackground();
            if (listAdapter != null) {
                rect = this.tempRect;
                listAdapter.getPadding(rect);
                listAdapter = this.tempRect;
                n3 = listAdapter.left;
                int n17 = listAdapter.right;
                n10 += (n3 += n17);
            }
            return textInputLayout.getEndIconView().getMeasuredWidth() + n10;
        }
        return 0;
    }

    private void onInputTypeChanged() {
        TextInputLayout textInputLayout = this.findTextInputLayoutAncestor();
        if (textInputLayout != null) {
            textInputLayout.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    private void updateText(Object object) {
        object = this.convertSelectionToString(object);
        this.setText((CharSequence)object, false);
    }

    public void dismissDropDown() {
        boolean bl2 = this.isPopupRequired();
        if (bl2) {
            ListPopupWindow listPopupWindow = this.modalListPopup;
            listPopupWindow.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.dropDownBackgroundTint;
    }

    public CharSequence getHint() {
        boolean bl2;
        TextInputLayout textInputLayout = this.findTextInputLayoutAncestor();
        if (textInputLayout != null && (bl2 = textInputLayout.isProvidingHint())) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.popupElevation;
    }

    public int getSimpleItemSelectedColor() {
        return this.simpleItemSelectedColor;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.simpleItemSelectedRippleColor;
    }

    public void onAttachedToWindow() {
        boolean bl2;
        super.onAttachedToWindow();
        Object object = this.findTextInputLayoutAncestor();
        if (object != null && (bl2 = object.isProvidingHint()) && (object = super.getHint()) == null && (bl2 = ManufacturerUtils.isMeizuDevice())) {
            object = "";
            this.setHint((CharSequence)object);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.modalListPopup.dismiss();
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n4 = View.MeasureSpec.getMode((int)n3);
        int n7 = -1 << -1;
        if (n4 == n7) {
            n4 = this.getMeasuredWidth();
            n7 = this.measureContentWidth();
            n4 = Math.max(n4, n7);
            n3 = View.MeasureSpec.getSize((int)n3);
            n3 = Math.min(n4, n3);
            n4 = this.getMeasuredHeight();
            this.setMeasuredDimension(n3, n4);
        }
    }

    public void onWindowFocusChanged(boolean bl2) {
        boolean bl3 = this.isPopupRequired();
        if (bl3) {
            return;
        }
        super.onWindowFocusChanged(bl2);
    }

    public void setAdapter(ListAdapter object) {
        super.setAdapter((ListAdapter)object);
        object = this.modalListPopup;
        ListAdapter listAdapter = this.getAdapter();
        ((ListPopupWindow)object).m(listAdapter);
    }

    public void setDropDownBackgroundDrawable(Drawable drawable2) {
        super.setDropDownBackgroundDrawable(drawable2);
        ListPopupWindow listPopupWindow = this.modalListPopup;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable2);
        }
    }

    public void setDropDownBackgroundTint(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setDropDownBackgroundTintList(colorStateList);
    }

    public void setDropDownBackgroundTintList(ColorStateList object) {
        this.dropDownBackgroundTint = object;
        object = this.getDropDownBackground();
        boolean bl2 = object instanceof MaterialShapeDrawable;
        if (bl2) {
            object = (MaterialShapeDrawable)object;
            ColorStateList colorStateList = this.dropDownBackgroundTint;
            ((MaterialShapeDrawable)object).setFillColor(colorStateList);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener object) {
        AdapterView.OnItemSelectedListener onItemSelectedListener;
        super.setOnItemSelectedListener(object);
        object = this.modalListPopup;
        object.q = onItemSelectedListener = this.getOnItemSelectedListener();
    }

    public void setRawInputType(int n3) {
        super.setRawInputType(n3);
        this.onInputTypeChanged();
    }

    public void setSimpleItemSelectedColor(int n3) {
        this.simpleItemSelectedColor = n3;
        Object object = this.getAdapter();
        n3 = object instanceof MaterialAutoCompleteTextView$MaterialArrayAdapter;
        if (n3 != 0) {
            object = (MaterialAutoCompleteTextView$MaterialArrayAdapter)this.getAdapter();
            ((MaterialAutoCompleteTextView$MaterialArrayAdapter)((Object)object)).updateSelectedItemColorStateList();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList object) {
        this.simpleItemSelectedRippleColor = object;
        object = this.getAdapter();
        boolean bl2 = object instanceof MaterialAutoCompleteTextView$MaterialArrayAdapter;
        if (bl2) {
            object = (MaterialAutoCompleteTextView$MaterialArrayAdapter)this.getAdapter();
            ((MaterialAutoCompleteTextView$MaterialArrayAdapter)((Object)object)).updateSelectedItemColorStateList();
        }
    }

    public void setSimpleItems(int n3) {
        String[] stringArray = this.getResources().getStringArray(n3);
        this.setSimpleItems(stringArray);
    }

    public void setSimpleItems(String[] stringArray) {
        Context context = this.getContext();
        int n3 = this.simpleItemLayout;
        MaterialAutoCompleteTextView$MaterialArrayAdapter materialAutoCompleteTextView$MaterialArrayAdapter = new MaterialAutoCompleteTextView$MaterialArrayAdapter(this, context, n3, stringArray);
        this.setAdapter((ListAdapter)materialAutoCompleteTextView$MaterialArrayAdapter);
    }

    public void showDropDown() {
        boolean bl2 = this.isPopupRequired();
        if (bl2) {
            ListPopupWindow listPopupWindow = this.modalListPopup;
            listPopupWindow.show();
        } else {
            super.showDropDown();
        }
    }
}

