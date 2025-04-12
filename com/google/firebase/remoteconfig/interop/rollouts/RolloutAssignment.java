/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.interop.rollouts.AutoRolloutAssignmentEncoder;
import com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment$Builder;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment$Builder;
import org.json.JSONObject;

public abstract class RolloutAssignment {
    private static final String PARAMETER_KEY = "parameterKey";
    private static final String PARAMETER_VALUE = "parameterValue";
    public static final DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER;
    private static final String ROLLOUT_ID = "rolloutId";
    private static final String TEMPLATE_VERSION = "templateVersion";
    private static final String VARIANT_ID = "variantId";

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        Configurator configurator = AutoRolloutAssignmentEncoder.CONFIG;
        ROLLOUT_ASSIGNMENT_JSON_ENCODER = jsonDataEncoderBuilder.configureWith(configurator).build();
    }

    public static RolloutAssignment$Builder builder() {
        AutoValue_RolloutAssignment$Builder autoValue_RolloutAssignment$Builder = new AutoValue_RolloutAssignment$Builder();
        return autoValue_RolloutAssignment$Builder;
    }

    public static RolloutAssignment create(String string2) {
        JSONObject jSONObject = new JSONObject(string2);
        return RolloutAssignment.create(jSONObject);
    }

    public static RolloutAssignment create(JSONObject jSONObject) {
        RolloutAssignment$Builder rolloutAssignment$Builder = RolloutAssignment.builder();
        String string2 = jSONObject.getString(ROLLOUT_ID);
        rolloutAssignment$Builder = rolloutAssignment$Builder.setRolloutId(string2);
        string2 = jSONObject.getString(VARIANT_ID);
        rolloutAssignment$Builder = rolloutAssignment$Builder.setVariantId(string2);
        string2 = jSONObject.getString(PARAMETER_KEY);
        rolloutAssignment$Builder = rolloutAssignment$Builder.setParameterKey(string2);
        string2 = jSONObject.getString(PARAMETER_VALUE);
        rolloutAssignment$Builder = rolloutAssignment$Builder.setParameterValue(string2);
        long l2 = jSONObject.getLong(TEMPLATE_VERSION);
        return rolloutAssignment$Builder.setTemplateVersion(l2).build();
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();
}

