/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.fragment.app.n;
import androidx.fragment.app.n$b;
import androidx.media3.exoplayer.l$a;
import androidx.media3.exoplayer.source.j$b;
import com.facebook.appevents.codeless.ViewIndexer;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

public final class BN1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ BN1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        var1_1 = this.a;
        switch (var1_1) {
            default: {
                var2_2 = (ViewIndexer)this.b;
                var4_9 = var3_6 = this.c;
                var4_9 = (TimerTask)var3_6;
                var3_6 = ViewIndexer.class;
                var5_10 = td0.b(var3_6);
                if (var5_10) ** GOTO lbl33
                var6_12 = "this$0";
                Intrinsics.checkNotNullParameter(var2_2, (String)var6_12);
                var6_12 = "$indexingTask";
                Intrinsics.checkNotNullParameter(var4_9, (String)var6_12);
                var6_12 = var2_2.c;
                if (var6_12 == null) ** GOTO lbl22
                var6_12.cancel();
                ** GOTO lbl22
                catch (Throwable var2_3) {
                    ** GOTO lbl32
                }
lbl22:
                // 2 sources

                var5_10 = false;
                var6_12 = null;
                var2_2.d = null;
                var7_13 = new Timer();
                var8_14 = 0L;
                var10_15 = 1000L;
                var6_12 = var7_13;
                var7_13.scheduleAtFixedRate((TimerTask)var4_9, var8_14, var10_15);
                var2_2.c = var7_13;
                ** GOTO lbl33
lbl32:
                // 1 sources

                td0.a(var3_6, var2_3);
lbl33:
                // 4 sources

                return;
            }
            case 1: {
                var2_4 = (n)this.b;
                Intrinsics.checkNotNullParameter(var2_4, "this$0");
                var3_7 = (n$b)this.c;
                Intrinsics.checkNotNullParameter(var3_7, "$operation");
                var2_4.b.remove(var3_7);
                var2_4.c.remove(var3_7);
                return;
            }
            case 0: 
        }
        var2_5 = ((l$a)this.b).b.h;
        var3_8 /* !! */  = (Pair)this.c;
        var5_11 = (Integer)var3_8 /* !! */ .first;
        var3_8 /* !! */  = (j$b)var3_8 /* !! */ .second;
        var2_5.R(var5_11, (j$b)var3_8 /* !! */ );
        return;
        {
            catch (Exception v0) {
                ** continue;
            }
        }
    }
}

