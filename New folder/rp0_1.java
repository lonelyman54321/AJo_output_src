/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.StatusNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RP0
 */
public final class rp0_1
implements Function1 {
    public final /* synthetic */ fq0_2 a;

    public /* synthetic */ rp0_1(fq0_2 fq0_22) {
        this.a = fq0_22;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (DataCallback)object;
        Object object2 = fq0_2.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = ((fq0_2)object2).i;
        if (object3 != null) {
            object3.stopLoader();
        }
        if ((n3 = nn_2.b((cp$a)(object3 = cp_1.Companion), (DataCallback)object)) != 0) {
            n3 = ((DataCallback)object).getStatus();
            Object object4 = null;
            Object object5 = "wishlistActionFailureFunction";
            int n4 = 1;
            if (n3 == 0) {
                int n7;
                object = (SaveForLaterResponse)((DataCallback)object).getData();
                object3 = "fleekViewModel";
                if (object != null) {
                    int n8;
                    Integer n10 = ((SaveForLaterResponse)object).getStatusCode();
                    if (n10 != null && (n8 = n10.intValue()) == 0) {
                        int n14;
                        object5 = ((fq0_2)object2).w;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("wishlistActionSuccessFunction");
                            n14 = 0;
                            object5 = null;
                        }
                        object5.invoke();
                        object = ((SaveForLaterResponse)object).getStatus();
                        if (object != null) {
                            object = ((StatusNew)object).getMessageDescription();
                        } else {
                            n7 = 0;
                            object = null;
                        }
                        n14 = 3;
                        rw_1.a(n14, (String)object);
                        object = ((fq0_2)object2).q;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n7 = 0;
                            object = null;
                        }
                        if ((object = ((dr0_0)object).A0.b) != null) {
                            object5 = el1_2.a;
                            object5 = yt2_2.PLP;
                            el1_2.c((yt2_2)((Object)object5), (Product)object);
                        }
                        if ((object = ((fq0_2)object2).q) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n7 = 0;
                            object = null;
                        }
                        if ((object = ((dr0_0)object).A0.b) != null && (object = ((Product)object).getFnlColorVariantData()) != null) {
                            object = ((ProductFnlColorVariantData)object).getColorGroup();
                        } else {
                            n7 = 0;
                            object = null;
                        }
                        if (object != null && (n7 = ((String)object).length()) != 0) {
                            object = ((fq0_2)object2).q;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                n7 = 0;
                                object = null;
                            }
                            if ((object = ((dr0_0)object).A0.b) != null) {
                                object5 = ((fq0_2)object2).q;
                                if (object5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                    n14 = 0;
                                    object5 = null;
                                }
                                if ((object5 = ((dr0_0)object5).A0.b) != null) {
                                    object5 = ((Product)object5).getFnlColorVariantData();
                                } else {
                                    n14 = 0;
                                    object5 = null;
                                }
                                Intrinsics.checkNotNull(object5);
                                object5 = ((ProductFnlColorVariantData)object5).getColorGroup();
                                ((Product)object).setCode((String)object5);
                            }
                        }
                        if ((object = ((fq0_2)object2).q) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n7 = 0;
                            object = null;
                        }
                        if ((object = ((dr0_0)object).A0.b) != null) {
                            object = g62_0.c;
                            object5 = ((fq0_2)object2).q;
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                n14 = 0;
                                object5 = null;
                            }
                            object5 = ((dr0_0)object5).A0.b;
                            Intrinsics.checkNotNull(object5);
                            object5 = DW.c((Product)object5);
                            n8 = 1000;
                            ((g62_0)object).b(object5, n8);
                            kx3_0.a = n4;
                            kx3_0.b = null;
                        }
                    } else {
                        Function0 function0 = ((fq0_2)object2).x;
                        if (function0 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            n4 = 0;
                            function0 = null;
                        }
                        function0.invoke();
                        object = ((SaveForLaterResponse)object).getStatus();
                        if (object != null) {
                            object = ((StatusNew)object).getMessageDescription();
                        } else {
                            n7 = 0;
                            object = null;
                        }
                        int n15 = 2;
                        rw_1.a(n15, (String)object);
                    }
                } else {
                    object = ((fq0_2)object2).x;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        n7 = 0;
                        object = null;
                    }
                    object.invoke();
                    rw_1.a(n4, null);
                }
                if ((object = ((fq0_2)object2).q) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n7 = 0;
                    object = null;
                }
                object = ((dr0_0)object).A0;
                ((BH3)object).b = null;
            } else {
                int n16 = ((DataCallback)object).getStatus();
                if (n16 == n4) {
                    rw_1.a(n4, null);
                    object = ((fq0_2)object2).x;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    } else {
                        object4 = object;
                    }
                    object4.invoke();
                }
            }
        }
        return Unit.a;
    }
}

