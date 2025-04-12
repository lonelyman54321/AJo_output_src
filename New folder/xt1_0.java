/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 */
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Xt1
 */
public final class xt1_0
implements ut2 {
    public final View a;
    public final Qh1 b;
    public Function1 c;
    public Function1 d;
    public Vt1 e;
    public Sk3 f;
    public NC3 g;
    public ql3_0 h;
    public Se1 i;
    public final ArrayList j;
    public final rq1_2 k;
    public Rect l;
    public final Nt1 m;

    public xt1_0(View object, Th$a$b th$a$b, Sh1 sh1) {
        this.a = object;
        this.b = sh1;
        object = yt1_1.c;
        this.c = object;
        object = zt1_0.d;
        this.d = object;
        long l2 = mm3.b;
        super("", l2, 4);
        this.h = object;
        object = Se1.g;
        this.i = object;
        super();
        this.j = object;
        object = et1_2.NONE;
        wt1_1 wt1_12 = new wt1_1(this);
        object = yr1_2.a((et1_2)((Object)object), wt1_12);
        this.k = object;
        super(th$a$b, sh1);
        this.m = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final XF2 a(EditorInfo var1_1) {
        block39: {
            block46: {
                block30: {
                    block45: {
                        block44: {
                            block43: {
                                block42: {
                                    block41: {
                                        block40: {
                                            block32: {
                                                block38: {
                                                    block37: {
                                                        block36: {
                                                            block35: {
                                                                block34: {
                                                                    block33: {
                                                                        block31: {
                                                                            var2_2 = this;
                                                                            var3_3 /* !! */  = var1_1;
                                                                            var4_4 = 1;
                                                                            var5_5 = this.h;
                                                                            var6_6 = var5_5.a.a;
                                                                            var7_7 = this.i;
                                                                            var8_8 = var7_7.e;
                                                                            var9_9 = Qe1.a(var8_8, var4_4);
                                                                            var10_10 = 4;
                                                                            var11_11 = 5;
                                                                            var12_12 = 0;
                                                                            var13_13 = 7;
                                                                            var14_14 = 6;
                                                                            var15_15 = 3;
                                                                            var16_16 = 2;
                                                                            var17_17 = var7_7.a;
                                                                            if (var9_9 == 0) break block31;
                                                                            if (var17_17) lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                while (true) {
                                                                                    var8_8 = 6;
                                                                                    ** GOTO lbl59
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                var8_8 = 0;
                                                                                var18_18 = null;
                                                                            }
                                                                            break block32;
                                                                        }
                                                                        var9_9 = Qe1.a(var8_8, 0);
                                                                        if (var9_9 == 0) break block33;
                                                                        var8_8 = 1;
                                                                        break block32;
                                                                    }
                                                                    var9_9 = Qe1.a(var8_8, var16_16);
                                                                    if (var9_9 == 0) break block34;
                                                                    var8_8 = 2;
                                                                    break block32;
                                                                }
                                                                var9_9 = (int)Qe1.a(var8_8, var14_14);
                                                                if (var9_9 == 0) break block35;
                                                                var8_8 = 5;
                                                                break block32;
                                                            }
                                                            var9_9 = (int)Qe1.a(var8_8, var11_11);
                                                            if (var9_9 == 0) break block36;
                                                            var8_8 = 7;
                                                            break block32;
                                                        }
                                                        var9_9 = (int)Qe1.a(var8_8, var15_15);
                                                        if (var9_9 == 0) break block37;
                                                        var8_8 = 3;
                                                        break block32;
                                                    }
                                                    var9_9 = (int)Qe1.a(var8_8, var10_10);
                                                    if (var9_9 == 0) break block38;
                                                    var8_8 = 4;
                                                    break block32;
                                                }
                                                if ((var8_8 = (int)Qe1.a(var8_8, var13_13)) != 0) {
                                                    ** continue;
                                                }
                                                break block39;
                                            }
                                            var3_3 /* !! */ .imeOptions = var8_8;
                                            var8_8 = Build.VERSION.SDK_INT;
                                            var9_9 = 24;
                                            if (var8_8 >= var9_9) {
                                                var18_18 = lw1.a;
                                                var19_19 = var7_7.f;
                                                var18_18.a(var3_3 /* !! */ , (iw1)var19_19);
                                            }
                                            var8_8 = var7_7.d;
                                            var9_9 = (int)zo1_0.a(var8_8, var4_4);
                                            var12_12 = 8;
                                            if (var9_9 != 0) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    var9_9 = 1;
                                                    break block30;
                                                    break;
                                                }
                                            }
                                            var9_9 = (int)zo1_0.a(var8_8, var16_16);
                                            if (var9_9 != 0) {
                                                var9_9 = var3_3 /* !! */ .imeOptions;
                                                var10_10 = -1 << -1;
                                                var3_3 /* !! */ .imeOptions = var9_9 |= var10_10;
                                                ** continue;
                                            }
                                            var9_9 = (int)zo1_0.a(var8_8, var15_15);
                                            if (var9_9 == 0) break block40;
                                            var9_9 = 2;
                                            break block30;
                                        }
                                        var9_9 = (int)zo1_0.a(var8_8, var10_10);
                                        if (var9_9 == 0) break block41;
                                        var9_9 = 3;
                                        break block30;
                                    }
                                    var9_9 = (int)zo1_0.a(var8_8, var11_11);
                                    if (var9_9 == 0) break block42;
                                    var9_9 = 17;
                                    break block30;
                                }
                                var9_9 = (int)zo1_0.a(var8_8, var14_14);
                                if (var9_9 == 0) break block43;
                                var9_9 = 33;
                                break block30;
                            }
                            var9_9 = (int)zo1_0.a(var8_8, var13_13);
                            if (var9_9 == 0) break block44;
                            var9_9 = 129;
                            break block30;
                        }
                        var9_9 = (int)zo1_0.a(var8_8, var12_12);
                        if (var9_9 == 0) break block45;
                        var9_9 = 18;
                        break block30;
                    }
                    var9_9 = (int)zo1_0.a(var8_8, 9);
                    if (var9_9 == 0) break block46;
                    var9_9 = 8194;
                }
                var3_3 /* !! */ .inputType = var9_9;
                if (!var17_17 && (var10_10 = var9_9 & 1) == var4_4) {
                    var10_10 = 131072;
                    var3_3 /* !! */ .inputType = var9_9 |= var10_10;
                    var9_9 = (int)Qe1.a(var7_7.e, var4_4);
                    if (var9_9 != 0) {
                        var9_9 = var3_3 /* !! */ .imeOptions;
                        var10_10 = 0x40000000;
                        var3_3 /* !! */ .imeOptions = var9_9 |= var10_10;
                    }
                }
                if ((var9_9 = var3_3 /* !! */ .inputType & var4_4) == var4_4) {
                    var9_9 = var7_7.b;
                    var10_10 = (int)xo1_1.a(var9_9, var4_4);
                    if (var10_10 != 0) {
                        var3_3 /* !! */ .inputType = var9_9 = var3_3 /* !! */ .inputType | 4096;
                    } else {
                        var10_10 = (int)xo1_1.a(var9_9, var16_16);
                        if (var10_10 != 0) {
                            var3_3 /* !! */ .inputType = var9_9 = var3_3 /* !! */ .inputType | 8192;
                        } else if ((var9_9 = (int)xo1_1.a(var9_9, var15_15)) != 0) {
                            var3_3 /* !! */ .inputType = var9_9 = var3_3 /* !! */ .inputType | 16384;
                        }
                    }
                    var20_20 = (int)var7_7.c;
                    if (var20_20 != 0) {
                        var20_20 = var3_3 /* !! */ .inputType;
                        var9_9 = 32768;
                        var3_3 /* !! */ .inputType = var20_20 |= var9_9;
                    }
                }
                var20_20 = mm3.c;
                var21_21 = var5_5.b;
                var3_3 /* !! */ .initialSelStart = var23_22 = (int)(var21_21 >> 32);
                var24_23 = 0xFFFFFFFFL;
                var3_3 /* !! */ .initialSelEnd = var23_22 = (int)(var21_21 &= var24_23);
                ky0_0.a(var3_3 /* !! */ , (CharSequence)var6_6);
                var23_22 = var3_3 /* !! */ .imeOptions;
                var26_24 = 0x2000000;
                var3_3 /* !! */ .imeOptions = var23_22 |= var26_24;
                var23_22 = (int)ef3_0.a;
                var6_6 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";
                if (var23_22 != 0 && (var23_22 = (int)zo1_0.a(var8_8, var13_13)) == 0 && (var23_22 = (int)zo1_0.a(var8_8, var12_12)) == 0) {
                    var23_22 = (int)tE.b();
                    if (var23_22 != 0) {
                        ky0$b.a(var3_3 /* !! */ , (boolean)var4_4);
                    }
                    if ((var5_5 = var3_3 /* !! */ .extras) == null) {
                        var5_5 = new WeakReference<EditorInfo>();
                        var3_3 /* !! */ .extras = var5_5;
                    }
                    var5_5 = var3_3 /* !! */ .extras;
                    var5_5.putBoolean((String)var6_6, (boolean)var4_4);
                    var27_25 = hy0_1.a;
                    var27_25.a(var3_3 /* !! */ );
                } else {
                    var4_4 = (int)tE.b();
                    if (var4_4 != 0) {
                        var4_4 = 0;
                        var27_25 = null;
                        ky0$b.a(var3_3 /* !! */ , false);
                    } else {
                        var4_4 = 0;
                        var27_25 = null;
                    }
                    var5_5 = var3_3 /* !! */ .extras;
                    if (var5_5 == null) {
                        var5_5 = new WeakReference<EditorInfo>();
                        var3_3 /* !! */ .extras = var5_5;
                    }
                    var5_5 = var3_3 /* !! */ .extras;
                    var5_5.putBoolean((String)var6_6, false);
                }
                var27_25 = Rt1.a;
                var4_4 = EmojiCompat.c();
                if (var4_4 != 0) {
                    var27_25 = EmojiCompat.a();
                    var27_25.i(var3_3 /* !! */ );
                }
                var6_6 = var2_2.h;
                var8_8 = var2_2.i.c;
                var7_7 = new Xt1$a(var2_2);
                var19_19 = var2_2.e;
                var28_28 = var2_2.f;
                var29_29 = var2_2.g;
                var5_5 = var3_3 /* !! */ ;
                var3_3 /* !! */  = new XF2((ql3_0)var6_6, (Xt1$a)var7_7, (boolean)var8_8, (Vt1)var19_19, var28_28, var29_29);
                var27_25 = var2_2.j;
                var5_5 = new WeakReference<EditorInfo>(var3_3 /* !! */ );
                var27_25.add(var5_5);
                return var3_3 /* !! */ ;
            }
            var27_26 = "Invalid Keyboard Type".toString();
            var3_3 /* !! */  = new IllegalStateException(var27_26);
            throw var3_3 /* !! */ ;
        }
        var27_27 = "invalid ImeAction".toString();
        var3_3 /* !! */  = new IllegalStateException(var27_27);
        throw var3_3 /* !! */ ;
    }
}

