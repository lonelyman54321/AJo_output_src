/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h
extends Lambda
implements Function2 {
    public final /* synthetic */ j c;
    public final /* synthetic */ Function2 d;

    public h(j j3, Function2 function2) {
        this.c = j3;
        this.d = function2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.c.a;
            Function2 function2 = this.d;
            AndroidCompositionLocals_androidKt.a((AndroidComposeView)object2, function2, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

