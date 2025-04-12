/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.payment.fragment;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import kotlin.jvm.internal.Intrinsics;

public final class CheckoutFragment$b
extends RecyclerView$s {
    public final /* synthetic */ CheckoutFragment a;

    public CheckoutFragment$b(CheckoutFragment checkoutFragment) {
        this.a = checkoutFragment;
    }

    public final void onScrollStateChanged(RecyclerView object, int object2) {
        Object object3 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onScrollStateChanged((RecyclerView)object, (int)object2);
        object = this.a;
        Object object4 = ((Fragment)object).getActivity();
        if (object4 != null && (object2 = (Object)(object4 = ((Fragment)object).requireActivity()).isFinishing()) == 0) {
            int n3;
            float f5;
            object4 = ((CheckoutFragment)object).d;
            Object object5 = 0;
            float f6 = 0.0f;
            Object object6 = null;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object2 = 0;
                object4 = null;
                f5 = 0.0f;
            }
            object2 = ((RecyclerView)object4).computeVerticalScrollOffset();
            RecyclerView recyclerView = ((CheckoutFragment)object).d;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                recyclerView = null;
            }
            n3 = recyclerView.computeVerticalScrollExtent();
            RecyclerView recyclerView2 = ((CheckoutFragment)object).d;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object6 = recyclerView2;
            }
            int n4 = ((RecyclerView)object6).computeVerticalScrollRange();
            f5 = object2;
            object5 = 1120403456;
            f6 = 100.0f;
            f5 *= f6;
            float f7 = n4 - n3;
            f5 /= f7;
            object3 = ss_1.a;
            object = ((CheckoutFragment)object).z;
            object3 = "mScrollEventStatus";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            n4 = ((Object)object).length;
            n3 = 5;
            if (n4 >= n3) {
                n4 = 1;
                f7 = Float.MIN_VALUE;
                object5 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
                if (object5 >= 0) {
                    object2 = 4;
                    f5 = 5.6E-45f;
                    object5 = object[object2];
                    if (object5 == 0) {
                        object6 = "100%";
                        oT.a((String)object6);
                        object[object2] = n4;
                    }
                } else {
                    f6 = 80.0f;
                    float f8 = f5 - f6;
                    object5 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                    if (object5 >= 0) {
                        object2 = 3;
                        f5 = 4.2E-45f;
                        object5 = object[object2];
                        if (object5 == 0) {
                            object6 = "80%";
                            oT.a((String)object6);
                            object[object2] = n4;
                        }
                    } else {
                        f6 = 60.0f;
                        float f11 = f5 - f6;
                        object5 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        if (object5 >= 0) {
                            object2 = 2;
                            f5 = 2.8E-45f;
                            object5 = object[object2];
                            if (object5 == 0) {
                                object6 = "60%";
                                oT.a((String)object6);
                                object[object2] = n4;
                            }
                        } else {
                            f6 = 40.0f;
                            float f12 = f5 - f6;
                            object5 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                            if (object5 >= 0) {
                                object2 = object[n4];
                                if (object2 == 0) {
                                    object4 = "40%";
                                    oT.a((String)object4);
                                    object[n4] = n4;
                                }
                            } else {
                                object5 = 1101004800;
                                f6 = 20.0f;
                                float f14 = f5 - f6;
                                object2 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                if (object2 >= 0) {
                                    object2 = 0;
                                    f5 = 0.0f;
                                    object4 = null;
                                    object5 = object[0];
                                    if (object5 == 0) {
                                        object6 = "20%";
                                        oT.a((String)object6);
                                        object[0] = n4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

