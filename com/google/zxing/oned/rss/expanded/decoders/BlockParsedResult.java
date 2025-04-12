/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.oned.rss.expanded.decoders.DecodedInformation;

final class BlockParsedResult {
    private final DecodedInformation decodedInformation;
    private final boolean finished;

    public BlockParsedResult(DecodedInformation decodedInformation, boolean bl2) {
        this.finished = bl2;
        this.decodedInformation = decodedInformation;
    }

    public BlockParsedResult(boolean bl2) {
        this(null, bl2);
    }

    public DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    public boolean isFinished() {
        return this.finished;
    }
}

