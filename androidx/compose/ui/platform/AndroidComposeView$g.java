/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$DragShadowBuilder
 */
package androidx.compose.ui.platform;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AndroidComposeView$g
extends FunctionReferenceImpl
implements gx0_2 {
    public final Object invoke(Object object, Object object2, Object object3) {
        boolean bl2;
        object = (Ms0)object;
        long l2 = ((C63)object2).a;
        object3 = (Function1)object3;
        object2 = (AndroidComposeView)this.receiver;
        Object object4 = AndroidComposeView.R0;
        object4 = object2.getContext().getResources();
        DisplayMetrics displayMetrics = object4.getDisplayMetrics();
        float f5 = displayMetrics.density;
        float f6 = object4.getConfiguration().fontScale;
        Wo0 wo0 = new Wo0(f5, f6);
        object4 = new v20(wo0, l2, (Function1)object3);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            object3 = rg_0.a;
            bl2 = ((rg_0)object3).a((View)object2, (Ms0)object, (v20)((Object)object4));
        } else {
            object.getClass();
            object = null;
            n3 = 0;
            object3 = null;
            bl2 = object2.startDrag(null, (View.DragShadowBuilder)object4, null, 0);
        }
        return bl2;
    }
}

