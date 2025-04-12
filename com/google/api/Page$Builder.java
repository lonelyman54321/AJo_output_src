/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Page;
import com.google.api.Page$1;
import com.google.api.PageOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Page$Builder
extends GeneratedMessageLite$Builder
implements PageOrBuilder {
    private Page$Builder() {
        Page page = Page.access$000();
        super(page);
    }

    public /* synthetic */ Page$Builder(Page$1 page$1) {
        this();
    }

    public Page$Builder addAllSubpages(Iterable iterable) {
        this.copyOnWrite();
        Page.access$1000((Page)this.instance, iterable);
        return this;
    }

    public Page$Builder addSubpages(int n3, Page$Builder pageOrBuilder) {
        this.copyOnWrite();
        Page page = (Page)this.instance;
        pageOrBuilder = (Page)pageOrBuilder.build();
        Page.access$900(page, n3, (Page)pageOrBuilder);
        return this;
    }

    public Page$Builder addSubpages(int n3, Page page) {
        this.copyOnWrite();
        Page.access$900((Page)this.instance, n3, page);
        return this;
    }

    public Page$Builder addSubpages(Page$Builder pageOrBuilder) {
        this.copyOnWrite();
        Page page = (Page)this.instance;
        pageOrBuilder = (Page)pageOrBuilder.build();
        Page.access$800(page, (Page)pageOrBuilder);
        return this;
    }

    public Page$Builder addSubpages(Page page) {
        this.copyOnWrite();
        Page.access$800((Page)this.instance, page);
        return this;
    }

    public Page$Builder clearContent() {
        this.copyOnWrite();
        Page.access$500((Page)this.instance);
        return this;
    }

    public Page$Builder clearName() {
        this.copyOnWrite();
        Page.access$200((Page)this.instance);
        return this;
    }

    public Page$Builder clearSubpages() {
        this.copyOnWrite();
        Page.access$1100((Page)this.instance);
        return this;
    }

    public String getContent() {
        return ((Page)this.instance).getContent();
    }

    public ByteString getContentBytes() {
        return ((Page)this.instance).getContentBytes();
    }

    public String getName() {
        return ((Page)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Page)this.instance).getNameBytes();
    }

    public Page getSubpages(int n3) {
        return ((Page)this.instance).getSubpages(n3);
    }

    public int getSubpagesCount() {
        return ((Page)this.instance).getSubpagesCount();
    }

    public List getSubpagesList() {
        return Collections.unmodifiableList(((Page)this.instance).getSubpagesList());
    }

    public Page$Builder removeSubpages(int n3) {
        this.copyOnWrite();
        Page.access$1200((Page)this.instance, n3);
        return this;
    }

    public Page$Builder setContent(String string2) {
        this.copyOnWrite();
        Page.access$400((Page)this.instance, string2);
        return this;
    }

    public Page$Builder setContentBytes(ByteString byteString) {
        this.copyOnWrite();
        Page.access$600((Page)this.instance, byteString);
        return this;
    }

    public Page$Builder setName(String string2) {
        this.copyOnWrite();
        Page.access$100((Page)this.instance, string2);
        return this;
    }

    public Page$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Page.access$300((Page)this.instance, byteString);
        return this;
    }

    public Page$Builder setSubpages(int n3, Page$Builder pageOrBuilder) {
        this.copyOnWrite();
        Page page = (Page)this.instance;
        pageOrBuilder = (Page)pageOrBuilder.build();
        Page.access$700(page, n3, (Page)pageOrBuilder);
        return this;
    }

    public Page$Builder setSubpages(int n3, Page page) {
        this.copyOnWrite();
        Page.access$700((Page)this.instance, n3, page);
        return this;
    }
}

