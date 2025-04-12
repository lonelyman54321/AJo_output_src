/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import java.io.Serializable;
import java.util.List;

public final class Selected
implements Serializable {
    private String code;
    private String url;
    private List variantOptionQualifiers;

    public final String getCode() {
        return this.code;
    }

    public final String getUrl() {
        return this.url;
    }

    public final List getVariantOptionQualifiers() {
        return this.variantOptionQualifiers;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public final void setVariantOptionQualifiers(List list) {
        this.variantOptionQualifiers = list;
    }
}

