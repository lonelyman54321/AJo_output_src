/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.permission;

import com.ril.ajio.permission.CartData;
import com.ril.ajio.permission.RatingsData;
import com.ril.ajio.permission.SessionsData;
import com.ril.ajio.permission.WishlistData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PermissionData {
    public static final int $stable = 8;
    private final CartData cart;
    private final boolean masterFlag;
    private final int maxNumberOfNudgesInDDays;
    private final int minGapInDaysToShowNudge;
    private final int noOfSessionsAfterNudgeToBeTriggered;
    private final RatingsData ratings;
    private int resetNudgeDisplayAfterDDays;
    private final SessionsData sessions;
    private final String touchPointList;
    private final WishlistData wishlist;

    public PermissionData() {
        this(false, null, 0, null, null, null, null, 0, 0, 0, 1023, null);
    }

    public PermissionData(boolean bl2, String string2, int n3, WishlistData wishlistData, CartData cartData, SessionsData sessionsData, RatingsData ratingsData, int n4, int n7, int n8) {
        this.masterFlag = bl2;
        this.touchPointList = string2;
        this.noOfSessionsAfterNudgeToBeTriggered = n3;
        this.wishlist = wishlistData;
        this.cart = cartData;
        this.sessions = sessionsData;
        this.ratings = ratingsData;
        this.minGapInDaysToShowNudge = n4;
        this.maxNumberOfNudgesInDDays = n7;
        this.resetNudgeDisplayAfterDDays = n8;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ PermissionData(boolean bl2, String string2, int n3, WishlistData wishlistData, CartData object, SessionsData object2, RatingsData object3, int n4, int n7, int n8, int n10, DefaultConstructorMarker defaultConstructorMarker) {
        void var14_17;
        Object object4;
        Object object5;
        WishlistData wishlistData2;
        String string3;
        int n14 = n10;
        int bl3 = n10 & 1;
        int n15 = 0;
        if (bl3 != 0) {
            boolean bl4 = false;
        } else {
            boolean bl5 = bl2;
        }
        int n16 = n14 & 2;
        Object object6 = null;
        if (n16 != 0) {
            n16 = 0;
            string3 = null;
        } else {
            string3 = string2;
        }
        int n17 = n14 & 4;
        n17 = n17 != 0 ? 0 : n3;
        int n18 = n14 & 8;
        if (n18 != 0) {
            n18 = 0;
            wishlistData2 = null;
        } else {
            wishlistData2 = wishlistData;
        }
        int n19 = n14 & 0x10;
        if (n19 != 0) {
            n19 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n20 = n14 & 0x20;
        if (n20 != 0) {
            n20 = 0;
            object4 = null;
        } else {
            object4 = object2;
        }
        int n21 = n14 & 0x40;
        if (n21 == 0) {
            object6 = object3;
        }
        n21 = n14 & 0x80;
        n21 = n21 != 0 ? 0 : n4;
        int n22 = n14 & 0x100;
        n22 = n22 != 0 ? 0 : n7;
        if ((n14 &= 0x200) == 0) {
            n15 = n8;
        }
        object = wishlistData2;
        object2 = object5;
        object3 = object4;
        n7 = n21;
        n8 = n22;
        n10 = n15;
        this((boolean)var14_17, string3, n17, wishlistData2, (CartData)object5, (SessionsData)object4, (RatingsData)object6, n21, n22, n15);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ PermissionData copy$default(PermissionData permissionData, boolean bl2, String string2, int n3, WishlistData wishlistData, CartData cartData, SessionsData sessionsData, RatingsData ratingsData, int n4, int n7, int n8, int n10, Object object) {
        int n14;
        int n15;
        int n16;
        RatingsData ratingsData2;
        SessionsData sessionsData2;
        CartData cartData2;
        WishlistData wishlistData2;
        int n17;
        String string3;
        void var11_12;
        PermissionData permissionData2 = permissionData;
        int n18 = var11_12;
        int n19 = var11_12 & 1;
        n19 = n19 != 0 ? (int)(permissionData.masterFlag ? 1 : 0) : (int)(bl2 ? 1 : 0);
        int n20 = n18 & 2;
        String string4 = n20 != 0 ? permissionData2.touchPointList : string3;
        int n21 = n18 & 4;
        n21 = n21 != 0 ? permissionData2.noOfSessionsAfterNudgeToBeTriggered : n17;
        int n22 = n18 & 8;
        WishlistData wishlistData3 = n22 != 0 ? permissionData2.wishlist : wishlistData2;
        int n24 = n18 & 0x10;
        CartData cartData3 = n24 != 0 ? permissionData2.cart : cartData2;
        int n25 = n18 & 0x20;
        SessionsData sessionsData3 = n25 != 0 ? permissionData2.sessions : sessionsData2;
        int n26 = n18 & 0x40;
        RatingsData ratingsData3 = n26 != 0 ? permissionData2.ratings : ratingsData2;
        int n27 = n18 & 0x80;
        n27 = n27 != 0 ? permissionData2.minGapInDaysToShowNudge : n16;
        int n28 = n18 & 0x100;
        n28 = n28 != 0 ? permissionData2.maxNumberOfNudgesInDDays : n15;
        n18 = (n18 &= 0x200) != 0 ? permissionData2.resetNudgeDisplayAfterDDays : n14;
        int n29 = n19;
        string3 = string4;
        n17 = n21;
        wishlistData2 = wishlistData3;
        cartData2 = cartData3;
        sessionsData2 = sessionsData3;
        ratingsData2 = ratingsData3;
        n16 = n27;
        n15 = n28;
        n14 = n18;
        return permissionData.copy(n19 != 0, string4, n21, wishlistData3, cartData3, sessionsData3, ratingsData3, n27, n28, n18);
    }

    public final boolean component1() {
        return this.masterFlag;
    }

    public final int component10() {
        return this.resetNudgeDisplayAfterDDays;
    }

    public final String component2() {
        return this.touchPointList;
    }

    public final int component3() {
        return this.noOfSessionsAfterNudgeToBeTriggered;
    }

    public final WishlistData component4() {
        return this.wishlist;
    }

    public final CartData component5() {
        return this.cart;
    }

    public final SessionsData component6() {
        return this.sessions;
    }

    public final RatingsData component7() {
        return this.ratings;
    }

    public final int component8() {
        return this.minGapInDaysToShowNudge;
    }

    public final int component9() {
        return this.maxNumberOfNudgesInDDays;
    }

    public final PermissionData copy(boolean bl2, String string2, int n3, WishlistData wishlistData, CartData cartData, SessionsData sessionsData, RatingsData ratingsData, int n4, int n7, int n8) {
        PermissionData permissionData = new PermissionData(bl2, string2, n3, wishlistData, cartData, sessionsData, ratingsData, n4, n7, n8);
        return permissionData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof PermissionData;
        if (n3 == 0) {
            return false;
        }
        object = (PermissionData)object;
        n3 = this.masterFlag;
        int n4 = ((PermissionData)object).masterFlag;
        if (n3 != n4) {
            return false;
        }
        Object object2 = this.touchPointList;
        Object object3 = ((PermissionData)object).touchPointList;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.noOfSessionsAfterNudgeToBeTriggered;
        n4 = ((PermissionData)object).noOfSessionsAfterNudgeToBeTriggered;
        if (n3 != n4) {
            return false;
        }
        object2 = this.wishlist;
        object3 = ((PermissionData)object).wishlist;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.cart;
        object3 = ((PermissionData)object).cart;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.sessions;
        object3 = ((PermissionData)object).sessions;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.ratings;
        object3 = ((PermissionData)object).ratings;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = this.minGapInDaysToShowNudge;
        n4 = ((PermissionData)object).minGapInDaysToShowNudge;
        if (n3 != n4) {
            return false;
        }
        n3 = this.maxNumberOfNudgesInDDays;
        n4 = ((PermissionData)object).maxNumberOfNudgesInDDays;
        if (n3 != n4) {
            return false;
        }
        n3 = this.resetNudgeDisplayAfterDDays;
        int n7 = ((PermissionData)object).resetNudgeDisplayAfterDDays;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final CartData getCart() {
        return this.cart;
    }

    public final boolean getMasterFlag() {
        return this.masterFlag;
    }

    public final int getMaxNumberOfNudgesInDDays() {
        return this.maxNumberOfNudgesInDDays;
    }

    public final int getMinGapInDaysToShowNudge() {
        return this.minGapInDaysToShowNudge;
    }

    public final int getNoOfSessionsAfterNudgeToBeTriggered() {
        return this.noOfSessionsAfterNudgeToBeTriggered;
    }

    public final RatingsData getRatings() {
        return this.ratings;
    }

    public final int getResetNudgeDisplayAfterDDays() {
        return this.resetNudgeDisplayAfterDDays;
    }

    public final SessionsData getSessions() {
        return this.sessions;
    }

    public final String getTouchPointList() {
        return this.touchPointList;
    }

    public final WishlistData getWishlist() {
        return this.wishlist;
    }

    public int hashCode() {
        int n3;
        int n4 = this.masterFlag;
        n4 = n4 != 0 ? 1231 : 1237;
        n4 *= 31;
        Object object = this.touchPointList;
        int n7 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = this.noOfSessionsAfterNudgeToBeTriggered;
        n4 = (n4 + n3) * 31;
        object = this.wishlist;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((WishlistData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cart;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((CartData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sessions;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((SessionsData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ratings;
        if (object != null) {
            n7 = ((RatingsData)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n3 = this.minGapInDaysToShowNudge;
        n4 = (n4 + n3) * 31;
        n3 = this.maxNumberOfNudgesInDDays;
        n4 = (n4 + n3) * 31;
        n3 = this.resetNudgeDisplayAfterDDays;
        return n4 + n3;
    }

    public final void setResetNudgeDisplayAfterDDays(int n3) {
        this.resetNudgeDisplayAfterDDays = n3;
    }

    public String toString() {
        boolean bl2 = this.masterFlag;
        String string2 = this.touchPointList;
        int n3 = this.noOfSessionsAfterNudgeToBeTriggered;
        WishlistData wishlistData = this.wishlist;
        CartData cartData = this.cart;
        SessionsData sessionsData = this.sessions;
        RatingsData ratingsData = this.ratings;
        int n4 = this.minGapInDaysToShowNudge;
        int n7 = this.maxNumberOfNudgesInDDays;
        int n8 = this.resetNudgeDisplayAfterDDays;
        StringBuilder stringBuilder = new StringBuilder("PermissionData(masterFlag=");
        stringBuilder.append(bl2);
        stringBuilder.append(", touchPointList=");
        stringBuilder.append(string2);
        stringBuilder.append(", noOfSessionsAfterNudgeToBeTriggered=");
        stringBuilder.append(n3);
        stringBuilder.append(", wishlist=");
        stringBuilder.append(wishlistData);
        stringBuilder.append(", cart=");
        stringBuilder.append(cartData);
        stringBuilder.append(", sessions=");
        stringBuilder.append(sessionsData);
        stringBuilder.append(", ratings=");
        stringBuilder.append(ratingsData);
        stringBuilder.append(", minGapInDaysToShowNudge=");
        stringBuilder.append(n4);
        stringBuilder.append(", maxNumberOfNudgesInDDays=");
        stringBuilder.append(n7);
        stringBuilder.append(", resetNudgeDisplayAfterDDays=");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

