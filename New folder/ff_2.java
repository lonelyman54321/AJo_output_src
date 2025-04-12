/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.b;

/*
 * Renamed from FF
 */
public class ff_2
implements Serializable,
Comparable {
    public static final ff_2 d;
    private static final long serialVersionUID = 1L;
    public final byte[] a;
    public transient int b;
    public transient String c;

    static {
        ff_2 ff_22;
        byte[] byArray = new byte[]{};
        d = ff_22 = new ff_2(byArray);
    }

    public ff_2(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "data");
        this.a = byArray;
    }

    public static int g(ff_2 ff_22, ff_2 object) {
        ff_22.getClass();
        Intrinsics.checkNotNullParameter(object, "other");
        object = ((ff_2)object).a;
        return ff_22.f(0, (byte[])object);
    }

    public static int k(ff_2 ff_22, ff_2 object) {
        int n3 = l_0.a;
        ff_22.getClass();
        Intrinsics.checkNotNullParameter(object, "other");
        object = ((ff_2)object).a;
        return ff_22.j(n3, (byte[])object);
    }

    public static ff_2 o(ff_2 ff_22, int n3, int n4, int n7) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = 0;
        }
        if ((n7 &= 2) != 0) {
            n4 = l_0.a;
        }
        return ff_22.n(n3, n4);
    }

    private final void readObject(ObjectInputStream object) {
        int n3 = ((ObjectInputStream)object).readInt();
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (n3 >= 0) {
            int n4;
            object2 = new byte[n3];
            for (int i3 = 0; i3 < n3; i3 += n4) {
                int n7;
                n4 = n3 - i3;
                if ((n4 = ((InputStream)object).read((byte[])object2, i3, n4)) != (n7 = -1)) {
                    continue;
                }
                object = new EOFException();
                throw object;
            }
            object = new ff_2((byte[])object2);
            Field field = ff_2.class.getDeclaredField("a");
            ((AccessibleObject)field).setAccessible(true);
            object = ((ff_2)object).a;
            field.set(this, object);
            return;
        }
        object = hj0_0.a(n3, "byteCount < 0: ");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        int n3 = this.a.length;
        objectOutputStream.writeInt(n3);
        byte[] byArray = this.a;
        objectOutputStream.write(byArray);
    }

    public String a() {
        int n3;
        int n4;
        int n7;
        Object object = this.a;
        Object object2 = a_0.a;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "map");
        int n8 = ((byte[])object).length;
        int n10 = 2;
        n8 = (n8 + n10) / 3 * 4;
        byte[] byArray = new byte[n8];
        int n14 = ((byte[])object).length;
        int n15 = ((byte[])object).length % 3;
        n14 -= n15;
        n15 = 0;
        int n16 = 0;
        while (n15 < n14) {
            n7 = n15 + 1;
            n4 = object[n15];
            n3 = n15 + 2;
            n7 = object[n7];
            n15 += 3;
            n3 = object[n3];
            int n17 = n16 + 1;
            int n18 = (n4 & 0xFF) >> n10;
            byArray[n16] = n18 = object2[n18];
            n18 = n16 + 2;
            n4 = (n4 & 3) << 4;
            int n19 = (n7 & 0xFF) >> 4;
            n4 |= n19;
            byArray[n17] = n4 = object2[n4];
            n4 = n16 + 3;
            n7 = (n7 & 0xF) << n10;
            n17 = (n3 & 0xFF) >> 6;
            n7 |= n17;
            byArray[n18] = n7 = object2[n7];
            n16 += 4;
            n7 = n3 & 0x3F;
            byArray[n4] = n7 = object2[n7];
        }
        n7 = ((byte[])object).length - n14;
        n14 = 1;
        n4 = 61;
        if (n7 != n14) {
            if (n7 == n10) {
                n14 = n15 + 1;
                n15 = object[n15];
                int n20 = object[n14];
                n14 = n16 + 1;
                n7 = (n15 & 0xFF) >> n10;
                byArray[n16] = n7 = object2[n7];
                n7 = n16 + 2;
                n15 = (n15 & 3) << 4;
                n3 = (n20 & 0xFF) >> 4;
                n15 |= n3;
                byArray[n14] = n15 = object2[n15];
                n20 = (n20 & 0xF) << n10;
                byArray[n7] = n20 = object2[n20];
                byArray[n16 += 3] = n4;
            }
        } else {
            int n21 = object[n15];
            n14 = n16 + 1;
            n15 = n21 & 0xFF;
            n10 = n15 >> 2;
            byArray[n16] = n10 = object2[n10];
            n10 = n16 + 2;
            n21 = (n21 & 3) << 4;
            byArray[n14] = n21 = object2[n21];
            byArray[n10] = n4;
            byArray[n16 += 3] = n4;
        }
        Intrinsics.checkNotNullParameter(byArray, string2);
        object = new String;
        object2 = Charsets.UTF_8;
        object(byArray, (Charset)object2);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int b(ff_2 ff_22) {
        String string2 = "other";
        Intrinsics.checkNotNullParameter(ff_22, string2);
        int n3 = this.d();
        int n4 = ff_22.d();
        int n7 = Math.min(n3, n4);
        int n8 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            int n10;
            int n14 = this.i(i3) & 0xFF;
            if (n14 == (n10 = ff_22.i(i3) & 0xFF)) {
                continue;
            }
            if (n14 >= n10) return 1;
            return -1;
        }
        if (n3 == n4) return n8;
        if (n3 >= n4) return 1;
        return -1;
    }

    public ff_2 c(String object) {
        Intrinsics.checkNotNullParameter(object, "algorithm");
        object = MessageDigest.getInstance((String)object);
        Object object2 = this.a;
        int n3 = this.d();
        ((MessageDigest)object).update((byte[])object2, 0, n3);
        object = ((MessageDigest)object).digest();
        object2 = new ff_2;
        Intrinsics.checkNotNull(object);
        object2((byte[])object);
        return object2;
    }

    public int d() {
        return this.a.length;
    }

    public String e() {
        Object object = this.a;
        int n3 = ((byte[])object).length * 2;
        char[] cArray = new char[n3];
        int n4 = ((byte[])object).length;
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8 = object[i3];
            int n10 = n7 + 1;
            char[] cArray2 = d_0.a;
            int n14 = n8 >> 4 & 0xF;
            cArray[n7] = n14 = cArray2[n14];
            n7 += 2;
            n8 &= 0xF;
            cArray[n10] = n8 = cArray2[n8];
        }
        Intrinsics.checkNotNullParameter(cArray, "<this>");
        object = new String;
        object(cArray);
        return object;
    }

    public boolean equals(Object object) {
        boolean bl2;
        byte[] byArray;
        int n3;
        int n4;
        boolean bl3 = true;
        if (!(object == this || (n4 = object instanceof ff_2) != 0 && (n4 = ((ff_2)(object = (ff_2)object)).d()) == (n3 = (byArray = this.a).length) && (bl2 = ((ff_2)object).m(0, byArray, 0, n4 = byArray.length)))) {
            bl3 = false;
        }
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int f(int n3, byte[] byArray) {
        int n4;
        byte[] byArray2;
        boolean bl2;
        Intrinsics.checkNotNullParameter(byArray, "other");
        byte[] byArray3 = this.a;
        int n7 = byArray3.length;
        int n8 = byArray.length;
        n7 -= n8;
        n8 = 0;
        n3 = Math.max(n3, 0);
        if (n3 > n7) return -1;
        while (!(bl2 = l_0.a(byArray2 = this.a, n3, byArray, 0, n4 = byArray.length))) {
            if (n3 == n7) return -1;
            ++n3;
        }
        return n3;
    }

    public byte[] h() {
        return this.a;
    }

    public int hashCode() {
        int n3 = this.b;
        if (n3 == 0) {
            byte[] byArray = this.a;
            this.b = n3 = Arrays.hashCode(byArray);
        }
        return n3;
    }

    public byte i(int n3) {
        return this.a[n3];
    }

    public int j(int n3, byte[] byArray) {
        block2: {
            Intrinsics.checkNotNullParameter(byArray, "other");
            n3 = l_0.c(this, n3);
            byte[] byArray2 = this.a;
            int n4 = byArray2.length;
            int n7 = byArray.length;
            for (n3 = Math.min(n3, n4 -= n7); (n4 = -1) < n3; n3 += -1) {
                byArray2 = this.a;
                n7 = 0;
                int n8 = byArray.length;
                n4 = (int)(l_0.a(byArray2, n3, byArray, 0, n8) ? 1 : 0);
                if (n4 == 0) {
                    continue;
                }
                break block2;
            }
            n3 = -1;
        }
        return n3;
    }

    public boolean l(int n3, ff_2 ff_22, int n4) {
        Intrinsics.checkNotNullParameter(ff_22, "other");
        byte[] byArray = this.a;
        return ff_22.m(0, byArray, n3, n4);
    }

    public boolean m(int n3, byte[] byArray, int n4, int n7) {
        int n8;
        Object object = "other";
        Intrinsics.checkNotNullParameter(byArray, (String)object);
        n3 = n3 >= 0 && n3 <= (n8 = ((Object)(object = (Object)this.a)).length - n7) && n4 >= 0 && n4 <= (n8 = byArray.length - n7) && (n3 = (int)(l_0.a((byte[])object, n3, byArray, n4, n7) ? 1 : 0)) != 0 ? 1 : 0;
        return n3 != 0;
    }

    public ff_2 n(int n3, int n4) {
        n4 = l_0.c(this, n4);
        if (n3 >= 0) {
            byte[] byArray = this.a;
            int n7 = byArray.length;
            if (n4 <= n7) {
                n7 = n4 - n3;
                if (n7 >= 0) {
                    ff_2 ff_22;
                    if (n3 == 0 && n4 == (n7 = byArray.length)) {
                        ff_22 = this;
                    } else {
                        byte[] byArray2 = rp_1.l(n3, byArray, n4);
                        ff_22 = new ff_2(byArray2);
                    }
                    return ff_22;
                }
                String string2 = "endIndex < beginIndex".toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            CharSequence charSequence = new StringBuilder("endIndex > length(");
            n4 = this.a.length;
            charSequence = tu.a((StringBuilder)charSequence, n4, ')');
            charSequence = ((Object)charSequence).toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
            throw illegalArgumentException;
        }
        String string3 = "beginIndex < 0".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public ff_2 p() {
        ff_2 ff_22;
        block2: {
            byte[] byArray;
            int n3;
            ff_22 = null;
            for (int i3 = 0; i3 < (n3 = (byArray = this.a).length); ++i3) {
                int n4;
                n3 = byArray[i3];
                int n7 = 65;
                if (n3 < n7 || n3 > (n4 = 90)) continue;
                int n8 = byArray.length;
                byArray = Arrays.copyOf(byArray, n8);
                String string2 = "copyOf(this, size)";
                Intrinsics.checkNotNullExpressionValue(byArray, string2);
                byArray[i3] = n3 = (int)((byte)(n3 + 32));
                for (n8 = i3 + 1; n8 < (i3 = byArray.length); ++n8) {
                    i3 = byArray[n8];
                    if (i3 < n7 || i3 > n4) continue;
                    byArray[n8] = i3 = (int)((byte)(i3 + 32));
                }
                ff_22 = new ff_2(byArray);
                break block2;
            }
            ff_22 = this;
        }
        return ff_22;
    }

    public final String q() {
        Object object = this.c;
        if (object == null) {
            String string2;
            object = this.h();
            Intrinsics.checkNotNullParameter(object, "<this>");
            Charset charset = Charsets.UTF_8;
            this.c = string2 = new String((byte[])object, charset);
            object = string2;
        }
        return object;
    }

    public void r(ce_2 ce_22, int n3) {
        Object object = "buffer";
        Intrinsics.checkNotNullParameter(ce_22, (String)object);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(ce_22, (String)object);
        object = this.a;
        ce_22.R((byte[])object, 0, n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String toString() {
        block15: {
            block32: {
                block11: {
                    block24: {
                        block26: {
                            block27: {
                                block28: {
                                    block31: {
                                        block30: {
                                            block29: {
                                                block25: {
                                                    block12: {
                                                        block13: {
                                                            block14: {
                                                                var1_1 = this;
                                                                var2_2 = 1;
                                                                var3_3 /* !! */  = this.a;
                                                                var4_4 = var3_3 /* !! */ .length;
                                                                if (var4_4 != 0) break block14;
                                                                var5_5 = "[size=0]";
                                                                break block15;
                                                            }
                                                            var4_4 = var3_3 /* !! */ .length;
                                                            var6_6 = 0;
                                                            var7_7 = null;
                                                            var8_8 = 0;
                                                            var9_9 = 0;
                                                            var10_10 = null;
                                                            block0: while (true) {
                                                                block23: {
                                                                    block22: {
                                                                        block21: {
                                                                            block17: {
                                                                                block19: {
                                                                                    block20: {
                                                                                        block18: {
                                                                                            block16: {
                                                                                                var11_11 = 64;
                                                                                                if (var6_6 >= var4_4) break block11;
                                                                                                var12_12 /* !! */  = var3_3 /* !! */ [var6_6];
                                                                                                var13_13 /* !! */  = -3;
                                                                                                var14_14 = 160;
                                                                                                var15_15 /* !! */  = 127;
                                                                                                var16_16 = 32;
                                                                                                var17_17 = 13;
                                                                                                var18_18 = 10;
                                                                                                var19_19 /* !! */  = 65536;
                                                                                                if (var12_12 /* !! */  < 0) break block16;
                                                                                                var20_20 = var9_9 + 1;
                                                                                                if (var9_9 == var11_11) break block11;
                                                                                                if (var12_12 /* !! */  != var18_18 && var12_12 /* !! */  != var17_17 && (var12_12 /* !! */  >= 0 && var12_12 /* !! */  < var16_16 || var15_15 /* !! */  <= var12_12 /* !! */  && var12_12 /* !! */  < var14_14) || var12_12 /* !! */  == var13_13 /* !! */ ) lbl-1000:
                                                                                                // 21 sources

                                                                                                {
                                                                                                    while (true) {
                                                                                                        var8_8 = -1;
                                                                                                        break block11;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var9_9 = var12_12 /* !! */  < var19_19 /* !! */  ? 1 : 2;
                                                                                                var8_8 += var9_9;
                                                                                                var6_6 += var2_2;
                                                                                                while (true) {
                                                                                                    var9_9 = var20_20++;
                                                                                                    if (var6_6 >= var4_4 || (var12_12 /* !! */  = (int)var3_3 /* !! */ [var6_6]) < 0) continue block0;
                                                                                                    var6_6 += var2_2;
                                                                                                    if (var9_9 == var11_11) break block11;
                                                                                                    if (var12_12 /* !! */  != var18_18 && var12_12 /* !! */  != var17_17 && (var12_12 /* !! */  >= 0 && var12_12 /* !! */  < var16_16 || var15_15 /* !! */  <= var12_12 /* !! */  && var12_12 /* !! */  < var14_14) || var12_12 /* !! */  == var13_13 /* !! */ ) ** GOTO lbl-1000
                                                                                                    var9_9 = var12_12 /* !! */  < var19_19 /* !! */  ? 1 : 2;
                                                                                                    var8_8 += var9_9;
                                                                                                }
                                                                                            }
                                                                                            var19_19 /* !! */  = var12_12 /* !! */  >> 5;
                                                                                            var13_13 /* !! */  = -2;
                                                                                            var14_14 = 128;
                                                                                            if (var19_19 /* !! */  != var13_13 /* !! */ ) break block17;
                                                                                            var19_19 /* !! */  = var6_6 + 1;
                                                                                            if (var4_4 > var19_19 /* !! */ ) break block18;
                                                                                            if (var9_9 != var11_11) ** GOTO lbl-1000
                                                                                            break block11;
                                                                                        }
                                                                                        var13_13 /* !! */  = (var19_19 /* !! */  = (int)var3_3 /* !! */ [var19_19 /* !! */ ]) & 192;
                                                                                        if (var13_13 /* !! */  != var14_14) break block19;
                                                                                        var19_19 /* !! */  ^= 3968;
                                                                                        if ((var19_19 /* !! */  ^= (var12_12 /* !! */  <<= 6)) >= var14_14) break block20;
                                                                                        if (var9_9 != var11_11) ** GOTO lbl-1000
                                                                                        break block11;
                                                                                    }
                                                                                    var12_12 /* !! */  = var9_9 + 1;
                                                                                    if (var9_9 == var11_11) break block11;
                                                                                    if (var19_19 /* !! */  != var18_18 && var19_19 /* !! */  != var17_17 && (var19_19 /* !! */  >= 0 && var19_19 /* !! */  < var16_16 || var15_15 /* !! */  <= var19_19 /* !! */  && var19_19 /* !! */  < (var17_17 = 160)) || var19_19 /* !! */  == (var17_17 = (int)((char)-3))) ** GOTO lbl-1000
                                                                                    var17_17 = 65536;
                                                                                    var19_19 /* !! */  = var19_19 /* !! */  < var17_17 ? 1 : 2;
                                                                                    var8_8 += var19_19 /* !! */ ;
                                                                                    var5_5 = Unit.a;
                                                                                    var19_19 /* !! */  = 2;
                                                                                    var6_6 += var19_19 /* !! */ ;
                                                                                    var9_9 = var12_12 /* !! */ ;
                                                                                    continue;
                                                                                }
                                                                                if (var9_9 != var11_11) ** GOTO lbl-1000
                                                                                break block11;
                                                                            }
                                                                            var19_19 /* !! */  = 2;
                                                                            var15_15 /* !! */  = var12_12 /* !! */  >> 4;
                                                                            var16_16 = 57344;
                                                                            var17_17 = 55296;
                                                                            if (var15_15 /* !! */  != var13_13 /* !! */ ) break block12;
                                                                            var13_13 /* !! */  = var6_6 + 2;
                                                                            if (var4_4 > var13_13 /* !! */ ) break block21;
                                                                            if (var9_9 != var11_11) ** GOTO lbl-1000
                                                                            break block11;
                                                                        }
                                                                        var19_19 /* !! */  = var6_6 + 1;
                                                                        var15_15 /* !! */  = (var19_19 /* !! */  = (int)var3_3 /* !! */ [var19_19 /* !! */ ]) & 192;
                                                                        if (var15_15 /* !! */  != var14_14) break block13;
                                                                        var15_15 /* !! */  = (var13_13 /* !! */  = (int)var3_3 /* !! */ [var13_13 /* !! */ ]) & 192;
                                                                        if (var15_15 /* !! */  != var14_14) break;
                                                                        var14_14 = -123008;
                                                                        var19_19 /* !! */  = var19_19 /* !! */  << 6 ^ (var13_13 /* !! */  ^= var14_14);
                                                                        var12_12 /* !! */  <<= 12;
                                                                        if ((var19_19 /* !! */  ^= var12_12 /* !! */ ) >= (var12_12 /* !! */  = 2048)) break block22;
                                                                        if (var9_9 != var11_11) ** GOTO lbl-1000
                                                                        break block11;
                                                                    }
                                                                    if (var17_17 > var19_19 /* !! */  || var19_19 /* !! */  >= var16_16) break block23;
                                                                    if (var9_9 != var11_11) ** GOTO lbl-1000
                                                                    break block11;
                                                                }
                                                                var17_17 = var9_9 + 1;
                                                                if (var9_9 == var11_11) break block11;
                                                                if (var19_19 /* !! */  != var18_18 && var19_19 /* !! */  != (var9_9 = 13) && (var19_19 /* !! */  >= 0 && var19_19 /* !! */  < (var9_9 = 32) || (var9_9 = 127) <= var19_19 /* !! */  && var19_19 /* !! */  < (var9_9 = 160)) || var19_19 /* !! */  == (var9_9 = (int)((char)-3))) ** GOTO lbl-1000
                                                                var9_9 = 65536;
                                                                var19_19 /* !! */  = var19_19 /* !! */  < var9_9 ? 1 : 2;
                                                                var8_8 += var19_19 /* !! */ ;
                                                                var5_5 = Unit.a;
                                                                var6_6 += 3;
lbl111:
                                                                // 2 sources

                                                                while (true) {
                                                                    var9_9 = var17_17;
                                                                    continue block0;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            if (var9_9 != var11_11) ** GOTO lbl-1000
                                                            break block11;
                                                        }
                                                        if (var9_9 != var11_11) ** GOTO lbl-1000
                                                        break block11;
                                                    }
                                                    var19_19 /* !! */  = var12_12 /* !! */  >> 3;
                                                    if (var19_19 /* !! */  != var13_13 /* !! */ ) break block24;
                                                    var19_19 /* !! */  = var6_6 + 3;
                                                    if (var4_4 > var19_19 /* !! */ ) break block25;
                                                    if (var9_9 != var11_11) ** GOTO lbl-1000
                                                    break block11;
                                                }
                                                var13_13 /* !! */  = var6_6 + 1;
                                                var15_15 /* !! */  = (var13_13 /* !! */  = (int)var3_3 /* !! */ [var13_13 /* !! */ ]) & 192;
                                                if (var15_15 /* !! */  != var14_14) break block26;
                                                var21_21 = var6_6 + 2;
                                                var15_15 /* !! */  = (int)var3_3 /* !! */ [var21_21];
                                                var18_18 = var15_15 /* !! */  & 192;
                                                if (var18_18 != var14_14) break block27;
                                                var18_18 = (var19_19 /* !! */  = (int)var3_3 /* !! */ [var19_19 /* !! */ ]) & 192;
                                                if (var18_18 != var14_14) break block28;
                                                var19_19 /* !! */  ^= 3678080;
                                                var18_18 = var15_15 /* !! */  << 6;
                                                var19_19 /* !! */  ^= var18_18;
                                                var18_18 = var13_13 /* !! */  << 12;
                                                var19_19 /* !! */  ^= var18_18;
                                                var18_18 = var12_12 /* !! */  << 18;
                                                if ((var19_19 /* !! */  ^= var18_18) <= (var18_18 = 0x10FFFF)) break block29;
                                                if (var9_9 != var11_11) ** GOTO lbl-1000
                                                break block11;
                                            }
                                            if (var17_17 > var19_19 /* !! */  || var19_19 /* !! */  >= var16_16) break block30;
                                            if (var9_9 != var11_11) ** GOTO lbl-1000
                                            break block11;
                                        }
                                        var17_17 = 65536;
                                        if (var19_19 /* !! */  >= var17_17) break block31;
                                        if (var9_9 != var11_11) ** GOTO lbl-1000
                                        break block11;
                                    }
                                    var17_17 = var9_9 + 1;
                                    if (var9_9 == var11_11) break block11;
                                    var9_9 = 10;
                                    if (var19_19 /* !! */  != var9_9 && var19_19 /* !! */  != (var9_9 = 13) && (var19_19 /* !! */  >= 0 && var19_19 /* !! */  < (var9_9 = 32) || (var9_9 = 127) <= var19_19 /* !! */  && var19_19 /* !! */  < (var9_9 = 160)) || var19_19 /* !! */  == (var9_9 = (int)((char)-3))) ** GOTO lbl-1000
                                    var9_9 = 65536;
                                    var19_19 /* !! */  = var19_19 /* !! */  < var9_9 ? 1 : 2;
                                    var8_8 += var19_19 /* !! */ ;
                                    var5_5 = Unit.a;
                                    var6_6 += 4;
                                    ** while (true)
                                }
                                if (var9_9 != var11_11) ** GOTO lbl-1000
                                break block11;
                            }
                            if (var9_9 != var11_11) ** GOTO lbl-1000
                            break block11;
                        }
                        if (var9_9 != var11_11) ** GOTO lbl-1000
                        break block11;
                    }
                    if (var9_9 == var11_11) ** break;
                    ** while (true)
                }
                var5_5 = "\u2026]";
                var22_22 = "[size=";
                var23_23 = ']';
                var4_4 = -1;
                if (var8_8 != var4_4) ** GOTO lbl232
                var24_24 = var1_1.a;
                var4_4 = var24_24.length;
                if (var4_4 > var11_11) break block32;
                var5_5 = new StringBuilder("[hex=");
                var22_22 = this.e();
                var5_5.append((String)var22_22);
                var5_5.append(var23_23);
                var5_5 = var5_5.toString();
                break block15;
            }
            var3_3 /* !! */  = (byte[])new StringBuilder;
            var3_3 /* !! */ ((String)var22_22);
            var2_2 = var1_1.a.length;
            var3_3 /* !! */ .append(var2_2);
            var22_22 = " hex=";
            var3_3 /* !! */ .append((String)var22_22);
            var2_2 = l_0.c(var1_1, var11_11);
            var24_24 = var1_1.a;
            var17_17 = var24_24.length;
            if (var2_2 > var17_17) ** GOTO lbl226
            if (var2_2 >= 0) {
                var17_17 = var24_24.length;
                if (var2_2 == var17_17) {
                    var25_26 = var1_1;
                } else {
                    var6_6 = 0;
                    var7_7 = null;
                    var22_22 = rp_1.l(0, var24_24, var2_2);
                    var25_26 = new ff_2((byte[])var22_22);
                }
                var22_22 = var25_26.e();
                var3_3 /* !! */ .append((String)var22_22);
                var3_3 /* !! */ .append((String)var5_5);
                var5_5 = var3_3 /* !! */ .toString();
            } else {
                var22_22 = "endIndex < beginIndex".toString();
                var5_5 = new IllegalArgumentException((String)var22_22);
                throw var5_5;
lbl226:
                // 1 sources

                var5_5 = new StringBuilder("endIndex > length(");
                var2_2 = var1_1.a.length;
                var5_5 = tu.a((StringBuilder)var5_5, var2_2, ')');
                var5_5 = var5_5.toString();
                var22_22 = new IllegalArgumentException((String)var5_5);
                throw var22_22;
lbl232:
                // 1 sources

                var24_25 = this.q();
                var17_17 = 0;
                var7_7 = var24_25.substring(0, var8_8);
                Intrinsics.checkNotNullExpressionValue(var7_7, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                var7_7 = kotlin.text.b.n(kotlin.text.b.n(var7_7, "\\", "\\\\", false), "\n", "\\n", false);
                var10_10 = "\r";
                var26_28 = "\\r";
                var25_27 = kotlin.text.b.n(var7_7, var10_10, var26_28, false);
                var4_4 = var24_25.length();
                if (var8_8 < var4_4) {
                    var3_3 /* !! */  = new StringBuilder((String)var22_22);
                    var2_2 = var1_1.a.length;
                    var3_3 /* !! */ .append(var2_2);
                    var22_22 = " text=";
                    var3_3 /* !! */ .append((String)var22_22);
                    var3_3 /* !! */ .append(var25_27);
                    var3_3 /* !! */ .append((String)var5_5);
                    var5_5 = var3_3 /* !! */ .toString();
                } else {
                    var5_5 = oj_0.b(var23_23, "[text=", var25_27);
                }
            }
        }
        return var5_5;
    }
}

