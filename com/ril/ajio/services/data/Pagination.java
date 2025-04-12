/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

public final class Pagination {
    private int currentPage;
    private int pageSize;
    private int totalPages;
    private int totalResults;

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final int getTotalResults() {
        return this.totalResults;
    }

    public final void setCurrentPage(int n3) {
        this.currentPage = n3;
    }

    public final void setPageSize(int n3) {
        this.pageSize = n3;
    }

    public final void setTotalPages(int n3) {
        this.totalPages = n3;
    }

    public final void setTotalResults(int n3) {
        this.totalResults = n3;
    }
}

