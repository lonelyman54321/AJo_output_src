/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.Constraints$LayoutParams;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.b$a;
import androidx.constraintlayout.widget.b$b;
import java.util.HashMap;

public class Constraints
extends ViewGroup {
    public b a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        super.setVisibility(8);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Constraints$LayoutParams constraints$LayoutParams = new Constraints$LayoutParams();
        return constraints$LayoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        Constraints$LayoutParams constraints$LayoutParams = new Constraints$LayoutParams(context, attributeSet);
        return constraints$LayoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = new ConstraintLayout$LayoutParams(layoutParams);
        return constraintLayout$LayoutParams;
    }

    public b getConstraintSet() {
        Object object = this.a;
        if (object == null) {
            object = new b();
            this.a = object;
        }
        object = this.a;
        object.getClass();
        int n3 = this.getChildCount();
        HashMap hashMap = ((b)object).g;
        hashMap.clear();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2;
            View view = this.getChildAt(i3);
            Constraints$LayoutParams constraints$LayoutParams = (Constraints$LayoutParams)view.getLayoutParams();
            int n4 = view.getId();
            int n7 = ((b)object).f;
            if (n7 != 0 && n4 == (n7 = -1)) {
                object = new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                throw object;
            }
            Object object3 = n4;
            n7 = (int)(hashMap.containsKey(object3) ? 1 : 0);
            if (n7 == 0) {
                object3 = n4;
                object2 = new b$a();
                hashMap.put(object3, object2);
            }
            object3 = n4;
            if ((object3 = (b$a)hashMap.get(object3)) == null) continue;
            boolean bl2 = view instanceof ConstraintHelper;
            if (bl2) {
                view = (ConstraintHelper)view;
                ((b$a)object3).d(n4, constraints$LayoutParams);
                bl2 = view instanceof Barrier;
                if (bl2) {
                    int n8;
                    int n10;
                    object2 = ((b$a)object3).e;
                    ((b$b)object2).i0 = 1;
                    view = (Barrier)view;
                    ((b$b)object2).g0 = n10 = view.getType();
                    int[] nArray = view.getReferencedIds();
                    ((b$b)object2).j0 = nArray;
                    ((b$b)object2).h0 = n8 = view.getMargin();
                }
            }
            ((b$a)object3).d(n4, constraints$LayoutParams);
        }
        return this.a;
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
    }
}

