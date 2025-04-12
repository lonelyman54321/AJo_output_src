/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.Entries;
import com.ril.ajio.services.data.Order.RtoData$Creator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RtoData
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String created;
    private ArrayList entries;
    private String returnId;

    static {
        RtoData$Creator rtoData$Creator = new RtoData$Creator();
        CREATOR = rtoData$Creator;
    }

    public RtoData() {
        this(null, null, null, 7, null);
    }

    public RtoData(String string2, String string3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "entries");
        this.returnId = string2;
        this.created = string3;
        this.entries = arrayList;
    }

    public /* synthetic */ RtoData(String string2, String string3, ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            arrayList = new ArrayList();
        }
        this(string2, string3, arrayList);
    }

    public static /* synthetic */ RtoData copy$default(RtoData rtoData, String string2, String string3, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = rtoData.returnId;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = rtoData.created;
        }
        if ((n3 &= 4) != 0) {
            arrayList = rtoData.entries;
        }
        return rtoData.copy(string2, string3, arrayList);
    }

    public final String component1() {
        return this.returnId;
    }

    public final String component2() {
        return this.created;
    }

    public final ArrayList component3() {
        return this.entries;
    }

    public final RtoData copy(String string2, String string3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "entries");
        RtoData rtoData = new RtoData(string2, string3, arrayList);
        return rtoData;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RtoData;
        if (!bl3) {
            return false;
        }
        object = (RtoData)object;
        Object object2 = this.returnId;
        String string2 = ((RtoData)object).returnId;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.created;
        string2 = ((RtoData)object).created;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.entries;
        object = ((RtoData)object).entries;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCreated() {
        return this.created;
    }

    public final ArrayList getEntries() {
        return this.entries;
    }

    public final String getReturnId() {
        return this.returnId;
    }

    public int hashCode() {
        int n3;
        String string2 = this.returnId;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.created;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        n3 = (n3 + n4) * 31;
        return this.entries.hashCode() + n3;
    }

    public final void setCreated(String string2) {
        this.created = string2;
    }

    public final void setEntries(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.entries = arrayList;
    }

    public final void setReturnId(String string2) {
        this.returnId = string2;
    }

    public String toString() {
        CharSequence charSequence = this.returnId;
        String string2 = this.created;
        ArrayList arrayList = this.entries;
        charSequence = og_1.a("RtoData(returnId=", (String)charSequence, ", created=", string2, ", entries=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.returnId;
        parcel.writeString((String)((Object)iterator));
        iterator = this.created;
        parcel.writeString((String)((Object)iterator));
        iterator = this.entries;
        int n4 = ((ArrayList)((Object)iterator)).size();
        parcel.writeInt(n4);
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Entries entries2 = (Entries)iterator.next();
            entries2.writeToParcel(parcel, n3);
        }
    }
}

