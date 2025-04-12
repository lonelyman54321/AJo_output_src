/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import java.io.Serializable;

public final class LocationMedia
implements Serializable {
    private final String URL;
    private final String location;
    private String page;
    private String query;
    private final String uid;
    private String urlLink;

    public final String getLocation() {
        return this.location;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getURL() {
        return this.URL;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUrlLink() {
        return this.urlLink;
    }

    public final void setPage(String string2) {
        this.page = string2;
    }

    public final void setQuery(String string2) {
        this.query = string2;
    }

    public final void setUrlLink(String string2) {
        this.urlLink = string2;
    }
}

