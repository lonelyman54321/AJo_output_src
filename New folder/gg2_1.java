/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.CustomToolbarOffsetListener;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.services.data.referral.transform.ReferralAjioWalletTransform;
import com.ril.ajio.services.data.referral.transform.ReferralFAQInfo;
import com.ril.ajio.services.data.referral.transform.ReferralFAQTransform;
import com.ril.ajio.services.data.referral.transform.ReferralImageDataTransform;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from GG2
 */
public final class gg2_1
extends Fragment
implements LG2,
t13_0,
OnNavigationClickListener,
CustomToolbarOffsetListener,
iI0 {
    public static final GG2$a Companion;
    public View a;
    public final hh3_2 b;
    public j3_0 c;
    public fo3 d;
    public vh3_2 e;
    public tH2 f;
    public RecyclerView g;
    public tg2_1 h;
    public ShimmerFrameLayout i;
    public View j;
    public CustomToolbarViewMerger k;
    public View l;
    public LayoutInflater m;
    public int n;
    public final NewEEcommerceEventsRevamp o;
    public final NewCustomEventsRevamp p;
    public final String q;
    public final String r;
    public final ArrayList s;
    public float t;
    public float u;

    static {
        GG2$a gG2$a;
        Companion = gG2$a = new Object();
    }

    public gg2_1() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        ArrayList arrayList = new ArrayList(this, 1);
        arrayList = yr1_2.b((Function0)((Object)arrayList));
        this.b = arrayList;
        this.n = -1;
        arrayList = AnalyticsManager.Companion;
        this.o = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)((Object)arrayList)).getInstance().getNewEEcommerceEventsRevamp();
        arrayList = ((AnalyticsManager$Companion)((Object)arrayList)).getInstance().getNewCustomEventsRevamp();
        this.p = arrayList;
        arrayList = newEEcommerceEventsRevamp.getPrevScreen();
        this.q = arrayList;
        arrayList = newEEcommerceEventsRevamp.getPrevScreenType();
        this.r = arrayList;
        this.s = arrayList = new ArrayList();
    }

    public final void G0(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            Object object = this.p;
            String string3 = ((NewCustomEventsRevamp)object).getEC_AJIO_REF_INTERACTION();
            String string4 = "";
            String string5 = "code_copy";
            String string6 = " invite and earn screen";
            String string7 = "referral screen";
            String string8 = this.q;
            String string9 = this.r;
            int n4 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string3, "code copy", string4, string5, string6, string7, string8, null, string9, false, null, n4, null);
            Object object2 = AnalyticsManager.Companion;
            object = " invite and earn screen";
            string3 = "share and earn";
            String string10 = "copy code";
            tj2_0.e((AnalyticsManager$Companion)object2, string3, string10, (String)object);
            n3 = R$string.referral_copied;
            object2 = hv3_0.K(n3);
            hv3_0.b(string2, (String)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Oa(int n3, Object object) {
        synchronized (this) {
            Throwable throwable2;
            block16: {
                block13: {
                    Object object2;
                    int n4;
                    block14: {
                        int n7;
                        int n8;
                        int n10;
                        block15: {
                            n4 = 1;
                            object2 = null;
                            if (n3 == n4) break block14;
                            n10 = 2;
                            n8 = 4;
                            n7 = 3;
                            if (n3 == n7) break block15;
                            n7 = 5;
                            if (n3 != n7) break block13;
                            Object object3 = this.s;
                            n3 = ((ArrayList)object3).size();
                            if (n3 > 0) {
                                object3 = this.s;
                                kH2 kH22 = new kH2(n8, null);
                                ((ArrayList)object3).add(n4, kH22);
                                object3 = this.s;
                                kH2 kH23 = new kH2(n7, object);
                                ((ArrayList)object3).add(n10, kH23);
                                object3 = this.h;
                                if (object3 == null) {
                                    object3 = "referralAdapter";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                } else {
                                    object2 = object3;
                                }
                                ((RecyclerView$f)object2).notifyItemRangeInserted(n4, n10);
                            }
                            break block13;
                        }
                        n3 = object instanceof ReferralFAQTransform;
                        if (n3 == 0) break block13;
                        try {
                            object = (ReferralFAQTransform)object;
                            ArrayList arrayList = ((ReferralFAQTransform)object).getFaqList();
                            n3 = arrayList.size();
                            if (n3 <= 0) break block13;
                            arrayList = this.s;
                            n3 = arrayList.size();
                            Object object4 = this.s;
                            int n14 = n3 + 1;
                            kH2 kH24 = new kH2(n8, null);
                            ((ArrayList)object4).add(n3, kH24);
                            object4 = this.s;
                            n8 = n3 + 2;
                            kH24 = new kH2(n10, null);
                            ((ArrayList)object4).add(n14, kH24);
                            object = ((ReferralFAQTransform)object).getFaqList();
                            object = object.iterator();
                            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                object4 = object.next();
                                object4 = (ReferralFAQInfo)object4;
                                ArrayList arrayList2 = this.s;
                                n14 = n8 + 1;
                                kH24 = new kH2(n7, object4);
                                arrayList2.add(n8, kH24);
                                n8 = n14;
                            }
                            object = this.h;
                            if (object == null) {
                                object = "referralAdapter";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            } else {
                                object2 = object;
                            }
                            n8 -= n3;
                        }
                        catch (Throwable throwable2) {}
                        ((RecyclerView$f)object2).notifyItemRangeInserted(n3, n8);
                        break block13;
                        break block16;
                    }
                    Object object5 = this.s;
                    ((ArrayList)object5).clear();
                    object5 = this.s;
                    kH2 kH25 = new kH2(n4, object);
                    object = null;
                    ((ArrayList)object5).add(0, kH25);
                    object5 = this.h;
                    if (object5 == null) {
                        object5 = "referralAdapter";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    } else {
                        object2 = object5;
                    }
                    ((RecyclerView$f)object2).notifyDataSetChanged();
                }
                return;
            }
            throw throwable2;
        }
    }

    public final UserInformation Pa() {
        return (UserInformation)this.b.getValue();
    }

    public final void Qa(ReferralAjioWalletTransform referralAjioWalletTransform) {
        float f5;
        float f6;
        Float f7;
        int n3;
        tH2 tH22 = this.f;
        if (tH22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralViewModel");
            n3 = 0;
            tH22 = null;
        }
        tH22.j = referralAjioWalletTransform;
        n3 = 0;
        tH22 = null;
        if (referralAjioWalletTransform != null && (f7 = referralAjioWalletTransform.getAmount()) != null) {
            f6 = f7.floatValue();
        } else {
            f6 = 0.0f;
            f7 = null;
        }
        n3 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
        if (n3 > 0) {
            n3 = 5;
            this.Oa(n3, referralAjioWalletTransform);
        }
    }

    public final void R7(int n3) {
        int n4;
        gg2_1 gg2_12 = this;
        int n7 = n3;
        Object object = this.s;
        Object object2 = ((kH2)((ArrayList)object).get((int)n3)).b;
        int n8 = object2 instanceof ReferralFAQInfo;
        if (n8 != 0 && (n8 = (int)(((ReferralFAQInfo)(object2 = (ReferralFAQInfo)object2)).isExpanded() ? 1 : 0)) != 0) {
            NewCustomEventsRevamp newCustomEventsRevamp = this.p;
            String string2 = newCustomEventsRevamp.getEC_INVITE_AND_EARN_INTERACTION();
            object2 = ((ReferralFAQInfo)object2).getQues();
            String string3 = String.valueOf(object2);
            String string4 = "faq click";
            String string5 = "faq_click";
            String string6 = " invite and earn screen";
            String string7 = "referral screen";
            String string8 = this.q;
            String string9 = this.r;
            int n10 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string4, string3, string5, string6, string7, string8, null, string9, false, null, n10, null);
        }
        if ((n4 = gg2_12.n) > (n8 = -1) && n4 != n7 && (n4 = ((ArrayList)object).size()) > (n8 = gg2_12.n)) {
            object2 = (kH2)((ArrayList)object).get(n8);
            n8 = 3;
            n4 = ((kH2)object2).a;
            if (n8 == n4) {
                n4 = gg2_12.n;
                object = ((ArrayList)object).get(n4);
                object2 = "get(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object = ((kH2)object).b;
                n4 = object instanceof ReferralFAQInfo;
                if (n4 != 0) {
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.referral.transform.ReferralFAQInfo");
                    object = (ReferralFAQInfo)object;
                    n4 = 0;
                    object2 = null;
                    ((ReferralFAQInfo)object).setExpanded(false);
                    object = gg2_12.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("referralAdapter");
                        object = null;
                    }
                    n4 = gg2_12.n;
                    ((RecyclerView$f)object).notifyItemChanged(n4);
                }
            }
        }
        gg2_12.n = n7;
    }

    public final void Ra(ReferralImageDataTransform referralImageDataTransform) {
        float f5;
        Object object = h40_0.a;
        boolean bl2 = h40_0.t1();
        Object object2 = null;
        if (!bl2) {
            CharSequence charSequence;
            if (referralImageDataTransform == null || (object = referralImageDataTransform.getHeadLine()) == null) {
                object = "";
            }
            CustomToolbarViewMerger customToolbarViewMerger = this.k;
            String string2 = "customToolbarViewMerger";
            if (customToolbarViewMerger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                customToolbarViewMerger = null;
            }
            customToolbarViewMerger.setSubTitleText((String)object);
            customToolbarViewMerger = this.k;
            if (customToolbarViewMerger == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                customToolbarViewMerger = null;
            }
            customToolbarViewMerger = customToolbarViewMerger.getHeaderSubTitleTv();
            String string3 = " ";
            if (customToolbarViewMerger != null) {
                int n3 = R$string.header_text;
                charSequence = hv3_0.K(n3);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence);
                stringBuilder.append(string3);
                stringBuilder.append((String)object);
                charSequence = stringBuilder.toString();
                customToolbarViewMerger.setContentDescription(charSequence);
            }
            if ((customToolbarViewMerger = this.k) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                customToolbarViewMerger = null;
            }
            if ((customToolbarViewMerger = customToolbarViewMerger.getFloatSubtitleTv()) != null) {
                int n4 = R$string.title_text;
                string2 = hv3_0.K(n4);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                customToolbarViewMerger.setContentDescription((CharSequence)object);
            }
        }
        if (referralImageDataTransform != null) {
            object = this.Pa().getUserReferralCode();
            referralImageDataTransform.setReferralCode((String)object);
        }
        if (referralImageDataTransform != null) {
            f5 = this.u;
            object = Float.valueOf(f5);
            referralImageDataTransform.setReferralBonus((Float)object);
        }
        if (referralImageDataTransform != null) {
            f5 = this.t;
            object = Float.valueOf(f5);
            referralImageDataTransform.setRefereeBonus((Float)object);
        }
        if ((object = this.f) == null) {
            object = "referralViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        ((tH2)object2).i = referralImageDataTransform;
        this.Oa(1, referralImageDataTransform);
    }

    public final void Sa(String string2, String string3) {
        Object object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            object = null;
        }
        object.stopLoader();
        object = new StringBuilder();
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append("\n\n");
        ((StringBuilder)object).append(string2);
        string2 = ((StringBuilder)object).toString();
        string3 = this.getContext();
        object = "Referral";
        d23_0.f((Context)string3, string2, (String)object, null, (String)object);
    }

    public final void V1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "shareLink");
        this.Pa().setUserReferralLink(string2);
        this.Sa(string2, string3);
    }

    public final void onActivityCreated(Bundle object) {
        boolean bl2;
        super.onActivityCreated((Bundle)object);
        object = this.f;
        Object object2 = "referralViewModel";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        if ((object = object.i) == null) {
            View view;
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("referralShimmerView");
                bl2 = false;
                object = null;
            }
            if ((view = this.j) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("referralShimmerParentView");
                boolean bl3 = false;
                view = null;
            }
            hv3_0.r0((ShimmerFrameLayout)((Object)object), view);
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            object = this.Pa().getUserReferralCode();
            int n3 = 1;
            if (object != null && (bl2 = object.length())) {
                bl2 = false;
                object = null;
            } else {
                bl2 = true;
            }
            ((tH2)object3).b(bl2 ^= n3);
        } else {
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object = null;
            }
            object = object.i;
            this.Ra((ReferralImageDataTransform)object);
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object = null;
            }
            if ((object = object.j) == null) {
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object3 = object;
                }
                object = ((tH2)object3).e;
                object = ((tH2)object3).a.a((zr1_1)object);
                object2 = qt2_2.c;
                object = object.h((Scheduler)object2);
                object2 = ti_2.a();
                object = object.e((Scheduler)object2);
                int n4 = 2;
                object2 = new oc_2(n4);
                pc_0 pc_02 = new pc_0(1, (Function1)object2);
                int n7 = 1;
                object2 = new qc_2(n7);
                int n8 = 1;
                rc_0 rc_02 = new rc_0(n8, (Function1)object2);
                object = object.f(pc_02, rc_02);
                object2 = ((tH2)object3).b;
                ((t30_0)object2).b((yr0_2)object);
            } else {
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    bl2 = false;
                    object = null;
                }
                object = object.j;
                this.Qa((ReferralAjioWalletTransform)object);
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    bl2 = false;
                    object = null;
                }
                if ((object = object.k) == null) {
                    object = this.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = object;
                    }
                    object = ((tH2)object3).g;
                    object = ((tH2)object3).a.b((zr1_1)object, "referral");
                    object2 = qt2_2.c;
                    object = object.h((Scheduler)object2);
                    object2 = ti_2.a();
                    object = object.e((Scheduler)object2);
                    int n10 = 1;
                    object2 = new ha1_2(n10);
                    qH2 qH22 = new qH2((ha1_2)object2);
                    int n14 = 1;
                    object2 = new ja1_2(n14);
                    rH2 rH22 = new rH2(object2);
                    object = object.f(qH22, rH22);
                    object2 = ((tH2)object3).b;
                    ((t30_0)object2).b((yr0_2)object);
                } else {
                    object = this.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        bl2 = false;
                        object = null;
                    }
                    object = object.k;
                    tH2 tH22 = this.f;
                    if (tH22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object3 = tH22;
                    }
                    ((tH2)object3).k = object;
                    int n15 = 3;
                    this.Oa(n15, object);
                }
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.c = object2 = (j3_0)object;
            bl2 = object instanceof fo3;
            if (bl2) {
                object2 = object;
                this.d = object2 = (fo3)object;
            }
            if (bl2 = object instanceof vh3_2) {
                object = (vh3_2)object;
                this.e = object;
            }
            return;
        }
        object = pn_2.b(object, " Must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Object object4 = tH2.class;
        Object object5 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, object4, (String)object5);
        object2 = "<this>";
        object3 = sw0_0.a(object4, (String)object2, object4, (String)object5, (String)object5);
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            float f5;
            float f6;
            float f7;
            float f8;
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object2 = ((String)object4).concat((String)object2);
            this.f = object = (tH2)((pD3)object).a((yn1_2)object3, (String)object2);
            object = this.getArguments();
            object2 = null;
            if (object != null) {
                float f11;
                this.t = f11 = object.getFloat("REFEREE_EARN_AMOUNT", 0.0f);
                object3 = "REFERRER_EARN_AMOUNT";
                this.u = f8 = object.getFloat((String)object3, 0.0f);
            }
            if ((f7 = (f6 = (f8 = this.t) - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0 || (f7 = (f5 = (f8 = this.u) - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) <= 0) {
                object = this.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("referralViewModel");
                    f7 = 0.0f;
                    f8 = 0.0f;
                    object = null;
                }
                object2 = ((tH2)object).l;
                object2 = ((tH2)object).a.c((zr1_1)object2);
                object3 = qt2_2.c;
                object2 = ((g53_0)object2).h((Scheduler)object3);
                object3 = ti_2.a();
                object2 = ((g53_0)object2).e((Scheduler)object3);
                int n3 = 1;
                object3 = new sg0_0(n3);
                object4 = new sH2((sg0_0)object3);
                object3 = new Object();
                int n4 = 1;
                object5 = new nc_0(n4, (Function1)object3);
                object2 = ((g53_0)object2).f((o60_0)object4, (o60_0)object5);
                object = ((tH2)object).b;
                ((t30_0)object).b((yr0_2)object2);
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this.m = layoutInflater;
        int n3 = R$layout.fragment_referral;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        object = new CustomToolbarViewMerger(this, this);
        this.k = object;
        Intrinsics.checkNotNull(layoutInflater);
        ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        return layoutInflater;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        j3_0 j3_02 = this.c;
        if (j3_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            j3_02 = null;
        }
        j3_02.stopLoader();
    }

    public final void onNavigationClick() {
        boolean bl2;
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && !(bl2 = (fragmentActivity = this.requireActivity()).isFinishing()) && (fragmentActivity = this.getActivity()) != null) {
            fragmentActivity.onBackPressed();
        }
    }

    public final void onResume() {
        super.onResume();
        km_1.a(AnalyticsManager.Companion, " invite and earn screen");
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = this.o;
        String string2 = newEEcommerceEventsRevamp.getPrevScreen();
        String string3 = newEEcommerceEventsRevamp.getPrevScreenType();
        this.p.newPushCustomScreenView("invite friends", "invite friends", string2, null, string3);
    }

    public final void onScrolled(boolean bl2) {
        int n3 = 2;
        String string2 = "customToolbarViewMerger";
        CustomToolbarViewMerger customToolbarViewMerger = null;
        if (bl2) {
            CustomToolbarViewMerger customToolbarViewMerger2 = this.k;
            if (customToolbarViewMerger2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl3 = false;
                customToolbarViewMerger2 = null;
            }
            int n4 = R$drawable.nav_back;
            Drawable drawable2 = hv3_0.r(n4);
            CustomToolbarViewMerger.setNavigationIcon$default(customToolbarViewMerger2, drawable2, null, n3, null);
            customToolbarViewMerger2 = this.k;
            if (customToolbarViewMerger2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl4 = false;
                customToolbarViewMerger2 = null;
            }
            n3 = hv3_0.m(R$color.accent_color_10);
            customToolbarViewMerger2.setFloatTitleColor(n3);
            customToolbarViewMerger2 = this.k;
            if (customToolbarViewMerger2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                customToolbarViewMerger = customToolbarViewMerger2;
            }
            int n7 = hv3_0.m(R$color.accent_color_10);
            customToolbarViewMerger.setFloatSubtitleColor(n7);
        } else {
            CustomToolbarViewMerger customToolbarViewMerger3 = this.k;
            if (customToolbarViewMerger3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl5 = false;
                customToolbarViewMerger3 = null;
            }
            int n8 = R$drawable.ic_back_white_refresh;
            Drawable drawable3 = hv3_0.r(n8);
            CustomToolbarViewMerger.setNavigationIcon$default(customToolbarViewMerger3, drawable3, null, n3, null);
            customToolbarViewMerger3 = this.k;
            if (customToolbarViewMerger3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl6 = false;
                customToolbarViewMerger3 = null;
            }
            n3 = hv3_0.m(R$color.accent_color_11);
            customToolbarViewMerger3.setFloatTitleColor(n3);
            customToolbarViewMerger3 = this.k;
            if (customToolbarViewMerger3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                customToolbarViewMerger = customToolbarViewMerger3;
            }
            int n10 = hv3_0.m(R$color.accent_color_11);
            customToolbarViewMerger.setFloatSubtitleColor(n10);
        }
    }

    public final void onStop() {
        this.o.setPreviousScreenData(" invite and earn screen", "referral screen");
        super.onStop();
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        StringBuilder stringBuilder;
        String string2;
        int n3;
        float f5;
        int n4;
        Object object3;
        Object object4 = null;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getActivity();
        int n8 = object2 instanceof AppCompatActivity;
        Object object5 = null;
        Object object6 = "customToolbarViewMerger";
        if (n8 != 0) {
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object2 = (AppCompatActivity)object2;
            object3 = this.k;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n4 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            object3 = ((CustomToolbarViewMerger)object3).getToolbar();
            object2.setSupportActionBar((Toolbar)object3);
        }
        n8 = R$id.app_bar_layout;
        object2 = object.findViewById(n8);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        ((AppBarLayout)object2).setOutlineProvider(null);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n8 = 0;
            object2 = null;
        }
        object2.setNavigationClick();
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n8 = 0;
            object2 = null;
        }
        n4 = R$drawable.ic_back_white_refresh;
        object3 = hv3_0.r(n4);
        int n10 = 2;
        CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object2, (Drawable)object3, null, n10, null);
        object2 = z40_0.Companion;
        object3 = this.requireActivity().getApplication();
        Object object7 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object7);
        object2.getClass();
        object2 = z40$a.a((Context)object3).a.b("referral_landing_page_title");
        object3 = this.k;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object3 = null;
            f5 = 0.0f;
        }
        ((CustomToolbarViewMerger)object3).setTitleText((String)object2);
        object3 = this.k;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object3 = null;
            f5 = 0.0f;
        }
        if ((object3 = ((CustomToolbarViewMerger)object3).getToolbar()) != null) {
            n10 = R$string.acc_page_header_invite;
            object7 = hv3_0.K(n10);
            object3.setContentDescription((CharSequence)object7);
        }
        object7 = Looper.getMainLooper();
        object3 = new Handler((Looper)object7);
        object7 = new BG2(this, 0);
        long l2 = 300L;
        object3.postDelayed((Runnable)object7, l2);
        object3 = this.k;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object3 = null;
            f5 = 0.0f;
        }
        object3 = ((CustomToolbarViewMerger)object3).getHeaderTitleTv();
        object7 = " ";
        if (object3 != null) {
            n3 = R$string.header_text;
            string2 = hv3_0.K(n3);
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append((String)object7);
            stringBuilder.append((String)object2);
            string2 = stringBuilder.toString();
            object3.setContentDescription((CharSequence)string2);
        }
        if ((object3 = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n4 = 0;
            object3 = null;
            f5 = 0.0f;
        }
        if ((object3 = ((CustomToolbarViewMerger)object3).getFloatTitleTv()) != null) {
            n3 = R$string.title_text;
            string2 = hv3_0.K(n3);
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append((String)object7);
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object3.setContentDescription((CharSequence)object2);
        }
        if ((object2 = this.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n8 = 0;
            object2 = null;
        }
        n4 = hv3_0.m(R$color.accent_color_10);
        object2.setToolbarTitleColor(n4);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n8 = 0;
            object2 = null;
        }
        n4 = hv3_0.m(R$color.accent_color_10);
        object2.setToolbarSubtitleColor(n4);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n8 = 0;
            object2 = null;
        }
        n4 = hv3_0.m(R$color.accent_color_11);
        object2.setFloatTitleColor(n4);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n8 = 0;
            object2 = null;
        }
        n4 = hv3_0.m(R$color.accent_color_11);
        object2.setFloatSubtitleColor(n4);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n8 = 0;
            object2 = null;
        }
        n4 = 1098907648;
        f5 = 16.0f;
        object2.setFloatViewTitleTextSize(f5);
        object2 = this.k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n8 = 0;
            object2 = null;
        }
        float f6 = 11.0f;
        object2.setFloatViewSubtitleTextSize(f6);
        n8 = R$id.app_bar_layout;
        ((AppBarLayout)object.findViewById(n8)).setExpanded(n7 != 0);
        n8 = R$id.toolbar_background;
        object2 = object.findViewById(n8);
        this.a = object2;
        n8 = R$id.referral_rv;
        object2 = (RecyclerView)object.findViewById(n8);
        this.g = object2;
        n8 = R$id.referral_shimmer_view;
        object2 = (ShimmerFrameLayout)object.findViewById(n8);
        this.i = object2;
        n8 = R$id.referral_shimmer_view_parent;
        object2 = object.findViewById(n8);
        this.j = object2;
        n8 = R$id.referral_layout_parent;
        object = object.findViewById(n8);
        this.l = object;
        object2 = this.s;
        object = new tg2_1((ArrayList)object2, this, this);
        this.h = object;
        object = this.g;
        object2 = "referralRv";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object3 = this.getContext();
        object6 = new WrapperLinearLayoutManager((Context)object3);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object6);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        if ((object2 = this.h) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralAdapter");
            n8 = 0;
            object2 = null;
        }
        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        object = this.d;
        if (object != null) {
            object.hideToolbarLayout();
        }
        if ((object = this.e) != null) {
            object.showTabLayout(false);
        }
        object = h40_0.a;
        bl2 = h40_0.t1();
        object2 = "toolbarGradient";
        if (bl2) {
            object = this.a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object = null;
            }
            n8 = R$drawable.referral_gradient_top_bg;
            object.setBackgroundResource(n8);
        } else {
            object = this.a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object = null;
            }
            n8 = R$drawable.referral_gradient_bg;
            object.setBackgroundResource(n8);
        }
        object = this.f;
        object2 = "referralViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object = ((tH2)object).d;
        object4 = this.getViewLifecycleOwner();
        object6 = new jf_1(this, n7);
        object3 = new GG2$b((Function1)object6);
        ((LiveData)object).e((mu1_1)object4, (F62)object3);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object = ((tH2)object).f;
        object4 = this.getViewLifecycleOwner();
        object6 = new v81_0(this, n7);
        object3 = new GG2$b((Function1)object6);
        ((LiveData)object).e((mu1_1)object4, (F62)object3);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object = ((tH2)object).h;
        object4 = this.getViewLifecycleOwner();
        object6 = new dr2_1(this, n7);
        GG2$b gG2$b = new GG2$b((Function1)object6);
        ((LiveData)object).e((mu1_1)object4, gG2$b);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object5 = object;
        }
        object = ((tH2)object5).m;
        object2 = this.getViewLifecycleOwner();
        object4 = new cg2_1(this);
        gG2$b = new GG2$b((Function1)object4);
        ((LiveData)object).e((mu1_1)object2, gG2$b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q7(String string2) {
        int n3;
        gg2_1 gg2_12 = this;
        Object object = string2;
        int n4 = 2;
        int n7 = 1;
        int n8 = 3;
        String string3 = "format(...)";
        tj2_0.e(AnalyticsManager.Companion, "share and earn", "others", " invite and earn screen");
        Object object2 = this.p;
        String string4 = ((NewCustomEventsRevamp)object2).getEC_AJIO_REF_INTERACTION();
        String string5 = "code share click";
        String string6 = "";
        String string7 = "code_share_click";
        String string8 = " invite and earn screen";
        String string9 = "referral screen";
        Object object3 = this.q;
        Object object4 = this.r;
        int n10 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string4, string5, string6, string7, string8, string9, (String)object3, null, (String)object4, false, null, n10, null);
        object3 = z40_0.Companion;
        object4 = this.requireActivity().getApplication();
        String string10 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object4, string10);
        object3.getClass();
        object3 = z40$a.a((Context)object4).a;
        object4 = "referral_share_message";
        object3 = ((ao0_0)object3).b((String)object4);
        float f5 = this.t;
        Object[] objectArray = null;
        object2 = "";
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 > 0) {
            object4 = qz2_0.x(Float.valueOf(f5));
            objectArray = " ";
            object4 = Ft2.a((String)object4, (String)objectArray);
        } else {
            object4 = object2;
        }
        try {
            objectArray = StringCompanionObject.INSTANCE;
            objectArray = this.Pa();
            objectArray = objectArray.getUserName();
            Object[] objectArray2 = new Object[n8];
            objectArray2[0] = objectArray;
            objectArray2[n7] = object;
            objectArray2[n4] = object4;
            objectArray = Arrays.copyOf(objectArray2, n8);
            object3 = String.format((String)object3, objectArray);
            Intrinsics.checkNotNullExpressionValue(object3, string3);
        }
        catch (Exception exception) {
            yn3_0.a.e(exception);
            object3 = StringCompanionObject.INSTANCE;
            object3 = this.Pa().getUserName();
            objectArray = new Object[n8];
            objectArray[0] = object3;
            objectArray[n7] = object;
            objectArray[n4] = object4;
            object3 = xh2_0.a(objectArray, n8, "Your Friend %s invited you to join Ajio. Use his code %s to sign up and earn %sAJIO Cash.", string3);
        }
        Object object5 = object3;
        object3 = z40_0.Companion;
        Object object6 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object6, string10);
        object3.getClass();
        string5 = z40$a.a((Context)object6).a.b("referral_utm_source");
        object3 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object3, string10);
        string6 = z40$a.a((Context)object3).a.b("referral_utm_medium");
        object3 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object3, string10);
        object3 = z40$a.a((Context)object3).a;
        object6 = "referral_utm_campaign";
        string7 = ((ao0_0)object3).b((String)object6);
        object3 = this.Pa().getUserReferralLink();
        if (object3 != null && (n3 = ((String)object3).length()) != 0 && (object3 = this.Pa().getUserOriginalReferralLink()) != null && (n3 = ((String)object3).length()) != 0) {
            try {
                object3 = this.Pa();
                object3 = ((UserInformation)object3).getUserOriginalReferralLink();
                object3 = Uri.parse((String)object3);
                object6 = "utm_source";
                object6 = object3.getQueryParameter((String)object6);
                string3 = "utm_medium";
                string3 = object3.getQueryParameter(string3);
                object4 = "utm_campaign";
                object3 = object3.getQueryParameter((String)object4);
                if (object6 != null && (n8 = (int)(((String)object6).equals(string5) ? 1 : 0)) == n7 && string3 != null && (n8 = (int)(string3.equals(string6) ? 1 : 0)) == n7 && object3 != null && (n3 = (int)(((String)object3).equals(string7) ? 1 : 0)) == n7) {
                    object3 = this.Pa().getUserReferralLink();
                    if (object3 != null) {
                        object2 = object3;
                    }
                    gg2_12.Sa((String)object2, (String)object5);
                    return;
                }
            }
            catch (Exception exception) {
                object6 = yn3_0.a;
                ((yn3$a)object6).e(exception);
            }
        }
        if (object == null) return;
        n3 = string2.length();
        if (n3 == 0) {
            return;
        }
        object3 = gg2_12.c;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            n3 = 0;
            object3 = null;
        }
        object3.startLoader();
        object3 = UrlHelper.Companion.getInstance().getBaseUrl();
        object6 = this.Pa().getUserName();
        string3 = "/login?referral_name=";
        object4 = "&referral_code=";
        object3 = KW.a((String)object3, string3, (String)object6, (String)object4, (String)object);
        cp_1.Companion.getClass();
        cp$a.e().getClass();
        string8 = null;
        string9 = null;
        Object object7 = object3;
        object = cp_1.c((String)object3, string5, string6, string7, null, null);
        if (object != null) {
            object3 = object;
        }
        object = this.Pa();
        ((UserInformation)object).setUserOriginalReferralLink((String)object3);
        d23_0.b((String)object5, (String)object3, gg2_12, false, n7 != 0);
    }

    public final void va() {
        j3_0 j3_02;
        j3_0 j3_03 = this.c;
        Object object = null;
        Object object2 = "activityFragmentListener";
        if (j3_03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            j3_03 = null;
        }
        if ((j3_02 = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object = j3_02;
        }
        object = object.y();
        q5_0.Companion.getClass();
        object2 = new q5_0();
        j3$a.a(j3_03, (Fragment)object, (Fragment)object2, true, "AjioCashFragmentRefresh");
    }
}

