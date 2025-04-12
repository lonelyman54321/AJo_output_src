/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.jiobannerads.BannerAdViewModel$callBannerAdsHomeApi$1$1;
import com.ril.ajio.jiobannerads.BannerAdViewModel$callBannerAdsHomeApi$1$2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class BannerAdViewModel$callBannerAdsHomeApi$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $asi;
    final /* synthetic */ String $loggedIn;
    final /* synthetic */ String $pageUrl;
    final /* synthetic */ String $storeId;
    final /* synthetic */ String $userType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BannerAdViewModel this$0;

    public BannerAdViewModel$callBannerAdsHomeApi$1(BannerAdViewModel bannerAdViewModel, String string2, String string3, String string4, String string5, String string6, f80_0 f80_02) {
        this.this$0 = bannerAdViewModel;
        this.$asi = string2;
        this.$pageUrl = string3;
        this.$storeId = string4;
        this.$loggedIn = string5;
        this.$userType = string6;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        BannerAdViewModel bannerAdViewModel = this.this$0;
        String string2 = this.$asi;
        String string3 = this.$pageUrl;
        String string4 = this.$storeId;
        String string5 = this.$loggedIn;
        String string6 = this.$userType;
        object = new BannerAdViewModel$callBannerAdsHomeApi$1(bannerAdViewModel, string2, string3, string4, string5, string6, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (BannerAdViewModel$callBannerAdsHomeApi$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((BannerAdViewModel$callBannerAdsHomeApi$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            Object object3;
            qg3_2 qg3_22;
            BannerAdViewModel bannerAdViewModel;
            Object object4;
            Object object5;
            int n3;
            Object object6;
            BannerAdViewModel$callBannerAdsHomeApi$1 bannerAdViewModel$callBannerAdsHomeApi$1;
            block6: {
                BannerAdViewModel$callBannerAdsHomeApi$1$1 bannerAdViewModel$callBannerAdsHomeApi$1$1;
                int n4;
                block2: {
                    block3: {
                        block4: {
                            bannerAdViewModel$callBannerAdsHomeApi$1 = this;
                            object6 = j90_0.COROUTINE_SUSPENDED;
                            n3 = this.label;
                            int n7 = 2;
                            n4 = 1;
                            if (n3 == 0) break block2;
                            if (n3 == n4) break block3;
                            if (n3 != n7) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object6;
                    }
                    object5 = (Ref$ObjectRef)this.L$1;
                    object4 = (Ref$ObjectRef)this.L$0;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object5 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                bannerAdViewModel = this.this$0;
                String string2 = this.$asi;
                String string3 = this.$pageUrl;
                String string4 = this.$storeId;
                String string5 = this.$loggedIn;
                String string6 = this.$userType;
                qg3_22 = bannerAdViewModel$callBannerAdsHomeApi$1$1;
                object3 = object5;
                object2 = bannerAdViewModel$callBannerAdsHomeApi$1$1;
                bannerAdViewModel$callBannerAdsHomeApi$1$1 = null;
                ((BannerAdViewModel$callBannerAdsHomeApi$1$1)qg3_22)((Ref$ObjectRef)object5, bannerAdViewModel, ref$ObjectRef, string2, string3, string4, string5, string6, null);
                this.L$0 = object5;
                this.L$1 = ref$ObjectRef;
                this.label = n4;
                object2 = be_1.c(qg3_22, this);
                if (object2 == object6) {
                    return object6;
                }
                object4 = object5;
                object5 = ref$ObjectRef;
            }
            object2 = ir0_2.a;
            object2 = bg1_1.a;
            object3 = bannerAdViewModel$callBannerAdsHomeApi$1.this$0;
            bannerAdViewModel = null;
            qg3_22 = new BannerAdViewModel$callBannerAdsHomeApi$1$2((BannerAdViewModel)object3, (Ref$ObjectRef)object4, (Ref$ObjectRef)object5, null);
            bannerAdViewModel$callBannerAdsHomeApi$1.L$0 = null;
            bannerAdViewModel$callBannerAdsHomeApi$1.L$1 = null;
            bannerAdViewModel$callBannerAdsHomeApi$1.label = n3 = 2;
            object5 = Ae3.g(bannerAdViewModel$callBannerAdsHomeApi$1, (CoroutineContext)object2, qg3_22);
            if (object5 == object6) {
                return object6;
            }
        }
        return Unit.a;
    }
}

