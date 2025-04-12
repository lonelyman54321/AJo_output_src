/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.init;

import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.init.SetPropertiesWhenAppInitializedUseCase;
import kotlin.jvm.internal.Intrinsics;

public final class SetPropertiesWhenAppInitializedUseCaseImpl
implements SetPropertiesWhenAppInitializedUseCase {
    private final InitPropertiesStorage storage;

    public SetPropertiesWhenAppInitializedUseCaseImpl(InitPropertiesStorage initPropertiesStorage) {
        Intrinsics.checkNotNullParameter(initPropertiesStorage, "storage");
        this.storage = initPropertiesStorage;
    }

    public void init(AffiseInitProperties affiseInitProperties) {
        Intrinsics.checkNotNullParameter(affiseInitProperties, "initProperties");
        this.storage.setProperties(affiseInitProperties);
    }
}

