/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ResourceDescriptor;
import com.google.api.ResourceDescriptor$1;
import com.google.api.ResourceDescriptor$History;
import com.google.api.ResourceDescriptorOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class ResourceDescriptor$Builder
extends GeneratedMessageLite$Builder
implements ResourceDescriptorOrBuilder {
    private ResourceDescriptor$Builder() {
        ResourceDescriptor resourceDescriptor = ResourceDescriptor.access$000();
        super(resourceDescriptor);
    }

    public /* synthetic */ ResourceDescriptor$Builder(ResourceDescriptor$1 resourceDescriptor$1) {
        this();
    }

    public ResourceDescriptor$Builder addAllPattern(Iterable iterable) {
        this.copyOnWrite();
        ResourceDescriptor.access$600((ResourceDescriptor)this.instance, iterable);
        return this;
    }

    public ResourceDescriptor$Builder addPattern(String string2) {
        this.copyOnWrite();
        ResourceDescriptor.access$500((ResourceDescriptor)this.instance, string2);
        return this;
    }

    public ResourceDescriptor$Builder addPatternBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceDescriptor.access$800((ResourceDescriptor)this.instance, byteString);
        return this;
    }

    public ResourceDescriptor$Builder clearHistory() {
        this.copyOnWrite();
        ResourceDescriptor.access$1400((ResourceDescriptor)this.instance);
        return this;
    }

    public ResourceDescriptor$Builder clearNameField() {
        this.copyOnWrite();
        ResourceDescriptor.access$1000((ResourceDescriptor)this.instance);
        return this;
    }

    public ResourceDescriptor$Builder clearPattern() {
        this.copyOnWrite();
        ResourceDescriptor.access$700((ResourceDescriptor)this.instance);
        return this;
    }

    public ResourceDescriptor$Builder clearPlural() {
        this.copyOnWrite();
        ResourceDescriptor.access$1600((ResourceDescriptor)this.instance);
        return this;
    }

    public ResourceDescriptor$Builder clearSingular() {
        this.copyOnWrite();
        ResourceDescriptor.access$1900((ResourceDescriptor)this.instance);
        return this;
    }

    public ResourceDescriptor$Builder clearType() {
        this.copyOnWrite();
        ResourceDescriptor.access$200((ResourceDescriptor)this.instance);
        return this;
    }

    public ResourceDescriptor$History getHistory() {
        return ((ResourceDescriptor)this.instance).getHistory();
    }

    public int getHistoryValue() {
        return ((ResourceDescriptor)this.instance).getHistoryValue();
    }

    public String getNameField() {
        return ((ResourceDescriptor)this.instance).getNameField();
    }

    public ByteString getNameFieldBytes() {
        return ((ResourceDescriptor)this.instance).getNameFieldBytes();
    }

    public String getPattern(int n3) {
        return ((ResourceDescriptor)this.instance).getPattern(n3);
    }

    public ByteString getPatternBytes(int n3) {
        return ((ResourceDescriptor)this.instance).getPatternBytes(n3);
    }

    public int getPatternCount() {
        return ((ResourceDescriptor)this.instance).getPatternCount();
    }

    public List getPatternList() {
        return Collections.unmodifiableList(((ResourceDescriptor)this.instance).getPatternList());
    }

    public String getPlural() {
        return ((ResourceDescriptor)this.instance).getPlural();
    }

    public ByteString getPluralBytes() {
        return ((ResourceDescriptor)this.instance).getPluralBytes();
    }

    public String getSingular() {
        return ((ResourceDescriptor)this.instance).getSingular();
    }

    public ByteString getSingularBytes() {
        return ((ResourceDescriptor)this.instance).getSingularBytes();
    }

    public String getType() {
        return ((ResourceDescriptor)this.instance).getType();
    }

    public ByteString getTypeBytes() {
        return ((ResourceDescriptor)this.instance).getTypeBytes();
    }

    public ResourceDescriptor$Builder setHistory(ResourceDescriptor$History resourceDescriptor$History) {
        this.copyOnWrite();
        ResourceDescriptor.access$1300((ResourceDescriptor)this.instance, resourceDescriptor$History);
        return this;
    }

    public ResourceDescriptor$Builder setHistoryValue(int n3) {
        this.copyOnWrite();
        ResourceDescriptor.access$1200((ResourceDescriptor)this.instance, n3);
        return this;
    }

    public ResourceDescriptor$Builder setNameField(String string2) {
        this.copyOnWrite();
        ResourceDescriptor.access$900((ResourceDescriptor)this.instance, string2);
        return this;
    }

    public ResourceDescriptor$Builder setNameFieldBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceDescriptor.access$1100((ResourceDescriptor)this.instance, byteString);
        return this;
    }

    public ResourceDescriptor$Builder setPattern(int n3, String string2) {
        this.copyOnWrite();
        ResourceDescriptor.access$400((ResourceDescriptor)this.instance, n3, string2);
        return this;
    }

    public ResourceDescriptor$Builder setPlural(String string2) {
        this.copyOnWrite();
        ResourceDescriptor.access$1500((ResourceDescriptor)this.instance, string2);
        return this;
    }

    public ResourceDescriptor$Builder setPluralBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceDescriptor.access$1700((ResourceDescriptor)this.instance, byteString);
        return this;
    }

    public ResourceDescriptor$Builder setSingular(String string2) {
        this.copyOnWrite();
        ResourceDescriptor.access$1800((ResourceDescriptor)this.instance, string2);
        return this;
    }

    public ResourceDescriptor$Builder setSingularBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceDescriptor.access$2000((ResourceDescriptor)this.instance, byteString);
        return this;
    }

    public ResourceDescriptor$Builder setType(String string2) {
        this.copyOnWrite();
        ResourceDescriptor.access$100((ResourceDescriptor)this.instance, string2);
        return this;
    }

    public ResourceDescriptor$Builder setTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        ResourceDescriptor.access$300((ResourceDescriptor)this.instance, byteString);
        return this;
    }
}

