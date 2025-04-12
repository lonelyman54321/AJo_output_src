/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class AndroidCompositionLocals_androidKt$i
extends Lambda
implements Function2 {
    public final /* synthetic */ AndroidComposeView c;
    public final /* synthetic */ pj d;
    public final /* synthetic */ Function2 e;

    public AndroidCompositionLocals_androidKt$i(AndroidComposeView androidComposeView, pj pj2, Function2 function2) {
        this.c = androidComposeView;
        this.d = pj2;
        this.e = function2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.c;
            pj pj2 = this.d;
            Function2 function2 = this.e;
            O30.a((sg2_0)object2, pj2, function2, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

