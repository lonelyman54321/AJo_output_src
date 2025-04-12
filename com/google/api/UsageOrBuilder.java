/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.UsageRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface UsageOrBuilder
extends MessageLiteOrBuilder {
    public String getProducerNotificationChannel();

    public ByteString getProducerNotificationChannelBytes();

    public String getRequirements(int var1);

    public ByteString getRequirementsBytes(int var1);

    public int getRequirementsCount();

    public List getRequirementsList();

    public UsageRule getRules(int var1);

    public int getRulesCount();

    public List getRulesList();
}

