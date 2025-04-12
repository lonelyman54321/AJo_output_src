/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Endpoint$1;
import com.google.api.Endpoint$Builder;
import com.google.api.EndpointOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Endpoint
extends GeneratedMessageLite
implements EndpointOrBuilder {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    private static final Endpoint DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int TARGET_FIELD_NUMBER = 101;
    private Internal$ProtobufList aliases_;
    private boolean allowCors_;
    private Internal$ProtobufList features_;
    private String name_;
    private String target_;

    static {
        Endpoint endpoint;
        DEFAULT_INSTANCE = endpoint = new Endpoint();
        GeneratedMessageLite.registerDefaultInstance(Endpoint.class, endpoint);
    }

    private Endpoint() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.name_ = string2 = "";
        this.aliases_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.features_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.target_ = string2;
    }

    public static /* synthetic */ Endpoint access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Endpoint endpoint, String string2) {
        endpoint.setName(string2);
    }

    public static /* synthetic */ void access$1000(Endpoint endpoint, String string2) {
        endpoint.addFeatures(string2);
    }

    public static /* synthetic */ void access$1100(Endpoint endpoint, Iterable iterable) {
        endpoint.addAllFeatures(iterable);
    }

    public static /* synthetic */ void access$1200(Endpoint endpoint) {
        endpoint.clearFeatures();
    }

    public static /* synthetic */ void access$1300(Endpoint endpoint, ByteString byteString) {
        endpoint.addFeaturesBytes(byteString);
    }

    public static /* synthetic */ void access$1400(Endpoint endpoint, String string2) {
        endpoint.setTarget(string2);
    }

    public static /* synthetic */ void access$1500(Endpoint endpoint) {
        endpoint.clearTarget();
    }

    public static /* synthetic */ void access$1600(Endpoint endpoint, ByteString byteString) {
        endpoint.setTargetBytes(byteString);
    }

    public static /* synthetic */ void access$1700(Endpoint endpoint, boolean bl2) {
        endpoint.setAllowCors(bl2);
    }

    public static /* synthetic */ void access$1800(Endpoint endpoint) {
        endpoint.clearAllowCors();
    }

    public static /* synthetic */ void access$200(Endpoint endpoint) {
        endpoint.clearName();
    }

    public static /* synthetic */ void access$300(Endpoint endpoint, ByteString byteString) {
        endpoint.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Endpoint endpoint, int n3, String string2) {
        endpoint.setAliases(n3, string2);
    }

    public static /* synthetic */ void access$500(Endpoint endpoint, String string2) {
        endpoint.addAliases(string2);
    }

    public static /* synthetic */ void access$600(Endpoint endpoint, Iterable iterable) {
        endpoint.addAllAliases(iterable);
    }

    public static /* synthetic */ void access$700(Endpoint endpoint) {
        endpoint.clearAliases();
    }

    public static /* synthetic */ void access$800(Endpoint endpoint, ByteString byteString) {
        endpoint.addAliasesBytes(byteString);
    }

    public static /* synthetic */ void access$900(Endpoint endpoint, int n3, String string2) {
        endpoint.setFeatures(n3, string2);
    }

    private void addAliases(String string2) {
        string2.getClass();
        this.ensureAliasesIsMutable();
        this.aliases_.add(string2);
    }

    private void addAliasesBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureAliasesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.aliases_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addAllAliases(Iterable iterable) {
        this.ensureAliasesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.aliases_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllFeatures(Iterable iterable) {
        this.ensureFeaturesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.features_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addFeatures(String string2) {
        string2.getClass();
        this.ensureFeaturesIsMutable();
        this.features_.add(string2);
    }

    private void addFeaturesBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureFeaturesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.features_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void clearAliases() {
        Internal$ProtobufList internal$ProtobufList;
        this.aliases_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAllowCors() {
        this.allowCors_ = false;
    }

    private void clearFeatures() {
        Internal$ProtobufList internal$ProtobufList;
        this.features_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Endpoint.getDefaultInstance().getName();
    }

    private void clearTarget() {
        String string2;
        this.target_ = string2 = Endpoint.getDefaultInstance().getTarget();
    }

    private void ensureAliasesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.aliases_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.aliases_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureFeaturesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.features_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.features_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Endpoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Endpoint$Builder newBuilder() {
        return (Endpoint$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Endpoint$Builder newBuilder(Endpoint endpoint) {
        return (Endpoint$Builder)DEFAULT_INSTANCE.createBuilder(endpoint);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream) {
        return (Endpoint)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Endpoint)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Endpoint parseFrom(ByteString byteString) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Endpoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Endpoint parseFrom(CodedInputStream codedInputStream) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Endpoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Endpoint parseFrom(InputStream inputStream) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Endpoint parseFrom(byte[] byArray) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Endpoint parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAliases(int n3, String string2) {
        string2.getClass();
        this.ensureAliasesIsMutable();
        this.aliases_.set(n3, string2);
    }

    private void setAllowCors(boolean bl2) {
        this.allowCors_ = bl2;
    }

    private void setFeatures(int n3, String string2) {
        string2.getClass();
        this.ensureFeaturesIsMutable();
        this.features_.set(n3, string2);
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setTarget(String string2) {
        string2.getClass();
        this.target_ = string2;
    }

    private void setTargetBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.target_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Endpoint$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Endpoint.class;
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
                objectArray = new Object[5];
                objectArray[0] = "name_";
                objectArray[by2] = "aliases_";
                objectArray[2] = "features_";
                objectArray[3] = "allowCors_";
                objectArray[4] = "target_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001\u0208\u0002\u021a\u0004\u021a\u0005\u0007e\u0208", objectArray);
            }
            case 2: {
                return new Endpoint$Builder(null);
            }
            case 1: 
        }
        return new Endpoint();
    }

    public String getAliases(int n3) {
        return (String)this.aliases_.get(n3);
    }

    public ByteString getAliasesBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.aliases_.get(n3));
    }

    public int getAliasesCount() {
        return this.aliases_.size();
    }

    public List getAliasesList() {
        return this.aliases_;
    }

    public boolean getAllowCors() {
        return this.allowCors_;
    }

    public String getFeatures(int n3) {
        return (String)this.features_.get(n3);
    }

    public ByteString getFeaturesBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.features_.get(n3));
    }

    public int getFeaturesCount() {
        return this.features_.size();
    }

    public List getFeaturesList() {
        return this.features_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getTarget() {
        return this.target_;
    }

    public ByteString getTargetBytes() {
        return ByteString.copyFromUtf8(this.target_);
    }
}

