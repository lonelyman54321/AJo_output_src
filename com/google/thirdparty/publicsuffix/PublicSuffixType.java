/*
 * Decompiled with CFR 0.152.
 */
package com.google.thirdparty.publicsuffix;

public final class PublicSuffixType
extends Enum {
    private static final /* synthetic */ PublicSuffixType[] $VALUES;
    public static final /* enum */ PublicSuffixType PRIVATE;
    public static final /* enum */ PublicSuffixType REGISTRY;
    private final char innerNodeCode;
    private final char leafNodeCode;

    private static /* synthetic */ PublicSuffixType[] $values() {
        PublicSuffixType publicSuffixType = PRIVATE;
        publicSuffixType = REGISTRY;
        PublicSuffixType[] publicSuffixTypeArray = new PublicSuffixType[]{publicSuffixType, publicSuffixType};
        return publicSuffixTypeArray;
    }

    static {
        PublicSuffixType publicSuffixType;
        PRIVATE = publicSuffixType = new PublicSuffixType("PRIVATE", 0, ':', ',');
        REGISTRY = publicSuffixType = new PublicSuffixType("REGISTRY", 1, '!', '?');
        $VALUES = PublicSuffixType.$values();
    }

    /*
     * WARNING - void declaration
     */
    private PublicSuffixType() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.innerNodeCode = var3_2;
        this.leafNodeCode = var4_1;
    }

    public static PublicSuffixType fromCode(char c2) {
        for (PublicSuffixType publicSuffixType : PublicSuffixType.values()) {
            char c3 = publicSuffixType.getInnerNodeCode();
            if (c3 != c2 && (c3 = publicSuffixType.getLeafNodeCode()) != c2) {
                continue;
            }
            return publicSuffixType;
        }
        StringBuilder stringBuilder = new StringBuilder("No enum corresponding to given code: ");
        stringBuilder.append(c2);
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static PublicSuffixType valueOf(String string2) {
        return Enum.valueOf(PublicSuffixType.class, string2);
    }

    public static PublicSuffixType[] values() {
        return (PublicSuffixType[])$VALUES.clone();
    }

    public char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    public char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}

