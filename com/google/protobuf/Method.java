/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Method$1;
import com.google.protobuf.Method$Builder;
import com.google.protobuf.MethodOrBuilder;
import com.google.protobuf.Option;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Syntax;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Method
extends GeneratedMessageLite
implements MethodOrBuilder {
    private static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile Parser PARSER;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private String name_;
    private Internal$ProtobufList options_;
    private boolean requestStreaming_;
    private String requestTypeUrl_;
    private boolean responseStreaming_;
    private String responseTypeUrl_;
    private int syntax_;

    static {
        Method method;
        DEFAULT_INSTANCE = method = new Method();
        GeneratedMessageLite.registerDefaultInstance(Method.class, method);
    }

    private Method() {
        Object object = "";
        this.name_ = object;
        this.requestTypeUrl_ = object;
        this.responseTypeUrl_ = object;
        this.options_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Method access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Method method, String string2) {
        method.setName(string2);
    }

    public static /* synthetic */ void access$1000(Method method) {
        method.clearResponseTypeUrl();
    }

    public static /* synthetic */ void access$1100(Method method, ByteString byteString) {
        method.setResponseTypeUrlBytes(byteString);
    }

    public static /* synthetic */ void access$1200(Method method, boolean bl2) {
        method.setResponseStreaming(bl2);
    }

    public static /* synthetic */ void access$1300(Method method) {
        method.clearResponseStreaming();
    }

    public static /* synthetic */ void access$1400(Method method, int n3, Option option) {
        method.setOptions(n3, option);
    }

    public static /* synthetic */ void access$1500(Method method, Option option) {
        method.addOptions(option);
    }

    public static /* synthetic */ void access$1600(Method method, int n3, Option option) {
        method.addOptions(n3, option);
    }

    public static /* synthetic */ void access$1700(Method method, Iterable iterable) {
        method.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$1800(Method method) {
        method.clearOptions();
    }

    public static /* synthetic */ void access$1900(Method method, int n3) {
        method.removeOptions(n3);
    }

    public static /* synthetic */ void access$200(Method method) {
        method.clearName();
    }

    public static /* synthetic */ void access$2000(Method method, int n3) {
        method.setSyntaxValue(n3);
    }

    public static /* synthetic */ void access$2100(Method method, Syntax syntax) {
        method.setSyntax(syntax);
    }

    public static /* synthetic */ void access$2200(Method method) {
        method.clearSyntax();
    }

    public static /* synthetic */ void access$300(Method method, ByteString byteString) {
        method.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Method method, String string2) {
        method.setRequestTypeUrl(string2);
    }

    public static /* synthetic */ void access$500(Method method) {
        method.clearRequestTypeUrl();
    }

    public static /* synthetic */ void access$600(Method method, ByteString byteString) {
        method.setRequestTypeUrlBytes(byteString);
    }

    public static /* synthetic */ void access$700(Method method, boolean bl2) {
        method.setRequestStreaming(bl2);
    }

    public static /* synthetic */ void access$800(Method method) {
        method.clearRequestStreaming();
    }

    public static /* synthetic */ void access$900(Method method, String string2) {
        method.setResponseTypeUrl(string2);
    }

    private void addAllOptions(Iterable iterable) {
        this.ensureOptionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.options_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addOptions(int n3, Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(n3, option);
    }

    private void addOptions(Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.add(option);
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Method.getDefaultInstance().getName();
    }

    private void clearOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    private void clearRequestTypeUrl() {
        String string2;
        this.requestTypeUrl_ = string2 = Method.getDefaultInstance().getRequestTypeUrl();
    }

    private void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    private void clearResponseTypeUrl() {
        String string2;
        this.responseTypeUrl_ = string2 = Method.getDefaultInstance().getResponseTypeUrl();
    }

    private void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureOptionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.options_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.options_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Method$Builder newBuilder() {
        return (Method$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Method$Builder newBuilder(Method method) {
        return (Method$Builder)DEFAULT_INSTANCE.createBuilder(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream) {
        return (Method)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Method)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Method parseFrom(ByteString byteString) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Method parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Method parseFrom(CodedInputStream codedInputStream) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Method parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Method parseFrom(InputStream inputStream) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Method parseFrom(byte[] byArray) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Method parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Method)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeOptions(int n3) {
        this.ensureOptionsIsMutable();
        this.options_.remove(n3);
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setOptions(int n3, Option option) {
        option.getClass();
        this.ensureOptionsIsMutable();
        this.options_.set(n3, option);
    }

    private void setRequestStreaming(boolean bl2) {
        this.requestStreaming_ = bl2;
    }

    private void setRequestTypeUrl(String string2) {
        string2.getClass();
        this.requestTypeUrl_ = string2;
    }

    private void setRequestTypeUrlBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.requestTypeUrl_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setResponseStreaming(boolean bl2) {
        this.responseStreaming_ = bl2;
    }

    private void setResponseTypeUrl(String string2) {
        string2.getClass();
        this.responseTypeUrl_ = string2;
    }

    private void setResponseTypeUrlBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.responseTypeUrl_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setSyntax(Syntax syntax) {
        int n3;
        this.syntax_ = n3 = syntax.getNumber();
    }

    private void setSyntaxValue(int n3) {
        this.syntax_ = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Method$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Method.class;
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
                objectArray[0] = "name_";
                objectArray[by2] = "requestTypeUrl_";
                objectArray[2] = "requestStreaming_";
                objectArray[3] = "responseTypeUrl_";
                objectArray[4] = "responseStreaming_";
                objectArray[5] = "options_";
                objectArray[6] = Option.class;
                objectArray[7] = "syntax_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0007\u0004\u0208\u0005\u0007\u0006\u001b\u0007\f", objectArray);
            }
            case 2: {
                return new Method$Builder(null);
            }
            case 1: 
        }
        return new Method();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public Option getOptions(int n3) {
        return (Option)this.options_.get(n3);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int n3) {
        return (OptionOrBuilder)this.options_.get(n3);
    }

    public List getOptionsOrBuilderList() {
        return this.options_;
    }

    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    public ByteString getRequestTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.requestTypeUrl_);
    }

    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    public ByteString getResponseTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.responseTypeUrl_);
    }

    public Syntax getSyntax() {
        int n3 = this.syntax_;
        Syntax syntax = Syntax.forNumber(n3);
        if (syntax == null) {
            syntax = Syntax.UNRECOGNIZED;
        }
        return syntax;
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }
}

