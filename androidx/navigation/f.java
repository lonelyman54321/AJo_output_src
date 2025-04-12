/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;

public final class f
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Ref$IntRef e;
    public final /* synthetic */ e f;
    public final /* synthetic */ Bundle g;

    public f(Ref$BooleanRef ref$BooleanRef, ArrayList arrayList, Ref$IntRef ref$IntRef, e e2, Bundle bundle) {
        this.c = ref$BooleanRef;
        this.d = arrayList;
        this.e = ref$IntRef;
        this.f = e2;
        this.g = bundle;
        super(1);
    }

    public final Object invoke(Object object) {
        Ref$IntRef ref$IntRef;
        object = (d)object;
        Intrinsics.checkNotNullParameter(object, "entry");
        List list = this.c;
        int n3 = 1;
        ((Ref$BooleanRef)((Object)list)).element = n3;
        list = this.d;
        int n4 = list.indexOf(object);
        int n7 = -1;
        if (n4 != n7) {
            ref$IntRef = this.e;
            int n8 = ref$IntRef.element;
            list = list.subList(n8, n4 += n3);
            ref$IntRef.element = n4;
        } else {
            list = mz0_2.a;
        }
        i i3 = ((d)object).b;
        e e2 = this.f;
        ref$IntRef = this.g;
        e2.a(i3, (Bundle)ref$IntRef, (d)object, list);
        return Unit.a;
    }
}

