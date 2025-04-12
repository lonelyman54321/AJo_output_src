/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptor$Builder;
import com.google.api.LogDescriptor;
import com.google.api.LogDescriptor$1;
import com.google.api.LogDescriptorOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class LogDescriptor$Builder
extends GeneratedMessageLite$Builder
implements LogDescriptorOrBuilder {
    private LogDescriptor$Builder() {
        LogDescriptor logDescriptor = LogDescriptor.access$000();
        super(logDescriptor);
    }

    public /* synthetic */ LogDescriptor$Builder(LogDescriptor$1 logDescriptor$1) {
        this();
    }

    public LogDescriptor$Builder addAllLabels(Iterable iterable) {
        this.copyOnWrite();
        LogDescriptor.access$700((LogDescriptor)this.instance, iterable);
        return this;
    }

    public LogDescriptor$Builder addLabels(int n3, LabelDescriptor$Builder labelDescriptorOrBuilder) {
        this.copyOnWrite();
        LogDescriptor logDescriptor = (LogDescriptor)this.instance;
        labelDescriptorOrBuilder = (LabelDescriptor)labelDescriptorOrBuilder.build();
        LogDescriptor.access$600(logDescriptor, n3, (LabelDescriptor)labelDescriptorOrBuilder);
        return this;
    }

    public LogDescriptor$Builder addLabels(int n3, LabelDescriptor labelDescriptor) {
        this.copyOnWrite();
        LogDescriptor.access$600((LogDescriptor)this.instance, n3, labelDescriptor);
        return this;
    }

    public LogDescriptor$Builder addLabels(LabelDescriptor$Builder labelDescriptorOrBuilder) {
        this.copyOnWrite();
        LogDescriptor logDescriptor = (LogDescriptor)this.instance;
        labelDescriptorOrBuilder = (LabelDescriptor)labelDescriptorOrBuilder.build();
        LogDescriptor.access$500(logDescriptor, (LabelDescriptor)labelDescriptorOrBuilder);
        return this;
    }

    public LogDescriptor$Builder addLabels(LabelDescriptor labelDescriptor) {
        this.copyOnWrite();
        LogDescriptor.access$500((LogDescriptor)this.instance, labelDescriptor);
        return this;
    }

    public LogDescriptor$Builder clearDescription() {
        this.copyOnWrite();
        LogDescriptor.access$1100((LogDescriptor)this.instance);
        return this;
    }

    public LogDescriptor$Builder clearDisplayName() {
        this.copyOnWrite();
        LogDescriptor.access$1400((LogDescriptor)this.instance);
        return this;
    }

    public LogDescriptor$Builder clearLabels() {
        this.copyOnWrite();
        LogDescriptor.access$800((LogDescriptor)this.instance);
        return this;
    }

    public LogDescriptor$Builder clearName() {
        this.copyOnWrite();
        LogDescriptor.access$200((LogDescriptor)this.instance);
        return this;
    }

    public String getDescription() {
        return ((LogDescriptor)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((LogDescriptor)this.instance).getDescriptionBytes();
    }

    public String getDisplayName() {
        return ((LogDescriptor)this.instance).getDisplayName();
    }

    public ByteString getDisplayNameBytes() {
        return ((LogDescriptor)this.instance).getDisplayNameBytes();
    }

    public LabelDescriptor getLabels(int n3) {
        return ((LogDescriptor)this.instance).getLabels(n3);
    }

    public int getLabelsCount() {
        return ((LogDescriptor)this.instance).getLabelsCount();
    }

    public List getLabelsList() {
        return Collections.unmodifiableList(((LogDescriptor)this.instance).getLabelsList());
    }

    public String getName() {
        return ((LogDescriptor)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((LogDescriptor)this.instance).getNameBytes();
    }

    public LogDescriptor$Builder removeLabels(int n3) {
        this.copyOnWrite();
        LogDescriptor.access$900((LogDescriptor)this.instance, n3);
        return this;
    }

    public LogDescriptor$Builder setDescription(String string2) {
        this.copyOnWrite();
        LogDescriptor.access$1000((LogDescriptor)this.instance, string2);
        return this;
    }

    public LogDescriptor$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        LogDescriptor.access$1200((LogDescriptor)this.instance, byteString);
        return this;
    }

    public LogDescriptor$Builder setDisplayName(String string2) {
        this.copyOnWrite();
        LogDescriptor.access$1300((LogDescriptor)this.instance, string2);
        return this;
    }

    public LogDescriptor$Builder setDisplayNameBytes(ByteString byteString) {
        this.copyOnWrite();
        LogDescriptor.access$1500((LogDescriptor)this.instance, byteString);
        return this;
    }

    public LogDescriptor$Builder setLabels(int n3, LabelDescriptor$Builder labelDescriptorOrBuilder) {
        this.copyOnWrite();
        LogDescriptor logDescriptor = (LogDescriptor)this.instance;
        labelDescriptorOrBuilder = (LabelDescriptor)labelDescriptorOrBuilder.build();
        LogDescriptor.access$400(logDescriptor, n3, (LabelDescriptor)labelDescriptorOrBuilder);
        return this;
    }

    public LogDescriptor$Builder setLabels(int n3, LabelDescriptor labelDescriptor) {
        this.copyOnWrite();
        LogDescriptor.access$400((LogDescriptor)this.instance, n3, labelDescriptor);
        return this;
    }

    public LogDescriptor$Builder setName(String string2) {
        this.copyOnWrite();
        LogDescriptor.access$100((LogDescriptor)this.instance, string2);
        return this;
    }

    public LogDescriptor$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        LogDescriptor.access$300((LogDescriptor)this.instance, byteString);
        return this;
    }
}

