/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.StoriesProgressValue$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class StoriesProgressValue {
    public static final StoriesProgressValue$Companion Companion;
    private Long storyGifDuration;
    private Long storyImgDuration;

    static {
        StoriesProgressValue$Companion storiesProgressValue$Companion;
        Companion = storiesProgressValue$Companion = new StoriesProgressValue$Companion(null);
    }

    public StoriesProgressValue() {
        this(null, null, 3, null);
    }

    public /* synthetic */ StoriesProgressValue(int n3, Long l2, Long l3, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.storyImgDuration = n4 == 0 ? null : l2;
        this.storyGifDuration = (n3 &= 2) == 0 ? null : l3;
    }

    public StoriesProgressValue(Long l2, Long l3) {
        this.storyImgDuration = l2;
        this.storyGifDuration = l3;
    }

    public /* synthetic */ StoriesProgressValue(Long l2, Long l3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            l2 = null;
        }
        if ((n3 &= 2) != 0) {
            l3 = null;
        }
        this(l2, l3);
    }

    public static /* synthetic */ StoriesProgressValue copy$default(StoriesProgressValue storiesProgressValue, Long l2, Long l3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            l2 = storiesProgressValue.storyImgDuration;
        }
        if ((n3 &= 2) != 0) {
            l3 = storiesProgressValue.storyGifDuration;
        }
        return storiesProgressValue.copy(l2, l3);
    }

    public static final /* synthetic */ void write$Self$shared_release(StoriesProgressValue object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((StoriesProgressValue)object).storyImgDuration) != null) {
            object2 = mb1_2.a;
            Long l2 = ((StoriesProgressValue)object).storyImgDuration;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, l2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object2 = ((StoriesProgressValue)object).storyGifDuration) != null) {
            object2 = mb1_2.a;
            object = ((StoriesProgressValue)object).storyGifDuration;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final Long component1() {
        return this.storyImgDuration;
    }

    public final Long component2() {
        return this.storyGifDuration;
    }

    public final StoriesProgressValue copy(Long l2, Long l3) {
        StoriesProgressValue storiesProgressValue = new StoriesProgressValue(l2, l3);
        return storiesProgressValue;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof StoriesProgressValue;
        if (!bl3) {
            return false;
        }
        object = (StoriesProgressValue)object;
        Long l2 = this.storyImgDuration;
        Long l3 = ((StoriesProgressValue)object).storyImgDuration;
        bl3 = Intrinsics.areEqual(l2, l3);
        if (!bl3) {
            return false;
        }
        l2 = this.storyGifDuration;
        object = ((StoriesProgressValue)object).storyGifDuration;
        boolean bl4 = Intrinsics.areEqual(l2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Long getStoryGifDuration() {
        return this.storyGifDuration;
    }

    public final Long getStoryImgDuration() {
        return this.storyImgDuration;
    }

    public int hashCode() {
        int n3;
        Long l2 = this.storyImgDuration;
        int n4 = 0;
        if (l2 == null) {
            n3 = 0;
            l2 = null;
        } else {
            n3 = ((Object)l2).hashCode();
        }
        n3 *= 31;
        Long l3 = this.storyGifDuration;
        if (l3 != null) {
            n4 = ((Object)l3).hashCode();
        }
        return n3 + n4;
    }

    public final void setStoryGifDuration(Long l2) {
        this.storyGifDuration = l2;
    }

    public final void setStoryImgDuration(Long l2) {
        this.storyImgDuration = l2;
    }

    public String toString() {
        Long l2 = this.storyImgDuration;
        Long l3 = this.storyGifDuration;
        StringBuilder stringBuilder = new StringBuilder("StoriesProgressValue(storyImgDuration=");
        stringBuilder.append(l2);
        stringBuilder.append(", storyGifDuration=");
        stringBuilder.append(l3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

