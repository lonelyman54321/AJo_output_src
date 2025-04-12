/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.LocalBusinessBuilder;
import java.util.Date;

public final class ReservationBuilder
extends IndexableBuilder {
    public ReservationBuilder() {
        super("Reservation");
    }

    public ReservationBuilder setPartySize(long l2) {
        long[] lArray = new long[]{l2};
        this.put("partySize", lArray);
        return this;
    }

    public ReservationBuilder setReservationFor(LocalBusinessBuilder localBusinessBuilder) {
        IndexableBuilder[] indexableBuilderArray = new LocalBusinessBuilder[]{localBusinessBuilder};
        this.put("reservationFor", indexableBuilderArray);
        return this;
    }

    public ReservationBuilder setStartDate(Date object) {
        Preconditions.checkNotNull(object);
        long l2 = ((Date)object).getTime();
        object = new long[1];
        object[0] = l2;
        this.put("startDate", (long[])object);
        return this;
    }
}

