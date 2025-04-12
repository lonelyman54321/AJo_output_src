/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.PersonBuilder;

public class AudiobookBuilder
extends IndexableBuilder {
    public AudiobookBuilder() {
        super("Audiobook");
    }

    public AudiobookBuilder setAuthor(PersonBuilder ... personBuilderArray) {
        return (AudiobookBuilder)this.put("author", personBuilderArray);
    }

    public AudiobookBuilder setReadBy(PersonBuilder ... personBuilderArray) {
        return (AudiobookBuilder)this.put("readBy", personBuilderArray);
    }
}

