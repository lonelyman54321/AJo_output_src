/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location$Builder;
import com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class DescriptorProtos$SourceCodeInfo$Builder
extends GeneratedMessageLite$Builder
implements DescriptorProtos$SourceCodeInfoOrBuilder {
    private DescriptorProtos$SourceCodeInfo$Builder() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = DescriptorProtos$SourceCodeInfo.access$44700();
        super(descriptorProtos$SourceCodeInfo);
    }

    public /* synthetic */ DescriptorProtos$SourceCodeInfo$Builder(DescriptorProtos$1 descriptorProtos$1) {
        this();
    }

    public DescriptorProtos$SourceCodeInfo$Builder addAllLocation(Iterable iterable) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo.access$45100((DescriptorProtos$SourceCodeInfo)this.instance, iterable);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Builder addLocation(int n3, DescriptorProtos$SourceCodeInfo$Location$Builder descriptorProtos$SourceCodeInfo$LocationOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = (DescriptorProtos$SourceCodeInfo)this.instance;
        descriptorProtos$SourceCodeInfo$LocationOrBuilder = (DescriptorProtos$SourceCodeInfo$Location)descriptorProtos$SourceCodeInfo$LocationOrBuilder.build();
        DescriptorProtos$SourceCodeInfo.access$45000(descriptorProtos$SourceCodeInfo, n3, (DescriptorProtos$SourceCodeInfo$Location)descriptorProtos$SourceCodeInfo$LocationOrBuilder);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Builder addLocation(int n3, DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo.access$45000((DescriptorProtos$SourceCodeInfo)this.instance, n3, descriptorProtos$SourceCodeInfo$Location);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Builder addLocation(DescriptorProtos$SourceCodeInfo$Location$Builder descriptorProtos$SourceCodeInfo$LocationOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = (DescriptorProtos$SourceCodeInfo)this.instance;
        descriptorProtos$SourceCodeInfo$LocationOrBuilder = (DescriptorProtos$SourceCodeInfo$Location)descriptorProtos$SourceCodeInfo$LocationOrBuilder.build();
        DescriptorProtos$SourceCodeInfo.access$44900(descriptorProtos$SourceCodeInfo, (DescriptorProtos$SourceCodeInfo$Location)descriptorProtos$SourceCodeInfo$LocationOrBuilder);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Builder addLocation(DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo.access$44900((DescriptorProtos$SourceCodeInfo)this.instance, descriptorProtos$SourceCodeInfo$Location);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Builder clearLocation() {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo.access$45200((DescriptorProtos$SourceCodeInfo)this.instance);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Location getLocation(int n3) {
        return ((DescriptorProtos$SourceCodeInfo)this.instance).getLocation(n3);
    }

    public int getLocationCount() {
        return ((DescriptorProtos$SourceCodeInfo)this.instance).getLocationCount();
    }

    public List getLocationList() {
        return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo)this.instance).getLocationList());
    }

    public DescriptorProtos$SourceCodeInfo$Builder removeLocation(int n3) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo.access$45300((DescriptorProtos$SourceCodeInfo)this.instance, n3);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Builder setLocation(int n3, DescriptorProtos$SourceCodeInfo$Location$Builder descriptorProtos$SourceCodeInfo$LocationOrBuilder) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = (DescriptorProtos$SourceCodeInfo)this.instance;
        descriptorProtos$SourceCodeInfo$LocationOrBuilder = (DescriptorProtos$SourceCodeInfo$Location)descriptorProtos$SourceCodeInfo$LocationOrBuilder.build();
        DescriptorProtos$SourceCodeInfo.access$44800(descriptorProtos$SourceCodeInfo, n3, (DescriptorProtos$SourceCodeInfo$Location)descriptorProtos$SourceCodeInfo$LocationOrBuilder);
        return this;
    }

    public DescriptorProtos$SourceCodeInfo$Builder setLocation(int n3, DescriptorProtos$SourceCodeInfo$Location descriptorProtos$SourceCodeInfo$Location) {
        this.copyOnWrite();
        DescriptorProtos$SourceCodeInfo.access$44800((DescriptorProtos$SourceCodeInfo)this.instance, n3, descriptorProtos$SourceCodeInfo$Location);
        return this;
    }
}

