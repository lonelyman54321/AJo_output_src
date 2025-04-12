/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.Help;
import com.google.rpc.Help$1;
import com.google.rpc.Help$Link;
import com.google.rpc.Help$Link$Builder;
import com.google.rpc.HelpOrBuilder;
import java.util.Collections;
import java.util.List;

public final class Help$Builder
extends GeneratedMessageLite$Builder
implements HelpOrBuilder {
    private Help$Builder() {
        Help help = Help.access$800();
        super(help);
    }

    public /* synthetic */ Help$Builder(Help$1 help$1) {
        this();
    }

    public Help$Builder addAllLinks(Iterable iterable) {
        this.copyOnWrite();
        Help.access$1200((Help)this.instance, iterable);
        return this;
    }

    public Help$Builder addLinks(int n3, Help$Link$Builder help$LinkOrBuilder) {
        this.copyOnWrite();
        Help help = (Help)this.instance;
        help$LinkOrBuilder = (Help$Link)help$LinkOrBuilder.build();
        Help.access$1100(help, n3, (Help$Link)help$LinkOrBuilder);
        return this;
    }

    public Help$Builder addLinks(int n3, Help$Link help$Link) {
        this.copyOnWrite();
        Help.access$1100((Help)this.instance, n3, help$Link);
        return this;
    }

    public Help$Builder addLinks(Help$Link$Builder help$LinkOrBuilder) {
        this.copyOnWrite();
        Help help = (Help)this.instance;
        help$LinkOrBuilder = (Help$Link)help$LinkOrBuilder.build();
        Help.access$1000(help, (Help$Link)help$LinkOrBuilder);
        return this;
    }

    public Help$Builder addLinks(Help$Link help$Link) {
        this.copyOnWrite();
        Help.access$1000((Help)this.instance, help$Link);
        return this;
    }

    public Help$Builder clearLinks() {
        this.copyOnWrite();
        Help.access$1300((Help)this.instance);
        return this;
    }

    public Help$Link getLinks(int n3) {
        return ((Help)this.instance).getLinks(n3);
    }

    public int getLinksCount() {
        return ((Help)this.instance).getLinksCount();
    }

    public List getLinksList() {
        return Collections.unmodifiableList(((Help)this.instance).getLinksList());
    }

    public Help$Builder removeLinks(int n3) {
        this.copyOnWrite();
        Help.access$1400((Help)this.instance, n3);
        return this;
    }

    public Help$Builder setLinks(int n3, Help$Link$Builder help$LinkOrBuilder) {
        this.copyOnWrite();
        Help help = (Help)this.instance;
        help$LinkOrBuilder = (Help$Link)help$LinkOrBuilder.build();
        Help.access$900(help, n3, (Help$Link)help$LinkOrBuilder);
        return this;
    }

    public Help$Builder setLinks(int n3, Help$Link help$Link) {
        this.copyOnWrite();
        Help.access$900((Help)this.instance, n3, help$Link);
        return this;
    }
}

