/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.Date;
import com.google.type.Date$1;
import com.google.type.DateOrBuilder;

public final class Date$Builder
extends GeneratedMessageLite$Builder
implements DateOrBuilder {
    private Date$Builder() {
        Date date = Date.access$000();
        super(date);
    }

    public /* synthetic */ Date$Builder(Date$1 date$1) {
        this();
    }

    public Date$Builder clearDay() {
        this.copyOnWrite();
        Date.access$600((Date)this.instance);
        return this;
    }

    public Date$Builder clearMonth() {
        this.copyOnWrite();
        Date.access$400((Date)this.instance);
        return this;
    }

    public Date$Builder clearYear() {
        this.copyOnWrite();
        Date.access$200((Date)this.instance);
        return this;
    }

    public int getDay() {
        return ((Date)this.instance).getDay();
    }

    public int getMonth() {
        return ((Date)this.instance).getMonth();
    }

    public int getYear() {
        return ((Date)this.instance).getYear();
    }

    public Date$Builder setDay(int n3) {
        this.copyOnWrite();
        Date.access$500((Date)this.instance, n3);
        return this;
    }

    public Date$Builder setMonth(int n3) {
        this.copyOnWrite();
        Date.access$300((Date)this.instance, n3);
        return this;
    }

    public Date$Builder setYear(int n3) {
        this.copyOnWrite();
        Date.access$100((Date)this.instance, n3);
        return this;
    }
}

