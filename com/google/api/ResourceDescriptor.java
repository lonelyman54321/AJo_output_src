/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ResourceDescriptor$1;
import com.google.api.ResourceDescriptor$Builder;
import com.google.api.ResourceDescriptor$History;
import com.google.api.ResourceDescriptorOrBuilder;
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

public final class ResourceDescriptor
extends GeneratedMessageLite
implements ResourceDescriptorOrBuilder {
    private static final ResourceDescriptor DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String nameField_;
    private Internal$ProtobufList pattern_;
    private String plural_;
    private String singular_;
    private String type_;

    static {
        ResourceDescriptor resourceDescriptor;
        DEFAULT_INSTANCE = resourceDescriptor = new ResourceDescriptor();
        GeneratedMessageLite.registerDefaultInstance(ResourceDescriptor.class, resourceDescriptor);
    }

    private ResourceDescriptor() {
        Internal$ProtobufList internal$ProtobufList;
        String string2;
        this.type_ = string2 = "";
        this.pattern_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.nameField_ = string2;
        this.plural_ = string2;
        this.singular_ = string2;
    }

    public static /* synthetic */ ResourceDescriptor access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ResourceDescriptor resourceDescriptor, String string2) {
        resourceDescriptor.setType(string2);
    }

    public static /* synthetic */ void access$1000(ResourceDescriptor resourceDescriptor) {
        resourceDescriptor.clearNameField();
    }

    public static /* synthetic */ void access$1100(ResourceDescriptor resourceDescriptor, ByteString byteString) {
        resourceDescriptor.setNameFieldBytes(byteString);
    }

    public static /* synthetic */ void access$1200(ResourceDescriptor resourceDescriptor, int n3) {
        resourceDescriptor.setHistoryValue(n3);
    }

    public static /* synthetic */ void access$1300(ResourceDescriptor resourceDescriptor, ResourceDescriptor$History resourceDescriptor$History) {
        resourceDescriptor.setHistory(resourceDescriptor$History);
    }

    public static /* synthetic */ void access$1400(ResourceDescriptor resourceDescriptor) {
        resourceDescriptor.clearHistory();
    }

    public static /* synthetic */ void access$1500(ResourceDescriptor resourceDescriptor, String string2) {
        resourceDescriptor.setPlural(string2);
    }

    public static /* synthetic */ void access$1600(ResourceDescriptor resourceDescriptor) {
        resourceDescriptor.clearPlural();
    }

    public static /* synthetic */ void access$1700(ResourceDescriptor resourceDescriptor, ByteString byteString) {
        resourceDescriptor.setPluralBytes(byteString);
    }

    public static /* synthetic */ void access$1800(ResourceDescriptor resourceDescriptor, String string2) {
        resourceDescriptor.setSingular(string2);
    }

    public static /* synthetic */ void access$1900(ResourceDescriptor resourceDescriptor) {
        resourceDescriptor.clearSingular();
    }

    public static /* synthetic */ void access$200(ResourceDescriptor resourceDescriptor) {
        resourceDescriptor.clearType();
    }

    public static /* synthetic */ void access$2000(ResourceDescriptor resourceDescriptor, ByteString byteString) {
        resourceDescriptor.setSingularBytes(byteString);
    }

    public static /* synthetic */ void access$300(ResourceDescriptor resourceDescriptor, ByteString byteString) {
        resourceDescriptor.setTypeBytes(byteString);
    }

    public static /* synthetic */ void access$400(ResourceDescriptor resourceDescriptor, int n3, String string2) {
        resourceDescriptor.setPattern(n3, string2);
    }

    public static /* synthetic */ void access$500(ResourceDescriptor resourceDescriptor, String string2) {
        resourceDescriptor.addPattern(string2);
    }

    public static /* synthetic */ void access$600(ResourceDescriptor resourceDescriptor, Iterable iterable) {
        resourceDescriptor.addAllPattern(iterable);
    }

    public static /* synthetic */ void access$700(ResourceDescriptor resourceDescriptor) {
        resourceDescriptor.clearPattern();
    }

    public static /* synthetic */ void access$800(ResourceDescriptor resourceDescriptor, ByteString byteString) {
        resourceDescriptor.addPatternBytes(byteString);
    }

    public static /* synthetic */ void access$900(ResourceDescriptor resourceDescriptor, String string2) {
        resourceDescriptor.setNameField(string2);
    }

    private void addAllPattern(Iterable iterable) {
        this.ensurePatternIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.pattern_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addPattern(String string2) {
        string2.getClass();
        this.ensurePatternIsMutable();
        this.pattern_.add(string2);
    }

    private void addPatternBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensurePatternIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.pattern_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void clearHistory() {
        this.history_ = 0;
    }

    private void clearNameField() {
        String string2;
        this.nameField_ = string2 = ResourceDescriptor.getDefaultInstance().getNameField();
    }

    private void clearPattern() {
        Internal$ProtobufList internal$ProtobufList;
        this.pattern_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearPlural() {
        String string2;
        this.plural_ = string2 = ResourceDescriptor.getDefaultInstance().getPlural();
    }

    private void clearSingular() {
        String string2;
        this.singular_ = string2 = ResourceDescriptor.getDefaultInstance().getSingular();
    }

    private void clearType() {
        String string2;
        this.type_ = string2 = ResourceDescriptor.getDefaultInstance().getType();
    }

    private void ensurePatternIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.pattern_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.pattern_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static ResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ResourceDescriptor$Builder newBuilder() {
        return (ResourceDescriptor$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceDescriptor$Builder newBuilder(ResourceDescriptor resourceDescriptor) {
        return (ResourceDescriptor$Builder)DEFAULT_INSTANCE.createBuilder(resourceDescriptor);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (ResourceDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(ByteString byteString) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ResourceDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(CodedInputStream codedInputStream) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResourceDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(byte[] byArray) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ResourceDescriptor parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHistory(ResourceDescriptor$History resourceDescriptor$History) {
        int n3;
        this.history_ = n3 = resourceDescriptor$History.getNumber();
    }

    private void setHistoryValue(int n3) {
        this.history_ = n3;
    }

    private void setNameField(String string2) {
        string2.getClass();
        this.nameField_ = string2;
    }

    private void setNameFieldBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.nameField_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setPattern(int n3, String string2) {
        string2.getClass();
        this.ensurePatternIsMutable();
        this.pattern_.set(n3, string2);
    }

    private void setPlural(String string2) {
        string2.getClass();
        this.plural_ = string2;
    }

    private void setPluralBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.plural_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setSingular(String string2) {
        string2.getClass();
        this.singular_ = string2;
    }

    private void setSingularBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.singular_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setType(String string2) {
        string2.getClass();
        this.type_ = string2;
    }

    private void setTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.type_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = ResourceDescriptor$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = ResourceDescriptor.class;
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
                objectArray = new Object[6];
                objectArray[0] = "type_";
                objectArray[by2] = "pattern_";
                objectArray[2] = "nameField_";
                objectArray[3] = "history_";
                objectArray[4] = "plural_";
                objectArray[5] = "singular_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u021a\u0003\u0208\u0004\f\u0005\u0208\u0006\u0208", objectArray);
            }
            case 2: {
                return new ResourceDescriptor$Builder(null);
            }
            case 1: 
        }
        return new ResourceDescriptor();
    }

    public ResourceDescriptor$History getHistory() {
        int n3 = this.history_;
        ResourceDescriptor$History resourceDescriptor$History = ResourceDescriptor$History.forNumber(n3);
        if (resourceDescriptor$History == null) {
            resourceDescriptor$History = ResourceDescriptor$History.UNRECOGNIZED;
        }
        return resourceDescriptor$History;
    }

    public int getHistoryValue() {
        return this.history_;
    }

    public String getNameField() {
        return this.nameField_;
    }

    public ByteString getNameFieldBytes() {
        return ByteString.copyFromUtf8(this.nameField_);
    }

    public String getPattern(int n3) {
        return (String)this.pattern_.get(n3);
    }

    public ByteString getPatternBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.pattern_.get(n3));
    }

    public int getPatternCount() {
        return this.pattern_.size();
    }

    public List getPatternList() {
        return this.pattern_;
    }

    public String getPlural() {
        return this.plural_;
    }

    public ByteString getPluralBytes() {
        return ByteString.copyFromUtf8(this.plural_);
    }

    public String getSingular() {
        return this.singular_;
    }

    public ByteString getSingularBytes() {
        return ByteString.copyFromUtf8(this.singular_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
}

