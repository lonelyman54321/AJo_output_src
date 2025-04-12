/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber;

final class FlowableObserveOn$ObserveOnSubscriber
extends FlowableObserveOn$BaseObserveOnSubscriber {
    private static final long serialVersionUID = -4547113800637756442L;

    public final void a(ef3_2 object) {
        ef3_2 ef3_22 = this.a;
        int n3 = gf3_2.validate(ef3_22, (ef3_2)object);
        if (n3 != 0) {
            this.a = object;
            n3 = object instanceof gc2_2;
            if (n3 != 0) {
                int n4;
                n3 = (object = (gc2_2)object).requestFusion(7);
                if (n3 != (n4 = 1)) {
                    n4 = 2;
                    if (n3 == n4) {
                        this.e = n4;
                        this.b = object;
                        throw null;
                    }
                } else {
                    this.e = n4;
                    this.b = object;
                    this.d = n4;
                    throw null;
                }
            }
            this.b = object = new za3_2(0);
            throw null;
        }
    }

    public final void c() {
        throw null;
    }

    public final void d() {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        throw null;
    }

    public final void e() {
        throw null;
    }

    public final Object poll() {
        int n3;
        int n4;
        Object object = this.b.poll();
        if (object != null && (n4 = this.e) != (n3 = 1)) {
            long l2 = this.f + 1L;
            ef3_2 ef3_22 = null;
            long l3 = 0;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                this.f = l3 = 0L;
                ef3_22 = this.a;
                ef3_22.request(l2);
            } else {
                this.f = l2;
            }
        }
        return object;
    }
}

