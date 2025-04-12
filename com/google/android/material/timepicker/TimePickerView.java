/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.ClockHandView$OnActionUpListener;
import com.google.android.material.timepicker.ClockHandView$OnRotateListener;
import com.google.android.material.timepicker.TimePickerControls;
import com.google.android.material.timepicker.TimePickerView$2;
import com.google.android.material.timepicker.TimePickerView$3;
import com.google.android.material.timepicker.TimePickerView$OnDoubleTapListener;
import com.google.android.material.timepicker.TimePickerView$OnPeriodChangeListener;
import com.google.android.material.timepicker.TimePickerView$OnSelectionChange;
import java.util.Locale;

class TimePickerView
extends ConstraintLayout
implements TimePickerControls {
    static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private final ClockFaceView clockFace;
    private final ClockHandView clockHandView;
    private final Chip hourView;
    private final Chip minuteView;
    private TimePickerView$OnDoubleTapListener onDoubleTapListener;
    private TimePickerView$OnPeriodChangeListener onPeriodChangeListener;
    private TimePickerView$OnSelectionChange onSelectionChangeListener;
    private final View.OnClickListener selectionListener;
    private final MaterialButtonToggleGroup toggle;

    public TimePickerView(Context context) {
        this(context, null);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context object, AttributeSet object2, int n3) {
        super((Context)object, (AttributeSet)object2, n3);
        super(this);
        this.selectionListener = object2;
        object = LayoutInflater.from((Context)object);
        int n4 = R$layout.material_timepicker;
        object.inflate(n4, (ViewGroup)this);
        int n7 = R$id.material_clock_face;
        object = (ClockFaceView)this.findViewById(n7);
        this.clockFace = object;
        n7 = R$id.material_clock_period_toggle;
        object = (MaterialButtonToggleGroup)this.findViewById(n7);
        this.toggle = object;
        super(this);
        object.addOnButtonCheckedListener((MaterialButtonToggleGroup$OnButtonCheckedListener)object2);
        n7 = R$id.material_minute_tv;
        object = (Chip)this.findViewById(n7);
        this.minuteView = object;
        n7 = R$id.material_hour_tv;
        object = (Chip)this.findViewById(n7);
        this.hourView = object;
        n7 = R$id.material_clock_hand;
        object = (ClockHandView)this.findViewById(n7);
        this.clockHandView = object;
        this.setupDoubleTap();
        this.setUpDisplay();
    }

    public static /* synthetic */ void a(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int n3, boolean bl2) {
        timePickerView.lambda$new$0(materialButtonToggleGroup, n3, bl2);
    }

    public static /* synthetic */ TimePickerView$OnSelectionChange access$000(TimePickerView timePickerView) {
        return timePickerView.onSelectionChangeListener;
    }

    public static /* synthetic */ TimePickerView$OnDoubleTapListener access$100(TimePickerView timePickerView) {
        return timePickerView.onDoubleTapListener;
    }

    private /* synthetic */ void lambda$new$0(MaterialButtonToggleGroup object, int n3, boolean n4) {
        if (n4 == 0) {
            return;
        }
        object = this.onPeriodChangeListener;
        if (object != null) {
            n4 = R$id.material_clock_period_pm_button;
            n3 = n3 == n4 ? 1 : 0;
            object.onPeriodChange(n3);
        }
    }

    private void setUpDisplay() {
        Chip chip = this.minuteView;
        int n3 = R$id.selection_type;
        Integer n4 = 12;
        chip.setTag(n3, n4);
        chip = this.hourView;
        n3 = R$id.selection_type;
        n4 = 10;
        chip.setTag(n3, n4);
        chip = this.minuteView;
        Object object = this.selectionListener;
        chip.setOnClickListener((View.OnClickListener)object);
        chip = this.hourView;
        object = this.selectionListener;
        chip.setOnClickListener((View.OnClickListener)object);
        chip = this.minuteView;
        object = GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME;
        chip.setAccessibilityClassName((CharSequence)object);
        this.hourView.setAccessibilityClassName((CharSequence)object);
    }

    private void setupDoubleTap() {
        Object object = this.getContext();
        TimePickerView$2 timePickerView$2 = new TimePickerView$2(this);
        GestureDetector gestureDetector = new GestureDetector(object, (GestureDetector.OnGestureListener)timePickerView$2);
        object = new TimePickerView$3(this, gestureDetector);
        this.minuteView.setOnTouchListener((View.OnTouchListener)object);
        this.hourView.setOnTouchListener((View.OnTouchListener)object);
    }

    /*
     * WARNING - void declaration
     */
    private void updateSelection(Chip chip, boolean bl2) {
        void var2_5;
        chip.setChecked(bl2);
        if (bl2) {
            int n3 = 2;
        } else {
            boolean bl3 = false;
        }
        chip.setAccessibilityLiveRegion((int)var2_5);
    }

    public void addOnRotateListener(ClockHandView$OnRotateListener clockHandView$OnRotateListener) {
        this.clockHandView.addOnRotateListener(clockHandView$OnRotateListener);
    }

    public int getCurrentLevel() {
        return this.clockFace.getCurrentLevel();
    }

    public void onVisibilityChanged(View object, int n3) {
        super.onVisibilityChanged(object, n3);
        if (object == this && n3 == 0) {
            object = this.hourView;
            n3 = 8;
            object.sendAccessibilityEvent(n3);
        }
    }

    public void setActiveSelection(int n3) {
        Chip chip = this.minuteView;
        int n4 = 12;
        boolean bl2 = false;
        n4 = n3 == n4 ? 1 : 0;
        this.updateSelection(chip, n4 != 0);
        chip = this.hourView;
        n4 = 10;
        if (n3 == n4) {
            bl2 = true;
        }
        this.updateSelection(chip, bl2);
    }

    public void setAnimateOnTouchUp(boolean bl2) {
        this.clockHandView.setAnimateOnTouchUp(bl2);
    }

    public void setCurrentLevel(int n3) {
        this.clockFace.setCurrentLevel(n3);
    }

    public void setHandRotation(float f5) {
        this.clockHandView.setHandRotation(f5);
    }

    public void setHandRotation(float f5, boolean bl2) {
        this.clockHandView.setHandRotation(f5, bl2);
    }

    public void setHourClickDelegate(a a2) {
        ViewCompat.s((View)this.minuteView, a2);
    }

    public void setMinuteHourDelegate(a a2) {
        ViewCompat.s((View)this.hourView, a2);
    }

    public void setOnActionUpListener(ClockHandView$OnActionUpListener clockHandView$OnActionUpListener) {
        this.clockHandView.setOnActionUpListener(clockHandView$OnActionUpListener);
    }

    public void setOnDoubleTapListener(TimePickerView$OnDoubleTapListener timePickerView$OnDoubleTapListener) {
        this.onDoubleTapListener = timePickerView$OnDoubleTapListener;
    }

    public void setOnPeriodChangeListener(TimePickerView$OnPeriodChangeListener timePickerView$OnPeriodChangeListener) {
        this.onPeriodChangeListener = timePickerView$OnPeriodChangeListener;
    }

    public void setOnSelectionChangeListener(TimePickerView$OnSelectionChange timePickerView$OnSelectionChange) {
        this.onSelectionChangeListener = timePickerView$OnSelectionChange;
    }

    public void setValues(String[] stringArray, int n3) {
        this.clockFace.setValues(stringArray, n3);
    }

    public void showToggle() {
        this.toggle.setVisibility(0);
    }

    public void updateTime(int n3, int n4, int n7) {
        int n8 = 1;
        n3 = n3 == n8 ? R$id.material_clock_period_pm_button : R$id.material_clock_period_am_button;
        this.toggle.check(n3);
        Object object = this.getResources().getConfiguration().locale;
        Object object2 = n7;
        Object object3 = new Object[n8];
        object3[0] = object2;
        object2 = "%02d";
        object3 = String.format((Locale)object, (String)object2, object3);
        Object object4 = n4;
        Object[] objectArray = new Object[n8];
        objectArray[0] = object4;
        object = String.format((Locale)object, (String)object2, objectArray);
        object4 = this.minuteView.getText();
        n4 = (int)(TextUtils.equals((CharSequence)object4, (CharSequence)object3) ? 1 : 0);
        if (n4 == 0) {
            object4 = this.minuteView;
            object4.setText((CharSequence)object3);
        }
        if ((n4 = (int)(TextUtils.equals((CharSequence)(object4 = this.hourView.getText()), (CharSequence)object) ? 1 : 0)) == 0) {
            object4 = this.hourView;
            object4.setText((CharSequence)object);
        }
    }
}

