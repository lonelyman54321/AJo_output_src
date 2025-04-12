/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class w33
extends RecyclerView$f {
    public final List a;
    public List b;
    public final sz2_1 c;
    public final ma_2 d;
    public final e43_0 e;
    public mu1_1 f;
    public boolean g;

    public w33(List list, List list2, sz2_1 sz2_12, boolean bl2, ma_2 ma_22, e43_0 e43_02) {
        Intrinsics.checkNotNullParameter(list, "bannersList");
        Intrinsics.checkNotNullParameter(sz2_12, "productClickListener");
        Intrinsics.checkNotNullParameter(ma_22, "ajioVideoPlayer");
        Intrinsics.checkNotNullParameter(e43_02, "stlViewModel");
        this.a = list;
        this.b = list2;
        this.c = sz2_12;
        this.d = ma_22;
        this.e = e43_02;
        this.g = bl2;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block56: {
            block55: {
                var3_3 = this;
                var4_4 = var2_2;
                var5_5 = 1;
                var6_6 = var1_1;
                var6_6 = (b33_0)var1_1;
                Intrinsics.checkNotNullParameter(var6_6, "holder");
                var8_8 = var7_7 /* !! */  = this.a.get(var2_2);
                var8_8 = (BannerData)var7_7 /* !! */ ;
                var9_9 = this.g;
                var10_10 = this.b;
                var6_6.getClass();
                var7_7 /* !! */  = "bannerData";
                Intrinsics.checkNotNullParameter(var8_8, var7_7 /* !! */ );
                var11_11 = this.c;
                Intrinsics.checkNotNullParameter(var11_11, "productClickListener");
                var6_6.C = var8_8;
                var6_6.D = var2_2;
                var12_12 /* !! */  = var6_6.a;
                var12_12 /* !! */ .setTag((Object)var6_6);
                var6_6.h.setVisibility(0);
                Intrinsics.checkNotNullParameter(var12_12 /* !! */ , "view");
                var13_13 = R$id.playerView;
                var14_14 = (PlayerView)var12_12 /* !! */ .findViewById(var13_13);
                var6_6.u = var14_14;
                var15_15 /* !! */  = "playerView";
                var16_16 = null;
                if (var14_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var15_15 /* !! */ );
                    var13_13 = 0;
                    var14_14 = null;
                    var17_17 = 0.0f;
                }
                var18_18 = R$string.video_player;
                var19_19 = hv3_0.K(var18_18);
                var14_14.setContentDescription((CharSequence)var19_19);
                var13_13 = R$id.seekBar;
                var14_14 = (SeekBar)var12_12 /* !! */ .findViewById(var13_13);
                var6_6.v = var14_14;
                var13_13 = R$id.imgVolume;
                var14_14 = (ImageView)var12_12 /* !! */ .findViewById(var13_13);
                var6_6.w = var14_14;
                var13_13 = R$id.imgReplay;
                var14_14 = (ImageView)var12_12 /* !! */ .findViewById(var13_13);
                var6_6.x = var14_14;
                var13_13 = R$id.imgThumbnail;
                var14_14 = (ImageView)var12_12 /* !! */ .findViewById(var13_13);
                var6_6.z = var14_14;
                var13_13 = R$id.imgPlay;
                var14_14 = (ImageView)var12_12 /* !! */ .findViewById(var13_13);
                var6_6.y = var14_14;
                var13_13 = R$id.progress;
                var14_14 = (ProgressBar)var12_12 /* !! */ .findViewById(var13_13);
                var6_6.A = var14_14;
                var14_14 = var6_6.w;
                var20_20 = "imgVolume";
                if (var14_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                    var13_13 = 0;
                    var14_14 = null;
                    var17_17 = 0.0f;
                }
                var19_19 = new cN2(var6_6, var5_5);
                var14_14.setOnClickListener((View.OnClickListener)var19_19);
                var14_14 = var6_6.x;
                if (var14_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
                    var13_13 = 0;
                    var14_14 = null;
                    var17_17 = 0.0f;
                }
                var19_19 = new a33_0((b33_0)var6_6);
                var14_14.setOnClickListener((View.OnClickListener)var19_19);
                var14_14 = var6_6.u;
                if (var14_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var15_15 /* !! */ );
                    var13_13 = 0;
                    var14_14 = null;
                    var17_17 = 0.0f;
                }
                var14_14.setOnTouchListener((View.OnTouchListener)var6_6);
                var21_21 = var6_6.c;
                var14_14 = var21_21.k;
                var19_19 = new z33((b33_0)var6_6);
                var22_22 = var6_6.b;
                var14_14.e((mu1_1)var22_22, (F62)var19_19);
                var14_14 = eb_2.a;
                var14_14 = var8_8.getDynamicPageMetadata();
                if (var14_14 != null) {
                    var14_14 = var14_14.getMediaType();
                } else {
                    var13_13 = 0;
                    var14_14 = null;
                    var17_17 = 0.0f;
                }
                var13_13 = (int)eb_2.e((String)var14_14);
                var19_19 = "seekbar";
                var22_22 = var6_6.g;
                var23_23 = var6_6.i;
                var1_1 = var11_11;
                if (var13_13 == 0) break block55;
                var14_14 = var7_7 /* !! */ ;
                var24_24 = var6_6.K;
                var26_25 = 0L;
                cfr_temp_0 = var24_24 - var26_25;
                var28_26 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var28_26 /* !! */  == false) {
                    var6_6.K = var24_24 = System.currentTimeMillis();
                }
                if ((var29_27 = var8_8.getDynamicPageMetadata()) != null) {
                    var29_27 = var29_27.getExtendedUrl();
                } else {
                    var5_5 = 0;
                    var29_27 = null;
                }
                if (var29_27 != null) {
                    var30_28 = StringsKt.Q((CharSequence)var29_27, '/', 0, 6);
                    var31_29 = 1;
                    var29_27 = var29_27.substring(var30_28 += var31_29);
                    var7_7 /* !! */  = "substring(...)";
                    Intrinsics.checkNotNullExpressionValue(var29_27, var7_7 /* !! */ );
                    var6_6.I = var29_27;
                }
                var22_22.setVisibility(0);
                var5_5 = 8;
                var23_23.setVisibility(var5_5);
                var30_28 = var6_6.getLayoutPosition();
                var7_7 /* !! */  = var21_21.e(var30_28);
                var22_22 = "imgThumbnail";
                if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .b) != null && (var30_28 = (int)var7_7 /* !! */ .isPlaying()) == 0) {
                    var7_7 /* !! */  = var6_6.z;
                    if (var7_7 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var22_22);
                        var30_28 = 0;
                        var7_7 /* !! */  = null;
                    }
                    var7_7 /* !! */ .setVisibility(0);
                }
                var7_7 /* !! */  = new da$a();
                var7_7 /* !! */ .k = var32_30 = 1;
                var7_7 /* !! */ .r = var32_30;
                var32_30 = R$string.acc_banner;
                var23_23 = hv3_0.K(var32_30);
                var7_7 /* !! */ .b((String)var23_23);
                var23_23 = var6_6.C;
                if (var23_23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var14_14);
                    var32_30 = 0;
                    var23_23 = null;
                }
                var14_14 = var23_23.getBannerUrl();
                var23_23 = var6_6.z;
                if (var23_23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var22_22);
                    var32_30 = 0;
                    var23_23 = null;
                }
                var7_7 /* !! */ .n = var14_14;
                var7_7 /* !! */ .u = var23_23;
                var7_7 /* !! */ .a();
                var30_28 = var6_6.getLayoutPosition();
                var7_7 /* !! */  = var21_21.e(var30_28);
                if (var7_7 /* !! */  != null) {
                    var7_7 /* !! */  = var7_7 /* !! */ .c;
                } else {
                    var30_28 = 0;
                    var7_7 /* !! */  = null;
                }
                if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var21_21.e(var30_28 = var6_6.getLayoutPosition())) != null) {
                    var7_7 /* !! */ .c = var6_6;
                }
                if ((var7_7 /* !! */  = var6_6.v) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var19_19);
                    var30_28 = 0;
                    var7_7 /* !! */  = null;
                }
                var14_14 = new Object();
                var7_7 /* !! */ .setOnTouchListener((View.OnTouchListener)var14_14);
                var7_7 /* !! */  = var6_6.w;
                if (var7_7 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                    var30_28 = 0;
                    var7_7 /* !! */  = null;
                }
                var7_7 /* !! */ .setVisibility(0);
                var7_7 /* !! */  = var6_6.w;
                if (var7_7 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                    var30_28 = 0;
                    var7_7 /* !! */  = null;
                }
                ai0_2.a((View)var7_7 /* !! */ );
                var7_7 /* !! */  = var8_8.getDynamicPageMetadata();
                if (var7_7 /* !! */  != null) {
                    var7_7 /* !! */  = var7_7 /* !! */ .getExtendedUrl();
                } else {
                    var30_28 = 0;
                    var7_7 /* !! */  = null;
                }
                var13_13 = var6_6.getLayoutPosition();
                var6_6.M = var7_7 /* !! */  = ow_0.c(var13_13, (String)var7_7 /* !! */ );
                var14_14 = eb_2.c;
                var6_6.L = var7_7 /* !! */  = (sb3_2)var14_14.get(var7_7 /* !! */ );
                if (var7_7 /* !! */  != null) {
                    var17_17 = var7_7 /* !! */ .f;
                    var21_21.g = var14_14 = Float.valueOf(var17_17);
                    var7_7 /* !! */  = var7_7 /* !! */ .c;
                    if (var7_7 /* !! */  != null) {
                        var33_31 = var7_7 /* !! */ .longValue();
                        var18_18 = 1000;
                        var35_32 = var18_18;
                        var26_25 = var33_31 / var35_32;
                    }
                    var33_31 = var26_25;
                    var6_6.N = var26_25;
                }
                if ((var7_7 /* !! */  = var6_6.L) == null) {
                    var37_33 = 255;
                    var38_34 = null;
                    var28_26 /* !! */  = 0;
                    var7_7 /* !! */  = new sb3_2(null, null, null, false, 0.0f, null, null, var37_33);
                    var6_6.L = var7_7 /* !! */ ;
                }
                if ((var7_7 /* !! */  = var6_6.L) != null) {
                    var14_14 = var8_8.getDynamicPageMetadata();
                    if (var14_14 != null && (var14_14 = var14_14.getAudioSettings()) != null) {
                        var14_14 = var14_14.getMuteOnFullScreen();
                        var19_19 = Boolean.TRUE;
                        var13_13 = (int)Intrinsics.areEqual(var14_14, var19_19);
                    } else {
                        var13_13 = 0;
                        var17_17 = 0.0f;
                        var14_14 = null;
                    }
                    var7_7 /* !! */ .d = var13_13;
                }
                var13_13 = var6_6.getLayoutPosition();
                var7_7 /* !! */  = var6_6.u;
                if (var7_7 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var15_15 /* !! */ );
                    var39_35 = false;
                    var15_15 /* !! */  = null;
                } else {
                    var15_15 /* !! */  = var7_7 /* !! */ ;
                }
                var7_7 /* !! */  = var8_8.getDynamicPageMetadata();
                if (var7_7 /* !! */  != null) {
                    var19_19 = var7_7 /* !! */  = var7_7 /* !! */ .getExtendedUrl();
                } else {
                    var18_18 = 0;
                    var19_19 = null;
                }
                var11_11 = String.valueOf(var6_6.M);
                var23_23 = var6_6.L;
                var7_7 /* !! */  = var6_6.c;
                var40_37 = 136;
                var22_22 = null;
                var38_34 = var23_23;
                var23_23 = var6_6;
                var29_27 = var21_21;
                var21_21 = var11_11;
                var11_11 = null;
                var41_38 = 8;
                var31_29 = var40_37;
                ma_2.i((ma_2)var7_7 /* !! */ , var13_13, (PlayerView)var15_15 /* !! */ , (String)var19_19, null, (pb_2)var6_6, (String)var21_21, (sb3_2)var38_34, var40_37);
                var7_7 /* !! */  = var6_6.L;
                if (var7_7 /* !! */  == null) ** GOTO lbl-1000
                var30_28 = (int)var7_7 /* !! */ .d;
                var13_13 = 1;
                var17_17 = 1.4E-45f;
                if (var30_28 == var13_13) {
                    var7_7 /* !! */  = var6_6.w;
                    if (var7_7 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                        var30_28 = 0;
                        var7_7 /* !! */  = null;
                    }
                    var13_13 = R$string.video_unmute;
                    var14_14 = hv3_0.K(var13_13);
                    var7_7 /* !! */ .setContentDescription((CharSequence)var14_14);
                    var30_28 = var6_6.getLayoutPosition();
                    var7_7 /* !! */  = var29_27.a(var30_28);
                    var29_27.k((ExoPlayer)var7_7 /* !! */ );
                    var29_27 = var6_6.w;
                    if (var29_27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                        var5_5 = 0;
                        var29_27 = null;
                    }
                    if ((var7_7 /* !! */  = var6_6.w) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                    } else {
                        var16_16 = var7_7 /* !! */ ;
                    }
                    var7_7 /* !! */  = var16_16.getContext();
                    var13_13 = R$drawable.volume_off;
                    var7_7 /* !! */  = xn.a((Context)var7_7 /* !! */ , var13_13);
                    var29_27.setImageDrawable((Drawable)var7_7 /* !! */ );
                } else lbl-1000:
                // 2 sources

                {
                    if ((var7_7 /* !! */  = var6_6.w) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                        var30_28 = 0;
                        var7_7 /* !! */  = null;
                    }
                    var13_13 = R$string.video_mute;
                    var14_14 = hv3_0.K(var13_13);
                    var7_7 /* !! */ .setContentDescription((CharSequence)var14_14);
                    var30_28 = var6_6.getLayoutPosition();
                    var7_7 /* !! */  = var29_27.a(var30_28);
                    ma_2.p((ma_2)var29_27, (ExoPlayer)var7_7 /* !! */ );
                    var29_27 = var6_6.w;
                    if (var29_27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                        var5_5 = 0;
                        var29_27 = null;
                    }
                    if ((var7_7 /* !! */  = var6_6.w) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                    } else {
                        var16_16 = var7_7 /* !! */ ;
                    }
                    var7_7 /* !! */  = var16_16.getContext();
                    var13_13 = R$drawable.volume_on;
                    var7_7 /* !! */  = xn.a((Context)var7_7 /* !! */ , var13_13);
                    var29_27.setImageDrawable((Drawable)var7_7 /* !! */ );
                }
                break block56;
            }
            var41_38 = 8;
            var29_27 = var6_6.v;
            if (var29_27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var19_19);
                var5_5 = 0;
                var29_27 = null;
            }
            var29_27.setVisibility(var41_38);
            var29_27 = var6_6.w;
            if (var29_27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var20_20);
                var5_5 = 0;
                var29_27 = null;
            }
            var29_27.setVisibility(var41_38);
            var22_22.setVisibility(var41_38);
            var5_5 = 0;
            var23_23.setVisibility(0);
            var29_27 = var8_8.getDynamicPageMetadata();
            if (var29_27 != null && (var29_27 = var29_27.getExtendedImageUrl()) != null) {
                var7_7 /* !! */  = new da$a();
                var7_7 /* !! */ .k = true;
                var7_7 /* !! */ .b = var13_13 = R$drawable.item_dummy_noimg;
                var7_7 /* !! */ .c = var13_13 = R$drawable.component_placeholder;
                var7_7 /* !! */ .a = var13_13;
                var13_13 = 1;
                var17_17 = 1.4E-45f;
                var7_7 /* !! */ .r = var13_13;
                var7_7 /* !! */ .s = var13_13;
                var39_36 = R$string.acc_icon_product_placeholder;
                var15_15 /* !! */  = hv3_0.K(var39_36);
                var7_7 /* !! */ .b(var15_15 /* !! */ );
                var7_7 /* !! */ .n = var29_27;
                var7_7 /* !! */ .u = var23_23;
                var7_7 /* !! */ .i = var13_13;
                var7_7 /* !! */ .a();
            }
        }
        var29_27 = var6_6.q;
        var7_7 /* !! */  = var6_6.p;
        if (var10_10 != null && (var13_13 = (int)var10_10.isEmpty()) == 0) {
            var29_27.setVisibility(var41_38);
            var13_13 = 0;
            var17_17 = 0.0f;
            var14_14 = null;
            var7_7 /* !! */ .setVisibility(0);
            var3_3 = var6_6.j;
            if (var9_9) {
                var3_3.setVisibility(0);
            } else {
                var5_5 = 4;
                var3_3.setVisibility(var5_5);
            }
        } else {
            var13_13 = 0;
            var17_17 = 0.0f;
            var14_14 = null;
            var29_27.setVisibility(0);
            var7_7 /* !! */ .setVisibility(var41_38);
            var5_5 = (int)var6_6.t;
            var15_15 /* !! */  = var6_6.s;
            var19_19 = var6_6.r;
            if (var5_5 != 0) {
                var19_19.setVisibility(0);
                var15_15 /* !! */ .setVisibility(var41_38);
            } else {
                var19_19.setVisibility(var41_38);
                var15_15 /* !! */ .setVisibility(0);
            }
        }
        var6_6.k.setVisibility(0);
        var6_6.l.setVisibility(0);
        var3_3 = var8_8.getDynamicPageMetadata();
        var29_27 = "";
        if (var3_3 == null || (var3_3 = var3_3.getSubTitle()) == null) {
            var3_3 = var29_27;
        }
        var14_14 = var6_6.m;
        var14_14.setText((CharSequence)var3_3);
        var41_38 = 0;
        var3_3 = null;
        var14_14.setVisibility(0);
        var14_14 = var8_8.getDynamicPageMetadata();
        if (var14_14 != null && (var14_14 = var14_14.getTitle()) != null) {
            var29_27 = var14_14;
        }
        var14_14 = var6_6.n;
        var14_14.setText((CharSequence)var29_27);
        var14_14.setVisibility(0);
        var6_6.o.setVisibility(0);
        var7_7 /* !! */ .setVisibility(0);
        var29_27 = var6_6.itemView;
        var30_28 = R$id.stlHRv;
        var29_27 = (RecyclerView)var29_27.findViewById(var30_28);
        var12_12 /* !! */  = var12_12 /* !! */ .getContext();
        var7_7 /* !! */  = new WrapperLinearLayoutManager((Context)var12_12 /* !! */ , 0);
        var29_27.setLayoutManager((RecyclerView$o)var7_7 /* !! */ );
        if (var10_10 != null) {
            var3_3 = var10_10;
            var3_3 = var10_10;
            var41_38 = (int)var3_3.isEmpty();
            var4_4 = 1;
            if ((var41_38 ^= var4_4) != 0) {
                var12_12 /* !! */  = var1_1;
                var3_3 = new g33_0((BannerData)var8_8, var10_10, (sz2_1)var1_1);
                var29_27.setAdapter((RecyclerView$f)var3_3);
            }
        }
        km_1.a(AnalyticsManager.Companion, "Shop the Look");
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object2 = this.f;
        if (object2 == null) {
            object2 = viewGroup.getContext();
            object = "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner";
            Intrinsics.checkNotNull(object2, (String)object);
            this.f = object2 = (mu1_1)object2;
        }
        object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.shop_the_look_home_fragment_view;
        e43_0 e43_02 = null;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lifecycleOwner");
            object = null;
        }
        ma_2 ma_22 = this.d;
        e43_02 = this.e;
        object2 = new b33_0((View)viewGroup, (mu1_1)object, ma_22, e43_02);
        return object2;
    }

    public final void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
        Object object;
        Object object2;
        recyclerView$B = (b33_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        super.onViewDetachedFromWindow(recyclerView$B);
        ((b33_0)recyclerView$B).y();
        int n3 = ((b33_0)recyclerView$B).D;
        Object object3 = this.d;
        ExoPlayer exoPlayer = ((ow_0)object3).f(n3);
        int n4 = ((b33_0)recyclerView$B).D;
        Object object4 = (BannerData)this.a.get(n4);
        int n7 = recyclerView$B.getLayoutPosition();
        object3 = ((ow_0)object3).e(n7);
        n7 = 0;
        MediaItem mediaItem = null;
        object3 = object3 != null ? ((lt2_1)object3).d : null;
        object4 = ((BannerData)object4).getDynamicPageMetadata();
        Object object5 = object4 != null ? (object4 = ((DynamicPageMetadata)object4).getExtendedUrl()) : null;
        if (exoPlayer != null) {
            n4 = exoPlayer.getCurrentMediaItemIndex();
            object2 = object4 = Integer.valueOf(n4);
        } else {
            object2 = null;
        }
        if (exoPlayer != null) {
            long l2 = exoPlayer.getCurrentPosition();
            object = object4 = Long.valueOf(l2);
        } else {
            object = null;
        }
        int n8 = 248;
        sb3_2 sb3_22 = new sb3_2((String)object5, (Integer)object2, (Long)object, false, 0.0f, null, null, n8);
        if (object3 != null) {
            eb_2.c.put(object3, sb3_22);
            object4 = eb_2.e;
            if (exoPlayer != null) {
                mediaItem = exoPlayer.getCurrentMediaItem();
            }
            ((HashMap)object4).put(object3, mediaItem);
        }
        ((b33_0)recyclerView$B).A(false);
    }
}

