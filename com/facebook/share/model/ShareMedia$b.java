/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.share.model;

public final class ShareMedia$b
extends Enum {
    private static final /* synthetic */ ShareMedia$b[] $VALUES;
    public static final /* enum */ ShareMedia$b PHOTO;
    public static final /* enum */ ShareMedia$b VIDEO;

    private static final /* synthetic */ ShareMedia$b[] $values() {
        ShareMedia$b shareMedia$b = PHOTO;
        shareMedia$b = VIDEO;
        ShareMedia$b[] shareMedia$bArray = new ShareMedia$b[]{shareMedia$b, shareMedia$b};
        return shareMedia$bArray;
    }

    static {
        ShareMedia$b shareMedia$b;
        PHOTO = shareMedia$b = new ShareMedia$b("PHOTO", 0);
        VIDEO = shareMedia$b = new ShareMedia$b("VIDEO", 1);
        $VALUES = ShareMedia$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ShareMedia$b() {
        void var2_-1;
        void var1_-1;
    }

    public static ShareMedia$b valueOf(String string2) {
        return Enum.valueOf(ShareMedia$b.class, string2);
    }

    public static ShareMedia$b[] values() {
        return (ShareMedia$b[])$VALUES.clone();
    }
}

