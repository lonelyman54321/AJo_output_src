/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.data.repo;

import android.text.TextUtils;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.RefundAmountDetails;
import com.ril.ajio.services.data.Order.CanceledRefundDetailsData;
import com.ril.ajio.services.data.Order.CancelledRefundDetailInfo;
import com.ril.ajio.services.data.Order.CancelledRefundDetails;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.RefundActivities;
import com.ril.ajio.services.data.Order.RefundDetails;
import com.ril.ajio.services.data.Order.RefundDetailsObj;
import com.ril.ajio.services.data.Order.ReturnOrderTracker;
import com.ril.ajio.services.data.Order.ReturnRefundNewReturnCreation;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.ReturnRequestCancelledPopUp;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.b;

public final class OrderDetailFunctionalRepo {
    public static final int $stable = 0;
    public static final String CANCELLATION_TYPE_BUSINESS = "BUSINESS_CANCELLATION";
    public static final String CANCELLATION_TYPE_USER = "USER_CANCELLATION";
    public static final OrderDetailFunctionalRepo INSTANCE;
    private static int consignmentSize;
    private static ReturnRequest returnRequest;
    private static int scrollPosition;

    static {
        OrderDetailFunctionalRepo orderDetailFunctionalRepo;
        INSTANCE = orderDetailFunctionalRepo = new OrderDetailFunctionalRepo();
        $stable = 8;
    }

    private OrderDetailFunctionalRepo() {
    }

    private final boolean checkForExchangeOrder(OrderItemLine object) {
        boolean bl2;
        String string2;
        boolean bl3;
        String string3 = ((OrderItemLine)object).getOrderType();
        if (string3 != null && ((bl3 = (string2 = "FORWARD").equalsIgnoreCase(string3 = ((OrderItemLine)object).getOrderType())) || (bl3 = (string2 = "EXCHANGE").equalsIgnoreCase(string3 = ((OrderItemLine)object).getOrderType())) || (bl2 = (string3 = "Exchange Return").equalsIgnoreCase((String)(object = ((OrderItemLine)object).getOrderType()))))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private final List checkForReturnCancelledAndData(Consignment consignment) {
        Object object;
        Object object2;
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object3 = new HashMap();
        Object object4 = consignment.getReturnRequests();
        Object object5 = "";
        if (object4 != null && (n3 = ((ArrayList)(object4 = consignment.getReturnRequests())).size()) > 0) {
            boolean bl2;
            object4 = consignment.getReturnRequests().iterator();
            Intrinsics.checkNotNullExpressionValue(object4, "iterator(...)");
            object2 = object5;
            while (bl2 = object4.hasNext()) {
                String string2 = "RETURN CANCELLED";
                object = (ReturnRequest)object4.next();
                Object object6 = ((ReturnRequest)object).getReturnStatus();
                boolean bl3 = string2.equalsIgnoreCase((String)object6);
                if (!bl3) continue;
                object6 = ((ReturnRequest)object).getRefundCancelReturnSection();
                string2 = null;
                if (object6 != null) {
                    object6 = ((ReturnRequest)object).getRefundCancelReturnSection();
                    if (object6 != null) {
                        object6 = ((ReturnRefundNewReturnCreation)object6).getHeaderMessage();
                    } else {
                        bl3 = false;
                        object6 = null;
                    }
                    bl3 = TextUtils.isEmpty((CharSequence)object6);
                    if (!bl3) {
                        object5 = ((ReturnRequest)object).getRefundCancelReturnSection();
                        object5 = object5 != null ? ((ReturnRefundNewReturnCreation)object5).getHeaderMessage() : null;
                        object5 = String.valueOf(object5);
                    }
                    if ((object6 = ((ReturnRequest)object).getRefundCancelReturnSection()) != null) {
                        object6 = ((ReturnRefundNewReturnCreation)object6).getMessage();
                    } else {
                        bl3 = false;
                        object6 = null;
                    }
                    bl3 = TextUtils.isEmpty((CharSequence)object6);
                    if (!bl3) {
                        object2 = ((ReturnRequest)object).getRefundCancelReturnSection();
                        object2 = object2 != null ? ((ReturnRefundNewReturnCreation)object2).getMessage() : null;
                        object2 = String.valueOf(object2);
                    }
                }
                if ((object6 = (Collection)((ReturnRequest)object).getReturnCancelledEntries()) == null || (bl3 = object6.isEmpty())) continue;
                object = ((ReturnRequest)object).getReturnCancelledEntries().iterator();
                while (bl3 = object.hasNext()) {
                    Object object7;
                    object6 = (OrderDetailLineItem)object.next();
                    object7 = object6 != null && (object7 = ((OrderDetailLineItem)object6).getEntry()) != null && (object7 = ((CartEntry)object7).getProduct()) != null ? ((Product)object7).getCode() : null;
                    boolean bl4 = TextUtils.isEmpty((CharSequence)object7);
                    if (bl4) continue;
                    Intrinsics.checkNotNull(object7);
                    object6 = ((OrderDetailLineItem)object6).getEntry();
                    object3.put(object7, object6);
                }
            }
        } else {
            object2 = object5;
        }
        object3 = ((HashMap)object3).values().iterator();
        while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            object4 = object3.next();
            object = "next(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object);
            object4 = (CartEntry)object4;
            arrayList.add(object4);
        }
        consignment.setReturnCancelReason((String)object5);
        consignment.setReturnCancelSubReason((String)object2);
        return arrayList;
    }

    private final List checkForSelfShipFlow(ReturnRequest object) {
        int n3;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Serializable serializable = mz0_2.a;
        ref$ObjectRef.element = serializable;
        serializable = ((ReturnRequest)object).getReturnOrderTracker();
        if (serializable != null && (n3 = ((ArrayList)(serializable = ((ReturnRequest)object).getReturnOrderTracker())).size()) > 0 && (serializable = ((ReturnRequest)object).getWarehouseAddress()) != null) {
            boolean bl2;
            object = ((ReturnRequest)object).getReturnOrderTracker();
            Intrinsics.checkNotNullExpressionValue(object, "getReturnOrderTracker(...)");
            serializable = new ArrayList();
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Boolean bl3;
                Object e2;
                Object object2 = e2 = object.next();
                object2 = ((ReturnOrderTracker)e2).isActive();
                boolean bl4 = Intrinsics.areEqual(object2, bl3 = Boolean.TRUE);
                if (!bl4) continue;
                serializable.add(e2);
            }
            ref$ObjectRef.element = serializable;
        }
        return (List)ref$ObjectRef.element;
    }

    private final boolean checkIfDisplayOlderUi(boolean bl2) {
        boolean bl3 = hv3_0.D();
        return !bl3 || !bl2;
        {
        }
    }

    private final String getCancelledOrderStatus(CartEntry object) {
        String string2;
        int n3 = R$string.od_cancelled;
        String string3 = hv3_0.K(n3);
        boolean bl2 = ((String)(object = no_2.b((CartEntry)object))).equalsIgnoreCase(string2 = "CANCELLED");
        if (bl2) {
            int n4 = R$string.od_cancelled;
            string3 = hv3_0.K(n4);
        } else {
            int n7;
            string2 = "CANCELLATION_REQUESTED";
            bl2 = ((String)object).equalsIgnoreCase(string2);
            if (bl2 || (n7 = (int)(((String)object).equalsIgnoreCase(string2 = "CANCELLATION REQUESTED") ? 1 : 0)) != 0) {
                n7 = R$string.od_cancellation_requested;
                string3 = hv3_0.K(n7);
            }
        }
        return string3;
    }

    public static /* synthetic */ Map getSelectedItemOrderDetail$default(OrderDetailFunctionalRepo orderDetailFunctionalRepo, qz1_2 qz1_22, CartOrder cartOrder, String string2, boolean bl2, boolean bl3, String string3, boolean bl4, String string4, boolean bl5, int n3, Object object) {
        String string5;
        int n4 = n3;
        int n7 = n3 & 0x20;
        if (n7 != 0) {
            n7 = 0;
            string5 = null;
        } else {
            string5 = string3;
        }
        n7 = n4 & 0x40;
        boolean bl6 = n7 != 0 ? false : bl4;
        boolean bl7 = (n4 &= 0x100) != 0 ? false : bl5;
        return orderDetailFunctionalRepo.getSelectedItemOrderDetail(qz1_22, cartOrder, string2, bl2, bl3, string5, bl6, string4, bl7);
    }

    private final boolean isNextEddBreached(ArrayList serializable, int n3, boolean n4) {
        boolean bl2 = false;
        if (n4 == 0) {
            return false;
        }
        if (serializable != null && (n4 = ((ArrayList)serializable).size()) > n3) {
            serializable = ((ArrayList)serializable).get(n3);
            String string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(serializable, string2);
            serializable = (OrderDetailLineItem)serializable;
            long l2 = ((OrderDetailLineItem)serializable).getEpochPSD();
            long l3 = System.currentTimeMillis();
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 < 0) {
                n3 = 1;
            } else {
                n3 = 0;
                string2 = null;
            }
            l3 = ((OrderDetailLineItem)serializable).getEpochEddUpper();
            long l7 = System.currentTimeMillis();
            long l8 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
            if (l8 < 0) {
                l8 = 1;
            } else {
                l8 = 0;
                serializable = null;
            }
            if (n3 != 0 || l8 != false) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private final void setImageList(List object, ArrayList arrayList) {
        if (object != null) {
            Object object2 = object;
            object2 = (Collection)object;
            boolean bl2 = object2.isEmpty();
            boolean bl3 = true;
            if (bl2 ^= bl3) {
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    String string2;
                    object2 = (ProductImage)object.next();
                    String string3 = ((ProductImage)object2).getFormat();
                    boolean bl4 = b.i(string3, string2 = "cartIcon", bl3);
                    if (!bl4 || !(bl4 = b.i(string3 = ((ProductImage)object2).getImageType(), string2 = "PRIMARY", bl3))) continue;
                    object = UrlHelper.Companion.getInstance();
                    object2 = ((ProductImage)object2).getUrl();
                    object = ((UrlHelper)object).getImageUrl((String)object2);
                    arrayList.add(object);
                    break;
                }
            }
        }
    }

