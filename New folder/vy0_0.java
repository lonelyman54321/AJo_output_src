/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.customviews.AddressWidgetView;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.prioritydelivery.PlpDelivery;
import com.ril.ajio.services.data.prioritydelivery.PlpFilters;
import com.ril.ajio.services.data.prioritydelivery.PriorityDeliveryP2Config;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from VY0
 */
public class vy0_0
extends sm3_0
implements KI0,
ChangeLocationListener,
zm_2 {
    public static final VY0$a Companion;
    public final hh3_2 b;
    public RecyclerView c;
    public AjioTextView d;
    public int e;
    public zm0_0 f;
    public GI0 g;
    public LinearLayout h;
    public ImageView i;
    public AjioTextView j;
    public AjioTextView k;
    public AjioTextView l;
    public ConstraintLayout m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;
    public CartAddressListBottomSheet r;
    public fo_1 s;
    public ff0_2 t;
    public jo_2 u;
    public CartDeliveryAddress v;
    public gj2_1 w;
    public qy0_1 x;
    public FacetValue y;

    static {
        VY0$a vY0$a;
        Companion = vY0$a = new Object();
    }

    public vy0_0() {
        Object object = new ty0_1(this);
        this.b = object = yr1_2.b((Function0)object);
        this.e = -1;
        this.o = true;
        this.q = "";
    }

    public final void M9(String object) {
        String string2 = "addressId";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = h40_0.Q1();
        if (bl2 && (object = this.r) != null) {
            ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        }
    }

    public final void N7() {
        AddressType addressType;
        lm_2 lm_22 = new lm_2();
        Intrinsics.checkNotNullParameter(this, "cartAddressCallBackListener");
        lm_22.S = this;
        Object object = this.u;
        String string2 = "appPreferences";
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        if ((object = (object = ((jo_2)object).l()) != null ? ((CartDeliveryAddress)object).getAddressType() : null) == (addressType = AddressType.Pincode)) {
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            object = ((jo_2)object2).m();
            if (object == null) {
                object = "";
            }
            string2 = "preFillPinCode";
            Intrinsics.checkNotNullParameter(object, string2);
            lm_22.R = object;
        }
        object = this.requireActivity().getSupportFragmentManager();
        lm_22.show((FragmentManager)object, "CartAddAddressBottomSheet");
    }

    public final F12 Pa() {
        return (F12)this.b.getValue();
    }

    public void Qa(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        int n4 = R$id.category_selection_tv;
        Object object2 = (AjioTextView)object.findViewById(n4);
        this.d = object2;
        n4 = R$id.root_view;
        object2 = (ConstraintLayout)object.findViewById(n4);
        if (object2 != null) {
            ih2_0 ih2_02 = new Object();
            object2.setOnClickListener((View.OnClickListener)ih2_02);
        }
        n4 = R$id.facet_value_rv;
        object2 = (RecyclerView)object.findViewById(n4);
        this.c = object2;
        n4 = R$id.include_unrated_product_selected_ll;
        object2 = (LinearLayout)object.findViewById(n4);
        this.h = object2;
        n4 = R$id.include_unrated_product_selected_iv;
        object2 = (ImageView)object.findViewById(n4);
        this.i = object2;
        n4 = R$id.filter_message;
        object2 = (AjioTextView)object.findViewById(n4);
        this.j = object2;
        n4 = R$id.enter_location;
        object2 = (AjioTextView)object.findViewById(n4);
        this.k = object2;
        n4 = R$id.error_location;
        object2 = (AjioTextView)object.findViewById(n4);
        this.l = object2;
        n4 = R$id.address_bar_ui;
        object = (ConstraintLayout)object.findViewById(n4);
        this.m = object;
        object2 = this.requireActivity();
        int n7 = 1;
        object = new LinearLayoutManager((Context)object2, n7, false);
        object2 = this.c;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        this.Ua();
        object = this.Pa();
        n4 = 0;
        object2 = null;
        if (object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).X) != null) {
            object = ((Facet)object).getValues();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = 4;
        if (object != null) {
            int n8;
            object = this.Pa();
            Intrinsics.checkNotNull(object);
            object = ((F12)object).d.X;
            if (object != null) {
                object2 = ((Facet)object).getValues();
            }
            Intrinsics.checkNotNull(object2);
            object = ImmutableList.copyOf((Collection)object2);
            n4 = this.e;
            if (n4 != n7 && n4 != (n8 = 5)) {
                Intrinsics.checkNotNull(object);
                object = ImmutableList.copyOf((Collection)mz3_0.a(mz3_0.v((ImmutableList)object)));
            }
            Object object3 = object;
            this.Va();
            Intrinsics.checkNotNull(object3);
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            HashMap hashMap = ((F12)object2).d.R;
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            HashMap hashMap2 = ((F12)object2).d.S;
            int n10 = this.e;
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            Boolean bl2 = ((F12)object2).d.I;
            n4 = 0;
            ry0_1 ry0_12 = new ry0_1(this, 0);
            this.x = object = new qy0_1((ImmutableList)object3, hashMap, hashMap2, this, n10, bl2, ry0_12);
            object2 = this.c;
            if (object2 != null) {
                ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
            }
        }
        if ((n3 = this.e) == n7) {
            object = this.h;
            if (object != null) {
                object.setVisibility(0);
            }
        } else {
            object = this.h;
            if (object != null) {
                n4 = 8;
                object.setVisibility(n4);
            }
        }
        if ((object = this.h) != null) {
            object2 = new SY0(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }

    public final void Ra() {
        GI0 gI0;
        boolean bl2;
        Object object = new ym0_0(0);
        ((ym0_0)object).a = bl2 = true;
        Object object2 = this.q;
        ((ym0_0)object).b = object2;
        object2 = this.Pa();
        if (object2 != null && (object2 = ((F12)object2).d) != null) {
            object2 = ((bv2_0)object2).X;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null && (gI0 = this.g) != null) {
            gI0.j4((Facet)object2, (ym0_0)object);
            object = Unit.a;
        }
    }

    public void Sa() {
    }

    public final void T2() {
        boolean bl2;
        Object object = new fo_1();
        this.s = object;
        ((fo_1)object).h = bl2 = true;
        Object object2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        ((fo_1)object).i = this;
        object = this.s;
        if (object != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.s) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void Ta() {
        int n3;
        int n4;
        Object object = this.Pa();
        if (object != null) {
            ((F12)object).g = n4 = 1;
        }
        if ((n3 = og1_1.c()) == 0) {
            n3 = h40_0.Q1();
            if (n3 != 0 && (n3 = this.e) == (n4 = 5)) {
                object = this.y;
                if (object == null) {
                    object = this.x;
                    if (object != null) {
                        object = ((qy0_1)object).g();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    this.y = object;
                }
                if ((object = this.y) != null) {
                    n4 = 0;
                    this.Y5((FacetValue)object, false);
                    object = this.x;
                    if (object != null) {
                        n4 = -1;
                        ((qy0_1)object).d(n4);
                    }
                }
            }
        } else {
            this.Sa();
        }
    }

    public final void Ua() {
        int n3;
        int n4;
        Object object = this.Pa();
        Object object2 = null;
        if (object != null && (object = ((F12)object).d) != null) {
            object = ((bv2_0)object).X;
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null && (n4 = this.e) == (n3 = 5)) {
            int n7;
            Object object3;
            object = this.m;
            if (object != null) {
                ai0_2.B((View)object);
            }
            if ((object = this.c) != null) {
                ai0_2.i((View)object);
            }
            if ((n4 = (int)(Intrinsics.areEqual(object = od3_2.a(), object3 = ld3_2.STORE_AJIO.getStoreId()) ? 1 : 0)) != 0) {
                object = this.getContext();
                if (object != null) {
                    object3 = this.l;
                    if (object3 != null) {
                        n7 = R$color.location_error_ajio;
                        n7 = t70.getColor((Context)object, n7);
                        object3.setTextColor(n7);
                    }
                    if ((object3 = this.k) != null) {
                        n7 = R$color.location_enter_ajio;
                        n7 = t70.getColor((Context)object, n7);
                        object3.setTextColor(n7);
                    }
                    if ((object3 = this.j) != null) {
                        n7 = R$color.filter_message_ajio;
                        n4 = t70.getColor((Context)object, n7);
                        object3.setTextColor(n4);
                    }
                }
            } else {
                object = od3_2.a();
                n4 = (int)(Intrinsics.areEqual(object, object3 = ld3_2.STORE_LUXE.getStoreId()) ? 1 : 0);
                if (n4 != 0) {
                    object = this.getContext();
                    if (object != null) {
                        object3 = this.l;
                        if (object3 != null) {
                            n7 = R$color.location_error_luxe;
                            n7 = t70.getColor((Context)object, n7);
                            object3.setTextColor(n7);
                        }
                        if ((object3 = this.k) != null) {
                            n7 = R$color.location_enter_luxe;
                            n7 = t70.getColor((Context)object, n7);
                            object3.setTextColor(n7);
                        }
                        if ((object3 = this.j) != null) {
                            n7 = R$color.filter_message_luxe;
                            n4 = t70.getColor((Context)object, n7);
                            object3.setTextColor(n4);
                        }
                    }
                } else {
                    object = od3_2.a();
                    n4 = (int)(Intrinsics.areEqual(object, object3 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0);
                    if (n4 != 0 && (object = this.getContext()) != null) {
                        object3 = this.l;
                        if (object3 != null) {
                            n7 = R$color.location_error_ajiogram;
                            n7 = t70.getColor((Context)object, n7);
                            object3.setTextColor(n7);
                        }
                        if ((object3 = this.k) != null) {
                            n7 = R$color.location_enter_ajiogram;
                            n7 = t70.getColor((Context)object, n7);
                            object3.setTextColor(n7);
                        }
                        if ((object3 = this.j) != null) {
                            n7 = R$color.filter_message_ajiogram;
                            n4 = t70.getColor((Context)object, n7);
                            object3.setTextColor(n4);
                        }
                    }
                }
            }
            if ((object = this.Pa()) != null && (object = ((F12)object).d) != null && (n4 = (int)(((bv2_0)object).W0 ? 1 : 0)) == 0) {
                object = this.q;
                n4 = ((String)object).length();
                n3 = 0;
                object3 = null;
                n7 = 8;
                if (n4 == 0) {
                    object = h40_0.a;
                    n4 = (int)(h40_0.Q1() ? 1 : 0);
                    if (n4 != 0 && (object = h40_0.k0(false)) != null && (object = ((PriorityDeliveryP2Config)object).getPlpDelivery()) != null && (object = ((PlpDelivery)object).getPlpFilters()) != null && (object = ((PlpFilters)object).getEnterLocationMessage()) != null && (n3 = ((String)object).length()) > 0) {
                        object2 = object;
                    }
                    if (object2 != null && (object = this.k) != null) {
                        ai0_2.B((View)object);
                        object.setText(object2);
                    }
                    if ((object = this.l) != null) {
                        object.setVisibility(n7);
                    }
                } else {
                    object = this.k;
                    if (object != null) {
                        object.setVisibility(n7);
                    }
                    if ((object = this.c) != null) {
                        ai0_2.B((View)object);
                    }
                    if ((object = this.Pa()) != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).M) != null && (n4 = (int)(((ProductsList)object).isSlaNodesAvailable() ? 1 : 0)) == 0) {
                        object = h40_0.a;
                        n4 = (int)(h40_0.Q1() ? 1 : 0);
                        if (n4 != 0 && (object = h40_0.k0(false)) != null && (object = ((PriorityDeliveryP2Config)object).getPlpDelivery()) != null && (object = ((PlpDelivery)object).getPlpFilters()) != null && (object = ((PlpFilters)object).getServiceabilityError()) != null && (n3 = ((String)object).length()) > 0) {
                            object2 = object;
                        }
                        if (object2 != null && (object = this.l) != null) {
                            ai0_2.B((View)object);
                            object.setText((CharSequence)object2);
                        }
                    }
                }
            } else {
                object = this.q;
                n4 = ((String)object).length();
                if (n4 > 0 && (object = this.c) != null) {
                    ai0_2.B((View)object);
                }
            }
        }
    }

    public final void Va() {
        block4: {
            AjioTextView ajioTextView;
            Object object;
            block6: {
                int n3;
                block5: {
                    n3 = this.e;
                    int n4 = 5;
                    if (n3 != n4 || (n3 = ((String)(object = this.q)).length()) <= 0 || (object = this.Pa()) == null || (object = ((F12)object).d) == null || (n3 = (int)(((bv2_0)object).W0 ? 1 : 0)) != (n4 = 1)) break block4;
                    object = h40_0.a;
                    n3 = (int)(h40_0.Q1() ? 1 : 0);
                    if (n3 == 0) break block5;
                    n3 = 0;
                    object = h40_0.k0(false);
                    if (object != null && (object = ((PriorityDeliveryP2Config)object).getPlpDelivery()) != null && (object = ((PlpDelivery)object).getPlpFilters()) != null && (object = ((PlpFilters)object).getFilterMessage()) != null && (n4 = ((String)object).length()) > 0) break block6;
                }
                n3 = 0;
                object = null;
            }
            if (object != null && (ajioTextView = this.j) != null) {
                ai0_2.B((View)ajioTextView);
                ajioTextView.setText((CharSequence)object);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void Wa(CartDeliveryAddress object) {
        void var5_15;
        String string2;
        String string3;
        String string4;
        String string5 = null;
        if (object == null) {
            string4 = null;
            string3 = null;
        } else {
            void var5_12;
            if (object != null) {
                ((CartDeliveryAddress)object).getFormattedAddress();
            }
            if (object != null) {
                String string6 = ((CartDeliveryAddress)object).getFirstName();
            } else {
                Object var5_11 = null;
            }
            string2 = object != null ? ((CartDeliveryAddress)object).getPostalCode() : null;
            string4 = var5_12;
            string3 = string2;
        }
        if (object != null) {
            String string7 = ((CartDeliveryAddress)object).getCompleteAddress();
        } else {
            Object var5_14 = null;
        }
        if (object != null) {
            string5 = ((CartDeliveryAddress)object).getDistrict();
        }
        string2 = ", ";
        String string8 = n1.a((String)var5_15, string2, string5);
        string5 = this.getContext();
        if (string5 != null) {
            void var1_3;
            AddressType addressType;
            ConstraintLayout constraintLayout = this.m;
            AddressWidgetView addressWidgetView = new AddressWidgetView((Context)string5, (View)constraintLayout, this);
            if (object == null || (addressType = ((CartDeliveryAddress)object).getAddressType()) == null) {
                AddressType addressType2 = AddressType.None;
            }
            void var9_20 = var1_3;
            String string9 = od3_2.a();
            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
            String string10 = av_0.a(analyticsManager$Companion);
            int n3 = 64;
            AddressWidgetView.setData$default(addressWidgetView, (AddressType)var9_20, string8, string9, string4, string3, string10, null, n3, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Xa() {
        int n3;
        Object object;
        int n4;
        Object object2 = this.getTag();
        if (object2 != null && (n4 = ((String)object2).equals(object = "verticalsizegroupformat")) == (n3 = 1) && (object2 = this.g) != null) {
            Intrinsics.checkNotNull(object2);
            object = "l1l3nestedcategory";
            n4 = (int)(object2.l9((String)object) ? 1 : 0);
            if (n4 == 0) {
                object = "For better results, Select Category";
                object2 = new SpannableString((CharSequence)object);
                FontsManager fontsManager = FontsManager.getInstance();
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                int n7 = 10;
                fontsManager = fontsManager.getTypefaceWithFont((Context)aJIOApplication, n7);
                VY0$b vY0$b = new VY0$b(this);
                String string2 = "Select Category";
                int n8 = 6;
                int n10 = StringsKt.O((CharSequence)object, string2, 0, false, n8);
                int n14 = 35;
                int n15 = 33;
                object2.setSpan((Object)vY0$b, n10, n14, n15);
                String string3 = "";
                AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string3, (Typeface)fontsManager);
                int n16 = StringsKt.O((CharSequence)object, string2, 0, false, n8);
                object2.setSpan((Object)ajioCustomTypefaceSpan, n16, n14, n15);
                n16 = (int)(this.a ? 1 : 0);
                n16 = n16 != 0 ? R$color.bg_color_accent_3 : R$color.accent_color_4;
                n16 = hv3_0.m(n16);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n16);
                n3 = StringsKt.O((CharSequence)object, string2, 0, false, n8);
                object2.setSpan((Object)foregroundColorSpan, n3, n14, n15);
                object = this.d;
                if (object != null) {
                    object.setText((CharSequence)object2);
                }
                if ((object2 = this.d) != null) {
                    object2.setVisibility(0);
                }
                if ((object2 = this.d) == null) return;
                object = LinkMovementMethod.getInstance();
                object2.setMovementMethod((MovementMethod)object);
                return;
            }
        }
        if ((object2 = this.d) == null) return;
        n3 = 8;
        object2.setVisibility(n3);
    }

    public final void Y5(FacetValue object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "facetValue");
        Object object2 = this.Pa();
        if (object2 != null) {
            if (bl2) {
                this.y = object;
            }
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d.X;
            object2 = object2 != null ? ((Facet)object2).getCode() : null;
            ((FacetValue)object).setFacetCode((String)object2);
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d.R;
            Object object3 = this.Pa();
            Intrinsics.checkNotNull(object3);
            object3 = ((F12)object3).d.S;
            if (bl2) {
                String string2 = ((FacetValue)object).getCode();
                if (string2 != null) {
                    boolean bl3 = ((FacetValue)object).getSelected();
                    if (!bl3) {
                        string2 = ((FacetValue)object).getCode();
                        Intrinsics.checkNotNull(string2);
                        object2.put(string2, object);
                    }
                    object2 = ((FacetValue)object).getCode();
                    Intrinsics.checkNotNull(object2);
                    ((HashMap)object3).remove(object2);
                }
            } else {
                String string3 = ((FacetValue)object).getCode();
                if (string3 != null) {
                    boolean bl4 = ((FacetValue)object).getSelected();
                    if (bl4) {
                        string3 = ((FacetValue)object).getCode();
                        Intrinsics.checkNotNull(string3);
                        object3.put(string3, object);
                    }
                    object3 = ((FacetValue)object).getCode();
                    Intrinsics.checkNotNull(object3);
                    ((HashMap)object2).remove(object3);
                }
            }
            if ((object2 = this.f) != null) {
                object = ((FacetValue)object).getFacetCode();
                object2.B4((String)object, bl2);
            }
        }
    }

    public final void b8(double d2, double d5) {
        ff0_2 ff0_22;
        this.t = ff0_22 = new ff0_2();
        String string2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ff0_22.j = this;
        ff0_22 = this.t;
        if (ff0_22 != null) {
            string2 = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, string2);
            ff0_22.i = this;
        }
        if ((ff0_22 = this.t) != null) {
            ff0_22.l = d2;
            ff0_22.m = d5;
        }
        if (ff0_22 != null) {
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            String string3 = "CartLocationBottomSheet";
            ff0_22.show(fragmentManager, string3);
        }
    }

    public final void loadCartBasedOnSelectedAddress(String object, String object2) {
        this.Ta();
        object2 = this.s;
        if (object2 != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        if ((object2 = this.r) != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        if ((object2 = this.t) != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        if (object != null) {
            this.q = object;
        }
        object2 = new CartDeliveryAddress();
        Object object3 = AddressType.Pincode;
        ((CartDeliveryAddress)object2).setAddressType((AddressType)((Object)object3));
        ((CartDeliveryAddress)object2).setPostalCode((String)object);
        object3 = this.u;
        Object object4 = null;
        String string2 = "appPreferences";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object3 = null;
        }
        ((jo_2)object3).F((CartDeliveryAddress)object2);
        object3 = this.u;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object4 = object3;
        }
        ((jo_2)object4).G((String)object);
        this.Wa((CartDeliveryAddress)object2);
        object = this.w;
        if (object != null && (object = ((gj2_1)object).b) != null) {
            object2 = Boolean.TRUE;
            ((LiveData)object).k(object2);
        }
        this.Ra();
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        object = this.getParentFragment();
        boolean bl2 = object instanceof zm0_0;
        if (bl2) {
            object = this.getParentFragment();
            string2 = "null cannot be cast to non-null type com.ril.ajio.plp.filters.adapters.FilterParentFragmentListener";
            Intrinsics.checkNotNull(object, string2);
            object = (zm0_0)object;
            this.f = object;
        }
        if (bl2 = (object = this.getParentFragment()) instanceof GI0) {
            object = this.getParentFragment();
            string2 = "null cannot be cast to non-null type com.ril.ajio.plp.filters.adapters.FacetNameClickListener";
            Intrinsics.checkNotNull(object, string2);
            object = (GI0)object;
            this.g = object;
        }
    }

    public final void onChangeLocationClick() {
        CartAddressListBottomSheet cartAddressListBottomSheet;
        this.r = cartAddressListBottomSheet = new CartAddressListBottomSheet();
        Object object = "cartAddressCallBackListener";
        Intrinsics.checkNotNullParameter(this, (String)object);
        cartAddressListBottomSheet.u = this;
        cartAddressListBottomSheet = this.r;
        if (cartAddressListBottomSheet != null) {
            object = this.requireActivity().getSupportFragmentManager();
            String string2 = "CartLocationBottomSheet";
            cartAddressListBottomSheet.show((FragmentManager)object, string2);
        }
    }

    public final void onCreate(Bundle object) {
        int n3;
        super.onCreate((Bundle)object);
        Object object2 = this.requireActivity().getApplicationContext();
        Object object3 = "getApplicationContext(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object = new jo_2((Context)object2);
        this.u = object;
        object = this.getArguments();
        if (object != null && (n3 = (object = this.requireArguments()).containsKey((String)(object2 = "PLP_TYPE"))) != 0) {
            int n4;
            int n7;
            object = this.getArguments();
            if (object != null) {
                n3 = object.getInt((String)object2);
                object = n3;
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null && (n7 = ((Integer)object).intValue()) == (n4 = 101)) {
                object = ld3_2.STORE_LUXE.getStoreId();
                this.Oa((String)object);
            } else if (object != null && (n3 = ((Integer)object).intValue()) == (n7 = 103)) {
                object = ld3_2.STORE_AJIOGRAM.getStoreId();
                this.Oa((String)object);
            } else {
                object = ld3_2.STORE_AJIO.getStoreId();
                this.Oa((String)object);
            }
        }
        if ((object = this.getActivity()) != null) {
            object2 = "owner";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object3 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object4 = object.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = object.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, "store");
            Intrinsics.checkNotNullParameter(object4, "factory");
            Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
            object2 = gj2_1.class;
            String string2 = "modelClass";
            object = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object, (Class)object2, string2);
            object2 = ef0_0.a((Class)object2, string2, string2, "<this>");
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object3 = ((String)object4).concat((String)object3);
                this.w = object = (gj2_1)((pD3)object).a((yn1_2)object2, (String)object3);
            } else {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.facet_value_view;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getArguments();
        Object object3 = "FACET_VIEW_TYPE";
        String string2 = null;
        if (object2 != null) {
            n3 = object2.getInt((String)object3);
            object2 = n3;
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            object2 = this.getArguments();
            if (object2 != null) {
                n3 = object2.getInt((String)object3);
                object2 = n3;
            } else {
                n3 = 0;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            this.e = n3 = ((Integer)object2).intValue();
        }
        if ((n3 = (int)(h40_0.Q1() ? 1 : 0)) != 0) {
            object2 = this.u;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                n3 = 0;
                object2 = null;
            }
            this.v = object2 = ((jo_2)object2).l();
            object3 = UserInformation.getInstance(this.requireContext());
            boolean n4 = ((UserInformation)object3).isUserOnline();
            if (n4) {
                if (object2 != null) {
                    this.q = object2 = String.valueOf(((CartDeliveryAddress)object2).getPostalCode());
                }
            } else {
                int n7;
                if (object2 != null) {
                    object3 = ((CartDeliveryAddress)object2).getPostalCode();
                } else {
                    boolean bl2 = false;
                    object3 = null;
                }
                if (object3 != null && (n7 = ((String)object3).length()) != 0) {
                    if (object2 != null) {
                        string2 = ((CartDeliveryAddress)object2).getPostalCode();
                    }
                    this.q = object2 = String.valueOf(string2);
                    object3 = this.v;
                    if (object3 != null) {
                        ((CartDeliveryAddress)object3).setPostalCode((String)object2);
                    }
                }
            }
        }
        this.Qa((View)object);
        object = this.v;
        this.Wa((CartDeliveryAddress)object);
        this.Xa();
    }

    public final void q4(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "pinCode");
        Object object2 = new fo_1();
        this.s = object2;
        ((fo_1)object2).h = bl2 = true;
        String string2 = "changeLocationListener";
        Intrinsics.checkNotNullParameter(this, string2);
        ((fo_1)object2).i = this;
        object2 = this.s;
        if (object2 != null) {
            ((fo_1)object2).Ra((String)object);
        }
        if ((object = this.s) != null) {
            object = "cartAddressCallBackListener";
            Intrinsics.checkNotNullParameter(this, (String)object);
        }
        if ((object = this.s) != null) {
            object2 = this.requireActivity().getSupportFragmentManager();
            string2 = "CartPinCodeCheckBottomSheet";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void z8(CartDeliveryAddress object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "address");
        this.Ta();
        Object object2 = this.s;
        if (object2 != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        if ((object2 = this.r) != null) {
            ((BottomSheetDialogFragment)object2).dismissAllowingStateLoss();
        }
        if ((object2 = ((CartDeliveryAddress)object).getPostalCode()) != null) {
            object2 = ((CartDeliveryAddress)object).getPostalCode();
            this.q = object2;
        }
        object2 = AddressType.Address;
        ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
        object2 = ((CartDeliveryAddress)object).getFormattedAddress();
        if (object2 == null || (n3 = object2.length()) == 0) {
            object2 = ai0_2.g((CartDeliveryAddress)object);
            ((CartDeliveryAddress)object).setFormattedAddress((String)object2);
        }
        object2 = this.u;
        Object object3 = null;
        String string2 = "appPreferences";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        ((jo_2)object2).F((CartDeliveryAddress)object);
        object2 = this.u;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = object2;
        }
        object2 = this.q;
        ((jo_2)object3).G((String)object2);
        this.Wa((CartDeliveryAddress)object);
        object = this.w;
        if (object != null && (object = ((gj2_1)object).b) != null) {
            object2 = Boolean.TRUE;
            ((LiveData)object).k(object2);
        }
        this.Ra();
    }
}

