/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import kotlin.jvm.internal.Intrinsics;

public final class SearchEntry {
    public static final int $stable;
    private final String code;
    private final String imgUrl;
    private final boolean isAutoSuggested;
    private final String query;
    private final String searchText;
    private final String storeType;
    private final long time;

    public SearchEntry(String string2, String string3, String string4, boolean bl2, long l2, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "searchText");
        Intrinsics.checkNotNullParameter(string5, "storeType");
        this.searchText = string2;
        this.code = string3;
        this.query = string4;
        this.isAutoSuggested = bl2;
        this.time = l2;
        this.storeType = string5;
        this.imgUrl = string6;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getSearchText() {
        return this.searchText;
    }

    public final String getStoreType() {
        return this.storeType;
    }

    public final long getTime() {
        return this.time;
    }

    public final boolean isAutoSuggested() {
        return this.isAutoSuggested;
    }
}

