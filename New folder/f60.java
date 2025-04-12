/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.b;
import org.json.JSONObject;

public final class f60 {
    public static final long a(int n3, int n4, int n7, int n8) {
        boolean bl2 = false;
        boolean bl3 = n4 >= n3;
        char c2 = ')';
        if (bl3) {
            bl3 = n8 >= n7;
            if (bl3) {
                if (n3 >= 0 && n7 >= 0) {
                    bl2 = true;
                }
                if (bl2) {
                    return f60.i(n3, n4, n7, n8);
                }
                StringBuilder stringBuilder = new StringBuilder("minWidth(");
                stringBuilder.append(n3);
                stringBuilder.append(") and minHeight(");
                stringBuilder.append(n7);
                stringBuilder.append(") must be >= 0");
                hz0.a(stringBuilder.toString());
                throw null;
            }
            StringBuilder stringBuilder = new StringBuilder("maxHeight(");
            stringBuilder.append(n8);
            stringBuilder.append(") must be >= than minHeight(");
            stringBuilder.append(n7);
            stringBuilder.append(c2);
            hz0.a(stringBuilder.toString());
            throw null;
        }
        StringBuilder stringBuilder = new StringBuilder("maxWidth(");
        stringBuilder.append(n4);
        stringBuilder.append(") must be >= than minWidth(");
        stringBuilder.append(n3);
        stringBuilder.append(c2);
        hz0.a(stringBuilder.toString());
        throw null;
    }

    public static /* synthetic */ long b(int n3, int n4, int n7) {
        int n8 = n7 & 2;
        if (n8 != 0) {
            n3 = -1 >>> 1;
        }
        if ((n7 &= 8) != 0) {
            n4 = -1 >>> 1;
        }
        return f60.a(0, n3, 0, n4);
    }

