/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder;
import com.google.firebase.crashlytics.internal.metadata.AutoValue_RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import org.json.JSONObject;

public abstract class RolloutAssignment {
    private static final int MAX_PARAMETER_VALUE_LENGTH = 256;
    public static final DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER;

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        Configurator configurator = AutoRolloutAssignmentEncoder.CONFIG;
        ROLLOUT_ASSIGNMENT_JSON_ENCODER = jsonDataEncoderBuilder.configureWith(configurator).build();
    }

    public static RolloutAssignment create(String string2) {
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString("rolloutId");
        String string4 = jSONObject.getString("parameterKey");
        String string5 = jSONObject.getString("parameterValue");
        String string6 = jSONObject.getString("variantId");
        long l2 = jSONObject.getLong("templateVersion");
        return RolloutAssignment.create(string3, string4, string5, string6, l2);
    }

    public static RolloutAssignment create(String string2, String string3, String object, String string4, long l2) {
        String string5 = RolloutAssignment.validate((String)object);
        object = new AutoValue_RolloutAssignment(string2, string3, string5, string4, l2);
        return object;
    }

    private static String validate(String string2) {
        int n3;
        int n4 = string2.length();
        if (n4 > (n3 = 256)) {
            n4 = 0;
            string2 = string2.substring(0, n3);
        }
        return string2;
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public CrashlyticsReport$Session$Event$RolloutAssignment toReportProto() {
        CrashlyticsReport$Session$Event$RolloutAssignment$Builder crashlyticsReport$Session$Event$RolloutAssignment$Builder = CrashlyticsReport$Session$Event$RolloutAssignment.builder();
        Object object = CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant.builder();
        String string2 = this.getVariantId();
        object = ((CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder)object).setVariantId(string2);
        string2 = this.getRolloutId();
        object = ((CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder)object).setRolloutId(string2).build();
        crashlyticsReport$Session$Event$RolloutAssignment$Builder = crashlyticsReport$Session$Event$RolloutAssignment$Builder.setRolloutVariant((CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant)object);
        object = this.getParameterKey();
        crashlyticsReport$Session$Event$RolloutAssignment$Builder = crashlyticsReport$Session$Event$RolloutAssignment$Builder.setParameterKey((String)object);
        object = this.getParameterValue();
        crashlyticsReport$Session$Event$RolloutAssignment$Builder = crashlyticsReport$Session$Event$RolloutAssignment$Builder.setParameterValue((String)object);
        long l2 = this.getTemplateVersion();
        return crashlyticsReport$Session$Event$RolloutAssignment$Builder.setTemplateVersion(l2).build();
    }
}

