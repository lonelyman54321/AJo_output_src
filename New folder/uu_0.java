/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.BackEvent
 */
import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uu
 */
public final class uu_0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public uu_0(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        float f5 = fm.c(backEvent);
        float f6 = fm.d(backEvent);
        float f7 = fm.a(backEvent);
        int n3 = fm.b(backEvent);
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BackEventCompat{touchX=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", touchY=");
        f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(", progress=");
        f5 = this.c;
        stringBuilder.append(f5);
        stringBuilder.append(", swipeEdge=");
        int n3 = this.d;
        return tu.a(stringBuilder, n3, '}');
    }
}

