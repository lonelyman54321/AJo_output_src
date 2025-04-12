/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import kotlin.Unit;

public final class Hh
implements T01 {
    public static boolean d = true;
    public final ViewGroup a;
    public final Object b;
    public ViewLayerContainer c;

    public Hh(ViewGroup object) {
        this.a = object;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(W01 object) {
        Object object2 = this.b;
        synchronized (object2) {
            boolean bl2 = ((W01)object).r;
            if (!bl2) {
                ((W01)object).r = bl2 = true;
                ((W01)object).b();
            }
            object = Unit.a;
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final W01 b() {
        var1_1 = this.b;
        synchronized (var1_1) {
            block10: {
                var2_2 /* !! */  = this.a;
                var3_4 = Build.VERSION.SDK_INT;
                var4_5 = 29;
                if (var3_4 >= var4_5) {
                    Hh$a.a((View)var2_2 /* !! */ );
                }
                if (var3_4 >= var4_5) {
                    var2_2 /* !! */  = new d11_0();
                    return new W01((a)var2_2 /* !! */ );
                }
                var5_6 = Hh.d;
                if (var5_6 == 0 || var3_4 < (var5_6 = 23)) ** GOTO lbl38
                {
                    catch (Throwable var2_3) {
                        break block10;
                    }
                }
                try {
                    var6_7 = this.a;
                    var7_8 = new zl_0();
                    var8_11 = new xl_0();
                    var2_2 /* !! */  = new c11_0((View)var6_7, var7_8, var8_11);
                    return new W01((a)var2_2 /* !! */ );
                }
                catch (Throwable v0) {
                    var5_6 = 0;
                    var2_2 /* !! */  = null;
                    Hh.d = false;
                    var6_7 = this.a;
                    var7_9 = this.c;
                    if (var7_9 == null) {
                        var7_9 = var6_7.getContext();
                        var8_12 = new ViewLayerContainer((Context)var7_9);
                        var6_7.addView((View)var8_12);
                        this.c = var8_12;
                        var7_9 = var8_12;
                    }
                    var2_2 /* !! */  = new e11_0(var7_9);
                    return new W01((a)var2_2 /* !! */ );
lbl38:
                    // 1 sources

                    var6_7 = this.a;
                    var7_10 = this.c;
                    if (var7_10 == null) {
                        var7_10 = var6_7.getContext();
                        var8_13 = new ViewLayerContainer((Context)var7_10);
                        var6_7.addView((View)var8_13);
                        this.c = var8_13;
                        var7_10 = var8_13;
                    }
                    var2_2 /* !! */  = new e11_0(var7_10);
                    return new W01((a)var2_2 /* !! */ );
                }
            }
            throw var2_3;
        }
    }
}

