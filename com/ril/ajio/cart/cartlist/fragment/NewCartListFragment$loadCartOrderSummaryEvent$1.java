/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.cart.cartlist.fragment;

import java.util.TimerTask;

public final class NewCartListFragment$loadCartOrderSummaryEvent$1
extends TimerTask {
    public final /* synthetic */ ex1_0 a;

    public NewCartListFragment$loadCartOrderSummaryEvent$1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void run() {
        ex1_0 ex1_02 = this.a;
        boolean bl2 = ex1_02.Q0;
        if (bl2) {
            bl2 = false;
            ex1_02.Q0 = false;
            ex1_02.Ab();
        }
    }
}

