/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.PersonBuilder;

public class BookBuilder
extends IndexableBuilder {
    public BookBuilder() {
        super("Book");
    }

    public BookBuilder setAuthor(PersonBuilder ... personBuilderArray) {
        return (BookBuilder)this.put("author", personBuilderArray);
    }
}

