/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CancelledRefundDetailInfo;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.user.AffiliateData;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SelectedOrderItem {
    private AffiliateData affiliateData;
    private HashMap allGifts;
    private ArrayList allProducts;
    private CancelledRefundDetailInfo cancelledRefundDetails;
    private CartDeliveryAddress cartDeliveryAddress;
    private CartEntry cartEntry;
    private Consignment consignment;
    private Boolean exchangeReturnRTO;
    private ArrayList forwardOrderRevampOrderTrackerSection;
    private String forwardPacketNumber;
    private Boolean isExchangeOrder;
    private Boolean isReturnableExchangeable;
    private Boolean isViewExchangeAvailable;
    private ArrayList listOfGiftProducts;
    private OrderDetailLineItem orderDetailLineItem;
    private String orderStatus;
    private ArrayList otherProducts;
    private CartEntry parentConsignmentEntry;
    private Integer quantity;
    private String rawEntryStatus;
    private String returnId;
    private String status;

    public SelectedOrderItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FFFFF, null);
    }

    public SelectedOrderItem(Consignment consignment, OrderDetailLineItem orderDetailLineItem, CartEntry cartEntry, String string2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Boolean bl2, Boolean bl3, CartEntry cartEntry2, CartDeliveryAddress cartDeliveryAddress, String string3, String string4, Integer n3, String string5, CancelledRefundDetailInfo cancelledRefundDetailInfo, Boolean bl4, Boolean bl5, AffiliateData affiliateData, String string6, ArrayList arrayList4, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "allGifts");
        this.consignment = consignment;
        this.orderDetailLineItem = orderDetailLineItem;
        this.cartEntry = cartEntry;
        this.orderStatus = string2;
        this.otherProducts = arrayList;
        this.allProducts = arrayList2;
        this.forwardOrderRevampOrderTrackerSection = arrayList3;
        this.isReturnableExchangeable = bl2;
        this.isViewExchangeAvailable = bl3;
        this.parentConsignmentEntry = cartEntry2;
        this.cartDeliveryAddress = cartDeliveryAddress;
        this.returnId = string3;
        this.status = string4;
        this.quantity = n3;
        this.forwardPacketNumber = string5;
        this.cancelledRefundDetails = cancelledRefundDetailInfo;
        this.exchangeReturnRTO = bl4;
        this.isExchangeOrder = bl5;
        this.affiliateData = affiliateData;
        this.rawEntryStatus = string6;
        this.listOfGiftProducts = arrayList4;
        this.allGifts = hashMap;
    }

    public /* synthetic */ SelectedOrderItem(Consignment object, OrderDetailLineItem serializable, CartEntry serializable2, String object2, ArrayList object3, ArrayList arrayList, ArrayList arrayList2, Boolean serializable3, Boolean bl2, CartEntry comparable, CartDeliveryAddress serializable4, String object4, String string2, Integer object5, String object6, CancelledRefundDetailInfo object7, Boolean object8, Boolean bl3, AffiliateData serializable5, String object9, ArrayList object10, HashMap cloneable, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        ArrayList arrayList3;
        String string3;
        AffiliateData affiliateData;
        CancelledRefundDetailInfo cancelledRefundDetailInfo;
        String string4;
        Integer n4;
        String string5;
        String string6;
        CartDeliveryAddress cartDeliveryAddress;
        CartEntry cartEntry;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String string7;
        CartEntry cartEntry2;
        OrderDetailLineItem orderDetailLineItem;
        Consignment consignment;
        int n7 = n3;
        int n8 = n3 & 1;
        if (n8 != 0) {
            n8 = 0;
            consignment = null;
        } else {
            consignment = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            orderDetailLineItem = null;
        } else {
            orderDetailLineItem = serializable;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            cartEntry2 = null;
        } else {
            cartEntry2 = serializable2;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string7 = null;
        } else {
            string7 = object2;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            arrayList6 = null;
        } else {
            arrayList6 = object3;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            arrayList5 = null;
        } else {
            arrayList5 = arrayList;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            arrayList4 = null;
        } else {
            arrayList4 = arrayList2;
        }
        int n19 = n7 & 0x80;
        Boolean bl4 = n19 != 0 ? Boolean.FALSE : serializable3;
        int n20 = n7 & 0x100;
        Boolean bl5 = n20 != 0 ? Boolean.FALSE : bl2;
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            cartEntry = null;
        } else {
            cartEntry = comparable;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            cartDeliveryAddress = null;
        } else {
            cartDeliveryAddress = serializable4;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            string6 = null;
        } else {
            string6 = object4;
        }
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            string5 = null;
        } else {
            string5 = string2;
        }
        int n26 = n7 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            n4 = null;
        } else {
            n4 = object5;
        }
        int n27 = n7 & 0x4000;
        if (n27 != 0) {
            n27 = 0;
            string4 = null;
        } else {
            string4 = object6;
        }
        int n28 = n7 & 0x8000;
        if (n28 != 0) {
            n28 = 0;
            cancelledRefundDetailInfo = null;
        } else {
            cancelledRefundDetailInfo = object7;
        }
        int n29 = n7 & 0x10000;
        Object object11 = n29 != 0 ? Boolean.FALSE : object8;
        int n30 = n7 & 0x20000;
        Boolean bl6 = n30 != 0 ? Boolean.FALSE : bl3;
        int n32 = n7 & 0x40000;
        if (n32 != 0) {
            n32 = 0;
            affiliateData = null;
        } else {
            affiliateData = serializable5;
        }
        int n34 = n7 & 0x80000;
        if (n34 != 0) {
            n34 = 0;
            string3 = null;
        } else {
            string3 = object9;
        }
        int n35 = n7 & 0x100000;
        if (n35 != 0) {
            n35 = 0;
            arrayList3 = null;
        } else {
            arrayList3 = object10;
        }
        int n36 = 0x200000;
        HashMap hashMap = (n7 &= n36) != 0 ? new HashMap() : cloneable;
        object = this;
        serializable = consignment;
        serializable2 = orderDetailLineItem;
        object2 = cartEntry2;
        object3 = string7;
        arrayList = arrayList6;
        arrayList2 = arrayList5;
        serializable3 = arrayList4;
        bl2 = bl4;
        comparable = bl5;
        serializable4 = cartEntry;
        object4 = cartDeliveryAddress;
        string2 = string6;
        object5 = string5;
        object6 = n4;
        object7 = string4;
        object8 = cancelledRefundDetailInfo;
        bl3 = object11;
        serializable5 = bl6;
        object9 = affiliateData;
        object10 = string3;
        cloneable = arrayList3;
        this(consignment, orderDetailLineItem, cartEntry2, string7, arrayList6, arrayList5, arrayList4, bl4, bl5, cartEntry, cartDeliveryAddress, string6, string5, n4, string4, cancelledRefundDetailInfo, (Boolean)object11, bl6, affiliateData, string3, arrayList3, hashMap);
    }

    public static /* synthetic */ SelectedOrderItem copy$default(SelectedOrderItem selectedOrderItem, Consignment consignment, OrderDetailLineItem orderDetailLineItem, CartEntry cartEntry, String string2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Boolean bl2, Boolean bl3, CartEntry cartEntry2, CartDeliveryAddress cartDeliveryAddress, String string3, String string4, Integer n3, String object, CancelledRefundDetailInfo object2, Boolean object3, Boolean object4, AffiliateData object5, String object6, ArrayList object7, HashMap hashMap, int n4, Object object8) {
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        int n7 = n4;
        int n8 = n4 & 1;
        Consignment consignment2 = n8 != 0 ? selectedOrderItem.consignment : consignment;
        int n10 = n7 & 2;
        OrderDetailLineItem orderDetailLineItem2 = n10 != 0 ? selectedOrderItem2.orderDetailLineItem : orderDetailLineItem;
        int n14 = n7 & 4;
        CartEntry cartEntry3 = n14 != 0 ? selectedOrderItem2.cartEntry : cartEntry;
        int n15 = n7 & 8;
        String string5 = n15 != 0 ? selectedOrderItem2.orderStatus : string2;
        int n16 = n7 & 0x10;
        ArrayList arrayList4 = n16 != 0 ? selectedOrderItem2.otherProducts : arrayList;
        int n17 = n7 & 0x20;
        ArrayList arrayList5 = n17 != 0 ? selectedOrderItem2.allProducts : arrayList2;
        int n18 = n7 & 0x40;
        ArrayList arrayList6 = n18 != 0 ? selectedOrderItem2.forwardOrderRevampOrderTrackerSection : arrayList3;
        int n19 = n7 & 0x80;
        Boolean bl4 = n19 != 0 ? selectedOrderItem2.isReturnableExchangeable : bl2;
        int n20 = n7 & 0x100;
        Boolean bl5 = n20 != 0 ? selectedOrderItem2.isViewExchangeAvailable : bl3;
        int n21 = n7 & 0x200;
        CartEntry cartEntry4 = n21 != 0 ? selectedOrderItem2.parentConsignmentEntry : cartEntry2;
        int n22 = n7 & 0x400;
        CartDeliveryAddress cartDeliveryAddress2 = n22 != 0 ? selectedOrderItem2.cartDeliveryAddress : cartDeliveryAddress;
        int n24 = n7 & 0x800;
        String string6 = n24 != 0 ? selectedOrderItem2.returnId : string3;
        int n25 = n7 & 0x1000;
        String string7 = n25 != 0 ? selectedOrderItem2.status : string4;
        int n26 = n7 & 0x2000;
        Object object9 = n26 != 0 ? selectedOrderItem2.quantity : n3;
        n3 = object9;
        n26 = n7 & 0x4000;
        object9 = n26 != 0 ? selectedOrderItem2.forwardPacketNumber : object;
        int n27 = n7 & 0x8000;
        object = object9;
        object9 = n27 != 0 ? selectedOrderItem2.cancelledRefundDetails : object2;
        n27 = n7 & 0x10000;
        object2 = object9;
        object9 = n27 != 0 ? selectedOrderItem2.exchangeReturnRTO : object3;
        n27 = n7 & 0x20000;
        object3 = object9;
        object9 = n27 != 0 ? selectedOrderItem2.isExchangeOrder : object4;
        n27 = n7 & 0x40000;
        object4 = object9;
        object9 = n27 != 0 ? selectedOrderItem2.affiliateData : object5;
        n27 = n7 & 0x80000;
        object5 = object9;
        object9 = n27 != 0 ? selectedOrderItem2.rawEntryStatus : object6;
        n27 = n7 & 0x100000;
        object6 = object9;
        object9 = n27 != 0 ? selectedOrderItem2.listOfGiftProducts : object7;
        n27 = 0x200000;
        HashMap hashMap2 = (n7 &= n27) != 0 ? selectedOrderItem2.allGifts : hashMap;
        consignment = consignment2;
        orderDetailLineItem = orderDetailLineItem2;
        cartEntry = cartEntry3;
        string2 = string5;
        arrayList = arrayList4;
        arrayList2 = arrayList5;
        arrayList3 = arrayList6;
        bl2 = bl4;
        bl3 = bl5;
        cartEntry2 = cartEntry4;
        cartDeliveryAddress = cartDeliveryAddress2;
        string3 = string6;
        string4 = string7;
        object7 = object9;
        hashMap = hashMap2;
        return selectedOrderItem.copy(consignment2, orderDetailLineItem2, cartEntry3, string5, arrayList4, arrayList5, arrayList6, bl4, bl5, cartEntry4, cartDeliveryAddress2, string6, string7, n3, (String)object, (CancelledRefundDetailInfo)object2, (Boolean)object3, (Boolean)object4, (AffiliateData)object5, (String)object6, (ArrayList)object9, hashMap2);
    }

    public final Consignment component1() {
        return this.consignment;
    }

    public final CartEntry component10() {
        return this.parentConsignmentEntry;
    }

    public final CartDeliveryAddress component11() {
        return this.cartDeliveryAddress;
    }

    public final String component12() {
        return this.returnId;
    }

    public final String component13() {
        return this.status;
    }

    public final Integer component14() {
        return this.quantity;
    }

    public final String component15() {
        return this.forwardPacketNumber;
    }

    public final CancelledRefundDetailInfo component16() {
        return this.cancelledRefundDetails;
    }

    public final Boolean component17() {
        return this.exchangeReturnRTO;
    }

    public final Boolean component18() {
        return this.isExchangeOrder;
    }

    public final AffiliateData component19() {
        return this.affiliateData;
    }

    public final OrderDetailLineItem component2() {
        return this.orderDetailLineItem;
    }

    public final String component20() {
        return this.rawEntryStatus;
    }

    public final ArrayList component21() {
        return this.listOfGiftProducts;
    }

    public final HashMap component22() {
        return this.allGifts;
    }

    public final CartEntry component3() {
        return this.cartEntry;
    }

    public final String component4() {
        return this.orderStatus;
    }

    public final ArrayList component5() {
        return this.otherProducts;
    }

    public final ArrayList component6() {
        return this.allProducts;
    }

    public final ArrayList component7() {
        return this.forwardOrderRevampOrderTrackerSection;
    }

    public final Boolean component8() {
        return this.isReturnableExchangeable;
    }

    public final Boolean component9() {
        return this.isViewExchangeAvailable;
    }

    public final SelectedOrderItem copy(Consignment consignment, OrderDetailLineItem orderDetailLineItem, CartEntry cartEntry, String string2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Boolean bl2, Boolean bl3, CartEntry cartEntry2, CartDeliveryAddress cartDeliveryAddress, String string3, String string4, Integer n3, String string5, CancelledRefundDetailInfo cancelledRefundDetailInfo, Boolean bl4, Boolean bl5, AffiliateData affiliateData, String string6, ArrayList arrayList4, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "allGifts");
        SelectedOrderItem selectedOrderItem = new SelectedOrderItem(consignment, orderDetailLineItem, cartEntry, string2, arrayList, arrayList2, arrayList3, bl2, bl3, cartEntry2, cartDeliveryAddress, string3, string4, n3, string5, cancelledRefundDetailInfo, bl4, bl5, affiliateData, string6, arrayList4, hashMap);
        return selectedOrderItem;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SelectedOrderItem;
        if (!bl3) {
            return false;
        }
        object = (SelectedOrderItem)object;
        Object object2 = this.consignment;
        Object object3 = ((SelectedOrderItem)object).consignment;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderDetailLineItem;
        object3 = ((SelectedOrderItem)object).orderDetailLineItem;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartEntry;
        object3 = ((SelectedOrderItem)object).cartEntry;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderStatus;
        object3 = ((SelectedOrderItem)object).orderStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.otherProducts;
        object3 = ((SelectedOrderItem)object).otherProducts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.allProducts;
        object3 = ((SelectedOrderItem)object).allProducts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.forwardOrderRevampOrderTrackerSection;
        object3 = ((SelectedOrderItem)object).forwardOrderRevampOrderTrackerSection;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isReturnableExchangeable;
        object3 = ((SelectedOrderItem)object).isReturnableExchangeable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isViewExchangeAvailable;
        object3 = ((SelectedOrderItem)object).isViewExchangeAvailable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.parentConsignmentEntry;
        object3 = ((SelectedOrderItem)object).parentConsignmentEntry;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartDeliveryAddress;
        object3 = ((SelectedOrderItem)object).cartDeliveryAddress;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnId;
        object3 = ((SelectedOrderItem)object).returnId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object3 = ((SelectedOrderItem)object).status;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.quantity;
        object3 = ((SelectedOrderItem)object).quantity;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.forwardPacketNumber;
        object3 = ((SelectedOrderItem)object).forwardPacketNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cancelledRefundDetails;
        object3 = ((SelectedOrderItem)object).cancelledRefundDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.exchangeReturnRTO;
        object3 = ((SelectedOrderItem)object).exchangeReturnRTO;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isExchangeOrder;
        object3 = ((SelectedOrderItem)object).isExchangeOrder;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.affiliateData;
        object3 = ((SelectedOrderItem)object).affiliateData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rawEntryStatus;
        object3 = ((SelectedOrderItem)object).rawEntryStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.listOfGiftProducts;
        object3 = ((SelectedOrderItem)object).listOfGiftProducts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.allGifts;
        object = ((SelectedOrderItem)object).allGifts;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final AffiliateData getAffiliateData() {
        return this.affiliateData;
    }

    public final HashMap getAllGifts() {
        return this.allGifts;
    }

    public final ArrayList getAllProducts() {
        return this.allProducts;
    }

    public final CancelledRefundDetailInfo getCancelledRefundDetails() {
        return this.cancelledRefundDetails;
    }

    public final CartDeliveryAddress getCartDeliveryAddress() {
        return this.cartDeliveryAddress;
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final Consignment getConsignment() {
        return this.consignment;
    }

    public final Boolean getExchangeReturnRTO() {
        return this.exchangeReturnRTO;
    }

    public final ArrayList getForwardOrderRevampOrderTrackerSection() {
        return this.forwardOrderRevampOrderTrackerSection;
    }

    public final String getForwardPacketNumber() {
        return this.forwardPacketNumber;
    }

    public final ArrayList getListOfGiftProducts() {
        return this.listOfGiftProducts;
    }

    public final OrderDetailLineItem getOrderDetailLineItem() {
        return this.orderDetailLineItem;
    }

    public final String getOrderStatus() {
        return this.orderStatus;
    }

    public final ArrayList getOtherProducts() {
        return this.otherProducts;
    }

    public final CartEntry getParentConsignmentEntry() {
        return this.parentConsignmentEntry;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getRawEntryStatus() {
        return this.rawEntryStatus;
    }

    public final String getReturnId() {
        return this.returnId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        int n4;
        Consignment consignment = this.consignment;
        int n7 = 0;
        if (consignment == null) {
            n4 = 0;
            consignment = null;
        } else {
            n4 = consignment.hashCode();
        }
        n4 *= 31;
        Object object = this.orderDetailLineItem;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartEntry;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.otherProducts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.allProducts;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.forwardOrderRevampOrderTrackerSection;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isReturnableExchangeable;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isViewExchangeAvailable;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.parentConsignmentEntry;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartDeliveryAddress;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.status;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.quantity;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.forwardPacketNumber;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cancelledRefundDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((CancelledRefundDetailInfo)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.exchangeReturnRTO;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isExchangeOrder;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.affiliateData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((AffiliateData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.rawEntryStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.listOfGiftProducts;
        if (object != null) {
            n7 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        return ((Object)this.allGifts).hashCode() + n4;
    }

    public final Boolean isExchangeOrder() {
        return this.isExchangeOrder;
    }

    public final Boolean isReturnableExchangeable() {
        return this.isReturnableExchangeable;
    }

    public final Boolean isViewExchangeAvailable() {
        return this.isViewExchangeAvailable;
    }

    public final void setAffiliateData(AffiliateData affiliateData) {
        this.affiliateData = affiliateData;
    }

    public final void setAllGifts(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.allGifts = hashMap;
    }

    public final void setAllProducts(ArrayList arrayList) {
        this.allProducts = arrayList;
    }

    public final void setCancelledRefundDetails(CancelledRefundDetailInfo cancelledRefundDetailInfo) {
        this.cancelledRefundDetails = cancelledRefundDetailInfo;
    }

    public final void setCartDeliveryAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.cartDeliveryAddress = cartDeliveryAddress;
    }

    public final void setCartEntry(CartEntry cartEntry) {
        this.cartEntry = cartEntry;
    }

    public final void setConsignment(Consignment consignment) {
        this.consignment = consignment;
    }

    public final void setExchangeOrder(Boolean bl2) {
        this.isExchangeOrder = bl2;
    }

    public final void setExchangeReturnRTO(Boolean bl2) {
        this.exchangeReturnRTO = bl2;
    }

    public final void setForwardOrderRevampOrderTrackerSection(ArrayList arrayList) {
        this.forwardOrderRevampOrderTrackerSection = arrayList;
    }

    public final void setForwardPacketNumber(String string2) {
        this.forwardPacketNumber = string2;
    }

    public final void setListOfGiftProducts(ArrayList arrayList) {
        this.listOfGiftProducts = arrayList;
    }

    public final void setOrderDetailLineItem(OrderDetailLineItem orderDetailLineItem) {
        this.orderDetailLineItem = orderDetailLineItem;
    }

    public final void setOrderStatus(String string2) {
        this.orderStatus = string2;
    }

    public final void setOtherProducts(ArrayList arrayList) {
        this.otherProducts = arrayList;
    }

    public final void setParentConsignmentEntry(CartEntry cartEntry) {
        this.parentConsignmentEntry = cartEntry;
    }

    public final void setQuantity(Integer n3) {
        this.quantity = n3;
    }

    public final void setRawEntryStatus(String string2) {
        this.rawEntryStatus = string2;
    }

    public final void setReturnId(String string2) {
        this.returnId = string2;
    }

    public final void setReturnableExchangeable(Boolean bl2) {
        this.isReturnableExchangeable = bl2;
    }

    public final void setStatus(String string2) {
        this.status = string2;
    }

    public final void setViewExchangeAvailable(Boolean bl2) {
        this.isViewExchangeAvailable = bl2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.consignment;
        OrderDetailLineItem orderDetailLineItem = this.orderDetailLineItem;
        CartEntry cartEntry = this.cartEntry;
        String string2 = this.orderStatus;
        ArrayList arrayList = this.otherProducts;
        ArrayList arrayList2 = this.allProducts;
        ArrayList arrayList3 = this.forwardOrderRevampOrderTrackerSection;
        Boolean bl2 = this.isReturnableExchangeable;
        Boolean bl3 = this.isViewExchangeAvailable;
        CartEntry cartEntry2 = this.parentConsignmentEntry;
        CartDeliveryAddress cartDeliveryAddress = this.cartDeliveryAddress;
        String string3 = this.returnId;
        String string4 = this.status;
        Integer n3 = this.quantity;
        String string5 = this.forwardPacketNumber;
        CancelledRefundDetailInfo cancelledRefundDetailInfo = this.cancelledRefundDetails;
        Boolean bl4 = this.exchangeReturnRTO;
        Boolean bl5 = this.isExchangeOrder;
        AffiliateData affiliateData = this.affiliateData;
        String string6 = this.rawEntryStatus;
        ArrayList arrayList4 = this.listOfGiftProducts;
        HashMap hashMap = this.allGifts;
        object = new StringBuilder("SelectedOrderItem(consignment=");
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(", orderDetailLineItem=");
        ((StringBuilder)object).append(orderDetailLineItem);
        ((StringBuilder)object).append(", cartEntry=");
        ((StringBuilder)object).append(cartEntry);
        ((StringBuilder)object).append(", orderStatus=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", otherProducts=");
        ((StringBuilder)object).append(arrayList);
        ((StringBuilder)object).append(", allProducts=");
        ((StringBuilder)object).append(arrayList2);
        ((StringBuilder)object).append(", forwardOrderRevampOrderTrackerSection=");
        ((StringBuilder)object).append(arrayList3);
        ((StringBuilder)object).append(", isReturnableExchangeable=");
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(", isViewExchangeAvailable=");
        ((StringBuilder)object).append(bl3);
        ((StringBuilder)object).append(", parentConsignmentEntry=");
        ((StringBuilder)object).append(cartEntry2);
        ((StringBuilder)object).append(", cartDeliveryAddress=");
        ((StringBuilder)object).append(cartDeliveryAddress);
        ((StringBuilder)object).append(", returnId=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", status=");
        ((StringBuilder)object).append(string4);
        ((StringBuilder)object).append(", quantity=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", forwardPacketNumber=");
        object2 = string5;
        ((StringBuilder)object).append(string5);
        ((StringBuilder)object).append(", cancelledRefundDetails=");
        object2 = cancelledRefundDetailInfo;
        ((StringBuilder)object).append(cancelledRefundDetailInfo);
        ((StringBuilder)object).append(", exchangeReturnRTO=");
        object2 = bl4;
        ((StringBuilder)object).append(bl4);
        ((StringBuilder)object).append(", isExchangeOrder=");
        object2 = bl5;
        ((StringBuilder)object).append(bl5);
        ((StringBuilder)object).append(", affiliateData=");
        object2 = affiliateData;
        ((StringBuilder)object).append(affiliateData);
        ((StringBuilder)object).append(", rawEntryStatus=");
        object2 = string6;
        ((StringBuilder)object).append(string6);
        ((StringBuilder)object).append(", listOfGiftProducts=");
        object2 = arrayList4;
        ((StringBuilder)object).append(arrayList4);
        ((StringBuilder)object).append(", allGifts=");
        object2 = hashMap;
        ((StringBuilder)object).append(hashMap);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

