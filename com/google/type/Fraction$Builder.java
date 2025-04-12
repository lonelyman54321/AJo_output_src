/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.Fraction;
import com.google.type.Fraction$1;
import com.google.type.FractionOrBuilder;

public final class Fraction$Builder
extends GeneratedMessageLite$Builder
implements FractionOrBuilder {
    private Fraction$Builder() {
        Fraction fraction = Fraction.access$000();
        super(fraction);
    }

    public /* synthetic */ Fraction$Builder(Fraction$1 fraction$1) {
        this();
    }

    public Fraction$Builder clearDenominator() {
        this.copyOnWrite();
        Fraction.access$400((Fraction)this.instance);
        return this;
    }

    public Fraction$Builder clearNumerator() {
        this.copyOnWrite();
        Fraction.access$200((Fraction)this.instance);
        return this;
    }

    public long getDenominator() {
        return ((Fraction)this.instance).getDenominator();
    }

    public long getNumerator() {
        return ((Fraction)this.instance).getNumerator();
    }

    public Fraction$Builder setDenominator(long l2) {
        this.copyOnWrite();
        Fraction.access$300((Fraction)this.instance, l2);
        return this;
    }

    public Fraction$Builder setNumerator(long l2) {
        this.copyOnWrite();
        Fraction.access$100((Fraction)this.instance, l2);
        return this;
    }
}

