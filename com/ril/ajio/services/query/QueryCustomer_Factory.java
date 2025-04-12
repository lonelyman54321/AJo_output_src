/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.services.query.QueryCustomer_Factory$InstanceHolder;

public final class QueryCustomer_Factory
implements nb2_2 {
    public static QueryCustomer_Factory create() {
        return QueryCustomer_Factory$InstanceHolder.INSTANCE;
    }

    public static QueryCustomer newInstance() {
        QueryCustomer queryCustomer = new QueryCustomer();
        return queryCustomer;
    }

    public QueryCustomer get() {
        return QueryCustomer_Factory.newInstance();
    }
}

