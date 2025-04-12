/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$Tab;
import com.google.gson.JsonObject;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Home.CategoryPageDetail;
import com.ril.ajio.services.data.Home.CmsNavigationData;
import com.ril.ajio.services.data.Home.HomeCategory;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class L8
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ L8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        View view;
        View view2;
        ConstraintLayout constraintLayout;
        String string2;
        int n3;
        x9_0 x9_02;
        String string3;
        Object object2;
        block50: {
            ArrayList arrayList;
            Object object3;
            int n4;
            boolean bl2;
            void var4_56;
            int n7;
            long l2;
            Object object4;
            DataCallback dataCallback;
            int n8;
            int n10;
            block49: {
                n10 = 1;
                object2 = this.b;
                String string4 = "this$0";
                int n14 = 0;
                Object object5 = null;
                n8 = this.a;
                dataCallback = (DataCallback)object;
                switch (n8) {
                    default: {
                        void var1_6;
                        object2 = (op2_2)object2;
                        Intrinsics.checkNotNullParameter(object2, string4);
                        n10 = dataCallback.getStatus();
                        if (n10 == 0) {
                            Class<PayNowResponse> clazz;
                            String string5 = JsonUtils.toJson((JsonObject)dataCallback.getData());
                            PayNowResponse payNowResponse = (PayNowResponse)JsonUtils.fromJson(string5, clazz = PayNowResponse.class);
                            if (payNowResponse != null) {
                                Boolean bl3 = payNowResponse.isHtml();
                                object5 = Boolean.TRUE;
                                n14 = Intrinsics.areEqual(bl3, object5);
                            }
                            if (n14 != 0) {
                                zr1_1 zr1_12 = ((op2_2)object2).y;
                                object2 = DataCallback.Companion;
                                String string6 = payNowResponse.getHtml();
                                DataCallback dataCallback2 = ((DataCallback$Companion)object2).onSuccess(string6);
                                zr1_12.k(dataCallback2);
                                Unit unit = Unit.a;
                                return var1_6;
                            }
                        }
                        zr1_1 zr1_13 = ((op2_2)object2).l;
                        zr1_13.k(dataCallback);
                        Unit unit = Unit.a;
                        return var1_6;
                    }
                    case 1: {
                        CmsNavigationData cmsNavigationData;
                        cp$a cp$a;
                        object2 = (gd1_2)object2;
                        Intrinsics.checkNotNullParameter(object2, string4);
                        AjioLoaderView ajioLoaderView = ((gd1_2)object2).g;
                        if (ajioLoaderView != null) {
                            ajioLoaderView.stopLoader();
                        }
                        if ((n10 = (int)(nn_2.b(cp$a = cp_1.Companion, dataCallback) ? 1 : 0)) == 0) return Unit.a;
                        if (dataCallback == null) return Unit.a;
                        n10 = dataCallback.getStatus();
                        if (n10 != 0) return Unit.a;
                        ((gd1_2)object2).i = cmsNavigationData = (CmsNavigationData)dataCallback.getData();
                        ((gd1_2)object2).Oa();
                        return Unit.a;
                    }
                    case 0: 
                }
                object4 = q9_0.Companion;
                object2 = (q9_0)object2;
                Intrinsics.checkNotNullParameter(object2, string4);
                Object object6 = dataCallback.getData();
                l2 = 1000L;
                if (object6 == null) {
                    View view3 = ((q9_0)object2).Q1;
                    if (view3 != null) {
                        ai0_2.B(view3);
                    }
                    Looper looper = Looper.getMainLooper();
                    Handler handler = new Handler(looper);
                    b9 b94 = new b9((q9_0)object2);
                    handler.postDelayed((Runnable)b94, l2);
                    View view4 = ((q9_0)object2).x1;
                    if (view4 != null) {
                        ai0_2.i(view4);
                    }
                    ((q9_0)object2).Ta();
                    return Unit.a;
                }
                cp$a cp$a = cp_1.Companion;
                n7 = nn_2.b(cp$a, dataCallback);
                if (n7 == 0) return Unit.a;
                ShimmerFrameLayout shimmerFrameLayout = ((q9_0)object2).I;
                FrameLayout frameLayout = ((q9_0)object2).J;
                hv3_0.t0(shimmerFrameLayout, (View)frameLayout);
                n7 = dataCallback.getStatus();
                string3 = "ajiohomeViewModel";
                x9_02 = null;
                if (n7 == 0) break block49;
                if (n7 == n10) {
                    ImageView imageView;
                    FragmentActivity fragmentActivity;
                    FragmentActivity fragmentActivity2;
                    FragmentActivity fragmentActivity3;
                    FragmentActivity fragmentActivity4 = ((Fragment)object2).getActivity();
                    if (fragmentActivity4 != null && (n3 = (fragmentActivity3 = ((Fragment)object2).requireActivity()).isFinishing()) == 0 && (n3 = ((Fragment)object2).isAdded()) != 0 && (fragmentActivity2 = ((Fragment)object2).getActivity()) != null && (n3 = (fragmentActivity = ((Fragment)object2).requireActivity()).isFinishing()) == 0) {
                        void var4_53;
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        n3 = R$string.acc_error_message;
                        String string7 = hv3_0.K(n3);
                        n7 = R$string.something_wrong_msg;
                        String string8 = hv3_0.K(n7);
                        object4 = new Object[n10];
                        object4[0] = string8;
                        String string9 = xh2_0.a((Object[])object4, n10, string7, "format(...)");
                        j3_0 j3_02 = ((q9_0)object2).h;
                        if (j3_02 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                            n7 = 0;
                            Object var4_52 = null;
                        }
                        n14 = R$string.something_wrong_msg;
                        object5 = hv3_0.K(n14);
                        var4_53.t0((String)object5, string9);
                    }
                    ((q9_0)object2).Ra(n10 != 0);
                    ImageView imageView2 = ((q9_0)object2).O;
                    e8 e84 = ((q9_0)object2).O2;
                    if (imageView2 != null) {
                        imageView2.setOnClickListener((View.OnClickListener)e84);
                    }
                    if ((imageView = ((q9_0)object2).P) != null) {
                        imageView.setOnClickListener((View.OnClickListener)e84);
                    }
                }
                break block50;
            }
            x9_0 x9_03 = ((q9_0)object2).X;
            if (x9_03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n7 = 0;
                Object var4_55 = null;
            }
            Object object7 = dataCallback.getData();
            Intrinsics.checkNotNull(object7);
            HomeCategory homeCategory = (HomeCategory)object7;
            var4_56.getClass();
            Intrinsics.checkNotNullParameter(homeCategory, "homeCategory");
            Object object8 = homeCategory.getPageDetails();
            Object object9 = "iterator(...)";
            if (object8 != null) {
                Iterator iterator = homeCategory.getPageDetails().iterator();
                Intrinsics.checkNotNullExpressionValue(iterator, (String)object9);
                while (bl2 = iterator.hasNext()) {
                    ArrayList arrayList2;
                    object8 = (CategoryPageDetail)iterator.next();
                    String string10 = ((CategoryPageDetail)object8).getPosition();
                    if (string10 == null || (n4 = string10.equalsIgnoreCase((String)(object3 = "Section2"))) != n10 || (arrayList2 = ((CategoryPageDetail)object8).getNativeCategoryNavigationListDetails()) == null) continue;
                    ArrayList arrayList3 = ((CategoryPageDetail)object8).getNativeCategoryNavigationListDetails();
                    Intrinsics.checkNotNull(arrayList3);
                    var4_56.D = arrayList3;
                    break;
                }
            }
            if ((arrayList = var4_56.D) == null) {
                void var1_34;
                View view5 = ((q9_0)object2).Q1;
                if (view5 != null) {
                    ai0_2.B(view5);
                }
                Looper looper = Looper.getMainLooper();
                Handler handler = new Handler(looper);
                h9 h92 = new h9(object2, 0);
                handler.postDelayed((Runnable)h92, l2);
                View view6 = ((q9_0)object2).x1;
                if (view6 != null) {
                    ai0_2.i(view6);
                }
                ((q9_0)object2).Ta();
                jo_2 jo_22 = ((q9_0)object2).S0;
                if (jo_22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                    n3 = 0;
                    Object var1_33 = null;
                }
                String string11 = "LUXE_CMS_CATEGORY_RESPONSE";
                String string12 = "";
                var1_34.putPreference(string11, string12);
            } else {
                TabLayout tabLayout;
                void var4_68;
                TabLayout tabLayout2;
                TabLayout tabLayout3;
                Object object10;
                int n15;
                void var4_59;
                x9_0 x9_04 = ((q9_0)object2).X;
                if (x9_04 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n7 = 0;
                    Object var4_58 = null;
                }
                if ((n7 = (int)(var4_59.t ? 1 : 0)) != 0) {
                    void var4_62;
                    x9_0 x9_05 = ((q9_0)object2).X;
                    if (x9_05 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n7 = 0;
                        Object var4_61 = null;
                    }
                    var4_62.getClass();
                    Intrinsics.checkNotNullParameter(arrayList, "categories");
                    object4 = arrayList.iterator();
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object9);
                    while ((n15 = object4.hasNext()) != 0) {
                        object10 = object4.next();
                        object8 = "next(...)";
                        Intrinsics.checkNotNullExpressionValue(object10, (String)object8);
                        bl2 = ((NativeCategoryNavigationListDetail)(object10 = (NativeCategoryNavigationListDetail)object10)).getDefaultNode();
                        if (!bl2 || (object8 = var4_62.y) != null) continue;
                        var4_62.y = object10;
                        object4.remove();
                    }
                }
                if ((tabLayout3 = ((q9_0)object2).G) != null) {
                    tabLayout3.removeAllTabs();
                }
                if ((tabLayout2 = ((q9_0)object2).G) != null) {
                    View view7 = tabLayout2.getChildAt(0);
                } else {
                    n7 = 0;
                    Object var4_67 = null;
                }
                if (var4_68 != null && (n8 = var4_68 instanceof LinearLayout) != 0) {
                    LinearLayout linearLayout = (LinearLayout)var4_68;
                    linearLayout.setShowDividers(2);
                    n8 = R$drawable.luxe_tab_separator;
                    object4 = hv3_0.r(n8);
                    n15 = 8;
                    linearLayout.setDividerPadding(n15);
                    linearLayout.setDividerDrawable((Drawable)object4);
                }
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                n8 = arrayList.size();
                object10 = null;
                bl2 = false;
                object8 = null;
                for (n15 = 0; n15 < n8; n15 += n10) {
                    void var19_120;
                    String string13;
                    boolean bl4;
                    void var19_116;
                    String string14;
                    void var19_113;
                    int n16;
                    TabLayout$Tab tabLayout$Tab;
                    object9 = arrayList.get(n15);
                    Intrinsics.checkNotNullExpressionValue(object9, "get(...)");
                    object9 = (NativeCategoryNavigationListDetail)object9;
                    String string15 = ((NativeCategoryNavigationListDetail)object9).getNativeCategoryType();
                    if (string15 == null || (n4 = (int)(string15.equalsIgnoreCase((String)(object3 = "core")) ? 1 : 0)) != n10) continue;
                    TabLayout tabLayout4 = ((q9_0)object2).G;
                    if (tabLayout4 != null && (tabLayout$Tab = tabLayout4.newTab()) != null) {
                        n16 = R$layout.tab_home_category_luxe;
                        TabLayout$Tab tabLayout$Tab2 = tabLayout$Tab.setCustomView(n16);
                    } else {
                        n4 = 0;
                        Object var19_112 = null;
                    }
                    if (var19_113 == null) continue;
                    object3 = ((NativeCategoryNavigationListDetail)object9).getInactiveAltText();
                    if (object3 == null) {
                        object3 = ((NativeCategoryNavigationListDetail)object9).getNativeCategoryName();
                    }
                    var19_113.setContentDescription((CharSequence)object3);
                    object3 = var19_113.getCustomView();
                    if (object3 != null) {
                        int n17 = R$id.tvTabTitle;
                        object3 = (TextView)object3.findViewById(n17);
                    } else {
                        n16 = 0;
                        object3 = null;
                    }
                    if (object3 != null) {
                        String string16 = ((NativeCategoryNavigationListDetail)object9).getNativeCategoryName();
                        object3.setText((CharSequence)string16);
                    }
                    if ((object3 = ((q9_0)object2).G) != null) {
                        ((TabLayout)((Object)object3)).addTab((TabLayout$Tab)var19_113);
                    }
                    if (bl2) continue;
                    x9_0 x9_06 = ((q9_0)object2).X;
                    if (x9_06 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n4 = 0;
                        Object var19_115 = null;
                    }
                    if ((n4 = (int)(TextUtils.isEmpty((CharSequence)(string14 = var19_116.r)) ? 1 : 0)) != 0) continue;
                    object9 = ((NativeCategoryNavigationListDetail)object9).getNativeCategoryPageId();
                    x9_0 x9_07 = ((q9_0)object2).X;
                    if (x9_07 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n4 = 0;
                        Object var19_119 = null;
                    }
                    if (!(bl4 = kotlin.text.b.i((String)object9, string13 = var19_120.r, n10 != 0))) continue;
                    ref$IntRef.element = n15;
                    bl2 = true;
                }
                TabLayout tabLayout5 = ((q9_0)object2).G;
                if (tabLayout5 != null) {
                    q9$b q9$b = ((q9_0)object2).N2;
                    tabLayout5.addOnTabSelectedListener(q9$b);
                }
                if ((tabLayout = ((q9_0)object2).G) != null) {
                    i9 i92 = new i9(0, object2, ref$IntRef);
                    tabLayout.post(i92);
                }
            }
        }
        n3 = h40_0.Q1();
        if (n3 == 0) return Unit.a;
        String string17 = od3_2.a();
        n3 = Intrinsics.areEqual(string17, string2 = ld3_2.STORE_LUXE.getStoreId());
        if (n3 == 0) return Unit.a;
        x9_0 x9_08 = ((q9_0)object2).X;
        if (x9_08 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
        } else {
            x9_02 = x9_08;
        }
        n3 = x9_02.t;
        if (n3 == 0) return Unit.a;
        ConstraintLayout constraintLayout2 = ((q9_0)object2).D;
        if (constraintLayout2 != null) {
            ai0_2.B((View)constraintLayout2);
        }
        if ((constraintLayout = ((q9_0)object2).C) != null) {
            ai0_2.i((View)constraintLayout);
        }
        if ((view2 = ((q9_0)object2).E) != null) {
            ai0_2.i(view2);
        }
        if ((view = ((q9_0)object2).F) == null) return Unit.a;
        ai0_2.B(view);
        return Unit.a;
    }
}

