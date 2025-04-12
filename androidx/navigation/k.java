/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class k
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$ObjectRef c;

    public k(Ref$ObjectRef ref$ObjectRef) {
        this.c = ref$ObjectRef;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        Object object2 = this.c.element;
        boolean bl3 = true;
        if (object2 != null && (bl2 = (object2 = (Bundle)object2).containsKey((String)object))) {
            bl3 = false;
        }
        return bl3;
    }
}

