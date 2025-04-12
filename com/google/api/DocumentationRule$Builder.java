/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.DocumentationRule;
import com.google.api.DocumentationRule$1;
import com.google.api.DocumentationRuleOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class DocumentationRule$Builder
extends GeneratedMessageLite$Builder
implements DocumentationRuleOrBuilder {
    private DocumentationRule$Builder() {
        DocumentationRule documentationRule = DocumentationRule.access$000();
        super(documentationRule);
    }

    public /* synthetic */ DocumentationRule$Builder(DocumentationRule$1 documentationRule$1) {
        this();
    }

    public DocumentationRule$Builder clearDeprecationDescription() {
        this.copyOnWrite();
        DocumentationRule.access$800((DocumentationRule)this.instance);
        return this;
    }

    public DocumentationRule$Builder clearDescription() {
        this.copyOnWrite();
        DocumentationRule.access$500((DocumentationRule)this.instance);
        return this;
    }

    public DocumentationRule$Builder clearSelector() {
        this.copyOnWrite();
        DocumentationRule.access$200((DocumentationRule)this.instance);
        return this;
    }

    public String getDeprecationDescription() {
        return ((DocumentationRule)this.instance).getDeprecationDescription();
    }

    public ByteString getDeprecationDescriptionBytes() {
        return ((DocumentationRule)this.instance).getDeprecationDescriptionBytes();
    }

    public String getDescription() {
        return ((DocumentationRule)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((DocumentationRule)this.instance).getDescriptionBytes();
    }

    public String getSelector() {
        return ((DocumentationRule)this.instance).getSelector();
    }

    public ByteString getSelectorBytes() {
        return ((DocumentationRule)this.instance).getSelectorBytes();
    }

    public DocumentationRule$Builder setDeprecationDescription(String string2) {
        this.copyOnWrite();
        DocumentationRule.access$700((DocumentationRule)this.instance, string2);
        return this;
    }

    public DocumentationRule$Builder setDeprecationDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        DocumentationRule.access$900((DocumentationRule)this.instance, byteString);
        return this;
    }

    public DocumentationRule$Builder setDescription(String string2) {
        this.copyOnWrite();
        DocumentationRule.access$400((DocumentationRule)this.instance, string2);
        return this;
    }

    public DocumentationRule$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        DocumentationRule.access$600((DocumentationRule)this.instance, byteString);
        return this;
    }

    public DocumentationRule$Builder setSelector(String string2) {
        this.copyOnWrite();
        DocumentationRule.access$100((DocumentationRule)this.instance, string2);
        return this;
    }

    public DocumentationRule$Builder setSelectorBytes(ByteString byteString) {
        this.copyOnWrite();
        DocumentationRule.access$300((DocumentationRule)this.instance, byteString);
        return this;
    }
}

