/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.DrmInitData$SchemeData$a;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public final class DrmInitData$SchemeData
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    static {
        DrmInitData$SchemeData$a drmInitData$SchemeData$a = new Object();
        CREATOR = drmInitData$SchemeData$a;
    }

    public DrmInitData$SchemeData(Parcel object) {
        long l2 = object.readLong();
        long l3 = object.readLong();
        Object object2 = new UUID(l2, l3);
        this.b = object2;
        this.c = object2 = object.readString();
        object2 = object.readString();
        this.d = object2;
        object = object.createByteArray();
        this.e = (byte[])object;
    }

    public DrmInitData$SchemeData(UUID object, String string2, String string3, byte[] byArray) {
        object.getClass();
        this.b = object;
        this.c = string2;
        string3.getClass();
        this.d = object = ip1_0.l(string3);
        this.e = byArray;
    }

    public final boolean a(UUID uUID) {
        boolean bl2;
        UUID uUID2 = OF.a;
        UUID uUID3 = this.b;
        boolean bl3 = uUID2.equals(uUID3);
        if (!bl3 && !(bl2 = uUID.equals(uUID3))) {
            bl2 = false;
            uUID = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof DrmInitData$SchemeData;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (object == this) {
            return bl3;
        }
        object = (DrmInitData$SchemeData)object;
        Object object2 = ((DrmInitData$SchemeData)object).c;
        Object object3 = this.c;
        boolean bl5 = Objects.equals(object3, object2);
        if (bl5 && (bl5 = Objects.equals(object2 = this.d, object3 = ((DrmInitData$SchemeData)object).d)) && (bl5 = Objects.equals(object2 = this.b, object3 = ((DrmInitData$SchemeData)object).b)) && (bl2 = Arrays.equals((byte[])(object2 = (Object)this.e), (byte[])(object = (Object)((DrmInitData$SchemeData)object).e)))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        int n3 = this.a;
        if (n3 == 0) {
            int n4;
            UUID uUID = this.b;
            n3 = uUID.hashCode();
            int n7 = 31;
            n3 *= 31;
            String string2 = this.c;
            if (string2 == null) {
                n4 = 0;
                string2 = null;
            } else {
                n4 = string2.hashCode();
            }
            n3 = (n3 + n4) * 31;
            string2 = this.d;
            n3 = zy_2.b(n3, n7, string2);
            byte[] byArray = this.e;
            this.a = n7 = Arrays.hashCode(byArray) + n3;
        }
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.b;
        long l2 = ((UUID)object).getMostSignificantBits();
        parcel.writeLong(l2);
        l2 = ((UUID)object).getLeastSignificantBits();
        parcel.writeLong(l2);
        object = this.c;
        parcel.writeString((String)object);
        object = this.d;
        parcel.writeString((String)object);
        object = this.e;
        parcel.writeByteArray((byte[])object);
    }
}

