/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.ScaleAnimation
 *  android.view.animation.Transformation
 */
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.Intrinsics;

public final class xn2
extends ScaleAnimation {
    public long a;
    public boolean b;

    public final boolean getTransformation(long l2, Transformation transformation, float f5) {
        long l3;
        long l4;
        long l7;
        long l8;
        String string2 = "outTransformation";
        Intrinsics.checkNotNullParameter(transformation, string2);
        boolean bl2 = this.b;
        if (bl2 && (l8 = (l7 = (l4 = this.a) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
            l4 = this.getStartTime();
            this.a = l4 = l2 - l4;
        }
        if (bl2 = this.b) {
            l4 = this.a;
            l4 = l2 - l4;
            this.setStartTime(l4);
        }
        return super.getTransformation(l2, transformation, f5);
    }
}

