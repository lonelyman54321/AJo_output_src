/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew$Creator;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CCComplaintAttachInfoNew
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String comments;
    private final ArrayList imageData;
    private final String incidentId;

    static {
        CCComplaintAttachInfoNew$Creator cCComplaintAttachInfoNew$Creator = new CCComplaintAttachInfoNew$Creator();
        CREATOR = cCComplaintAttachInfoNew$Creator;
    }

    public CCComplaintAttachInfoNew() {
        this(null, null, null, 7, null);
    }

    public CCComplaintAttachInfoNew(String string2, String string3, ArrayList arrayList) {
        this.incidentId = string2;
        this.comments = string3;
        this.imageData = arrayList;
    }

    public /* synthetic */ CCComplaintAttachInfoNew(String string2, String string3, ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            arrayList = null;
        }
        this(string2, string3, arrayList);
    }

    public static /* synthetic */ CCComplaintAttachInfoNew copy$default(CCComplaintAttachInfoNew cCComplaintAttachInfoNew, String string2, String string3, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cCComplaintAttachInfoNew.incidentId;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = cCComplaintAttachInfoNew.comments;
        }
        if ((n3 &= 4) != 0) {
            arrayList = cCComplaintAttachInfoNew.imageData;
        }
        return cCComplaintAttachInfoNew.copy(string2, string3, arrayList);
    }

    public final String component1() {
        return this.incidentId;
    }

    public final String component2() {
        return this.comments;
    }

    public final ArrayList component3() {
        return this.imageData;
    }

    public final CCComplaintAttachInfoNew copy(String string2, String string3, ArrayList arrayList) {
        CCComplaintAttachInfoNew cCComplaintAttachInfoNew = new CCComplaintAttachInfoNew(string2, string3, arrayList);
        return cCComplaintAttachInfoNew;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CCComplaintAttachInfoNew;
        if (!bl3) {
            return false;
        }
        object = (CCComplaintAttachInfoNew)object;
        Object object2 = this.incidentId;
        String string2 = ((CCComplaintAttachInfoNew)object).incidentId;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.comments;
        string2 = ((CCComplaintAttachInfoNew)object).comments;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.imageData;
        object = ((CCComplaintAttachInfoNew)object).imageData;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getComments() {
        return this.comments;
    }

    public final ArrayList getImageData() {
        return this.imageData;
    }

    public final String getIncidentId() {
        return this.incidentId;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.incidentId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.comments;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageData;
        if (object != null) {
            n7 = ((ArrayList)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setComments(String string2) {
        this.comments = string2;
    }

    public String toString() {
        CharSequence charSequence = this.incidentId;
        String string2 = this.comments;
        ArrayList arrayList = this.imageData;
        charSequence = og_1.a("CCComplaintAttachInfoNew(incidentId=", (String)charSequence, ", comments=", string2, ", imageData=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.incidentId;
        parcel.writeString((String)((Object)iterator));
        iterator = this.comments;
        parcel.writeString((String)((Object)iterator));
        iterator = this.imageData;
        if (iterator == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int n4 = ((ArrayList)((Object)iterator)).size();
            parcel.writeInt(n4);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                ImageData imageData = (ImageData)iterator.next();
                imageData.writeToParcel(parcel, n3);
            }
        }
    }
}

