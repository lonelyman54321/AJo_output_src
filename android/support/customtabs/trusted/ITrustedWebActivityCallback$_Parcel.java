/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.customtabs.trusted;

import android.os.Parcel;
import android.os.Parcelable;

public class ITrustedWebActivityCallback$_Parcel {
    public static /* synthetic */ Object access$000(Parcel parcel, Parcelable.Creator creator) {
        return ITrustedWebActivityCallback$_Parcel.readTypedObject(parcel, creator);
    }

    public static /* synthetic */ void access$100(Parcel parcel, Parcelable parcelable, int n3) {
        ITrustedWebActivityCallback$_Parcel.writeTypedObject(parcel, parcelable, n3);
    }

    private static Object readTypedObject(Parcel parcel, Parcelable.Creator creator) {
        int n3 = parcel.readInt();
        if (n3 != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    private static void writeTypedObject(Parcel parcel, Parcelable parcelable, int n3) {
        if (parcelable != null) {
            int n4 = 1;
            parcel.writeInt(n4);
            parcelable.writeToParcel(parcel, n3);
        } else {
            parcelable = null;
            parcel.writeInt(0);
        }
    }
}

