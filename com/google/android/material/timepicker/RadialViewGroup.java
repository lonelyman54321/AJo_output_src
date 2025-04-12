/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.b$b;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class RadialViewGroup
extends ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(Context context) {
        this(context, null);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object, n3);
        Object object2 = LayoutInflater.from((Context)context);
        int n4 = R$layout.material_radial_view_group;
        object2.inflate(n4, (ViewGroup)this);
        object2 = this.createBackground();
        this.setBackground((Drawable)object2);
        object2 = R$styleable.RadialViewGroup;
        context = context.obtainStyledAttributes(object, (int[])object2, n3, 0);
        int n7 = R$styleable.RadialViewGroup_materialCircleRadius;
        this.radius = n7 = context.getDimensionPixelSize(n7, 0);
        super(this);
        this.updateLayoutParametersRunnable = object;
        context.recycle();
    }

    private void addConstraints(List list, b b2, int n3) {
        int n4;
        Iterator iterator = list.iterator();
        float f5 = 0.0f;
        while ((n4 = iterator.hasNext()) != 0) {
            n4 = ((View)iterator.next()).getId();
            int n7 = R$id.circle_center;
            b$b b$b = b2.j((int)n4).e;
            b$b.A = n7;
            b$b.B = n3;
            b$b.C = f5;
            n4 = list.size();
            float f6 = n4;
            n7 = 1135869952;
            float f7 = 360.0f / f6;
            f5 += f7;
        }
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable;
        this.background = materialShapeDrawable = new MaterialShapeDrawable();
        RelativeCornerSize relativeCornerSize = new RelativeCornerSize(0.5f);
        materialShapeDrawable.setCornerSize(relativeCornerSize);
        materialShapeDrawable = this.background;
        relativeCornerSize = ColorStateList.valueOf((int)-1);
        materialShapeDrawable.setFillColor((ColorStateList)relativeCornerSize);
        return this.background;
    }

    private static boolean shouldSkipView(View object) {
        object = object.getTag();
        return SKIP_TAG.equals(object);
    }

    private void updateLayoutParamsAsync() {
        Handler handler = this.getHandler();
        if (handler != null) {
            Runnable runnable2 = this.updateLayoutParametersRunnable;
            handler.removeCallbacks(runnable2);
            runnable2 = this.updateLayoutParametersRunnable;
            handler.post(runnable2);
        }
    }

    public void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, n3, layoutParams);
        n3 = view.getId();
        int n4 = -1;
        if (n3 == n4) {
            n3 = View.generateViewId();
            view.setId(n3);
        }
        this.updateLayoutParamsAsync();
    }

    public int getLeveledRadius(int n3) {
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4) {
            float f6 = this.radius;
            n4 = 1059648963;
            f5 = 0.66f;
            n3 = Math.round(f6 *= f5);
        } else {
            n3 = this.radius;
        }
        return n3;
    }

    public int getRadius() {
        return this.radius;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.updateLayoutParams();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.updateLayoutParamsAsync();
    }

    public void setBackgroundColor(int n3) {
        MaterialShapeDrawable materialShapeDrawable = this.background;
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        materialShapeDrawable.setFillColor(colorStateList);
    }

    public void setRadius(int n3) {
        this.radius = n3;
        this.updateLayoutParams();
    }

    public void updateLayoutParams() {
        Object object;
        int n3;
        int n4;
        b b2 = new b();
        b2.e(this);
        Object object2 = new HashMap();
        Object object3 = null;
        for (n4 = 0; n4 < (n3 = this.getChildCount()); ++n4) {
            int n7;
            object = this.getChildAt(n4);
            int n8 = object.getId();
            if (n8 == (n7 = R$id.circle_center) || (n8 = (int)(RadialViewGroup.shouldSkipView(object) ? 1 : 0)) != 0) continue;
            n8 = R$id.material_clock_level;
            Object object4 = (Integer)object.getTag(n8);
            if (object4 == null) {
                n8 = 1;
                object4 = n8;
            }
            if ((n7 = (int)(((HashMap)object2).containsKey(object4) ? 1 : 0)) == 0) {
                ArrayList arrayList = new ArrayList();
                ((HashMap)object2).put(object4, arrayList);
            }
            object4 = (List)((HashMap)object2).get(object4);
            object4.add(object);
        }
        object2 = ((HashMap)object2).entrySet().iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object3 = (Map.Entry)object2.next();
            object = (List)object3.getValue();
            object3 = (Integer)object3.getKey();
            n4 = (Integer)object3;
            n4 = this.getLeveledRadius(n4);
            this.addConstraints((List)object, b2, n4);
        }
        b2.b(this);
    }
}

