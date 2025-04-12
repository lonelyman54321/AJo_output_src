/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.LuxeDetails;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Price;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriceValidation
implements Serializable {
    private String bankOfferPk;
    private String cardToken;
    private Error error;
    private String instantDiscountMsg;
    private Boolean isEmiAvailable;
    private Boolean isMobileNumberRegistered;
    private Loyalty loyalty;
    private LuxeDetails luxeDetails;
    private String message;
    private String multipleWalletEnabledAmountMessage;
    private PriceSplitUp priceSplitup;
    private Boolean refreshCart;
    private Price totalSaving;

    public PriceValidation() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public PriceValidation(String string2, PriceSplitUp priceSplitUp, LuxeDetails luxeDetails, Error error, String string3, String string4, Loyalty loyalty, Boolean bl2, String string5, String string6, Boolean bl3, Price price, Boolean bl4) {
        this.cardToken = string2;
        this.priceSplitup = priceSplitUp;
        this.luxeDetails = luxeDetails;
        this.error = error;
        this.message = string3;
        this.bankOfferPk = string4;
        this.loyalty = loyalty;
        this.isMobileNumberRegistered = bl2;
        this.instantDiscountMsg = string5;
        this.multipleWalletEnabledAmountMessage = string6;
        this.refreshCart = bl3;
        this.totalSaving = price;
        this.isEmiAvailable = bl4;
    }

    public /* synthetic */ PriceValidation(String object, PriceSplitUp object2, LuxeDetails serializable, Error serializable2, String object3, String string2, Loyalty object4, Boolean serializable3, String object5, String string3, Boolean object6, Price serializable4, Boolean serializable5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Price price;
        String string4;
        String string5;
        Loyalty loyalty;
        String string6;
        String string7;
        Error error;
        LuxeDetails luxeDetails;
        PriceSplitUp priceSplitUp;
        String string8;
        int n4 = n3;
        int n7 = n3 & 1;
        Boolean bl2 = null;
        if (n7 != 0) {
            n7 = 0;
            string8 = null;
        } else {
            string8 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            priceSplitUp = null;
        } else {
            priceSplitUp = object2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            luxeDetails = null;
        } else {
            luxeDetails = serializable;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            error = null;
        } else {
            error = serializable2;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string7 = null;
        } else {
            string7 = object3;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string6 = null;
        } else {
            string6 = string2;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            loyalty = null;
        } else {
            loyalty = object4;
        }
        int n18 = n4 & 0x80;
        Boolean bl3 = n18 != 0 ? Boolean.FALSE : serializable3;
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string5 = null;
        } else {
            string5 = object5;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        int n21 = n4 & 0x400;
        Object object7 = n21 != 0 ? Boolean.FALSE : object6;
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            price = null;
        } else {
            price = serializable4;
        }
        if ((n4 &= 0x1000) == 0) {
            bl2 = serializable5;
        }
        object = this;
        object2 = string8;
        serializable = priceSplitUp;
        serializable2 = luxeDetails;
        object3 = error;
        string2 = string7;
        object4 = string6;
        serializable3 = loyalty;
        object5 = bl3;
        string3 = string5;
        object6 = string4;
        serializable4 = object7;
        serializable5 = price;
        this(string8, priceSplitUp, luxeDetails, error, string7, string6, loyalty, bl3, string5, string4, (Boolean)object7, price, bl2);
    }

    public static /* synthetic */ PriceValidation copy$default(PriceValidation priceValidation, String string2, PriceSplitUp priceSplitUp, LuxeDetails luxeDetails, Error error, String string3, String string4, Loyalty loyalty, Boolean bl2, String string5, String string6, Boolean bl3, Price price, Boolean bl4, int n3, Object object) {
        PriceValidation priceValidation2 = priceValidation;
        int n4 = n3;
        int n7 = n3 & 1;
        String string7 = n7 != 0 ? priceValidation.cardToken : string2;
        int n8 = n4 & 2;
        PriceSplitUp priceSplitUp2 = n8 != 0 ? priceValidation2.priceSplitup : priceSplitUp;
        int n10 = n4 & 4;
        LuxeDetails luxeDetails2 = n10 != 0 ? priceValidation2.luxeDetails : luxeDetails;
        int n14 = n4 & 8;
        Error error2 = n14 != 0 ? priceValidation2.error : error;
        int n15 = n4 & 0x10;
        String string8 = n15 != 0 ? priceValidation2.message : string3;
        int n16 = n4 & 0x20;
        String string9 = n16 != 0 ? priceValidation2.bankOfferPk : string4;
        int n17 = n4 & 0x40;
        Loyalty loyalty2 = n17 != 0 ? priceValidation2.loyalty : loyalty;
        int n18 = n4 & 0x80;
        Boolean bl5 = n18 != 0 ? priceValidation2.isMobileNumberRegistered : bl2;
        int n19 = n4 & 0x100;
        String string10 = n19 != 0 ? priceValidation2.instantDiscountMsg : string5;
        int n20 = n4 & 0x200;
        String string11 = n20 != 0 ? priceValidation2.multipleWalletEnabledAmountMessage : string6;
        int n21 = n4 & 0x400;
        Boolean bl6 = n21 != 0 ? priceValidation2.refreshCart : bl3;
        int n22 = n4 & 0x800;
        Price price2 = n22 != 0 ? priceValidation2.totalSaving : price;
        Boolean bl7 = (n4 &= 0x1000) != 0 ? priceValidation2.isEmiAvailable : bl4;
        string2 = string7;
        priceSplitUp = priceSplitUp2;
        luxeDetails = luxeDetails2;
        error = error2;
        string3 = string8;
        string4 = string9;
        loyalty = loyalty2;
        bl2 = bl5;
        string5 = string10;
        string6 = string11;
        bl3 = bl6;
        price = price2;
        bl4 = bl7;
        return priceValidation.copy(string7, priceSplitUp2, luxeDetails2, error2, string8, string9, loyalty2, bl5, string10, string11, bl6, price2, bl7);
    }

    public final String component1() {
        return this.cardToken;
    }

    public final String component10() {
        return this.multipleWalletEnabledAmountMessage;
    }

    public final Boolean component11() {
        return this.refreshCart;
    }

    public final Price component12() {
        return this.totalSaving;
    }

    public final Boolean component13() {
        return this.isEmiAvailable;
    }

    public final PriceSplitUp component2() {
        return this.priceSplitup;
    }

    public final LuxeDetails component3() {
        return this.luxeDetails;
    }

    public final Error component4() {
        return this.error;
    }

    public final String component5() {
        return this.message;
    }

    public final String component6() {
        return this.bankOfferPk;
    }

    public final Loyalty component7() {
        return this.loyalty;
    }

    public final Boolean component8() {
        return this.isMobileNumberRegistered;
    }

    public final String component9() {
        return this.instantDiscountMsg;
    }

    public final PriceValidation copy(String string2, PriceSplitUp priceSplitUp, LuxeDetails luxeDetails, Error error, String string3, String string4, Loyalty loyalty, Boolean bl2, String string5, String string6, Boolean bl3, Price price, Boolean bl4) {
        PriceValidation priceValidation = new PriceValidation(string2, priceSplitUp, luxeDetails, error, string3, string4, loyalty, bl2, string5, string6, bl3, price, bl4);
        return priceValidation;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PriceValidation;
        if (!bl3) {
            return false;
        }
        object = (PriceValidation)object;
        Object object2 = this.cardToken;
        Object object3 = ((PriceValidation)object).cardToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceSplitup;
        object3 = ((PriceValidation)object).priceSplitup;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.luxeDetails;
        object3 = ((PriceValidation)object).luxeDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.error;
        object3 = ((PriceValidation)object).error;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((PriceValidation)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bankOfferPk;
        object3 = ((PriceValidation)object).bankOfferPk;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.loyalty;
        object3 = ((PriceValidation)object).loyalty;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isMobileNumberRegistered;
        object3 = ((PriceValidation)object).isMobileNumberRegistered;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.instantDiscountMsg;
        object3 = ((PriceValidation)object).instantDiscountMsg;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.multipleWalletEnabledAmountMessage;
        object3 = ((PriceValidation)object).multipleWalletEnabledAmountMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.refreshCart;
        object3 = ((PriceValidation)object).refreshCart;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalSaving;
        object3 = ((PriceValidation)object).totalSaving;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isEmiAvailable;
        object = ((PriceValidation)object).isEmiAvailable;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBankOfferPk() {
        return this.bankOfferPk;
    }

    public final String getCardToken() {
        return this.cardToken;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getInstantDiscountMsg() {
        return this.instantDiscountMsg;
    }

    public final Loyalty getLoyalty() {
        return this.loyalty;
    }

    public final LuxeDetails getLuxeDetails() {
        return this.luxeDetails;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMultipleWalletEnabledAmountMessage() {
        return this.multipleWalletEnabledAmountMessage;
    }

    public final PriceSplitUp getPriceSplitup() {
        return this.priceSplitup;
    }

    public final Boolean getRefreshCart() {
        return this.refreshCart;
    }

    public final Price getTotalSaving() {
        return this.totalSaving;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.cardToken;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.priceSplitup;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((PriceSplitUp)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.luxeDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((LuxeDetails)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.error;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Error)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bankOfferPk;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.loyalty;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Loyalty)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isMobileNumberRegistered;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.instantDiscountMsg;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.multipleWalletEnabledAmountMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.refreshCart;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalSaving;
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

    public final Boolean isMobileNumberRegistered() {
        return this.isMobileNumberRegistered;
    }

    public final void setBankOfferPk(String string2) {
        this.bankOfferPk = string2;
    }

    public final void setCardToken(String string2) {
        this.cardToken = string2;
    }

    public final void setEmiAvailable(Boolean bl2) {
        this.isEmiAvailable = bl2;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setInstantDiscountMsg(String string2) {
        this.instantDiscountMsg = string2;
    }

    public final void setLoyalty(Loyalty loyalty) {
        this.loyalty = loyalty;
    }

    public final void setLuxeDetails(LuxeDetails luxeDetails) {
        this.luxeDetails = luxeDetails;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setMobileNumberRegistered(Boolean bl2) {
        this.isMobileNumberRegistered = bl2;
    }

    public final void setMultipleWalletEnabledAmountMessage(String string2) {
        this.multipleWalletEnabledAmountMessage = string2;
    }

    public final void setPriceSplitup(PriceSplitUp priceSplitUp) {
        this.priceSplitup = priceSplitUp;
    }

    public final void setRefreshCart(Boolean bl2) {
        this.refreshCart = bl2;
    }

    public final void setTotalSaving(Price price) {
        this.totalSaving = price;
    }

    public String toString() {
        String string2 = this.cardToken;
        PriceSplitUp priceSplitUp = this.priceSplitup;
        LuxeDetails luxeDetails = this.luxeDetails;
        Error error = this.error;
        String string3 = this.message;
        String string4 = this.bankOfferPk;
        Loyalty loyalty = this.loyalty;
        Boolean bl2 = this.isMobileNumberRegistered;
        String string5 = this.instantDiscountMsg;
        String string6 = this.multipleWalletEnabledAmountMessage;
        Boolean bl3 = this.refreshCart;
        Price price = this.totalSaving;
        Boolean bl4 = this.isEmiAvailable;
        StringBuilder stringBuilder = new StringBuilder("PriceValidation(cardToken=");
        stringBuilder.append(string2);
        stringBuilder.append(", priceSplitup=");
        stringBuilder.append(priceSplitUp);
        stringBuilder.append(", luxeDetails=");
        stringBuilder.append(luxeDetails);
        stringBuilder.append(", error=");
        stringBuilder.append(error);
        stringBuilder.append(", message=");
        X50.a(stringBuilder, string3, ", bankOfferPk=", string4, ", loyalty=");
        stringBuilder.append(loyalty);
        stringBuilder.append(", isMobileNumberRegistered=");
        stringBuilder.append(bl2);
        stringBuilder.append(", instantDiscountMsg=");
        X50.a(stringBuilder, string5, ", multipleWalletEnabledAmountMessage=", string6, ", refreshCart=");
        stringBuilder.append(bl3);
        stringBuilder.append(", totalSaving=");
        stringBuilder.append(price);
        stringBuilder.append(", isEmiAvailable=");
        return nx3_0.a(stringBuilder, bl4, ")");
    }
}

