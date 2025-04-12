/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode;
import com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$Builder;
import com.google.protobuf.GeneratedMessageLite$ExtendableBuilder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$FileOptions$Builder
extends GeneratedMessageLite$ExtendableBuilder
implements DescriptorProtos$FileOptionsOrBuilder {
    private DescriptorProtos$FileOptions$Builder() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = DescriptorProtos$FileOptions.access$25100();
        super(descriptorProtos$FileOptions);
    }

    public /* synthetic */ DescriptorProtos$FileOptions$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$FileOptions$Builder addAllUninterpretedOption(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$30500((DescriptorProtos$FileOptions)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = (DescriptorProtos$FileOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$FileOptions.access$30400(descriptorProtos$FileOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder addUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$30400((DescriptorProtos$FileOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = (DescriptorProtos$FileOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$FileOptions.access$30300(descriptorProtos$FileOptions, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$30300((DescriptorProtos$FileOptions)this.instance, descriptorProtos$UninterpretedOption);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearCcEnableArenas() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28000((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearCcGenericServices() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27000((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearCsharpNamespace() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28500((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearDeprecated() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27800((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearGoPackage() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26700((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearJavaGenerateEqualsAndHash() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26100((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearJavaGenericServices() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27200((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearJavaMultipleFiles() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$25900((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearJavaOuterClassname() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$25600((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearJavaPackage() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$25300((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearJavaStringCheckUtf8() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26300((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearObjcClassPrefix() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28200((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearOptimizeFor() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26500((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearPhpClassPrefix() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29100((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearPhpGenericServices() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27600((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearPhpMetadataNamespace() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29700((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearPhpNamespace() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29400((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearPyGenericServices() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27400((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearRubyPackage() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$30000((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearSwiftPrefix() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28800((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder clearUninterpretedOption() {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$30600((DescriptorProtos$FileOptions)this.instance);
        return this;
    }

    public boolean getCcEnableArenas() {
        return ((DescriptorProtos$FileOptions)this.instance).getCcEnableArenas();
    }

    public boolean getCcGenericServices() {
        return ((DescriptorProtos$FileOptions)this.instance).getCcGenericServices();
    }

    public String getCsharpNamespace() {
        return ((DescriptorProtos$FileOptions)this.instance).getCsharpNamespace();
    }

    public ByteString getCsharpNamespaceBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getCsharpNamespaceBytes();
    }

    public boolean getDeprecated() {
        return ((DescriptorProtos$FileOptions)this.instance).getDeprecated();
    }

    public String getGoPackage() {
        return ((DescriptorProtos$FileOptions)this.instance).getGoPackage();
    }

    public ByteString getGoPackageBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getGoPackageBytes();
    }

    public boolean getJavaGenerateEqualsAndHash() {
        return ((DescriptorProtos$FileOptions)this.instance).getJavaGenerateEqualsAndHash();
    }

    public boolean getJavaGenericServices() {
        return ((DescriptorProtos$FileOptions)this.instance).getJavaGenericServices();
    }

    public boolean getJavaMultipleFiles() {
        return ((DescriptorProtos$FileOptions)this.instance).getJavaMultipleFiles();
    }

    public String getJavaOuterClassname() {
        return ((DescriptorProtos$FileOptions)this.instance).getJavaOuterClassname();
    }

    public ByteString getJavaOuterClassnameBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getJavaOuterClassnameBytes();
    }

    public String getJavaPackage() {
        return ((DescriptorProtos$FileOptions)this.instance).getJavaPackage();
    }

    public ByteString getJavaPackageBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getJavaPackageBytes();
    }

    public boolean getJavaStringCheckUtf8() {
        return ((DescriptorProtos$FileOptions)this.instance).getJavaStringCheckUtf8();
    }

    public String getObjcClassPrefix() {
        return ((DescriptorProtos$FileOptions)this.instance).getObjcClassPrefix();
    }

    public ByteString getObjcClassPrefixBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getObjcClassPrefixBytes();
    }

    public DescriptorProtos$FileOptions$OptimizeMode getOptimizeFor() {
        return ((DescriptorProtos$FileOptions)this.instance).getOptimizeFor();
    }

    public String getPhpClassPrefix() {
        return ((DescriptorProtos$FileOptions)this.instance).getPhpClassPrefix();
    }

    public ByteString getPhpClassPrefixBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getPhpClassPrefixBytes();
    }

    public boolean getPhpGenericServices() {
        return ((DescriptorProtos$FileOptions)this.instance).getPhpGenericServices();
    }

    public String getPhpMetadataNamespace() {
        return ((DescriptorProtos$FileOptions)this.instance).getPhpMetadataNamespace();
    }

    public ByteString getPhpMetadataNamespaceBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getPhpMetadataNamespaceBytes();
    }

    public String getPhpNamespace() {
        return ((DescriptorProtos$FileOptions)this.instance).getPhpNamespace();
    }

    public ByteString getPhpNamespaceBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getPhpNamespaceBytes();
    }

    public boolean getPyGenericServices() {
        return ((DescriptorProtos$FileOptions)this.instance).getPyGenericServices();
    }

    public String getRubyPackage() {
        return ((DescriptorProtos$FileOptions)this.instance).getRubyPackage();
    }

    public ByteString getRubyPackageBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getRubyPackageBytes();
    }

    public String getSwiftPrefix() {
        return ((DescriptorProtos$FileOptions)this.instance).getSwiftPrefix();
    }

    public ByteString getSwiftPrefixBytes() {
        return ((DescriptorProtos$FileOptions)this.instance).getSwiftPrefixBytes();
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int n3) {
        return ((DescriptorProtos$FileOptions)this.instance).getUninterpretedOption(n3);
    }

    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$FileOptions)this.instance).getUninterpretedOptionCount();
    }

    public List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileOptions)this.instance).getUninterpretedOptionList());
    }

    public boolean hasCcEnableArenas() {
        return ((DescriptorProtos$FileOptions)this.instance).hasCcEnableArenas();
    }

    public boolean hasCcGenericServices() {
        return ((DescriptorProtos$FileOptions)this.instance).hasCcGenericServices();
    }

    public boolean hasCsharpNamespace() {
        return ((DescriptorProtos$FileOptions)this.instance).hasCsharpNamespace();
    }

    public boolean hasDeprecated() {
        return ((DescriptorProtos$FileOptions)this.instance).hasDeprecated();
    }

    public boolean hasGoPackage() {
        return ((DescriptorProtos$FileOptions)this.instance).hasGoPackage();
    }

    public boolean hasJavaGenerateEqualsAndHash() {
        return ((DescriptorProtos$FileOptions)this.instance).hasJavaGenerateEqualsAndHash();
    }

    public boolean hasJavaGenericServices() {
        return ((DescriptorProtos$FileOptions)this.instance).hasJavaGenericServices();
    }

    public boolean hasJavaMultipleFiles() {
        return ((DescriptorProtos$FileOptions)this.instance).hasJavaMultipleFiles();
    }

    public boolean hasJavaOuterClassname() {
        return ((DescriptorProtos$FileOptions)this.instance).hasJavaOuterClassname();
    }

    public boolean hasJavaPackage() {
        return ((DescriptorProtos$FileOptions)this.instance).hasJavaPackage();
    }

    public boolean hasJavaStringCheckUtf8() {
        return ((DescriptorProtos$FileOptions)this.instance).hasJavaStringCheckUtf8();
    }

    public boolean hasObjcClassPrefix() {
        return ((DescriptorProtos$FileOptions)this.instance).hasObjcClassPrefix();
    }

    public boolean hasOptimizeFor() {
        return ((DescriptorProtos$FileOptions)this.instance).hasOptimizeFor();
    }

    public boolean hasPhpClassPrefix() {
        return ((DescriptorProtos$FileOptions)this.instance).hasPhpClassPrefix();
    }

    public boolean hasPhpGenericServices() {
        return ((DescriptorProtos$FileOptions)this.instance).hasPhpGenericServices();
    }

    public boolean hasPhpMetadataNamespace() {
        return ((DescriptorProtos$FileOptions)this.instance).hasPhpMetadataNamespace();
    }

    public boolean hasPhpNamespace() {
        return ((DescriptorProtos$FileOptions)this.instance).hasPhpNamespace();
    }

    public boolean hasPyGenericServices() {
        return ((DescriptorProtos$FileOptions)this.instance).hasPyGenericServices();
    }

    public boolean hasRubyPackage() {
        return ((DescriptorProtos$FileOptions)this.instance).hasRubyPackage();
    }

    public boolean hasSwiftPrefix() {
        return ((DescriptorProtos$FileOptions)this.instance).hasSwiftPrefix();
    }

    public DescriptorProtos$FileOptions$Builder removeUninterpretedOption(int n3) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$30700((DescriptorProtos$FileOptions)this.instance, n3);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setCcEnableArenas(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27900((DescriptorProtos$FileOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setCcGenericServices(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26900((DescriptorProtos$FileOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setCsharpNamespace(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28400((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setCsharpNamespaceBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28600((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setDeprecated(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27700((DescriptorProtos$FileOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setGoPackage(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26600((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setGoPackageBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26800((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setJavaGenerateEqualsAndHash(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26000((DescriptorProtos$FileOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setJavaGenericServices(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27100((DescriptorProtos$FileOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setJavaMultipleFiles(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$25800((DescriptorProtos$FileOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setJavaOuterClassname(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$25500((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setJavaOuterClassnameBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$25700((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setJavaPackage(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$25200((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setJavaPackageBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$25400((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setJavaStringCheckUtf8(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26200((DescriptorProtos$FileOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setObjcClassPrefix(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28100((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setObjcClassPrefixBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28300((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setOptimizeFor(DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeMode) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$26400((DescriptorProtos$FileOptions)this.instance, descriptorProtos$FileOptions$OptimizeMode);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setPhpClassPrefix(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29000((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setPhpClassPrefixBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29200((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setPhpGenericServices(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27500((DescriptorProtos$FileOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setPhpMetadataNamespace(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29600((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setPhpMetadataNamespaceBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29800((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setPhpNamespace(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29300((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setPhpNamespaceBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29500((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setPyGenericServices(boolean bl2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$27300((DescriptorProtos$FileOptions)this.instance, bl2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setRubyPackage(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$29900((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setRubyPackageBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$30100((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setSwiftPrefix(String string2) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28700((DescriptorProtos$FileOptions)this.instance, string2);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setSwiftPrefixBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$28900((DescriptorProtos$FileOptions)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption$Builder descriptorProtos$UninterpretedOptionOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = (DescriptorProtos$FileOptions)this.instance;
        descriptorProtos$UninterpretedOptionOrBuilder = (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder.build();
        DescriptorProtos$FileOptions.access$30200(descriptorProtos$FileOptions, n3, (DescriptorProtos$UninterpretedOption)descriptorProtos$UninterpretedOptionOrBuilder);
        return this;
    }

    public DescriptorProtos$FileOptions$Builder setUninterpretedOption(int n3, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        this.copyOnWrite();
        DescriptorProtos$FileOptions.access$30200((DescriptorProtos$FileOptions)this.instance, n3, descriptorProtos$UninterpretedOption);
        return this;
    }
}

