/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.Surface
 *  android.view.View
 *  android.widget.TextView
 */
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$b;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

public final class i9
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i9(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void run() {
        block32: {
            block31: {
                var1_1 = this.c;
                var2_2 = this.b;
                var3_3 = null;
                var4_4 = this.a;
                switch (var4_4) {
                    default: {
                        var2_2 = (SphericalGLSurfaceView)var2_2;
                        var3_3 = var2_2.g;
                        var5_5 = var2_2.h;
                        var1_1 = (SurfaceTexture)var1_1;
                        var6_7 = new Surface((SurfaceTexture)var1_1);
                        var2_2.g = var1_1;
                        var2_2.h = var6_7;
                        var1_1 = var2_2.a.iterator();
                        while (var7_9 = var1_1.hasNext()) {
                            var2_2 = (SphericalGLSurfaceView$b)var1_1.next();
                            var2_2.p(var6_7);
                        }
                        if (var3_3 != null) {
                            var3_3.release();
                        }
                        if (var5_5 != null) {
                            var5_5.release();
                        }
                        return;
                    }
                    case 0: 
                }
                var5_6 /* !! */  = q9_0.Companion;
                var2_2 = (q9_0)var2_2;
                Intrinsics.checkNotNullParameter(var2_2, "this$0");
                var1_1 = (Ref$IntRef)var1_1;
                Intrinsics.checkNotNullParameter(var1_1, "$requestIndex");
                var2_2.u2 = false;
                var5_6 /* !! */  = var2_2.X;
                var6_8 = "ajiohomeViewModel";
                var8_10 = null;
                if (var5_6 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var6_8);
                    var4_4 = 0;
                    var5_6 /* !! */  = null;
                }
                var4_4 = (int)var5_6 /* !! */ .t;
                var9_11 = 500L;
                if (var4_4 == 0) break block31;
                var5_6 /* !! */  = var2_2.X;
                if (var5_6 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var6_8);
                    var4_4 = 0;
                    var5_6 /* !! */  = null;
                }
                if ((var4_4 = var5_6 /* !! */ .z) != (var11_12 = -1)) {
                    var5_6 /* !! */  = var2_2.X;
                    if (var5_6 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var6_8);
                        var4_4 = 0;
                        var5_6 /* !! */  = null;
                    }
                    var1_1.element = var4_4 = var5_6 /* !! */ .z;
                }
                if ((var5_6 /* !! */  = var2_2.X) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var6_8);
                    var4_4 = 0;
                    var5_6 /* !! */  = null;
                }
                if ((var4_4 = var5_6 /* !! */ .z) != var11_12) ** GOTO lbl-1000
                var5_6 /* !! */  = var2_2.X;
                if (var5_6 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var6_8);
                    var4_4 = 0;
                    var5_6 /* !! */  = null;
                }
                if ((var5_6 /* !! */  = var5_6 /* !! */ .y) != null) {
                    var2_2.yb(var11_12, false);
                    var1_1 = var2_2.G;
                    if (var1_1 != null) {
                        var1_1.setSelectedTabIndicator(null);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var5_6 /* !! */  = var2_2.G;
                    var12_13 = true;
                    if (var5_6 /* !! */  != null && (var4_4 = var5_6 /* !! */ .getSelectedTabPosition()) == (var11_12 = var1_1.element)) {
                        var2_2.yb(var11_12, false);
                    } else {
                        var5_6 /* !! */  = var2_2.G;
                        if (var5_6 /* !! */  != null) {
                            var11_12 = var1_1.element;
                            var13_14 = var5_6 /* !! */ .getTabAt(var11_12);
                            var5_6 /* !! */ .selectTab(var13_14, var12_13);
                        }
                    }
                    var5_6 /* !! */  = var2_2.G;
                    if (var5_6 /* !! */  != null) {
                        var11_12 = R$drawable.tab_indicator_luxe;
                        var5_6 /* !! */ .setSelectedTabIndicator(var11_12);
                    }
                    if ((var5_6 /* !! */  = var2_2.G) != null) {
                        var14_15 = var1_1.element;
                        var1_1 = var5_6 /* !! */ .getTabAt(var14_15);
                    } else {
                        var14_16 = false;
                        var1_1 = null;
                    }
                    if (var1_1 != null && (var1_1 = var1_1.getCustomView()) != null) {
                        var4_4 = R$id.tvTabTitle;
                        var8_10 = var1_1 = var1_1.findViewById(var4_4);
                        var8_10 = (TextView)var1_1;
                    }
                    var2_2.Ub((TextView)var8_10, var12_13);
                }
                if ((var1_1 = var2_2.G) != null) {
                    var5_6 /* !! */  = new l9(var2_2, 0);
                    var1_1.post((Runnable)var5_6 /* !! */ );
                }
                if ((var1_1 = var2_2.Q) != null) {
                    var4_4 = R$string.acc_page_header_luxe_home;
                    var5_6 /* !! */  = hv3_0.K(var4_4);
                    var1_1.setContentDescription((CharSequence)var5_6 /* !! */ );
                }
                var5_6 /* !! */  = Looper.getMainLooper();
                var1_1 = new Handler((Looper)var5_6 /* !! */ );
                var5_6 /* !! */  = new j9(var2_2, 0);
                var1_1.postDelayed((Runnable)var5_6 /* !! */ , var9_11);
                break block32;
            }
            var1_1 = var2_2.Q;
            if (var1_1 != null) {
                var4_4 = R$string.acc_page_header_banner_landing_page;
                var5_6 /* !! */  = hv3_0.K(var4_4);
                var1_1.setContentDescription((CharSequence)var5_6 /* !! */ );
            }
            var5_6 /* !! */  = Looper.getMainLooper();
            var1_1 = new Handler((Looper)var5_6 /* !! */ );
            var5_6 /* !! */  = new k9(var2_2, 0);
            var1_1.postDelayed((Runnable)var5_6 /* !! */ , var9_11);
            var1_1 = var2_2.G;
            if (var1_1 != null) {
                ai0_2.i((View)var1_1);
            }
            if ((var1_1 = var2_2.B) != null) {
                ai0_2.i((View)var1_1);
            }
            if ((var1_1 = var2_2.w) != null) {
                ai0_2.i((View)var1_1);
            }
            if ((var1_1 = var2_2.x) != null) {
                ai0_2.B((View)var1_1);
            }
            if ((var1_1 = var2_2.O) != null) {
                ai0_2.i((View)var1_1);
            }
            if ((var1_1 = var2_2.P) != null) {
                var1_1.setOnClickListener(null);
            }
            var2_2.yb(0, false);
        }
    }
}

