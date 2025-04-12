/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.entity.CartEntity;
import java.util.List;

public interface CartDao {
    public int deleteAll();

    public List insertAllCarts(List var1);

    public long insertCart(CartEntity var1);

    public List loadCarts();

    public int removeProducts(String var1);

    public void removeProducts(String[] var1);
}

