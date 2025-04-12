/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from R91
 */
public final class r91_0
implements Closeable {
    public static final Logger e;
    public final se_1 a;
    public final boolean b;
    public final R91$b c;
    public final C91$a d;

    static {
        Logger logger = Logger.getLogger(f91_0.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        e = logger;
    }

    public r91_0(se_1 object, boolean bl2) {
        R91$b r91$b;
        Intrinsics.checkNotNullParameter(object, "source");
        this.a = object;
        this.b = bl2;
        this.c = r91$b = new R91$b((se_1)object);
        this.d = object = new C91$a(r91$b);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean a(boolean var1_1, R91$c var2_2) {
        block48: {
            block49: {
                block50: {
                    var3_3 = this;
                    var4_4 = var2_2;
                    var5_5 = 6;
                    var6_6 = 8;
                    var7_7 = 0;
                    var8_8 = null;
                    var9_9 = 1;
                    var10_10 = this.a;
                    var11_11 /* !! */  = "handler";
                    Intrinsics.checkNotNullParameter(var2_2, var11_11 /* !! */ );
                    var12_12 = 9;
                    try {
                        var10_10.f(var12_12);
                    }
                    catch (EOFException v0) {
                        return false;
                    }
                    var14_13 = ez3.t(var10_10);
                    var15_14 = 16384;
                    if (var14_13 > var15_14) break block48;
                    var16_15 = var10_10.readByte() & 255;
                    var17_16 = var10_10.readByte();
                    var18_17 = var17_16 & 255;
                    var19_18 = var10_10.readInt();
                    var20_19 = -1 >>> 1;
                    var19_18 &= var20_19;
                    var22_21 /* !! */  = r91_0.e;
                    var21_20 = Level.FINE;
                    var23_22 = var22_21 /* !! */ .isLoggable((Level)var21_20);
                    if (var23_22 != 0) {
                        f91_0.a.getClass();
                        var21_20 = f91_0.a((boolean)var9_9, var19_18, var14_13, var16_15, var18_17);
                        var22_21 /* !! */ .fine((String)var21_20);
                    }
                    var23_22 = 4;
                    if (var1_1 && var16_15 != var23_22) {
                        var24_23 /* !! */  = new StringBuilder("Expected a SETTINGS frame but was ");
                        f91_0.a.getClass();
                        var25_36 /* !! */  = f91_0.c;
                        var26_42 = var25_36 /* !! */ .length;
                        if (var16_15 < var26_42) {
                            var25_36 /* !! */  = var25_36 /* !! */ [var16_15];
                        } else {
                            var25_36 /* !! */  = var16_15;
                            var27_45 = new Object[var9_9];
                            var27_45[0] = var25_36 /* !! */ ;
                            var25_36 /* !! */  = ez3.i("0x%02x", var27_45);
                        }
                        var24_23 /* !! */ .append((String)var25_36 /* !! */ );
                        var24_23 /* !! */  = var24_23 /* !! */ .toString();
                        var4_4 = new IOException((String)var24_23 /* !! */ );
                        throw var4_4;
                    }
                    var28_46 = 5;
                    switch (var16_15) {
                        default: {
                            var29_47 = var14_13;
                            var10_10.skip(var29_47);
                            break;
                        }
                        case 8: {
                            if (var14_13 == var23_22) {
                                var5_5 = var10_10.readInt();
                                var31_49 = (long)var5_5 & 0x7FFFFFFFL;
                                cfr_temp_0 = var31_49 - (var33_50 = 0L);
                                var7_7 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var7_7 != 0) {
                                    var4_4.b(var19_18, var31_49);
                                    break;
                                }
                                var4_4 = new IOException("windowSizeIncrement was 0");
                                throw var4_4;
                            }
                            var24_24 = hj0_0.a(var14_13, "TYPE_WINDOW_UPDATE length !=4: ");
                            var4_4 = new IOException(var24_24);
                            throw var4_4;
                        }
                        case 7: {
                            if (var14_13 < var6_6) ** GOTO lbl102
                            if (var19_18 != 0) ** GOTO lbl100
                            var5_5 = var10_10.readInt();
                            var15_14 = var10_10.readInt();
                            var14_13 -= var6_6;
                            ta0_2.Companion.getClass();
                            var25_37 /* !! */  = ta0_2.values();
                            var16_15 = var25_37 /* !! */ .length;
                            while (var7_7 < var16_15) {
                                var35_51 = var25_37 /* !! */ [var7_7];
                                var18_17 = var35_51.getHttpCode();
                                if (var18_17 != var15_14) ** GOTO lbl86
                                var22_21 /* !! */  = var35_51;
                                ** GOTO lbl90
lbl86:
                                // 1 sources

                                var7_7 += var9_9;
                            }
                            var28_46 = 0;
                            var22_21 /* !! */  = null;
lbl90:
                            // 2 sources

                            if (var22_21 /* !! */  != null) {
                                var25_37 /* !! */  = ff_2.d;
                                if (var14_13 > 0) {
                                    var36_53 = var14_13;
                                    var25_37 /* !! */  = var10_10.b0(var36_53);
                                }
                                var4_4.a(var5_5, (ta0_2)var22_21 /* !! */ , (ff_2)var25_37 /* !! */ );
                                break;
                            }
                            var24_25 = hj0_0.a(var15_14, "TYPE_GOAWAY unexpected error code: ");
                            var4_4 = new IOException(var24_25);
                            throw var4_4;
lbl100:
                            // 1 sources

                            var4_4 = new IOException("TYPE_GOAWAY streamId != 0");
                            throw var4_4;
lbl102:
                            // 1 sources

                            var24_26 = hj0_0.a(var14_13, "TYPE_GOAWAY length < 8: ");
                            var4_4 = new IOException(var24_26);
                            throw var4_4;
                        }
                        case 6: {
                            if (var14_13 == var6_6) {
                                if (var19_18 == 0) {
                                    var5_5 = var10_10.readInt();
                                    var6_6 = var10_10.readInt();
                                    var26_43 = var17_16 & 1;
                                    if (var26_43 != 0) {
                                        var7_7 = 1;
                                    }
                                    var4_4.g(var5_5, var6_6, (boolean)var7_7);
                                    break;
                                }
                                var4_4 = new IOException("TYPE_PING streamId != 0");
                                throw var4_4;
                            }
                            var24_27 = hj0_0.a(var14_13, "TYPE_PING length != 8: ");
                            var4_4 = new IOException(var24_27);
                            throw var4_4;
                        }
                        case 5: {
                            if (var19_18 != 0) {
                                var5_5 = var17_16 & 8;
                                if (var5_5 != 0) {
                                    var5_5 = var10_10.readByte();
                                    var7_7 = var5_5 & 255;
                                }
                                var5_5 = var10_10.readInt() & var20_19;
                                var6_6 = r91$a_0.a(var14_13 -= var23_22, var18_17, var7_7);
                                var25_38 = var3_3.c(var6_6, var7_7, var18_17, var19_18);
                                var4_4.d(var5_5, var25_38);
                                break;
                            }
                            var4_4 = new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                            throw var4_4;
                        }
                        case 4: {
                            if (var19_18 != 0) ** GOTO lbl185
                            var6_6 = var17_16 & 1;
                            if (var6_6 != 0) {
                                if (var14_13 == 0) {
                                    var2_2.getClass();
                                    break;
                                }
                                var4_4 = new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                throw var4_4;
                            }
                            var6_6 = var14_13 % 6;
                            if (var6_6 != 0) ** GOTO lbl182
                            var25_39 = new R03();
                            var8_8 = f.m(0, var14_13);
                            var24_28 = f.l(var5_5, var8_8);
                            var7_7 = var24_28.a;
                            var14_13 = var24_28.b;
                            var5_5 = var24_28.c;
                            if ((var5_5 <= 0 || var7_7 > var14_13) && (var5_5 >= 0 || var14_13 > var7_7)) ** GOTO lbl180
                            while (true) {
                                var16_15 = var10_10.readShort();
                                var35_52 = ez3.a;
                                var17_16 = var10_10.readInt();
                                var18_17 = 2;
                                if ((var16_15 &= (char)-1) == var18_17) ** GOTO lbl173
                                var18_17 = 3;
                                if (var16_15 == var18_17) ** GOTO lbl171
                                if (var16_15 != var23_22) {
                                    if (var16_15 == var28_46 && (var17_16 < var15_14 || var17_16 > (var18_17 = 0xFFFFFF))) {
                                        var24_28 = hj0_0.a(var17_16, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ");
                                        var4_4 = new IOException((String)var24_28);
                                        throw var4_4;
                                    }
                                } else if (var17_16 >= 0) {
                                    var16_15 = 7;
                                } else {
                                    var4_4 = new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    throw var4_4;
lbl171:
                                    // 1 sources

                                    var16_15 = 4;
                                }
                                ** GOTO lbl176
lbl173:
                                // 1 sources

                                if (var17_16 != 0 && var17_16 != var9_9) {
                                    var4_4 = new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                    throw var4_4;
                                }
lbl176:
                                // 5 sources

                                var25_39.c(var16_15, var17_16);
                                if (var7_7 == var14_13) break;
                                var7_7 += var5_5;
                            }
lbl180:
                            // 2 sources

                            var4_4.c(var25_39);
                            break;
lbl182:
                            // 1 sources

                            var24_29 = hj0_0.a(var14_13, "TYPE_SETTINGS length % 6 != 0: ");
                            var4_4 = new IOException(var24_29);
                            throw var4_4;
lbl185:
                            // 1 sources

                            var4_4 = new IOException("TYPE_SETTINGS streamId != 0");
                            throw var4_4;
                        }
                        case 3: {
                            if (var14_13 != var23_22) ** GOTO lbl213
                            if (var19_18 == 0) ** GOTO lbl211
                            var5_5 = var10_10.readInt();
                            ta0_2.Companion.getClass();
                            var25_40 = ta0_2.values();
                            var26_44 = var25_40.length;
                            while (var7_7 < var26_44) {
                                var11_11 /* !! */  = var25_40[var7_7];
                                var15_14 = var11_11 /* !! */ .getHttpCode();
                                if (var15_14 != var5_5) ** GOTO lbl201
                                var22_21 /* !! */  = var11_11 /* !! */ ;
                                ** GOTO lbl205
lbl201:
                                // 1 sources

                                var7_7 += var9_9;
                            }
                            var28_46 = 0;
                            var22_21 /* !! */  = null;
lbl205:
                            // 2 sources

                            if (var22_21 /* !! */  != null) {
                                var4_4.e(var19_18, (ta0_2)var22_21 /* !! */ );
                                break;
                            }
                            var24_30 = hj0_0.a(var5_5, "TYPE_RST_STREAM unexpected error code: ");
                            var4_4 = new IOException(var24_30);
                            throw var4_4;
lbl211:
                            // 1 sources

                            var4_4 = new IOException("TYPE_RST_STREAM streamId == 0");
                            throw var4_4;
lbl213:
                            // 1 sources

                            var24_31 = Gj0.b(var14_13, "TYPE_RST_STREAM length: ", " != 4");
                            var4_4 = new IOException(var24_31);
                            throw var4_4;
                        }
                        case 2: {
                            if (var14_13 == var28_46) {
                                if (var19_18 != 0) {
                                    var3_3.d((R91$c)var4_4, var19_18);
                                    break;
                                }
                                var4_4 = new IOException("TYPE_PRIORITY streamId == 0");
                                throw var4_4;
                            }
                            var24_32 = Gj0.b(var14_13, "TYPE_PRIORITY length: ", " != 5");
                            var4_4 = new IOException(var24_32);
                            throw var4_4;
                        }
                        case 1: {
                            if (var19_18 != 0) {
                                var5_5 = var17_16 & 1;
                                if (var5_5 != 0) {
                                    var5_5 = 1;
                                } else {
                                    var5_5 = 0;
                                    var24_33 = null;
                                }
                                if ((var6_6 &= var17_16) != 0) {
                                    var6_6 = var10_10.readByte();
                                    var7_7 = var6_6 & 255;
                                }
                                if ((var6_6 = var17_16 & 32) != 0) {
                                    var3_3.d((R91$c)var4_4, var19_18);
                                    var14_13 += -5;
                                }
                                var6_6 = r91$a_0.a(var14_13, var18_17, var7_7);
                                var25_41 = var3_3.c(var6_6, var7_7, var18_17, var19_18);
                                var4_4.h(var19_18, var25_41, (boolean)var5_5);
                                break;
                            }
                            var4_4 = new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                            throw var4_4;
                        }
                        case 0: {
                            if (var19_18 == 0) break block49;
                            var5_5 = var17_16 & 1;
                            if (var5_5 != 0) {
                                var5_5 = 1;
                            } else {
                                var5_5 = 0;
                                var24_34 = null;
                            }
                            var15_14 = var17_16 & 32;
                            if (var15_14 != 0) break block50;
                            if ((var6_6 &= var17_16) != 0) {
                                var6_6 = var10_10.readByte();
                                var7_7 = var6_6 & 255;
                            }
                            var6_6 = r91$a_0.a(var14_13, var18_17, var7_7);
                            var4_4.f((boolean)var5_5, var19_18, var10_10, var6_6);
                            var29_48 = var7_7;
                            var10_10.skip(var29_48);
                        }
                    }
                    return (boolean)var9_9;
                }
                var4_4 = new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                throw var4_4;
            }
            var4_4 = new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            throw var4_4;
        }
        var24_35 = hj0_0.a(var14_13, "FRAME_SIZE_ERROR: ");
        var4_4 = new IOException(var24_35);
        throw var4_4;
    }

    public final void b(R91$c object) {
        Object object2;
        block8: {
            block7: {
                boolean bl2;
                int n3;
                block6: {
                    object2 = "handler";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    n3 = this.b;
                    if (n3 == 0) break block6;
                    n3 = 1;
                    boolean bl3 = this.a(n3 != 0, (R91$c)object);
                    if (!bl3) {
                        object = new IOException("Required SETTINGS preface not received");
                        throw object;
                    }
                    break block7;
                }
                object = f91_0.b;
                n3 = ((ff_2)object).a.length;
                long l2 = n3;
                object2 = this.a.b0(l2);
                Logger logger = e;
                Object object3 = Level.FINE;
                boolean bl4 = logger.isLoggable((Level)object3);
                if (bl4) {
                    object3 = new StringBuilder("<< CONNECTION ");
                    Object[] objectArray = ((ff_2)object2).e();
                    ((StringBuilder)object3).append((String)objectArray);
                    object3 = ((StringBuilder)object3).toString();
                    objectArray = new Object[]{};
                    object3 = ez3.i((String)object3, objectArray);
                    logger.fine((String)object3);
                }
                if (!(bl2 = Intrinsics.areEqual(object, object2))) break block8;
            }
            return;
        }
        object2 = ((ff_2)object2).q();
        object2 = "Expected a connection header but was ".concat((String)object2);
        object = new IOException((String)object2);
        throw object;
    }

    public final List c(int n3, int n4, int n7, int n8) {
        Object object;
        Object object2;
        block10: {
            int n10 = 32;
            int n14 = 64;
            int n15 = 128;
            w31_0[] w31_0Array = this.c;
            w31_0Array.e = n3;
            w31_0Array.b = n3;
            w31_0Array.f = n4;
            w31_0Array.c = n7;
            w31_0Array.d = n8;
            while (true) {
                object2 = this.d;
                Object[] objectArray = ((C91$a)object2).c;
                n7 = (int)(objectArray.g() ? 1 : 0);
                object = ((C91$a)object2).b;
                if (n7 != 0) break block10;
                n4 = objectArray.readByte();
                Object object3 = ez3.a;
                n7 = n4 & 0xFF;
                if (n7 == n15) break;
                int n16 = n4 & 0x80;
                if (n16 == n15) {
                    int n17;
                    n4 = ((C91$a)object2).e(n7, 127);
                    if ((n7 = n4 + -1) >= 0 && n7 <= (n17 = (w31_0Array = c91_0.a).length + -1)) {
                        object2 = w31_0Array[n7];
                        ((ArrayList)object).add(object2);
                        continue;
                    }
                    w31_0Array = c91_0.a;
                    n16 = w31_0Array.length;
                    if ((n16 = ((C91$a)object2).e + 1 + (n7 -= n16)) >= 0 && n16 < (n7 = ((w31_0[])(object2 = ((C91$a)object2).d)).length)) {
                        object2 = object2[n16];
                        Intrinsics.checkNotNull(object2);
                        ((ArrayList)object).add(object2);
                        continue;
                    }
                    objectArray = hj0_0.a(n4, "Header index too large ");
                    object2 = new IOException((String)objectArray);
                    throw object2;
                }
                if (n7 == n14) {
                    objectArray = c91_0.a;
                    objectArray = ((C91$a)object2).d();
                    c91_0.a((ff_2)objectArray);
                    object3 = ((C91$a)object2).d();
                    object = new w31_0((ff_2)objectArray, (ff_2)object3);
                    ((C91$a)object2).c((w31_0)object);
                    continue;
                }
                n16 = n4 & 0x40;
                if (n16 == n14) {
                    n4 = ((C91$a)object2).e(n7, 63) + -1;
                    objectArray = ((C91$a)object2).b(n4);
                    object3 = ((C91$a)object2).d();
                    object = new w31_0((ff_2)objectArray, (ff_2)object3);
                    ((C91$a)object2).c((w31_0)object);
                    continue;
                }
                if ((n4 &= n10) == n10) {
                    ((C91$a)object2).a = n4 = ((C91$a)object2).e(n7, 31);
                    if (n4 >= 0 && n4 <= (n7 = 4096)) {
                        n7 = ((C91$a)object2).g;
                        if (n4 >= n7) continue;
                        if (n4 == 0) {
                            objectArray = ((C91$a)object2).d;
                            n7 = 0;
                            object3 = null;
                            rp_1.o(null, objectArray);
                            ((C91$a)object2).e = n4 = ((C91$a)object2).d.length + -1;
                            n4 = 0;
                            objectArray = null;
                            ((C91$a)object2).f = 0;
                            ((C91$a)object2).g = 0;
                            continue;
                        }
                        ((C91$a)object2).a(n7 -= n4);
                        continue;
                    }
                    object3 = new StringBuilder;
                    ((StringBuilder)object3)("Invalid dynamic table size update ");
                    n3 = ((C91$a)object2).a;
                    ((StringBuilder)object3).append(n3);
                    object2 = ((StringBuilder)object3).toString();
                    objectArray = new IOException((String)object2);
                    throw objectArray;
                }
                n4 = 16;
                if (n7 != n4 && n7 != 0) {
                    n4 = ((C91$a)object2).e(n7, 15) + -1;
                    objectArray = ((C91$a)object2).b(n4);
                    object2 = ((C91$a)object2).d();
                    object3 = new w31_0((ff_2)objectArray, (ff_2)object2);
                    ((ArrayList)object).add(object3);
                    continue;
                }
                objectArray = c91_0.a;
                objectArray = ((C91$a)object2).d();
                c91_0.a((ff_2)objectArray);
                object2 = ((C91$a)object2).d();
                object3 = new w31_0;
                object3 = new w31_0((ff_2)objectArray, (ff_2)object2);
                ((ArrayList)object).add(object3);
            }
            object2 = new IOException("index == 0");
            throw object2;
        }
        object2 = CollectionsKt.k0((Iterable)object);
        ((ArrayList)object).clear();
        return object2;
    }

    public final void close() {
        this.a.close();
    }

    public final void d(R91$c r91$c, int n3) {
        Object object = this.a;
        object.readInt();
        object.readByte();
        object = ez3.a;
        r91$c.getClass();
    }
}

