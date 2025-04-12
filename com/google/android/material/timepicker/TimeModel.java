/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.R$string;
import com.google.android.material.timepicker.MaxInputValidator;
import com.google.android.material.timepicker.TimeModel$1;
import java.util.Arrays;
import java.util.Locale;

class TimeModel
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";
    final int format;
    int hour;
    private final MaxInputValidator hourInputValidator;
    int minute;
    private final MaxInputValidator minuteInputValidator;
    int period;
    int selection;

    static {
        TimeModel$1 timeModel$1 = new TimeModel$1();
        CREATOR = timeModel$1;
    }

    public TimeModel() {
        this(0);
    }

    public TimeModel(int n3) {
        this(0, 0, 10, n3);
    }

    public TimeModel(int n3, int n4, int n7, int n8) {
        MaxInputValidator maxInputValidator;
        this.hour = n3;
        this.minute = n4;
        this.selection = n7;
        this.format = n8;
        this.period = n3 = TimeModel.getPeriod(n3);
        this.minuteInputValidator = maxInputValidator = new MaxInputValidator(59);
        n4 = 1;
        n4 = n8 == n4 ? 23 : 12;
        this.hourInputValidator = maxInputValidator = new MaxInputValidator(n4);
    }

    public TimeModel(Parcel parcel) {
        int n3 = parcel.readInt();
        int n4 = parcel.readInt();
        int n7 = parcel.readInt();
        int n8 = parcel.readInt();
        this(n3, n4, n7, n8);
    }

    public static String formatText(Resources resources, CharSequence charSequence) {
        return TimeModel.formatText(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    public static String formatText(Resources object, CharSequence object2, String string2) {
        try {
            object = object.getConfiguration();
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        object = object.locale;
        object2 = String.valueOf(object2);
        int n3 = Integer.parseInt((String)object2);
        object2 = n3;
        int n4 = 1;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object2;
        return String.format((Locale)object, string2, objectArray);
    }

    private static int getPeriod(int n3) {
        int n4 = 12;
        n3 = n3 >= n4 ? 1 : 0;
        return n3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof TimeModel;
        if (n4 == 0) {
            return false;
        }
        object = (TimeModel)object;
        n4 = this.hour;
        int n7 = ((TimeModel)object).hour;
        if (n4 != n7 || (n4 = this.minute) != (n7 = ((TimeModel)object).minute) || (n4 = this.format) != (n7 = ((TimeModel)object).format) || (n4 = this.selection) != (n3 = ((TimeModel)object).selection)) {
            bl2 = false;
        }
        return bl2;
    }

    public int getHourContentDescriptionResId() {
        int n3 = this.format;
        int n4 = 1;
        n3 = n3 == n4 ? R$string.material_hour_24h_suffix : R$string.material_hour_suffix;
        return n3;
    }

    public int getHourForDisplay() {
        int n3 = this.format;
        int n4 = 1;
        if (n3 == n4) {
            return this.hour % 24;
        }
        n3 = this.hour;
        int n7 = n3 % 12;
        int n8 = 12;
        if (n7 == 0) {
            return n8;
        }
        n7 = this.period;
        if (n7 == n4) {
            n3 -= n8;
        }
        return n3;
    }

    public MaxInputValidator getHourInputValidator() {
        return this.hourInputValidator;
    }

    public MaxInputValidator getMinuteInputValidator() {
        return this.minuteInputValidator;
    }

    public int hashCode() {
        Integer n3 = this.format;
        Integer n4 = this.hour;
        Integer n7 = this.minute;
        Integer n8 = this.selection;
        Object[] objectArray = new Object[]{n3, n4, n7, n8};
        return Arrays.hashCode(objectArray);
    }

    public void setHour(int n3) {
        int n4 = this.format;
        int n7 = 1;
        if (n4 == n7) {
            this.hour = n3;
            return;
        }
        n4 = 12;
        n3 %= n4;
        int n8 = this.period;
        if (n8 != n7) {
            n4 = 0;
        }
        this.hour = n3 += n4;
    }

    public void setHourOfDay(int n3) {
        int n4;
        this.period = n4 = TimeModel.getPeriod(n3);
        this.hour = n3;
    }

    public void setMinute(int n3) {
        this.minute = n3 %= 60;
    }

    public void setPeriod(int n3) {
        int n4 = this.period;
        if (n3 != n4) {
            int n7;
            this.period = n3;
            n4 = this.hour;
            int n8 = 12;
            if (n4 < n8 && n3 == (n7 = 1)) {
                this.hour = n4 += n8;
            } else if (n4 >= n8 && n3 == 0) {
                this.hour = n4 -= n8;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.hour;
        parcel.writeInt(n3);
        n3 = this.minute;
        parcel.writeInt(n3);
        n3 = this.selection;
        parcel.writeInt(n3);
        n3 = this.format;
        parcel.writeInt(n3);
    }
}

