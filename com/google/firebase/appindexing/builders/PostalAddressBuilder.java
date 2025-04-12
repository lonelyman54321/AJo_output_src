/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;

public final class PostalAddressBuilder
extends IndexableBuilder {
    public PostalAddressBuilder() {
        super("PostalAddress");
    }

    public PostalAddressBuilder setAddressCountry(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("addressCountry", stringArray);
        return this;
    }

    public PostalAddressBuilder setAddressLocality(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("addressLocality", stringArray);
        return this;
    }

    public PostalAddressBuilder setPostalCode(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("postalCode", stringArray);
        return this;
    }

    public PostalAddressBuilder setStreetAddress(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("streetAddress", stringArray);
        return this;
    }
}

