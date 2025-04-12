/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.net;

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.List;

public final class InternetDomainName {
    private static final CharMatcher DASH_MATCHER;
    private static final CharMatcher DIGIT_MATCHER;
    private static final CharMatcher DOTS_MATCHER;
    private static final Joiner DOT_JOINER;
    private static final Splitter DOT_SPLITTER;
    private static final CharMatcher LETTER_MATCHER;
    private static final int MAX_DOMAIN_PART_LENGTH = 63;
    private static final int MAX_LENGTH = 253;
    private static final int MAX_PARTS = 127;
    private static final int NO_SUFFIX_FOUND = 255;
    private static final CharMatcher PART_CHAR_MATCHER;
    private static final int SUFFIX_NOT_INITIALIZED = 254;
    private final String name;
    private final ImmutableList parts;
    private int publicSuffixIndexCache;
    private int registrySuffixIndexCache;

    static {
        CharMatcher charMatcher;
        CharMatcher charMatcher2;
        DOTS_MATCHER = CharMatcher.anyOf(".\u3002\uff0e\uff61");
        char c2 = '.';
        DOT_SPLITTER = Splitter.on(c2);
        DOT_JOINER = Joiner.on(c2);
        DASH_MATCHER = charMatcher2 = CharMatcher.anyOf("-_");
        DIGIT_MATCHER = charMatcher = CharMatcher.inRange('0', '9');
        CharMatcher charMatcher3 = CharMatcher.inRange('a', 'z');
        CharMatcher charMatcher4 = CharMatcher.inRange('A', 'Z');
        LETTER_MATCHER = charMatcher3 = charMatcher3.or(charMatcher4);
        PART_CHAR_MATCHER = charMatcher.or(charMatcher3).or(charMatcher2);
    }

    public InternetDomainName(String string2) {
        int n3;
        int n4;
        this.publicSuffixIndexCache = n4 = -2;
        this.registrySuffixIndexCache = n4;
        string2 = Ascii.toLowerCase(DOTS_MATCHER.replaceFrom((CharSequence)string2, '.'));
        Object object = ".";
        n4 = (int)(string2.endsWith((String)object) ? 1 : 0);
        int n7 = 1;
        if (n4 != 0) {
            n4 = string2.length() - n7;
            string2 = string2.substring(0, n4);
        }
        if ((n4 = string2.length()) <= (n3 = 253)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        String string3 = "Domain name too long: '%s':";
        Preconditions.checkArgument(n4 != 0, string3, (Object)string2);
        this.name = string2;
        this.parts = object = ImmutableList.copyOf(DOT_SPLITTER.split(string2));
        n3 = ((AbstractCollection)object).size();
        int n8 = 127;
        if (n3 > n8) {
            n7 = 0;
        }
        Preconditions.checkArgument(n7 != 0, "Domain has too many parts: '%s'", (Object)string2);
        Preconditions.checkArgument(InternetDomainName.validateSyntax((List)object), "Not a valid domain name: '%s'", (Object)string2);
    }

    private InternetDomainName ancestor(int n3) {
        Joiner joiner = DOT_JOINER;
        ImmutableList immutableList = this.parts;
        int n4 = immutableList.size();
        ImmutableList immutableList2 = immutableList.subList(n3, n4);
        return InternetDomainName.from(joiner.join(immutableList2));
    }

    private int findSuffixOfType(Optional optional) {
        ImmutableList immutableList = this.parts;
        int n3 = immutableList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Object object = DOT_JOINER;
            Serializable serializable = this.parts.subList(i3, n3);
            object = ((Joiner)object).join((Iterable)((Object)serializable));
            if (i3 > 0 && (bl2 = InternetDomainName.matchesType(optional, (Optional)(serializable = Optional.fromNullable((Object)((PublicSuffixType)((Object)PublicSuffixPatterns.UNDER.get(object)))))))) {
                return i3 + -1;
            }
            serializable = Optional.fromNullable((Object)((PublicSuffixType)((Object)PublicSuffixPatterns.EXACT.get(object))));
            bl2 = InternetDomainName.matchesType(optional, (Optional)serializable);
            if (bl2) {
                return i3;
            }
            serializable = PublicSuffixPatterns.EXCLUDED;
            boolean bl3 = ((ImmutableMap)serializable).containsKey(object);
            if (!bl3) continue;
            return i3 + 1;
        }
        return -1;
    }

    public static InternetDomainName from(String string2) {
        string2 = (String)Preconditions.checkNotNull(string2);
        InternetDomainName internetDomainName = new InternetDomainName(string2);
        return internetDomainName;
    }

