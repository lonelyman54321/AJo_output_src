/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.kmm.shared.model.home.AudioSettings$$serializer;
import com.ril.ajio.kmm.shared.model.home.Banner;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import com.ril.ajio.kmm.shared.model.home.CTASettings$$serializer;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata$$serializer;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.VideoSetting$$serializer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Banner$$serializer
implements dz0_2 {
    public static final Banner$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Banner$$serializer banner$$serializer;
        INSTANCE = banner$$serializer = new Banner$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.Banner", banner$$serializer, 28);
        boolean bl2 = true;
        hv2_22.j("bannerUrl", bl2);
        hv2_22.j("height", bl2);
        hv2_22.j("hotspots", bl2);
        hv2_22.j("showTimer", bl2);
        hv2_22.j("subComponents", bl2);
        hv2_22.j("timerEndTime", bl2);
        hv2_22.j("width", bl2);
        hv2_22.j("bannerType", bl2);
        hv2_22.j("products", bl2);
        hv2_22.j("dynamicPageMetadata", bl2);
        hv2_22.j("uuid", bl2);
        hv2_22.j("timerType", bl2);
        hv2_22.j("timerLabel", bl2);
        hv2_22.j("thumbnailImage", bl2);
        hv2_22.j("videoSettings", bl2);
        hv2_22.j("audioSettings", bl2);
        hv2_22.j("ctaSettings", bl2);
        hv2_22.j("duration", bl2);
        hv2_22.j("mediaType", bl2);
        hv2_22.j("extendedUrl", bl2);
        hv2_22.j("enableAdsOnPlp", bl2);
        hv2_22.j("widgetLevel", bl2);
        hv2_22.j("feedLogic", bl2);
        hv2_22.j("noOfProducts", bl2);
        hv2_22.j("isAdBanner", bl2);
        hv2_22.j("adSpotId", bl2);
        hv2_22.j("altText", bl2);
        hv2_22.j("showDefault", bl2);
        descriptor = hv2_22;
    }

    private Banner$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        Object object = Banner.access$get$childSerializers$cp();
        KSerializer kSerializer = pe3_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        KSerializer kSerializer3 = os0_2.a;
        KSerializer kSerializer4 = xe_1.p(kSerializer3);
        int n3 = 2;
        KSerializer kSerializer5 = xe_1.p(object[n3]);
        KSerializer kSerializer6 = cz_2.a;
        KSerializer kSerializer7 = xe_1.p(kSerializer6);
        int n4 = 4;
        KSerializer kSerializer8 = xe_1.p(object[n4]);
        KSerializer kSerializer9 = mb1_2.a;
        KSerializer kSerializer10 = xe_1.p(kSerializer9);
        kSerializer3 = xe_1.p(kSerializer3);
        KSerializer kSerializer11 = xe_1.p(kSerializer);
        object = xe_1.p(object[8]);
        KSerializer kSerializer12 = xe_1.p(DynamicPageMetadata$$serializer.INSTANCE);
        KSerializer kSerializer13 = xe_1.p(kSerializer);
        KSerializer kSerializer14 = xe_1.p(kSerializer);
        KSerializer kSerializer15 = xe_1.p(kSerializer);
        KSerializer kSerializer16 = xe_1.p(kSerializer);
        KSerializer kSerializer17 = xe_1.p(VideoSetting$$serializer.INSTANCE);
        KSerializer kSerializer18 = xe_1.p(AudioSettings$$serializer.INSTANCE);
        KSerializer kSerializer19 = xe_1.p(CTASettings$$serializer.INSTANCE);
        kSerializer9 = xe_1.p(kSerializer9);
        KSerializer kSerializer20 = xe_1.p(kSerializer);
        KSerializer kSerializer21 = xe_1.p(kSerializer);
        KSerializer kSerializer22 = xe_1.p(kSerializer6);
        KSerializer kSerializer23 = xe_1.p(kSerializer);
        KSerializer kSerializer24 = xe_1.p(kSerializer);
        KSerializer kSerializer25 = xe_1.p(yi1_2.a);
        KSerializer kSerializer26 = xe_1.p(kSerializer6);
        KSerializer kSerializer27 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        kSerializer6 = xe_1.p(kSerializer6);
        KSerializer[] kSerializerArray = new KSerializer[28];
        kSerializerArray[0] = kSerializer2;
        kSerializerArray[1] = kSerializer4;
        kSerializerArray[n3] = kSerializer5;
        kSerializerArray[3] = kSerializer7;
        kSerializerArray[n4] = kSerializer8;
        kSerializerArray[5] = kSerializer10;
        kSerializerArray[6] = kSerializer3;
        kSerializerArray[7] = kSerializer11;
        kSerializerArray[8] = object;
        kSerializerArray[9] = kSerializer12;
        kSerializerArray[10] = kSerializer13;
        kSerializerArray[11] = kSerializer14;
        kSerializerArray[12] = kSerializer15;
        kSerializerArray[13] = kSerializer16;
        kSerializerArray[14] = kSerializer17;
        kSerializerArray[15] = kSerializer18;
        kSerializerArray[16] = kSerializer19;
        kSerializerArray[17] = kSerializer9;
        kSerializerArray[18] = kSerializer20;
        kSerializerArray[19] = kSerializer21;
        kSerializerArray[20] = kSerializer22;
        kSerializerArray[21] = kSerializer23;
        kSerializerArray[22] = kSerializer24;
        kSerializerArray[23] = kSerializer25;
        kSerializerArray[24] = kSerializer26;
        kSerializerArray[25] = kSerializer27;
        kSerializerArray[26] = kSerializer;
        kSerializerArray[27] = kSerializer6;
        return kSerializerArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Banner deserialize(Decoder var1_1) {
        var2_2 = var1_1;
        Intrinsics.checkNotNullParameter(var1_1, "decoder");
        var3_3 = Banner$$serializer.descriptor;
        var2_2 = var1_1.c((SerialDescriptor)var3_3);
        var4_4 /* !! */  = Banner.access$get$childSerializers$cp();
        var5_5 = 0;
        var6_6 = null;
        var7_7 /* !! */  = var4_4 /* !! */ ;
        var8_8 = null;
        var9_9 = null;
        var10_10 = 0;
        var11_11 = null;
        var12_12 = 0;
        var13_13 = null;
        var14_14 = 0;
        var15_15 = null;
        var16_16 = 0;
        var4_4 /* !! */  = null;
        var17_17 = 0;
        var18_18 = null;
        var19_19 = 0;
        var20_20 = null;
        var21_21 = 0;
        var22_22 = null;
        var23_23 = null;
        var24_24 = null;
        var25_25 = null;
        var26_26 = null;
        var27_27 = null;
        var28_28 = null;
        var29_29 = null;
        var30_30 = null;
        var31_31 = null;
        var32_32 = null;
        var33_33 /* !! */  = null;
        var34_34 = null;
        var35_35 = null;
        var36_36 = null;
        var37_37 = null;
        var38_38 = null;
        var39_39 = null;
        var40_40 = null;
        var41_41 = 0;
        var42_42 = true;
        while (var42_42) {
            var43_43 = var11_11;
            var10_10 = var2_2.m((SerialDescriptor)var3_3);
            block0 : switch (var10_10) {
                default: {
                    var2_2 = new UnknownFieldException(var10_10);
                    throw var2_2;
                }
                case 27: {
                    var11_11 = cz_2.a;
                    var44_44 = var22_22;
                    var21_21 = 27;
                    var9_9 = (Boolean)var2_2.h((SerialDescriptor)var3_3, var21_21, (qp0_2)var11_11, var9_9);
                    var10_10 = 0x8000000;
lbl58:
                    // 2 sources

                    while (true) {
                        var41_41 |= var10_10;
                        var11_11 = Unit.a;
lbl61:
                        // 10 sources

                        while (true) {
                            var45_45 = var27_27;
                            var46_46 = var28_28;
                            var11_11 = var43_43;
                            var21_21 = 0;
                            var22_22 = null;
                            break block0;
                            break;
                        }
                        break;
                    }
                }
                case 26: {
                    var44_44 = var22_22;
                    var11_11 = pe3_2.a;
                    var21_21 = 26;
                    var11_11 = (String)var2_2.h((SerialDescriptor)var3_3, var21_21, (qp0_2)var11_11, var4_4 /* !! */ );
                    var16_16 = 0x4000000;
                    var41_41 |= var16_16;
                    var4_4 /* !! */  = Unit.a;
                    var4_4 /* !! */  = var11_11;
                    ** GOTO lbl61
                }
                case 25: {
                    var44_44 = var22_22;
                    var11_11 = pe3_2.a;
                    var21_21 = 25;
                    var8_8 = (String)var2_2.h((SerialDescriptor)var3_3, var21_21, (qp0_2)var11_11, var8_8);
                    var10_10 = 0x2000000;
                    ** continue;
                }
                case 24: {
                    var44_44 = var22_22;
                    var11_11 = cz_2.a;
                    var21_21 = 24;
                    var11_11 = (Boolean)var2_2.h((SerialDescriptor)var3_3, var21_21, (qp0_2)var11_11, var15_15);
                    var14_14 = 0x1000000;
                    var41_41 |= var14_14;
                    var15_15 = Unit.a;
                    var15_15 = var11_11;
                    ** GOTO lbl61
                }
                case 23: {
                    var44_44 = var22_22;
                    var11_11 = yi1_2.a;
                    var21_21 = 23;
                    var11_11 = (Integer)var2_2.h((SerialDescriptor)var3_3, var21_21, (qp0_2)var11_11, var18_18);
                    var17_17 = 0x800000;
                    var41_41 |= var17_17;
                    var18_18 = Unit.a;
                    var18_18 = var11_11;
                    ** GOTO lbl61
                }
                case 22: {
                    var44_44 = var22_22;
                    var11_11 = pe3_2.a;
                    var21_21 = 22;
                    var11_11 = (String)var2_2.h((SerialDescriptor)var3_3, var21_21, (qp0_2)var11_11, var20_20);
                    var19_19 = 0x400000;
                    var41_41 |= var19_19;
                    var20_20 = Unit.a;
                    var20_20 = var11_11;
                    ** GOTO lbl61
                }
                case 21: {
                    var44_44 = var22_22;
                    var11_11 = pe3_2.a;
                    var21_21 = 21;
                    var11_11 = (String)var2_2.h((SerialDescriptor)var3_3, var21_21, (qp0_2)var11_11, var6_6);
                    var5_5 = 0x200000;
                    var41_41 |= var5_5;
                    var6_6 = Unit.a;
                    var6_6 = var11_11;
                    ** GOTO lbl61
                }
                case 20: {
                    var44_44 = var22_22;
                    var11_11 = cz_2.a;
                    var11_11 = (Boolean)var2_2.h((SerialDescriptor)var3_3, 20, (qp0_2)var11_11, var25_25);
                    var21_21 = 0x100000;
                    var41_41 |= var21_21;
                    var22_22 = Unit.a;
                    var25_25 = var11_11;
                    ** GOTO lbl61
                }
                case 19: {
                    var44_44 = var22_22;
                    var11_11 = pe3_2.a;
                    var11_11 = (String)var2_2.h((SerialDescriptor)var3_3, 19, (qp0_2)var11_11, var24_24);
                    var21_21 = 524288;
                    var41_41 |= var21_21;
                    var22_22 = Unit.a;
                    var24_24 = var11_11;
                    ** GOTO lbl61
                }
                case 18: {
                    var44_44 = var22_22;
                    var11_11 = pe3_2.a;
                    var11_11 = (String)var2_2.h((SerialDescriptor)var3_3, 18, (qp0_2)var11_11, var23_23);
                    var21_21 = 262144;
                    var41_41 |= var21_21;
                    var22_22 = Unit.a;
                    var23_23 = var11_11;
                    ** GOTO lbl61
                }
                case 17: {
                    var44_44 = var22_22;
                    var11_11 = mb1_2.a;
                    var21_21 = 17;
                    var11_11 = (Long)var2_2.h((SerialDescriptor)var3_3, var21_21, (qp0_2)var11_11, var13_13);
                    var12_12 = 131072;
                    var41_41 |= var12_12;
                    var13_13 = Unit.a;
                    var13_13 = var11_11;
                    ** continue;
                }
                case 16: {
                    var44_44 = var22_22;
                    var11_11 = CTASettings$$serializer.INSTANCE;
                    var44_44 = var20_20;
                    var11_11 = (CTASettings)var2_2.h((SerialDescriptor)var3_3, 16, (qp0_2)var11_11, var22_22);
                    var19_19 = 65536;
                    var41_41 |= var19_19;
                    var20_20 = Unit.a;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var20_20 = var44_44;
                    var21_21 = 0;
                    var22_22 = null;
                    var44_44 = var11_11;
                    var11_11 = var43_43;
                    break;
                }
                case 15: {
                    var44_44 = var20_20;
                    var11_11 = AudioSettings$$serializer.INSTANCE;
                    var19_19 = 15;
                    var47_47 = var9_9;
                    var9_9 = var40_40;
                    var9_9 = (AudioSettings)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var40_40);
                    var10_10 = 32768;
                    var41_41 |= var10_10;
                    var11_11 = Unit.a;
                    var40_40 = var9_9;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var11_11 = var43_43;
lbl192:
                    // 2 sources

                    while (true) {
                        var9_9 = var47_47;
                        var44_44 = var22_22;
lbl195:
                        // 3 sources

                        while (true) {
                            var21_21 = 0;
                            var22_22 = null;
                            break block0;
                            break;
                        }
                        break;
                    }
                }
                case 14: {
                    var47_47 = var9_9;
                    var44_44 = var20_20;
                    var9_9 = var40_40;
                    var11_11 = VideoSetting$$serializer.INSTANCE;
                    var19_19 = 14;
                    var48_48 = var4_4 /* !! */ ;
                    var4_4 /* !! */  = var39_39;
                    var11_11 = (VideoSetting)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var39_39);
                    var41_41 |= 16384;
                    var4_4 /* !! */  = Unit.a;
                    var39_39 = var11_11;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var11_11 = var43_43;
lbl214:
                    // 2 sources

                    while (true) {
                        var4_4 /* !! */  = var48_48;
                        ** continue;
                        break;
                    }
                }
                case 13: {
                    var47_47 = var9_9;
                    var48_48 = var4_4 /* !! */ ;
                    var44_44 = var20_20;
                    var4_4 /* !! */  = var39_39;
                    var9_9 = var40_40;
                    var11_11 = pe3_2.a;
                    var19_19 = 13;
                    var49_49 = var8_8;
                    var8_8 = var38_38;
                    var8_8 = (String)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var38_38);
                    var41_41 |= 8192;
                    var11_11 = Unit.a;
                    var38_38 = var8_8;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var11_11 = var43_43;
lbl234:
                    // 2 sources

                    while (true) {
                        var8_8 = var49_49;
                        ** continue;
                        break;
                    }
                }
                case 12: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var48_48 = var4_4 /* !! */ ;
                    var44_44 = var20_20;
                    var8_8 = var38_38;
                    var4_4 /* !! */  = var39_39;
                    var9_9 = var40_40;
                    var11_11 = pe3_2.a;
                    var19_19 = 12;
                    var50_50 = var15_15;
                    var15_15 = var37_37;
                    var11_11 = (String)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var37_37);
                    var41_41 |= 4096;
                    var15_15 = Unit.a;
                    var37_37 = var11_11;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var11_11 = var43_43;
