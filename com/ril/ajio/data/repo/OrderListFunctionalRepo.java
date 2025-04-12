/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.data.repo;

import android.text.TextUtils;
import com.ril.ajio.services.data.Order.orderhistory.DateRangeItem;
import com.ril.ajio.services.data.Order.orderhistory.OrderHistory;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.ril.ajio.services.data.Order.orderhistory.Orders;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class OrderListFunctionalRepo {
    public static final int $stable;
    public static final OrderListFunctionalRepo INSTANCE;
    private static int clickedPageNumber;
    private static String currentDateRangeKey;
    private static int currentPage;
    private static List orderDateRange;
    private static OrderHistory orderHistory;
    private static ArrayList orderList;
    private static int totalPages;

    static {
        ArrayList arrayList = new ArrayList();
        INSTANCE = arrayList;
        orderList = arrayList = new ArrayList();
        totalPages = 1;
        clickedPageNumber = -1;
        $stable = 8;
    }

    private OrderListFunctionalRepo() {
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

    public final int getClickedPageNumber() {
        return clickedPageNumber;
    }

    public final String getCurrentOrderDateRangeKey() {
        return currentDateRangeKey;
    }

    public final int getCurrentPage() {
        return currentPage;
    }

    public final String getDataRangeResultValueForKey() {
        Object object;
        Object object2 = orderDateRange;
        Object object3 = null;
        if (object2 != null && (object = orderHistory) != null) {
            Intrinsics.checkNotNull(object2);
            object2 = (Collection)object2;
            boolean bl2 = object2.isEmpty() ^ true;
            if (bl2) {
                object2 = orderHistory;
                Intrinsics.checkNotNull(object2);
                object2 = ((OrderHistory)object2).getDataRangeResultKey();
                if (object2 != null) {
                    block5: {
                        boolean bl3;
                        object2 = orderDateRange;
                        Intrinsics.checkNotNull(object2);
                        object2 = ((Iterable)object2).iterator();
                        while (bl3 = object2.hasNext()) {
                            Object object4 = object = object2.next();
                            object4 = (DateRangeItem)object;
                            Object object5 = orderHistory;
                            object5 = object5 != null ? ((OrderHistory)object5).getDataRangeResultKey() : null;
                            boolean bl4 = b.i((String)object5, (String)(object4 = ((DateRangeItem)object4).getKey()), false);
                            if (!bl4) continue;
                            break block5;
                        }
                        bl3 = false;
                        object = null;
                    }
                    object = (DateRangeItem)object;
                    if (object != null && (object2 = ((DateRangeItem)object).getValue()) != null) {
                        object3 = object2;
                    }
                }
            }
        }
        return object3;
    }

    public final List getOrderDateRange() {
        return orderDateRange;
    }

    public final OrderHistory getOrderHistory() {
        return orderHistory;
    }

    public final ArrayList getOrderItemLineList(OrderHistory orderHistory) {
        int n3;
        ArrayList<Serializable> arrayList;
        if (orderHistory != null && (arrayList = orderHistory.getOrders()) != null && (n3 = (arrayList = orderHistory.getOrders()).size()) != 0) {
            arrayList = new ArrayList<Serializable>();
            int n4 = currentPage;
            int n7 = clickedPageNumber;
            int n8 = -1;
            if (n7 != n8) {
                n4 = n7;
            }
            ArrayList arrayList2 = orderHistory.getOrders();
            n7 = arrayList2.size();
            n8 = 0;
            for (int i3 = 0; i3 < n7; ++i3) {
                int n10;
                Serializable serializable;
                Orders orders = (Orders)orderHistory.getOrders().get(i3);
                if (orders == null || (serializable = orders.getOrderItemLines()) == null || (n10 = ((ArrayList)(serializable = orders.getOrderItemLines())).size()) == 0) continue;
                serializable = new OrderItemLine();
                ((OrderItemLine)serializable).setPagenumber(n4);
                ((OrderItemLine)serializable).setViewType(1);
                String string2 = orders.getOrderId();
                ((OrderItemLine)serializable).setOrderId(string2);
                arrayList.add(serializable);
                serializable = orders.getOrderItemLines();
                n10 = ((ArrayList)serializable).size();
                ArrayList<String> arrayList3 = null;
                string2 = null;
                for (int i8 = 0; i8 < n10; ++i8) {
                    float f5;
                    String string3;
                    int n14;
                    OrderItemLine orderItemLine = (OrderItemLine)orders.getOrderItemLines().get(i8);
                    orderItemLine.setPagenumber(n4);
                    String string4 = no_2.d(orderItemLine);
                    int n15 = string4.length();
                    if (n15 != 0 && (n14 = Intrinsics.areEqual(string4, string3 = "PAYMENT UNSUCCESSFUL")) != 0) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<String>();
                        }
                        string4 = orderItemLine.getImageUrl();
                        arrayList3.add(string4);
                        n14 = n10 + -1;
                        if (i8 != n14) continue;
                        orderItemLine.setImageUrlList(arrayList3);
                        n14 = 3;
                        f5 = 4.2E-45f;
                        orderItemLine.setViewType(n14);
                    } else {
                        string4 = orderItemLine.getReturnId();
                        n14 = TextUtils.isEmpty((CharSequence)string4);
                        if (n14 == 0 && (n14 = (int)(orderHistory.getReturnRevampNewFlowEnabled() ? 1 : 0)) != 0 && (n14 = (int)(hv3_0.D() ? 1 : 0)) != 0) {
                            n14 = 4;
                            f5 = 5.6E-45f;
                            orderItemLine.setViewType(n14);
                        } else {
                            n14 = 2;
                            f5 = 2.8E-45f;
                            orderItemLine.setViewType(n14);
                        }
                    }
                    string4 = orders.getPaymentMode();
                    orderItemLine.setPaymentMode(string4);
                    string4 = orders.getOrderDate();
                    orderItemLine.setOrderDate(string4);
                    f5 = orders.getDiscount();
                    orderItemLine.setDiscount(f5);
                    f5 = orders.getTotalAmount();
                    orderItemLine.setTotalAmount(f5);
                    f5 = orders.getShippingCharge();
                    orderItemLine.setShippingCharge(f5);
                    string4 = orders.getOrderType();
                    orderItemLine.setOrderLevelType(string4);
                    arrayList.add(orderItemLine);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final ArrayList getOrderList() {
        return orderList;
    }

    public final int getTotalOrdersCount() {
        int n3;
        OrderHistory orderHistory = OrderListFunctionalRepo.orderHistory;
        if (orderHistory != null) {
            n3 = orderHistory.getTotalOrders();
        } else {
            n3 = 0;
            orderHistory = null;
        }
        return n3;
    }

    public final int getTotalPages() {
        return totalPages;
    }

    public final boolean isOrderDateRangeAvailable() {
        List list = orderDateRange;
        boolean bl2 = false;
        if (list != null) {
            int n3;
            if (list != null) {
                n3 = list.size();
            } else {
                n3 = 0;
                list = null;
            }
            if (n3 > 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void parseResponse(OrderHistory object) {
        if (object == null) {
            return;
        }
        int n3 = clickedPageNumber;
        int n4 = -1;
        if (n3 == n4) {
            List list;
            OrderHistory orderHistory = OrderListFunctionalRepo.orderHistory;
            if (orderHistory != null) {
                n3 = 0;
                orderHistory = null;
                currentDateRangeKey = null;
            }
            OrderListFunctionalRepo.orderHistory = object;
            n3 = currentPage;
            currentPage = ((OrderHistory)object).getCurrentPage();
            totalPages = n4 = ((OrderHistory)object).getTotalPages();
            ArrayList arrayList = this.getOrderItemLineList((OrderHistory)object);
            orderDateRange = list = ((OrderHistory)object).getOrderDateRange();
            currentDateRangeKey = object = ((OrderHistory)object).getDataRangeResultKey();
            int n7 = 1;
            if (n3 < n7) {
                object = orderList;
                ((ArrayList)object).clear();
            }
            if (arrayList != null) {
                object = orderList;
                ((ArrayList)object).addAll(arrayList);
            }
        } else {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            if ((object = this.getOrderItemLineList((OrderHistory)object)) != null) {
                String string2;
                ArrayList arrayList2 = orderList;
                int n8 = arrayList2.size();
                int n10 = 0;
                OrderItemLine orderItemLine = null;
                while (true) {
                    string2 = "get(...)";
                    if (n10 >= n8) break;
                    Object object2 = orderList.get(n10);
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    object2 = (OrderItemLine)object2;
                    int n14 = ((OrderItemLine)object2).getPagenumber();
                    int n15 = clickedPageNumber;
                    if (n14 == n15) break;
                    arrayList.add(object2);
                    ++n10;
                }
                arrayList.addAll((Collection<Object>)object);
                arrayList2 = orderList;
                n8 = arrayList2.size();
                for (int i3 = arrayList.size(); i3 < n8; ++i3) {
                    orderItemLine = (OrderItemLine)orderList.get(i3);
                    Intrinsics.checkNotNullExpressionValue(orderItemLine, string2);
                    orderItemLine = orderItemLine;
                    arrayList.add(orderItemLine);
                }
                orderList.clear();
                object = orderList;
                ((ArrayList)object).addAll(arrayList);
                clickedPageNumber = n4;
            }
        }
    }

    public final void resetData() {
        currentPage = 0;
        totalPages = 1;
        clickedPageNumber = -1;
        orderList.clear();
        orderHistory = null;
        currentDateRangeKey = null;
    }

    public final void setClickedPageNumber(int n3) {
        clickedPageNumber = n3;
    }

    public final void setCurrentOrderDateRangeKey(String string2) {
        currentDateRangeKey = string2;
    }

    public final void setCurrentPage(int n3) {
        currentPage = n3;
    }

    public final void setOrderDateRange(List list) {
        orderDateRange = list;
    }

    public final void setOrderHistory(OrderHistory orderHistory) {
        OrderListFunctionalRepo.orderHistory = orderHistory;
    }

    public final void setOrderList(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        orderList = arrayList;
    }

    public final void setTotalPages(int n3) {
        totalPages = n3;
    }
}

