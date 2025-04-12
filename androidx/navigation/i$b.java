/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.i;
import kotlin.jvm.internal.Intrinsics;

public final class i$b
implements Comparable {
    public final i a;
    public final Bundle b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final int f;

    public i$b(i i3, Bundle bundle, boolean bl2, int n3, boolean bl3, int n4) {
        Intrinsics.checkNotNullParameter(i3, "destination");
        this.a = i3;
        this.b = bundle;
        this.c = bl2;
        this.d = n3;
        this.e = bl3;
        this.f = n4;
    }

    public final int a(i$b i$b) {
        int n3;
        String string2 = "other";
        Intrinsics.checkNotNullParameter(i$b, string2);
        int n4 = 1;
        int n7 = this.c;
        if (n7 != 0 && (n3 = (int)(i$b.c ? 1 : 0)) == 0) {
            return n4;
        }
        n3 = -1;
        if (n7 == 0 && (n7 = i$b.c) != 0) {
            return n3;
        }
        n7 = i$b.d;
        int n8 = this.d - n7;
        if (n8 > 0) {
            return n4;
        }
        if (n8 < 0) {
            return n3;
        }
        Bundle bundle = i$b.b;
        Bundle bundle2 = this.b;
        if (bundle2 != null && bundle == null) {
            return n4;
        }
        if (bundle2 == null && bundle != null) {
            return n3;
        }
        if (bundle2 != null) {
            n8 = bundle2.size();
            Intrinsics.checkNotNull(bundle);
            n7 = bundle.size();
            if ((n8 -= n7) > 0) {
                return n4;
            }
            if (n8 < 0) {
                return n3;
            }
        }
        n7 = (int)(i$b.e ? 1 : 0);
        n8 = (int)(this.e ? 1 : 0);
        if (n8 != 0 && n7 == 0) {
            return n4;
        }
        if (n8 == 0 && n7 != 0) {
            return n3;
        }
        n4 = this.f;
        int n10 = i$b.f;
        return n4 - n10;
    }
}

