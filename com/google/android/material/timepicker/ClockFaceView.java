/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.RadialGradient
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.widget.TextView
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.ClockHandView$OnRotateListener;
import com.google.android.material.timepicker.RadialViewGroup;
import java.util.Arrays;

class ClockFaceView
extends RadialViewGroup
implements ClockHandView$OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private final RectF scratch;
    private final Rect scratchLineBounds;
    private final ColorStateList textColor;
    private final SparseArray textViewPool;
    private final Rect textViewRect;
    private final a valueAccessibilityDelegate;
    private String[] values;

    public ClockFaceView(Context context) {
        this(context, null);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.materialClockStyle;
        this(context, attributeSet, n3);
    }

    public ClockFaceView(Context objectArray, AttributeSet attributeSet, int n3) {
        super((Context)objectArray, attributeSet, n3);
        Object object;
        this.textViewRect = object = new Rect();
        super();
        this.scratch = object;
        this.scratchLineBounds = object = new Rect();
        super();
        this.textViewPool = object;
        Object object2 = object = (Object)new float[3];
        object2[0] = (Rect)0.0f;
        object2[1] = (Rect)0.9f;
        object2[2] = (Rect)1.0f;
        this.gradientPositions = (float[])object;
        object = R$styleable.ClockFaceView;
        int n4 = R$style.Widget_MaterialComponents_TimePicker_Clock;
        attributeSet = objectArray.obtainStyledAttributes(attributeSet, (int[])object, n3, n4);
        Resources resources = this.getResources();
        int n7 = R$styleable.ClockFaceView_clockNumberTextColor;
        object = MaterialResources.getColorStateList((Context)objectArray, (TypedArray)attributeSet, n7);
        this.textColor = object;
        Object object3 = LayoutInflater.from((Context)objectArray);
        int n8 = R$layout.material_clockface_view;
        boolean bl2 = true;
        object3.inflate(n8, (ViewGroup)this, bl2);
        n4 = R$id.material_clock_hand;
        object3 = (ClockHandView)this.findViewById(n4);
        this.clockHandView = object3;
        n8 = R$dimen.material_clock_hand_padding;
        this.clockHandPadding = n8 = resources.getDimensionPixelSize(n8);
        int[] nArray = new int[]{0x10100A1};
        int n10 = object.getDefaultColor();
        n8 = object.getColorForState(nArray, n10);
        n7 = object.getDefaultColor();
        object = new int[]{n8, n8, n7};
        this.gradientColors = (int[])object;
        ((ClockHandView)((Object)object3)).addOnRotateListener(this);
        n7 = R$color.material_timepicker_clockface;
        object = t70.getColorStateList((Context)objectArray, n7);
        n7 = object.getDefaultColor();
        n4 = R$styleable.ClockFaceView_clockFaceBackgroundColor;
        objectArray = MaterialResources.getColorStateList((Context)objectArray, (TypedArray)attributeSet, n4);
        if (objectArray != null) {
            n7 = objectArray.getDefaultColor();
        }
        this.setBackgroundColor(n7);
        objectArray = this.getViewTreeObserver();
        super(this);
        objectArray.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
        this.setFocusable(bl2);
        attributeSet.recycle();
        super(this);
        this.valueAccessibilityDelegate = objectArray;
        objectArray = new String[12];
        Arrays.fill(objectArray, VALUE_PLACEHOLDER);
        this.setValues((String[])objectArray, 0);
        int n14 = R$dimen.material_time_picker_minimum_screen_height;
        this.minimumHeight = n14 = resources.getDimensionPixelSize(n14);
        n14 = R$dimen.material_time_picker_minimum_screen_width;
        this.minimumWidth = n14 = resources.getDimensionPixelSize(n14);
        n14 = R$dimen.material_clock_size;
        this.clockSize = n14 = resources.getDimensionPixelSize(n14);
    }

    public static /* synthetic */ ClockHandView access$000(ClockFaceView clockFaceView) {
        return clockFaceView.clockHandView;
    }

    public static /* synthetic */ int access$100(ClockFaceView clockFaceView) {
        return clockFaceView.clockHandPadding;
    }

    public static /* synthetic */ SparseArray access$200(ClockFaceView clockFaceView) {
        return clockFaceView.textViewPool;
    }

    public static /* synthetic */ Rect access$300(ClockFaceView clockFaceView) {
        return clockFaceView.textViewRect;
    }

    private void findIntersectingTextView() {
        SparseArray sparseArray;
        int n3;
        RectF rectF = this.clockHandView.getCurrentSelectorBox();
        TextView textView = this.getSelectedTextView(rectF);
        for (int i3 = 0; i3 < (n3 = (sparseArray = this.textViewPool).size()); ++i3) {
            RadialGradient radialGradient;
            boolean bl2;
            sparseArray = (TextView)this.textViewPool.get(i3);
            if (sparseArray == null) continue;
            if (sparseArray == textView) {
                bl2 = true;
            } else {
                bl2 = false;
                radialGradient = null;
            }
            sparseArray.setSelected(bl2);
            radialGradient = this.getGradientForTextView(rectF, (TextView)sparseArray);
            TextPaint textPaint = sparseArray.getPaint();
            textPaint.setShader((Shader)radialGradient);
            sparseArray.invalidate();
        }
    }

    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
        Rect rect = this.textViewRect;
        textView.getHitRect(rect);
        rect = this.scratch;
        Rect rect2 = this.textViewRect;
        rect.set(rect2);
        rect2 = this.scratchLineBounds;
        textView.getLineBounds(0, rect2);
        textView = this.scratch;
        rect = this.scratchLineBounds;
        int n3 = rect.left;
        float f5 = n3;
        int n4 = rect.top;
        float f6 = n4;
        textView.inset(f5, f6);
        textView = this.scratch;
        boolean bl2 = RectF.intersects((RectF)rectF, (RectF)textView);
        if (!bl2) {
            return null;
        }
        f6 = rectF.centerX();
        f5 = this.scratch.left;
        f5 = f6 - f5;
        f6 = rectF.centerY();
        float f7 = this.scratch.top;
        f7 = f6 - f7;
        float f8 = rectF.width() * 0.5f;
        int[] nArray = this.gradientColors;
        float[] fArray = this.gradientPositions;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        rect = textView;
        textView = new RadialGradient(f5, f7, f8, nArray, fArray, tileMode);
        return textView;
    }

    private TextView getSelectedTextView(RectF rectF) {
        SparseArray sparseArray;
        int n3;
        float f5 = Float.MAX_VALUE;
        SparseArray sparseArray2 = null;
        for (int i3 = 0; i3 < (n3 = (sparseArray = this.textViewPool).size()); ++i3) {
            sparseArray = (TextView)this.textViewPool.get(i3);
            if (sparseArray == null) continue;
            Rect rect = this.textViewRect;
            sparseArray.getHitRect(rect);
            rect = this.scratch;
            Rect rect2 = this.textViewRect;
            rect.set(rect2);
            this.scratch.union(rectF);
            rect = this.scratch;
            float f6 = rect.width();
            rect2 = this.scratch;
            float f7 = rect2.height() * f6;
            float f8 = f7 == f5 ? 0 : (f7 < f5 ? -1 : 1);
            if (f8 >= 0) continue;
            sparseArray2 = sparseArray;
            f5 = f7;
        }
        return sparseArray2;
    }

    private static float max3(float f5, float f6, float f7) {
        return Math.max(Math.max(f5, f6), f7);
    }

    private void updateTextViews(int n3) {
        TextView textView;
        int n4;
        int n7 = 1;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        SparseArray sparseArray = this.textViewPool;
        int n8 = sparseArray.size();
        boolean bl2 = false;
        for (int i3 = 0; i3 < (n4 = Math.max(((String[])(textView = this.values)).length, n8)); i3 += n7) {
            textView = (TextView)this.textViewPool.get(i3);
            Object object = this.values;
            int n10 = ((String[])object).length;
            if (i3 >= n10) {
                this.removeView((View)textView);
                textView = this.textViewPool;
                textView.remove(i3);
                continue;
            }
            if (textView == null) {
                n4 = R$layout.material_clockface_textview;
                textView = (TextView)layoutInflater.inflate(n4, (ViewGroup)this, false);
                object = this.textViewPool;
                object.put(i3, (Object)textView);
                this.addView((View)textView);
            }
            object = this.values[i3];
            textView.setText((CharSequence)object);
            n10 = R$id.material_value_index;
            Object object2 = i3;
            textView.setTag(n10, object2);
            n10 = i3 / 12 + n7;
            int n14 = R$id.material_clock_level;
            Object[] objectArray = Integer.valueOf(n10);
            textView.setTag(n14, (Object)objectArray);
            if (n10 > n7) {
                bl2 = true;
            }
            object = this.valueAccessibilityDelegate;
            ViewCompat.s((View)textView, (a)object);
            object = this.textColor;
            textView.setTextColor((ColorStateList)object);
            if (n3 == 0) continue;
            object = this.getResources();
            object2 = this.values[i3];
            objectArray = new Object[n7];
            objectArray[0] = object2;
            object = object.getString(n3, objectArray);
            textView.setContentDescription((CharSequence)object);
        }
        this.clockHandView.setMultiLevel(bl2);
    }

    public int getCurrentLevel() {
        return this.clockHandView.getCurrentLevel();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int n3 = this.values.length;
        int n4 = 1;
        AccessibilityNodeInfo.CollectionInfo collectionInfo = (AccessibilityNodeInfo.CollectionInfo)C2$e.a((int)n4, (int)n3, (int)n4, (boolean)false).a;
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        this.findIntersectingTextView();
    }

    public void onMeasure(int n3, int n4) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        float f5 = displayMetrics.heightPixels;
        float f6 = displayMetrics.widthPixels;
        float f7 = this.clockSize;
        float f8 = (float)this.minimumHeight / f5;
        f5 = (float)this.minimumWidth / f6;
        f6 = ClockFaceView.max3(f8, f5, 1.0f);
        n3 = (int)(f7 / f6);
        n4 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)0x40000000);
        this.setMeasuredDimension(n3, n3);
        super.onMeasure(n4, n4);
    }

    public void onRotate(float f5, boolean object) {
        float f6;
        float f7 = Math.abs(this.currentHandRotation - f5);
        float f8 = f7 - (f6 = 0.001f);
        object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object > 0) {
            this.currentHandRotation = f5;
            this.findIntersectingTextView();
        }
    }

    public void setCurrentLevel(int n3) {
        this.clockHandView.setCurrentLevel(n3);
    }

    public void setHandRotation(float f5) {
        this.clockHandView.setHandRotation(f5);
        this.findIntersectingTextView();
    }

    public void setRadius(int n3) {
        int n4 = this.getRadius();
        if (n3 != n4) {
            super.setRadius(n3);
            ClockHandView clockHandView = this.clockHandView;
            n4 = this.getRadius();
            clockHandView.setCircleRadius(n4);
        }
    }

    public void setValues(String[] stringArray, int n3) {
        this.values = stringArray;
        this.updateTextViews(n3);
    }

    public void updateLayoutParams() {
        SparseArray sparseArray;
        int n3;
        super.updateLayoutParams();
        for (int i3 = 0; i3 < (n3 = (sparseArray = this.textViewPool).size()); ++i3) {
            sparseArray = (TextView)this.textViewPool.get(i3);
            sparseArray.setVisibility(0);
        }
    }
}

