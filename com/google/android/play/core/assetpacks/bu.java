/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.fc;

final class bu
extends fc {
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final int e;

    public bu(int n3, String string2, long l2, long l3, int n4) {
        this.a = n3;
        this.b = string2;
        this.c = l2;
        this.d = l3;
        this.e = n4;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.e;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object object) {
        block5: {
            int n3;
            long l2;
            int n4;
            boolean bl2;
            block7: {
                String string2;
                block6: {
                    int n7;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    n4 = object instanceof fc;
                    if (n4 == 0 || (n4 = this.a) != (n7 = ((fc)(object = (fc)object)).a())) break block5;
                    string2 = this.b;
                    if (string2 != null) break block6;
                    string2 = ((fc)object).e();
                    if (string2 != null) break block5;
                    break block7;
                }
                String string3 = ((fc)object).e();
                n4 = (int)(string2.equals(string3) ? 1 : 0);
                if (n4 == 0) break block5;
            }
            long l3 = this.c;
            long l4 = ((fc)object).c();
            n4 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1));
            if (n4 == 0 && (n4 = (int)((l2 = (l3 = this.d) - (l4 = ((fc)object).d())) == 0L ? 0 : (l2 < 0L ? -1 : 1))) == 0 && (n4 = this.e) == (n3 = ((fc)object).b())) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.b;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n4 = this.a;
        long l2 = this.c;
        long l3 = this.d;
        int n7 = 32;
        long l4 = l3 >>> n7;
        l3 ^= l4;
        long l7 = l2 >>> n7;
        n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        n3 = (n3 ^ n4) * n7;
        n4 = (int)(l2 ^= l7);
        n3 = (n3 ^ n4) * n7;
        n4 = (int)l3;
        n3 = (n3 ^ n4) * n7;
        n4 = this.e;
        return n3 ^ n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SliceCheckpoint{fileExtractionStatus=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", filePath=");
        String string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", fileOffset=");
        long l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", remainingBytes=");
        l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", previousChunk=");
        return g30.a(this.e, "}", stringBuilder);
    }
}

