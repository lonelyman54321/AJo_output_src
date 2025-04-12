/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys;
import com.google.common.collect.Platform;
import java.util.Map;

class MultimapBuilder$1
extends MultimapBuilder$MultimapBuilderWithKeys {
    final /* synthetic */ int val$expectedKeys;

    public MultimapBuilder$1(int n3) {
        this.val$expectedKeys = n3;
    }

    public Map createMap() {
        return Platform.newHashMapWithExpectedSize(this.val$expectedKeys);
    }
}

