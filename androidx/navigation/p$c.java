/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.i;
import androidx.navigation.n;
import androidx.navigation.p;
import androidx.navigation.p$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p$c
extends Lambda
implements Function1 {
    public final /* synthetic */ p c;

    public p$c(p p2, n n3, p$a p$a) {
        this.c = p2;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (d)object;
        Intrinsics.checkNotNullParameter(object, "backStackEntry");
        Object object2 = ((d)object).b;
        boolean bl3 = object2 instanceof i;
        Object object3 = null;
        if (!bl3) {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            ((d)object).a();
            p p2 = this.c;
            i i3 = p2.c((i)object2);
            if (i3 == null) {
                object = null;
            } else {
                bl2 = Intrinsics.areEqual(i3, object2);
                if (!bl2) {
                    object2 = p2.b();
                    object = ((d)object).a();
                    object = i3.a((Bundle)object);
                    object = ((kU1)object2).a(i3, (Bundle)object);
                }
            }
            object3 = object;
        }
        return object3;
    }
}

