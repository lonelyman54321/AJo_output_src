/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  android.view.View
 */
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.view.View;
import androidx.appcompat.app.g;
import androidx.appcompat.app.g$a;
import androidx.appcompat.app.g$b;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from d9
 */
public final class d9_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void run() {
        var1_1 = this.b;
        var2_2 = this.a;
        switch (var2_2) {
            default: {
                var2_2 = Build.VERSION.SDK_INT;
                var3_3 = 1;
                var4_4 = 33;
                if (var2_2 < var4_4) ** GOTO lbl45
                var1_1 = (Context)var1_1;
                var5_5 = new ComponentName((Context)var1_1, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                var6_6 /* !! */  = var1_1.getPackageManager();
                var7_7 = var6_6 /* !! */ .getComponentEnabledSetting(var5_5);
                if (var7_7 == var3_3) ** GOTO lbl45
                var6_6 /* !! */  = "locale";
                if (var2_2 < var4_4) ** GOTO lbl32
                var8_8 = g.g;
                var8_8.getClass();
                var9_10 = new Np$a((Np)var8_8);
                while ((var2_2 = (int)var9_10.hasNext()) != 0) {
                    var8_8 = (g)((WeakReference)var9_10.next()).get();
                    if (var8_8 == null || (var8_8 = var8_8.d()) == null) continue;
                    var8_8 = var8_8.getSystemService((String)var6_6 /* !! */ );
                    ** GOTO lbl27
                }
                var2_2 = 0;
                var8_8 = null;
lbl27:
                // 2 sources

                if (var8_8 == null) ** GOTO lbl34
                var8_8 = g$b.a(var8_8);
                var10_11 = new qw1(var8_8);
                var9_10 = new jw1(var10_11);
                ** GOTO lbl35
lbl32:
                // 1 sources

                var9_10 = g.c;
                if (var9_10 != null) ** GOTO lbl35
lbl34:
                // 2 sources

                var9_10 = jw1.b;
lbl35:
                // 3 sources

                var8_8 = var9_10.a;
                var2_2 = (int)var8_8.isEmpty();
                if (var2_2 != 0) {
                    var8_8 = Se3.c((Context)var1_1);
                    var9_10 = var1_1.getSystemService((String)var6_6 /* !! */ );
                    if (var9_10 != null) {
                        var8_8 = g$a.a((String)var8_8);
                        g$b.b(var9_10, (LocaleList)var8_8);
                    }
                }
                var1_1 = var1_1.getPackageManager();
                var1_1.setComponentEnabledSetting(var5_5, var3_3, var3_3);
lbl45:
                // 3 sources

                g.f = var3_3;
                return;
            }
            case 0: 
        }
        var8_9 = q9_0.Companion;
        var1_1 = (q9_0)var1_1;
        var8_9 = "this$0";
        Intrinsics.checkNotNullParameter(var1_1, (String)var8_9);
        var1_1 = var1_1.Q;
        if (var1_1 != null) {
            ai0_2.a((View)var1_1);
        }
    }
}

