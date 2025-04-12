/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValue$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.Color;
import com.google.type.Color$1;
import com.google.type.ColorOrBuilder;

public final class Color$Builder
extends GeneratedMessageLite$Builder
implements ColorOrBuilder {
    private Color$Builder() {
        Color color2 = Color.access$000();
        super(color2);
    }

    public /* synthetic */ Color$Builder(Color$1 color$1) {
        this();
    }

    public Color$Builder clearAlpha() {
        this.copyOnWrite();
        Color.access$900((Color)this.instance);
        return this;
    }

    public Color$Builder clearBlue() {
        this.copyOnWrite();
        Color.access$600((Color)this.instance);
        return this;
    }

    public Color$Builder clearGreen() {
        this.copyOnWrite();
        Color.access$400((Color)this.instance);
        return this;
    }

    public Color$Builder clearRed() {
        this.copyOnWrite();
        Color.access$200((Color)this.instance);
        return this;
    }

    public FloatValue getAlpha() {
        return ((Color)this.instance).getAlpha();
    }

    public float getBlue() {
        return ((Color)this.instance).getBlue();
    }

    public float getGreen() {
        return ((Color)this.instance).getGreen();
    }

    public float getRed() {
        return ((Color)this.instance).getRed();
    }

    public boolean hasAlpha() {
        return ((Color)this.instance).hasAlpha();
    }

    public Color$Builder mergeAlpha(FloatValue floatValue) {
        this.copyOnWrite();
        Color.access$800((Color)this.instance, floatValue);
        return this;
    }

    public Color$Builder setAlpha(FloatValue$Builder floatValueOrBuilder) {
        this.copyOnWrite();
        Color color2 = (Color)this.instance;
        floatValueOrBuilder = (FloatValue)floatValueOrBuilder.build();
        Color.access$700(color2, (FloatValue)floatValueOrBuilder);
        return this;
    }

    public Color$Builder setAlpha(FloatValue floatValue) {
        this.copyOnWrite();
        Color.access$700((Color)this.instance, floatValue);
        return this;
    }

    public Color$Builder setBlue(float f5) {
        this.copyOnWrite();
        Color.access$500((Color)this.instance, f5);
        return this;
    }

    public Color$Builder setGreen(float f5) {
        this.copyOnWrite();
        Color.access$300((Color)this.instance, f5);
        return this;
    }

    public Color$Builder setRed(float f5) {
        this.copyOnWrite();
        Color.access$100((Color)this.instance, f5);
        return this;
    }
}

