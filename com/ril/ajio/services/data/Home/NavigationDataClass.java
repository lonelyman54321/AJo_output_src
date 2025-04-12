/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavigationDataClass$Creator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class NavigationDataClass
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String aspectRatio;
    private final List childDetails;

    static {
        NavigationDataClass$Creator navigationDataClass$Creator = new NavigationDataClass$Creator();
        CREATOR = navigationDataClass$Creator;
    }

    public NavigationDataClass() {
        this(null, null, 3, null);
    }

    public NavigationDataClass(String string2, List list) {
        this.aspectRatio = string2;
        this.childDetails = list;
    }

    public /* synthetic */ NavigationDataClass(String string2, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            list = null;
        }
        this(string2, list);
    }

    public static /* synthetic */ NavigationDataClass copy$default(NavigationDataClass navigationDataClass, String string2, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = navigationDataClass.aspectRatio;
        }
        if ((n3 &= 2) != 0) {
            list = navigationDataClass.childDetails;
        }
        return navigationDataClass.copy(string2, list);
    }

    public final String component1() {
        return this.aspectRatio;
    }

    public final List component2() {
        return this.childDetails;
    }

    public final NavigationDataClass copy(String string2, List list) {
        NavigationDataClass navigationDataClass = new NavigationDataClass(string2, list);
        return navigationDataClass;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof NavigationDataClass;
        if (!bl3) {
            return false;
        }
        object = (NavigationDataClass)object;
        Object object2 = this.aspectRatio;
        String string2 = ((NavigationDataClass)object).aspectRatio;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.childDetails;
        object = ((NavigationDataClass)object).childDetails;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAspectRatio() {
        return this.aspectRatio;
    }

    public final List getChildDetails() {
        return this.childDetails;
    }

    public int hashCode() {
        int n3;
        String string2 = this.aspectRatio;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        List list = this.childDetails;
        if (list != null) {
            n4 = ((Object)list).hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.aspectRatio;
        List list = this.childDetails;
        StringBuilder stringBuilder = new StringBuilder("NavigationDataClass(aspectRatio=");
        stringBuilder.append(string2);
        stringBuilder.append(", childDetails=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.aspectRatio;
        parcel.writeString((String)object);
        object = this.childDetails;
        if (object == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                CMSNavigation cMSNavigation = (CMSNavigation)object.next();
                cMSNavigation.writeToParcel(parcel, n3);
            }
        }
    }
}

