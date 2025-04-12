/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.Coupon;
import com.ril.ajio.kmm.shared.bonanza.model.CouponValue;
import com.ril.ajio.kmm.shared.bonanza.model.CouponValue$$serializer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Coupon$$serializer
implements dz0_2 {
    public static final Coupon$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Coupon$$serializer coupon$$serializer;
        INSTANCE = coupon$$serializer = new Coupon$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.bonanza.model.Coupon", coupon$$serializer, 14);
        boolean bl2 = true;
        hv2_22.j("activeDate", bl2);
        hv2_22.j("bannerImageURL", bl2);
        hv2_22.j("couponAttributes", bl2);
        hv2_22.j("couponValue", bl2);
        hv2_22.j("expiryDate", bl2);
        hv2_22.j("extraLabel", bl2);
        hv2_22.j("gameType", bl2);
        hv2_22.j("label", bl2);
        hv2_22.j("offerId", bl2);
        hv2_22.j("offerType", bl2);
        hv2_22.j("plpLink", bl2);
        hv2_22.j("rewardId", bl2);
        hv2_22.j("serialNumberId", bl2);
        hv2_22.j("status", bl2);
        descriptor = hv2_22;
    }

    private Coupon$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        Object object = Coupon.access$get$childSerializers$cp();
        KSerializer kSerializer = mb1_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        KSerializer kSerializer3 = pe3_2.a;
        KSerializer kSerializer4 = xe_1.p(kSerializer3);
        int n3 = 2;
        object = xe_1.p(object[n3]);
        KSerializer kSerializer5 = xe_1.p(CouponValue$$serializer.INSTANCE);
        kSerializer = xe_1.p(kSerializer);
        KSerializer kSerializer6 = xe_1.p(kSerializer3);
        KSerializer kSerializer7 = xe_1.p(kSerializer3);
        KSerializer kSerializer8 = xe_1.p(kSerializer3);
        KSerializer kSerializer9 = xe_1.p(yi1_2.a);
        KSerializer kSerializer10 = xe_1.p(kSerializer3);
        KSerializer kSerializer11 = xe_1.p(kSerializer3);
        KSerializer kSerializer12 = xe_1.p(kSerializer3);
        KSerializer kSerializer13 = xe_1.p(kSerializer3);
        kSerializer3 = xe_1.p(kSerializer3);
        KSerializer[] kSerializerArray = new KSerializer[14];
        kSerializerArray[0] = kSerializer2;
        kSerializerArray[1] = kSerializer4;
        kSerializerArray[n3] = object;
        kSerializerArray[3] = kSerializer5;
        kSerializerArray[4] = kSerializer;
        kSerializerArray[5] = kSerializer6;
        kSerializerArray[6] = kSerializer7;
        kSerializerArray[7] = kSerializer8;
        kSerializerArray[8] = kSerializer9;
        kSerializerArray[9] = kSerializer10;
        kSerializerArray[10] = kSerializer11;
        kSerializerArray[11] = kSerializer12;
        kSerializerArray[12] = kSerializer13;
        kSerializerArray[13] = kSerializer3;
        return kSerializerArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Coupon deserialize(Decoder var1_1) {
        var2_2 = var1_1;
        Intrinsics.checkNotNullParameter(var1_1, "decoder");
        var3_3 = Coupon$$serializer.descriptor;
        var2_2 = var1_1.c(var3_3);
        var4_4 /* !! */  = Coupon.access$get$childSerializers$cp();
        var5_5 /* !! */  = null;
        var6_6 /* !! */  = null;
        var7_7 /* !! */  = null;
        var8_8 /* !! */  = null;
        var9_9 /* !! */  = null;
        var10_10 /* !! */  = null;
        var11_11 = 0;
        var12_12 /* !! */  = null;
        var13_13 /* !! */  = null;
        var14_14 /* !! */  = null;
        var15_15 /* !! */  = null;
        var16_16 /* !! */  = null;
        var17_17 /* !! */  = null;
        var18_18 /* !! */  = null;
        var19_19 /* !! */  = null;
        var20_20 = 0;
        var21_21 = true;
        block17: while (var21_21) {
            var22_22 = var12_12 /* !! */ ;
            var11_11 = var2_2.m(var3_3);
            switch (var11_11) {
                default: {
                    var2_2 = new UnknownFieldException(var11_11);
                    throw var2_2;
                }
                case 13: {
                    var12_12 /* !! */  = pe3_2.a;
                    var23_23 = var4_4 /* !! */ ;
                    var24_24 = 13;
                    var10_10 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var24_24, (qp0_2)var12_12 /* !! */ , var10_10 /* !! */ );
                    var10_10 /* !! */  = (String)var4_4 /* !! */ ;
                    var20_20 |= 8192;
lbl37:
                    // 11 sources

                    while (true) {
                        var12_12 /* !! */  = var22_22;
lbl39:
                        // 2 sources

                        while (true) {
                            var4_4 /* !! */  = var23_23;
                            continue block17;
                            break;
                        }
                        break;
                    }
                }
                case 12: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = pe3_2.a;
                    var11_11 = 12;
                    var9_9 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var9_9 /* !! */ );
                    var9_9 /* !! */  = (String)var4_4 /* !! */ ;
                    var20_20 |= 4096;
                    ** GOTO lbl37
                }
                case 11: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = pe3_2.a;
                    var11_11 = 11;
                    var6_6 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var6_6 /* !! */ );
                    var6_6 /* !! */  = (String)var4_4 /* !! */ ;
                    var20_20 |= 2048;
                    ** GOTO lbl37
                }
                case 10: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = pe3_2.a;
                    var11_11 = 10;
                    var7_7 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var7_7 /* !! */ );
                    var7_7 /* !! */  = (String)var4_4 /* !! */ ;
                    var20_20 |= 1024;
                    ** GOTO lbl37
                }
                case 9: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = pe3_2.a;
                    var11_11 = 9;
                    var8_8 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var8_8 /* !! */ );
                    var8_8 /* !! */  = (String)var4_4 /* !! */ ;
                    var20_20 |= 512;
                    ** GOTO lbl37
                }
                case 8: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = yi1_2.a;
                    var11_11 = 8;
                    var5_5 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var5_5 /* !! */ );
                    var5_5 /* !! */  = (Integer)var4_4 /* !! */ ;
                    var20_20 |= 256;
                    ** GOTO lbl37
                }
                case 7: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = pe3_2.a;
                    var11_11 = 7;
                    var17_17 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var17_17 /* !! */ );
                    var17_17 /* !! */  = (String)var4_4 /* !! */ ;
                    var20_20 |= 128;
                    ** GOTO lbl37
                }
                case 6: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = pe3_2.a;
                    var11_11 = 6;
                    var16_16 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var16_16 /* !! */ );
                    var16_16 /* !! */  = (String)var4_4 /* !! */ ;
                    var20_20 |= 64;
                    ** GOTO lbl37
                }
                case 5: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = pe3_2.a;
                    var11_11 = 5;
                    var15_15 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var15_15 /* !! */ );
                    var15_15 /* !! */  = (String)var4_4 /* !! */ ;
                    var20_20 |= 32;
                    ** GOTO lbl37
                }
                case 4: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = mb1_2.a;
                    var11_11 = 4;
                    var14_14 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var14_14 /* !! */ );
                    var14_14 /* !! */  = (Long)var4_4 /* !! */ ;
                    var20_20 |= 16;
                    ** GOTO lbl37
                }
                case 3: {
                    var23_23 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = CouponValue$$serializer.INSTANCE;
                    var11_11 = 3;
                    var13_13 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var13_13 /* !! */ );
                    var13_13 /* !! */  = (CouponValue)var4_4 /* !! */ ;
                    var20_20 |= 8;
                    ** continue;
                }
                case 2: {
                    var23_23 = var4_4 /* !! */ ;
                    var24_24 = 2;
                    var12_12 /* !! */  = var4_4 /* !! */ [var24_24];
                    var25_25 = var6_6 /* !! */ ;
                    var6_6 /* !! */  = var22_22;
                    var12_12 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var24_24, (qp0_2)var12_12 /* !! */ , var22_22);
                    var12_12 /* !! */  = (List)var4_4 /* !! */ ;
                    var20_20 |= 4;
