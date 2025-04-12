/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.provider.Settings$Secure
 *  android.text.InputFilter
 *  android.text.InputFilter$LengthFilter
 *  android.text.SpannableStringBuilder
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 */
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Order.UserSubRating;
import com.ril.ajio.services.data.ratings.DeviceInfo;
import com.ril.ajio.services.data.ratings.ImageModel;
import com.ril.ajio.services.data.ratings.Question;
import com.ril.ajio.services.data.ratings.RatingQueryParamters;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.ril.ajio.services.data.ratings.RatingsQuestionsResponseModel;
import com.ril.ajio.services.data.ratings.RatingsRequestBody;
import com.ril.ajio.services.data.ratings.ResponseOption;
import com.ril.ajio.services.data.ratings.ReviewModel;
import com.ril.ajio.services.data.ratings.ReviewQueryParamters;
import com.ril.ajio.services.data.ratings.SubRating;
import com.ril.ajio.services.data.ratings.SubRatingRequestBody;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.RatingsApi;
import com.ril.ajio.services.utils.ServiceUtil;
import com.willy.ratingbar.BaseRatingBar;
import com.willy.ratingbar.BaseRatingBar$a;
import com.willy.ratingbar.ScaleRatingBar;
import io.reactivex.Scheduler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/*
 * Renamed from wD2
 */
