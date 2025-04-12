/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.relocation;

import androidx.compose.foundation.relocation.BringIntoViewRequesterElement;

public final class a {
    public static final LP1 a(LP1 lP1, MD mD) {
        BringIntoViewRequesterElement bringIntoViewRequesterElement = new BringIntoViewRequesterElement(mD);
        return lP1.then(bringIntoViewRequesterElement);
    }
}

