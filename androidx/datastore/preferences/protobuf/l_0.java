/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.l$a_0;
import androidx.datastore.preferences.protobuf.l$b;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.p$a;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.q$b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Renamed from androidx.datastore.preferences.protobuf.l
 */
public final class l_0 {
    public static final l_0 d;
    public final G a;
    public boolean b;
    public boolean c;

    static {
        l_0 l_02;
        d = l_02 = new l_0(0);
    }

    public l_0() {
        F f5;
        super(16);
        this.a = f5;
    }

    public l_0(int n3) {
        super(0);
        F f5;
        super();
        this.a = f5;
        boolean bl2 = this.b;
        boolean bl3 = true;
        if (!bl2) {
            ((G)f5).h();
            this.b = bl3;
        }
        bl2 = this.b;
        if (!bl2) {
            ((G)f5).h();
            this.b = bl3;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int b(wH3 var0, int var1_1, Object var2_2) {
        var3_3 = 1;
        var1_1 = CodedOutputStream.x(var1_1);
        var4_4 /* !! */  = wH3.GROUP;
        if (var0 == var4_4 /* !! */ ) {
            var1_1 *= 2;
        }
        var4_4 /* !! */  = (wH3)l$a_0.b;
        var5_5 /* !! */  = var0.ordinal();
        var5_5 /* !! */  = (int)var4_4 /* !! */ [var5_5 /* !! */ ];
        block0 : switch (var5_5 /* !! */ ) {
            default: {
                var0 = new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                throw var0;
            }
            case 18: {
                var5_5 /* !! */  = var2_2 instanceof p$a;
                if (var5_5 /* !! */  != 0) {
                    var2_2 = (p$a)var2_2;
                    var5_5 /* !! */  = var2_2.getNumber();
                    var3_3 = CodedOutputStream.o(var5_5 /* !! */ );
                    break;
                }
                var2_2 = (Integer)var2_2;
                var5_5 /* !! */  = var2_2.intValue();
                var3_3 = CodedOutputStream.o(var5_5 /* !! */ );
                break;
            }
            case 17: {
                var2_2 = (Long)var2_2;
                var6_6 = var2_2.longValue();
                var8_7 = var6_6 << var3_3;
                var5_5 /* !! */  = 63;
                var10_8 = var6_6 >> var5_5 /* !! */  ^ var8_7;
                var3_3 = CodedOutputStream.B(var10_8);
                break;
            }
            case 16: {
                var2_2 = (Integer)var2_2;
                var5_5 /* !! */  = var2_2.intValue();
                var12_11 = var5_5 /* !! */  << 1;
                var5_5 /* !! */  = var5_5 /* !! */  >> 31 ^ var12_11;
                var3_3 = CodedOutputStream.z(var5_5 /* !! */ );
                break;
            }
            case 15: {
                var2_2 = (Long)var2_2;
                var2_2.getClass();
                var0 = CodedOutputStream.b;
lbl44:
                // 3 sources

                while (true) {
                    var3_3 = 8;
                    break block0;
                    break;
                }
            }
            case 14: {
                var2_2 = (Integer)var2_2;
                var2_2.getClass();
                var0 = CodedOutputStream.b;
lbl52:
                // 3 sources

                while (true) {
                    var3_3 = 4;
                    break block0;
                    break;
                }
            }
            case 13: {
                var2_2 = (Integer)var2_2;
                var5_5 /* !! */  = var2_2.intValue();
                var3_3 = CodedOutputStream.z(var5_5 /* !! */ );
                break;
            }
            case 12: {
                var5_5 /* !! */  = var2_2 instanceof DF;
                if (var5_5 /* !! */  != 0) {
                    var2_2 = (DF)var2_2;
                    var3_3 = CodedOutputStream.g((DF)var2_2);
                    break;
                }
                var2_2 = (byte[])var2_2;
                var0 = CodedOutputStream.b;
                var5_5 /* !! */  = ((Object)var2_2).length;
                var12_12 = CodedOutputStream.z(var5_5 /* !! */ );
lbl70:
                // 2 sources

                while (true) {
                    var3_3 = var12_12 + var5_5 /* !! */ ;
                    break block0;
                    break;
                }
            }
            case 11: {
                var5_5 /* !! */  = var2_2 instanceof DF;
                if (var5_5 /* !! */  != 0) {
                    var2_2 = (DF)var2_2;
                    var3_3 = CodedOutputStream.g((DF)var2_2);
                    break;
                }
                var2_2 = (String)var2_2;
                var3_3 = CodedOutputStream.w((String)var2_2);
                break;
            }
            case 10: {
                var5_5 /* !! */  = var2_2 instanceof q;
                if (var5_5 /* !! */  != 0) {
                    var2_2 = (q)var2_2;
                    var3_3 = CodedOutputStream.q((yq1_0)var2_2);
                    break;
                }
                var2_2 = (wo1_1)var2_2;
                var0 = CodedOutputStream.b;
                var5_5 /* !! */  = var2_2.getSerializedSize();
                var12_12 = CodedOutputStream.z(var5_5 /* !! */ );
                ** continue;
            }
            case 9: {
                var2_2 = (wo1_1)var2_2;
                var0 = CodedOutputStream.b;
                var3_3 = var2_2.getSerializedSize();
                break;
            }
            case 8: {
                var2_2 = (Boolean)var2_2;
                var2_2.getClass();
                var0 = CodedOutputStream.b;
                break;
            }
            case 7: {
                var2_2 = (Integer)var2_2;
                var2_2.getClass();
                var0 = CodedOutputStream.b;
                ** GOTO lbl52
            }
            case 6: {
                var2_2 = (Long)var2_2;
                var2_2.getClass();
                var0 = CodedOutputStream.b;
                ** GOTO lbl44
            }
            case 5: {
                var2_2 = (Integer)var2_2;
                var5_5 /* !! */  = var2_2.intValue();
                var3_3 = CodedOutputStream.o(var5_5 /* !! */ );
                break;
            }
            case 4: {
                var2_2 = (Long)var2_2;
                var10_9 = var2_2.longValue();
                var3_3 = CodedOutputStream.B(var10_9);
                break;
            }
            case 3: {
                var2_2 = (Long)var2_2;
                var10_10 = var2_2.longValue();
                var3_3 = CodedOutputStream.B(var10_10);
                break;
            }
            case 2: {
                var2_2 = (Float)var2_2;
                var2_2.getClass();
                var0 = CodedOutputStream.b;
                ** continue;
            }
            case 1: {
                var2_2 = (Double)var2_2;
                var2_2.getClass();
                var0 = CodedOutputStream.b;
                ** continue;
            }
        }
        return var3_3 + var1_1;
    }

    public static int c(l$b l$b, Object object) {
        l$b.getClass();
        return l_0.b(null, 0, object);
    }

    public static int d(Map.Entry entry) {
        l$b l$b = (l$b)entry.getKey();
        entry.getValue();
        l$b.getLiteJavaType();
        throw null;
    }

    public static boolean h(Map.Entry entry) {
        ((l$b)entry.getKey()).getLiteJavaType();
        throw null;
    }

    public static void l(CodedOutputStream codedOutputStream, wH3 wH32, int n3, Object object) {
        wH3 wH33 = wH3.GROUP;
        if (wH32 == wH33) {
            object = (wo1_1)object;
            codedOutputStream.U(n3, 3);
            object.d(codedOutputStream);
            int n4 = 4;
            float f5 = 5.6E-45f;
            codedOutputStream.U(n3, n4);
        } else {
            int n7 = wH32.getWireType();
            codedOutputStream.U(n3, n7);
            int[] nArray = l$a_0.b;
            int n8 = wH32.ordinal();
            n8 = nArray[n8];
            switch (n8) {
                default: {
                    break;
                }
                case 18: {
                    n8 = object instanceof p$a;
                    if (n8 != 0) {
                        object = (p$a)object;
                        n8 = object.getNumber();
                        codedOutputStream.N(n8);
                        break;
                    }
                    object = (Integer)object;
                    n8 = (Integer)object;
                    codedOutputStream.N(n8);
                    break;
                }
                case 17: {
                    object = (Long)object;
                    long l2 = (Long)object;
                    long l3 = l2 << 1;
                    int n10 = 63;
                    l2 = l2 >> n10 ^ l3;
                    codedOutputStream.Y(l2);
                    break;
                }
                case 16: {
                    object = (Integer)object;
                    n8 = (Integer)object;
                    n3 = n8 << 1;
                    n8 = n8 >> 31 ^ n3;
                    codedOutputStream.W(n8);
                    break;
                }
                case 15: {
                    object = (Long)object;
                    long l4 = (Long)object;
                    codedOutputStream.L(l4);
                    break;
                }
                case 14: {
                    object = (Integer)object;
                    n8 = (Integer)object;
                    codedOutputStream.J(n8);
                    break;
                }
                case 13: {
                    object = (Integer)object;
                    n8 = (Integer)object;
                    codedOutputStream.W(n8);
                    break;
                }
                case 12: {
                    n8 = object instanceof DF;
                    if (n8 != 0) {
                        object = (DF)object;
                        codedOutputStream.H((DF)object);
                        break;
                    }
                    object = (byte[])object;
                    n8 = ((Object)object).length;
                    codedOutputStream.F(n8, (byte[])object);
                    break;
                }
                case 11: {
                    n8 = object instanceof DF;
                    if (n8 != 0) {
                        object = (DF)object;
                        codedOutputStream.H((DF)object);
                        break;
                    }
                    object = (String)object;
                    codedOutputStream.T((String)object);
                    break;
                }
                case 10: {
                    object = (wo1_1)object;
                    codedOutputStream.P((wo1_1)object);
                    break;
                }
                case 9: {
                    object = (wo1_1)object;
                    object.d(codedOutputStream);
                    break;
                }
                case 8: {
                    object = (Boolean)object;
                    n8 = (byte)(((Boolean)object).booleanValue() ? 1 : 0);
                    codedOutputStream.D((byte)n8);
                    break;
                }
                case 7: {
                    object = (Integer)object;
                    n8 = (Integer)object;
                    codedOutputStream.J(n8);
                    break;
                }
                case 6: {
                    object = (Long)object;
                    long l7 = (Long)object;
                    codedOutputStream.L(l7);
                    break;
                }
                case 5: {
                    object = (Integer)object;
                    n8 = (Integer)object;
                    codedOutputStream.N(n8);
                    break;
                }
                case 4: {
                    object = (Long)object;
                    long l8 = (Long)object;
                    codedOutputStream.Y(l8);
                    break;
                }
                case 3: {
                    object = (Long)object;
                    long l12 = (Long)object;
                    codedOutputStream.Y(l12);
                    break;
                }
                case 2: {
                    object = (Float)object;
                    float f6 = ((Float)object).floatValue();
                    n8 = Float.floatToRawIntBits(f6);
                    codedOutputStream.J(n8);
                    break;
                }
                case 1: {
                    object = (Double)object;
                    double d2 = (Double)object;
                    long l14 = Double.doubleToRawLongBits(d2);
                    codedOutputStream.L(l14);
                }
            }
        }
    }

    public final l_0 a() {
        boolean bl2;
        Object object;
        Object object2;
        l_0 l_02 = new l_0();
        int n3 = 0;
        Iterator iterator = null;
        while (true) {
            object2 = this.a;
            object = ((G)object2).b;
            int n4 = object.size();
            if (n3 >= n4) break;
            object2 = ((G)object2).e(n3);
            object = (l$b)object2.getKey();
            object2 = object2.getValue();
            l_02.k((l$b)object, object2);
            ++n3;
        }
        iterator = ((G)object2).f().iterator();
        while (bl2 = iterator.hasNext()) {
            object2 = (Map.Entry)iterator.next();
            object = (l$b)object2.getKey();
            object2 = object2.getValue();
            l_02.k((l$b)object, object2);
        }
        n3 = (int)(this.c ? 1 : 0);
        l_02.c = n3;
        return l_02;
    }

    public final int e() {
        int n3;
        Object object;
        Object object2;
        int n4 = 0;
        Iterator iterator = null;
        int n7 = 0;
        while (true) {
            object2 = this.a;
            object = ((G)object2).b;
            int n8 = object.size();
            if (n4 >= n8) break;
            object2 = ((G)object2).e(n4);
            object = (l$b)object2.getKey();
            object2 = object2.getValue();
            n3 = l_0.c((l$b)object, object2);
            n7 += n3;
            ++n4;
        }
        iterator = ((G)object2).f().iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            object2 = (Map.Entry)iterator.next();
            object = (l$b)object2.getKey();
            object2 = object2.getValue();
            n3 = l_0.c((l$b)object, object2);
            n7 += n3;
        }
        return n7;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof l_0;
        if (!bl2) {
            return false;
        }
        object = (l_0)object;
        G g3 = this.a;
        object = ((l_0)object).a;
        return g3.equals(object);
    }

    public final boolean f() {
        return this.a.isEmpty();
    }

    public final boolean g() {
        boolean bl2;
        Object object;
        int n3 = 0;
        Iterator iterator = null;
        while (true) {
            object = this.a;
            List list = ((G)object).b;
            int n4 = list.size();
            if (n3 >= n4) break;
            bl2 = l_0.h((Map.Entry)(object = ((G)object).e(n3)));
            if (!bl2) {
                return false;
            }
            ++n3;
        }
        iterator = ((G)object).f().iterator();
        while (bl2 = iterator.hasNext()) {
            object = (Map.Entry)iterator.next();
            bl2 = l_0.h((Map.Entry)object);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator i() {
        boolean bl2 = this.c;
        Object object = this.a;
        if (bl2) {
            object = ((G)object).entrySet().iterator();
            q$b q$b = new q$b((Iterator)object);
            return q$b;
        }
        return ((G)object).entrySet().iterator();
    }

    public final void j(Map.Entry object) {
        l$b l$b = (l$b)object.getKey();
        boolean bl2 = (object = object.getValue()) instanceof q;
        if (bl2) {
            object = (q)object;
            ((yq1_0)object).a(null);
        }
        l$b.getClass();
        l$b.getLiteJavaType();
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void k(l$b var1_1, Object var2_2) {
        var3_3 = true;
        var1_1.getClass();
        var4_4 = p.a;
        var2_2.getClass();
        var4_4 = l$a_0.a;
        var5_5 = null.getJavaType();
        var6_6 /* !! */  = var5_5.ordinal();
        var6_6 /* !! */  = (int)var4_4[var6_6 /* !! */ ];
        var7_7 = false;
        var4_4 = null;
        block0 : switch (var6_6 /* !! */ ) {
            default: {
                break;
            }
            case 9: {
                var6_6 /* !! */  = var2_2 instanceof wo1_1;
                if (var6_6 /* !! */  == 0 && (var6_6 /* !! */  = var2_2 instanceof q) == 0) break;
lbl19:
                // 3 sources

                while (true) {
                    var7_7 = true;
                    break block0;
                    break;
                }
            }
            case 8: {
                var6_6 /* !! */  = var2_2 instanceof Integer;
                if (var6_6 /* !! */  == 0 && (var6_6 /* !! */  = var2_2 instanceof p$a) == 0) break;
                ** GOTO lbl19
            }
            case 7: {
                var6_6 /* !! */  = var2_2 instanceof DF;
                if (var6_6 /* !! */  == 0 && (var6_6 /* !! */  = var2_2 instanceof byte[]) == 0) break;
                ** continue;
            }
            case 6: {
                var7_7 = var2_2 instanceof String;
                break;
            }
            case 5: {
                var7_7 = var2_2 instanceof Boolean;
                break;
            }
            case 4: {
                var7_7 = var2_2 instanceof Double;
                break;
            }
            case 3: {
                var7_7 = var2_2 instanceof Float;
                break;
            }
            case 2: {
                var7_7 = var2_2 instanceof Long;
                break;
            }
            case 1: {
                var7_7 = var2_2 instanceof Integer;
            }
        }
        if (var7_7) {
            var6_6 /* !! */  = var2_2 instanceof q;
            if (var6_6 /* !! */  != 0) {
                this.c = var3_3;
            }
            this.a.i((Comparable)var1_1, var2_2);
            return;
        }
        var1_1 = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        throw var1_1;
    }
}

