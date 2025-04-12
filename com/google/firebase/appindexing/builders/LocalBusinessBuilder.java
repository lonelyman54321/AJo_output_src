/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.AggregateRatingBuilder;
import com.google.firebase.appindexing.builders.GeoShapeBuilder;
import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.PostalAddressBuilder;

public final class LocalBusinessBuilder
extends IndexableBuilder {
    public LocalBusinessBuilder() {
        super("LocalBusiness");
    }

    public LocalBusinessBuilder(String string2) {
        super("Restaurant");
    }

    public LocalBusinessBuilder setAddress(PostalAddressBuilder postalAddressBuilder) {
        IndexableBuilder[] indexableBuilderArray = new PostalAddressBuilder[]{postalAddressBuilder};
        this.put("address", indexableBuilderArray);
        return this;
    }

    public LocalBusinessBuilder setAggregateRating(AggregateRatingBuilder aggregateRatingBuilder) {
        IndexableBuilder[] indexableBuilderArray = new AggregateRatingBuilder[]{aggregateRatingBuilder};
        this.put("aggregateRating", indexableBuilderArray);
        return this;
    }

    public LocalBusinessBuilder setGeo(GeoShapeBuilder geoShapeBuilder) {
        IndexableBuilder[] indexableBuilderArray = new GeoShapeBuilder[]{geoShapeBuilder};
        this.put("geo", indexableBuilderArray);
        return this;
    }

    public LocalBusinessBuilder setPriceRange(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("priceRange", stringArray);
        return this;
    }

    public LocalBusinessBuilder setTelephone(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("telephone", stringArray);
        return this;
    }
}

