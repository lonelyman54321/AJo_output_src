/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.StickerPackBuilder;

public final class StickerBuilder
extends IndexableBuilder {
    public StickerBuilder() {
        super("Sticker");
    }

    public StickerBuilder setIsPartOf(StickerPackBuilder stickerPackBuilder) {
        IndexableBuilder[] indexableBuilderArray = new StickerPackBuilder[]{stickerPackBuilder};
        return (StickerBuilder)this.setIsPartOf(indexableBuilderArray);
    }
}

