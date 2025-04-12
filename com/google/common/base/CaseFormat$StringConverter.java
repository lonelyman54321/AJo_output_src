/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CaseFormat;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;

final class CaseFormat$StringConverter
extends Converter
implements Serializable {
    private static final long serialVersionUID;
    private final CaseFormat sourceFormat;
    private final CaseFormat targetFormat;

    public CaseFormat$StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
        this.sourceFormat = caseFormat = (CaseFormat)((Object)Preconditions.checkNotNull((Object)caseFormat));
        this.targetFormat = caseFormat = (CaseFormat)((Object)Preconditions.checkNotNull((Object)caseFormat2));
    }

    public String doBackward(String string2) {
        CaseFormat caseFormat = this.targetFormat;
        CaseFormat caseFormat2 = this.sourceFormat;
        return caseFormat.to(caseFormat2, string2);
    }

    public String doForward(String string2) {
        CaseFormat caseFormat = this.sourceFormat;
        CaseFormat caseFormat2 = this.targetFormat;
        return caseFormat.to(caseFormat2, string2);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof CaseFormat$StringConverter;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4;
            object = (CaseFormat$StringConverter)object;
            CaseFormat caseFormat = this.sourceFormat;
            CaseFormat caseFormat2 = ((CaseFormat$StringConverter)object).sourceFormat;
            bl2 = ((Object)((Object)caseFormat)).equals((Object)caseFormat2);
            if (bl2 && (bl4 = ((Object)((Object)(caseFormat = this.targetFormat))).equals(object = ((CaseFormat$StringConverter)object).targetFormat))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public int hashCode() {
        int n3 = ((Object)((Object)this.sourceFormat)).hashCode();
        int n4 = ((Object)((Object)this.targetFormat)).hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        CaseFormat caseFormat = this.sourceFormat;
        stringBuilder.append((Object)caseFormat);
        stringBuilder.append(".converterTo(");
        caseFormat = this.targetFormat;
        stringBuilder.append((Object)caseFormat);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