    public static boolean isValid(String string2) {
        try {
            InternetDomainName.from(string2);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    private static boolean matchesType(Optional optional, Optional optional2) {
        boolean bl2 = optional.isPresent();
        boolean bl3 = bl2 ? optional.equals(optional2) : optional2.isPresent();
        return bl3;
    }

    private int publicSuffixIndex() {
        int n3 = this.publicSuffixIndexCache;
        int n4 = -2;
        if (n3 == n4) {
            Optional optional = Optional.absent();
            this.publicSuffixIndexCache = n3 = this.findSuffixOfType(optional);
        }
        return n3;
    }

    private int registrySuffixIndex() {
        int n3 = this.registrySuffixIndexCache;
        int n4 = -2;
        if (n3 == n4) {
            Optional optional = Optional.of((Object)PublicSuffixType.REGISTRY);
            this.registrySuffixIndexCache = n3 = this.findSuffixOfType(optional);
        }
        return n3;
    }

    private static boolean validatePart(String string2, boolean bl2) {
        int n3;
        int n4;
        int n7 = string2.length();
        if (n7 >= (n4 = 1) && (n7 = string2.length()) <= (n3 = 63)) {
            CharMatcher charMatcher = PART_CHAR_MATCHER;
            Object object = CharMatcher.ascii().retainFrom(string2);
            n7 = (int)(charMatcher.matchesAllOf((CharSequence)object) ? 1 : 0);
            if (!n7) {
                return false;
            }
            object = DASH_MATCHER;
            n3 = string2.charAt(0);
            if (!(n3 = (int)(((CharMatcher)object).matches((char)n3) ? 1 : 0))) {
                n3 = string2.length() - n4;
                n7 = (int)(((CharMatcher)object).matches((char)(n3 = (int)string2.charAt(n3))) ? 1 : 0);
                if (!n7) {
                    if (bl2) {
                        CharMatcher charMatcher2 = DIGIT_MATCHER;
                        char c2 = string2.charAt(0);
                        if ((c2 = (char)(charMatcher2.matches(c2) ? 1 : 0)) != '\u0000') {
                            return false;
                        }
                    }
                    return n4 != 0;
                }
            }
        }
        return false;
    }

    private static boolean validateSyntax(List list) {
        int n3 = list.size();
        int n4 = 1;
        String string2 = (String)list.get(n3 -= n4);
        int n7 = InternetDomainName.validatePart(string2, n4 != 0);
        if (n7 == 0) {
            return false;
        }
        string2 = null;
        for (n7 = 0; n7 < n3; ++n7) {
            String string3 = (String)list.get(n7);
            boolean bl2 = InternetDomainName.validatePart(string3, false);
            if (bl2) continue;
            return false;
        }
        return n4 != 0;
    }

    public InternetDomainName child(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        string2 = (String)Preconditions.checkNotNull(string2);
        stringBuilder.append(string2);
        stringBuilder.append(".");
        string2 = this.name;
        stringBuilder.append(string2);
        return InternetDomainName.from(stringBuilder.toString());
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof InternetDomainName;
        if (bl2) {
            object = (InternetDomainName)object;
            String string2 = this.name;
            object = ((InternetDomainName)object).name;
            return string2.equals(object);
        }
        return false;
    }

    public boolean hasParent() {
        int n3;
        ImmutableList immutableList = this.parts;
        int n4 = immutableList.size();
        if (n4 <= (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public boolean hasPublicSuffix() {
        int n3;
        int n4 = this.publicSuffixIndex();
        n4 = n4 != (n3 = -1) ? 1 : 0;
        return n4 != 0;
    }

    public boolean hasRegistrySuffix() {
        int n3;
        int n4 = this.registrySuffixIndex();
        n4 = n4 != (n3 = -1) ? 1 : 0;
        return n4 != 0;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public boolean isPublicSuffix() {
        int n3 = this.publicSuffixIndex();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isRegistrySuffix() {
        int n3 = this.registrySuffixIndex();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isTopDomainUnderRegistrySuffix() {
        int n3;
        int n4 = this.registrySuffixIndex();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public boolean isTopPrivateDomain() {
        int n3;
        int n4 = this.publicSuffixIndex();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public boolean isUnderPublicSuffix() {
        int n3 = this.publicSuffixIndex();
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isUnderRegistrySuffix() {
        int n3 = this.registrySuffixIndex();
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public InternetDomainName parent() {
        boolean bl2 = this.hasParent();
        String string2 = this.name;
        Preconditions.checkState(bl2, "Domain '%s' has no parent", (Object)string2);
        return this.ancestor(1);
    }

    public ImmutableList parts() {
        return this.parts;
    }

    public InternetDomainName publicSuffix() {
        InternetDomainName internetDomainName;
        int n3 = this.hasPublicSuffix();
        if (n3 != 0) {
            n3 = this.publicSuffixIndex();
            internetDomainName = this.ancestor(n3);
        } else {
            n3 = 0;
            internetDomainName = null;
        }
        return internetDomainName;
    }

    public InternetDomainName registrySuffix() {
        InternetDomainName internetDomainName;
        int n3 = this.hasRegistrySuffix();
        if (n3 != 0) {
            n3 = this.registrySuffixIndex();
            internetDomainName = this.ancestor(n3);
        } else {
            n3 = 0;
            internetDomainName = null;
        }
        return internetDomainName;
    }

    public String toString() {
        return this.name;
    }

    public InternetDomainName topDomainUnderRegistrySuffix() {
        int n3 = this.isTopDomainUnderRegistrySuffix();
        if (n3 != 0) {
            return this;
        }
        n3 = this.isUnderRegistrySuffix();
        String string2 = this.name;
        Preconditions.checkState(n3 != 0, "Not under a registry suffix: %s", (Object)string2);
        n3 = this.registrySuffixIndex() + -1;
        return this.ancestor(n3);
    }

    public InternetDomainName topPrivateDomain() {
        int n3 = this.isTopPrivateDomain();
        if (n3 != 0) {
            return this;
        }
        n3 = this.isUnderPublicSuffix();
        String string2 = this.name;
        Preconditions.checkState(n3 != 0, "Not under a public suffix: %s", (Object)string2);
        n3 = this.publicSuffixIndex() + -1;
        return this.ancestor(n3);
    }
}

