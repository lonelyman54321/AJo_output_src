/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Control;
import com.google.api.Control$1;
import com.google.api.ControlOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class Control$Builder
extends GeneratedMessageLite$Builder
implements ControlOrBuilder {
    private Control$Builder() {
        Control control = Control.access$000();
        super(control);
    }

    public /* synthetic */ Control$Builder(Control$1 control$1) {
        this();
    }

    public Control$Builder clearEnvironment() {
        this.copyOnWrite();
        Control.access$200((Control)this.instance);
        return this;
    }

    public String getEnvironment() {
        return ((Control)this.instance).getEnvironment();
    }

    public ByteString getEnvironmentBytes() {
        return ((Control)this.instance).getEnvironmentBytes();
    }

    public Control$Builder setEnvironment(String string2) {
        this.copyOnWrite();
        Control.access$100((Control)this.instance, string2);
        return this;
    }

    public Control$Builder setEnvironmentBytes(ByteString byteString) {
        this.copyOnWrite();
        Control.access$300((Control)this.instance, byteString);
        return this;
    }
}

