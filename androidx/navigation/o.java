/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.n$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class o {
    public final n$a a;
    public boolean b;
    public boolean c;
    public int d;
    public String e;
    public boolean f;
    public boolean g;

    public o() {
        int n3;
        n$a n$a;
        n$a.c = n3 = -1;
        n$a.g = n3;
        n$a.h = n3;
        n$a.i = n3;
        n$a.j = n3;
        this.a = n$a;
        this.d = -1;
    }

    public final void a(String object, Function1 object2) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "route");
        Intrinsics.checkNotNullParameter(object2, "popUpToBuilder");
        if (object != null) {
            boolean bl4 = kotlin.text.b.k((CharSequence)object) ^ true;
            if (bl4) {
                this.e = object;
                this.f = false;
            } else {
                object2 = "Cannot pop up to an empty route".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
        this.d = -1;
        this.f = false;
        object = new Dw2();
        object2.invoke(object);
        this.f = bl3 = ((Dw2)object).a;
        this.g = bl2 = ((Dw2)object).b;
    }
}

