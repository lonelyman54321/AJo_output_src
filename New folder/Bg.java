/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.PointerIcon
 *  android.view.View
 */
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class Bg {
    public static final Bg a;

    static {
        Bg bg2;
        a = bg2 = new Object();
    }

    public final void a(View view, Uv2 uv2) {
        Context context;
        boolean bl2 = uv2 instanceof vi;
        if (bl2) {
            ((vi)uv2).getClass();
            boolean bl3 = false;
            uv2 = null;
        } else {
            bl2 = uv2 instanceof wi;
            if (bl2) {
                context = view.getContext();
                int n3 = ((wi)uv2).b;
                uv2 = xg_0.a(n3, context);
            } else {
                uv2 = yg_0.a(view.getContext());
            }
        }
        context = zg_0.a(view);
        bl2 = Intrinsics.areEqual(context, uv2);
        if (!bl2) {
            Ag.a(view, (PointerIcon)uv2);
        }
    }
}

