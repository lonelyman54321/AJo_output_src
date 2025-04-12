/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LaunchStage;
import com.google.protobuf.Internal$EnumVerifier;

final class LaunchStage$LaunchStageVerifier
implements Internal$EnumVerifier {
    static final Internal$EnumVerifier INSTANCE;

    static {
        LaunchStage$LaunchStageVerifier launchStage$LaunchStageVerifier = new LaunchStage$LaunchStageVerifier();
        INSTANCE = launchStage$LaunchStageVerifier;
    }

    private LaunchStage$LaunchStageVerifier() {
    }

    public boolean isInRange(int n3) {
        LaunchStage launchStage = LaunchStage.forNumber(n3);
        if (launchStage != null) {
            n3 = 1;
        } else {
            n3 = 0;
            launchStage = null;
        }
        return n3 != 0;
    }
}

