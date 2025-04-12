/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.NewPDPRepo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class NewPDPRepo$getProductDetails$1
extends qg3_2
implements Function2 {
    final /* synthetic */ HashMap $header;
    final /* synthetic */ Ref$ObjectRef $productUrl;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NewPDPRepo this$0;

    public NewPDPRepo$getProductDetails$1(NewPDPRepo newPDPRepo, Ref$ObjectRef ref$ObjectRef, HashMap hashMap, f80_0 f80_02) {
        this.this$0 = newPDPRepo;
        this.$productUrl = ref$ObjectRef;
        this.$header = hashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        NewPDPRepo newPDPRepo = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$productUrl;
        HashMap hashMap = this.$header;
        NewPDPRepo$getProductDetails$1 newPDPRepo$getProductDetails$1 = new NewPDPRepo$getProductDetails$1(newPDPRepo, ref$ObjectRef, hashMap, f80_02);
        newPDPRepo$getProductDetails$1.L$0 = object;
        return newPDPRepo$getProductDetails$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (NewPDPRepo$getProductDetails$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((NewPDPRepo$getProductDetails$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            String string2;
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.label;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n3) break block3;
                            if (n7 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.L$0;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.L$0;
                object2 = (fs0_2)object;
                object = NewPDPRepo.access$getPdpApi$p(this.this$0);
                String string3 = (String)this.$productUrl.element;
                HashMap hashMap = this.$header;
                this.L$0 = object2;
                this.label = n3;
                string2 = "FULL";
                object = object.getProductDetails(string3, string2, hashMap, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            string2 = null;
            this.L$0 = null;
            this.label = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