public final class wd2_0
extends BottomSheetDialogFragment
implements View.OnClickListener,
JU2,
J82 {
    public static final wD2$a Companion;
    public AjioTextView A;
    public AjioTextView B;
    public LinearLayout C;
    public EditText D;
    public TextView E;
    public ImageView F;
    public AjioTextView G;
    public LinearLayout H;
    public RecyclerView I;
    public AjioTextView J;
    public nD2 K;
    public AjioTextView L;
    public PO2 M;
    public ArrayList N;
    public View O;
    public View P;
    public boolean Q;
    public final hh3_2 R;
    public ty2_2 S;
    public AjioTextView T;
    public AjioTextView U;
    public final Map X;
    public TextView Y;
    public gE2 a;
    public RatingsModel b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public AjioRoundedCornerImageView f;
    public TextView g;
    public ScaleRatingBar h;
    public RecyclerView i;
    public AjioTextView j;
    public AjioTextView k;
    public final ArrayList l;
    public TextView m;
    public TextView n;
    public ShimmerFrameLayout o;
    public LinearLayout p;
    public Float q;
    public final UserInformation r;
    public ArrayList s;
    public String t;
    public NestedScrollView u;
    public TextView v;
    public ImageView w;
    public AjioTextView x;
    public AjioTextView y;
    public LinearLayout z;

    static {
        wD2$a wD2$a;
        Companion = wD2$a = new Object();
    }

    public wd2_0() {
        Map map2 = new Map();
        this.l = map2;
        map2 = VX0.a(AJIOApplication.Companion);
        this.r = map2;
        this.t = "CREATE";
        map2 = new Map();
        this.N = map2;
        map2 = new Map();
        map2 = yr1_2.b((Function0)((Object)map2));
        this.R = map2;
        map2 = new Map();
        this.X = map2 = Collections.synchronizedMap(map2);
    }

    public final void L0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "uploadImageAttributes");
        this.Oa(arrayList);
    }

    public final void Oa(ArrayList object) {
        this.N.addAll(object);
        this.Ya();
        object = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object, "getViewLifecycleOwner(...)");
        object = nu1_0.a((mu1_1)object);
        CD2 cD2 = new CD2(this, null);
        Ae3.d((i90_0)object, null, null, cD2, 3);
    }

    public final SubRatingRequestBody Pa() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = this.r.getCustomerUUID();
        int n3 = 1;
        SubRatingRequestBody subRatingRequestBody = new SubRatingRequestBody(null, (String)object, n3, null);
        object = this.l;
        if (object != null && (n3 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
            arrayList = new ArrayList<Object>();
            if (object != null) {
                object = object.iterator();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    Object object2 = (RatingsQuestionsResponseModel)object.next();
                    Object object3 = this.b;
                    Object object4 = object3 != null ? (object3 = ((RatingsModel)object3).getSkuId()) : null;
                    Integer n4 = ((RatingsQuestionsResponseModel)object2).getQuestionId();
                    Integer n7 = ((RatingsQuestionsResponseModel)object2).getResponseId();
                    int n8 = 3;
                    object2 = new SubRating(null, null, n4, (String)object4, n7, n8, null);
                    arrayList.add(object2);
                }
            }
        }
        subRatingRequestBody.setSubRatings(arrayList);
        return subRatingRequestBody;
    }

    public final int Qa(String string2) {
        boolean bl2;
        Iterator iterator = this.N.iterator();
        int n3 = -1;
        int n4 = 0;
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            int n7 = n4 + 1;
            if (n4 >= 0) {
                bl2 = Intrinsics.areEqual(object = ((UploadImageAttributes)object).getId(), string2);
                if (bl2) {
                    n3 = n4;
                }
                n4 = n7;
                continue;
            }
            xx_2.n();
            throw null;
        }
        return n3;
    }

    public final void Ra(boolean bl2) {
        UploadImageAttributes uploadImageAttributes;
        wd2_0 wd2_02 = this;
        int n3 = 4091;
        int n4 = 0;
        boolean bl3 = false;
        String string2 = null;
        String string3 = "ADD_IMAGE";
        Object object = uploadImageAttributes;
        UploadImageAttributes uploadImageAttributes2 = uploadImageAttributes;
        uploadImageAttributes = null;
        ((UploadImageAttributes)object)(null, null, string3, null, false, null, 0, null, null, null, false, null, n3, null);
        object = this.N.iterator();
        Object object2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        while ((n4 = object.hasNext()) != 0) {
            object2 = object.next();
            Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
            n4 = Intrinsics.areEqual(object2 = ((UploadImageAttributes)object2).getViewType(), string2 = "ADD_IMAGE");
            if (n4 == 0) continue;
            object.remove();
        }
        object = wd2_02.N.iterator();
        n4 = 0;
        object2 = null;
        while (bl3 = object.hasNext()) {
            string2 = ((UploadImageAttributes)object.next()).getViewType();
            bl3 = Intrinsics.areEqual(string2, string3 = "REVIEW_IMAGE");
            if (!bl3) continue;
            ++n4;
        }
        int n7 = 5;
        if (n4 < n7) {
            object = wd2_02.N;
            object2 = uploadImageAttributes2;
            ((ArrayList)object).add(uploadImageAttributes2);
            if (bl2 && (object = wd2_02.M) != null) {
                object2 = wd2_02.N;
                n4 = ((ArrayList)object2).size() + -1;
                ((RecyclerView$f)object).notifyItemInserted(n4);
            }
        }
    }

    public final void Sa() {
        boolean bl2;
        Object object = this.getActivity();
        if (object != null && !(bl2 = object.isFinishing()) && !(bl2 = this.isRemoving())) {
            object = this.getView();
            if (object != null) {
                ai0_2.j((View)object);
            }
            cp_1.Companion.getClass();
            object = cp$a.e();
            Object object2 = this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object2, "getChildFragmentManager(...)");
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "childFragmentManager");
            String string2 = "ImageSearchBottomSheetFragment";
            Intrinsics.checkNotNullParameter(string2, "tag");
            object = ((FragmentManager)object2).E(string2);
            if (object == null) {
                object = ue1_2.Companion;
                object2 = this.b;
                object.getClass();
                Intrinsics.checkNotNullParameter(this, "searchBarCameraListener");
                String string3 = "RATINGS_REVIEW_PAGE";
                Intrinsics.checkNotNullParameter(string3, "sourcePage");
                object = new ue1_2();
                ((ue1_2)object).h = this;
                ((ue1_2)object).i = string3;
                ((ue1_2)object).j = object2;
                object2 = this.getChildFragmentManager();
                ((DialogFragment)object).show((FragmentManager)object2, string2);
            }
        }
    }

    public final void Ta() {
        Object object = this.X;
        ArrayList<Object> arrayList = object.values();
        boolean bl2 = arrayList.isEmpty() ^ true;
        if (bl2) {
            Object object2;
            Object object3;
            boolean bl3;
            object = object.values();
            arrayList = new ArrayList<Object>();
            object = (Iterable)object;
            Object object4 = new ArrayList();
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                String string2;
                boolean bl4;
                boolean bl5;
                object2 = object3 = object.next();
                object2 = (UploadImageAttributes)object3;
                if (object2 == null || (bl5 = ((UploadImageAttributes)object2).isImageLinkedToReview()) || !(bl4 = Intrinsics.areEqual(object2 = ((UploadImageAttributes)object2).getViewType(), string2 = "REVIEW_IMAGE"))) continue;
                object4.add(object3);
            }
            object = object4.iterator();
            object4 = "";
            while (bl3 = object.hasNext()) {
                object3 = (UploadImageAttributes)object.next();
                if (object3 != null && (object2 = ((UploadImageAttributes)object3).getImageId()) != null) {
                    long l2 = ((Number)object2).longValue();
                    object2 = String.valueOf(l2);
                    arrayList.add(object2);
                }
                if (object3 == null || (object3 = ((UploadImageAttributes)object3).getReviewId()) == null) continue;
                long l3 = ((Number)object3).longValue();
                object4 = String.valueOf(l3);
            }
            boolean bl6 = arrayList.isEmpty() ^ true;
            if (bl6 && (object = this.a) != null) {
                ((gE2)object).b((String)object4, arrayList);
            }
        }
    }

    public final void Ua(int n3) {
        boolean bl2;
        int n4;
        wd2_0 wd2_02 = this;
        int bl3 = n3;
        Object object = LD2.a;
        object = this.b;
        Object object2 = null;
        object = object != null ? ((RatingsModel)object).getOrderId() : null;
        Object object3 = wd2_02.b;
        if (object3 != null) {
            object3 = ((RatingsModel)object3).getSkuId();
        } else {
            n4 = 0;
            object3 = null;
        }
        Object object4 = wd2_02.b;
        if (object4 != null) {
            object4 = ((RatingsModel)object4).getBrandName();
        } else {
            bl2 = false;
            object4 = null;
        }
        Object object5 = wd2_02.b;
        object5 = object5 != null ? ((RatingsModel)object5).getProductBrick() : null;
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string2 = av_0.a(analyticsManager$Companion);
        String string3 = av_0.a(analyticsManager$Companion);
        String string4 = bv_0.a(analyticsManager$Companion);
        Bundle bundle = LD2.a((String)object, (String)object3, (String)object4, (String)object5);
        String string5 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp newCustomEventsRevamp = LD2.a;
        int n7 = 1536;
        String string6 = "reviews & ratings interactions";
        String string7 = "Add a photo";
        String string8 = "image upload cancel";
        String string9 = "reviews_rating_interactions";
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string6, string7, string8, string9, string2, string3, string4, bundle, string5, false, null, n7, null);
        wd2_02.N.remove(bl3);
        object = wd2_02.M;
        if (object != null) {
            ((RecyclerView$f)object).notifyItemRemoved(bl3);
        }
        if ((object = wd2_02.M) != null) {
            object3 = wd2_02.N;
            n4 = ((ArrayList)object3).size();
            ((RecyclerView$f)object).notifyItemRangeChanged(bl3, n4);
        }
        boolean bl4 = true;
        wd2_02.Ra(bl4);
        object = wd2_02.N.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object4 = object3 = object.next();
            object4 = ((UploadImageAttributes)object3).getViewType();
            bl2 = Intrinsics.areEqual(object4, object5 = "REVIEW_IMAGE");
            if (!bl2) continue;
            object2 = object3;
            break;
        }
        if ((object2 = (UploadImageAttributes)object2) == null) {
            object = null;
            wd2_02.hb(false, bl4);
        }
    }

    public final void V7(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "uploadImageAttributes");
        this.Oa(arrayList);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Va() {
        block8: {
            Object object;
            String string2;
            Object object2;
            block11: {
                boolean bl2;
                block9: {
                    block10: {
                        int n3;
                        object2 = this.b;
                        string2 = null;
                        if (object2 != null) {
                            object2 = ((RatingsModel)object2).getSourcePage();
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        if (object2 == null) break block8;
                        int n4 = ((String)object2).hashCode();
                        if (n4 == (n3 = -1241485741)) break block9;
                        n3 = 79068;
                        if (n4 == n3) break block10;
                        n3 = 134260241;
                        if (n4 == n3 && (bl2 = ((String)object2).equals(object = "ORDER_DETAILS"))) break block11;
                        break block8;
                    }
                    object = "PDP";
                    bl2 = ((String)object2).equals(object);
                    if (!bl2) break block8;
                    break block11;
                }
                object = "ORDER_LISTING";
                bl2 = ((String)object2).equals(object);
                if (!bl2) break block8;
            }
            if ((object2 = this.b) != null && (object2 = ((RatingsModel)object2).getSourcePage()) != null) {
                object = GD2.Companion;
                RatingsModel ratingsModel = this.b;
                if (ratingsModel != null) {
                    string2 = ratingsModel.getStoreId();
                }
                object.getClass();
                Intrinsics.checkNotNullParameter(object2, "pageSource");
                object = new GD2();
                ratingsModel = new Bundle();
                String string3 = "RATING_PAGE_SOURCE";
                ratingsModel.putString(string3, (String)object2);
                ratingsModel.putString("STORE_ID", string2);
                ((Fragment)object).setArguments((Bundle)ratingsModel);
                object2 = this.getActivity();
                if (object2 != null && (object2 = ((FragmentActivity)object2).getSupportFragmentManager()) != null) {
                    string2 = "RatingFeedbackFragment";
                    ((DialogFragment)object).show((FragmentManager)object2, string2);
                }
            }
            this.dismiss();
            return;
        }
        this.dismiss();
    }

    public final void Wa() {
        boolean bl2;
        Object object = this.s;
        if (object != null && !(bl2 = object.isEmpty())) {
            object = this.p;
            boolean bl3 = false;
            if (object != null) {
                object.setVisibility(0);
            }
            if ((object = this.i) != null) {
                object.setVisibility(0);
            }
            this.gb();
        } else {
            object = this.i;
            int n3 = 8;
            if (object != null) {
                object.setVisibility(n3);
            }
            if ((object = this.p) != null) {
                object.setVisibility(n3);
            }
        }
    }

    public final void Xa(String string2) {
        String string3 = "/500";
        string2 = Ft2.a(string2, string3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)string2);
        string2 = this.E;
        if (string2 != null) {
            string2.setText((CharSequence)spannableStringBuilder);
        }
    }

    public final void Ya() {
        Object object;
        Object object2;
        String string2;
        boolean bl2;
        Object object3 = this.N;
        Object object4 = new ArrayList();
        object3 = ((ArrayList)object3).iterator();
        while (true) {
            bl2 = object3.hasNext();
            string2 = "REVIEW_IMAGE";
            if (!bl2) break;
            object = object2 = object3.next();
            object = ((UploadImageAttributes)object2).getViewType();
            boolean bl3 = Intrinsics.areEqual(object, string2);
            if (!bl3) continue;
            ((ArrayList)object4).add(object2);
        }
        int n3 = ((ArrayList)object4).size();
        bl2 = false;
        object2 = null;
        int n4 = 5;
        if (n3 <= n4) {
            object3 = yn3_0.a;
            object4 = "No modification needed";
            object = new Object[]{};
            ((yn3$a)object3).a((String)object4, object);
        } else {
            boolean bl4;
            object3 = new ArrayList();
            object4 = ((ArrayList)object4).iterator();
            int n7 = 0;
            String string3 = null;
            while (bl4 = object4.hasNext()) {
                Object object5 = object4.next();
                int n8 = n7 + 1;
                if (n7 >= 0) {
                    object5 = (UploadImageAttributes)object5;
                    if (n7 < n4) {
                        ((ArrayList)object3).add(object5);
                    }
                    n7 = n8;
                    continue;
                }
                xx_2.n();
                throw null;
            }
            object4 = this.N.iterator();
            object = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object4, object);
            while ((n4 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object = object4.next();
                string3 = "next(...)";
                Intrinsics.checkNotNullExpressionValue(object, string3);
                n4 = Intrinsics.areEqual(object = ((UploadImageAttributes)object).getViewType(), string2);
                if (n4 == 0) continue;
                object4.remove();
            }
            this.N = object3;
        }
        this.Ra(false);
        object3 = this.N;
        int n10 = object3 instanceof Collection;
        n4 = 1;
        if (n10 == 0 || (n10 = object3.isEmpty()) == 0) {
            object3 = object3.iterator();
            while ((n10 = object3.hasNext()) != 0) {
                object4 = ((UploadImageAttributes)object3.next()).getViewType();
                n10 = Intrinsics.areEqual(object4, string2);
                if (n10 == 0) continue;
                this.hb(n4 != 0, false);
                this.M = object3 = new RecyclerView$f();
                ((PO2)object3).d = object4 = this.N;
                object4 = this.I;
                if (object4 != null) {
                    ((RecyclerView)object4).setAdapter((RecyclerView$f)object3);
                }
                if ((object3 = this.M) != null) {
                    object4 = new zD2(this);
                    object2 = "deleteClickListener";
                    Intrinsics.checkNotNullParameter(object4, object2);
                    ((PO2)object3).a = object4;
                }
                object3 = this.M;
                object4 = "addClickListener";
                if (object3 != null) {
                    object2 = new Object(this);
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    ((PO2)object3).b = object2;
                }
                if ((object3 = this.M) != null) {
                    object2 = new Object(this);
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    ((PO2)object3).c = object2;
                }
                if ((object3 = this.I) != null) {
                    object4 = this.N;
                    n10 = ((ArrayList)object4).size() - n4;
                    ((RecyclerView)object3).scrollToPosition(n10);
                }
                break;
            }
        } else {
            this.hb(false, n4 != 0);
        }
    }

    public final void Za() {
        Object object = this.y;
        int n3 = 8;
        if (object != null) {
            object.setVisibility(n3);
        }
        if ((object = this.z) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.x) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.I) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.G) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.L) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.C) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.H) != null) {
            object.setVisibility(n3);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void ab() {
        int n3;
        Object object;
        block17: {
            SpannableStringBuilder spannableStringBuilder;
            int n4;
            Object object2;
            this.t = "EXPANDED_VIEW";
            object = this.y;
            n3 = 8;
            if (object != null) {
                object.setVisibility(n3);
            }
            if ((object = this.x) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.z) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.G) != null) {
                object.setVisibility(0);
            }
            if ((object = this.L) != null) {
                object.setVisibility(0);
            }
            if ((object = this.C) != null) {
                object.setVisibility(0);
            }
            if ((object = this.H) != null) {
                object.setVisibility(0);
            }
            if ((object = this.J) != null) {
                object.setVisibility(0);
            }
            if ((object = this.F) != null) {
                object.setVisibility(0);
            }
            object = " ";
            Object object3 = h40_0.a;
            object3 = h40_0.m0();
            boolean bl2 = object3.has(object2 = "reviewDisclaimerMsgVisiblity");
            if (bl2) {
                n4 = object3.getBoolean(object2);
            } else {
                n4 = 0;
                object3 = null;
            }
            if (n4 == 0) {
                object = this.Y;
                if (object == null) return;
                object.setVisibility(n3);
                return;
            }
            try {
                object3 = new yD2(this);
                object2 = new xD2(this);
                spannableStringBuilder = new SpannableStringBuilder();
                int n7 = R$string.review_disclaimer_msg;
                String string2 = this.getString(n7);
                spannableStringBuilder.append((CharSequence)string2);
                spannableStringBuilder.append((CharSequence)object);
                n7 = spannableStringBuilder.length();
                int n8 = R$string.review_terms_of_use;
                String string3 = this.getString(n8);
                String string4 = "getString(...)";
                Intrinsics.checkNotNullExpressionValue(string3, string4);
                int n10 = R$string.review_terms_of_use;
                string4 = this.getString(n10);
                spannableStringBuilder.append((CharSequence)string4);
                n8 = string3.length() + n7;
                n10 = 33;
                spannableStringBuilder.setSpan(object3, n7, n8, n10);
                spannableStringBuilder.append((CharSequence)object);
                n4 = R$string.and;
                object3 = this.getString(n4);
                spannableStringBuilder.append((CharSequence)object3);
                spannableStringBuilder.append((CharSequence)object);
                int n14 = spannableStringBuilder.length();
                n4 = R$string.review_privacy_policy;
                object3 = this.getString(n4);
                spannableStringBuilder.append((CharSequence)object3);
                n4 = spannableStringBuilder.length();
                n7 = 18;
                spannableStringBuilder.setSpan(object2, n14, n4, n7);
                object = this.Y;
                if (object != null) {
                    object3 = LinkMovementMethod.getInstance();
                    object.setMovementMethod((MovementMethod)object3);
                }
            }
            catch (Exception exception) {
                break block17;
            }
            {
                if ((object = this.Y) != null) {
                    object3 = TextView.BufferType.SPANNABLE;
                    object.setText((CharSequence)spannableStringBuilder, (TextView.BufferType)object3);
                }
                if ((object = this.Y) == null) return;
                object.setVisibility(0);
                return;
            }
        }
        object = this.Y;
        if (object == null) return;
        object.setVisibility(n3);
    }

    public final void bb() {
        Object object = this.m;
        int n3 = 8;
        if (object != null) {
            object.setVisibility(n3);
        }
        if ((object = this.n) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.p) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.i) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.h) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.g) != null) {
            object.setVisibility(n3);
        }
        if ((object = this.v) != null) {
            object.setVisibility(n3);
        }
    }

    public final boolean cb() {
        boolean bl2;
        Object object = this.b;
        if (object != null) {
            object = ((RatingsModel)object).getSourcePage();
        } else {
            bl2 = false;
            object = null;
        }
        String string2 = "PDP";
        bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            object = h40_0.a;
            bl2 = h40_0.F1();
        } else {
            bl2 = h40_0.l2();
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public final void db() {
        block21: {
            block22: {
                var1_1 = this;
                var2_2 = new ArrayList();
                var3_3 = this.s;
                if (var3_3 == null || (var4_4 = var3_3.isEmpty()) != 0) ** GOTO lbl-1000
                var3_3 = this.s;
                if (var3_3 != null) {
                    var3_3 = var3_3.iterator();
                    while ((var5_5 = var3_3.hasNext()) != 0) {
                        var6_6 = ((Question)var3_3.next()).getTitle();
                        if (var6_6 == null) continue;
                        var2_2.add(var6_6);
                    }
                }
                var7_7 = 0;
                var8_8 = null;
                var9_9 = false;
                var10_10 = null;
                var4_4 = 0;
                var3_3 = null;
                var5_5 = 0;
                var6_6 = null;
                var11_11 = 63;
                if ((var2_2 = CollectionsKt.R((Iterable)var2_2, null, null, null, null, var11_11)) == null) {
                    var2_2 = "";
                }
                if ((var4_4 = var2_2.length()) != 0) {
                    var3_3 = "SR - Success|";
                    var2_2 = var3_3.concat((String)var2_2);
                } else lbl-1000:
                // 2 sources

                {
                    var2_2 = "SR - Success";
                }
                var3_3 = new ArrayList();
                var6_6 = var1_1.s;
                var12_12 = null;
                if (var6_6 == null || (var5_5 = var6_6.isEmpty()) != 0) break block21;
                var6_6 = var1_1.s;
                if (var6_6 == null) break block22;
                var6_6 = var6_6.iterator();
                while ((var7_7 = var6_6.hasNext()) != 0) {
                    block24: {
                        block23: {
                            block20: {
                                var8_8 = (Question)var6_6.next();
                                var10_10 = var1_1.l;
                                if (var10_10 == null) break block23;
                                var10_10 = var10_10.iterator();
                                while ((var11_11 = (int)var10_10.hasNext()) != 0) {
                                    var14_14 = var13_13 = var10_10.next();
                                    var14_14 = ((RatingsQuestionsResponseModel)var13_13).getQuestionId();
                                    var16_16 = (int)Intrinsics.areEqual(var14_14, var15_15 = var8_8.getQuestionId());
                                    if (var16_16 == 0) continue;
                                    break block20;
                                }
                                var11_11 = 0;
                                var13_13 = null;
                            }
                            var13_13 = (RatingsQuestionsResponseModel)var13_13;
                            if (var13_13 != null && (var8_8 = var13_13.getResponseText()) != null) break block24;
                        }
                        var8_8 = "-1";
                    }
                    var3_3.add(var8_8);
                }
            }
            var6_6 = "sub";
            var3_3.add(var6_6);
        }
        if ((var5_5 = this.cb()) != 0) {
            var6_6 = var1_1.N;
            var8_8 = new ArrayList();
            var6_6 = var6_6.iterator();
            while (var9_9 = var6_6.hasNext()) {
                var10_10 = var6_6.next();
                var13_13 = var10_10;
                var13_13 = ((UploadImageAttributes)var10_10).getViewType();
                var11_11 = (int)Intrinsics.areEqual(var13_13, var14_14 = "REVIEW_IMAGE");
                if (var11_11 == 0) continue;
                var8_8.add(var10_10);
            }
            var5_5 = var8_8.isEmpty();
            if (var5_5 == 0) {
                var6_6 = "img";
                var3_3.add(var6_6);
            }
            var6_6 = "text";
            var3_3.add(var6_6);
        }
        var9_9 = false;
        var10_10 = null;
        var11_11 = 0;
        var13_13 = null;
        var6_6 = null;
        var8_8 = null;
        var16_16 = 63;
        var5_5 = (var3_3 = CollectionsKt.R((Iterable)var3_3, null, null, null, null, var16_16)).length();
        if (var5_5 > (var7_7 = 100)) {
            var5_5 = 100;
        }
        var9_9 = false;
        var10_10 = null;
        var3_3 = var3_3.substring(0, var5_5);
        var6_6 = "substring(...)";
        Intrinsics.checkNotNullExpressionValue(var3_3, (String)var6_6);
        var11_11 = var2_2.length();
        if (var11_11 <= var7_7) {
            var7_7 = var11_11;
        }
        var17_17 = var2_2.substring(0, var7_7);
        Intrinsics.checkNotNullExpressionValue(var17_17, (String)var6_6);
        var2_2 = LD2.a;
        var18_18 = kp1_0.c("submit| ", (String)var3_3);
        var2_2 = var1_1.b;
        var2_2 = var2_2 != null ? var2_2.getOrderId() : null;
        var3_3 = var1_1.b;
        if (var3_3 != null) {
            var3_3 = var3_3.getSkuId();
        } else {
            var4_4 = 0;
            var3_3 = null;
        }
        var6_6 = var1_1.b;
        if (var6_6 != null) {
            var6_6 = var6_6.getBrandName();
        } else {
            var5_5 = 0;
            var6_6 = null;
        }
        var8_8 = var1_1.b;
        if (var8_8 != null) {
            var12_12 = var8_8.getProductBrick();
        }
        Intrinsics.checkNotNullParameter(var17_17, "action");
        Intrinsics.checkNotNullParameter(var18_18, "label");
        var8_8 = AnalyticsManager.Companion;
        var19_19 = av_0.a((AnalyticsManager$Companion)var8_8);
        var20_20 = av_0.a((AnalyticsManager$Companion)var8_8);
        var21_21 = bv_0.a((AnalyticsManager$Companion)var8_8);
        var22_22 = LD2.a((String)var2_2, (String)var3_3, (String)var6_6, var12_12);
        var23_23 = cv_0.a((AnalyticsManager$Companion)var8_8);
        NewCustomEventsRevamp.newPushCustomEvent$default(LD2.a, "reviews & ratings interactions", var17_17, var18_18, "reviews_rating_interactions", var19_19, var20_20, var21_21, var22_22, var23_23, false, null, 1536, null);
    }

    public final void eb() {
        int n3;
        Object object;
        String string2;
        String string3;
        Object object2;
        Object object3;
        int n4;
        int n7;
        wd2_0 wd2_02 = this;
        Object object4 = this.s;
        Object object5 = "";
        if (object4 != null && (n7 = object4.isEmpty()) == 0 && (object4 = this.s) != null) {
            n4 = yx_2.o((Iterable)object4, 10);
            object3 = new ArrayList(n4);
            object4 = object4.iterator();
            while ((n4 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object2 = ((Question)object4.next()).getTitle();
                ((ArrayList)object3).add(object2);
            }
            string3 = null;
            string2 = null;
            n4 = 0;
            object2 = null;
            object = null;
            int n8 = 63;
            object4 = CollectionsKt.R((Iterable)object3, null, null, null, null, n8);
            if (object4 != null) {
                object5 = object4;
            }
        }
        if ((n7 = ((String)object5).length()) > (n3 = 100)) {
            n7 = 100;
        }
        n3 = 0;
        object3 = null;
        string3 = ((String)object5).substring(0, n7);
        Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        object4 = LD2.a;
        object4 = wd2_02.b;
        object5 = null;
        if (object4 != null) {
            object4 = ((RatingsModel)object4).getOrderId();
        } else {
            n7 = 0;
            object4 = null;
        }
        object3 = wd2_02.b;
        if (object3 != null) {
            object3 = ((RatingsModel)object3).getSkuId();
        } else {
            n3 = 0;
            object3 = null;
        }
        object2 = wd2_02.b;
        if (object2 != null) {
            object2 = ((RatingsModel)object2).getBrandName();
        } else {
            n4 = 0;
            object2 = null;
        }
        object = wd2_02.b;
        if (object != null) {
            object5 = ((RatingsModel)object).getProductBrick();
        }
        Intrinsics.checkNotNullParameter(string3, "action");
        string2 = "cross";
        Intrinsics.checkNotNullParameter(string2, "label");
        object = AnalyticsManager.Companion;
        String string4 = av_0.a((AnalyticsManager$Companion)object);
        String string5 = av_0.a((AnalyticsManager$Companion)object);
        String string6 = bv_0.a((AnalyticsManager$Companion)object);
        Bundle bundle = LD2.a((String)object4, (String)object3, (String)object2, (String)object5);
        String string7 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(LD2.a, "reviews & ratings interactions", string3, string2, "reviews_rating_interactions", string4, string5, string6, bundle, string7, false, null, 1536, null);
    }

    public final void f0(boolean bl2) {
        yn3$a yn3$a = yn3_0.a;
        Object[] objectArray = new Object[]{};
        yn3$a.a("onImageSearchDismiss called", objectArray);
    }

    public final void fb() {
        Object object;
        int n3;
        int n4;
        Object object2;
        int n7;
        Object object3;
        wd2_0 wd2_02;
        block42: {
            int n8;
            int n10;
            block45: {
                block43: {
                    block44: {
                        boolean bl2;
                        wd2_02 = this;
                        object3 = null;
                        n7 = 1;
                        object2 = this.m;
                        n10 = 8;
                        if (object2 != null) {
                            object2.setVisibility(n10);
                        }
                        if ((object2 = wd2_02.n) != null) {
                            object2.setVisibility(n10);
                        }
                        if ((object2 = wd2_02.t) == null) break block42;
                        n4 = object2.hashCode();
                        if (n4 == (n3 = -56403349)) break block43;
                        n3 = 2123274;
                        if (n4 == n3) break block44;
                        n3 = 1996002556;
                        if (n4 == n3 && (bl2 = object2.equals(object = "CREATE"))) {
                            bl2 = this.cb();
                            if (bl2) {
                                this.Za();
                                object2 = wd2_02.v;
                                if (object2 != null) {
                                    object2.setVisibility(n10);
                                }
                                if ((object2 = wd2_02.h) != null) {
                                    object2.setVisibility(n10);
                                }
                                if ((object2 = wd2_02.g) != null) {
                                    object2.setVisibility(n10);
                                }
                                if ((object2 = wd2_02.O) != null) {
                                    object2.setVisibility(n10);
                                }
                                if ((object2 = wd2_02.P) != null) {
                                    object2.setVisibility(0);
                                }
                                object2 = wd2_02.o;
                                hv3_0.p0((ShimmerFrameLayout)((Object)object2));
                            } else {
                                this.bb();
                                object2 = wd2_02.O;
                                if (object2 != null) {
                                    object2.setVisibility(0);
                                }
                                if ((object2 = wd2_02.P) != null) {
                                    object2.setVisibility(n10);
                                }
                                object2 = wd2_02.o;
                                hv3_0.p0((ShimmerFrameLayout)((Object)object2));
                            }
                        }
                        break block42;
                    }
                    object = "EDIT";
                    n8 = object2.equals(object);
                    if (n8 != 0) break block45;
                    break block42;
                }
                object = "EXPANDED_VIEW";
                n8 = object2.equals(object);
                if (n8 == 0) break block42;
            }
            if ((n8 = this.cb()) != 0) {
                n8 = wd2_02.Q;
                if (n8 != 0) {
                    wd2_02.Q = false;
                    object2 = wd2_02.G;
                    if (object2 != null && (n8 = object2.getVisibility()) == 0) {
                        object2 = wd2_02.O;
                        if (object2 != null) {
                            object2.setVisibility(n10);
                        }
                        if ((object2 = wd2_02.P) != null) {
                            object2.setVisibility(n10);
                        }
                        object2 = wd2_02.o;
                        hv3_0.s0((ShimmerFrameLayout)((Object)object2));
                    } else {
                        object2 = wd2_02.O;
                        if (object2 != null) {
                            object2.setVisibility(n10);
                        }
                        if ((object2 = wd2_02.P) != null) {
                            object2.setVisibility(0);
                        }
                        object2 = wd2_02.o;
                        hv3_0.p0((ShimmerFrameLayout)((Object)object2));
                    }
                } else {
                    object2 = wd2_02.O;
                    if (object2 != null) {
                        object2.setVisibility(n10);
                    }
                    if ((object2 = wd2_02.P) != null) {
                        object2.setVisibility(n10);
                    }
                    object2 = wd2_02.o;
                    hv3_0.s0((ShimmerFrameLayout)((Object)object2));
                }
            } else {
                this.bb();
                object2 = wd2_02.O;
                if (object2 != null) {
                    object2.setVisibility(0);
                }
                if ((object2 = wd2_02.P) != null) {
                    object2.setVisibility(n10);
                }
                object2 = wd2_02.o;
                hv3_0.p0((ShimmerFrameLayout)((Object)object2));
            }
        }
        if ((object2 = wd2_02.a) != null) {
            Object[] objectArray;
            DeviceInfo deviceInfo;
            Object object4 = Build.MODEL;
            int bl3 = 7;
            n3 = 0;
            Object object5 = null;
            LinkedHashMap<Object[], Object> linkedHashMap = null;
            boolean bl2 = false;
            Object object6 = null;
            object = deviceInfo;
            deviceInfo = new DeviceInfo(null, null, null, bl3, null);
            if (object4 != null && (n4 = ((String)object4).length()) != 0) {
                deviceInfo.setDeviceModel((String)object4);
            }
            object = this.getActivity();
            n3 = 0;
            object5 = null;
            if (object != null) {
                object = object.getContentResolver();
            } else {
                n4 = 0;
                object = null;
            }
            object = Settings.Secure.getString((ContentResolver)object, (String)"android_id");
            deviceInfo.setDeviceId((String)object);
            object = Build.MANUFACTURER;
            linkedHashMap = new LinkedHashMap<Object[], Object>();
            ((StringBuilder)((Object)linkedHashMap)).append((String)object);
            ((StringBuilder)((Object)linkedHashMap)).append(" ");
            ((StringBuilder)((Object)linkedHashMap)).append((String)object4);
            object4 = ((StringBuilder)((Object)linkedHashMap)).toString();
            deviceInfo.setDeviceName((String)object4);
            object = wd2_02.b;
            if (object != null) {
                object = ((RatingsModel)object).getProductRating();
            } else {
                n4 = 0;
                object = null;
            }
            object4 = new RatingsRequestBody(deviceInfo, (Float)object);
            object = wd2_02.b;
            if (object != null) {
                object6 = object = ((RatingsModel)object).getSourcePage();
            } else {
                bl2 = false;
                object6 = null;
            }
            object = wd2_02.b;
            if (object != null) {
                object5 = ((RatingsModel)object).getSkuId();
            }
            int n8 = 8;
            String string2 = null;
            boolean bl4 = true;
            deviceInfo = null;
            boolean bl5 = true;
            linkedHashMap = object;
            object = new RatingQueryParamters((String)object6, bl4, (String)object5, null, bl5, n8, null);
            object5 = "requestBody";
            Intrinsics.checkNotNullParameter(object4, (String)object5);
            linkedHashMap = "queryParameters";
            Intrinsics.checkNotNullParameter(object, (String)((Object)linkedHashMap));
            object6 = sE2.a;
            Intrinsics.checkNotNullParameter(object4, (String)object5);
            Intrinsics.checkNotNullParameter(object, (String)((Object)linkedHashMap));
            object5 = VX0.a(AJIOApplication.Companion);
            linkedHashMap = new LinkedHashMap<Object[], Object>();
            object6 = ((RatingQueryParamters)object).getSource();
            if (object6 != null) {
                objectArray = "sourcePage";
                linkedHashMap.put(objectArray, object6);
            }
            bl2 = ((RatingQueryParamters)object).getFetchSubRatingQuestion();
            objectArray = "fetchSubRatingQuestion";
            object6 = String.valueOf(bl2);
            linkedHashMap.put(objectArray, object6);
            object6 = ((RatingQueryParamters)object).getSkuId();
            if (object6 != null) {
                objectArray = "skuId";
                linkedHashMap.put(objectArray, object6);
            }
            if ((object6 = ((RatingQueryParamters)object).getOptionCode()) != null) {
                objectArray = "optionCode";
                linkedHashMap.put(objectArray, object6);
            }
            n4 = (int)(((RatingQueryParamters)object).getFetchAggRating() ? 1 : 0);
            object = String.valueOf(n4 != 0);
            linkedHashMap.put((Object[])"fetchAggRating", object);
            object = ((UserInformation)object5).getCustomerUUID();
            object6 = UrlHelper.Companion.getInstance();
            objectArray = new Object[n7];
            objectArray[0] = object;
            String string3 = ((UrlHelper)object6).getApiUrl("ratings", "set_ratings_v1", objectArray);
            Intrinsics.checkNotNull(object5);
            object3 = ServiceUtil.getToken((UserInformation)object5);
            String string4 = kp1_0.c("Bearer ", (String)object3);
            object3 = ((UserInformation)object5).getUserEmailId();
            Intrinsics.checkNotNullExpressionValue(object3, "getUserEmailId(...)");
            RatingsApi ratingsApi = sE2.b;
            string2 = sE2.e;
            String string5 = sE2.c;
            String string6 = sE2.d;
            String string7 = "setEditProductRating";
            object3 = ratingsApi.setOrEditRating(string3, string2, string4, string5, string6, string7, (RatingsRequestBody)object4, linkedHashMap, (String)object3);
            object4 = qt2_2.c;
            object3 = ((g53_0)object3).h((Scheduler)object4);
            object4 = ti_2.a();
            object3 = ((g53_0)object3).e((Scheduler)object4);
            object4 = new kp0_1(n7);
            n3 = 2;
            object = new js_1(object4, n3);
            object4 = new s53_0((q63_0)object3, (bx0_2)object);
            object3 = new Object();
            object = new u53_0((q63_0)object4, (bx0_2)object3);
            Intrinsics.checkNotNullExpressionValue(object, "onErrorReturn(...)");
            object3 = new UD2((gE2)object2);
            object4 = new vd2_0((UD2)object3);
            object3 = new gc_2(object2, n7);
            Object object7 = new WD2((gc_2)object3);
            object3 = ((g53_0)object).f((o60_0)object4, (o60_0)object7);
            object7 = object2.c;
            ((t30_0)object7).b((yr0_2)object3);
        }
    }

    public final void gb() {
        boolean bl2;
        int n3;
        Object object;
        Object object2;
        boolean bl3;
        HashMap<Integer, UserSubRating> hashMap;
        Object object3 = this.i;
        if (object3 != null) {
            hashMap = this.requireActivity();
            int n4 = 1;
            bl3 = false;
            object2 = null;
            object = new LinearLayoutManager((Context)hashMap, n4, false);
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object);
        }
        if ((object3 = this.i) != null) {
            ai0_2.q((RecyclerView)object3);
        }
        if ((object3 = this.i) != null) {
            n3 = hv3_0.q(R$dimen.dp24);
            object = new wb3_0(n3);
            ((RecyclerView)object3).addItemDecoration((RecyclerView$n)object);
        }
        object = this.s;
        hashMap = new HashMap<Integer, UserSubRating>();
        Object object4 = this.l;
        if (object4 != null && !(bl3 = ((ArrayList)object4).isEmpty())) {
            object4 = ((ArrayList)object4).iterator();
            while (bl3 = object4.hasNext()) {
                object2 = (RatingsQuestionsResponseModel)object4.next();
                Integer n7 = ((RatingsQuestionsResponseModel)object2).getQuestionId();
                object2 = ((RatingsQuestionsResponseModel)object2).getResponseId();
                boolean bl4 = false;
                Object var12_15 = null;
                td2_0 td2_02 = new td2_0(0, hashMap);
                ai0_2.r(td2_02, n7, object2);
            }
        } else if (object != null) {
            object4 = object.iterator();
            while (bl3 = object4.hasNext()) {
                int n8;
                object2 = (Question)object4.next();
                Object object5 = this.b;
                if (object5 == null || (object5 = ((RatingsModel)object5).getSubRatingList()) == null) continue;
                object5 = object5.iterator();
                while ((n8 = object5.hasNext()) != 0) {
                    Integer n10;
                    int n14;
                    Serializable serializable = (UserSubRating)object5.next();
                    int n15 = serializable.questionId;
                    Integer n16 = ((Question)object2).getQuestionId();
                    if (n16 == null || n15 != (n14 = n16.intValue()) || (n10 = ((Question)object2).getQuestionId()) == null) continue;
                    n15 = n10;
                    n10 = n15;
                    n8 = serializable.subResponseId;
                    serializable = Integer.valueOf(n8);
                    hashMap.put(n10, (UserSubRating)serializable);
                }
            }
        }
        object3 = new jE2(hashMap, (ArrayList)object);
        ((jE2)object3).c = object = new wD2$c(this);
        object = this.i;
        if (object != null) {
            ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
        }
        if (!(bl2 = this.cb())) {
            object3 = this.u;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollView");
                bl2 = false;
                object3 = null;
            }
            n3 = 1;
            object = new al1_2(this, n3);
            object3.post((Runnable)object);
        }
    }

    public final int getTheme() {
        boolean bl2;
        int n3;
        Object object = this.b;
        boolean bl3 = false;
        String string2 = null;
        if (object != null) {
            object = ((RatingsModel)object).getStoreId();
        } else {
            n3 = 0;
            object = null;
        }
        Object object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        n3 = Intrinsics.areEqual(object, object2);
        object2 = this.b;
        if (object2 != null) {
            object2 = ((RatingsModel)object2).getSourcePage();
        } else {
            bl2 = false;
            object2 = null;
        }
        String string3 = "PDP";
        bl2 = Intrinsics.areEqual(object2, string3);
        if (!bl2) {
            object2 = this.b;
            if (object2 != null) {
                string2 = ((RatingsModel)object2).getSourcePage();
            }
            if (!(bl3 = Intrinsics.areEqual(string2, object2 = "PLP"))) {
                return R$style.RatingBottomSheetFragment;
            }
        }
        n3 = n3 != 0 ? R$style.FleekRatingBottomSheetFragment : R$style.RatingBottomSheetFragment;
        return n3;
    }

    public final void h3() {
        block6: {
            lr1_0 lr1_02;
            Object object;
            Object object2;
            block4: {
                block5: {
                    object2 = lr1_0.Companion;
                    object = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(object, "requireContext(...)");
                    Object object3 = this.requireActivity().getActivityResultRegistry();
                    object2.getClass();
                    object2 = "context";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    Intrinsics.checkNotNullParameter(object3, "registry");
                    Intrinsics.checkNotNullParameter(this, "onImageSelectionListener");
                    lr1_02 = new lr1_0((Context)object, (K3)object3, this);
                    int n3 = Build.VERSION.SDK_INT;
                    int n4 = 33;
                    if (n3 < n4) break block4;
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    if (n3 >= n4 || n3 >= (n4 = 30) && (n3 = C3.a()) >= (n4 = 2)) break block5;
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object2 = object.getPackageManager();
                    object3 = "androidx.activity.result.contract.action.PICK_IMAGES";
                    object = new Intent((String)object3);
                    n3 = 0x110000;
                    object2 = object2.resolveActivity((Intent)object, n3);
                    if (object2 == null) break block6;
                }
                object2 = as2_0.a();
                object = lr1_02.g;
                ((N3)object).a(object2);
                break block6;
            }
            object2 = "android.permission.READ_EXTERNAL_STORAGE";
            int n7 = t70.checkSelfPermission((Context)object, (String)object2);
            if (n7 == 0) {
                lr1_02.d();
            } else {
                object = lr1_02.h;
                ((N3)object).a(object2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void hb(boolean bl2, boolean bl3) {
        void var2_5;
        Object object;
        RecyclerView recyclerView = this.I;
        int n3 = 0;
        int n4 = 8;
        if (recyclerView != null) {
            void var1_4;
            if (bl2) {
                boolean bl4 = false;
                object = null;
            } else {
                int n7 = 8;
            }
            recyclerView.setVisibility((int)var1_4);
        }
        if ((object = this.F) != null) {
            int n8;
            if (var2_5 != false) {
                n8 = 0;
                recyclerView = null;
            } else {
                n8 = 8;
            }
            object.setVisibility(n8);
        }
        if ((object = this.J) != null) {
            if (var2_5 == false) {
                n3 = 8;
            }
            object.setVisibility(n3);
        }
        if (var2_5 != false && (object = this.T) != null) {
            object.setVisibility(n4);
        }
    }

    public final void ib(int n3, String object, Long l2, Long l3) {
        Object object2 = this.N;
        if ((object2 = (UploadImageAttributes)CollectionsKt.N(n3, (List)object2)) != null) {
            ((UploadImageAttributes)object2).setImageUploadStatus((String)object);
            ((UploadImageAttributes)object2).setImageId(l3);
            ((UploadImageAttributes)object2).setReviewId(l2);
            this.N.set(n3, object2);
            object = this.M;
            if (object != null) {
                ((RecyclerView$f)object).notifyItemChanged(n3);
            }
        }
    }

    public final void jb(int n3, UploadImageAttributes uploadImageAttributes) {
        gE2 gE22 = this.a;
        if (gE22 != null) {
            fe2_0 fe2_02;
            Object object = this.b;
            Object object2 = object != null ? (object = ((RatingsModel)object).getSkuId()) : null;
            int n4 = 2;
            ReviewQueryParamters reviewQueryParamters = new ReviewQueryParamters((String)object2, null, "", n4, null);
            sd2_0 sd2_02 = new sd2_0(n3, this, uploadImageAttributes);
            Intrinsics.checkNotNullParameter(reviewQueryParamters, "queryParameters");
            Intrinsics.checkNotNullParameter(uploadImageAttributes, "uploadedImageList");
            Intrinsics.checkNotNullParameter(sd2_02, "onProgress");
            aW aW2 = md3_0.c(gE22);
            object2 = null;
            object = fe2_02;
            fe2_02 = new fe2_0(reviewQueryParamters, uploadImageAttributes, sd2_02, gE22, n3, null);
            n3 = 3;
            Ae3.d(aW2, null, null, fe2_02, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onClick(View var1_1) {
        block88: {
            block89: {
                block84: {
                    block90: {
                        block85: {
                            block87: {
                                block86: {
                                    var2_2 = this;
                                    var3_3 = 0;
                                    var4_4 = null;
                                    var5_5 = 2;
                                    var6_6 = 1;
                                    var7_7 = 0;
                                    var8_8 = null;
                                    if (var1_1 != null) {
                                        var9_9 = var1_1.getId();
                                        var10_10 = var9_9;
                                    } else {
                                        var9_9 = 0;
                                        var10_10 = null;
                                    }
                                    var11_11 = R$id.dismissSheetBtn;
                                    if (var10_10 == null || (var12_12 = var10_10.intValue()) != var11_11) break block85;
                                    var4_4 = var2_2.b;
                                    if (var4_4 != null) {
                                        var4_4 = var4_4.getSourcePage();
                                    } else {
                                        var3_3 = 0;
                                        var4_4 = null;
                                    }
                                    var13_13 = "PDP";
                                    var3_3 = Intrinsics.areEqual(var4_4, var13_13);
                                    if (var3_3 == 0) break block86;
                                    var4_4 = var2_2.q;
                                    if (var4_4 == null) ** GOTO lbl-1000
                                    var5_5 = 0;
                                    var13_13 = null;
                                    var3_3 = (int)Intrinsics.areEqual((Float)var4_4, 0.0f);
                                    if (var3_3 == 0) {
                                        this.eb();
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var4_4 = LD2.a;
                                        var4_4 = var2_2.b;
                                        if (var4_4 != null) {
                                            var4_4 = var4_4.getOrderId();
                                        } else {
                                            var3_3 = 0;
                                            var4_4 = null;
                                        }
                                        var13_13 = var2_2.b;
                                        if (var13_13 != null) {
                                            var13_13 = var13_13.getSkuId();
                                        } else {
                                            var5_5 = 0;
                                            var13_13 = null;
                                        }
                                        var14_21 = var2_2.b;
                                        if (var14_21 != null) {
                                            var14_21 = var14_21.getBrandName();
                                        } else {
                                            var6_6 = 0;
                                            var14_21 = null;
                                        }
                                        var10_10 = var2_2.b;
                                        if (var10_10 != null) {
                                            var8_8 = var10_10.getProductBrick();
                                        }
                                        var10_10 = AnalyticsManager.Companion;
                                        var15_27 = av_0.a((AnalyticsManager$Companion)var10_10);
                                        var16_30 = av_0.a((AnalyticsManager$Companion)var10_10);
                                        var17_33 = bv_0.a((AnalyticsManager$Companion)var10_10);
                                        var18_36 = LD2.a((String)var4_4, (String)var13_13, (String)var14_21, (String)var8_8);
                                        var19_39 = cv_0.a((AnalyticsManager$Companion)var10_10);
                                        var20_42 = LD2.a;
                                        var21_46 = 1536;
                                        var22_48 = "reviews & ratings interactions";
                                        var23_50 = "provide ratings halfcut pop up";
                                        var24_52 = "cross";
                                        var25_55 = "reviews_rating_interactions";
                                        var26_58 = null;
                                        var27_61 = null;
                                        NewCustomEventsRevamp.newPushCustomEvent$default(var20_42, var22_48, var23_50, var24_52, var25_55, var15_27, var16_30, var17_33, var18_36, var19_39, false, null, var21_46, null);
                                    }
                                    break block87;
                                }
                                this.eb();
                            }
                            var4_4 = var2_2.a;
                            if (var4_4 != null && (var4_4 = var4_4.a) != null) {
                                var13_13 = var2_2.q;
                                var4_4.i(var13_13);
                            }
                            this.dismiss();
                            break block88;
                        }
                        var11_11 = R$id.tv_submit;
                        var22_49 = "";
                        var23_51 = "REVIEW_IMAGE";
                        if (var10_10 == null || (var28_64 = var10_10.intValue()) != var11_11) break block89;
                        var9_9 = (int)this.cb();
                        var20_43 = "subRatingRequestBody";
                        if (var9_9 == 0) ** GOTO lbl281
                        var10_10 = var2_2.N;
                        var9_9 = (int)var10_10.isEmpty();
                        if (var9_9 != 0 || (var9_9 = (var10_10 = var2_2.N).size()) == var6_6 && (var9_9 = (int)Intrinsics.areEqual(var10_10 = ((UploadImageAttributes)var2_2.N.get(0)).getViewType(), var24_53 /* !! */  = "ADD_IMAGE")) != 0) break block90;
                        var10_10 = var2_2.D;
                        if (var10_10 != null) {
                            var10_10 = var10_10.getText();
                        } else {
                            var9_9 = 0;
                            var10_10 = null;
                        }
                        if (var10_10 != null) {
                            var10_10 = var2_2.D;
                            if (var10_10 != null) {
                                var10_10 = var10_10.getText();
                            } else {
                                var9_9 = 0;
                                var10_10 = null;
                            }
                            Intrinsics.checkNotNull(var10_10);
                            var10_10 = StringsKt.m0((CharSequence)var10_10);
                            var9_9 = var10_10.length();
                            if (var9_9 == 0) {
                                var10_10 = var2_2.U;
                                if (var10_10 != null) {
                                    var10_10.setVisibility(0);
                                }
lbl111:
                                // 5 sources

                                while (true) {
                                    var9_9 = 0;
                                    var10_10 = null;
                                    break block84;
                                    break;
                                }
                            }
                            var10_10 = var2_2.U;
                            if (var10_10 != null) {
                                var28_64 = 8;
                                var10_10.setVisibility(var28_64);
                            }
lbl119:
                            // 6 sources

                            while (true) {
                                var9_9 = 1;
                                break block84;
                                break;
                            }
                        }
                        var10_10 = var2_2.D;
                        if (var10_10 != null) {
                            var10_10 = var10_10.getText();
                        } else {
                            var9_9 = 0;
                            var10_10 = null;
                        }
                        if (var10_10 != null && (var9_9 = var10_10.length()) != 0) ** GOTO lbl119
                        var10_10 = var2_2.U;
                        if (var10_10 == null) ** GOTO lbl111
                        var10_10.setVisibility(0);
                        ** while (true)
                    }
                    var10_10 = var2_2.D;
                    if (var10_10 != null) {
                        var10_10 = var10_10.getText();
                    } else {
                        var9_9 = 0;
                        var10_10 = null;
                    }
                    if (var10_10 == null) ** GOTO lbl119
                    var10_10.length();
                    ** while (true)
                }
                var24_53 /* !! */  = var2_2.N.iterator();
                while ((var29_65 = var24_53 /* !! */ .hasNext()) != 0) {
                    var25_56 = (UploadImageAttributes)var24_53 /* !! */ .next();
                    var15_28 = var25_56.getViewType();
                    var30_67 = Intrinsics.areEqual(var15_28, var23_51);
                    if (!var30_67 || (var29_65 = Intrinsics.areEqual(var25_56 = var25_56.getImageUploadStatus(), var15_28 = "IN_PROGRESS")) == 0) continue;
                    var10_10 = var2_2.T;
                    if (var10_10 != null) {
                        var29_65 = R$string.image_upload_progress;
                        var25_56 = var2_2.getString(var29_65);
                        var10_10.setText((CharSequence)var25_56);
                    }
                    if ((var10_10 = var2_2.T) != null) {
                        var10_10.setVisibility(0);
                    }
                    if ((var10_10 = var2_2.T) != null) {
                        ai0_2.a((View)var10_10);
                    }
                    var9_9 = 0;
                    var10_10 = null;
                }
                if (var9_9 == 0) break block88;
                var10_10 = this.getView();
                if (var10_10 != null) {
                    ai0_2.j((View)var10_10);
                }
                this.Ta();
                var10_10 = var2_2.a;
                if (var10_10 == null) break block88;
                var23_51 = this.Pa();
                var24_53 /* !! */  = var2_2.D;
                if (var24_53 /* !! */  != null && (var24_53 /* !! */  = var24_53 /* !! */ .getText()) != null) {
                    var25_56 = StringsKt.m0((CharSequence)var24_53 /* !! */ ).toString();
                    var29_65 = var25_56.length();
                    var24_53 /* !! */  = var29_65 > 0 ? StringsKt.m0((CharSequence)var24_53 /* !! */ ).toString() : var22_49;
                    var17_34 = var24_53 /* !! */ ;
                } else {
                    var17_34 = var22_49;
                }
                var25_56 = var2_2.b;
                if (var25_56 != null) {
                    var15_28 = var25_56 = var25_56.getSkuId();
                } else {
                    var30_67 = false;
                    var15_28 = null;
                }
                var31_69 = 2;
                var19_40 = null;
                var25_56 = var24_53 /* !! */ ;
                var24_53 /* !! */  = new ReviewQueryParamters((String)var15_28, null, (String)var17_34, var31_69, null);
                Intrinsics.checkNotNullParameter(var23_51, (String)var20_43);
                Intrinsics.checkNotNullParameter(var24_53 /* !! */ , "queryParameters");
                var20_43 = sE2.c((SubRatingRequestBody)var23_51);
                Intrinsics.checkNotNullParameter(var24_53 /* !! */ , "reviewQueryParameters");
                var27_62 = sE2.b((ReviewQueryParamters)var24_53 /* !! */ );
                var23_51 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(var23_51, "randomUUID().toString()");
                Intrinsics.checkNotNullParameter(var23_51, "boundary");
                var24_53 /* !! */  = ff_2.d;
                var23_51 = ff$a_0.c((String)var23_51);
                var24_53 /* !! */  = cr1_2.e;
                var24_53 /* !! */  = new ArrayList();
                var25_56 = cr1_2.f;
                Intrinsics.checkNotNullParameter(var25_56, "type");
                var15_28 = var25_56.b;
                var16_31 = "multipart";
                var30_67 = Intrinsics.areEqual(var15_28, var16_31);
                if (!var30_67) ** GOTO lbl274
                var15_28 = sE2.f;
                var16_31 = "name";
                Intrinsics.checkNotNullParameter(var15_28, (String)var16_31);
                var17_34 = "value";
                Intrinsics.checkNotNullParameter(var22_49, (String)var17_34);
                Intrinsics.checkNotNullParameter(var15_28, (String)var16_31);
                Intrinsics.checkNotNullParameter(var22_49, (String)var17_34);
                var16_31 = pj2_2.Companion;
                var16_31.getClass();
                var22_49 = PJ2$a.c((String)var22_49, null);
                var8_8 = cR1$c$a.a((String)var15_28, null, (pj2_2)var22_49);
                var22_49 = "part";
                Intrinsics.checkNotNullParameter(var8_8, (String)var22_49);
                var24_53 /* !! */ .add(var8_8);
                var7_7 = var24_53 /* !! */ .isEmpty() ^ var6_6;
                if (var7_7 != 0) {
                    var22_49 = ez3.x(var24_53 /* !! */ );
                    var8_8 = new cr1_2((ff_2)var23_51, (jn1_0)var25_56, (List)var22_49);
                    var8_8 = var8_8.b;
                    var32_70 = var8_8 = CollectionsKt.N(0, (List)var8_8);
                    var32_70 = (cr1$c_0)var8_8;
                    var8_8 = VX0.a(AJIOApplication.Companion);
                    var22_49 = var8_8.getCustomerUUID();
                    var23_51 = UrlHelper.Companion.getInstance();
                    var24_53 /* !! */  = new Object[var6_6];
                    var24_53 /* !! */ [0] = var22_49;
                    var15_28 = var23_51.getApiUrl("ratings", "set_reviews", var24_53 /* !! */ );
                    Intrinsics.checkNotNull(var8_8);
                    var4_4 = ServiceUtil.getToken((UserInformation)var8_8);
                    var17_34 = kp1_0.c("Bearer ", (String)var4_4);
                    var18_37 = sE2.c;
                    Intrinsics.checkNotNullExpressionValue(var18_37, "clientType");
                    var4_4 = sE2.a.getUserEmailId();
                    Intrinsics.checkNotNullExpressionValue(var4_4, "getUserEmailId(...)");
                    var25_56 = sE2.b;
                    var16_31 = sE2.e;
                    var19_40 = sE2.d;
                    var26_59 = "submitProductReview";
                    var4_4 = var25_56.uploadReviewImagesAndSubmitReviews((String)var15_28, (String)var16_31, (String)var17_34, var18_37, var19_40, var26_59, var27_62, (cr1$c_0)var32_70, (String)var4_4);
                    var8_8 = qt2_2.c;
                    var4_4 = var4_4.h((Scheduler)var8_8);
                    var8_8 = ti_2.a();
                    var4_4 = var4_4.e((Scheduler)var8_8);
                    var8_8 = new Object();
                    var22_49 = new i9_0(var8_8, var5_5);
                    var8_8 = new s53_0((q63_0)var4_4, (bx0_2)var22_49);
                    var4_4 = new j9_0(var6_6);
                    var22_49 = new u53_0((q63_0)var8_8, (bx0_2)var4_4);
                    Intrinsics.checkNotNullExpressionValue(var22_49, "onErrorReturn(...)");
                    var4_4 = new Object();
                    var8_8 = new eE2((dE2)var4_4);
                    var4_4 = g53_0.i((g53_0)var20_43, (g53_0)var22_49, (dx_0)var8_8);
                    var8_8 = new DS(var10_10, var5_5);
                    var20_43 = new ES(var6_6, (Function1)var8_8);
                    var7_7 = 3;
                    var14_22 = new t9_0(var10_10, var7_7);
                    var8_8 = new fs_0(var5_5, var14_22);
                    var4_4 = var4_4.f((o60_0)var20_43, (o60_0)var8_8);
                    var13_14 = var10_10.c;
                    var13_14.b((yr0_2)var4_4);
                } else {
                    var13_15 = "Multipart body must have at least one part.".toString();
                    var4_4 = new IllegalStateException(var13_15);
                    throw var4_4;
lbl274:
                    // 1 sources

                    var4_4 = new StringBuilder("multipart != ");
                    var4_4.append(var25_56);
                    var4_4 = var4_4.toString();
                    var4_4 = var4_4.toString();
                    var13_16 = new IllegalArgumentException((String)var4_4);
                    throw var13_16;
lbl281:
                    // 1 sources

                    var4_4 = this.getView();
                    if (var4_4 != null) {
                        ai0_2.j((View)var4_4);
                    }
                    if ((var4_4 = var2_2.a) != null) {
                        var13_17 = this.Pa();
                        Intrinsics.checkNotNullParameter(var13_17, (String)var20_43);
                        var13_17 = sE2.c((SubRatingRequestBody)var13_17);
                        var8_8 = new RD2((gE2)var4_4);
                        var10_10 = new xs_1(var6_6, (Function1)var8_8);
                        var14_23 = new bE2((gE2)var4_4);
                        var8_8 = new cE2(var14_23);
                        var13_17 = var13_17.f((o60_0)var10_10, (o60_0)var8_8);
                        var4_4 = var4_4.c;
                        var4_4.b((yr0_2)var13_17);
                    }
                }
                break block88;
            }
            var5_5 = R$id.tv_skip;
            if (var10_10 != null && (var11_11 = var10_10.intValue()) == var5_5) {
                var5_5 = (int)this.cb();
                if (var5_5 != 0) {
                    var13_18 = new ArrayList();
                    var10_10 = var2_2.N;
                    var20_44 = new ArrayList();
                    var10_10 = var10_10.iterator();
                    while ((var28_64 = (int)var10_10.hasNext()) != 0) {
                        var25_57 = var24_54 = var10_10.next();
                        var25_57 = (UploadImageAttributes)var24_54;
                        var30_68 = var25_57.isImageLinkedToReview();
                        if (var30_68 || !(var29_66 = Intrinsics.areEqual(var25_57 = var25_57.getViewType(), var23_51))) continue;
                        var20_44.add(var24_54);
                    }
                    var10_10 = var20_44.iterator();
                    var20_44 = var22_49;
                    while (var33_72 = var10_10.hasNext()) {
                        var23_51 = (UploadImageAttributes)var10_10.next();
                        var24_54 = var23_51.getImageId();
                        if (var24_54 != null) {
                            var34_73 = var24_54.longValue();
                            var24_54 = String.valueOf(var34_73);
                            var13_18.add(var24_54);
                        }
                        if ((var23_51 = var23_51.getReviewId()) == null) continue;
                        var36_74 = var23_51.longValue();
                        var20_44 = String.valueOf(var36_74);
                    }
                    var9_9 = (int)var13_18.isEmpty();
                    if ((var6_6 ^= var9_9) != 0 && (var14_24 = var2_2.a) != null) {
                        var14_24.b((String)var20_44, (ArrayList)var13_18);
                    }
                    this.Ta();
                }
                if ((var13_18 = var2_2.s) != null && (var5_5 = (int)var13_18.isEmpty()) == 0 && (var13_18 = var2_2.s) != null) {
                    var6_6 = yx_2.o((Iterable)var13_18, 10);
                    var23_51 = new ArrayList(var6_6);
                    var13_18 = var13_18.iterator();
                    while ((var6_6 = (int)var13_18.hasNext()) != 0) {
                        var14_24 = ((Question)var13_18.next()).getTitle();
                        if (var14_24 == null) {
                            var14_24 = var22_49;
                        }
                        var23_51.add(var14_24);
                    }
                    var30_68 = false;
                    var15_29 = null;
                    var16_32 = null;
                    var28_64 = 0;
                    var24_54 = null;
                    var29_66 = false;
                    var25_57 = null;
                    var38_75 = 63;
                    var13_18 = CollectionsKt.R((Iterable)var23_51, null, null, null, null, var38_75);
                    if (var13_18 != null) {
                        var22_49 = var13_18;
                    }
                }
                if ((var5_5 = var22_49.length()) > (var6_6 = 100)) {
                    var5_5 = 100;
                }
                var25_57 = var22_49.substring(0, var5_5);
                Intrinsics.checkNotNullExpressionValue(var25_57, "substring(...)");
                var4_4 = LD2.a;
                var4_4 = var2_2.b;
                if (var4_4 != null) {
                    var4_4 = var4_4.getOrderId();
                } else {
                    var3_3 = 0;
                    var4_4 = null;
                }
                var13_18 = var2_2.b;
                if (var13_18 != null) {
                    var13_18 = var13_18.getSkuId();
                } else {
                    var5_5 = 0;
                    var13_18 = null;
                }
                var14_24 = var2_2.b;
                if (var14_24 != null) {
                    var14_24 = var14_24.getBrandName();
                } else {
                    var6_6 = 0;
                    var14_24 = null;
                }
                var10_10 = var2_2.b;
                if (var10_10 != null) {
                    var8_8 = var10_10.getProductBrick();
                }
                Intrinsics.checkNotNullParameter(var25_57, "action");
                var10_10 = AnalyticsManager.Companion;
                var17_35 = av_0.a((AnalyticsManager$Companion)var10_10);
                var18_38 = av_0.a((AnalyticsManager$Companion)var10_10);
                var19_41 = bv_0.a((AnalyticsManager$Companion)var10_10);
                var26_60 = LD2.a((String)var4_4, (String)var13_18, (String)var14_24, (String)var8_8);
                var27_63 = cv_0.a((AnalyticsManager$Companion)var10_10);
                var23_51 = LD2.a;
                var39_76 = 1536;
                var24_54 = "reviews & ratings interactions";
                var15_29 = "SR - Skip";
                var16_32 = "reviews_rating_interactions";
                var21_47 = false;
                var32_71 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var23_51, (String)var24_54, (String)var25_57, var15_29, var16_32, var17_35, var18_38, var19_41, var26_60, var27_63, false, null, var39_76, null);
                var4_4 = var2_2.a;
                if (var4_4 != null && (var4_4 = var4_4.a) != null) {
                    var13_18 = var2_2.q;
                    var4_4.i(var13_18);
                }
                this.dismiss();
            } else {
                var5_5 = R$id.tv_retry;
                if (var10_10 != null && (var6_6 = var10_10.intValue()) == var5_5) {
                    this.Za();
                    this.fb();
                } else {
                    var5_5 = R$id.tv_skip_review;
                    if (var10_10 != null && (var6_6 = var10_10.intValue()) == var5_5) {
                        var4_4 = LD2.a;
                        var4_4 = var2_2.b;
                        if (var4_4 != null) {
                            var4_4 = var4_4.getOrderId();
                        } else {
                            var3_3 = 0;
                            var4_4 = null;
                        }
                        var13_19 = var2_2.b;
                        if (var13_19 != null) {
                            var13_19 = var13_19.getSkuId();
                        } else {
                            var5_5 = 0;
                            var13_19 = null;
                        }
                        var14_25 = var2_2.b;
                        if (var14_25 != null) {
                            var14_25 = var14_25.getBrandName();
                        } else {
                            var6_6 = 0;
                            var14_25 = null;
                        }
                        var10_10 = var2_2.b;
                        if (var10_10 != null) {
                            var8_8 = var10_10.getProductBrick();
                        }
                        var10_10 = "skip";
                        LD2.d((String)var10_10, (String)var4_4, (String)var13_19, (String)var14_25, (String)var8_8);
                        var4_4 = var2_2.a;
                        if (var4_4 != null && (var4_4 = var4_4.a) != null) {
                            var13_19 = var2_2.q;
                            var4_4.i(var13_19);
                        }
                        this.dismiss();
                    } else {
                        var5_5 = R$id.tv_write_a_review;
                        if (var10_10 != null && (var6_6 = var10_10.intValue()) == var5_5) {
                            var13_20 = LD2.a;
                            var13_20 = var2_2.b;
                            if (var13_20 != null) {
                                var13_20 = var13_20.getOrderId();
                            } else {
                                var5_5 = 0;
                                var13_20 = null;
                            }
                            var14_26 = var2_2.b;
                            if (var14_26 != null) {
                                var14_26 = var14_26.getSkuId();
                            } else {
                                var6_6 = 0;
                                var14_26 = null;
                            }
                            var10_10 = var2_2.b;
                            if (var10_10 != null) {
                                var10_10 = var10_10.getBrandName();
                            } else {
                                var9_9 = 0;
                                var10_10 = null;
                            }
                            var20_45 = var2_2.b;
                            if (var20_45 != null) {
                                var8_8 = var20_45.getProductBrick();
                            }
                            var20_45 = "submit";
                            LD2.d((String)var20_45, (String)var13_20, (String)var14_26, (String)var10_10, (String)var8_8);
                            this.ab();
                            this.Wa();
                            var13_20 = var2_2.p;
                            if (var13_20 != null) {
                                var13_20.setVisibility(0);
                            }
                        } else {
                            var3_3 = R$id.camera_img;
                            if (var10_10 != null && (var5_5 = var10_10.intValue()) == var3_3) {
                                this.Sa();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        Object object2;
        String string2;
        block20: {
            boolean bl2;
            int n3;
            block19: {
                String string3;
                Object object3;
                String string4;
                String string5;
                String string6;
                Object object4;
                String string7;
                block17: {
                    block18: {
                        super.onCreate((Bundle)object);
                        n3 = 0;
                        object = new ty2_2(false);
                        this.S = object;
                        object.b = "/ReviewsImg";
                        this.setCancelable(false);
                        object = this.getParentFragment();
                        string2 = "<this>";
                        object2 = "Local and anonymous classes can not be ViewModels";
                        string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                        object4 = gE2.class;
                        string6 = "defaultCreationExtras";
                        string5 = "factory";
                        string4 = "store";
                        object3 = "owner";
                        string3 = "modelClass";
                        if (object == null) break block17;
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        rd3_0 rd3_02 = object.getViewModelStore();
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        E$b e$b = object.getDefaultViewModelProviderFactory();
                        object = oh2_0.a((Fragment)object, (String)object3, rd3_02, string4);
                        Intrinsics.checkNotNullParameter(e$b, string5);
                        Intrinsics.checkNotNullParameter(object, string6);
                        object = rl3_0.b(rd3_02, e$b, (Wd0)object, object4, string3);
                        object4 = sw0_0.a(object4, string2, object4, string3, string3);
                        Intrinsics.checkNotNullParameter(object4, string2);
                        string2 = object4.getQualifiedName();
                        if (string2 == null) break block18;
                        string2 = string7.concat(string2);
                        object = (gE2)object.a((yn1_2)object4, string2);
                        this.a = object;
                        break block19;
                    }
                    string2 = object2.toString();
                    object = new IllegalArgumentException(string2);
                    throw object;
                }
                object = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
                Intrinsics.checkNotNullParameter(object, (String)object3);
                rd3_0 rd3_03 = object.getViewModelStore();
                object3 = cX1.a((FragmentActivity)object, (String)object3, (FragmentActivity)object, (String)object3);
                object = dX1.a((FragmentActivity)object, rd3_03, string4, (E$b)object3, string5);
                object = li_2.a((Wd0)object, string6, rd3_03, (E$b)object3, (Wd0)object);
                Intrinsics.checkNotNullParameter(object4, string3);
                Intrinsics.checkNotNullParameter(object4, string2);
                object4 = Reflection.getOrCreateKotlinClass((Class)object4);
                Intrinsics.checkNotNullParameter(object4, string3);
                Intrinsics.checkNotNullParameter(object4, string3);
                Intrinsics.checkNotNullParameter(object4, string2);
                string2 = object4.getQualifiedName();
                if (string2 == null) break block20;
                string2 = string7.concat(string2);
                object = (gE2)object.a((yn1_2)object4, string2);
                this.a = object;
            }
            object = this.getArguments();
            string2 = "MODE_TYPE";
            object2 = null;
            if (object != null) {
                bl2 = object.containsKey(string2);
                object = bl2;
            } else {
                bl2 = false;
                object = null;
            }
            int n4 = 33;
            if (object != null) {
                object = this.getArguments();
                if (object != null) {
                    int n7 = Build.VERSION.SDK_INT;
                    if (n7 >= n4) {
                        object = jD2.a(object);
                    } else {
                        n3 = (object = object.getSerializable(string2)) instanceof wp1_0;
                        if (n3 == 0) {
                            bl2 = false;
                            object = null;
                        }
                        object = (wp1_0)((Object)object);
                    }
                    object = (wp1_0)((Object)object);
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null) {
                    object = object.name();
                } else {
                    bl2 = false;
                    object = null;
                }
                this.t = object;
            }
            if ((object = this.getArguments()) != null) {
                n3 = Build.VERSION.SDK_INT;
                if (n3 >= n4) {
                    object = (Parcelable)kD2.a(object);
                } else {
                    string2 = "RATINGS_MODEL";
                    n3 = (object = object.getParcelable(string2)) instanceof RatingsModel;
                    if (n3 != 0) {
                        object2 = object;
                    }
                    object = object2;
                    object = (RatingsModel)object2;
                }
                object2 = object;
                object2 = (RatingsModel)object;
            }
            this.b = object2;
            return;
        }
        string2 = object2.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        vD2 vD22 = new vD2(this);
        object.setOnShowListener((DialogInterface.OnShowListener)vD22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_rating_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        t30_0 t30_02 = (t30_0)this.R.getValue();
        boolean bl2 = t30_02.b;
        if (!bl2) {
            t30_02 = (t30_0)this.R.getValue();
            t30_02.d();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        block91: {
            Long l2;
            int n3;
            boolean bl2;
            Object object;
            String string2;
            Object object2;
            Integer n4;
            Object object3;
            Object object4;
            boolean bl3;
            ArrayList<Object> arrayList;
            int n7;
            Object object5;
            Object object6;
            int n8;
            int n10;
            int n14;
            Object object7;
            Object object8;
            int n15;
            Object object9;
            String string3;
            Object object10;
            float f5;
            int n16;
            float f6;
            int n17;
            Object object11;
            wd2_0 wd2_02;
            block93: {
                block92: {
                    wd2_02 = this;
                    object11 = view;
                    n17 = 2;
                    f6 = 2.8E-45f;
                    n16 = 1;
                    f5 = Float.MIN_VALUE;
                    Intrinsics.checkNotNullParameter(view, "view");
                    super.onViewCreated(view, bundle);
                    int n18 = R$id.scrollViewBottom;
                    object10 = (NestedScrollView)view.findViewById(n18);
                    this.u = object10;
                    n18 = R$id.ratings_product_name;
                    object10 = (TextView)view.findViewById(n18);
                    this.d = object10;
                    n18 = R$id.ratings_product_description;
                    object10 = (TextView)view.findViewById(n18);
                    this.e = object10;
                    n18 = R$id.product_img;
                    object10 = (AjioRoundedCornerImageView)view.findViewById(n18);
                    this.f = object10;
                    n18 = R$id.thank_you_rating;
                    object10 = (TextView)view.findViewById(n18);
                    this.g = object10;
                    n18 = R$id.item_rating;
                    object10 = (ScaleRatingBar)view.findViewById(n18);
                    this.h = object10;
                    n18 = R$id.questions_list;
                    object10 = (RecyclerView)view.findViewById(n18);
                    this.i = object10;
                    n18 = R$id.tv_submit;
                    object10 = (AjioTextView)view.findViewById(n18);
                    this.j = object10;
                    n18 = R$id.tv_skip;
                    object10 = (AjioTextView)view.findViewById(n18);
                    this.k = object10;
                    n18 = R$id.tv_retry;
                    object10 = (TextView)view.findViewById(n18);
                    this.m = object10;
                    n18 = R$id.rating_error;
                    object10 = (TextView)view.findViewById(n18);
                    this.n = object10;
                    n18 = R$id.spShimmerView;
                    object10 = (ShimmerFrameLayout)view.findViewById(n18);
                    this.o = object10;
                    n18 = R$id.buttons;
                    object10 = (LinearLayout)view.findViewById(n18);
                    this.p = object10;
                    n18 = R$id.rating_experience_label;
                    object10 = (TextView)view.findViewById(n18);
                    this.v = object10;
                    n18 = R$id.dismissSheetBtn;
                    object10 = (ImageView)view.findViewById(n18);
                    this.w = object10;
                    n18 = R$id.shimmer_ratings;
                    object10 = view.findViewById(n18);
                    this.O = object10;
                    n18 = R$id.shimmer_pdp_ratings;
                    object10 = view.findViewById(n18);
                    this.P = object10;
                    n18 = (int)(this.cb() ? 1 : 0);
                    string3 = null;
                    if (n18 != 0) {
                        n18 = R$id.parent_layout;
                        object10 = (LinearLayout)view.findViewById(n18);
                        this.c = object10;
                        n18 = R$id.tell_us_more_view;
                        object10 = (AjioTextView)view.findViewById(n18);
                        this.x = object10;
                        n18 = R$id.review_info_view;
                        object10 = (AjioTextView)view.findViewById(n18);
                        this.y = object10;
                        n18 = R$id.buttons_review;
                        object10 = (LinearLayout)view.findViewById(n18);
                        this.z = object10;
                        n18 = R$id.tv_skip_review;
                        object10 = (AjioTextView)view.findViewById(n18);
                        this.A = object10;
                        n18 = R$id.tv_write_a_review;
                        object10 = (AjioTextView)view.findViewById(n18);
                        this.B = object10;
                        n18 = R$id.add_photo;
                        object10 = (AjioTextView)view.findViewById(n18);
                        this.G = object10;
                        n18 = R$id.review_container;
                        object10 = (LinearLayout)view.findViewById(n18);
                        this.C = object10;
                        n18 = R$id.review_text;
                        object10 = (EditText)view.findViewById(n18);
                        this.D = object10;
                        if (object10 != null) {
                            object9 = new Object();
                            n15 = 500;
                            object8 = new InputFilter.LengthFilter(n15);
                            object7 = new InputFilter[n17];
                            object7[0] = object9;
                            object7[n16] = object8;
                            object10.setFilters(object7);
                        }
                        n18 = R$id.review_text_counter;
                        object10 = (TextView)object11.findViewById(n18);
                        wd2_02.E = object10;
                        n18 = R$id.camera_img;
                        object10 = (ImageView)object11.findViewById(n18);
                        wd2_02.F = object10;
                        n18 = R$id.review_img_text;
                        object10 = (AjioTextView)object11.findViewById(n18);
                        wd2_02.J = object10;
                        n18 = R$id.write_review_title;
                        object10 = (AjioTextView)object11.findViewById(n18);
                        wd2_02.L = object10;
                        n18 = R$id.add_photo_container;
                        object10 = (LinearLayout)object11.findViewById(n18);
                        wd2_02.H = object10;
                        n18 = R$id.images_list;
                        object10 = (RecyclerView)object11.findViewById(n18);
                        wd2_02.I = object10;
                        if (object10 != null) {
                            object8 = this.requireActivity();
                            object9 = new LinearLayoutManager((Context)object8, 0, false);
                            ((RecyclerView)object10).setLayoutManager((RecyclerView$o)object9);
                        }
                        if ((object10 = wd2_02.I) != null) {
                            n14 = hv3_0.q(R$dimen.dp8);
                            object9 = new M41$a(n14);
                            ((RecyclerView)object10).addItemDecoration((RecyclerView$n)object9);
                        }
                        n18 = R$id.image_upload_error;
                        object10 = (AjioTextView)object11.findViewById(n18);
                        wd2_02.T = object10;
                        n18 = R$id.review_text_error;
                        wd2_02.U = object10 = (AjioTextView)object11.findViewById(n18);
                        n18 = R$id.review_disclaimer_msg_view;
                        object11 = (TextView)object11.findViewById(n18);
                        wd2_02.Y = object11;
                        object11 = wd2_02.b;
                        if (object11 != null && (object11 = object11.getReviewModel()) != null && (object11 = object11.getReviewText()) != null) {
                            object11 = ((Object)StringsKt.m0((CharSequence)object11)).toString();
                        } else {
                            n10 = 0;
                            object11 = null;
                        }
                        if (object11 != null && (n10 = object11.length()) != 0) {
                            object11 = wd2_02.b;
                            if (object11 != null && (object11 = object11.getReviewModel()) != null && (object11 = object11.getReviewText()) != null && (object11 = ((Object)StringsKt.m0((CharSequence)object11)).toString()) != null) {
                                object10 = wd2_02.D;
                                if (object10 != null) {
                                    object10.setText((CharSequence)object11);
                                }
                                n10 = object11.length();
                                object11 = String.valueOf(n10);
                                wd2_02.Xa((String)object11);
                            }
                        } else {
                            object11 = "0";
                            wd2_02.Xa((String)object11);
                        }
                        if ((object11 = wd2_02.D) != null) {
                            object10 = new md2_0(wd2_02);
                            ai0_2.o((EditText)object11, (hx0_2)object10);
                        }
                        if ((object11 = this.getView()) != null) {
                            object11 = object11.getViewTreeObserver();
                        } else {
                            n10 = 0;
                            object11 = null;
                        }
                        wd2_02.K = object10 = new nD2((ViewTreeObserver)object11, wd2_02);
                        if (object11 != null) {
                            object11.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object10);
                        }
                    }
                    object10 = Looper.getMainLooper();
                    object11 = new Handler((Looper)object10);
                    object10 = new El0(wd2_02, n17);
                    long l3 = 100;
                    object11.postDelayed((Runnable)object10, l3);
                    object11 = wd2_02.t;
                    object10 = "EDIT";
                    n10 = Intrinsics.areEqual(object11, object10);
                    if (n10 != 0) {
                        object11 = wd2_02.v;
                        if (object11 != null) {
                            n8 = R$string.rating_edit_message;
                            object9 = wd2_02.getString(n8);
                            object11.setText((CharSequence)object9);
                        }
                    } else {
                        object11 = wd2_02.v;
                        if (object11 != null) {
                            n8 = R$string.rate_experience;
                            object9 = wd2_02.getString(n8);
                            object11.setText((CharSequence)object9);
                        }
                    }
                    if ((object11 = wd2_02.w) != null) {
                        object11.setOnClickListener((View.OnClickListener)wd2_02);
                    }
                    if ((object11 = wd2_02.j) != null) {
                        object11.setOnClickListener((View.OnClickListener)wd2_02);
                    }
                    if ((object11 = wd2_02.k) != null) {
                        object11.setOnClickListener((View.OnClickListener)wd2_02);
                    }
                    if ((object11 = wd2_02.m) != null) {
                        object11.setOnClickListener((View.OnClickListener)wd2_02);
                    }
                    if ((object11 = wd2_02.A) != null) {
                        object11.setOnClickListener((View.OnClickListener)wd2_02);
                    }
                    if ((object11 = wd2_02.B) != null) {
                        object11.setOnClickListener((View.OnClickListener)wd2_02);
                    }
                    if ((object11 = wd2_02.F) != null) {
                        object11.setOnClickListener((View.OnClickListener)wd2_02);
                    }
                    if ((object11 = wd2_02.a) != null && (object11 = object11.d) != null) {
                        object9 = this.getViewLifecycleOwner();
                        object8 = new ap2_1(wd2_02, n16);
                        object7 = new wD2$b((Function1)object8);
                        object11.e((mu1_1)object9, (F62)object7);
                    }
                    if ((object11 = wd2_02.a) != null && (object11 = object11.e) != null) {
                        object9 = this.getViewLifecycleOwner();
                        n15 = 3;
                        object8 = new I8(wd2_02, n15);
                        object7 = new wD2$b((Function1)object8);
                        object11.e((mu1_1)object9, (F62)object7);
                    }
                    if ((object11 = wd2_02.a) != null && (object11 = object11.f) != null) {
                        object9 = this.getViewLifecycleOwner();
                        object8 = new cp2_2(wd2_02, n16);
                        object7 = new wD2$b((Function1)object8);
                        object11.e((mu1_1)object9, (F62)object7);
                    }
                    if ((object11 = wd2_02.a) != null && (object11 = object11.g) != null) {
                        object9 = this.getViewLifecycleOwner();
                        object8 = new ld2_0(wd2_02, 0);
                        object7 = new wD2$b((Function1)object8);
                        object11.e((mu1_1)object9, (F62)object7);
                    }
                    if ((object11 = wd2_02.a) != null && (object11 = object11.h) != null) {
                        object9 = this.getViewLifecycleOwner();
                        object8 = new n02_0(wd2_02, n17);
                        object6 = new wD2$b((Function1)object8);
                        object11.e((mu1_1)object9, (F62)object6);
                    }
                    if ((object11 = wd2_02.b) == null) break block91;
                    object6 = object11.getBrandName();
                    if (object6 != null && (object9 = wd2_02.d) != null) {
                        object9.setText((CharSequence)object6);
                    }
                    if ((object6 = object11.getProductDescription()) != null && (object9 = wd2_02.e) != null) {
                        object9.setText((CharSequence)object6);
                    }
                    object6 = object11.getProductRating();
                    n8 = 0;
                    object9 = null;
                    if (object6 != null) {
                        f6 = ((Number)object6).floatValue();
                        object8 = wd2_02.h;
                        if (object8 != null) {
                            ((BaseRatingBar)((Object)object8)).setRating(f6);
                        }
                    } else {
                        object6 = wd2_02.h;
                        if (object6 != null) {
                            ((BaseRatingBar)((Object)object6)).setRating(0.0f);
                        }
                    }
                    object6 = object11.getImageUrl();
                    n14 = 8;
                    if (object6 == null) break block92;
                    object7 = wd2_02.f;
                    if (object7 != null) {
                        object7.setVisibility(0);
                    }
                    if ((object7 = wd2_02.f) != null) {
                        object5 = new Object();
                        ((da$a)object5).k = n16;
                        ((da$a)object5).r = n16;
                        n7 = R$string.acc_banner;
                        arrayList = hv3_0.K(n7);
                        ((da$a)object5).b((String)((Object)arrayList));
                        ((da$a)object5).n = object6;
                        ((da$a)object5).u = object7;
                        object6 = ((da$a)object5).a();
                    } else {
                        n17 = 0;
                        object6 = null;
                        f6 = 0.0f;
                    }
                    if (object6 != null) break block93;
                }
                if ((object6 = wd2_02.f) != null) {
                    object6.setVisibility(n14);
                }
                object6 = Unit.a;
            }
            if ((object6 = wd2_02.h) != null) {
                ai0_2.b((ScaleRatingBar)((Object)object6));
            }
            if ((object6 = object11.getQuestionsArrayList()) != null) {
                boolean bl4;
                object7 = new ArrayList();
                object6 = object6.iterator();
                while (bl4 = object6.hasNext()) {
                    object5 = (com.ril.ajio.services.data.Order.Question)object6.next();
                    bl3 = false;
                    object4 = null;
                    int n19 = 0;
                    object3 = null;
                    n4 = null;
                    object2 = null;
                    string2 = null;
                    arrayList = object;
                    object8 = object;
                    bl2 = false;
                    object = null;
                    n3 = 63;
                    l2 = null;
                    ((Question)((Object)arrayList))(null, null, null, null, null, null, n3, null);
                    arrayList = ((com.ril.ajio.services.data.Order.Question)object5).category;
                    ((Question)object8).setCategory((String)((Object)arrayList));
                    n7 = ((com.ril.ajio.services.data.Order.Question)object5).questionId;
                    arrayList = n7;
                    ((Question)object8).setQuestionId((Integer)((Object)arrayList));
                    arrayList = ((com.ril.ajio.services.data.Order.Question)object5).type;
                    ((Question)object8).setType((String)((Object)arrayList));
                    arrayList = ((com.ril.ajio.services.data.Order.Question)object5).target;
                    ((Question)object8).setTarget((String)((Object)arrayList));
                    arrayList = ((com.ril.ajio.services.data.Order.Question)object5).title;
                    ((Question)object8).setTitle((String)((Object)arrayList));
                    arrayList = ((com.ril.ajio.services.data.Order.Question)object5).responseOptions;
                    if (arrayList != null && (n7 = (int)(arrayList.isEmpty() ? 1 : 0)) == 0) {
                        arrayList = new ArrayList<Object>();
                        object5 = ((com.ril.ajio.services.data.Order.Question)object5).responseOptions;
                        if (object5 != null) {
                            object5 = object5.iterator();
                            while (bl3 = object5.hasNext()) {
                                object4 = (com.ril.ajio.services.data.Order.ResponseOption)object5.next();
                                n4 = null;
                                object2 = null;
                                string2 = null;
                                object3 = object;
                                object9 = object;
                                bl2 = false;
                                object = null;
                                n3 = 15;
                                l2 = null;
                                ((ResponseOption)object3)(null, null, null, null, n3, null);
                                if (object4 != null) {
                                    n19 = ((com.ril.ajio.services.data.Order.ResponseOption)object4).id;
                                    object3 = n19;
                                } else {
                                    n19 = 0;
                                    object3 = null;
                                }
                                ((ResponseOption)object9).setId((Integer)object3);
                                if (object4 != null) {
                                    object3 = ((com.ril.ajio.services.data.Order.ResponseOption)object4).text;
                                } else {
                                    n19 = 0;
                                    object3 = null;
                                }
                                ((ResponseOption)object9).setText((String)object3);
                                if (object4 != null) {
                                    object3 = ((com.ril.ajio.services.data.Order.ResponseOption)object4).subText;
                                } else {
                                    n19 = 0;
                                    object3 = null;
                                }
                                ((ResponseOption)object9).setSubText((String)object3);
                                if (object4 != null) {
                                    object4 = ((com.ril.ajio.services.data.Order.ResponseOption)object4).imageUrl;
                                } else {
                                    bl3 = false;
                                    object4 = null;
                                }
                                ((ResponseOption)object9).setImageUrl((String)object4);
                                arrayList.add(object9);
                                n8 = 0;
                                object9 = null;
                            }
                        }
                    } else {
                        n7 = 0;
                        arrayList = null;
                    }
                    ((Question)object8).setResponseOptions(arrayList);
                    object7.add(object8);
                    n8 = 0;
                    object9 = null;
                    n14 = 8;
                }
                wd2_02.s = object7;
            }
            if ((object6 = object11.getReviewModel()) != null) {
                object6 = ((ReviewModel)object6).getReviewsImagesList();
            } else {
                n17 = 0;
                object6 = null;
                f6 = 0.0f;
            }
            if (object6 != null && (n17 = (int)(object6.isEmpty() ? 1 : 0)) == 0) {
                object6 = object11.getReviewModel();
                if (object6 != null && (object6 = ((ReviewModel)object6).getReviewsImagesList()) != null) {
                    object6 = object6.iterator();
                    n8 = 0;
                    object9 = null;
                    while ((n14 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                        object8 = object6.next();
                        n15 = n8 + 1;
                        if (n8 >= 0) {
                            object8 = (ImageModel)object8;
                            arrayList = ((ImageModel)object8).getImageUrl();
                            n4 = n8;
                            object9 = object11.getReviewModel();
                            if (object9 != null) {
                                object2 = object9 = ((ReviewModel)object9).getReviewId();
                            } else {
                                n3 = 0;
                                object2 = null;
                            }
                            l2 = ((ImageModel)object8).getImageId();
                            int n20 = 2146;
                            bl3 = false;
                            object4 = null;
                            object3 = "REVIEW_IMAGE";
                            string2 = "COMPLETED";
                            boolean bl5 = true;
                            object5 = object;
                            object8 = object;
                            bl2 = true;
                            object = new UploadImageAttributes((String)((Object)arrayList), null, (String)object3, n4, bl2, null, 0, (Long)object2, l2, string2, bl5, null, n20, null);
                            object9 = wd2_02.N;
                            ((ArrayList)object9).add(object);
                            n8 = n15;
                            continue;
                        }
                        xx_2.n();
                        throw null;
                    }
                }
                this.Ya();
            }
            object11 = wd2_02.t;
            object6 = "CREATE";
            n17 = (int)(Intrinsics.areEqual(object11, object6) ? 1 : 0);
            n16 = 1065353216;
            f5 = 1.0f;
            if (n17 != 0) {
                object11 = wd2_02.b;
                if (object11 != null) {
                    string3 = object11.getSourcePage();
                }
                if ((n10 = Intrinsics.areEqual(string3, object11 = "PDP")) != 0) {
                    object11 = wd2_02.v;
                    if (object11 != null) {
                        object11.setVisibility(0);
                    }
                    if ((object11 = wd2_02.h) != null) {
                        object11.setVisibility(0);
                    }
                    object11 = wd2_02.h;
                    n17 = 0;
                    f6 = 0.0f;
                    object6 = null;
                    if (object11 != null) {
                        object11.setMinimumStars(0.0f);
                    }
                    if ((object11 = wd2_02.h) != null) {
                        object11.setRating(0.0f);
                    }
                    if ((object11 = wd2_02.h) != null) {
                        object6 = new vq_1(wd2_02);
                        object11.setOnRatingChangeListener((BaseRatingBar$a)object6);
                    }
                } else {
                    object11 = wd2_02.h;
                    if (object11 != null) {
                        object11.setMinimumStars(f5);
                    }
                    if ((object11 = wd2_02.h) != null) {
                        object6 = new vq_1(wd2_02);
                        object11.setOnRatingChangeListener((BaseRatingBar$a)object6);
                    }
                    this.fb();
                }
            } else {
                n10 = Intrinsics.areEqual(object11, object10);
                if (n10 != 0) {
                    object11 = wd2_02.v;
                    if (object11 != null) {
                        object11.setVisibility(0);
                    }
                    if ((object11 = wd2_02.h) != null) {
                        object11.setVisibility(0);
                    }
                    if ((object11 = wd2_02.h) != null) {
                        object11.setMinimumStars(f5);
                    }
                    if ((object11 = wd2_02.h) != null) {
                        object6 = new vq_1(wd2_02);
                        object11.setOnRatingChangeListener((BaseRatingBar$a)object6);
                    }
                    if ((n10 = (int)(this.cb() ? 1 : 0)) != 0) {
                        object11 = wd2_02.s;
                        if (object11 != null && (n10 = (int)(object11.isEmpty() ? 1 : 0)) == 0) {
                            object11 = wd2_02.i;
                            if (object11 != null) {
                                object11.setVisibility(0);
                            }
                            this.gb();
                        } else {
                            object11 = wd2_02.i;
                            if (object11 != null) {
                                n17 = 8;
                                f6 = 1.1E-44f;
                                object11.setVisibility(n17);
                            }
                        }
                        object11 = wd2_02.p;
                        if (object11 != null) {
                            object11.setVisibility(0);
                        }
                        this.ab();
                        this.Ya();
                    } else {
                        this.Za();
                        this.Wa();
                    }
                }
            }
        }
    }

    public final void r3() {
        Object object = lr1_0.Companion;
        Context context = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Object object2 = this.requireActivity().getActivityResultRegistry();
        object.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object2, "registry");
        Intrinsics.checkNotNullParameter(this, "onImageSelectionListener");
        object = new lr1_0(context, (K3)object2, this);
        object2 = "android.permission.CAMERA";
        int n3 = t70.checkSelfPermission(context, (String)object2);
        int n4 = -1;
        if (n3 == n4) {
            object = ((lr1_0)object).i;
            ((N3)object).a(object2);
        } else {
            ((lr1_0)object).c();
        }
    }
}

