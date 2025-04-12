/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.services.data.Order;

import android.text.TextUtils;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ExchangeRequestFailed;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.ShipmentTracking;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Consignment
implements Serializable {
    private String carrier;
    private String carrierUrl;
    private String code;
    private int consignmentCount;
    private int cumulativeEntriesCount;
    private String deliveryDate;
    public String eddUpper;
    private List entries;
    public String expectedDeliveryDate;
    private ArrayList forwardOrderRevampOrderTrackerSection;
    private String forwardPacketNumber;
    private boolean isReturnableExchangeable;
    private int listPosition;
    private String pickupByDate;
    private String returnCancelReason;
    private String returnCancelSubReason;
    private List returnCancelled;
    private int returnExchangeCount;
    private String returnExchangeCountMsg;
    private ArrayList returnRequests;
    private String shipmentMessage;
    private String shipmentName;
    private int shipmentPosition;
    private String shipmentStatus;
    private ArrayList shipmentTracking;
    private CartDeliveryAddress shippingAddress;
    private String status;
    private String trackingID;
    private HashMap trackingShipment;

    public Consignment() {
        int n3;
        this.returnExchangeCount = n3 = -1;
        this.cumulativeEntriesCount = n3;
    }

    private String splitTrackTimeStamp(String object) {
        int n3;
        CharSequence charSequence;
        int n4;
        String string2 = " ";
        boolean n42 = ((String)object).contains(string2);
        if (n42 && (n4 = ((Object)(object = ((String)object).split((String)(charSequence = "\\s+")))).length) >= (n3 = 2)) {
            charSequence = new StringBuilder();
            n3 = 0;
            Object object2 = object[0];
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(string2);
            object = object[1];
            int n7 = 3;
            object = ((String)object).substring(0, n7);
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
        } else {
            object = null;
        }
        if (object == null) {
            object = "";
        }
        return object;
    }

    public void calculateCumulativeEntriesCount() {
        int n3 = this.cumulativeEntriesCount;
        int n4 = -1;
        if (n3 == n4) {
            Object object = this.entries;
            n4 = 0;
            if (object != null && (n3 = object.size()) > 0) {
                int n7;
                object = this.entries.iterator();
                while ((n7 = object.hasNext()) != 0) {
                    Integer n8 = ((CartEntry)object.next()).getQuantity();
                    n7 = n8;
                    n4 += n7;
                }
                this.cumulativeEntriesCount = n4;
            } else {
                this.cumulativeEntriesCount = 0;
            }
        }
    }

    public void calculateReturnExchangeCount() {
        Object object = this.returnRequests;
        String string2 = "";
        if (object != null) {
            int n3;
            boolean bl2;
            object = ((ArrayList)object).iterator();
            int n4 = 0;
            int n7 = 0;
            while (bl2 = object.hasNext()) {
                int n8;
                Object object2 = (ReturnRequest)object.next();
                Object object3 = ((ReturnRequest)object2).getReturnEntries();
                if (object3 != null) {
                    int n10;
                    object3 = ((ReturnRequest)object2).getReturnEntries().iterator();
                    n8 = 0;
                    while ((n10 = object3.hasNext()) != 0) {
                        OrderDetailLineItem orderDetailLineItem = (OrderDetailLineItem)object3.next();
                        n10 = orderDetailLineItem.getLineItemQty();
                        n8 += n10;
                    }
                } else {
                    n8 = 0;
                }
                if (bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((ReturnRequest)object2).getExchangeOrderID()))) {
                    n4 += n8;
                    continue;
                }
                n7 += n8;
            }
            this.returnExchangeCount = n3 = n4 + n7;
            if (n4 <= 0 && n7 <= 0) {
                this.returnExchangeCountMsg = string2;
            } else {
                string2 = " (";
                object = new StringBuilder(string2);
                if (n4 > 0) {
                    ((StringBuilder)object).append(n4);
                    string2 = " Returned";
                    ((StringBuilder)object).append(string2);
                }
                if (n7 > 0) {
                    if (n4 > 0) {
                        string2 = ", ";
                        ((StringBuilder)object).append(string2);
                    }
                    ((StringBuilder)object).append(n7);
                    string2 = " Exchanged";
                    ((StringBuilder)object).append(string2);
                }
                string2 = ")";
                ((StringBuilder)object).append(string2);
                this.returnExchangeCountMsg = object = ((StringBuilder)object).toString();
            }
        } else {
            this.returnExchangeCount = 0;
            this.returnExchangeCountMsg = string2;
        }
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getCarrierUrl() {
        return this.carrierUrl;
    }

    public String getCode() {
        return this.code;
    }

    public int getConsignmentCount() {
        return this.consignmentCount;
    }

    public int getCumulativeEntriesCount() {
        return this.cumulativeEntriesCount;
    }

    public String getDeliveryDate() {
        return this.deliveryDate;
    }

    public String getEddUpper() {
        return this.eddUpper;
    }

    public List getEntries() {
        return this.entries;
    }

    public HashMap getExchangeRequestFailed() {
        boolean bl2;
        HashMap hashMap = new HashMap();
        Iterator iterator = this.entries.iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = ((CartEntry)iterator.next()).getOrderEntry().getProduct().getCode();
            ArrayList<ExchangeRequestFailed> arrayList = new ArrayList<ExchangeRequestFailed>();
            Object object = this.returnRequests;
            if (object != null) {
                boolean bl3;
                Iterator iterator2 = ((ArrayList)object).iterator();
                while (bl3 = iterator2.hasNext()) {
                    object = iterator2.next();
                    Serializable serializable = object;
                    serializable = (ReturnRequest)object;
                    if ((object = ((ReturnRequest)serializable).getReturnCancelledEntries()) == null) continue;
                    object = ((ReturnRequest)serializable).getReturnCancelledEntries();
                    Iterator iterator3 = object.iterator();
                    while (bl3 = iterator3.hasNext()) {
                        ExchangeRequestFailed exchangeRequestFailed;
                        object = ((OrderDetailLineItem)iterator3.next()).getEntry().getProduct().getCode();
                        Objects.requireNonNull(object);
                        bl3 = ((String)object).equals(string2);
                        if (!bl3) continue;
                        String string3 = ((ReturnRequest)serializable).getExchangeOrderID();
                        String string4 = ((ReturnRequest)serializable).getReturnRequestedOnMessage();
                        String string5 = ((ReturnRequest)serializable).getReturnMessage();
                        Boolean bl4 = ((ReturnRequest)serializable).getExchangeRTO();
                        String string6 = ((ReturnRequest)serializable).getExchangeRTOMessage();
                        object = exchangeRequestFailed;
                        exchangeRequestFailed = new ExchangeRequestFailed(string3, string4, string5, bl4, string2, string6);
                        arrayList.add(exchangeRequestFailed);
                    }
                }
            }
            hashMap.put(string2, arrayList);
        }
        return hashMap;
    }

    public String getExpectedDeliveryDate() {
        return this.expectedDeliveryDate;
    }

    public String getForwardPacketNumber() {
        return this.forwardPacketNumber;
    }

    public int getListPosition() {
        return this.listPosition;
    }

    public String getPickupByDate() {
        return this.pickupByDate;
    }

    public String getReturnCancelReason() {
        return this.returnCancelReason;
    }

    public String getReturnCancelSubReason() {
        return this.returnCancelSubReason;
    }

    public List getReturnCancelled() {
        return this.returnCancelled;
    }

    public int getReturnExchangeCount() {
        return this.returnExchangeCount;
    }

    public String getReturnExchangeCountMsg() {
        return this.returnExchangeCountMsg;
    }

    public ArrayList getReturnRequests() {
        return this.returnRequests;
    }

    public String getShipmentMessage() {
        return this.shipmentMessage;
    }

    public String getShipmentName() {
        return this.shipmentName;
    }

    public int getShipmentPosition() {
        return this.shipmentPosition;
    }

    public String getShipmentStatus() {
        return this.shipmentStatus;
    }

    public CartDeliveryAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public String getStatus() {
        return this.status;
    }

    public ArrayList getTrackerList() {
        return this.forwardOrderRevampOrderTrackerSection;
    }

    public String getTrackingID() {
        return this.trackingID;
    }

    public HashMap getTrackingShipment() {
        Object object = this.trackingShipment;
        if (object == null && (object = this.shipmentTracking) != null) {
            boolean bl2;
            object = new HashMap();
            this.trackingShipment = object;
            object = this.shipmentTracking.iterator();
            while (bl2 = object.hasNext()) {
                Object object2 = (ShipmentTracking)object.next();
                HashMap hashMap = this.trackingShipment;
                String string2 = ((ShipmentTracking)object2).getKey();
                object2 = ((ShipmentTracking)object2).getValue();
                object2 = this.splitTrackTimeStamp((String)object2);
                hashMap.put(string2, object2);
            }
            this.shipmentTracking.clear();
            object = null;
            this.shipmentTracking = null;
        }
        return this.trackingShipment;
    }

    public boolean isReturnableExchangeable() {
        return this.isReturnableExchangeable;
    }

    public void setCancelledEntries(List list) {
        this.returnCancelled = list;
    }

    public void setCarrier(String string2) {
        this.carrier = string2;
    }

    public void setCarrierUrl(String string2) {
        this.carrierUrl = string2;
    }

    public void setEntries(List list) {
        this.entries = list;
    }

    public void setForwardPacketNumber(String string2) {
        this.forwardPacketNumber = string2;
    }

    public void setOrderDetailData(int n3, int n4, int n7) {
        this.shipmentPosition = n3;
        this.listPosition = n4;
        this.consignmentCount = n7;
    }

    public void setPickupByDate(String string2) {
        this.pickupByDate = string2;
    }

    public void setReturnCancelReason(String string2) {
        this.returnCancelReason = string2;
    }

    public void setReturnCancelSubReason(String string2) {
        this.returnCancelSubReason = string2;
    }

    public void setReturnCancelled(List list) {
        this.returnCancelled = list;
    }

    public void setReturnableExchangeable(boolean bl2) {
        this.isReturnableExchangeable = bl2;
    }

    public void setShipmentName(String string2) {
        this.shipmentName = string2;
    }

    public void setShipmentPosition(int n3) {
        this.shipmentPosition = n3;
    }

    public void setTrackingID(String string2) {
        this.trackingID = string2;
    }
}

