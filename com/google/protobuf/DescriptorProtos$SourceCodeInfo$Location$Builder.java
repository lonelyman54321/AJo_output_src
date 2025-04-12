/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$SourceCodeInfo$Location$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$SourceCodeInfo$LocationOrBuilder {
    private DescriptorProtos$SourceCodeInfo$Location$Builder() {
        DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location = DescriptorProtos$SourceCodeInfo$Location.access$42600();
        super(descriptorProtos$SourceCodeInfo$Location);
    }

    public /* synthetic */ DescriptorProtos$SourceCodeInfo$Location$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder addAllLeadingDetachedComments(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$44300((DescriptorProtos$SourceCodeInfo$Location)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder addAllPath(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$42900((DescriptorProtos$SourceCodeInfo$Location)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder addAllSpan(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43300((DescriptorProtos$SourceCodeInfo$Location)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder addLeadingDetachedComments(String string2) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$44200((DescriptorProtos$SourceCodeInfo$Location)this.instance, string2);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder addLeadingDetachedCommentsBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$44500((DescriptorProtos$SourceCodeInfo$Location)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder addPath(int n3) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$42800((DescriptorProtos$SourceCodeInfo$Location)this.instance, n3);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder addSpan(int n3) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43200((DescriptorProtos$SourceCodeInfo$Location)this.instance, n3);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder clearLeadingComments() {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43600((DescriptorProtos$SourceCodeInfo$Location)this.instance);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder clearLeadingDetachedComments() {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$44400((DescriptorProtos$SourceCodeInfo$Location)this.instance);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder clearPath() {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43000((DescriptorProtos$SourceCodeInfo$Location)this.instance);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder clearSpan() {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43400((DescriptorProtos$SourceCodeInfo$Location)this.instance);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder clearTrailingComments() {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43900((DescriptorProtos$SourceCodeInfo$Location)this.instance);
        return this;
    }

    public String getLeadingComments() {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getLeadingComments();
    }

    public ByteString getLeadingCommentsBytes() {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getLeadingCommentsBytes();
    }

    public String getLeadingDetachedComments(int n3) {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getLeadingDetachedComments(n3);
    }

    public ByteString getLeadingDetachedCommentsBytes(int n3) {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getLeadingDetachedCommentsBytes(n3);
    }

    public int getLeadingDetachedCommentsCount() {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getLeadingDetachedCommentsCount();
    }

    public List getLeadingDetachedCommentsList() {
        return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo$Location)this.instance).getLeadingDetachedCommentsList());
    }

    public int getPath(int n3) {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getPath(n3);
    }

    public int getPathCount() {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getPathCount();
    }

    public List getPathList() {
        return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo$Location)this.instance).getPathList());
    }

    public int getSpan(int n3) {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getSpan(n3);
    }

    public int getSpanCount() {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getSpanCount();
    }

    public List getSpanList() {
        return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo$Location)this.instance).getSpanList());
    }

    public String getTrailingComments() {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getTrailingComments();
    }

    public ByteString getTrailingCommentsBytes() {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).getTrailingCommentsBytes();
    }

    public boolean hasLeadingComments() {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).hasLeadingComments();
    }

    public boolean hasTrailingComments() {
        return ((DescriptorProtos$SourceCodeInfo$Location)this.instance).hasTrailingComments();
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder setLeadingComments(String string2) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43500((DescriptorProtos$SourceCodeInfo$Location)this.instance, string2);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder setLeadingCommentsBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43700((DescriptorProtos$SourceCodeInfo$Location)this.instance, byteString);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder setLeadingDetachedComments(int n3, String string2) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$44100((DescriptorProtos$SourceCodeInfo$Location)this.instance, n3, string2);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder setPath(int n3, int n4) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$42700((DescriptorProtos$SourceCodeInfo$Location)this.instance, n3, n4);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder setSpan(int n3, int n4) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43100((DescriptorProtos$SourceCodeInfo$Location)this.instance, n3, n4);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder setTrailingComments(String string2) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$43800((DescriptorProtos$SourceCodeInfo$Location)this.instance, string2);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location$Builder setTrailingCommentsBytes(ByteString byteString) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo$Location.access$44000((DescriptorProtos$SourceCodeInfo$Location)this.instance, byteString);
        return this;
    }
}

