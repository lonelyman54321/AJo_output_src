/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.view.View
 */
package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ViewLayer$b
extends Lambda
implements Function2 {
    public static final ViewLayer$b c;

    static {
        ViewLayer$b viewLayer$b;
        c = viewLayer$b = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (View)object;
        object2 = (Matrix)object2;
        object = object.getMatrix();
        object2.set((Matrix)object);
        return Unit.a;
    }
}

