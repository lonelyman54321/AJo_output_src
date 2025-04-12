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
import com.ril.ajio.services.data.Home.CMSNavigation$Creator;
import com.ril.ajio.services.data.Home.NavImpl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CMSNavigation
implements NavImpl,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String activeAltText;
    private String activeImageUrl;
    private String activeMediaType;
    private final CMSNavigation alternateData;
    private final String aspectRatio;
    private final List childDetails;
    private String displayedUrl;
    private final String inactiveAltText;
    private String inactiveImageUrl;
    private String inactiveMediaType;
    private boolean isURLUpdated;
    private String name;
    private final Boolean newFlag;
    private String pageType;
    private String query;
    private final Integer sequence;
    private boolean switchable;
    private String url;

    static {
        CMSNavigation$Creator cMSNavigation$Creator = new CMSNavigation$Creator();
        CREATOR = cMSNavigation$Creator;
    }

    public CMSNavigation() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 262143, null);
    }

    public CMSNavigation(String string2, Boolean bl2, String string3, String string4, Integer n3, String string5, String string6, String string7, CMSNavigation cMSNavigation, String string8, List list, boolean bl3, boolean bl4, String string9, String string10, String string11, String string12, String string13) {
        Intrinsics.checkNotNullParameter(string11, "displayedUrl");
        this.name = string2;
        this.newFlag = bl2;
        this.activeImageUrl = string3;
        this.inactiveImageUrl = string4;
        this.sequence = n3;
        this.pageType = string5;
        this.url = string6;
        this.query = string7;
        this.alternateData = cMSNavigation;
        this.aspectRatio = string8;
        this.childDetails = list;
        this.isURLUpdated = bl3;
        this.switchable = bl4;
        this.inactiveMediaType = string9;
        this.activeMediaType = string10;
        this.displayedUrl = string11;
        this.activeAltText = string12;
        this.inactiveAltText = string13;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ CMSNavigation(String object, Boolean object2, String object3, String string2, Integer object4, String object5, String string3, String string4, CMSNavigation object6, String object7, List object8, boolean bl2, boolean bl3, String string5, String string6, String string7, String string8, String string9, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var44_47;
        String string10;
        String string11;
        String string12;
        String string13;
        Object list;
        Object string14;
        Object cMSNavigation;
        String string15;
        String string16;
        Object string17;
        Object n4;
        String string18;
        Object string19;
        Object string20;
        int n7 = n3;
        int n8 = n3 & 1;
        if (n8 != 0) {
            n8 = 0;
            string20 = null;
        } else {
            string20 = object;
        }
        int n10 = n7 & 2;
        Object object9 = n10 != 0 ? Boolean.FALSE : object2;
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string19 = null;
        } else {
            string19 = object3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string18 = null;
        } else {
            string18 = string2;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = -1;
            n4 = n16;
        } else {
            n4 = object4;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string17 = null;
        } else {
            string17 = object5;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            string16 = null;
        } else {
            string16 = string3;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string15 = null;
        } else {
            string15 = string4;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            cMSNavigation = null;
        } else {
            cMSNavigation = object6;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            string14 = null;
        } else {
            string14 = object7;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            list = null;
        } else {
            list = object8;
        }
        int bl4 = n7 & 0x800;
        boolean bl5 = false;
        if (bl4 != 0) {
            boolean bl6 = false;
        } else {
            boolean bl7 = bl2;
        }
        int n24 = n7 & 0x1000;
        if (n24 == 0) {
            bl5 = bl3;
        }
        n24 = n7 & 0x2000;
        if (n24 != 0) {
            n24 = 0;
            string13 = null;
        } else {
            string13 = string5;
        }
        int n25 = n7 & 0x4000;
        if (n25 != 0) {
            n25 = 0;
            string12 = null;
        } else {
            string12 = string6;
        }
        int n26 = n7 & 0x8000;
        String string21 = n26 != 0 ? "" : string7;
        int n27 = n7 & 0x10000;
        if (n27 != 0) {
            n27 = 0;
            string11 = null;
        } else {
            string11 = string8;
        }
        int n28 = 131072;
        if ((n7 &= n28) != 0) {
            n7 = 0;
            string10 = null;
        } else {
            string10 = string9;
        }
        object = this;
        object2 = string20;
        object3 = object9;
        string2 = string19;
        object4 = string18;
        object5 = n4;
        string3 = string17;
        string4 = string16;
        object6 = string15;
        object7 = cMSNavigation;
        object8 = string14;
        bl3 = var44_47;
        string6 = string13;
        string7 = string12;
        string8 = string21;
        string9 = string11;
        this((String)string20, (Boolean)object9, (String)string19, string18, (Integer)n4, (String)string17, string16, string15, (CMSNavigation)cMSNavigation, (String)string14, (List)list, (boolean)var44_47, bl5, string13, string12, string21, string11, string10);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getActiveAltText() {
        return this.activeAltText;
    }

    public final String getActiveImageUrl() {
        return this.activeImageUrl;
    }

    public final String getActiveMediaType() {
        return this.activeMediaType;
    }

    public final CMSNavigation getAlternateData() {
        return this.alternateData;
    }

    public final String getAspectRatio() {
        return this.aspectRatio;
    }

    public final List getChildDetails() {
        return this.childDetails;
    }

    public final String getDisplayedUrl() {
        return this.displayedUrl;
    }

    public final String getInactiveAltText() {
        return this.inactiveAltText;
    }

    public final String getInactiveImageUrl() {
        return this.inactiveImageUrl;
    }

    public final String getInactiveMediaType() {
        return this.inactiveMediaType;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getNewFlag() {
        return this.newFlag;
    }

    public final String getPageType() {
        return this.pageType;
    }

    public final String getQuery() {
        return this.query;
    }

    public final Integer getSequence() {
        return this.sequence;
    }

    public final boolean getSwitchable() {
        return this.switchable;
    }

    public String getThisName() {
        q42_0 q42_02 = new q42_0("An operation is not implemented: Not yet implemented");
        throw q42_02;
    }

    public String getThisParentName() {
        q42_0 q42_02 = new q42_0("An operation is not implemented: Not yet implemented");
        throw q42_02;
    }

    public final String getUrl() {
        return this.url;
    }

    public boolean isLeafNode() {
        q42_0 q42_02 = new q42_0("An operation is not implemented: Not yet implemented");
        throw q42_02;
    }

    public final boolean isURLUpdated() {
        return this.isURLUpdated;
    }

    public final void setActiveImageUrl(String string2) {
        this.activeImageUrl = string2;
    }

    public final void setActiveMediaType(String string2) {
        this.activeMediaType = string2;
    }

    public final void setDisplayedUrl(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.displayedUrl = string2;
    }

    public final void setInactiveImageUrl(String string2) {
        this.inactiveImageUrl = string2;
    }

    public final void setInactiveMediaType(String string2) {
        this.inactiveMediaType = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setPageType(String string2) {
        this.pageType = string2;
    }

    public final void setQuery(String string2) {
        this.query = string2;
    }

    public final void setSwitchable(boolean bl2) {
        this.switchable = bl2;
    }

    public final void setURLUpdated(boolean bl2) {
        this.isURLUpdated = bl2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.name;
        parcel.writeString((String)object);
        object = this.newFlag;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.activeImageUrl;
        parcel.writeString((String)object);
        object = this.inactiveImageUrl;
        parcel.writeString((String)object);
        object = this.sequence;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            int n7 = (Integer)object;
            parcel.writeInt(n7);
        }
        object = this.pageType;
        parcel.writeString((String)object);
        object = this.url;
        parcel.writeString((String)object);
        object = this.query;
        parcel.writeString((String)object);
        object = this.alternateData;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((CMSNavigation)object).writeToParcel(parcel, n3);
        }
        object = this.aspectRatio;
        parcel.writeString((String)object);
        object = this.childDetails;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                CMSNavigation cMSNavigation = (CMSNavigation)object.next();
                cMSNavigation.writeToParcel(parcel, n3);
            }
        }
        n3 = (int)(this.isURLUpdated ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.switchable ? 1 : 0);
        parcel.writeInt(n3);
        String string2 = this.inactiveMediaType;
        parcel.writeString(string2);
        string2 = this.activeMediaType;
        parcel.writeString(string2);
        string2 = this.displayedUrl;
        parcel.writeString(string2);
        string2 = this.activeAltText;
        parcel.writeString(string2);
        string2 = this.inactiveAltText;
        parcel.writeString(string2);
    }
}

