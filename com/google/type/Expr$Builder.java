/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.Expr;
import com.google.type.Expr$1;
import com.google.type.ExprOrBuilder;

public final class Expr$Builder
extends GeneratedMessageLite$Builder
implements ExprOrBuilder {
    private Expr$Builder() {
        Expr expr = Expr.access$000();
        super(expr);
    }

    public /* synthetic */ Expr$Builder(Expr$1 expr$1) {
        this();
    }

    public Expr$Builder clearDescription() {
        this.copyOnWrite();
        Expr.access$800((Expr)this.instance);
        return this;
    }

    public Expr$Builder clearExpression() {
        this.copyOnWrite();
        Expr.access$200((Expr)this.instance);
        return this;
    }

    public Expr$Builder clearLocation() {
        this.copyOnWrite();
        Expr.access$1100((Expr)this.instance);
        return this;
    }

    public Expr$Builder clearTitle() {
        this.copyOnWrite();
        Expr.access$500((Expr)this.instance);
        return this;
    }

    public String getDescription() {
        return ((Expr)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((Expr)this.instance).getDescriptionBytes();
    }

    public String getExpression() {
        return ((Expr)this.instance).getExpression();
    }

    public ByteString getExpressionBytes() {
        return ((Expr)this.instance).getExpressionBytes();
    }

    public String getLocation() {
        return ((Expr)this.instance).getLocation();
    }

    public ByteString getLocationBytes() {
        return ((Expr)this.instance).getLocationBytes();
    }

    public String getTitle() {
        return ((Expr)this.instance).getTitle();
    }

    public ByteString getTitleBytes() {
        return ((Expr)this.instance).getTitleBytes();
    }

    public Expr$Builder setDescription(String string2) {
        this.copyOnWrite();
        Expr.access$700((Expr)this.instance, string2);
        return this;
    }

    public Expr$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        Expr.access$900((Expr)this.instance, byteString);
        return this;
    }

    public Expr$Builder setExpression(String string2) {
        this.copyOnWrite();
        Expr.access$100((Expr)this.instance, string2);
        return this;
    }

    public Expr$Builder setExpressionBytes(ByteString byteString) {
        this.copyOnWrite();
        Expr.access$300((Expr)this.instance, byteString);
        return this;
    }

    public Expr$Builder setLocation(String string2) {
        this.copyOnWrite();
        Expr.access$1000((Expr)this.instance, string2);
        return this;
    }

    public Expr$Builder setLocationBytes(ByteString byteString) {
        this.copyOnWrite();
        Expr.access$1200((Expr)this.instance, byteString);
        return this;
    }

    public Expr$Builder setTitle(String string2) {
        this.copyOnWrite();
        Expr.access$400((Expr)this.instance, string2);
        return this;
    }

    public Expr$Builder setTitleBytes(ByteString byteString) {
        this.copyOnWrite();
        Expr.access$600((Expr)this.instance, byteString);
        return this;
    }
}

