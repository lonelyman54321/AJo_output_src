/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.CartRequest;
import com.ril.ajio.services.data.Payment.CashOnDeliveryInformation;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.FraudEngineResponse;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.OrderSummary;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.Tenant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TenantResponse
implements Serializable {
    private String accessToken;
    private List banners;
    private String cartCheckSum;
    private String cartCheckSumCOD;
    private final Boolean cartInternalWalletsEnabled;
    private CartRequest cartRequest;
    private CashOnDeliveryInformation cashOnDeliveryInformation;
    private Customer customer;
    private String deviceChecksum;
    private String deviceId;
    private String fraudEngineRequestAuthToken;
    private FraudEngineResponse fraudEngineResponseDetails;
    private final ArrayList internalWallets;
    private final Boolean isEmiAvailable;
    private Boolean multipleWalletsSupported;
    private Order order;
    private OrderSummary orderSummary;
    private String payInstrumentsAllChecksum;
    private String payInstrumentsStoredChecksum;
    private String payInstrumentsStoredDelChecksum;
    private PaymentChannelInformation paymentChannelInformation;
    private String requestChecksum;
    private String statusChecksum;
    private String statusGetChecksum;
    private Tenant tenant;
    private String tenantTransactionId;
    private String transactionToken;

    public TenantResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1 >>> 5, null);
    }

    public TenantResponse(Order order, Tenant tenant, Customer customer, PaymentChannelInformation paymentChannelInformation, List list, CashOnDeliveryInformation cashOnDeliveryInformation, CartRequest cartRequest, String string2, Boolean bl2, String string3, String string4, String string5, String string6, String string7, String string8, FraudEngineResponse fraudEngineResponse, String string9, String string10, String string11, String string12, String string13, String string14, String string15, OrderSummary orderSummary, ArrayList arrayList, Boolean bl3, Boolean bl4) {
        this.order = order;
        this.tenant = tenant;
        this.customer = customer;
        this.paymentChannelInformation = paymentChannelInformation;
        this.banners = list;
        this.cashOnDeliveryInformation = cashOnDeliveryInformation;
        this.cartRequest = cartRequest;
        this.accessToken = string2;
        this.multipleWalletsSupported = bl2;
        this.cartCheckSum = string3;
        this.cartCheckSumCOD = string4;
        this.requestChecksum = string5;
        this.tenantTransactionId = string6;
        this.transactionToken = string7;
        this.payInstrumentsAllChecksum = string8;
        this.fraudEngineResponseDetails = fraudEngineResponse;
        this.payInstrumentsStoredChecksum = string9;
        this.payInstrumentsStoredDelChecksum = string10;
        this.statusChecksum = string11;
        this.statusGetChecksum = string12;
        this.deviceChecksum = string13;
        this.deviceId = string14;
        this.fraudEngineRequestAuthToken = string15;
        this.orderSummary = orderSummary;
        this.internalWallets = arrayList;
        this.cartInternalWalletsEnabled = bl3;
        this.isEmiAvailable = bl4;
    }

    public /* synthetic */ TenantResponse(Order serializable, Tenant serializable2, Customer serializable3, PaymentChannelInformation serializable4, List object, CashOnDeliveryInformation object2, CartRequest serializable5, String object3, Boolean object4, String object5, String string2, String string3, String string4, String string5, String string6, FraudEngineResponse object6, String object7, String string7, String string8, String string9, String string10, String string11, String string12, OrderSummary object8, ArrayList serializable6, Boolean serializable7, Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bl3;
        ArrayList arrayList;
        OrderSummary orderSummary;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        FraudEngineResponse fraudEngineResponse;
        String string20;
        String string21;
        String string22;
        String string23;
        String string24;
        String string25;
        String string26;
        CartRequest cartRequest;
        CashOnDeliveryInformation cashOnDeliveryInformation;
        List list;
        PaymentChannelInformation paymentChannelInformation;
        Customer customer;
        Tenant tenant;
        Order order;
        int n4 = n3;
        int n7 = n3 & 1;
        if (n7 != 0) {
            n7 = 0;
            order = null;
        } else {
            order = serializable;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            tenant = null;
        } else {
            tenant = serializable2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            customer = null;
        } else {
            customer = serializable3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            paymentChannelInformation = null;
        } else {
            paymentChannelInformation = serializable4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            list = null;
        } else {
            list = object;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            cashOnDeliveryInformation = null;
        } else {
            cashOnDeliveryInformation = object2;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            cartRequest = null;
        } else {
            cartRequest = serializable5;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string26 = null;
        } else {
            string26 = object3;
        }
        int n19 = n4 & 0x100;
        Object object9 = n19 != 0 ? Boolean.FALSE : object4;
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string25 = null;
        } else {
            string25 = object5;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string24 = null;
        } else {
            string24 = string2;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string23 = null;
        } else {
            string23 = string3;
        }
        int n24 = n4 & 0x1000;
        if (n24 != 0) {
            n24 = 0;
            string22 = null;
        } else {
            string22 = string4;
        }
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            string21 = null;
        } else {
            string21 = string5;
        }
        int n26 = n4 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string20 = null;
        } else {
            string20 = string6;
        }
        int n27 = n4 & 0x8000;
        if (n27 != 0) {
            n27 = 0;
            fraudEngineResponse = null;
        } else {
            fraudEngineResponse = object6;
        }
        int n28 = n4 & 0x10000;
        if (n28 != 0) {
            n28 = 0;
            string19 = null;
        } else {
            string19 = object7;
        }
        int n29 = n4 & 0x20000;
        if (n29 != 0) {
            n29 = 0;
            string18 = null;
        } else {
            string18 = string7;
        }
        int n30 = n4 & 0x40000;
        if (n30 != 0) {
            n30 = 0;
            string17 = null;
        } else {
            string17 = string8;
        }
        int n32 = n4 & 0x80000;
        if (n32 != 0) {
            n32 = 0;
            string16 = null;
        } else {
            string16 = string9;
        }
        int n34 = n4 & 0x100000;
        if (n34 != 0) {
            n34 = 0;
            string15 = null;
        } else {
            string15 = string10;
        }
        int n35 = n4 & 0x200000;
        if (n35 != 0) {
            n35 = 0;
            string14 = null;
        } else {
            string14 = string11;
        }
        int n36 = n4 & 0x400000;
        if (n36 != 0) {
            n36 = 0;
            string13 = null;
        } else {
            string13 = string12;
        }
        int n37 = n4 & 0x800000;
        if (n37 != 0) {
            n37 = 0;
            orderSummary = null;
        } else {
            orderSummary = object8;
        }
        int n38 = n4 & 0x1000000;
        if (n38 != 0) {
            n38 = 0;
            arrayList = null;
        } else {
            arrayList = serializable6;
        }
        int n39 = n4 & 0x2000000;
        Boolean bl4 = n39 != 0 ? Boolean.FALSE : serializable7;
        int n41 = 0x4000000;
        if ((n4 &= n41) != 0) {
            n4 = 0;
            bl3 = null;
        } else {
            bl3 = bl2;
        }
        serializable = this;
        serializable2 = order;
        serializable3 = tenant;
        serializable4 = customer;
        object = paymentChannelInformation;
        object2 = list;
        serializable5 = cashOnDeliveryInformation;
        object3 = cartRequest;
        object4 = string26;
        object5 = object9;
        string2 = string25;
        string3 = string24;
        string4 = string23;
        string5 = string22;
        string6 = string21;
        object6 = string20;
        object7 = fraudEngineResponse;
        string7 = string19;
        string8 = string18;
        string9 = string17;
        string10 = string16;
        string11 = string15;
        string12 = string14;
        object8 = string13;
        serializable6 = orderSummary;
        serializable7 = arrayList;
        bl2 = bl4;
        this(order, tenant, customer, paymentChannelInformation, list, cashOnDeliveryInformation, cartRequest, string26, (Boolean)object9, string25, string24, string23, string22, string21, string20, fraudEngineResponse, string19, string18, string17, string16, string15, string14, string13, orderSummary, arrayList, bl4, bl3);
    }

    public static /* synthetic */ TenantResponse copy$default(TenantResponse tenantResponse, Order order, Tenant tenant, Customer customer, PaymentChannelInformation paymentChannelInformation, List list, CashOnDeliveryInformation cashOnDeliveryInformation, CartRequest cartRequest, String string2, Boolean bl2, String string3, String string4, String string5, String string6, String string7, String string8, FraudEngineResponse object, String object2, String object3, String object4, String object5, String object6, String object7, String object8, OrderSummary object9, ArrayList object10, Boolean object11, Boolean bl3, int n3, Object object12) {
        TenantResponse tenantResponse2 = tenantResponse;
        int n4 = n3;
        int n7 = n3 & 1;
        Order order2 = n7 != 0 ? tenantResponse.order : order;
        int n8 = n4 & 2;
        Tenant tenant2 = n8 != 0 ? tenantResponse2.tenant : tenant;
        int n10 = n4 & 4;
        Customer customer2 = n10 != 0 ? tenantResponse2.customer : customer;
        int n14 = n4 & 8;
        PaymentChannelInformation paymentChannelInformation2 = n14 != 0 ? tenantResponse2.paymentChannelInformation : paymentChannelInformation;
        int n15 = n4 & 0x10;
        List list2 = n15 != 0 ? tenantResponse2.banners : list;
        int n16 = n4 & 0x20;
        CashOnDeliveryInformation cashOnDeliveryInformation2 = n16 != 0 ? tenantResponse2.cashOnDeliveryInformation : cashOnDeliveryInformation;
        int n17 = n4 & 0x40;
        CartRequest cartRequest2 = n17 != 0 ? tenantResponse2.cartRequest : cartRequest;
        int n18 = n4 & 0x80;
        String string9 = n18 != 0 ? tenantResponse2.accessToken : string2;
        int n19 = n4 & 0x100;
        Boolean bl4 = n19 != 0 ? tenantResponse2.multipleWalletsSupported : bl2;
        int n20 = n4 & 0x200;
        String string10 = n20 != 0 ? tenantResponse2.cartCheckSum : string3;
        int n21 = n4 & 0x400;
        String string11 = n21 != 0 ? tenantResponse2.cartCheckSumCOD : string4;
        int n22 = n4 & 0x800;
        String string12 = n22 != 0 ? tenantResponse2.requestChecksum : string5;
        int n24 = n4 & 0x1000;
        String string13 = n24 != 0 ? tenantResponse2.tenantTransactionId : string6;
        int n25 = n4 & 0x2000;
        Object object13 = n25 != 0 ? tenantResponse2.transactionToken : string7;
        string7 = object13;
        n25 = n4 & 0x4000;
        object13 = n25 != 0 ? tenantResponse2.payInstrumentsAllChecksum : string8;
        int n26 = n4 & 0x8000;
        string8 = object13;
        object13 = n26 != 0 ? tenantResponse2.fraudEngineResponseDetails : object;
        n26 = n4 & 0x10000;
        object = object13;
        object13 = n26 != 0 ? tenantResponse2.payInstrumentsStoredChecksum : object2;
        n26 = n4 & 0x20000;
        object2 = object13;
        object13 = n26 != 0 ? tenantResponse2.payInstrumentsStoredDelChecksum : object3;
        n26 = n4 & 0x40000;
        object3 = object13;
        object13 = n26 != 0 ? tenantResponse2.statusChecksum : object4;
        n26 = n4 & 0x80000;
        object4 = object13;
        object13 = n26 != 0 ? tenantResponse2.statusGetChecksum : object5;
        n26 = n4 & 0x100000;
        object5 = object13;
        object13 = n26 != 0 ? tenantResponse2.deviceChecksum : object6;
        n26 = n4 & 0x200000;
        object6 = object13;
        object13 = n26 != 0 ? tenantResponse2.deviceId : object7;
        n26 = n4 & 0x400000;
        object7 = object13;
        object13 = n26 != 0 ? tenantResponse2.fraudEngineRequestAuthToken : object8;
        n26 = n4 & 0x800000;
        object8 = object13;
        object13 = n26 != 0 ? tenantResponse2.orderSummary : object9;
        n26 = n4 & 0x1000000;
        object9 = object13;
        object13 = n26 != 0 ? tenantResponse2.internalWallets : object10;
        n26 = n4 & 0x2000000;
        object10 = object13;
        object13 = n26 != 0 ? tenantResponse2.cartInternalWalletsEnabled : object11;
        n26 = 0x4000000;
        Boolean bl5 = (n4 &= n26) != 0 ? tenantResponse2.isEmiAvailable : bl3;
        order = order2;
        tenant = tenant2;
        customer = customer2;
        paymentChannelInformation = paymentChannelInformation2;
        list = list2;
        cashOnDeliveryInformation = cashOnDeliveryInformation2;
        cartRequest = cartRequest2;
        string2 = string9;
        bl2 = bl4;
        string3 = string10;
        string4 = string11;
        string5 = string12;
        string6 = string13;
        object11 = object13;
        bl3 = bl5;
        return tenantResponse.copy(order2, tenant2, customer2, paymentChannelInformation2, list2, cashOnDeliveryInformation2, cartRequest2, string9, bl4, string10, string11, string12, string13, string7, string8, (FraudEngineResponse)object, (String)object2, (String)object3, (String)object4, (String)object5, (String)object6, (String)object7, (String)object8, (OrderSummary)object9, (ArrayList)object10, (Boolean)object13, bl5);
    }

    public final Order component1() {
        return this.order;
    }

    public final String component10() {
        return this.cartCheckSum;
    }

    public final String component11() {
        return this.cartCheckSumCOD;
    }

    public final String component12() {
        return this.requestChecksum;
    }

    public final String component13() {
        return this.tenantTransactionId;
    }

    public final String component14() {
        return this.transactionToken;
    }

    public final String component15() {
        return this.payInstrumentsAllChecksum;
    }

    public final FraudEngineResponse component16() {
        return this.fraudEngineResponseDetails;
    }

    public final String component17() {
        return this.payInstrumentsStoredChecksum;
    }

    public final String component18() {
        return this.payInstrumentsStoredDelChecksum;
    }

    public final String component19() {
        return this.statusChecksum;
    }

    public final Tenant component2() {
        return this.tenant;
    }

    public final String component20() {
        return this.statusGetChecksum;
    }

    public final String component21() {
        return this.deviceChecksum;
    }

    public final String component22() {
        return this.deviceId;
    }

    public final String component23() {
        return this.fraudEngineRequestAuthToken;
    }

    public final OrderSummary component24() {
        return this.orderSummary;
    }

    public final ArrayList component25() {
        return this.internalWallets;
    }

    public final Boolean component26() {
        return this.cartInternalWalletsEnabled;
    }

    public final Boolean component27() {
        return this.isEmiAvailable;
    }

    public final Customer component3() {
        return this.customer;
    }

    public final PaymentChannelInformation component4() {
        return this.paymentChannelInformation;
    }

    public final List component5() {
        return this.banners;
    }

    public final CashOnDeliveryInformation component6() {
        return this.cashOnDeliveryInformation;
    }

    public final CartRequest component7() {
        return this.cartRequest;
    }

    public final String component8() {
        return this.accessToken;
    }

    public final Boolean component9() {
        return this.multipleWalletsSupported;
    }

    public final TenantResponse copy(Order order, Tenant tenant, Customer customer, PaymentChannelInformation paymentChannelInformation, List list, CashOnDeliveryInformation cashOnDeliveryInformation, CartRequest cartRequest, String string2, Boolean bl2, String string3, String string4, String string5, String string6, String string7, String string8, FraudEngineResponse fraudEngineResponse, String string9, String string10, String string11, String string12, String string13, String string14, String string15, OrderSummary orderSummary, ArrayList arrayList, Boolean bl3, Boolean bl4) {
        TenantResponse tenantResponse = new TenantResponse(order, tenant, customer, paymentChannelInformation, list, cashOnDeliveryInformation, cartRequest, string2, bl2, string3, string4, string5, string6, string7, string8, fraudEngineResponse, string9, string10, string11, string12, string13, string14, string15, orderSummary, arrayList, bl3, bl4);
        return tenantResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TenantResponse;
        if (!bl3) {
            return false;
        }
        object = (TenantResponse)object;
        Object object2 = this.order;
        Object object3 = ((TenantResponse)object).order;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((TenantResponse)object).tenant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customer;
        object3 = ((TenantResponse)object).customer;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentChannelInformation;
        object3 = ((TenantResponse)object).paymentChannelInformation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.banners;
        object3 = ((TenantResponse)object).banners;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cashOnDeliveryInformation;
        object3 = ((TenantResponse)object).cashOnDeliveryInformation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartRequest;
        object3 = ((TenantResponse)object).cartRequest;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.accessToken;
        object3 = ((TenantResponse)object).accessToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.multipleWalletsSupported;
        object3 = ((TenantResponse)object).multipleWalletsSupported;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartCheckSum;
        object3 = ((TenantResponse)object).cartCheckSum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartCheckSumCOD;
        object3 = ((TenantResponse)object).cartCheckSumCOD;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.requestChecksum;
        object3 = ((TenantResponse)object).requestChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tenantTransactionId;
        object3 = ((TenantResponse)object).tenantTransactionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionToken;
        object3 = ((TenantResponse)object).transactionToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.payInstrumentsAllChecksum;
        object3 = ((TenantResponse)object).payInstrumentsAllChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fraudEngineResponseDetails;
        object3 = ((TenantResponse)object).fraudEngineResponseDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.payInstrumentsStoredChecksum;
        object3 = ((TenantResponse)object).payInstrumentsStoredChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.payInstrumentsStoredDelChecksum;
        object3 = ((TenantResponse)object).payInstrumentsStoredDelChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.statusChecksum;
        object3 = ((TenantResponse)object).statusChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.statusGetChecksum;
        object3 = ((TenantResponse)object).statusGetChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deviceChecksum;
        object3 = ((TenantResponse)object).deviceChecksum;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.deviceId;
        object3 = ((TenantResponse)object).deviceId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fraudEngineRequestAuthToken;
        object3 = ((TenantResponse)object).fraudEngineRequestAuthToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderSummary;
        object3 = ((TenantResponse)object).orderSummary;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.internalWallets;
        object3 = ((TenantResponse)object).internalWallets;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartInternalWalletsEnabled;
        object3 = ((TenantResponse)object).cartInternalWalletsEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isEmiAvailable;
        object = ((TenantResponse)object).isEmiAvailable;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final List getBanners() {
        return this.banners;
    }

    public final String getCartCheckSum() {
        return this.cartCheckSum;
    }

    public final String getCartCheckSumCOD() {
        return this.cartCheckSumCOD;
    }

    public final Boolean getCartInternalWalletsEnabled() {
        return this.cartInternalWalletsEnabled;
    }

    public final CartRequest getCartRequest() {
        return this.cartRequest;
    }

    public final CashOnDeliveryInformation getCashOnDeliveryInformation() {
        return this.cashOnDeliveryInformation;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final String getDeviceChecksum() {
        return this.deviceChecksum;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getFraudEngineRequestAuthToken() {
        return this.fraudEngineRequestAuthToken;
    }

    public final FraudEngineResponse getFraudEngineResponseDetails() {
        return this.fraudEngineResponseDetails;
    }

    public final ArrayList getInternalWallets() {
        return this.internalWallets;
    }

    public final Boolean getMultipleWalletsSupported() {
        return this.multipleWalletsSupported;
    }

    public final Order getOrder() {
        return this.order;
    }

    public final OrderSummary getOrderSummary() {
        return this.orderSummary;
    }

    public final String getPayInstrumentsAllChecksum() {
        return this.payInstrumentsAllChecksum;
    }

    public final String getPayInstrumentsStoredChecksum() {
        return this.payInstrumentsStoredChecksum;
    }

    public final String getPayInstrumentsStoredDelChecksum() {
        return this.payInstrumentsStoredDelChecksum;
    }

    public final PaymentChannelInformation getPaymentChannelInformation() {
        return this.paymentChannelInformation;
    }

    public final String getRequestChecksum() {
        return this.requestChecksum;
    }

    public final String getStatusChecksum() {
        return this.statusChecksum;
    }

    public final String getStatusGetChecksum() {
        return this.statusGetChecksum;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public final String getTenantTransactionId() {
        return this.tenantTransactionId;
    }

    public final String getTransactionToken() {
        return this.transactionToken;
    }

    public int hashCode() {
        int n3;
        int n4;
        Order order = this.order;
        int n7 = 0;
        if (order == null) {
            n4 = 0;
            order = null;
        } else {
            n4 = order.hashCode();
        }
        n4 *= 31;
        Object object = this.tenant;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Tenant)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.customer;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Customer)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentChannelInformation;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PaymentChannelInformation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.banners;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cashOnDeliveryInformation;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((CashOnDeliveryInformation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartRequest;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((CartRequest)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.accessToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.multipleWalletsSupported;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartCheckSum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartCheckSumCOD;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.requestChecksum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tenantTransactionId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.payInstrumentsAllChecksum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fraudEngineResponseDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((FraudEngineResponse)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.payInstrumentsStoredChecksum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.payInstrumentsStoredDelChecksum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.statusChecksum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.statusGetChecksum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.deviceChecksum;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.deviceId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fraudEngineRequestAuthToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.orderSummary;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((OrderSummary)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.internalWallets;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartInternalWalletsEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isEmiAvailable;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isEmiAvailable() {
        return this.isEmiAvailable;
    }

    public final void setAccessToken(String string2) {
        this.accessToken = string2;
    }

    public final void setBanners(List list) {
        this.banners = list;
    }

    public final void setCartCheckSum(String string2) {
        this.cartCheckSum = string2;
    }

    public final void setCartCheckSumCOD(String string2) {
        this.cartCheckSumCOD = string2;
    }

    public final void setCartRequest(CartRequest cartRequest) {
        this.cartRequest = cartRequest;
    }

    public final void setCashOnDeliveryInformation(CashOnDeliveryInformation cashOnDeliveryInformation) {
        this.cashOnDeliveryInformation = cashOnDeliveryInformation;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final void setDeviceChecksum(String string2) {
        this.deviceChecksum = string2;
    }

    public final void setDeviceId(String string2) {
        this.deviceId = string2;
    }

    public final void setFraudEngineRequestAuthToken(String string2) {
        this.fraudEngineRequestAuthToken = string2;
    }

    public final void setFraudEngineResponseDetails(FraudEngineResponse fraudEngineResponse) {
        this.fraudEngineResponseDetails = fraudEngineResponse;
    }

    public final void setMultipleWalletsSupported(Boolean bl2) {
        this.multipleWalletsSupported = bl2;
    }

    public final void setOrder(Order order) {
        this.order = order;
    }

    public final void setOrderSummary(OrderSummary orderSummary) {
        this.orderSummary = orderSummary;
    }

    public final void setPayInstrumentsAllChecksum(String string2) {
        this.payInstrumentsAllChecksum = string2;
    }

    public final void setPayInstrumentsStoredChecksum(String string2) {
        this.payInstrumentsStoredChecksum = string2;
    }

    public final void setPayInstrumentsStoredDelChecksum(String string2) {
        this.payInstrumentsStoredDelChecksum = string2;
    }

    public final void setPaymentChannelInformation(PaymentChannelInformation paymentChannelInformation) {
        this.paymentChannelInformation = paymentChannelInformation;
    }

    public final void setRequestChecksum(String string2) {
        this.requestChecksum = string2;
    }

    public final void setStatusChecksum(String string2) {
        this.statusChecksum = string2;
    }

    public final void setStatusGetChecksum(String string2) {
        this.statusGetChecksum = string2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public final void setTenantTransactionId(String string2) {
        this.tenantTransactionId = string2;
    }

    public final void setTransactionToken(String string2) {
        this.transactionToken = string2;
    }

    public String toString() {
        Serializable serializable = this;
        Object object = this.order;
        Serializable serializable2 = this.tenant;
        Object object2 = this.customer;
        Object object3 = this.paymentChannelInformation;
        List list = this.banners;
        CashOnDeliveryInformation cashOnDeliveryInformation = this.cashOnDeliveryInformation;
        CartRequest cartRequest = this.cartRequest;
        String string2 = this.accessToken;
        Boolean bl2 = this.multipleWalletsSupported;
        String string3 = this.cartCheckSum;
        String string4 = this.cartCheckSumCOD;
        String string5 = this.requestChecksum;
        String string6 = this.tenantTransactionId;
        String string7 = this.transactionToken;
        String string8 = this.payInstrumentsAllChecksum;
        FraudEngineResponse fraudEngineResponse = this.fraudEngineResponseDetails;
        String string9 = this.payInstrumentsStoredChecksum;
        String string10 = this.payInstrumentsStoredDelChecksum;
        String string11 = this.statusChecksum;
        String string12 = this.statusGetChecksum;
        String string13 = this.deviceChecksum;
        String string14 = this.deviceId;
        String string15 = this.fraudEngineRequestAuthToken;
        OrderSummary orderSummary = this.orderSummary;
        ArrayList arrayList = this.internalWallets;
        Boolean bl3 = this.cartInternalWalletsEnabled;
        Boolean bl4 = this.isEmiAvailable;
        serializable = new StringBuilder("TenantResponse(order=");
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append(", tenant=");
        ((StringBuilder)serializable).append(serializable2);
        ((StringBuilder)serializable).append(", customer=");
        ((StringBuilder)serializable).append(object2);
        ((StringBuilder)serializable).append(", paymentChannelInformation=");
        ((StringBuilder)serializable).append(object3);
        ((StringBuilder)serializable).append(", banners=");
        ((StringBuilder)serializable).append(list);
        ((StringBuilder)serializable).append(", cashOnDeliveryInformation=");
        ((StringBuilder)serializable).append(cashOnDeliveryInformation);
        ((StringBuilder)serializable).append(", cartRequest=");
        ((StringBuilder)serializable).append(cartRequest);
        ((StringBuilder)serializable).append(", accessToken=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(", multipleWalletsSupported=");
        xi0_2.a(bl2, ", cartCheckSum=", string3, ", cartCheckSumCOD=", (StringBuilder)serializable);
        X50.a((StringBuilder)serializable, string4, ", requestChecksum=", string5, ", tenantTransactionId=");
        X50.a((StringBuilder)serializable, string6, ", transactionToken=", string7, ", payInstrumentsAllChecksum=");
        object = string8;
        ((StringBuilder)serializable).append(string8);
        ((StringBuilder)serializable).append(", fraudEngineResponseDetails=");
        object = fraudEngineResponse;
        ((StringBuilder)serializable).append(fraudEngineResponse);
        ((StringBuilder)serializable).append(", payInstrumentsStoredChecksum=");
        object2 = string9;
        object3 = string10;
        X50.a((StringBuilder)serializable, string9, ", payInstrumentsStoredDelChecksum=", string10, ", statusChecksum=");
        object2 = string11;
        object3 = string12;
        X50.a((StringBuilder)serializable, string11, ", statusGetChecksum=", string12, ", deviceChecksum=");
        object2 = string13;
        object3 = string14;
        X50.a((StringBuilder)serializable, string13, ", deviceId=", string14, ", fraudEngineRequestAuthToken=");
        object = string15;
        ((StringBuilder)serializable).append(string15);
        ((StringBuilder)serializable).append(", orderSummary=");
        object = orderSummary;
        ((StringBuilder)serializable).append(orderSummary);
        ((StringBuilder)serializable).append(", internalWallets=");
        object = arrayList;
        ((StringBuilder)serializable).append(arrayList);
        ((StringBuilder)serializable).append(", cartInternalWalletsEnabled=");
        object = bl3;
        ((StringBuilder)serializable).append(bl3);
        ((StringBuilder)serializable).append(", isEmiAvailable=");
        serializable2 = bl4;
        return nx3_0.a((StringBuilder)serializable, bl4, ")");
    }
}

