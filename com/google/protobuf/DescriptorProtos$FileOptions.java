/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$FileOptions$Builder;
import com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode;
import com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos$FileOptions
extends GeneratedMessageLite$ExtendableMessage
implements DescriptorProtos$FileOptionsOrBuilder {
    public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
    public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
    public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
    private static final DescriptorProtos$FileOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 23;
    public static final int GO_PACKAGE_FIELD_NUMBER = 11;
    public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
    public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
    public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
    public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
    public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
    public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
    public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
    public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
    private static volatile Parser PARSER;
    public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
    public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
    public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
    public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
    public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
    public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
    public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean ccEnableArenas_;
    private boolean ccGenericServices_;
    private String csharpNamespace_;
    private boolean deprecated_;
    private String goPackage_;
    private boolean javaGenerateEqualsAndHash_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private String javaOuterClassname_;
    private String javaPackage_;
    private boolean javaStringCheckUtf8_;
    private byte memoizedIsInitialized = (byte)2;
    private String objcClassPrefix_;
    private int optimizeFor_;
    private String phpClassPrefix_;
    private boolean phpGenericServices_;
    private String phpMetadataNamespace_;
    private String phpNamespace_;
    private boolean pyGenericServices_;
    private String rubyPackage_;
    private String swiftPrefix_;
    private Internal$ProtobufList uninterpretedOption_;

    static {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions;
        DEFAULT_INSTANCE = descriptorProtos$FileOptions = new DescriptorProtos$FileOptions();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileOptions.class, descriptorProtos$FileOptions);
    }

    private DescriptorProtos$FileOptions() {
        int n3;
        Object object = "";
        this.javaPackage_ = object;
        this.javaOuterClassname_ = object;
        this.optimizeFor_ = n3 = 1;
        this.goPackage_ = object;
        this.ccEnableArenas_ = n3;
        this.objcClassPrefix_ = object;
        this.csharpNamespace_ = object;
        this.swiftPrefix_ = object;
        this.phpClassPrefix_ = object;
        this.phpNamespace_ = object;
        this.phpMetadataNamespace_ = object;
        this.rubyPackage_ = object;
        this.uninterpretedOption_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ DescriptorProtos$FileOptions access$25100() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$25200(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setJavaPackage(string2);
    }

    public static /* synthetic */ void access$25300(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearJavaPackage();
    }

    public static /* synthetic */ void access$25400(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setJavaPackageBytes(byteString);
    }

    public static /* synthetic */ void access$25500(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setJavaOuterClassname(string2);
    }

    public static /* synthetic */ void access$25600(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearJavaOuterClassname();
    }

    public static /* synthetic */ void access$25700(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setJavaOuterClassnameBytes(byteString);
    }

    public static /* synthetic */ void access$25800(DescriptorProtos$FileOptions descriptorProtos$FileOptions, boolean bl2) {
        descriptorProtos$FileOptions.setJavaMultipleFiles(bl2);
    }

    public static /* synthetic */ void access$25900(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearJavaMultipleFiles();
    }

    public static /* synthetic */ void access$26000(DescriptorProtos$FileOptions descriptorProtos$FileOptions, boolean bl2) {
        descriptorProtos$FileOptions.setJavaGenerateEqualsAndHash(bl2);
    }

    public static /* synthetic */ void access$26100(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearJavaGenerateEqualsAndHash();
    }

    public static /* synthetic */ void access$26200(DescriptorProtos$FileOptions descriptorProtos$FileOptions, boolean bl2) {
        descriptorProtos$FileOptions.setJavaStringCheckUtf8(bl2);
    }

    public static /* synthetic */ void access$26300(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearJavaStringCheckUtf8();
    }

    public static /* synthetic */ void access$26400(DescriptorProtos$FileOptions descriptorProtos$FileOptions, DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeMode) {
        descriptorProtos$FileOptions.setOptimizeFor(descriptorProtos$FileOptions$OptimizeMode);
    }

    public static /* synthetic */ void access$26500(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearOptimizeFor();
    }

    public static /* synthetic */ void access$26600(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setGoPackage(string2);
    }

    public static /* synthetic */ void access$26700(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearGoPackage();
    }

    public static /* synthetic */ void access$26800(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setGoPackageBytes(byteString);
    }

    public static /* synthetic */ void access$26900(DescriptorProtos$FileOptions descriptorProtos$FileOptions, boolean bl2) {
        descriptorProtos$FileOptions.setCcGenericServices(bl2);
    }

    public static /* synthetic */ void access$27000(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearCcGenericServices();
    }

    public static /* synthetic */ void access$27100(DescriptorProtos$FileOptions descriptorProtos$FileOptions, boolean bl2) {
        descriptorProtos$FileOptions.setJavaGenericServices(bl2);
    }

    public static /* synthetic */ void access$27200(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearJavaGenericServices();
    }

    public static /* synthetic */ void access$27300(DescriptorProtos$FileOptions descriptorProtos$FileOptions, boolean bl2) {
        descriptorProtos$FileOptions.setPyGenericServices(bl2);
    }

    public static /* synthetic */ void access$27400(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearPyGenericServices();
    }

    public static /* synthetic */ void access$27500(DescriptorProtos$FileOptions descriptorProtos$FileOptions, boolean bl2) {
        descriptorProtos$FileOptions.setPhpGenericServices(bl2);
    }

    public static /* synthetic */ void access$27600(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearPhpGenericServices();
    }

    public static /* synthetic */ void access$27700(DescriptorProtos$FileOptions descriptorProtos$FileOptions, boolean bl2) {
        descriptorProtos$FileOptions.setDeprecated(bl2);
    }

    public static /* synthetic */ void access$27800(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearDeprecated();
    }

    public static /* synthetic */ void access$27900(DescriptorProtos$FileOptions descriptorProtos$FileOptions, boolean bl2) {
        descriptorProtos$FileOptions.setCcEnableArenas(bl2);
    }

    public static /* synthetic */ void access$28000(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearCcEnableArenas();
    }

    public static /* synthetic */ void access$28100(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setObjcClassPrefix(string2);
    }

    public static /* synthetic */ void access$28200(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearObjcClassPrefix();
    }

    public static /* synthetic */ void access$28300(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setObjcClassPrefixBytes(byteString);
    }

    public static /* synthetic */ void access$28400(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setCsharpNamespace(string2);
    }

    public static /* synthetic */ void access$28500(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearCsharpNamespace();
    }

    public static /* synthetic */ void access$28600(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setCsharpNamespaceBytes(byteString);
    }

    public static /* synthetic */ void access$28700(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setSwiftPrefix(string2);
    }

    public static /* synthetic */ void access$28800(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearSwiftPrefix();
    }

    public static /* synthetic */ void access$28900(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setSwiftPrefixBytes(byteString);
    }

    public static /* synthetic */ void access$29000(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setPhpClassPrefix(string2);
    }

    public static /* synthetic */ void access$29100(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearPhpClassPrefix();
    }

    public static /* synthetic */ void access$29200(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setPhpClassPrefixBytes(byteString);
    }

    public static /* synthetic */ void access$29300(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setPhpNamespace(string2);
    }

    public static /* synthetic */ void access$29400(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearPhpNamespace();
    }

    public static /* synthetic */ void access$29500(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setPhpNamespaceBytes(byteString);
    }

    public static /* synthetic */ void access$29600(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setPhpMetadataNamespace(string2);
    }

    public static /* synthetic */ void access$29700(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearPhpMetadataNamespace();
    }

    public static /* synthetic */ void access$29800(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setPhpMetadataNamespaceBytes(byteString);
    }

    public static /* synthetic */ void access$29900(DescriptorProtos$FileOptions descriptorProtos$FileOptions, String string2) {
        descriptorProtos$FileOptions.setRubyPackage(string2);
    }

    public static /* synthetic */ void access$30000(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearRubyPackage();
    }

    public static /* synthetic */ void access$30100(DescriptorProtos$FileOptions descriptorProtos$FileOptions, ByteString byteString) {
        descriptorProtos$FileOptions.setRubyPackageBytes(byteString);
    }

    public static /* synthetic */ void access$30200(DescriptorProtos$FileOptions descriptorProtos$FileOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$FileOptions.setUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$30300(DescriptorProtos$FileOptions descriptorProtos$FileOptions, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$FileOptions.addUninterpretedOption(descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$30400(DescriptorProtos$FileOptions descriptorProtos$FileOptions, int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$FileOptions.addUninterpretedOption(n3, descriptorProtos$UninterpretedOption);
    }

    public static /* synthetic */ void access$30500(DescriptorProtos$FileOptions descriptorProtos$FileOptions, Iterable iterable) {
        descriptorProtos$FileOptions.addAllUninterpretedOption(iterable);
    }

    public static /* synthetic */ void access$30600(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.clearUninterpretedOption();
    }

    public static /* synthetic */ void access$30700(DescriptorProtos$FileOptions descriptorProtos$FileOptions, int n3) {
        descriptorProtos$FileOptions.removeUninterpretedOption(n3);
    }

    private void addAllUninterpretedOption(Iterable iterable) {
        this.ensureUninterpretedOptionIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.uninterpretedOption_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(n3, descriptorProtos$UninterpretedOption);
    }

    private void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    private void clearCcEnableArenas() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFEFFF;
        this.ccEnableArenas_ = true;
    }

    private void clearCcGenericServices() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFF7F;
        this.ccGenericServices_ = false;
    }

    private void clearCsharpNamespace() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFBFFF;
        this.csharpNamespace_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getCsharpNamespace();
    }

    private void clearDeprecated() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFF7FF;
        this.deprecated_ = false;
    }

    private void clearGoPackage() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFBF;
        this.goPackage_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getGoPackage();
    }

    private void clearJavaGenerateEqualsAndHash() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFF7;
        this.javaGenerateEqualsAndHash_ = false;
    }

    private void clearJavaGenericServices() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFEFF;
        this.javaGenericServices_ = false;
    }

    private void clearJavaMultipleFiles() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.javaMultipleFiles_ = false;
    }

    private void clearJavaOuterClassname() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.javaOuterClassname_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getJavaOuterClassname();
    }

    private void clearJavaPackage() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.javaPackage_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getJavaPackage();
    }

    private void clearJavaStringCheckUtf8() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFEF;
        this.javaStringCheckUtf8_ = false;
    }

    private void clearObjcClassPrefix() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFDFFF;
        this.objcClassPrefix_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getObjcClassPrefix();
    }

    private void clearOptimizeFor() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFDF;
        this.optimizeFor_ = 1;
    }

    private void clearPhpClassPrefix() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFEFFFF;
        this.phpClassPrefix_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getPhpClassPrefix();
    }

    private void clearPhpGenericServices() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFBFF;
        this.phpGenericServices_ = false;
    }

    private void clearPhpMetadataNamespace() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFBFFFF;
        this.phpMetadataNamespace_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getPhpMetadataNamespace();
    }

    private void clearPhpNamespace() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFDFFFF;
        this.phpNamespace_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getPhpNamespace();
    }

    private void clearPyGenericServices() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFDFF;
        this.pyGenericServices_ = false;
    }

    private void clearRubyPackage() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFF7FFFF;
        this.rubyPackage_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getRubyPackage();
    }

    private void clearSwiftPrefix() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFF7FFF;
        this.swiftPrefix_ = string2 = DescriptorProtos$FileOptions.getDefaultInstance().getSwiftPrefix();
    }

    private void clearUninterpretedOption() {
        Internal$ProtobufList internal$ProtobufList;
        this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.uninterpretedOption_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.uninterpretedOption_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static DescriptorProtos$FileOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$FileOptions$Builder newBuilder() {
        return (DescriptorProtos$FileOptions$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileOptions$Builder newBuilder(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        return (DescriptorProtos$FileOptions$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileOptions);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteString byteString) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$FileOptions parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] byArray) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$FileOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeUninterpretedOption(int n3) {
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(n3);
    }

    private void setCcEnableArenas(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x1000;
        this.ccEnableArenas_ = bl2;
    }

    private void setCcGenericServices(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x80;
        this.ccGenericServices_ = bl2;
    }

    private void setCsharpNamespace(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x4000;
        this.csharpNamespace_ = string2;
    }

    private void setCsharpNamespaceBytes(ByteString object) {
        int n3;
        this.csharpNamespace_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x4000;
    }

    private void setDeprecated(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x800;
        this.deprecated_ = bl2;
    }

    private void setGoPackage(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x40;
        this.goPackage_ = string2;
    }

    private void setGoPackageBytes(ByteString object) {
        int n3;
        this.goPackage_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x40;
    }

    private void setJavaGenerateEqualsAndHash(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 8;
        this.javaGenerateEqualsAndHash_ = bl2;
    }

    private void setJavaGenericServices(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x100;
        this.javaGenericServices_ = bl2;
    }

    private void setJavaMultipleFiles(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 4;
        this.javaMultipleFiles_ = bl2;
    }

    private void setJavaOuterClassname(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.javaOuterClassname_ = string2;
    }

    private void setJavaOuterClassnameBytes(ByteString object) {
        int n3;
        this.javaOuterClassname_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    private void setJavaPackage(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.javaPackage_ = string2;
    }

    private void setJavaPackageBytes(ByteString object) {
        int n3;
        this.javaPackage_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    private void setJavaStringCheckUtf8(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x10;
        this.javaStringCheckUtf8_ = bl2;
    }

    private void setObjcClassPrefix(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x2000;
        this.objcClassPrefix_ = string2;
    }

    private void setObjcClassPrefixBytes(ByteString object) {
        int n3;
        this.objcClassPrefix_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x2000;
    }

    private void setOptimizeFor(DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeMode) {
        int n3;
        this.optimizeFor_ = n3 = descriptorProtos$FileOptions$OptimizeMode.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 0x20;
    }

    private void setPhpClassPrefix(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x10000;
        this.phpClassPrefix_ = string2;
    }

    private void setPhpClassPrefixBytes(ByteString object) {
        int n3;
        this.phpClassPrefix_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x10000;
    }

    private void setPhpGenericServices(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x400;
        this.phpGenericServices_ = bl2;
    }

    private void setPhpMetadataNamespace(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x40000;
        this.phpMetadataNamespace_ = string2;
    }

    private void setPhpMetadataNamespaceBytes(ByteString object) {
        int n3;
        this.phpMetadataNamespace_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x40000;
    }

    private void setPhpNamespace(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x20000;
        this.phpNamespace_ = string2;
    }

    private void setPhpNamespaceBytes(ByteString object) {
        int n3;
        this.phpNamespace_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x20000;
    }

    private void setPyGenericServices(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x200;
        this.pyGenericServices_ = bl2;
    }

    private void setRubyPackage(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x80000;
        this.rubyPackage_ = string2;
    }

    private void setRubyPackageBytes(ByteString object) {
        int n3;
        this.rubyPackage_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x80000;
    }

    private void setSwiftPrefix(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x8000;
        this.swiftPrefix_ = string2;
    }

    private void setSwiftPrefixBytes(ByteString object) {
        int n3;
        this.swiftPrefix_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x8000;
    }

    private void setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        this.ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(n3, descriptorProtos$UninterpretedOption);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object objectArray, Object object2) {
        int n3 = 1;
        int[] nArray = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        int n4 = object.ordinal();
        n4 = nArray[n4];
        nArray = null;
        switch (n4) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                if (objectArray == null) {
                    n3 = 0;
                    object2 = null;
                }
                n4 = (byte)n3;
                this.memoizedIsInitialized = (byte)n4;
                return null;
            }
            case 6: {
                return this.memoizedIsInitialized;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                objectArray = DescriptorProtos$FileOptions.class;
                synchronized (objectArray) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
                        PARSER = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                object = DescriptorProtos$FileOptions$OptimizeMode.internalGetVerifier();
                objectArray = new Object[24];
                objectArray[0] = "bitField0_";
                objectArray[n3] = "javaPackage_";
                objectArray[2] = "javaOuterClassname_";
                objectArray[3] = "optimizeFor_";
                objectArray[4] = object;
                objectArray[5] = "javaMultipleFiles_";
                objectArray[6] = "goPackage_";
                objectArray[7] = "ccGenericServices_";
                objectArray[8] = "javaGenericServices_";
                objectArray[9] = "pyGenericServices_";
                objectArray[10] = "javaGenerateEqualsAndHash_";
                objectArray[11] = "deprecated_";
                objectArray[12] = "javaStringCheckUtf8_";
                objectArray[13] = "ccEnableArenas_";
                objectArray[14] = "objcClassPrefix_";
                objectArray[15] = "csharpNamespace_";
                objectArray[16] = "swiftPrefix_";
                objectArray[17] = "phpClassPrefix_";
                objectArray[18] = "phpNamespace_";
                objectArray[19] = "phpGenericServices_";
                objectArray[20] = "phpMetadataNamespace_";
                objectArray[21] = "rubyPackage_";
                objectArray[22] = "uninterpretedOption_";
                objectArray[23] = DescriptorProtos$UninterpretedOption.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u03e7\u0015\u0000\u0001\u0001\u0001\u1008\u0000\b\u1008\u0001\t\u100c\u0005\n\u1007\u0002\u000b\u1008\u0006\u0010\u1007\u0007\u0011\u1007\b\u0012\u1007\t\u0014\u1007\u0003\u0017\u1007\u000b\u001b\u1007\u0004\u001f\u1007\f$\u1008\r%\u1008\u000e'\u1008\u000f(\u1008\u0010)\u1008\u0011*\u1007\n,\u1008\u0012-\u1008\u0013\u03e7\u041b", objectArray);
            }
            case 2: {
                return new DescriptorProtos$FileOptions$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$FileOptions();
    }

    public boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    public boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    public String getCsharpNamespace() {
        return this.csharpNamespace_;
    }

    public ByteString getCsharpNamespaceBytes() {
        return ByteString.copyFromUtf8(this.csharpNamespace_);
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public String getGoPackage() {
        return this.goPackage_;
    }

    public ByteString getGoPackageBytes() {
        return ByteString.copyFromUtf8(this.goPackage_);
    }

    public boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    public boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    public boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    public String getJavaOuterClassname() {
        return this.javaOuterClassname_;
    }

    public ByteString getJavaOuterClassnameBytes() {
        return ByteString.copyFromUtf8(this.javaOuterClassname_);
    }

    public String getJavaPackage() {
        return this.javaPackage_;
    }

    public ByteString getJavaPackageBytes() {
        return ByteString.copyFromUtf8(this.javaPackage_);
    }

    public boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    public String getObjcClassPrefix() {
        return this.objcClassPrefix_;
    }

    public ByteString getObjcClassPrefixBytes() {
        return ByteString.copyFromUtf8(this.objcClassPrefix_);
    }

    public DescriptorProtos$FileOptions$OptimizeMode getOptimizeFor() {
        int n3 = this.optimizeFor_;
        DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeMode = DescriptorProtos$FileOptions$OptimizeMode.forNumber(n3);
        if (descriptorProtos$FileOptions$OptimizeMode == null) {
            descriptorProtos$FileOptions$OptimizeMode = DescriptorProtos$FileOptions$OptimizeMode.SPEED;
        }
        return descriptorProtos$FileOptions$OptimizeMode;
    }

    public String getPhpClassPrefix() {
        return this.phpClassPrefix_;
    }

    public ByteString getPhpClassPrefixBytes() {
        return ByteString.copyFromUtf8(this.phpClassPrefix_);
    }

    public boolean getPhpGenericServices() {
        return this.phpGenericServices_;
    }

    public String getPhpMetadataNamespace() {
        return this.phpMetadataNamespace_;
    }

    public ByteString getPhpMetadataNamespaceBytes() {
        return ByteString.copyFromUtf8(this.phpMetadataNamespace_);
    }

    public String getPhpNamespace() {
        return this.phpNamespace_;
    }

    public ByteString getPhpNamespaceBytes() {
        return ByteString.copyFromUtf8(this.phpNamespace_);
    }

    public boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    public String getRubyPackage() {
        return this.rubyPackage_;
    }

    public ByteString getRubyPackageBytes() {
        return ByteString.copyFromUtf8(this.rubyPackage_);
    }

    public String getSwiftPrefix() {
        return this.swiftPrefix_;
    }

    public ByteString getSwiftPrefixBytes() {
        return ByteString.copyFromUtf8(this.swiftPrefix_);
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return (DescriptorProtos$UninterpretedOption)this.uninterpretedOption_.get(n3);
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public List getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int n3) {
        return (DescriptorProtos$UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(n3);
    }

    public List getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    public boolean hasCcEnableArenas() {
        int n3 = this.bitField0_ & 0x1000;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasCcGenericServices() {
        int n3 = this.bitField0_ & 0x80;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasCsharpNamespace() {
        int n3 = this.bitField0_ & 0x4000;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasDeprecated() {
        int n3 = this.bitField0_ & 0x800;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasGoPackage() {
        int n3 = this.bitField0_ & 0x40;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasJavaGenerateEqualsAndHash() {
        int n3 = this.bitField0_ & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasJavaGenericServices() {
        int n3 = this.bitField0_ & 0x100;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasJavaMultipleFiles() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasJavaOuterClassname() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasJavaPackage() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasJavaStringCheckUtf8() {
        int n3 = this.bitField0_ & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasObjcClassPrefix() {
        int n3 = this.bitField0_ & 0x2000;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasOptimizeFor() {
        int n3 = this.bitField0_ & 0x20;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean hasPhpClassPrefix() {
        void var1_5;
        int bl2 = this.bitField0_;
        int n3 = 65536;
        int n4 = bl2 & n3;
        if (n4 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }

    public boolean hasPhpGenericServices() {
        int n3 = this.bitField0_ & 0x400;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean hasPhpMetadataNamespace() {
        void var1_5;
        int bl2 = this.bitField0_;
        int n3 = 262144;
        int n4 = bl2 & n3;
        if (n4 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }

    /*
     * WARNING - void declaration
     */
    public boolean hasPhpNamespace() {
        void var1_5;
        int bl2 = this.bitField0_;
        int n3 = 131072;
        int n4 = bl2 & n3;
        if (n4 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }

    public boolean hasPyGenericServices() {
        int n3 = this.bitField0_ & 0x200;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean hasRubyPackage() {
        void var1_5;
        int bl2 = this.bitField0_;
        int n3 = 524288;
        int n4 = bl2 & n3;
        if (n4 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }

    /*
     * WARNING - void declaration
     */
    public boolean hasSwiftPrefix() {
        void var1_5;
        int bl2 = this.bitField0_;
        int n3 = 32768;
        int n4 = bl2 & n3;
        if (n4 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }
}

