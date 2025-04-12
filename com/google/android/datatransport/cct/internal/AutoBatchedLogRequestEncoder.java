/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ClientInfoEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ComplianceDataEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExperimentIdsEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogEventEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogRequestEncoder;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder;
import com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest;
import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.android.datatransport.cct.internal.AutoValue_ComplianceData;
import com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds;
import com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.android.datatransport.cct.internal.AutoValue_LogRequest;
import com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

public final class AutoBatchedLogRequestEncoder
implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG;

    static {
        AutoBatchedLogRequestEncoder autoBatchedLogRequestEncoder = new AutoBatchedLogRequestEncoder();
        CONFIG = autoBatchedLogRequestEncoder;
    }

    private AutoBatchedLogRequestEncoder() {
    }

    public void configure(EncoderConfig encoderConfig) {
        ObjectEncoder objectEncoder = AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder.INSTANCE;
        encoderConfig.registerEncoder(BatchedLogRequest.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_BatchedLogRequest.class, objectEncoder);
        objectEncoder = AutoBatchedLogRequestEncoder$LogRequestEncoder.INSTANCE;
        encoderConfig.registerEncoder(LogRequest.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_LogRequest.class, objectEncoder);
        objectEncoder = AutoBatchedLogRequestEncoder$ClientInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(ClientInfo.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_ClientInfo.class, objectEncoder);
        objectEncoder = AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(AndroidClientInfo.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_AndroidClientInfo.class, objectEncoder);
        objectEncoder = AutoBatchedLogRequestEncoder$LogEventEncoder.INSTANCE;
        encoderConfig.registerEncoder(LogEvent.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_LogEvent.class, objectEncoder);
        objectEncoder = AutoBatchedLogRequestEncoder$ComplianceDataEncoder.INSTANCE;
        encoderConfig.registerEncoder(ComplianceData.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_ComplianceData.class, objectEncoder);
        objectEncoder = AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder.INSTANCE;
        encoderConfig.registerEncoder(ExternalPrivacyContext.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPrivacyContext.class, objectEncoder);
        objectEncoder = AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder.INSTANCE;
        encoderConfig.registerEncoder(ExternalPRequestContext.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPRequestContext.class, objectEncoder);
        objectEncoder = AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_NetworkConnectionInfo.class, objectEncoder);
        objectEncoder = AutoBatchedLogRequestEncoder$ExperimentIdsEncoder.INSTANCE;
        encoderConfig.registerEncoder(ExperimentIds.class, objectEncoder);
        encoderConfig.registerEncoder(AutoValue_ExperimentIds.class, objectEncoder);
    }
}

