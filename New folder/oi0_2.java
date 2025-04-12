/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import com.facebook.FacebookButtonBase;
import com.facebook.appevents.g;
import com.facebook.j;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oI0
 */
public final class oi0_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oi0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View var1_1) {
        block13: {
            var2_2 = var1_1;
            var3_3 = this.b;
            var4_6 = "this$0";
            var5_7 = this.a;
            switch (var5_7) {
                default: {
                    var3_3 = (vv2_1)var3_3;
                    Intrinsics.checkNotNullParameter(var3_3, (String)var4_6);
                    var2_2 = var3_3.N0;
                    if (var2_2 == null) return;
                    var3_3 = var3_3.k;
                    if (var3_3 == null) return;
                    var3_3.G2((Product)var2_2);
                    return;
                }
                case 1: {
                    var3_3 = (dj2_2)var3_3;
                    Intrinsics.checkNotNullParameter(var3_3, (String)var4_6);
                    var2_2 = VideoComponentEvents.Companion;
                    var4_6 = var2_2.getInstance();
                    var6_8 = ai0_2.h(var3_3.l);
                    var7_10 = var3_3.s;
                    var9_11 = "video_screen_interaction";
                    var10_12 = "minimised";
                    var5_7 = 0;
                    var11_13 = null;
                    var12_15 = "video_banner_interactions";
                    var4_6.logExpandMinimizeEvent(false, var6_8, false, var7_10, var12_15, var9_11, var10_12);
                    var13_16 = var2_2.getInstance();
                    var2_2 = var3_3.l;
                    var14_17 = ai0_2.h((String)var2_2);
                    var15_18 = var3_3.s;
                    var17_19 = "video_banner_interactions";
                    var18_20 = "video_screen_interaction";
                    var13_16.logCloseVideoEvent(var14_17, false, var15_18, var17_19, var18_20);
                    var3_3 = var3_3.getActivity();
                    if (var3_3 == null) return;
                    var3_3.onBackPressed();
                    return;
                }
                case 0: 
            }
            var11_14 /* !! */  = var3_3;
            var11_14 /* !! */  = (FacebookButtonBase)var3_3;
            var19_21 = FacebookButtonBase.i;
            var6_9 = FacebookButtonBase.class;
            var19_21 = (int)td0.b(var6_9);
            if (var19_21 != 0) {
                return;
            }
            Intrinsics.checkNotNullParameter(var11_14 /* !! */ , (String)var4_6);
            var3_3 = var11_14 /* !! */ .getContext();
            var20_22 = td0.b(var11_14 /* !! */ );
            if (!var20_22) ** GOTO lbl55
            ** GOTO lbl63
            {
                catch (Throwable var3_5) {
                    break block13;
                }
lbl55:
                // 1 sources

                try {
                    var4_6 = new g((Context)var3_3, null);
                    var3_3 = "loggerImpl";
                    Intrinsics.checkNotNullParameter(var4_6, (String)var3_3);
                    var3_3 = var11_14 /* !! */ .b;
                }
                catch (Throwable var3_4) {}
                td0.a(var11_14 /* !! */ , var3_4);
lbl63:
                // 4 sources

                while (true) {
                    var3_3 = var11_14 /* !! */ .d;
                    if (var3_3 != null) {
                        var3_3.onClick((View)var2_2);
                        return;
                    }
                    var3_3 = var11_14 /* !! */ .c;
                    if (var3_3 == null) return;
                    var3_3.onClick((View)var2_2);
                    return;
                }
            }
            {
                var21_23 = j.c();
                if (!var21_23) ** GOTO lbl63
                var4_6.h(null, (String)var3_3);
                ** continue;
            }
        }
        td0.a(var6_9, var3_5);
    }
}

