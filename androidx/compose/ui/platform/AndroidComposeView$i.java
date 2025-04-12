/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AndroidComposeView$i
extends FunctionReferenceImpl
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (LT0)object;
        object2 = (aG2)object2;
        return AndroidComposeView.E((AndroidComposeView)this.receiver, (LT0)object, (aG2)object2);
    }
}

