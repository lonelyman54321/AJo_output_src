/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.ExternalConstants;
import com.ril.ajio.services.query.QueryList$1;
import java.io.Serializable;

public class QueryList
implements Serializable {
    public static final Parcelable.Creator CREATOR;
    private int currentPage;
    private boolean isActive;
    private int pageSize;
    private int totalPages;
    private int totalResults;

    static {
        QueryList$1 queryList$1 = new QueryList$1();
        CREATOR = queryList$1;
    }

    public QueryList() {
        int n3;
        this.pageSize = n3 = ExternalConstants.QUERY_PAGE_SIZE.intValue();
        this.totalPages = 1;
        this.isActive = false;
    }

    public QueryList(Parcel parcel) {
        int n3;
        int n4;
        this.pageSize = n4 = ExternalConstants.QUERY_PAGE_SIZE.intValue();
        this.totalPages = 1;
        this.isActive = false;
        this.currentPage = n4 = parcel.readInt();
        this.pageSize = n4 = parcel.readInt();
        this.totalResults = n4 = parcel.readInt();
        this.totalPages = n3 = parcel.readInt();
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public int getTotalResults() {
        return this.totalResults;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setActive(boolean bl2) {
        this.isActive = bl2;
    }

    public void setCurrentPage(int n3) {
        this.currentPage = n3;
    }

    public void setPageSize(int n3) {
        this.pageSize = n3;
    }

    public void setTotalPages(int n3) {
        this.totalPages = n3;
    }

    public void setTotalResults(int n3) {
        this.totalResults = n3;
    }
}