lbl131:
                    // 2 sources

                    while (true) {
                        var4_4 /* !! */  = var23_23;
                        var6_6 /* !! */  = var25_25;
                        continue block17;
                        break;
                    }
                }
                case 1: {
                    var23_23 = var4_4 /* !! */ ;
                    var25_25 = var6_6 /* !! */ ;
                    var6_6 /* !! */  = var12_12 /* !! */ ;
                    var4_4 /* !! */  = pe3_2.a;
                    var26_26 = var10_10 /* !! */ ;
                    var10_10 /* !! */  = var19_19 /* !! */ ;
                    var11_11 = 1;
                    var19_19 /* !! */  = var4_4 /* !! */  = var2_2.h(var3_3, var11_11, (qp0_2)var4_4 /* !! */ , var19_19 /* !! */ );
                    var19_19 /* !! */  = (String)var4_4 /* !! */ ;
                    var20_20 |= 2;
                    var10_10 /* !! */  = var26_26;
                    ** continue;
                }
                case 0: {
                    var23_23 = var4_4 /* !! */ ;
                    var25_25 = var6_6 /* !! */ ;
                    var26_26 = var10_10 /* !! */ ;
                    var10_10 /* !! */  = var19_19 /* !! */ ;
                    var6_6 /* !! */  = var12_12 /* !! */ ;
                    var4_4 /* !! */  = mb1_2.a;
                    var11_11 = 0;
                    var27_27 = var18_18 /* !! */ ;
                    var18_18 /* !! */  = var9_9 /* !! */ ;
                    var9_9 /* !! */  = var27_27;
                    var4_4 /* !! */  = (Long)var2_2.h(var3_3, 0, (qp0_2)var4_4 /* !! */ , var27_27);
                    var20_20 |= 1;
                    var10_10 /* !! */  = var26_26;
                    var9_9 /* !! */  = var18_18 /* !! */ ;
                    var6_6 /* !! */  = var25_25;
                    var18_18 /* !! */  = var4_4 /* !! */ ;
                    ** continue;
                }
                case -1: 
            }
            var25_25 = var6_6 /* !! */ ;
            var26_26 = var10_10 /* !! */ ;
            var10_10 /* !! */  = var19_19 /* !! */ ;
            var6_6 /* !! */  = var12_12 /* !! */ ;
            var11_11 = 0;
            var27_27 = var18_18 /* !! */ ;
            var18_18 /* !! */  = var9_9 /* !! */ ;
            var9_9 /* !! */  = var27_27;
            var10_10 /* !! */  = var26_26;
            var6_6 /* !! */  = var25_25;
            var21_21 = false;
            var27_27 = var18_18 /* !! */ ;
            var18_18 /* !! */  = var9_9 /* !! */ ;
            var9_9 /* !! */  = var27_27;
        }
        var25_25 = var6_6 /* !! */ ;
        var26_26 = var10_10 /* !! */ ;
        var6_6 /* !! */  = var12_12 /* !! */ ;
        var10_10 /* !! */  = var19_19 /* !! */ ;
        var27_27 = var18_18 /* !! */ ;
        var18_18 /* !! */  = var9_9 /* !! */ ;
        var9_9 /* !! */  = var27_27;
        var2_2.d(var3_3);
        var3_3 = var8_8 /* !! */ ;
        var8_8 /* !! */  = var2_2;
        var4_4 /* !! */  = var18_18 /* !! */ ;
        var23_23 = var26_26;
        var26_26 = var5_5 /* !! */ ;
        var18_18 /* !! */  = var3_3;
        var19_19 /* !! */  = var7_7 /* !! */ ;
        var22_22 = var4_4 /* !! */ ;
        var2_2 = new Coupon(var20_20, (Long)var27_27, (String)var10_10 /* !! */ , (List)var12_12 /* !! */ , (CouponValue)var13_13 /* !! */ , (Long)var14_14 /* !! */ , (String)var15_15 /* !! */ , (String)var16_16 /* !! */ , (String)var17_17 /* !! */ , (Integer)var5_5 /* !! */ , (String)var3_3, (String)var7_7 /* !! */ , (String)var25_25, (String)var4_4 /* !! */ , (String)var23_23, null);
        return var2_2;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Coupon coupon) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(coupon, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Coupon.write$Self$shared_release(coupon, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

