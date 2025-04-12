/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.layout;

import androidx.compose.ui.layout.OnGloballyPositionedElement;
import kotlin.jvm.functions.Function1;

public final class c {
    public static final LP1 a(LP1 lP1, Function1 function1) {
        OnGloballyPositionedElement onGloballyPositionedElement = new OnGloballyPositionedElement(function1);
        return lP1.then(onGloballyPositionedElement);
    }
}

