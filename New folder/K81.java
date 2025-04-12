/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.NavigationParent;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class K81
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ K81(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this.a;
        switch (var2_2) {
            default: {
                var1_1 /* !! */  = (DataCallback)var1_1 /* !! */ ;
                var3_3 = (q22_0)this.b;
                Intrinsics.checkNotNullParameter(var3_3, "this$0");
                var4_5 = cp_1.Companion;
                var5_7 = nn_2.b((cp$a)var4_5, (DataCallback)var1_1 /* !! */ );
                if (var5_7 == 0 || (var5_7 = var1_1 /* !! */ .getStatus()) != 0) ** GOTO lbl39
                var1_1 /* !! */  = (NavigationParent)var1_1 /* !! */ .getData();
                var4_5 = "homeListener";
                var6_8 = null;
                if (var1_1 /* !! */  == null) ** GOTO lbl-1000
                var7_9 = var1_1 /* !! */ .getChildDetails();
                if (var7_9 == null) ** GOTO lbl21
                var7_9 = var1_1 /* !! */ .getChildDetails();
                Intrinsics.checkNotNull(var7_9);
                var7_9 = (Collection)var7_9;
                var8_10 = var7_9.isEmpty() ^ true;
                if (var8_10) ** GOTO lbl-1000
lbl21:
                // 2 sources

                if ((var7_9 = var1_1 /* !! */ .getLinkDetails()) != null) {
                    var7_9 = var1_1 /* !! */ .getLinkDetails();
                    Intrinsics.checkNotNull(var7_9);
                    var8_10 = var7_9.isEmpty() ^ true;
                    ** if (!var8_10) goto lbl-1000
                }
                ** GOTO lbl-1000
lbl-1000:
                // 2 sources

                {
                    if ((var7_9 = var3_3.r) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_5);
                    } else {
                        var6_8 = var7_9;
                    }
                    var3_3 = var3_3.cb().d.l();
                    var6_8.w((NavigationParent)var1_1 /* !! */ , (String)var3_3);
                    ** GOTO lbl39
                }
lbl-1000:
                // 3 sources

                {
                    if ((var1_1 /* !! */  = var3_3.r) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var4_5);
                        var9_11 = false;
                        var1_1 /* !! */  = null;
                    }
                    var1_1 /* !! */ .w(null, null);
                }
lbl39:
                // 3 sources

                return Unit.a;
            }
            case 0: 
        }
        var1_1 /* !! */  = (Boolean)var1_1 /* !! */ ;
        var4_6 = (N81)this.b;
        Intrinsics.checkNotNullParameter(var4_6, "this$0");
        var3_4 = Boolean.TRUE;
        var9_12 = Intrinsics.areEqual(var1_1 /* !! */ , var3_4);
        if (var9_12) {
            var1_1 /* !! */  = var4_6.r;
            if (var1_1 /* !! */  != null) {
                ai0_2.B((View)var1_1 /* !! */ );
            }
        } else {
            var1_1 /* !! */  = var4_6.r;
            if (var1_1 /* !! */  != null) {
                ai0_2.i((View)var1_1 /* !! */ );
            }
        }
        return Unit.a;
    }
}