lbl256:
                    // 2 sources

                    while (true) {
                        var15_15 = var50_50;
                        ** continue;
                        break;
                    }
                }
                case 11: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var44_44 = var20_20;
                    var15_15 = var37_37;
                    var8_8 = var38_38;
                    var4_4 /* !! */  = var39_39;
                    var9_9 = var40_40;
                    var11_11 = pe3_2.a;
                    var19_19 = 11;
                    var51_51 = var18_18;
                    var18_18 = var36_36;
                    var11_11 = (String)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var36_36);
                    var41_41 |= 2048;
                    var18_18 = Unit.a;
                    var36_36 = var11_11;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var11_11 = var43_43;
                    var18_18 = var51_51;
                    ** continue;
                }
                case 10: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var18_18 = var36_36;
                    var15_15 = var37_37;
                    var8_8 = var38_38;
                    var4_4 /* !! */  = var39_39;
                    var9_9 = var40_40;
                    var11_11 = pe3_2.a;
                    var19_19 = 10;
                    var36_36 = var6_6;
                    var6_6 = var43_43;
                    var11_11 = (String)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var43_43);
                    var41_41 |= 1024;
                    var6_6 = Unit.a;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
lbl303:
                    // 2 sources

                    while (true) {
                        var20_20 = var44_44;
                        var15_15 = var50_50;
                        var8_8 = var49_49;
                        var4_4 /* !! */  = var48_48;
                        var9_9 = var47_47;
                        var6_6 = var36_36;
                        var36_36 = var18_18;
                        var44_44 = var22_22;
lbl312:
                        // 2 sources

                        while (true) {
                            var18_18 = var51_51;
                            ** GOTO lbl195
                            break;
                        }
                        break;
                    }
                }
                case 9: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var18_18 = var36_36;
                    var15_15 = var37_37;
                    var8_8 = var38_38;
                    var4_4 /* !! */  = var39_39;
                    var9_9 = var40_40;
                    var36_36 = var6_6;
                    var6_6 = var11_11;
                    var11_11 = DynamicPageMetadata$$serializer.INSTANCE;
                    var19_19 = 9;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var11_11 = (DynamicPageMetadata)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var35_35);
                    var41_41 |= 512;
                    var13_13 = Unit.a;
                    var35_35 = var11_11;
                    var11_11 = var6_6;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var13_13 = var43_43;
                    ** continue;
                }
                case 8: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var18_18 = var36_36;
                    var15_15 = var37_37;
                    var8_8 = var38_38;
                    var4_4 /* !! */  = var39_39;
                    var9_9 = var40_40;
                    var10_10 = 8;
                    var36_36 = var6_6;
                    var6_6 = var11_11;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var20_20 = var7_7 /* !! */ [var10_10];
                    var35_35 = var40_40;
                    var9_9 = var34_34;
                    var9_9 = (List)var2_2.h((SerialDescriptor)var3_3, var10_10, (qp0_2)var20_20, var34_34);
                    var41_41 |= 256;
                    var11_11 = Unit.a;
                    var34_34 = var9_9;
                    var11_11 = var6_6;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var20_20 = var44_44;
                    var15_15 = var50_50;
                    var8_8 = var49_49;
                    var4_4 /* !! */  = var48_48;
                    var9_9 = var47_47;
                    var6_6 = var36_36;
                    var35_35 = var13_13;
                    var36_36 = var18_18;
                    var44_44 = var22_22;
                    var13_13 = var43_43;
                    ** continue;
                }
                case 7: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var9_9 = var34_34;
                    var18_18 = var36_36;
                    var15_15 = var37_37;
                    var8_8 = var38_38;
                    var4_4 /* !! */  = var39_39;
                    var36_36 = var6_6;
                    var6_6 = var11_11;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var35_35 = var40_40;
                    var11_11 = pe3_2.a;
                    var19_19 = 7;
                    var34_34 = var39_39;
                    var4_4 /* !! */  = var33_33 /* !! */ ;
                    var11_11 = (String)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var33_33 /* !! */ );
                    var41_41 |= 128;
                    var4_4 /* !! */  = Unit.a;
                    var33_33 /* !! */  = var11_11;
                    var11_11 = var6_6;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var15_15 = var50_50;
                    var8_8 = var49_49;
                    var4_4 /* !! */  = var48_48;
                    var6_6 = var36_36;
                    var34_34 = var9_9;
                    var35_35 = var13_13;
                    var36_36 = var18_18;
                    var44_44 = var22_22;
                    var13_13 = var43_43;
                    var18_18 = var51_51;
