/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.internal;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class StringUtil$StringJoiner {
    boolean first;
    StringBuilder sb;
    final String separator;

    public StringUtil$StringJoiner(String string2) {
        StringBuilder stringBuilder;
        this.sb = stringBuilder = StringUtil.borrowBuilder();
        this.first = true;
        this.separator = string2;
    }

    public StringUtil$StringJoiner add(Object object) {
        StringBuilder stringBuilder = this.sb;
        Validate.notNull(stringBuilder);
        boolean bl2 = this.first;
        if (!bl2) {
            stringBuilder = this.sb;
            String string2 = this.separator;
            stringBuilder.append(string2);
        }
        this.sb.append(object);
        this.first = false;
        return this;
    }

    public StringUtil$StringJoiner append(Object object) {
        Validate.notNull(this.sb);
        this.sb.append(object);
        return this;
    }

    public String complete() {
        String string2 = StringUtil.releaseBuilder(this.sb);
        this.sb = null;
        return string2;
    }
}

