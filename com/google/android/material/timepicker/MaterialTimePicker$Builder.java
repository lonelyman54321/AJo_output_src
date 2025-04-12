/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeModel;

public final class MaterialTimePicker$Builder {
    private Integer inputMode;
    private CharSequence negativeButtonText;
    private int negativeButtonTextResId;
    private int overrideThemeResId;
    private CharSequence positiveButtonText;
    private int positiveButtonTextResId;
    private TimeModel time;
    private CharSequence titleText;
    private int titleTextResId;

    public MaterialTimePicker$Builder() {
        TimeModel timeModel;
        this.time = timeModel = new TimeModel();
        this.titleTextResId = 0;
        this.positiveButtonTextResId = 0;
        this.negativeButtonTextResId = 0;
        this.overrideThemeResId = 0;
    }

    public static /* synthetic */ TimeModel access$000(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return materialTimePicker$Builder.time;
    }

    public static /* synthetic */ Integer access$100(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return materialTimePicker$Builder.inputMode;
    }

    public static /* synthetic */ int access$200(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return materialTimePicker$Builder.titleTextResId;
    }

    public static /* synthetic */ CharSequence access$300(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return materialTimePicker$Builder.titleText;
    }

    public static /* synthetic */ int access$400(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return materialTimePicker$Builder.positiveButtonTextResId;
    }

    public static /* synthetic */ CharSequence access$500(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return materialTimePicker$Builder.positiveButtonText;
    }

    public static /* synthetic */ int access$600(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return materialTimePicker$Builder.negativeButtonTextResId;
    }

    public static /* synthetic */ CharSequence access$700(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return materialTimePicker$Builder.negativeButtonText;
    }

    public static /* synthetic */ int access$800(MaterialTimePicker$Builder materialTimePicker$Builder) {
        return materialTimePicker$Builder.overrideThemeResId;
    }

    public MaterialTimePicker build() {
        return MaterialTimePicker.access$1400(this);
    }

    public MaterialTimePicker$Builder setHour(int n3) {
        this.time.setHourOfDay(n3);
        return this;
    }

    public MaterialTimePicker$Builder setInputMode(int n3) {
        Integer n4;
        this.inputMode = n4 = Integer.valueOf(n3);
        return this;
    }

    public MaterialTimePicker$Builder setMinute(int n3) {
        this.time.setMinute(n3);
        return this;
    }

    public MaterialTimePicker$Builder setNegativeButtonText(int n3) {
        this.negativeButtonTextResId = n3;
        return this;
    }

    public MaterialTimePicker$Builder setNegativeButtonText(CharSequence charSequence) {
        this.negativeButtonText = charSequence;
        return this;
    }

    public MaterialTimePicker$Builder setPositiveButtonText(int n3) {
        this.positiveButtonTextResId = n3;
        return this;
    }

    public MaterialTimePicker$Builder setPositiveButtonText(CharSequence charSequence) {
        this.positiveButtonText = charSequence;
        return this;
    }

    public MaterialTimePicker$Builder setTheme(int n3) {
        this.overrideThemeResId = n3;
        return this;
    }

    public MaterialTimePicker$Builder setTimeFormat(int n3) {
        TimeModel timeModel;
        TimeModel timeModel2 = this.time;
        int n4 = timeModel2.hour;
        int n7 = timeModel2.minute;
        this.time = timeModel = new TimeModel(n3);
        timeModel.setMinute(n7);
        this.time.setHourOfDay(n4);
        return this;
    }

    public MaterialTimePicker$Builder setTitleText(int n3) {
        this.titleTextResId = n3;
        return this;
    }

    public MaterialTimePicker$Builder setTitleText(CharSequence charSequence) {
        this.titleText = charSequence;
        return this;
    }
}

