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
import com.ril.ajio.services.data.CustomerCare.ActionData;
import com.ril.ajio.services.data.CustomerCare.CCComplaintDetailInfo$Creator;
import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CCComplaintDetailInfo
implements Parcelable,
CCHelpInterface {
    public static final Parcelable.Creator CREATOR;
    private final String agentGroup;
    private final String category;
    private final Integer commentUpdateCounter;
    private final boolean currentIncidentReopened;
    private final Boolean disableComplaintCardAction;
    private final Integer imageUploadCounter;
    private final String incidentId;
    private final String incidentStatus;
    private final String informationalMessage;
    private final Boolean isCommentMandatory;
    private final Boolean isImageMandatory;
    private final String leafCategory;
    private final String mandatoryUploadText;
    private final Integer maxImageUploadCounter;
    private final String noOfDays;
    private final String orderCode;
    private final String productCodeForReopenedInc;
    private final List productImages;
    private final String reopenedIncidentNum;
    private final String reopenedTicketNum;
    private final long resolutionBy;
    private final long resolutionOn;
    private final String statusMessage;
    private final String subCategory;
    private final long ticketCreationDate;
    private final String ticketId;
    private final Integer totalUploadActionCounter;
    private final ArrayList userUploadActionData;

    static {
        CCComplaintDetailInfo$Creator cCComplaintDetailInfo$Creator = new CCComplaintDetailInfo$Creator();
        CREATOR = cCComplaintDetailInfo$Creator;
    }

    public CCComplaintDetailInfo(String string2, String string3, long l2, long l3, long l4, String string4, String string5, String string6, String string7, String string8, List list, boolean bl2, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, Integer n3, Boolean bl3, Boolean bl4, ArrayList arrayList, Integer n4, Integer n7, Integer n8, Boolean bl5) {
        this.incidentStatus = string2;
        this.orderCode = string3;
        this.ticketCreationDate = l2;
        this.resolutionBy = l3;
        this.resolutionOn = l4;
        this.statusMessage = string4;
        this.informationalMessage = string5;
        this.category = string6;
        this.ticketId = string7;
        this.incidentId = string8;
        this.productImages = list;
        this.currentIncidentReopened = bl2;
        this.subCategory = string9;
        this.leafCategory = string10;
        this.productCodeForReopenedInc = string11;
        this.noOfDays = string12;
        this.agentGroup = string13;
        this.reopenedIncidentNum = string14;
        this.reopenedTicketNum = string15;
        this.mandatoryUploadText = string16;
        this.maxImageUploadCounter = n3;
        this.isImageMandatory = bl3;
        this.isCommentMandatory = bl4;
        this.userUploadActionData = arrayList;
        this.imageUploadCounter = n4;
        this.commentUpdateCounter = n7;
        this.totalUploadActionCounter = n8;
        this.disableComplaintCardAction = bl5;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ CCComplaintDetailInfo copy$default(CCComplaintDetailInfo cCComplaintDetailInfo, String string2, String string3, long l2, long l3, long l4, String string4, String string5, String string6, String string7, String string8, List list, boolean bl2, String object, String object2, String object3, String object4, String object5, String object6, String object7, String object8, Integer object9, Boolean object10, Boolean object11, ArrayList object12, Integer object13, Integer object14, Integer object15, Boolean bl3, int n3, Object object16) {
        Boolean bl4;
        Object object17;
        Object object18;
        Object object19;
        Object object20;
        Object object21;
        Object object22;
        Object object23;
        Object object24;
        Object object25;
        Object object26;
        Object object27;
        Object object28;
        Object object29;
        Object object30;
        Object object31;
        void var32_30;
        CCComplaintDetailInfo cCComplaintDetailInfo2 = cCComplaintDetailInfo;
        int n4 = var32_30;
        int n7 = var32_30 & 1;
        String string9 = n7 != 0 ? cCComplaintDetailInfo.incidentStatus : string2;
        int n8 = n4 & 2;
        String string10 = n8 != 0 ? cCComplaintDetailInfo2.orderCode : string3;
        int n10 = n4 & 4;
        long l7 = n10 != 0 ? cCComplaintDetailInfo2.ticketCreationDate : l2;
        int n14 = n4 & 8;
        long l8 = n14 != 0 ? cCComplaintDetailInfo2.resolutionBy : l3;
        int n15 = n4 & 0x10;
        long l12 = n15 != 0 ? cCComplaintDetailInfo2.resolutionOn : l4;
        int n16 = n4 & 0x20;
        String string11 = n16 != 0 ? cCComplaintDetailInfo2.statusMessage : string4;
        int n17 = n4 & 0x40;
        String string12 = n17 != 0 ? cCComplaintDetailInfo2.informationalMessage : string5;
        int n18 = n4 & 0x80;
        String string13 = n18 != 0 ? cCComplaintDetailInfo2.category : string6;
        int n19 = n4 & 0x100;
        String string14 = n19 != 0 ? cCComplaintDetailInfo2.ticketId : string7;
        int n20 = n4 & 0x200;
        String string15 = n20 != 0 ? cCComplaintDetailInfo2.incidentId : string8;
        boolean bl5 = n4 & 0x400;
        Object object32 = bl5 ? cCComplaintDetailInfo2.productImages : list;
        list = object32;
        bl5 = n4 & 0x800;
        bl5 = bl5 ? (boolean)cCComplaintDetailInfo2.currentIncidentReopened : (boolean)bl2;
        boolean bl6 = bl5;
        bl5 = n4 & 0x1000;
        object32 = bl5 ? cCComplaintDetailInfo2.subCategory : object31;
        object31 = object32;
        bl5 = n4 & 0x2000;
        object32 = bl5 ? cCComplaintDetailInfo2.leafCategory : object30;
        object30 = object32;
        bl5 = n4 & 0x4000;
        object32 = bl5 ? cCComplaintDetailInfo2.productCodeForReopenedInc : object29;
        int n21 = n4 & 0x8000;
        object29 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.noOfDays : object28;
        n21 = n4 & 0x10000;
        object28 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.agentGroup : object27;
        n21 = n4 & 0x20000;
        object27 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.reopenedIncidentNum : object26;
        n21 = n4 & 0x40000;
        object26 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.reopenedTicketNum : object25;
        n21 = n4 & 0x80000;
        object25 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.mandatoryUploadText : object24;
        n21 = n4 & 0x100000;
        object24 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.maxImageUploadCounter : object23;
        n21 = n4 & 0x200000;
        object23 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.isImageMandatory : object22;
        n21 = n4 & 0x400000;
        object22 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.isCommentMandatory : object21;
        n21 = n4 & 0x800000;
        object21 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.userUploadActionData : object20;
        n21 = n4 & 0x1000000;
        object20 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.imageUploadCounter : object19;
        n21 = n4 & 0x2000000;
        object19 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.commentUpdateCounter : object18;
        n21 = n4 & 0x4000000;
        object18 = object32;
        object32 = n21 != 0 ? cCComplaintDetailInfo2.totalUploadActionCounter : object17;
        n21 = 0x8000000;
        Boolean bl7 = (n4 &= n21) != 0 ? cCComplaintDetailInfo2.disableComplaintCardAction : bl4;
        string2 = string9;
        string3 = string10;
        l2 = l7;
        l3 = l8;
        l4 = l12;
        string4 = string11;
        string5 = string12;
        string6 = string13;
        string7 = string14;
        string8 = string15;
        object17 = object32;
        bl4 = bl7;
        return cCComplaintDetailInfo.copy(string9, string10, l7, l8, l12, string11, string12, string13, string14, string15, list, bl6, (String)object31, (String)object30, (String)object29, (String)object28, (String)object27, (String)object26, (String)object25, (String)object24, (Integer)object23, (Boolean)object22, (Boolean)object21, (ArrayList)object20, (Integer)object19, (Integer)object18, (Integer)object32, bl7);
    }

    public final String component1() {
        return this.incidentStatus;
    }

    public final String component10() {
        return this.incidentId;
    }

    public final List component11() {
        return this.productImages;
    }

    public final boolean component12() {
        return this.currentIncidentReopened;
    }

    public final String component13() {
        return this.subCategory;
    }

    public final String component14() {
        return this.leafCategory;
    }

    public final String component15() {
        return this.productCodeForReopenedInc;
    }

    public final String component16() {
        return this.noOfDays;
    }

    public final String component17() {
        return this.agentGroup;
    }

    public final String component18() {
        return this.reopenedIncidentNum;
    }

    public final String component19() {
        return this.reopenedTicketNum;
    }

    public final String component2() {
        return this.orderCode;
    }

    public final String component20() {
        return this.mandatoryUploadText;
    }

    public final Integer component21() {
        return this.maxImageUploadCounter;
    }

    public final Boolean component22() {
        return this.isImageMandatory;
    }

    public final Boolean component23() {
        return this.isCommentMandatory;
    }

    public final ArrayList component24() {
        return this.userUploadActionData;
    }

    public final Integer component25() {
        return this.imageUploadCounter;
    }

    public final Integer component26() {
        return this.commentUpdateCounter;
    }

    public final Integer component27() {
        return this.totalUploadActionCounter;
    }

    public final Boolean component28() {
        return this.disableComplaintCardAction;
    }

    public final long component3() {
        return this.ticketCreationDate;
    }

    public final long component4() {
        return this.resolutionBy;
    }

    public final long component5() {
        return this.resolutionOn;
    }

    public final String component6() {
        return this.statusMessage;
    }

    public final String component7() {
        return this.informationalMessage;
    }

    public final String component8() {
        return this.category;
    }

    public final String component9() {
        return this.ticketId;
    }

    public final CCComplaintDetailInfo copy(String string2, String string3, long l2, long l3, long l4, String string4, String string5, String string6, String string7, String string8, List list, boolean bl2, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, Integer n3, Boolean bl3, Boolean bl4, ArrayList arrayList, Integer n4, Integer n7, Integer n8, Boolean bl5) {
        CCComplaintDetailInfo cCComplaintDetailInfo = new CCComplaintDetailInfo(string2, string3, l2, l3, l4, string4, string5, string6, string7, string8, list, bl2, string9, string10, string11, string12, string13, string14, string15, string16, n3, bl3, bl4, arrayList, n4, n7, n8, bl5);
        return cCComplaintDetailInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof CCComplaintDetailInfo;
        if (!object2) {
            return false;
        }
        object = (CCComplaintDetailInfo)object;
        Object object3 = this.incidentStatus;
        Object object4 = ((CCComplaintDetailInfo)object).incidentStatus;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.orderCode;
        object4 = ((CCComplaintDetailInfo)object).orderCode;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        long l2 = this.ticketCreationDate;
        long l3 = ((CCComplaintDetailInfo)object).ticketCreationDate;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.resolutionBy;
        l3 = ((CCComplaintDetailInfo)object).resolutionBy;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.resolutionOn;
        l3 = ((CCComplaintDetailInfo)object).resolutionOn;
        long l8 = l2 - l3;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object3 = this.statusMessage;
        object4 = ((CCComplaintDetailInfo)object).statusMessage;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.informationalMessage;
        object4 = ((CCComplaintDetailInfo)object).informationalMessage;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.category;
        object4 = ((CCComplaintDetailInfo)object).category;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.ticketId;
        object4 = ((CCComplaintDetailInfo)object).ticketId;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.incidentId;
        object4 = ((CCComplaintDetailInfo)object).incidentId;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.productImages;
        object4 = ((CCComplaintDetailInfo)object).productImages;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object2 = this.currentIncidentReopened;
        boolean bl3 = ((CCComplaintDetailInfo)object).currentIncidentReopened;
        if (object2 != bl3) {
            return false;
        }
        object3 = this.subCategory;
        object4 = ((CCComplaintDetailInfo)object).subCategory;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.leafCategory;
        object4 = ((CCComplaintDetailInfo)object).leafCategory;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.productCodeForReopenedInc;
        object4 = ((CCComplaintDetailInfo)object).productCodeForReopenedInc;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.noOfDays;
        object4 = ((CCComplaintDetailInfo)object).noOfDays;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.agentGroup;
        object4 = ((CCComplaintDetailInfo)object).agentGroup;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.reopenedIncidentNum;
        object4 = ((CCComplaintDetailInfo)object).reopenedIncidentNum;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.reopenedTicketNum;
        object4 = ((CCComplaintDetailInfo)object).reopenedTicketNum;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.mandatoryUploadText;
        object4 = ((CCComplaintDetailInfo)object).mandatoryUploadText;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.maxImageUploadCounter;
        object4 = ((CCComplaintDetailInfo)object).maxImageUploadCounter;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.isImageMandatory;
        object4 = ((CCComplaintDetailInfo)object).isImageMandatory;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.isCommentMandatory;
        object4 = ((CCComplaintDetailInfo)object).isCommentMandatory;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.userUploadActionData;
        object4 = ((CCComplaintDetailInfo)object).userUploadActionData;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.imageUploadCounter;
        object4 = ((CCComplaintDetailInfo)object).imageUploadCounter;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.commentUpdateCounter;
        object4 = ((CCComplaintDetailInfo)object).commentUpdateCounter;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.totalUploadActionCounter;
        object4 = ((CCComplaintDetailInfo)object).totalUploadActionCounter;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.disableComplaintCardAction;
        object = ((CCComplaintDetailInfo)object).disableComplaintCardAction;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAgentGroup() {
        return this.agentGroup;
    }

    public final String getCategory() {
        return this.category;
    }

    public final Integer getCommentUpdateCounter() {
        return this.commentUpdateCounter;
    }

    public final boolean getCurrentIncidentReopened() {
        return this.currentIncidentReopened;
    }

    public final Boolean getDisableComplaintCardAction() {
        return this.disableComplaintCardAction;
    }

    public final Integer getImageUploadCounter() {
        return this.imageUploadCounter;
    }

    public final String getIncidentId() {
        return this.incidentId;
    }

    public final String getIncidentStatus() {
        return this.incidentStatus;
    }

    public final String getInformationalMessage() {
        return this.informationalMessage;
    }

    public final String getLeafCategory() {
        return this.leafCategory;
    }

    public final String getMandatoryUploadText() {
        return this.mandatoryUploadText;
    }

    public final Integer getMaxImageUploadCounter() {
        return this.maxImageUploadCounter;
    }

    public final String getNoOfDays() {
        return this.noOfDays;
    }

    public final String getOrderCode() {
        return this.orderCode;
    }

    public final String getProductCodeForReopenedInc() {
        return this.productCodeForReopenedInc;
    }

    public final List getProductImages() {
        return this.productImages;
    }

    public final String getReopenedIncidentNum() {
        return this.reopenedIncidentNum;
    }

    public final String getReopenedTicketNum() {
        return this.reopenedTicketNum;
    }

    public final long getResolutionBy() {
        return this.resolutionBy;
    }

    public final long getResolutionOn() {
        return this.resolutionOn;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final String getSubCategory() {
        return this.subCategory;
    }

    public final long getTicketCreationDate() {
        return this.ticketCreationDate;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final Integer getTotalUploadActionCounter() {
        return this.totalUploadActionCounter;
    }

    public final ArrayList getUserUploadActionData() {
        return this.userUploadActionData;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.incidentStatus;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.orderCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        long l2 = this.ticketCreationDate;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^ l3);
        n4 = (n4 + n10) * 31;
        l2 = this.resolutionBy;
        l3 = l2 >>> n8;
        n10 = (int)(l2 ^ l3);
        n4 = (n4 + n10) * 31;
        l2 = this.resolutionOn;
        long l4 = l2 >>> n8;
        n10 = (int)(l2 ^= l4);
        n4 = (n4 + n10) * 31;
        object = this.statusMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.informationalMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.category;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ticketId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.incidentId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productImages;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.currentIncidentReopened ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.subCategory;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.leafCategory;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productCodeForReopenedInc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.noOfDays;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.agentGroup;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reopenedIncidentNum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reopenedTicketNum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mandatoryUploadText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.maxImageUploadCounter;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isImageMandatory;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isCommentMandatory;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.userUploadActionData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageUploadCounter;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.commentUpdateCounter;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalUploadActionCounter;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.disableComplaintCardAction;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isCommentMandatory() {
        return this.isCommentMandatory;
    }

    public final Boolean isImageMandatory() {
        return this.isImageMandatory;
    }

    public String toString() {
        Serializable serializable = this;
        Object object = this.incidentStatus;
        String string2 = this.orderCode;
        long l2 = this.ticketCreationDate;
        long l3 = this.resolutionBy;
        long l4 = this.resolutionOn;
        String string3 = this.statusMessage;
        String string4 = this.informationalMessage;
        String string5 = this.category;
        String string6 = this.ticketId;
        String string7 = this.incidentId;
        List list = this.productImages;
        boolean bl2 = this.currentIncidentReopened;
        String string8 = this.subCategory;
        String string9 = this.leafCategory;
        String string10 = this.productCodeForReopenedInc;
        String string11 = this.noOfDays;
        String string12 = this.agentGroup;
        String string13 = this.reopenedIncidentNum;
        String string14 = this.reopenedTicketNum;
        String string15 = this.mandatoryUploadText;
        Integer n3 = this.maxImageUploadCounter;
        Boolean bl3 = this.isImageMandatory;
        Boolean bl4 = this.isCommentMandatory;
        ArrayList arrayList = this.userUploadActionData;
        Integer n4 = this.imageUploadCounter;
        Integer n7 = this.commentUpdateCounter;
        Integer n8 = this.totalUploadActionCounter;
        Boolean bl5 = this.disableComplaintCardAction;
        serializable = og_1.a("CCComplaintDetailInfo(incidentStatus=", (String)object, ", orderCode=", string2, ", ticketCreationDate=");
        ((StringBuilder)serializable).append(l2);
        fn0_2.b((StringBuilder)serializable, ", resolutionBy=", l3, ", resolutionOn=");
        ((StringBuilder)serializable).append(l4);
        ((StringBuilder)serializable).append(", statusMessage=");
        ((StringBuilder)serializable).append(string3);
        X50.a((StringBuilder)serializable, ", informationalMessage=", string4, ", category=", string5);
        X50.a((StringBuilder)serializable, ", ticketId=", string6, ", incidentId=", string7);
        ((StringBuilder)serializable).append(", productImages=");
        object = list;
        ((StringBuilder)serializable).append(list);
        ((StringBuilder)serializable).append(", currentIncidentReopened=");
        ((StringBuilder)serializable).append(bl2);
        X50.a((StringBuilder)serializable, ", subCategory=", string8, ", leafCategory=", string9);
        X50.a((StringBuilder)serializable, ", productCodeForReopenedInc=", string10, ", noOfDays=", string11);
        X50.a((StringBuilder)serializable, ", agentGroup=", string12, ", reopenedIncidentNum=", string13);
        X50.a((StringBuilder)serializable, ", reopenedTicketNum=", string14, ", mandatoryUploadText=", string15);
        ((StringBuilder)serializable).append(", maxImageUploadCounter=");
        object = n3;
        ((StringBuilder)serializable).append(n3);
        ((StringBuilder)serializable).append(", isImageMandatory=");
        object = bl3;
        ((StringBuilder)serializable).append(bl3);
        ((StringBuilder)serializable).append(", isCommentMandatory=");
        object = bl4;
        ((StringBuilder)serializable).append(bl4);
        ((StringBuilder)serializable).append(", userUploadActionData=");
        object = arrayList;
        ((StringBuilder)serializable).append(arrayList);
        ((StringBuilder)serializable).append(", imageUploadCounter=");
        object = n4;
        ((StringBuilder)serializable).append(n4);
        ((StringBuilder)serializable).append(", commentUpdateCounter=");
        object = n7;
        ((StringBuilder)serializable).append(n7);
        ((StringBuilder)serializable).append(", totalUploadActionCounter=");
        object = n8;
        ((StringBuilder)serializable).append(n8);
        ((StringBuilder)serializable).append(", disableComplaintCardAction=");
        object = bl5;
        ((StringBuilder)serializable).append(bl5);
        ((StringBuilder)serializable).append(")");
        return ((StringBuilder)serializable).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.incidentStatus;
        parcel.writeString((String)((Object)iterator));
        iterator = this.orderCode;
        parcel.writeString((String)((Object)iterator));
        long l2 = this.ticketCreationDate;
        parcel.writeLong(l2);
        l2 = this.resolutionBy;
        parcel.writeLong(l2);
        l2 = this.resolutionOn;
        parcel.writeLong(l2);
        iterator = this.statusMessage;
        parcel.writeString((String)((Object)iterator));
        iterator = this.informationalMessage;
        parcel.writeString((String)((Object)iterator));
        iterator = this.category;
        parcel.writeString((String)((Object)iterator));
        iterator = this.ticketId;
        parcel.writeString((String)((Object)iterator));
        iterator = this.incidentId;
        parcel.writeString((String)((Object)iterator));
        iterator = this.productImages;
        parcel.writeStringList((List)((Object)iterator));
        int n4 = this.currentIncidentReopened;
        parcel.writeInt(n4);
        iterator = this.subCategory;
        parcel.writeString((String)((Object)iterator));
        iterator = this.leafCategory;
        parcel.writeString((String)((Object)iterator));
        iterator = this.productCodeForReopenedInc;
        parcel.writeString((String)((Object)iterator));
        iterator = this.noOfDays;
        parcel.writeString((String)((Object)iterator));
        iterator = this.agentGroup;
        parcel.writeString((String)((Object)iterator));
        iterator = this.reopenedIncidentNum;
        parcel.writeString((String)((Object)iterator));
        iterator = this.reopenedTicketNum;
        parcel.writeString((String)((Object)iterator));
        iterator = this.mandatoryUploadText;
        parcel.writeString((String)((Object)iterator));
        iterator = this.maxImageUploadCounter;
        int n7 = 1;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            int n8 = (Integer)((Object)iterator);
            parcel.writeInt(n8);
        }
        iterator = this.isImageMandatory;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n7, (Boolean)((Object)iterator));
        }
        iterator = this.isCommentMandatory;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n7, (Boolean)((Object)iterator));
        }
        iterator = this.userUploadActionData;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            int n10 = ((ArrayList)((Object)iterator)).size();
            parcel.writeInt(n10);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n10 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                ActionData actionData = (ActionData)iterator.next();
                actionData.writeToParcel(parcel, n3);
            }
        }
        Constable constable = this.imageUploadCounter;
        if (constable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            n3 = constable;
            parcel.writeInt(n3);
        }
        constable = this.commentUpdateCounter;
        if (constable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            n3 = constable;
            parcel.writeInt(n3);
        }
        constable = this.totalUploadActionCounter;
        if (constable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n7);
            n3 = constable;
            parcel.writeInt(n3);
        }
        constable = this.disableComplaintCardAction;
        if (constable == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n7, (Boolean)constable);
        }
    }
}

