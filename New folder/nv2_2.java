/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.databinding.FragmentPlpPeekBinding;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from nv2
 */
public class nv2_2
extends DialogFragment {
    public static final nv2$a Companion;
    public static final /* synthetic */ gn1_2[] k;
    public final cc3_2 a;
    public lv2 b;
    public rv2_2 c;
    public hy3_0 d;
    public lz1_1 e;
    public ea2_1 f;
    public j3_0 g;
    public String h;
    public final hh3_2 i;
    public final vj2_2 j;

    static {
        Object object = jz.a(nv2_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentPlpPeekBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        k = gn1_2Array;
        Companion = object = new Object();
    }

    public nv2_2() {
        Object object = z80_0.c(nv2$b.a, this);
        this.a = object;
        int n3 = 1;
        object = new cv0_2(this, n3);
        this.i = object = yr1_2.b((Function0)object);
        this.j = object = new vj2_2(this, n3);
    }

    public final FragmentPlpPeekBinding Oa() {
        Object object = k[0];
        object = this.a.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentPlpPeekBinding)object;
    }

    public final F12 Pa() {
        return (F12)this.i.getValue();
    }

    public void Qa(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        object = this.Oa();
        int n4 = ih3_1.a;
        Object object2 = ih3_1.b;
        Object object3 = this.b;
        if (object3 != null && (object3 = ((lv2)object3).a) != null && (object3 = ((Product)object3).getFnlColorVariantData()) != null) {
            object3 = ((ProductFnlColorVariantData)object3).getColorGroup();
        } else {
            n3 = 0;
            object3 = null;
        }
        n4 = CollectionsKt.F((Iterable)object2, object3);
        if (n4 != 0) {
            object2 = ((FragmentPlpPeekBinding)object).fppTvAddToCloset;
            object3 = hv3_0.K(R$string.added_to_wishlist);
            object2.setText((CharSequence)object3);
            object2 = ((FragmentPlpPeekBinding)object).fppIvAddToCloset;
            n3 = R$drawable.ic_wishlist_added;
            ((AppCompatImageView)((Object)object2)).setImageResource(n3);
        } else {
            object2 = ((FragmentPlpPeekBinding)object).fppTvAddToCloset;
            object3 = hv3_0.K(R$string.add_to_wishlist);
            object2.setText((CharSequence)object3);
            object2 = ((FragmentPlpPeekBinding)object).fppIvAddToCloset;
            n3 = R$drawable.ic_wishlist_16;
            ((AppCompatImageView)((Object)object2)).setImageResource(n3);
        }
        object2 = ((FragmentPlpPeekBinding)object).fppTvAddToCloset;
        n3 = R$style.muli_regular_12_accent_10;
        Hm3.f((TextView)object2, n3);
        object2 = ((FragmentPlpPeekBinding)object).fppTvShare;
        n3 = R$style.muli_regular_12_accent_10;
        Hm3.f((TextView)object2, n3);
        object = ((FragmentPlpPeekBinding)object).fppIvShare;
        n4 = R$drawable.ic_share;
        ((AppCompatImageView)((Object)object)).setImageResource(n4);
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof lz1_1;
        if (bl2) {
            object2 = object;
            this.e = object2 = (lz1_1)object;
            bl2 = object instanceof ea2_1;
            if (bl2) {
                object2 = object;
                this.f = object2 = (ea2_1)object;
                bl2 = object instanceof j3_0;
                if (bl2) {
                    object = (j3_0)object;
                    this.g = object;
                    return;
                }
                object = pn_2.b(object, " must implement ActivityFragmentListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement ProductDetailListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement LoginListener");
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
        Object object4 = this.getDefaultViewModelCreationExtras();
        Object object5 = "store";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object4, string3);
        Object object6 = rv2_2.class;
        String string4 = "modelClass";
        object2 = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object4, object6, string4);
        object3 = "<this>";
        object4 = sw0_0.a(object6, (String)object3, object6, string4, string4);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object6 = object4.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string6.concat((String)object6);
            this.c = object2 = (rv2_2)((pD3)object2).a((yn1_2)object4, (String)object6);
            object2 = kd3_2.a();
            object6 = this.requireActivity().getApplication();
            String string7 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object6, string7);
            object4 = new UserRepo((Application)object6);
            object6 = this.requireActivity().getApplication();
            ((kd3_2)object2).a = object4;
            ((kd3_2)object2).b = object6;
            Intrinsics.checkNotNull(object2);
            Intrinsics.checkNotNullParameter(this, (String)object);
            Intrinsics.checkNotNullParameter(object2, string2);
            object4 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object4, (String)object5);
            Intrinsics.checkNotNullParameter(object2, string2);
            Intrinsics.checkNotNullParameter(object, string3);
            object5 = hy3_0.class;
            object = im_1.a((rd3_0)object4, (kd3_2)object2, (Wd0)object, (Class)object5, string4);
            object2 = sw0_0.a((Class)object5, (String)object3, (Class)object5, string4, string4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object3 = string6.concat((String)object3);
                this.d = object = (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
                object = this.getArguments();
                if (object != null) {
                    int n3 = Build.VERSION.SDK_INT;
                    int n4 = 33;
                    if (n3 >= n4) {
                        object2 = mv2_1.a((Bundle)object);
                    } else {
                        object2 = object.getSerializable("PLP_PEEK");
                        n4 = object2 instanceof lv2;
                        if (n4 == 0) {
                            n3 = 0;
                            object2 = null;
                        }
                        object2 = (lv2)object2;
                    }
                    this.b = object2 = (lv2)object2;
                    object2 = "PLP_PEEK_STORE_TYPE";
                    this.h = object = object.getString((String)object2);
                }
                return;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_plp_peek;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onStart() {
        Dialog dialog = this.getDialog();
        if (dialog != null) {
            int n3;
            Window window = dialog.getWindow();
            if (window != null) {
                n3 = hv3_0.F() / 100 * 90;
                int n4 = -2;
                window.setLayout(n3, n4);
            }
            if ((window = dialog.getWindow()) != null) {
                n3 = 17170445;
                window.setBackgroundDrawableResource(n3);
            }
            int n7 = 1;
            dialog.setCanceledOnTouchOutside(n7 != 0);
            dialog = dialog.getWindow();
            if (dialog != null) {
                n7 = R$style.PeekAnimation;
                dialog.setWindowAnimations(n7);
            }
        }
        super.onStart();
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.fppIvImage;
        object2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
        object2 = (ImageView)object2;
        Object object4 = this.b;
        Object object5 = null;
        object4 = object4 != null ? ((lv2)object4).a : null;
        Intrinsics.checkNotNull(object4);
        object4 = ((Product)object4).getImages();
        int n7 = 1;
        if (object4 != null) {
            object4 = (Iterable)object4;
            arrayList = new ArrayList();
            object4 = object4.iterator();
            while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                boolean bl2;
                Object t3 = object4.next();
                Object object6 = t3;
                object6 = (ProductImage)t3;
                String string2 = ((ProductImage)object6).getImageType();
                if (string2 == null || !(bl2 = kotlin.text.b.i((String)(object6 = ((ProductImage)object6).getImageType()), string2 = "primary", n7 != 0))) continue;
                arrayList.add(t3);
            }
        } else {
            arrayList = null;
        }
        object4 = new da$a();
        ((da$a)object4).k = n7;
        ((da$a)object4).a = n3 = 17170445;
        ((da$a)object4).b = n3;
        if (arrayList != null) {
            n3 = (int)(arrayList.isEmpty() ? 1 : 0);
            boolean bl3 = n7 ^ n3;
            object3 = bl3;
        } else {
            boolean bl4 = false;
            object3 = null;
        }
        Intrinsics.checkNotNull(object3);
        boolean bl5 = (Boolean)object3;
        if (bl5) {
            boolean bl6 = false;
            object3 = ((ProductImage)arrayList.get(0)).getUrl();
        } else {
            object3 = this.b;
            if (object3 != null) {
                object3 = ((lv2)object3).b;
            } else {
                boolean bl7 = false;
                object3 = null;
            }
        }
        ((da$a)object4).n = object3;
        ((da$a)object4).u = object2;
        ((da$a)object4).a();
        this.Qa((View)object);
        object = this.Oa().fppLayoutParent;
        object4 = this.j;
        object.setOnClickListener((View.OnClickListener)object4);
        object2.setOnClickListener((View.OnClickListener)object4);
        this.Oa().fppVSep.setOnClickListener((View.OnClickListener)object4);
        this.Oa().fppTvAddToCloset.setOnClickListener((View.OnClickListener)object4);
        this.Oa().fppIvAddToCloset.setOnClickListener((View.OnClickListener)object4);
        this.Oa().fppTvShare.setOnClickListener((View.OnClickListener)object4);
        this.Oa().fppIvShare.setOnClickListener((View.OnClickListener)object4);
        object = this.c;
        object2 = "plpPeekViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        object = ((rv2_2)object).a.e;
        int n8 = 2;
        object4 = new ty0_2(this, n8);
        object3 = new nv2$c((Function1)object4);
        ((LiveData)object).e(this, (F62)object3);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object5 = object;
        }
        object = ((rv2_2)object5).a.g;
        object2 = this.getViewLifecycleOwner();
        object4 = new ew1_1(this, 1);
        object5 = new nv2$c((Function1)object4);
        ((LiveData)object).e((mu1_1)object2, (F62)object5);
    }

    public final void show(FragmentManager object, String object2) {
        boolean bl2;
        Object object3;
        block9: {
            block8: {
                object3 = "manager";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object.getClass();
                object3 = new a((FragmentManager)object);
                object = "beginTransaction(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                object = null;
                bl2 = true;
                if (object2 == null) break block8;
                ((a)object3).h(0, this, (String)object2, (int)(bl2 ? 1 : 0));
                break block9;
            }
            object2 = "PlpPeek";
            ((a)object3).h(0, this, (String)object2, (int)(bl2 ? 1 : 0));
            object = "add(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object);
        }
        try {
            ((a)object3).o(bl2, bl2);
        }
        catch (IllegalStateException illegalStateException) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(illegalStateException);
        }
    }
}

