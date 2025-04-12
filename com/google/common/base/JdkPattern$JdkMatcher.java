/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CommonMatcher;
import com.google.common.base.Preconditions;
import java.util.regex.Matcher;

final class JdkPattern$JdkMatcher
extends CommonMatcher {
    final Matcher matcher;

    public JdkPattern$JdkMatcher(Matcher matcher) {
        this.matcher = matcher = (Matcher)Preconditions.checkNotNull(matcher);
    }

    public int end() {
        return this.matcher.end();
    }

    public boolean find() {
        return this.matcher.find();
    }

    public boolean find(int n3) {
        return this.matcher.find(n3);
    }

    public boolean matches() {
        return this.matcher.matches();
    }

    public String replaceAll(String string2) {
        return this.matcher.replaceAll(string2);
    }

    public int start() {
        return this.matcher.start();
    }
}

