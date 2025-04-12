/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 */
import android.graphics.Canvas;
import kotlin.jvm.internal.Intrinsics;

public final class Nf {
    public static final Canvas a;

    static {
        Canvas canvas;
        a = canvas = new Canvas();
    }

    public static final Canvas a(iL iL2) {
        Intrinsics.checkNotNull(iL2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((mf_0)iL2).a;
    }
}

