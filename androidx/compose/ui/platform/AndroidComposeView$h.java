/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AndroidComposeView$h
extends FunctionReferenceImpl
implements Function1 {
    public final Object invoke(Object object) {
        object = (Function0)object;
        ((AndroidComposeView)this.receiver).t((Function0)object);
        return Unit.a;
    }
}

