/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.Quaternion;
import com.google.type.Quaternion$1;
import com.google.type.QuaternionOrBuilder;

public final class Quaternion$Builder
extends GeneratedMessageLite$Builder
implements QuaternionOrBuilder {
    private Quaternion$Builder() {
        Quaternion quaternion = Quaternion.access$000();
        super(quaternion);
    }

    public /* synthetic */ Quaternion$Builder(Quaternion$1 quaternion$1) {
        this();
    }

    public Quaternion$Builder clearW() {
        this.copyOnWrite();
        Quaternion.access$800((Quaternion)this.instance);
        return this;
    }

    public Quaternion$Builder clearX() {
        this.copyOnWrite();
        Quaternion.access$200((Quaternion)this.instance);
        return this;
    }

    public Quaternion$Builder clearY() {
        this.copyOnWrite();
        Quaternion.access$400((Quaternion)this.instance);
        return this;
    }

    public Quaternion$Builder clearZ() {
        this.copyOnWrite();
        Quaternion.access$600((Quaternion)this.instance);
        return this;
    }

    public double getW() {
        return ((Quaternion)this.instance).getW();
    }

    public double getX() {
        return ((Quaternion)this.instance).getX();
    }

    public double getY() {
        return ((Quaternion)this.instance).getY();
    }

    public double getZ() {
        return ((Quaternion)this.instance).getZ();
    }

    public Quaternion$Builder setW(double d2) {
        this.copyOnWrite();
        Quaternion.access$700((Quaternion)this.instance, d2);
        return this;
    }

    public Quaternion$Builder setX(double d2) {
        this.copyOnWrite();
        Quaternion.access$100((Quaternion)this.instance, d2);
        return this;
    }

    public Quaternion$Builder setY(double d2) {
        this.copyOnWrite();
        Quaternion.access$300((Quaternion)this.instance, d2);
        return this;
    }

    public Quaternion$Builder setZ(double d2) {
        this.copyOnWrite();
        Quaternion.access$500((Quaternion)this.instance, d2);
        return this;
    }
}

