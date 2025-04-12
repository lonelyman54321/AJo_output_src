/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Api$1;
import com.google.protobuf.Api$Builder;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Method;
import com.google.protobuf.MethodOrBuilder;
import com.google.protobuf.Mixin;
import com.google.protobuf.MixinOrBuilder;
import com.google.protobuf.Option;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContext$Builder;
import com.google.protobuf.SourceContextOrBuilder;
import com.google.protobuf.Syntax;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Api
extends GeneratedMessageLite
implements ApiOrBuilder {
    private static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Internal$ProtobufList methods_;
    private Internal$ProtobufList mixins_;
    private String name_;
    private Internal$ProtobufList options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String version_;

    static {
        Api api;
        DEFAULT_INSTANCE = api = new Api();
        GeneratedMessageLite.registerDefaultInstance(Api.class, api);
    }

    private Api() {
        Internal$ProtobufList internal$ProtobufList;
        Object object = "";
        this.name_ = object;
        this.methods_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.version_ = object;
        this.mixins_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Api access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Api api, String string2) {
        api.setName(string2);
    }

    public static /* synthetic */ void access$1000(Api api, int n3, Option option) {
        api.setOptions(n3, option);
    }

    public static /* synthetic */ void access$1100(Api api, Option option) {
        api.addOptions(option);
    }

    public static /* synthetic */ void access$1200(Api api, int n3, Option option) {
        api.addOptions(n3, option);
    }

    public static /* synthetic */ void access$1300(Api api, Iterable iterable) {
        api.addAllOptions(iterable);
    }

    public static /* synthetic */ void access$1400(Api api) {
        api.clearOptions();
    }

    public static /* synthetic */ void access$1500(Api api, int n3) {
        api.removeOptions(n3);
    }

    public static /* synthetic */ void access$1600(Api api, String string2) {
        api.setVersion(string2);
    }

    public static /* synthetic */ void access$1700(Api api) {
        api.clearVersion();
    }

    public static /* synthetic */ void access$1800(Api api, ByteString byteString) {
        api.setVersionBytes(byteString);
    }

    public static /* synthetic */ void access$1900(Api api, SourceContext sourceContext) {
        api.setSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$200(Api api) {
        api.clearName();
    }

    public static /* synthetic */ void access$2000(Api api, SourceContext sourceContext) {
        api.mergeSourceContext(sourceContext);
    }

    public static /* synthetic */ void access$2100(Api api) {
        api.clearSourceContext();
    }

    public static /* synthetic */ void access$2200(Api api, int n3, Mixin mixin) {
        api.setMixins(n3, mixin);
    }

    public static /* synthetic */ void access$2300(Api api, Mixin mixin) {
        api.addMixins(mixin);
    }

    public static /* synthetic */ void access$2400(Api api, int n3, Mixin mixin) {
        api.addMixins(n3, mixin);
    }

    public static /* synthetic */ void access$2500(Api api, Iterable iterable) {
        api.addAllMixins(iterable);
    }

    public static /* synthetic */ void access$2600(Api api) {
        api.clearMixins();
    }

    public static /* synthetic */ void access$2700(Api api, int n3) {
        api.removeMixins(n3);
    }

    public static /* synthetic */ void access$2800(Api api, int n3) {
        api.setSyntaxValue(n3);
    }

    public static /* synthetic */ void access$2900(Api api, Syntax syntax) {
        api.setSyntax(syntax);
    }

    public static /* synthetic */ void access$300(Api api, ByteString byteString) {
        api.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$3000(Api api) {
        api.clearSyntax();
    }

    public static /* synthetic */ void access$400(Api api, int n3, Method method) {
        api.setMethods(n3, method);
    }

    public static /* synthetic */ void access$500(Api api, Method method) {
        api.addMethods(method);
    }

    public static /* synthetic */ void access$600(Api api, int n3, Method method) {
        api.addMethods(n3, method);
    }

    public static /* synthetic */ void access$700(Api api, Iterable iterable) {
        api.addAllMethods(iterable);
    }

    public static /* synthetic */ void access$800(Api api) {
        api.clearMethods();
    }

    public static /* synthetic */ void access$900(Api api, int n3) {
        api.removeMethods(n3);
    }

    private void addAllMethods(Iterable iterable) {
        this.ensureMethodsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.methods_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllMixins(Iterable iterable) {
        this.ensureMixinsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.mixins_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllOptions(Iterable iterable) {
        this.ensureOptionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.options_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addMethods(int n3, Method method) {
        method.getClass();
        this.ensureMethodsIsMutable();
        this.methods_.add(n3, method);
    }

    private void addMethods(Method method) {
        method.getClass();
        this.ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    private void addMixins(int n3, Mixin mixin) {
        mixin.getClass();
        this.ensureMixinsIsMutable();
        this.mixins_.add(n3, mixin);
    }

    private void addMixins(Mixin mixin) {
        mixin.getClass();
        this.ensureMixinsIsMutable();
        this.mixins_.add(mixin);
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

    private void clearMethods() {
        Internal$ProtobufList internal$ProtobufList;
        this.methods_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMixins() {
        Internal$ProtobufList internal$ProtobufList;
        this.mixins_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Api.getDefaultInstance().getName();
    }

    private void clearOptions() {
        Internal$ProtobufList internal$ProtobufList;
        this.options_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSourceContext() {
        int n3;
        this.sourceContext_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
    }

    private void clearSyntax() {
        this.syntax_ = 0;
    }

    private void clearVersion() {
        String string2;
        this.version_ = string2 = Api.getDefaultInstance().getVersion();
    }

    private void ensureMethodsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.methods_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.methods_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureMixinsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.mixins_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.mixins_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureOptionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.options_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.options_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeSourceContext(SourceContext sourceContext) {
        int n3;
        SourceContext sourceContext2;
        sourceContext.getClass();
        SourceContextOrBuilder sourceContextOrBuilder = this.sourceContext_;
        if (sourceContextOrBuilder != null && sourceContextOrBuilder != (sourceContext2 = SourceContext.getDefaultInstance())) {
            sourceContextOrBuilder = SourceContext.newBuilder(this.sourceContext_);
            this.sourceContext_ = sourceContext = (SourceContext)((SourceContext$Builder)((GeneratedMessageLite$Builder)((Object)sourceContextOrBuilder)).mergeFrom(sourceContext)).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    public static Api$Builder newBuilder() {
        return (Api$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Api$Builder newBuilder(Api api) {
        return (Api$Builder)DEFAULT_INSTANCE.createBuilder(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream) {
        return (Api)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Api)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(ByteString byteString) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Api parseFrom(CodedInputStream codedInputStream) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Api parseFrom(InputStream inputStream) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Api parseFrom(byte[] byArray) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Api parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeMethods(int n3) {
        this.ensureMethodsIsMutable();
        this.methods_.remove(n3);
    }

    private void removeMixins(int n3) {
        this.ensureMixinsIsMutable();
        this.mixins_.remove(n3);
    }

    private void removeOptions(int n3) {
        this.ensureOptionsIsMutable();
        this.options_.remove(n3);
    }

    private void setMethods(int n3, Method method) {
        method.getClass();
        this.ensureMethodsIsMutable();
        this.methods_.set(n3, method);
    }

    private void setMixins(int n3, Mixin mixin) {
        mixin.getClass();
        this.ensureMixinsIsMutable();
        this.mixins_.set(n3, mixin);
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

    private void setSourceContext(SourceContext sourceContext) {
        int n3;
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    private void setSyntax(Syntax syntax) {
        int n3;
        this.syntax_ = n3 = syntax.getNumber();
    }

    private void setSyntaxValue(int n3) {
        this.syntax_ = n3;
    }

    private void setVersion(String string2) {
        string2.getClass();
        this.version_ = string2;
    }

    private void setVersionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.version_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Api$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Api.class;
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
                objectArray = new Object[11];
                objectArray[0] = "bitField0_";
                objectArray[by2] = "name_";
                objectArray[2] = "methods_";
                objectArray[3] = Method.class;
                objectArray[4] = "options_";
                objectArray[5] = Option.class;
                objectArray[6] = "version_";
                objectArray[7] = "sourceContext_";
                objectArray[8] = "mixins_";
                objectArray[9] = Mixin.class;
                objectArray[10] = "syntax_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0208\u0002\u001b\u0003\u001b\u0004\u0208\u0005\u1009\u0000\u0006\u001b\u0007\f", objectArray);
            }
            case 2: {
                return new Api$Builder(null);
            }
            case 1: 
        }
        return new Api();
    }

    public Method getMethods(int n3) {
        return (Method)this.methods_.get(n3);
    }

    public int getMethodsCount() {
        return this.methods_.size();
    }

    public List getMethodsList() {
        return this.methods_;
    }

    public MethodOrBuilder getMethodsOrBuilder(int n3) {
        return (MethodOrBuilder)this.methods_.get(n3);
    }

    public List getMethodsOrBuilderList() {
        return this.methods_;
    }

    public Mixin getMixins(int n3) {
        return (Mixin)this.mixins_.get(n3);
    }

    public int getMixinsCount() {
        return this.mixins_.size();
    }

    public List getMixinsList() {
        return this.mixins_;
    }

    public MixinOrBuilder getMixinsOrBuilder(int n3) {
        return (MixinOrBuilder)this.mixins_.get(n3);
    }

    public List getMixinsOrBuilderList() {
        return this.mixins_;
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

    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            sourceContext = SourceContext.getDefaultInstance();
        }
        return sourceContext;
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

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    public boolean hasSourceContext() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

