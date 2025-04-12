/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

import com.ril.ajio.services.query.QueryFilter;
import com.ril.ajio.services.query.QueryFilter$QueryFilterData;

class QueryFilter$6
implements QueryFilter$QueryFilterData {
    final /* synthetic */ QueryFilter this$0;

    public QueryFilter$6(QueryFilter queryFilter) {
        this.this$0 = queryFilter;
    }

    public String decoded() {
        QueryFilter queryFilter = this.this$0;
        String string2 = QueryFilter.e(queryFilter);
        return QueryFilter.g(queryFilter, string2);
    }

    public String encoded() {
        QueryFilter queryFilter = this.this$0;
        String string2 = QueryFilter.e(queryFilter);
        return QueryFilter.h(queryFilter, string2);
    }

    public boolean isExist() {
        QueryFilter queryFilter = this.this$0;
        String string2 = QueryFilter.e(queryFilter);
        return QueryFilter.i(queryFilter, string2);
    }

    public String value() {
        return QueryFilter.e(this.this$0);
    }
}

