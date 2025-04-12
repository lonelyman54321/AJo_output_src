/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.plp;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.plp.PLPExtras;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class PLPExtras$b
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final Object createFromParcel(Parcel parcel) {
        Object object;
        String string2;
        boolean bl2;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7 = parcel;
        Object object8 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)object8);
        int n3 = parcel.readInt();
        if (n3 == 0) {
            object6 = null;
        } else {
            n3 = parcel.readInt();
            object6 = object8 = Integer.valueOf(n3);
        }
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        String string13 = parcel.readString();
        n3 = parcel.readInt();
        Object object9 = null;
        if (n3 == 0) {
            n3 = 0;
            object8 = null;
        } else {
            n3 = parcel.readInt();
            if (n3 != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object8 = null;
            }
            object8 = n3 != 0;
        }
        String string14 = parcel.readString();
        String string15 = parcel.readString();
        String string16 = parcel.readString();
        String string17 = parcel.readString();
        int n4 = parcel.readInt();
        Object object10 = PLPExtras.class;
        if (n4 == 0) {
            object5 = object8;
            boolean bl3 = false;
            object4 = null;
        } else {
            int n7 = parcel.readInt();
            object3 = new ArrayList(n7);
            object5 = object8;
            object8 = null;
            for (n3 = 0; n3 != n7; ++n3) {
                object4 = ((Class)object10).getClassLoader();
                object4 = object7.readParcelable((ClassLoader)object4);
                ((ArrayList)object3).add(object4);
            }
            object4 = object3;
        }
        object8 = ((Class)object10).getClassLoader();
        object8 = object7.readBundle((ClassLoader)object8);
        Object object11 = parcel.readString();
        Object object12 = parcel.readString();
        int bl4 = parcel.readInt();
        if (bl4 == 0) {
            object2 = null;
        } else {
            int n7 = parcel.readInt();
            object2 = object3 = Integer.valueOf(n7);
        }
        object3 = ((Class)object10).getClassLoader();
        Object object13 = object3 = object7.readParcelable((ClassLoader)object3);
        object13 = (Uri)object3;
        String string18 = parcel.readString();
        object3 = ((Class)object10).getClassLoader();
        Object object14 = object3 = object7.readParcelable((ClassLoader)object3);
        object14 = (Uri)object3;
        Object object15 = parcel.readString();
        int n8 = parcel.readInt();
        boolean bl3 = n8 != 0;
        object3 = ((Class)object10).getClassLoader();
        Object object16 = object3 = object7.readParcelable((ClassLoader)object3);
        object16 = (RectF)object3;
        int n10 = parcel.readInt();
        if (n10 != 0) {
            bl2 = true;
            float f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            float f6 = 0.0f;
            string2 = null;
        }
        int n14 = parcel.readInt();
        boolean bl5 = n14 != 0;
        Object object17 = parcel.readString();
        object3 = ((Class)object10).getClassLoader();
        Bundle bundle = object7.readBundle((ClassLoader)object3);
        int n15 = parcel.readInt();
        if (n15 == 0) {
            object = null;
        } else {
            void var30_40;
            int n16 = parcel.readInt();
            if (n16 != 0) {
                boolean bl6 = true;
            } else {
                boolean bl7 = false;
                object3 = null;
            }
            object = object3 = Boolean.valueOf((boolean)var30_40);
        }
        String string19 = parcel.readString();
        object3 = object7;
        object9 = object5;
        object10 = object8;
        String string20 = object11;
        object5 = object12;
        object11 = object2;
        object12 = object13;
        object2 = string18;
        object13 = object14;
        string18 = object15;
        boolean bl8 = bl3;
        object15 = object16;
        bl3 = bl2;
        string2 = object17;
        object17 = object;
        object7 = new PLPExtras((Integer)object6, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, (Boolean)object9, string14, string15, string16, string17, (ArrayList)object4, (Bundle)object8, string20, (String)object5, (Integer)object11, (Uri)object12, (String)object2, (Uri)object14, string18, bl8, (RectF)object16, bl2, bl5, string2, bundle, (Boolean)object, string19);
        return object7;
    }

    public final Object[] newArray(int n3) {
        return new PLPExtras[n3];
    }
}

