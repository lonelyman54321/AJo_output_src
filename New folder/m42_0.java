/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;

/*
 * Renamed from m42
 */
public final class m42_0
extends gu0_0 {
    public final void a() {
    }

    public final Class c() {
        return this.a.getClass();
    }

    public final int getSize() {
        Drawable drawable2 = this.a;
        int n3 = drawable2.getIntrinsicWidth();
        int n4 = drawable2.getIntrinsicHeight() * n3 * 4;
        return Math.max(1, n4);
    }
}

