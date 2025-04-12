/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class IMediaSession$_Parcel {
    public static /* synthetic */ Object access$000(Parcel parcel, Parcelable.Creator creator) {
        return IMediaSession$_Parcel.readTypedObject(parcel, creator);
    }

    public static /* synthetic */ void access$100(Parcel parcel, Parcelable parcelable, int n3) {
        IMediaSession$_Parcel.writeTypedObject(parcel, parcelable, n3);
    }

    public static /* synthetic */ void access$200(Parcel parcel, List list, int n3) {
        IMediaSession$_Parcel.writeTypedList(parcel, list, n3);
    }

    private static Object readTypedObject(Parcel parcel, Parcelable.Creator creator) {
        int n3 = parcel.readInt();
        if (n3 != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    private static void writeTypedList(Parcel parcel, List list, int n3) {
        if (list == null) {
            int n4 = -1;
            parcel.writeInt(n4);
        } else {
            int n7 = list.size();
            parcel.writeInt(n7);
            for (int i3 = 0; i3 < n7; ++i3) {
                Parcelable parcelable = (Parcelable)list.get(i3);
                IMediaSession$_Parcel.writeTypedObject(parcel, parcelable, n3);
            }
        }
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

