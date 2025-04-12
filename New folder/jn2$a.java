/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PathMeasure
 */
import android.graphics.PathMeasure;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class jn2$a
extends Lambda
implements Function0 {
    public static final jn2$a c;

    static {
        jn2$a jn2$a;
        c = jn2$a = new Lambda(0);
    }

    public final Object invoke() {
        PathMeasure pathMeasure = new PathMeasure();
        mi mi2 = new mi(pathMeasure);
        return mi2;
    }
}

