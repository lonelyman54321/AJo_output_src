/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.accessibility.AccessibilityManager
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.R$string;
import com.google.android.material.timepicker.ClickActionDelegate;
import com.google.android.material.timepicker.ClockHandView$OnActionUpListener;
import com.google.android.material.timepicker.ClockHandView$OnRotateListener;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerClockPresenter$1;
import com.google.android.material.timepicker.TimePickerClockPresenter$2;
import com.google.android.material.timepicker.TimePickerPresenter;
import com.google.android.material.timepicker.TimePickerView;
import com.google.android.material.timepicker.TimePickerView$OnPeriodChangeListener;
import com.google.android.material.timepicker.TimePickerView$OnSelectionChange;

class TimePickerClockPresenter
implements ClockHandView$OnRotateListener,
TimePickerView$OnSelectionChange,
TimePickerView$OnPeriodChangeListener,
ClockHandView$OnActionUpListener,
TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private static final String[] HOUR_CLOCK_24_VALUES;
    private static final String[] HOUR_CLOCK_VALUES;
    private static final String[] MINUTE_CLOCK_VALUES;
    private boolean broadcasting = false;
    private float hourRotation;
    private float minuteRotation;
    private final TimeModel time;
    private final TimePickerView timePickerView;

    static {
        HOUR_CLOCK_VALUES = new String[]{"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        HOUR_CLOCK_24_VALUES = new String[]{"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
        MINUTE_CLOCK_VALUES = new String[]{"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    }

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.timePickerView = timePickerView;
        this.time = timeModel;
        this.initialize();
    }

    public static /* synthetic */ TimeModel access$000(TimePickerClockPresenter timePickerClockPresenter) {
        return timePickerClockPresenter.time;
    }

    private String[] getHourClockValues() {
        String[] stringArray = this.time;
        int n3 = stringArray.format;
        int n4 = 1;
        stringArray = n3 == n4 ? HOUR_CLOCK_24_VALUES : HOUR_CLOCK_VALUES;
        return stringArray;
    }

    private int getHourRotation() {
        return this.time.getHourForDisplay() * 30 % 360;
    }

    private void performHapticFeedback(int n3, int n4) {
        TimeModel timeModel = this.time;
        int n7 = timeModel.minute;
        if (n7 != n4 || (n4 = timeModel.hour) != n3) {
            TimePickerView timePickerView = this.timePickerView;
            n4 = 4;
            timePickerView.performHapticFeedback(n4);
        }
    }

    private void updateCurrentLevel() {
        int n3;
        TimeModel timeModel = this.time;
        int n4 = timeModel.selection;
        int n7 = 10;
        int n8 = 1;
        if (n4 == n7 && (n4 = timeModel.format) == n8 && (n3 = timeModel.hour) >= (n4 = 12)) {
            n8 = 2;
        }
        this.timePickerView.setCurrentLevel(n8);
    }

    private void updateTime() {
        TimePickerView timePickerView = this.timePickerView;
        TimeModel timeModel = this.time;
        int n3 = timeModel.period;
        int n4 = timeModel.getHourForDisplay();
        int n7 = this.time.minute;
        timePickerView.updateTime(n3, n4, n7);
    }

    private void updateValues() {
        String[] stringArray = HOUR_CLOCK_VALUES;
        this.updateValues(stringArray, "%d");
        stringArray = MINUTE_CLOCK_VALUES;
        this.updateValues(stringArray, "%02d");
    }

    private void updateValues(String[] stringArray, String string2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
            Object object = this.timePickerView.getResources();
            String string3 = stringArray[i3];
            object = TimeModel.formatText(object, string3, string2);
            stringArray[i3] = object;
        }
    }

    public void hide() {
        this.timePickerView.setVisibility(8);
    }

    public void initialize() {
        Object object = this.time;
        int n3 = ((TimeModel)object).format;
        if (n3 == 0) {
            object = this.timePickerView;
            ((TimePickerView)object).showToggle();
        }
        this.timePickerView.addOnRotateListener(this);
        this.timePickerView.setOnSelectionChangeListener(this);
        this.timePickerView.setOnPeriodChangeListener(this);
        this.timePickerView.setOnActionUpListener(this);
        this.updateValues();
        this.invalidate();
    }

    public void invalidate() {
        float f5;
        float f6;
        this.hourRotation = f6 = (float)this.getHourRotation();
        TimeModel timeModel = this.time;
        this.minuteRotation = f5 = (float)(timeModel.minute * 6);
        int n3 = timeModel.selection;
        this.setSelection(n3, false);
        this.updateTime();
    }

    public void onActionUp(float f5, boolean bl2) {
        boolean bl3 = true;
        float f6 = Float.MIN_VALUE;
        this.broadcasting = bl3;
        TimeModel timeModel = this.time;
        int n3 = timeModel.minute;
        int n4 = timeModel.hour;
        int n7 = timeModel.selection;
        int n8 = 10;
        if (n7 == n8) {
            int n10;
            TimePickerView timePickerView = this.timePickerView;
            float f7 = this.hourRotation;
            timePickerView.setHandRotation(f7, false);
            timePickerView = this.timePickerView.getContext();
            Class<AccessibilityManager> clazz = AccessibilityManager.class;
            timePickerView = (AccessibilityManager)t70.getSystemService((Context)timePickerView, clazz);
            if (timePickerView == null || (n10 = (int)(timePickerView.isTouchExplorationEnabled() ? 1 : 0)) == 0) {
                n10 = 12;
                f5 = 1.7E-44f;
                this.setSelection(n10, bl3);
            }
        } else {
            Object object;
            int n14 = Math.round(f5);
            if (!bl2) {
                n14 = (n14 + 15) / 30;
                TimeModel timeModel2 = this.time;
                timeModel2.setMinute(n14 *= 5);
                object = this.time;
                n14 = ((TimeModel)object).minute * 6;
                this.minuteRotation = f5 = (float)n14;
            }
            object = this.timePickerView;
            f6 = this.minuteRotation;
            ((TimePickerView)object).setHandRotation(f6, bl2);
        }
        this.broadcasting = false;
        this.updateTime();
        this.performHapticFeedback(n4, n3);
    }

    public void onPeriodChange(int n3) {
        this.time.setPeriod(n3);
    }

    public void onRotate(float f5, boolean bl2) {
        int n3 = this.broadcasting;
        if (n3 != 0) {
            return;
        }
        TimeModel timeModel = this.time;
        int n4 = timeModel.hour;
        n3 = timeModel.minute;
        int n7 = Math.round(f5);
        Object object = this.time;
        int n8 = ((TimeModel)object).selection;
        int n10 = 12;
        if (n8 == n10) {
            n7 = (n7 + 3) / 6;
            ((TimeModel)object).setMinute(n7);
            TimeModel timeModel2 = this.time;
            n7 = timeModel2.minute * 6;
            double d2 = Math.floor(n7);
            this.minuteRotation = f5 = (float)d2;
        } else {
            n7 = (n7 + 15) / 30;
            int n14 = ((TimeModel)object).format;
            n8 = 1;
            if (n14 == n8) {
                n7 %= 12;
                object = this.timePickerView;
                n14 = ((TimePickerView)object).getCurrentLevel();
                if (n14 == (n8 = 2)) {
                    n7 += 12;
                }
            }
            object = this.time;
            ((TimeModel)object).setHour(n7);
            n7 = this.getHourRotation();
            this.hourRotation = f5 = (float)n7;
        }
        if (!bl2) {
            this.updateTime();
            this.performHapticFeedback(n4, n3);
        }
    }

    public void onSelectionChanged(int n3) {
        this.setSelection(n3, true);
    }

    public void setSelection(int n3, boolean bl2) {
        int n4;
        Context context;
        int n7 = 12;
        float f5 = 1.7E-44f;
        if (n3 == n7) {
            n7 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n7 = 0;
            f5 = 0.0f;
            context = null;
        }
        this.timePickerView.setAnimateOnTouchUp(n7 != 0);
        this.time.selection = n3;
        TimePickerView timePickerView = this.timePickerView;
        String[] stringArray = n7 != 0 ? MINUTE_CLOCK_VALUES : this.getHourClockValues();
        if (n7) {
            n4 = R$string.material_minute_suffix;
        } else {
            TimeModel timeModel = this.time;
            n4 = timeModel.getHourContentDescriptionResId();
        }
        timePickerView.setValues(stringArray, n4);
        this.updateCurrentLevel();
        timePickerView = this.timePickerView;
        f5 = n7 != 0 ? this.minuteRotation : this.hourRotation;
        timePickerView.setHandRotation(f5, bl2);
        this.timePickerView.setActiveSelection(n3);
        TimePickerView timePickerView2 = this.timePickerView;
        context = this.timePickerView.getContext();
        int n8 = R$string.material_hour_selection;
        ClickActionDelegate clickActionDelegate = new TimePickerClockPresenter$1(this, context, n8);
        timePickerView2.setMinuteHourDelegate(clickActionDelegate);
        timePickerView2 = this.timePickerView;
        context = this.timePickerView.getContext();
        n8 = R$string.material_minute_selection;
        clickActionDelegate = new TimePickerClockPresenter$2(this, context, n8);
        timePickerView2.setHourClickDelegate(clickActionDelegate);
    }

    public void show() {
        this.timePickerView.setVisibility(0);
    }
}

