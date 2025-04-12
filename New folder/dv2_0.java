/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.google.android.flexbox.FlexboxLayoutManager$LayoutParams;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.FacetValue;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dv2
 */
public final class dv2_0
extends RecyclerView$B {
    public final yv2_1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final RelativeLayout e;
    public final TextView f;
    public final ImageView g;

    public dv2_0(View view, yv2_1 yv2_12, boolean bl2, boolean bl3, boolean bl4) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(yv2_12, "filterClickListener");
        super(view);
        this.a = yv2_12;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
        int n3 = R$id.root_rl;
        yv2_12 = (RelativeLayout)view.findViewById(n3);
        this.e = yv2_12;
        n3 = R$id.filter_name_tv;
        yv2_12 = (TextView)view.findViewById(n3);
        this.f = yv2_12;
        n3 = R$id.filter_icon_iv;
        view = (ImageView)view.findViewById(n3);
        this.g = view;
    }

    /*
     * Unable to fully structure code
     */
    public final void w(FacetValue var1_1, HashMap var2_2, int var3_3, int var4_4) {
        block10: {
            block12: {
                block11: {
                    Intrinsics.checkNotNullParameter(var1_1, "item");
                    var5_5 = "imagesMap";
                    Intrinsics.checkNotNullParameter(var2_2, (String)var5_5);
                    var6_6 = 8;
                    var7_7 = mz3_0.L(var6_6);
                    var8_8 = this.b;
                    var9_9 = null;
                    if (var8_8 == 0) break block11;
                    var10_10 = mz3_0.L(var6_6);
                    var6_6 = 0;
                    var5_5 = null;
                    var8_8 = 0;
                    break block10;
                }
                var8_8 = this.c;
                if (var8_8 == 0) break block12;
                var8_8 = (int)this.d;
                if (var8_8 != 0) {
                    var6_6 = mz3_0.L(var6_6);
lbl20:
                    // 3 sources

                    while (true) {
                        var8_8 = var6_6;
                        var6_6 = 0;
                        var5_5 = null;
lbl24:
                        // 2 sources

                        while (true) {
                            var10_10 = 0;
                            break block10;
                            break;
                        }
                        break;
                    }
                }
                var6_6 = mz3_0.L(12);
                ** GOTO lbl20
            }
            var8_8 = 4;
            if (var4_4 == 0) {
                var6_6 = mz3_0.L(var6_6);
                var8_8 = mz3_0.L(var8_8);
                ** continue;
            }
            var6_6 = mz3_0.L(var8_8);
            ** while (true)
        }
        var12_12 = -2;
        var11_11 = new FlexboxLayoutManager$LayoutParams(var12_12, var12_12);
        var11_11.setMargins(0, 0, 0, 0);
        var9_9 = this.e;
        if (var9_9 != null) {
            var9_9.setLayoutParams((ViewGroup.LayoutParams)var11_11);
        }
        if (var9_9 != null) {
            var9_9.setPadding(var6_6, var8_8, var7_7, var10_10);
        }
        var5_5 = var1_1.getCode();
        var2_2 = (String)var2_2.get(var5_5);
        var5_5 = this.f;
        if (var5_5 != null) {
            var13_13 = var1_1.getName();
            var5_5.setText((CharSequence)var13_13);
        }
        if ((var5_5 = this.g) != null) {
            if (var2_2 != null && (var7_7 = var2_2.length()) != 0) {
                ai0_2.B((View)var5_5);
                var13_13 = new da$a();
                var13_13.n = var2_2;
                var13_13.u = var5_5;
                var13_13.k = var14_14 = true;
                var13_13.g = var14_14;
                var13_13.a();
            } else {
                ai0_2.i((View)var5_5);
            }
        }
        var2_2 = this.itemView;
        var5_5 = new Cv2(this, var1_1, var3_3, var4_4);
        var2_2.setOnClickListener((View.OnClickListener)var5_5);
    }
}

