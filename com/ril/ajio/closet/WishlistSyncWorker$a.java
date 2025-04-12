/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.closet;

import com.ril.ajio.closet.WishlistSyncWorker;

public final class WishlistSyncWorker$a
extends h80_0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ WishlistSyncWorker b;
    public int c;

    public WishlistSyncWorker$a(WishlistSyncWorker wishlistSyncWorker, f80_0 f80_02) {
        this.b = wishlistSyncWorker;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.c = n3 = this.c | -1 << -1;
        return this.b.b(this);
    }
}

