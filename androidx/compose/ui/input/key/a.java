/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.input.key;

import androidx.compose.ui.input.key.KeyInputElement;
import kotlin.jvm.functions.Function1;

public final class a {
    public static final LP1 a(Function1 function1) {
        KeyInputElement keyInputElement = new KeyInputElement(function1, null);
        return keyInputElement;
    }

    public static final LP1 b(LP1 lP1, Function1 function1) {
        KeyInputElement keyInputElement = new KeyInputElement(null, function1);
        return lP1.then(keyInputElement);
    }
}

