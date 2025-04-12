/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ServicabilityInfo
implements Serializable {
    private final String carrierCode;
    private final Boolean codEligible;
    private String deliverySLA;
    private String deliverySLAName;
    private final String eddLower;
    private final String eddUpper;
    private final String estimatedHandoverDate;
    private final String fulfillmentType;
    private final Boolean isGiftProduct;
    private final String nodeId;
    private ServicabilityInfo$PriorityDelivery priorityDelivery;
    private final String productCode;
    private final String promiseShippingDate;
    private final String reasonForNotServiceability;
    private final Boolean servicability;
    private final String shipmentMethod;
    private final String shippingAction;
    private final String standardDeliveryDate;

    public ServicabilityInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public ServicabilityInfo(String string2, Boolean bl2, String string3, String string4, String string5, String string6, Boolean bl3, String string7, ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery, String string8, String string9, Boolean bl4, String string10, String string11, String string12, String string13, String string14, String string15) {
        this.carrierCode = string2;
        this.codEligible = bl2;
        this.eddLower = string3;
        this.eddUpper = string4;
        this.estimatedHandoverDate = string5;
        this.fulfillmentType = string6;
        this.isGiftProduct = bl3;
        this.nodeId = string7;
        this.priorityDelivery = servicabilityInfo$PriorityDelivery;
        this.productCode = string8;
        this.promiseShippingDate = string9;
        this.servicability = bl4;
        this.shipmentMethod = string10;
        this.shippingAction = string11;
        this.reasonForNotServiceability = string12;
        this.deliverySLA = string13;
        this.deliverySLAName = string14;
        this.standardDeliveryDate = string15;
    }

    public /* synthetic */ ServicabilityInfo(String object, Boolean object2, String object3, String string2, String string3, String string4, Boolean object4, String object5, ServicabilityInfo$PriorityDelivery object6, String object7, String string5, Boolean object8, String object9, String string6, String string7, String string8, String string9, String string10, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery;
        String string19;
        String string20;
        String string21;
        String string22;
        String string23;
        String string24;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            string24 = null;
        } else {
            string24 = object;
        }
        int n8 = n4 & 2;
        Object object10 = n8 != 0 ? Boolean.FALSE : object2;
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string23 = null;
        } else {
            string23 = object3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string22 = null;
        } else {
            string22 = string2;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string21 = null;
        } else {
            string21 = string3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string20 = null;
        } else {
            string20 = string4;
        }
        int n17 = n4 & 0x40;
        Object object11 = n17 != 0 ? Boolean.FALSE : object4;
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string19 = null;
        } else {
            string19 = object5;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            servicabilityInfo$PriorityDelivery = null;
        } else {
            servicabilityInfo$PriorityDelivery = object6;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string18 = null;
        } else {
            string18 = object7;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string17 = null;
        } else {
            string17 = string5;
        }
        int n22 = n4 & 0x800;
        Object object12 = n22 != 0 ? Boolean.FALSE : object8;
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string16 = null;
        } else {
            string16 = object9;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string15 = null;
        } else {
            string15 = string6;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string14 = null;
        } else {
            string14 = string7;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            string13 = null;
        } else {
            string13 = string8;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string12 = null;
        } else {
            string12 = string9;
        }
        int n29 = 131072;
        if ((n4 &= n29) != 0) {
            n4 = 0;
            string11 = null;
        } else {
            string11 = string10;
        }
        object = this;
        object2 = string24;
        object3 = object10;
        string2 = string23;
        string3 = string22;
        string4 = string21;
        object4 = string20;
        object5 = object11;
        object6 = string19;
        object7 = servicabilityInfo$PriorityDelivery;
        string5 = string18;
        object8 = string17;
        object9 = object12;
        string6 = string16;
        string7 = string15;
        string8 = string14;
        string9 = string13;
        string10 = string12;
        this(string24, (Boolean)object10, string23, string22, string21, string20, (Boolean)object11, string19, servicabilityInfo$PriorityDelivery, string18, string17, (Boolean)object12, string16, string15, string14, string13, string12, string11);
    }

    public static /* synthetic */ ServicabilityInfo copy$default(ServicabilityInfo servicabilityInfo, String string2, Boolean bl2, String string3, String string4, String string5, String string6, Boolean bl3, String string7, ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery, String string8, String string9, Boolean bl4, String string10, String string11, String string12, String string13, String string14, String string15, int n3, Object object) {
        ServicabilityInfo servicabilityInfo2 = servicabilityInfo;
        int n4 = n3;
        int n7 = n3 & 1;
        String string16 = n7 != 0 ? servicabilityInfo.carrierCode : string2;
        int n8 = n4 & 2;
        Boolean bl5 = n8 != 0 ? servicabilityInfo2.codEligible : bl2;
        int n10 = n4 & 4;
        String string17 = n10 != 0 ? servicabilityInfo2.eddLower : string3;
        int n14 = n4 & 8;
        String string18 = n14 != 0 ? servicabilityInfo2.eddUpper : string4;
        int n15 = n4 & 0x10;
        String string19 = n15 != 0 ? servicabilityInfo2.estimatedHandoverDate : string5;
        int n16 = n4 & 0x20;
        String string20 = n16 != 0 ? servicabilityInfo2.fulfillmentType : string6;
        int n17 = n4 & 0x40;
        Boolean bl6 = n17 != 0 ? servicabilityInfo2.isGiftProduct : bl3;
        int n18 = n4 & 0x80;
        String string21 = n18 != 0 ? servicabilityInfo2.nodeId : string7;
        int n19 = n4 & 0x100;
        ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery2 = n19 != 0 ? servicabilityInfo2.priorityDelivery : servicabilityInfo$PriorityDelivery;
        int n20 = n4 & 0x200;
        String string22 = n20 != 0 ? servicabilityInfo2.productCode : string8;
        int n21 = n4 & 0x400;
        String string23 = n21 != 0 ? servicabilityInfo2.promiseShippingDate : string9;
        int n22 = n4 & 0x800;
        Boolean bl7 = n22 != 0 ? servicabilityInfo2.servicability : bl4;
        int n24 = n4 & 0x1000;
        String string24 = n24 != 0 ? servicabilityInfo2.shipmentMethod : string10;
        int n25 = n4 & 0x2000;
        String string25 = n25 != 0 ? servicabilityInfo2.shippingAction : string11;
        string11 = string25;
        n25 = n4 & 0x4000;
        string25 = n25 != 0 ? servicabilityInfo2.reasonForNotServiceability : string12;
        int n26 = n4 & 0x8000;
        string12 = string25;
        string25 = n26 != 0 ? servicabilityInfo2.deliverySLA : string13;
        n26 = n4 & 0x10000;
        string13 = string25;
        string25 = n26 != 0 ? servicabilityInfo2.deliverySLAName : string14;
        n26 = 131072;
        String string26 = (n4 &= n26) != 0 ? servicabilityInfo2.standardDeliveryDate : string15;
        string2 = string16;
        bl2 = bl5;
        string3 = string17;
        string4 = string18;
        string5 = string19;
        string6 = string20;
        bl3 = bl6;
        string7 = string21;
        servicabilityInfo$PriorityDelivery = servicabilityInfo$PriorityDelivery2;
        string8 = string22;
        string9 = string23;
        bl4 = bl7;
        string10 = string24;
        string14 = string25;
        string15 = string26;
        return servicabilityInfo.copy(string16, bl5, string17, string18, string19, string20, bl6, string21, servicabilityInfo$PriorityDelivery2, string22, string23, bl7, string24, string11, string12, string13, string25, string26);
    }

    public final String component1() {
        return this.carrierCode;
    }

    public final String component10() {
        return this.productCode;
    }

    public final String component11() {
        return this.promiseShippingDate;
    }

    public final Boolean component12() {
        return this.servicability;
    }

    public final String component13() {
        return this.shipmentMethod;
    }

    public final String component14() {
        return this.shippingAction;
    }

    public final String component15() {
        return this.reasonForNotServiceability;
    }

    public final String component16() {
        return this.deliverySLA;
    }

    public final String component17() {
        return this.deliverySLAName;
    }

    public final String component18() {
        return this.standardDeliveryDate;
    }

    public final Boolean component2() {
        return this.codEligible;
    }

    public final String component3() {
        return this.eddLower;
    }

    public final String component4() {
        return this.eddUpper;
    }

    public final String component5() {
        return this.estimatedHandoverDate;
    }

    public final String component6() {
        return this.fulfillmentType;
    }

    public final Boolean component7() {
        return this.isGiftProduct;
    }

    public final String component8() {
        return this.nodeId;
    }

    public final ServicabilityInfo$PriorityDelivery component9() {
        return this.priorityDelivery;
    }

    public final ServicabilityInfo copy(String string2, Boolean bl2, String string3, String string4, String string5, String string6, Boolean bl3, String string7, ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery, String string8, String string9, Boolean bl4, String string10, String string11, String string12, String string13, String string14, String string15) {
        ServicabilityInfo servicabilityInfo = new ServicabilityInfo(string2, bl2, string3, string4, string5, string6, bl3, string7, servicabilityInfo$PriorityDelivery, string8, string9, bl4, string10, string11, string12, string13, string14, string15);
        return servicabilityInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ServicabilityInfo;
        if (!bl3) {
            return false;
        }
        object = (ServicabilityInfo)object;
        Object object2 = this.carrierCode;
        Object object3 = ((ServicabilityInfo)object).carrierCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.codEligible;
        object3 = ((ServicabilityInfo)object).codEligible;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.eddLower;
        object3 = ((ServicabilityInfo)object).eddLower;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.eddUpper;
        object3 = ((ServicabilityInfo)object).eddUpper;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.estimatedHandoverDate;
        object3 = ((ServicabilityInfo)object).estimatedHandoverDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fulfillmentType;
        object3 = ((ServicabilityInfo)object).fulfillmentType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isGiftProduct;
        object3 = ((ServicabilityInfo)object).isGiftProduct;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.nodeId;
        object3 = ((ServicabilityInfo)object).nodeId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priorityDelivery;
        object3 = ((ServicabilityInfo)object).priorityDelivery;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productCode;
        object3 = ((ServicabilityInfo)object).productCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.promiseShippingDate;
        object3 = ((ServicabilityInfo)object).promiseShippingDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.servicability;
        object3 = ((ServicabilityInfo)object).servicability;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.shipmentMethod;
        object3 = ((ServicabilityInfo)object).shipmentMethod;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.shippingAction;
        object3 = ((ServicabilityInfo)object).shippingAction;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.reasonForNotServiceability;
        object3 = ((ServicabilityInfo)object).reasonForNotServiceability;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deliverySLA;
        object3 = ((ServicabilityInfo)object).deliverySLA;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deliverySLAName;
        object3 = ((ServicabilityInfo)object).deliverySLAName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.standardDeliveryDate;
        object = ((ServicabilityInfo)object).standardDeliveryDate;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCarrierCode() {
        return this.carrierCode;
    }

    public final Boolean getCodEligible() {
        return this.codEligible;
    }

    public final String getDeliverySLA() {
        return this.deliverySLA;
    }

    public final String getDeliverySLAName() {
        return this.deliverySLAName;
    }

    public final String getEddLower() {
        return this.eddLower;
    }

    public final String getEddUpper() {
        return this.eddUpper;
    }

    public final String getEstimatedHandoverDate() {
        return this.estimatedHandoverDate;
    }

    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final ServicabilityInfo$PriorityDelivery getPriorityDelivery() {
        return this.priorityDelivery;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getPromiseShippingDate() {
        return this.promiseShippingDate;
    }

    public final String getReasonForNotServiceability() {
        return this.reasonForNotServiceability;
    }

    public final Boolean getServicability() {
        return this.servicability;
    }

    public final String getShipmentMethod() {
        return this.shipmentMethod;
    }

    public final String getShippingAction() {
        return this.shippingAction;
    }

    public final String getStandardDeliveryDate() {
        return this.standardDeliveryDate;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.carrierCode;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.codEligible;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.eddLower;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.eddUpper;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.estimatedHandoverDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fulfillmentType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isGiftProduct;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.nodeId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priorityDelivery;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ServicabilityInfo$PriorityDelivery)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.promiseShippingDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.servicability;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.shipmentMethod;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.shippingAction;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.reasonForNotServiceability;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.deliverySLA;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.deliverySLAName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.standardDeliveryDate;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isGiftProduct() {
        return this.isGiftProduct;
    }

    public final void setDeliverySLA(String string2) {
        this.deliverySLA = string2;
    }

    public final void setDeliverySLAName(String string2) {
        this.deliverySLAName = string2;
    }

    public final void setPriorityDelivery(ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery) {
        this.priorityDelivery = servicabilityInfo$PriorityDelivery;
    }

    public String toString() {
        Serializable serializable = this;
        String string2 = this.carrierCode;
        Boolean bl2 = this.codEligible;
        String string3 = this.eddLower;
        String string4 = this.eddUpper;
        String string5 = this.estimatedHandoverDate;
        String string6 = this.fulfillmentType;
        Boolean bl3 = this.isGiftProduct;
        String string7 = this.nodeId;
        ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery = this.priorityDelivery;
        String string8 = this.productCode;
        String string9 = this.promiseShippingDate;
        Boolean bl4 = this.servicability;
        String string10 = this.shipmentMethod;
        String string11 = this.shippingAction;
        String string12 = this.reasonForNotServiceability;
        String string13 = this.deliverySLA;
        String string14 = this.deliverySLAName;
        String string15 = this.standardDeliveryDate;
        serializable = new StringBuilder("ServicabilityInfo(carrierCode=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(", codEligible=");
        ((StringBuilder)serializable).append(bl2);
        ((StringBuilder)serializable).append(", eddLower=");
        X50.a((StringBuilder)serializable, string3, ", eddUpper=", string4, ", estimatedHandoverDate=");
        X50.a((StringBuilder)serializable, string5, ", fulfillmentType=", string6, ", isGiftProduct=");
        xi0_2.a(bl3, ", nodeId=", string7, ", priorityDelivery=", (StringBuilder)serializable);
        ((StringBuilder)serializable).append(servicabilityInfo$PriorityDelivery);
        ((StringBuilder)serializable).append(", productCode=");
        ((StringBuilder)serializable).append(string8);
        ((StringBuilder)serializable).append(", promiseShippingDate=");
        vw0_1.a(bl4, string9, ", servicability=", ", shipmentMethod=", (StringBuilder)serializable);
        X50.a((StringBuilder)serializable, string10, ", shippingAction=", string11, ", reasonForNotServiceability=");
        string3 = string12;
        string4 = string13;
        X50.a((StringBuilder)serializable, string12, ", deliverySLA=", string13, ", deliverySLAName=");
        string3 = string14;
        string4 = string15;
        return ko_0.a((StringBuilder)serializable, string14, ", standardDeliveryDate=", string15, ")");
    }
}

