/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.network.api.CartApi;
import java.util.Map;

public final class CartApi$DefaultImpls {
    public static /* synthetic */ g53_0 addToCloset$default(CartApi cartApi, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, boolean bl2, int n3, Object object) {
        if (object == null) {
            boolean bl3;
            int n4 = n3;
            n4 = n3 & 0x100;
            if (n4 != 0) {
                n4 = 1;
                bl3 = true;
            } else {
                bl3 = bl2;
            }
            return cartApi.addToCloset(string2, string3, string4, string5, string6, string7, string8, string9, bl3);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addToCloset");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ Object addToCloset2$default(CartApi cartApi, String string2, String string3, String string4, String string5, String string6, String string7, boolean bl2, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            boolean bl3;
            int n4 = n3 & 0x40;
            if (n4 != 0) {
                n4 = 1;
                bl3 = true;
            } else {
                bl3 = bl2;
            }
            return cartApi.addToCloset2(string2, string3, string4, string5, string6, string7, bl3, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addToCloset2");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ Object handlePanCardVerification$default(CartApi object, String string2, Map map2, String string3, String string4, String string5, f80_0 f80_02, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 0x10) != 0) {
                string5 = "B2C";
            }
            return object.handlePanCardVerification(string2, map2, string3, string4, string5, f80_02);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlePanCardVerification");
        throw object;
    }
}

