/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.AudioSettings$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class AudioSettings {
    public static final AudioSettings$Companion Companion;
    private final Boolean muteOnFullScreen;
    private final Boolean muteOnMinimizedScreen;

    static {
        AudioSettings$Companion audioSettings$Companion;
        Companion = audioSettings$Companion = new AudioSettings$Companion(null);
    }

    public AudioSettings() {
        this(null, null, 3, null);
    }

    public /* synthetic */ AudioSettings(int n3, Boolean bl2, Boolean bl3, a03_0 a03_02) {
        int n4 = n3 & 1;
        this.muteOnFullScreen = n4 == 0 ? null : bl2;
        this.muteOnMinimizedScreen = (n3 &= 2) == 0 ? null : bl3;
    }

    public AudioSettings(Boolean bl2, Boolean bl3) {
        this.muteOnFullScreen = bl2;
        this.muteOnMinimizedScreen = bl3;
    }

    public /* synthetic */ AudioSettings(Boolean bl2, Boolean bl3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n3 &= 2) != 0) {
            bl3 = null;
        }
        this(bl2, bl3);
    }

    public static /* synthetic */ AudioSettings copy$default(AudioSettings audioSettings, Boolean bl2, Boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = audioSettings.muteOnFullScreen;
        }
        if ((n3 &= 2) != 0) {
            bl3 = audioSettings.muteOnMinimizedScreen;
        }
        return audioSettings.copy(bl2, bl3);
    }

    public static final /* synthetic */ void write$Self$shared_release(AudioSettings object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((AudioSettings)object).muteOnFullScreen) != null) {
            object2 = cz_2.a;
            Boolean bl3 = ((AudioSettings)object).muteOnFullScreen;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, bl3);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object2 = ((AudioSettings)object).muteOnMinimizedScreen) != null) {
            object2 = cz_2.a;
            object = ((AudioSettings)object).muteOnMinimizedScreen;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final Boolean component1() {
        return this.muteOnFullScreen;
    }

    public final Boolean component2() {
        return this.muteOnMinimizedScreen;
    }

    public final AudioSettings copy(Boolean bl2, Boolean bl3) {
        AudioSettings audioSettings = new AudioSettings(bl2, bl3);
        return audioSettings;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AudioSettings;
        if (!bl3) {
            return false;
        }
        object = (AudioSettings)object;
        Boolean bl4 = this.muteOnFullScreen;
        Boolean bl5 = ((AudioSettings)object).muteOnFullScreen;
        bl3 = Intrinsics.areEqual(bl4, bl5);
        if (!bl3) {
            return false;
        }
        bl4 = this.muteOnMinimizedScreen;
        object = ((AudioSettings)object).muteOnMinimizedScreen;
        boolean bl6 = Intrinsics.areEqual(bl4, object);
        if (!bl6) {
            return false;
        }
        return bl2;
    }

    public final Boolean getMuteOnFullScreen() {
        return this.muteOnFullScreen;
    }

    public final Boolean getMuteOnMinimizedScreen() {
        return this.muteOnMinimizedScreen;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.muteOnFullScreen;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        Boolean bl3 = this.muteOnMinimizedScreen;
        if (bl3 != null) {
            n4 = ((Object)bl3).hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        Boolean bl2 = this.muteOnFullScreen;
        Boolean bl3 = this.muteOnMinimizedScreen;
        StringBuilder stringBuilder = new StringBuilder("AudioSettings(muteOnFullScreen=");
        stringBuilder.append(bl2);
        stringBuilder.append(", muteOnMinimizedScreen=");
        stringBuilder.append(bl3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

