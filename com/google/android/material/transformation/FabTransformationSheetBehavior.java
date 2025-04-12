/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$animator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.Positioning;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.google.android.material.transformation.FabTransformationBehavior$FabTransformationSpec;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior
extends FabTransformationBehavior {
    private Map importantForAccessibilityMap;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void updateImportantForAccessibility(View view, boolean bl2) {
        HashMap hashMap;
        int n3 = 1;
        Object object = view.getParent();
        int n4 = object instanceof CoordinatorLayout;
        if (n4 == 0) {
            return;
        }
        object = (CoordinatorLayout)object;
        n4 = object.getChildCount();
        if (bl2) {
            this.importantForAccessibilityMap = hashMap = new HashMap(n4);
        }
        hashMap = null;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object object2;
            View view2 = object.getChildAt(i3);
            Object object3 = view2.getLayoutParams();
            int n7 = object3 instanceof CoordinatorLayout$e;
            if (n7 != 0 && (n7 = (object3 = ((CoordinatorLayout$e)view2.getLayoutParams()).a) instanceof FabTransformationScrimBehavior) != 0) {
                n7 = 1;
            } else {
                n7 = 0;
                object3 = null;
            }
            if (view2 == view || n7 != 0) continue;
            if (!bl2) {
                object3 = this.importantForAccessibilityMap;
                if (object3 == null || (n7 = object3.containsKey(view2)) == 0) continue;
                object3 = (Integer)this.importantForAccessibilityMap.get(view2);
                n7 = (Integer)object3;
                object2 = ViewCompat.a;
                view2.setImportantForAccessibility(n7);
                continue;
            }
            object3 = this.importantForAccessibilityMap;
            int n8 = view2.getImportantForAccessibility();
            object2 = n8;
            object3.put(view2, object2);
            object3 = ViewCompat.a;
            n7 = 4;
            view2.setImportantForAccessibility(n7);
        }
        if (!bl2) {
            view = null;
            this.importantForAccessibilityMap = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public FabTransformationBehavior$FabTransformationSpec onCreateMotionSpec(Context object, boolean bl2) {
        void var2_5;
        if (bl2) {
            int n3 = R$animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            int n4 = R$animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior$FabTransformationSpec fabTransformationBehavior$FabTransformationSpec = new FabTransformationBehavior$FabTransformationSpec();
        fabTransformationBehavior$FabTransformationSpec.timings = object = MotionSpec.createFromResource((Context)object, (int)var2_5);
        fabTransformationBehavior$FabTransformationSpec.positioning = object = new Positioning(17, 0.0f, 0.0f);
        return fabTransformationBehavior$FabTransformationSpec;
    }

    public boolean onExpandedStateChange(View view, View view2, boolean bl2, boolean bl3) {
        this.updateImportantForAccessibility(view2, bl2);
        return super.onExpandedStateChange(view, view2, bl2, bl3);
    }
}

