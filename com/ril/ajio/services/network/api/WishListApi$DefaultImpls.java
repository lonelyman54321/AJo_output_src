/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.network.api.WishListApi;

public final class WishListApi$DefaultImpls {
    public static /* synthetic */ Object addToCloset$default(WishListApi wishListApi, String string2, String string3, String string4, String string5, String string6, String string7, String string8, boolean bl2, String string9, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            boolean bl3;
            int n4 = n3;
            n4 = n3 & 0x80;
            if (n4 != 0) {
                n4 = 1;
                bl3 = true;
            } else {
                bl3 = bl2;
            }
            return wishListApi.addToCloset(string2, string3, string4, string5, string6, string7, string8, bl3, string9, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addToCloset");
        throw unsupportedOperationException;
    }
}

