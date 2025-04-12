/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

final class zzee {
    private final String info;
    private int position;

    public zzee(String string2) {
        this.info = string2;
        this.position = 0;
    }

    public final boolean hasNext() {
        int n3 = this.position;
        String string2 = this.info;
        int n4 = string2.length();
        return n3 < n4;
    }

    public final int next() {
        int n3;
        int n4;
        String string2 = this.info;
        int n7 = this.position;
        this.position = n4 = n7 + 1;
        int n8 = string2.charAt(n7);
        if (n8 < (n7 = 55296)) {
            return n8;
        }
        n8 &= 0x1FFF;
        n4 = 13;
        while (true) {
            int n10;
            String string3 = this.info;
            int n14 = this.position;
            this.position = n10 = n14 + 1;
            n3 = string3.charAt(n14);
            if (n3 < n7) break;
            n3 = (n3 & 0x1FFF) << n4;
            n8 |= n3;
            n4 += 13;
        }
        n7 = n3 << n4;
        return n8 | n7;
    }
}

