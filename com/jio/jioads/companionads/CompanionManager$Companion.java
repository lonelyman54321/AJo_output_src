/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.companionads;

import com.jio.jioads.companionads.CompanionManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CompanionManager$Companion {
    private CompanionManager$Companion() {
    }

    public /* synthetic */ CompanionManager$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final CompanionManager getInstance() {
        CompanionManager companionManager = CompanionManager.access$getCompanionManager$cp();
        if (companionManager == null) {
            companionManager = new CompanionManager(null);
            CompanionManager.access$setCompanionManager$cp(companionManager);
            companionManager = CompanionManager.access$getCompanionManager$cp();
        } else {
            companionManager = CompanionManager.access$getCompanionManager$cp();
        }
        return companionManager;
    }
}

