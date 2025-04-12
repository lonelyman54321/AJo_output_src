/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BitmapFactory
 */
import android.graphics.BitmapFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class NN1$b
extends Lambda
implements Function1 {
    public static final NN1$b c;

    static {
        NN1$b nN1$b;
        c = nN1$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (byte[])object;
        Intrinsics.checkNotNullParameter(object, "it");
        int n3 = ((Object)object).length;
        return BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3);
    }
}

