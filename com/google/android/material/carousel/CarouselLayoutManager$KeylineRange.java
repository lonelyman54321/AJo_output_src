/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import com.google.android.material.carousel.KeylineState$Keyline;

class CarouselLayoutManager$KeylineRange {
    final KeylineState$Keyline leftOrTop;
    final KeylineState$Keyline rightOrBottom;

    public CarouselLayoutManager$KeylineRange(KeylineState$Keyline object, KeylineState$Keyline keylineState$Keyline) {
        float f5 = ((KeylineState$Keyline)object).loc;
        float f6 = keylineState$Keyline.loc;
        float f7 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (f7 <= 0) {
            this.leftOrTop = object;
            this.rightOrBottom = keylineState$Keyline;
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }
}

