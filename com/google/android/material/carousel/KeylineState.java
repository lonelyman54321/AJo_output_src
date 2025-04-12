/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState$1;
import com.google.android.material.carousel.KeylineState$Builder;
import com.google.android.material.carousel.KeylineState$Keyline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List keylines;
    private final int lastFocalKeylineIndex;

    private KeylineState(float f5, List list, int n3, int n4) {
        List list2;
        this.itemSize = f5;
        this.keylines = list2 = Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = n3;
        this.lastFocalKeylineIndex = n4;
    }

    public /* synthetic */ KeylineState(float f5, List list, int n3, int n4, KeylineState$1 keylineState$1) {
        this(f5, list, n3, n4);
    }

    public static KeylineState lerp(KeylineState object, KeylineState keylineState, float f5) {
        float f6;
        float f7 = ((KeylineState)object).getItemSize();
        float f8 = f7 - (f6 = keylineState.getItemSize());
        Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object2 == false) {
            int n3;
            List list = ((KeylineState)object).getKeylines();
            List list2 = keylineState.getKeylines();
            int n4 = list.size();
            if (n4 == (n3 = list2.size())) {
                Object object3;
                int n7;
                ArrayList<Object> arrayList = new ArrayList<Object>();
                for (n3 = 0; n3 < (n7 = (object3 = ((KeylineState)object).getKeylines()).size()); ++n3) {
                    object3 = (KeylineState$Keyline)list.get(n3);
                    KeylineState$Keyline keylineState$Keyline = (KeylineState$Keyline)list2.get(n3);
                    object3 = KeylineState$Keyline.lerp((KeylineState$Keyline)object3, keylineState$Keyline, f5);
                    arrayList.add(object3);
                }
                object2 = ((KeylineState)object).getFirstFocalKeylineIndex();
                int n8 = keylineState.getFirstFocalKeylineIndex();
                object2 = AnimationUtils.lerp((int)object2, n8, f5);
                n8 = ((KeylineState)object).getLastFocalKeylineIndex();
                int n10 = keylineState.getLastFocalKeylineIndex();
                n10 = AnimationUtils.lerp(n8, n10, f5);
                float f11 = ((KeylineState)object).getItemSize();
                KeylineState keylineState2 = new KeylineState(f11, arrayList, (int)object2, n10);
                return keylineState2;
            }
            object = new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
            throw object;
        }
        object = new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        throw object;
    }

    public static KeylineState reverse(KeylineState keylineState, float f5) {
        float f6 = keylineState.getItemSize();
        KeylineState$Builder keylineState$Builder = new KeylineState$Builder(f6, f5);
        f6 = keylineState.getLastKeyline().locOffset;
        f5 -= f6;
        f6 = keylineState.getLastKeyline().maskedItemSize;
        float f7 = 2.0f;
        f5 -= (f6 /= f7);
        Object object = keylineState.getKeylines();
        int n3 = object.size();
        int n4 = 1;
        for (int i3 = n3 -= n4; i3 >= 0; i3 += -1) {
            boolean bl2;
            Object object2 = object = keylineState.getKeylines().get(i3);
            object2 = (KeylineState$Keyline)object;
            f6 = ((KeylineState$Keyline)object2).maskedItemSize / f7;
            float f8 = f6 + f5;
            n3 = keylineState.getFirstFocalKeylineIndex();
            if (i3 >= n3 && i3 <= (n3 = keylineState.getLastFocalKeylineIndex())) {
                bl2 = true;
            } else {
                n3 = 0;
                f6 = 0.0f;
                object = null;
                bl2 = false;
            }
            float f11 = ((KeylineState$Keyline)object2).mask;
            float f12 = ((KeylineState$Keyline)object2).maskedItemSize;
            boolean bl3 = ((KeylineState$Keyline)object2).isAnchor;
            object = keylineState$Builder;
            keylineState$Builder.addKeyline(f8, f11, f12, bl2, bl3);
            f6 = ((KeylineState$Keyline)object2).maskedItemSize;
            f5 += f6;
        }
        return keylineState$Builder.build();
    }

    public KeylineState$Keyline getFirstFocalKeyline() {
        List list = this.keylines;
        int n3 = this.firstFocalKeylineIndex;
        return (KeylineState$Keyline)list.get(n3);
    }

    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    public KeylineState$Keyline getFirstKeyline() {
        return (KeylineState$Keyline)this.keylines.get(0);
    }

    public KeylineState$Keyline getFirstNonAnchorKeyline() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.keylines).size()); ++i3) {
            object = (KeylineState$Keyline)this.keylines.get(i3);
            boolean bl2 = ((KeylineState$Keyline)object).isAnchor;
            if (bl2) continue;
            return object;
        }
        return null;
    }

    public List getFocalKeylines() {
        List list = this.keylines;
        int n3 = this.firstFocalKeylineIndex;
        int n4 = this.lastFocalKeylineIndex + 1;
        return list.subList(n3, n4);
    }

    public float getItemSize() {
        return this.itemSize;
    }

    public List getKeylines() {
        return this.keylines;
    }

    public KeylineState$Keyline getLastFocalKeyline() {
        List list = this.keylines;
        int n3 = this.lastFocalKeylineIndex;
        return (KeylineState$Keyline)list.get(n3);
    }

    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    public KeylineState$Keyline getLastKeyline() {
        List list = this.keylines;
        return (KeylineState$Keyline)on_2.d(1, list);
    }

    public KeylineState$Keyline getLastNonAnchorKeyline() {
        List list = this.keylines;
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            KeylineState$Keyline keylineState$Keyline = (KeylineState$Keyline)this.keylines.get(i3);
            boolean bl2 = keylineState$Keyline.isAnchor;
            if (bl2) continue;
            return keylineState$Keyline;
        }
        return null;
    }

    public int getNumberOfNonAnchorKeylines() {
        boolean bl2;
        Iterator iterator = this.keylines.iterator();
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            KeylineState$Keyline keylineState$Keyline = (KeylineState$Keyline)iterator.next();
            bl2 = keylineState$Keyline.isAnchor;
            if (!bl2) continue;
            ++n3;
        }
        return this.keylines.size() - n3;
    }
}

