/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringWithParamPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class AffAppTokenPropertyProvider
extends StringWithParamPropertyProvider {
    private final InitPropertiesStorage initProperties;
    private final ProviderType key;
    private final float order;
    private final Converter stringToSHA256Converter;

    public AffAppTokenPropertyProvider(InitPropertiesStorage object, Converter converter) {
        Intrinsics.checkNotNullParameter(object, "initProperties");
        Intrinsics.checkNotNullParameter(converter, "stringToSHA256Converter");
        this.initProperties = object;
        this.stringToSHA256Converter = converter;
        this.order = 61.0f;
        object = ProviderType.AFFISE_APP_TOKEN;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provideWithParam(String object) {
        Intrinsics.checkNotNullParameter(object, "param");
        Converter converter = this.stringToSHA256Converter;
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = this.initProperties.getProperties();
        String string2 = null;
        object2 = object2 != null ? ((AffiseInitProperties)object2).getAffiseAppId() : null;
        stringBuilder.append((String)object2);
        stringBuilder.append((String)object);
        object = this.initProperties.getProperties();
        if (object != null) {
            string2 = ((AffiseInitProperties)object).getSecretKey();
        }
        stringBuilder.append(string2);
        object = stringBuilder.toString();
        return (String)converter.convert(object);
    }
}

