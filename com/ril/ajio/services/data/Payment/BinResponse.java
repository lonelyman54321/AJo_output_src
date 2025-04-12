/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BinResponse {
    private String binNumber;
    private String cardNetwork;
    private Error error;
    private String iconUrl;
    private String isLRManaged;
    private Boolean lowSuccessRate;
    private String message;

    public BinResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public BinResponse(String string2, String string3, String string4, String string5, Error error, Boolean bl2, String string6) {
        this.cardNetwork = string2;
        this.binNumber = string3;
        this.isLRManaged = string4;
        this.iconUrl = string5;
        this.error = error;
        this.lowSuccessRate = bl2;
        this.message = string6;
    }

    public /* synthetic */ BinResponse(String object, String object2, String string2, String string3, Error object3, Boolean serializable, String object4, int n3, DefaultConstructorMarker object5) {
        String string4;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n7 = n3 & 2;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string6 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            serializable = Boolean.FALSE;
        }
        Boolean bl2 = serializable;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n3 = 0;
            string4 = null;
        } else {
            string4 = object4;
        }
        object = this;
        object2 = object5;
        string2 = object6;
        string3 = string5;
        object3 = string6;
        serializable = object7;
        object4 = bl2;
        this((String)object5, (String)object6, string5, string6, (Error)object7, bl2, string4);
    }

    public static /* synthetic */ BinResponse copy$default(BinResponse binResponse, String string2, String object, String string3, String object2, Error object3, Boolean object4, String object5, int n3, Object object6) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = binResponse.cardNetwork;
        }
        if ((n4 = n3 & 2) != 0) {
            object = binResponse.binNumber;
        }
        object6 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = binResponse.isLRManaged;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = binResponse.iconUrl;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = binResponse.error;
        }
        Error error = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = binResponse.lowSuccessRate;
        }
        Boolean bl2 = object4;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object5 = binResponse.message;
        }
        String string6 = object5;
        object = binResponse;
        string3 = string2;
        object2 = object6;
        object3 = string4;
        object4 = string5;
        object5 = error;
        object6 = string6;
        return binResponse.copy(string2, (String)object2, string4, string5, error, bl2, string6);
    }

    public final String component1() {
        return this.cardNetwork;
    }

    public final String component2() {
        return this.binNumber;
    }

    public final String component3() {
        return this.isLRManaged;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final Error component5() {
        return this.error;
    }

    public final Boolean component6() {
        return this.lowSuccessRate;
    }

    public final String component7() {
        return this.message;
    }

    public final BinResponse copy(String string2, String string3, String string4, String string5, Error error, Boolean bl2, String string6) {
        BinResponse binResponse = new BinResponse(string2, string3, string4, string5, error, bl2, string6);
        return binResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BinResponse;
        if (!bl3) {
            return false;
        }
        object = (BinResponse)object;
        Object object2 = this.cardNetwork;
        Object object3 = ((BinResponse)object).cardNetwork;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.binNumber;
        object3 = ((BinResponse)object).binNumber;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isLRManaged;
        object3 = ((BinResponse)object).isLRManaged;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.iconUrl;
        object3 = ((BinResponse)object).iconUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.error;
        object3 = ((BinResponse)object).error;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.lowSuccessRate;
        object3 = ((BinResponse)object).lowSuccessRate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object = ((BinResponse)object).message;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBinNumber() {
        return this.binNumber;
    }

    public final String getCardNetwork() {
        return this.cardNetwork;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Boolean getLowSuccessRate() {
        return this.lowSuccessRate;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.cardNetwork;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.binNumber;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isLRManaged;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.iconUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
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
        object = this.lowSuccessRate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String isLRManaged() {
        return this.isLRManaged;
    }

    public final void setBinNumber(String string2) {
        this.binNumber = string2;
    }

    public final void setCardNetwork(String string2) {
        this.cardNetwork = string2;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setIconUrl(String string2) {
        this.iconUrl = string2;
    }

    public final void setLRManaged(String string2) {
        this.isLRManaged = string2;
    }

    public final void setLowSuccessRate(Boolean bl2) {
        this.lowSuccessRate = bl2;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public String toString() {
        CharSequence charSequence = this.cardNetwork;
        String string2 = this.binNumber;
        String string3 = this.isLRManaged;
        String string4 = this.iconUrl;
        Error error = this.error;
        Boolean bl2 = this.lowSuccessRate;
        String string5 = this.message;
        charSequence = og_1.a("BinResponse(cardNetwork=", (String)charSequence, ", binNumber=", string2, ", isLRManaged=");
        X50.a((StringBuilder)charSequence, string3, ", iconUrl=", string4, ", error=");
        ((StringBuilder)charSequence).append(error);
        ((StringBuilder)charSequence).append(", lowSuccessRate=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(", message=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