lbl418:
                    // 2 sources

                    while (true) {
                        var9_9 = var47_47;
                        ** continue;
                        break;
                    }
                }
                case 6: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var4_4 /* !! */  = var33_33 /* !! */ ;
                    var9_9 = var34_34;
                    var18_18 = var36_36;
                    var15_15 = var37_37;
                    var8_8 = var38_38;
                    var34_34 = var39_39;
                    var36_36 = var6_6;
                    var6_6 = var11_11;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var35_35 = var40_40;
                    var11_11 = os0_2.a;
                    var19_19 = 6;
                    var33_33 /* !! */  = var38_38;
                    var8_8 = var32_32;
                    var8_8 = (Double)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var32_32);
                    var41_41 |= 64;
                    var11_11 = Unit.a;
                    var32_32 = var8_8;
                    var11_11 = var6_6;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var15_15 = var50_50;
                    var8_8 = var49_49;
                    var6_6 = var36_36;
                    var34_34 = var9_9;
                    var35_35 = var13_13;
                    var33_33 /* !! */  = var4_4 /* !! */ ;
                    var36_36 = var18_18;
                    var44_44 = var22_22;
                    var13_13 = var43_43;
                    var18_18 = var51_51;
                    var4_4 /* !! */  = var48_48;
                    ** continue;
                }
                case 5: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var8_8 = var32_32;
                    var4_4 /* !! */  = var33_33 /* !! */ ;
                    var9_9 = var34_34;
                    var18_18 = var36_36;
                    var15_15 = var37_37;
                    var33_33 /* !! */  = var38_38;
                    var34_34 = var39_39;
                    var36_36 = var6_6;
                    var6_6 = var11_11;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var35_35 = var40_40;
                    var11_11 = mb1_2.a;
                    var19_19 = 5;
                    var32_32 = var22_22;
                    var22_22 = var31_31;
                    var11_11 = (Long)var2_2.h((SerialDescriptor)var3_3, var19_19, (qp0_2)var11_11, var31_31);
                    var41_41 |= 32;
                    var20_20 = Unit.a;
                    var31_31 = var11_11;
                    var11_11 = var6_6;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var20_20 = var44_44;
                    var15_15 = var50_50;
                    var6_6 = var36_36;
                    var21_21 = 0;
                    var22_22 = null;
                    var34_34 = var9_9;
                    var35_35 = var13_13;
                    var33_33 /* !! */  = var4_4 /* !! */ ;
                    var36_36 = var18_18;
                    var44_44 = var32_32;
                    var13_13 = var43_43;
                    var18_18 = var51_51;
                    var4_4 /* !! */  = var48_48;
                    var9_9 = var47_47;
