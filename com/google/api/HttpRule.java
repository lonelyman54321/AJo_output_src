/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.CustomHttpPattern;
import com.google.api.CustomHttpPattern$Builder;
import com.google.api.HttpRule$1;
import com.google.api.HttpRule$Builder;
import com.google.api.HttpRule$PatternCase;
import com.google.api.HttpRuleOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class HttpRule
extends GeneratedMessageLite
implements HttpRuleOrBuilder {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final HttpRule DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal$ProtobufList additionalBindings_;
    private String body_;
    private int patternCase_ = 0;
    private Object pattern_;
    private String responseBody_;
    private String selector_;

    static {
        HttpRule httpRule;
        DEFAULT_INSTANCE = httpRule = new HttpRule();
        GeneratedMessageLite.registerDefaultInstance(HttpRule.class, httpRule);
    }

    private HttpRule() {
        Object object = "";
        this.selector_ = object;
        this.body_ = object;
        this.responseBody_ = object;
        this.additionalBindings_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ HttpRule access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(HttpRule httpRule) {
        httpRule.clearPattern();
    }

    public static /* synthetic */ void access$1000(HttpRule httpRule, ByteString byteString) {
        httpRule.setPutBytes(byteString);
    }

    public static /* synthetic */ void access$1100(HttpRule httpRule, String string2) {
        httpRule.setPost(string2);
    }

    public static /* synthetic */ void access$1200(HttpRule httpRule) {
        httpRule.clearPost();
    }

    public static /* synthetic */ void access$1300(HttpRule httpRule, ByteString byteString) {
        httpRule.setPostBytes(byteString);
    }

    public static /* synthetic */ void access$1400(HttpRule httpRule, String string2) {
        httpRule.setDelete(string2);
    }

    public static /* synthetic */ void access$1500(HttpRule httpRule) {
        httpRule.clearDelete();
    }

    public static /* synthetic */ void access$1600(HttpRule httpRule, ByteString byteString) {
        httpRule.setDeleteBytes(byteString);
    }

    public static /* synthetic */ void access$1700(HttpRule httpRule, String string2) {
        httpRule.setPatch(string2);
    }

    public static /* synthetic */ void access$1800(HttpRule httpRule) {
        httpRule.clearPatch();
    }

    public static /* synthetic */ void access$1900(HttpRule httpRule, ByteString byteString) {
        httpRule.setPatchBytes(byteString);
    }

    public static /* synthetic */ void access$200(HttpRule httpRule, String string2) {
        httpRule.setSelector(string2);
    }

    public static /* synthetic */ void access$2000(HttpRule httpRule, CustomHttpPattern customHttpPattern) {
        httpRule.setCustom(customHttpPattern);
    }

    public static /* synthetic */ void access$2100(HttpRule httpRule, CustomHttpPattern customHttpPattern) {
        httpRule.mergeCustom(customHttpPattern);
    }

    public static /* synthetic */ void access$2200(HttpRule httpRule) {
        httpRule.clearCustom();
    }

    public static /* synthetic */ void access$2300(HttpRule httpRule, String string2) {
        httpRule.setBody(string2);
    }

    public static /* synthetic */ void access$2400(HttpRule httpRule) {
        httpRule.clearBody();
    }

    public static /* synthetic */ void access$2500(HttpRule httpRule, ByteString byteString) {
        httpRule.setBodyBytes(byteString);
    }

    public static /* synthetic */ void access$2600(HttpRule httpRule, String string2) {
        httpRule.setResponseBody(string2);
    }

    public static /* synthetic */ void access$2700(HttpRule httpRule) {
        httpRule.clearResponseBody();
    }

    public static /* synthetic */ void access$2800(HttpRule httpRule, ByteString byteString) {
        httpRule.setResponseBodyBytes(byteString);
    }

    public static /* synthetic */ void access$2900(HttpRule httpRule, int n3, HttpRule httpRule2) {
        httpRule.setAdditionalBindings(n3, httpRule2);
    }

    public static /* synthetic */ void access$300(HttpRule httpRule) {
        httpRule.clearSelector();
    }

    public static /* synthetic */ void access$3000(HttpRule httpRule, HttpRule httpRule2) {
        httpRule.addAdditionalBindings(httpRule2);
    }

    public static /* synthetic */ void access$3100(HttpRule httpRule, int n3, HttpRule httpRule2) {
        httpRule.addAdditionalBindings(n3, httpRule2);
    }

    public static /* synthetic */ void access$3200(HttpRule httpRule, Iterable iterable) {
        httpRule.addAllAdditionalBindings(iterable);
    }

    public static /* synthetic */ void access$3300(HttpRule httpRule) {
        httpRule.clearAdditionalBindings();
    }

    public static /* synthetic */ void access$3400(HttpRule httpRule, int n3) {
        httpRule.removeAdditionalBindings(n3);
    }

    public static /* synthetic */ void access$400(HttpRule httpRule, ByteString byteString) {
        httpRule.setSelectorBytes(byteString);
    }

    public static /* synthetic */ void access$500(HttpRule httpRule, String string2) {
        httpRule.setGet(string2);
    }

    public static /* synthetic */ void access$600(HttpRule httpRule) {
        httpRule.clearGet();
    }

    public static /* synthetic */ void access$700(HttpRule httpRule, ByteString byteString) {
        httpRule.setGetBytes(byteString);
    }

    public static /* synthetic */ void access$800(HttpRule httpRule, String string2) {
        httpRule.setPut(string2);
    }

    public static /* synthetic */ void access$900(HttpRule httpRule) {
        httpRule.clearPut();
    }

    private void addAdditionalBindings(int n3, HttpRule httpRule) {
        httpRule.getClass();
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(n3, httpRule);
    }

    private void addAdditionalBindings(HttpRule httpRule) {
        httpRule.getClass();
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(httpRule);
    }

    private void addAllAdditionalBindings(Iterable iterable) {
        this.ensureAdditionalBindingsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.additionalBindings_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void clearAdditionalBindings() {
        Internal$ProtobufList internal$ProtobufList;
        this.additionalBindings_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearBody() {
        String string2;
        this.body_ = string2 = HttpRule.getDefaultInstance().getBody();
    }

    private void clearCustom() {
        int n3 = this.patternCase_;
        int n4 = 8;
        if (n3 == n4) {
            this.patternCase_ = 0;
            n3 = 0;
            this.pattern_ = null;
        }
    }

    private void clearDelete() {
        int n3 = this.patternCase_;
        int n4 = 5;
        if (n3 == n4) {
            this.patternCase_ = 0;
            n3 = 0;
            this.pattern_ = null;
        }
    }

    private void clearGet() {
        int n3 = this.patternCase_;
        int n4 = 2;
        if (n3 == n4) {
            this.patternCase_ = 0;
            n3 = 0;
            this.pattern_ = null;
        }
    }

    private void clearPatch() {
        int n3 = this.patternCase_;
        int n4 = 6;
        if (n3 == n4) {
            this.patternCase_ = 0;
            n3 = 0;
            this.pattern_ = null;
        }
    }

    private void clearPattern() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    private void clearPost() {
        int n3 = this.patternCase_;
        int n4 = 4;
        if (n3 == n4) {
            this.patternCase_ = 0;
            n3 = 0;
            this.pattern_ = null;
        }
    }

    private void clearPut() {
        int n3 = this.patternCase_;
        int n4 = 3;
        if (n3 == n4) {
            this.patternCase_ = 0;
            n3 = 0;
            this.pattern_ = null;
        }
    }

    private void clearResponseBody() {
        String string2;
        this.responseBody_ = string2 = HttpRule.getDefaultInstance().getResponseBody();
    }

    private void clearSelector() {
        String string2;
        this.selector_ = string2 = HttpRule.getDefaultInstance().getSelector();
    }

    private void ensureAdditionalBindingsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.additionalBindings_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.additionalBindings_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static HttpRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCustom(CustomHttpPattern generatedMessageLite) {
        CustomHttpPattern customHttpPattern;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.patternCase_;
        int n4 = 8;
        if (n3 == n4 && (object = this.pattern_) != (customHttpPattern = CustomHttpPattern.getDefaultInstance())) {
            object = CustomHttpPattern.newBuilder((CustomHttpPattern)this.pattern_);
            generatedMessageLite = ((CustomHttpPattern$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.pattern_ = generatedMessageLite;
        } else {
            this.pattern_ = generatedMessageLite;
        }
        this.patternCase_ = n4;
    }

    public static HttpRule$Builder newBuilder() {
        return (HttpRule$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpRule$Builder newBuilder(HttpRule httpRule) {
        return (HttpRule$Builder)DEFAULT_INSTANCE.createBuilder(httpRule);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream) {
        return (HttpRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpRule parseFrom(ByteString byteString) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static HttpRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HttpRule parseFrom(CodedInputStream codedInputStream) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static HttpRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static HttpRule parseFrom(InputStream inputStream) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HttpRule parseFrom(byte[] byArray) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static HttpRule parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdditionalBindings(int n3) {
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.remove(n3);
    }

    private void setAdditionalBindings(int n3, HttpRule httpRule) {
        httpRule.getClass();
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.set(n3, httpRule);
    }

    private void setBody(String string2) {
        string2.getClass();
        this.body_ = string2;
    }

    private void setBodyBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.body_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        this.pattern_ = customHttpPattern;
        this.patternCase_ = 8;
    }

    private void setDelete(String string2) {
        string2.getClass();
        this.patternCase_ = 5;
        this.pattern_ = string2;
    }

    private void setDeleteBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.pattern_ = object = ((ByteString)object).toStringUtf8();
        this.patternCase_ = 5;
    }

    private void setGet(String string2) {
        string2.getClass();
        this.patternCase_ = 2;
        this.pattern_ = string2;
    }

    private void setGetBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.pattern_ = object = ((ByteString)object).toStringUtf8();
        this.patternCase_ = 2;
    }

    private void setPatch(String string2) {
        string2.getClass();
        this.patternCase_ = 6;
        this.pattern_ = string2;
    }

    private void setPatchBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.pattern_ = object = ((ByteString)object).toStringUtf8();
        this.patternCase_ = 6;
    }

    private void setPost(String string2) {
        string2.getClass();
        this.patternCase_ = 4;
        this.pattern_ = string2;
    }

    private void setPostBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.pattern_ = object = ((ByteString)object).toStringUtf8();
        this.patternCase_ = 4;
    }

    private void setPut(String string2) {
        string2.getClass();
        this.patternCase_ = 3;
        this.pattern_ = string2;
    }

    private void setPutBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.pattern_ = object = ((ByteString)object).toStringUtf8();
        this.patternCase_ = 3;
    }

    private void setResponseBody(String string2) {
        string2.getClass();
        this.responseBody_ = string2;
    }

    private void setResponseBodyBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.responseBody_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setSelector(String string2) {
        string2.getClass();
        this.selector_ = string2;
    }

    private void setSelectorBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.selector_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = HttpRule$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = HttpRule.class;
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
                objectArray = new Object[8];
                objectArray[0] = "pattern_";
                objectArray[by2] = "patternCase_";
                objectArray[2] = "selector_";
                objectArray[3] = "body_";
                objectArray[4] = CustomHttpPattern.class;
                objectArray[5] = "additionalBindings_";
                objectArray[6] = HttpRule.class;
                objectArray[7] = "responseBody_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001\u0208\u0002\u023b\u0000\u0003\u023b\u0000\u0004\u023b\u0000\u0005\u023b\u0000\u0006\u023b\u0000\u0007\u0208\b<\u0000\u000b\u001b\f\u0208", objectArray);
            }
            case 2: {
                return new HttpRule$Builder(null);
            }
            case 1: 
        }
        return new HttpRule();
    }

    public HttpRule getAdditionalBindings(int n3) {
        return (HttpRule)this.additionalBindings_.get(n3);
    }

    public int getAdditionalBindingsCount() {
        return this.additionalBindings_.size();
    }

    public List getAdditionalBindingsList() {
        return this.additionalBindings_;
    }

    public HttpRuleOrBuilder getAdditionalBindingsOrBuilder(int n3) {
        return (HttpRuleOrBuilder)this.additionalBindings_.get(n3);
    }

    public List getAdditionalBindingsOrBuilderList() {
        return this.additionalBindings_;
    }

    public String getBody() {
        return this.body_;
    }

    public ByteString getBodyBytes() {
        return ByteString.copyFromUtf8(this.body_);
    }

    public CustomHttpPattern getCustom() {
        int n3 = this.patternCase_;
        int n4 = 8;
        if (n3 == n4) {
            return (CustomHttpPattern)this.pattern_;
        }
        return CustomHttpPattern.getDefaultInstance();
    }

    public String getDelete() {
        int n3 = this.patternCase_;
        int n4 = 5;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return string2;
    }

    public ByteString getDeleteBytes() {
        int n3 = this.patternCase_;
        int n4 = 5;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8(string2);
    }

    public String getGet() {
        int n3 = this.patternCase_;
        int n4 = 2;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return string2;
    }

    public ByteString getGetBytes() {
        int n3 = this.patternCase_;
        int n4 = 2;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8(string2);
    }

    public String getPatch() {
        int n3 = this.patternCase_;
        int n4 = 6;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return string2;
    }

    public ByteString getPatchBytes() {
        int n3 = this.patternCase_;
        int n4 = 6;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8(string2);
    }

    public HttpRule$PatternCase getPatternCase() {
        return HttpRule$PatternCase.forNumber(this.patternCase_);
    }

    public String getPost() {
        int n3 = this.patternCase_;
        int n4 = 4;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return string2;
    }

    public ByteString getPostBytes() {
        int n3 = this.patternCase_;
        int n4 = 4;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8(string2);
    }

    public String getPut() {
        int n3 = this.patternCase_;
        int n4 = 3;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return string2;
    }

    public ByteString getPutBytes() {
        int n3 = this.patternCase_;
        int n4 = 3;
        String string2 = n3 == n4 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8(string2);
    }

    public String getResponseBody() {
        return this.responseBody_;
    }

    public ByteString getResponseBodyBytes() {
        return ByteString.copyFromUtf8(this.responseBody_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    public boolean hasCustom() {
        int n3 = this.patternCase_;
        int n4 = 8;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }
}

