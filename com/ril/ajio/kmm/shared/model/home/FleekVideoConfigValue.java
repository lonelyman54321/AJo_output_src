/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.FleekVideoConfigValue$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class FleekVideoConfigValue {
    public static final FleekVideoConfigValue$Companion Companion;
    private Boolean isAudioMuted;
    private Boolean isAutoPlayVideo;
    private Boolean isPlayInLoop;

    static {
        FleekVideoConfigValue$Companion fleekVideoConfigValue$Companion;
        Companion = fleekVideoConfigValue$Companion = new FleekVideoConfigValue$Companion(null);
    }

    public FleekVideoConfigValue() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ FleekVideoConfigValue(int n3, Boolean bl2, Boolean bl3, Boolean bl4, a03_0 a03_02) {
        Boolean bl5;
        int n4 = n3 & 1;
        if (n4 == 0) {
            bl2 = Boolean.FALSE;
        }
        this.isAutoPlayVideo = bl2;
        int n7 = n3 & 2;
        this.isPlayInLoop = n7 == 0 ? (bl2 = Boolean.TRUE) : bl3;
        this.isAudioMuted = (n3 &= 4) == 0 ? (bl5 = Boolean.FALSE) : bl4;
    }

    public FleekVideoConfigValue(Boolean bl2, Boolean bl3, Boolean bl4) {
        this.isAutoPlayVideo = bl2;
        this.isPlayInLoop = bl3;
        this.isAudioMuted = bl4;
    }

    public /* synthetic */ FleekVideoConfigValue(Boolean bl2, Boolean bl3, Boolean bl4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = Boolean.TRUE;
        }
        if ((n3 &= 4) != 0) {
            bl4 = Boolean.FALSE;
        }
        this(bl2, bl3, bl4);
    }

    public static /* synthetic */ FleekVideoConfigValue copy$default(FleekVideoConfigValue fleekVideoConfigValue, Boolean bl2, Boolean bl3, Boolean bl4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = fleekVideoConfigValue.isAutoPlayVideo;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = fleekVideoConfigValue.isPlayInLoop;
        }
        if ((n3 &= 4) != 0) {
            bl4 = fleekVideoConfigValue.isAudioMuted;
        }
        return fleekVideoConfigValue.copy(bl2, bl3, bl4);
    }

    public static final /* synthetic */ void write$Self$shared_release(FleekVideoConfigValue object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Boolean bl2;
        Object object2;
        int n3 = 0;
        boolean bl3 = u30_02.I(serialDescriptor, 0);
        if (bl3 || !(bl3 = Intrinsics.areEqual(object2 = ((FleekVideoConfigValue)object).isAutoPlayVideo, bl2 = Boolean.FALSE))) {
            object2 = cz_2.a;
            bl2 = ((FleekVideoConfigValue)object).isAutoPlayVideo;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, bl2);
        }
        if ((bl3 = u30_02.I(serialDescriptor, n3 = 1)) || !(bl3 = Intrinsics.areEqual(object2 = ((FleekVideoConfigValue)object).isPlayInLoop, bl2 = Boolean.TRUE))) {
            object2 = cz_2.a;
            bl2 = ((FleekVideoConfigValue)object).isPlayInLoop;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, bl2);
        }
        if ((bl3 = u30_02.I(serialDescriptor, n3 = 2)) || !(bl3 = Intrinsics.areEqual(object2 = ((FleekVideoConfigValue)object).isAudioMuted, bl2 = Boolean.FALSE))) {
            object2 = cz_2.a;
            object = ((FleekVideoConfigValue)object).isAudioMuted;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final Boolean component1() {
        return this.isAutoPlayVideo;
    }

    public final Boolean component2() {
        return this.isPlayInLoop;
    }

    public final Boolean component3() {
        return this.isAudioMuted;
    }

    public final FleekVideoConfigValue copy(Boolean bl2, Boolean bl3, Boolean bl4) {
        FleekVideoConfigValue fleekVideoConfigValue = new FleekVideoConfigValue(bl2, bl3, bl4);
        return fleekVideoConfigValue;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FleekVideoConfigValue;
        if (!bl3) {
            return false;
        }
        object = (FleekVideoConfigValue)object;
        Boolean bl4 = this.isAutoPlayVideo;
        Boolean bl5 = ((FleekVideoConfigValue)object).isAutoPlayVideo;
        bl3 = Intrinsics.areEqual(bl4, bl5);
        if (!bl3) {
            return false;
        }
        bl4 = this.isPlayInLoop;
        bl5 = ((FleekVideoConfigValue)object).isPlayInLoop;
        bl3 = Intrinsics.areEqual(bl4, bl5);
        if (!bl3) {
            return false;
        }
        bl4 = this.isAudioMuted;
        object = ((FleekVideoConfigValue)object).isAudioMuted;
        boolean bl6 = Intrinsics.areEqual(bl4, object);
        if (!bl6) {
            return false;
        }
        return bl2;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.isAutoPlayVideo;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Boolean bl3 = this.isPlayInLoop;
        if (bl3 == null) {
            n3 = 0;
            bl3 = null;
        } else {
            n3 = ((Object)bl3).hashCode();
        }
        n4 = (n4 + n3) * 31;
        bl3 = this.isAudioMuted;
        if (bl3 != null) {
            n7 = ((Object)bl3).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isAudioMuted() {
        return this.isAudioMuted;
    }

    public final Boolean isAutoPlayVideo() {
        return this.isAutoPlayVideo;
    }

    public final Boolean isPlayInLoop() {
        return this.isPlayInLoop;
    }

    public final void setAudioMuted(Boolean bl2) {
        this.isAudioMuted = bl2;
    }

    public final void setAutoPlayVideo(Boolean bl2) {
        this.isAutoPlayVideo = bl2;
    }

    public final void setPlayInLoop(Boolean bl2) {
        this.isPlayInLoop = bl2;
    }

    public String toString() {
        Boolean bl2 = this.isAutoPlayVideo;
        Boolean bl3 = this.isPlayInLoop;
        Boolean bl4 = this.isAudioMuted;
        StringBuilder stringBuilder = new StringBuilder("FleekVideoConfigValue(isAutoPlayVideo=");
        stringBuilder.append(bl2);
        stringBuilder.append(", isPlayInLoop=");
        stringBuilder.append(bl3);
        stringBuilder.append(", isAudioMuted=");
        return nx3_0.a(stringBuilder, bl4, ")");
    }
}

