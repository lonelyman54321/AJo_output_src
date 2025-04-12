/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnOrderTracker
implements Serializable {
    private final String activeBar;
    private ArrayList attemptList;
    private final String attemptListColor;
    private String description;
    private final Boolean isActive;
    private final Boolean isDeliveryDelayed;
    private final String mainStatusName;
    private final String milestoneTextColor;
    private final String refundInformation;
    private final String returnMessage;
    private ArrayList subStatus;
    private final String timeStamp;

    public ReturnOrderTracker(String string2, Boolean bl2, String string3, String string4, String string5, String string6, String string7, String string8, ArrayList arrayList, ArrayList arrayList2, String string9, Boolean bl3) {
        Intrinsics.checkNotNullParameter(string2, "activeBar");
        this.activeBar = string2;
        this.isActive = bl2;
        this.mainStatusName = string3;
        this.milestoneTextColor = string4;
        this.attemptListColor = string5;
        this.refundInformation = string6;
        this.returnMessage = string7;
        this.description = string8;
        this.attemptList = arrayList;
        this.subStatus = arrayList2;
        this.timeStamp = string9;
        this.isDeliveryDelayed = bl3;
    }

    public /* synthetic */ ReturnOrderTracker(String string2, Boolean serializable, String string3, String object, String string4, String string5, String string6, String string7, ArrayList object2, ArrayList object3, String object4, Boolean serializable2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int n4 = n3;
        int n7 = n3 & 2;
        Boolean bl2 = n7 != 0 ? Boolean.FALSE : serializable;
        int n8 = n4 & 4;
        String string8 = "";
        String string9 = n8 != 0 ? string8 : string3;
        int n10 = n4 & 8;
        Object object5 = n10 != 0 ? string8 : object;
        int n14 = n4 & 0x10;
        String string10 = n14 != 0 ? string8 : string4;
        int n15 = n4 & 0x20;
        String string11 = n15 != 0 ? string8 : string5;
        int n16 = n4 & 0x40;
        String string12 = n16 != 0 ? string8 : string6;
        int n17 = n4 & 0x80;
        if (n17 == 0) {
            string8 = string7;
        }
        n17 = n4 & 0x100;
        String string13 = null;
        if (n17 != 0) {
            n17 = 0;
            arrayList2 = null;
        } else {
            arrayList2 = object2;
        }
        int n18 = n4 & 0x200;
        if (n18 != 0) {
            n18 = 0;
            arrayList = null;
        } else {
            arrayList = object3;
        }
        int n19 = n4 & 0x400;
        if (n19 == 0) {
            string13 = object4;
        }
        Boolean bl3 = (n4 &= 0x800) != 0 ? Boolean.FALSE : serializable2;
        serializable = this;
        string3 = string2;
        object = bl2;
        string4 = string9;
        string5 = object5;
        string6 = string10;
        string7 = string11;
        object2 = string12;
        object3 = string8;
        object4 = arrayList2;
        serializable2 = arrayList;
        this(string2, bl2, string9, (String)object5, string10, string11, string12, string8, arrayList2, arrayList, string13, bl3);
    }

    public static /* synthetic */ ReturnOrderTracker copy$default(ReturnOrderTracker returnOrderTracker, String string2, Boolean bl2, String string3, String string4, String string5, String string6, String string7, String string8, ArrayList arrayList, ArrayList arrayList2, String string9, Boolean bl3, int n3, Object object) {
        ReturnOrderTracker returnOrderTracker2 = returnOrderTracker;
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = n7 != 0 ? returnOrderTracker.activeBar : string2;
        int n8 = n4 & 2;
        Boolean bl4 = n8 != 0 ? returnOrderTracker2.isActive : bl2;
        int n10 = n4 & 4;
        String string11 = n10 != 0 ? returnOrderTracker2.mainStatusName : string3;
        int n14 = n4 & 8;
        String string12 = n14 != 0 ? returnOrderTracker2.milestoneTextColor : string4;
        int n15 = n4 & 0x10;
        String string13 = n15 != 0 ? returnOrderTracker2.attemptListColor : string5;
        int n16 = n4 & 0x20;
        String string14 = n16 != 0 ? returnOrderTracker2.refundInformation : string6;
        int n17 = n4 & 0x40;
        String string15 = n17 != 0 ? returnOrderTracker2.returnMessage : string7;
        int n18 = n4 & 0x80;
        String string16 = n18 != 0 ? returnOrderTracker2.description : string8;
        int n19 = n4 & 0x100;
        ArrayList arrayList3 = n19 != 0 ? returnOrderTracker2.attemptList : arrayList;
        int n20 = n4 & 0x200;
        ArrayList arrayList4 = n20 != 0 ? returnOrderTracker2.subStatus : arrayList2;
        int n21 = n4 & 0x400;
        String string17 = n21 != 0 ? returnOrderTracker2.timeStamp : string9;
        Boolean bl5 = (n4 &= 0x800) != 0 ? returnOrderTracker2.isDeliveryDelayed : bl3;
        string2 = string10;
        bl2 = bl4;
        string3 = string11;
        string4 = string12;
        string5 = string13;
        string6 = string14;
        string7 = string15;
        string8 = string16;
        arrayList = arrayList3;
        arrayList2 = arrayList4;
        string9 = string17;
        bl3 = bl5;
        return returnOrderTracker.copy(string10, bl4, string11, string12, string13, string14, string15, string16, arrayList3, arrayList4, string17, bl5);
    }

    public final String component1() {
        return this.activeBar;
    }

    public final ArrayList component10() {
        return this.subStatus;
    }

    public final String component11() {
        return this.timeStamp;
    }

    public final Boolean component12() {
        return this.isDeliveryDelayed;
    }

    public final Boolean component2() {
        return this.isActive;
    }

    public final String component3() {
        return this.mainStatusName;
    }

    public final String component4() {
        return this.milestoneTextColor;
    }

    public final String component5() {
        return this.attemptListColor;
    }

    public final String component6() {
        return this.refundInformation;
    }

    public final String component7() {
        return this.returnMessage;
    }

    public final String component8() {
        return this.description;
    }

    public final ArrayList component9() {
        return this.attemptList;
    }

    public final ReturnOrderTracker copy(String string2, Boolean bl2, String string3, String string4, String string5, String string6, String string7, String string8, ArrayList arrayList, ArrayList arrayList2, String string9, Boolean bl3) {
        Intrinsics.checkNotNullParameter(string2, "activeBar");
        ReturnOrderTracker returnOrderTracker = new ReturnOrderTracker(string2, bl2, string3, string4, string5, string6, string7, string8, arrayList, arrayList2, string9, bl3);
        return returnOrderTracker;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnOrderTracker;
        if (!bl3) {
            return false;
        }
        object = (ReturnOrderTracker)object;
        Object object2 = this.activeBar;
        Object object3 = ((ReturnOrderTracker)object).activeBar;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isActive;
        object3 = ((ReturnOrderTracker)object).isActive;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mainStatusName;
        object3 = ((ReturnOrderTracker)object).mainStatusName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.milestoneTextColor;
        object3 = ((ReturnOrderTracker)object).milestoneTextColor;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.attemptListColor;
        object3 = ((ReturnOrderTracker)object).attemptListColor;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refundInformation;
        object3 = ((ReturnOrderTracker)object).refundInformation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnMessage;
        object3 = ((ReturnOrderTracker)object).returnMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        object3 = ((ReturnOrderTracker)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.attemptList;
        object3 = ((ReturnOrderTracker)object).attemptList;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subStatus;
        object3 = ((ReturnOrderTracker)object).subStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timeStamp;
        object3 = ((ReturnOrderTracker)object).timeStamp;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isDeliveryDelayed;
        object = ((ReturnOrderTracker)object).isDeliveryDelayed;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getActiveBar() {
        return this.activeBar;
    }

    public final ArrayList getAttemptList() {
        return this.attemptList;
    }

    public final String getAttemptListColor() {
        return this.attemptListColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMainStatusName() {
        return this.mainStatusName;
    }

    public final String getMilestoneTextColor() {
        return this.milestoneTextColor;
    }

    public final String getRefundInformation() {
        return this.refundInformation;
    }

    public final String getReturnMessage() {
        return this.returnMessage;
    }

    public final ArrayList getSubStatus() {
        return this.subStatus;
    }

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        int n3;
        String string2 = this.activeBar;
        int n4 = string2.hashCode() * 31;
        Object object = this.isActive;
        int n7 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mainStatusName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.milestoneTextColor;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.attemptListColor;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.refundInformation;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.description;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.attemptList;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timeStamp;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isDeliveryDelayed;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isActive() {
        return this.isActive;
    }

    public final Boolean isDeliveryDelayed() {
        return this.isDeliveryDelayed;
    }

    public final void setAttemptList(ArrayList arrayList) {
        this.attemptList = arrayList;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setSubStatus(ArrayList arrayList) {
        this.subStatus = arrayList;
    }

    public String toString() {
        String string2 = this.activeBar;
        Boolean bl2 = this.isActive;
        String string3 = this.mainStatusName;
        String string4 = this.milestoneTextColor;
        String string5 = this.attemptListColor;
        String string6 = this.refundInformation;
        String string7 = this.returnMessage;
        String string8 = this.description;
        ArrayList arrayList = this.attemptList;
        ArrayList arrayList2 = this.subStatus;
        String string9 = this.timeStamp;
        Boolean bl3 = this.isDeliveryDelayed;
        StringBuilder stringBuilder = new StringBuilder("ReturnOrderTracker(activeBar=");
        stringBuilder.append(string2);
        stringBuilder.append(", isActive=");
        stringBuilder.append(bl2);
        stringBuilder.append(", mainStatusName=");
        X50.a(stringBuilder, string3, ", milestoneTextColor=", string4, ", attemptListColor=");
        X50.a(stringBuilder, string5, ", refundInformation=", string6, ", returnMessage=");
        X50.a(stringBuilder, string7, ", description=", string8, ", attemptList=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", subStatus=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(", timeStamp=");
        stringBuilder.append(string9);
        stringBuilder.append(", isDeliveryDelayed=");
        stringBuilder.append(bl3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

