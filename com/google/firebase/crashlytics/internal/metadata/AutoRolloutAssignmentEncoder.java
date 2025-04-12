/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder;
import com.google.firebase.crashlytics.internal.metadata.AutoValue_RolloutAssignment;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

public final class AutoRolloutAssignmentEncoder
implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG;

    static {
        AutoRolloutAssignmentEncoder autoRolloutAssignmentEncoder = new AutoRolloutAssignmentEncoder();
        CONFIG = autoRolloutAssignmentEncoder;
    }

    private AutoRolloutAssignmentEncoder() {
    }

    public void configure(EncoderConfig encoderConfig) {
        AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder autoRolloutAssignmentEncoder$RolloutAssignmentEncoder = AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder.INSTANCE;
        encoderConfig.registerEncoder(RolloutAssignment.class, autoRolloutAssignmentEncoder$RolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, autoRolloutAssignmentEncoder$RolloutAssignmentEncoder);
    }
}