lbl506:
                    // 3 sources

                    while (true) {
                        var32_32 = var8_8;
                        var8_8 = var49_49;
                        break block0;
                        break;
                    }
                }
                case 4: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var8_8 = var32_32;
                    var4_4 /* !! */  = var33_33 /* !! */ ;
                    var9_9 = var34_34;
                    var18_18 = var36_36;
                    var15_15 = var37_37;
                    var33_33 /* !! */  = var38_38;
                    var34_34 = var39_39;
                    var10_10 = 4;
                    var36_36 = var6_6;
                    var32_32 = var22_22;
                    var22_22 = var31_31;
                    var6_6 = var11_11;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var35_35 = var40_40;
                    var20_20 = var7_7 /* !! */ [var10_10];
                    var31_31 = var37_37;
                    var15_15 = var30_30;
                    var15_15 = (List)var2_2.h((SerialDescriptor)var3_3, var10_10, (qp0_2)var20_20, var30_30);
                    var10_10 = 16;
                    var41_41 |= var10_10;
                    var20_20 = Unit.a;
                    var30_30 = var15_15;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var20_20 = var44_44;
                    var15_15 = var50_50;
                    var6_6 = var36_36;
                    var34_34 = var9_9;
                    var35_35 = var13_13;
                    var33_33 /* !! */  = var4_4 /* !! */ ;
                    var36_36 = var18_18;
                    var31_31 = var22_22;
                    var44_44 = var32_32;
                    var13_13 = var43_43;
                    var18_18 = var51_51;
