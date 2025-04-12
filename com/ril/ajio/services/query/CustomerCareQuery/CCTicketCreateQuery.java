/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query.CustomerCareQuery;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.query.CustomerCareQuery.CCTicketCreateQuery$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CCTicketCreateQuery
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String base64String;
    private String category;
    private String comments;
    private String contentType;
    private String currentIncidentNum;
    private String description;
    private String fileName;
    private boolean incidentToReopen;
    private String leafCategory;
    private String noOfDays;
    private String orderCode;
    private String subCategory;
    private String workgroup;

    static {
        CCTicketCreateQuery$Creator cCTicketCreateQuery$Creator = new CCTicketCreateQuery$Creator();
        CREATOR = cCTicketCreateQuery$Creator;
    }

    public CCTicketCreateQuery() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
    }

    public CCTicketCreateQuery(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, boolean bl2, String string13) {
        this.orderCode = string2;
        this.category = string3;
        this.subCategory = string4;
        this.leafCategory = string5;
        this.description = string6;
        this.noOfDays = string7;
        this.workgroup = string8;
        this.base64String = string9;
        this.contentType = string10;
        this.comments = string11;
        this.fileName = string12;
        this.incidentToReopen = bl2;
        this.currentIncidentNum = string13;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ CCTicketCreateQuery(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, boolean bl2, String string12, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var40_43;
        int n4 = n3;
        int n7 = n3 & 1;
        String string13 = "";
        Object object2 = n7 != 0 ? string13 : object;
        int n8 = n4 & 2;
        Object string14 = n8 != 0 ? string13 : string2;
        int n10 = n4 & 4;
        String string15 = n10 != 0 ? string13 : string3;
        int n14 = n4 & 8;
        String string16 = n14 != 0 ? string13 : string4;
        int n15 = n4 & 0x10;
        String string17 = n15 != 0 ? string13 : string5;
        int n16 = n4 & 0x20;
        String string18 = n16 != 0 ? string13 : string6;
        int n17 = n4 & 0x40;
        String string19 = n17 != 0 ? string13 : string7;
        int n18 = n4 & 0x80;
        String string20 = n18 != 0 ? string13 : string8;
        int n19 = n4 & 0x100;
        String string21 = n19 != 0 ? string13 : string9;
        int n20 = n4 & 0x200;
        String string22 = n20 != 0 ? string13 : string10;
        int n21 = n4 & 0x400;
        String string23 = n21 != 0 ? string13 : string11;
        int bl3 = n4 & 0x800;
        if (bl3 != 0) {
            boolean bl4 = false;
        } else {
            boolean bl5 = bl2;
        }
        if ((n4 &= 0x1000) == 0) {
            string13 = string12;
        }
        object = this;
        string2 = object2;
        string3 = string14;
        string4 = string15;
        string5 = string16;
        string6 = string17;
        string7 = string18;
        string8 = string19;
        string9 = string20;
        string10 = string21;
        string11 = string22;
        this((String)object2, (String)string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, (boolean)var40_43, string13);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ CCTicketCreateQuery copy$default(CCTicketCreateQuery cCTicketCreateQuery, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, boolean bl2, String string13, int n3, Object object) {
        void var40_43;
        CCTicketCreateQuery cCTicketCreateQuery2 = cCTicketCreateQuery;
        int n4 = n3;
        int n7 = n3 & 1;
        String string14 = n7 != 0 ? cCTicketCreateQuery.orderCode : string2;
        int n8 = n4 & 2;
        String string15 = n8 != 0 ? cCTicketCreateQuery2.category : string3;
        int n10 = n4 & 4;
        String string16 = n10 != 0 ? cCTicketCreateQuery2.subCategory : string4;
        int n14 = n4 & 8;
        String string17 = n14 != 0 ? cCTicketCreateQuery2.leafCategory : string5;
        int n15 = n4 & 0x10;
        String string18 = n15 != 0 ? cCTicketCreateQuery2.description : string6;
        int n16 = n4 & 0x20;
        String string19 = n16 != 0 ? cCTicketCreateQuery2.noOfDays : string7;
        int n17 = n4 & 0x40;
        String string20 = n17 != 0 ? cCTicketCreateQuery2.workgroup : string8;
        int n18 = n4 & 0x80;
        String string21 = n18 != 0 ? cCTicketCreateQuery2.base64String : string9;
        int n19 = n4 & 0x100;
        String string22 = n19 != 0 ? cCTicketCreateQuery2.contentType : string10;
        int n20 = n4 & 0x200;
        String string23 = n20 != 0 ? cCTicketCreateQuery2.comments : string11;
        int n21 = n4 & 0x400;
        String string24 = n21 != 0 ? cCTicketCreateQuery2.fileName : string12;
        int bl3 = n4 & 0x800;
        if (bl3 != 0) {
            boolean bl4 = cCTicketCreateQuery2.incidentToReopen;
        } else {
            boolean bl5 = bl2;
        }
        String string25 = (n4 &= 0x1000) != 0 ? cCTicketCreateQuery2.currentIncidentNum : string13;
        string2 = string14;
        string3 = string15;
        string4 = string16;
        string5 = string17;
        string6 = string18;
        string7 = string19;
        string8 = string20;
        string9 = string21;
        string10 = string22;
        string11 = string23;
        string12 = string24;
        bl2 = var40_43;
        string13 = string25;
        return cCTicketCreateQuery.copy(string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, (boolean)var40_43, string25);
    }

    public final String component1() {
        return this.orderCode;
    }

    public final String component10() {
        return this.comments;
    }

    public final String component11() {
        return this.fileName;
    }

    public final boolean component12() {
        return this.incidentToReopen;
    }

    public final String component13() {
        return this.currentIncidentNum;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.subCategory;
    }

    public final String component4() {
        return this.leafCategory;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.noOfDays;
    }

    public final String component7() {
        return this.workgroup;
    }

    public final String component8() {
        return this.base64String;
    }

    public final String component9() {
        return this.contentType;
    }

    public final CCTicketCreateQuery copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, boolean bl2, String string13) {
        CCTicketCreateQuery cCTicketCreateQuery = new CCTicketCreateQuery(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, bl2, string13);
        return cCTicketCreateQuery;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CCTicketCreateQuery;
        if (!bl3) {
            return false;
        }
        object = (CCTicketCreateQuery)object;
        String string2 = this.orderCode;
        String string3 = ((CCTicketCreateQuery)object).orderCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.category;
        string3 = ((CCTicketCreateQuery)object).category;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.subCategory;
        string3 = ((CCTicketCreateQuery)object).subCategory;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.leafCategory;
        string3 = ((CCTicketCreateQuery)object).leafCategory;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.description;
        string3 = ((CCTicketCreateQuery)object).description;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.noOfDays;
        string3 = ((CCTicketCreateQuery)object).noOfDays;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.workgroup;
        string3 = ((CCTicketCreateQuery)object).workgroup;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.base64String;
        string3 = ((CCTicketCreateQuery)object).base64String;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.contentType;
        string3 = ((CCTicketCreateQuery)object).contentType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.comments;
        string3 = ((CCTicketCreateQuery)object).comments;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.fileName;
        string3 = ((CCTicketCreateQuery)object).fileName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.incidentToReopen;
        boolean bl4 = ((CCTicketCreateQuery)object).incidentToReopen;
        if (bl3 != bl4) {
            return false;
        }
        string2 = this.currentIncidentNum;
        object = ((CCTicketCreateQuery)object).currentIncidentNum;
        boolean bl5 = Intrinsics.areEqual(string2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getBase64String() {
        return this.base64String;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getComments() {
        return this.comments;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCurrentIncidentNum() {
        return this.currentIncidentNum;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getIncidentToReopen() {
        return this.incidentToReopen;
    }

    public final String getLeafCategory() {
        return this.leafCategory;
    }

    public final String getNoOfDays() {
        return this.noOfDays;
    }

    public final String getOrderCode() {
        return this.orderCode;
    }

    public final String getSubCategory() {
        return this.subCategory;
    }

    public final String getWorkgroup() {
        return this.workgroup;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.orderCode;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.category;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.subCategory;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.leafCategory;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.description;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.noOfDays;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.workgroup;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.base64String;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.contentType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.comments;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.fileName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.incidentToReopen ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        string3 = this.currentIncidentNum;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setBase64String(String string2) {
        this.base64String = string2;
    }

    public final void setCategory(String string2) {
        this.category = string2;
    }

    public final void setComments(String string2) {
        this.comments = string2;
    }

    public final void setContentType(String string2) {
        this.contentType = string2;
    }

    public final void setCurrentIncidentNum(String string2) {
        this.currentIncidentNum = string2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setFileName(String string2) {
        this.fileName = string2;
    }

    public final void setIncidentToReopen(boolean bl2) {
        this.incidentToReopen = bl2;
    }

    public final void setLeafCategory(String string2) {
        this.leafCategory = string2;
    }

    public final void setNoOfDays(String string2) {
        this.noOfDays = string2;
    }

    public final void setOrderCode(String string2) {
        this.orderCode = string2;
    }

    public final void setSubCategory(String string2) {
        this.subCategory = string2;
    }

    public final void setWorkgroup(String string2) {
        this.workgroup = string2;
    }

    public String toString() {
        Object object = this;
        String string2 = this.orderCode;
        String string3 = this.category;
        String string4 = this.subCategory;
        String string5 = this.leafCategory;
        String string6 = this.description;
        String string7 = this.noOfDays;
        String string8 = this.workgroup;
        String string9 = this.base64String;
        String string10 = this.contentType;
        String string11 = this.comments;
        String string12 = this.fileName;
        boolean bl2 = this.incidentToReopen;
        String string13 = this.currentIncidentNum;
        object = og_1.a("CCTicketCreateQuery(orderCode=", string2, ", category=", string3, ", subCategory=");
        X50.a((StringBuilder)object, string4, ", leafCategory=", string5, ", description=");
        X50.a((StringBuilder)object, string6, ", noOfDays=", string7, ", workgroup=");
        X50.a((StringBuilder)object, string8, ", base64String=", string9, ", contentType=");
        X50.a((StringBuilder)object, string10, ", comments=", string11, ", fileName=");
        ((StringBuilder)object).append(string12);
        ((StringBuilder)object).append(", incidentToReopen=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", currentIncidentNum=");
        return h30_0.a((StringBuilder)object, string13, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.orderCode;
        parcel.writeString(string2);
        string2 = this.category;
        parcel.writeString(string2);
        string2 = this.subCategory;
        parcel.writeString(string2);
        string2 = this.leafCategory;
        parcel.writeString(string2);
        string2 = this.description;
        parcel.writeString(string2);
        string2 = this.noOfDays;
        parcel.writeString(string2);
        string2 = this.workgroup;
        parcel.writeString(string2);
        string2 = this.base64String;
        parcel.writeString(string2);
        string2 = this.contentType;
        parcel.writeString(string2);
        string2 = this.comments;
        parcel.writeString(string2);
        string2 = this.fileName;
        parcel.writeString(string2);
        n3 = (int)(this.incidentToReopen ? 1 : 0);
        parcel.writeInt(n3);
        string2 = this.currentIncidentNum;
        parcel.writeString(string2);
    }
}

