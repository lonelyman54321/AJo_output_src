/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.operators.parallel.ParallelRunOn$BaseRunOnSubscriber;

final class ParallelRunOn$RunOnSubscriber
extends ParallelRunOn$BaseRunOnSubscriber {
    private static final long serialVersionUID = 1075119423897941642L;

    public final void a(ef3_2 ef3_22) {
        ef3_2 ef3_23 = this.a;
        boolean bl2 = gf3_2.validate(ef3_23, ef3_22);
        if (!bl2) {
            return;
        }
        this.a = ef3_22;
        throw null;
    }

    public final void run() {
        throw null;
    }
}

