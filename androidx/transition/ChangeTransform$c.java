/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
package androidx.transition;

import android.os.Build;
import android.view.View;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.f;
import java.lang.reflect.InvocationTargetException;

public final class ChangeTransform$c
extends f {
    public View a;
    public oZ0 b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onTransitionEnd(Transition var1_1) {
        block10: {
            block11: {
                var2_4 = 0;
                var3_5 /* !! */  = null;
                var4_6 = 1;
                var1_1.removeListener(this);
                var5_7 = Build.VERSION.SDK_INT;
                var6_8 = this.a;
                var7_9 = 28;
                if (var5_7 != var7_9) ** GOTO lbl21
                var5_7 = (int)qZ0.g;
                if (var5_7 != 0) break block11;
                try {
                    block12: {
                        block9: {
                            var5_7 = (int)qZ0.c;
                            if (var5_7 != 0) break block12;
                            var1_1 = "android.view.GhostView";
                            try {
                                var1_1 = Class.forName((String)var1_1);
                                qZ0.b = var1_1;
                                break block9;
                            }
                            catch (ClassNotFoundException v0) {}
lbl21:
                            // 1 sources

                            var5_7 = rz0_0.g;
                            var5_7 = R$id.ghost_view;
                            var1_1 = (rz0_0)var6_8.getTag(var5_7);
                            if (var1_1 == null) break block10;
                            var1_1.d = var2_4 = var1_1.d - var4_6;
                            if (var2_4 <= 0) {
                                var3_5 /* !! */  = (pZ0)var1_1.getParent();
                                var3_5 /* !! */ .removeView((View)var1_1);
                            }
                            break block10;
                        }
                        qZ0.c = var4_6;
                    }
                    var1_1 = qZ0.b;
                    var8_10 = "removeGhost";
                    var9_11 = new Class[var4_6];
                    var9_11[0] = var10_12 = View.class;
                    var1_1 = var1_1.getDeclaredMethod(var8_10, var9_11);
                    qZ0.f = var1_1;
                    var1_1.setAccessible((boolean)var4_6);
                }
                catch (NoSuchMethodException v1) {}
                qZ0.g = var4_6;
            }
            if ((var1_1 = qZ0.f) != null) {
                try {
                    var11_13 = new Object[var4_6];
                    var11_13[0] = var6_8;
                    var1_1.invoke(null, var11_13);
                }
                catch (InvocationTargetException var1_2) {
                    var1_3 = var1_2.getCause();
                    var3_5 /* !! */  = new RuntimeException(var1_3);
                    throw var3_5 /* !! */ ;
                }
                catch (IllegalAccessException v2) {}
            }
        }
        var5_7 = R$id.transition_transform;
        var6_8.setTag(var5_7, null);
        var5_7 = R$id.parent_matrix;
        var6_8.setTag(var5_7, null);
    }

    public final void onTransitionPause(Transition transition2) {
        this.b.setVisibility(4);
    }

    public final void onTransitionResume(Transition transition2) {
        this.b.setVisibility(0);
    }
}

