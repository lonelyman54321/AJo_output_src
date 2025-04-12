/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ProgressBar
 */
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.databinding.FragmentPlpPeekBinding;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from vj2
 */
public final class vj2_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vj2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View object) {
        int n3 = 0;
        Object object2 = null;
        Object object3 = null;
        Object object4 = "this$0";
        Object object5 = this.b;
        int n4 = 1;
        int n7 = this.a;
        switch (n7) {
            default: {
                Object object6 = nv2_2.Companion;
                object5 = (nv2_2)object5;
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                int n8 = object.getId();
                int n10 = R$id.fppIvImage;
                object6 = "pop_peek_quickaction";
                if (n8 == n10) {
                    ((DialogFragment)object5).dismissAllowingStateLoss();
                    object = ((nv2_2)object5).b;
                    Intrinsics.checkNotNull(object);
                    object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object4 = o72_0.a;
                    Object object7 = "pop_peek_details";
                    ((GTMEvents)object2).pushButtonTapEvent((String)object6, object7, (String)object4);
                    object2 = ((Fragment)object5).getActivity();
                    n3 = object2 instanceof AjioHomeActivity;
                    if (n3 == 0) return;
                    object2 = ((nv2_2)object5).f;
                    if (object2 == null) {
                        object2 = "pdpListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n4 = 0;
                        object7 = null;
                    } else {
                        object7 = object2;
                    }
                    object2 = ((lv2)object).a.getFnlColorVariantData();
                    if (object2 != null) {
                        object3 = ((ProductFnlColorVariantData)object2).getColorGroup();
                    }
                    Object object8 = object3;
                    n7 = ((lv2)object).d;
                    object2 = ((nv2_2)object5).Pa().d;
                    String string2 = ((bv2_0)object2).l();
                    String string3 = ((lv2)object).e;
                    Object var16_30 = null;
                    object7.S0(n7, (String)object3, string2, string3, null);
                    return;
                }
                n10 = R$id.fppLayoutParent;
                if (n8 == n10) {
                    ((DialogFragment)object5).dismissAllowingStateLoss();
                    return;
                }
                n10 = R$id.fppTvAddToCloset;
                if (n8 != n10 && n8 != (n10 = R$id.fppIvAddToCloset)) {
                    n10 = R$id.fppTvShare;
                    if (n8 != n10) {
                        n10 = R$id.fppIvShare;
                        if (n8 != n10) return;
                    }
                    object5.getClass();
                    object = " \n\n";
                    try {
                        object4 = AnalyticsManager.Companion;
                        object4 = ((AnalyticsManager$Companion)object4).getInstance();
                        object4 = ((AnalyticsManager)object4).getGtmEvents();
                        Object object9 = "pop_peek_share";
                        Object[] objectArray = o72_0.a;
                        ((GTMEvents)object4).pushButtonTapEvent((String)object6, object9, (String)objectArray);
                        object4 = new Ref$ObjectRef();
                        object6 = UrlHelper.Companion;
                        object6 = ((UrlHelper$Companion)object6).getInstance();
                        object9 = ((nv2_2)object5).b;
                        object9 = object9 != null && (object9 = ((lv2)object9).a) != null ? ((Product)object9).getUrl() : null;
                        ((Ref$ObjectRef)object4).element = object6 = ((UrlHelper)object6).getCompleteUrl((String)object9);
                        object6 = cp_1.Companion;
                        object6.getClass();
                        object6 = cp$a.e();
                        object9 = ((Ref$ObjectRef)object4).element;
                        object9 = (String)object9;
                        objectArray = "sharePeek";
                        object6.getClass();
                        ((Ref$ObjectRef)object4).element = object6 = cp_1.b((String)object9, (String)objectArray);
                        object6 = StringCompanionObject.INSTANCE;
                        object6 = h40_0.a;
                        object6 = ((nv2_2)object5).h;
                        if (object6 == null) {
                            object6 = "";
                        }
                        object6 = h40_0.f0((String)object6);
                        object9 = ((nv2_2)object5).b;
                        object9 = object9 != null && (object9 = ((lv2)object9).a) != null && (object9 = ((Product)object9).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object9).getBrandName() : null;
                        objectArray = ((nv2_2)object5).b;
                        if (objectArray != null && (objectArray = objectArray.a) != null) {
                            objectArray = objectArray.getName();
                        } else {
                            boolean bl2 = false;
                            objectArray = null;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)object9);
                        object9 = " ";
                        stringBuilder.append((String)object9);
                        stringBuilder.append((String)objectArray);
                        object9 = stringBuilder.toString();
                        objectArray = new Object[n4];
                        objectArray[0] = object9;
                        object2 = Arrays.copyOf(objectArray, n4);
                        object2 = String.format((String)object6, (Object[])object2);
                        Object object10 = "format(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object10);
                        object = ((String)object2).concat((String)object);
                        object2 = ((Fragment)object5).getContext();
                        if (object2 == null) {
                            ((DialogFragment)object5).dismissAllowingStateLoss();
                            return;
                        }
                        object2 = n13_0.Companion;
                        object2.getClass();
                        object2 = N13$a.a();
                        object10 = ((nv2_2)object5).b;
                        if (object10 != null && (object10 = ((lv2)object10).a) != null && (object10 = ((Product)object10).getFnlColorVariantData()) != null) {
                            object3 = ((ProductFnlColorVariantData)object10).getOutfitPictureURL();
                        }
                        object10 = ((Fragment)object5).requireContext();
                        object6 = "requireContext(...)";
                        Intrinsics.checkNotNullExpressionValue(object10, (String)object6);
                        object6 = new ov2_1((nv2_2)object5, (String)object, (Ref$ObjectRef)object4);
                        ((n13_0)object2).a((String)object3, (Context)object10, (s13_0)object6);
                        return;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                object = ih3_1.b;
                object4 = ((nv2_2)object5).b;
                if (object4 != null && (object4 = ((lv2)object4).a) != null && (object4 = ((Product)object4).getFnlColorVariantData()) != null) {
                    object4 = ((ProductFnlColorVariantData)object4).getColorGroup();
                } else {
                    n10 = 0;
                    object4 = null;
                }
                n8 = (int)(CollectionsKt.F((Iterable)object, object4) ? 1 : 0);
                n10 = 3;
                Object object11 = "productCode";
                String string4 = "plpPeekViewModel";
                int n14 = 8;
                if (n8 != 0) {
                    object = ((nv2_2)object5).b;
                    if (object != null && (object = ((lv2)object).a) != null && (object = ((Product)object).getFnlColorVariantData()) != null) {
                        object = ((ProductFnlColorVariantData)object).getColorGroup();
                    } else {
                        n8 = 0;
                        object = null;
                    }
                    object6 = ((nv2_2)object5).Oa();
                    if (object == null) return;
                    int n15 = ((String)object).length();
                    if (n15 == 0) {
                        return;
                    }
                    ProgressBar progressBar = ((FragmentPlpPeekBinding)object6).fppPbClosetLoading;
                    n15 = progressBar.getVisibility();
                    if (n15 != n14) return;
                    AppCompatImageView appCompatImageView = ((FragmentPlpPeekBinding)object6).fppIvAddToClosetSuccess;
                    n15 = appCompatImageView.getVisibility();
                    if (n15 != n14) return;
                    AppCompatImageView appCompatImageView2 = ((FragmentPlpPeekBinding)object6).fppIvAddToCloset;
                    appCompatImageView2.setVisibility(n14);
                    object6 = ((FragmentPlpPeekBinding)object6).fppPbClosetLoading;
                    object6.setVisibility(0);
                    object2 = ((nv2_2)object5).c;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object2 = null;
                    }
                    object2.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object11);
                    object5 = md3_0.c((jD3)object2);
                    object11 = new qv2_2((rv2_2)object2, (String)object, null);
                    Ae3.d((i90_0)object5, null, null, (Function2)object11, n10);
                    return;
                }
                object = ((Fragment)object5).getActivity();
                if (object == null) return;
                object = ((Fragment)object5).requireActivity();
                n8 = (int)(object.isFinishing() ? 1 : 0);
                if (n8 != 0) return;
                object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                String string5 = o72_0.a;
                String string6 = "pop_peek_closet";
                ((GTMEvents)object).pushButtonTapEvent((String)object6, string6, string5);
                object = ((nv2_2)object5).d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUserViewModel");
                    n8 = 0;
                    object = null;
                }
                if ((n8 = (int)(((hy3_0)object).p() ? 1 : 0)) == 0) {
                    object = ((nv2_2)object5).Pa().e;
                    object2 = ((nv2_2)object5).b;
                    if (object2 != null) {
                        object2 = ((lv2)object2).a;
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    ((BH3)object).b = object2;
                    ((DialogFragment)object5).dismissAllowingStateLoss();
                    object = ((nv2_2)object5).e;
                    if (object == null) {
                        object = "loginListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object3 = object;
                    }
                    object = "source - add to closet";
                    n3 = 53;
                    object3.z0(n3, (String)object);
                    return;
                }
                object = ((nv2_2)object5).b;
                Intrinsics.checkNotNull(object);
                object = ((lv2)object).a.getFnlColorVariantData();
                if (object != null) {
                    object = ((ProductFnlColorVariantData)object).getColorGroup();
                } else {
                    n8 = 0;
                    object = null;
                }
                object6 = ((nv2_2)object5).Oa();
                if (object == null) return;
                int n16 = ((String)object).length();
                if (n16 == 0) {
                    return;
                }
                ProgressBar progressBar = ((FragmentPlpPeekBinding)object6).fppPbClosetLoading;
                n16 = progressBar.getVisibility();
                if (n16 != n14) return;
                AppCompatImageView appCompatImageView = ((FragmentPlpPeekBinding)object6).fppIvAddToClosetSuccess;
                n16 = appCompatImageView.getVisibility();
                if (n16 != n14) return;
                AppCompatImageView appCompatImageView3 = ((FragmentPlpPeekBinding)object6).fppIvAddToCloset;
                appCompatImageView3.setVisibility(n14);
                object6 = ((FragmentPlpPeekBinding)object6).fppPbClosetLoading;
                object6.setVisibility(0);
                object2 = ((nv2_2)object5).Pa().d.l();
                object5 = ((nv2_2)object5).c;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    object5 = null;
                }
                object5.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object11);
                Intrinsics.checkNotNullParameter(object2, "storeId");
                object11 = md3_0.c((jD3)object5);
                object6 = new pv2_2((rv2_2)object5, (String)object, (String)object2, null);
                Ae3.d((i90_0)object11, null, null, (Function2)object6, n10);
                return;
            }
            case 0: 
        }
        object5 = (PDPVideoKYPHolder)object5;
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object = ((PDPVideoKYPHolder)object5).c;
        n3 = ((ma_2)object).r;
        object = ((ow_0)object).a(n3);
        if (object != null && (n3 = (int)(object.isPlaying() ? 1 : 0)) != 0) {
            object.pause();
        }
        int n17 = ((PDPVideoKYPHolder)object5).w();
        object2 = ((PDPVideoKYPHolder)object5).c;
        ((ma_2)object2).r = n17;
        object = ((PDPVideoKYPHolder)object5).j;
        if (object == null) {
            object = "imgReplay";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object;
        }
        ai0_2.i((View)object3);
        ((PDPVideoKYPHolder)object5).B(n4 != 0);
        ((PDPVideoKYPHolder)object5).E = n4;
    }
}

