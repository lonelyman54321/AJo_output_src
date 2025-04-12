/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.cdnlogging;

public final class a {
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof a;
        if (!bl3) {
            return false;
        }
        object = (a)object;
        bl3 = this.a;
        boolean bl4 = ((a)object).a;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.b;
        bl4 = ((a)object).b;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.c;
        bl4 = ((a)object).c;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.d;
        boolean bl5 = ((a)object).d;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        boolean bl2;
        boolean n3 = this.a;
        boolean bl3 = true;
        if (n3) {
            bl2 = true;
        }
        void var1_3 = bl2 * 31;
        boolean bl4 = this.b;
        if (bl4) {
            bl4 = true;
        }
        void var1_4 = (var1_3 + bl4) * 31;
        bl4 = this.c;
        if (bl4) {
            bl4 = true;
        }
        void var1_5 = (var1_4 + bl4) * 31;
        bl4 = this.d;
        if (!bl4) {
            bl3 = bl4;
        }
        return (int)(var1_5 + bl3);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ErrorFlags(isShouldSync_HighSeverityErrors=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", isShouldSync_MidSeverityErrors=");
        bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", isShouldSync_LowSeverityErrors=");
        bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", isShouldSync_AllErrors=");
        bl2 = this.d;
        return AR.a(stringBuilder, bl2, ')');
    }
}

