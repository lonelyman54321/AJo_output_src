/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Usage;
import com.google.api.Usage$1;
import com.google.api.UsageOrBuilder;
import com.google.api.UsageRule;
import com.google.api.UsageRule$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Usage$Builder
extends GeneratedMessageLite$Builder
implements UsageOrBuilder {
    private Usage$Builder() {
        Usage usage = Usage.access$000();
        super(usage);
    }

    public /* synthetic */ Usage$Builder(Usage$1 usage$1) {
        this();
    }

    public Usage$Builder addAllRequirements(Iterable iterable) {
        this.copyOnWrite();
        Usage.access$300((Usage)this.instance, iterable);
        return this;
    }

    public Usage$Builder addAllRules(Iterable iterable) {
        this.copyOnWrite();
        Usage.access$900((Usage)this.instance, iterable);
        return this;
    }

    public Usage$Builder addRequirements(String string2) {
        this.copyOnWrite();
        Usage.access$200((Usage)this.instance, string2);
        return this;
    }

    public Usage$Builder addRequirementsBytes(ByteString byteString) {
        this.copyOnWrite();
        Usage.access$500((Usage)this.instance, byteString);
        return this;
    }

    public Usage$Builder addRules(int n3, UsageRule$Builder usageRuleOrBuilder) {
        this.copyOnWrite();
        Usage usage = (Usage)this.instance;
        usageRuleOrBuilder = (UsageRule)usageRuleOrBuilder.build();
        Usage.access$800(usage, n3, (UsageRule)usageRuleOrBuilder);
        return this;
    }

    public Usage$Builder addRules(int n3, UsageRule usageRule) {
        this.copyOnWrite();
        Usage.access$800((Usage)this.instance, n3, usageRule);
        return this;
    }

    public Usage$Builder addRules(UsageRule$Builder usageRuleOrBuilder) {
        this.copyOnWrite();
        Usage usage = (Usage)this.instance;
        usageRuleOrBuilder = (UsageRule)usageRuleOrBuilder.build();
        Usage.access$700(usage, (UsageRule)usageRuleOrBuilder);
        return this;
    }

    public Usage$Builder addRules(UsageRule usageRule) {
        this.copyOnWrite();
        Usage.access$700((Usage)this.instance, usageRule);
        return this;
    }

    public Usage$Builder clearProducerNotificationChannel() {
        this.copyOnWrite();
        Usage.access$1300((Usage)this.instance);
        return this;
    }

    public Usage$Builder clearRequirements() {
        this.copyOnWrite();
        Usage.access$400((Usage)this.instance);
        return this;
    }

    public Usage$Builder clearRules() {
        this.copyOnWrite();
        Usage.access$1000((Usage)this.instance);
        return this;
    }

    public String getProducerNotificationChannel() {
        return ((Usage)this.instance).getProducerNotificationChannel();
    }

    public ByteString getProducerNotificationChannelBytes() {
        return ((Usage)this.instance).getProducerNotificationChannelBytes();
    }

    public String getRequirements(int n3) {
        return ((Usage)this.instance).getRequirements(n3);
    }

    public ByteString getRequirementsBytes(int n3) {
        return ((Usage)this.instance).getRequirementsBytes(n3);
    }

    public int getRequirementsCount() {
        return ((Usage)this.instance).getRequirementsCount();
    }

    public List getRequirementsList() {
        return Collections.unmodifiableList(((Usage)this.instance).getRequirementsList());
    }

    public UsageRule getRules(int n3) {
        return ((Usage)this.instance).getRules(n3);
    }

    public int getRulesCount() {
        return ((Usage)this.instance).getRulesCount();
    }

    public List getRulesList() {
        return Collections.unmodifiableList(((Usage)this.instance).getRulesList());
    }

    public Usage$Builder removeRules(int n3) {
        this.copyOnWrite();
        Usage.access$1100((Usage)this.instance, n3);
        return this;
    }

    public Usage$Builder setProducerNotificationChannel(String string2) {
        this.copyOnWrite();
        Usage.access$1200((Usage)this.instance, string2);
        return this;
    }

    public Usage$Builder setProducerNotificationChannelBytes(ByteString byteString) {
        this.copyOnWrite();
        Usage.access$1400((Usage)this.instance, byteString);
        return this;
    }

    public Usage$Builder setRequirements(int n3, String string2) {
        this.copyOnWrite();
        Usage.access$100((Usage)this.instance, n3, string2);
        return this;
    }

    public Usage$Builder setRules(int n3, UsageRule$Builder usageRuleOrBuilder) {
        this.copyOnWrite();
        Usage usage = (Usage)this.instance;
        usageRuleOrBuilder = (UsageRule)usageRuleOrBuilder.build();
        Usage.access$600(usage, n3, (UsageRule)usageRuleOrBuilder);
        return this;
    }

    public Usage$Builder setRules(int n3, UsageRule usageRule) {
        this.copyOnWrite();
        Usage.access$600((Usage)this.instance, n3, usageRule);
        return this;
    }
}

