/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.GiftCard;

import com.ril.ajio.services.data.GiftCard.AjioGiftCardModel$Status;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class AjioGiftCardModel
implements Serializable {
    private final double amount;
    private final long cardExpiryDate;
    private final long expiryDate;
    private final AjioGiftCardModel$Status status;

    public AjioGiftCardModel(double d2, long l2, long l3, AjioGiftCardModel$Status ajioGiftCardModel$Status) {
        Intrinsics.checkNotNullParameter(ajioGiftCardModel$Status, "status");
        this.amount = d2;
        this.expiryDate = l2;
        this.cardExpiryDate = l3;
        this.status = ajioGiftCardModel$Status;
    }

    public static /* synthetic */ AjioGiftCardModel copy$default(AjioGiftCardModel ajioGiftCardModel, double d2, long l2, long l3, AjioGiftCardModel$Status ajioGiftCardModel$Status, int n3, Object object) {
        AjioGiftCardModel ajioGiftCardModel2 = ajioGiftCardModel;
        int n4 = n3 & 1;
        double d5 = n4 != 0 ? ajioGiftCardModel.amount : d2;
        int n7 = n3 & 2;
        long l4 = n7 != 0 ? ajioGiftCardModel2.expiryDate : l2;
        int n8 = n3 & 4;
        long l7 = n8 != 0 ? ajioGiftCardModel2.cardExpiryDate : l3;
        int n10 = n3 & 8;
        AjioGiftCardModel$Status ajioGiftCardModel$Status2 = n10 != 0 ? ajioGiftCardModel2.status : ajioGiftCardModel$Status;
        d2 = d5;
        l2 = l4;
        l3 = l7;
        ajioGiftCardModel$Status = ajioGiftCardModel$Status2;
        return ajioGiftCardModel.copy(d5, l4, l7, ajioGiftCardModel$Status2);
    }

    public final double component1() {
        return this.amount;
    }

    public final long component2() {
        return this.expiryDate;
    }

    public final long component3() {
        return this.cardExpiryDate;
    }

    public final AjioGiftCardModel$Status component4() {
        return this.status;
    }

    public final AjioGiftCardModel copy(double d2, long l2, long l3, AjioGiftCardModel$Status ajioGiftCardModel$Status) {
        Intrinsics.checkNotNullParameter(ajioGiftCardModel$Status, "status");
        AjioGiftCardModel ajioGiftCardModel = new AjioGiftCardModel(d2, l2, l3, ajioGiftCardModel$Status);
        return ajioGiftCardModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof AjioGiftCardModel;
        if (n3 == 0) {
            return false;
        }
        object = (AjioGiftCardModel)object;
        double d2 = this.amount;
        double d5 = ((AjioGiftCardModel)object).amount;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        long l2 = this.expiryDate;
        long l3 = ((AjioGiftCardModel)object).expiryDate;
        long l4 = l2 - l3;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 != 0) {
            return false;
        }
        l2 = this.cardExpiryDate;
        l3 = ((AjioGiftCardModel)object).cardExpiryDate;
        long l7 = l2 - l3;
        n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
        if (n3 != 0) {
            return false;
        }
        AjioGiftCardModel$Status ajioGiftCardModel$Status = this.status;
        object = ((AjioGiftCardModel)object).status;
        boolean bl3 = Intrinsics.areEqual(ajioGiftCardModel$Status, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final long getCardExpiryDate() {
        return this.cardExpiryDate;
    }

    public final long getExpiryDate() {
        return this.expiryDate;
    }

    public final AjioGiftCardModel$Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.amount);
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3) * 31;
        l3 = this.expiryDate;
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        l3 = this.cardExpiryDate;
        l4 = l3 >>> n3;
        n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        return this.status.hashCode() + n4;
    }

    public String toString() {
        double d2 = this.amount;
        long l2 = this.expiryDate;
        long l3 = this.cardExpiryDate;
        AjioGiftCardModel$Status ajioGiftCardModel$Status = this.status;
        StringBuilder stringBuilder = new StringBuilder("AjioGiftCardModel(amount=");
        stringBuilder.append(d2);
        stringBuilder.append(", expiryDate=");
        stringBuilder.append(l2);
        fn0_2.b(stringBuilder, ", cardExpiryDate=", l3, ", status=");
        stringBuilder.append(ajioGiftCardModel$Status);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

