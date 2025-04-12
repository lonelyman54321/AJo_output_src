/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipDescription
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.os.Parcel
 *  android.text.Annotation
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.util.Base64
 */
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pf
 */
public final class pf_0
implements SV {
    public final ClipboardManager a;

    public pf_0(Context object) {
        object = object.getSystemService("clipboard");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.content.ClipboardManager");
        object = (ClipboardManager)object;
        this.a = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Sl var1_1) {
        var2_2 = var1_1.b();
        var3_3 = var2_2.isEmpty();
        var4_4 = var1_1;
        var5_5 = var1_1.a;
        if (!var3_3) {
            var2_2 = new SpannableString((CharSequence)var5_5);
            var5_5 = new Object();
            var5_5.a = var6_6 = Parcel.obtain();
            var4_4 = var1_1.b();
            var7_7 = var4_4.size();
            for (var8_8 = 0; var8_8 < var7_7; ++var8_8) {
                var9_9 = (Sl$b)var4_4.get(var8_8);
                var10_10 = (S93)var9_9.a;
                var5_5.a.recycle();
                var11_11 = Parcel.obtain();
                var5_5.a = var11_11;
                var11_11 = var10_10.a;
                var12_12 = var11_11.a();
                var14_13 = OX.l;
                var16_14 = OX.c(var12_12, var14_13);
                var17_15 = 1;
                var18_16 = 1.4E-45f;
                if (var16_14 == 0) {
                    var5_5.a((byte)var17_15);
                    var19_17 = var10_10.a.a();
                    var11_11 = var5_5.a;
                    var11_11.writeLong(var19_17);
                }
                var19_17 = Dm3.c;
                var21_18 = var10_10.b;
                var16_14 = Dm3.a(var21_18, var19_17);
                var17_15 = 2;
                var18_16 = 2.8E-45f;
                if (var16_14 == 0) {
                    var5_5.a((byte)var17_15);
                    var5_5.c(var21_18);
                }
                var16_14 = 3;
                var23_19 = 4.2E-45f;
                var24_20 = var10_10.c;
                if (var24_20 != null) {
                    var5_5.a((byte)var16_14);
                    var25_21 = var5_5.a;
                    var26_22 = var24_20.a;
                    var25_21.writeInt(var26_22);
                }
                if ((var24_20 = var10_10.d) != null) {
                    var5_5.a((byte)4);
                    var26_22 = var24_20.a;
                    var27_23 = nV0.a(var26_22, 0);
                    if (var27_23 != 0) {
                        while (true) {
                            var27_23 = 0;
                            var25_21 = null;
                            break;
                        }
                    } else {
                        if ((var26_22 = (int)nV0.a(var26_22, var27_23 = 1)) == 0) ** continue;
                        var27_23 = 1;
                    }
                    var5_5.a(var27_23);
                }
                if ((var24_20 = var10_10.e) != null) {
                    var5_5.a((byte)5);
                    var26_22 = var24_20.a;
                    var27_23 = oV0.a(var26_22, 0);
                    if (var27_23 != 0) {
                        while (true) {
                            var17_15 = 0;
                            var18_16 = 0.0f;
                            var28_24 /* !! */  = null;
                            break;
                        }
                    } else {
                        var27_23 = 1;
                        var29_25 = oV0.a(var26_22, var27_23);
                        if (var29_25) {
                            var17_15 = 1;
                            var18_16 = 1.4E-45f;
                        } else {
                            var27_23 = (byte)oV0.a(var26_22, var17_15);
                            if (var27_23 == 0) {
                                if ((var17_15 = (int)oV0.a(var26_22, var16_14)) == 0) ** continue;
                                var17_15 = 3;
                                var18_16 = 4.2E-45f;
                            }
                        }
                    }
                    var5_5.a((byte)var17_15);
                }
                if ((var11_11 = var10_10.g) != null) {
                    var17_15 = 6;
                    var18_16 = 8.4E-45f;
                    var5_5.a((byte)var17_15);
                    var28_24 /* !! */  = var5_5.a;
                    var28_24 /* !! */ .writeString((String)var11_11);
                }
                if ((var30_26 = Dm3.a(var12_12 = var10_10.h, var19_17)) == 0) {
                    var30_26 = 7;
                    var5_5.a(var30_26);
                    var5_5.c(var12_12);
                }
                if ((var11_11 = var10_10.i) != null) {
                    var17_15 = 8;
                    var18_16 = 1.1E-44f;
                    var5_5.a((byte)var17_15);
                    var23_19 = var11_11.a;
                    var5_5.b(var23_19);
                }
                if ((var11_11 = var10_10.j) != null) {
                    var17_15 = 9;
                    var5_5.a((byte)var17_15);
                    var18_16 = var11_11.a;
                    var5_5.b(var18_16);
                    var23_19 = var11_11.b;
                    var5_5.b(var23_19);
                }
                if ((var31_27 = OX.c(var12_12 = var10_10.l, var14_13)) == 0) {
                    var31_27 = 10;
                    var32_28 = 1.4E-44f;
                    var5_5.a(var31_27);
                    var33_29 = var5_5.a;
                    var33_29.writeLong(var12_12);
                }
                if ((var11_11 = var10_10.m) != null) {
                    var17_15 = 11;
                    var18_16 = 1.5E-44f;
                    var5_5.a((byte)var17_15);
                    var28_24 /* !! */  = var5_5.a;
                    var16_14 = var11_11.a;
                    var28_24 /* !! */ .writeInt(var16_14);
                }
                if ((var10_10 = var10_10.n) != null) {
                    var16_14 = 12;
                    var5_5.a((byte)var16_14);
                    var11_11 = var5_5.a;
                    var34_30 = var10_10.a;
                    var11_11.writeLong(var34_30);
                    var12_12 = var10_10.b;
                    var32_28 = e72.d(var12_12);
                    var5_5.b(var32_28);
                    var23_19 = e72.e(var12_12);
                    var5_5.b(var23_19);
                    var36_31 = var10_10.c;
                    var5_5.b(var36_31);
                }
                var11_11 = Base64.encodeToString((byte[])var5_5.a.marshall(), (int)0);
                var28_24 /* !! */  = "androidx.compose.text.SpanStyle";
                var10_10 = new Annotation((String)var28_24 /* !! */ , (String)var11_11);
                var16_14 = var9_9.c;
                var17_15 = 33;
                var18_16 = 4.6E-44f;
                var37_32 = var9_9.b;
                var2_2.setSpan(var10_10, var37_32, var16_14, var17_15);
            }
            var5_5 = var2_2;
        }
        var2_2 = ClipData.newPlainText((CharSequence)"plain text", (CharSequence)var5_5);
        var4_4 = this;
        this.a.setPrimaryClip((ClipData)var2_2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Sl b() {
        block32: {
            block31: {
                block34: {
                    block33: {
                        var1_1 = 0;
                        var2_2 = 0.0f;
                        var3_3 = null;
                        var4_4 = 2;
                        var5_5 = 2.8E-45f;
                        var6_6 = 1;
                        var7_7 = this.a.getPrimaryClip();
                        var8_8 = null;
                        if (var7_7 == null || (var9_9 = var7_7.getItemCount()) <= 0) break block31;
                        if ((var7_7 = (var7_7 = var7_7.getItemAt(0)) != null ? var7_7.getText() : null) == null) break block32;
                        var9_9 = var7_7 instanceof Spanned;
                        var10_10 = 6;
                        var11_11 = 8.4E-45f;
                        if (var9_9 != 0) break block33;
                        var12_12 = var7_7.toString();
                        var8_8 = var3_3 = new Sl(var10_10, var12_12, null);
                        break block32;
                    }
                    var13_14 = var7_7;
                    var13_14 = (Spanned)var7_7;
                    var14_15 = var7_7.length();
                    var15_16 = (Annotation[])var13_14.getSpans(0, var14_15, Annotation.class);
                    var16_17 = new ArrayList<Sl$b>();
                    var17_18 = tp_2.C(var15_16);
                    var18_19 = 4;
                    if (var17_18 < 0) break block34;
                    var19_20 = 0;
                    while (true) {
                        block35: {
                            if ((var23_24 = Intrinsics.areEqual(var21_22 = (var20_21 = var15_16[var19_20]).getKey(), var22_23 = "androidx.compose.text.SpanStyle")) == 0) break block35;
                            var23_24 = var13_14.getSpanStart(var20_21);
                            var24_25 = var13_14.getSpanEnd(var20_21);
                            var20_21 = var20_21.getValue();
                            var8_8 = new Zi0((String)var20_21);
                            var25_26 = OX.l;
                            var27_27 = Dm3.c;
                            var29_28 = var25_26;
                            var31_29 = var25_26;
                            var33_30 = var27_27;
                            var35_31 = var27_27;
                            var37_32 = null;
                            var38_33 = null;
                            var39_34 = null;
                            var40_35 = null;
                            var41_36 = null;
                            var42_37 = null;
                            var43_38 /* !! */  = null;
                            var44_39 = null;
                            block1: while ((var1_1 = (var20_21 = var8_8.a).dataAvail()) > var6_6) {
                                block41: {
                                    block40: {
                                        block39: {
                                            block38: {
                                                block37: {
                                                    block36: {
                                                        var1_1 = var20_21.readByte();
                                                        var10_10 = 8;
                                                        var11_11 = 1.1E-44f;
                                                        if (var1_1 == var6_6) {
                                                            var1_1 = var20_21.dataAvail();
                                                            if (var1_1 < var10_10) break;
                                                            var29_28 = var20_21.readLong();
                                                            var3_3 = mt3_0.b;
                                                            var1_1 = OX.m;
lbl58:
                                                            // 2 sources

                                                            while (true) {
                                                                var1_1 = 0;
                                                                var2_2 = 0.0f;
                                                                var3_3 = null;
lbl62:
                                                                // 2 sources

                                                                while (true) {
                                                                    var10_10 = 6;
                                                                    var11_11 = 8.4E-45f;
                                                                    continue block1;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        var10_10 = 5;
                                                        var11_11 = 7.0E-45f;
                                                        if (var1_1 == var4_4) {
                                                            var1_1 = var20_21.dataAvail();
                                                            if (var1_1 < var10_10) break;
                                                            var33_30 = var8_8.a();
                                                            ** continue;
                                                        }
                                                        var4_4 = 3;
                                                        var5_5 = 4.2E-45f;
                                                        if (var1_1 == var4_4) {
                                                            var1_1 = var20_21.dataAvail();
                                                            if (var1_1 < var18_19) break;
                                                            var4_4 = var20_21.readInt();
                                                            var3_3 = new tv0_0(var4_4);
                                                            var37_32 = var3_3;
lbl81:
                                                            // 8 sources

                                                            while (true) {
                                                                var1_1 = 0;
                                                                var2_2 = 0.0f;
                                                                var3_3 = null;
                                                                var4_4 = 2;
                                                                var5_5 = 2.8E-45f;
                                                                ** continue;
                                                                break;
                                                            }
                                                        }
                                                        if (var1_1 != var18_19) break block36;
                                                        var1_1 = var20_21.dataAvail();
                                                        if (var1_1 < var6_6) break;
                                                        var1_1 = var20_21.readByte();
                                                        if (var1_1 == 0) {
                                                            while (true) {
                                                                var1_1 = 0;
                                                                var2_2 = 0.0f;
                                                                var3_3 = null;
                                                                break;
                                                            }
                                                        } else {
                                                            if (var1_1 != var6_6) ** continue;
                                                            var1_1 = 1;
                                                            var2_2 = 1.4E-45f;
                                                        }
                                                        var38_33 = var12_13 = new nV0(var1_1);
                                                        ** GOTO lbl81
                                                    }
                                                    if (var1_1 != var10_10) break block37;
                                                    var1_1 = var20_21.dataAvail();
                                                    if (var1_1 < var6_6) break;
                                                    var1_1 = var20_21.readByte();
                                                    if (var1_1 == 0) {
                                                        while (true) {
                                                            var4_4 = 0;
                                                            var5_5 = 0.0f;
                                                            var12_13 = null;
                                                            break;
                                                        }
                                                    } else if (var1_1 == var6_6) {
                                                        var4_4 = 1;
                                                        var5_5 = 1.4E-45f;
                                                    } else if (var1_1 != var4_4) {
                                                        var4_4 = 2;
                                                        var5_5 = 2.8E-45f;
                                                        if (var1_1 != var4_4) ** continue;
                                                        var4_4 = 2;
                                                        var5_5 = 2.8E-45f;
                                                    }
                                                    var3_3 = new oV0(var4_4);
                                                    var39_34 = var3_3;
                                                    ** GOTO lbl81
                                                }
                                                var4_4 = 6;
                                                var5_5 = 8.4E-45f;
                                                if (var1_1 != var4_4) break block38;
                                                var40_35 = var20_21.readString();
                                                ** GOTO lbl81
                                            }
                                            var4_4 = 7;
                                            var5_5 = 9.8E-45f;
                                            if (var1_1 != var4_4) break block39;
                                            var1_1 = var20_21.dataAvail();
                                            if (var1_1 < var10_10) break;
                                            var35_31 = var8_8.a();
                                            ** GOTO lbl81
                                        }
                                        var4_4 = 8;
                                        var5_5 = 1.1E-44f;
                                        if (var1_1 != var4_4) break block40;
                                        var1_1 = var20_21.dataAvail();
                                        if (var1_1 < var18_19) break;
                                        var2_2 = var20_21.readFloat();
                                        var41_36 = var12_13 = new Rw(var2_2);
                                        ** GOTO lbl81
                                    }
                                    var4_4 = 9;
                                    var5_5 = 1.3E-44f;
                                    if (var1_1 != var4_4) break block41;
                                    var1_1 = var20_21.dataAvail();
                                    var4_4 = 8;
                                    var5_5 = 1.1E-44f;
                                    if (var1_1 < var4_4) break;
                                    var5_5 = var20_21.readFloat();
                                    var11_11 = var20_21.readFloat();
                                    var3_3 = new tl3_0(var5_5, var11_11);
                                    var42_37 = var3_3;
                                    ** GOTO lbl81
                                }
                                var4_4 = 10;
                                var5_5 = 1.4E-44f;
                                if (var1_1 == var4_4) {
                                    var1_1 = var20_21.dataAvail();
                                    var4_4 = 8;
                                    var5_5 = 1.1E-44f;
                                    if (var1_1 < var4_4) break;
                                    var31_29 = var20_21.readLong();
                                    var3_3 = mt3_0.b;
                                    var1_1 = OX.m;
                                    ** continue;
                                }
                                var4_4 = 11;
                                var5_5 = 1.5E-44f;
                                if (var1_1 == var4_4) {
                                    var1_1 = var20_21.dataAvail();
                                    if (var1_1 < var18_19) break;
                                    var1_1 = var20_21.readInt();
                                    var4_4 = 2;
                                    var5_5 = 2.8E-45f;
                                    var10_10 = var1_1 & 2;
                                    if (var10_10 != 0) {
                                        var4_4 = 1;
                                        var5_5 = 1.4E-45f;
                                    } else {
                                        var4_4 = 0;
                                        var5_5 = 0.0f;
                                        var12_13 = null;
                                    }
                                    if ((var1_1 &= var6_6) != 0) {
                                        var1_1 = 1;
                                        var2_2 = 1.4E-45f;
                                    } else {
                                        var1_1 = 0;
                                        var2_2 = 0.0f;
                                        var3_3 = null;
                                    }
                                    var45_40 = Jj3.d;
                                    var20_21 = Jj3.c;
                                    if (var4_4 != 0 && var1_1 != 0) {
                                        var18_19 = 2;
                                        var3_3 = new Jj3[var18_19];
                                        var3_3[0] = var45_40;
                                        var3_3[var6_6] = var20_21;
                                        var3_3 = xx_2.i((Object[])var3_3);
                                        var12_13 = 0;
                                        var10_10 = var3_3.size();
                                        var20_21 = null;
                                        for (var46_41 = 0; var46_41 < var10_10; var46_41 += var6_6) {
                                            var48_43 /* !! */  = var47_42 = var3_3.get(var46_41);
                                            var48_43 /* !! */  = (Jj3)var47_42;
                                            var4_4 = var12_13.intValue();
                                            var18_19 = var48_43 /* !! */ .a;
                                            var12_13 = var4_4 |= var18_19;
                                            var18_19 = 2;
                                        }
                                        var1_1 = var12_13.intValue();
                                        var12_13 = new Jj3(var1_1);
                                        var43_38 /* !! */  = var12_13;
                                    } else if (var4_4 != 0) {
                                        var43_38 /* !! */  = var45_40;
                                    } else if (var1_1 != 0) {
                                        var43_38 /* !! */  = var20_21;
                                    } else {
                                        var3_3 = Jj3.b;
                                        var43_38 /* !! */  = var3_3;
                                    }
lbl229:
                                    // 6 sources

                                    while (true) {
                                        var1_1 = 0;
                                        var2_2 = 0.0f;
                                        var3_3 = null;
                                        var4_4 = 2;
                                        var5_5 = 2.8E-45f;
                                        var10_10 = 6;
                                        var11_11 = 8.4E-45f;
                                        var18_19 = 4;
                                        continue block1;
                                        break;
                                    }
                                }
                                var4_4 = 12;
                                var5_5 = 1.7E-44f;
                                if (var1_1 != var4_4) ** GOTO lbl229
                                var1_1 = var20_21.dataAvail();
                                var4_4 = 20;
                                var5_5 = 2.8E-44f;
                                if (var1_1 < var4_4) break;
                                var49_44 = var20_21.readLong();
                                var3_3 = mt3_0.b;
                                var1_1 = OX.m;
                                var2_2 = var20_21.readFloat();
                                var5_5 = var20_21.readFloat();
                                var51_45 = h72.a(var2_2, var5_5);
                                var53_46 = var20_21.readFloat();
                                var44_39 = new b13_0(var49_44, var51_45, var53_46);
                                ** continue;
                            }
                            var54_47 = 49152;
                            var3_3 = new S93(var29_28, var33_30, (tv0_0)var37_32, (nV0)var38_33, (oV0)var39_34, null, var40_35, var35_31, (Rw)var41_36, (tl3_0)var42_37, null, var31_29, (Jj3)var43_38 /* !! */ , var44_39, var54_47);
                            var12_13 = new Sl$b(var23_24, var24_25, var3_3);
                            var16_17.add((Sl$b)var12_13);
                        }
                        if (var19_20 == var17_18) break;
                        var19_20 += var6_6;
                        var1_1 = 0;
                        var2_2 = 0.0f;
                        var3_3 = null;
                        var4_4 = 2;
                        var5_5 = 2.8E-45f;
                        var8_8 = null;
                        var10_10 = 6;
                        var11_11 = 8.4E-45f;
                        var18_19 = 4;
                    }
                }
                var3_3 = var7_7.toString();
                var4_4 = 4;
                var5_5 = 5.6E-45f;
                var8_8 = new Sl(var4_4, (String)var3_3, var16_17);
                break block32;
            }
            var8_8 = null;
        }
        return var8_8;
    }

    public final boolean c() {
        boolean bl2;
        ClipDescription clipDescription = this.a.getPrimaryClipDescription();
        if (clipDescription != null) {
            String string2 = "text/*";
            bl2 = clipDescription.hasMimeType(string2);
        } else {
            bl2 = false;
            clipDescription = null;
        }
        return bl2;
    }
}

