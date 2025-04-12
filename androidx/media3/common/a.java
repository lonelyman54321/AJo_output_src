/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common;

import androidx.media3.common.MediaItem;
import androidx.media3.common.a$a;
import java.util.Arrays;
import java.util.Objects;

public final class a {
    public static final a g;
    public static final a$a h;
    public final Object a = null;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final a$a[] f;

    static {
        Object[] objectArray = new a$a[]{};
        Object object = new a((a$a[])objectArray);
        g = object;
        int[] nArray = new int[]{};
        Object[] objectArray2 = new MediaItem[]{};
        Object[] objectArray3 = new long[]{};
        object = new a$a(-1, -1, nArray, (MediaItem[])objectArray2, (long[])objectArray3);
        objectArray = ((a$a)object).f;
        int n3 = objectArray.length;
        int n4 = Math.max(0, n3);
        objectArray2 = Arrays.copyOf((int[])objectArray, n4);
        Arrays.fill((int[])objectArray2, n3, n4, 0);
        Object object2 = ((a$a)object).g;
        int n7 = ((long[])object2).length;
        n3 = Math.max(0, n7);
        long[] lArray = Arrays.copyOf(object2, n3);
        Arrays.fill(lArray, n7, n3, -9223372036854775807L);
        object2 = Arrays.copyOf(((a$a)object).e, 0);
        objectArray3 = object2;
        objectArray3 = (MediaItem[])object2;
        object2 = new a$a;
        int n8 = ((a$a)object).c;
        object2(0, n8, (int[])objectArray2, (MediaItem[])objectArray3, lArray);
        h = object2;
        gz3.D(1);
        gz3.D(2);
        gz3.D(3);
        gz3.D(4);
    }

    public a(a$a[] a$aArray) {
        int n3;
        this.c = 0L;
        this.d = -9223372036854775807L;
        this.b = n3 = a$aArray.length;
        this.f = a$aArray;
        this.e = 0;
    }

    public final a$a a(int n3) {
        a$a a$a;
        int n4 = this.e;
        if (n3 < n4) {
            a$a = h;
        } else {
            a$a[] a$aArray = this.f;
            a$a = a$aArray[n3 -= n4];
        }
        return a$a;
    }

    public final boolean b(int n3) {
        int n4;
        block3: {
            block2: {
                long l2;
                long l3;
                long l4;
                int n7 = this.b;
                n4 = 1;
                if (n3 != (n7 -= n4)) break block2;
                a$a a$a = this.a(n3);
                n7 = (int)(a$a.i ? 1 : 0);
                if (n7 != 0 && (n7 = (int)((l4 = (l3 = a$a.a) - (l2 = Long.MIN_VALUE)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0 && (n3 = a$a.b) == (n7 = -1)) break block3;
            }
            n4 = 0;
        }
        return n4 != 0;
    }

    public final boolean equals(Object objectArray) {
        Object object;
        Object object2;
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        if (objectArray != null && (object2 = a.class) == (object = objectArray.getClass())) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            int n3;
            objectArray = (a)objectArray;
            int n4 = gz3.a;
            object = this.a;
            object2 = objectArray.a;
            n4 = (int)(Objects.equals(object, object2) ? 1 : 0);
            if (n4 == 0 || (n4 = this.b) != (n3 = objectArray.b) || (l8 = (l7 = (l4 = this.c) - (l3 = objectArray.c)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false || (l8 = (l2 = (l4 = this.d) - (l3 = objectArray.d)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false || (n4 = this.e) != (n3 = objectArray.e) || !(bl3 = Arrays.equals(object = this.f, objectArray = objectArray.f))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.b * 31;
        Object object = this.a;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        int n7 = (int)this.c;
        n4 = (n4 + n7) * 31;
        n7 = (int)this.d;
        n4 = (n4 + n7) * 31;
        n3 = this.e;
        n4 = (n4 + n3) * 31;
        return Arrays.hashCode(this.f) + n4;
    }

    public final String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder("AdPlaybackState(adsId=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", adResumePositionUs=");
        long l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", adGroups=[");
        object = null;
        int n3 = 0;
        while (true) {
            int n4;
            String string3;
            a$a[] a$aArray = this.f;
            int n7 = a$aArray.length;
            string2 = "])";
            if (n3 >= n7) break;
            stringBuilder.append("adGroup(timeUs=");
            long l3 = a$aArray[n3].a;
            stringBuilder.append(l3);
            stringBuilder.append(", ads=[");
            n7 = 0;
            while (true) {
                int[] nArray = a$aArray[n3].f;
                int n8 = nArray.length;
                string3 = ", ";
                n4 = 1;
                if (n7 >= n8) break;
                stringBuilder.append("ad(state=");
                nArray = a$aArray[n3].f;
                n8 = nArray[n7];
                if (n8 != 0) {
                    if (n8 != n4) {
                        int n10 = 2;
                        if (n8 != n10) {
                            n10 = 3;
                            if (n8 != n10) {
                                n10 = 4;
                                if (n8 != n10) {
                                    n8 = 63;
                                    stringBuilder.append((char)n8);
                                } else {
                                    n8 = 33;
                                    stringBuilder.append((char)n8);
                                }
                            } else {
                                n8 = 80;
                                stringBuilder.append((char)n8);
                            }
                        } else {
                            n8 = 83;
                            stringBuilder.append((char)n8);
                        }
                    } else {
                        n8 = 82;
                        stringBuilder.append((char)n8);
                    }
                } else {
                    n8 = 95;
                    stringBuilder.append((char)n8);
                }
                stringBuilder.append(", durationUs=");
                long l4 = a$aArray[n3].g[n7];
                stringBuilder.append(l4);
                stringBuilder.append(')');
                nArray = a$aArray[n3].f;
                n8 = nArray.length - n4;
                if (n7 < n8) {
                    stringBuilder.append(string3);
                }
                ++n7;
            }
            stringBuilder.append(string2);
            int n14 = a$aArray.length - n4;
            if (n3 < n14) {
                stringBuilder.append(string3);
            }
            ++n3;
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