    public static final int c(int n3) {
        block6: {
            block3: {
                int n4;
                block5: {
                    block4: {
                        block2: {
                            n4 = 8191;
                            if (n3 >= n4) break block2;
                            n3 = 262142;
                            break block3;
                        }
                        n4 = Short.MAX_VALUE;
                        if (n3 >= n4) break block4;
                        n3 = (char)-2;
                        break block3;
                    }
                    n4 = (char)-1;
                    if (n3 >= n4) break block5;
                    n3 = 32766;
                    break block3;
                }
                n4 = 262143;
                if (n3 >= n4) break block6;
                n3 = 8190;
            }
            return n3;
        }
        String string2 = Gj0.b(n3, "Can't represent a size of ", " in Constraints");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static final int d(int n3) {
        int n4 = 8191;
        n3 = n3 < n4 ? 13 : (n3 < (n4 = Short.MAX_VALUE) ? 15 : (n3 < (n4 = (int)((char)-1)) ? 16 : (n3 < (n4 = 262143) ? 18 : 255)));
        return n3;
    }

    public static final long e(long l2, long l3) {
        int n3 = (int)(l3 >> 32);
        int n4 = c60.k(l2);
        int n7 = c60.i(l2);
        n4 = f.g(n3, n4, n7);
        int n8 = (int)(l3 & 0xFFFFFFFFL);
        int n10 = c60.j(l2);
        int n14 = c60.h(l2);
        n14 = f.g(n8, n10, n14);
        return dj1.a(n4, n14);
    }

    public static final long f(long l2, long l3) {
        int n3 = c60.k(l3);
        int n4 = c60.k(l2);
        int n7 = c60.i(l2);
        n3 = f.g(n3, n4, n7);
        n4 = c60.i(l3);
        n7 = c60.k(l2);
        int n8 = c60.i(l2);
        n4 = f.g(n4, n7, n8);
        n7 = c60.j(l3);
        n8 = c60.j(l2);
        int n10 = c60.h(l2);
        n7 = f.g(n7, n8, n10);
        int n14 = c60.h(l3);
        int n15 = c60.j(l2);
        int n16 = c60.h(l2);
        n16 = f.g(n14, n15, n16);
        return f60.a(n3, n4, n7, n16);
    }

    public static final int g(int n3, long l2) {
        int n4 = c60.j(l2);
        int n7 = c60.h(l2);
        return f.g(n3, n4, n7);
    }

    public static final int h(int n3, long l2) {
        int n4 = c60.k(l2);
        int n7 = c60.i(l2);
        return f.g(n3, n4, n7);
    }

    public static final long i(int n3, int n4, int n7, int n8) {
        int n10;
        int n14 = -1 >>> 1;
        int n15 = n8 == n14 ? n7 : n8;
        int n16 = f60.d(n15);
        int n17 = f60.d(n14 = n4 == n14 ? n3 : n4);
        if ((n16 += n17) <= (n10 = 31)) {
            n14 = 1;
            n15 = ~((n4 += n14) >> 31);
            n4 &= n15;
            n15 = ~((n8 += n14) >> 31);
            n8 &= n15;
            n15 = 13;
            n16 = 3;
            n10 = 0;
            int n18 = 2;
            if (n17 != n15) {
                n15 = 18;
                if (n17 != n15) {
                    n15 = 15;
                    if (n17 != n15) {
                        n15 = 16;
                        if (n17 == n15) {
                            n10 = 2;
                        }
                    } else {
                        n10 = 1;
                    }
                } else {
                    n10 = 3;
                }
            }
            n15 = (n10 & 1) << n14;
            n14 = ((n10 & 2) >> 1) * 3 + n15;
            n15 = n14 + 15;
            long l2 = n10;
            long l3 = (long)n3 << n18;
            long l4 = (long)n4 << 33 | (l2 |= l3);
            long l7 = (long)n7 << n15;
            long l8 = (long)n8 << (n14 += 46);
            return (l4 |= l7) | l8;
        }
        String string2 = z41.a("Can't represent a width of ", " and height of ", " in Constraints", n14, n15);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean j(long l2, long l3) {
        int n3 = c60.k(l2);
        int n4 = c60.i(l2);
        int n7 = 32;
        long l4 = l3 >> n7;
        int n8 = (int)l4;
        if (n3 > n8) return 0 != 0;
        if (n8 > n4) return 0 != 0;
        n3 = c60.j(l2);
        int n10 = c60.h(l2);
        long l7 = 0xFFFFFFFFL;
        long l8 = l3 & l7;
        int n14 = (int)l8;
        if (n3 > n14) return 0 != 0;
        if (n14 > n10) return 0 != 0;
        return 1 != 0;
    }

    public static final long k(int n3, int n4, long l2) {
        int n7;
        int n8;
        int n10;
        int n14 = c60.k(l2) + n3;
        int n15 = 0;
        if (n14 < 0) {
            n14 = 0;
        }
        if ((n10 = c60.i(l2)) != (n8 = -1 >>> 1) && (n10 += n3) < 0) {
            n10 = 0;
        }
        if ((n3 = c60.j(l2) + n4) < 0) {
            n3 = 0;
        }
        if ((n7 = c60.h(l2)) != n8) {
            if ((n7 += n4) >= 0) {
                n15 = n7;
            }
            n7 = n15;
        }
        return f60.a(n14, n10, n3, n7);
    }

    public static final JSONObject l(Bundle bundle) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(bundle, "root");
        JSONObject jSONObject = new JSONObject();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            Object object = bundle.get(string3);
            boolean bl3 = object instanceof Bundle;
            if (bl3) {
                string3 = f60.l((Bundle)object);
                object = string3.keys();
                while (bl3 = object.hasNext()) {
                    string2 = (String)object.next();
                    Object object2 = string3.get(string2);
                    jSONObject.put(string2, object2);
                }
                continue;
            }
            Intrinsics.checkNotNullExpressionValue(string3, "s");
            object = null;
            string2 = "wzrk_";
            boolean bl4 = b.s(string3, string2, false);
            if (!bl4) continue;
            object = bundle.get(string3);
            jSONObject.put(string3, object);
        }
        return jSONObject;
    }
}