lbl553:
                    // 2 sources

                    while (true) {
                        var4_4 /* !! */  = var48_48;
                        var9_9 = var47_47;
                        var21_21 = 0;
                        var22_22 = null;
                        ** GOTO lbl506
                        break;
                    }
                }
                case 3: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var15_15 = var30_30;
                    var8_8 = var32_32;
                    var4_4 /* !! */  = var33_33 /* !! */ ;
                    var9_9 = var34_34;
                    var18_18 = var36_36;
                    var33_33 /* !! */  = var38_38;
                    var34_34 = var39_39;
                    var36_36 = var6_6;
                    var32_32 = var22_22;
                    var22_22 = var31_31;
                    var6_6 = var11_11;
                    var31_31 = var37_37;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var35_35 = var40_40;
                    var20_20 = cz_2.a;
                    var10_10 = 3;
                    var30_30 = var25_25;
                    var25_25 = var29_29;
                    var11_11 = (Boolean)var2_2.h((SerialDescriptor)var3_3, var10_10, (qp0_2)var20_20, var29_29);
                    var19_19 = 8;
                    var41_41 |= var19_19;
                    var25_25 = Unit.a;
                    var29_29 = var11_11;
                    var11_11 = var6_6;
                    var45_45 = var27_27;
                    var46_46 = var28_28;
                    var25_25 = var30_30;
                    var20_20 = var44_44;
                    var6_6 = var36_36;
                    var34_34 = var9_9;
                    var35_35 = var13_13;
                    var30_30 = var15_15;
                    var33_33 /* !! */  = var4_4 /* !! */ ;
                    var36_36 = var18_18;
                    var31_31 = var22_22;
                    var44_44 = var32_32;
                    var13_13 = var43_43;
                    var18_18 = var51_51;
                    var15_15 = var50_50;
                    ** continue;
                }
                case 2: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var15_15 = var30_30;
                    var8_8 = var32_32;
                    var4_4 /* !! */  = var33_33 /* !! */ ;
                    var9_9 = var34_34;
                    var18_18 = var36_36;
                    var33_33 /* !! */  = var38_38;
                    var34_34 = var39_39;
                    var10_10 = 2;
                    var36_36 = var6_6;
                    var32_32 = var22_22;
                    var30_30 = var25_25;
                    var25_25 = var29_29;
                    var22_22 = var31_31;
                    var6_6 = var11_11;
                    var31_31 = var37_37;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var35_35 = var40_40;
                    var20_20 = var7_7 /* !! */ [var10_10];
                    var46_46 = var24_24;
                    var24_24 = var28_28;
                    var20_20 = (List)var2_2.h((SerialDescriptor)var3_3, var10_10, (qp0_2)var20_20, var28_28);
                    var41_41 |= 4;
                    var24_24 = Unit.a;
                    var24_24 = var46_46;
                    var45_45 = var27_27;
                    var25_25 = var30_30;
                    var6_6 = var36_36;
                    var34_34 = var9_9;
                    var35_35 = var13_13;
                    var30_30 = var15_15;
                    var33_33 /* !! */  = var4_4 /* !! */ ;
                    var36_36 = var18_18;
                    var46_46 = var20_20;
                    var31_31 = var22_22;
                    var13_13 = var43_43;
                    var20_20 = var44_44;
                    var18_18 = var51_51;
                    var15_15 = var50_50;
                    var4_4 /* !! */  = var48_48;
                    var9_9 = var47_47;
                    var21_21 = 0;
                    var22_22 = null;
                    var44_44 = var32_32;
                    ** continue;
                }
                case 1: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var46_46 = var24_24;
                    var24_24 = var28_28;
                    var15_15 = var30_30;
                    var8_8 = var32_32;
                    var4_4 /* !! */  = var33_33 /* !! */ ;
                    var9_9 = var34_34;
                    var18_18 = var36_36;
                    var33_33 /* !! */  = var38_38;
                    var34_34 = var39_39;
                    var10_10 = 2;
                    var36_36 = var6_6;
                    var32_32 = var22_22;
                    var30_30 = var25_25;
                    var25_25 = var29_29;
                    var22_22 = var31_31;
                    var6_6 = var11_11;
                    var31_31 = var37_37;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var35_35 = var40_40;
                    var20_20 = os0_2.a;
                    var45_45 = var22_22;
                    var11_11 = var27_27;
                    var11_11 = (Double)var2_2.h((SerialDescriptor)var3_3, 1, (qp0_2)var20_20, var27_27);
                    var19_19 = 2;
                    var41_41 |= var19_19;
                    var27_27 = Unit.a;
                    var25_25 = var30_30;
                    var20_20 = var44_44;
                    var21_21 = 0;
                    var22_22 = null;
                    var34_34 = var9_9;
                    var35_35 = var13_13;
                    var30_30 = var15_15;
                    var33_33 /* !! */  = var4_4 /* !! */ ;
                    var31_31 = var45_45;
                    var44_44 = var32_32;
                    var13_13 = var43_43;
                    var15_15 = var50_50;
                    var4_4 /* !! */  = var48_48;
                    var9_9 = var47_47;
                    var32_32 = var8_8;
                    var45_45 = var11_11;
                    var11_11 = var6_6;
                    var8_8 = var49_49;
                    var6_6 = var36_36;
                    var36_36 = var18_18;
                    var18_18 = var51_51;
