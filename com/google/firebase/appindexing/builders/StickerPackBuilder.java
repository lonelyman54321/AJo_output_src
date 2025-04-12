/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.builders.StickerBuilder;

public final class StickerPackBuilder
extends IndexableBuilder {
    public StickerPackBuilder() {
        super("StickerPack");
    }

    public StickerPackBuilder setHasSticker(StickerBuilder ... stickerBuilderArray) {
        this.put("hasSticker", stickerBuilderArray);
        return this;
    }
}

