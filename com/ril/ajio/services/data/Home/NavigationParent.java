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
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.Navigation;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent$Creator;
import com.ril.ajio.services.data.Home.Status;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class NavigationParent
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String altText;
    private final List childDetails;
    private final NavigationDataClass data;
    private final String link;
    private final List linkDetails;
    private final Boolean newFlag;
    private final String node;
    private final Status status;
    private final String storeId;
    private final String switchStoreUrl;
    private String switchtoStoreIcon;
    private String switchtoStoreId;
    private final String wrapAfter;

    static {
        NavigationParent$Creator navigationParent$Creator = new NavigationParent$Creator();
        CREATOR = navigationParent$Creator;
    }

    public NavigationParent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public NavigationParent(Status status, NavigationDataClass navigationDataClass, List list, List list2, String string2, String string3, String string4, Boolean bl2, String string5, String string6, String string7, String string8, String string9) {
        this.status = status;
        this.data = navigationDataClass;
        this.childDetails = list;
        this.linkDetails = list2;
        this.link = string2;
        this.node = string3;
        this.wrapAfter = string4;
        this.newFlag = bl2;
        this.storeId = string5;
        this.switchStoreUrl = string6;
        this.switchtoStoreIcon = string7;
        this.switchtoStoreId = string8;
        this.altText = string9;
    }

    public /* synthetic */ NavigationParent(Status object, NavigationDataClass object2, List object3, List list, String object4, String string2, String string3, Boolean object5, String object6, String string4, String string5, String string6, String string7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string8;
        String string9;
        String string10;
        String string11;
        Boolean bl2;
        String string12;
        String string13;
        String string14;
        List list2;
        List list3;
        NavigationDataClass navigationDataClass;
        Status status;
        int n4 = n3;
        int n7 = n3 & 1;
        String string15 = null;
        if (n7 != 0) {
            n7 = 0;
            status = null;
        } else {
            status = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            navigationDataClass = null;
        } else {
            navigationDataClass = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            list3 = null;
        } else {
            list3 = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            list2 = null;
        } else {
            list2 = list;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string14 = null;
        } else {
            string14 = object4;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string13 = null;
        } else {
            string13 = string2;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string12 = null;
        } else {
            string12 = string3;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            bl2 = null;
        } else {
            bl2 = object5;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string11 = null;
        } else {
            string11 = object6;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string10 = null;
        } else {
            string10 = string4;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string9 = null;
        } else {
            string9 = string5;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string8 = null;
        } else {
            string8 = string6;
        }
        if ((n4 &= 0x1000) == 0) {
            string15 = string7;
        }
        object = this;
        object2 = status;
        object3 = navigationDataClass;
        list = list3;
        object4 = list2;
        string2 = string14;
        string3 = string13;
        object5 = string12;
        object6 = bl2;
        string4 = string11;
        string5 = string10;
        string6 = string9;
        string7 = string8;
        this(status, navigationDataClass, list3, list2, string14, string13, string12, bl2, string11, string10, string9, string8, string15);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final List getChildDetails() {
        return this.childDetails;
    }

    public final NavigationDataClass getData() {
        return this.data;
    }

    public final String getLink() {
        return this.link;
    }

    public final List getLinkDetails() {
        return this.linkDetails;
    }

    public final Boolean getNewFlag() {
        return this.newFlag;
    }

    public final String getNode() {
        return this.node;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getStoreId() {
        return this.storeId;
    }

    public final String getSwitchStoreUrl() {
        return this.switchStoreUrl;
    }

    public final String getSwitchtoStoreIcon() {
        return this.switchtoStoreIcon;
    }

    public final String getSwitchtoStoreId() {
        return this.switchtoStoreId;
    }

    public final String getWrapAfter() {
        return this.wrapAfter;
    }

    public final void setAltText(String string2) {
        this.altText = string2;
    }

    public final void setSwitchtoStoreIcon(String string2) {
        this.switchtoStoreIcon = string2;
    }

    public final void setSwitchtoStoreId(String string2) {
        this.switchtoStoreId = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Parcelable parcelable;
        boolean bl2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.status;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((Status)object).writeToParcel(parcel, n3);
        }
        object = this.data;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((NavigationDataClass)object).writeToParcel(parcel, n3);
        }
        object = this.childDetails;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            object = oz0_2.a(parcel, (List)object, n4);
            while (bl2 = object.hasNext()) {
                parcelable = (Navigation)object.next();
                parcelable.writeToParcel(parcel, n3);
            }
        }
        object = this.linkDetails;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            object = oz0_2.a(parcel, (List)object, n4);
            while (bl2 = object.hasNext()) {
                parcelable = (LinkDetail)object.next();
                parcelable.writeToParcel(parcel, n3);
            }
        }
        Object object2 = this.link;
        parcel.writeString((String)object2);
        object2 = this.node;
        parcel.writeString((String)object2);
        object2 = this.wrapAfter;
        parcel.writeString((String)object2);
        object2 = this.newFlag;
        if (object2 == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object2);
        }
        object2 = this.storeId;
        parcel.writeString((String)object2);
        object2 = this.switchStoreUrl;
        parcel.writeString((String)object2);
        object2 = this.switchtoStoreIcon;
        parcel.writeString((String)object2);
        object2 = this.switchtoStoreId;
        parcel.writeString((String)object2);
        object2 = this.altText;
        parcel.writeString((String)object2);
    }
}

