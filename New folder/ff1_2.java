/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from fF1
 */
public final class ff1_2
extends BottomSheetDialogFragment
implements c92 {
    public static final fF1$a Companion;
    public LinearLayout a;
    public TextView b;
    public TextView c;
    public View d;
    public ImageView e;
    public View f;
    public RecyclerView g;
    public TextView h;
    public TextView i;
    public TextView j;
    public ky1_0 k;

    static {
        fF1$a fF1$a;
        Companion = fF1$a = new Object();
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
        Class<ky1_0> clazz = ky1_0.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, clazz, string2);
        object2 = ef0_0.a(clazz, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.k = object = (ky1_0)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        ef1_2 ef1_22 = new ef1_2((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)ef1_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.luxe_closet_size_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int n3;
        int n4;
        ff1_2 ff1_22 = this;
        Object object = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int n7 = R$id.parent_layout;
        Object object2 = (LinearLayout)view.findViewById(n7);
        this.a = object2;
        n7 = R$id.closet_size_dialog_header_tv;
        object2 = (TextView)view.findViewById(n7);
        this.c = object2;
        n7 = R$id.closet_size_progress_bar;
        object2 = (AjioLoaderView)view.findViewById(n7);
        n7 = R$id.closet_size_stock_left_tv;
        object2 = (TextView)view.findViewById(n7);
        this.h = object2;
        n7 = R$id.closet_size_dialog_sizeRv;
        object2 = (RecyclerView)view.findViewById(n7);
        this.g = object2;
        n7 = R$id.closet_size_dialog_std_size_tv;
        object2 = (TextView)view.findViewById(n7);
        this.i = object2;
        n7 = R$id.brand_size_tv;
        object2 = (TextView)view.findViewById(n7);
        this.j = object2;
        Object object3 = this.requireActivity();
        int n8 = 0;
        Object object4 = null;
        object2 = new LinearLayoutManager((Context)object3, 0, false);
        object3 = this.g;
        if (object3 != null) {
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object2);
        }
        n7 = R$id.closet_size_dialog_cancel_tv;
        object2 = (TextView)object.findViewById(n7);
        ff1_22.b = object2;
        n7 = R$id.closet_size_dialog_addToBag;
        object2 = object.findViewById(n7);
        ff1_22.d = object2;
        n7 = R$id.cancelContainer;
        object2 = object.findViewById(n7);
        ff1_22.f = object2;
        n7 = R$id.cancelBtn;
        object = (ImageView)object.findViewById(n7);
        ff1_22.e = object;
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        boolean n10 = false;
        object3 = null;
        object2 = new df1_2(ff1_22, 0);
        long l2 = 100;
        object.postDelayed((Runnable)object2, l2);
        object = ff1_22.b;
        if (object != null) {
            int n14 = 1;
            object2 = new PT(ff1_22, n14);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = ff1_22.f) != null) {
            int n15 = 1;
            object2 = new da_0(ff1_22, n15);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = ff1_22.e) != null) {
            int n16 = 2;
            object2 = new Ea(ff1_22, n16);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = ff1_22.d) != null) {
            int n17 = 2;
            object2 = new fa_0(ff1_22, n17);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object = this.getArguments();
        object2 = "product";
        boolean bl2 = false;
        object3 = null;
        if (object != null) {
            n4 = object.containsKey((String)object2);
            object = n4 != 0;
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null && (object = this.getArguments()) != null) {
            n3 = Build.VERSION.SDK_INT;
            int n18 = 33;
            if (n3 >= n18) {
                object = uw_1.a((Bundle)object);
            } else {
                n7 = (object = object.getSerializable((String)object2)) instanceof Product;
                if (n7 == 0) {
                    n4 = 0;
                    object = null;
                }
                object = (Product)object;
            }
            object = (Product)object;
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null) {
            int n19;
            Object object5;
            object = ((Product)object).clone();
            Y63.i((Product)object);
            object2 = ff1_22.k;
            if (object2 != null && object != null) {
                boolean bl3;
                int n20;
                boolean bl4;
                Object object6;
                Object object7;
                boolean bl5;
                boolean bl6;
                ((ky1_0)object2).I = null;
                Object object8 = ((ky1_0)object2).J;
                ((ArrayList)object8).clear();
                Object object9 = "";
                ((ky1_0)object2).K = object9;
                Object object10 = new ArrayList();
                ((ky1_0)object2).u = object10;
                object10 = new ArrayList();
                ((ky1_0)object2).v = object10;
                object10 = ((Product)object).getProductOptionItems();
                object5 = "size";
                String string2 = "null";
                String string3 = "toLowerCase(...)";
                if (object10 != null && !(bl6 = object10.isEmpty()) && (object10 = (Collection)((Product)object).getBaseOptions()) != null && !(bl6 = object10.isEmpty())) {
                    object10 = ((Product)object).getBaseOptions();
                    if (object10 != null && (object10 = (ProductOption)object10.get(0)) != null) {
                        object10 = ((ProductOption)object10).getOptions();
                    } else {
                        bl6 = false;
                        object10 = null;
                    }
                    object10 = (Collection)object10;
                    if (object10 != null && !(bl6 = object10.isEmpty())) {
                        object10 = ((Product)object).getBaseOptions();
                        if (object10 != null && (object10 = (ProductOption)object10.get(0)) != null && (object10 = ((ProductOption)object10).getOptions()) != null && (object10 = (ProductOptionItem)object10.get(0)) != null) {
                            object10 = ((ProductOptionItem)object10).getAttributes();
                        } else {
                            bl6 = false;
                            object10 = null;
                        }
                        if (object10 != null) {
                            object10 = ((Iterable)object10).iterator();
                            while (bl5 = object10.hasNext()) {
                                Object object11 = (ProductOptionVariant)object10.next();
                                object7 = ((ProductOptionVariant)object11).getAttributeName();
                                if (object7 != null) {
                                    object6 = Locale.ROOT;
                                    object7 = ((String)object7).toLowerCase((Locale)object6);
                                    Intrinsics.checkNotNullExpressionValue(object7, string3);
                                } else {
                                    bl4 = false;
                                    object7 = null;
                                }
                                if ((object11 = ((ProductOptionVariant)object11).getAttributeValue()) == null || (n20 = ((String)object11).length()) == 0 || (n20 = (int)(((String)object11).equalsIgnoreCase(string2) ? 1 : 0)) != 0 || (n20 = (int)(Intrinsics.areEqual(object7, object6 = "selection1") ? 1 : 0)) != 0 || !(bl4 = Intrinsics.areEqual(object7, object6 = "selection2")) || (bl4 = ((String)object11).equalsIgnoreCase((String)object5))) continue;
                                ((ky1_0)object2).I = object11;
                            }
                        }
                    }
                }
                object10 = ((Product)object).getProductOptionItems();
                bl5 = true;
                if (object10 != null && !(bl6 = object10.isEmpty())) {
                    object10 = ((Product)object).getProductOptionItems();
                    Intrinsics.checkNotNull(object10);
                    object10 = object10.iterator();
                    while (bl4 = object10.hasNext()) {
                        int n21;
                        object7 = (ProductOptionItem)object10.next();
                        object6 = ((ky1_0)object2).v;
                        if (object6 != null) {
                            ((ArrayList)object6).add(object7);
                        }
                        if ((object6 = ((ky1_0)object2).I) != null && (n20 = kotlin.text.b.k((CharSequence)object6)) == 0) {
                            String string4;
                            if (object7 != null) {
                                object6 = ((ProductOptionItem)object7).getVariantOptionQualifiers();
                            } else {
                                n20 = 0;
                                object6 = null;
                            }
                            if (object6 != null) {
                                boolean bl7;
                                object7 = ((ProductOptionItem)object7).getVariantOptionQualifiers();
                                Intrinsics.checkNotNull(object7);
                                object7 = object7.iterator();
                                n20 = 0;
                                object6 = null;
                                string4 = null;
                                while (bl7 = object7.hasNext()) {
                                    ProductOptionVariant productOptionVariant = (ProductOptionVariant)object7.next();
                                    object3 = ((ky1_0)object2).I;
                                    if (object3 != null && (n21 = kotlin.text.b.k((CharSequence)object3)) == 0 && (n21 = kotlin.text.b.i((String)(object3 = ((ky1_0)object2).I), (String)(object4 = productOptionVariant.getQualifier()), bl5)) != 0) {
                                        object6 = productOptionVariant.getValue();
                                        object3 = ((ky1_0)object2).I;
                                        n21 = ((String)object5).equalsIgnoreCase((String)object3);
                                        if (n21 == 0 && (object3 = productOptionVariant.getName()) != null && (n21 = ((String)(object3 = ((ky1_0)object2).K)).length()) == 0) {
                                            object3 = productOptionVariant.getName();
                                            Intrinsics.checkNotNull(object3);
                                            ((ky1_0)object2).K = object3;
                                        }
                                    }
                                    if ((n21 = ((String)(object4 = "uom")).equalsIgnoreCase((String)(object3 = productOptionVariant.getQualifier()))) != 0) {
                                        string4 = productOptionVariant.getValue();
                                    }
                                    n21 = 0;
                                    object3 = null;
                                    n8 = 0;
                                    object4 = null;
                                }
                            } else {
                                n20 = 0;
                                object6 = null;
                                string4 = null;
                            }
                            if (object6 != null && (n21 = kotlin.text.b.k((CharSequence)object6)) == 0 && (n21 = ((String)object6).equalsIgnoreCase(string2)) == 0 && string4 != null && (n21 = kotlin.text.b.k(string4)) == 0 && (n21 = string4.equalsIgnoreCase(string2)) == 0) {
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append((String)object6);
                                object4 = " ";
                                ((StringBuilder)object3).append((String)object4);
                                ((StringBuilder)object3).append(string4);
                                object3 = ((StringBuilder)object3).toString();
                                ((ArrayList)object8).add(object3);
                            }
                        }
                        n21 = 0;
                        object3 = null;
                        n8 = 0;
                        object4 = null;
                    }
                }
                if ((object3 = (Collection)((Product)object).getProductOptionVariants()) != null && !(bl3 = object3.isEmpty())) {
                    boolean bl8;
                    object3 = ((Product)object).getProductOptionVariants();
                    int n22 = object3.size();
                    object4 = null;
                    for (n8 = 0; n8 < n22; ++n8) {
                        object10 = (ProductOptionVariant)((Product)object).getProductOptionVariants().get(n8);
                        object5 = null;
                        ((ProductOptionVariant)object10).setSelected(false);
                        n19 = ((ArrayList)object8).size();
                        if (n8 < n19) {
                            object5 = (String)((ArrayList)object8).get(n8);
                            ((ProductOptionVariant)object10).setSizeValue((String)object5);
                        }
                        if ((object5 = ((ky1_0)object2).u) == null) continue;
                        ((ArrayList)object5).add(object10);
                    }
                    if ((object = ((Product)object).getBaseOptions()) != null && (object = (ProductOption)CollectionsKt.firstOrNull((List)object)) != null) {
                        if ((object = ((ProductOption)object).getOptions()) != null && (object = (ProductOptionItem)CollectionsKt.firstOrNull((List)object)) != null) {
                            if ((object = ((ProductOptionItem)object).getAttributes()) != null) {
                                object = ((Iterable)object).iterator();
                                object3 = object9;
                                while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                    object4 = (ProductOptionVariant)object.next();
                                    object8 = ((ProductOptionVariant)object4).getAttributeName();
                                    if (object8 != null) {
                                        object10 = Locale.ROOT;
                                        object8 = ((String)object8).toLowerCase((Locale)object10);
                                        Intrinsics.checkNotNullExpressionValue(object8, string3);
                                    } else {
                                        n3 = 0;
                                        object8 = null;
                                    }
                                    object10 = "sizeformat";
                                    bl6 = Intrinsics.areEqual(object8, object10);
                                    if (bl6) {
                                        object9 = object4 = Y63.e(String.valueOf(((ProductOptionVariant)object4).getAttributeValue()));
                                        continue;
                                    }
                                    object10 = "standardsizeformat";
                                    n3 = (int)(Intrinsics.areEqual(object8, object10) ? 1 : 0);
                                    if (n3 == 0) continue;
                                    object3 = Y63.e(String.valueOf(((ProductOptionVariant)object4).getAttributeValue()));
                                }
                            } else {
                                object3 = object9;
                            }
                            object = new Pair(object9, object3);
                        } else {
                            object = new Pair(object9, object9);
                        }
                    } else {
                        object = new Pair(object9, object9);
                    }
                    object3 = ((ky1_0)object2).u;
                    if (object3 != null && (bl8 = ((ArrayList)object3).isEmpty() ^ bl5) == bl5) {
                        boolean bl9;
                        object2 = ((ky1_0)object2).u;
                        Intrinsics.checkNotNull(object2);
                        object2 = ((ArrayList)object2).iterator();
                        object3 = "iterator(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                        while (bl9 = object2.hasNext()) {
                            object3 = object2.next();
                            Intrinsics.checkNotNullExpressionValue(object3, "next(...)");
                            object3 = (ProductOptionVariant)object3;
                            object4 = (String)((Pair)object).a;
                            ((ProductOptionVariant)object3).setBrandSizeFormat((String)object4);
                            object4 = (String)((Pair)object).b;
                            ((ProductOptionVariant)object3).setUniversalSizeFormat((String)object4);
                        }
                    }
                }
            }
            if ((object = ff1_22.k) != null) {
                object = ((ky1_0)object).K;
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null && (n4 = ((String)object).length()) != 0) {
                object = ff1_22.c;
                if (object != null) {
                    object2 = ff1_22.k;
                    if (object2 != null) {
                        object2 = ((ky1_0)object2).K;
                    } else {
                        n7 = 0;
                        object2 = null;
                    }
                    object4 = "Choose ";
                    object3 = new StringBuilder((String)object4);
                    ((StringBuilder)object3).append((String)object2);
                    object2 = ((StringBuilder)object3).toString();
                    object.setText((CharSequence)object2);
                }
            } else {
                object = ff1_22.c;
                if (object != null) {
                    n7 = R$string.luxe_closet_size_header;
                    object.setText(n7);
                }
            }
            if ((object = ff1_22.k) != null) {
                object2 = ((ky1_0)object).u;
            } else {
                n7 = 0;
                object2 = null;
            }
            if (object2 != null) {
                if (object != null && (object = ((ky1_0)object).u) != null) {
                    n19 = ((ArrayList)object).size();
                } else {
                    n19 = 0;
                    object5 = null;
                }
                if (n19 > 0) {
                    object = ff1_22.g;
                    if (object != null) {
                        object = ((RecyclerView)object).getAdapter();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    object2 = "copyOf(...)";
                    if (object == null) {
                        object3 = ff1_22.k;
                        if (object3 != null) {
                            object3 = ((ky1_0)object3).u;
                        } else {
                            boolean bl10 = false;
                            object3 = null;
                        }
                        Intrinsics.checkNotNull(object3);
                        object3 = ImmutableList.copyOf((Collection)object3);
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                        object = new cf1_2(ff1_22, (ImmutableList)object3);
                        object2 = ff1_22.g;
                        if (object2 != null) {
                            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
                        }
                        if ((object = ff1_22.k) != null) {
                            object = ((ky1_0)object).u;
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        Intrinsics.checkNotNull(object);
                        n7 = 0;
                        object = ((ArrayList)object).get(0);
                        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
                        object = (ProductOptionVariant)object;
                        object2 = ff1_22.i;
                        if (object2 == null) {
                            object2 = "sizeUnitTv";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                            boolean bl11 = false;
                            object3 = null;
                        } else {
                            object3 = object2;
                        }
                        Y63.h((TextView)object3, (ProductOptionVariant)object);
                    } else {
                        object = ff1_22.g;
                        Intrinsics.checkNotNull(object);
                        object = ((RecyclerView)object).getAdapter();
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.closet.adapter.LuxeClosetSizeAdapter");
                        object = (cf1_2)object;
                        object3 = ff1_22.k;
                        if (object3 != null) {
                            object3 = ((ky1_0)object3).u;
                        } else {
                            boolean bl12 = false;
                            object3 = null;
                        }
                        Intrinsics.checkNotNull(object3);
                        object3 = ImmutableList.copyOf((Collection)object3);
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                        object.getClass();
                        object2 = "productOptionVariants";
                        Intrinsics.checkNotNullParameter(object3, (String)object2);
                        ((cf1_2)object).b = object3;
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                }
            }
        } else {
            this.dismiss();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void q2(String var1_1, String var2_2, int var3_3, boolean var4_4, ProductOptionVariant var5_5, boolean var6_6) {
        var1_1 = null;
        var4_4 = 1;
        Intrinsics.checkNotNullParameter(var2_2, "sizeName");
        var2_2 = this.k;
        var5_5 = null;
        var2_2 = var2_2 != null && (var2_2 = var2_2.u) != null ? (ProductOptionVariant)var2_2.get(var3_3) : null;
        if (var2_2 != null) {
            var2_2.setSelected((boolean)var4_4);
        }
        if ((var7_7 = this.k) != null) {
            var8_8 = var7_7.v;
            if (var8_8 != null) {
                var8_8 = (ProductOptionItem)var8_8.get(var3_3);
            } else {
                var9_9 = 0;
                var8_8 = null;
            }
            var7_7.t = var8_8;
        }
        if ((var7_7 = this.k) != null && (var7_7 = var7_7.t) != null && (var7_7 = var7_7.getStock()) != null) {
            var7_7 = var7_7.getStockLevel();
        } else {
            var6_6 = 0;
            var7_7 = null;
        }
        var9_9 = 4;
        if (var7_7 == null) ** GOTO lbl-1000
        var7_7 = this.k;
        Intrinsics.checkNotNull(var7_7);
        var7_7 = var7_7.t;
        Intrinsics.checkNotNull(var7_7);
        var7_7 = var7_7.getStock();
        Intrinsics.checkNotNull(var7_7);
        var7_7 = var7_7.getStockLevel();
        Intrinsics.checkNotNull(var7_7);
        var6_6 = var7_7.intValue();
        if (var6_6 <= 0) ** GOTO lbl-1000
        var7_7 = this.k;
        Intrinsics.checkNotNull(var7_7);
        var7_7 = var7_7.t;
        Intrinsics.checkNotNull(var7_7);
        var7_7 = var7_7.getStock();
        Intrinsics.checkNotNull(var7_7);
        var7_7 = var7_7.getStockLevel();
        Intrinsics.checkNotNull(var7_7);
        var6_6 = var7_7.intValue();
        var10_10 = 10;
        if (var6_6 <= var10_10) {
            var7_7 = this.k;
            Intrinsics.checkNotNull(var7_7);
            var7_7 = var7_7.t;
            Intrinsics.checkNotNull(var7_7);
            var7_7 = var7_7.getStock();
            Intrinsics.checkNotNull(var7_7);
            var7_7 = var7_7.getStockLevel();
            Intrinsics.checkNotNull(var7_7);
            var6_6 = var7_7.intValue();
            if (var6_6 == var4_4) {
                var7_7 = this.h;
                if (var7_7 != null) {
                    var10_10 = R$string.luxe_closet_size_dialog_1_stock_left;
                    var11_11 = this.k;
                    Intrinsics.checkNotNull(var11_11);
                    var11_11 = var11_11.t;
                    Intrinsics.checkNotNull(var11_11);
                    var11_11 = var11_11.getStock();
                    Intrinsics.checkNotNull(var11_11);
                    var11_11 = var11_11.getStockLevel();
                    Intrinsics.checkNotNull(var11_11);
                    var12_13 = new Object[var4_4];
                    var12_13[0] = var11_11;
                    var12_13 = hv3_0.L(var10_10, (Object[])var12_13);
                    var7_7.setText((CharSequence)var12_13);
                }
            } else {
                var7_7 = this.h;
                if (var7_7 != null) {
                    var10_10 = R$string.luxe_closet_size_dialog_stock_left;
                    var11_12 = this.k;
                    Intrinsics.checkNotNull(var11_12);
                    var11_12 = var11_12.t;
                    Intrinsics.checkNotNull(var11_12);
                    var11_12 = var11_12.getStock();
                    Intrinsics.checkNotNull(var11_12);
                    var11_12 = var11_12.getStockLevel();
                    Intrinsics.checkNotNull(var11_12);
                    var12_13 = new Object[var4_4];
                    var12_13[0] = var11_12;
                    var12_13 = hv3_0.L(var10_10, (Object[])var12_13);
                    var7_7.setText((CharSequence)var12_13);
                }
            }
            if ((var12_13 = this.h) != null) {
                var12_13.setVisibility(0);
            }
        } else if ((var12_13 = this.h) != null) {
            var12_13.setVisibility(var9_9);
        }
        var12_13 = this.k;
        Intrinsics.checkNotNull(var12_13);
        var4_4 = var12_13.w;
        var6_6 = -1;
        if (var4_4 > var6_6) {
            var12_13 = this.k;
            Intrinsics.checkNotNull(var12_13);
            var4_4 = var12_13.w;
            if (var4_4 != var3_3) {
                var12_13 = this.k;
                if (var12_13 != null && (var7_7 = var12_13.u) != null) {
                    Intrinsics.checkNotNull(var12_13);
                    var4_4 = var12_13.w;
                    var12_13 = (ProductOptionVariant)var7_7.get(var4_4);
                } else {
                    var4_4 = 0;
                    var12_13 = null;
                }
                if (var12_13 != null) {
                    var12_13.setSelected(false);
                }
            }
        }
        var12_13 = this.g;
        Intrinsics.checkNotNull(var12_13);
        var12_13 = var12_13.getAdapter();
        Intrinsics.checkNotNull(var12_13, "null cannot be cast to non-null type com.ril.ajio.closet.adapter.LuxeClosetSizeAdapter");
        var12_13 = (cf1_2)var12_13;
        var7_7 = this.k;
        if (var7_7 != null) {
            var7_7 = var7_7.u;
        } else {
            var6_6 = 0;
            var7_7 = null;
        }
        Intrinsics.checkNotNull(var7_7);
        var7_7 = ImmutableList.copyOf((Collection)var7_7);
        Intrinsics.checkNotNullExpressionValue(var7_7, "copyOf(...)");
        var12_13.getClass();
        var13_14 = "productOptionVariants";
        Intrinsics.checkNotNullParameter(var7_7, var13_14);
        var12_13.b = var7_7;
        var12_13.notifyDataSetChanged();
        var12_13 = this.k;
        Intrinsics.checkNotNull(var12_13);
        var12_13.w = var3_3;
        var3_3 = (int)hv3_0.Y();
        if (var3_3 != 0 && var2_2 != null) {
            var14_15 /* !! */  = this.i;
            if (var14_15 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeUnitTv");
                var3_3 = 0;
                var14_15 /* !! */  = null;
            }
            Y63.h(var14_15 /* !! */ , (ProductOptionVariant)var2_2);
            var14_15 /* !! */  = Y63.j((ProductOptionVariant)var2_2);
            var12_13 = Boolean.TRUE;
            var3_3 = (int)Intrinsics.areEqual(var14_15 /* !! */ , var12_13);
            var12_13 = "brandSizeTv";
            if (var3_3 != 0) {
                var14_15 /* !! */  = this.j;
                if (var14_15 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                    var3_3 = 0;
                    var14_15 /* !! */  = null;
                }
                var2_2 = Y63.b((ProductOptionVariant)var2_2);
                var8_8 = "Brand Size ";
                var7_7 = new StringBuilder((String)var8_8);
                var7_7.append((String)var2_2);
                var2_2 = var7_7.toString();
                var14_15 /* !! */ .setText((CharSequence)var2_2);
                var2_2 = this.j;
                if (var2_2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                } else {
                    var5_5 = var2_2;
                }
                var5_5.setVisibility(0);
            } else {
                var1_1 = this.j;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_13);
                } else {
                    var5_5 = var1_1;
                }
                var5_5.setVisibility(var9_9);
            }
        }
    }
}

