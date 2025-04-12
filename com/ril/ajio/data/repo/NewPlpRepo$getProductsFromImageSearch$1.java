/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.NewPlpRepo;

final class NewPlpRepo$getProductsFromImageSearch$1
extends h80_0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NewPlpRepo this$0;

    public NewPlpRepo$getProductsFromImageSearch$1(NewPlpRepo newPlpRepo, f80_0 f80_02) {
        this.this$0 = newPlpRepo;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.result = object;
        this.label = n3 = this.label | -1 << -1;
        return this.this$0.getProductsFromImageSearch(null, null, this);
    }
}

