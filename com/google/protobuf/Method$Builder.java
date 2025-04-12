/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Method;
import com.google.protobuf.Method$1;
import com.google.protobuf.MethodOrBuilder;
import com.google.protobuf.Option;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.Syntax;
import java.util.Collections;
import java.util.List;

public final class Method$Builder
extends GeneratedMessageLite$Builder
implements MethodOrBuilder {
    private Method$Builder() {
        Method method = Method.access$000();
        super(method);
    }

    public /* synthetic */ Method$Builder(Method$1 method$1) {
        this();
    }

    public Method$Builder addAllOptions(Iterable iterable) {
        this.copyOnWrite();
        Method.access$1700((Method)this.instance, iterable);
        return this;
    }

    public Method$Builder addOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Method method = (Method)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Method.access$1600(method, n3, (Option)optionOrBuilder);
        return this;
    }

    public Method$Builder addOptions(int n3, Option option) {
        this.copyOnWrite();
        Method.access$1600((Method)this.instance, n3, option);
        return this;
    }

    public Method$Builder addOptions(Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Method method = (Method)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Method.access$1500(method, (Option)optionOrBuilder);
        return this;
    }

    public Method$Builder addOptions(Option option) {
        this.copyOnWrite();
        Method.access$1500((Method)this.instance, option);
        return this;
    }

    public Method$Builder clearName() {
        this.copyOnWrite();
        Method.access$200((Method)this.instance);
        return this;
    }

    public Method$Builder clearOptions() {
        this.copyOnWrite();
        Method.access$1800((Method)this.instance);
        return this;
    }

    public Method$Builder clearRequestStreaming() {
        this.copyOnWrite();
        Method.access$800((Method)this.instance);
        return this;
    }

    public Method$Builder clearRequestTypeUrl() {
        this.copyOnWrite();
        Method.access$500((Method)this.instance);
        return this;
    }

    public Method$Builder clearResponseStreaming() {
        this.copyOnWrite();
        Method.access$1300((Method)this.instance);
        return this;
    }

    public Method$Builder clearResponseTypeUrl() {
        this.copyOnWrite();
        Method.access$1000((Method)this.instance);
        return this;
    }

    public Method$Builder clearSyntax() {
        this.copyOnWrite();
        Method.access$2200((Method)this.instance);
        return this;
    }

    public String getName() {
        return ((Method)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Method)this.instance).getNameBytes();
    }

    public Option getOptions(int n3) {
        return ((Method)this.instance).getOptions(n3);
    }

    public int getOptionsCount() {
        return ((Method)this.instance).getOptionsCount();
    }

    public List getOptionsList() {
        return Collections.unmodifiableList(((Method)this.instance).getOptionsList());
    }

    public boolean getRequestStreaming() {
        return ((Method)this.instance).getRequestStreaming();
    }

    public String getRequestTypeUrl() {
        return ((Method)this.instance).getRequestTypeUrl();
    }

    public ByteString getRequestTypeUrlBytes() {
        return ((Method)this.instance).getRequestTypeUrlBytes();
    }

    public boolean getResponseStreaming() {
        return ((Method)this.instance).getResponseStreaming();
    }

    public String getResponseTypeUrl() {
        return ((Method)this.instance).getResponseTypeUrl();
    }

    public ByteString getResponseTypeUrlBytes() {
        return ((Method)this.instance).getResponseTypeUrlBytes();
    }

    public Syntax getSyntax() {
        return ((Method)this.instance).getSyntax();
    }

    public int getSyntaxValue() {
        return ((Method)this.instance).getSyntaxValue();
    }

    public Method$Builder removeOptions(int n3) {
        this.copyOnWrite();
        Method.access$1900((Method)this.instance, n3);
        return this;
    }

    public Method$Builder setName(String string2) {
        this.copyOnWrite();
        Method.access$100((Method)this.instance, string2);
        return this;
    }

    public Method$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Method.access$300((Method)this.instance, byteString);
        return this;
    }

    public Method$Builder setOptions(int n3, Option$Builder optionOrBuilder) {
        this.copyOnWrite();
        Method method = (Method)this.instance;
        optionOrBuilder = (Option)optionOrBuilder.build();
        Method.access$1400(method, n3, (Option)optionOrBuilder);
        return this;
    }

    public Method$Builder setOptions(int n3, Option option) {
        this.copyOnWrite();
        Method.access$1400((Method)this.instance, n3, option);
        return this;
    }

    public Method$Builder setRequestStreaming(boolean bl2) {
        this.copyOnWrite();
        Method.access$700((Method)this.instance, bl2);
        return this;
    }

    public Method$Builder setRequestTypeUrl(String string2) {
        this.copyOnWrite();
        Method.access$400((Method)this.instance, string2);
        return this;
    }

    public Method$Builder setRequestTypeUrlBytes(ByteString byteString) {
        this.copyOnWrite();
        Method.access$600((Method)this.instance, byteString);
        return this;
    }

    public Method$Builder setResponseStreaming(boolean bl2) {
        this.copyOnWrite();
        Method.access$1200((Method)this.instance, bl2);
        return this;
    }

    public Method$Builder setResponseTypeUrl(String string2) {
        this.copyOnWrite();
        Method.access$900((Method)this.instance, string2);
        return this;
    }

    public Method$Builder setResponseTypeUrlBytes(ByteString byteString) {
        this.copyOnWrite();
        Method.access$1100((Method)this.instance, byteString);
        return this;
    }

    public Method$Builder setSyntax(Syntax syntax) {
        this.copyOnWrite();
        Method.access$2100((Method)this.instance, syntax);
        return this;
    }

    public Method$Builder setSyntaxValue(int n3) {
        this.copyOnWrite();
        Method.access$2000((Method)this.instance, n3);
        return this;
    }
}

