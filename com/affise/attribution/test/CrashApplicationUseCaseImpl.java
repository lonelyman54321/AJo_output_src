/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.test;

import com.affise.attribution.exceptions.TestApplicationCrashException;
import com.affise.attribution.test.CrashApplicationUseCase;

public final class CrashApplicationUseCaseImpl
implements CrashApplicationUseCase {
    public void crash() {
        TestApplicationCrashException testApplicationCrashException = new TestApplicationCrashException();
        throw testApplicationCrashException;
    }
}

