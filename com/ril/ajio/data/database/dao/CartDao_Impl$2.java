/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.CartDao_Impl;

class CartDao_Impl$2
extends n23 {
    final /* synthetic */ CartDao_Impl this$0;

    public CartDao_Impl$2(CartDao_Impl cartDao_Impl, FP2 fP2) {
        this.this$0 = cartDao_Impl;
        super(fP2);
    }

    public String createQuery() {
        return "DELETE FROM CartEntity";
    }
}

