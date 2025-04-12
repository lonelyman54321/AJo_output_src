/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.EditProfileData;
import kotlin.jvm.internal.Intrinsics;

public final class EditProfileData$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final EditProfileData createFromParcel(Parcel object) {
        EditProfileData editProfileData;
        Object object2;
        Object object3;
        Boolean bl2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        String string5 = object.readString();
        String string6 = object.readString();
        String string7 = object.readString();
        String string8 = object.readString();
        int bl3 = object.readInt();
        boolean bl4 = false;
        if (bl3 == 0) {
            bl2 = null;
        } else {
            void var10_14;
            int n3 = object.readInt();
            if (n3 != 0) {
                boolean bl5 = true;
            } else {
                boolean bl6 = false;
                object3 = null;
            }
            object3 = (boolean)var10_14;
            bl2 = object3;
        }
        int n4 = object.readInt();
        if (n4 == 0) {
            object2 = null;
        } else {
            int n7 = object.readInt();
            if (n7 != 0) {
                bl4 = true;
            }
            object2 = object = Boolean.valueOf(bl4);
        }
        object3 = editProfileData;
        editProfileData = new EditProfileData(string2, string3, string4, string5, string6, string7, string8, bl2, (Boolean)object2);
        return editProfileData;
    }

    public final EditProfileData[] newArray(int n3) {
        return new EditProfileData[n3];
    }
}

