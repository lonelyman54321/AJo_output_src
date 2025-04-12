/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.Tenant;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PaymentInstrumentInfo
implements Serializable {
    private Float amount;
    private Float availableAmount;
    private String bank_code_juspay;
    private String cardNetwork;
    private String cardNumber;
    private String cardProvider;
    private String cardType;
    private String code;
    private Integer conversionFactor;
    private Customer customer;
    private String cvv;
    private String description;
    private Boolean disabled;
    private String displayUPIInfo;
    private Float earn;
    private Boolean errorLoadingBalance;
    private String errorLoadingMessage;
    private List excludedProducts;
    private String expiryMonth;
    private String expiryYear;
    private ArrayList featured_emi;
    private String gatewaySpecificCode;
    private double giftCardAmount;
    private String iconURL;
    private String iconUrl;
    private String instrumentChecksum;
    private String instrument_code;
    private Boolean intent;
    private List intentApps;
    private String intentAppsData;
    private Boolean isCLicked;
    private String isLRManaged;
    private Boolean isNew;
    private boolean isSelected;
    private Boolean isTokenized;
    private String lastFourDigits;
    private Float leftPostUsage;
    private Boolean lowSuccessRate;
    private Loyalty loyalty;
    private String maskedCardInfo;
    private String maskedUPIInfo;
    private String message;
    private float minimumEarnThreshold;
    private Double minimum_emi_amount;
    private Float multipleWalletEnabledAmount;
    private Float multipleWalletEnabledLeftPostUsageAmount;
    private String name;
    private String nameOnCard;
    private ArrayList no_cost_emi;
    private Boolean no_cost_emi_enabled;
    private String offer;
    private OfferDetails offerDetails;
    private Boolean offerExpand;
    private String password;
    private String paymentEngineTransactionId;
    private String paymentGatewayTransactionId;
    private boolean paymentInstrumentActive;
    private String paymentInstrumentCode;
    private String paymentInstrumentDescription;
    private String paymentInstrumentId;
    private String paymentInstrumentName;
    private PriceValidation priceValidation;
    private String priority;
    private Integer redemptionPriority;
    private String registeredMobile;
    private String response;
    private Boolean saveCard;
    private Boolean saveUPI;
    private String savedWallet;
    private Boolean selected;
    private String splitUpId;
    private ArrayList standard_emi;
    private List subWallets;
    private Tenant tenant;
    private String transactionStatus;
    private Long transactionTime;
    private String type;
    private String username;
    private String vpa;

    public PaymentInstrumentInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0, null, false, null, null, null, null, null, null, null, null, null, null, -1, -1, Short.MAX_VALUE, null);
    }

    public PaymentInstrumentInfo(String string2, String string3, Tenant tenant, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2, Long l2, String string10, boolean bl3, String string11, String string12, Loyalty loyalty, String string13, OfferDetails offerDetails, PriceValidation priceValidation, String string14, Boolean bl4, List list, String string15, String string16, String string17, String string18, String string19, String string20, String string21, Customer customer, String string22, String string23, String string24, Boolean bl5, String string25, List list2, Float f5, String string26, String string27, String string28, String string29, Float f6, String string30, Boolean bl6, String string31, Float f7, String string32, Float f8, Float f11, Float f12, float f14, Boolean bl7, Boolean bl8, String string33, String string34, String string35, String string36, String string37, String string38, String string39, Boolean bl9, Boolean bl10, String string40, Boolean bl11, String string41, Boolean bl12, double d2, Integer n3, boolean bl13, Integer n4, List list3, String string42, Boolean bl14, String string43, Double d5, Boolean bl15, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.type = string2;
        this.paymentInstrumentId = string3;
        this.tenant = tenant;
        this.nameOnCard = string4;
        this.cardNumber = string5;
        this.maskedCardInfo = string6;
        this.iconUrl = string7;
        this.splitUpId = string8;
        this.isLRManaged = string9;
        this.intent = bl2;
        this.transactionTime = l2;
        this.priority = string10;
        this.paymentInstrumentActive = bl3;
        this.paymentEngineTransactionId = string11;
        this.iconURL = string12;
        this.loyalty = loyalty;
        this.registeredMobile = string13;
        this.offerDetails = offerDetails;
        this.priceValidation = priceValidation;
        this.vpa = string14;
        this.saveUPI = bl4;
        this.intentApps = list;
        this.intentAppsData = string15;
        this.description = string16;
        this.username = string17;
        this.instrumentChecksum = string18;
        this.maskedUPIInfo = string19;
        this.displayUPIInfo = string20;
        this.savedWallet = string21;
        this.customer = customer;
        this.lastFourDigits = string22;
        this.response = string23;
        this.transactionStatus = string24;
        this.selected = bl5;
        this.paymentGatewayTransactionId = string25;
        this.subWallets = list2;
        this.earn = f5;
        this.expiryYear = string26;
        this.expiryMonth = string27;
        this.paymentInstrumentCode = string28;
        this.password = string29;
        this.amount = f6;
        this.cardNetwork = string30;
        this.isCLicked = bl6;
        this.code = string31;
        this.availableAmount = f7;
        this.gatewaySpecificCode = string32;
        this.leftPostUsage = f8;
        this.multipleWalletEnabledAmount = f11;
        this.multipleWalletEnabledLeftPostUsageAmount = f12;
        this.minimumEarnThreshold = f14;
        this.isNew = bl7;
        this.offerExpand = bl8;
        this.paymentInstrumentName = string33;
        this.paymentInstrumentDescription = string34;
        this.name = string35;
        this.cvv = string36;
        this.cardType = string37;
        this.offer = string38;
        this.cardProvider = string39;
        this.saveCard = bl9;
        this.lowSuccessRate = bl10;
        this.message = string40;
        this.errorLoadingBalance = bl11;
        this.errorLoadingMessage = string41;
        this.isTokenized = bl12;
        this.giftCardAmount = d2;
        this.redemptionPriority = n3;
        this.isSelected = bl13;
        this.conversionFactor = n4;
        this.excludedProducts = list3;
        this.instrument_code = string42;
        this.disabled = bl14;
        this.bank_code_juspay = string43;
        this.minimum_emi_amount = d5;
        this.no_cost_emi_enabled = bl15;
        this.standard_emi = arrayList;
        this.no_cost_emi = arrayList2;
        this.featured_emi = arrayList3;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ PaymentInstrumentInfo(String object, String string2, Tenant object2, String object3, String string3, String string4, String string5, String string6, String string7, Boolean object4, Long constable, String object5, boolean bl2, String string8, String string9, Loyalty object6, String object7, OfferDetails object8, PriceValidation serializable, String object9, Boolean object10, List object11, String object12, String string10, String string11, String string12, String string13, String string14, String string15, Customer object13, String object14, String string16, String string17, Boolean object15, String object16, List object17, Float object18, String object19, String string18, String string19, String string20, Float object20, String object21, Boolean object22, String object23, Float object24, String object25, Float object26, Float f5, Float f6, float f7, Boolean bl3, Boolean bl4, String object27, String string21, String string22, String string23, String string24, String string25, String string26, Boolean object28, Boolean bl5, String object29, Boolean object30, String object31, Boolean object32, double d2, Integer n3, boolean bl6, Integer n4, List object33, String object34, Boolean object35, String object36, Double object37, Boolean object38, ArrayList object39, ArrayList object40, ArrayList object41, int n7, int n8, int n10, DefaultConstructorMarker defaultConstructorMarker) {
        void var215_222;
        Object object42;
        Object object43;
        Integer n14;
        Object object44;
        Object object45;
        Object object46;
        String string27;
        String string28;
        String string29;
        String string30;
        String string31;
        String string32;
        Object object47;
        String string33;
        Object object48;
        Object object49;
        Object object50;
        String string34;
        Object object51;
        Object object52;
        Object object53;
        String string35;
        String string36;
        String string37;
        String string38;
        String string39;
        String string40;
        Object object54;
        Object object55;
        Object object56;
        Serializable serializable2;
        Object object57;
        Object object58;
        Object object59;
        void var114_115;
        String string41;
        Object string51;
        Constable l2;
        String string52;
        String string53;
        String string54;
        String string55;
        String string56;
        Object string57;
        Object tenant;
        String string58;
        Object string59;
        int n15 = n7;
        int n16 = n8;
        int n17 = n10;
        int n18 = n7 & 1;
        if (n18 != 0) {
            n18 = 0;
            string59 = null;
        } else {
            string59 = object;
        }
        int n19 = n15 & 2;
        if (n19 != 0) {
            n19 = 0;
            string58 = null;
        } else {
            string58 = string2;
        }
        int n20 = n15 & 4;
        if (n20 != 0) {
            n20 = 0;
            tenant = null;
        } else {
            tenant = object2;
        }
        int n21 = n15 & 8;
        if (n21 != 0) {
            n21 = 0;
            string57 = null;
        } else {
            string57 = object3;
        }
        int n22 = n15 & 0x10;
        if (n22 != 0) {
            n22 = 0;
            string56 = null;
        } else {
            string56 = string3;
        }
        int n24 = n15 & 0x20;
        if (n24 != 0) {
            n24 = 0;
            string55 = null;
        } else {
            string55 = string4;
        }
        int n25 = n15 & 0x40;
        if (n25 != 0) {
            n25 = 0;
            string54 = null;
        } else {
            string54 = string5;
        }
        int n26 = n15 & 0x80;
        if (n26 != 0) {
            n26 = 0;
            string53 = null;
        } else {
            string53 = string6;
        }
        int n27 = n15 & 0x100;
        if (n27 != 0) {
            n27 = 0;
            string52 = null;
        } else {
            string52 = string7;
        }
        int n28 = n15 & 0x200;
        Object object432 = n28 != 0 ? Boolean.FALSE : object4;
        int n29 = n15 & 0x400;
        if (n29 != 0) {
            long l3 = 0L;
            l2 = Long.valueOf(l3);
        } else {
            l2 = constable;
        }
        int n30 = n15 & 0x800;
        if (n30 != 0) {
            n30 = 0;
            string51 = null;
        } else {
            string51 = object5;
        }
        int bl8 = n15 & 0x1000;
        Integer n32 = null;
        if (bl8 != 0) {
            boolean bl7 = false;
            string41 = null;
        } else {
            boolean bl9 = bl2;
        }
        void var117_122 = var114_115;
        int n34 = n15 & 0x2000;
        if (n34 != 0) {
            boolean bl10 = false;
            string41 = null;
        } else {
            string41 = string8;
        }
        String string42 = string41;
        int n35 = n15 & 0x4000;
        if (n35 != 0) {
            boolean bl11 = false;
            string41 = null;
        } else {
            string41 = string9;
        }
        int n36 = 32768;
        int n37 = n15 & n36;
        if (n37 != 0) {
            n37 = 0;
            object59 = null;
        } else {
            object59 = object6;
        }
        int n38 = 65536;
        int n39 = n15 & n38;
        if (n39 != 0) {
            n39 = 0;
            object58 = null;
        } else {
            object58 = object7;
        }
        int n41 = 131072;
        int n42 = n15 & n41;
        if (n42 != 0) {
            n42 = 0;
            object57 = null;
        } else {
            object57 = object8;
        }
        int n43 = 262144;
        int n44 = n15 & n43;
        if (n44 != 0) {
            n44 = 0;
            serializable2 = null;
        } else {
            serializable2 = serializable;
        }
        int n45 = n15 & 0x80000;
        if (n45 != 0) {
            n45 = 0;
            object56 = null;
        } else {
            object56 = object9;
        }
        int n46 = n15 & 0x100000;
        Object object60 = n46 != 0 ? Boolean.FALSE : object10;
        int n47 = n15 & 0x200000;
        if (n47 != 0) {
            n47 = 0;
            object55 = null;
        } else {
            object55 = object11;
        }
        int n48 = n15 & 0x400000;
        if (n48 != 0) {
            n48 = 0;
            object54 = null;
        } else {
            object54 = object12;
        }
        int n49 = n15 & 0x800000;
        if (n49 != 0) {
            n49 = 0;
            string40 = null;
        } else {
            string40 = string10;
        }
        int n50 = n15 & 0x1000000;
        if (n50 != 0) {
            n50 = 0;
            string39 = null;
        } else {
            string39 = string11;
        }
        int n51 = n15 & 0x2000000;
        if (n51 != 0) {
            n51 = 0;
            string38 = null;
        } else {
            string38 = string12;
        }
        int n52 = n15 & 0x4000000;
        if (n52 != 0) {
            n52 = 0;
            string37 = null;
        } else {
            string37 = string13;
        }
        int n54 = n15 & 0x8000000;
        if (n54 != 0) {
            n54 = 0;
            string36 = null;
        } else {
            string36 = string14;
        }
        int n55 = n15 & 0x10000000;
        if (n55 != 0) {
            n55 = 0;
            string35 = null;
        } else {
            string35 = string15;
        }
        int n56 = n15 & 0x20000000;
        if (n56 != 0) {
            n56 = 0;
            object53 = null;
        } else {
            object53 = object13;
        }
        int n57 = n15 & 0x40000000;
        if (n57 != 0) {
            n57 = 0;
            object52 = null;
        } else {
            object52 = object14;
        }
        int n58 = -1 << -1;
        if ((n15 &= n58) != 0) {
            n15 = 0;
            object51 = null;
        } else {
            object51 = string16;
        }
        n58 = n16 & 1;
        if (n58 != 0) {
            n58 = 0;
            string34 = null;
        } else {
            string34 = string17;
        }
        int n59 = n16 & 2;
        Object object61 = n59 != 0 ? Boolean.FALSE : object15;
        int n60 = n16 & 4;
        if (n60 != 0) {
            n60 = 0;
            object50 = null;
        } else {
            object50 = object16;
        }
        int n64 = n16 & 8;
        if (n64 != 0) {
            n64 = 0;
            object49 = null;
        } else {
            object49 = object17;
        }
        int n65 = n16 & 0x10;
        float f8 = 0.0f;
        Object object62 = n65 != 0 ? Float.valueOf(0.0f) : object18;
        int n66 = n16 & 0x20;
        if (n66 != 0) {
            n66 = 0;
            object48 = null;
        } else {
            object48 = object19;
        }
        int n67 = n16 & 0x40;
        if (n67 != 0) {
            n67 = 0;
            string33 = null;
        } else {
            string33 = string18;
        }
        Object object63 = object51;
        n15 = n16 & 0x80;
        if (n15 != 0) {
            n15 = 0;
            object51 = null;
        } else {
            object51 = string19;
        }
        String string43 = object51;
        n15 = n16 & 0x100;
        if (n15 != 0) {
            n15 = 0;
            object51 = null;
        } else {
            object51 = string20;
        }
        String string44 = object51;
        n15 = n16 & 0x200;
        object51 = n15 != 0 ? Float.valueOf(0.0f) : object20;
        Object object64 = object51;
        n15 = n16 & 0x400;
        if (n15 != 0) {
            n15 = 0;
            object51 = null;
        } else {
            object51 = object21;
        }
        Object object65 = object51;
        n15 = n16 & 0x800;
        object51 = n15 != 0 ? Boolean.FALSE : object22;
        Object object66 = object51;
        n15 = n16 & 0x1000;
        if (n15 != 0) {
            n15 = 0;
            object51 = null;
        } else {
            object51 = object23;
        }
        Object object67 = object51;
        n15 = n16 & 0x2000;
        object51 = n15 != 0 ? Float.valueOf(0.0f) : object24;
        Object object68 = object51;
        n15 = n16 & 0x4000;
        if (n15 != 0) {
            n15 = 0;
            object51 = null;
        } else {
            object51 = object25;
        }
        n36 = n16 & n36;
        Object object69 = n36 != 0 ? Float.valueOf(0.0f) : object26;
        n38 = n16 & n38;
        Object object70 = n38 != 0 ? Float.valueOf(0.0f) : f5;
        n41 = n16 & n41;
        Float f11 = n41 != 0 ? Float.valueOf(0.0f) : f6;
        n43 = n16 & n43;
        if (n43 == 0) {
            f8 = f7;
        }
        n43 = n16 & 0x80000;
        Boolean bl12 = n43 != 0 ? Boolean.FALSE : bl3;
        int n68 = n16 & 0x100000;
        Boolean bl13 = n68 != 0 ? Boolean.FALSE : bl4;
        int n69 = n16 & 0x200000;
        if (n69 != 0) {
            n69 = 0;
            object47 = null;
        } else {
            object47 = object27;
        }
        int n71 = n16 & 0x400000;
        if (n71 != 0) {
            n71 = 0;
            string32 = null;
        } else {
            string32 = string21;
        }
        int n74 = n16 & 0x800000;
        if (n74 != 0) {
            n74 = 0;
            string31 = null;
        } else {
            string31 = string22;
        }
        int n75 = n16 & 0x1000000;
        if (n75 != 0) {
            n75 = 0;
            string30 = null;
        } else {
            string30 = string23;
        }
        int n76 = n16 & 0x2000000;
        if (n76 != 0) {
            n76 = 0;
            string29 = null;
        } else {
            string29 = string24;
        }
        int n77 = n16 & 0x4000000;
        if (n77 != 0) {
            n77 = 0;
            string28 = null;
        } else {
            string28 = string25;
        }
        int n78 = n16 & 0x8000000;
        if (n78 != 0) {
            n78 = 0;
            string27 = null;
        } else {
            string27 = string26;
        }
        int n79 = n16 & 0x10000000;
        Object object71 = n79 != 0 ? Boolean.FALSE : object28;
        int n80 = n16 & 0x20000000;
        Object object72 = n80 != 0 ? Boolean.FALSE : bl5;
        int n81 = n16 & 0x40000000;
        if (n81 != 0) {
            n81 = 0;
            object46 = null;
        } else {
            object46 = object29;
        }
        int n84 = -1 << -1;
        Object object73 = (n16 &= n84) != 0 ? Boolean.FALSE : object30;
        n84 = n17 & 1;
        if (n84 != 0) {
            n84 = 0;
            object45 = null;
        } else {
            object45 = object31;
        }
        int n85 = n17 & 2;
        if (n85 != 0) {
            n85 = 0;
            object44 = null;
        } else {
            object44 = object32;
        }
        int n86 = n17 & 4;
        double d5 = n86 != 0 ? 0.0 : d2;
        int n87 = n17 & 8;
        if (n87 != 0) {
            n87 = 2;
            n14 = n87;
        } else {
            n14 = n3;
        }
        int n88 = n17 & 0x10;
        if (n88 != 0) {
            boolean bl14 = false;
        } else {
            boolean bl15 = bl6;
        }
        int n89 = n17 & 0x20;
        n32 = n89 != 0 ? Integer.valueOf(0) : n4;
        n89 = n17 & 0x40;
        if (n89 != 0) {
            n89 = 0;
            object43 = null;
        } else {
            object43 = object33;
        }
        Object object74 = object73;
        n16 = n17 & 0x80;
        if (n16 != 0) {
            n16 = 0;
            object73 = null;
        } else {
            object73 = object34;
        }
        Object object75 = object73;
        n16 = n17 & 0x100;
        if (n16 != 0) {
            n16 = 0;
            object73 = null;
        } else {
            object73 = object35;
        }
        Object object76 = object73;
        n16 = n17 & 0x200;
        if (n16 != 0) {
            n16 = 0;
            object73 = null;
        } else {
            object73 = object36;
        }
        Object object77 = object73;
        n16 = n17 & 0x400;
        if (n16 != 0) {
            n16 = 0;
            object73 = null;
        } else {
            object73 = object37;
        }
        Object object78 = object73;
        n16 = n17 & 0x800;
        if (n16 != 0) {
            n16 = 0;
            object73 = null;
        } else {
            object73 = object38;
        }
        Object object79 = object73;
        n16 = n17 & 0x1000;
        if (n16 != 0) {
            n16 = 0;
            object73 = null;
        } else {
            object73 = object39;
        }
        Object object80 = object73;
        n16 = n17 & 0x2000;
        if (n16 != 0) {
            n16 = 0;
            object73 = null;
        } else {
            object73 = object40;
        }
        if ((n17 &= 0x4000) != 0) {
            n17 = 0;
            object42 = null;
        } else {
            object42 = object41;
        }
        object = this;
        string2 = string59;
        object2 = string58;
        object3 = tenant;
        string3 = string57;
        string4 = string56;
        string5 = string55;
        string6 = string54;
        string7 = string53;
        object4 = string52;
        constable = object432;
        object5 = l2;
        string9 = string42;
        object6 = string41;
        object7 = object59;
        object8 = object58;
        serializable = object57;
        object9 = serializable2;
        object10 = object56;
        object11 = object60;
        object12 = object55;
        string10 = object54;
        string11 = string40;
        string12 = string39;
        string13 = string38;
        string14 = string37;
        string15 = string36;
        object13 = string35;
        object14 = object53;
        string16 = object52;
        string17 = object63;
        object15 = string34;
        object16 = object61;
        object17 = object50;
        object18 = object49;
        object19 = object62;
        string18 = object48;
        string19 = string33;
        string20 = string43;
        object20 = string44;
        object21 = object64;
        object22 = object65;
        object23 = object66;
        object24 = object67;
        object25 = object68;
        object26 = object51;
        f5 = object69;
        f6 = object70;
        bl4 = bl12;
        object27 = bl13;
        string21 = object47;
        string22 = string32;
        string23 = string31;
        string24 = string30;
        string25 = string29;
        string26 = string28;
        object28 = string27;
        bl5 = object71;
        object29 = object72;
        object30 = object46;
        object31 = object74;
        object32 = object45;
        object33 = n32;
        object34 = object43;
        object35 = object75;
        object36 = object76;
        object37 = object77;
        object38 = object78;
        object39 = object79;
        object40 = object80;
        object41 = object73;
        object63 = object42;
        this((String)string59, string58, (Tenant)tenant, (String)string57, string56, string55, string54, string53, string52, (Boolean)object432, (Long)l2, (String)string51, (boolean)var117_122, string42, string41, (Loyalty)object59, (String)object58, (OfferDetails)object57, (PriceValidation)serializable2, (String)object56, (Boolean)object60, (List)object55, (String)object54, string40, string39, string38, string37, string36, string35, (Customer)object53, (String)object52, string17, string34, (Boolean)object61, (String)object50, (List)object49, (Float)object62, (String)object48, string33, string43, string44, (Float)object64, (String)object65, (Boolean)object66, (String)object67, (Float)object68, (String)object51, (Float)object69, (Float)object70, f11, f8, bl12, bl13, (String)object47, string32, string31, string30, string29, string28, string27, (Boolean)object71, (Boolean)object72, (String)object46, (Boolean)object74, (String)object45, (Boolean)object44, d5, n14, (boolean)var215_222, n32, (List)object43, (String)object75, (Boolean)object76, (String)object77, (Double)object78, (Boolean)object79, (ArrayList)object80, (ArrayList)object73, (ArrayList)object42);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ PaymentInstrumentInfo copy$default(PaymentInstrumentInfo paymentInstrumentInfo, String string2, String string3, Tenant tenant, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2, Long l2, String string10, boolean bl3, String string11, String string12, Loyalty object, String object2, OfferDetails object3, PriceValidation object4, String object5, Boolean object6, List object7, String object8, String object9, String object10, String object11, String object12, String object13, String object14, Customer object15, String object16, String string13, String string14, Boolean object17, String object18, List object19, Float object20, String object21, String object22, String object23, String object24, Float object25, String object26, Boolean object27, String object28, Float object29, String object30, Float object31, Float object32, Float object33, float f5, Boolean object34, Boolean object35, String object36, String object37, String object38, String object39, String object40, String object41, String object42, Boolean object43, Boolean object44, String object45, Boolean bl4, String object46, Boolean object47, double d2, Integer object48, boolean bl5, Integer object49, List object50, String object51, Boolean object52, String object53, Double object54, Boolean object55, ArrayList object56, ArrayList object57, ArrayList arrayList, int n3, int n4, int n7, Object object58) {
        ArrayList arrayList2;
        Object object59;
        Object object60;
        Object object61;
        Object object62;
        Object object63;
        Object object64;
        Object object65;
        Object object66;
        Object object67;
        void var70_70;
        Object object68;
        double d5;
        Object object69;
        Object object70;
        Boolean bl6;
        Object object71;
        Object object72;
        Object object73;
        Object object74;
        Object object75;
        Object object76;
        Object object77;
        Object object78;
        Object object79;
        Object object80;
        Object object81;
        Object object82;
        float f6;
        Object object83;
        Object object84;
        Object object85;
        Object object86;
        Object object87;
        Object object88;
        Object object89;
        Object object90;
        Object object91;
        Object object92;
        Object object93;
        Object object94;
        Object object95;
        Object object96;
        Object object97;
        Object object98;
        Object object99;
        String string15;
        String string16;
        Object object100;
        Object object101;
        Object object102;
        Object object103;
        Object object104;
        Object object105;
        Object object106;
        Object object107;
        Object object108;
        Object object109;
        Object object110;
        Object object111;
        Object object112;
        Object object113;
        Object object114;
        Object object115;
        String string17;
        String string18;
        void var83_84;
        void var82_83;
        void var81_82;
        PaymentInstrumentInfo paymentInstrumentInfo2 = paymentInstrumentInfo;
        int n8 = var81_82;
        int bl7 = var82_83;
        int n10 = var83_84;
        int n14 = var81_82 & 1;
        String string19 = n14 != 0 ? paymentInstrumentInfo.type : string2;
        int n15 = n8 & 2;
        String string20 = n15 != 0 ? paymentInstrumentInfo2.paymentInstrumentId : string3;
        int n16 = n8 & 4;
        Tenant tenant2 = n16 != 0 ? paymentInstrumentInfo2.tenant : tenant;
        int n17 = n8 & 8;
        String string21 = n17 != 0 ? paymentInstrumentInfo2.nameOnCard : string4;
        int n18 = n8 & 0x10;
        String string22 = n18 != 0 ? paymentInstrumentInfo2.cardNumber : string5;
        int n19 = n8 & 0x20;
        String string23 = n19 != 0 ? paymentInstrumentInfo2.maskedCardInfo : string6;
        int n20 = n8 & 0x40;
        String string24 = n20 != 0 ? paymentInstrumentInfo2.iconUrl : string7;
        int n21 = n8 & 0x80;
        String string25 = n21 != 0 ? paymentInstrumentInfo2.splitUpId : string8;
        int n22 = n8 & 0x100;
        String string26 = n22 != 0 ? paymentInstrumentInfo2.isLRManaged : string9;
        int n24 = n8 & 0x200;
        Boolean bl8 = n24 != 0 ? paymentInstrumentInfo2.intent : bl2;
        int n25 = n8 & 0x400;
        Long l3 = n25 != 0 ? paymentInstrumentInfo2.transactionTime : l2;
        boolean bl9 = n8 & 0x800;
        Object object116 = bl9 ? paymentInstrumentInfo2.priority : string10;
        string10 = object116;
        bl9 = n8 & 0x1000;
        bl9 = bl9 ? (boolean)paymentInstrumentInfo2.paymentInstrumentActive : (boolean)bl3;
        boolean bl10 = bl9;
        bl9 = n8 & 0x2000;
        object116 = bl9 ? paymentInstrumentInfo2.paymentEngineTransactionId : string18;
        string18 = object116;
        bl9 = n8 & 0x4000;
        object116 = bl9 ? paymentInstrumentInfo2.iconURL : string17;
        int n26 = 32768;
        int n27 = n8 & n26;
        string17 = object116;
        object116 = n27 != 0 ? paymentInstrumentInfo2.loyalty : object115;
        n27 = 65536;
        int n28 = n8 & n27;
        object115 = object116;
        object116 = n28 != 0 ? paymentInstrumentInfo2.registeredMobile : object114;
        n28 = 131072;
        int n29 = n8 & n28;
        object114 = object116;
        object116 = n29 != 0 ? paymentInstrumentInfo2.offerDetails : object113;
        n29 = 262144;
        int n30 = n8 & n29;
        object113 = object116;
        object116 = n30 != 0 ? paymentInstrumentInfo2.priceValidation : object112;
        n30 = 524288;
        int n32 = n8 & n30;
        object112 = object116;
        object116 = n32 != 0 ? paymentInstrumentInfo2.vpa : object111;
        n32 = 0x100000;
        int n34 = n8 & n32;
        object111 = object116;
        object116 = n34 != 0 ? paymentInstrumentInfo2.saveUPI : object110;
        n34 = 0x200000;
        int n35 = n8 & n34;
        object110 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.intentApps : object109;
        n35 = n8 & 0x400000;
        object109 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.intentAppsData : object108;
        n35 = n8 & 0x800000;
        object108 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.description : object107;
        n35 = n8 & 0x1000000;
        object107 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.username : object106;
        n35 = n8 & 0x2000000;
        object106 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.instrumentChecksum : object105;
        n35 = n8 & 0x4000000;
        object105 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.maskedUPIInfo : object104;
        n35 = n8 & 0x8000000;
        object104 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.displayUPIInfo : object103;
        n35 = n8 & 0x10000000;
        object103 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.savedWallet : object102;
        n35 = n8 & 0x20000000;
        object102 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.customer : object101;
        n35 = n8 & 0x40000000;
        object101 = object116;
        object116 = n35 != 0 ? paymentInstrumentInfo2.lastFourDigits : object100;
        n35 = -1 << -1;
        Object object117 = (n8 &= n35) != 0 ? paymentInstrumentInfo2.response : string16;
        n35 = bl7 & 1;
        string16 = object117;
        object117 = n35 != 0 ? paymentInstrumentInfo2.transactionStatus : string15;
        n35 = bl7 & 2;
        string15 = object117;
        object117 = n35 != 0 ? paymentInstrumentInfo2.selected : object99;
        n35 = bl7 & 4;
        object99 = object117;
        object117 = n35 != 0 ? paymentInstrumentInfo2.paymentGatewayTransactionId : object98;
        n35 = bl7 & 8;
        object98 = object117;
        object117 = n35 != 0 ? paymentInstrumentInfo2.subWallets : object97;
        n35 = bl7 & 0x10;
        object97 = object117;
        object117 = n35 != 0 ? paymentInstrumentInfo2.earn : object96;
        n35 = bl7 & 0x20;
        object96 = object117;
        object117 = n35 != 0 ? paymentInstrumentInfo2.expiryYear : object95;
        n35 = bl7 & 0x40;
        object95 = object117;
        object117 = n35 != 0 ? paymentInstrumentInfo2.expiryMonth : object94;
        object94 = object117;
        n8 = bl7 & 0x80;
        object117 = n8 != 0 ? paymentInstrumentInfo2.paymentInstrumentCode : object93;
        object93 = object117;
        n8 = bl7 & 0x100;
        object117 = n8 != 0 ? paymentInstrumentInfo2.password : object92;
        object92 = object117;
        n8 = bl7 & 0x200;
        object117 = n8 != 0 ? paymentInstrumentInfo2.amount : object91;
        object91 = object117;
        n8 = bl7 & 0x400;
        object117 = n8 != 0 ? paymentInstrumentInfo2.cardNetwork : object90;
        object90 = object117;
        n8 = bl7 & 0x800;
        object117 = n8 != 0 ? paymentInstrumentInfo2.isCLicked : object89;
        object89 = object117;
        n8 = bl7 & 0x1000;
        object117 = n8 != 0 ? paymentInstrumentInfo2.code : object88;
        object88 = object117;
        n8 = bl7 & 0x2000;
        object117 = n8 != 0 ? paymentInstrumentInfo2.availableAmount : object87;
        object87 = object117;
        n8 = bl7 & 0x4000;
        object117 = n8 != 0 ? paymentInstrumentInfo2.gatewaySpecificCode : object86;
        n26 = bl7 & n26;
        object86 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.leftPostUsage : object85;
        n26 = bl7 & n27;
        object85 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.multipleWalletEnabledAmount : object84;
        n26 = bl7 & n28;
        object84 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.multipleWalletEnabledLeftPostUsageAmount : object83;
        n26 = bl7 & n29;
        object83 = object117;
        float f7 = n26 != 0 ? paymentInstrumentInfo2.minimumEarnThreshold : f6;
        n26 = bl7 & n30;
        f6 = f7;
        object117 = n26 != 0 ? paymentInstrumentInfo2.isNew : object82;
        n26 = bl7 & n32;
        object82 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.offerExpand : object81;
        n26 = bl7 & n34;
        object81 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.paymentInstrumentName : object80;
        n26 = bl7 & 0x400000;
        object80 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.paymentInstrumentDescription : object79;
        n26 = bl7 & 0x800000;
        object79 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.name : object78;
        n26 = bl7 & 0x1000000;
        object78 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.cvv : object77;
        n26 = bl7 & 0x2000000;
        object77 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.cardType : object76;
        n26 = bl7 & 0x4000000;
        object76 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.offer : object75;
        n26 = bl7 & 0x8000000;
        object75 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.cardProvider : object74;
        n26 = bl7 & 0x10000000;
        object74 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.saveCard : object73;
        n26 = bl7 & 0x20000000;
        object73 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.lowSuccessRate : object72;
        n26 = bl7 & 0x40000000;
        object72 = object117;
        object117 = n26 != 0 ? paymentInstrumentInfo2.message : object71;
        n26 = -1 << -1;
        Object object118 = (bl7 &= n26) ? paymentInstrumentInfo2.errorLoadingBalance : bl6;
        n26 = n10 & 1;
        bl6 = object118;
        object118 = n26 != 0 ? paymentInstrumentInfo2.errorLoadingMessage : object70;
        n26 = n10 & 2;
        object70 = object118;
        object118 = n26 != 0 ? paymentInstrumentInfo2.isTokenized : object69;
        n26 = n10 & 4;
        object71 = object117;
        object69 = object118;
        double d7 = n26 != 0 ? paymentInstrumentInfo2.giftCardAmount : d5;
        n26 = n10 & 8;
        d5 = d7;
        object117 = n26 != 0 ? paymentInstrumentInfo2.redemptionPriority : object68;
        bl7 = n10 & 0x10;
        bl7 = bl7 ? (int)paymentInstrumentInfo2.isSelected : var70_70;
        n26 = n10 & 0x20;
        int bl11 = bl7;
        object118 = n26 != 0 ? paymentInstrumentInfo2.conversionFactor : object67;
        n26 = n10 & 0x40;
        object67 = object118;
        object118 = n26 != 0 ? paymentInstrumentInfo2.excludedProducts : object66;
        object66 = object118;
        bl7 = n10 & 0x80;
        object118 = bl7 ? paymentInstrumentInfo2.instrument_code : object65;
        object65 = object118;
        bl7 = n10 & 0x100;
        object118 = bl7 ? paymentInstrumentInfo2.disabled : object64;
        object64 = object118;
        bl7 = n10 & 0x200;
        object118 = bl7 ? paymentInstrumentInfo2.bank_code_juspay : object63;
        object63 = object118;
        bl7 = n10 & 0x400;
        object118 = bl7 ? paymentInstrumentInfo2.minimum_emi_amount : object62;
        object62 = object118;
        bl7 = n10 & 0x800;
        object118 = bl7 ? paymentInstrumentInfo2.no_cost_emi_enabled : object61;
        object61 = object118;
        bl7 = n10 & 0x1000;
        object118 = bl7 ? paymentInstrumentInfo2.standard_emi : object60;
        object60 = object118;
        bl7 = n10 & 0x2000;
        object118 = bl7 ? paymentInstrumentInfo2.no_cost_emi : object59;
        ArrayList arrayList3 = (n10 &= 0x4000) != 0 ? paymentInstrumentInfo2.featured_emi : arrayList2;
        string2 = string19;
        string3 = string20;
        tenant = tenant2;
        string4 = string21;
        string5 = string22;
        string6 = string23;
        string7 = string24;
        string8 = string25;
        string9 = string26;
        bl2 = bl8;
        l2 = l3;
        object100 = object116;
        object68 = object117;
        object59 = object118;
        arrayList2 = arrayList3;
        return paymentInstrumentInfo.copy(string19, string20, tenant2, string21, string22, string23, string24, string25, string26, bl8, l3, string10, bl10, string18, string17, (Loyalty)object115, (String)object114, (OfferDetails)object113, (PriceValidation)object112, (String)object111, (Boolean)object110, (List)object109, (String)object108, (String)object107, (String)object106, (String)object105, (String)object104, (String)object103, (String)object102, (Customer)object101, (String)object116, string16, string15, (Boolean)object99, (String)object98, (List)object97, (Float)object96, (String)object95, (String)object94, (String)object93, (String)object92, (Float)object91, (String)object90, (Boolean)object89, (String)object88, (Float)object87, (String)object86, (Float)object85, (Float)object84, (Float)object83, f6, (Boolean)object82, (Boolean)object81, (String)object80, (String)object79, (String)object78, (String)object77, (String)object76, (String)object75, (String)object74, (Boolean)object73, (Boolean)object72, (String)object71, bl6, (String)object70, (Boolean)object69, d5, (Integer)object117, (boolean)bl11, (Integer)object67, (List)object66, (String)object65, (Boolean)object64, (String)object63, (Double)object62, (Boolean)object61, (ArrayList)object60, (ArrayList)object118, arrayList3);
    }

    public final String component1() {
        return this.type;
    }

    public final Boolean component10() {
        return this.intent;
    }

    public final Long component11() {
        return this.transactionTime;
    }

    public final String component12() {
        return this.priority;
    }

    public final boolean component13() {
        return this.paymentInstrumentActive;
    }

    public final String component14() {
        return this.paymentEngineTransactionId;
    }

    public final String component15() {
        return this.iconURL;
    }

    public final Loyalty component16() {
        return this.loyalty;
    }

    public final String component17() {
        return this.registeredMobile;
    }

    public final OfferDetails component18() {
        return this.offerDetails;
    }

    public final PriceValidation component19() {
        return this.priceValidation;
    }

    public final String component2() {
        return this.paymentInstrumentId;
    }

    public final String component20() {
        return this.vpa;
    }

    public final Boolean component21() {
        return this.saveUPI;
    }

    public final List component22() {
        return this.intentApps;
    }

    public final String component23() {
        return this.intentAppsData;
    }

    public final String component24() {
        return this.description;
    }

    public final String component25() {
        return this.username;
    }

    public final String component26() {
        return this.instrumentChecksum;
    }

    public final String component27() {
        return this.maskedUPIInfo;
    }

    public final String component28() {
        return this.displayUPIInfo;
    }

    public final String component29() {
        return this.savedWallet;
    }

    public final Tenant component3() {
        return this.tenant;
    }

    public final Customer component30() {
        return this.customer;
    }

    public final String component31() {
        return this.lastFourDigits;
    }

    public final String component32() {
        return this.response;
    }

    public final String component33() {
        return this.transactionStatus;
    }

    public final Boolean component34() {
        return this.selected;
    }

    public final String component35() {
        return this.paymentGatewayTransactionId;
    }

    public final List component36() {
        return this.subWallets;
    }

    public final Float component37() {
        return this.earn;
    }

    public final String component38() {
        return this.expiryYear;
    }

    public final String component39() {
        return this.expiryMonth;
    }

    public final String component4() {
        return this.nameOnCard;
    }

    public final String component40() {
        return this.paymentInstrumentCode;
    }

    public final String component41() {
        return this.password;
    }

    public final Float component42() {
        return this.amount;
    }

    public final String component43() {
        return this.cardNetwork;
    }

    public final Boolean component44() {
        return this.isCLicked;
    }

    public final String component45() {
        return this.code;
    }

    public final Float component46() {
        return this.availableAmount;
    }

    public final String component47() {
        return this.gatewaySpecificCode;
    }

    public final Float component48() {
        return this.leftPostUsage;
    }

    public final Float component49() {
        return this.multipleWalletEnabledAmount;
    }

    public final String component5() {
        return this.cardNumber;
    }

    public final Float component50() {
        return this.multipleWalletEnabledLeftPostUsageAmount;
    }

    public final float component51() {
        return this.minimumEarnThreshold;
    }

    public final Boolean component52() {
        return this.isNew;
    }

    public final Boolean component53() {
        return this.offerExpand;
    }

    public final String component54() {
        return this.paymentInstrumentName;
    }

    public final String component55() {
        return this.paymentInstrumentDescription;
    }

    public final String component56() {
        return this.name;
    }

    public final String component57() {
        return this.cvv;
    }

    public final String component58() {
        return this.cardType;
    }

    public final String component59() {
        return this.offer;
    }

    public final String component6() {
        return this.maskedCardInfo;
    }

    public final String component60() {
        return this.cardProvider;
    }

    public final Boolean component61() {
        return this.saveCard;
    }

    public final Boolean component62() {
        return this.lowSuccessRate;
    }

    public final String component63() {
        return this.message;
    }

    public final Boolean component64() {
        return this.errorLoadingBalance;
    }

    public final String component65() {
        return this.errorLoadingMessage;
    }

    public final Boolean component66() {
        return this.isTokenized;
    }

    public final double component67() {
        return this.giftCardAmount;
    }

    public final Integer component68() {
        return this.redemptionPriority;
    }

    public final boolean component69() {
        return this.isSelected;
    }

    public final String component7() {
        return this.iconUrl;
    }

    public final Integer component70() {
        return this.conversionFactor;
    }

    public final List component71() {
        return this.excludedProducts;
    }

    public final String component72() {
        return this.instrument_code;
    }

    public final Boolean component73() {
        return this.disabled;
    }

    public final String component74() {
        return this.bank_code_juspay;
    }

    public final Double component75() {
        return this.minimum_emi_amount;
    }

    public final Boolean component76() {
        return this.no_cost_emi_enabled;
    }

    public final ArrayList component77() {
        return this.standard_emi;
    }

    public final ArrayList component78() {
        return this.no_cost_emi;
    }

    public final ArrayList component79() {
        return this.featured_emi;
    }

    public final String component8() {
        return this.splitUpId;
    }

    public final String component9() {
        return this.isLRManaged;
    }

    public final PaymentInstrumentInfo copy(String string2, String string3, Tenant tenant, String string4, String string5, String string6, String string7, String string8, String string9, Boolean bl2, Long l2, String string10, boolean bl3, String string11, String string12, Loyalty loyalty, String string13, OfferDetails offerDetails, PriceValidation priceValidation, String string14, Boolean bl4, List list, String string15, String string16, String string17, String string18, String string19, String string20, String string21, Customer customer, String string22, String string23, String string24, Boolean bl5, String string25, List list2, Float f5, String string26, String string27, String string28, String string29, Float f6, String string30, Boolean bl6, String string31, Float f7, String string32, Float f8, Float f11, Float f12, float f14, Boolean bl7, Boolean bl8, String string33, String string34, String string35, String string36, String string37, String string38, String string39, Boolean bl9, Boolean bl10, String string40, Boolean bl11, String string41, Boolean bl12, double d2, Integer n3, boolean bl13, Integer n4, List list3, String string42, Boolean bl14, String string43, Double d5, Boolean bl15, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        PaymentInstrumentInfo paymentInstrumentInfo = new PaymentInstrumentInfo(string2, string3, tenant, string4, string5, string6, string7, string8, string9, bl2, l2, string10, bl3, string11, string12, loyalty, string13, offerDetails, priceValidation, string14, bl4, list, string15, string16, string17, string18, string19, string20, string21, customer, string22, string23, string24, bl5, string25, list2, f5, string26, string27, string28, string29, f6, string30, bl6, string31, f7, string32, f8, f11, f12, f14, bl7, bl8, string33, string34, string35, string36, string37, string38, string39, bl9, bl10, string40, bl11, string41, bl12, d2, n3, bl13, n4, list3, string42, bl14, string43, d5, bl15, arrayList, arrayList2, arrayList3);
        return paymentInstrumentInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PaymentInstrumentInfo;
        if (n3 == 0) {
            return false;
        }
        object = (PaymentInstrumentInfo)object;
        Object object2 = this.type;
        Object object3 = ((PaymentInstrumentInfo)object).type;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentInstrumentId;
        object3 = ((PaymentInstrumentInfo)object).paymentInstrumentId;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((PaymentInstrumentInfo)object).tenant;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.nameOnCard;
        object3 = ((PaymentInstrumentInfo)object).nameOnCard;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cardNumber;
        object3 = ((PaymentInstrumentInfo)object).cardNumber;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.maskedCardInfo;
        object3 = ((PaymentInstrumentInfo)object).maskedCardInfo;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.iconUrl;
        object3 = ((PaymentInstrumentInfo)object).iconUrl;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.splitUpId;
        object3 = ((PaymentInstrumentInfo)object).splitUpId;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isLRManaged;
        object3 = ((PaymentInstrumentInfo)object).isLRManaged;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.intent;
        object3 = ((PaymentInstrumentInfo)object).intent;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.transactionTime;
        object3 = ((PaymentInstrumentInfo)object).transactionTime;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.priority;
        object3 = ((PaymentInstrumentInfo)object).priority;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.paymentInstrumentActive;
        int n4 = ((PaymentInstrumentInfo)object).paymentInstrumentActive;
        if (n3 != n4) {
            return false;
        }
        object2 = this.paymentEngineTransactionId;
        object3 = ((PaymentInstrumentInfo)object).paymentEngineTransactionId;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.iconURL;
        object3 = ((PaymentInstrumentInfo)object).iconURL;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.loyalty;
        object3 = ((PaymentInstrumentInfo)object).loyalty;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.registeredMobile;
        object3 = ((PaymentInstrumentInfo)object).registeredMobile;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.offerDetails;
        object3 = ((PaymentInstrumentInfo)object).offerDetails;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.priceValidation;
        object3 = ((PaymentInstrumentInfo)object).priceValidation;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.vpa;
        object3 = ((PaymentInstrumentInfo)object).vpa;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.saveUPI;
        object3 = ((PaymentInstrumentInfo)object).saveUPI;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.intentApps;
        object3 = ((PaymentInstrumentInfo)object).intentApps;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.intentAppsData;
        object3 = ((PaymentInstrumentInfo)object).intentAppsData;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.description;
        object3 = ((PaymentInstrumentInfo)object).description;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.username;
        object3 = ((PaymentInstrumentInfo)object).username;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.instrumentChecksum;
        object3 = ((PaymentInstrumentInfo)object).instrumentChecksum;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.maskedUPIInfo;
        object3 = ((PaymentInstrumentInfo)object).maskedUPIInfo;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.displayUPIInfo;
        object3 = ((PaymentInstrumentInfo)object).displayUPIInfo;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.savedWallet;
        object3 = ((PaymentInstrumentInfo)object).savedWallet;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.customer;
        object3 = ((PaymentInstrumentInfo)object).customer;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.lastFourDigits;
        object3 = ((PaymentInstrumentInfo)object).lastFourDigits;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.response;
        object3 = ((PaymentInstrumentInfo)object).response;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.transactionStatus;
        object3 = ((PaymentInstrumentInfo)object).transactionStatus;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.selected;
        object3 = ((PaymentInstrumentInfo)object).selected;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentGatewayTransactionId;
        object3 = ((PaymentInstrumentInfo)object).paymentGatewayTransactionId;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.subWallets;
        object3 = ((PaymentInstrumentInfo)object).subWallets;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.earn;
        object3 = ((PaymentInstrumentInfo)object).earn;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.expiryYear;
        object3 = ((PaymentInstrumentInfo)object).expiryYear;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.expiryMonth;
        object3 = ((PaymentInstrumentInfo)object).expiryMonth;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentInstrumentCode;
        object3 = ((PaymentInstrumentInfo)object).paymentInstrumentCode;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.password;
        object3 = ((PaymentInstrumentInfo)object).password;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.amount;
        object3 = ((PaymentInstrumentInfo)object).amount;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cardNetwork;
        object3 = ((PaymentInstrumentInfo)object).cardNetwork;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isCLicked;
        object3 = ((PaymentInstrumentInfo)object).isCLicked;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.code;
        object3 = ((PaymentInstrumentInfo)object).code;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.availableAmount;
        object3 = ((PaymentInstrumentInfo)object).availableAmount;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.gatewaySpecificCode;
        object3 = ((PaymentInstrumentInfo)object).gatewaySpecificCode;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.leftPostUsage;
        object3 = ((PaymentInstrumentInfo)object).leftPostUsage;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.multipleWalletEnabledAmount;
        object3 = ((PaymentInstrumentInfo)object).multipleWalletEnabledAmount;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.multipleWalletEnabledLeftPostUsageAmount;
        object3 = ((PaymentInstrumentInfo)object).multipleWalletEnabledLeftPostUsageAmount;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        float f5 = this.minimumEarnThreshold;
        float f6 = ((PaymentInstrumentInfo)object).minimumEarnThreshold;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        object2 = this.isNew;
        object3 = ((PaymentInstrumentInfo)object).isNew;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.offerExpand;
        object3 = ((PaymentInstrumentInfo)object).offerExpand;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentInstrumentName;
        object3 = ((PaymentInstrumentInfo)object).paymentInstrumentName;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentInstrumentDescription;
        object3 = ((PaymentInstrumentInfo)object).paymentInstrumentDescription;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.name;
        object3 = ((PaymentInstrumentInfo)object).name;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cvv;
        object3 = ((PaymentInstrumentInfo)object).cvv;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cardType;
        object3 = ((PaymentInstrumentInfo)object).cardType;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.offer;
        object3 = ((PaymentInstrumentInfo)object).offer;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cardProvider;
        object3 = ((PaymentInstrumentInfo)object).cardProvider;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.saveCard;
        object3 = ((PaymentInstrumentInfo)object).saveCard;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.lowSuccessRate;
        object3 = ((PaymentInstrumentInfo)object).lowSuccessRate;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.message;
        object3 = ((PaymentInstrumentInfo)object).message;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.errorLoadingBalance;
        object3 = ((PaymentInstrumentInfo)object).errorLoadingBalance;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.errorLoadingMessage;
        object3 = ((PaymentInstrumentInfo)object).errorLoadingMessage;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isTokenized;
        object3 = ((PaymentInstrumentInfo)object).isTokenized;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        double d2 = this.giftCardAmount;
        double d5 = ((PaymentInstrumentInfo)object).giftCardAmount;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        object2 = this.redemptionPriority;
        object3 = ((PaymentInstrumentInfo)object).redemptionPriority;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.isSelected ? 1 : 0);
        n4 = ((PaymentInstrumentInfo)object).isSelected;
        if (n3 != n4) {
            return false;
        }
        object2 = this.conversionFactor;
        object3 = ((PaymentInstrumentInfo)object).conversionFactor;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.excludedProducts;
        object3 = ((PaymentInstrumentInfo)object).excludedProducts;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.instrument_code;
        object3 = ((PaymentInstrumentInfo)object).instrument_code;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.disabled;
        object3 = ((PaymentInstrumentInfo)object).disabled;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.bank_code_juspay;
        object3 = ((PaymentInstrumentInfo)object).bank_code_juspay;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.minimum_emi_amount;
        object3 = ((PaymentInstrumentInfo)object).minimum_emi_amount;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.no_cost_emi_enabled;
        object3 = ((PaymentInstrumentInfo)object).no_cost_emi_enabled;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.standard_emi;
        object3 = ((PaymentInstrumentInfo)object).standard_emi;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.no_cost_emi;
        object3 = ((PaymentInstrumentInfo)object).no_cost_emi;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.featured_emi;
        object = ((PaymentInstrumentInfo)object).featured_emi;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final Float getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getBank_code_juspay() {
        return this.bank_code_juspay;
    }

    public final String getCardNetwork() {
        return this.cardNetwork;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCardProvider() {
        return this.cardProvider;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCode() {
        return this.code;
    }

    public final Integer getConversionFactor() {
        return this.conversionFactor;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getDisabled() {
        return this.disabled;
    }

    public final String getDisplayUPIInfo() {
        return this.displayUPIInfo;
    }

    public final Float getEarn() {
        return this.earn;
    }

    public final Boolean getErrorLoadingBalance() {
        return this.errorLoadingBalance;
    }

    public final String getErrorLoadingMessage() {
        return this.errorLoadingMessage;
    }

    public final List getExcludedProducts() {
        return this.excludedProducts;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final ArrayList getFeatured_emi() {
        return this.featured_emi;
    }

    public final String getGatewaySpecificCode() {
        return this.gatewaySpecificCode;
    }

    public final double getGiftCardAmount() {
        return this.giftCardAmount;
    }

    public final String getIconURL() {
        return this.iconURL;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getInstrumentChecksum() {
        return this.instrumentChecksum;
    }

    public final String getInstrument_code() {
        return this.instrument_code;
    }

    public final Boolean getIntent() {
        return this.intent;
    }

    public final List getIntentApps() {
        return this.intentApps;
    }

    public final String getIntentAppsData() {
        return this.intentAppsData;
    }

    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final Float getLeftPostUsage() {
        return this.leftPostUsage;
    }

    public final Boolean getLowSuccessRate() {
        return this.lowSuccessRate;
    }

    public final Loyalty getLoyalty() {
        return this.loyalty;
    }

    public final String getMaskedCardInfo() {
        return this.maskedCardInfo;
    }

    public final String getMaskedUPIInfo() {
        return this.maskedUPIInfo;
    }

    public final String getMessage() {
        return this.message;
    }

    public final float getMinimumEarnThreshold() {
        return this.minimumEarnThreshold;
    }

    public final Double getMinimum_emi_amount() {
        return this.minimum_emi_amount;
    }

    public final Float getMultipleWalletEnabledAmount() {
        return this.multipleWalletEnabledAmount;
    }

    public final Float getMultipleWalletEnabledLeftPostUsageAmount() {
        return this.multipleWalletEnabledLeftPostUsageAmount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNameOnCard() {
        return this.nameOnCard;
    }

    public final ArrayList getNo_cost_emi() {
        return this.no_cost_emi;
    }

    public final Boolean getNo_cost_emi_enabled() {
        return this.no_cost_emi_enabled;
    }

    public final String getOffer() {
        return this.offer;
    }

    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final Boolean getOfferExpand() {
        return this.offerExpand;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPaymentEngineTransactionId() {
        return this.paymentEngineTransactionId;
    }

    public final String getPaymentGatewayTransactionId() {
        return this.paymentGatewayTransactionId;
    }

    public final boolean getPaymentInstrumentActive() {
        return this.paymentInstrumentActive;
    }

    public final String getPaymentInstrumentCode() {
        return this.paymentInstrumentCode;
    }

    public final String getPaymentInstrumentDescription() {
        return this.paymentInstrumentDescription;
    }

    public final String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    public final String getPaymentInstrumentName() {
        return this.paymentInstrumentName;
    }

    public final PriceValidation getPriceValidation() {
        return this.priceValidation;
    }

    public final String getPriority() {
        return this.priority;
    }

    public final Integer getRedemptionPriority() {
        return this.redemptionPriority;
    }

    public final String getRegisteredMobile() {
        return this.registeredMobile;
    }

    public final String getResponse() {
        return this.response;
    }

    public final Boolean getSaveCard() {
        return this.saveCard;
    }

    public final Boolean getSaveUPI() {
        return this.saveUPI;
    }

    public final String getSavedWallet() {
        return this.savedWallet;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final String getSplitUpId() {
        return this.splitUpId;
    }

    public final ArrayList getStandard_emi() {
        return this.standard_emi;
    }

    public final List getSubWallets() {
        return this.subWallets;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    public final Long getTransactionTime() {
        return this.transactionTime;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getVpa() {
        return this.vpa;
    }

    public int hashCode() {
        float f5;
        int n3;
        int n4;
        String string2 = this.type;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        int n8 = 31;
        n4 *= 31;
        Object object = this.paymentInstrumentId;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tenant;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((Tenant)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.nameOnCard;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cardNumber;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.maskedCardInfo;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.iconUrl;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.splitUpId;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isLRManaged;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.intent;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionTime;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priority;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.paymentInstrumentActive ? 1 : 0);
        int n10 = 1237;
        if (n3 != 0) {
            n3 = 1231;
            f5 = 1.725E-42f;
        } else {
            n3 = 1237;
            f5 = 1.733E-42f;
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentEngineTransactionId;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.iconURL;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.loyalty;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((Loyalty)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.registeredMobile;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerDetails;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((OfferDetails)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceValidation;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((PriceValidation)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.vpa;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.saveUPI;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.intentApps;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.intentAppsData;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.description;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.username;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.instrumentChecksum;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.maskedUPIInfo;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.displayUPIInfo;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.savedWallet;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.customer;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((Customer)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.lastFourDigits;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.response;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionStatus;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.selected;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentGatewayTransactionId;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.subWallets;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.earn;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.expiryYear;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.expiryMonth;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentCode;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.password;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.amount;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cardNetwork;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isCLicked;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.code;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.availableAmount;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.gatewaySpecificCode;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.leftPostUsage;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.multipleWalletEnabledAmount;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.multipleWalletEnabledLeftPostUsageAmount;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        f5 = this.minimumEarnThreshold;
        n4 = UR0.a(f5, n4, n8);
        object = this.isNew;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerExpand;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentName;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentDescription;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.name;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cvv;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cardType;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offer;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cardProvider;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.saveCard;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.lowSuccessRate;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.errorLoadingBalance;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.errorLoadingMessage;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isTokenized;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        double d2 = this.giftCardAmount;
        long l2 = Double.doubleToLongBits(d2);
        f5 = 4.5E-44f;
        long l3 = l2 >>> 32;
        n3 = (int)(l2 ^= l3);
        n4 = (n4 + n3) * 31;
        object = this.redemptionPriority;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.isSelected ? 1 : 0);
        if (n3 != 0) {
            n10 = 1231;
        }
        n4 = (n4 + n10) * 31;
        object = this.conversionFactor;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.excludedProducts;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.instrument_code;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.disabled;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bank_code_juspay;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.minimum_emi_amount;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.no_cost_emi_enabled;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.standard_emi;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.no_cost_emi;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        ArrayList arrayList = this.featured_emi;
        if (arrayList != null) {
            n7 = arrayList.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isCLicked() {
        return this.isCLicked;
    }

    public final String isLRManaged() {
        return this.isLRManaged;
    }

    public final Boolean isNew() {
        return this.isNew;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final Boolean isTokenized() {
        return this.isTokenized;
    }

    public final void setAmount(Float f5) {
        this.amount = f5;
    }

    public final void setAvailableAmount(Float f5) {
        this.availableAmount = f5;
    }

    public final void setBank_code_juspay(String string2) {
        this.bank_code_juspay = string2;
    }

    public final void setCLicked(Boolean bl2) {
        this.isCLicked = bl2;
    }

    public final void setCardNetwork(String string2) {
        this.cardNetwork = string2;
    }

    public final void setCardNumber(String string2) {
        this.cardNumber = string2;
    }

    public final void setCardProvider(String string2) {
        this.cardProvider = string2;
    }

    public final void setCardType(String string2) {
        this.cardType = string2;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setConversionFactor(Integer n3) {
        this.conversionFactor = n3;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final void setCvv(String string2) {
        this.cvv = string2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setDisabled(Boolean bl2) {
        this.disabled = bl2;
    }

    public final void setDisplayUPIInfo(String string2) {
        this.displayUPIInfo = string2;
    }

    public final void setEarn(Float f5) {
        this.earn = f5;
    }

    public final void setErrorLoadingBalance(Boolean bl2) {
        this.errorLoadingBalance = bl2;
    }

    public final void setErrorLoadingMessage(String string2) {
        this.errorLoadingMessage = string2;
    }

    public final void setExcludedProducts(List list) {
        this.excludedProducts = list;
    }

    public final void setExpiryMonth(String string2) {
        this.expiryMonth = string2;
    }

    public final void setExpiryYear(String string2) {
        this.expiryYear = string2;
    }

    public final void setFeatured_emi(ArrayList arrayList) {
        this.featured_emi = arrayList;
    }

    public final void setGatewaySpecificCode(String string2) {
        this.gatewaySpecificCode = string2;
    }

    public final void setGiftCardAmount(double d2) {
        this.giftCardAmount = d2;
    }

    public final void setIconURL(String string2) {
        this.iconURL = string2;
    }

    public final void setIconUrl(String string2) {
        this.iconUrl = string2;
    }

    public final void setInstrumentChecksum(String string2) {
        this.instrumentChecksum = string2;
    }

    public final void setInstrument_code(String string2) {
        this.instrument_code = string2;
    }

    public final void setIntent(Boolean bl2) {
        this.intent = bl2;
    }

    public final void setIntentApps(List list) {
        this.intentApps = list;
    }

    public final void setIntentAppsData(String string2) {
        this.intentAppsData = string2;
    }

    public final void setLRManaged(String string2) {
        this.isLRManaged = string2;
    }

    public final void setLastFourDigits(String string2) {
        this.lastFourDigits = string2;
    }

    public final void setLeftPostUsage(Float f5) {
        this.leftPostUsage = f5;
    }

    public final void setLowSuccessRate(Boolean bl2) {
        this.lowSuccessRate = bl2;
    }

    public final void setLoyalty(Loyalty loyalty) {
        this.loyalty = loyalty;
    }

    public final void setMaskedCardInfo(String string2) {
        this.maskedCardInfo = string2;
    }

    public final void setMaskedUPIInfo(String string2) {
        this.maskedUPIInfo = string2;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setMinimumEarnThreshold(float f5) {
        this.minimumEarnThreshold = f5;
    }

    public final void setMinimum_emi_amount(Double d2) {
        this.minimum_emi_amount = d2;
    }

    public final void setMultipleWalletEnabledAmount(Float f5) {
        this.multipleWalletEnabledAmount = f5;
    }

    public final void setMultipleWalletEnabledLeftPostUsageAmount(Float f5) {
        this.multipleWalletEnabledLeftPostUsageAmount = f5;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setNameOnCard(String string2) {
        this.nameOnCard = string2;
    }

    public final void setNew(Boolean bl2) {
        this.isNew = bl2;
    }

    public final void setNo_cost_emi(ArrayList arrayList) {
        this.no_cost_emi = arrayList;
    }

    public final void setNo_cost_emi_enabled(Boolean bl2) {
        this.no_cost_emi_enabled = bl2;
    }

    public final void setOffer(String string2) {
        this.offer = string2;
    }

    public final void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }

    public final void setOfferExpand(Boolean bl2) {
        this.offerExpand = bl2;
    }

    public final void setPassword(String string2) {
        this.password = string2;
    }

    public final void setPaymentEngineTransactionId(String string2) {
        this.paymentEngineTransactionId = string2;
    }

    public final void setPaymentGatewayTransactionId(String string2) {
        this.paymentGatewayTransactionId = string2;
    }

    public final void setPaymentInstrumentActive(boolean bl2) {
        this.paymentInstrumentActive = bl2;
    }

    public final void setPaymentInstrumentCode(String string2) {
        this.paymentInstrumentCode = string2;
    }

    public final void setPaymentInstrumentDescription(String string2) {
        this.paymentInstrumentDescription = string2;
    }

    public final void setPaymentInstrumentId(String string2) {
        this.paymentInstrumentId = string2;
    }

    public final void setPaymentInstrumentName(String string2) {
        this.paymentInstrumentName = string2;
    }

    public final void setPriceValidation(PriceValidation priceValidation) {
        this.priceValidation = priceValidation;
    }

    public final void setPriority(String string2) {
        this.priority = string2;
    }

    public final void setRedemptionPriority(Integer n3) {
        this.redemptionPriority = n3;
    }

    public final void setRegisteredMobile(String string2) {
        this.registeredMobile = string2;
    }

    public final void setResponse(String string2) {
        this.response = string2;
    }

    public final void setSaveCard(Boolean bl2) {
        this.saveCard = bl2;
    }

    public final void setSaveUPI(Boolean bl2) {
        this.saveUPI = bl2;
    }

    public final void setSavedWallet(String string2) {
        this.savedWallet = string2;
    }

    public final void setSelected(Boolean bl2) {
        this.selected = bl2;
    }

    public final void setSelected(boolean bl2) {
        this.isSelected = bl2;
    }

    public final void setSplitUpId(String string2) {
        this.splitUpId = string2;
    }

    public final void setStandard_emi(ArrayList arrayList) {
        this.standard_emi = arrayList;
    }

    public final void setSubWallets(List list) {
        this.subWallets = list;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public final void setTokenized(Boolean bl2) {
        this.isTokenized = bl2;
    }

    public final void setTransactionStatus(String string2) {
        this.transactionStatus = string2;
    }

    public final void setTransactionTime(Long l2) {
        this.transactionTime = l2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void setUsername(String string2) {
        this.username = string2;
    }

    public final void setVpa(String string2) {
        this.vpa = string2;
    }

    public String toString() {
        Serializable serializable = this;
        Object object = this.type;
        String string2 = this.paymentInstrumentId;
        Object object2 = this.tenant;
        Object object3 = this.nameOnCard;
        String string3 = this.cardNumber;
        String string4 = this.maskedCardInfo;
        String string5 = this.iconUrl;
        String string6 = this.splitUpId;
        String string7 = this.isLRManaged;
        Boolean bl2 = this.intent;
        Long l2 = this.transactionTime;
        String string8 = this.priority;
        boolean bl3 = this.paymentInstrumentActive;
        Object object4 = this.paymentEngineTransactionId;
        String string9 = this.iconURL;
        Loyalty loyalty = this.loyalty;
        String string10 = this.registeredMobile;
        OfferDetails offerDetails = this.offerDetails;
        PriceValidation priceValidation = this.priceValidation;
        String string11 = this.vpa;
        Boolean bl4 = this.saveUPI;
        List list = this.intentApps;
        String string12 = this.intentAppsData;
        String string13 = this.description;
        String string14 = this.username;
        String string15 = this.instrumentChecksum;
        String string16 = this.maskedUPIInfo;
        String string17 = this.displayUPIInfo;
        String string18 = this.savedWallet;
        Customer customer = this.customer;
        String string19 = this.lastFourDigits;
        String string20 = this.response;
        String string21 = this.transactionStatus;
        Boolean bl5 = this.selected;
        String string22 = this.paymentGatewayTransactionId;
        List list2 = this.subWallets;
        Float f5 = this.earn;
        String string23 = this.expiryYear;
        String string24 = this.expiryMonth;
        String string25 = this.paymentInstrumentCode;
        String string26 = this.password;
        Float f6 = this.amount;
        String string27 = this.cardNetwork;
        Boolean bl6 = this.isCLicked;
        String string28 = this.code;
        Float f7 = this.availableAmount;
        String string29 = this.gatewaySpecificCode;
        Float f8 = this.leftPostUsage;
        Float f11 = this.multipleWalletEnabledAmount;
        Float f12 = this.multipleWalletEnabledLeftPostUsageAmount;
        float f14 = this.minimumEarnThreshold;
        Boolean bl7 = this.isNew;
        Boolean bl8 = this.offerExpand;
        String string30 = this.paymentInstrumentName;
        String string31 = this.paymentInstrumentDescription;
        String string32 = this.name;
        String string33 = this.cvv;
        String string34 = this.cardType;
        String string35 = this.offer;
        String string36 = this.cardProvider;
        Boolean bl9 = this.saveCard;
        Boolean bl10 = this.lowSuccessRate;
        String string37 = this.message;
        Boolean bl11 = this.errorLoadingBalance;
        String string38 = this.errorLoadingMessage;
        Serializable serializable2 = this.isTokenized;
        String string39 = object4;
        Boolean bl12 = serializable2;
        double d2 = this.giftCardAmount;
        object4 = this.redemptionPriority;
        boolean bl13 = this.isSelected;
        Integer n3 = this.conversionFactor;
        List list3 = this.excludedProducts;
        String string40 = this.instrument_code;
        Boolean bl14 = this.disabled;
        String string41 = this.bank_code_juspay;
        Double d5 = this.minimum_emi_amount;
        Boolean bl15 = this.no_cost_emi_enabled;
        ArrayList arrayList = this.standard_emi;
        ArrayList arrayList2 = this.no_cost_emi;
        serializable2 = this.featured_emi;
        serializable = og_1.a("PaymentInstrumentInfo(type=", (String)object, ", paymentInstrumentId=", string2, ", tenant=");
        ((StringBuilder)serializable).append(object2);
        ((StringBuilder)serializable).append(", nameOnCard=");
        ((StringBuilder)serializable).append((String)object3);
        ((StringBuilder)serializable).append(", cardNumber=");
        X50.a((StringBuilder)serializable, string3, ", maskedCardInfo=", string4, ", iconUrl=");
        X50.a((StringBuilder)serializable, string5, ", splitUpId=", string6, ", isLRManaged=");
        vw0_1.a(bl2, string7, ", intent=", ", transactionTime=", (StringBuilder)serializable);
        ((StringBuilder)serializable).append(l2);
        ((StringBuilder)serializable).append(", priority=");
        ((StringBuilder)serializable).append(string8);
        ((StringBuilder)serializable).append(", paymentInstrumentActive=");
        ((StringBuilder)serializable).append(bl3);
        ((StringBuilder)serializable).append(", paymentEngineTransactionId=");
        object = string39;
        ((StringBuilder)serializable).append(string39);
        ((StringBuilder)serializable).append(", iconURL=");
        object = string9;
        ((StringBuilder)serializable).append(string9);
        ((StringBuilder)serializable).append(", loyalty=");
        object = loyalty;
        ((StringBuilder)serializable).append(loyalty);
        ((StringBuilder)serializable).append(", registeredMobile=");
        object = string10;
        ((StringBuilder)serializable).append(string10);
        ((StringBuilder)serializable).append(", offerDetails=");
        object = offerDetails;
        ((StringBuilder)serializable).append(offerDetails);
        ((StringBuilder)serializable).append(", priceValidation=");
        object = priceValidation;
        ((StringBuilder)serializable).append(priceValidation);
        ((StringBuilder)serializable).append(", vpa=");
        object = string11;
        ((StringBuilder)serializable).append(string11);
        ((StringBuilder)serializable).append(", saveUPI=");
        object = bl4;
        ((StringBuilder)serializable).append(bl4);
        ((StringBuilder)serializable).append(", intentApps=");
        object = list;
        ((StringBuilder)serializable).append(list);
        ((StringBuilder)serializable).append(", intentAppsData=");
        object2 = string12;
        object3 = string13;
        X50.a((StringBuilder)serializable, string12, ", description=", string13, ", username=");
        object2 = string14;
        object3 = string15;
        X50.a((StringBuilder)serializable, string14, ", instrumentChecksum=", string15, ", maskedUPIInfo=");
        object2 = string16;
        object3 = string17;
        X50.a((StringBuilder)serializable, string16, ", displayUPIInfo=", string17, ", savedWallet=");
        object = string18;
        ((StringBuilder)serializable).append(string18);
        ((StringBuilder)serializable).append(", customer=");
        object = customer;
        ((StringBuilder)serializable).append(customer);
        ((StringBuilder)serializable).append(", lastFourDigits=");
        object2 = string19;
        object3 = string20;
        X50.a((StringBuilder)serializable, string19, ", response=", string20, ", transactionStatus=");
        object2 = string21;
        object3 = bl5;
        vw0_1.a(bl5, string21, ", selected=", ", paymentGatewayTransactionId=", (StringBuilder)serializable);
        object = string22;
        ((StringBuilder)serializable).append(string22);
        ((StringBuilder)serializable).append(", subWallets=");
        object = list2;
        ((StringBuilder)serializable).append(list2);
        ((StringBuilder)serializable).append(", earn=");
        object = f5;
        ((StringBuilder)serializable).append(f5);
        ((StringBuilder)serializable).append(", expiryYear=");
        object = string23;
        ((StringBuilder)serializable).append(string23);
        ((StringBuilder)serializable).append(", expiryMonth=");
        object2 = string24;
        object3 = string25;
        X50.a((StringBuilder)serializable, string24, ", paymentInstrumentCode=", string25, ", password=");
        object = string26;
        ((StringBuilder)serializable).append(string26);
        ((StringBuilder)serializable).append(", amount=");
        object = f6;
        ((StringBuilder)serializable).append(f6);
        ((StringBuilder)serializable).append(", cardNetwork=");
        object2 = string27;
        object3 = bl6;
        vw0_1.a(bl6, string27, ", isCLicked=", ", code=", (StringBuilder)serializable);
        object = string28;
        ((StringBuilder)serializable).append(string28);
        ((StringBuilder)serializable).append(", availableAmount=");
        object = f7;
        ((StringBuilder)serializable).append(f7);
        ((StringBuilder)serializable).append(", gatewaySpecificCode=");
        object = string29;
        ((StringBuilder)serializable).append(string29);
        ((StringBuilder)serializable).append(", leftPostUsage=");
        object = f8;
        ((StringBuilder)serializable).append(f8);
        ((StringBuilder)serializable).append(", multipleWalletEnabledAmount=");
        object = f11;
        ((StringBuilder)serializable).append(f11);
        ((StringBuilder)serializable).append(", multipleWalletEnabledLeftPostUsageAmount=");
        object = f12;
        ((StringBuilder)serializable).append(f12);
        ((StringBuilder)serializable).append(", minimumEarnThreshold=");
        ((StringBuilder)serializable).append(f14);
        ((StringBuilder)serializable).append(", isNew=");
        object = bl7;
        ((StringBuilder)serializable).append(bl7);
        ((StringBuilder)serializable).append(", offerExpand=");
        object2 = bl8;
        object3 = string30;
        xi0_2.a(bl8, ", paymentInstrumentName=", string30, ", paymentInstrumentDescription=", (StringBuilder)serializable);
        object2 = string31;
        object3 = string32;
        X50.a((StringBuilder)serializable, string31, ", name=", string32, ", cvv=");
        object2 = string33;
        object3 = string34;
        X50.a((StringBuilder)serializable, string33, ", cardType=", string34, ", offer=");
        object2 = string35;
        object3 = string36;
        X50.a((StringBuilder)serializable, string35, ", cardProvider=", string36, ", saveCard=");
        object = bl9;
        ((StringBuilder)serializable).append(bl9);
        ((StringBuilder)serializable).append(", lowSuccessRate=");
        object = bl10;
        ((StringBuilder)serializable).append(bl10);
        ((StringBuilder)serializable).append(", message=");
        object2 = string37;
        object3 = bl11;
        vw0_1.a(bl11, string37, ", errorLoadingBalance=", ", errorLoadingMessage=", (StringBuilder)serializable);
        object2 = string38;
        object3 = bl12;
        vw0_1.a(bl12, string38, ", isTokenized=", ", giftCardAmount=", (StringBuilder)serializable);
        ((StringBuilder)serializable).append(d2);
        ((StringBuilder)serializable).append(", redemptionPriority=");
        object = object4;
        ((StringBuilder)serializable).append(object4);
        ((StringBuilder)serializable).append(", isSelected=");
        ((StringBuilder)serializable).append(bl13);
        ((StringBuilder)serializable).append(", conversionFactor=");
        object = n3;
        ((StringBuilder)serializable).append(n3);
        ((StringBuilder)serializable).append(", excludedProducts=");
        object = list3;
        ((StringBuilder)serializable).append(list3);
        ((StringBuilder)serializable).append(", instrument_code=");
        object = string40;
        ((StringBuilder)serializable).append(string40);
        ((StringBuilder)serializable).append(", disabled=");
        object = bl14;
        ((StringBuilder)serializable).append(bl14);
        ((StringBuilder)serializable).append(", bank_code_juspay=");
        object = string41;
        ((StringBuilder)serializable).append(string41);
        ((StringBuilder)serializable).append(", minimum_emi_amount=");
        object = d5;
        ((StringBuilder)serializable).append(d5);
        ((StringBuilder)serializable).append(", no_cost_emi_enabled=");
        object = bl15;
        ((StringBuilder)serializable).append(bl15);
        ((StringBuilder)serializable).append(", standard_emi=");
        object = arrayList;
        ((StringBuilder)serializable).append(arrayList);
        ((StringBuilder)serializable).append(", no_cost_emi=");
        object = arrayList2;
        ((StringBuilder)serializable).append(arrayList2);
        ((StringBuilder)serializable).append(", featured_emi=");
        object = serializable2;
        ((StringBuilder)serializable).append(serializable2);
        ((StringBuilder)serializable).append(")");
        return ((StringBuilder)serializable).toString();
    }
}

