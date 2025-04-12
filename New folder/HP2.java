/*
 * Decompiled with CFR 0.152.
 */
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class HP2
implements ag3_0,
zg3_2 {
    public static final TreeMap i;
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public int h;

    static {
        TreeMap treeMap;
        i = treeMap = new TreeMap();
    }

    public HP2(int n3) {
        this.a = n3++;
        Object[] objectArray = new int[n3];
        this.g = objectArray;
        objectArray = new long[n3];
        this.c = objectArray;
        objectArray = new double[n3];
        this.d = objectArray;
        objectArray = new String[n3];
        this.e = (String[])objectArray;
        byte[][] byArrayArray = new byte[n3][];
        this.f = byArrayArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final HP2 c(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "query");
        Object object = i;
        // MONITORENTER : object
        Object object2 = n3;
        object2 = ((TreeMap)object).ceilingEntry(object2);
        if (object2 != null) {
            Object object3 = object2.getKey();
            ((TreeMap)object).remove(object3);
            object2 = object2.getValue();
            object2 = (HP2)object2;
            object2.getClass();
            object3 = "query";
            Intrinsics.checkNotNullParameter(string2, object3);
            ((HP2)object2).b = string2;
            ((HP2)object2).h = n3;
            String string3 = "sqliteQuery";
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            // MONITOREXIT : object
            return object2;
        }
        object2 = Unit.a;
        // MONITOREXIT : object
        object2 = new HP2(n3);
        object = "query";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        ((HP2)object2).b = string2;
        ((HP2)object2).h = n3;
        return object2;
    }

    public final String a() {
        Object object = this.b;
        if (object != null) {
            return object;
        }
        String string2 = "Required value was null.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(zg3_2 object) {
        String string2 = "statement";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = this.h;
        int n4 = 1;
        if (n4 > n3) return;
        int n7 = 1;
        while (true) {
            block10: {
                block7: {
                    Object object2;
                    block8: {
                        block9: {
                            int n8;
                            if ((n8 = (object2 = this.g)[n7]) == n4) break block7;
                            int n10 = 2;
                            if (n8 == n10) break block8;
                            n10 = 3;
                            if (n8 == n10) break block9;
                            n10 = 4;
                            String string3 = "Required value was null.";
                            if (n8 != n10) {
                                n10 = 5;
                                if (n8 == n10) {
                                    object2 = this.f[n7];
                                    if (object2 == null) {
                                        string2 = string3.toString();
                                        object = new IllegalArgumentException(string2);
                                        throw object;
                                    }
                                    object.q0(n7, (byte[])object2);
                                }
                                break block10;
                            } else {
                                object2 = this.e[n7];
                                if (object2 == null) {
                                    string2 = string3.toString();
                                    object = new IllegalArgumentException(string2);
                                    throw object;
                                }
                                object.c0(n7, (String)object2);
                            }
                            break block10;
                        }
                        object2 = this.d;
                        int n14 = object2[n7];
                        object.r(n7, n14);
                        break block10;
                    }
                    object2 = this.c;
                    int n15 = object2[n7];
                    object.m0(n7, n15);
                    break block10;
                }
                object.w0(n7);
            }
            if (n7 == n3) {
                return;
            }
            ++n7;
        }
    }

    public final void c0(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.g[n3] = 4;
        this.e[n3] = string2;
    }

    public final void close() {
    }

    public final void m0(int n3, long l2) {
        this.g[n3] = 2;
        this.c[n3] = l2;
    }

    public final void q0(int n3, byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "value");
        this.g[n3] = 5;
        this.f[n3] = byArray;
    }

    public final void r(int n3, double d2) {
        this.g[n3] = 3;
        this.d[n3] = d2;
    }

    public final void release() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            Object object;
            block13: {
                int n3 = this.a;
                object = n3;
                treeMap.put(object, this);
                n3 = treeMap.size();
                int n4 = 15;
                if (n3 <= n4) break block13;
                n3 = treeMap.size() + -10;
                Object object2 = treeMap.descendingKeySet();
                object2 = object2.iterator();
                String string2 = "queryPool.descendingKeySet().iterator()";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                while (true) {
                    int n7 = n3 + -1;
                    if (n3 <= 0) break;
                    object2.next();
                    object2.remove();
                    n3 = n7;
                    continue;
                    break;
                }
            }
            try {
                object = Unit.a;
                return;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            finally {
            }
        }
    }

    public final void w0(int n3) {
        this.g[n3] = 1;
    }
}

