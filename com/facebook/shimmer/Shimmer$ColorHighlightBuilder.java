/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.TypedArray
 */
package com.facebook.shimmer;

import android.content.res.TypedArray;
import com.facebook.shimmer.R$styleable;
import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.Shimmer$Builder;

public class Shimmer$ColorHighlightBuilder
extends Shimmer$Builder {
    public Shimmer$ColorHighlightBuilder() {
        this.mShimmer.alphaShimmer = false;
    }

    public Shimmer$ColorHighlightBuilder consumeAttributes(TypedArray typedArray) {
        int n3;
        Shimmer shimmer;
        super.consumeAttributes(typedArray);
        int n4 = R$styleable.ShimmerFrameLayout_shimmer_base_color;
        n4 = (int)(typedArray.hasValue(n4) ? 1 : 0);
        if (n4 != 0) {
            n4 = R$styleable.ShimmerFrameLayout_shimmer_base_color;
            shimmer = this.mShimmer;
            n3 = shimmer.baseColor;
            n4 = typedArray.getColor(n4, n3);
            this.setBaseColor(n4);
        }
        n4 = R$styleable.ShimmerFrameLayout_shimmer_highlight_color;
        if ((n4 = (int)(typedArray.hasValue(n4) ? 1 : 0)) != 0) {
            n4 = R$styleable.ShimmerFrameLayout_shimmer_highlight_color;
            shimmer = this.mShimmer;
            n3 = shimmer.highlightColor;
            int n7 = typedArray.getColor(n4, n3);
            this.setHighlightColor(n7);
        }
        return this.getThis();
    }

    public Shimmer$ColorHighlightBuilder getThis() {
        return this;
    }

    public Shimmer$ColorHighlightBuilder setBaseColor(int n3) {
        Shimmer shimmer = this.mShimmer;
        int n4 = shimmer.baseColor & 0xFF000000;
        shimmer.baseColor = n3 = n3 & 0xFFFFFF | n4;
        return this.getThis();
    }

    public Shimmer$ColorHighlightBuilder setHighlightColor(int n3) {
        this.mShimmer.highlightColor = n3;
        return this.getThis();
    }
}

