/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.PriceValidation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Card {
    private String cardNumber;
    private String cardToken;
    private String cvv;
    private String expiryMonth;
    private String expiryYear;
    private String nameOnCard;
    private String paymentInstrumentId;
    private PriceValidation priceValidation;
    private Boolean saveCard;
    private boolean tokenizationRequired;

    public Card() {
        this(null, null, null, null, null, null, null, null, null, false, 1023, null);
    }

    public Card(String string2, String string3, String string4, String string5, String string6, String string7, Boolean bl2, String string8, PriceValidation priceValidation, boolean bl3) {
        this.nameOnCard = string2;
        this.cardNumber = string3;
        this.expiryYear = string4;
        this.expiryMonth = string5;
        this.cvv = string6;
        this.cardToken = string7;
        this.saveCard = bl2;
        this.paymentInstrumentId = string8;
        this.priceValidation = priceValidation;
        this.tokenizationRequired = bl3;
    }

    public /* synthetic */ Card(String object, String string2, String string3, String string4, String string5, String string6, Boolean object2, String object3, PriceValidation object4, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        int n4 = n3;
        int n7 = n3 & 1;
        PriceValidation priceValidation = null;
        if (n7 != 0) {
            n7 = 0;
            string13 = null;
        } else {
            string13 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string12 = null;
        } else {
            string12 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string11 = null;
        } else {
            string11 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string10 = null;
        } else {
            string10 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string9 = null;
        } else {
            string9 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string8 = null;
        } else {
            string8 = string6;
        }
        int n17 = n4 & 0x40;
        Object object5 = n17 != 0 ? Boolean.FALSE : object2;
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string7 = null;
        } else {
            string7 = object3;
        }
        int n19 = n4 & 0x100;
        if (n19 == 0) {
            priceValidation = object4;
        }
        n4 = (n4 &= 0x200) != 0 ? 0 : (int)(bl2 ? 1 : 0);
        object = this;
        string2 = string13;
        string3 = string12;
        string4 = string11;
        string5 = string10;
        string6 = string9;
        object2 = string8;
        object3 = object5;
        object4 = string7;
        n3 = n4;
        this(string13, string12, string11, string10, string9, string8, (Boolean)object5, string7, priceValidation, n4 != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ Card copy$default(Card card, String string2, String string3, String string4, String string5, String string6, String string7, Boolean bl2, String string8, PriceValidation priceValidation, boolean bl3, int n3, Object object) {
        void var11_12;
        Card card2 = card;
        int bl4 = var11_12;
        int n4 = var11_12 & 1;
        String string9 = n4 != 0 ? card.nameOnCard : string2;
        int n7 = bl4 & 2;
        String string10 = n7 != 0 ? card2.cardNumber : string3;
        int n8 = bl4 & 4;
        String string11 = n8 != 0 ? card2.expiryYear : string4;
        int n10 = bl4 & 8;
        String string12 = n10 != 0 ? card2.expiryMonth : string5;
        int n14 = bl4 & 0x10;
        String string13 = n14 != 0 ? card2.cvv : string6;
        int n15 = bl4 & 0x20;
        String string14 = n15 != 0 ? card2.cardToken : string7;
        int n16 = bl4 & 0x40;
        Boolean bl5 = n16 != 0 ? card2.saveCard : bl2;
        int n17 = bl4 & 0x80;
        String string15 = n17 != 0 ? card2.paymentInstrumentId : string8;
        int n18 = bl4 & 0x100;
        PriceValidation priceValidation2 = n18 != 0 ? card2.priceValidation : priceValidation;
        bl4 = (bl4 &= 0x200) ? (int)card2.tokenizationRequired : (int)bl3;
        string2 = string9;
        string3 = string10;
        string4 = string11;
        string5 = string12;
        string6 = string13;
        string7 = string14;
        bl2 = bl5;
        string8 = string15;
        priceValidation = priceValidation2;
        int bl6 = bl4;
        return card.copy(string9, string10, string11, string12, string13, string14, bl5, string15, priceValidation2, (boolean)bl4);
    }

    public final String component1() {
        return this.nameOnCard;
    }

    public final boolean component10() {
        return this.tokenizationRequired;
    }

    public final String component2() {
        return this.cardNumber;
    }

    public final String component3() {
        return this.expiryYear;
    }

    public final String component4() {
        return this.expiryMonth;
    }

    public final String component5() {
        return this.cvv;
    }

    public final String component6() {
        return this.cardToken;
    }

    public final Boolean component7() {
        return this.saveCard;
    }

    public final String component8() {
        return this.paymentInstrumentId;
    }

    public final PriceValidation component9() {
        return this.priceValidation;
    }

    public final Card copy(String string2, String string3, String string4, String string5, String string6, String string7, Boolean bl2, String string8, PriceValidation priceValidation, boolean bl3) {
        Card card = new Card(string2, string3, string4, string5, string6, string7, bl2, string8, priceValidation, bl3);
        return card;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Card;
        if (!bl3) {
            return false;
        }
        object = (Card)object;
        Object object2 = this.nameOnCard;
        Object object3 = ((Card)object).nameOnCard;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cardNumber;
        object3 = ((Card)object).cardNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.expiryYear;
        object3 = ((Card)object).expiryYear;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.expiryMonth;
        object3 = ((Card)object).expiryMonth;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cvv;
        object3 = ((Card)object).cvv;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cardToken;
        object3 = ((Card)object).cardToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.saveCard;
        object3 = ((Card)object).saveCard;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentInstrumentId;
        object3 = ((Card)object).paymentInstrumentId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priceValidation;
        object3 = ((Card)object).priceValidation;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.tokenizationRequired;
        boolean bl4 = ((Card)object).tokenizationRequired;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCardToken() {
        return this.cardToken;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getNameOnCard() {
        return this.nameOnCard;
    }

    public final String getPaymentInstrumentId() {
        return this.paymentInstrumentId;
    }

    public final PriceValidation getPriceValidation() {
        return this.priceValidation;
    }

    public final Boolean getSaveCard() {
        return this.saveCard;
    }

    public final boolean getTokenizationRequired() {
        return this.tokenizationRequired;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.nameOnCard;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.cardNumber;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.expiryYear;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.expiryMonth;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cvv;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cardToken;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.saveCard;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paymentInstrumentId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priceValidation;
        if (object != null) {
            n7 = ((PriceValidation)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.tokenizationRequired ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final void setCardNumber(String string2) {
        this.cardNumber = string2;
    }

    public final void setCardToken(String string2) {
        this.cardToken = string2;
    }

    public final void setCvv(String string2) {
        this.cvv = string2;
    }

    public final void setExpiryMonth(String string2) {
        this.expiryMonth = string2;
    }

    public final void setExpiryYear(String string2) {
        this.expiryYear = string2;
    }

    public final void setNameOnCard(String string2) {
        this.nameOnCard = string2;
    }

    public final void setPaymentInstrumentId(String string2) {
        this.paymentInstrumentId = string2;
    }

    public final void setPriceValidation(PriceValidation priceValidation) {
        this.priceValidation = priceValidation;
    }

    public final void setSaveCard(Boolean bl2) {
        this.saveCard = bl2;
    }

    public final void setTokenizationRequired(boolean bl2) {
        this.tokenizationRequired = bl2;
    }

    public String toString() {
        CharSequence charSequence = this.nameOnCard;
        String string2 = this.cardNumber;
        String string3 = this.expiryYear;
        String string4 = this.expiryMonth;
        String string5 = this.cvv;
        String string6 = this.cardToken;
        Boolean bl2 = this.saveCard;
        String string7 = this.paymentInstrumentId;
        PriceValidation priceValidation = this.priceValidation;
        boolean bl3 = this.tokenizationRequired;
        charSequence = og_1.a("Card(nameOnCard=", (String)charSequence, ", cardNumber=", string2, ", expiryYear=");
        X50.a((StringBuilder)charSequence, string3, ", expiryMonth=", string4, ", cvv=");
        X50.a((StringBuilder)charSequence, string5, ", cardToken=", string6, ", saveCard=");
        xi0_2.a(bl2, ", paymentInstrumentId=", string7, ", priceValidation=", (StringBuilder)charSequence);
        ((StringBuilder)charSequence).append(priceValidation);
        ((StringBuilder)charSequence).append(", tokenizationRequired=");
        ((StringBuilder)charSequence).append(bl3);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

