/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

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
import com.google.protobuf.Struct;
import com.google.protobuf.Struct$Builder;
import com.google.protobuf.StructOrBuilder;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Auth$Builder;
import com.google.rpc.context.AttributeContext$AuthOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class AttributeContext$Auth
extends GeneratedMessageLite
implements AttributeContext$AuthOrBuilder {
    public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    public static final int CLAIMS_FIELD_NUMBER = 4;
    private static final AttributeContext$Auth DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PRESENTER_FIELD_NUMBER = 3;
    public static final int PRINCIPAL_FIELD_NUMBER = 1;
    private Internal$ProtobufList accessLevels_;
    private Internal$ProtobufList audiences_;
    private Struct claims_;
    private String presenter_;
    private String principal_;

    static {
        AttributeContext$Auth attributeContext$Auth;
        DEFAULT_INSTANCE = attributeContext$Auth = new AttributeContext$Auth();
        GeneratedMessageLite.registerDefaultInstance(AttributeContext$Auth.class, attributeContext$Auth);
    }

    private AttributeContext$Auth() {
        Internal$ProtobufList internal$ProtobufList;
        Object object = "";
        this.principal_ = object;
        this.audiences_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.presenter_ = object;
        this.accessLevels_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ AttributeContext$Auth access$2800() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$2900(AttributeContext$Auth attributeContext$Auth, String string2) {
        attributeContext$Auth.setPrincipal(string2);
    }

    public static /* synthetic */ void access$3000(AttributeContext$Auth attributeContext$Auth) {
        attributeContext$Auth.clearPrincipal();
    }

    public static /* synthetic */ void access$3100(AttributeContext$Auth attributeContext$Auth, ByteString byteString) {
        attributeContext$Auth.setPrincipalBytes(byteString);
    }

    public static /* synthetic */ void access$3200(AttributeContext$Auth attributeContext$Auth, int n3, String string2) {
        attributeContext$Auth.setAudiences(n3, string2);
    }

    public static /* synthetic */ void access$3300(AttributeContext$Auth attributeContext$Auth, String string2) {
        attributeContext$Auth.addAudiences(string2);
    }

    public static /* synthetic */ void access$3400(AttributeContext$Auth attributeContext$Auth, Iterable iterable) {
        attributeContext$Auth.addAllAudiences(iterable);
    }

    public static /* synthetic */ void access$3500(AttributeContext$Auth attributeContext$Auth) {
        attributeContext$Auth.clearAudiences();
    }

    public static /* synthetic */ void access$3600(AttributeContext$Auth attributeContext$Auth, ByteString byteString) {
        attributeContext$Auth.addAudiencesBytes(byteString);
    }

    public static /* synthetic */ void access$3700(AttributeContext$Auth attributeContext$Auth, String string2) {
        attributeContext$Auth.setPresenter(string2);
    }

    public static /* synthetic */ void access$3800(AttributeContext$Auth attributeContext$Auth) {
        attributeContext$Auth.clearPresenter();
    }

    public static /* synthetic */ void access$3900(AttributeContext$Auth attributeContext$Auth, ByteString byteString) {
        attributeContext$Auth.setPresenterBytes(byteString);
    }

    public static /* synthetic */ void access$4000(AttributeContext$Auth attributeContext$Auth, Struct struct) {
        attributeContext$Auth.setClaims(struct);
    }

    public static /* synthetic */ void access$4100(AttributeContext$Auth attributeContext$Auth, Struct struct) {
        attributeContext$Auth.mergeClaims(struct);
    }

    public static /* synthetic */ void access$4200(AttributeContext$Auth attributeContext$Auth) {
        attributeContext$Auth.clearClaims();
    }

    public static /* synthetic */ void access$4300(AttributeContext$Auth attributeContext$Auth, int n3, String string2) {
        attributeContext$Auth.setAccessLevels(n3, string2);
    }

    public static /* synthetic */ void access$4400(AttributeContext$Auth attributeContext$Auth, String string2) {
        attributeContext$Auth.addAccessLevels(string2);
    }

    public static /* synthetic */ void access$4500(AttributeContext$Auth attributeContext$Auth, Iterable iterable) {
        attributeContext$Auth.addAllAccessLevels(iterable);
    }

    public static /* synthetic */ void access$4600(AttributeContext$Auth attributeContext$Auth) {
        attributeContext$Auth.clearAccessLevels();
    }

    public static /* synthetic */ void access$4700(AttributeContext$Auth attributeContext$Auth, ByteString byteString) {
        attributeContext$Auth.addAccessLevelsBytes(byteString);
    }

    private void addAccessLevels(String string2) {
        string2.getClass();
        this.ensureAccessLevelsIsMutable();
        this.accessLevels_.add(string2);
    }

    private void addAccessLevelsBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureAccessLevelsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.accessLevels_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addAllAccessLevels(Iterable iterable) {
        this.ensureAccessLevelsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.accessLevels_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllAudiences(Iterable iterable) {
        this.ensureAudiencesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.audiences_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAudiences(String string2) {
        string2.getClass();
        this.ensureAudiencesIsMutable();
        this.audiences_.add(string2);
    }

    private void addAudiencesBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureAudiencesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.audiences_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void clearAccessLevels() {
        Internal$ProtobufList internal$ProtobufList;
        this.accessLevels_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAudiences() {
        Internal$ProtobufList internal$ProtobufList;
        this.audiences_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearClaims() {
        this.claims_ = null;
    }

    private void clearPresenter() {
        String string2;
        this.presenter_ = string2 = AttributeContext$Auth.getDefaultInstance().getPresenter();
    }

    private void clearPrincipal() {
        String string2;
        this.principal_ = string2 = AttributeContext$Auth.getDefaultInstance().getPrincipal();
    }

    private void ensureAccessLevelsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.accessLevels_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.accessLevels_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureAudiencesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.audiences_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.audiences_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static AttributeContext$Auth getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeClaims(Struct struct) {
        Struct struct2;
        struct.getClass();
        StructOrBuilder structOrBuilder = this.claims_;
        if (structOrBuilder != null && structOrBuilder != (struct2 = Struct.getDefaultInstance())) {
            structOrBuilder = Struct.newBuilder(this.claims_);
            this.claims_ = struct = (Struct)((Struct$Builder)((GeneratedMessageLite$Builder)((Object)structOrBuilder)).mergeFrom(struct)).buildPartial();
        } else {
            this.claims_ = struct;
        }
    }

    public static AttributeContext$Auth$Builder newBuilder() {
        return (AttributeContext$Auth$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AttributeContext$Auth$Builder newBuilder(AttributeContext$Auth attributeContext$Auth) {
        return (AttributeContext$Auth$Builder)DEFAULT_INSTANCE.createBuilder(attributeContext$Auth);
    }

    public static AttributeContext$Auth parseDelimitedFrom(InputStream inputStream) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Auth parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Auth parseFrom(ByteString byteString) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AttributeContext$Auth parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AttributeContext$Auth parseFrom(CodedInputStream codedInputStream) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AttributeContext$Auth parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AttributeContext$Auth parseFrom(InputStream inputStream) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Auth parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Auth parseFrom(ByteBuffer byteBuffer) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AttributeContext$Auth parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AttributeContext$Auth parseFrom(byte[] byArray) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AttributeContext$Auth parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAccessLevels(int n3, String string2) {
        string2.getClass();
        this.ensureAccessLevelsIsMutable();
        this.accessLevels_.set(n3, string2);
    }

    private void setAudiences(int n3, String string2) {
        string2.getClass();
        this.ensureAudiencesIsMutable();
        this.audiences_.set(n3, string2);
    }

    private void setClaims(Struct struct) {
        struct.getClass();
        this.claims_ = struct;
    }

    private void setPresenter(String string2) {
        string2.getClass();
        this.presenter_ = string2;
    }

    private void setPresenterBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.presenter_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setPrincipal(String string2) {
        string2.getClass();
        this.principal_ = string2;
    }

    private void setPrincipalBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.principal_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = AttributeContext$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = AttributeContext$Auth.class;
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
                objectArray[0] = "principal_";
                objectArray[by2] = "audiences_";
                objectArray[2] = "presenter_";
                objectArray[3] = "claims_";
                objectArray[4] = "accessLevels_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0208\u0002\u021a\u0003\u0208\u0004\t\u0005\u021a", objectArray);
            }
            case 2: {
                return new AttributeContext$Auth$Builder(null);
            }
            case 1: 
        }
        return new AttributeContext$Auth();
    }

    public String getAccessLevels(int n3) {
        return (String)this.accessLevels_.get(n3);
    }

    public ByteString getAccessLevelsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.accessLevels_.get(n3));
    }

    public int getAccessLevelsCount() {
        return this.accessLevels_.size();
    }

    public List getAccessLevelsList() {
        return this.accessLevels_;
    }

    public String getAudiences(int n3) {
        return (String)this.audiences_.get(n3);
    }

    public ByteString getAudiencesBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.audiences_.get(n3));
    }

    public int getAudiencesCount() {
        return this.audiences_.size();
    }

    public List getAudiencesList() {
        return this.audiences_;
    }

    public Struct getClaims() {
        Struct struct = this.claims_;
        if (struct == null) {
            struct = Struct.getDefaultInstance();
        }
        return struct;
    }

    public String getPresenter() {
        return this.presenter_;
    }

    public ByteString getPresenterBytes() {
        return ByteString.copyFromUtf8(this.presenter_);
    }

    public String getPrincipal() {
        return this.principal_;
    }

    public ByteString getPrincipalBytes() {
        return ByteString.copyFromUtf8(this.principal_);
    }

    public boolean hasClaims() {
        boolean bl2;
        Struct struct = this.claims_;
        if (struct != null) {
            bl2 = true;
        } else {
            bl2 = false;
            struct = null;
        }
        return bl2;
    }
}

