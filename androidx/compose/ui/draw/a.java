/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.draw;

import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.draw.DrawWithCacheElement;
import androidx.compose.ui.draw.DrawWithContentElement;
import kotlin.jvm.functions.Function1;

public final class a {
    public static final LP1 a(LP1 lP1, Function1 function1) {
        DrawBehindElement drawBehindElement = new DrawBehindElement(function1);
        return lP1.then(drawBehindElement);
    }

    public static final LP1 b(LP1 lP1, Function1 function1) {
        DrawWithCacheElement drawWithCacheElement = new DrawWithCacheElement(function1);
        return lP1.then(drawWithCacheElement);
    }

    public static final LP1 c(LP1 lP1, Function1 function1) {
        DrawWithContentElement drawWithContentElement = new DrawWithContentElement(function1);
        return lP1.then(drawWithContentElement);
    }
}

