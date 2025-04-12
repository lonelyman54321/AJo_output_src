/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RadioButton
 *  android.widget.ToggleButton
 */
package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButton$OnPressedChangeListener;
import com.google.android.material.button.MaterialButtonToggleGroup$1;
import com.google.android.material.button.MaterialButtonToggleGroup$2;
import com.google.android.material.button.MaterialButtonToggleGroup$CornerData;
import com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener;
import com.google.android.material.button.MaterialButtonToggleGroup$PressedStateTracker;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MaterialButtonToggleGroup
extends LinearLayout {
    private static final int DEF_STYLE_RES = 0;
    private static final String LOG_TAG = "MButtonToggleGroup";
    private Set checkedIds;
    private Integer[] childOrder;
    private final Comparator childOrderComparator;
    private final int defaultCheckId;
    private final LinkedHashSet onButtonCheckedListeners;
    private final List originalCornerData;
    private final MaterialButtonToggleGroup$PressedStateTracker pressedStateTracker;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.materialButtonToggleGroupStyle;
        this(context, attributeSet, n3);
    }

    public MaterialButtonToggleGroup(Context object, AttributeSet object2, int n3) {
        boolean n7;
        Context context;
        int n4 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap((Context)object, (AttributeSet)object2, n3, n4);
        super((Context)object, (AttributeSet)object2, n3);
        this.originalCornerData = object = new ArrayList();
        this.pressedStateTracker = object = new MaterialButtonToggleGroup$PressedStateTracker(this, null);
        this.onButtonCheckedListeners = object = new LinkedHashSet();
        this.childOrderComparator = object = new MaterialButtonToggleGroup$1(this);
        this.skipCheckedStateTracker = false;
        this.checkedIds = context = new HashSet();
        context = this.getContext();
        int[] nArray = R$styleable.MaterialButtonToggleGroup;
        int[] nArray2 = new int[]{};
        object2 = ThemeEnforcement.obtainStyledAttributes(context, (AttributeSet)object2, nArray, n3, n4, nArray2);
        n3 = R$styleable.MaterialButtonToggleGroup_singleSelection;
        n3 = (int)(object2.getBoolean(n3, false) ? 1 : 0);
        this.setSingleSelection(n3 != 0);
        n3 = R$styleable.MaterialButtonToggleGroup_checkedButton;
        this.defaultCheckId = n3 = object2.getResourceId(n3, -1);
        n3 = R$styleable.MaterialButtonToggleGroup_selectionRequired;
        this.selectionRequired = n7 = object2.getBoolean(n3, false);
        int n8 = 1;
        this.setChildrenDrawingOrderEnabled(n8 != 0);
        n3 = R$styleable.MaterialButtonToggleGroup_android_enabled;
        n3 = (int)(object2.getBoolean(n3, n8 != 0) ? 1 : 0);
        this.setEnabled(n3 != 0);
        object2.recycle();
        object2 = ViewCompat.a;
        this.setImportantForAccessibility(n8);
    }

    public static /* synthetic */ int access$100(MaterialButtonToggleGroup materialButtonToggleGroup, View view) {
        return materialButtonToggleGroup.getIndexWithinVisibleButtons(view);
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int n3;
        int n4;
        int n7 = this.getFirstVisibleChildIndex();
        if (n7 == (n4 = -1)) {
            return;
        }
        for (n4 = n7 + 1; n4 < (n3 = this.getChildCount()); ++n4) {
            MaterialButton materialButton = this.getChildButton(n4);
            int n8 = n4 + -1;
            MaterialButton materialButton2 = this.getChildButton(n8);
            int n10 = materialButton.getStrokeWidth();
            n8 = materialButton2.getStrokeWidth();
            n8 = Math.min(n10, n8);
            LinearLayout.LayoutParams layoutParams = this.buildLayoutParams((View)materialButton);
            int n14 = this.getOrientation();
            if (n14 == 0) {
                layoutParams.setMarginEnd(0);
                n8 = -n8;
                layoutParams.setMarginStart(n8);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = n8 = -n8;
                layoutParams.setMarginStart(0);
            }
            materialButton.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        this.resetChildMargins(n7);
    }

    private LinearLayout.LayoutParams buildLayoutParams(View view) {
        boolean bl2 = (view = view.getLayoutParams()) instanceof LinearLayout.LayoutParams;
        if (bl2) {
            return (LinearLayout.LayoutParams)view;
        }
        int n3 = view.width;
        int n4 = view.height;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n3, n4);
        return layoutParams;
    }

    private void checkInternal(int n3, boolean bl2) {
        block8: {
            HashSet<Integer> hashSet;
            block7: {
                Integer n4;
                boolean bl3;
                block6: {
                    int n7 = -1;
                    if (n3 == n7) {
                        return;
                    }
                    Object object = this.checkedIds;
                    hashSet = new HashSet<Integer>((Collection<Integer>)object);
                    if (!bl2 || (bl3 = hashSet.contains(object = Integer.valueOf(n3)))) break block6;
                    bl2 = this.singleSelection;
                    if (bl2 && !(bl2 = hashSet.isEmpty())) {
                        hashSet.clear();
                    }
                    Integer n8 = n3;
                    hashSet.add(n8);
                    break block7;
                }
                if (bl2 || !(bl2 = hashSet.contains(n4 = Integer.valueOf(n3)))) break block8;
                bl2 = this.selectionRequired;
                if (!bl2 || (bl2 = hashSet.size()) > (bl3 = true)) {
                    Integer n10 = n3;
                    hashSet.remove(n10);
                }
            }
            this.updateCheckedIds(hashSet);
        }
    }

    private void dispatchOnButtonChecked(int n3, boolean bl2) {
        boolean bl3;
        Iterator iterator = ((AbstractCollection)this.onButtonCheckedListeners).iterator();
        while (bl3 = iterator.hasNext()) {
            MaterialButtonToggleGroup$OnButtonCheckedListener materialButtonToggleGroup$OnButtonCheckedListener = (MaterialButtonToggleGroup$OnButtonCheckedListener)iterator.next();
            materialButtonToggleGroup$OnButtonCheckedListener.onButtonChecked(this, n3, bl2);
        }
    }

    private MaterialButton getChildButton(int n3) {
        return (MaterialButton)this.getChildAt(n3);
    }

    private int getFirstVisibleChildIndex() {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2 = this.isChildVisible(i3);
            if (!bl2) continue;
            return i3;
        }
        return -1;
    }

    private int getIndexWithinVisibleButtons(View view) {
        int n3;
        int n4 = view instanceof MaterialButton;
        int n7 = -1;
        if (n4 == 0) {
            return n7;
        }
        int n8 = 0;
        for (n4 = 0; n4 < (n3 = this.getChildCount()); ++n4) {
            View view2 = this.getChildAt(n4);
            if (view2 == view) {
                return n8;
            }
            view2 = this.getChildAt(n4);
            n3 = view2 instanceof MaterialButton;
            if (n3 == 0 || (n3 = (int)(this.isChildVisible(n4) ? 1 : 0)) == 0) continue;
            ++n8;
        }
        return n7;
    }

    private int getLastVisibleChildIndex() {
        for (int i3 = this.getChildCount() + -1; i3 >= 0; i3 += -1) {
            boolean bl2 = this.isChildVisible(i3);
            if (!bl2) continue;
            return i3;
        }
        return -1;
    }

    private MaterialButtonToggleGroup$CornerData getNewCornerData(int n3, int n4, int n7) {
        MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData = (MaterialButtonToggleGroup$CornerData)this.originalCornerData.get(n3);
        if (n4 == n7) {
            return materialButtonToggleGroup$CornerData;
        }
        int n8 = this.getOrientation();
        n8 = n8 == 0 ? 1 : 0;
        if (n3 == n4) {
            MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData2 = n8 != 0 ? MaterialButtonToggleGroup$CornerData.start(materialButtonToggleGroup$CornerData, (View)this) : MaterialButtonToggleGroup$CornerData.top(materialButtonToggleGroup$CornerData);
            return materialButtonToggleGroup$CornerData2;
        }
        if (n3 == n7) {
            MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData3 = n8 != 0 ? MaterialButtonToggleGroup$CornerData.end(materialButtonToggleGroup$CornerData, (View)this) : MaterialButtonToggleGroup$CornerData.bottom(materialButtonToggleGroup$CornerData);
            return materialButtonToggleGroup$CornerData3;
        }
        return null;
    }

    private int getVisibleButtonCount() {
        int n3;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            View view = this.getChildAt(i3);
            n3 = view instanceof MaterialButton;
            if (n3 == 0 || (n3 = (int)(this.isChildVisible(i3) ? 1 : 0)) == 0) continue;
            ++n4;
        }
        return n4;
    }

    private boolean isChildVisible(int n3) {
        int n4;
        View view = this.getChildAt(n3);
        if ((n3 = view.getVisibility()) != (n4 = 8)) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3 != 0;
    }

    private void resetChildMargins(int n3) {
        int n4 = this.getChildCount();
        if (n4 != 0 && n3 != (n4 = -1)) {
            int n7;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.getChildButton(n3).getLayoutParams();
            n4 = this.getOrientation();
            if (n4 == (n7 = 1)) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void setCheckedStateForView(int n3, boolean bl2) {
        View view = this.findViewById(n3);
        boolean bl3 = view instanceof MaterialButton;
        if (bl3) {
            this.skipCheckedStateTracker = bl3 = true;
            ((MaterialButton)view).setChecked(bl2);
            n3 = 0;
            view = null;
            this.skipCheckedStateTracker = false;
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        int n3;
        int n4 = materialButton.getId();
        if (n4 == (n3 = -1)) {
            n4 = View.generateViewId();
            materialButton.setId(n4);
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        boolean bl2 = true;
        materialButton.setMaxLines((int)(bl2 ? 1 : 0));
        Object object = TextUtils.TruncateAt.END;
        materialButton.setEllipsize((TextUtils.TruncateAt)object);
        materialButton.setCheckable(bl2);
        object = this.pressedStateTracker;
        materialButton.setOnPressedChangeListenerInternal((MaterialButton$OnPressedChangeListener)object);
        materialButton.setShouldDrawSurfaceColorStroke(bl2);
    }

    private static void updateBuilderWithCornerData(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder, MaterialButtonToggleGroup$CornerData object) {
        if (object == null) {
            shapeAppearanceModel$Builder.setAllCornerSizes(0.0f);
            return;
        }
        CornerSize cornerSize = ((MaterialButtonToggleGroup$CornerData)object).topLeft;
        shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setTopLeftCornerSize(cornerSize);
        cornerSize = ((MaterialButtonToggleGroup$CornerData)object).bottomLeft;
        shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setBottomLeftCornerSize(cornerSize);
        cornerSize = ((MaterialButtonToggleGroup$CornerData)object).topRight;
        shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setTopRightCornerSize(cornerSize);
        object = ((MaterialButtonToggleGroup$CornerData)object).bottomRight;
        shapeAppearanceModel$Builder.setBottomRightCornerSize((CornerSize)object);
    }

    private void updateCheckedIds(Set set) {
        int n3;
        HashSet hashSet;
        Set set2 = this.checkedIds;
        this.checkedIds = hashSet = new HashSet(set);
        hashSet = null;
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            MaterialButton materialButton = this.getChildButton(i3);
            n3 = materialButton.getId();
            Integer n4 = n3;
            boolean bl2 = set.contains(n4);
            this.setCheckedStateForView(n3, bl2);
            n4 = n3;
            bl2 = set2.contains(n4);
            Integer n7 = n3;
            boolean bl3 = set.contains(n7);
            if (bl2 == bl3) continue;
            n4 = n3;
            bl2 = set.contains(n4);
            this.dispatchOnButtonChecked(n3, bl2);
        }
        this.invalidate();
    }

    private void updateChildOrder() {
        Integer[] integerArray = this.childOrderComparator;
        Integer[] integerArray2 = new TreeMap(integerArray);
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            MaterialButton materialButton = this.getChildButton(i3);
            Integer n4 = i3;
            integerArray2.put(materialButton, n4);
        }
        integerArray2 = integerArray2.values();
        integerArray = new Integer[]{};
        integerArray2 = integerArray2.toArray(integerArray);
        this.childOrder = integerArray2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateChildrenA11yClassName() {
        int n3 = 0;
        int n4;
        while (n3 < (n4 = this.getChildCount())) {
            n4 = (int)(this.singleSelection ? 1 : 0);
            Object object = n4 != 0 ? RadioButton.class : ToggleButton.class;
            object = ((Class)object).getName();
            MaterialButton materialButton = this.getChildButton(n3);
            materialButton.setA11yClassName((String)object);
            ++n3;
        }
        return;
    }

    public void addOnButtonCheckedListener(MaterialButtonToggleGroup$OnButtonCheckedListener materialButtonToggleGroup$OnButtonCheckedListener) {
        ((AbstractCollection)this.onButtonCheckedListeners).add(materialButtonToggleGroup$OnButtonCheckedListener);
    }

    public void addView(View object, int n3, ViewGroup.LayoutParams object2) {
        boolean bl2 = object instanceof MaterialButton;
        if (!bl2) {
            return;
        }
        super.addView((View)object, n3, (ViewGroup.LayoutParams)object2);
        object = (MaterialButton)object;
        this.setGeneratedIdIfNeeded((MaterialButton)object);
        this.setupButtonChild((MaterialButton)object);
        n3 = object.getId();
        boolean bl3 = ((MaterialButton)object).isChecked();
        this.checkInternal(n3, bl3);
        Object object3 = ((MaterialButton)object).getShapeAppearanceModel();
        object2 = this.originalCornerData;
        CornerSize cornerSize = ((ShapeAppearanceModel)object3).getTopLeftCornerSize();
        CornerSize cornerSize2 = ((ShapeAppearanceModel)object3).getBottomLeftCornerSize();
        CornerSize cornerSize3 = ((ShapeAppearanceModel)object3).getTopRightCornerSize();
        object3 = ((ShapeAppearanceModel)object3).getBottomRightCornerSize();
        MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData = new MaterialButtonToggleGroup$CornerData(cornerSize, cornerSize2, cornerSize3, (CornerSize)object3);
        object2.add(materialButtonToggleGroup$CornerData);
        n3 = (int)(this.isEnabled() ? 1 : 0);
        object.setEnabled(n3 != 0);
        object3 = new MaterialButtonToggleGroup$2(this);
        ViewCompat.s((View)object, (a)object3);
    }

    public void check(int n3) {
        this.checkInternal(n3, true);
    }

    public void clearChecked() {
        HashSet hashSet = new HashSet();
        this.updateCheckedIds(hashSet);
    }

    public void clearOnButtonCheckedListeners() {
        ((AbstractCollection)this.onButtonCheckedListeners).clear();
    }

    public void dispatchDraw(Canvas canvas) {
        this.updateChildOrder();
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        Object object;
        int n3 = this.singleSelection;
        if (n3 != 0 && (n3 = (int)((object = this.checkedIds).isEmpty() ? 1 : 0)) == 0) {
            object = (Integer)this.checkedIds.iterator().next();
            n3 = (Integer)object;
        } else {
            n3 = -1;
        }
        return n3;
    }

    public List getCheckedButtonIds() {
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            Set set = this.checkedIds;
            Object object = this.getChildButton(i3);
            n3 = object.getId();
            Integer n4 = n3;
            boolean bl2 = set.contains(n4);
            if (!bl2) continue;
            object = n3;
            arrayList.add(object);
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int n3, int n4) {
        int n7;
        Integer[] integerArray = this.childOrder;
        if (integerArray != null && n4 < (n7 = integerArray.length)) {
            return integerArray[n4];
        }
        return n4;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void onButtonCheckedStateChanged(MaterialButton materialButton, boolean bl2) {
        boolean bl3 = this.skipCheckedStateTracker;
        if (bl3) {
            return;
        }
        int n3 = materialButton.getId();
        this.checkInternal(n3, bl2);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int n3 = this.defaultCheckId;
        int n4 = -1;
        if (n3 != n4) {
            Set<Integer> set = Collections.singleton(n3);
            this.updateCheckedIds(set);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int n3 = this.getVisibleButtonCount();
        int n4 = this.isSingleSelection();
        int n7 = 1;
        n4 = n4 != 0 ? 1 : 2;
        AccessibilityNodeInfo.CollectionInfo collectionInfo = (AccessibilityNodeInfo.CollectionInfo)C2$e.a((int)n7, (int)n3, (int)n4, (boolean)false).a;
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void onMeasure(int n3, int n4) {
        this.updateChildShapes();
        this.adjustChildMarginsAndUpdateLayout();
        super.onMeasure(n3, n4);
    }

    public void onViewRemoved(View view) {
        int n3;
        Object object;
        super.onViewRemoved(view);
        boolean bl2 = view instanceof MaterialButton;
        if (bl2) {
            object = view;
            object = (MaterialButton)view;
            ((MaterialButton)object).setOnPressedChangeListenerInternal(null);
        }
        if ((n3 = this.indexOfChild(view)) >= 0) {
            object = this.originalCornerData;
            object.remove(n3);
        }
        this.updateChildShapes();
        this.adjustChildMarginsAndUpdateLayout();
    }

    public void removeOnButtonCheckedListener(MaterialButtonToggleGroup$OnButtonCheckedListener materialButtonToggleGroup$OnButtonCheckedListener) {
        ((AbstractCollection)this.onButtonCheckedListeners).remove(materialButtonToggleGroup$OnButtonCheckedListener);
    }

    public void setEnabled(boolean bl2) {
        int n3;
        super.setEnabled(bl2);
        for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
            MaterialButton materialButton = this.getChildButton(i3);
            materialButton.setEnabled(bl2);
        }
    }

    public void setSelectionRequired(boolean bl2) {
        this.selectionRequired = bl2;
    }

    public void setSingleSelection(int n3) {
        n3 = (int)(this.getResources().getBoolean(n3) ? 1 : 0);
        this.setSingleSelection(n3 != 0);
    }

    public void setSingleSelection(boolean bl2) {
        boolean bl3 = this.singleSelection;
        if (bl3 != bl2) {
            this.singleSelection = bl2;
            this.clearChecked();
        }
        this.updateChildrenA11yClassName();
    }

    public void uncheck(int n3) {
        this.checkInternal(n3, false);
    }

    public void updateChildShapes() {
        int n3 = this.getChildCount();
        int n4 = this.getFirstVisibleChildIndex();
        int n7 = this.getLastVisibleChildIndex();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n8;
            MaterialButton materialButton = this.getChildButton(i3);
            int n10 = materialButton.getVisibility();
            if (n10 == (n8 = 8)) continue;
            Object object = materialButton.getShapeAppearanceModel().toBuilder();
            MaterialButtonToggleGroup$CornerData materialButtonToggleGroup$CornerData = this.getNewCornerData(i3, n4, n7);
            MaterialButtonToggleGroup.updateBuilderWithCornerData((ShapeAppearanceModel$Builder)object, materialButtonToggleGroup$CornerData);
            object = ((ShapeAppearanceModel$Builder)object).build();
            materialButton.setShapeAppearanceModel((ShapeAppearanceModel)object);
        }
    }
}

