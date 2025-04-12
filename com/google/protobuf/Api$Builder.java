/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.Api$1;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Method;
import com.google.protobuf.Method$Builder;
import com.google.protobuf.Mixin;
import com.google.protobuf.Mixin$Builder;
import com.google.protobuf.Option;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContext$Builder;
import com.google.protobuf.Syntax;
import java.util.Collections;
import java.util.List;

public final class Api$Builder
extends GeneratedMessageLite$Builder
implements ApiOrBuilder {
    private Api$Builder() {
        Api api = Api.access$000();
        super(api);
    }

    public /* synthetic */ Api$Builder(Api$1 api$1) {
        this();
    }

    public Api$Builder addAllMethods(Iterable iterable) {
        this.copyOnWrite();
        Api.access$700((Api)this.instance, iterable);
        return this;
    }

    public Api$Builder addAllMixins(Iterable iterable) {
        this.copyOnWrite();
        Api.access$2500((Api)this.instance, iterable);
        return this;
    }

    public Api$Builder addAllOptions(Iterable iterable) {
        this.copyOnWrite();
        Api.access$1300((Api)this.instance, iterable);
        return this;
    }

    public Api$Builder addMethods(int n3, Method$Builder methodOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        methodOrBuilder = (Method)methodOrBuilder.build();
        Api.access$600(api, n3, (Method)methodOrBuilder);
        return this;
    }

    public Api$Builder addMethods(int n3, Method method) {
        this.copyOnWrite();
        Api.access$600((Api)this.instance, n3, method);
        return this;
    }

    public Api$Builder addMethods(Method$Builder methodOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        methodOrBuilder = (Method)methodOrBuilder.build();
        Api.access$500(api, (Method)methodOrBuilder);
        return this;
    }

    public Api$Builder addMethods(Method method) {
        this.copyOnWrite();
        Api.access$500((Api)this.instance, method);
        return this;
    }

    public Api$Builder addMixins(int n3, Mixin$Builder mixinOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        mixinOrBuilder = (Mixin)mixinOrBuilder.build();
        Api.access$2400(api, n3, (Mixin)mixinOrBuilder);
        return this;
    }

    public Api$Builder addMixins(int n3, Mixin mixin) {
        this.copyOnWrite();
        Api.access$2400((Api)this.instance, n3, mixin);
        return this;
    }

    public Api$Builder addMixins(Mixin$Builder mixinOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        mixinOrBuilder = (Mixin)mixinOrBuilder.build();
        Api.access$2300(api, (Mixin)mixinOrBuilder);
        return this;
    }

    public Api$Builder addMixins(Mixin mixin) {
        this.copyOnWrite();
        Api.access$2300((Api)this.instance, mixin);
        return this;
    }

    public Api$Builder addOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Api.access$1200(api, n3, (Option)optionOrBuilder);
        return this;
    }

    public Api$Builder addOptions(int n3, Option option) {
        this.copyOnWrite();
        Api.access$1200((Api)this.instance, n3, option);
        return this;
    }

    public Api$Builder addOptions(Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Api.access$1100(api, (Option)optionOrBuilder);
        return this;
    }

    public Api$Builder addOptions(Option option) {
        this.copyOnWrite();
        Api.access$1100((Api)this.instance, option);
        return this;
    }

    public Api$Builder clearMethods() {
        this.copyOnWrite();
        Api.access$800((Api)this.instance);
        return this;
    }

    public Api$Builder clearMixins() {
        this.copyOnWrite();
        Api.access$2600((Api)this.instance);
        return this;
    }

    public Api$Builder clearName() {
        this.copyOnWrite();
        Api.access$200((Api)this.instance);
        return this;
    }

    public Api$Builder clearOptions() {
        this.copyOnWrite();
        Api.access$1400((Api)this.instance);
        return this;
    }

    public Api$Builder clearSourceContext() {
        this.copyOnWrite();
        Api.access$2100((Api)this.instance);
        return this;
    }

    public Api$Builder clearSyntax() {
        this.copyOnWrite();
        Api.access$3000((Api)this.instance);
        return this;
    }

    public Api$Builder clearVersion() {
        this.copyOnWrite();
        Api.access$1700((Api)this.instance);
        return this;
    }

    public Method getMethods(int n3) {
        return ((Api)this.instance).getMethods(n3);
    }

    public int getMethodsCount() {
        return ((Api)this.instance).getMethodsCount();
    }

    public List getMethodsList() {
        return Collections.unmodifiableList(((Api)this.instance).getMethodsList());
    }

    public Mixin getMixins(int n3) {
        return ((Api)this.instance).getMixins(n3);
    }

    public int getMixinsCount() {
        return ((Api)this.instance).getMixinsCount();
    }

    public List getMixinsList() {
        return Collections.unmodifiableList(((Api)this.instance).getMixinsList());
    }

    public String getName() {
        return ((Api)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Api)this.instance).getNameBytes();
    }

    public Option getOptions(int n3) {
        return ((Api)this.instance).getOptions(n3);
    }

    public int getOptionsCount() {
        return ((Api)this.instance).getOptionsCount();
    }

    public List getOptionsList() {
        return Collections.unmodifiableList(((Api)this.instance).getOptionsList());
    }

    public SourceContext getSourceContext() {
        return ((Api)this.instance).getSourceContext();
    }

    public Syntax getSyntax() {
        return ((Api)this.instance).getSyntax();
    }

    public int getSyntaxValue() {
        return ((Api)this.instance).getSyntaxValue();
    }

    public String getVersion() {
        return ((Api)this.instance).getVersion();
    }

    public ByteString getVersionBytes() {
        return ((Api)this.instance).getVersionBytes();
    }

    public boolean hasSourceContext() {
        return ((Api)this.instance).hasSourceContext();
    }

    public Api$Builder mergeSourceContext(SourceContext sourceContext) {
        this.copyOnWrite();
        Api.access$2000((Api)this.instance, sourceContext);
        return this;
    }

    public Api$Builder removeMethods(int n3) {
        this.copyOnWrite();
        Api.access$900((Api)this.instance, n3);
        return this;
    }

    public Api$Builder removeMixins(int n3) {
        this.copyOnWrite();
        Api.access$2700((Api)this.instance, n3);
        return this;
    }

    public Api$Builder removeOptions(int n3) {
        this.copyOnWrite();
        Api.access$1500((Api)this.instance, n3);
        return this;
    }

    public Api$Builder setMethods(int n3, Method$Builder methodOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        methodOrBuilder = (Method)methodOrBuilder.build();
        Api.access$400(api, n3, (Method)methodOrBuilder);
        return this;
    }

    public Api$Builder setMethods(int n3, Method method) {
        this.copyOnWrite();
        Api.access$400((Api)this.instance, n3, method);
        return this;
    }

    public Api$Builder setMixins(int n3, Mixin$Builder mixinOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        mixinOrBuilder = (Mixin)mixinOrBuilder.build();
        Api.access$2200(api, n3, (Mixin)mixinOrBuilder);
        return this;
    }

    public Api$Builder setMixins(int n3, Mixin mixin) {
        this.copyOnWrite();
        Api.access$2200((Api)this.instance, n3, mixin);
        return this;
    }

    public Api$Builder setName(String string2) {
        this.copyOnWrite();
        Api.access$100((Api)this.instance, string2);
        return this;
    }

    public Api$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Api.access$300((Api)this.instance, byteString);
        return this;
    }

    public Api$Builder setOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Api.access$1000(api, n3, (Option)optionOrBuilder);
        return this;
    }

    public Api$Builder setOptions(int n3, Option option) {
        this.copyOnWrite();
        Api.access$1000((Api)this.instance, n3, option);
        return this;
    }

    public Api$Builder setSourceContext(SourceContext$Builder sourceContextOrBuilder) {
        this.copyOnWrite();
        Api api = (Api)this.instance;
        sourceContextOrBuilder = (SourceContext)sourceContextOrBuilder.build();
        Api.access$1900(api, (SourceContext)sourceContextOrBuilder);
        return this;
    }

    public Api$Builder setSourceContext(SourceContext sourceContext) {
        this.copyOnWrite();
        Api.access$1900((Api)this.instance, sourceContext);
        return this;
    }

    public Api$Builder setSyntax(Syntax syntax) {
        this.copyOnWrite();
        Api.access$2900((Api)this.instance, syntax);
        return this;
    }

    public Api$Builder setSyntaxValue(int n3) {
        this.copyOnWrite();
        Api.access$2800((Api)this.instance, n3);
        return this;
    }

    public Api$Builder setVersion(String string2) {
        this.copyOnWrite();
        Api.access$1600((Api)this.instance, string2);
        return this;
    }

    public Api$Builder setVersionBytes(ByteString byteString) {
        this.copyOnWrite();
        Api.access$1800((Api)this.instance, byteString);
        return this;
    }
}

