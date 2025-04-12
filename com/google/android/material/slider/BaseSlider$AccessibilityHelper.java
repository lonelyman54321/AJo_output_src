/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.view.accessibility.AccessibilityNodeInfo$RangeInfo
 *  android.widget.SeekBar
 */
package com.google.android.material.slider;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.material.R$string;
import com.google.android.material.slider.BaseSlider;
import java.util.List;
import java.util.Locale;

class BaseSlider$AccessibilityHelper
extends HH0 {
    private final BaseSlider slider;
    final Rect virtualViewBounds;

    public BaseSlider$AccessibilityHelper(BaseSlider baseSlider) {
        super(baseSlider);
        Rect rect;
        this.virtualViewBounds = rect = new Rect();
        this.slider = baseSlider;
    }

    private String startOrEndDescription(int n3) {
        List list = this.slider.getValues();
        int n4 = list.size() + -1;
        if (n3 == n4) {
            Context context = this.slider.getContext();
            n4 = R$string.material_slider_range_end;
            return context.getString(n4);
        }
        if (n3 == 0) {
            Context context = this.slider.getContext();
            n4 = R$string.material_slider_range_start;
            return context.getString(n4);
        }
        return "";
    }

    public int getVirtualViewAt(float f5, float f6) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.slider.getValues()).size()); ++i3) {
            object = this.slider;
            Rect rect = this.virtualViewBounds;
            ((BaseSlider)((Object)object)).updateBoundsForVirtualViewId(i3, rect);
            object = this.virtualViewBounds;
            int n4 = (int)f5;
            int n7 = (int)f6;
            n3 = (int)(object.contains(n4, n7) ? 1 : 0);
            if (n3 == 0) continue;
            return i3;
        }
        return -1;
    }

    public void getVisibleVirtualViews(List list) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.slider.getValues()).size()); ++i3) {
            object = i3;
            list.add(object);
        }
    }

    public boolean onPerformActionForVirtualView(int n3, int n4, Bundle object) {
        Object object2;
        BaseSlider baseSlider = this.slider;
        int n7 = baseSlider.isEnabled();
        if (n7 == 0) {
            return false;
        }
        n7 = 4096;
        float f5 = 5.74E-42f;
        boolean bl2 = true;
        int n8 = 8192;
        if (n4 != n7 && n4 != n8) {
            float f6;
            String string2;
            n7 = 16908349;
            f5 = 2.38774E-38f;
            if (n4 != n7) {
                return false;
            }
            if (object != null && (n7 = (int)(object.containsKey(string2 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") ? 1 : 0)) != 0 && (n4 = (int)(BaseSlider.access$500((BaseSlider)((Object)(object = this.slider)), n3, f6 = object.getFloat(string2)) ? 1 : 0)) != 0) {
                BaseSlider.access$600(this.slider);
                this.slider.postInvalidate();
                this.invalidateVirtualView(n3);
                return bl2;
            }
            return false;
        }
        object = this.slider;
        n7 = 20;
        f5 = 2.8E-44f;
        float f7 = BaseSlider.access$700((BaseSlider)((Object)object), n7);
        if (n4 == n8) {
            f7 = -f7;
        }
        if ((n4 = (int)(((BaseSlider)((Object)(object2 = this.slider))).isRtl() ? 1 : 0)) != 0) {
            f7 = -f7;
        }
        object2 = (Float)this.slider.getValues().get(n3);
        float f8 = ((Float)object2).floatValue() + f7;
        object = this.slider;
        f7 = this.slider.getValueFrom();
        n4 = (int)(BaseSlider.access$500((BaseSlider)((Object)object), n3, f8 = PK1.a(f8, f7, f5 = (baseSlider = this.slider).getValueTo())) ? 1 : 0);
        if (n4 != 0) {
            BaseSlider.access$600(this.slider);
            this.slider.postInvalidate();
            this.invalidateVirtualView(n3);
            return bl2;
        }
        return false;
    }

    public void onPopulateNodeForVirtualView(int n3, C2 object) {
        Object object2 = C2$a.t;
        ((C2)object).b((C2$a)object2);
        object2 = this.slider.getValues();
        Object object3 = (Float)object2.get(n3);
        float f5 = ((Float)object3).floatValue();
        Object object4 = this.slider;
        float f6 = ((BaseSlider)((Object)object4)).getValueFrom();
        BaseSlider baseSlider = this.slider;
        float f7 = baseSlider.getValueTo();
        BaseSlider baseSlider2 = this.slider;
        Object object5 = baseSlider2.isEnabled();
        if (object5 != 0) {
            object5 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
            if (object5 > 0) {
                object5 = 8192;
                ((C2)object).a((int)object5);
            }
            if ((object5 = (Object)(f5 == f7 ? 0 : (f5 < f7 ? -1 : 1))) < 0) {
                object5 = 4096;
                ((C2)object).a((int)object5);
            }
        }
        object5 = 1;
        object4 = AccessibilityNodeInfo.RangeInfo.obtain((int)object5, (float)f6, (float)f7, (float)f5);
        baseSlider = ((C2)object).a;
        baseSlider.setRangeInfo((AccessibilityNodeInfo.RangeInfo)object4);
        object4 = SeekBar.class.getName();
        ((C2)object).l((CharSequence)object4);
        object4 = new StringBuilder();
        CharSequence charSequence = this.slider.getContentDescription();
        if (charSequence != null) {
            charSequence = this.slider.getContentDescription();
            ((StringBuilder)object4).append(charSequence);
            charSequence = ",";
            ((StringBuilder)object4).append((String)charSequence);
        }
        object3 = BaseSlider.access$400(this.slider, f5);
        charSequence = this.slider.getContext();
        int n4 = R$string.material_slider_value;
        charSequence = charSequence.getString(n4);
        int n7 = object2.size();
        if (n7 > object5) {
            charSequence = this.startOrEndDescription(n3);
        }
        object2 = Locale.US;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)charSequence);
        ((StringBuilder)object2).append(", ");
        ((StringBuilder)object2).append((String)object3);
        object2 = ((StringBuilder)object2).toString();
        ((StringBuilder)object4).append((String)object2);
        object2 = ((StringBuilder)object4).toString();
        ((C2)object).o((CharSequence)object2);
        object = this.slider;
        object2 = this.virtualViewBounds;
        ((BaseSlider)((Object)object)).updateBoundsForVirtualViewId(n3, (Rect)object2);
        Rect rect = this.virtualViewBounds;
        baseSlider.setBoundsInParent(rect);
    }
}

