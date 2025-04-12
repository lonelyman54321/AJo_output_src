/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.FocusFinder
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AndroidComposeView$j
extends FunctionReferenceImpl
implements Function1 {
    public final Object invoke(Object object) {
        object = (LT0)object;
        int n3 = ((LT0)object).a;
        Object object2 = (AndroidComposeView)this.receiver;
        Object object3 = AndroidComposeView.R0;
        object2.getClass();
        boolean bl2 = LT0.a(n3, 7);
        boolean bl3 = false;
        if (!bl2 && !(bl2 = LT0.a(n3, 8))) {
            object = WT0.c(n3);
            if (object != null) {
                n3 = ((Number)object).intValue();
                object3 = ((AndroidComposeView)object2).R();
                if (object3 != null) {
                    object3 = cf_2.e((aG2)object3);
                } else {
                    bl2 = false;
                    object3 = null;
                }
                FocusFinder focusFinder = FocusFinder.getInstance();
                if (object3 == null) {
                    View view = object2.findFocus();
                    object2 = focusFinder.findNextFocus((ViewGroup)object2, view, n3);
                } else {
                    object2 = focusFinder.findNextFocusFromRect((ViewGroup)object2, (Rect)object3, n3);
                }
                if (object2 != null) {
                    object = n3;
                    bl3 = WT0.b((View)object2, (Integer)object, (Rect)object3);
                }
            } else {
                object2 = "Invalid focus direction".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
        }
        return bl3;
    }
}

