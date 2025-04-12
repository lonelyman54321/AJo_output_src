/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import com.google.android.material.carousel.KeylineState;
import com.google.android.material.carousel.KeylineState$Keyline;
import java.util.ArrayList;
import java.util.List;

final class KeylineState$Builder {
    private static final int NO_INDEX = 255;
    private static final float UNKNOWN_LOC = Float.MIN_VALUE;
    private final float availableSpace;
    private int firstFocalKeylineIndex;
    private final float itemSize;
    private int lastFocalKeylineIndex;
    private float lastKeylineMaskedSize;
    private int latestAnchorKeylineIndex;
    private KeylineState$Keyline tmpFirstFocalKeyline;
    private final List tmpKeylines;
    private KeylineState$Keyline tmpLastFocalKeyline;

    public KeylineState$Builder(float f5, float f6) {
        int n3;
        ArrayList arrayList;
        this.tmpKeylines = arrayList = new ArrayList();
        this.firstFocalKeylineIndex = n3 = -1;
        this.lastFocalKeylineIndex = n3;
        this.lastKeylineMaskedSize = 0.0f;
        this.latestAnchorKeylineIndex = n3;
        this.itemSize = f5;
        this.availableSpace = f6;
    }

    private static float calculateKeylineLocationForItemPosition(float f5, float f6, int n3, int n4) {
        float f7 = (float)n3 * f6;
        return (float)n4 * f6 + (f5 -= f7);
    }

    public KeylineState$Builder addAnchorKeyline(float f5, float f6, float f7) {
        return this.addKeyline(f5, f6, f7, false, true);
    }

    public KeylineState$Builder addKeyline(float f5, float f6, float f7) {
        return this.addKeyline(f5, f6, f7, false);
    }

