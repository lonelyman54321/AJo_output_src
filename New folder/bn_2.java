/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.GiftProducts;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bN
 */
public final class bn_2
extends BottomSheetDialogFragment {
    public static final bn$a_0 Companion;
    public tm_2 a;
    public final NewEEcommerceEventsRevamp b;
    public final NewCustomEventsRevamp c;
    public String d;
    public String e;
    public String f;
    public final hh3_2 g;

    static {
        bn$a_0 bn$a_0;
        Companion = bn$a_0 = new Object();
    }

    public bn_2() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.b = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.c = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.d = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.e = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.f = "";
        object = new l5_0(this, 1);
        this.g = object = yr1_2.b((Function0)object);
    }

    public final void Oa(Product product, String string2) {
        Object object;
        int n3;
        Object object2;
        bn_2 bn_22 = this;
        Bundle bundle = new Bundle();
        Object object3 = null;
        if (product != null) {
            object2 = product.getCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        String string3 = "product_id";
        bundle.putString(string3, (String)object2);
        object2 = bn_22.f;
        object2 = object2 != null && (n3 = ((String)object2).length()) != 0 ? bn_22.f : "instock";
        string3 = "reason_to_remove";
        bundle.putString(string3, (String)object2);
        object2 = bn_22.a;
        if (object2 != null && (object2 = ((tm_2)object2).a) != null) {
            object2 = ((CartEntry)object2).getAge();
        } else {
            n3 = 0;
            object2 = null;
        }
        string3 = "item_age";
        bundle.putString(string3, (String)object2);
        object2 = bn_22.a;
        if (object2 != null && (object2 = ((tm_2)object2).a) != null) {
            object2 = ((CartEntry)object2).getEddDate();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            object2 = bn_22.a;
            if (object2 != null && (object2 = ((tm_2)object2).a) != null) {
                object3 = ((CartEntry)object2).getEddDate();
            }
            object2 = "EDD";
            bundle.putString((String)object2, (String)object3);
        }
        object3 = bn_22.f;
        object2 = "oos";
        if (object3 != null) {
            string3 = hv3_0.K(R$string.sold_out_text);
            boolean bl2 = Intrinsics.areEqual(object3, string3);
            if (bl2) {
                object3 = object2;
            }
            object = object3;
        } else {
            object = object2;
        }
        object3 = AnalyticsManager.Companion;
        String string4 = bv_0.a((AnalyticsManager$Companion)object3);
        String string5 = cv_0.a((AnalyticsManager$Companion)object3);
        object3 = bn_22.c;
        string3 = string2;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, "bag interactions", string2, (String)object, "bag_interaction", "bag screen", "bag screen", string4, bundle, string5, false, null, 1536, null);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getParentFragment();
        if (object != null) {
            object = this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(object, "requireParentFragment(...)");
            Object object2 = "owner";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object3 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object4 = object.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = object.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, "store");
            Intrinsics.checkNotNullParameter(object4, "factory");
            object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object3, (E$b)object4, (Wd0)object);
            object2 = tm_2.class;
            object3 = "modelClass";
            object2 = do_0.a((Class)object2, (String)object3, (Class)object2, (String)object3, (String)object3);
            Intrinsics.checkNotNullParameter(object2, "<this>");
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object3 = ((String)object4).concat((String)object3);
                this.a = object = (tm_2)((pD3)object).a((yn1_2)object2, (String)object3);
            } else {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        vm_1 vm_12 = new vm_1((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)vm_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.bottomsheet_cart_delete_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.bottomsheet_cart_delete;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.parent_layout;
        object2 = (ConstraintLayout)object.findViewById(n3);
        Object object3 = Looper.getMainLooper();
        Object object4 = new Handler(object3);
        int n4 = 0;
        Object object5 = null;
        object3 = new wm_1(object2, 0);
        long l2 = 100;
        object4.postDelayed((Runnable)object3, l2);
        object2 = this.a;
        if (object2 != null) {
            Object object6;
            Object object7;
            int n7;
            Object object8;
            int n8;
            Object object9;
            int n10 = R$id.removeBtn;
            object4 = (TextView)object.findViewById(n10);
            int n14 = R$id.moveClosetBtn;
            object3 = (TextView)object.findViewById(n14);
            n4 = R$id.imgThumbnail;
            object5 = (ImageView)object.findViewById(n4);
            int n15 = R$id.cancelBtn;
            ImageView imageView = (ImageView)object.findViewById(n15);
            Object object10 = h40_0.a;
            boolean bl2 = ((h40_0)object10).f1();
            int n16 = 0;
            String string2 = null;
            int n17 = 1;
            String string3 = null;
            if (bl2) {
                boolean bl3;
                object10 = object2.a;
                int n18 = R$id.id_cart_gwp_list;
                object9 = (RecyclerView)object.findViewById(n18);
                n8 = R$id.id_gwp_layout;
                object8 = (ConstraintLayout)object.findViewById(n8);
                n7 = R$id.id_cart_gwp_title;
                object7 = (AjioTextView)object.findViewById(n7);
                object6 = a21.a;
                if (object10 != null) {
                    object10 = ((CartEntry)object10).getGiftProducts();
                } else {
                    bl2 = false;
                    object10 = null;
                }
                object6.getClass();
                object10 = a21.f(object10);
                if (object10 != null) {
                    object6 = ((GiftProducts)object10).getQuantities();
                } else {
                    bl3 = false;
                    object6 = null;
                }
                object6 = (Collection)object6;
                if (object6 != null && !(bl3 = object6.isEmpty())) {
                    if (object10 != null && (object6 = ((GiftProducts)object10).getQuantities()) != null) {
                        Object object11 = object6;
                        object11 = (Collection)object6;
                        boolean bl4 = object11.isEmpty() ^ n17;
                        if (bl4) {
                            Intrinsics.checkNotNull(object8);
                            ai0_2.B((View)object8);
                            object10 = ((GiftProducts)object10).getGwpType();
                            if (object10 != null) {
                                object8 = "CartLevelGWP";
                                bl2 = Intrinsics.areEqual(object10, object8);
                                if (bl2) {
                                    object10 = h40_0.D(false).getCartLevelRemoveMsg();
                                    object7.setText((CharSequence)object10);
                                } else {
                                    object10 = h40_0.D(false).getProductLevelRemoveMsg();
                                    object7.setText((CharSequence)object10);
                                }
                            }
                            n8 = object6.size();
                            object8 = n8;
                            object10 = new xn_2((List)object6, (Integer)object8);
                            object = object.getContext();
                            object8 = new LinearLayoutManager((Context)object, n17, false);
                            ((RecyclerView)object9).setLayoutManager((RecyclerView$o)object8);
                            ((RecyclerView)object9).setAdapter((RecyclerView$f)object10);
                        } else {
                            Intrinsics.checkNotNull(object8);
                            ai0_2.i((View)object8);
                        }
                    }
                } else {
                    Intrinsics.checkNotNull(object8);
                    ai0_2.i((View)object8);
                }
            }
            int n19 = R$string.close_txt;
            object = hv3_0.K(n19);
            imageView.setContentDescription((CharSequence)object);
            object = object2.a;
            if (object != null) {
                object = ((CartEntry)object).getProduct();
            } else {
                n19 = 0;
                object = null;
            }
            if (object != null) {
                object10 = ((Product)object).getImages();
            } else {
                bl2 = false;
                object10 = null;
            }
            object10 = (Collection)object10;
            object9 = "";
            if (object10 != null && !(bl2 = object10.isEmpty())) {
                if (object != null) {
                    object10 = ((Product)object).getImages();
                } else {
                    bl2 = false;
                    object10 = null;
                }
                Intrinsics.checkNotNull(object10);
                object10 = object10.iterator();
                while ((n8 = (int)(object10.hasNext() ? 1 : 0)) != 0) {
                    object8 = (ProductImage)object10.next();
                    object7 = ((ProductImage)object8).component1();
                    object8 = ((ProductImage)object8).component2();
                    Intrinsics.checkNotNull(object7);
                    object6 = "mobileProductListingImage";
                    n7 = (int)(((String)object6).equalsIgnoreCase((String)object7) ? 1 : 0);
                    if (n7 == 0) continue;
                    object9 = object8;
                    break;
                }
                if (object9 == null) {
                    object10 = ((Product)object).getImages();
                    if (object10 != null && (object10 = (ProductImage)object10.get(0)) != null) {
                        string3 = ((ProductImage)object10).getUrl();
                    }
                    object9 = string3;
                }
            }
            object10 = new da$a();
            ((da$a)object10).k = n17;
            ((da$a)object10).r = n17;
            n16 = R$string.acc_banner;
            string2 = hv3_0.K(n16);
            ((da$a)object10).b(string2);
            string2 = UrlHelper.Companion.getInstance().getImageUrl((String)object9);
            ((da$a)object10).n = string2;
            ((da$a)object10).u = object5;
            ((da$a)object10).a();
            object5 = new xm_1(this, (Product)object, (tm_2)object2);
            object4.setOnClickListener((View.OnClickListener)object5);
            object4 = new ym_1(this, (Product)object, (tm_2)object2);
            object3.setOnClickListener((View.OnClickListener)object4);
            n3 = 0;
            object2 = null;
            object = new zm_1(this, 0);
            imageView.setOnClickListener((View.OnClickListener)object);
        }
    }
}

