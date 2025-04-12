/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastParser$ParseException;
import com.google.android.gms.common.server.response.zaa;
import com.google.android.gms.common.server.response.zab;
import com.google.android.gms.common.server.response.zac;
import com.google.android.gms.common.server.response.zad;
import com.google.android.gms.common.server.response.zae;
import com.google.android.gms.common.server.response.zaf;
import com.google.android.gms.common.server.response.zag;
import com.google.android.gms.common.server.response.zah;
import com.google.android.gms.common.server.response.zai;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FastParser {
    private static final char[] zaa;
    private static final char[] zab;
    private static final char[] zac;
    private static final char[] zad;
    private static final char[] zae;
    private static final char[] zaf;
    private static final zai zag;
    private static final zai zah;
    private static final zai zai;
    private static final zai zaj;
    private static final zai zak;
    private static final zai zal;
    private static final zai zam;
    private static final zai zan;
    private final char[] zao;
    private final char[] zap;
    private final char[] zaq;
    private final StringBuilder zar;
    private final StringBuilder zas;
    private final Stack zat;

    static {
        Object object;
        char[] cArray;
        int n3 = 3;
        char[] cArray2 = cArray = new char[n3];
        cArray[0] = 117;
        cArray2[1] = 108;
        cArray2[2] = 108;
        zaa = cArray;
        char[] cArray3 = object = new char[n3];
        object[0] = 114;
        cArray3[1] = 117;
        cArray3[2] = 101;
        zab = object;
        n3 = 4;
        char[] cArray4 = cArray = new char[n3];
        char[] cArray5 = cArray;
        cArray4[0] = 114;
        cArray5[1] = 117;
        cArray4[2] = 101;
        cArray5[3] = 34;
        zac = cArray;
        char[] cArray6 = object = new char[n3];
        char[] cArray7 = object;
        cArray6[0] = 97;
        cArray7[1] = 108;
        cArray6[2] = 115;
        cArray7[3] = 101;
        zad = object;
        char[] cArray8 = object = new char[5];
        char[] cArray9 = object;
        cArray8[0] = 97;
        cArray9[1] = 108;
        cArray8[2] = 115;
        cArray9[3] = 101;
        cArray9[4] = 34;
        zae = object;
        object = new char[]{'\n'};
        zaf = object;
        object = new zaa;
        object();
        zag = object;
        object = new zab;
        object();
        zah = object;
        object = new zac;
        object();
        zai = object;
        object = new zad;
        object();
        zaj = object;
        object = new zae;
        object();
        zak = object;
        object = new zaf;
        object();
        zal = object;
        object = new zag;
        object();
        zam = object;
        object = new zah;
        object();
        zan = object;
    }

    public FastParser() {
        Object object = new char[1];
        this.zao = object;
        int n3 = 32;
        char[] cArray = new char[n3];
        this.zap = cArray;
        int n4 = 1024;
        Object object2 = new char[n4];
        this.zaq = object2;
        object2 = new StringBuilder;
        super(n3);
        this.zar = object2;
        object = new StringBuilder;
        super(n4);
        this.zas = object;
        object = new Stack;
        super();
        this.zat = object;
    }

    /*
     * Unable to fully structure code
     */
    private static final String zaA(BufferedReader var0, char[] var1_1, StringBuilder var2_2, char[] var3_3) {
        var2_2.setLength(0);
        var4_4 = var1_1.length;
        var0.mark(var4_4);
        var4_4 = 0;
        var5_5 = false;
        while ((var6_6 = var0.read(var1_1)) != (var7_7 = -1)) {
            var7_7 = 0;
            while (var7_7 < var6_6) {
                var8_8 = var1_1[var7_7];
                var9_9 = Character.isISOControl(var8_8);
                if (var9_9 != 0 && (var3_3 == null || (var9_9 = var3_3[0]) != var8_8)) {
                    var0 = new FastParser$ParseException("Unexpected control character while reading string");
                    throw var0;
                }
                var9_9 = var7_7 + 1;
                var10_10 = '\"';
                if (var8_8 == var10_10) {
                    if (var4_4 == 0) {
                        var2_2.append(var1_1, 0, var7_7);
                        var0.reset();
                        var11_11 = var9_9;
                        var0.skip(var11_11);
                        if (var5_5) {
                            return JsonUtils.unescapeString(var2_2.toString());
                        }
                        return var2_2.toString();
                    }
                    while (true) {
                        var4_4 = 0;
                        break;
                    }
                } else {
                    if (var8_8 != (var7_7 = 92)) ** continue;
                    var4_4 ^= 1;
                    var5_5 = true;
                }
                var7_7 = var9_9;
            }
            var2_2.append(var1_1, 0, var6_6);
            var6_6 = var1_1.length;
            var0.mark(var6_6);
        }
        var0 = new FastParser$ParseException("Unexpected EOF while parsing string");
        throw var0;
    }

    public static /* bridge */ /* synthetic */ double zaa(FastParser fastParser, BufferedReader bufferedReader) {
        return fastParser.zaj(bufferedReader);
    }

    public static /* bridge */ /* synthetic */ float zab(FastParser fastParser, BufferedReader bufferedReader) {
        return fastParser.zak(bufferedReader);
    }

    public static /* bridge */ /* synthetic */ int zac(FastParser fastParser, BufferedReader bufferedReader) {
        return fastParser.zal(bufferedReader);
    }

    public static /* bridge */ /* synthetic */ long zad(FastParser fastParser, BufferedReader bufferedReader) {
        return fastParser.zan(bufferedReader);
    }

    public static /* bridge */ /* synthetic */ String zae(FastParser fastParser, BufferedReader bufferedReader) {
        return fastParser.zao(bufferedReader);
    }

    public static /* bridge */ /* synthetic */ BigDecimal zaf(FastParser fastParser, BufferedReader bufferedReader) {
        return fastParser.zas(bufferedReader);
    }

    public static /* bridge */ /* synthetic */ BigInteger zag(FastParser fastParser, BufferedReader bufferedReader) {
        return fastParser.zat(bufferedReader);
    }

    public static /* bridge */ /* synthetic */ boolean zah(FastParser fastParser, BufferedReader bufferedReader, boolean bl2) {
        return fastParser.zay(bufferedReader, false);
    }

    private final char zai(BufferedReader bufferedReader) {
        block2: {
            int n3;
            char[] cArray = this.zao;
            int n4 = bufferedReader.read(cArray);
            if (n4 != (n3 = -1)) {
                while ((n4 = (int)(Character.isWhitespace((cArray = this.zao)[0]) ? 1 : 0)) != 0) {
                    cArray = this.zao;
                    n4 = bufferedReader.read(cArray);
                    if (n4 != n3) continue;
                    break block2;
                }
                return this.zao[0];
            }
        }
        return '\u0000';
    }

    private final double zaj(BufferedReader bufferedReader) {
        char[] cArray = this.zaq;
        int n3 = this.zam(bufferedReader, cArray);
        if (n3 == 0) {
            return 0.0;
        }
        cArray = this.zaq;
        String string2 = new String(cArray, 0, n3);
        return Double.parseDouble(string2);
    }

    private final float zak(BufferedReader bufferedReader) {
        char[] cArray = this.zaq;
        int n3 = this.zam(bufferedReader, cArray);
        if (n3 == 0) {
            return 0.0f;
        }
        cArray = this.zaq;
        String string2 = new String(cArray, 0, n3);
        return Float.parseFloat(string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final int zal(BufferedReader object) {
        int n3;
        char[] cArray = this.zaq;
        int n4 = this.zam((BufferedReader)object, cArray);
        int n7 = 0;
        cArray = null;
        if (n4 == 0) {
            return 0;
        }
        char[] cArray2 = this.zaq;
        if (n4 <= 0) {
            object = new FastParser$ParseException("No number to parse");
            throw object;
        }
        int n8 = cArray2[0];
        int n10 = 45;
        int n14 = n8 == n10 ? -1 << -1 : -2147483647;
        int n15 = 1;
        n8 = n8 == n10 ? 1 : 0;
        String string2 = "Unexpected non-digit character";
        int n16 = 10;
        if (n8 < n4) {
            n7 = n8 + '\u0001';
            n3 = Character.digit(cArray2[n8], n16);
            if (n3 < 0) {
                object = new FastParser$ParseException(string2);
                throw object;
            }
            n3 = -n3;
        } else {
            n7 = n8;
            n3 = 0;
        }
        while (n7 < n4) {
            int n17 = n7 + 1;
            if ((n7 = Character.digit(cArray2[n7], n16)) < 0) {
                object = new FastParser$ParseException(string2);
                throw object;
            }
            int n18 = -214748364;
            String string3 = "Number too large";
            if (n3 < n18) {
                object = new FastParser$ParseException(string3);
                throw object;
            }
            n18 = n14 + n7;
            if ((n3 *= 10) < n18) {
                object = new FastParser$ParseException(string3);
                throw object;
            }
            n3 -= n7;
            n7 = n17;
        }
        if (n8 == 0) {
            return -n3;
        }
        if (n7 > n15) {
            return n3;
        }
        object = new FastParser$ParseException("No digits to parse");
        throw object;
    }

    /*
     * Unable to fully structure code
     */
    private final int zam(BufferedReader var1_1, char[] var2_2) {
        block8: {
            block9: {
                block12: {
                    block10: {
                        var3_3 = this.zai((BufferedReader)var1_1);
                        var4_4 = "Unexpected EOF";
                        if (var3_3 == 0) break block8;
                        var5_5 = 44;
                        if (var3_3 == var5_5) break block9;
                        var6_6 = 110;
                        if (var3_3 == var6_6) {
                            var2_2 = FastParser.zaa;
                            this.zax((BufferedReader)var1_1, var2_2);
                            return 0;
                        }
                        var6_6 = 1024;
                        var1_1.mark(var6_6);
                        var7_7 = 34;
                        var8_8 = -1;
                        var9_9 = 1;
                        if (var3_3 != var7_7) break block10;
                        var3_3 = 0;
                        var5_5 = 0;
                        while (var3_3 < var6_6 && (var10_10 = var1_1.read(var2_2, var3_3, var9_9)) != var8_8) {
                            block11: {
                                var10_10 = var2_2[var3_3];
                                var11_12 = Character.isISOControl((char)var10_10);
                                if (var11_12 != 0) break block11;
                                var11_12 = var3_3 + 1;
                                if (var10_10 != var7_7) ** GOTO lbl34
                                if (var5_5 != 0) {
                                    while (true) {
                                        var5_5 = 0;
                                        break;
                                    }
                                } else {
                                    var1_1.reset();
                                    var12_13 = var11_12;
                                    var1_1.skip(var12_13);
                                    return var3_3;
lbl34:
                                    // 1 sources

                                    if (var10_10 != (var3_3 = 92)) ** continue;
                                    var5_5 = var3_3 = var5_5 ^ 1;
                                }
                                var3_3 = var11_12;
                                continue;
                            }
                            var1_1 = new FastParser$ParseException("Unexpected control character while reading string");
                            throw var1_1;
                        }
                        break block12;
                    }
                    var2_2[0] = var3_3;
                    for (var3_3 = 1; var3_3 < var6_6 && (var7_7 = var1_1.read(var2_2, var3_3, var9_9)) != var8_8; ++var3_3) {
                        var7_7 = var2_2[var3_3];
                        var10_11 = 125;
                        if (var7_7 != var10_11 && var7_7 != var5_5 && (var7_7 = (int)Character.isWhitespace((char)var7_7)) == 0 && (var7_7 = var2_2[var3_3]) != (var10_11 = 93)) {
                            continue;
                        }
                        var1_1.reset();
                        var12_14 = var3_3 + -1;
                        var1_1.skip(var12_14);
                        var2_2[var3_3] = '\u0000';
                        return var3_3;
                    }
                }
                if (var3_3 == var6_6) {
                    var1_1 = new FastParser$ParseException("Absurdly long value");
                    throw var1_1;
                }
                var1_1 = new FastParser$ParseException(var4_4);
                throw var1_1;
            }
            var1_1 = new FastParser$ParseException("Missing value");
            throw var1_1;
        }
        var1_1 = new FastParser$ParseException(var4_4);
        throw var1_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final long zan(BufferedReader bufferedReader) {
        long l2;
        int n3;
        int n4;
        char[] cArray = this.zaq;
        int n7 = this.zam(bufferedReader, cArray);
        long l3 = 0L;
        if (n7 == 0) {
            return l3;
        }
        char[] cArray2 = this.zaq;
        if (n7 <= 0) {
            FastParser$ParseException fastParser$ParseException = new FastParser$ParseException("No number to parse");
            throw fastParser$ParseException;
        }
        int n8 = 0;
        int n10 = cArray2[0];
        int n14 = 45;
        long l4 = n10 == n14 ? Long.MIN_VALUE : -9223372036854775807L;
        int n15 = 1;
        if (n10 == n14) {
            n8 = 1;
        }
        String string2 = "Unexpected non-digit character";
        n14 = 10;
        if (n8 < n7) {
            n4 = n8 + 1;
            n3 = Character.digit(cArray2[n8], n14);
            if (n3 < 0) {
                FastParser$ParseException fastParser$ParseException = new FastParser$ParseException(string2);
                throw fastParser$ParseException;
            }
            n3 = -n3;
            l2 = n3;
        } else {
            l2 = l3;
            n4 = n8;
        }
        while (n4 < n7) {
            n3 = n4 + 1;
            if ((n4 = Character.digit(cArray2[n4], n14)) < 0) {
                FastParser$ParseException fastParser$ParseException = new FastParser$ParseException(string2);
                throw fastParser$ParseException;
            }
            long l7 = -922337203685477580L;
            String string3 = "Number too large";
            Object object = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
            if (object < 0) {
                FastParser$ParseException fastParser$ParseException = new FastParser$ParseException(string3);
                throw fastParser$ParseException;
            }
            l7 = n4;
            long l8 = l4 + l7;
            long l12 = (l2 *= (long)10) - l8;
            if ((n4 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1))) < 0) {
                FastParser$ParseException fastParser$ParseException = new FastParser$ParseException(string3);
                throw fastParser$ParseException;
            }
            l2 -= l7;
            n4 = n3;
        }
        if (n8 == 0) {
            return -l2;
        }
        if (n4 > n15) {
            return l2;
        }
        FastParser$ParseException fastParser$ParseException = new FastParser$ParseException("No digits to parse");
        throw fastParser$ParseException;
    }

    private final String zao(BufferedReader bufferedReader) {
        char[] cArray = this.zap;
        StringBuilder stringBuilder = this.zar;
        return this.zap(bufferedReader, cArray, stringBuilder, null);
    }

    private final String zap(BufferedReader object, char[] cArray, StringBuilder stringBuilder, char[] cArray2) {
        char c2;
        char c3 = this.zai((BufferedReader)object);
        if (c3 != (c2 = '\"')) {
            char c5 = 'n';
            if (c3 == c5) {
                cArray = zaa;
                this.zax((BufferedReader)object, cArray);
                return null;
            }
            object = new FastParser$ParseException("Expected string");
            throw object;
        }
        return FastParser.zaA((BufferedReader)object, cArray, stringBuilder, cArray2);
    }

    private final String zaq(BufferedReader object) {
        Object object2 = this.zat;
        char c2 = '\u0002';
        Comparable<Integer> comparable = c2;
        ((Stack)object2).push(comparable);
        int n3 = this.zai((BufferedReader)object);
        int n4 = 34;
        if (n3 != n4) {
            int n7 = 93;
            if (n3 != n7) {
                n7 = 125;
                if (n3 == n7) {
                    this.zaw(c2);
                    return null;
                }
                StringBuilder stringBuilder = new StringBuilder("Unexpected token: ");
                stringBuilder.append((char)n3);
                object2 = stringBuilder.toString();
                object = new FastParser$ParseException((String)object2);
                throw object;
            }
            this.zaw(c2);
            this.zaw(1);
            this.zaw(5);
            return null;
        }
        object2 = this.zat;
        c2 = '\u0003';
        comparable = c2;
        ((Stack)object2).push(comparable);
        object2 = this.zap;
        comparable = this.zar;
        object2 = FastParser.zaA((BufferedReader)object, (char[])object2, (StringBuilder)comparable, null);
        this.zaw(c2);
        char c3 = this.zai((BufferedReader)object);
        c2 = ':';
        if (c3 == c2) {
            return object2;
        }
        object = new FastParser$ParseException("Expected key/value separator");
        throw object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private final String zar(BufferedReader var1_1) {
        block23: {
            block24: {
                block25: {
                    var1_1.mark(1024);
                    var2_2 = this.zai((BufferedReader)var1_1);
                    var3_3 = 92;
                    var4_4 = "Unexpected token ";
                    var5_5 = 125;
                    var6_6 = 44;
                    var7_7 = 34;
                    var8_8 = 1;
                    if (var2_2 == var7_7) break block23;
                    if (var2_2 == var6_6) {
                        var1_1 = new FastParser$ParseException("Missing value");
                        throw var1_1;
                    }
                    var9_9 = 32;
                    var10_10 = 91;
                    if (var2_2 == var10_10) break block24;
                    var3_3 = 123;
                    if (var2_2 == var3_3) break block25;
                    var1_1.reset();
                    var11_12 /* !! */  = this.zaq;
                    this.zam((BufferedReader)var1_1, var11_12 /* !! */ );
                    ** GOTO lbl-1000
                }
                var11_12 /* !! */  = (char[])this.zat;
                var12_13 = var8_8;
                var11_12 /* !! */ .push(var12_13);
                var1_1.mark(var9_9);
                var2_2 = this.zai((BufferedReader)var1_1);
                if (var2_2 == var5_5) {
                    this.zaw(var8_8);
                } else {
                    if (var2_2 != var7_7) {
                        var12_13 = new Comparable<Integer>(var4_4);
                        var12_13.append((char)var2_2);
                        var11_12 /* !! */  = (char[])var12_13.toString();
                        var1_1 = new FastParser$ParseException((String)var11_12 /* !! */ );
                        throw var1_1;
                    }
                    var1_1.reset();
                    this.zaq((BufferedReader)var1_1);
                    while ((var11_12 /* !! */  = (char[])this.zar((BufferedReader)var1_1)) != null) {
                    }
                    this.zaw(var8_8);
                }
                ** GOTO lbl-1000
            }
            var11_12 /* !! */  = (char[])this.zat;
            var13_14 = 5;
            var14_16 = var13_14;
            var11_12 /* !! */ .push(var14_16);
            var1_1.mark(var9_9);
            var2_2 = this.zai((BufferedReader)var1_1);
            var9_9 = 93;
            if (var2_2 == var9_9) {
                this.zaw(var13_14);
            } else {
                var1_1.reset();
                var2_2 = 0;
                var11_12 /* !! */  = null;
                block1: while (true) {
                    var15_17 = false;
                    var14_16 = null;
                    while (var8_8 > 0) {
                        var16_19 = this.zai((BufferedReader)var1_1);
                        if (var16_19 == 0) {
                            var1_1 = new FastParser$ParseException("Unexpected EOF while parsing array");
                            throw var1_1;
                        }
                        var17_20 = Character.isISOControl((char)var16_19);
                        if (var17_20) {
                            var1_1 = new FastParser$ParseException("Unexpected control character while reading array");
                            throw var1_1;
                        }
                        if (var16_19 == var7_7) {
                            if (!var15_17) {
                                var2_2 ^= '\u0001';
                            }
                            var16_19 = 34;
                        }
                        if (var16_19 == var10_10) {
                            if (var2_2 == 0) {
                                ++var8_8;
                            }
                            var16_19 = 91;
                        }
                        if (var16_19 == var9_9 && var2_2 == 0) {
                            var8_8 += -1;
                        }
                        if (var16_19 != var3_3 || var2_2 == 0) continue block1;
                        var15_17 ^= true;
                    }
                    break;
                }
                this.zaw(var13_14);
            }
            ** GOTO lbl-1000
        }
        var11_12 /* !! */  = this.zao;
        var2_2 = var1_1.read(var11_12 /* !! */ );
        var18_21 = "Unexpected EOF while parsing string";
        var10_11 = -1;
        if (var2_2 == var10_11) {
            var1_1 = new FastParser$ParseException(var18_21);
            throw var1_1;
        }
        var11_12 /* !! */  = this.zao;
        var2_2 = var11_12 /* !! */ [0];
        var13_15 = 0;
        do {
            block26: {
                if (var2_2 == var7_7) {
                    ** if (var13_15 == 0) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        var2_2 = 34;
                        var13_15 = 1;
                        ** GOTO lbl121
                    }
                }
                break block26;
lbl-1000:
                // 6 sources

                {
                    var2_2 = this.zai((BufferedReader)var1_1);
                    var3_3 = 2;
                    if (var2_2 == var6_6) {
                        this.zaw(var3_3);
                        return this.zaq((BufferedReader)var1_1);
                    }
                    if (var2_2 == var5_5) {
                        this.zaw(var3_3);
                        return null;
                    }
                    var12_13 = new Comparable<Integer>(var4_4);
                    var12_13.append((char)var2_2);
                    var11_12 /* !! */  = (char[])var12_13.toString();
                    var1_1 = new FastParser$ParseException((String)var11_12 /* !! */ );
                    throw var1_1;
                }
            }
            var13_15 = var2_2 == var3_3 ? (var2_2 = var13_15 ^ 1) : 0;
            var11_12 /* !! */  = this.zao;
            var2_2 = var1_1.read(var11_12 /* !! */ );
            if (var2_2 != var10_11) continue;
            var1_1 = new FastParser$ParseException(var18_21);
            throw var1_1;
        } while (!(var15_18 = Character.isISOControl((char)(var2_2 = (var11_12 /* !! */  = this.zao)[0]))));
        var1_1 = new FastParser$ParseException("Unexpected control character while reading string");
        throw var1_1;
    }

    private final BigDecimal zas(BufferedReader bufferedReader) {
        char[] cArray = this.zaq;
        int n3 = this.zam(bufferedReader, cArray);
        if (n3 == 0) {
            return null;
        }
        cArray = this.zaq;
        String string2 = new String(cArray, 0, n3);
        BigDecimal bigDecimal = new BigDecimal(string2);
        return bigDecimal;
    }

    private final BigInteger zat(BufferedReader bufferedReader) {
        char[] cArray = this.zaq;
        int n3 = this.zam(bufferedReader, cArray);
        if (n3 == 0) {
            return null;
        }
        cArray = this.zaq;
        String string2 = new String(cArray, 0, n3);
        BigInteger bigInteger = new BigInteger(string2);
        return bigInteger;
    }

    private final ArrayList zau(BufferedReader object, zai object2) {
        int n3;
        int n4 = this.zai((BufferedReader)object);
        if (n4 == (n3 = 110)) {
            object2 = zaa;
            this.zax((BufferedReader)object, (char[])object2);
            return null;
        }
        n3 = 91;
        if (n4 == n3) {
            block3: {
                AbstractList abstractList = this.zat;
                n3 = 5;
                Object object3 = n3;
                ((Stack)abstractList).push(object3);
                abstractList = new ArrayList();
                while (true) {
                    ((BufferedReader)object).mark(1024);
                    int n7 = this.zai((BufferedReader)object);
                    if (n7 == 0) break block3;
                    int n8 = 44;
                    if (n7 == n8) continue;
                    n8 = 93;
                    if (n7 == n8) break;
                    ((BufferedReader)object).reset();
                    object3 = object2.zaa(this, (BufferedReader)object);
                    ((ArrayList)abstractList).add(object3);
                }
                this.zaw(n3);
                return abstractList;
            }
            object = new FastParser$ParseException("Unexpected EOF");
            throw object;
        }
        object = new FastParser$ParseException("Expected start of array");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final ArrayList zav(BufferedReader object, FastJsonResponse$Field object2) {
        InstantiationException instantiationException2222;
        String string2;
        block11: {
            IllegalAccessException illegalAccessException2222;
            block10: {
                string2 = "Error instantiating inner object";
                ArrayList<Object> arrayList = new ArrayList<Object>();
                char c2 = this.zai((BufferedReader)object);
                char c3 = ']';
                int n3 = 5;
                if (c2 == c3) {
                    this.zaw(n3);
                    return arrayList;
                }
                char c5 = 'n';
                if (c2 == c5) {
                    object2 = zaa;
                    this.zax((BufferedReader)object, (char[])object2);
                    this.zaw(n3);
                    return null;
                }
                String string3 = "Unexpected token: ";
                char c6 = '{';
                if (c2 != c6) {
                    object2 = new StringBuilder(string3);
                    ((StringBuilder)object2).append(c2);
                    object2 = ((StringBuilder)object2).toString();
                    object = new FastParser$ParseException((String)object2);
                    throw object;
                }
                Object object3 = this.zat;
                int n4 = 1;
                Integer n7 = n4;
                ((Stack)object3).push(n7);
                while (true) {
                    block9: {
                        try {
                            object3 = ((FastJsonResponse$Field)object2).zad();
                            char c7 = this.zaz((BufferedReader)object, (FastJsonResponse)object3);
                            if (c7 == '\u0000') break;
                            arrayList.add(object3);
                            c2 = this.zai((BufferedReader)object);
                            c7 = ',';
                            if (c2 == c7) break block9;
                            if (c2 == c3) {
                                this.zaw(n3);
                                return arrayList;
                            }
                            object2 = new StringBuilder(string3);
                            ((StringBuilder)object2).append(c2);
                        }
                        catch (IllegalAccessException illegalAccessException2222) {
                            break block10;
                        }
                        catch (InstantiationException instantiationException2222) {
                            break block11;
                        }
                        object2 = ((StringBuilder)object2).toString();
                        object = new FastParser$ParseException((String)object2);
                        throw object;
                    }
                    c2 = this.zai((BufferedReader)object);
                    if (c2 != c6) {
                        object = new FastParser$ParseException("Expected start of next object in array");
                        throw object;
                    }
                    object3 = this.zat;
                    n7 = n4;
                    ((Stack)object3).push(n7);
                }
                return arrayList;
            }
            object2 = new FastParser$ParseException(string2, illegalAccessException2222);
            throw object2;
        }
        object2 = new FastParser$ParseException(string2, instantiationException2222);
        throw object2;
    }

    private final void zaw(int n3) {
        Serializable serializable = this.zat;
        boolean n4 = ((AbstractCollection)((Object)serializable)).isEmpty();
        String string2 = "Expected state ";
        if (!n4) {
            serializable = (Integer)this.zat.pop();
            int n7 = (Integer)serializable;
            if (n7 == n3) {
                return;
            }
            String string4 = D70.b(n3, n7, string2, " but had ");
            FastParser$ParseException fastParser$ParseException = new FastParser$ParseException(string4);
            throw fastParser$ParseException;
        }
        String string3 = Gj0.b(n3, string2, " but had empty stack");
        serializable = new FastParser$ParseException(string3);
        throw serializable;
    }

    private final void zax(BufferedReader object, char[] cArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = cArray.length); i3 += n3) {
            int n4;
            char[] cArray2 = this.zap;
            n3 -= i3;
            if ((n3 = ((BufferedReader)object).read(cArray2, 0, n3)) != (n4 = -1)) {
                cArray2 = null;
                for (n4 = 0; n4 < n3; ++n4) {
                    int n7 = n4 + i3;
                    char[] cArray3 = this.zap;
                    char c2 = cArray3[n4];
                    if ((n7 = cArray[n7]) == c2) {
                        continue;
                    }
                    object = new FastParser$ParseException("Unexpected character");
                    throw object;
                }
                continue;
            }
            object = new FastParser$ParseException("Unexpected EOF");
            throw object;
        }
    }

    private final boolean zay(BufferedReader object, boolean bl2) {
        char c2 = this.zai((BufferedReader)object);
        char c3 = '\"';
        boolean bl3 = true;
        if (c2 != c3) {
            c3 = 'f';
            if (c2 != c3) {
                c3 = 'n';
                if (c2 != c3) {
                    c3 = 't';
                    if (c2 == c3) {
                        char[] cArray = bl2 ? zac : zab;
                        this.zax((BufferedReader)object, cArray);
                        return bl3;
                    }
                    CharSequence charSequence = new StringBuilder("Unexpected token: ");
                    charSequence.append(c2);
                    charSequence = charSequence.toString();
                    object = new FastParser$ParseException((String)charSequence);
                    throw object;
                }
                char[] cArray = zaa;
                this.zax((BufferedReader)object, cArray);
                return false;
            }
            char[] cArray = bl2 ? zae : zad;
            this.zax((BufferedReader)object, cArray);
            return false;
        }
        if (!bl2) {
            return this.zay((BufferedReader)object, bl3);
        }
        object = new FastParser$ParseException("No boolean value found in string");
        throw object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final boolean zaz(BufferedReader var1_1, FastJsonResponse var2_2) {
        block26: {
            var3_3 = this;
            var4_4 = var1_1;
            var5_7 = var2_2;
            var6_8 = "Error instantiating inner object";
            var7_9 = var2_2.getFieldMappings();
            var8_10 = this.zaq(var1_1);
            var9_11 = 1;
            var10_12 = var9_11;
            if (var8_10 == null) break block26;
            while (var8_10 != null) {
                if ((var8_10 = (FastJsonResponse$Field)var7_9.get(var8_10)) == null) {
                    var8_10 = this.zar(var1_1);
                    continue;
                }
                var11_13 = var3_3.zat;
                var12_14 = 4;
                var13_15 = var12_14;
                var11_13.push(var13_15);
                var14_16 = var8_10.zaa;
                var15_17 = ',';
                var16_18 = '{';
                var17_19 = '}';
                var18_20 = 'n';
                block3 : switch (var14_16) {
                    default: {
                        var5_7 = hj0_0.a(var14_16, "Invalid field type ");
                        var4_4 = new FastParser$ParseException((String)var5_7);
                        throw var4_4;
                    }
                    case '\u000b': {
                        var14_16 = (char)var8_10.zab;
                        if (var14_16 == '\u0000') ** GOTO lbl54
                        var14_16 = this.zai(var1_1);
                        if (var14_16 == var18_20) {
                            var11_13 = FastParser.zaa;
                            var3_3.zax((BufferedReader)var4_4, (char[])var11_13);
                            var11_13 = var8_10.zae;
                            var5_7.addConcreteTypeArrayInternal((FastJsonResponse$Field)var8_10, (String)var11_13, null);
lbl38:
                            // 23 sources

                            while (true) {
                                var19_21 = '\u0004';
                                break block3;
                                break;
                            }
                        }
                        var20_22 = var3_3.zat;
                        var18_20 = '\u0005';
                        var21_23 /* !! */  = Integer.valueOf(var18_20);
                        var20_22.push(var21_23 /* !! */ );
                        var16_18 = '[';
                        if (var14_16 != var16_18) ** GOTO lbl52
                        var11_13 = var8_10.zae;
                        var20_22 = var3_3.zav((BufferedReader)var4_4, (FastJsonResponse$Field)var8_10);
                        var5_7.addConcreteTypeArrayInternal((FastJsonResponse$Field)var8_10, (String)var11_13, (ArrayList)var20_22);
                        ** GOTO lbl38
lbl52:
                        // 1 sources

                        var4_4 = new FastParser$ParseException("Expected array start");
                        throw var4_4;
lbl54:
                        // 1 sources

                        var14_16 = this.zai(var1_1);
                        if (var14_16 != var18_20) ** GOTO lbl61
                        var11_13 = FastParser.zaa;
                        var3_3.zax((BufferedReader)var4_4, (char[])var11_13);
                        var11_13 = var8_10.zae;
                        var5_7.addConcreteTypeInternal((FastJsonResponse$Field)var8_10, (String)var11_13, null);
                        ** GOTO lbl38
lbl61:
                        // 1 sources

                        var21_23 /* !! */  = var3_3.zat;
                        var21_23 /* !! */ .push(var10_12);
                        if (var14_16 != var16_18) ** GOTO lbl82
                        var11_13 = var8_10.zad();
                        var3_3.zaz((BufferedReader)var4_4, (FastJsonResponse)var11_13);
                        var20_22 = var8_10.zae;
                        try {
                            var5_7.addConcreteTypeInternal((FastJsonResponse$Field)var8_10, (String)var20_22, (FastJsonResponse)var11_13);
                            ** GOTO lbl38
                        }
                        catch (IllegalAccessException var4_5) {
                        }
                        catch (InstantiationException var4_6) {
                            ** GOTO lbl80
                        }
                        var5_7 = new FastParser$ParseException(var6_8, var4_5);
                        throw var5_7;
lbl80:
                        // 1 sources

                        var5_7 = new FastParser$ParseException(var6_8, var4_6);
                        throw var5_7;
lbl82:
                        // 1 sources

                        var4_4 = new FastParser$ParseException("Expected start of object");
                        throw var4_4;
                    }
                    case '\n': {
                        var14_16 = this.zai(var1_1);
                        if (var14_16 != var18_20) ** GOTO lbl92
                        var11_13 = FastParser.zaa;
                        var3_3.zax((BufferedReader)var4_4, (char[])var11_13);
                        var14_16 = '\u0000';
                        var11_13 = null;
                        ** GOTO lbl120
lbl92:
                        // 1 sources

                        if (var14_16 != var16_18) ** GOTO lbl140
                        var3_3.zat.push(var10_12);
                        var11_13 = new HashMap();
                        while ((var16_18 = this.zai(var1_1)) != '\u0000') {
                            var18_20 = '\"';
                            if (var16_18 == var18_20) ** GOTO lbl102
                            if (var16_18 != var17_19) continue;
                            var3_3.zaw(var9_11);
                            ** GOTO lbl120
lbl102:
                            // 1 sources

                            var20_22 = var3_3.zap;
                            var22_24 /* !! */  = (char[])var3_3.zar;
                            var22_24 /* !! */  = (char[])FastParser.zaA((BufferedReader)var4_4, (char[])var20_22, (StringBuilder)var22_24 /* !! */ , null);
                            var16_18 = this.zai(var1_1);
                            var23_25 = ':';
                            var24_26 = 8.1E-44f;
                            if (var16_18 != var23_25) ** GOTO lbl134
                            var23_25 = this.zai(var1_1);
                            if (var23_25 != var18_20) ** GOTO lbl130
                            var25_27 /* !! */  = var3_3.zap;
                            var20_22 = var3_3.zar;
                            var25_27 /* !! */  = (char[])FastParser.zaA((BufferedReader)var4_4, var25_27 /* !! */ , (StringBuilder)var20_22, null);
                            var11_13.put(var22_24 /* !! */ , var25_27 /* !! */ );
                            var23_25 = this.zai(var1_1);
                            if (var23_25 == var15_17) ** GOTO lbl128
                            if (var23_25 != var17_19) ** GOTO lbl122
                            var3_3.zaw(var9_11);
lbl120:
                            // 3 sources

                            var5_7.zaB((FastJsonResponse$Field)var8_10, (Map)var11_13);
                            ** GOTO lbl38
lbl122:
                            // 1 sources

                            var5_7 = new StringBuilder("Unexpected character while parsing string map: ");
                            var5_7.append(var23_25);
                            var5_7 = var5_7.toString();
                            var4_4 = new FastParser$ParseException((String)var5_7);
                            throw var4_4;
lbl128:
                            // 1 sources

                            var12_14 = 4;
                            continue;
lbl130:
                            // 1 sources

                            var4_4 = String.valueOf((Object)var22_24 /* !! */ );
                            var4_4 = "Expected String value for key ".concat((String)var4_4);
                            var5_7 = new FastParser$ParseException((String)var4_4);
                            throw var5_7;
lbl134:
                            // 1 sources

                            var4_4 = String.valueOf((Object)var22_24 /* !! */ );
                            var4_4 = "No map value found for key ".concat((String)var4_4);
                            var5_7 = new FastParser$ParseException((String)var4_4);
                            throw var5_7;
                        }
                        var4_4 = new FastParser$ParseException("Unexpected EOF");
                        throw var4_4;
lbl140:
                        // 1 sources

                        var4_4 = new FastParser$ParseException("Expected start of a map object");
                        throw var4_4;
                    }
                    case '\t': {
                        var25_27 /* !! */  = var3_3.zaq;
                        var11_13 = var3_3.zas;
                        var22_24 /* !! */  = FastParser.zaf;
                        var25_27 /* !! */  = (char[])Base64Utils.decodeUrlSafe(var3_3.zap((BufferedReader)var4_4, var25_27 /* !! */ , (StringBuilder)var11_13, var22_24 /* !! */ ));
                        var5_7.zal((FastJsonResponse$Field)var8_10, (byte[])var25_27 /* !! */ );
                        ** GOTO lbl38
                    }
                    case '\b': {
                        var25_27 /* !! */  = var3_3.zaq;
                        var11_13 = var3_3.zas;
                        var22_24 /* !! */  = FastParser.zaf;
                        var25_27 /* !! */  = (char[])Base64Utils.decode(var3_3.zap((BufferedReader)var4_4, var25_27 /* !! */ , (StringBuilder)var11_13, var22_24 /* !! */ ));
                        var5_7.zal((FastJsonResponse$Field)var8_10, (byte[])var25_27 /* !! */ );
                        ** GOTO lbl38
                    }
                    case '\u0007': {
                        var23_25 = var8_10.zab;
                        if (var23_25 == '\u0000') ** GOTO lbl163
                        var25_27 /* !! */  = (char[])FastParser.zal;
                        var25_27 /* !! */  = (char[])var3_3.zau((BufferedReader)var4_4, (zai)var25_27 /* !! */ );
                        var5_7.zaC((FastJsonResponse$Field)var8_10, (ArrayList)var25_27 /* !! */ );
                        ** GOTO lbl38
lbl163:
                        // 1 sources

                        var25_27 /* !! */  = (char[])this.zao(var1_1);
                        var5_7.zaA((FastJsonResponse$Field)var8_10, (String)var25_27 /* !! */ );
                        ** GOTO lbl38
                    }
                    case '\u0006': {
                        var23_25 = var8_10.zab;
                        if (var23_25 == '\u0000') ** GOTO lbl173
                        var25_27 /* !! */  = (char[])FastParser.zak;
                        var25_27 /* !! */  = (char[])var3_3.zau((BufferedReader)var4_4, (zai)var25_27 /* !! */ );
                        var5_7.zaj((FastJsonResponse$Field)var8_10, (ArrayList)var25_27 /* !! */ );
                        ** GOTO lbl38
lbl173:
                        // 1 sources

                        var23_25 = '\u0000';
                        var24_26 = 0.0f;
                        var25_27 /* !! */  = null;
                        var14_16 = (char)var3_3.zay((BufferedReader)var4_4, false);
                        var5_7.zai((FastJsonResponse$Field)var8_10, (boolean)var14_16);
                        ** GOTO lbl38
                    }
                    case '\u0005': {
                        var23_25 = var8_10.zab;
                        if (var23_25 == '\u0000') ** GOTO lbl186
                        var25_27 /* !! */  = (char[])FastParser.zan;
                        var25_27 /* !! */  = (char[])var3_3.zau((BufferedReader)var4_4, (zai)var25_27 /* !! */ );
                        var5_7.zac((FastJsonResponse$Field)var8_10, (ArrayList)var25_27 /* !! */ );
                        ** GOTO lbl38
lbl186:
                        // 1 sources

                        var25_27 /* !! */  = (char[])this.zas(var1_1);
                        var5_7.zaa((FastJsonResponse$Field)var8_10, (BigDecimal)var25_27 /* !! */ );
                        ** GOTO lbl38
                    }
                    case '\u0004': {
                        var23_25 = var8_10.zab;
                        if (var23_25 == '\u0000') ** GOTO lbl196
                        var25_27 /* !! */  = (char[])FastParser.zaj;
                        var25_27 /* !! */  = (char[])var3_3.zau((BufferedReader)var4_4, (zai)var25_27 /* !! */ );
                        var5_7.zao((FastJsonResponse$Field)var8_10, (ArrayList)var25_27 /* !! */ );
                        ** GOTO lbl38
lbl196:
                        // 1 sources

                        var26_28 = this.zaj(var1_1);
                        var5_7.zam((FastJsonResponse$Field)var8_10, var26_28);
                        ** GOTO lbl38
                    }
                    case '\u0003': {
                        var23_25 = var8_10.zab;
                        if (var23_25 == '\u0000') ** GOTO lbl206
                        var25_27 /* !! */  = (char[])FastParser.zai;
                        var25_27 /* !! */  = (char[])var3_3.zau((BufferedReader)var4_4, (zai)var25_27 /* !! */ );
                        var5_7.zas((FastJsonResponse$Field)var8_10, (ArrayList)var25_27 /* !! */ );
                        ** GOTO lbl38
lbl206:
                        // 1 sources

                        var24_26 = this.zak(var1_1);
                        var5_7.zaq((FastJsonResponse$Field)var8_10, var24_26);
                        ** GOTO lbl38
                    }
                    case '\u0002': {
                        var23_25 = var8_10.zab;
                        if (var23_25 == '\u0000') ** GOTO lbl216
                        var25_27 /* !! */  = (char[])FastParser.zah;
                        var25_27 /* !! */  = (char[])var3_3.zau((BufferedReader)var4_4, (zai)var25_27 /* !! */ );
                        var5_7.zay((FastJsonResponse$Field)var8_10, (ArrayList)var25_27 /* !! */ );
                        ** GOTO lbl38
lbl216:
                        // 1 sources

                        var28_29 = this.zan(var1_1);
                        var5_7.zax((FastJsonResponse$Field)var8_10, var28_29);
                        ** GOTO lbl38
                    }
                    case '\u0001': {
                        var23_25 = var8_10.zab;
                        if (var23_25 == '\u0000') ** GOTO lbl226
                        var25_27 /* !! */  = (char[])FastParser.zam;
                        var25_27 /* !! */  = (char[])var3_3.zau((BufferedReader)var4_4, (zai)var25_27 /* !! */ );
                        var5_7.zag((FastJsonResponse$Field)var8_10, (ArrayList)var25_27 /* !! */ );
                        ** GOTO lbl38
lbl226:
                        // 1 sources

                        var25_27 /* !! */  = (char[])this.zat(var1_1);
                        var5_7.zae((FastJsonResponse$Field)var8_10, (BigInteger)var25_27 /* !! */ );
                        ** GOTO lbl38
                    }
                    case '\u0000': {
                        var23_25 = var8_10.zab;
                        if (var23_25 == '\u0000') ** GOTO lbl236
                        var25_27 /* !! */  = (char[])FastParser.zag;
                        var25_27 /* !! */  = (char[])var3_3.zau((BufferedReader)var4_4, (zai)var25_27 /* !! */ );
                        var5_7.zav((FastJsonResponse$Field)var8_10, (ArrayList)var25_27 /* !! */ );
                        ** GOTO lbl38
lbl236:
                        // 1 sources

                        var23_25 = this.zal(var1_1);
                        var5_7.zau((FastJsonResponse$Field)var8_10, var23_25);
                        ** continue;
                    }
                }
                var3_3.zaw(var19_21);
                var3_3.zaw(2);
                var19_21 = this.zai(var1_1);
                if (var19_21 != var15_17) {
                    if (var19_21 == var17_19) {
                        var19_21 = '\u0000';
                        var8_10 = null;
                        continue;
                    }
                    var5_7 = new StringBuilder("Expected end of object or field separator, but found: ");
                    var5_7.append(var19_21);
                    var5_7 = var5_7.toString();
                    var4_4 = new FastParser$ParseException((String)var5_7);
                    throw var4_4;
                }
                var8_10 = this.zaq(var1_1);
            }
            var3_3.zaw(var9_11);
            return (boolean)var9_11;
        }
        this.zaw(var9_11);
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void parse(InputStream object, FastJsonResponse object2) {
        Throwable throwable222;
        BufferedReader bufferedReader;
        block14: {
            IOException iOException322;
            block15: {
                block12: {
                    block13: {
                        Object object3 = "Unexpected token: ";
                        Object object4 = new InputStreamReader((InputStream)object);
                        char c2 = '\u0400';
                        bufferedReader = new BufferedReader((Reader)object4, c2);
                        object = this.zat;
                        object4 = null;
                        Object object5 = 0;
                        ((Stack)object).push(object5);
                        c2 = this.zai(bufferedReader);
                        if (c2 == '\u0000') break block12;
                        int n3 = 91;
                        int n4 = 1;
                        if (c2 != n3) {
                            n3 = 123;
                            if (c2 != n3) {
                                object4 = new StringBuilder((String)object3);
                                ((StringBuilder)object4).append(c2);
                                object = ((StringBuilder)object4).toString();
                                object2 = new FastParser$ParseException((String)object);
                                throw object2;
                            }
                            object = this.zat;
                            object3 = n4;
                            ((Stack)object).push(object3);
                            this.zaz(bufferedReader, (FastJsonResponse)object2);
                        } else {
                            object = this.zat;
                            int n7 = 5;
                            object3 = n7;
                            ((Stack)object).push(object3);
                            object = ((FastJsonResponse)object2).getFieldMappings();
                            n7 = object.size();
                            if (n7 != n4) break block13;
                            object = object.entrySet();
                            object = object.iterator();
                            object = object.next();
                            object = (Map.Entry)object;
                            object = object.getValue();
                            object = (FastJsonResponse$Field)object;
                            object3 = this.zav(bufferedReader, (FastJsonResponse$Field)object);
                            object5 = ((FastJsonResponse$Field)object).zae;
                            ((FastJsonResponse)object2).addConcreteTypeArrayInternal((FastJsonResponse$Field)object, (String)object5, (ArrayList)object3);
                        }
                        this.zaw(0);
                        try {
                            bufferedReader.close();
                            return;
                        }
                        catch (IOException iOException2) {
                            return;
                        }
                    }
                    try {
                    }
                    catch (Throwable throwable222) {
                        break block14;
                    }
                    object2 = "Object array response class must have a single Field";
                    object = new FastParser$ParseException((String)object2);
                    throw object;
                    catch (IOException iOException322) {
                        break block15;
                    }
                }
                object2 = "No data to parse";
                object = new FastParser$ParseException((String)object2);
                throw object;
            }
            object2 = new FastParser$ParseException(iOException322);
            throw object2;
        }
        try {
            bufferedReader.close();
        }
        catch (IOException iOException) {
            throw throwable222;
        }
        throw throwable222;
    }
}