lbl714:
                    // 2 sources

                    while (true) {
                        var52_52 = var46_46;
                        var46_46 = var24_24;
                        var24_24 = var52_52;
                        break block0;
                        break;
                    }
                }
                case 0: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var46_46 = var24_24;
                    var11_11 = var27_27;
                    var24_24 = var28_28;
                    var15_15 = var30_30;
                    var45_45 = var31_31;
                    var8_8 = var32_32;
                    var4_4 /* !! */  = var33_33 /* !! */ ;
                    var9_9 = var34_34;
                    var18_18 = var36_36;
                    var31_31 = var37_37;
                    var33_33 /* !! */  = var38_38;
                    var34_34 = var39_39;
                    var36_36 = var6_6;
                    var32_32 = var22_22;
                    var30_30 = var25_25;
                    var25_25 = var29_29;
                    var6_6 = var43_43;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var35_35 = var40_40;
                    var20_20 = pe3_2.a;
                    var21_21 = 0;
                    var22_22 = null;
                    var52_52 = var26_26;
                    var26_26 = var23_23;
                    var23_23 = var52_52;
                    var20_20 = (String)var2_2.h((SerialDescriptor)var3_3, 0, (qp0_2)var20_20, var52_52);
                    var41_41 |= 1;
                    var23_23 = Unit.a;
                    var23_23 = var26_26;
                    var25_25 = var30_30;
                    var34_34 = var9_9;
                    var35_35 = var13_13;
                    var30_30 = var15_15;
                    var33_33 /* !! */  = var4_4 /* !! */ ;
                    var26_26 = var20_20;
                    var31_31 = var45_45;
                    var13_13 = var43_43;
                    var20_20 = var44_44;
                    var15_15 = var50_50;
                    var4_4 /* !! */  = var48_48;
                    var9_9 = var47_47;
                    var45_45 = var27_27;
                    var11_11 = var6_6;
                    var44_44 = var32_32;
                    var6_6 = var36_36;
                    var32_32 = var8_8;
                    var36_36 = var18_18;
                    var18_18 = var51_51;
                    var8_8 = var49_49;
                    ** continue;
                }
                case -1: {
                    var49_49 = var8_8;
                    var47_47 = var9_9;
                    var50_50 = var15_15;
                    var48_48 = var4_4 /* !! */ ;
                    var51_51 = var18_18;
                    var44_44 = var20_20;
                    var46_46 = var24_24;
                    var11_11 = var27_27;
                    var24_24 = var28_28;
                    var15_15 = var30_30;
                    var45_45 = var31_31;
                    var8_8 = var32_32;
                    var4_4 /* !! */  = var33_33 /* !! */ ;
                    var9_9 = var34_34;
                    var18_18 = var36_36;
                    var31_31 = var37_37;
                    var33_33 /* !! */  = var38_38;
                    var34_34 = var39_39;
                    var36_36 = var6_6;
                    var32_32 = var22_22;
                    var30_30 = var25_25;
                    var25_25 = var29_29;
                    var6_6 = var43_43;
                    var21_21 = 0;
                    var22_22 = null;
                    var43_43 = var13_13;
                    var13_13 = var35_35;
                    var35_35 = var40_40;
                    var52_52 = var26_26;
                    var26_26 = var23_23;
                    var23_23 = var52_52;
                    var20_20 = Unit.a;
                    var25_25 = var30_30;
                    var20_20 = var44_44;
                    var42_42 = false;
                    var53_53 = null;
                    var34_34 = var9_9;
                    var35_35 = var13_13;
                    var30_30 = var15_15;
                    var33_33 /* !! */  = var4_4 /* !! */ ;
                    var31_31 = var45_45;
                    var44_44 = var32_32;
                    var13_13 = var43_43;
                    var15_15 = var50_50;
                    var4_4 /* !! */  = var48_48;
                    var9_9 = var47_47;
                    var32_32 = var8_8;
                    var45_45 = var27_27;
                    var11_11 = var6_6;
                    var8_8 = var49_49;
                    var6_6 = var36_36;
                    var36_36 = var18_18;
                    var18_18 = var51_51;
                    var52_52 = var26_26;
                    var26_26 = var23_23;
                    var23_23 = var52_52;
                    var54_54 = var46_46;
                    var46_46 = var28_28;
                    var24_24 = var54_54;
                }
            }
            var27_27 = var45_45;
            var28_28 = var46_46;
            var22_22 = var44_44;
        }
        var49_49 = var8_8;
        var47_47 = var9_9;
        var43_43 = var13_13;
        var50_50 = var15_15;
        var48_48 = var4_4 /* !! */ ;
        var51_51 = var18_18;
        var44_44 = var20_20;
        var46_46 = var24_24;
        var24_24 = var28_28;
        var15_15 = var30_30;
        var45_45 = var31_31;
        var8_8 = var32_32;
        var4_4 /* !! */  = var33_33 /* !! */ ;
        var9_9 = var34_34;
        var13_13 = var35_35;
        var18_18 = var36_36;
        var31_31 = var37_37;
        var33_33 /* !! */  = var38_38;
        var34_34 = var39_39;
        var35_35 = var40_40;
        var36_36 = var6_6;
        var32_32 = var22_22;
        var30_30 = var25_25;
        var25_25 = var29_29;
        var6_6 = var11_11;
        var11_11 = var27_27;
        var52_52 = var26_26;
        var26_26 = var23_23;
        var23_23 = var52_52;
        var2_2.d((SerialDescriptor)var3_3);
        var3_3 = var45_45;
        var20_20 = var2_2;
        var7_7 /* !! */  = var22_22;
        var22_22 = var52_52;
        var53_53 = var26_26;
        var23_23 = var27_27;
        var11_11 = var46_46;
        var37_37 = var30_30;
        var45_45 = var15_15;
        var46_46 = var3_3;
        var26_26 = var9_9;
        var27_27 = var6_6;
        var28_28 = var18_18;
        var29_29 = var31_31;
        var30_30 = var38_38;
        var31_31 = var39_39;
        var32_32 = var40_40;
        var33_33 /* !! */  = var7_7 /* !! */ ;
        var34_34 = var43_43;
        var7_7 /* !! */  = var53_53;
        var35_35 = var11_11;
        var53_53 = var37_37;
        var43_43 = var36_36;
        var2_2 = new Banner(var41_41, (String)var52_52, (Double)var23_23, (List)var24_24, (Boolean)var25_25, (List)var15_15, (Long)var3_3, (Double)var8_8, (String)var4_4 /* !! */ , (List)var9_9, (DynamicPageMetadata)var13_13, (String)var6_6, (String)var18_18, (String)var29_29, var38_38, (VideoSetting)var39_39, (AudioSettings)var40_40, (CTASettings)var33_33 /* !! */ , (Long)var34_34, (String)var7_7 /* !! */ , (String)var11_11, (Boolean)var37_37, (String)var36_36, (String)var44_44, (Integer)var51_51, (Boolean)var50_50, var49_49, (String)var48_48, var47_47, null);
        return var2_2;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Banner banner) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(banner, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Banner.write$Self$shared_release(banner, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

