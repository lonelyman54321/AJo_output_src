/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.UsageRule;
import com.google.api.UsageRule$1;
import com.google.api.UsageRuleOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class UsageRule$Builder
extends GeneratedMessageLite$Builder
implements UsageRuleOrBuilder {
    private UsageRule$Builder() {
        UsageRule usageRule = UsageRule.access$000();
        super(usageRule);
    }

    public /* synthetic */ UsageRule$Builder(UsageRule$1 usageRule$1) {
        this();
    }

    public UsageRule$Builder clearAllowUnregisteredCalls() {
        this.copyOnWrite();
        UsageRule.access$500((UsageRule)this.instance);
        return this;
    }

    public UsageRule$Builder clearSelector() {
        this.copyOnWrite();
        UsageRule.access$200((UsageRule)this.instance);
        return this;
    }

    public UsageRule$Builder clearSkipServiceControl() {
        this.copyOnWrite();
        UsageRule.access$700((UsageRule)this.instance);
        return this;
    }

    public boolean getAllowUnregisteredCalls() {
        return ((UsageRule)this.instance).getAllowUnregisteredCalls();
    }

    public String getSelector() {
        return ((UsageRule)this.instance).getSelector();
    }

    public ByteString getSelectorBytes() {
        return ((UsageRule)this.instance).getSelectorBytes();
    }

    public boolean getSkipServiceControl() {
        return ((UsageRule)this.instance).getSkipServiceControl();
    }

    public UsageRule$Builder setAllowUnregisteredCalls(boolean bl2) {
        this.copyOnWrite();
        UsageRule.access$400((UsageRule)this.instance, bl2);
        return this;
    }

    public UsageRule$Builder setSelector(String string2) {
        this.copyOnWrite();
        UsageRule.access$100((UsageRule)this.instance, string2);
        return this;
    }

    public UsageRule$Builder setSelectorBytes(ByteString byteString) {
        this.copyOnWrite();
        UsageRule.access$300((UsageRule)this.instance, byteString);
        return this;
    }

    public UsageRule$Builder setSkipServiceControl(boolean bl2) {
        this.copyOnWrite();
        UsageRule.access$600((UsageRule)this.instance, bl2);
        return this;
    }
}