    public KeylineState$Builder addKeyline(float f5, float f6, float f7, boolean bl2) {
        return this.addKeyline(f5, f6, f7, bl2, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public KeylineState$Builder addKeyline(float var1_1, float var2_2, float var3_3, boolean var4_4, boolean var5_5) {
        var6_6 = var3_3 / 2.0f;
        var7_7 = var1_1 - var6_6;
        var8_8 = this.availableSpace;
        cfr_temp_0 = (var6_6 += var1_1) - var8_8;
        var9_9 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
        if (var9_9 /* !! */  > 0) {
            var7_7 = Math.max(var6_6 - var3_3, var8_8);
            var6_6 = Math.abs(var6_6 - var7_7);
lbl9:
            // 2 sources

            while (true) {
                var10_10 = var6_6;
                break;
            }
        } else {
            var6_6 = 0.0f;
            cfr_temp_1 = var7_7 - 0.0f;
            var11_11 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
            if (var11_11 /* !! */  < 0) {
                var8_8 = var7_7 + var3_3;
                var6_6 = Math.min(var8_8, 0.0f);
                var7_7 -= var6_6;
                var6_6 = Math.abs(var7_7);
                ** continue;
            }
            var10_10 = 0.0f;
        }
        var8_8 = var1_1;
        return this.addKeyline(var1_1, var2_2, var3_3, var4_4, var5_5, var10_10);
    }

    public KeylineState$Builder addKeyline(float f5, float f6, float f7, boolean bl2, boolean bl3, float f8) {
        return this.addKeyline(f5, f6, f7, bl2, bl3, f8, 0.0f, 0.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public KeylineState$Builder addKeyline(float f5, float f6, float f7, boolean bl2, boolean bl3, float f8, float f11, float f12) {
        KeylineState$Keyline keylineState$Keyline;
        KeylineState$Builder keylineState$Builder = this;
        float f14 = 0.0f;
        Object object = null;
        float f15 = f7 - 0.0f;
        Object object2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        if (object2 <= 0) {
            return this;
        }
        int n3 = -1;
        if (bl3) {
            int n4;
            if (bl2) {
                object = new IllegalArgumentException("Anchor keylines cannot be focal.");
                throw object;
            }
            int n7 = this.latestAnchorKeylineIndex;
            if (n7 != n3 && n7 != 0) {
                object = new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                throw object;
            }
            object = keylineState$Builder.tmpKeylines;
            keylineState$Builder.latestAnchorKeylineIndex = n4 = object.size();
        }
        int n8 = 1;
        float f16 = Float.MIN_VALUE;
        object = keylineState$Keyline;
        keylineState$Keyline = new KeylineState$Keyline(f16, f5, f6, f7, bl3, f8, f11, f12);
        if (bl2) {
            int n10;
            int n14;
            object = keylineState$Builder.tmpFirstFocalKeyline;
            if (object == null) {
                int n15;
                keylineState$Builder.tmpFirstFocalKeyline = keylineState$Keyline;
                object = keylineState$Builder.tmpKeylines;
                keylineState$Builder.firstFocalKeylineIndex = n15 = object.size();
            }
            if ((n14 = keylineState$Builder.lastFocalKeylineIndex) != n3) {
                object = keylineState$Builder.tmpKeylines;
                int n16 = object.size();
                n8 = keylineState$Builder.lastFocalKeylineIndex;
                int n17 = n16 - n8;
                n8 = 1;
                f16 = Float.MIN_VALUE;
                if (n17 > n8) {
                    object = new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                    throw object;
                }
            }
            object = keylineState$Builder.tmpFirstFocalKeyline;
            f14 = ((KeylineState$Keyline)object).maskedItemSize;
            float f17 = f7 - f14;
            Object object3 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
            if (object3 != false) {
                object = new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                throw object;
            }
            keylineState$Builder.tmpLastFocalKeyline = keylineState$Keyline;
            object = keylineState$Builder.tmpKeylines;
            keylineState$Builder.lastFocalKeylineIndex = n10 = object.size();
        } else {
            float f18;
            float f19;
            float f20;
            float f22;
            object = keylineState$Builder.tmpFirstFocalKeyline;
            if (object == null && (f22 = (f20 = (f14 = keylineState$Keyline.maskedItemSize) - (f16 = keylineState$Builder.lastKeylineMaskedSize)) == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1)) < 0) {
                object = new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                throw object;
            }
            object = keylineState$Builder.tmpLastFocalKeyline;
            if (object != null && (f19 = (f18 = (f14 = keylineState$Keyline.maskedItemSize) - (f16 = keylineState$Builder.lastKeylineMaskedSize)) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1)) > 0) {
                object = new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                throw object;
            }
        }
        keylineState$Builder.lastKeylineMaskedSize = f14 = keylineState$Keyline.maskedItemSize;
        keylineState$Builder.tmpKeylines.add(keylineState$Keyline);
        return keylineState$Builder;
    }

    public KeylineState$Builder addKeylineRange(float f5, float f6, float f7, int n3) {
        return this.addKeylineRange(f5, f6, f7, n3, false);
    }

    public KeylineState$Builder addKeylineRange(float f5, float f6, float f7, int n3, boolean bl2) {
        float f8;
        float f11;
        if (n3 > 0 && (f11 = (f8 = f7 - 0.0f) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) > 0) {
            for (f11 = 0.0f; f11 < n3; ++f11) {
                float f12 = (float)f11 * f7 + f5;
                this.addKeyline(f12, f6, f7, bl2);
            }
        }
        return this;
    }

    public KeylineState build() {
        Object object = this.tmpFirstFocalKeyline;
        if (object != null) {
            Object object2;
            int n3;
            ArrayList<KeylineState$Keyline> arrayList = new ArrayList<KeylineState$Keyline>();
            object = null;
            for (int i3 = 0; i3 < (n3 = (object2 = this.tmpKeylines).size()); ++i3) {
                object2 = (KeylineState$Keyline)this.tmpKeylines.get(i3);
                float f5 = this.tmpFirstFocalKeyline.locOffset;
                float f6 = this.itemSize;
                int n4 = this.firstFocalKeylineIndex;
                f6 = KeylineState$Builder.calculateKeylineLocationForItemPosition(f5, f6, n4, i3);
                float f7 = ((KeylineState$Keyline)object2).locOffset;
                float f8 = ((KeylineState$Keyline)object2).mask;
                float f11 = ((KeylineState$Keyline)object2).maskedItemSize;
                boolean bl2 = ((KeylineState$Keyline)object2).isAnchor;
                float f12 = ((KeylineState$Keyline)object2).cutoff;
                float f14 = ((KeylineState$Keyline)object2).leftOrTopPaddingShift;
                float f15 = ((KeylineState$Keyline)object2).rightOrBottomPaddingShift;
                KeylineState$Keyline keylineState$Keyline = new KeylineState$Keyline(f6, f7, f8, f11, bl2, f12, f14, f15);
                arrayList.add(keylineState$Keyline);
            }
            float f16 = this.itemSize;
            int n7 = this.firstFocalKeylineIndex;
            int n8 = this.lastFocalKeylineIndex;
            object2 = object;
            object = new KeylineState(f16, arrayList, n7, n8, null);
            return object;
        }
        object = new IllegalStateException("There must be a keyline marked as focal.");
        throw object;
    }
}

