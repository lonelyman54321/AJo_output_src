/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 */
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

public final class f92$b
extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ f92_0 a;

    public f92$b(f92_0 f92_02) {
        this.a = f92_02;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "e");
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onFling(MotionEvent var1_1, MotionEvent var2_2, float var3_3, float var4_4) {
        block9: {
            block8: {
                block10: {
                    block7: {
                        block6: {
                            var5_5 = "e2";
                            Intrinsics.checkNotNullParameter(var2_2, var5_5);
                            try {
                                var6_6 = var2_2.getY();
                                var5_5 = null;
                                if (var1_1 == null) break block6;
                            }
                            catch (Exception v0) {}
                            var7_7 = var1_1.getY();
                            break block7;
                        }
                        var8_8 = 0;
                        var7_7 = 0.0f;
                        var1_1 = null;
                    }
                    var6_6 -= var7_7;
                    var7_7 = Math.abs(var6_6);
                    var9_9 = 100.0f;
                    var8_8 = var7_7 == var9_9 ? 0 : (var7_7 > var9_9 ? 1 : -1);
                    if (var8_8 <= 0) break block8;
                    var7_7 = Math.abs(var4_4);
                    var8_8 = (int)(var7_7 == var9_9 ? 0 : (var7_7 > var9_9 ? 1 : -1));
                    if (var8_8 <= 0) break block8;
                    var1_1 = this.a;
                    cfr_temp_0 = var6_6 - 0.0f;
                    var10_10 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var10_10 /* !! */  <= 0) ** GOTO lbl33
                    var1_1.b();
                    break block10;
lbl33:
                    // 1 sources

                    var1_1.c();
                }
                var8_8 = 1;
                var7_7 = 1.4E-45f;
                break block9;
            }
            var8_8 = 0;
            var7_7 = 0.0f;
            var1_1 = null;
        }
        return (boolean)var8_8;
    }
}

