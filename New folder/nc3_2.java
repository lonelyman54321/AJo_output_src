/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.databinding.FragmentChooseStoreBinding;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from Nc3
 */
public final class nc3_2
extends BottomSheetDialogFragment
implements lc3_1 {
    public static final Nc3$a Companion;
    public static final /* synthetic */ gn1_2[] m;
    public ArrayList a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public A71 f;
    public ta3_2 g;
    public oc3_2 h;
    public final cc3_2 i;
    public String j;
    public String k;
    public final hh3_2 l;

    static {
        Object object = jz.a(nc3_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentChooseStoreBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        m = gn1_2Array;
        Companion = object = new Object();
    }

    public nc3_2() {
        Object object = z80_0.c(Nc3$b.a, this);
        this.i = object;
        object = new sf2_1(this, 1);
        this.l = object = yr1_2.b((Function0)object);
    }

    public static void Qa(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        od3_2.a = string2;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)aJIOApplication);
        jo_22.E(string2);
    }

    public final FragmentChooseStoreBinding Oa() {
        Object object = m[0];
        object = this.i.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentChooseStoreBinding)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Pa(NewCustomEventsRevamp newCustomEventsRevamp, String string2, String string3) {
        boolean bl2 = this.e;
        Object object = bl2 ? "store switch screen" : "store switch halfcut screen";
        String string4 = object;
        object = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        String string5 = newCustomEventsRevamp.getEVENT_CATEGORY_STORE_SWITCH_INTERACTIONS();
        String string6 = newCustomEventsRevamp.getEVENT_STORE_SWITCH_INTERACTIONS();
        String string7 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string8 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string2, string3, string6, string4, string4, string7, null, string8, false, null, 1536, null);
    }

    public final void b5(String object, String object2) {
        Object object3 = "storeId";
        Intrinsics.checkNotNullParameter(object, object3);
        boolean bl2 = this.e;
        if (bl2 || !(bl2 = Intrinsics.areEqual(object, object3 = od3_2.a()))) {
            bl2 = false;
            object3 = null;
            p50_0.e = false;
            Object object4 = this.f;
            if (object4 != null) {
                int n3;
                boolean bl3 = true;
                object4.N0(bl3);
                object4 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                String string2 = ((NewCustomEventsRevamp)object4).getEVENT_ACTION_STORE_SWITCH();
                this.Pa((NewCustomEventsRevamp)object4, string2, (String)object);
                boolean bl4 = this.d;
                if (bl4 && (object4 = this.f) != null) {
                    object4.h0();
                }
                Z6.g = false;
                object3 = ld3_2.STORE_AJIO;
                object4 = ((ld3_2)((Object)object3)).getStoreId();
                bl4 = Intrinsics.areEqual(object, object4);
                if (bl4) {
                    nc3_2.Qa((String)object);
                    object = this.f;
                    if (object != null) {
                        object.f(bl3);
                    }
                } else {
                    object4 = ld3_2.STORE_LUXE.getStoreId();
                    bl4 = Intrinsics.areEqual(object, object4);
                    if (bl4) {
                        nc3_2.Qa((String)object);
                        object = this.f;
                        if (object != null) {
                            object.c(bl3);
                        }
                    } else {
                        object4 = ld3_2.STORE_AJIOGRAM.getStoreId();
                        bl4 = Intrinsics.areEqual(object, object4);
                        if (bl4) {
                            nc3_2.Qa((String)object);
                            object = this.f;
                            if (object != null) {
                                object.c2();
                            }
                            if ((object = this.f) != null) {
                                object.p();
                            }
                        } else {
                            object = od3_2.a();
                            if (object != null && (n3 = ((String)object).length()) != 0) {
                                object = od3_2.a();
                                nc3_2.Qa((String)object);
                            } else {
                                object = ((ld3_2)((Object)object3)).getStoreId();
                                nc3_2.Qa((String)object);
                            }
                            object = this.getDialog();
                            if (object != null) {
                                object.cancel();
                            }
                            object3 = kj0_1.g();
                            object4 = this.getActivity();
                            if (object2 == null) {
                                object2 = "";
                            }
                            Uri uri = Uri.parse((String)object2);
                            string2 = null;
                            ((kj0_1)object3).n((Activity)object4, uri, null, false, false);
                        }
                    }
                }
                if ((n3 = this.d) != 0 && (object = this.getDialog()) != null) {
                    object.cancel();
                }
            } else {
                object2 = this.g;
                if (object2 != null) {
                    object2.J0((String)object);
                }
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2;
        block16: {
            boolean bl2;
            block15: {
                block14: {
                    object2 = "context";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    super.onAttach((Context)object);
                    bl2 = object instanceof A71;
                    if (!bl2) break block14;
                    object = (A71)object;
                    this.f = object;
                    break block15;
                }
                bl2 = object instanceof ta3_2;
                if (!bl2) break block16;
                object = (ta3_2)object;
                this.g = object;
            }
            object = this.l;
            object2 = (r81_0)((hh3_2)object).getValue();
            if (object2 != null) {
                object = (r81_0)((hh3_2)object).getValue();
                object.getClass();
                object2 = new ArrayList();
                object = (ArrayList)((r81_0)object).a.d();
                if (object != null) {
                    boolean bl3;
                    ArrayList arrayList = new ArrayList();
                    object = object.iterator();
                    while (bl3 = object.hasNext()) {
                        Object e2 = object.next();
                        Object object3 = e2;
                        object3 = (StoreInfo)e2;
                        boolean bl4 = ((StoreInfo)object3).isDisplayInChevron();
                        if (!bl4) continue;
                        arrayList.add(e2);
                    }
                    object = new Object();
                    if ((object = CollectionsKt.e0(arrayList, (Comparator)object)) != null) {
                        object = (Iterable)object;
                        CollectionsKt.h0((Iterable)object, (Collection)object2);
                    }
                }
                this.a = object2;
            } else {
                this.dismissAllowingStateLoss();
            }
            object = this.getArguments();
            if (object != null) {
                object2 = "data_header_title";
                boolean bl5 = object.containsKey(object2);
                object2 = bl5 ? object.getString(object2) : "Select A Store";
                this.b = object2;
                object2 = "data_header_sub_title";
                bl5 = object.containsKey((String)object2);
                object2 = bl5 ? object.getString((String)object2) : "Tap on any of the options and start shopping";
                this.c = object2;
                object2 = "is_from_fleek";
                bl5 = object.containsKey((String)object2);
                if (bl5) {
                    this.d = bl2 = object.getBoolean((String)object2);
                }
                if (bl5 = object.containsKey((String)(object2 = "is_interstitial"))) {
                    this.e = bl2 = object.getBoolean((String)object2);
                }
                if (bl5 = object.containsKey((String)(object2 = "data_akamai_personalisation"))) {
                    this.j = object2 = object.getString((String)object2);
                }
                if (bl5 = object.containsKey((String)(object2 = "data_current_experience"))) {
                    this.k = object = object.getString((String)object2);
                }
            } else {
                this.dismissAllowingStateLoss();
            }
            return;
        }
        object = pn_2.b((Context)object, " must implement HomeListener or SplashListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCancel(DialogInterface object) {
        Intrinsics.checkNotNullParameter(object, "dialog");
        super.onCancel((DialogInterface)object);
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        String string2 = ((NewCustomEventsRevamp)object).getEVENT_ACTION_STORE_SWITCH_CLOSED();
        String string3 = "";
        this.Pa((NewCustomEventsRevamp)object, string2, string3);
        object = this.h;
        if (object != null) {
            object.Q5();
        }
        if ((object = this.f) != null) {
            string2 = null;
            object.N0(false);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_choose_store;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        boolean bl2;
        Object object7 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object7);
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.Oa().titleTv;
        object2 = this.b;
        object.setText((CharSequence)object2);
        object = h40_0.a;
        int n7 = h40_0.b1();
        int n8 = 0;
        object2 = null;
        if (n7 == 0) {
            object = this.a;
            if (object != null) {
                block26: {
                    object = ((ArrayList)object).iterator();
                    while (bl2 = object.hasNext()) {
                        object6 = object7 = object.next();
                        object6 = ((StoreInfo)object7).storeId;
                        object5 = ld3_2.STORE_AJIOGRAM.getStoreId();
                        boolean n4 = ((String)object6).equals(object5);
                        if (!n4) continue;
                        break block26;
                    }
                    bl2 = false;
                    object7 = null;
                }
                object7 = (StoreInfo)object7;
            } else {
                bl2 = false;
                object7 = null;
            }
            object = this.a;
            if (object != null) {
                object = TypeIntrinsics.asMutableCollection(object);
                object.remove(object7);
            }
        }
        object = this.Oa().closeIcon;
        bl2 = false;
        object7 = null;
        object.setVisibility(0);
        object = this.Oa().closeIcon;
        int n4 = 2;
        object6 = new KF1(this, n4);
        object.setOnClickListener((View.OnClickListener)object6);
        n7 = this.e;
        int n10 = 8;
        if (n7 != 0) {
            object = this.Oa().subParentLyt;
            object5 = this.b;
            object4 = this.c;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object5);
            ((StringBuilder)object3).append(", ");
            ((StringBuilder)object3).append((String)object4);
            object5 = ((StringBuilder)object3).toString();
            object.setContentDescription((CharSequence)object5);
            this.Oa().subtitleTv.setVisibility(0);
            object = this.Oa().subtitleTv;
            object5 = this.c;
            object.setText((CharSequence)object5);
            this.setCancelable(false);
        } else {
            object = this.Oa().subtitleTv;
            object.setVisibility(n10);
        }
        n7 = this.e;
        if (n7 != 0) {
            object = this.Oa().titleTv;
            object5 = this.Oa().titleTv.getContext();
            n3 = R$color.color_202020;
            n4 = t70.getColor((Context)object5, n3);
            object.setTextColor(n4);
            object = this.Oa().subtitleTv;
            object5 = this.Oa().subtitleTv.getContext();
            n3 = R$color.color_202020;
            n4 = t70.getColor((Context)object5, n3);
            object.setTextColor(n4);
            this.Oa().subParentLyt.setVisibility(0);
            object = this.Oa().contentLyt;
            object5 = this.Oa().contentLyt.getContext();
            n3 = R$color.transparent;
            object5 = t70.getDrawable((Context)object5, n3);
            object.setBackground((Drawable)object5);
            object = this.Oa().closeIcon;
            object.setVisibility(n10);
        } else {
            n7 = this.d;
            if (n7 != 0) {
                object = this.Oa().titleTv.getContext();
                int n14 = R$color.color_2E343A;
                n7 = t70.getColor((Context)object, n14);
            } else {
                object = this.Oa().titleTv.getContext();
                int n15 = R$color.white;
                n7 = t70.getColor((Context)object, n15);
            }
            boolean bl3 = this.d;
            if (bl3) {
                object6 = this.Oa().titleTv;
                object5 = this.Oa().titleTv.getContext();
                n3 = R$color.white;
                n4 = t70.getColor((Context)object5, n3);
                object6.setTextColor(n4);
                object6 = this.Oa().subtitleTv;
                object5 = this.Oa().subtitleTv.getContext();
                n3 = R$color.white;
                n4 = t70.getColor((Context)object5, n3);
                object6.setTextColor(n4);
                object6 = this.Oa().closeIcon;
                object5 = this.Oa().closeIcon.getContext();
                n3 = R$color.white;
                n4 = t70.getColor((Context)object5, n3);
                object6.setColorFilter(n4);
            }
            object6 = this.Oa().contentLyt.getBackground();
            object5 = "getBackground(...)";
            Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
            n4 = object6 instanceof ShapeDrawable;
            if (n4 != 0) {
                object6 = ((ShapeDrawable)object6).getPaint();
                object6.setColor(n7);
            } else {
                n4 = object6 instanceof GradientDrawable;
                if (n4 != 0) {
                    object6 = (GradientDrawable)object6;
                    object6.setColor(n7);
                } else {
                    n4 = object6 instanceof ColorDrawable;
                    if (n4 != 0) {
                        object6 = (ColorDrawable)object6;
                        object6.setColor(n7);
                    }
                }
            }
        }
        object = this.a;
        int n16 = 1;
        if (object != null && (n7 = ((ArrayList)object).isEmpty() ^ n16) == n16) {
            object = this.Oa().rvStoreList;
            object4 = this.requireContext();
            object5 = new LinearLayoutManager((Context)object4, n16, false);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object5);
            object = this.Oa().rvStoreList;
            object4 = this.a;
            if (object4 != null) {
                object7 = new DisplayMetrics();
                object5 = this.getActivity();
                if (object5 != null && (object5 = object5.getWindowManager()) != null && (object5 = object5.getDefaultDisplay()) != null) {
                    object5.getMetrics((DisplayMetrics)object7);
                }
                int n17 = ((DisplayMetrics)object7).widthPixels;
                boolean bl4 = this.e;
                boolean bl5 = this.d;
                object5 = object2;
                object3 = this;
                object2 = new hu_1((ArrayList)object4, this, n17, bl4, bl5);
            }
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        } else {
            this.dismissAllowingStateLoss();
        }
        object = this.getDialog();
        if (object != null) {
            object2 = new mc3_1(this);
            object.setOnShowListener((DialogInterface.OnShowListener)object2);
        }
        object = new Bundle();
        object.putBoolean("served_from_cms", n16 != 0);
        object.putString("ecomm_pageType", "home");
        object2 = this.j;
        object7 = "user_personalization_bucket";
        if (object2 != null && (n8 = ((String)object2).length()) > 0) {
            object2 = this.j;
            object.putString((String)object7, (String)object2);
        }
        if ((object2 = this.k) != null && (n8 = ((String)object2).length()) > 0) {
            object2 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
            object6 = this.k;
            Intrinsics.checkNotNull(object6);
            ((NewEEcommerceEventsRevamp)object2).addCohortLInkData((Bundle)object, (String)object6);
        }
        object2 = od3_2.a();
        object6 = CustomerStoreType.a;
        object6 = ScreenType.SCREEN_HOME;
        object2 = CustomerStoreType.a((String)object2, (ScreenType)((Object)object6));
        boolean bl6 = this.e;
        object5 = "store switch screen";
        object6 = bl6 ? object5 : "store switch halfcut screen";
        n3 = ((String)object2).length();
        if (n3 > 0) {
            object.putString((String)object7, (String)object2);
        }
        if ((n8 = (int)(this.d ? 1 : 0)) != 0) {
            object2 = "screen_type";
            object.putString((String)object2, (String)object5);
        }
        vb0_0.a(AnalyticsManager.Companion, (String)object6, (Bundle)object);
    }
}

