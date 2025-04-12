/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusChangedElement;
import kotlin.jvm.functions.Function1;

public final class a {
    public static final LP1 a(LP1 lP1, Function1 function1) {
        FocusChangedElement focusChangedElement = new FocusChangedElement(function1);
        return lP1.then(focusChangedElement);
    }
}

