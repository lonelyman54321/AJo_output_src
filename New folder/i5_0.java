/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$color;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.f;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import com.ril.ajio.services.data.referral.ReferrerCashData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I5
 */
public final class i5_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ i5_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        float f5 = 0.0f;
        Object object2 = null;
        int n4 = 0;
        Object object3 = null;
        Object object4 = "this$0";
        Fragment fragment = this.b;
        int n7 = 1;
        int n8 = 0;
        ArrayList arrayList = null;
        int n10 = this.a;
        object = (DataCallback)object;
        switch (n10) {
            default: {
                fragment = (f)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object4);
                Intrinsics.checkNotNullParameter(object, "referralCallBack");
                object4 = cp_1.Companion;
                int n14 = nn_2.b((cp$a)object4, (DataCallback)object);
                if (n14 != 0) {
                    n14 = ((DataCallback)object).getStatus();
                    n7 = 7;
                    n8 = -1;
                    if (n14 == 0) {
                        object = (ReferralConfigCash)((DataCallback)object).getData();
                        fragment.getClass();
                        if (object != null) {
                            float f6;
                            float f7;
                            object4 = ((ReferralConfigCash)object).getReferee();
                            if (object4 != null && (object4 = ((ReferrerCashData)object4).getTotalBonus()) != null) {
                                ((f)fragment).x = f7 = ((Number)object4).floatValue();
                            }
                            if ((object4 = ((ReferralConfigCash)object).getReferrer()) != null && (object4 = ((ReferrerCashData)object4).getTotalBonus()) != null) {
                                ((f)fragment).y = f7 = ((Number)object4).floatValue();
                            }
                            if ((object4 = ((ReferralConfigCash)object).getReferrer()) != null && (object4 = ((ReferrerCashData)object4).getTotalBonus()) != null) {
                                f7 = ((Float)object4).floatValue();
                            } else {
                                n14 = 0;
                                f7 = 0.0f;
                                object4 = null;
                            }
                            n14 = (int)((f6 = f7 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                            if (n14 > 0 && (n14 = ((f)fragment).u) > n8 && (arrayList = ((f)fragment).p) != null && n14 < (n8 = arrayList.size())) {
                                object4 = ((f)fragment).p;
                                if (object4 != null) {
                                    n4 = ((f)fragment).u;
                                    object3 = (pa2_1)((ArrayList)object4).get(n4);
                                }
                                if (object3 != null && n7 == (n14 = ((pa2_1)object3).a)) {
                                    object4 = ((f)fragment).p;
                                    if (object4 != null) {
                                        n7 = ((f)fragment).u;
                                        object4 = (pa2_1)((ArrayList)object4).remove(n7);
                                    }
                                    if ((object = ((ReferralConfigCash)object).getReferrer()) != null && (object = ((ReferrerCashData)object).getTotalBonus()) != null) {
                                        f5 = ((Float)object).floatValue();
                                    }
                                    ((pa2_1)object3).b = f5;
                                    object = ((f)fragment).p;
                                    if (object != null) {
                                        n3 = ((f)fragment).u;
                                        ((ArrayList)object).add(n3, object3);
                                    }
                                    if ((object = ((f)fragment).v) != null) {
                                        n3 = ((f)fragment).u;
                                        ((RecyclerView$f)object).notifyItemChanged(n3);
                                    }
                                }
                            }
                        }
                    } else {
                        int n15 = ((f)fragment).u;
                        if (n15 > n8 && (object2 = ((f)fragment).p) != null && n15 < (n3 = ((ArrayList)object2).size())) {
                            int n18;
                            object = ((f)fragment).p;
                            if (object != null) {
                                n3 = ((f)fragment).u;
                                object3 = object = ((ArrayList)object).get(n3);
                                object3 = (pa2_1)object;
                            }
                            if (object3 != null && n7 == (n18 = ((pa2_1)object3).a)) {
                                float f7;
                                object = ((f)fragment).p;
                                if (object != null) {
                                    n3 = ((f)fragment).u;
                                    object = (pa2_1)((ArrayList)object).remove(n3);
                                }
                                int n16 = -1082130432;
                                ((pa2_1)object3).b = f7 = -1.0f;
                                object = ((f)fragment).p;
                                if (object != null) {
                                    n3 = ((f)fragment).u;
                                    ((ArrayList)object).add(n3, object3);
                                }
                                if ((object = ((f)fragment).v) != null) {
                                    n3 = ((f)fragment).u;
                                    ((RecyclerView$f)object).notifyItemChanged(n3);
                                }
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        fragment = (k5_0)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object4);
        object4 = cp_1.Companion;
        int n16 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n16 != 0) {
            int n17;
            Object[] objectArray;
            float f8;
            float f11;
            float f14;
            Object object5;
            object4 = ((k5_0)fragment).j;
            hv3_0.s0((ShimmerFrameLayout)((Object)object4));
            n16 = ((DataCallback)object).getStatus();
            if (n16 == 0) {
                object4 = ((k5_0)fragment).n;
                object5 = "ajioWalletVM";
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n16 = 0;
                    object4 = null;
                    f14 = 0.0f;
                }
                ((wc_1)object4).j = object = (AjioWalletTransform)((DataCallback)object).getData();
                object = ((k5_0)fragment).n;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    boolean bl2 = false;
                    object = null;
                    f11 = 0.0f;
                }
                if ((object = ((wc_1)object).j) != null) {
                    f11 = ((AjioWalletTransform)object).getTotalCash();
                } else {
                    boolean bl3 = false;
                    f11 = 0.0f;
                    object = null;
                }
                ((k5_0)fragment).f = f11;
                object = ((k5_0)fragment).n;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    boolean bl4 = false;
                    object = null;
                    f11 = 0.0f;
                }
                if ((object = ((wc_1)object).j) != null) {
                    f11 = ((AjioWalletTransform)object).getTransferableCash();
                } else {
                    boolean bl5 = false;
                    f11 = 0.0f;
                    object = null;
                }
                ((k5_0)fragment).g = f11;
                object = ((k5_0)fragment).n;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    boolean bl6 = false;
                    object = null;
                    f11 = 0.0f;
                }
                if ((object = ((wc_1)object).j) != null) {
                    f5 = ((AjioWalletTransform)object).getNonTransferableCash();
                }
                ((k5_0)fragment).h = f5;
            }
            object = z40_0.Companion;
            object2 = ((k5_0)fragment).k;
            object4 = (Application)((hh3_2)object2).getValue();
            object5 = "<get-application>(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
            object.getClass();
            object = z40$a.a((Context)object4).a;
            object4 = "non_transferable_cash_enable";
            boolean bl7 = ((ao0_0)object).a((String)object4);
            String string2 = "customToolbarViewMerger";
            if (bl7) {
                object = ((k5_0)fragment).e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl8 = false;
                    object = null;
                    f11 = 0.0f;
                }
                f8 = ((k5_0)fragment).f;
                objectArray = qz2_0.x(Float.valueOf(f8));
                ((CustomToolbarViewMerger)object).setTitleText((String)objectArray);
            } else {
                object = ((k5_0)fragment).e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl9 = false;
                    object = null;
                    f11 = 0.0f;
                }
                f8 = ((k5_0)fragment).g;
                objectArray = qz2_0.x(Float.valueOf(f8));
                ((CustomToolbarViewMerger)object).setTitleText((String)objectArray);
            }
            object = h40_0.a;
            boolean bl10 = h40_0.B0();
            if (bl10) {
                object = ((k5_0)fragment).e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl11 = false;
                    object = null;
                    f11 = 0.0f;
                }
                n17 = R$string.cash_balance_cannot_be_transferred;
                objectArray = hv3_0.K(n17);
                ((CustomToolbarViewMerger)object).setSubTitleText((String)objectArray);
            } else {
                object = ((k5_0)fragment).e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl12 = false;
                    object = null;
                    f11 = 0.0f;
                }
                n17 = R$string.total_cash_balance;
                objectArray = hv3_0.K(n17);
                ((CustomToolbarViewMerger)object).setSubTitleText((String)objectArray);
            }
            object = ((k5_0)fragment).e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl13 = false;
                object = null;
                f11 = 0.0f;
            }
            ((CustomToolbarViewMerger)object).setSubTitleVisibility(0);
            object = ((k5_0)fragment).e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl14 = false;
                object = null;
                f11 = 0.0f;
            }
            int n18 = hv3_0.m(R$color.accent_color_10);
            ((CustomToolbarViewMerger)object).setSubTitleColor(n18);
            boolean bl15 = h40_0.B0();
            if (bl15) {
                ((k5_0)fragment).Pa();
            } else {
                object = (Application)((hh3_2)object2).getValue();
                Intrinsics.checkNotNullExpressionValue(object, (String)object5);
                object = z40$a.a((Context)object).a;
                boolean bl16 = ((ao0_0)object).a((String)object4);
                object2 = "cashTabLayout";
                if (bl16) {
                    FrameLayout frameLayout;
                    float f12;
                    object = ((k5_0)fragment).b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        boolean bl17 = false;
                        object = null;
                        f11 = 0.0f;
                    }
                    ((TabLayout)((Object)object)).addOnTabSelectedListener((TabLayout$OnTabSelectedListener)((Object)fragment));
                    object = ((k5_0)fragment).b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        boolean bl18 = false;
                        object = null;
                        f11 = 0.0f;
                    }
                    object.setVisibility(0);
                    object = ((k5_0)fragment).b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        boolean bl19 = false;
                        object = null;
                        f11 = 0.0f;
                    }
                    if ((object4 = ((k5_0)fragment).b) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n16 = 0;
                        object4 = null;
                        f14 = 0.0f;
                    }
                    object4 = ((TabLayout)((Object)object4)).newTab();
                    n10 = R$layout.ac_t_tab_layout;
                    object4 = ((TabLayout$Tab)object4).setCustomView(n10);
                    ((TabLayout)((Object)object)).addTab((TabLayout$Tab)object4);
                    object = ((k5_0)fragment).b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        boolean bl20 = false;
                        object = null;
                        f11 = 0.0f;
                    }
                    if ((object4 = ((k5_0)fragment).b) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n16 = 0;
                        object4 = null;
                        f14 = 0.0f;
                    }
                    object4 = ((TabLayout)((Object)object4)).newTab();
                    n10 = R$layout.ac_nt_tab_layout;
                    object4 = ((TabLayout$Tab)object4).setCustomView(n10);
                    ((TabLayout)((Object)object)).addTab((TabLayout$Tab)object4);
                    object = ((k5_0)fragment).b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        boolean bl21 = false;
                        object = null;
                        f11 = 0.0f;
                    }
                    if ((object = ((TabLayout)((Object)object)).getTabAt(n7)) != null) {
                        object = ((TabLayout$Tab)object).getCustomView();
                    } else {
                        boolean bl22 = false;
                        object = null;
                        f11 = 0.0f;
                    }
                    object4 = "null cannot be cast to non-null type android.widget.TextView";
                    Intrinsics.checkNotNull(object, (String)object4);
                    object = (TextView)object;
                    object5 = ((k5_0)fragment).b;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n10 = 0;
                        object5 = null;
                    }
                    if ((object5 = ((TabLayout)((Object)object5)).getTabAt(0)) != null) {
                        object5 = ((TabLayout$Tab)object5).getCustomView();
                    } else {
                        n10 = 0;
                        object5 = null;
                    }
                    Intrinsics.checkNotNull(object5, (String)object4);
                    object5 = (TextView)object5;
                    f14 = ((k5_0)fragment).h;
                    n18 = 1203982208;
                    float f15 = 99999.0f;
                    n17 = (int)(f14 == f15 ? 0 : (f14 > f15 ? 1 : -1));
                    if (n17 <= 0 && (n18 = (int)((f12 = (f8 = ((k5_0)fragment).g) - f15) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) <= 0) {
                        n18 = R$string.cash_non_transferable;
                        object4 = qz2_0.x(Float.valueOf(f14));
                        objectArray = new Object[n7];
                        objectArray[0] = object4;
                        object4 = hv3_0.L(n18, objectArray);
                        object.setText((CharSequence)object4);
                        int n19 = R$string.cash_transferable;
                        f14 = ((k5_0)fragment).g;
                        object4 = qz2_0.x(Float.valueOf(f14));
                        frameLayout = new Object[n7];
                        frameLayout[0] = object4;
                        object = hv3_0.L(n19, (Object[])frameLayout);
                        object5.setText((CharSequence)object);
                        int n20 = 12;
                        f11 = 1.7E-44f;
                        n8 = mz3_0.d(n20);
                    } else {
                        n18 = R$string.cash_non_transferable_ml;
                        object4 = qz2_0.x(Float.valueOf(f14));
                        objectArray = new Object[n7];
                        objectArray[0] = object4;
                        object4 = hv3_0.L(n18, objectArray);
                        object.setText((CharSequence)object4);
                        int n21 = R$string.cash_transferable_ml;
                        f14 = ((k5_0)fragment).g;
                        object4 = qz2_0.x(Float.valueOf(f14));
                        frameLayout = new Object[n7];
                        frameLayout[0] = object4;
                        object = hv3_0.L(n21, (Object[])frameLayout);
                        object5.setText((CharSequence)object);
                    }
                    object = ((k5_0)fragment).d;
                    object4 = "cashTabDataViewT";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        boolean bl23 = false;
                        object = null;
                        f11 = 0.0f;
                    }
                    object = object.getLayoutParams();
                    frameLayout = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                    Intrinsics.checkNotNull(object, (String)frameLayout);
                    object = (ConstraintLayout$LayoutParams)((Object)object);
                    ((ViewGroup.MarginLayoutParams)object).topMargin = n8;
                    object5 = ((k5_0)fragment).d;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n10 = 0;
                        object5 = null;
                    }
                    object5.setLayoutParams((ViewGroup.LayoutParams)object);
                    object = ((k5_0)fragment).c;
                    object4 = "cashTabDataViewNT";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        boolean bl24 = false;
                        object = null;
                        f11 = 0.0f;
                    }
                    object = object.getLayoutParams();
                    Intrinsics.checkNotNull(object, (String)frameLayout);
                    object = (ConstraintLayout$LayoutParams)((Object)object);
                    ((ViewGroup.MarginLayoutParams)object).topMargin = n8;
                    frameLayout = ((k5_0)fragment).c;
                    if (frameLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n7 = 0;
                        frameLayout = null;
                    }
                    frameLayout.setLayoutParams((ViewGroup.LayoutParams)object);
                    object = ((k5_0)fragment).b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = object;
                    }
                    int n22 = ((k5_0)fragment).i;
                    object = ((TabLayout)((Object)object3)).getTabAt(n22);
                    if (object != null) {
                        ((TabLayout$Tab)object).select();
                    }
                } else {
                    object = ((k5_0)fragment).b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = object;
                    }
                    int n24 = 8;
                    f11 = 1.1E-44f;
                    object3.setVisibility(n24);
                    ((k5_0)fragment).Qa();
                }
            }
        }
        return Unit.a;
    }
}

