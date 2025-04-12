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
import com.ril.ajio.services.data.Order.NextStepsSection$Creator;
import com.ril.ajio.services.data.Order.SubStatusMessage;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class NextStepsSection
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final String description;
    private final String subStatusHeader;
    private final List subStatusMessageList;
    private final String title;

    static {
        NextStepsSection$Creator nextStepsSection$Creator = new NextStepsSection$Creator();
        CREATOR = nextStepsSection$Creator;
    }

    public NextStepsSection(String string2, String string3, List list, String string4) {
        this.description = string2;
        this.subStatusHeader = string3;
        this.subStatusMessageList = list;
        this.title = string4;
    }

    public static /* synthetic */ NextStepsSection copy$default(NextStepsSection nextStepsSection, String string2, String string3, List list, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = nextStepsSection.description;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = nextStepsSection.subStatusHeader;
        }
        if ((n4 = n3 & 4) != 0) {
            list = nextStepsSection.subStatusMessageList;
        }
        if ((n3 &= 8) != 0) {
            string4 = nextStepsSection.title;
        }
        return nextStepsSection.copy(string2, string3, list, string4);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.subStatusHeader;
    }

    public final List component3() {
        return this.subStatusMessageList;
    }

    public final String component4() {
        return this.title;
    }

    public final NextStepsSection copy(String string2, String string3, List list, String string4) {
        NextStepsSection nextStepsSection = new NextStepsSection(string2, string3, list, string4);
        return nextStepsSection;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof NextStepsSection;
        if (!bl3) {
            return false;
        }
        object = (NextStepsSection)object;
        Object object2 = this.description;
        Object object3 = ((NextStepsSection)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subStatusHeader;
        object3 = ((NextStepsSection)object).subStatusHeader;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subStatusMessageList;
        object3 = ((NextStepsSection)object).subStatusMessageList;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.title;
        object = ((NextStepsSection)object).title;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSubStatusHeader() {
        return this.subStatusHeader;
    }

    public final List getSubStatusMessageList() {
        return this.subStatusMessageList;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.description;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.subStatusHeader;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subStatusMessageList;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.title;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.description;
        String string2 = this.subStatusHeader;
        List list = this.subStatusMessageList;
        String string3 = this.title;
        charSequence = og_1.a("NextStepsSection(description=", (String)charSequence, ", subStatusHeader=", string2, ", subStatusMessageList=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", title=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.description;
        parcel.writeString((String)object);
        object = this.subStatusHeader;
        parcel.writeString((String)object);
        object = this.subStatusMessageList;
        if (object == null) {
            n3 = 0;
            string2 = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                SubStatusMessage subStatusMessage = (SubStatusMessage)object.next();
                subStatusMessage.writeToParcel(parcel, n3);
            }
        }
        string2 = this.title;
        parcel.writeString(string2);
    }
}

