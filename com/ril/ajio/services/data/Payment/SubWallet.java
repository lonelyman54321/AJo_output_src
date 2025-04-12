/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.Tenant;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubWallet
implements Serializable {
    private Float amount;
    private Float availableAmount;
    private String code;
    private Integer conversionFactor;
    private Customer customer;
    private String description;
    private Long earn;
    private String iconURL;
    private Boolean isNew;
    private Boolean isSelected;
    private float leftPostUsage;
    private float maximumEligibleBurnPercentage;
    private Float multipleWalletEnabledAmount;
    private Float multipleWalletEnabledLeftPostUsageAmount;
    private String name;
    private String password;
    private String paymentEngineTransactionId;
    private String paymentGatewayTransactionId;
    private String paymentInstrumentId;
    private Double points;
    private Integer priority;
    private Integer redemptionPriority;
    private String savedWallet;
    private Tenant tenant;
    private String transactionStatus;
    private Long transactionTime;
    private String type;
    private String username;

    public SubWallet() {
        this(null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, -1 >>> 4, null);
    }

    public SubWallet(String string2, String string3, String string4, Long l2, Long l3, Double d2, float f5, Float f6, Float f7, String string5, String string6, Tenant tenant, Customer customer, String string7, String string8, String string9, String string10, String string11, String string12, String string13, Float f8, Float f11, Integer n3, float f12, Integer n4, Integer n7, Boolean bl2, Boolean bl3) {
        this.paymentEngineTransactionId = string2;
        this.paymentGatewayTransactionId = string3;
        this.transactionStatus = string4;
        this.earn = l2;
        this.transactionTime = l3;
        this.points = d2;
        this.leftPostUsage = f5;
        this.multipleWalletEnabledAmount = f6;
        this.multipleWalletEnabledLeftPostUsageAmount = f7;
        this.type = string5;
        this.paymentInstrumentId = string6;
        this.tenant = tenant;
        this.customer = customer;
        this.name = string7;
        this.code = string8;
        this.iconURL = string9;
        this.description = string10;
        this.username = string11;
        this.password = string12;
        this.savedWallet = string13;
        this.amount = f8;
        this.availableAmount = f11;
        this.priority = n3;
        this.maximumEligibleBurnPercentage = f12;
        this.conversionFactor = n4;
        this.redemptionPriority = n7;
        this.isNew = bl2;
        this.isSelected = bl3;
    }

    public /* synthetic */ SubWallet(String object, String string2, String string3, Long object2, Long l2, Double number, float f5, Float f6, Float f7, String object3, String string4, Tenant object4, Customer serializable, String object5, String string5, String string6, String string7, String string8, String string9, String string10, Float object6, Float f8, Integer number2, float f11, Integer n3, Integer n4, Boolean comparable, Boolean bl2, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        Float f12;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        Customer customer;
        Tenant tenant;
        String string17;
        String string18;
        float f14;
        Double d2;
        String string19;
        String string20;
        String string21;
        int n8 = n7;
        int n10 = n7 & 1;
        if (n10 != 0) {
            n10 = 0;
            string21 = null;
        } else {
            string21 = object;
        }
        int n14 = n8 & 2;
        if (n14 != 0) {
            n14 = 0;
            string20 = null;
        } else {
            string20 = string2;
        }
        int n15 = n8 & 4;
        if (n15 != 0) {
            n15 = 0;
            string19 = null;
        } else {
            string19 = string3;
        }
        int n16 = n8 & 8;
        long l3 = 0L;
        Object object7 = n16 != 0 ? Long.valueOf(l3) : object2;
        int n17 = n8 & 0x10;
        Long l4 = n17 != 0 ? Long.valueOf(l3) : l2;
        int n18 = n8 & 0x20;
        if (n18 != 0) {
            double d5 = 0.0;
            d2 = d5;
        } else {
            d2 = number;
        }
        n17 = n8 & 0x40;
        int n19 = 0;
        String string22 = null;
        if (n17 != 0) {
            n17 = 0;
            f14 = 0.0f;
        } else {
            f14 = f5;
        }
        int n20 = n8 & 0x80;
        Float f15 = n20 != 0 ? Float.valueOf(0.0f) : f6;
        int n21 = n8 & 0x100;
        Float f16 = n21 != 0 ? Float.valueOf(0.0f) : f7;
        int n22 = n8 & 0x200;
        if (n22 != 0) {
            n22 = 0;
            string18 = null;
        } else {
            string18 = object3;
        }
        int n24 = n8 & 0x400;
        if (n24 != 0) {
            n24 = 0;
            string17 = null;
        } else {
            string17 = string4;
        }
        int n25 = n8 & 0x800;
        if (n25 != 0) {
            n25 = 0;
            tenant = null;
        } else {
            tenant = object4;
        }
        int n26 = n8 & 0x1000;
        if (n26 != 0) {
            n26 = 0;
            customer = null;
        } else {
            customer = serializable;
        }
        int n27 = n8 & 0x2000;
        if (n27 != 0) {
            n27 = 0;
            string16 = null;
        } else {
            string16 = object5;
        }
        n19 = n8 & 0x4000;
        if (n19 != 0) {
            n19 = 0;
            string22 = null;
        } else {
            string22 = string5;
        }
        int n28 = n8 & 0x8000;
        if (n28 != 0) {
            n28 = 0;
            string15 = null;
        } else {
            string15 = string6;
        }
        int n29 = n8 & 0x10000;
        if (n29 != 0) {
            n29 = 0;
            string14 = null;
        } else {
            string14 = string7;
        }
        int n30 = n8 & 0x20000;
        if (n30 != 0) {
            n30 = 0;
            string13 = null;
        } else {
            string13 = string8;
        }
        int n32 = n8 & 0x40000;
        if (n32 != 0) {
            n32 = 0;
            string12 = null;
        } else {
            string12 = string9;
        }
        int n34 = n8 & 0x80000;
        if (n34 != 0) {
            n34 = 0;
            string11 = null;
        } else {
            string11 = string10;
        }
        float f17 = 1.469368E-39f;
        int n35 = n8 & 0x100000;
        if (n35 != 0) {
            n35 = 0;
            f17 = 0.0f;
            f12 = Float.valueOf(0.0f);
        } else {
            n35 = 0;
            f17 = 0.0f;
            f12 = object6;
        }
        int n36 = n8 & 0x200000;
        Float f18 = n36 != 0 ? Float.valueOf(0.0f) : f8;
        int n37 = n8 & 0x400000;
        Integer n38 = null;
        Integer n39 = n37 != 0 ? Integer.valueOf(0) : number2;
        int n41 = n8 & 0x800000;
        if (n41 == 0) {
            f17 = f11;
        }
        n41 = n8 & 0x1000000;
        Integer n42 = n41 != 0 ? Integer.valueOf(0) : n3;
        int n43 = n8 & 0x2000000;
        n38 = n43 != 0 ? Integer.valueOf(0) : n4;
        n43 = n8 & 0x4000000;
        Boolean bl3 = n43 != 0 ? Boolean.FALSE : comparable;
        int n44 = 0x8000000;
        Boolean bl4 = (n8 &= n44) != 0 ? Boolean.FALSE : bl2;
        object = this;
        string2 = string21;
        string3 = string20;
        object2 = string19;
        l2 = object7;
        number = l4;
        f7 = f15;
        object3 = f16;
        string4 = string18;
        object4 = string17;
        serializable = tenant;
        object5 = customer;
        string5 = string16;
        string6 = string22;
        string7 = string15;
        string8 = string14;
        string9 = string13;
        string10 = string12;
        object6 = string11;
        f8 = f12;
        number2 = f18;
        n4 = n42;
        comparable = n38;
        bl2 = bl3;
        this(string21, string20, string19, (Long)object7, l4, d2, f14, f15, f16, string18, string17, tenant, customer, string16, string22, string15, string14, string13, string12, string11, f12, f18, n39, f17, n42, n38, bl3, bl4);
    }

    public static /* synthetic */ SubWallet copy$default(SubWallet subWallet, String string2, String string3, String string4, Long l2, Long l3, Double d2, float f5, Float f6, Float f7, String string5, String string6, Tenant tenant, Customer customer, String string7, String string8, String string9, String string10, String string11, String string12, String string13, Float object, Float object2, Integer object3, float f8, Integer object4, Integer object5, Boolean object6, Boolean bl2, int n3, Object object7) {
        SubWallet subWallet2 = subWallet;
        int n4 = n3;
        int n7 = n3 & 1;
        String string14 = n7 != 0 ? subWallet.paymentEngineTransactionId : string2;
        int n8 = n4 & 2;
        String string15 = n8 != 0 ? subWallet2.paymentGatewayTransactionId : string3;
        int n10 = n4 & 4;
        String string16 = n10 != 0 ? subWallet2.transactionStatus : string4;
        int n14 = n4 & 8;
        Long l4 = n14 != 0 ? subWallet2.earn : l2;
        int n15 = n4 & 0x10;
        Long l7 = n15 != 0 ? subWallet2.transactionTime : l3;
        int n16 = n4 & 0x20;
        Double d5 = n16 != 0 ? subWallet2.points : d2;
        int n17 = n4 & 0x40;
        float f11 = n17 != 0 ? subWallet2.leftPostUsage : f5;
        int n18 = n4 & 0x80;
        Float f12 = n18 != 0 ? subWallet2.multipleWalletEnabledAmount : f6;
        int n19 = n4 & 0x100;
        Float f14 = n19 != 0 ? subWallet2.multipleWalletEnabledLeftPostUsageAmount : f7;
        int n20 = n4 & 0x200;
        String string17 = n20 != 0 ? subWallet2.type : string5;
        int n21 = n4 & 0x400;
        String string18 = n21 != 0 ? subWallet2.paymentInstrumentId : string6;
        int n22 = n4 & 0x800;
        Tenant tenant2 = n22 != 0 ? subWallet2.tenant : tenant;
        int n24 = n4 & 0x1000;
        Customer customer2 = n24 != 0 ? subWallet2.customer : customer;
        int n25 = n4 & 0x2000;
        Object object8 = n25 != 0 ? subWallet2.name : string7;
        string7 = object8;
        n25 = n4 & 0x4000;
        object8 = n25 != 0 ? subWallet2.code : string8;
        int n26 = n4 & 0x8000;
        string8 = object8;
        object8 = n26 != 0 ? subWallet2.iconURL : string9;
        n26 = n4 & 0x10000;
        string9 = object8;
        object8 = n26 != 0 ? subWallet2.description : string10;
        n26 = n4 & 0x20000;
        string10 = object8;
        object8 = n26 != 0 ? subWallet2.username : string11;
        n26 = n4 & 0x40000;
        string11 = object8;
        object8 = n26 != 0 ? subWallet2.password : string12;
        n26 = n4 & 0x80000;
        string12 = object8;
        object8 = n26 != 0 ? subWallet2.savedWallet : string13;
        n26 = n4 & 0x100000;
        string13 = object8;
        object8 = n26 != 0 ? subWallet2.amount : object;
        n26 = n4 & 0x200000;
        object = object8;
        object8 = n26 != 0 ? subWallet2.availableAmount : object2;
        n26 = n4 & 0x400000;
        object2 = object8;
        object8 = n26 != 0 ? subWallet2.priority : object3;
        n26 = n4 & 0x800000;
        object3 = object8;
        float f15 = n26 != 0 ? subWallet2.maximumEligibleBurnPercentage : f8;
        n26 = n4 & 0x1000000;
        f8 = f15;
        object8 = n26 != 0 ? subWallet2.conversionFactor : object4;
        n26 = n4 & 0x2000000;
        object4 = object8;
        object8 = n26 != 0 ? subWallet2.redemptionPriority : object5;
        n26 = n4 & 0x4000000;
        object5 = object8;
        object8 = n26 != 0 ? subWallet2.isNew : object6;
        n26 = 0x8000000;
        Boolean bl3 = (n4 &= n26) != 0 ? subWallet2.isSelected : bl2;
        string2 = string14;
        string3 = string15;
        string4 = string16;
        l2 = l4;
        l3 = l7;
        d2 = d5;
        f5 = f11;
        f6 = f12;
        f7 = f14;
        string5 = string17;
        string6 = string18;
        tenant = tenant2;
        customer = customer2;
        object6 = object8;
        bl2 = bl3;
        return subWallet.copy(string14, string15, string16, l4, l7, d5, f11, f12, f14, string17, string18, tenant2, customer2, string7, string8, string9, string10, string11, string12, string13, (Float)object, (Float)object2, (Integer)object3, f8, (Integer)object4, (Integer)object5, (Boolean)object8, bl3);
    }

    public final String component1() {
        return this.paymentEngineTransactionId;
    }

    public final String component10() {
        return this.type;
    }

    public final String component11() {
        return this.paymentInstrumentId;
    }

    public final Tenant component12() {
        return this.tenant;
    }

    public final Customer component13() {
        return this.customer;
    }

    public final String component14() {
        return this.name;
    }

    public final String component15() {
        return this.code;
    }

    public final String component16() {
        return this.iconURL;
    }

    public final String component17() {
        return this.description;
    }

    public final String component18() {
        return this.username;
    }

    public final String component19() {
        return this.password;
    }

    public final String component2() {
        return this.paymentGatewayTransactionId;
    }

    public final String component20() {
        return this.savedWallet;
    }

    public final Float component21() {
        return this.amount;
    }

    public final Float component22() {
        return this.availableAmount;
    }

    public final Integer component23() {
        return this.priority;
    }

    public final float component24() {
        return this.maximumEligibleBurnPercentage;
    }

    public final Integer component25() {
        return this.conversionFactor;
    }

    public final Integer component26() {
        return this.redemptionPriority;
    }

    public final Boolean component27() {
        return this.isNew;
    }

    public final Boolean component28() {
        return this.isSelected;
    }

    public final String component3() {
        return this.transactionStatus;
    }

    public final Long component4() {
        return this.earn;
    }

    public final Long component5() {
        return this.transactionTime;
    }

    public final Double component6() {
        return this.points;
    }

    public final float component7() {
        return this.leftPostUsage;
    }

    public final Float component8() {
        return this.multipleWalletEnabledAmount;
    }

    public final Float component9() {
        return this.multipleWalletEnabledLeftPostUsageAmount;
    }

    public final SubWallet copy(String string2, String string3, String string4, Long l2, Long l3, Double d2, float f5, Float f6, Float f7, String string5, String string6, Tenant tenant, Customer customer, String string7, String string8, String string9, String string10, String string11, String string12, String string13, Float f8, Float f11, Integer n3, float f12, Integer n4, Integer n7, Boolean bl2, Boolean bl3) {
        SubWallet subWallet = new SubWallet(string2, string3, string4, l2, l3, d2, f5, f6, f7, string5, string6, tenant, customer, string7, string8, string9, string10, string11, string12, string13, f8, f11, n3, f12, n4, n7, bl2, bl3);
        return subWallet;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof SubWallet;
        if (n3 == 0) {
            return false;
        }
        object = (SubWallet)object;
        Object object2 = this.paymentEngineTransactionId;
        Object object3 = ((SubWallet)object).paymentEngineTransactionId;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentGatewayTransactionId;
        object3 = ((SubWallet)object).paymentGatewayTransactionId;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.transactionStatus;
        object3 = ((SubWallet)object).transactionStatus;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.earn;
        object3 = ((SubWallet)object).earn;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.transactionTime;
        object3 = ((SubWallet)object).transactionTime;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.points;
        object3 = ((SubWallet)object).points;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        float f5 = this.leftPostUsage;
        float f6 = ((SubWallet)object).leftPostUsage;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        object2 = this.multipleWalletEnabledAmount;
        object3 = ((SubWallet)object).multipleWalletEnabledAmount;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.multipleWalletEnabledLeftPostUsageAmount;
        object3 = ((SubWallet)object).multipleWalletEnabledLeftPostUsageAmount;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.type;
        object3 = ((SubWallet)object).type;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.paymentInstrumentId;
        object3 = ((SubWallet)object).paymentInstrumentId;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.tenant;
        object3 = ((SubWallet)object).tenant;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.customer;
        object3 = ((SubWallet)object).customer;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.name;
        object3 = ((SubWallet)object).name;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.code;
        object3 = ((SubWallet)object).code;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.iconURL;
        object3 = ((SubWallet)object).iconURL;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.description;
        object3 = ((SubWallet)object).description;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.username;
        object3 = ((SubWallet)object).username;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.password;
        object3 = ((SubWallet)object).password;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.savedWallet;
        object3 = ((SubWallet)object).savedWallet;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.amount;
        object3 = ((SubWallet)object).amount;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.availableAmount;
        object3 = ((SubWallet)object).availableAmount;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.priority;
        object3 = ((SubWallet)object).priority;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        f5 = this.maximumEligibleBurnPercentage;
        f6 = ((SubWallet)object).maximumEligibleBurnPercentage;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        object2 = this.conversionFactor;
        object3 = ((SubWallet)object).conversionFactor;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.redemptionPriority;
        object3 = ((SubWallet)object).redemptionPriority;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isNew;
        object3 = ((SubWallet)object).isNew;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.isSelected;
        object = ((SubWallet)object).isSelected;
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

    public final String getCode() {
        return this.code;
    }

    public final Integer getConversionFactor() {
        return this.conversionFactor;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getEarn() {
        return this.earn;
    }

    public final String getIconURL() {
        return this.iconURL;
    }

    public final float getLeftPostUsage() {
        return this.leftPostUsage;
    }

    public final float getMaximumEligibleBurnPercentage() {
        return this.maximumEligibleBurnPercentage;
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

    public final String getPassword() {
        return this.password;
    }

    public final String getPaymentEngineTransactionId() {
        return this.paymentEngineTransactionId;
    }

    public final String getPaymentGatewayTransactionId() {
        return this.paymentGatewayTransactionId;
    }

    public final String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    public final Double getPoints() {
        return this.points;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final Integer getRedemptionPriority() {
        return this.redemptionPriority;
    }

    public final String getSavedWallet() {
        return this.savedWallet;
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

    public int hashCode() {
        float f5;
        int n3;
        int n4;
        String string2 = this.paymentEngineTransactionId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        int n8 = 31;
        n4 *= 31;
        Object object = this.paymentGatewayTransactionId;
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
        object = this.earn;
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
        object = this.points;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        f5 = this.leftPostUsage;
        n4 = UR0.a(f5, n4, n8);
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
        object = this.type;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentId;
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
        object = this.customer;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = ((Customer)object).hashCode();
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
        object = this.code;
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
        object = this.password;
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
        object = this.amount;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.priority;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        f5 = this.maximumEligibleBurnPercentage;
        n4 = UR0.a(f5, n4, n8);
        object = this.conversionFactor;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
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
        object = this.isNew;
        if (object == null) {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        Boolean bl2 = this.isSelected;
        if (bl2 != null) {
            n7 = ((Object)bl2).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isNew() {
        return this.isNew;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final void setAmount(Float f5) {
        this.amount = f5;
    }

    public final void setAvailableAmount(Float f5) {
        this.availableAmount = f5;
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

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setEarn(Long l2) {
        this.earn = l2;
    }

    public final void setIconURL(String string2) {
        this.iconURL = string2;
    }

    public final void setLeftPostUsage(float f5) {
        this.leftPostUsage = f5;
    }

    public final void setMaximumEligibleBurnPercentage(float f5) {
        this.maximumEligibleBurnPercentage = f5;
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

    public final void setNew(Boolean bl2) {
        this.isNew = bl2;
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

    public final void setPaymentInstrumentId(String string2) {
        this.paymentInstrumentId = string2;
    }

    public final void setPoints(Double d2) {
        this.points = d2;
    }

    public final void setPriority(Integer n3) {
        this.priority = n3;
    }

    public final void setRedemptionPriority(Integer n3) {
        this.redemptionPriority = n3;
    }

    public final void setSavedWallet(String string2) {
        this.savedWallet = string2;
    }

    public final void setSelected(Boolean bl2) {
        this.isSelected = bl2;
    }

    public final void setTenant(Tenant tenant) {
        this.tenant = tenant;
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

    public String toString() {
        Serializable serializable = this;
        Object object = this.paymentEngineTransactionId;
        String string2 = this.paymentGatewayTransactionId;
        String string3 = this.transactionStatus;
        Object object2 = this.earn;
        Long l2 = this.transactionTime;
        Double d2 = this.points;
        float f5 = this.leftPostUsage;
        Float f6 = this.multipleWalletEnabledAmount;
        Float f7 = this.multipleWalletEnabledLeftPostUsageAmount;
        String string4 = this.type;
        String string5 = this.paymentInstrumentId;
        Tenant tenant = this.tenant;
        Customer customer = this.customer;
        String string6 = this.name;
        String string7 = this.code;
        String string8 = this.iconURL;
        String string9 = this.description;
        String string10 = this.username;
        String string11 = this.password;
        String string12 = this.savedWallet;
        Float f8 = this.amount;
        Float f11 = this.availableAmount;
        Integer n3 = this.priority;
        float f12 = this.maximumEligibleBurnPercentage;
        Integer n4 = this.conversionFactor;
        Integer n7 = this.redemptionPriority;
        Boolean bl2 = this.isNew;
        Boolean bl3 = this.isSelected;
        serializable = og_1.a("SubWallet(paymentEngineTransactionId=", (String)object, ", paymentGatewayTransactionId=", string2, ", transactionStatus=");
        ((StringBuilder)serializable).append(string3);
        ((StringBuilder)serializable).append(", earn=");
        ((StringBuilder)serializable).append(object2);
        ((StringBuilder)serializable).append(", transactionTime=");
        ((StringBuilder)serializable).append(l2);
        ((StringBuilder)serializable).append(", points=");
        ((StringBuilder)serializable).append(d2);
        ((StringBuilder)serializable).append(", leftPostUsage=");
        ((StringBuilder)serializable).append(f5);
        ((StringBuilder)serializable).append(", multipleWalletEnabledAmount=");
        ((StringBuilder)serializable).append(f6);
        ((StringBuilder)serializable).append(", multipleWalletEnabledLeftPostUsageAmount=");
        ((StringBuilder)serializable).append(f7);
        ((StringBuilder)serializable).append(", type=");
        ((StringBuilder)serializable).append(string4);
        ((StringBuilder)serializable).append(", paymentInstrumentId=");
        ((StringBuilder)serializable).append(string5);
        ((StringBuilder)serializable).append(", tenant=");
        ((StringBuilder)serializable).append(tenant);
        ((StringBuilder)serializable).append(", customer=");
        ((StringBuilder)serializable).append(customer);
        ((StringBuilder)serializable).append(", name=");
        object = string6;
        ((StringBuilder)serializable).append(string6);
        ((StringBuilder)serializable).append(", code=");
        string3 = string7;
        object2 = string8;
        X50.a((StringBuilder)serializable, string7, ", iconURL=", string8, ", description=");
        string3 = string9;
        object2 = string10;
        X50.a((StringBuilder)serializable, string9, ", username=", string10, ", password=");
        string3 = string11;
        object2 = string12;
        X50.a((StringBuilder)serializable, string11, ", savedWallet=", string12, ", amount=");
        object = f8;
        ((StringBuilder)serializable).append(f8);
        ((StringBuilder)serializable).append(", availableAmount=");
        object = f11;
        ((StringBuilder)serializable).append(f11);
        ((StringBuilder)serializable).append(", priority=");
        object = n3;
        ((StringBuilder)serializable).append(n3);
        ((StringBuilder)serializable).append(", maximumEligibleBurnPercentage=");
        ((StringBuilder)serializable).append(f12);
        ((StringBuilder)serializable).append(", conversionFactor=");
        object = n4;
        ((StringBuilder)serializable).append(n4);
        ((StringBuilder)serializable).append(", redemptionPriority=");
        object = n7;
        ((StringBuilder)serializable).append(n7);
        ((StringBuilder)serializable).append(", isNew=");
        object = bl2;
        ((StringBuilder)serializable).append(bl2);
        ((StringBuilder)serializable).append(", isSelected=");
        object = bl3;
        ((StringBuilder)serializable).append(bl3);
        ((StringBuilder)serializable).append(")");
        return ((StringBuilder)serializable).toString();
    }
}

