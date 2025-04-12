/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView$b;
import androidx.compose.ui.platform.i;
import androidx.compose.ui.platform.j;
import androidx.lifecycle.i$b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j$a
extends Lambda
implements Function1 {
    public final /* synthetic */ j c;
    public final /* synthetic */ Function2 d;

    public j$a(j j3, Function2 function2) {
        this.c = j3;
        this.d = function2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (AndroidComposeView$b)object;
        j j3 = this.c;
        boolean bl2 = j3.c;
        if (!bl2) {
            Function2 function2;
            object = ((AndroidComposeView$b)object).a.getLifecycle();
            j3.e = function2 = this.d;
            Object object2 = j3.d;
            if (object2 == null) {
                j3.d = object;
                ((androidx.lifecycle.i)object).a(j3);
            } else {
                boolean bl3 = ((i$b)((Object)(object = ((androidx.lifecycle.i)object).b()))).isAtLeast((i$b)((Object)(object2 = i$b.CREATED)));
                if (bl3) {
                    object = new i(j3, function2);
                    int n3 = -2000640158;
                    boolean bl4 = true;
                    function2 = new u10(n3, object, bl4);
                    object = j3.b;
                    object.e(function2);
                }
            }
        }
        return Unit.a;
    }
}

