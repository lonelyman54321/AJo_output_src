/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.rpc.DebugInfo;
import com.google.rpc.DebugInfo$1;
import com.google.rpc.DebugInfoOrBuilder;
import java.util.Collections;
import java.util.List;

public final class DebugInfo$Builder
extends GeneratedMessageLite$Builder
implements DebugInfoOrBuilder {
    private DebugInfo$Builder() {
        DebugInfo debugInfo = DebugInfo.access$000();
        super(debugInfo);
    }

    public /* synthetic */ DebugInfo$Builder(DebugInfo$1 debugInfo$1) {
        this();
    }

    public DebugInfo$Builder addAllStackEntries(Iterable iterable) {
        this.copyOnWrite();
        DebugInfo.access$300((DebugInfo)this.instance, iterable);
        return this;
    }

    public DebugInfo$Builder addStackEntries(String string2) {
        this.copyOnWrite();
        DebugInfo.access$200((DebugInfo)this.instance, string2);
        return this;
    }

    public DebugInfo$Builder addStackEntriesBytes(ByteString byteString) {
        this.copyOnWrite();
        DebugInfo.access$500((DebugInfo)this.instance, byteString);
        return this;
    }

    public DebugInfo$Builder clearDetail() {
        this.copyOnWrite();
        DebugInfo.access$700((DebugInfo)this.instance);
        return this;
    }

    public DebugInfo$Builder clearStackEntries() {
        this.copyOnWrite();
        DebugInfo.access$400((DebugInfo)this.instance);
        return this;
    }

    public String getDetail() {
        return ((DebugInfo)this.instance).getDetail();
    }

    public ByteString getDetailBytes() {
        return ((DebugInfo)this.instance).getDetailBytes();
    }

    public String getStackEntries(int n3) {
        return ((DebugInfo)this.instance).getStackEntries(n3);
    }

    public ByteString getStackEntriesBytes(int n3) {
        return ((DebugInfo)this.instance).getStackEntriesBytes(n3);
    }

    public int getStackEntriesCount() {
        return ((DebugInfo)this.instance).getStackEntriesCount();
    }

    public List getStackEntriesList() {
        return Collections.unmodifiableList(((DebugInfo)this.instance).getStackEntriesList());
    }

    public DebugInfo$Builder setDetail(String string2) {
        this.copyOnWrite();
        DebugInfo.access$600((DebugInfo)this.instance, string2);
        return this;
    }

    public DebugInfo$Builder setDetailBytes(ByteString byteString) {
        this.copyOnWrite();
        DebugInfo.access$800((DebugInfo)this.instance, byteString);
        return this;
    }

    public DebugInfo$Builder setStackEntries(int n3, String string2) {
        this.copyOnWrite();
        DebugInfo.access$100((DebugInfo)this.instance, n3, string2);
        return this;
    }
}

