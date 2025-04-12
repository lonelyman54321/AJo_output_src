/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.UsageRule$1;
import com.google.api.UsageRule$Builder;
import com.google.api.UsageRuleOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UsageRule
extends GeneratedMessageLite
implements UsageRuleOrBuilder {
    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    private static final UsageRule DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_ = "";
    private boolean skipServiceControl_;

    static {
        UsageRule usageRule;
        DEFAULT_INSTANCE = usageRule = new UsageRule();
        GeneratedMessageLite.registerDefaultInstance(UsageRule.class, usageRule);
    }

    private UsageRule() {
    }

    public static /* synthetic */ UsageRule access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(UsageRule usageRule, String string2) {
        usageRule.setSelector(string2);
    }

    public static /* synthetic */ void access$200(UsageRule usageRule) {
        usageRule.clearSelector();
    }

    public static /* synthetic */ void access$300(UsageRule usageRule, ByteString byteString) {
        usageRule.setSelectorBytes(byteString);
    }

    public static /* synthetic */ void access$400(UsageRule usageRule, boolean bl2) {
        usageRule.setAllowUnregisteredCalls(bl2);
    }

    public static /* synthetic */ void access$500(UsageRule usageRule) {
        usageRule.clearAllowUnregisteredCalls();
    }

    public static /* synthetic */ void access$600(UsageRule usageRule, boolean bl2) {
        usageRule.setSkipServiceControl(bl2);
    }

    public static /* synthetic */ void access$700(UsageRule usageRule) {
        usageRule.clearSkipServiceControl();
    }

    private void clearAllowUnregisteredCalls() {
        this.allowUnregisteredCalls_ = false;
    }

    private void clearSelector() {
        String string2;
        this.selector_ = string2 = UsageRule.getDefaultInstance().getSelector();
    }

    private void clearSkipServiceControl() {
        this.skipServiceControl_ = false;
    }

    public static UsageRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static UsageRule$Builder newBuilder() {
        return (UsageRule$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static UsageRule$Builder newBuilder(UsageRule usageRule) {
        return (UsageRule$Builder)DEFAULT_INSTANCE.createBuilder(usageRule);
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream) {
        return (UsageRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UsageRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UsageRule parseFrom(ByteString byteString) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static UsageRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UsageRule parseFrom(CodedInputStream codedInputStream) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static UsageRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static UsageRule parseFrom(InputStream inputStream) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static UsageRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UsageRule parseFrom(ByteBuffer byteBuffer) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static UsageRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UsageRule parseFrom(byte[] byArray) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static UsageRule parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAllowUnregisteredCalls(boolean bl2) {
        this.allowUnregisteredCalls_ = bl2;
    }

    private void setSelector(String string2) {
        string2.getClass();
        this.selector_ = string2;
    }

    private void setSelectorBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.selector_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setSkipServiceControl(boolean bl2) {
        this.skipServiceControl_ = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = UsageRule$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = UsageRule.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[3];
                objectArray[0] = "selector_";
                objectArray[by2] = "allowUnregisteredCalls_";
                objectArray[2] = "skipServiceControl_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0007\u0003\u0007", objectArray);
            }
            case 2: {
                return new UsageRule$Builder(null);
            }
            case 1: 
        }
        return new UsageRule();
    }

    public boolean getAllowUnregisteredCalls() {
        return this.allowUnregisteredCalls_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    public boolean getSkipServiceControl() {
        return this.skipServiceControl_;
    }
}