    public final CancelledRefundDetailInfo getCancelledRefundDetailInfo(OrderDetailLineItem orderDetailLineItem, String string2) {
        CancelledRefundDetailInfo cancelledRefundDetailInfo;
        Iterator iterator = orderDetailLineItem;
        Intrinsics.checkNotNullParameter(orderDetailLineItem, "cancelledOrderDetailsLineItem");
        Object object = new LinkedHashMap();
        Iterator iterator2 = null;
        int n3 = 0;
        Object object2 = null;
        int n4 = 63;
        String string3 = null;
        Object object3 = cancelledRefundDetailInfo;
        cancelledRefundDetailInfo = new CancelledRefundDetailInfo(null, null, null, null, null, null, n4, null);
        object3 = orderDetailLineItem.getCancellationType();
        if (object3 != null && (object3 = orderDetailLineItem.getCanceledRefundDetails()) != null) {
            int n7;
            object3 = orderDetailLineItem.getCancellationType();
            cancelledRefundDetailInfo.setCancellationType((String)object3);
            object3 = orderDetailLineItem.getRefundAmountDetails();
            if (object3 != null) {
                object3 = ((RefundAmountDetails)object3).getCanceledRefundMessage();
            } else {
                n7 = 0;
                object3 = null;
            }
            cancelledRefundDetailInfo.setCanceledRefundMessage((String)object3);
            object3 = orderDetailLineItem.getEntry();
            if (object3 != null) {
                object3 = ((CartEntry)object3).getCanceledTimestamp();
            } else {
                n7 = 0;
                object3 = null;
            }
            cancelledRefundDetailInfo.setCanceledTimestamp((String)object3);
            iterator = orderDetailLineItem.getCanceledRefundDetails();
            double d2 = 0.0;
            if (iterator != null && (iterator = ((CancelledRefundDetails)((Object)iterator)).getData()) != null && (iterator = ((CanceledRefundDetailsData)((Object)iterator)).getRefundsDetail()) != null) {
                iterator = ((Iterable)((Object)iterator)).iterator();
                double d5 = d2;
                n3 = 0;
                object2 = null;
                while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object2 = (RefundDetails)iterator.next();
                    Object object4 = ((RefundDetails)object2).getRefundType();
                    n4 = (int)(Intrinsics.areEqual(object4, string3 = "CUSTOMER_CANCELLATION") ? 1 : 0);
                    if (n4 != 0) {
                        String string4;
                        boolean bl2;
                        object4 = ((RefundDetails)object2).getRefundActivities();
                        if (object4 != null) {
                            boolean bl3;
                            object4 = ((Iterable)object4).iterator();
                            bl2 = false;
                            string4 = null;
                            while (bl3 = object4.hasNext()) {
                                Object object5 = (RefundActivities)object4.next();
                                Object object6 = ((RefundActivities)object5).getItemId();
                                int n8 = Intrinsics.areEqual(object6, string2);
                                if (n8 == 0) continue;
                                string4 = ((RefundActivities)object5).getMop();
                                if (string4 != null) {
                                    object6 = Locale.ROOT;
                                    object6 = string4.toUpperCase((Locale)object6);
                                    object3 = "toUpperCase(...)";
                                    Intrinsics.checkNotNullExpressionValue(object6, (String)object3);
                                } else {
                                    n8 = 0;
                                    object6 = null;
                                }
                                n7 = mz3_0.w((String)object6);
                                if (n7 != 0) {
                                    string4 = "RETURN_CREDIT";
                                }
                                if (string4 != null && (n7 = string4.equalsIgnoreCase((String)(object3 = "cod"))) == 0) {
                                    Double d7;
                                    Integer n10;
                                    String string5;
                                    String string6;
                                    double d9;
                                    Object object7;
                                    n7 = object.containsKey(string4);
                                    if (n7 != 0) {
                                        object3 = (RefundDetailsObj)((LinkedHashMap)object).get(string4);
                                    } else {
                                        n7 = 0;
                                        object3 = null;
                                    }
                                    if (object3 != null) {
                                        int n14;
                                        object6 = ((RefundDetailsObj)object3).getQty();
                                        if (object6 != null) {
                                            n8 = (Integer)object6;
                                        } else {
                                            n8 = 0;
                                            object6 = null;
                                        }
                                        object7 = ((RefundActivities)object5).getQty();
                                        if (object7 != null) {
                                            n14 = (Integer)object7;
                                        } else {
                                            n14 = 0;
                                            object7 = null;
                                        }
                                        n8 += n14;
                                        object3 = ((RefundDetailsObj)object3).getAmount();
                                        d9 = object3 != null ? (Double)object3 : d2;
                                        object3 = ((RefundActivities)object5).getAmount();
                                        double d12 = object3 != null ? (Double)object3 : d2;
                                        string6 = ((RefundActivities)object5).getLogo();
                                        string5 = ((RefundActivities)object5).getMaskedDigits();
                                        n10 = n8;
                                        d7 = d9 += d12;
                                        object7 = object3;
                                        object3 = new RefundDetailsObj(string4, n10, d7, string6, string5);
                                        object.put(string4, object3);
                                    } else {
                                        object3 = ((RefundActivities)object5).getQty();
                                        if (object3 != null) {
                                            n7 = (Integer)object3;
                                        } else {
                                            n7 = 0;
                                            object3 = null;
                                        }
                                        object6 = ((RefundActivities)object5).getAmount();
                                        d9 = object6 != null ? (Double)object6 : d2;
                                        string6 = ((RefundActivities)object5).getLogo();
                                        string5 = ((RefundActivities)object5).getMaskedDigits();
                                        n10 = n7;
                                        d7 = d9;
                                        object7 = object5;
                                        object5 = new RefundDetailsObj(string4, n10, d7, string6, string5);
                                        object.put(string4, object5);
                                    }
                                }
                                bl2 = true;
                            }
                        } else {
                            bl2 = false;
                            string4 = null;
                        }
                        if (bl2 && (object3 = ((RefundDetails)object2).getTotalRefundAmount()) != null) {
                            double d13 = ((Number)object3).doubleValue();
                            d5 += d13;
                        }
                    }
                    n3 = 1;
                }
                n7 = n3;
                d2 = d5;
            } else {
                n7 = 0;
                object3 = null;
            }
            iterator = new Iterator();
            object = ((Iterable)((LinkedHashMap)object).values()).iterator();
            while ((n3 = object.hasNext()) != 0) {
                object2 = (RefundDetailsObj)object.next();
                ((ArrayList)((Object)iterator)).add((RefundDetailsObj)object2);
            }
            object = d2;
            cancelledRefundDetailInfo.setTotalRefund((Double)object);
            if (n7 != 0) {
                iterator2 = iterator;
            }
            cancelledRefundDetailInfo.setRefundDetailsObj((List)((Object)iterator2));
            return cancelledRefundDetailInfo;
        }
        object = orderDetailLineItem.getEntry();
        object = object != null ? ((CartEntry)object).getCancelReqTimestamp() : null;
        cancelledRefundDetailInfo.setCancelReqTimestamp((String)object);
        return null;
    }

    public final int getConsignmentSize() {
        return consignmentSize;
    }

    public final String getDisplayIconDescForMop(String string2) {
        String string3;
        block12: {
            int n3;
            Object object;
            if (string2 != null) {
                object = Locale.getDefault();
                string3 = "getDefault(...)";
                Intrinsics.checkNotNullExpressionValue(object, string3);
                string2 = string2.toUpperCase((Locale)object);
                object = "toUpperCase(...)";
                Intrinsics.checkNotNullExpressionValue(string2, (String)object);
            } else {
                n3 = 0;
                string2 = null;
            }
            int n4 = mz3_0.w(string2);
            string3 = "";
            if (n4 != 0) {
                return string3;
            }
            if (string2 == null) break block12;
            n4 = string2.hashCode();
            switch (n4) {
                default: {
                    break block12;
                }
                case 1386827418: {
                    object = "RAZORPAY";
                    n3 = string2.equals(object);
                    if (n3 != 0) break;
                    break block12;
                }
                case 1313280611: {
                    object = "AJIO_CASH";
                    n3 = string2.equals(object);
                    break block12;
                }
                case 668082691: {
                    object = "PAYTMGATEWAY";
                    n3 = string2.equals(object);
                    if (n3 != 0) break;
                    break block12;
                }
                case 339673041: {
                    object = "BILL_DESK";
                    n3 = string2.equals(object);
                    if (n3 != 0) {
                        break;
                    }
                    break block12;
                }
                case 314639668: {
                    object = "JIOGATEWAY";
                    n3 = string2.equals(object);
                    if (n3 != 0) break;
                    break block12;
                }
                case 2448589: {
                    object = "PAYU";
                    n3 = string2.equals(object);
                    if (n3 == 0) break block12;
                }
            }
            n3 = R$string.acc_bank_icon;
            string3 = hv3_0.K(n3);
        }
        return string3;
    }

    public final Integer getDisplayIconForMop(String string2) {
        Integer n3;
        block13: {
            int n4;
            int n7;
            Object object;
            block12: {
                n3 = null;
                if (string2 != null) {
                    object = Locale.getDefault();
                    String string3 = "getDefault(...)";
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    string2 = string2.toUpperCase((Locale)object);
                    object = "toUpperCase(...)";
                    Intrinsics.checkNotNullExpressionValue(string2, (String)object);
                } else {
                    n7 = 0;
                    string2 = null;
                }
                n4 = mz3_0.w(string2);
                if (n4 == 0) break block12;
                n7 = R$drawable.ic_ajio_cash;
                n3 = n7;
                break block13;
            }
            if (string2 == null) break block13;
            n4 = string2.hashCode();
            switch (n4) {
                default: {
                    break block13;
                }
                case 1386827418: {
                    object = "RAZORPAY";
                    n7 = (int)(string2.equals(object) ? 1 : 0);
                    if (n7 != 0) break;
                    break block13;
                }
                case 1313280611: {
                    object = "AJIO_CASH";
                    n7 = (int)(string2.equals(object) ? 1 : 0);
                    if (n7 != 0) {
                        n7 = R$drawable.ic_point_refund_breakup;
                        n3 = n7;
                    }
                    break block13;
                }
                case 668082691: {
                    object = "PAYTMGATEWAY";
                    n7 = (int)(string2.equals(object) ? 1 : 0);
                    if (n7 != 0) break;
                    break block13;
                }
                case 339673041: {
                    object = "BILL_DESK";
                    n7 = (int)(string2.equals(object) ? 1 : 0);
                    if (n7 != 0) {
                        break;
                    }
                    break block13;
                }
                case 314639668: {
                    object = "JIOGATEWAY";
                    n7 = (int)(string2.equals(object) ? 1 : 0);
                    if (n7 != 0) break;
                    break block13;
                }
                case 2448589: {
                    object = "PAYU";
                    n7 = (int)(string2.equals(object) ? 1 : 0);
                    if (n7 == 0) break block13;
                }
            }
            n7 = R$drawable.bank_transfer;
            n3 = n7;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    public final String getDisplayNameForMop(String var1_1) {
        block18: {
            block17: {
                if (var1_1 != null) {
                    var2_2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(var2_2, "getDefault(...)");
                    var2_2 = var1_1.toUpperCase((Locale)var2_2);
                    var3_3 = "toUpperCase(...)";
                    Intrinsics.checkNotNullExpressionValue(var2_2, var3_3);
                } else {
                    var4_4 = false;
                    var2_2 = null;
                }
                var5_5 = mz3_0.w((String)var2_2);
                if (var5_5 == 0) break block17;
                var6_6 = R$string.ajio_cash;
                var1_1 = hv3_0.K(var6_6);
                break block18;
            }
            if (var2_2 == null) ** GOTO lbl-1000
            var5_5 = var2_2.hashCode();
            switch (var5_5) {
                default: {
                    ** GOTO lbl-1000
                }
                case 1518091846: {
                    var3_3 = "RELIANCE_ONE";
                    var4_4 = var2_2.equals(var3_3);
                    if (!var4_4) ** GOTO lbl-1000
                    var6_7 = R$string.r1_points;
                    var1_1 = hv3_0.K(var6_7);
                    break block18;
                }
                case 1386827418: {
                    var3_3 = "RAZORPAY";
                    var4_4 = var2_2.equals(var3_3);
                    if (var4_4) ** GOTO lbl66
                    ** GOTO lbl-1000
                }
                case 1313280611: {
                    var3_3 = "AJIO_CASH";
                    var4_4 = var2_2.equals(var3_3);
                    if (!var4_4) ** GOTO lbl-1000
                    var6_8 = R$string.super_cash;
                    var1_1 = hv3_0.K(var6_8);
                    break block18;
                }
                case 668082691: {
                    var3_3 = "PAYTMGATEWAY";
                    var4_4 = var2_2.equals(var3_3);
                    if (var4_4) ** GOTO lbl66
                    ** GOTO lbl-1000
                }
                case 553358315: {
                    var3_3 = "LOYALTY_REWARDS";
                    var4_4 = var2_2.equals(var3_3);
                    if (!var4_4) ** GOTO lbl-1000
                    var6_9 = R$string.loyalty_rewards_points;
                    var1_1 = hv3_0.K(var6_9);
                    break block18;
                }
                case 339673041: {
                    var3_3 = "BILL_DESK";
                    var4_4 = var2_2.equals(var3_3);
                    if (!var4_4) ** GOTO lbl-1000
                    ** GOTO lbl66
                }
                case 314639668: {
                    var3_3 = "JIOGATEWAY";
                    var4_4 = var2_2.equals(var3_3);
                    if (var4_4) ** GOTO lbl66
                    ** GOTO lbl-1000
                }
                case 2448589: {
                    var3_3 = "PAYU";
                    var4_4 = var2_2.equals(var3_3);
                    if (!var4_4) ** GOTO lbl-1000
lbl66:
                    // 5 sources

                    var6_10 = R$string.back_to_pre_paid_mode;
                    var1_1 = hv3_0.K(var6_10);
                    break block18;
                }
                case 2251303: {
                    var3_3 = "IMPS";
                    var4_4 = var2_2.equals(var3_3);
                    if (!var4_4) ** GOTO lbl-1000
                    var6_11 = R$string.bank_transfer_refund_breakup;
                    var1_1 = hv3_0.K(var6_11);
                    break block18;
                }
                case -839073524: 
            }
            var3_3 = "MAHA_CASHBACK";
            var4_4 = var2_2.equals(var3_3);
            if (var4_4) {
                var6_12 = R$string.jio_mart_mahacashback;
                var1_1 = hv3_0.K(var6_12);
            } else if (var1_1 == null) {
                var6_13 = R$string.back_to_pre_paid_mode;
                var1_1 = hv3_0.K(var6_13);
            }
        }
        return var1_1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final ArrayList getOrderDetailList(CartOrder var1_1, String var2_2, boolean var3_3, boolean var4_4, boolean var5_5) {
        block99: {
            block94: {
                var6_6 = this;
                var7_7 /* !! */  = var1_1;
                var8_8 = var2_2;
                var9_9 = var3_3;
                var10_10 = new ArrayList<Object>();
                var11_11 = new ArrayList();
                if (var1_1 == null) {
                    return var10_10;
                }
                var12_12 = var1_1.getDeliveryAddress();
                if (var12_12 != null) {
                    var12_12 = var1_1.getDeliveryAddress();
                    var13_14 = var1_1.getDeliveryModeValue();
                    var12_12.setDeliveryModeValue((String)var13_14);
                }
                var12_12 = new ArrayList();
                var13_14 = var1_1.getConsignmentsData();
                var14_15 = "get(...)";
                if (var13_14 != null) {
                    OrderDetailFunctionalRepo.consignmentSize = var13_14.size();
                    var15_16 = var13_14.size();
                    var17_18 = null;
                    var18_19 = -1;
                    for (var16_17 = 0; var16_17 < var15_16; ++var16_17) {
                        var19_20 = var13_14.get(var16_17);
                        Intrinsics.checkNotNullExpressionValue(var19_20, var14_15);
                        var19_20 = (Consignment)var19_20;
                        var20_21 = var19_20.getEntries();
                        if (var20_21 != null && (var21_22 = (var20_21 = var19_20.getEntries()).size()) > 0) {
                            var20_21 = var19_20.getStatus();
                            var21_22 = (int)TextUtils.isEmpty((CharSequence)var20_21);
                            if (var21_22 == 0 && (var21_22 = (int)var1_1.isReturnRevampNewFlowEnabled()) != 0 && (var21_22 = (int)hv3_0.D()) != 0) {
                                var22_23 = var6_6.checkForReturnCancelledAndData((Consignment)var19_20);
                                var19_20.setCancelledEntries((List)var22_23);
                            }
                            var22_23 = var19_20.getEntries();
                            var23_24 = var22_23.size();
                            var24_25 = var18_19;
                            var26_27 = null;
                            for (var25_26 = 0; var25_26 < var23_24; ++var25_26) {
                                var27_28 = (CartEntry)var19_20.getEntries().get(var25_26);
                                if (var4_4) {
                                    var28_29 = var27_28.getOrderEntry().getProduct();
                                    Y63.g((Product)var28_29);
                                }
                                var29_30 = var23_24;
                                var23_24 = -1;
                                if (var24_25 == var23_24 && var8_8 != null && (var23_24 = var2_2.length()) != 0) {
                                    if (var27_28 != null && (var22_23 = var27_28.getOrderEntry()) != null && (var22_23 = var22_23.getProduct()) != null) {
                                        var22_23 = var22_23.getCode();
                                    } else {
                                        var23_24 = 0;
                                        var22_23 = null;
                                    }
                                    var23_24 = (int)Intrinsics.areEqual(var8_8, var22_23);
                                    if (var23_24 != 0) {
                                        var24_25 = var12_12.size() - var25_26;
                                    }
                                }
                                var23_24 = OrderDetailFunctionalRepo.consignmentSize;
                                var27_28.setOrderDetailData(var16_17, var25_26, var23_24);
                                var22_23 = var19_20.getCode();
                                var18_19 = (int)TextUtils.isEmpty((CharSequence)var22_23);
                                if (var18_19 == 0) {
                                    var18_19 = var24_25;
                                    var30_31 = var19_20.getShipmentStatus();
                                    var31_32 = var15_16;
                                    var32_33 = "delivered";
                                    var24_25 = (int)var32_33.equalsIgnoreCase((String)var30_31);
                                    if (var24_25 != 0) {
                                        var27_28.setShipmentCode((String)var22_23);
                                    }
                                } else {
                                    var18_19 = var24_25;
                                    var31_32 = var15_16;
                                }
                                if ((var30_31 = var27_28.getOrderEntry()) != null && (var30_31 = var30_31.getProduct()) != null) {
                                    var30_31 = var30_31.getImages();
                                } else {
                                    var24_25 = 0;
                                    var33_34 = 0.0f;
                                    var30_31 = null;
                                }
                                var6_6.setImageList((List)var30_31, (ArrayList)var11_11);
                                var32_33 = 6;
                                var30_31 = new pa2_0((Integer)var32_33, var27_28, var7_7 /* !! */ , var19_20);
                                var12_12.add(var30_31);
                                var24_25 = var18_19;
                                var23_24 = var29_30;
                                var15_16 = var31_32;
                            }
                            var31_32 = var15_16;
                            var18_19 = var24_25;
                        } else {
                            var31_32 = var15_16;
                        }
                        var15_16 = var31_32;
                    }
                    var16_17 = OrderDetailFunctionalRepo.consignmentSize;
                    if (var16_17 > 0) {
                        var25_26 = 1;
                        var19_20 = var25_26;
                        var24_25 = 8;
                        var33_34 = 1.1E-44f;
                        var22_23 = Integer.valueOf(var24_25);
                        var34_35 = 0;
                        var27_28 = null;
                        var17_18 = new pa2_0((Integer)var19_20, var22_23, null, null);
                        var12_12.add(var17_18);
                    } else {
                        var25_26 = 1;
                        var24_25 = 8;
                        var33_34 = 1.1E-44f;
                        var34_35 = 0;
                        var27_28 = null;
                    }
                    var16_17 = var18_19;
                } else {
                    var25_26 = 1;
                    var24_25 = 8;
                    var33_34 = 1.1E-44f;
                    var34_35 = 0;
                    var27_28 = null;
                    var16_17 = -1;
                }
                var22_23 = Integer.valueOf(var25_26);
                var26_27 = var24_25;
                var19_20 = new pa2_0((Integer)var22_23, var26_27, null, null);
                var10_10.add(var19_20);
                var26_27 = var1_1.getCode();
                var19_20 = "EX";
                var30_31 = "getCode(...)";
                if (var26_27 == null || (var25_26 = var26_27.length()) == 0) ** GOTO lbl-1000
                var26_27 = var1_1.getCode();
                Intrinsics.checkNotNullExpressionValue(var26_27, (String)var30_31);
                var23_24 = 0;
                var22_23 = null;
                var25_26 = (int)b.s((String)var26_27, (String)var19_20, false);
                if (var25_26 == 0) {
                    var23_24 = 3;
                    var22_23 = Integer.valueOf(var23_24);
                    var27_28 = "";
                    var15_16 = 0;
                    var32_33 = null;
                    var26_27 = new pa2_0((Integer)var22_23, var7_7 /* !! */ , null, var27_28);
                    var10_10.add(var26_27);
                } else lbl-1000:
                // 2 sources

                {
                    var15_16 = 0;
                    var32_33 = null;
                }
                var27_28 = 1;
                var28_29 = var19_20;
                var23_24 = 8;
                var19_20 = var23_24;
                var26_27 = new pa2_0((Integer)var27_28, var19_20, null, null);
                var10_10.add(var26_27);
                var25_26 = var12_12.size();
                if (var25_26 > 0) {
                    var25_26 = -1;
                    if (var16_17 > var25_26) {
                        OrderDetailFunctionalRepo.scrollPosition = var25_26 = var10_10.size() + var16_17;
                    }
                    var10_10.addAll((Collection<Object>)var12_12);
                }
                if (var13_14 == null) break block94;
                var25_26 = var13_14.size();
                var35_36 = 0;
                var36_37 = 0.0f;
                var12_12 = null;
                var19_20 = null;
                for (var37_38 = 0; var37_38 < var25_26; ++var37_38) {
                    block98: {
                        block95: {
                            var22_23 = var13_14.get(var37_38);
                            Intrinsics.checkNotNullExpressionValue(var22_23, var14_15);
                            var22_23 = ((Consignment)var22_23).getReturnRequests();
                            if (var22_23 == null || (var34_35 = var22_23.size()) <= 0) break block95;
                            var34_35 = var22_23.size();
                            var15_16 = var22_23.size();
                            var17_18 = null;
                            for (var16_17 = 0; var16_17 < var15_16; ++var16_17) {
                                block97: {
                                    block96: {
                                        var12_12 = var22_23.get(var16_17);
                                        var38_39 = var13_14;
                                        var13_14 = var12_12;
                                        var13_14 = (ReturnRequest)var12_12;
                                        var35_36 = OrderDetailFunctionalRepo.consignmentSize;
                                        var31_32 = var25_26;
                                        var25_26 = 0;
                                        var26_27 = null;
                                        var13_14.setOrderDetailData(var37_38, 0, var35_36);
                                        var12_12 = var13_14.getPickupAddress();
                                        if (var12_12 != null) {
                                            var12_12 = var13_14.getPickupAddress();
                                            var25_26 = (int)var13_14.isDroppedAtStore();
                                            var12_12.setDroppedAtStore((boolean)var25_26);
                                            var12_12.setPickupAddress(true);
                                            var25_26 = var13_14.isReturnonHold();
                                            var12_12.setReturnonHold((boolean)var25_26);
                                            var26_27 = var12_12;
                                            var39_40 = var22_23;
                                        } else {
                                            var39_40 = var22_23;
                                            var25_26 = 0;
                                            var26_27 = null;
                                        }
                                        var22_23 = new ArrayList();
                                        var12_12 = var13_14.getReturnEntries();
                                        var40_41 = var34_35;
                                        var27_28 = "RETURN CANCELLED";
                                        var41_42 = 0.0f;
                                        if (var12_12 == null || (var35_36 = (var12_12 = var13_14.getReturnEntries()).size()) <= 0 || (var35_36 = (int)var27_28.equalsIgnoreCase((String)(var12_12 = var13_14.getReturnStatus()))) != 0) break block96;
                                        var12_12 = var13_14.getReturnEntries();
                                        var42_43 = var15_16;
                                        var15_16 = var12_12.size();
                                        var43_44 = var30_31;
                                        var33_34 = 0.0f;
                                        var30_31 = null;
                                        for (var24_25 = 0; var24_25 < var15_16; ++var24_25) {
                                            var12_12 = (OrderDetailLineItem)var13_14.getReturnEntries().get(var24_25);
                                            var44_45 = OrderDetailFunctionalRepo.scrollPosition;
                                            if (var44_45 == 0 && var8_8 != null && (var44_45 = var2_2.length()) != 0) {
                                                if (var12_12 != null && (var45_46 = var12_12.getEntry()) != null && (var45_46 = var45_46.getProduct()) != null) {
                                                    var45_46 = var45_46.getCode();
                                                    var44_45 = var15_16;
                                                    var32_33 = var45_46;
                                                } else {
                                                    var44_45 = var15_16;
                                                    var15_16 = 0;
                                                    var32_33 = null;
                                                }
                                                var15_16 = (int)Intrinsics.areEqual(var8_8, var32_33);
                                                if (var15_16 != 0) {
                                                    OrderDetailFunctionalRepo.scrollPosition = var15_16 = var10_10.size();
                                                }
                                            } else {
                                                var44_45 = var15_16;
                                            }
                                            if (var4_4) {
                                                var32_33 = var12_12.getEntry().getProduct();
                                                Y63.g((Product)var32_33);
                                            }
                                            var15_16 = var13_14.getReturnEntries().size();
                                            var12_12.setOrderDetailData(var37_38, var24_25, var15_16);
                                            var22_23.add(var12_12);
                                            var32_33 = var12_12.getEntry();
                                            if (var32_33 != null && (var32_33 = var32_33.getProduct()) != null) {
                                                var32_33 = var32_33.getImages();
                                            } else {
                                                var15_16 = 0;
                                                var32_33 = null;
                                            }
                                            var6_6.setImageList((List)var32_33, (ArrayList)var11_11);
                                            if (var5_5) ** GOTO lbl-1000
                                            var15_16 = (int)var1_1.isReturnRevampNewFlowEnabled();
                                            if ((var15_16 = var6_6.checkIfDisplayOlderUi((boolean)var15_16)) != 0) {
                                                var46_47 = var11_11;
                                                var21_22 = 8;
                                                var11_11 = var21_22;
                                                var32_33 = new pa2_0((Integer)var11_11, var12_12, var7_7 /* !! */ , var13_14);
                                                var10_10.add(var32_33);
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var46_47 = var11_11;
                                            }
                                            var11_11 = var12_12.getAmount();
                                            if (var11_11 != null && (var47_48 = b.k((CharSequence)var11_11)) == 0) {
                                                var12_12 = var12_12.getAmount();
                                                var11_11 = "getAmount(...)";
                                                try {
                                                    Intrinsics.checkNotNullExpressionValue(var12_12, (String)var11_11);
                                                    var36_37 = Float.parseFloat((String)var12_12);
                                                    var41_42 += var36_37;
                                                }
                                                catch (NumberFormatException var12_13) {
                                                    var11_11 = yn3_0.a;
                                                    var11_11.e(var12_13);
                                                }
                                            }
                                            var15_16 = var44_45;
                                            var11_11 = var46_47;
                                        }
                                        var46_47 = var11_11;
                                        var12_12 = var13_14.getRefundAmountSection();
                                        if (var12_12 != null) {
                                            var12_12 = var13_14.getRefundAmountSection();
                                            if (var12_12 != null && (var12_12 = var12_12.getRefundAmount()) != null) {
                                                var36_37 = var12_12.floatValue();
                                                var35_36 = (int)var36_37;
                                            } else {
                                                var35_36 = 0;
                                                var36_37 = 0.0f;
                                                var12_12 = null;
                                            }
                                            if (var35_36 > 0 && (var35_36 = (int)var27_28.equalsIgnoreCase((String)(var12_12 = var13_14.getReturnStatus()))) == 0 && !var5_5 && (var35_36 = (int)var1_1.isReturnRevampNewFlowEnabled()) != 0 && (var35_36 = (int)hv3_0.D()) != 0) {
                                                var47_48 = 17;
                                                var11_11 = var47_48;
                                                var12_12 = new pa2_0((Integer)var11_11, var22_23, var7_7 /* !! */ , var13_14);
                                                var10_10.add(var12_12);
                                            }
                                        }
                                        var36_37 = var41_42;
                                        break block97;
                                    }
                                    var46_47 = var11_11;
                                    var43_44 = var30_31;
                                    var42_43 = var15_16;
                                    var35_36 = 0;
                                    var36_37 = 0.0f;
                                    var12_12 = null;
                                }
                                var13_14.setTotalAmount(var36_37);
                                if (var26_27 != null && !var5_5 && (var35_36 = (int)var27_28.equalsIgnoreCase((String)(var12_12 = var13_14.getReturnStatus()))) == 0) {
                                    var35_36 = (int)var1_1.isReturnRevampNewFlowEnabled();
                                    if ((var35_36 = var6_6.checkIfDisplayOlderUi((boolean)var35_36)) != 0) {
                                        var30_31 = 1;
                                        var22_23 = Integer.valueOf(8);
                                        var47_48 = 0;
                                        var11_11 = null;
                                        var12_12 = new pa2_0((Integer)var30_31, var22_23, null, null);
                                        var10_10.add(var12_12);
                                        var24_25 = 2;
                                        var33_34 = 2.8E-45f;
                                        var22_23 = Integer.valueOf(var24_25);
                                        var12_12 = new pa2_0((Integer)var22_23, var26_27, null, null);
                                        var10_10.add(var12_12);
                                    }
                                }
                                if (!var5_5 && (var35_36 = (int)var27_28.equalsIgnoreCase((String)(var12_12 = var13_14.getReturnStatus()))) == 0) {
                                    var13_14 = 1;
                                    var26_27 = 8;
                                    var47_48 = 0;
                                    var11_11 = null;
                                    var12_12 = new pa2_0((Integer)var13_14, var26_27, null, null);
                                    var10_10.add(var12_12);
                                }
                                var13_14 = var38_39;
                                var25_26 = var31_32;
                                var22_23 = var39_40;
                                var34_35 = var40_41;
                                var15_16 = var42_43;
                                var30_31 = var43_44;
                                var11_11 = var46_47;
                            }
                            var46_47 = var11_11;
                            var38_39 = var13_14;
                            var31_32 = var25_26;
                            var43_44 = var30_31;
                            var40_41 = var34_35;
                            var35_36 = var34_35;
                            break block98;
                        }
                        var46_47 = var11_11;
                        var38_39 = var13_14;
                        var31_32 = var25_26;
                        var43_44 = var30_31;
                    }
                    var13_14 = var38_39;
                    var25_26 = var31_32;
                    var30_31 = var43_44;
                    var11_11 = var46_47;
                }
                var46_47 = var11_11;
                var43_44 = var30_31;
                if (var35_36 > 0 && !var5_5) {
                    var13_14 = 1;
                    var17_18 = 8;
                    var47_48 = 0;
                    var11_11 = null;
                    var12_12 = new pa2_0((Integer)var13_14, var17_18, null, null);
                    var10_10.add(var12_12);
                }
                break block99;
            }
            var46_47 = var11_11;
            var43_44 = var30_31;
        }
        if ((var12_12 = var1_1.getConfirmedEntries()) != null) {
            var47_48 = var12_12.size();
            var48_49 = 0;
            var13_14 = null;
            var16_17 = 0;
            var17_18 = null;
            var25_26 = 0;
            var26_27 = null;
            while (var48_49 < var47_48) {
                var19_20 = var12_12.get(var48_49);
                Intrinsics.checkNotNullExpressionValue(var19_20, var14_15);
                var19_20 = (OrderDetailLineItem)var19_20;
                if (var16_17 == 0 && var25_26 == 0) {
                    var16_17 = var48_49;
                } else {
                    var16_17 = 0;
                    var17_18 = null;
                }
                var49_50 = var19_20.getEpochPSD();
                var51_51 = System.currentTimeMillis();
                var25_26 = (int)(var49_50 == var51_51 ? 0 : (var49_50 < var51_51 ? -1 : 1));
                if (var25_26 < 0) {
                    var25_26 = 1;
                } else {
                    var25_26 = 0;
                    var26_27 = null;
                }
                var49_50 = var19_20.getEpochEddUpper();
                var51_51 = System.currentTimeMillis();
                var24_25 = (int)(var49_50 == var51_51 ? 0 : (var49_50 < var51_51 ? -1 : 1));
                if (var24_25 < 0) {
                    var24_25 = 1;
                    var33_34 = 1.4E-45f;
                } else {
                    var24_25 = 0;
                    var33_34 = 0.0f;
                    var30_31 = null;
                }
                if (!var9_9) {
                    var25_26 = 0;
                    var26_27 = null;
                    var24_25 = 0;
                    var33_34 = 0.0f;
                    var30_31 = null;
                }
                if (var25_26 != 0 || var24_25 != 0) {
                    var16_17 = 0;
                    var17_18 = null;
                }
                var23_24 = OrderDetailFunctionalRepo.consignmentSize;
                var19_20.setOrderDetailData(var48_49, var16_17, var23_24);
                if (var4_4) {
                    var17_18 = var19_20.getEntry().getProduct();
                    Y63.g((Product)var17_18);
                }
                if ((var16_17 = OrderDetailFunctionalRepo.scrollPosition) == 0) {
                    if (var8_8 != null && (var16_17 = var2_2.length()) != 0) {
                        var16_17 = 0;
                        var17_18 = null;
                    } else {
                        var16_17 = 1;
                    }
                    if (var16_17 == 0) {
                        var17_18 = var19_20.getEntry();
                        if (var17_18 != null && (var17_18 = var17_18.getProduct()) != null) {
                            var17_18 = var17_18.getCode();
                        } else {
                            var16_17 = 0;
                            var17_18 = null;
                        }
                        var16_17 = (int)Intrinsics.areEqual(var8_8, var17_18);
                        if (var16_17 != 0) {
                            var16_17 = var10_10.size();
                            var23_24 = 1;
                            OrderDetailFunctionalRepo.scrollPosition = var16_17 += var23_24;
                        }
                    }
                }
                if ((var17_18 = var19_20.getEntry()) != null && (var17_18 = var17_18.getProduct()) != null) {
                    var17_18 = var17_18.getImages();
                    var22_23 = var46_47;
                } else {
                    var22_23 = var46_47;
                    var16_17 = 0;
                    var17_18 = null;
                }
                var6_6.setImageList((List)var17_18, (ArrayList)var22_23);
                if (!var5_5) {
                    var34_35 = 5;
                    var27_28 = var34_35;
                    var15_16 = 0;
                    var32_33 = null;
                    var17_18 = new pa2_0((Integer)var27_28, var19_20, var7_7 /* !! */ , null);
                    var10_10.add(var17_18);
                }
                var16_17 = (int)var6_6.isNextEddBreached((ArrayList)var12_12, ++var48_49, (boolean)var9_9);
                if (var25_26 == 0 && var24_25 == 0 && (var16_17 == 0 || var5_5)) {
                    var15_16 = 0;
                    var32_33 = null;
                } else {
                    var37_38 = 1;
                    var27_28 = var37_38;
                    var19_20 = 8;
                    var15_16 = 0;
                    var32_33 = null;
                    var17_18 = new pa2_0((Integer)var27_28, var19_20, null, null);
                    var10_10.add(var17_18);
                }
                var16_17 = var25_26;
                var25_26 = var24_25;
                var46_47 = var22_23;
            }
            var22_23 = var46_47;
            var15_16 = 0;
            var32_33 = null;
            if (var16_17 == 0 && (var35_36 = var12_12.size()) > 0 && !var5_5) {
                var11_11 = 1;
                var9_9 = 8;
                var13_14 = var9_9;
                var12_12 = new pa2_0((Integer)var11_11, var13_14, null, null);
                var10_10.add(var12_12);
            }
        } else {
            var22_23 = var46_47;
        }
        if ((var12_12 = var1_1.getCancelledEntries()) != null) {
            var9_9 = var12_12.size();
            var11_11 = null;
            for (var47_48 = 0; var47_48 < var9_9; ++var47_48) {
                var13_14 = var12_12.get(var47_48);
                Intrinsics.checkNotNullExpressionValue(var13_14, var14_15);
                var13_14 = (OrderDetailLineItem)var13_14;
                var16_17 = OrderDetailFunctionalRepo.consignmentSize;
                var25_26 = 0;
                var26_27 = null;
                var13_14.setOrderDetailData(var47_48, 0, var16_17);
                if (var4_4) {
                    var17_18 = var13_14.getEntry().getProduct();
                    Y63.g((Product)var17_18);
                }
                var17_18 = var13_14.getEntry().getProduct().getImages();
                var6_6.setImageList((List)var17_18, (ArrayList)var22_23);
                var16_17 = OrderDetailFunctionalRepo.scrollPosition;
                if (var16_17 == 0) {
                    if (var8_8 != null && (var16_17 = var2_2.length()) != 0) {
                        var16_17 = 0;
                        var17_18 = null;
                    } else {
                        var16_17 = 1;
                    }
                    if (var16_17 == 0) {
                        var17_18 = var13_14.getEntry();
                        if (var17_18 != null && (var17_18 = var17_18.getProduct()) != null) {
                            var17_18 = var17_18.getCode();
                        } else {
                            var16_17 = 0;
                            var17_18 = null;
                        }
                        var16_17 = (int)Intrinsics.areEqual(var8_8, var17_18);
                        if (var16_17 != 0) {
                            OrderDetailFunctionalRepo.scrollPosition = var16_17 = var10_10.size();
                        }
                    }
                }
                if (var5_5) continue;
                var25_26 = 10;
                var26_27 = var25_26;
                var37_38 = 0;
                var19_20 = null;
                var17_18 = new pa2_0((Integer)var26_27, var13_14, var7_7 /* !! */ , null);
                var10_10.add(var17_18);
            }
            var35_36 = var12_12.size();
            if (var35_36 > 0 && !var5_5) {
                var53_52 = 1;
                var54_53 = 6;
                var8_8 = var54_53;
                var47_48 = 0;
                var11_11 = null;
                var12_12 = new pa2_0((Integer)var53_52, var8_8, null, null);
                var10_10.add(var12_12);
            }
        }
        if ((var12_12 = var1_1.getCode()) != null && (var35_36 = var12_12.length()) != 0) {
            var35_36 = 0;
            var36_37 = 0.0f;
            var12_12 = null;
        } else {
            var35_36 = 1;
            var36_37 = 1.4E-45f;
        }
        if (var35_36 != 0) ** GOTO lbl-1000
        var12_12 = var1_1.getCode();
        var8_8 = var43_44;
        Intrinsics.checkNotNullExpressionValue(var12_12, (String)var43_44);
        var53_52 = var28_29;
        var54_53 = 0;
        var8_8 = null;
        var35_36 = (int)b.s((String)var12_12, (String)var28_29, false);
        if (var35_36 == 0) {
            var54_53 = 4;
            var8_8 = var54_53;
            var9_9 = 0;
            var53_52 = null;
            var12_12 = new pa2_0((Integer)var8_8, null, var7_7 /* !! */ , null);
            var10_10.add(var12_12);
        } else lbl-1000:
        // 2 sources

        {
            var9_9 = 0;
            var53_52 = null;
        }
        var54_53 = 1;
        var11_11 = var54_53;
        var48_49 = 8;
        var17_18 = var48_49;
        var12_12 = new pa2_0((Integer)var11_11, var17_18, null, null);
        var10_10.add(var12_12);
        var47_48 = 2;
        var11_11 = var47_48;
        var7_7 /* !! */  = var1_1.getDeliveryAddress();
        var12_12 = new pa2_0((Integer)var11_11, var7_7 /* !! */ , null, null);
        var10_10.add(var12_12);
        var7_7 /* !! */  = Integer.valueOf(var54_53);
        var8_8 = var48_49;
        var12_12 = new pa2_0((Integer)var7_7 /* !! */ , var8_8, null, null);
        var10_10.add(var12_12);
        if (var5_5) {
            var55_54 = 18;
            var7_7 /* !! */  = Integer.valueOf(var55_54);
            var12_12 = new pa2_0((Integer)var7_7 /* !! */ , var22_23, null, null);
            var10_10.add(var12_12);
        } else {
            var55_55 = 11;
            var7_7 /* !! */  = Integer.valueOf(var55_55);
            var54_53 = 0;
            var8_8 = 0;
            var12_12 = new pa2_0((Integer)var7_7 /* !! */ , var8_8, null, null);
            var10_10.add(var12_12);
        }
        return var10_10;
    }

    public final String getPaymentMode(CartOrder object) {
        object = object != null ? ((CartOrder)object).getPaymentMode() : null;
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final ArrayList getReturnDetailList(CartOrder var1_1, String var2_2) {
        block66: {
            var3_3 = var1_1;
            var4_4 = var2_2;
            var5_5 = new HashMap<K, V>();
            var6_6 = new ArrayList();
            if (var1_1 != null) {
                var7_8 = var1_1.getConsignmentsData();
                var8_9 = var7_8;
            } else {
                var8_9 = null;
            }
            if (var8_9 == null) break block66;
            var9_10 = var8_9.size();
            var10_11 = var6_6;
            block3: for (var11_12 = 0; var11_12 < var9_10; ++var11_12) {
                block67: {
                    var6_6 = var8_9.get(var11_12);
                    var7_8 = "get(...)";
                    Intrinsics.checkNotNullExpressionValue(var6_6, (String)var7_8);
                    var12_13 /* !! */  = var6_6;
                    var12_13 /* !! */  = (Consignment)var6_6;
                    var12_13 /* !! */ .setShipmentPosition(var11_12);
                    var6_6 = var12_13 /* !! */ .getReturnRequests();
                    if (var6_6 == null || (var13_14 = var6_6.size()) <= 0) break block67;
                    var6_6.size();
                    var13_14 = var6_6.size();
                    var15_16 = null;
                    for (var14_15 = 0; var14_15 < var13_14; ++var14_15) {
                        block68: {
                            block71: {
                                block72: {
                                    block69: {
                                        block70: {
                                            var17_18 = var16_17 = var6_6.get(var14_15);
                                            var17_18 = (ReturnRequest)var16_17;
                                            if (var4_4 == null || (var18_19 = var2_2.length()) == 0 || (var18_19 = (int)Intrinsics.areEqual(var4_4, var16_17 = var17_18.getReturnId())) == 0) break block68;
                                            OrderDetailFunctionalRepo.returnRequest = var17_18;
                                            var6_6 = var17_18.getPickupAddress();
                                            var19_20 = true;
                                            if (var6_6 != null) {
                                                var6_6 = var17_18.getPickupAddress();
                                                var13_14 = (int)var17_18.isDroppedAtStore();
                                                var6_6.setDroppedAtStore((boolean)var13_14);
                                                var6_6.setPickupAddress(var19_20);
                                                var13_14 = var17_18.isReturnonHold();
                                                var6_6.setReturnonHold((boolean)var13_14);
                                            }
                                            var6_6 = var17_18.getReturnEntries();
                                            var16_17 = "RETURN CANCELLED";
                                            if (var6_6 != null && (var20_21 = (var6_6 = var17_18.getReturnEntries()).size()) > 0) {
                                                var6_6 = var17_18.getReturnEntries();
lbl44:
                                                // 2 sources

                                                while (true) {
                                                    var7_8 = var6_6;
                                                    break;
                                                }
                                            } else {
                                                var6_6 = var17_18.getReturnStatus();
                                                var20_21 = (int)var16_17.equalsIgnoreCase((String)var6_6);
                                                if (var20_21 != 0) {
                                                    var6_6 = var17_18.getReturnCancelledEntries();
                                                    ** continue;
                                                }
                                                var13_14 = 0;
                                                var7_8 = null;
                                            }
                                            var20_21 = 0;
                                            var21_22 = 0.0f;
                                            var6_6 = null;
                                            if (var7_8 == null) ** GOTO lbl-1000
                                            var15_16 = var7_8;
                                            var15_16 = (Collection)var7_8;
                                            var22_23 = var15_16.isEmpty() ^ true;
                                            if (var22_23) {
                                                var23_24 = new ArrayList();
                                                var14_15 = var15_16.size();
                                                var25_26 = null;
                                                var26_27 = 0.0f;
                                                for (var24_25 = 0; var24_25 < var14_15; ++var24_25) {
                                                    var6_6 = (OrderDetailLineItem)var7_8.get(var24_25);
                                                    var27_28 = var6_6.getEntry();
                                                    var28_29 = var27_28.getReturnFee();
                                                    var3_3.setCartOrderReturnFee((String)var28_29);
                                                    var28_29 = a21.a;
                                                    var29_30 = var14_15;
                                                    var15_16 = var6_6.getEntry();
                                                    var28_29.getClass();
                                                    a21.a((CartEntry)var15_16, var5_5);
                                                    var14_15 = var7_8.size();
                                                    var6_6.setOrderDetailData(var11_12, var24_25, var14_15);
                                                    var15_16 = var6_6.getEntry();
                                                    var28_29 = "getEntry(...)";
                                                    Intrinsics.checkNotNullExpressionValue(var15_16, (String)var28_29);
                                                    a21.b((ArrayList)var23_24, (CartEntry)var15_16);
                                                    var15_16 = var6_6.getAmount();
                                                    if (var15_16 != null && (var14_15 = (int)b.k((CharSequence)var15_16)) == 0) {
                                                        var6_6 = var6_6.getAmount();
                                                        var15_16 = "getAmount(...)";
                                                        try {
                                                            Intrinsics.checkNotNullExpressionValue(var6_6, (String)var15_16);
                                                            var21_22 = Float.parseFloat((String)var6_6);
                                                            var26_27 += var21_22;
                                                        }
                                                        catch (NumberFormatException var6_7) {
                                                            var15_16 = yn3_0.a;
                                                            var15_16.e(var6_7);
                                                        }
                                                    }
                                                    var14_15 = var29_30;
                                                }
                                                var13_14 = 8;
                                                var15_16 = var13_14;
                                                var7_8 = var6_6;
                                                var28_29 = var16_17;
                                                var16_17 = var23_24;
                                                var24_25 = 1;
                                                var23_24 = var1_1;
                                                var30_31 = var17_18;
                                                var25_26 = var12_13 /* !! */ ;
                                                var12_13 /* !! */  = var5_5;
                                                var6_6 = new pa2_0((Integer)var15_16, var16_17, var1_1, var17_18, var5_5);
                                                var10_11.add(var6_6);
                                                var21_22 = var26_27;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var28_29 = var16_17;
                                                var30_31 = var17_18;
                                                var25_26 = var12_13 /* !! */ ;
                                            }
                                            var7_8 = var30_31.getReturnOrderTracker();
                                            if (var7_8 != null && (var13_14 = (var7_8 = var30_31.getReturnOrderTracker()).size()) > 0) {
                                                var14_15 = 12;
                                                var15_16 = var14_15;
                                                var16_17 = var30_31.getReturnOrderTracker();
                                                var23_24 = var30_31;
                                                var7_8 = new pa2_0((Integer)var15_16, var16_17, var3_3, var30_31);
                                                var10_11.add(var7_8);
                                            } else {
                                                var23_24 = var30_31;
                                            }
                                            var7_8 = var23_24.getNextStepsSection();
                                            if (var7_8 != null && (var13_14 = (int)no_2.h(var1_1)) != 0) {
                                                var14_15 = 23;
                                                var15_16 = var14_15;
                                                var16_17 = var23_24.getNextStepsSection();
                                                var7_8 = new pa2_0((Integer)var15_16, var16_17, var3_3, var25_26);
                                                var10_11.add(var7_8);
                                            }
                                            if ((var13_14 = (int)var25_26.isReturnableExchangeable()) == 0) {
                                                var7_8 = var25_26.getShipmentStatus();
                                                Intrinsics.checkNotNullExpressionValue(var7_8, "getShipmentStatus(...)");
                                                var15_16 = Locale.ENGLISH;
                                                var16_17 = "ENGLISH";
                                                var17_18 = "toLowerCase(...)";
                                                var7_8 = zn0_1.a((Locale)var15_16, (String)var16_17, (String)var7_8, (Locale)var15_16, (String)var17_18);
                                                var15_16 = "delivered";
                                                var13_14 = (int)Intrinsics.areEqual(var7_8, var15_16);
                                                if (var13_14 != 0 && (var13_14 = (int)no_2.h(var1_1)) == 0) {
                                                    var14_15 = 16;
                                                    var15_16 = var14_15;
                                                    var16_17 = var1_1.getReturnQuickInfoUrl();
                                                    var31_32 = 0;
                                                    var17_18 = null;
                                                    var7_8 = new pa2_0((Integer)var15_16, var16_17, null, null);
                                                    var10_11.add(var7_8);
                                                }
                                            }
                                            Intrinsics.checkNotNull(var23_24);
                                            var16_17 = this;
                                            var7_8 = this.checkForSelfShipFlow((ReturnRequest)var23_24);
                                            var15_16 = var7_8;
                                            var15_16 = (Collection)var7_8;
                                            var31_32 = var15_16.isEmpty();
                                            var32_33 = 1;
                                            if ((var31_32 ^= var32_33) != 0 && (var31_32 = var7_8.size()) == var32_33) {
                                                var32_33 = 20;
                                                var12_13 /* !! */  = var32_33;
                                                var16_17 = var23_24.getWarehouseAddress();
                                                var17_18 = new pa2_0((Integer)var12_13 /* !! */ , var16_17, var3_3, var4_4);
                                                var10_11.add(var17_18);
                                            }
                                            var16_17 = var23_24.getRefundAmountSection();
                                            var31_32 = 13;
                                            if (var16_17 == null) ** GOTO lbl-1000
                                            var16_17 = var23_24.getRefundAmountSection();
                                            if (var16_17 != null) {
                                                var16_17 = var16_17.isReturnCancelled();
                                                var12_13 /* !! */  = Boolean.TRUE;
                                                var18_19 = (int)Intrinsics.areEqual(var16_17, var12_13 /* !! */ );
                                            } else {
                                                var18_19 = 0;
                                                var16_17 = null;
                                            }
                                            if (var18_19 != 0) {
                                                var16_17 = var23_24.getRefundAmountSection();
                                                if (var16_17 != null) {
                                                    var16_17 = var16_17.isWindowAvailable();
                                                    var12_13 /* !! */  = Boolean.TRUE;
                                                    var18_19 = (int)Intrinsics.areEqual(var16_17, var12_13 /* !! */ );
                                                } else {
                                                    var18_19 = 0;
                                                    var16_17 = null;
                                                }
                                                if (var18_19 != 0) {
                                                    var17_18 = var31_32;
                                                    var12_13 /* !! */  = var23_24.getRefundAmountSection();
                                                    var16_17 = new pa2_0((Integer)var17_18, var12_13 /* !! */ , var3_3, var23_24);
                                                    var10_11.add(var16_17);
                                                }
                                            } else if ((var16_17 = var23_24.getRefundAmountSection()) != null) {
                                                var16_17 = var23_24.getRefundAmountSection();
                                                if (var16_17 != null) {
                                                    var16_17 = var16_17.isReturnCancelled();
                                                    var12_13 /* !! */  = Boolean.TRUE;
                                                    var18_19 = (int)Intrinsics.areEqual(var16_17, var12_13 /* !! */ );
                                                } else {
                                                    var18_19 = 0;
                                                    var16_17 = null;
                                                }
                                                if (var18_19 == 0) {
                                                    var17_18 = var31_32;
                                                    var12_13 /* !! */  = var23_24.getRefundAmountSection();
                                                    var16_17 = new pa2_0((Integer)var17_18, var12_13 /* !! */ , var3_3, var23_24);
                                                    var10_11.add(var16_17);
                                                }
                                            }
                                            var16_17 = var23_24.getRefundCancelReturnSection();
                                            var31_32 = 15;
                                            if (var16_17 == null) break block69;
                                            var16_17 = var23_24.getRefundCancelReturnSection();
                                            if (var16_17 != null) {
                                                var16_17 = var16_17.isReturnCancelled();
                                                var12_13 /* !! */  = Boolean.TRUE;
                                                var18_19 = (int)Intrinsics.areEqual(var16_17, var12_13 /* !! */ );
                                            } else {
                                                var18_19 = 0;
                                                var16_17 = null;
                                            }
                                            if (var18_19 == 0) break block69;
                                            var16_17 = var23_24.getRefundCancelReturnSection().getHeaderMessage();
                                            if (var16_17 != null && (var18_19 = var16_17.length()) != 0) {
                                                var18_19 = 0;
                                                var16_17 = null;
                                            } else {
                                                var18_19 = 1;
                                            }
                                            if (var18_19 == 0) break block70;
                                            var16_17 = var23_24.getRefundCancelReturnSection().getBodyContent();
                                            if (var16_17 != null && (var18_19 = (int)var16_17.isEmpty()) == 0) {
                                                var18_19 = 0;
                                                var16_17 = null;
                                            } else {
                                                var18_19 = 1;
                                            }
                                            if (var18_19 != 0) break block71;
                                        }
                                        if ((var16_17 = var23_24.getRefundCancelReturnSection()) != null) {
                                            var16_17 = var16_17.isWindowAvailable();
                                            var12_13 /* !! */  = Boolean.TRUE;
                                            var18_19 = (int)Intrinsics.areEqual(var16_17, var12_13 /* !! */ );
                                        } else {
                                            var18_19 = 0;
                                            var16_17 = null;
                                        }
                                        if (var18_19 != 0) {
                                            var17_18 = var31_32;
                                            var12_13 /* !! */  = var23_24.getRefundCancelReturnSection();
                                            var16_17 = new pa2_0((Integer)var17_18, var12_13 /* !! */ , var3_3, var25_26);
                                            var10_11.add(var16_17);
                                        }
                                        break block71;
                                    }
                                    if ((var16_17 = var23_24.getRefundCancelReturnSection()) == null) break block71;
                                    var16_17 = var23_24.getRefundCancelReturnSection().getHeaderMessage();
                                    if (var16_17 != null && (var18_19 = var16_17.length()) != 0) {
                                        var18_19 = 0;
                                        var16_17 = null;
                                    } else {
                                        var18_19 = 1;
                                    }
                                    if (var18_19 == 0) break block72;
                                    var16_17 = var23_24.getRefundCancelReturnSection().getBodyContent();
                                    if (var16_17 != null && (var18_19 = (int)var16_17.isEmpty()) == 0) {
                                        var18_19 = 0;
                                        var16_17 = null;
                                    } else {
                                        var18_19 = 1;
                                    }
                                    if (var18_19 != 0) break block71;
                                }
                                var17_18 = var31_32;
                                var12_13 /* !! */  = var23_24.getRefundCancelReturnSection();
                                var16_17 = new pa2_0((Integer)var17_18, var12_13 /* !! */ , var3_3, var25_26);
                                var10_11.add(var16_17);
                            }
                            if ((var16_17 = var23_24.getRefundPickupSection()) != null && (var16_17 = var23_24.getRefundPickupSection().getPickUpHeader()) != null && (var16_17 = var23_24.getRefundPickupSection().getBodyContent()) != null) {
                                var16_17 = var23_24.getRefundPickupSection().getBodyContent();
                                Intrinsics.checkNotNull(var16_17);
                                var18_19 = var16_17.size();
                                if (var18_19 > 0) {
                                    var31_32 = 14;
                                    var17_18 = var31_32;
                                    var12_13 /* !! */  = var23_24.getRefundPickupSection();
                                    var16_17 = new pa2_0((Integer)var17_18, var12_13 /* !! */ , var3_3, var23_24);
                                    var10_11.add(var16_17);
                                }
                            }
                            var16_17 = var23_24.getReturnStatus();
                            var18_19 = (int)var28_29.equalsIgnoreCase((String)var16_17);
                            var31_32 = 2;
                            if (var18_19 != 0 && (var16_17 = var23_24.getReturnCancelPickupAddress()) != null) {
                                var12_13 /* !! */  = var31_32;
                                var28_29 = var23_24.getReturnCancelPickupAddress();
                                var24_25 = 0;
                                var25_26 = null;
                                var16_17 = new pa2_0((Integer)var12_13 /* !! */ , var28_29, null, null);
                                var10_11.add(var16_17);
                            } else {
                                var24_25 = 0;
                                var25_26 = null;
                                var16_17 = var23_24.getPickupAddress();
                                if (var16_17 != null) {
                                    var12_13 /* !! */  = var31_32;
                                    var28_29 = var23_24.getPickupAddress();
                                    var16_17 = new pa2_0((Integer)var12_13 /* !! */ , var28_29, null, null);
                                    var10_11.add(var16_17);
                                } else {
                                    var12_13 /* !! */  = var31_32;
                                    var28_29 = var1_1.getDeliveryAddress();
                                    var16_17 = new pa2_0((Integer)var12_13 /* !! */ , var28_29, null, null);
                                    var10_11.add(var16_17);
                                }
                            }
                            var14_15 = (int)var15_16.isEmpty();
                            var18_19 = 1;
                            if ((var14_15 ^= var18_19) != 0) {
                                var15_16 = new ArrayList();
                                var16_17 = var10_11.iterator();
                                while ((var32_33 = (int)var16_17.hasNext()) != 0) {
                                    var12_13 /* !! */  = var16_17.next();
                                    var28_29 = var12_13 /* !! */ ;
                                    var28_29 = ((pa2_0)var12_13 /* !! */ ).a;
                                    if (var28_29 == null || (var33_34 = var28_29.intValue()) != var31_32) {
                                        var33_34 = 1;
                                    } else {
                                        var33_34 = 0;
                                        var28_29 = null;
                                    }
                                    if (var33_34 == 0) continue;
                                    var15_16.add(var12_13 /* !! */ );
                                }
                                var13_14 = var7_8.size();
                                if (var13_14 > (var18_19 = 1)) {
                                    var18_19 = 21;
                                    var16_17 = var18_19;
                                    var17_18 = var23_24.getWarehouseAddress();
                                    var32_33 = 0;
                                    var12_13 /* !! */  = null;
                                    var7_8 = new pa2_0((Integer)var16_17, var17_18, null, null);
                                    var15_16.add(var7_8);
                                } else {
                                    var32_33 = 0;
                                    var12_13 /* !! */  = null;
                                }
                                var10_11 = var15_16;
                            } else {
                                var32_33 = 0;
                                var12_13 /* !! */  = null;
                            }
                            var15_16 = 19;
                            var7_8 = new pa2_0((Integer)var15_16, null, null, null);
                            var10_11.add(var7_8);
                            var14_15 = 22;
                            var15_16 = var14_15;
                            var7_8 = new pa2_0((Integer)var15_16, null, var3_3, var23_24);
                            var10_11.add(var7_8);
                            var23_24.setTotalAmount(var21_22);
                            continue block3;
                        }
                        var25_26 = var12_13 /* !! */ ;
                        var32_33 = 0;
                    }
                }
                var32_33 = 0;
                var12_13 /* !! */  = null;
            }
            var6_6 = var10_11;
        }
        return var6_6;
    }

    public final ReturnRequest getReturnObject(CartOrder serializable, String string2) {
        ReturnRequest returnRequest = null;
        if ((serializable = serializable != null ? ((CartOrder)serializable).getConsignmentsData() : null) != null) {
            int n3 = serializable.size();
            block0: for (int i3 = 0; i3 < n3; ++i3) {
                int n4;
                Object object = ((ArrayList)serializable).get(i3);
                String string3 = "get(...)";
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object = (Consignment)object;
                ((Consignment)object).setShipmentPosition(i3);
                object = ((Consignment)object).getReturnRequests();
                if (object == null || (n4 = ((ArrayList)object).size()) <= 0) continue;
                n4 = object.size();
                for (int i8 = 0; i8 < n4; ++i8) {
                    String string4;
                    int n7;
                    ReturnRequest returnRequest2 = (ReturnRequest)((ArrayList)object).get(i8);
                    if (string2 == null || (n7 = string2.length()) == 0 || (n7 = (int)(Intrinsics.areEqual(string2, string4 = returnRequest2.getReturnId()) ? 1 : 0)) == 0) continue;
                    returnRequest = returnRequest2;
                    continue block0;
                }
            }
        }
        return returnRequest;
    }

    public final String getReturnOrderRawStatus(CartOrder serializable, String string2) {
        String string3 = null;
        if ((serializable = serializable != null ? ((CartOrder)serializable).getConsignmentsData() : null) != null) {
            int n3 = serializable.size();
            block0: for (int i3 = 0; i3 < n3; ++i3) {
                int n4;
                Object object = ((ArrayList)serializable).get(i3);
                Intrinsics.checkNotNullExpressionValue(object, "get(...)");
                object = (Consignment)object;
                ((Consignment)object).setShipmentPosition(i3);
                ArrayList arrayList = ((Consignment)object).getReturnRequests();
                if (arrayList == null || (n4 = arrayList.size()) <= 0) continue;
                n4 = arrayList.size();
                for (int i8 = 0; i8 < n4; ++i8) {
                    boolean bl2;
                    int n7;
                    Object object2 = (ReturnRequest)arrayList.get(i8);
                    if (string2 == null || (n7 = string2.length()) == 0 || !(bl2 = Intrinsics.areEqual(string2, object2 = ((ReturnRequest)object2).getReturnId()))) continue;
                    string3 = ((Consignment)object).getStatus();
                    continue block0;
                }
            }
        }
        return string3;
    }

    public final ReturnRequest getReturnRequest() {
        return returnRequest;
    }

    public final ReturnRequestCancelledPopUp getReturnRequestCancelledPopUpData(CartOrder cartOrder, String string2) {
        ArrayList arrayList = cartOrder != null ? cartOrder.getConsignmentsData() : null;
        if (arrayList != null) {
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4;
                Object object = arrayList.get(i3);
                String string3 = "get(...)";
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object = (Consignment)object;
                ((Consignment)object).setShipmentPosition(i3);
                object = ((Consignment)object).getReturnRequests();
                if (object == null || (n4 = ((ArrayList)object).size()) <= 0) continue;
                n4 = object.size();
                for (int i8 = 0; i8 < n4; ++i8) {
                    Object object2;
                    int n7;
                    ReturnRequest returnRequest = (ReturnRequest)((ArrayList)object).get(i8);
                    if (string2 == null || (n7 = string2.length()) == 0 || (n7 = (int)(Intrinsics.areEqual(string2, object2 = returnRequest.getReturnId()) ? 1 : 0)) == 0 || (object2 = returnRequest.getReturnRequestCancelledPopUp()) == null || (n7 = (int)(no_2.h(cartOrder) ? 1 : 0)) == 0) continue;
                    return returnRequest.getReturnRequestCancelledPopUp();
                }
            }
        }
        return null;
    }

    public final int getScrollPosition() {
        return scrollPosition;
    }

    /*
     * Unable to fully structure code
     */
    public final Map getSelectedItemOrderDetail(qz1_2 var1_1, CartOrder var2_2, String var3_3, boolean var4_4, boolean var5_5, String var6_6, boolean var7_7, String var8_8, boolean var9_9) {
        block260: {
            block257: {
                block226: {
                    var10_10 = this;
                    var11_11 = var1_1;
                    var12_12 = var3_3;
                    var13_13 = var6_6;
                    var14_14 = var8_8;
                    var15_15 = "viewModel";
                    Intrinsics.checkNotNullParameter(var1_1, (String)var15_15);
                    var16_20 = new HashMap();
                    var17_21 = new LinkedHashMap();
                    var18_22 = new ArrayList();
                    var19_23 = new ArrayList();
                    var20_24 = new ArrayList();
                    var21_25 = new ArrayList();
                    var22_26 = new ArrayList();
                    var23_27 = new ArrayList<ArrayList<ArrayList<Object>>>();
                    var24_28 = new ArrayList<E>();
                    var25_29 = "selected_products";
                    var26_30 = var21_25;
                    var21_25 = "other_products";
                    if (var2_2 == null) {
                        var17_21.put(var21_25, var24_28);
                        var17_21.put(var25_29, var18_22);
                        return var17_21;
                    }
                    var27_31 = var25_29;
                    var25_29 = new ArrayList();
                    var15_15 = var2_2.getDeliveryAddress();
                    if (var15_15 != null) {
                        var15_15 = var2_2.getDeliveryAddress();
                        var28_32 = var17_21;
                        var17_21 = var2_2.getDeliveryModeValue();
                        var15_15.setDeliveryModeValue((String)var17_21);
                    } else {
                        var28_32 = var17_21;
                    }
                    var17_21 = var2_2.getConsignmentsData();
                    var29_33 = var21_25;
                    var21_25 = "get(...)";
                    var30_34 = var18_22;
                    if (var17_21 == null) break block226;
                    OrderDetailFunctionalRepo.consignmentSize = var31_35 = var17_21.size();
                    var32_36 = var17_21.size();
                    var33_37 = var20_24;
                    var20_24 = null;
                    for (var34_38 = 0; var34_38 < var32_36; var34_38 += var66_70) {
                        block230: {
                            block227: {
                                var15_15 = var17_21.get(var34_38);
                                Intrinsics.checkNotNullExpressionValue(var15_15, (String)var21_25);
                                var35_39 = var17_21;
                                var17_21 = var15_15;
                                var17_21 = (Consignment)var15_15;
                                var36_40 = var32_36;
                                var18_22 = var17_21.getEntries();
                                if (var18_22 == null || (var31_35 = var18_22.size()) <= 0) break block227;
                                var15_15 = var17_21.getStatus();
                                var31_35 = (int)TextUtils.isEmpty((CharSequence)var15_15);
                                if (var31_35 == 0 && (var31_35 = (int)var2_2.isReturnRevampNewFlowEnabled()) != 0 && (var31_35 = (int)hv3_0.D()) != 0) {
                                    var15_15 = super.checkForReturnCancelledAndData((Consignment)var17_21);
                                    var17_21.setCancelledEntries((List)var15_15);
                                }
                                var15_15 = var18_22;
                                var15_15 = (Collection)var18_22;
                                var31_35 = var15_15.size();
                                var37_41 = var21_25;
                                var21_25 = null;
                                for (var38_42 = 0; var38_42 < var31_35; var38_42 += var58_62) {
                                    block229: {
                                        block228: {
                                            var39_43 = var18_22.get(var38_42);
                                            var40_44 = var31_35;
                                            var15_15 = var39_43;
                                            var15_15 = (CartEntry)var39_43;
                                            var39_43 = a21.a;
                                            var41_45 = var18_22;
                                            var18_22 = var15_15.getOrderEntry();
                                            var39_43.getClass();
                                            a21.a((CartEntry)var18_22, var16_20);
                                            if (var5_5) {
                                                var18_22 = var15_15.getOrderEntry().getProduct();
                                                Y63.g((Product)var18_22);
                                            }
                                            if (var12_12 == null || (var32_36 = var3_3.length()) == 0) break block228;
                                            var18_22 = var15_15.getOrderEntry();
                                            if (var18_22 != null && (var18_22 = var18_22.getProduct()) != null) {
                                                var18_22 = var18_22.getCode();
                                            } else {
                                                var32_36 = 0;
                                                var18_22 = null;
                                            }
                                            var32_36 = (int)Intrinsics.areEqual(var12_12, var18_22);
                                            if (var32_36 == 0) break block228;
                                            var42_46 = var18_22;
                                            var43_47 = 0;
                                            var44_48 = 0;
                                            var45_49 = 0;
                                            var46_50 = 0.0f;
                                            var47_51 = null;
                                            var48_52 = null;
                                            var49_53 = 0;
                                            var50_54 = false;
                                            var51_55 = null;
                                            var52_56 = null;
                                            var53_57 = 0;
                                            var54_58 = 0.0f;
                                            var55_59 = null;
                                            var56_60 = 0x3FFFFF;
                                            var57_61 = 0;
                                            var18_22 = new SelectedOrderItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var56_60, null);
                                            var18_22.setConsignment((Consignment)var17_21);
                                            var14_14 = var15_15.getOrderEntry();
                                            var18_22.setCartEntry((CartEntry)var14_14);
                                            var18_22.setParentConsignmentEntry((CartEntry)var15_15);
                                            var14_14 = var17_21.getShipmentStatus();
                                            var18_22.setOrderStatus((String)var14_14);
                                            var14_14 = var17_21.getTrackerList();
                                            var18_22.setForwardOrderRevampOrderTrackerSection((ArrayList)var14_14);
                                            var58_62 = (int)var17_21.isReturnableExchangeable();
                                            var14_14 = (boolean)var58_62;
                                            var18_22.setReturnableExchangeable((Boolean)var14_14);
                                            var14_14 = var15_15.getQuantity();
                                            var18_22.setQuantity((Integer)var14_14);
                                            var14_14 = var15_15.getEntryStatus();
                                            var18_22.setRawEntryStatus((String)var14_14);
                                            var14_14 = var17_21.getForwardPacketNumber();
                                            if (var14_14 != null) {
                                                var18_22.setForwardPacketNumber((String)var14_14);
                                                var14_14 = Unit.a;
                                            }
                                            var19_23.add(var18_22);
                                            break block229;
                                        }
                                        if (var12_12 == null || (var58_62 = var3_3.length()) == 0) ** GOTO lbl-1000
                                        var14_14 = var15_15.getOrderEntry();
                                        if (var14_14 != null && (var14_14 = var14_14.getProduct()) != null) {
                                            var14_14 = var14_14.getCode();
                                        } else {
                                            var58_62 = 0;
                                            var14_14 = null;
                                        }
                                        var58_62 = (int)Intrinsics.areEqual(var12_12, var14_14);
                                        if (var58_62 == 0 && var7_7) {
                                            var42_46 = var14_14;
                                            var43_47 = 0;
                                            var44_48 = 0;
                                            var45_49 = 0;
                                            var46_50 = 0.0f;
                                            var47_51 = null;
                                            var48_52 = null;
                                            var49_53 = 0;
                                            var50_54 = false;
                                            var51_55 = null;
                                            var52_56 = null;
                                            var53_57 = 0;
                                            var54_58 = 0.0f;
                                            var55_59 = null;
                                            var56_60 = 0x3FFFFF;
                                            var57_61 = 0;
                                            var14_14 = new SelectedOrderItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var56_60, null);
                                            var14_14.setConsignment((Consignment)var17_21);
                                            var18_22 = var15_15.getOrderEntry();
                                            var14_14.setCartEntry((CartEntry)var18_22);
                                            var14_14.setParentConsignmentEntry((CartEntry)var15_15);
                                            var18_22 = var17_21.getShipmentStatus();
                                            var14_14.setOrderStatus((String)var18_22);
                                            var18_22 = var17_21.getTrackerList();
                                            var14_14.setForwardOrderRevampOrderTrackerSection((ArrayList)var18_22);
                                            var32_36 = (int)var17_21.isReturnableExchangeable();
                                            var18_22 = (boolean)var32_36;
                                            var14_14.setReturnableExchangeable((Boolean)var18_22);
                                            var18_22 = var15_15.getQuantity();
                                            var14_14.setQuantity((Integer)var18_22);
                                            var18_22 = var15_15.getEntryStatus();
                                            var14_14.setRawEntryStatus((String)var18_22);
                                            var18_22 = var17_21.getForwardPacketNumber();
                                            if (var18_22 != null) {
                                                var14_14.setForwardPacketNumber((String)var18_22);
                                                var18_22 = Unit.a;
                                            }
                                            var19_23.add(var14_14);
                                            var14_14 = var15_15.getOrderEntry();
                                            if (var14_14 != null && (var14_14 = var14_14.getProduct()) != null) {
                                                var14_14 = var14_14.getCode();
                                            } else {
                                                var58_62 = 0;
                                                var14_14 = null;
                                            }
                                            var11_11.H((String)var14_14);
                                            var14_14 = Unit.a;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            if ((var58_62 = (int)TextUtils.isEmpty((CharSequence)var8_8)) != 0) {
                                                var14_14 = var15_15.getOrderEntry();
                                                var18_22 = "getOrderEntry(...)";
                                                Intrinsics.checkNotNullExpressionValue(var14_14, (String)var18_22);
                                                a21.b(var24_28, (CartEntry)var14_14);
                                            }
                                            var14_14 = Unit.a;
                                        }
                                    }
                                    var14_14 = var15_15.getOrderEntry();
                                    var18_22 = var17_21.getShipmentStatus();
                                    var14_14.setEntryStatus((String)var18_22);
                                    var18_22 = var17_21.getShipmentStatus();
                                    var14_14.setNewEntryStatus((String)var18_22);
                                    var23_27.add((ArrayList<ArrayList<Object>>)var14_14);
                                    var58_62 = OrderDetailFunctionalRepo.consignmentSize;
                                    var15_15.setOrderDetailData(var34_38, var38_42, var58_62);
                                    var14_14 = var17_21.getCode();
                                    var32_36 = (int)TextUtils.isEmpty((CharSequence)var14_14);
                                    if (var32_36 == 0) {
                                        var18_22 = "delivered";
                                        var39_43 = var19_23;
                                        var19_23 = var17_21.getShipmentStatus();
                                        var42_46 = var23_27;
                                        var59_63 = 1;
                                        var32_36 = (int)b.i((String)var18_22, (String)var19_23, (boolean)var59_63);
                                        if (var32_36 != 0) {
                                            var15_15.setShipmentCode((String)var14_14);
                                        }
                                    } else {
                                        var39_43 = var19_23;
                                        var42_46 = var23_27;
                                    }
                                    if ((var15_15 = var15_15.getOrderEntry()) != null && (var15_15 = var15_15.getProduct()) != null) {
                                        var15_15 = var15_15.getImages();
                                    } else {
                                        var31_35 = 0;
                                        var15_15 = null;
                                        var60_64 = 0.0f;
                                    }
                                    super.setImageList((List)var15_15, (ArrayList)var25_29);
                                    var58_62 = 1;
                                    var14_14 = var8_8;
                                    var19_23 = var39_43;
                                    var31_35 = var40_44;
                                    var18_22 = var41_45;
                                    var23_27 = var42_46;
                                }
                                var41_45 = var18_22;
                                var39_43 = var19_23;
lbl229:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var41_45 = var18_22;
                            var39_43 = var19_23;
                            var37_41 = var21_25;
                            ** continue;
                            var42_46 = var23_27;
                            var14_14 = var17_21.getReturnRequests();
                            if (var14_14 == null || (var31_35 = var14_14.size()) <= 0) break block230;
                            var32_36 = var14_14.size();
                            var61_65 = 0;
                            var62_66 = 0.0f;
                            var19_23 = null;
                            while (var61_65 < var32_36) {
                                block246: {
                                    block247: {
                                        block231: {
                                            block232: {
                                                var56_60 = 0;
                                                var45_49 = 0;
                                                var46_50 = 0.0f;
                                                var47_51 = null;
                                                var48_52 = null;
                                                var49_53 = 0;
                                                var50_54 = false;
                                                var51_55 = null;
                                                var52_56 = null;
                                                var53_57 = 0;
                                                var54_58 = 0.0f;
                                                var55_59 = null;
                                                var43_47 = 0;
                                                var57_61 = 0x3FFFFF;
                                                var21_25 = new SelectedOrderItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var57_61, null);
                                                var15_15 = var14_14.get(var61_65);
                                                var23_27 = var15_15;
                                                var23_27 = (ReturnRequest)var15_15;
                                                var31_35 = OrderDetailFunctionalRepo.consignmentSize;
                                                var63_67 = var14_14;
                                                var58_62 = 0;
                                                var14_14 = null;
                                                var23_27.setOrderDetailData(var34_38, 0, var31_35);
                                                var15_15 = var23_27.getExchangeOrderID();
                                                var31_35 = (int)TextUtils.isEmpty((CharSequence)var15_15);
                                                if (var31_35 == 0 && (var31_35 = (int)TextUtils.isEmpty((CharSequence)(var15_15 = var23_27.getReturnId()))) == 0 && (var15_15 = var23_27.getPickupAddress()) != null) {
                                                    var15_15 = var23_27.getPickupAddress();
                                                    var58_62 = (int)var23_27.isDroppedAtStore();
                                                    var15_15.setDroppedAtStore((boolean)var58_62);
                                                    var15_15.setPickupAddress(true);
                                                    var58_62 = (int)var23_27.isReturnonHold();
                                                    var15_15.setReturnonHold((boolean)var58_62);
                                                    var21_25.setCartDeliveryAddress((CartDeliveryAddress)var15_15);
                                                }
                                                var14_14 = new ArrayList();
                                                var15_15 = "DELIVERED";
                                                var44_48 = var32_36;
                                                var18_22 = var23_27.getReturnStatus();
                                                var45_49 = var61_65;
                                                var61_65 = 1;
                                                var62_66 = 1.4E-45f;
                                                var31_35 = (int)b.i((String)var15_15, var18_22, (boolean)var61_65);
                                                var18_22 = "getAmount(...)";
                                                if (var31_35 == 0) break block231;
                                                var15_15 = var23_27.getReturnCancelledEntries();
                                                if (var15_15 == null || (var31_35 = (var15_15 = var23_27.getReturnCancelledEntries()).size()) <= 0) break block232;
                                                var15_15 = var23_27.getReturnCancelledEntries();
                                                var61_65 = var15_15.size();
                                                var47_51 = var18_22;
                                                var18_22 = null;
                                                var46_50 = 0.0f;
                                                for (var32_36 = 0; var32_36 < var61_65; var32_36 += var64_68) {
                                                    block245: {
                                                        block235: {
                                                            block224: {
                                                                block241: {
                                                                    block240: {
                                                                        block239: {
                                                                            block238: {
                                                                                block237: {
                                                                                    block236: {
                                                                                        block233: {
                                                                                            block234: {
                                                                                                var15_15 = (OrderDetailLineItem)var23_27.getReturnCancelledEntries().get(var32_36);
                                                                                                var48_52 = a21.a;
                                                                                                var49_53 = var61_65;
                                                                                                var19_23 = var15_15.getEntry();
                                                                                                var48_52.getClass();
                                                                                                a21.a((CartEntry)var19_23, var16_20);
                                                                                                if (var12_12 == null || (var61_65 = var3_3.length()) == 0) break block233;
                                                                                                var19_23 = var15_15.getEntry();
                                                                                                if (var19_23 != null && (var19_23 = var19_23.getProduct()) != null) {
                                                                                                    var19_23 = var19_23.getCode();
                                                                                                } else {
                                                                                                    var61_65 = 0;
                                                                                                    var19_23 = null;
                                                                                                    var62_66 = 0.0f;
                                                                                                }
                                                                                                var61_65 = (int)Intrinsics.areEqual(var12_12, var19_23);
                                                                                                if (var61_65 == 0 || (var61_65 = (int)TextUtils.isEmpty((CharSequence)(var19_23 = var23_27.getReturnId()))) != 0 || (var61_65 = (int)TextUtils.isEmpty((CharSequence)(var19_23 = var23_27.getExchangeOrderID()))) != 0) break block233;
                                                                                                var19_23 = var23_27.getExchangeOrderID();
                                                                                                if (var19_23 != null && (var61_65 = var19_23.length()) != 0) break block234;
                                                                                                var48_52 = var16_20;
                                                                                                ** GOTO lbl-1000
                                                                                            }
                                                                                            var19_23 = var23_27.getExchangeOrderID();
                                                                                            var48_52 = var16_20;
                                                                                            var64_68 = 1;
                                                                                            var61_65 = (int)b.i((String)var19_23, (String)var13_13, (boolean)var64_68);
                                                                                            if (var61_65 != 0) {
                                                                                                var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                                var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                                var16_20 = Boolean.FALSE;
                                                                                                var21_25.setReturnableExchangeable((Boolean)var16_20);
                                                                                                var16_20 = Boolean.TRUE;
                                                                                                var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                                            } else lbl-1000:
                                                                                            // 2 sources

                                                                                            {
                                                                                                var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                                var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                                var64_68 = (int)var17_21.isReturnableExchangeable();
                                                                                                if (var64_68 != 0 && (var64_68 = (var16_20 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                                                    var64_68 = 1;
                                                                                                } else {
                                                                                                    var64_68 = 0;
                                                                                                    var16_20 = null;
                                                                                                }
                                                                                                var16_20 = (boolean)var64_68;
                                                                                                var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                                            }
                                                                                            var64_68 = (int)var2_2.isExchangeOrder();
                                                                                            if (var64_68 != 0) {
                                                                                                var16_20 = Boolean.TRUE;
                                                                                                var21_25.setExchangeOrder((Boolean)var16_20);
                                                                                            }
                                                                                            var21_25.setConsignment((Consignment)var17_21);
                                                                                            var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                                            var16_20 = var15_15.getEntry();
                                                                                            var21_25.setCartEntry((CartEntry)var16_20);
                                                                                            var16_20 = var23_27.getReturnStatus();
                                                                                            var21_25.setOrderStatus((String)var16_20);
                                                                                            var16_20 = var15_15.getLineItemQty();
                                                                                            var21_25.setQuantity((Integer)var16_20);
                                                                                            var16_20 = var23_27.getReturnId();
                                                                                            var21_25.setReturnId((String)var16_20);
                                                                                            var16_20 = var15_15.getEntry().getEntryStatus();
                                                                                            var21_25.setRawEntryStatus((String)var16_20);
                                                                                            var64_68 = var15_15.getLineItemQty();
                                                                                            if (var64_68 != 0) {
                                                                                                var22_26.add(var21_25);
                                                                                            }
                                                                                            var16_20 = Unit.a;
                                                                                            break block235;
                                                                                        }
                                                                                        var48_52 = var16_20;
                                                                                        if (var12_12 == null || (var64_68 = var3_3.length()) == 0) break block236;
                                                                                        var16_20 = var15_15.getEntry();
                                                                                        if (var16_20 != null && (var16_20 = var16_20.getProduct()) != null) {
                                                                                            var16_20 = var16_20.getCode();
                                                                                        } else {
                                                                                            var64_68 = 0;
                                                                                            var16_20 = null;
                                                                                        }
                                                                                        var64_68 = (int)Intrinsics.areEqual(var12_12, var16_20);
                                                                                        if (var64_68 != 0 || (var64_68 = (int)TextUtils.isEmpty((CharSequence)(var16_20 = var23_27.getReturnId()))) != 0 || (var64_68 = (int)TextUtils.isEmpty(var16_20 = var23_27.getExchangeOrderID())) != 0 || !var7_7) break block236;
                                                                                        var16_20 = var23_27.getExchangeOrderID();
                                                                                        if (var16_20 == null || (var64_68 = var16_20.length()) == 0) ** GOTO lbl-1000
                                                                                        var16_20 = var23_27.getExchangeOrderID();
                                                                                        var61_65 = 1;
                                                                                        var62_66 = 1.4E-45f;
                                                                                        var64_68 = b.i((String)var16_20, (String)var13_13, (boolean)var61_65);
                                                                                        if (var64_68 != 0) {
                                                                                            var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                            var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                            var16_20 = Boolean.FALSE;
                                                                                            var21_25.setReturnableExchangeable((Boolean)var16_20);
                                                                                            var16_20 = Boolean.TRUE;
                                                                                            var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                                        } else lbl-1000:
                                                                                        // 2 sources

                                                                                        {
                                                                                            var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                            var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                            var64_68 = (int)var17_21.isReturnableExchangeable();
                                                                                            if (var64_68 != 0 && (var64_68 = (var16_20 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                                                var64_68 = 1;
                                                                                            } else {
                                                                                                var64_68 = 0;
                                                                                                var16_20 = null;
                                                                                            }
                                                                                            var16_20 = (boolean)var64_68;
                                                                                            var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                                        }
                                                                                        var64_68 = (int)var2_2.isExchangeOrder();
                                                                                        if (var64_68 != 0) {
                                                                                            var16_20 = Boolean.TRUE;
                                                                                            var21_25.setExchangeOrder((Boolean)var16_20);
                                                                                        }
                                                                                        var21_25.setConsignment((Consignment)var17_21);
                                                                                        var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                                        var16_20 = var15_15.getEntry();
                                                                                        var21_25.setCartEntry((CartEntry)var16_20);
                                                                                        var16_20 = var23_27.getReturnStatus();
                                                                                        var21_25.setOrderStatus((String)var16_20);
                                                                                        var16_20 = var15_15.getLineItemQty();
                                                                                        var21_25.setQuantity((Integer)var16_20);
                                                                                        var16_20 = var23_27.getReturnId();
                                                                                        var21_25.setReturnId((String)var16_20);
                                                                                        var16_20 = var15_15.getEntry().getEntryStatus();
                                                                                        var21_25.setRawEntryStatus((String)var16_20);
                                                                                        var64_68 = var15_15.getLineItemQty();
                                                                                        if (var64_68 != 0) {
                                                                                            var22_26.add(var21_25);
                                                                                        }
                                                                                        if ((var16_20 = var15_15.getEntry()) != null && (var16_20 = var16_20.getProduct()) != null) {
                                                                                            var16_20 = var16_20.getCode();
                                                                                        } else {
                                                                                            var64_68 = 0;
                                                                                            var16_20 = null;
                                                                                        }
                                                                                        var11_11.H((String)var16_20);
                                                                                        var16_20 = Unit.a;
                                                                                        break block235;
                                                                                    }
                                                                                    if (var12_12 == null || (var64_68 = var3_3.length()) == 0) break block237;
                                                                                    var16_20 = var15_15.getEntry();
                                                                                    if (var16_20 != null && (var16_20 = var16_20.getProduct()) != null) {
                                                                                        var16_20 = var16_20.getCode();
                                                                                    } else {
                                                                                        var64_68 = 0;
                                                                                        var16_20 = null;
                                                                                    }
                                                                                    var64_68 = (int)Intrinsics.areEqual(var12_12, var16_20);
                                                                                    if (var64_68 == 0) break block237;
                                                                                    var16_20 = var8_8;
                                                                                    if (var8_8 == null || (var61_65 = var8_8.length()) == 0 || (var61_65 = (int)Intrinsics.areEqual(var8_8, var19_23 = var23_27.getReturnId())) == 0) break block237;
                                                                                    var19_23 = var23_27.getExchangeOrderID();
                                                                                    if (var19_23 != null && (var61_65 = var19_23.length()) != 0 && (var61_65 = b.i((String)(var19_23 = var23_27.getExchangeOrderID()), (String)var13_13, (boolean)(var64_68 = 1))) != 0) {
                                                                                        var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                        var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                        var16_20 = Boolean.FALSE;
                                                                                        var21_25.setReturnableExchangeable((Boolean)var16_20);
                                                                                        var16_20 = Boolean.TRUE;
                                                                                        var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                                    } else {
                                                                                        var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                        if (var16_20 == null) {
                                                                                            var16_20 = var17_21.getTrackerList();
                                                                                        }
                                                                                        var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                        var64_68 = var17_21.isReturnableExchangeable();
                                                                                        if (var64_68 != 0 && (var64_68 = (var16_20 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                                            var64_68 = 1;
                                                                                        } else {
                                                                                            var64_68 = 0;
                                                                                            var16_20 = null;
                                                                                        }
                                                                                        var16_20 = (boolean)var64_68;
                                                                                        var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                                    }
                                                                                    var64_68 = (int)var2_2.isExchangeOrder();
                                                                                    if (var64_68 != 0) {
                                                                                        var16_20 = Boolean.TRUE;
                                                                                        var21_25.setExchangeOrder((Boolean)var16_20);
                                                                                    }
                                                                                    var21_25.setConsignment((Consignment)var17_21);
                                                                                    var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                                    var16_20 = var15_15.getEntry();
                                                                                    var21_25.setCartEntry((CartEntry)var16_20);
                                                                                    var16_20 = var23_27.getReturnStatus();
                                                                                    var21_25.setOrderStatus((String)var16_20);
                                                                                    var64_68 = var15_15.getLineItemQty();
                                                                                    var16_20 = var64_68;
                                                                                    var21_25.setQuantity((Integer)var16_20);
                                                                                    var16_20 = var23_27.getReturnId();
                                                                                    var21_25.setReturnId((String)var16_20);
                                                                                    var16_20 = var15_15.getEntry().getEntryStatus();
                                                                                    var21_25.setRawEntryStatus((String)var16_20);
                                                                                    var22_26.add(var21_25);
                                                                                    break block235;
                                                                                }
                                                                                if (var12_12 == null || (var64_68 = var3_3.length()) == 0) break block238;
                                                                                var16_20 = var15_15.getEntry();
                                                                                if (var16_20 != null && (var16_20 = var16_20.getProduct()) != null) {
                                                                                    var16_20 = var16_20.getCode();
                                                                                } else {
                                                                                    var64_68 = 0;
                                                                                    var16_20 = null;
                                                                                }
                                                                                var64_68 = (int)Intrinsics.areEqual(var12_12, var16_20);
                                                                                if (var64_68 == 0 || var9_9 == 0 || ((var16_20 = var23_27.getExchangeOrderID()) == null || (var64_68 = var16_20.length()) == 0) && ((var64_68 = (int)var15_15.returnCancelled) != 0 || (var64_68 = (int)var15_15.exchangeReturnCancelled) != 0)) break block238;
                                                                                var16_20 = var23_27.getExchangeOrderID();
                                                                                if (var16_20 == null || (var64_68 = var16_20.length()) == 0) ** GOTO lbl-1000
                                                                                var16_20 = var23_27.getExchangeOrderID();
                                                                                var61_65 = 1;
                                                                                var62_66 = 1.4E-45f;
                                                                                var64_68 = (int)b.i((String)var16_20, (String)var13_13, (boolean)var61_65);
                                                                                if (var64_68 != 0) {
                                                                                    var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                    var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                    var16_20 = Boolean.FALSE;
                                                                                    var21_25.setReturnableExchangeable((Boolean)var16_20);
                                                                                    var16_20 = Boolean.TRUE;
                                                                                    var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                                } else lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                    var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                    var64_68 = (int)var17_21.isReturnableExchangeable();
                                                                                    if (var64_68 != 0 && (var64_68 = (int)(var16_20 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                                        var64_68 = 1;
                                                                                    } else {
                                                                                        var64_68 = 0;
                                                                                        var16_20 = null;
                                                                                    }
                                                                                    var16_20 = (boolean)var64_68;
                                                                                    var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                                }
                                                                                var64_68 = var2_2.isExchangeOrder();
                                                                                if (var64_68 != 0) {
                                                                                    var16_20 = Boolean.TRUE;
                                                                                    var21_25.setExchangeOrder((Boolean)var16_20);
                                                                                }
                                                                                var21_25.setConsignment((Consignment)var17_21);
                                                                                var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                                var16_20 = var15_15.getEntry();
                                                                                var21_25.setCartEntry((CartEntry)var16_20);
                                                                                var16_20 = var23_27.getReturnStatus();
                                                                                var21_25.setOrderStatus((String)var16_20);
                                                                                var64_68 = var15_15.getLineItemQty();
                                                                                var16_20 = var64_68;
                                                                                var21_25.setQuantity((Integer)var16_20);
                                                                                var16_20 = var23_27.getReturnId();
                                                                                var21_25.setReturnId((String)var16_20);
                                                                                var16_20 = var15_15.getEntry().getEntryStatus();
                                                                                var21_25.setRawEntryStatus((String)var16_20);
                                                                                var22_26.add(var21_25);
                                                                                break block235;
                                                                            }
                                                                            if (var12_12 == null || (var64_68 = var3_3.length()) == 0) break block239;
                                                                            var16_20 = var15_15.getEntry();
                                                                            if (var16_20 != null && (var16_20 = var16_20.getProduct()) != null) {
                                                                                var16_20 = var16_20.getCode();
                                                                            } else {
                                                                                var64_68 = 0;
                                                                                var16_20 = null;
                                                                            }
                                                                            var64_68 = (int)Intrinsics.areEqual(var12_12, var16_20);
                                                                            if (var64_68 == 0 || (var16_20 = var23_27.getExchangeOrderID()) != null && (var64_68 = var16_20.length()) != 0 || (var16_20 = var23_27.getReturnId()) == null || (var64_68 = var16_20.length()) == 0 || (var64_68 = (int)(var16_20 = var23_27.getExchangeReturnRTO()).booleanValue()) == 0) break block239;
                                                                            var16_20 = var23_27.getExchangeOrderID();
                                                                            if (var16_20 == null || (var64_68 = var16_20.length()) == 0) ** GOTO lbl-1000
                                                                            var16_20 = var23_27.getExchangeOrderID();
                                                                            var61_65 = 1;
                                                                            var62_66 = 1.4E-45f;
                                                                            var64_68 = (int)b.i((String)var16_20, (String)var13_13, (boolean)var61_65);
                                                                            if (var64_68 != 0) {
                                                                                var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                var16_20 = Boolean.FALSE;
                                                                                var21_25.setReturnableExchangeable((Boolean)var16_20);
                                                                                var16_20 = Boolean.TRUE;
                                                                                var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                            } else lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                                var64_68 = var17_21.isReturnableExchangeable();
                                                                                if (var64_68 != 0 && (var64_68 = (int)(var16_20 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                                    var64_68 = 1;
                                                                                } else {
                                                                                    var64_68 = 0;
                                                                                    var16_20 = null;
                                                                                }
                                                                                var16_20 = (boolean)var64_68;
                                                                                var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                            }
                                                                            var64_68 = var2_2.isExchangeOrder();
                                                                            if (var64_68 != 0) {
                                                                                var16_20 = Boolean.TRUE;
                                                                                var21_25.setExchangeOrder((Boolean)var16_20);
                                                                            }
                                                                            var21_25.setConsignment((Consignment)var17_21);
                                                                            var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                            var16_20 = var15_15.getEntry();
                                                                            var21_25.setCartEntry((CartEntry)var16_20);
                                                                            var16_20 = var23_27.getReturnStatus();
                                                                            var21_25.setOrderStatus((String)var16_20);
                                                                            var64_68 = var15_15.getLineItemQty();
                                                                            var16_20 = var64_68;
                                                                            var21_25.setQuantity((Integer)var16_20);
                                                                            var16_20 = var23_27.getReturnId();
                                                                            var21_25.setReturnId((String)var16_20);
                                                                            var16_20 = var23_27.getExchangeReturnRTO();
                                                                            var21_25.setExchangeReturnRTO((Boolean)var16_20);
                                                                            var16_20 = var15_15.getEntry().getEntryStatus();
                                                                            var21_25.setRawEntryStatus((String)var16_20);
                                                                            var22_26.add(var21_25);
                                                                            break block235;
                                                                        }
                                                                        if (var12_12 == null || (var64_68 = var3_3.length()) == 0) break block240;
                                                                        var16_20 = var15_15.getEntry();
                                                                        if (var16_20 != null && (var16_20 = var16_20.getProduct()) != null) {
                                                                            var16_20 = var16_20.getCode();
                                                                        } else {
                                                                            var64_68 = 0;
                                                                            var16_20 = null;
                                                                        }
                                                                        var64_68 = (int)Intrinsics.areEqual(var12_12, var16_20);
                                                                        if (var64_68 != 0 || (var64_68 = (int)TextUtils.isEmpty(var16_20 = var23_27.getReturnId())) != 0 || (var64_68 = (int)(var16_20 = var23_27.getExchangeReturnRTO()).booleanValue()) == 0 || !var7_7) break block240;
                                                                        var16_20 = var23_27.getExchangeOrderID();
                                                                        if (var16_20 == null || (var64_68 = var16_20.length()) == 0) ** GOTO lbl-1000
                                                                        var16_20 = var23_27.getExchangeOrderID();
                                                                        var61_65 = 1;
                                                                        var62_66 = 1.4E-45f;
                                                                        var64_68 = (int)b.i((String)var16_20, (String)var13_13, (boolean)var61_65);
                                                                        if (var64_68 != 0) {
                                                                            var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                            var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                            var16_20 = Boolean.FALSE;
                                                                            var21_25.setReturnableExchangeable((Boolean)var16_20);
                                                                            var16_20 = Boolean.TRUE;
                                                                            var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                        } else lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            var16_20 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                            var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var16_20);
                                                                            var64_68 = var17_21.isReturnableExchangeable();
                                                                            if (var64_68 != 0 && (var64_68 = (int)(var16_20 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                                var64_68 = 1;
                                                                            } else {
                                                                                var64_68 = 0;
                                                                                var16_20 = null;
                                                                            }
                                                                            var16_20 = (boolean)var64_68;
                                                                            var21_25.setViewExchangeAvailable((Boolean)var16_20);
                                                                        }
                                                                        var64_68 = var2_2.isExchangeOrder();
                                                                        if (var64_68 != 0) {
                                                                            var16_20 = Boolean.TRUE;
                                                                            var21_25.setExchangeOrder((Boolean)var16_20);
                                                                        }
                                                                        var21_25.setConsignment((Consignment)var17_21);
                                                                        var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                        var16_20 = var15_15.getEntry();
                                                                        var21_25.setCartEntry((CartEntry)var16_20);
                                                                        var16_20 = var23_27.getReturnStatus();
                                                                        var21_25.setOrderStatus((String)var16_20);
                                                                        var16_20 = var15_15.getLineItemQty();
                                                                        var21_25.setQuantity((Integer)var16_20);
                                                                        var16_20 = var23_27.getReturnId();
                                                                        var21_25.setReturnId((String)var16_20);
                                                                        var16_20 = var23_27.getExchangeReturnRTO();
                                                                        var21_25.setExchangeReturnRTO((Boolean)var16_20);
                                                                        var16_20 = var15_15.getEntry().getEntryStatus();
                                                                        var21_25.setRawEntryStatus((String)var16_20);
                                                                        var64_68 = var15_15.getLineItemQty();
                                                                        if (var64_68 != 0) {
                                                                            var22_26.add(var21_25);
                                                                        }
                                                                        if ((var16_20 = var15_15.getEntry()) != null && (var16_20 = var16_20.getProduct()) != null) {
                                                                            var16_20 = var16_20.getCode();
                                                                        } else {
                                                                            var64_68 = 0;
                                                                            var16_20 = null;
                                                                        }
                                                                        var11_11.H((String)var16_20);
                                                                        var16_20 = Unit.a;
                                                                        break block235;
                                                                    }
                                                                    if (var41_45 == null) break block241;
                                                                    var16_20 = var41_45;
                                                                    var16_20 = var41_45;
                                                                    var64_68 = (int)var16_20.isEmpty();
                                                                    var61_65 = 1;
                                                                    var62_66 = 1.4E-45f;
                                                                    if ((var64_68 ^= var61_65) == 0) break block241;
                                                                    var16_20 = var41_45.iterator();
                                                                    var61_65 = 0;
                                                                    var62_66 = 0.0f;
                                                                    var19_23 = null;
                                                                    while (true) {
                                                                        block243: {
                                                                            block244: {
                                                                                block242: {
                                                                                    if (!(var50_54 = var16_20.hasNext())) break block242;
                                                                                    var51_55 = (CartEntry)var16_20.next();
                                                                                    if (var51_55 != null && (var52_56 = var51_55.getOrderEntry()) != null && (var52_56 = var52_56.getProduct()) != null) {
                                                                                        var65_69 = var52_56.getCode();
                                                                                        var52_56 = var16_20;
                                                                                        var16_20 = var65_69;
                                                                                    } else {
                                                                                        var52_56 = var16_20;
                                                                                        var64_68 = 0;
                                                                                        var16_20 = null;
                                                                                    }
                                                                                    var55_59 = var15_15.getEntry();
                                                                                    if (var55_59 != null && (var55_59 = var55_59.getProduct()) != null) {
                                                                                        var65_69 = var55_59 = var55_59.getCode();
                                                                                        var53_57 = var61_65;
                                                                                        var54_58 = var62_66;
                                                                                        var19_23 = var55_59;
                                                                                    } else {
                                                                                        var53_57 = var61_65;
                                                                                        var54_58 = var62_66;
                                                                                        var61_65 = 0;
                                                                                        var19_23 = null;
                                                                                        var62_66 = 0.0f;
                                                                                    }
                                                                                    var64_68 = Intrinsics.areEqual(var16_20, var19_23);
                                                                                    if (var64_68 == 0) break block243;
                                                                                    var16_20 = var23_27.getExchangeOrderID();
                                                                                    if (var16_20 != null && (var64_68 = var16_20.length()) != 0 && var51_55 != null && (var16_20 = var51_55.getOrderEntry()) != null) {
                                                                                        var19_23 = var23_27.getExchangeOrderID();
                                                                                        var16_20.setExchangeId((String)var19_23);
                                                                                        var16_20 = Unit.a;
                                                                                    }
                                                                                    if ((var64_68 = (int)TextUtils.isEmpty((CharSequence)(var16_20 = var23_27.getReturnId()))) == 0 && (var64_68 = (int)TextUtils.isEmpty((CharSequence)(var16_20 = var23_27.getExchangeOrderID()))) == 0) {
                                                                                        var61_65 = 0;
                                                                                        var62_66 = 0.0f;
                                                                                        var19_23 = null;
                                                                                    } else {
                                                                                        var61_65 = 1;
                                                                                        var62_66 = 1.4E-45f;
                                                                                    }
                                                                                    if (var61_65 == 0) break block244;
                                                                                }
                                                                                var53_57 = var61_65;
                                                                                var54_58 = var62_66;
                                                                                break block224;
                                                                            }
                                                                            var16_20 = var52_56;
                                                                            continue;
                                                                        }
                                                                        var16_20 = var52_56;
                                                                        var61_65 = var53_57;
                                                                        var62_66 = var54_58;
                                                                    }
                                                                }
                                                                var53_57 = 0;
                                                                var54_58 = 0.0f;
                                                                var55_59 = null;
                                                            }
                                                            var16_20 = var23_27.getReturnId();
                                                            var64_68 = (int)TextUtils.isEmpty((CharSequence)var16_20);
                                                            if (var64_68 == 0 && (var64_68 = (int)TextUtils.isEmpty((CharSequence)(var16_20 = var23_27.getExchangeOrderID()))) == 0) {
                                                                var64_68 = 1;
                                                            } else {
                                                                var64_68 = 0;
                                                                var16_20 = null;
                                                            }
                                                            if (var53_57 == 0 && var64_68 != 0) {
                                                                var16_20 = var15_15.getEntry();
                                                                var19_23 = var23_27.getExchangeOrderID();
                                                                var16_20.setExchangeId((String)var19_23);
                                                                var19_23 = var23_27.getReturnId();
                                                                var16_20.setReturnId((String)var19_23);
                                                                var61_65 = (int)TextUtils.isEmpty((CharSequence)var8_8);
                                                                if (var61_65 != 0) {
                                                                    var19_23 = a21.a;
                                                                    Intrinsics.checkNotNull(var16_20);
                                                                    var19_23.getClass();
                                                                    a21.b(var24_28, (CartEntry)var16_20);
                                                                }
                                                            }
                                                            var16_20 = Unit.a;
                                                        }
                                                        var16_20 = var15_15.getEntry();
                                                        var19_23 = var23_27.getReturnStatus();
                                                        var16_20.setEntryStatus((String)var19_23);
                                                        var19_23 = var23_27.getReturnStatus();
                                                        var16_20.setNewEntryStatus((String)var19_23);
                                                        var19_23 = var23_27.getExchangeOrderID();
                                                        var16_20.setExchangeId((String)var19_23);
                                                        var19_23 = var42_46;
                                                        var42_46.add(var16_20);
                                                        if (var5_5) {
                                                            var16_20 = var15_15.getEntry().getProduct();
                                                            Y63.g((Product)var16_20);
                                                        }
                                                        var64_68 = var23_27.getReturnCancelledEntries().size();
                                                        var15_15.setOrderDetailData(var34_38, var32_36, var64_68);
                                                        var14_14.add(var15_15);
                                                        var16_20 = var15_15.getEntry();
                                                        if (var16_20 != null && (var16_20 = var16_20.getProduct()) != null) {
                                                            var16_20 = var16_20.getImages();
                                                        } else {
                                                            var64_68 = 0;
                                                            var16_20 = null;
                                                        }
                                                        super.setImageList((List)var16_20, (ArrayList)var25_29);
                                                        var16_20 = var15_15.getAmount();
                                                        if (var16_20 != null && (var64_68 = (int)b.k((CharSequence)var16_20)) == 0) {
                                                            var15_15 = var15_15.getAmount();
                                                            var16_20 = var47_51;
                                                            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var47_51);
                                                            var60_64 = Float.parseFloat((String)var15_15);
                                                            var46_50 += var60_64;
                                                        }
lbl773:
                                                        // 4 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                        catch (NumberFormatException var15_16) {
                                                            var47_51 = var16_20;
                                                        }
                                                        break block245;
                                                        catch (NumberFormatException var15_17) {
                                                            var16_20 = var47_51;
                                                        }
                                                    }
                                                    var16_20 = yn3_0.a;
                                                    var16_20.e((Throwable)var15_15);
                                                    ** continue;
                                                    var64_68 = 1;
                                                    var42_46 = var19_23;
                                                    var16_20 = var48_52;
                                                    var61_65 = var49_53;
                                                }
                                                var19_23 = var42_46;
                                                var13_13 = var10_10;
                                                var60_64 = var46_50;
                                                var66_70 = 1;
                                                break block246;
                                            }
                                            var19_23 = var42_46;
                                            var13_13 = var10_10;
lbl797:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var48_52 = var16_20;
                                        var47_51 = var18_22;
                                        var19_23 = var42_46;
                                        var15_15 = var23_27.getReturnEntries();
                                        if (var15_15 == null || (var31_35 = (var15_15 = var23_27.getReturnEntries()).size()) <= 0) break block247;
                                        var15_15 = var23_27.getReturnEntries();
                                        var64_68 = var15_15.size();
                                        var18_22 = null;
                                        var46_50 = 0.0f;
                                        for (var32_36 = 0; var32_36 < var64_68; var32_36 += var66_70) {
                                            block256: {
                                                block250: {
                                                    block255: {
                                                        block254: {
                                                            block253: {
                                                                block252: {
                                                                    block251: {
                                                                        block248: {
                                                                            block249: {
                                                                                var15_15 = (OrderDetailLineItem)var23_27.getReturnEntries().get(var32_36);
                                                                                var42_46 = a21.a;
                                                                                var49_53 = var64_68;
                                                                                var16_20 = var15_15.getEntry();
                                                                                var42_46.getClass();
                                                                                var10_10 = var48_52;
                                                                                a21.a(var16_20, var48_52);
                                                                                if (var12_12 == null || (var64_68 = var3_3.length()) == 0) break block248;
                                                                                var16_20 = var15_15.getEntry();
                                                                                if (var16_20 != null && (var16_20 = var16_20.getProduct()) != null) {
                                                                                    var16_20 = var16_20.getCode();
                                                                                } else {
                                                                                    var64_68 = 0;
                                                                                    var16_20 = null;
                                                                                }
                                                                                var64_68 = (int)Intrinsics.areEqual(var12_12, var16_20);
                                                                                if (var64_68 == 0 || (var64_68 = (int)TextUtils.isEmpty((CharSequence)(var16_20 = var23_27.getReturnId()))) != 0 || (var64_68 = (int)TextUtils.isEmpty((CharSequence)(var16_20 = var23_27.getExchangeOrderID()))) != 0) break block248;
                                                                                var16_20 = var23_27.getExchangeOrderID();
                                                                                if (var16_20 != null && (var64_68 = var16_20.length()) != 0) break block249;
                                                                                var48_52 = var10_10;
                                                                                ** GOTO lbl-1000
                                                                            }
                                                                            var16_20 = var23_27.getExchangeOrderID();
                                                                            var48_52 = var10_10;
                                                                            var66_70 = 1;
                                                                            var64_68 = b.i((String)var16_20, (String)var13_13, (boolean)var66_70);
                                                                            if (var64_68 != 0) {
                                                                                var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                                var10_10 = Boolean.FALSE;
                                                                                var21_25.setReturnableExchangeable((Boolean)var10_10);
                                                                                var10_10 = Boolean.TRUE;
                                                                                var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                                            } else lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                                var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                                var66_70 = (int)var17_21.isReturnableExchangeable();
                                                                                if (var66_70 != 0 && (var66_70 = (int)(var10_10 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                                    var66_70 = 1;
                                                                                } else {
                                                                                    var66_70 = 0;
                                                                                    var10_10 = null;
                                                                                }
                                                                                var10_10 = (boolean)var66_70;
                                                                                var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                                            }
                                                                            var66_70 = (int)var2_2.isExchangeOrder();
                                                                            if (var66_70 != 0) {
                                                                                var10_10 = Boolean.TRUE;
                                                                                var21_25.setExchangeOrder((Boolean)var10_10);
                                                                            }
                                                                            var21_25.setConsignment((Consignment)var17_21);
                                                                            var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                            var10_10 = var15_15.getEntry();
                                                                            var21_25.setCartEntry((CartEntry)var10_10);
                                                                            var10_10 = var23_27.getReturnStatus();
                                                                            var21_25.setOrderStatus((String)var10_10);
                                                                            var66_70 = var15_15.getLineItemQty();
                                                                            var10_10 = var66_70;
                                                                            var21_25.setQuantity((Integer)var10_10);
                                                                            var10_10 = var23_27.getReturnId();
                                                                            var21_25.setReturnId((String)var10_10);
                                                                            var10_10 = var15_15.getEntry().getEntryStatus();
                                                                            var21_25.setRawEntryStatus((String)var10_10);
                                                                            var22_26.add(var21_25);
                                                                            break block250;
                                                                        }
                                                                        var48_52 = var10_10;
                                                                        if (var12_12 == null || (var66_70 = var3_3.length()) == 0) break block251;
                                                                        var10_10 = var15_15.getEntry();
                                                                        if (var10_10 != null && (var10_10 = var10_10.getProduct()) != null) {
                                                                            var10_10 = var10_10.getCode();
                                                                        } else {
                                                                            var66_70 = 0;
                                                                            var10_10 = null;
                                                                        }
                                                                        var66_70 = (int)Intrinsics.areEqual(var12_12, var10_10);
                                                                        if (var66_70 != 0 || (var66_70 = (int)TextUtils.isEmpty((CharSequence)(var10_10 = var23_27.getReturnId()))) != 0 || (var66_70 = (int)TextUtils.isEmpty((CharSequence)(var10_10 = var23_27.getExchangeOrderID()))) != 0 || !var7_7) break block251;
                                                                        var10_10 = var23_27.getExchangeOrderID();
                                                                        if (var10_10 != null && (var66_70 = var10_10.length()) != 0 && (var66_70 = (int)b.i((String)(var10_10 = var23_27.getExchangeOrderID()), (String)var13_13, (boolean)(var64_68 = 1))) != 0) {
                                                                            var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                            var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                            var10_10 = Boolean.FALSE;
                                                                            var21_25.setReturnableExchangeable((Boolean)var10_10);
                                                                            var10_10 = Boolean.TRUE;
                                                                            var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                                        } else {
                                                                            var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                            var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                            var66_70 = (int)var17_21.isReturnableExchangeable();
                                                                            if (var66_70 != 0 && (var66_70 = (var10_10 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                                var66_70 = 1;
                                                                            } else {
                                                                                var66_70 = 0;
                                                                                var10_10 = null;
                                                                            }
                                                                            var10_10 = (boolean)var66_70;
                                                                            var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                                        }
                                                                        var66_70 = (int)var2_2.isExchangeOrder();
                                                                        if (var66_70 != 0) {
                                                                            var10_10 = Boolean.TRUE;
                                                                            var21_25.setExchangeOrder((Boolean)var10_10);
                                                                        }
                                                                        var21_25.setConsignment((Consignment)var17_21);
                                                                        var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                        var10_10 = var15_15.getEntry();
                                                                        var21_25.setCartEntry((CartEntry)var10_10);
                                                                        var10_10 = var23_27.getReturnStatus();
                                                                        var21_25.setOrderStatus((String)var10_10);
                                                                        var66_70 = var15_15.getLineItemQty();
                                                                        var10_10 = var66_70;
                                                                        var21_25.setQuantity((Integer)var10_10);
                                                                        var10_10 = var23_27.getReturnId();
                                                                        var21_25.setReturnId((String)var10_10);
                                                                        var10_10 = var15_15.getEntry().getEntryStatus();
                                                                        var21_25.setRawEntryStatus((String)var10_10);
                                                                        var22_26.add(var21_25);
                                                                        var10_10 = var15_15.getEntry();
                                                                        if (var10_10 != null && (var10_10 = var10_10.getProduct()) != null) {
                                                                            var10_10 = var10_10.getCode();
                                                                        } else {
                                                                            var66_70 = 0;
                                                                            var10_10 = null;
                                                                        }
                                                                        var11_11.H((String)var10_10);
                                                                        var10_10 = Unit.a;
                                                                        break block250;
                                                                    }
                                                                    if (var12_12 == null || (var66_70 = var3_3.length()) == 0) break block252;
                                                                    var10_10 = var15_15.getEntry();
                                                                    if (var10_10 != null && (var10_10 = var10_10.getProduct()) != null) {
                                                                        var10_10 = var10_10.getCode();
                                                                    } else {
                                                                        var66_70 = 0;
                                                                        var10_10 = null;
                                                                    }
                                                                    var66_70 = (int)Intrinsics.areEqual(var12_12, var10_10);
                                                                    if (var66_70 == 0) break block252;
                                                                    var10_10 = var8_8;
                                                                    if (var8_8 == null || (var64_68 = var8_8.length()) == 0 || (var64_68 = (int)Intrinsics.areEqual(var8_8, var16_20 = var23_27.getReturnId())) == 0) break block252;
                                                                    var16_20 = var23_27.getExchangeOrderID();
                                                                    if (var16_20 != null && (var64_68 = var16_20.length()) != 0 && (var64_68 = (int)b.i((String)(var16_20 = var23_27.getExchangeOrderID()), (String)var13_13, (boolean)(var66_70 = 1))) != 0) {
                                                                        var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                        var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                        var10_10 = Boolean.FALSE;
                                                                        var21_25.setReturnableExchangeable((Boolean)var10_10);
                                                                        var10_10 = Boolean.TRUE;
                                                                        var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                                    } else {
                                                                        var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                        if (var10_10 == null) {
                                                                            var10_10 = var17_21.getTrackerList();
                                                                        }
                                                                        var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                        var66_70 = (int)var17_21.isReturnableExchangeable();
                                                                        if (var66_70 != 0 && (var66_70 = (int)(var10_10 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                            var66_70 = 1;
                                                                        } else {
                                                                            var66_70 = 0;
                                                                            var10_10 = null;
                                                                        }
                                                                        var10_10 = (boolean)var66_70;
                                                                        var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                                    }
                                                                    var66_70 = var2_2.isExchangeOrder();
                                                                    if (var66_70 != 0) {
                                                                        var10_10 = Boolean.TRUE;
                                                                        var21_25.setExchangeOrder((Boolean)var10_10);
                                                                    }
                                                                    var21_25.setConsignment((Consignment)var17_21);
                                                                    var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                    var10_10 = var15_15.getEntry();
                                                                    var21_25.setCartEntry((CartEntry)var10_10);
                                                                    var10_10 = var23_27.getReturnStatus();
                                                                    var21_25.setOrderStatus((String)var10_10);
                                                                    var66_70 = var15_15.getLineItemQty();
                                                                    var10_10 = var66_70;
                                                                    var21_25.setQuantity((Integer)var10_10);
                                                                    var10_10 = var23_27.getReturnId();
                                                                    var21_25.setReturnId((String)var10_10);
                                                                    var10_10 = var15_15.getEntry().getEntryStatus();
                                                                    var21_25.setRawEntryStatus((String)var10_10);
                                                                    var22_26.add(var21_25);
                                                                    break block250;
                                                                }
                                                                if (var12_12 == null || (var66_70 = var3_3.length()) == 0) break block253;
                                                                var10_10 = var15_15.getEntry();
                                                                if (var10_10 != null && (var10_10 = var10_10.getProduct()) != null) {
                                                                    var10_10 = var10_10.getCode();
                                                                } else {
                                                                    var66_70 = 0;
                                                                    var10_10 = null;
                                                                }
                                                                var66_70 = (int)Intrinsics.areEqual(var12_12, var10_10);
                                                                if (var66_70 == 0 || var9_9 == 0 || ((var10_10 = var23_27.getExchangeOrderID()) == null || (var66_70 = var10_10.length()) == 0) && ((var66_70 = (int)var15_15.returnCancelled) != 0 || (var66_70 = (int)var15_15.exchangeReturnCancelled) != 0)) break block253;
                                                                var10_10 = var23_27.getExchangeOrderID();
                                                                if (var10_10 != null && (var66_70 = var10_10.length()) != 0 && (var66_70 = (int)b.i((String)(var10_10 = var23_27.getExchangeOrderID()), (String)var13_13, (boolean)(var64_68 = 1))) != 0) {
                                                                    var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                    var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                    var10_10 = Boolean.FALSE;
                                                                    var21_25.setReturnableExchangeable((Boolean)var10_10);
                                                                    var10_10 = Boolean.TRUE;
                                                                    var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                                } else {
                                                                    var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                    var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                    var66_70 = (int)var17_21.isReturnableExchangeable();
                                                                    if (var66_70 != 0 && (var66_70 = (int)(var10_10 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                        var66_70 = 1;
                                                                    } else {
                                                                        var66_70 = 0;
                                                                        var10_10 = null;
                                                                    }
                                                                    var10_10 = (boolean)var66_70;
                                                                    var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                                }
                                                                var66_70 = var2_2.isExchangeOrder();
                                                                if (var66_70 != 0) {
                                                                    var10_10 = Boolean.TRUE;
                                                                    var21_25.setExchangeOrder((Boolean)var10_10);
                                                                }
                                                                var21_25.setConsignment((Consignment)var17_21);
                                                                var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                                var10_10 = var15_15.getEntry();
                                                                var21_25.setCartEntry((CartEntry)var10_10);
                                                                var10_10 = var23_27.getReturnStatus();
                                                                var21_25.setOrderStatus((String)var10_10);
                                                                var66_70 = var15_15.getLineItemQty();
                                                                var10_10 = var66_70;
                                                                var21_25.setQuantity((Integer)var10_10);
                                                                var10_10 = var23_27.getReturnId();
                                                                var21_25.setReturnId((String)var10_10);
                                                                var10_10 = var15_15.getEntry().getEntryStatus();
                                                                var21_25.setRawEntryStatus((String)var10_10);
                                                                var22_26.add(var21_25);
                                                                break block250;
                                                            }
                                                            if (var12_12 == null || (var66_70 = var3_3.length()) == 0) break block254;
                                                            var10_10 = var15_15.getEntry();
                                                            if (var10_10 != null && (var10_10 = var10_10.getProduct()) != null) {
                                                                var10_10 = var10_10.getCode();
                                                            } else {
                                                                var66_70 = 0;
                                                                var10_10 = null;
                                                            }
                                                            var66_70 = (int)Intrinsics.areEqual(var12_12, var10_10);
                                                            if (var66_70 == 0 || (var10_10 = var23_27.getExchangeOrderID()) != null && (var66_70 = var10_10.length()) != 0 || (var10_10 = var23_27.getReturnId()) == null || (var66_70 = var10_10.length()) == 0 || (var66_70 = (int)(var10_10 = var23_27.getExchangeReturnRTO()).booleanValue()) == 0) break block254;
                                                            var10_10 = var23_27.getExchangeOrderID();
                                                            if (var10_10 != null && (var66_70 = var10_10.length()) != 0 && (var66_70 = b.i((String)(var10_10 = var23_27.getExchangeOrderID()), (String)var13_13, (boolean)(var64_68 = 1))) != 0) {
                                                                var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                var10_10 = Boolean.FALSE;
                                                                var21_25.setReturnableExchangeable((Boolean)var10_10);
                                                                var10_10 = Boolean.TRUE;
                                                                var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                            } else {
                                                                var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                                var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                                var66_70 = (int)var17_21.isReturnableExchangeable();
                                                                if (var66_70 != 0 && (var66_70 = (var10_10 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                    var66_70 = 1;
                                                                } else {
                                                                    var66_70 = 0;
                                                                    var10_10 = null;
                                                                }
                                                                var10_10 = (boolean)var66_70;
                                                                var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                            }
                                                            var66_70 = var2_2.isExchangeOrder();
                                                            if (var66_70 != 0) {
                                                                var10_10 = Boolean.TRUE;
                                                                var21_25.setExchangeOrder((Boolean)var10_10);
                                                            }
                                                            var21_25.setConsignment((Consignment)var17_21);
                                                            var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                            var10_10 = var15_15.getEntry();
                                                            var21_25.setCartEntry((CartEntry)var10_10);
                                                            var10_10 = var23_27.getReturnStatus();
                                                            var21_25.setOrderStatus((String)var10_10);
                                                            var66_70 = var15_15.getLineItemQty();
                                                            var10_10 = var66_70;
                                                            var21_25.setQuantity((Integer)var10_10);
                                                            var10_10 = var23_27.getReturnId();
                                                            var21_25.setReturnId((String)var10_10);
                                                            var10_10 = var23_27.getExchangeReturnRTO();
                                                            var21_25.setExchangeReturnRTO((Boolean)var10_10);
                                                            var10_10 = var15_15.getEntry().getEntryStatus();
                                                            var21_25.setRawEntryStatus((String)var10_10);
                                                            var22_26.add(var21_25);
                                                            break block250;
                                                        }
                                                        if (var12_12 == null || (var66_70 = var3_3.length()) == 0) break block255;
                                                        var10_10 = var15_15.getEntry();
                                                        if (var10_10 != null && (var10_10 = var10_10.getProduct()) != null) {
                                                            var10_10 = var10_10.getCode();
                                                        } else {
                                                            var66_70 = 0;
                                                            var10_10 = null;
                                                        }
                                                        var66_70 = (int)Intrinsics.areEqual(var12_12, var10_10);
                                                        if (var66_70 != 0 || (var66_70 = (int)TextUtils.isEmpty((CharSequence)(var10_10 = var23_27.getReturnId()))) != 0 || (var66_70 = (int)(var10_10 = var23_27.getExchangeReturnRTO()).booleanValue()) == 0 || !var7_7) break block255;
                                                        var10_10 = var23_27.getExchangeOrderID();
                                                        if (var10_10 != null && (var66_70 = var10_10.length()) != 0 && (var66_70 = b.i((String)(var10_10 = var23_27.getExchangeOrderID()), (String)var13_13, (boolean)(var64_68 = 1))) != 0) {
                                                            var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                            var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                            var10_10 = Boolean.FALSE;
                                                            var21_25.setReturnableExchangeable((Boolean)var10_10);
                                                            var10_10 = Boolean.TRUE;
                                                            var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                        } else {
                                                            var10_10 = var23_27.getForwardOrderRevampOrderTrackerSection();
                                                            var21_25.setForwardOrderRevampOrderTrackerSection((ArrayList)var10_10);
                                                            var66_70 = var17_21.isReturnableExchangeable();
                                                            if (var66_70 != 0 && (var66_70 = (int)(var10_10 = var15_15.getEntry()).isExchangeable()) != 0) {
                                                                var66_70 = 1;
                                                            } else {
                                                                var66_70 = 0;
                                                                var10_10 = null;
                                                            }
                                                            var10_10 = (boolean)var66_70;
                                                            var21_25.setViewExchangeAvailable((Boolean)var10_10);
                                                        }
                                                        var66_70 = var2_2.isExchangeOrder();
                                                        if (var66_70 != 0) {
                                                            var10_10 = Boolean.TRUE;
                                                            var21_25.setExchangeOrder((Boolean)var10_10);
                                                        }
                                                        var21_25.setConsignment((Consignment)var17_21);
                                                        var21_25.setOrderDetailLineItem((OrderDetailLineItem)var15_15);
                                                        var10_10 = var15_15.getEntry();
                                                        var21_25.setCartEntry((CartEntry)var10_10);
                                                        var10_10 = var23_27.getReturnStatus();
                                                        var21_25.setOrderStatus((String)var10_10);
                                                        var66_70 = var15_15.getLineItemQty();
                                                        var10_10 = var66_70;
                                                        var21_25.setQuantity((Integer)var10_10);
                                                        var10_10 = var23_27.getReturnId();
                                                        var21_25.setReturnId((String)var10_10);
                                                        var10_10 = var23_27.getExchangeReturnRTO();
                                                        var21_25.setExchangeReturnRTO((Boolean)var10_10);
                                                        var10_10 = var15_15.getEntry().getEntryStatus();
                                                        var21_25.setRawEntryStatus((String)var10_10);
                                                        var22_26.add(var21_25);
                                                        var10_10 = var15_15.getEntry();
                                                        if (var10_10 != null && (var10_10 = var10_10.getProduct()) != null) {
                                                            var10_10 = var10_10.getCode();
                                                        } else {
                                                            var66_70 = 0;
                                                            var10_10 = null;
                                                        }
                                                        var11_11.H((String)var10_10);
                                                        var10_10 = Unit.a;
                                                        break block250;
                                                    }
                                                    if (var41_45 == null) ** GOTO lbl-1000
                                                    var10_10 = var41_45;
                                                    var10_10 = var41_45;
                                                    var66_70 = (int)var10_10.isEmpty();
                                                    var64_68 = 1;
                                                    if ((var66_70 ^= var64_68) != 0) {
                                                        var10_10 = var41_45.iterator();
                                                        var64_68 = 0;
                                                        var16_20 = null;
                                                        while (var67_71 = var10_10.hasNext()) {
                                                            var42_46 = (CartEntry)var10_10.next();
                                                            if (var42_46 != null && (var42_46 = var42_46.getOrderEntry()) != null && (var42_46 = var42_46.getProduct()) != null) {
                                                                var65_69 = var42_46.getCode();
                                                                var42_46 = var10_10;
                                                                var10_10 = var65_69;
                                                            } else {
                                                                var42_46 = var10_10;
                                                                var66_70 = 0;
                                                                var10_10 = null;
                                                            }
                                                            var51_55 = var15_15.getEntry();
                                                            if (var51_55 != null && (var51_55 = var51_55.getProduct()) != null) {
                                                                var13_13 = var51_55 = var51_55.getCode();
                                                            } else {
                                                                var68_72 = false;
                                                                var13_13 = null;
                                                            }
                                                            var66_70 = (int)Intrinsics.areEqual(var10_10, var13_13);
                                                            if (var66_70 != 0) {
                                                                var10_10 = var23_27.getReturnId();
                                                                var66_70 = TextUtils.isEmpty((CharSequence)var10_10);
                                                                if (var66_70 == 0 && (var66_70 = TextUtils.isEmpty((CharSequence)(var10_10 = var23_27.getExchangeOrderID()))) == 0) {
                                                                    var64_68 = 0;
                                                                    var16_20 = null;
                                                                } else {
                                                                    var64_68 = 1;
                                                                }
                                                                if (var64_68 != 0) break;
                                                            }
                                                            var13_13 = var6_6;
                                                            var10_10 = var42_46;
                                                        }
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var64_68 = 0;
                                                        var16_20 = null;
                                                    }
                                                    if ((var66_70 = (int)TextUtils.isEmpty((CharSequence)(var10_10 = var23_27.getReturnId()))) == 0 && (var66_70 = (int)TextUtils.isEmpty((CharSequence)(var10_10 = var23_27.getExchangeOrderID()))) == 0) {
                                                        var66_70 = 1;
                                                    } else {
                                                        var66_70 = 0;
                                                        var10_10 = null;
                                                    }
                                                    if (var64_68 == 0 && var66_70 != 0) {
                                                        var10_10 = var15_15.getEntry();
                                                        var13_13 = var23_27.getExchangeOrderID();
                                                        var10_10.setExchangeId((String)var13_13);
                                                        var13_13 = var23_27.getReturnId();
                                                        var10_10.setReturnId((String)var13_13);
                                                        var68_72 = TextUtils.isEmpty((CharSequence)var8_8);
                                                        if (var68_72) {
                                                            var13_13 = a21.a;
                                                            Intrinsics.checkNotNull(var10_10);
                                                            var13_13.getClass();
                                                            a21.b(var24_28, (CartEntry)var10_10);
                                                        }
                                                    }
                                                    var10_10 = Unit.a;
                                                }
                                                var10_10 = var15_15.getEntry();
                                                var13_13 = var23_27.getReturnStatus();
                                                var10_10.setEntryStatus((String)var13_13);
                                                var13_13 = var23_27.getReturnStatus();
                                                var10_10.setNewEntryStatus((String)var13_13);
                                                var13_13 = var23_27.getExchangeOrderID();
                                                var10_10.setExchangeId((String)var13_13);
                                                var19_23.add(var10_10);
                                                if (var5_5) {
                                                    var10_10 = var15_15.getEntry().getProduct();
                                                    Y63.g((Product)var10_10);
                                                }
                                                var66_70 = var23_27.getReturnEntries().size();
                                                var15_15.setOrderDetailData(var34_38, var32_36, var66_70);
                                                var14_14.add(var15_15);
                                                var10_10 = var15_15.getEntry();
                                                if (var10_10 != null && (var10_10 = var10_10.getProduct()) != null) {
                                                    var10_10 = var10_10.getImages();
                                                    var13_13 = this;
lbl1227:
                                                    // 2 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var13_13 = this;
                                                var66_70 = 0;
                                                var10_10 = null;
                                                ** continue;
                                                var16_20 = var48_52;
                                                super.setImageList((List)var10_10, (ArrayList)var25_29);
                                                var10_10 = var15_15.getAmount();
                                                if (var10_10 != null && (var66_70 = (int)b.k((CharSequence)var10_10)) == 0) {
                                                    var15_15 = var15_15.getAmount();
                                                    var10_10 = var47_51;
                                                    Intrinsics.checkNotNullExpressionValue(var15_15, (String)var47_51);
                                                    var60_64 = Float.parseFloat((String)var15_15);
                                                    var46_50 += var60_64;
                                                }
lbl1244:
                                                // 4 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                                catch (NumberFormatException var15_18) {
                                                    var47_51 = var10_10;
                                                }
                                                break block256;
                                                catch (NumberFormatException var15_19) {
                                                    var10_10 = var47_51;
                                                }
                                            }
                                            var10_10 = yn3_0.a;
                                            var10_10.e((Throwable)var15_15);
                                            ** continue;
                                            var66_70 = 1;
                                            var10_10 = var13_13;
                                            var48_52 = var16_20;
                                            var64_68 = var49_53;
                                            var13_13 = var6_6;
                                        }
                                        var13_13 = var10_10;
                                        var16_20 = var48_52;
                                        var66_70 = 1;
                                        var60_64 = var46_50;
                                        break block246;
                                    }
                                    var13_13 = var10_10;
                                    var16_20 = var48_52;
                                    ** continue;
                                    var66_70 = 1;
                                    var31_35 = 0;
                                    var60_64 = 0.0f;
                                    var15_15 = null;
                                }
                                var23_27.setTotalAmount(var60_64);
                                var31_35 = var45_49 + 1;
                                var10_10 = var13_13;
                                var42_46 = var19_23;
                                var14_14 = var63_67;
                                var32_36 = var44_48;
                                var13_13 = var6_6;
                                var61_65 = var31_35;
                            }
                        }
                        var13_13 = var10_10;
                        var19_23 = var42_46;
                        var66_70 = 1;
                        var14_14 = var8_8;
                        var23_27 = var42_46;
                        var17_21 = var35_39;
                        var32_36 = var36_40;
                        var21_25 = var37_41;
                        var19_23 = var39_43;
                        var13_13 = var6_6;
                    }
                    var13_13 = var10_10;
                    var39_43 = var19_23;
lbl1298:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_13 = var10_10;
                var39_43 = var19_23;
                var33_37 = var20_24;
                ** while (true)
                var37_41 = var21_25;
                var19_23 = var23_27;
                var15_15 = var2_2.getConfirmedEntries();
                var10_10 = "getEntry(...)";
                if (var15_15 == null) break block257;
                var58_62 = var15_15.size();
                var17_21 = null;
                var32_36 = 0;
                var18_22 = null;
                var34_38 = 0;
                var20_24 = null;
                for (var69_73 = 0; var69_73 < var58_62; ++var69_73) {
                    block259: {
                        block258: {
                            var21_25 = var15_15.get(var69_73);
                            var23_27 = var37_41;
                            Intrinsics.checkNotNullExpressionValue(var21_25, (String)var37_41);
                            var21_25 = (OrderDetailLineItem)var21_25;
                            var35_39 = a21.a;
                            var6_6 = var15_15;
                            var15_15 = var21_25.getEntry();
                            var35_39.getClass();
                            a21.a((CartEntry)var15_15, var16_20);
                            if (var32_36 == 0 && var34_38 == 0) {
                                var31_35 = var69_73;
                            } else {
                                var31_35 = 0;
                                var60_64 = 0.0f;
                                var15_15 = null;
                            }
                            var70_74 = var21_25.getEpochPSD();
                            var72_75 = System.currentTimeMillis();
                            var32_36 = (int)(var70_74 == var72_75 ? 0 : (var70_74 < var72_75 ? -1 : 1));
                            if (var32_36 < 0) {
                                var32_36 = 1;
                            } else {
                                var32_36 = 0;
                                var18_22 = null;
                            }
                            var70_74 = var21_25.getEpochEddUpper();
                            var72_75 = System.currentTimeMillis();
                            var34_38 = (int)(var70_74 == var72_75 ? 0 : (var70_74 < var72_75 ? -1 : 1));
                            if (var34_38 < 0) {
                                var34_38 = 1;
                            } else {
                                var34_38 = 0;
                                var20_24 = null;
                            }
                            if (!var4_4) {
                                var32_36 = 0;
                                var18_22 = null;
                                var34_38 = 0;
                                var20_24 = null;
                            }
                            if ((var74_76 = var2_2.isExchangeOrder()) != 0) {
                                var74_76 = R$string.od_exchange_confirmed;
                                var35_39 = hv3_0.K(var74_76);
lbl1357:
                                // 2 sources

                                while (true) {
                                    var9_9 = var31_35;
                                    var37_41 = var23_27;
                                    var15_15 = var35_39;
                                    var35_39 = var22_26;
                                    break;
                                }
                            } else {
                                var74_76 = (int)var2_2.isPaymentSuccessful();
                                if (var74_76 != 0) {
                                    if (var34_38 != 0) {
                                        var74_76 = R$string.od_delivery_delayed;
                                        var35_39 = hv3_0.K(var74_76);
                                        ** continue;
                                    }
                                    if (var32_36 != 0) {
                                        var35_39 = var22_26;
                                        var37_41 = var23_27;
                                        var75_77 = var21_25.getEpochEddUpper();
                                        var9_9 = var31_35;
                                        var15_15 = k7.f(var75_77, "dd MMM");
                                        var22_26 = "Arriving by ";
                                        var15_15 = kp1_0.c((String)var22_26, (String)var15_15);
                                    } else {
                                        var9_9 = var31_35;
                                        var35_39 = var22_26;
                                        var37_41 = var23_27;
                                        var31_35 = R$string.od_confirmed;
                                        var15_15 = hv3_0.K(var31_35);
                                    }
                                } else {
                                    var9_9 = var31_35;
                                    var35_39 = var22_26;
                                    var37_41 = var23_27;
                                    var31_35 = R$string.od_payment_unsuccessful;
                                    var15_15 = hv3_0.K(var31_35);
                                }
                            }
                            if (var32_36 == 0 && var34_38 == 0) {
                                var77_78 = var9_9;
                            } else {
                                var77_78 = 0;
                                var22_26 = null;
                            }
                            var59_63 = OrderDetailFunctionalRepo.consignmentSize;
                            var21_25.setOrderDetailData(var69_73, var77_78, var59_63);
                            if (var5_5) {
                                var22_26 = var21_25.getEntry().getProduct();
                                Y63.g((Product)var22_26);
                            }
                            if (var12_12 == null || (var77_78 = var3_3.length()) == 0) break block258;
                            var22_26 = var21_25.getEntry();
                            if (var22_26 != null && (var22_26 = var22_26.getProduct()) != null) {
                                var22_26 = var22_26.getCode();
                            } else {
                                var77_78 = 0;
                                var22_26 = null;
                            }
                            var77_78 = (int)Intrinsics.areEqual(var12_12, var22_26);
                            if (var77_78 == 0) break block258;
                            var63_67 = var22_26;
                            var41_45 = null;
                            var67_71 = false;
                            var42_46 = null;
                            var44_48 = 0;
                            var45_49 = 0;
                            var46_50 = 0.0f;
                            var47_51 = null;
                            var48_52 = null;
                            var49_53 = 0;
                            var50_54 = false;
                            var51_55 = null;
                            var52_56 = null;
                            var53_57 = 0;
                            var54_58 = 0.0f;
                            var55_59 = null;
                            var43_47 = 0x3FFFFF;
                            var22_26 = new SelectedOrderItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var43_47, null);
                            var22_26.setOrderDetailLineItem((OrderDetailLineItem)var21_25);
                            var23_27 = var21_25.getEntry();
                            var22_26.setCartEntry((CartEntry)var23_27);
                            var22_26.setOrderStatus((String)var15_15);
                            var23_27 = var21_25.getTrackerList();
                            var22_26.setForwardOrderRevampOrderTrackerSection(var23_27);
                            var59_63 = var21_25.getLineItemQty();
                            var23_27 = var59_63;
                            var22_26.setQuantity((Integer)var23_27);
                            var23_27 = var21_25.getEntry().getEntryStatus();
                            var22_26.setRawEntryStatus((String)var23_27);
                            var23_27 = var33_37;
                            var33_37.add((ArrayList<ArrayList<Object>>)var22_26);
                            var9_9 = var58_62;
                            break block259;
                        }
                        var23_27 = var33_37;
                        if (var12_12 == null || (var77_78 = var3_3.length()) == 0) ** GOTO lbl-1000
                        var22_26 = var21_25.getEntry();
                        if (var22_26 != null && (var22_26 = var22_26.getProduct()) != null) {
                            var22_26 = var22_26.getCode();
                        } else {
                            var77_78 = 0;
                            var22_26 = null;
                        }
                        var77_78 = (int)Intrinsics.areEqual(var12_12, var22_26);
                        if (var77_78 == 0 && var7_7) {
                            var63_67 = var22_26;
                            var41_45 = null;
                            var67_71 = false;
                            var42_46 = null;
                            var44_48 = 0;
                            var45_49 = 0;
                            var46_50 = 0.0f;
                            var47_51 = null;
                            var48_52 = null;
                            var49_53 = 0;
                            var50_54 = false;
                            var51_55 = null;
                            var52_56 = null;
                            var53_57 = 0;
                            var54_58 = 0.0f;
                            var55_59 = null;
                            var43_47 = 0x3FFFFF;
                            var22_26 = new SelectedOrderItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var43_47, null);
                            var22_26.setOrderDetailLineItem((OrderDetailLineItem)var21_25);
                            var9_9 = var58_62;
                            var14_14 = var21_25.getEntry();
                            var22_26.setCartEntry((CartEntry)var14_14);
                            var22_26.setOrderStatus((String)var15_15);
                            var14_14 = var21_25.getTrackerList();
                            var22_26.setForwardOrderRevampOrderTrackerSection((ArrayList)var14_14);
                            var58_62 = var21_25.getLineItemQty();
                            var14_14 = var58_62;
                            var22_26.setQuantity((Integer)var14_14);
                            var14_14 = var21_25.getEntry().getEntryStatus();
                            var22_26.setRawEntryStatus((String)var14_14);
                            var23_27.add((ArrayList<ArrayList<Object>>)var22_26);
                            var14_14 = var21_25.getEntry();
                            if (var14_14 != null && (var14_14 = var14_14.getProduct()) != null) {
                                var14_14 = var14_14.getCode();
                            } else {
                                var58_62 = 0;
                                var14_14 = null;
                            }
                            var11_11.H((String)var14_14);
                            var14_14 = Unit.a;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var9_9 = var58_62;
                            var58_62 = (int)TextUtils.isEmpty((CharSequence)var8_8);
                            if (var58_62 != 0) {
                                var14_14 = var21_25.getEntry();
                                Intrinsics.checkNotNullExpressionValue(var14_14, var10_10);
                                a21.b(var24_28, (CartEntry)var14_14);
                            }
                            var14_14 = Unit.a;
                        }
                    }
                    var14_14 = var21_25.getEntry();
                    var14_14.setEntryStatus((String)var15_15);
                    var14_14.setNewEntryStatus((String)var15_15);
                    var19_23.add(var14_14);
                    var15_15 = var21_25.getEntry();
                    if (var15_15 != null && (var15_15 = var15_15.getProduct()) != null) {
                        var15_15 = var15_15.getImages();
                    } else {
                        var31_35 = 0;
                        var15_15 = null;
                        var60_64 = 0.0f;
                    }
                    super.setImageList((List)var15_15, (ArrayList)var25_29);
                    var15_15 = var6_6;
                    var58_62 = var9_9;
                    var33_37 = var23_27;
                    var22_26 = var35_39;
                }
            }
            var35_39 = var22_26;
            var23_27 = var33_37;
            var15_15 = var2_2.getCancelledEntries();
            if (var15_15 == null) break block260;
            var14_14 = h40_0.a;
            var14_14 = h40_0.X();
            if (var14_14 != null && (var14_14 = var14_14.getEnable()) != null) {
                var58_62 = (int)var14_14.booleanValue();
            } else {
                var58_62 = 0;
                var14_14 = null;
            }
            var69_73 = var15_15.size();
            var18_22 = null;
            for (var32_36 = 0; var32_36 < var69_73; var32_36 += var78_79) {
                block262: {
                    block261: {
                        var20_24 = var15_15.get(var32_36);
                        var21_25 = var37_41;
                        Intrinsics.checkNotNullExpressionValue(var20_24, (String)var37_41);
                        var20_24 = (OrderDetailLineItem)var20_24;
                        var22_26 = a21.a;
                        var2_2 = var15_15;
                        var15_15 = var20_24.getEntry();
                        var22_26.getClass();
                        a21.a((CartEntry)var15_15, var16_20);
                        var31_35 = OrderDetailFunctionalRepo.consignmentSize;
                        var77_78 = 0;
                        var22_26 = null;
                        var20_24.setOrderDetailData(var32_36, 0, var31_35);
                        if (var5_5) {
                            var15_15 = var20_24.getEntry().getProduct();
                            Y63.g((Product)var15_15);
                        }
                        var15_15 = var20_24.getEntry().getProduct().getImages();
                        super.setImageList((List)var15_15, (ArrayList)var25_29);
                        if (var12_12 == null || (var31_35 = var3_3.length()) == 0) break block261;
                        var15_15 = var20_24.getEntry();
                        if (var15_15 != null && (var15_15 = var15_15.getProduct()) != null) {
                            var15_15 = var15_15.getCode();
                        } else {
                            var31_35 = 0;
                            var15_15 = null;
                            var60_64 = 0.0f;
                        }
                        var31_35 = (int)Intrinsics.areEqual(var12_12, var15_15);
                        if (var31_35 == 0) break block261;
                        var63_67 = var15_15;
                        var41_45 = null;
                        var67_71 = false;
                        var42_46 = null;
                        var44_48 = 0;
                        var45_49 = 0;
                        var46_50 = 0.0f;
                        var47_51 = null;
                        var48_52 = null;
                        var49_53 = 0;
                        var50_54 = false;
                        var51_55 = null;
                        var52_56 = null;
                        var53_57 = 0;
                        var54_58 = 0.0f;
                        var55_59 = null;
                        var43_47 = 0x3FFFFF;
                        var15_15 = new SelectedOrderItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var43_47, null);
                        var15_15.setOrderDetailLineItem((OrderDetailLineItem)var20_24);
                        var22_26 = var20_24.getEntry();
                        var15_15.setCartEntry((CartEntry)var22_26);
                        var22_26 = var20_24.getEntry();
                        Intrinsics.checkNotNullExpressionValue(var22_26, var10_10);
                        var22_26 = super.getCancelledOrderStatus((CartEntry)var22_26);
                        var15_15.setOrderStatus((String)var22_26);
                        var22_26 = var20_24.getTrackerList();
                        var15_15.setForwardOrderRevampOrderTrackerSection((ArrayList)var22_26);
                        var77_78 = var20_24.getLineItemQty();
                        var22_26 = var77_78;
                        var15_15.setQuantity((Integer)var22_26);
                        var22_26 = var20_24.getEntry().getEntryStatus();
                        var15_15.setRawEntryStatus((String)var22_26);
                        if (var58_62 != 0) {
                            var22_26 = var13_13.getCancelledRefundDetailInfo((OrderDetailLineItem)var20_24, (String)var12_12);
                            var15_15.setCancelledRefundDetails((CancelledRefundDetailInfo)var22_26);
                        }
                        var22_26 = var26_30;
                        var26_30.add(var15_15);
                        var26_30 = var25_29;
                        break block262;
                    }
                    var22_26 = var26_30;
                    if (var12_12 == null || (var31_35 = var3_3.length()) == 0) ** GOTO lbl-1000
                    var15_15 = var20_24.getEntry();
                    if (var15_15 != null && (var15_15 = var15_15.getProduct()) != null) {
                        var15_15 = var15_15.getCode();
                    } else {
                        var31_35 = 0;
                        var15_15 = null;
                        var60_64 = 0.0f;
                    }
                    var31_35 = (int)Intrinsics.areEqual(var12_12, var15_15);
                    if (var31_35 == 0 && var7_7) {
                        var63_67 = var15_15;
                        var41_45 = null;
                        var67_71 = false;
                        var42_46 = null;
                        var44_48 = 0;
                        var45_49 = 0;
                        var46_50 = 0.0f;
                        var47_51 = null;
                        var48_52 = null;
                        var49_53 = 0;
                        var50_54 = false;
                        var51_55 = null;
                        var52_56 = null;
                        var53_57 = 0;
                        var54_58 = 0.0f;
                        var55_59 = null;
                        var43_47 = 0x3FFFFF;
                        var15_15 = new SelectedOrderItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var43_47, null);
                        var15_15.setOrderDetailLineItem((OrderDetailLineItem)var20_24);
                        var26_30 = var25_29;
                        var25_29 = var20_24.getEntry();
                        var15_15.setCartEntry((CartEntry)var25_29);
                        var25_29 = var20_24.getEntry();
                        Intrinsics.checkNotNullExpressionValue(var25_29, var10_10);
                        var25_29 = super.getCancelledOrderStatus((CartEntry)var25_29);
                        var15_15.setOrderStatus((String)var25_29);
                        var25_29 = var20_24.getTrackerList();
                        var15_15.setForwardOrderRevampOrderTrackerSection((ArrayList)var25_29);
                        var78_79 = var20_24.getLineItemQty();
                        var25_29 = var78_79;
                        var15_15.setQuantity((Integer)var25_29);
                        var25_29 = var20_24.getEntry().getEntryStatus();
                        var15_15.setRawEntryStatus((String)var25_29);
                        if (var58_62 != 0) {
                            var25_29 = var13_13.getCancelledRefundDetailInfo((OrderDetailLineItem)var20_24, (String)var12_12);
                            var15_15.setCancelledRefundDetails((CancelledRefundDetailInfo)var25_29);
                        }
                        var22_26.add(var15_15);
                        var15_15 = var20_24.getEntry();
                        if (var15_15 != null && (var15_15 = var15_15.getProduct()) != null) {
                            var15_15 = var15_15.getCode();
                        } else {
                            var31_35 = 0;
                            var15_15 = null;
                            var60_64 = 0.0f;
                        }
                        var11_11.H((String)var15_15);
                        var15_15 = Unit.a;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var26_30 = var25_29;
                        var31_35 = (int)TextUtils.isEmpty((CharSequence)var8_8);
                        if (var31_35 != 0) {
                            var15_15 = var20_24.getEntry();
                            Intrinsics.checkNotNullExpressionValue(var15_15, var10_10);
                            a21.b(var24_28, (CartEntry)var15_15);
                        }
                        var15_15 = Unit.a;
                    }
                }
                var15_15 = var20_24.getEntry();
                Intrinsics.checkNotNull(var15_15);
                var25_29 = super.getCancelledOrderStatus((CartEntry)var15_15);
                var15_15.setEntryStatus((String)var25_29);
                var15_15.setNewEntryStatus((String)var25_29);
                var19_23.add(var15_15);
                var78_79 = 1;
                var15_15 = var2_2;
                var37_41 = var21_25;
                var25_29 = var26_30;
                var26_30 = var22_26;
            }
        }
        var22_26 = var26_30;
        var78_79 = 1;
        var31_35 = var39_43.isEmpty() ^ var78_79;
        var10_10 = var30_34;
        if (var31_35 != 0) {
            var11_11 = var39_43;
            var30_34.addAll(var39_43);
        }
        if ((var31_35 = var23_27.isEmpty() ^ var78_79) != 0) {
            var10_10.addAll(var23_27);
        }
        if ((var31_35 = var35_39.isEmpty() ^ var78_79) != 0) {
            var11_11 = var35_39;
            var10_10.addAll(var35_39);
        }
        if ((var31_35 = var22_26.isEmpty() ^ var78_79) != 0) {
            var10_10.addAll(var22_26);
        }
        var11_11 = var28_32;
        var12_12 = var29_33;
        var28_32.put(var29_33, var24_28);
        var28_32.put("gift_products", (Cloneable)var16_20);
        var12_12 = var27_31;
        var28_32.put(var27_31, (Cloneable)var10_10);
        return var28_32;
    }

    public final void setConsignmentSize(int n3) {
        consignmentSize = n3;
    }

    public final void setReturnRequest(ReturnRequest returnRequest) {
        OrderDetailFunctionalRepo.returnRequest = returnRequest;
    }

    public final void setScrollPosition(int n3) {
        scrollPosition = n3;
    }
}

