/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.CountDownTimer
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 */
import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vh2
 */
public final class vh2_1
extends RecyclerView$B {
    public static final Vh2$a Companion;
    public static boolean m = true;
    public final View a;
    public final int b;
    public final NewAjioStoryViewPager c;
    public final ArrayList d;
    public final LinearLayout e;
    public final Context f;
    public int g;
    public ProgressBar h;
    public int i;
    public CountDownTimer j;
    public uh2_1 k;
    public final Vh2$b l;

    static {
        Vh2$a vh2$a;
        Companion = vh2$a = new Object();
    }

    public vh2_1(View object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        this.a = object;
        this.b = 5000;
        this.d = object2 = new ArrayList();
        this.g = 1;
        this.i = -1;
        Intrinsics.checkNotNullParameter(object, "itemView");
        object2 = object.getContext();
        String string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, string2);
        this.f = object2;
        int n3 = R$id.component_rotating_image_viewpager;
        object2 = (NewAjioStoryViewPager)object.findViewById(n3);
        Intrinsics.checkNotNullParameter(object2, string2);
        this.c = object2;
        n3 = R$id.progress_bar_view;
        object = (LinearLayout)object.findViewById(n3);
        Intrinsics.checkNotNullParameter(object, string2);
        this.e = object;
        this.w().setMaxSettleDuration(1000);
        object = this.w();
        object2 = this.l;
        ((NewAjioStoryViewPager)((Object)object)).b((NewAjioStoryViewPager$g)object2);
        this.l = object = new Vh2$b(this);
    }

    public final NewAjioStoryViewPager w() {
        NewAjioStoryViewPager newAjioStoryViewPager = this.c;
        if (newAjioStoryViewPager != null) {
            return newAjioStoryViewPager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        return null;
    }

    public final void x(uh2_0 uh2_02, ArrayList arrayList, float f5, hq_0 hq_02, boolean bl2) {
        int n3;
        int n4;
        vh2_1 vh2_12 = this;
        Intrinsics.checkNotNullParameter(uh2_02, "referralWidgetInfo");
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        Intrinsics.checkNotNullParameter(hq_02, "onAssuredGiftClickListener");
        int n7 = R$id.rotatingParent;
        Object object = this.a;
        ((RelativeLayout)object.findViewById(n7)).setPadding(0, 0, 0, -12);
        this.g = n7 = arrayList.size();
        Object object2 = object.getLayoutParams();
        ((ViewGroup.LayoutParams)object2).height = n4 = hv3_0.q(R$dimen.dimen_126);
        object2 = object.getLayoutParams();
        ((ViewGroup.LayoutParams)object2).width = n3 = -1;
        object2 = this.e;
        object = "progressBarParentView";
        n4 = 0;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n7 = 0;
            object2 = null;
        }
        if (object2 != null) {
            object2.removeAllViews();
        }
        object2 = vh2_12.d;
        ((ArrayList)object2).clear();
        int n8 = arrayList.size();
        for (int i3 = 0; i3 < n8; ++i3) {
            Context context = vh2_12.f;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            context = LayoutInflater.from((Context)context);
            int n10 = R$layout.pdp_rotating_banner_progress_bar;
            LinearLayout linearLayout = vh2_12.e;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                linearLayout = null;
            }
            context = context.inflate(n10, (ViewGroup)linearLayout, false);
            n10 = R$id.row_rotate_progressbar_one;
            context = (ProgressBar)context.findViewById(n10);
            LinearLayout linearLayout2 = vh2_12.e;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n10 = 0;
                linearLayout2 = null;
            }
            if (linearLayout2 != null) {
                linearLayout2.addView((View)context);
            }
            ((ArrayList)object2).add(context);
        }
        object = object2;
        n4 = (int)(bl2 ? 1 : 0);
        vh2_12.k = object2 = new uh2_1(uh2_02, arrayList, f5, hq_02, bl2);
        object2 = this.w();
        object = vh2_12.k;
        ((NewAjioStoryViewPager)((Object)object2)).setAdapter((Uk2)object);
        object2 = this.w();
        n3 = vh2_12.g * 50;
        ((NewAjioStoryViewPager)((Object)object2)).setCurrentItem(n3);
    }

    public final void y(int n3) {
        int n4 = this.g;
        int n7 = this.i % n4;
        ArrayList arrayList = this.d;
        int n8 = arrayList.size();
        for (int i3 = 0; i3 < n8; ++i3) {
            ProgressBar progressBar;
            if (i3 < n7) {
                progressBar = (ProgressBar)arrayList.get(i3);
                int n10 = 100;
                progressBar.setProgress(n10);
                continue;
            }
            if (i3 > n7) {
                progressBar = (ProgressBar)arrayList.get(i3);
                progressBar.setProgress(0);
                continue;
            }
            progressBar = (ProgressBar)arrayList.get(i3);
            progressBar.setProgress(n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void z(ProgressBar var1_1, int var2_2) {
        block6: {
            block5: {
                var3_3 = this.j;
                if (var3_3 != null) {
                    Intrinsics.checkNotNull(var3_3);
                    var3_3.cancel();
                }
                if (var1_1 /* !! */  == null) {
                    return;
                }
                var4_4 = -1;
                if (var2_2 == var4_4) {
                    this.i = var2_2;
                }
                var5_5 = cp_1.Companion;
                var2_2 = (int)km_1.b(var5_5);
                var4_4 = 100;
                if (var2_2 == 0) break block5;
                this.y(var4_4);
                break block6;
            }
            var5_5 = this.h;
            if (var5_5 == null) ** GOTO lbl-1000
            Intrinsics.checkNotNull(var5_5);
            var2_2 = var5_5.getProgress();
            if (var2_2 < var4_4) {
                var5_5 = this.h;
                Intrinsics.checkNotNull(var5_5);
                var2_2 = var5_5.getProgress();
                this.y(var2_2);
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = 0;
                var5_5 = null;
                this.y(0);
            }
        }
        this.h = var1_1 /* !! */ ;
        var2_2 = this.b;
        var4_4 = var2_2 / 280;
        Intrinsics.checkNotNull(var1_1 /* !! */ );
        var6_6 = var1_1 /* !! */ .getProgress() * var4_4;
        var7_7 = var2_2 - var6_6;
        var9_8 = var4_4;
        var1_1 /* !! */  = new wh2_0(this, var7_7, var9_8);
        var1_1 /* !! */  = var1_1 /* !! */ .start();
        this.j = var1_1 /* !! */ ;
    }
}

