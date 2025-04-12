/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.Money;
import com.google.type.Money$1;
import com.google.type.MoneyOrBuilder;

public final class Money$Builder
extends GeneratedMessageLite$Builder
implements MoneyOrBuilder {
    private Money$Builder() {
        Money money = Money.access$000();
        super(money);
    }

    public /* synthetic */ Money$Builder(Money$1 money$1) {
        this();
    }

    public Money$Builder clearCurrencyCode() {
        this.copyOnWrite();
        Money.access$200((Money)this.instance);
        return this;
    }

    public Money$Builder clearNanos() {
        this.copyOnWrite();
        Money.access$700((Money)this.instance);
        return this;
    }

    public Money$Builder clearUnits() {
        this.copyOnWrite();
        Money.access$500((Money)this.instance);
        return this;
    }

    public String getCurrencyCode() {
        return ((Money)this.instance).getCurrencyCode();
    }

    public ByteString getCurrencyCodeBytes() {
        return ((Money)this.instance).getCurrencyCodeBytes();
    }

    public int getNanos() {
        return ((Money)this.instance).getNanos();
    }

    public long getUnits() {
        return ((Money)this.instance).getUnits();
    }

    public Money$Builder setCurrencyCode(String string2) {
        this.copyOnWrite();
        Money.access$100((Money)this.instance, string2);
        return this;
    }

    public Money$Builder setCurrencyCodeBytes(ByteString byteString) {
        this.copyOnWrite();
        Money.access$300((Money)this.instance, byteString);
        return this;
    }

    public Money$Builder setNanos(int n3) {
        this.copyOnWrite();
        Money.access$600((Money)this.instance, n3);
        return this;
    }

    public Money$Builder setUnits(long l2) {
        this.copyOnWrite();
        Money.access$400((Money)this.instance, l2);
        return this;
    }
}

