/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.CartDao_Impl;
import com.ril.ajio.data.database.entity.CartEntity;

class CartDao_Impl$1
extends BA0 {
    final /* synthetic */ CartDao_Impl this$0;

    public CartDao_Impl$1(CartDao_Impl cartDao_Impl, FP2 fP2) {
        this.this$0 = cartDao_Impl;
        super(fP2);
    }

    public void bind(bg3_0 bg3_02, CartEntity cartEntity) {
        String string2 = cartEntity.getCode();
        int n3 = 1;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = cartEntity.getCode();
            bg3_02.c0(n3, string2);
        }
        double d2 = cartEntity.getValue();
        bg3_02.r(2, d2);
        long l2 = (long)cartEntity.isDod();
        bg3_02.m0(3, l2);
    }

    public String createQuery() {
        return "INSERT OR REPLACE INTO `CartEntity` (`code`,`value`,`isDod`) VALUES (?,?,?)";
    }
}

