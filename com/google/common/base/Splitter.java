/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CommonPattern;
import com.google.common.base.JdkPattern;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter$1;
import com.google.common.base.Splitter$2;
import com.google.common.base.Splitter$3;
import com.google.common.base.Splitter$4;
import com.google.common.base.Splitter$5;
import com.google.common.base.Splitter$MapSplitter;
import com.google.common.base.Splitter$Strategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Splitter$Strategy strategy;
    private final CharMatcher trimmer;

    private Splitter(Splitter$Strategy splitter$Strategy) {
        CharMatcher charMatcher = CharMatcher.none();
        this(splitter$Strategy, false, charMatcher, -1 >>> 1);
    }

    private Splitter(Splitter$Strategy splitter$Strategy, boolean bl2, CharMatcher charMatcher, int n3) {
        this.strategy = splitter$Strategy;
        this.omitEmptyStrings = bl2;
        this.trimmer = charMatcher;
        this.limit = n3;
    }

    public static /* synthetic */ Iterator access$000(Splitter splitter, CharSequence charSequence) {
        return splitter.splittingIterator(charSequence);
    }

    public static /* synthetic */ CharMatcher access$200(Splitter splitter) {
        return splitter.trimmer;
    }

    public static /* synthetic */ boolean access$300(Splitter splitter) {
        return splitter.omitEmptyStrings;
    }

    public static /* synthetic */ int access$400(Splitter splitter) {
        return splitter.limit;
    }

    public static Splitter fixedLength(int n3) {
        Splitter splitter;
        boolean bl2;
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            splitter = null;
        }
        Preconditions.checkArgument(bl2, "The length may not be less than 1");
        Splitter$4 splitter$4 = new Splitter$4(n3);
        splitter = new Splitter(splitter$4);
        return splitter;
    }

    public static Splitter on(char c2) {
        return Splitter.on(CharMatcher.is(c2));
    }

    public static Splitter on(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        Splitter$1 splitter$1 = new Splitter$1(charMatcher);
        Splitter splitter = new Splitter(splitter$1);
        return splitter;
    }

    public static Splitter on(String string2) {
        Splitter splitter;
        int n3 = string2.length();
        Splitter$2 splitter$2 = null;
        int n4 = 1;
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            splitter = null;
        }
        String string3 = "The separator may not be the empty string.";
        Preconditions.checkArgument(n3 != 0, string3);
        n3 = string2.length();
        if (n3 == n4) {
            return Splitter.on(string2.charAt(0));
        }
        splitter$2 = new Splitter$2(string2);
        splitter = new Splitter(splitter$2);
        return splitter;
    }

    public static Splitter on(Pattern pattern) {
        JdkPattern jdkPattern = new JdkPattern(pattern);
        return Splitter.onPatternInternal(jdkPattern);
    }

    public static Splitter onPattern(String string2) {
        return Splitter.onPatternInternal(Platform.compilePattern(string2));
    }

    public static Splitter onPatternInternal(CommonPattern commonPattern) {
        Preconditions.checkArgument(commonPattern.matcher("").matches() ^ true, "The pattern may not match the empty string: %s", (Object)commonPattern);
        Splitter$3 splitter$3 = new Splitter$3(commonPattern);
        Splitter splitter = new Splitter(splitter$3);
        return splitter;
    }

    private Iterator splittingIterator(CharSequence charSequence) {
        return this.strategy.iterator(this, charSequence);
    }

    public Splitter limit(int n3) {
        Splitter splitter;
        boolean bl2;
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            splitter = null;
        }
        Preconditions.checkArgument(bl2, "must be greater than zero: %s", n3);
        Splitter$Strategy splitter$Strategy = this.strategy;
        boolean bl3 = this.omitEmptyStrings;
        CharMatcher charMatcher = this.trimmer;
        splitter = new Splitter(splitter$Strategy, bl3, charMatcher, n3);
        return splitter;
    }

    public Splitter omitEmptyStrings() {
        Splitter$Strategy splitter$Strategy = this.strategy;
        CharMatcher charMatcher = this.trimmer;
        int n3 = this.limit;
        Splitter splitter = new Splitter(splitter$Strategy, true, charMatcher, n3);
        return splitter;
    }

    public Iterable split(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Splitter$5 splitter$5 = new Splitter$5(this, charSequence);
        return splitter$5;
    }

    public List splitToList(CharSequence object) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        object = this.splittingIterator((CharSequence)object);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            arrayList.add(string2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        CharMatcher charMatcher = CharMatcher.whitespace();
        return this.trimResults(charMatcher);
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        Splitter$Strategy splitter$Strategy = this.strategy;
        boolean bl2 = this.omitEmptyStrings;
        int n3 = this.limit;
        Splitter splitter = new Splitter(splitter$Strategy, bl2, charMatcher, n3);
        return splitter;
    }

    public Splitter$MapSplitter withKeyValueSeparator(char c2) {
        Splitter splitter = Splitter.on(c2);
        return this.withKeyValueSeparator(splitter);
    }

    public Splitter$MapSplitter withKeyValueSeparator(Splitter splitter) {
        Splitter$MapSplitter splitter$MapSplitter = new Splitter$MapSplitter(this, splitter, null);
        return splitter$MapSplitter;
    }

    public Splitter$MapSplitter withKeyValueSeparator(String object) {
        object = Splitter.on((String)object);
        return this.withKeyValueSeparator((Splitter)object);
    }
}

