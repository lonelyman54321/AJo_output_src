/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.util.AttributeSet
 */
package com.google.android.material.slider;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.RangeSlider$RangeSliderState;
import java.util.ArrayList;
import java.util.List;

public class RangeSlider
extends BaseSlider {
    private float minSeparation;
    private int separationUnit;

    public RangeSlider(Context context) {
        this(context, null);
    }

    public RangeSlider(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.sliderStyle;
        this(context, attributeSet, n3);
    }

    public RangeSlider(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object, n3);
        float f5;
        int[] nArray = R$styleable.RangeSlider;
        int n4 = BaseSlider.DEF_STYLE_RES;
        int[] nArray2 = new int[]{};
        context = ThemeEnforcement.obtainStyledAttributes(context, object, nArray, n3, n4, nArray2);
        int n7 = R$styleable.RangeSlider_values;
        n7 = (int)(context.hasValue(n7) ? 1 : 0);
        if (n7 != 0) {
            n7 = R$styleable.RangeSlider_values;
            n7 = context.getResourceId(n7, 0);
            Resources resources = context.getResources();
            object = RangeSlider.convertToFloat(resources.obtainTypedArray(n7));
            this.setValues((List)object);
        }
        n7 = R$styleable.RangeSlider_minSeparation;
        this.minSeparation = f5 = context.getDimension(n7, 0.0f);
        context.recycle();
    }

    private static List convertToFloat(TypedArray typedArray) {
        int n3;
        ArrayList<Float> arrayList = new ArrayList<Float>();
        for (int i3 = 0; i3 < (n3 = typedArray.length()); ++i3) {
            n3 = -1082130432;
            float f5 = typedArray.getFloat(i3, -1.0f);
            Float f6 = Float.valueOf(f5);
            arrayList.add(f6);
        }
        return arrayList;
    }

    public float getMinSeparation() {
        return this.minSeparation;
    }

    public List getValues() {
        return super.getValues();
    }

    public void onRestoreInstanceState(Parcelable object) {
        int n3;
        float f5;
        object = (RangeSlider$RangeSliderState)((Object)object);
        Parcelable parcelable = object.getSuperState();
        super.onRestoreInstanceState(parcelable);
        this.minSeparation = f5 = RangeSlider$RangeSliderState.access$000((RangeSlider$RangeSliderState)((Object)object));
        this.separationUnit = n3 = RangeSlider$RangeSliderState.access$100((RangeSlider$RangeSliderState)((Object)object));
        this.setSeparationUnit(n3);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable parcelable = super.onSaveInstanceState();
        RangeSlider$RangeSliderState rangeSlider$RangeSliderState = new RangeSlider$RangeSliderState(parcelable);
        float f5 = this.minSeparation;
        RangeSlider$RangeSliderState.access$002(rangeSlider$RangeSliderState, f5);
        int n3 = this.separationUnit;
        RangeSlider$RangeSliderState.access$102(rangeSlider$RangeSliderState, n3);
        return rangeSlider$RangeSliderState;
    }

    public void setCustomThumbDrawable(int n3) {
        super.setCustomThumbDrawable(n3);
    }

    public void setCustomThumbDrawable(Drawable drawable2) {
        super.setCustomThumbDrawable(drawable2);
    }

    public void setCustomThumbDrawablesForValues(int ... nArray) {
        super.setCustomThumbDrawablesForValues(nArray);
    }

    public void setCustomThumbDrawablesForValues(Drawable ... drawableArray) {
        super.setCustomThumbDrawablesForValues(drawableArray);
    }

    public void setMinSeparation(float f5) {
        this.minSeparation = f5;
        this.separationUnit = 0;
        this.setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f5) {
        int n3;
        this.minSeparation = f5;
        this.separationUnit = n3 = 1;
        this.setSeparationUnit(n3);
    }

    public void setValues(List list) {
        super.setValues(list);
    }

    public void setValues(Float ... floatArray) {
        super.setValues(floatArray);
    }
}

