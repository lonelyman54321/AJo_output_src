/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.view.View
 *  android.view.Window
 */
package com.google.accompanist.systemuicontroller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.accompanist.systemuicontroller.AndroidSystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt$BlackScrimmed$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class SystemUiControllerKt {
    private static final long BlackScrim;
    private static final Function1 BlackScrimmed;

    static {
        gp2_0 gp2_02 = eZ.c;
        BlackScrim = zx_0.b(0.0f, 0.0f, 0.0f, 0.3f, gp2_02);
        BlackScrimmed = SystemUiControllerKt$BlackScrimmed$1.INSTANCE;
    }

    public static final /* synthetic */ long access$getBlackScrim$p() {
        return BlackScrim;
    }

    public static final /* synthetic */ Function1 access$getBlackScrimmed$p() {
        return BlackScrimmed;
    }

    private static final Window findWindow(Context context) {
        block2: {
            while (true) {
                boolean bl2;
                if (bl2 = context instanceof Activity) {
                    context = ((Activity)context).getWindow();
                    break block2;
                }
                bl2 = context instanceof ContextWrapper;
                if (!bl2) break;
                context = ((ContextWrapper)context).getBaseContext();
                String string2 = "getBaseContext(...)";
                Intrinsics.checkNotNullExpressionValue(context, string2);
            }
            context = null;
        }
        return context;
    }

    private static final Window findWindow(b30_0 b30_02, int n3) {
        n3 = 1009281237;
        b30_02.u(n3);
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.f;
        Object object = ((View)b30_02.j(vc3_12)).getParent();
        boolean bl2 = object instanceof nq0_0;
        Window window = null;
        object = bl2 ? (nq0_0)object : null;
        if (object != null) {
            window = object.getWindow();
        }
        if (window == null) {
            vc3_12 = ((View)b30_02.j(vc3_12)).getContext();
            object = "getContext(...)";
            Intrinsics.checkNotNullExpressionValue(vc3_12, (String)object);
            window = SystemUiControllerKt.findWindow((Context)vc3_12);
        }
        b30_02.I();
        return window;
    }

    public static final SystemUiController rememberSystemUiController(Window window, b30_0 b30_02, int n3, int n4) {
        b30$a$a b30$a$a;
        b30_02.u(-715745933);
        n3 = n4 & 1;
        if (n3 != 0) {
            window = SystemUiControllerKt.findWindow(b30_02, 0);
        }
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.f;
        vc3_12 = (View)b30_02.j(vc3_12);
        b30_02.u(-1044852491);
        n4 = (int)(b30_02.J(vc3_12) ? 1 : 0);
        int n7 = b30_02.J(window);
        Object object = b30_02.v();
        if ((n4 |= n7) != 0 || object == (b30$a$a = b30$a.a)) {
            object = new AndroidSystemUiController((View)vc3_12, window);
            b30_02.o(object);
        }
        object = (AndroidSystemUiController)object;
        b30_02.I();
        b30_02.I();
        return object;
    }
}

