/*
 * Decompiled with CFR 0.152.
 */
public final class vE2
implements tO1 {
    public final wo1_1 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public vE2(wo1_1 wo1_12, String string2, Object[] objectArray) {
        this.a = wo1_12;
        this.b = string2;
        this.c = objectArray;
        wo1_12 = null;
        int n3 = string2.charAt(0);
        int n4 = 55296;
        if (n3 < n4) {
            this.d = n3;
        } else {
            n3 &= 0x1FFF;
            int n7 = 1;
            int n8 = 13;
            while (true) {
                int n10 = n7 + 1;
                if ((n7 = (int)string2.charAt(n7)) < n4) break;
                n7 = (n7 & 0x1FFF) << n8;
                n3 |= n7;
                n8 += 13;
                n7 = n10;
            }
            int n14 = n7 << n8;
            this.d = n3 |= n14;
        }
    }

    public final Object[] a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final wo1_1 getDefaultInstance() {
        return this.a;
    }

    public final FB2 getSyntax() {
        int n3 = this.d;
        int n4 = 1;
        FB2 fB2 = (n3 &= n4) == n4 ? FB2.PROTO2 : FB2.PROTO3;
        return fB2;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean isMessageSetWireFormat() {
        void var1_5;
        int bl2 = this.d;
        int n3 = 2;
        int n4 = bl2 & n3;
        if (n4 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }
}

