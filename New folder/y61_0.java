/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.CountDownTimer
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 */
import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Y61
 */
public final class y61_0
extends RecyclerView$B {
    public final g71_0 a;
    public final boolean b;
    public final gx0_2 c;
    public final OnGAEventHandlerListener d;
    public int e;
    public boolean f;
    public final NewAjioStoryViewPager g;
    public final ArrayList h;
    public final LinearLayout i;
    public final Context j;
    public ProgressBar k;
    public int l;
    public CountDownTimer m;
    public List n;
    public int o;
    public int p;
    public String q;
    public String r;
    public x61_0 s;

    public y61_0(View object, g71_0 object2, boolean bl2, gx0_2 gx0_22, OnGAEventHandlerListener onGAEventHandlerListener) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(object, "parentView");
        Intrinsics.checkNotNullParameter(object2, "homeComponentClickListener");
        Intrinsics.checkNotNullParameter(gx0_22, "trackBannerImpression");
        super((View)object);
        this.a = object2;
        this.b = bl2;
        this.c = gx0_22;
        this.d = onGAEventHandlerListener;
        this.e = 3000;
        int n3 = R$id.component_rotating_image_viewpager;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
        object2 = (NewAjioStoryViewPager)((Object)object2);
        this.g = object2;
        this.h = arrayList = new ArrayList();
        gx0_22 = this.itemView;
        int n4 = R$id.progress_bar_view;
        gx0_22 = (LinearLayout)gx0_22.findViewById(n4);
        this.i = gx0_22;
        object = object.getContext();
        this.j = object;
        this.l = -1;
        super(this);
        ((NewAjioStoryViewPager)((Object)object2)).setMaxSettleDuration(1000);
        ((NewAjioStoryViewPager)((Object)object2)).b((NewAjioStoryViewPager$g)object);
        arrayList.clear();
    }

    public final void w(int n3) {
        int n4;
        List list = this.n;
        if (list != null) {
            n4 = list.size();
        } else {
            n4 = 0;
            list = null;
        }
        if (n4 == 0) {
            return;
        }
        int n7 = this.l % n4;
        list = this.h;
        int n8 = list.size();
        for (int i3 = 0; i3 < n8; ++i3) {
            ProgressBar progressBar;
            if (i3 < n7) {
                progressBar = (ProgressBar)((ArrayList)list).get(i3);
                int n10 = 100;
                progressBar.setProgress(n10);
                continue;
            }
            if (i3 > n7) {
                progressBar = (ProgressBar)((ArrayList)list).get(i3);
                progressBar.setProgress(0);
                continue;
            }
            progressBar = (ProgressBar)((ArrayList)list).get(i3);
            progressBar.setProgress(n3);
        }
    }

    public final void x(int n3) {
        int n4;
        List list = this.n;
        int n7 = 0;
        if (list != null) {
            n4 = list.size();
        } else {
            n4 = 0;
            list = null;
        }
        if (n4 != 0) {
            list = this.n;
            if (list != null) {
                n4 = list.size();
            } else {
                n4 = 0;
                list = null;
            }
            int n8 = 1;
            if (n4 != n8) {
                list = this.n;
                if (list != null) {
                    n7 = list.size();
                }
                list = (ProgressBar)this.h.get(n3 %= n7);
                this.y((ProgressBar)list, n3);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void y(ProgressBar var1_1, int var2_2) {
        block9: {
            block11: {
                block10: {
                    var3_3 = this.m;
                    if (var3_3 != null) {
                        Intrinsics.checkNotNull(var3_3);
                        var3_3.cancel();
                    }
                    if ((var3_3 = this.n) != null) {
                        var4_4 = var3_3.size();
                    } else {
                        var4_4 = 0;
                        var3_3 = null;
                    }
                    if (var4_4 == 0) break block9;
                    var3_3 = this.n;
                    if (var3_3 != null) {
                        var4_4 = var3_3.size();
                    } else {
                        var4_4 = 0;
                        var3_3 = null;
                    }
                    var5_5 = 1;
                    if (var4_4 == var5_5) break block9;
                    if (var1_1 /* !! */  == null) {
                        return;
                    }
                    var4_4 = -1;
                    if (var2_2 == var4_4) {
                        this.l = var2_2;
                    }
                    var6_6 = cp_1.Companion;
                    var2_2 = (int)km_1.b(var6_6);
                    var4_4 = 100;
                    if (var2_2 == 0) break block10;
                    this.w(var4_4);
                    break block11;
                }
                var6_6 = this.k;
                if (var6_6 == null) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var6_6);
                var2_2 = var6_6.getProgress();
                if (var2_2 < var4_4) {
                    var6_6 = this.k;
                    Intrinsics.checkNotNull(var6_6);
                    var2_2 = var6_6.getProgress();
                    this.w(var2_2);
                } else lbl-1000:
                // 2 sources

                {
                    this.w(0);
                }
            }
            this.k = var1_1 /* !! */ ;
            var2_2 = this.e;
            var4_4 = var2_2 / 100;
            Intrinsics.checkNotNull(var1_1 /* !! */ );
            var7_7 = var1_1 /* !! */ .getProgress() * var4_4;
            var8_8 = var2_2 -= var7_7;
            var10_9 = var4_4;
            var1_1 /* !! */  = new z61_0(this, var8_8, var10_9);
            var1_1 /* !! */  = var1_1 /* !! */ .start();
            this.m = var1_1 /* !! */ ;
        }
    }
}

