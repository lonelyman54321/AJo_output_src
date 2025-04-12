/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.WidgetRecord;
import kotlin.jvm.internal.Intrinsics;

public final class WidgetRecord$Creator
implements Parcelable.Creator {
    public final WidgetRecord createFromParcel(Parcel object) {
        WidgetRecord widgetRecord;
        Boolean bl2;
        Object object2;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        String string5 = object.readString();
        int n3 = object.readInt();
        boolean bl3 = false;
        Boolean bl4 = null;
        Comparable<Boolean> comparable = null;
        if (n3 == 0) {
            object3 = null;
        } else {
            n3 = object.readInt();
            if (n3 != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            object3 = object2 = Boolean.valueOf(n3 != 0);
        }
        n3 = object.readInt();
        if (n3 == 0) {
            bl2 = null;
        } else {
            n3 = object.readInt();
            if (n3 != 0) {
                bl3 = true;
            }
            object2 = bl3;
            bl2 = object2;
        }
        n3 = object.readInt();
        if (n3 != 0) {
            n3 = object.readInt();
            object2 = n3;
            comparable = object2;
        }
        String string6 = object.readString();
        String string7 = object.readString();
        object = object.readString();
        object2 = widgetRecord;
        bl4 = object3;
        object3 = string6;
        string6 = string7;
        string7 = object;
        widgetRecord = new WidgetRecord(string2, string3, string4, string5, bl4, bl2, (Integer)comparable, (String)object3, string6, (String)object);
        return widgetRecord;
    }

    public final WidgetRecord[] newArray(int n3) {
        return new WidgetRecord[n3];
    }
}

