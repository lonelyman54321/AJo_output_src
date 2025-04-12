/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Documentation;
import com.google.api.Documentation$1;
import com.google.api.DocumentationOrBuilder;
import com.google.api.DocumentationRule;
import com.google.api.DocumentationRule$Builder;
import com.google.api.Page;
import com.google.api.Page$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Documentation$Builder
extends GeneratedMessageLite$Builder
implements DocumentationOrBuilder {
    private Documentation$Builder() {
        Documentation documentation = Documentation.access$000();
        super(documentation);
    }

    public /* synthetic */ Documentation$Builder(Documentation$1 documentation$1) {
        this();
    }

    public Documentation$Builder addAllPages(Iterable iterable) {
        this.copyOnWrite();
        Documentation.access$700((Documentation)this.instance, iterable);
        return this;
    }

    public Documentation$Builder addAllRules(Iterable iterable) {
        this.copyOnWrite();
        Documentation.access$1300((Documentation)this.instance, iterable);
        return this;
    }

    public Documentation$Builder addPages(int n3, Page$Builder pageOrBuilder) {
        this.copyOnWrite();
        Documentation documentation = (Documentation)this.instance;
        pageOrBuilder = (Page)pageOrBuilder.build();
        Documentation.access$600(documentation, n3, (Page)pageOrBuilder);
        return this;
    }

    public Documentation$Builder addPages(int n3, Page page) {
        this.copyOnWrite();
        Documentation.access$600((Documentation)this.instance, n3, page);
        return this;
    }

    public Documentation$Builder addPages(Page$Builder pageOrBuilder) {
        this.copyOnWrite();
        Documentation documentation = (Documentation)this.instance;
        pageOrBuilder = (Page)pageOrBuilder.build();
        Documentation.access$500(documentation, (Page)pageOrBuilder);
        return this;
    }

    public Documentation$Builder addPages(Page page) {
        this.copyOnWrite();
        Documentation.access$500((Documentation)this.instance, page);
        return this;
    }

    public Documentation$Builder addRules(int n3, DocumentationRule$Builder documentationRuleOrBuilder) {
        this.copyOnWrite();
        Documentation documentation = (Documentation)this.instance;
        documentationRuleOrBuilder = (DocumentationRule)documentationRuleOrBuilder.build();
        Documentation.access$1200(documentation, n3, (DocumentationRule)documentationRuleOrBuilder);
        return this;
    }

    public Documentation$Builder addRules(int n3, DocumentationRule documentationRule) {
        this.copyOnWrite();
        Documentation.access$1200((Documentation)this.instance, n3, documentationRule);
        return this;
    }

    public Documentation$Builder addRules(DocumentationRule$Builder documentationRuleOrBuilder) {
        this.copyOnWrite();
        Documentation documentation = (Documentation)this.instance;
        documentationRuleOrBuilder = (DocumentationRule)documentationRuleOrBuilder.build();
        Documentation.access$1100(documentation, (DocumentationRule)documentationRuleOrBuilder);
        return this;
    }

    public Documentation$Builder addRules(DocumentationRule documentationRule) {
        this.copyOnWrite();
        Documentation.access$1100((Documentation)this.instance, documentationRule);
        return this;
    }

    public Documentation$Builder clearDocumentationRootUrl() {
        this.copyOnWrite();
        Documentation.access$1700((Documentation)this.instance);
        return this;
    }

    public Documentation$Builder clearOverview() {
        this.copyOnWrite();
        Documentation.access$2000((Documentation)this.instance);
        return this;
    }

    public Documentation$Builder clearPages() {
        this.copyOnWrite();
        Documentation.access$800((Documentation)this.instance);
        return this;
    }

    public Documentation$Builder clearRules() {
        this.copyOnWrite();
        Documentation.access$1400((Documentation)this.instance);
        return this;
    }

    public Documentation$Builder clearSummary() {
        this.copyOnWrite();
        Documentation.access$200((Documentation)this.instance);
        return this;
    }

    public String getDocumentationRootUrl() {
        return ((Documentation)this.instance).getDocumentationRootUrl();
    }

    public ByteString getDocumentationRootUrlBytes() {
        return ((Documentation)this.instance).getDocumentationRootUrlBytes();
    }

    public String getOverview() {
        return ((Documentation)this.instance).getOverview();
    }

    public ByteString getOverviewBytes() {
        return ((Documentation)this.instance).getOverviewBytes();
    }

    public Page getPages(int n3) {
        return ((Documentation)this.instance).getPages(n3);
    }

    public int getPagesCount() {
        return ((Documentation)this.instance).getPagesCount();
    }

    public List getPagesList() {
        return Collections.unmodifiableList(((Documentation)this.instance).getPagesList());
    }

    public DocumentationRule getRules(int n3) {
        return ((Documentation)this.instance).getRules(n3);
    }

    public int getRulesCount() {
        return ((Documentation)this.instance).getRulesCount();
    }

    public List getRulesList() {
        return Collections.unmodifiableList(((Documentation)this.instance).getRulesList());
    }

    public String getSummary() {
        return ((Documentation)this.instance).getSummary();
    }

    public ByteString getSummaryBytes() {
        return ((Documentation)this.instance).getSummaryBytes();
    }

    public Documentation$Builder removePages(int n3) {
        this.copyOnWrite();
        Documentation.access$900((Documentation)this.instance, n3);
        return this;
    }

    public Documentation$Builder removeRules(int n3) {
        this.copyOnWrite();
        Documentation.access$1500((Documentation)this.instance, n3);
        return this;
    }

    public Documentation$Builder setDocumentationRootUrl(String string2) {
        this.copyOnWrite();
        Documentation.access$1600((Documentation)this.instance, string2);
        return this;
    }

    public Documentation$Builder setDocumentationRootUrlBytes(ByteString byteString) {
        this.copyOnWrite();
        Documentation.access$1800((Documentation)this.instance, byteString);
        return this;
    }

    public Documentation$Builder setOverview(String string2) {
        this.copyOnWrite();
        Documentation.access$1900((Documentation)this.instance, string2);
        return this;
    }

    public Documentation$Builder setOverviewBytes(ByteString byteString) {
        this.copyOnWrite();
        Documentation.access$2100((Documentation)this.instance, byteString);
        return this;
    }

    public Documentation$Builder setPages(int n3, Page$Builder pageOrBuilder) {
        this.copyOnWrite();
        Documentation documentation = (Documentation)this.instance;
        pageOrBuilder = (Page)pageOrBuilder.build();
        Documentation.access$400(documentation, n3, (Page)pageOrBuilder);
        return this;
    }

    public Documentation$Builder setPages(int n3, Page page) {
        this.copyOnWrite();
        Documentation.access$400((Documentation)this.instance, n3, page);
        return this;
    }

    public Documentation$Builder setRules(int n3, DocumentationRule$Builder documentationRuleOrBuilder) {
        this.copyOnWrite();
        Documentation documentation = (Documentation)this.instance;
        documentationRuleOrBuilder = (DocumentationRule)documentationRuleOrBuilder.build();
        Documentation.access$1000(documentation, n3, (DocumentationRule)documentationRuleOrBuilder);
        return this;
    }

    public Documentation$Builder setRules(int n3, DocumentationRule documentationRule) {
        this.copyOnWrite();
        Documentation.access$1000((Documentation)this.instance, n3, documentationRule);
        return this;
    }

    public Documentation$Builder setSummary(String string2) {
        this.copyOnWrite();
        Documentation.access$100((Documentation)this.instance, string2);
        return this;
    }

    public Documentation$Builder setSummaryBytes(ByteString byteString) {
        this.copyOnWrite();
        Documentation.access$300((Documentation)this.instance, byteString);
        return this;
    }
}

