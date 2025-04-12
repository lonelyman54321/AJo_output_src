/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.c$a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ReactiveGuide
extends View
implements c$a {
    public int a = -1;
    public boolean b = false;
    public int c = 0;
    public boolean d = true;

    public ReactiveGuide(Context context) {
        super(context);
        super.setVisibility(8);
        this.a(null);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
        this.a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        super.setVisibility(8);
        this.a(attributeSet);
    }

    public final void a(AttributeSet object) {
        int n3;
        int n4;
        if (object != null) {
            Context context = this.getContext();
            int[] nArray = R$styleable.ConstraintLayout_ReactiveGuide;
            object = context.obtainStyledAttributes((AttributeSet)object, nArray);
            n4 = object.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7;
                int n8 = object.getIndex(i3);
                if (n8 == (n7 = R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId)) {
                    n7 = this.a;
                    this.a = n8 = object.getResourceId(n8, n7);
                    continue;
                }
                n7 = R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange;
                if (n8 == n7) {
                    n7 = (int)(this.b ? 1 : 0);
                    n8 = (int)(object.getBoolean(n8, n7 != 0) ? 1 : 0);
                    this.b = n8;
                    continue;
                }
                n7 = R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet;
                if (n8 == n7) {
                    n7 = this.c;
                    this.c = n8 = object.getResourceId(n8, n7);
                    continue;
                }
                n7 = R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets;
                if (n8 != n7) continue;
                n7 = (int)(this.d ? 1 : 0);
                n8 = (int)(object.getBoolean(n8, n7 != 0) ? 1 : 0);
                this.d = n8;
            }
            object.recycle();
        }
        if ((n3 = this.a) != (n4 = -1)) {
            object = ConstraintLayout.getSharedValues();
            n4 = this.a;
            ((c)object).a(n4, this);
        }
    }

    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.c;
    }

    public int getAttributeId() {
        return this.a;
    }

    public final void onMeasure(int n3, int n4) {
        this.setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean bl2) {
        this.b = bl2;
    }

    public void setApplyToConstraintSetId(int n3) {
        this.c = n3;
    }

    public void setAttributeId(int n3) {
        c c2 = ConstraintLayout.getSharedValues();
        int n4 = this.a;
        int n7 = -1;
        if (n4 != n7) {
            Cloneable cloneable = c2.a;
            Serializable serializable = Integer.valueOf(n4);
            if ((serializable = (HashSet)((HashMap)cloneable).get(serializable)) != null) {
                boolean bl2;
                cloneable = new ArrayList();
                Iterator iterator = ((HashSet)serializable).iterator();
                while (bl2 = iterator.hasNext()) {
                    WeakReference weakReference = (WeakReference)iterator.next();
                    c$a c$a = (c$a)weakReference.get();
                    if (c$a != null && c$a != this) continue;
                    ((ArrayList)cloneable).add(weakReference);
                }
                ((AbstractCollection)((Object)serializable)).removeAll((Collection<?>)((Object)cloneable));
            }
        }
        this.a = n3;
        if (n3 != n7) {
            c2.a(n3, this);
        }
    }

    public void setGuidelineBegin(int n3) {
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)this.getLayoutParams();
        constraintLayout$LayoutParams.a = n3;
        this.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }

    public void setGuidelineEnd(int n3) {
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)this.getLayoutParams();
        constraintLayout$LayoutParams.b = n3;
        this.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }

    public void setGuidelinePercent(float f5) {
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)this.getLayoutParams();
        constraintLayout$LayoutParams.c = f5;
        this.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }

    public void setVisibility(int n3) {
    }
}

