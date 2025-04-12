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
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$id;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zC3
 */
public final class zc3_2
extends RecyclerView$B {
    public final g71_0 a;
    public final ViewPager2 b;
    public final View c;
    public ArrayList d;
    public wd3_2 e;
    public int f;
    public final ArrayList g;
    public final LinearLayout h;
    public final Context i;
    public int j;
    public ProgressBar k;
    public int l;
    public CountDownTimer m;

    public zc3_2(View view, g71_0 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(object, "homeComponentClickListener");
        super(view);
        this.a = object;
        int n3 = R$id.viewPager;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ViewPager2)((Object)object);
        this.b = object;
        n3 = R$id.layoutVideo;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.c = object;
        super();
        this.g = object;
        int n4 = R$id.progress_bar_view;
        string2 = (LinearLayout)view.findViewById(n4);
        this.h = string2;
        view = view.getContext();
        this.i = view;
        this.j = 3000;
        ((ArrayList)object).clear();
    }

    public final void w(int n3) {
        int n4;
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            n4 = arrayList.size();
        } else {
            n4 = 0;
            arrayList = null;
        }
        if (n4 == 0) {
            return;
        }
        int n7 = this.l % n4;
        arrayList = this.g;
        int n8 = arrayList.size();
        for (int i3 = 0; i3 < n8; ++i3) {
            ProgressBar progressBar;
            if (i3 < n7) {
                progressBar = (ProgressBar)arrayList.get(i3);
                if (progressBar == null) continue;
                int n10 = 100;
                progressBar.setProgress(n10);
                continue;
            }
            if (i3 > n7) {
                progressBar = (ProgressBar)arrayList.get(i3);
                if (progressBar == null) continue;
                progressBar.setProgress(0);
                continue;
            }
            progressBar = (ProgressBar)arrayList.get(i3);
            if (progressBar == null) continue;
            progressBar.setProgress(n3);
        }
    }

    public final void x(int n3) {
        int n4;
        ArrayList arrayList = this.d;
        int n7 = 0;
        if (arrayList != null) {
            n4 = arrayList.size();
        } else {
            n4 = 0;
            arrayList = null;
        }
        if (n4 != 0) {
            arrayList = this.d;
            if (arrayList != null) {
                n4 = arrayList.size();
            } else {
                n4 = 0;
                arrayList = null;
            }
            int n8 = 1;
            if (n4 != n8) {
                arrayList = this.d;
                if (arrayList != null) {
                    n7 = arrayList.size();
                }
                arrayList = (ProgressBar)this.g.get(n3 %= n7);
                this.y((ProgressBar)arrayList, n3);
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
                    if ((var3_3 = this.d) != null) {
                        var4_4 = var3_3.size();
                    } else {
                        var4_4 = 0;
                        var3_3 = null;
                    }
                    if (var4_4 == 0) break block9;
                    var3_3 = this.d;
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
            var2_2 = this.j;
            var4_4 = var2_2 / 100;
            Intrinsics.checkNotNull(var1_1 /* !! */ );
            var7_7 = var1_1 /* !! */ .getProgress() * var4_4;
            var8_8 = var2_2 -= var7_7;
            var10_9 = var4_4;
            var1_1 /* !! */  = new yc3_2(this, var8_8, var10_9);
            var1_1 /* !! */  = var1_1 /* !! */ .start();
            this.m = var1_1 /* !! */ ;
        }
    }
}

