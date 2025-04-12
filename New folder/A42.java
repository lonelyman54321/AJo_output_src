/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 */
import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public final class A42 {
    public final Bundle a;
    public IconCompat b;
    public final GI2[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final CharSequence i;
    public final PendingIntent j;
    public final boolean k;

    public A42(int n3, String string2, PendingIntent pendingIntent) {
        Object object;
        IconCompat iconCompat = null;
        if (n3 != 0) {
            object = "";
            iconCompat = IconCompat.d(null, (String)object, n3);
        }
        Bundle bundle = new Bundle();
        object = this;
        this(iconCompat, string2, pendingIntent, bundle, null, null, true, 0, true, false, false);
    }

    public A42(IconCompat object, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, GI2[] gI2Array, GI2[] gI2Array2, boolean bl2, int n3, boolean bl3, boolean bl4, boolean bl5) {
        int n4;
        int n7;
        this.e = n7 = 1;
        this.b = object;
        if (object != null && (n7 = ((IconCompat)object).i()) == (n4 = 2)) {
            int n8;
            this.h = n8 = ((IconCompat)object).f();
        }
        this.i = object = J42.b(charSequence);
        this.j = pendingIntent;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a = bundle;
        this.c = gI2Array;
        this.d = bl2;
        this.f = n3;
        this.e = bl3;
        this.g = bl4;
        this.k = bl5;
    }

    public final IconCompat a() {
        int n3;
        IconCompat iconCompat = this.b;
        if (iconCompat == null && (n3 = this.h) != 0) {
            String string2 = "";
            this.b = iconCompat = IconCompat.d(null, string2, n3);
        }
        return this.b;
    }
}

