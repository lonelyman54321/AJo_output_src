/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.PersonBuilder;
import java.util.Date;

public final class MessageBuilder
extends IndexableBuilder {
    public MessageBuilder() {
        super("Message");
    }

    public MessageBuilder(String string2) {
        super("EmailMessage");
    }

    public MessageBuilder setDateRead(Date object) {
        Preconditions.checkNotNull(object);
        long l2 = ((Date)object).getTime();
        object = new long[1];
        object[0] = l2;
        this.put("dateRead", (long[])object);
        return this;
    }

    public MessageBuilder setDateReceived(Date object) {
        Preconditions.checkNotNull(object);
        long l2 = ((Date)object).getTime();
        object = new long[1];
        object[0] = l2;
        this.put("dateReceived", (long[])object);
        return this;
    }

    public MessageBuilder setDateSent(Date object) {
        Preconditions.checkNotNull(object);
        long l2 = ((Date)object).getTime();
        object = new long[1];
        object[0] = l2;
        this.put("dateSent", (long[])object);
        return this;
    }

    public MessageBuilder setMessageAttachment(IndexableBuilder ... indexableBuilderArray) {
        this.put("messageAttachment", indexableBuilderArray);
        return this;
    }

    public MessageBuilder setRecipient(PersonBuilder ... personBuilderArray) {
        this.put("recipient", personBuilderArray);
        return this;
    }

    public MessageBuilder setSender(PersonBuilder personBuilder) {
        IndexableBuilder[] indexableBuilderArray = new PersonBuilder[]{personBuilder};
        this.put("sender", indexableBuilderArray);
        return this;
    }

    public MessageBuilder setText(String stringArray) {
        stringArray = new String[]{stringArray};
        this.put("text", stringArray);
        return this;
    }
}

