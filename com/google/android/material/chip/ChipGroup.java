/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$OnHierarchyChangeListener
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 */
package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup$2;
import com.google.android.material.chip.ChipGroup$LayoutParams;
import com.google.android.material.chip.ChipGroup$OnCheckedChangeListener;
import com.google.android.material.chip.ChipGroup$OnCheckedStateChangeListener;
import com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.CheckableGroup$OnCheckedStateChangeListener;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;

public class ChipGroup
extends FlowLayout {
    private static final int DEF_STYLE_RES = R$style.Widget_MaterialComponents_ChipGroup;
    private final CheckableGroup checkableGroup;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private final int defaultCheckedId;
    private ChipGroup$OnCheckedStateChangeListener onCheckedStateChangeListener;
    private final ChipGroup$PassThroughHierarchyChangeListener passThroughListener;

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.chipGroupStyle;
        this(context, attributeSet, n3);
    }

    public ChipGroup(Context object, AttributeSet object2, int n3) {
        ChipGroup$PassThroughHierarchyChangeListener chipGroup$PassThroughHierarchyChangeListener;
        int n4 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap((Context)object, object2, n3, n4);
        super((Context)object, (AttributeSet)object2, n3);
        super();
        this.checkableGroup = object;
        this.passThroughListener = chipGroup$PassThroughHierarchyChangeListener = new ChipGroup$PassThroughHierarchyChangeListener(this, null);
        Context context = this.getContext();
        int[] nArray = R$styleable.ChipGroup;
        int[] nArray2 = new int[]{};
        object2 = ThemeEnforcement.obtainStyledAttributes(context, object2, nArray, n3, n4, nArray2);
        n3 = R$styleable.ChipGroup_chipSpacing;
        n3 = object2.getDimensionPixelOffset(n3, 0);
        int n7 = R$styleable.ChipGroup_chipSpacingHorizontal;
        n7 = object2.getDimensionPixelOffset(n7, n3);
        this.setChipSpacingHorizontal(n7);
        n7 = R$styleable.ChipGroup_chipSpacingVertical;
        n3 = object2.getDimensionPixelOffset(n7, n3);
        this.setChipSpacingVertical(n3);
        n3 = R$styleable.ChipGroup_singleLine;
        n3 = (int)(object2.getBoolean(n3, false) ? 1 : 0);
        this.setSingleLine(n3 != 0);
        n3 = R$styleable.ChipGroup_singleSelection;
        n3 = (int)(object2.getBoolean(n3, false) ? 1 : 0);
        this.setSingleSelection(n3 != 0);
        n3 = R$styleable.ChipGroup_selectionRequired;
        n3 = (int)(object2.getBoolean(n3, false) ? 1 : 0);
        this.setSelectionRequired(n3 != 0);
        n3 = R$styleable.ChipGroup_checkedChip;
        this.defaultCheckedId = n3 = object2.getResourceId(n3, -1);
        object2.recycle();
        super(this);
        ((CheckableGroup)object).setOnCheckedStateChangeListener((CheckableGroup$OnCheckedStateChangeListener)object2);
        super.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener)chipGroup$PassThroughHierarchyChangeListener);
        object = ViewCompat.a;
        this.setImportantForAccessibility(1);
    }

    public static /* synthetic */ ChipGroup$OnCheckedStateChangeListener access$100(ChipGroup chipGroup) {
        return chipGroup.onCheckedStateChangeListener;
    }

    public static /* synthetic */ CheckableGroup access$200(ChipGroup chipGroup) {
        return chipGroup.checkableGroup;
    }

    private int getVisibleChipCount() {
        int n3;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            View view = this.getChildAt(i3);
            n3 = view instanceof Chip;
            if (n3 == 0 || (n3 = (int)(this.isChildVisible(i3) ? 1 : 0)) == 0) continue;
            ++n4;
        }
        return n4;
    }

    private boolean isChildVisible(int n3) {
        View view = this.getChildAt(n3);
        if ((n3 = view.getVisibility()) == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3 != 0;
    }

    public void check(int n3) {
        this.checkableGroup.check(n3);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2;
        boolean bl3 = super.checkLayoutParams(layoutParams);
        if (bl3 && (bl2 = layoutParams instanceof ChipGroup$LayoutParams)) {
            bl2 = true;
        } else {
            bl2 = false;
            layoutParams = null;
        }
        return bl2;
    }

    public void clearCheck() {
        this.checkableGroup.clearCheck();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        int n3 = -2;
        ChipGroup$LayoutParams chipGroup$LayoutParams = new ChipGroup$LayoutParams(n3, n3);
        return chipGroup$LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        ChipGroup$LayoutParams chipGroup$LayoutParams = new ChipGroup$LayoutParams(context, attributeSet);
        return chipGroup$LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ChipGroup$LayoutParams chipGroup$LayoutParams = new ChipGroup$LayoutParams(layoutParams);
        return chipGroup$LayoutParams;
    }

    public int getCheckedChipId() {
        return this.checkableGroup.getSingleCheckedId();
    }

    public List getCheckedChipIds() {
        return this.checkableGroup.getCheckedIdsSortedByChildOrder(this);
    }

    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public int getIndexOfChip(View view) {
        int n3;
        int n4 = view instanceof Chip;
        int n7 = -1;
        if (n4 == 0) {
            return n7;
        }
        int n8 = 0;
        for (n4 = 0; n4 < (n3 = this.getChildCount()); ++n4) {
            Object object = this.getChildAt(n4);
            boolean bl2 = object instanceof Chip;
            if (!bl2 || !(bl2 = this.isChildVisible(n4))) continue;
            if ((object = (Chip)object) == view) {
                return n8;
            }
            ++n8;
        }
        return n7;
    }

    public boolean isSelectionRequired() {
        return this.checkableGroup.isSelectionRequired();
    }

    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.checkableGroup.isSingleSelection();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int n3 = this.defaultCheckedId;
        int n4 = -1;
        if (n3 != n4) {
            CheckableGroup checkableGroup = this.checkableGroup;
            checkableGroup.check(n3);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int n3 = this.isSingleLine();
        n3 = n3 != 0 ? this.getVisibleChipCount() : -1;
        int n4 = this.getRowCount();
        int n7 = this.isSingleSelection();
        n7 = n7 != 0 ? 1 : 2;
        AccessibilityNodeInfo.CollectionInfo collectionInfo = (AccessibilityNodeInfo.CollectionInfo)C2$e.a((int)n4, (int)n3, (int)n7, (boolean)false).a;
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void setChipSpacing(int n3) {
        this.setChipSpacingHorizontal(n3);
        this.setChipSpacingVertical(n3);
    }

    public void setChipSpacingHorizontal(int n3) {
        int n4 = this.chipSpacingHorizontal;
        if (n4 != n3) {
            this.chipSpacingHorizontal = n3;
            this.setItemSpacing(n3);
            this.requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int n3) {
        n3 = this.getResources().getDimensionPixelOffset(n3);
        this.setChipSpacingHorizontal(n3);
    }

    public void setChipSpacingResource(int n3) {
        n3 = this.getResources().getDimensionPixelOffset(n3);
        this.setChipSpacing(n3);
    }

    public void setChipSpacingVertical(int n3) {
        int n4 = this.chipSpacingVertical;
        if (n4 != n3) {
            this.chipSpacingVertical = n3;
            this.setLineSpacing(n3);
            this.requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int n3) {
        n3 = this.getResources().getDimensionPixelOffset(n3);
        this.setChipSpacingVertical(n3);
    }

    public void setDividerDrawableHorizontal(Drawable object) {
        object = new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
        throw object;
    }

    public void setDividerDrawableVertical(Drawable object) {
        object = new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
        throw object;
    }

    public void setFlexWrap(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
        throw unsupportedOperationException;
    }

    public void setOnCheckedChangeListener(ChipGroup$OnCheckedChangeListener chipGroup$OnCheckedChangeListener) {
        if (chipGroup$OnCheckedChangeListener == null) {
            this.setOnCheckedStateChangeListener(null);
            return;
        }
        ChipGroup$2 chipGroup$2 = new ChipGroup$2(this, chipGroup$OnCheckedChangeListener);
        this.setOnCheckedStateChangeListener(chipGroup$2);
    }

    public void setOnCheckedStateChangeListener(ChipGroup$OnCheckedStateChangeListener chipGroup$OnCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = chipGroup$OnCheckedStateChangeListener;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ChipGroup$PassThroughHierarchyChangeListener.access$302(this.passThroughListener, onHierarchyChangeListener);
    }

    public void setSelectionRequired(boolean bl2) {
        this.checkableGroup.setSelectionRequired(bl2);
    }

    public void setShowDividerHorizontal(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
        throw unsupportedOperationException;
    }

    public void setShowDividerVertical(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
        throw unsupportedOperationException;
    }

    public void setSingleLine(int n3) {
        n3 = (int)(this.getResources().getBoolean(n3) ? 1 : 0);
        this.setSingleLine(n3 != 0);
    }

    public void setSingleLine(boolean bl2) {
        super.setSingleLine(bl2);
    }

    public void setSingleSelection(int n3) {
        n3 = (int)(this.getResources().getBoolean(n3) ? 1 : 0);
        this.setSingleSelection(n3 != 0);
    }

    public void setSingleSelection(boolean bl2) {
        this.checkableGroup.setSingleSelection(bl2);
    }
}

