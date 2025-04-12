/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets$Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class CalculatedWindowInsetsType$animationInProgress$2
extends Lambda
implements Function0 {
    final /* synthetic */ WindowInsets$Type[] $types;

    public CalculatedWindowInsetsType$animationInProgress$2(WindowInsets$Type[] windowInsets$TypeArray) {
        this.$types = windowInsets$TypeArray;
        super(0);
    }

    public final Boolean invoke() {
        WindowInsets$Type[] windowInsets$TypeArray = this.$types;
        int n3 = windowInsets$TypeArray.length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            WindowInsets$Type windowInsets$Type = windowInsets$TypeArray[i3];
            boolean bl3 = windowInsets$Type.getAnimationInProgress();
            if (!bl3) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }
}

