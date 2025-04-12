/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class AbstractComposeView$a
extends Lambda
implements Function2 {
    public final /* synthetic */ AbstractComposeView c;

    public AbstractComposeView$a(AbstractComposeView abstractComposeView) {
        this.c = abstractComposeView;
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
            n3 = 0;
            ((AbstractComposeView)((Object)object2)).a((b30_0)object, 0);
        }
        return Unit.a;
    }
}

