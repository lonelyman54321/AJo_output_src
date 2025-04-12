/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

public final class H42$c {
    public final PendingIntent a;
    public final IconCompat b;
    public int c;
    public int d;
    public int e;
    public PendingIntent f;
    public String g;

    public H42$c(PendingIntent object, IconCompat iconCompat) {
        if (object != null) {
            this.a = object;
            this.b = iconCompat;
            return;
        }
        super("Bubble requires non-null pending intent");
        throw object;
    }

    public final void a(int n3, boolean bl2) {
        if (bl2) {
            int n4 = this.e;
            this.e = n3 |= n4;
        } else {
            int n7 = this.e;
            this.e = n3 = ~n3 & n7;
        }
    }
}

