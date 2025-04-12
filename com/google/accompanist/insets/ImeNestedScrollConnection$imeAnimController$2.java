/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.SimpleImeAnimationController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

final class ImeNestedScrollConnection$imeAnimController$2
extends FunctionReferenceImpl
implements Function0 {
    public static final ImeNestedScrollConnection$imeAnimController$2 INSTANCE;

    static {
        ImeNestedScrollConnection$imeAnimController$2 imeNestedScrollConnection$imeAnimController$2;
        INSTANCE = imeNestedScrollConnection$imeAnimController$2 = new ImeNestedScrollConnection$imeAnimController$2();
    }

    public ImeNestedScrollConnection$imeAnimController$2() {
        super(0, SimpleImeAnimationController.class, "<init>", "<init>()V", 0);
    }

    public final SimpleImeAnimationController invoke() {
        SimpleImeAnimationController simpleImeAnimationController = new SimpleImeAnimationController();
        return simpleImeAnimationController;
    }
}

