/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class AndroidCompositionLocals_androidKt$j
extends Lambda
implements Function2 {
    public final /* synthetic */ AndroidComposeView c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public AndroidCompositionLocals_androidKt$j(AndroidComposeView androidComposeView, Function2 function2, int n3) {
        this.c = androidComposeView;
        this.d = function2;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        AndroidComposeView androidComposeView = this.c;
        Function2 function2 = this.d;
        AndroidCompositionLocals_androidKt.a(androidComposeView, function2, (b30_0)object, n3);
        return Unit.a;
    }
}

