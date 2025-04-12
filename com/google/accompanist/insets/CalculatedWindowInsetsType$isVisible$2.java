/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets$Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class CalculatedWindowInsetsType$isVisible$2
extends Lambda
implements Function0 {
    final /* synthetic */ WindowInsets$Type[] $types;

    public CalculatedWindowInsetsType$isVisible$2(WindowInsets$Type[] windowInsets$TypeArray) {
        this.$types = windowInsets$TypeArray;
        super(0);
    }

    public final Boolean invoke() {
        boolean bl2;
        block2: {
            WindowInsets$Type[] windowInsets$TypeArray = this.$types;
            int n3 = windowInsets$TypeArray.length;
            bl2 = false;
            for (int i3 = 0; i3 < n3; ++i3) {
                WindowInsets$Type windowInsets$Type = windowInsets$TypeArray[i3];
                boolean bl3 = windowInsets$Type.isVisible();
                if (bl3) {
                    continue;
                }
                break block2;
            }
            bl2 = true;
        }
        return bl2;
    }
}

