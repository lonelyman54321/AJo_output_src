/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Yd0
implements Function1 {
    public final /* synthetic */ de0_2 a;

    public /* synthetic */ Yd0(de0_2 de0_22) {
        this.a = de0_22;
    }

    public final Object invoke(Object object) {
        object = (Bitmap)object;
        de0_2 de0_22 = this.a;
        Intrinsics.checkNotNullParameter(de0_22, "this$0");
        Intrinsics.checkNotNullParameter(object, "bitmap");
        ce0_1 ce0_12 = new ce0_1(de0_22, (Bitmap)object);
        return g53_0.b(ce0_12);
    }
}

