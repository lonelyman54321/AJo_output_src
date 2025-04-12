/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class GiftCard {
    private Boolean isGiftCardLive;
    private boolean isGiftCardLiveSPC;
    private String walletType;

    public GiftCard() {
        this(null, false, null, 7, null);
    }

    public GiftCard(Boolean bl2, boolean bl3, String string2) {
        this.isGiftCardLive = bl2;
        this.isGiftCardLiveSPC = bl3;
        this.walletType = string2;
    }

    public /* synthetic */ GiftCard(Boolean bl2, boolean bl3, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = false;
        }
        if ((n3 &= 4) != 0) {
            string2 = "AJIO Wallet";
        }
        this(bl2, bl3, string2);
    }

    public static /* synthetic */ GiftCard copy$default(GiftCard giftCard, Boolean bl2, boolean bl3, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = giftCard.isGiftCardLive;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = giftCard.isGiftCardLiveSPC;
        }
        if ((n3 &= 4) != 0) {
            string2 = giftCard.walletType;
        }
        return giftCard.copy(bl2, bl3, string2);
    }

    public final Boolean component1() {
        return this.isGiftCardLive;
    }

    public final boolean component2() {
        return this.isGiftCardLiveSPC;
    }

    public final String component3() {
        return this.walletType;
    }

    public final GiftCard copy(Boolean bl2, boolean bl3, String string2) {
        GiftCard giftCard = new GiftCard(bl2, bl3, string2);
        return giftCard;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GiftCard;
        if (!bl3) {
            return false;
        }
        object = (GiftCard)object;
        Object object2 = this.isGiftCardLive;
        Boolean bl4 = ((GiftCard)object).isGiftCardLive;
        bl3 = Intrinsics.areEqual(object2, bl4);
        if (!bl3) {
            return false;
        }
        bl3 = this.isGiftCardLiveSPC;
        boolean bl5 = ((GiftCard)object).isGiftCardLiveSPC;
        if (bl3 != bl5) {
            return false;
        }
        object2 = this.walletType;
        object = ((GiftCard)object).walletType;
        boolean bl6 = Intrinsics.areEqual(object2, object);
        if (!bl6) {
            return false;
        }
        return bl2;
    }

    public final String getWalletType() {
        return this.walletType;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.isGiftCardLive;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        int n7 = this.isGiftCardLiveSPC;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        String string2 = this.walletType;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public final Boolean isGiftCardLive() {
        return this.isGiftCardLive;
    }

    public final boolean isGiftCardLiveSPC() {
        return this.isGiftCardLiveSPC;
    }

    public final void setGiftCardLive(Boolean bl2) {
        this.isGiftCardLive = bl2;
    }

    public final void setGiftCardLiveSPC(boolean bl2) {
        this.isGiftCardLiveSPC = bl2;
    }

    public final void setWalletType(String string2) {
        this.walletType = string2;
    }

    public String toString() {
        Boolean bl2 = this.isGiftCardLive;
        boolean bl3 = this.isGiftCardLiveSPC;
        String string2 = this.walletType;
        StringBuilder stringBuilder = new StringBuilder("GiftCard(isGiftCardLive=");
        stringBuilder.append(bl2);
        stringBuilder.append(", isGiftCardLiveSPC=");
        stringBuilder.append(bl3);
        stringBuilder.append(", walletType=");
        return h30_0.a(stringBuilder, string2, ")");
    }
}

