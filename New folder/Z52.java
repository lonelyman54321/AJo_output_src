/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.CountDownTimer
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView$B;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Z52
extends RecyclerView$B {
    public static final Z52$a Companion;
    public final g71_0 a;
    public final int b;
    public boolean c;
    public final NewAjioStoryViewPager d;
    public final TextView e;
    public final ArrayList f;
    public final LinearLayout g;
    public final Context h;
    public final Z52$c i;
    public ProgressBar j;
    public int k;
    public CountDownTimer l;
    public ArrayList m;
    public int n;
    public final ShimmerFrameLayout o;

    static {
        Z52$a z52$a;
        Companion = z52$a = new Object();
    }

    public Z52(View object, g71_0 object2, b62 b622, U71 object3) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "parentView");
        Intrinsics.checkNotNullParameter(object2, "homeComponentClickListener");
        Intrinsics.checkNotNullParameter(b622, "olpHomeComponentCallback");
        super((View)object);
        this.a = object2;
        this.b = 3000;
        int n4 = R$id.component_rotating_image_viewpager;
        object2 = object.findViewById(n4);
        Object object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        object2 = (NewAjioStoryViewPager)((Object)object2);
        this.d = object2;
        int n7 = R$id.olp_widget_title;
        TextView textView = (TextView)object.findViewById(n7);
        this.e = textView;
        super();
        this.f = textView;
        Object object5 = this.itemView;
        int n8 = R$id.progress_bar_view;
        object5 = (LinearLayout)object5.findViewById(n8);
        this.g = object5;
        object5 = object.getContext();
        this.h = object5;
        super(this);
        this.i = object5;
        this.k = n3 = -1;
        super();
        n8 = R$id.view_orderlist_shimmer;
        object = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
        object = (ShimmerFrameLayout)((Object)object);
        this.o = object;
        object4 = new Z52$d(this);
        hv3_0.p0((ShimmerFrameLayout)((Object)object));
        if (object3 != null) {
            object = object3.y();
            n8 = 1;
            object3 = new uw1_1(this, n8);
            Z52$e z52$e = new Z52$e((uw1_1)object3);
            ((LiveData)object5).e((mu1_1)object, z52$e);
        } else {
            hv3_0.s0((ShimmerFrameLayout)((Object)object));
        }
        b622.b((zr1_1)object5);
        ((NewAjioStoryViewPager)((Object)object2)).setMaxSettleDuration(1000);
        ((NewAjioStoryViewPager)((Object)object2)).b((NewAjioStoryViewPager$g)object4);
        textView.clear();
    }

    public final void w(int n3) {
        int n4;
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            n4 = arrayList.size();
        } else {
            n4 = 0;
            arrayList = null;
        }
        if (n4 == 0) {
            return;
        }
        int n7 = this.k % n4;
        arrayList = this.f;
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
    public final void x(ProgressBar var1_1, int var2_2) {
        block9: {
            block11: {
                block10: {
                    var3_3 = this.l;
                    if (var3_3 != null) {
                        Intrinsics.checkNotNull(var3_3);
                        var3_3.cancel();
                    }
                    if ((var3_3 = this.m) != null) {
                        var4_4 = var3_3.size();
                    } else {
                        var4_4 = 0;
                        var3_3 = null;
                    }
                    if (var4_4 == 0) break block9;
                    var3_3 = this.m;
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
                        this.k = var2_2;
                    }
                    var6_6 = cp_1.Companion;
                    var2_2 = (int)km_1.b(var6_6);
                    var4_4 = 100;
                    if (var2_2 == 0) break block10;
                    this.w(var4_4);
                    break block11;
                }
                var6_6 = this.j;
                if (var6_6 == null) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var6_6);
                var2_2 = var6_6.getProgress();
                if (var2_2 < var4_4) {
                    var6_6 = this.j;
                    Intrinsics.checkNotNull(var6_6);
                    var2_2 = var6_6.getProgress();
                    this.w(var2_2);
                } else lbl-1000:
                // 2 sources

                {
                    this.w(0);
                }
            }
            this.j = var1_1 /* !! */ ;
            var2_2 = this.b;
            var4_4 = var2_2 / 100;
            Intrinsics.checkNotNull(var1_1 /* !! */ );
            var7_7 = var1_1 /* !! */ .getProgress() * var4_4;
            var8_8 = var2_2 -= var7_7;
            var10_9 = var4_4;
            var1_1 /* !! */  = new a62_0(this, var8_8, var10_9);
            var1_1 /* !! */  = var1_1 /* !! */ .start();
            this.l = var1_1 /* !! */ ;
        }
    }
}

