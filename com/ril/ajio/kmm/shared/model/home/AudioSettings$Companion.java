/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.AudioSettings$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class AudioSettings$Companion {
    private AudioSettings$Companion() {
    }

    public /* synthetic */ AudioSettings$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return AudioSettings$$serializer.INSTANCE;
    }
}

