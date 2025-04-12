/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.GiftCard;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class AjioGiftCardModel$Status
implements Serializable {
    private final String errorCode;
    private final String messageDescription;
    private final int statusCode;

    public AjioGiftCardModel$Status(int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "messageDescription");
        Intrinsics.checkNotNullParameter(string3, "errorCode");
        this.statusCode = n3;
        this.messageDescription = string2;
        this.errorCode = string3;
    }

    public static /* synthetic */ AjioGiftCardModel$Status copy$default(AjioGiftCardModel$Status ajioGiftCardModel$Status, int n3, String string2, String string3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = ajioGiftCardModel$Status.statusCode;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = ajioGiftCardModel$Status.messageDescription;
        }
        if ((n4 &= 4) != 0) {
            string3 = ajioGiftCardModel$Status.errorCode;
        }
        return ajioGiftCardModel$Status.copy(n3, string2, string3);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.messageDescription;
    }

    public final String component3() {
        return this.errorCode;
    }

    public final AjioGiftCardModel$Status copy(int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "messageDescription");
        Intrinsics.checkNotNullParameter(string3, "errorCode");
        AjioGiftCardModel$Status ajioGiftCardModel$Status = new AjioGiftCardModel$Status(n3, string2, string3);
        return ajioGiftCardModel$Status;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof AjioGiftCardModel$Status;
        if (n3 == 0) {
            return false;
        }
        object = (AjioGiftCardModel$Status)object;
        n3 = this.statusCode;
        int n4 = ((AjioGiftCardModel$Status)object).statusCode;
        if (n3 != n4) {
            return false;
        }
        String string2 = this.messageDescription;
        String string3 = ((AjioGiftCardModel$Status)object).messageDescription;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.errorCode;
        object = ((AjioGiftCardModel$Status)object).errorCode;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getMessageDescription() {
        return this.messageDescription;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int n3 = this.statusCode * 31;
        String string2 = this.messageDescription;
        n3 = zy_2.b(n3, 31, string2);
        return this.errorCode.hashCode() + n3;
    }

    public String toString() {
        int n3 = this.statusCode;
        String string2 = this.messageDescription;
        String string3 = this.errorCode;
        return h30_0.a(Fh3.a(n3, "Status(statusCode=", ", messageDescription=", string2, ", errorCode="), string3, ")");
    }
}

