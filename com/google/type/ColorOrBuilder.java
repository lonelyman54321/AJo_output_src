/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.FloatValue;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ColorOrBuilder
extends MessageLiteOrBuilder {
    public FloatValue getAlpha();

    public float getBlue();

    public float getGreen();

    public float getRed();

    public boolean hasAlpha();
}

