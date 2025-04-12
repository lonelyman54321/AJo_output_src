/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Mixin;
import com.google.protobuf.Mixin$1;
import com.google.protobuf.MixinOrBuilder;

public final class Mixin$Builder
extends GeneratedMessageLite$Builder
implements MixinOrBuilder {
    private Mixin$Builder() {
        Mixin mixin = Mixin.access$000();
        super(mixin);
    }

    public /* synthetic */ Mixin$Builder(Mixin$1 mixin$1) {
        this();
    }

    public Mixin$Builder clearName() {
        this.copyOnWrite();
        Mixin.access$200((Mixin)this.instance);
        return this;
    }

    public Mixin$Builder clearRoot() {
        this.copyOnWrite();
        Mixin.access$500((Mixin)this.instance);
        return this;
    }

    public String getName() {
        return ((Mixin)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((Mixin)this.instance).getNameBytes();
    }

    public String getRoot() {
        return ((Mixin)this.instance).getRoot();
    }

    public ByteString getRootBytes() {
        return ((Mixin)this.instance).getRootBytes();
    }

    public Mixin$Builder setName(String string2) {
        this.copyOnWrite();
        Mixin.access$100((Mixin)this.instance, string2);
        return this;
    }

    public Mixin$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        Mixin.access$300((Mixin)this.instance, byteString);
        return this;
    }

    public Mixin$Builder setRoot(String string2) {
        this.copyOnWrite();
        Mixin.access$400((Mixin)this.instance, string2);
        return this;
    }

    public Mixin$Builder setRootBytes(ByteString byteString) {
        this.copyOnWrite();
        Mixin.access$600((Mixin)this.instance, byteString);
        return this;
    }
}

