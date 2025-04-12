/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.graphics.PorterDuff$Mode
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.f$a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$menu;
import com.ril.ajio.R$string;
import com.ril.ajio.closet.activity.ClosetAddToBagActivity;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.database.entity.ListShareProductExperience;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.databinding.FragmentSharedWithMeDetailBinding;
import com.ril.ajio.databinding.LayoutSharedWithMeStateBinding;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.QueryCart;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class B23
extends Fragment
implements t13_0,
p23 {
    public static final B23$a Companion;
    public static final /* synthetic */ gn1_2[] r;
    public static final String s;
    public ShareProductExperience a;
    public String b;
    public w23_0 c;
    public D23 d;
    public MenuItem e;
    public m23_0 f;
    public long g = -1;
    public SharedWithMe h;
    public ky1_0 i;
    public hy3_0 j;
    public String k = "";
    public int l = -1;
    public boolean m = true;
    public final cc3_2 n;
    public Product o;
    public final VW1 p;
    public final B23$c q;

    static {
        Object object = jz.a(B23.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentSharedWithMeDetailBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        r = gn1_2Array;
        Companion = object = new Object();
        s = "SharedWithMeDetailFragment";
    }

    public B23() {
        Object object = z80_0.c(B23$b.a, this);
        this.n = object;
        this.p = object = new VW1(this, 1);
        object = new B23$c(this);
        this.q = object;
    }

    public final void C5(int n3) {
        Object object = null;
        int n4 = 1;
        Object object2 = this.f;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            n3 = ((m23_0)object2).g(n3);
            if (n3 >= 0) {
                object2 = this.d;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeDetailListener");
                    object2 = null;
                }
                object2.K1(n3);
                if (n3 == 0) {
                    this.Wa(false);
                } else {
                    this.Wa(n4 != 0);
                }
            } else {
                Object object3 = StringCompanionObject.INSTANCE;
                n3 = R$string.acc_error_message;
                object3 = hv3_0.K(n3);
                object2 = "Max. 10 products can be selected.";
                Object[] objectArray = new Object[n4];
                objectArray[0] = object2;
                object = Arrays.copyOf(objectArray, n4);
                object3 = String.format((String)object3, object);
                object = "format(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                mq0_2.b((String)object2, (String)object3);
            }
        }
    }

    public final void O2(int n3) {
        Object object = this.requireActivity();
        f$a f$a = new f$a((Context)object);
        object = f$a.setMessage("Are you sure to delete this item?");
        int n4 = R$string.yes;
        A23 a23 = new A23(this, n3);
        f$a f$a2 = ((f$a)object).setPositiveButton(n4, (DialogInterface.OnClickListener)a23);
        int n7 = R$string.no;
        q23 q232 = new Object();
        f$a2.setNegativeButton(n7, (DialogInterface.OnClickListener)q232);
        n3 = (int)(this.isAdded() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(this.isRemoving() ? 1 : 0)) == 0 && (n3 = (int)(this.isVisible() ? 1 : 0)) != 0) {
            f$a.show();
        }
    }

    public final void Oa(ProductOptionItem object) {
        Object object2;
        int n3;
        Object object3;
        Object object4 = "sharedWithMeViewModel";
        if (object != null) {
            object3 = this.c;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object3 = null;
            }
            object3.getClass();
            object2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            ((w23_0)object3).o = object;
        }
        if ((n3 = ap_0.b()) != 0) {
            int n4;
            object = this.Ra().fswmdProgressView;
            if (object != null) {
                object = this.Ra().fswmdProgressView;
                ((AjioProgressView)((Object)object)).show();
            }
            if ((object = this.c) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n4 = 0;
                object = null;
            }
            object4 = this.k;
            n3 = this.l;
            object.getClass();
            Intrinsics.checkNotNullParameter(object4, "productCode");
            object2 = new QueryCart();
            ((QueryCart)object2).setProductCode((String)object4);
            ((QueryCart)object2).setQuantity(n3);
            object4 = md3_0.c((jD3)object);
            object3 = new u23_0((w23_0)object, (QueryCart)object2, null);
            n4 = 3;
            Ae3.d((i90_0)object4, null, null, (Function2)object3, n4);
        } else {
            this.Sa((ProductOptionItem)object);
        }
    }

    public final void Pa() {
        int n3;
        int n4;
        Object object = this.c;
        Object object2 = "sharedWithMeViewModel";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        if ((n3 = object.s + 1) < (n4 = object.r)) {
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            object.getClass();
            object2 = md3_0.c(object);
            v23_0 v23_02 = new v23_0((w23_0)object, null);
            n4 = 3;
            Ae3.d((i90_0)object2, null, null, v23_02, n4);
        } else {
            int n7;
            object = this.Ra().fswmdProgressView;
            if (object != null) {
                object = this.Ra().fswmdProgressView;
                ((AjioProgressView)((Object)object)).dismiss();
            }
            if ((object = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeDetailListener");
                n4 = 0;
                object = null;
            }
            object.F0();
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            n4 = ((w23_0)object3).t;
            if (n4 == 0) {
                object = "0 items added to your closet.";
            } else {
                object = new StringBuilder();
                n7 = ((w23_0)object3).t;
                ((StringBuilder)object).append(n7);
                ((StringBuilder)object).append("/");
                n7 = ((w23_0)object3).r;
                ((StringBuilder)object).append(n7);
                object2 = " products added to your closet.";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                Intrinsics.checkNotNull(object);
            }
            n7 = 0;
            object2 = null;
            this.Ua((String)object, false);
        }
    }

    public final void Qa() {
        this.Ra().fswmdProgressView.dismiss();
        Object object = this.Ra().fswmdRvList;
        Object object2 = "fswmdRvList";
        Intrinsics.checkNotNullExpressionValue(object, object2);
        ai0_2.i((View)object);
        object = this.e;
        if (object != null) {
            object2 = null;
            object.setVisible(false);
        }
        object = this.Ra().sharedStateLayout;
        object2 = ((LayoutSharedWithMeStateBinding)object).fswmdIvState;
        int n3 = R$drawable.ic_img_items_deleted;
        object2.setImageResource(n3);
        object2 = ((LayoutSharedWithMeStateBinding)object).fswmdTvState;
        n3 = R$string.items_deleted;
        object2.setText(n3);
        object2 = ((LayoutSharedWithMeStateBinding)object).fswmdTvRestoreItems;
        n3 = R$string.restore_items_;
        object2.setText(n3);
        object2 = ((LayoutSharedWithMeStateBinding)object).fswmdTvStateDesc;
        n3 = R$string.shared_with_me_all_items_deleted_desc;
        object2.setText(n3);
        object2 = ((LayoutSharedWithMeStateBinding)object).fswmdLayoutStateDesc;
        Intrinsics.checkNotNullExpressionValue(object2, "fswmdLayoutStateDesc");
        ai0_2.B((View)object2);
        object = ((LayoutSharedWithMeStateBinding)object).fswmdLayoutState;
        Intrinsics.checkNotNullExpressionValue(object, "fswmdLayoutState");
        ai0_2.B((View)object);
    }

    public final FragmentSharedWithMeDetailBinding Ra() {
        Object object = r[0];
        object = this.n.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentSharedWithMeDetailBinding)object;
    }

    public final void Sa(ProductOptionItem object) {
        Object object2;
        AjioProgressView ajioProgressView = this.Ra().fswmdProgressView;
        if (ajioProgressView != null) {
            ajioProgressView = this.Ra().fswmdProgressView;
            ajioProgressView.show();
        }
        ajioProgressView = null;
        Object object3 = "sharedWithMeViewModel";
        if (object != null) {
            object2 = this.c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object2 = null;
            }
            object2.getClass();
            String string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, string2);
            ((w23_0)object2).o = object;
        }
        if ((object = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object.getClass();
        object3 = md3_0.c((jD3)object);
        object2 = new z23_0((w23_0)object, null);
        Ae3.d((i90_0)object3, null, null, (Function2)object2, 3);
    }

    public final void Ta() {
        int n3;
        int n4;
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && ((fragmentActivity = this.getActivity()) == null || (n4 = fragmentActivity.isFinishing()) != (n3 = 1))) {
            fragmentActivity = this.requireActivity();
            String string2 = "requireActivity(...)";
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, string2);
            n3 = 6;
            String string3 = "source - share with me";
            at2_1.h(fragmentActivity, string3, n3);
        }
    }

    public final void U1(int n3) {
        int n4;
        Object object = this.j;
        String string2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserViewModel");
            n4 = 0;
            object = null;
        }
        if ((n4 = ((hy3_0)object).p()) == 0) {
            this.Ta();
        } else {
            Object object2;
            object = this.f;
            if (object != null) {
                object2 = ((m23_0)object).i(n3);
            } else {
                n3 = 0;
                object2 = null;
            }
            this.o = object2;
            if (object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                object2 = ((ProductFnlColorVariantData)object2).getColorGroup();
            } else {
                n3 = 0;
                object2 = null;
            }
            n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n3 == 0) {
                object2 = this.o;
                if (object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                    string2 = ((ProductFnlColorVariantData)object2).getColorGroup();
                }
            } else {
                object2 = this.o;
                if (object2 != null) {
                    object2 = ((Product)object2).getCode();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                if (n3 == 0) {
                    object2 = this.o;
                    if (object2 != null) {
                        string2 = ((Product)object2).getCode();
                    }
                } else {
                    string2 = "";
                }
            }
            object2 = ClosetAddToBagActivity.Companion;
            object = this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
            object2.getClass();
            Intrinsics.checkNotNullParameter(object, "context");
            Intrinsics.checkNotNullParameter(this, "fragment");
            object2 = new Intent((Context)object, ClosetAddToBagActivity.class);
            object = new Bundle();
            String string3 = "product_code";
            object.putString(string3, string2);
            object2.putExtras((Bundle)object);
            n4 = 17;
            this.startActivityForResult((Intent)object2, n4);
        }
    }

    public final void Ua(String string2, boolean bl2) {
        D23 d23 = this.d;
        if (d23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeDetailListener");
            d23 = null;
        }
        d23.L0(string2, bl2);
    }

    public final void V1(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "shareLink");
        object2 = this.f;
        if (object2 != null) {
            Object object3;
            Intrinsics.checkNotNull(object2);
            Object object4 = ((TreeSet)ex_2.B(((m23_0)object2).e)).first();
            String string2 = "first(...)";
            Intrinsics.checkNotNullExpressionValue(object4, string2);
            object4 = (Number)object4;
            int n3 = ((Number)object4).intValue();
            object2 = ((m23_0)object2).i(n3).getImages();
            if (object2 != null) {
                object2 = object2.iterator();
                while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    object4 = (ProductImage)object2.next();
                    string2 = ((ProductImage)object4).getFormat();
                    boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
                    if (bl2 || !(bl2 = Intrinsics.areEqual(string2 = ((ProductImage)object4).getFormat(), object3 = "product"))) continue;
                    object2 = UrlHelper.Companion.getInstance();
                    object4 = ((ProductImage)object4).getUrl();
                    object2 = ((UrlHelper)object2).getImageUrl((String)object4);
                    break;
                }
            } else {
                object2 = "";
            }
            n13_0.Companion.getClass();
            object4 = N13$a.a();
            string2 = this.requireContext();
            Intrinsics.checkNotNullExpressionValue(string2, "requireContext(...)");
            object3 = new B23$d(this, (String)object);
            ((n13_0)object4).a((String)object2, (Context)string2, (s13_0)object3);
        } else {
            object = this.q;
            int n4 = 3827;
            object.sendEmptyMessage(n4);
        }
    }

    public final void Va() {
        Object object;
        boolean bl2;
        Object object2 = this.f;
        if (object2 != null) {
            ((m23_0)object2).d = bl2 = true;
            object = ((m23_0)object2).e;
            object.clear();
            ((RecyclerView$f)object2).notifyDataSetChanged();
        }
        if ((object2 = this.d) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeDetailListener");
            object2 = null;
        }
        object = null;
        object2.K1(0);
        object2 = this.Ra();
        this.Wa(false);
        bl2 = this.m;
        String string2 = "fswmdMenuDelete";
        if (bl2) {
            object = ((FragmentSharedWithMeDetailBinding)object2).fswmdMenuDelete;
            Intrinsics.checkNotNullExpressionValue(object, string2);
            ai0_2.B((View)object);
        } else {
            object = ((FragmentSharedWithMeDetailBinding)object2).fswmdMenuDelete;
            Intrinsics.checkNotNullExpressionValue(object, string2);
            ai0_2.i((View)object);
        }
        object = ((FragmentSharedWithMeDetailBinding)object2).fswmdLayoutCabOptions;
        Intrinsics.checkNotNullExpressionValue(object, "fswmdLayoutCabOptions");
        ai0_2.B((View)object);
        ((FragmentSharedWithMeDetailBinding)object2).fswmdLayoutCabOptions.invalidate();
        ((FragmentSharedWithMeDetailBinding)object2).fswmdLayoutCabOptions.bringToFront();
    }

    public final void Wa(boolean bl2) {
        FragmentSharedWithMeDetailBinding fragmentSharedWithMeDetailBinding = this.Ra();
        fragmentSharedWithMeDetailBinding.fswmdTvSaveToCloset.setEnabled(bl2);
        fragmentSharedWithMeDetailBinding.fswmdTvDelete.setEnabled(bl2);
        TextView textView = fragmentSharedWithMeDetailBinding.fswmdTvShare;
        textView.setEnabled(bl2);
        if (bl2) {
            ImageView imageView = fragmentSharedWithMeDetailBinding.fswmdIvSaveToCloset;
            textView = this.requireContext();
            int n3 = R$color.color_2e4151;
            int n4 = t70.getColor((Context)textView, n3);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(n4, mode);
            imageView = fragmentSharedWithMeDetailBinding.fswmdIvDelete;
            n4 = R$drawable.ic_delete_swm;
            imageView.setImageResource(n4);
            imageView = fragmentSharedWithMeDetailBinding.fswmdIvShare;
            int n7 = R$drawable.ic_share_swm;
            imageView.setImageResource(n7);
        } else {
            ImageView imageView = fragmentSharedWithMeDetailBinding.fswmdIvSaveToCloset;
            textView = this.requireContext();
            int n8 = R$color.color_2e4151_30;
            int n10 = t70.getColor((Context)textView, n8);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(n10, mode);
            imageView = fragmentSharedWithMeDetailBinding.fswmdIvDelete;
            int n14 = R$drawable.ic_delete_swm_disabled;
            imageView.setImageResource(n14);
            imageView = this.Ra().fswmdIvShare;
            n14 = R$drawable.ic_share_swm_disabled;
            imageView.setImageResource(n14);
        }
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.c;
        Object object2 = null;
        Object object3 = "sharedWithMeViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((w23_0)object).f;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        int n3 = 1;
        F62 f62 = new ej2_0(this, n3);
        ((LiveData)object).e(mu1_12, f62);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((w23_0)object).g;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new t23(this);
        ((LiveData)object).e(mu1_12, f62);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((w23_0)object).i;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new u23(this);
        ((LiveData)object).e(mu1_12, f62);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((w23_0)object).j;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new v23(this);
        ((LiveData)object).e(mu1_12, f62);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((w23_0)object).q;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new w23(this);
        ((LiveData)object).e(mu1_12, f62);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((w23_0)object).l;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new x23(this);
        ((LiveData)object).e(mu1_12, f62);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            object2 = object;
        }
        object = ((w23_0)object2).n;
        object2 = this.getViewLifecycleOwner();
        object3 = new y23(this);
        ((LiveData)object).e((mu1_1)object2, (F62)object3);
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        super.onActivityResult(n3, n4, (Intent)object);
        int n7 = 17;
        if (n3 == n7) {
            n3 = 0;
            Object object2 = null;
            if (n4 == 0) {
                this.o = null;
            } else if (object != null) {
                Object object3;
                n4 = Build.VERSION.SDK_INT;
                n7 = 33;
                if (n4 >= n7) {
                    object2 = UX1.a(object);
                } else {
                    object3 = object.getSerializableExtra("slected_product");
                    n7 = object3 instanceof ProductOptionItem;
                    if (n7 != 0) {
                        object2 = object3;
                    }
                    object2 = (ProductOptionItem)object2;
                }
                object2 = (ProductOptionItem)object2;
                object3 = "product_quantity";
                n7 = 0;
                n4 = object.getIntExtra((String)object3, 0);
                if (object2 == null || (object = ((ProductOptionItem)object2).getCode()) == null) {
                    object = "";
                }
                this.k = object;
                this.l = n4;
                this.Oa((ProductOptionItem)object2);
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof D23;
        if (bl2) {
            object = (D23)object;
            this.d = object;
            return;
        }
        object = pn_2.b(object, " cannot be casted to SharedWithMeDetailListener");
        object2 = new RuntimeException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        boolean bl2 = true;
        this.setHasOptionsMenu(bl2);
        object = kd3_2.a();
        Object object2 = new p23_0();
        Object object3 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object2;
        ((kd3_2)object).b = object3;
        Intrinsics.checkNotNull(object);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object3 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object4, string2);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string3);
        Object object6 = w23_0.class;
        String string4 = "modelClass";
        object4 = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object5, object6, string4);
        object5 = "<this>";
        object6 = ef0_0.a(object6, string4, string4, (String)object5);
        Object object7 = object6.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string6.concat((String)object7);
            this.c = object4 = (w23_0)((pD3)object4).a((yn1_2)object6, (String)object7);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object4 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object6 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object7 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object4, string2);
            Intrinsics.checkNotNullParameter(object6, (String)object3);
            Intrinsics.checkNotNullParameter(object7, string3);
            Class<ky1_0> clazz = ky1_0.class;
            object4 = rl3_0.b((rd3_0)object4, (E$b)object6, (Wd0)object7, clazz, string4);
            object6 = ef0_0.a(clazz, string4, string4, (String)object5);
            object7 = object6.getQualifiedName();
            if (object7 != null) {
                object7 = string6.concat((String)object7);
                this.i = object4 = (ky1_0)((pD3)object4).a((yn1_2)object6, (String)object7);
                object6 = this.requireActivity().getApplication();
                object7 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(object6, (String)object7);
                object4 = new UserRepo((Application)object6);
                object6 = this.requireActivity().getApplication();
                ((kd3_2)object).a = object4;
                ((kd3_2)object).b = object6;
                Intrinsics.checkNotNullParameter(this, (String)object2);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object4 = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object2 = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object4, string2);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(object2, string3);
                object3 = hy3_0.class;
                object = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object2, (Class)object3, string4);
                object2 = ef0_0.a((Class)object3, string4, string4, (String)object5);
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    object3 = string6.concat((String)object3);
                    this.j = object = (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
                    object = this.getArguments();
                    if (object != null) {
                        object2 = "LINK_URL";
                        boolean bl3 = object.containsKey((String)object2);
                        if (bl3) {
                            this.a = object2 = new ShareProductExperience();
                            object2 = "SHORTLINK_CODE";
                            boolean bl4 = object.containsKey((String)object2);
                            object4 = null;
                            object5 = "shareProductExperience";
                            if (bl4) {
                                object3 = this.a;
                                if (object3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                    bl4 = false;
                                    object3 = null;
                                }
                                object2 = object.getString((String)object2);
                                Intrinsics.checkNotNull(object2);
                                ((ShareProductExperience)object3).setShortLink((String)object2);
                            }
                            if (bl4 = object.containsKey((String)(object2 = "LINK_TIME"))) {
                                object3 = this.a;
                                if (object3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                    bl4 = false;
                                    object3 = null;
                                }
                                long l2 = object.getLong((String)object2, (long)-1);
                                ((ShareProductExperience)object3).setReceivedMillis(l2);
                            }
                            if (bl4 = object.containsKey((String)(object2 = "LINK_PRODUCTS"))) {
                                object2 = object.getString((String)object2);
                                Intrinsics.checkNotNull(object2);
                                this.b = object2;
                            }
                            if (bl4 = object.containsKey((String)(object2 = "LINK_USER"))) {
                                object3 = this.a;
                                if (object3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                    bl4 = false;
                                    object3 = null;
                                }
                                object2 = object.getString((String)object2);
                                Intrinsics.checkNotNull(object2);
                                ((ShareProductExperience)object3).setSenderId((String)object2);
                            }
                            if (bl4 = object.containsKey((String)(object2 = "LINK_USER_NAME"))) {
                                object3 = this.a;
                                if (object3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                } else {
                                    object4 = object3;
                                }
                                object = object.getString((String)object2);
                                Intrinsics.checkNotNull(object);
                                ((ShareProductExperience)object4).setSender((String)object);
                            }
                        } else {
                            object2 = "paramDBPosition";
                            boolean bl5 = object.containsKey((String)object2);
                            if (bl5) {
                                long l3;
                                this.g = l3 = object.getLong((String)object2);
                            }
                        }
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
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater object) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        String string2 = "inflater";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onCreateOptionsMenu(menu2, (MenuInflater)object);
        int n3 = R$menu.menu_closet;
        object.inflate(n3, menu2);
        int n4 = R$id.action_closet_share_select;
        menu2 = menu2.findItem(n4);
        this.e = menu2;
        if (menu2 != null) {
            object = new z23(this);
            menu2.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)object);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_shared_with_me_detail;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final boolean onOptionsItemSelected(MenuItem object) {
        String string2 = "item";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getItemId();
        int n4 = R$id.action_closet_share_select;
        if (n3 == n4) {
            object = this.getActivity();
            if (object != null && (object = this.Ra().fswmdRvList) != null && (object = this.Ra().fswmdRvList.getAdapter()) != null && (object = this.f) != null) {
                object = this.d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeDetailListener");
                    object = null;
                }
                object.J();
                this.Va();
            }
            return true;
        }
        return super.onOptionsItemSelected((MenuItem)object);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.getActivity();
        if (object != null) {
            object.invalidateOptionsMenu();
        }
        object = this.Ra();
        object2 = ((FragmentSharedWithMeDetailBinding)object).fswmdLayoutCabOptions;
        Intrinsics.checkNotNullExpressionValue(object2, "fswmdLayoutCabOptions");
        ai0_2.i((View)object2);
        object2 = ((FragmentSharedWithMeDetailBinding)object).fswmdMenuShare;
        object3 = this.p;
        object2.setOnClickListener((View.OnClickListener)object3);
        ((FragmentSharedWithMeDetailBinding)object).fswmdMenuDelete.setOnClickListener((View.OnClickListener)object3);
        ((FragmentSharedWithMeDetailBinding)object).fswmdMenuSaveToCloset.setOnClickListener((View.OnClickListener)object3);
        object = ((FragmentSharedWithMeDetailBinding)object).sharedStateLayout;
        ((LayoutSharedWithMeStateBinding)object).fswmdTvRestoreItems.setOnClickListener((View.OnClickListener)object3);
        ((LayoutSharedWithMeStateBinding)object).fswmdTvContinueShopping.setOnClickListener((View.OnClickListener)object3);
        object = this.a;
        object2 = null;
        object3 = "sharedWithMeViewModel";
        if (object != null && (object = this.b) != null) {
            int n3;
            this.Ra().fswmdProgressView.show();
            object = this.a;
            Object object4 = "shareProductExperience";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            object = ((ShareProductExperience)object).getShortLink();
            n3 = ((String)object).length();
            Object object5 = "csvProducts";
            if (n3 > 0) {
                String string2;
                object = this.c;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    object = null;
                }
                if ((object3 = this.a) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    boolean bl2 = false;
                    object3 = null;
                }
                if ((string2 = this.b) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    string2 = null;
                }
                object.getClass();
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                Intrinsics.checkNotNullParameter(string2, "products");
                object4 = md3_0.c((jD3)object);
                object5 = new t23_0((w23_0)object, (ShareProductExperience)object3, string2, null);
                n3 = 3;
                Ae3.d((i90_0)object4, null, null, (Function2)object5, n3);
            } else {
                Object object6;
                int n4;
                n3 = 0;
                object = null;
                this.m = false;
                w23_0 w23_02 = this.c;
                if (w23_02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    w23_02 = null;
                }
                if ((object3 = this.a) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n4 = 0;
                    object3 = null;
                }
                if ((object6 = this.b) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                } else {
                    object2 = object6;
                }
                w23_02.getClass();
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                Intrinsics.checkNotNullParameter(object2, (String)object5);
                object4 = new SharedWithMe();
                ((ShareProductExperience)object3).setShareType(1);
                ((ShareProductExperience)object3).setDeleted(false);
                ((ShareProductExperience)object3).setExpType(2);
                ((SharedWithMe)object4).setShareProductExperience((ShareProductExperience)object3);
                object3 = ",";
                int n7 = StringsKt.F((CharSequence)object2, (CharSequence)object3, false);
                if (n7 != 0) {
                    object2 = fT1.a((String)object3, (String)object2);
                    object3 = new ArrayList();
                    object2 = ((Iterable)object2).iterator();
                    while ((n7 = object2.hasNext()) != 0) {
                        object5 = (String)object2.next();
                        object6 = new ListShareProductExperience();
                        ((ListShareProductExperience)object6).setDeleted(false);
                        ((ListShareProductExperience)object6).setProductId((String)object5);
                        ((ArrayList)object3).add(object6);
                    }
                    object = CollectionsKt.k0(object3);
                    ((SharedWithMe)object4).setProductsShared((List)object);
                }
                object = g53_0.d(object4);
                Intrinsics.checkNotNullExpressionValue(object, "just(...)");
                object2 = qt2_2.b;
                object = ((g53_0)object).h((Scheduler)object2);
                object2 = new sz_1(w23_02, 2);
                object3 = new iX1(2, (Function1)object2);
                object2 = new s53_0((q63_0)object, (bx0_2)object3);
                object = ti_2.a();
                object = ((g53_0)object2).e((Scheduler)object);
                n4 = 4;
                object2 = new xl_2(w23_02, n4);
                object3 = new jX1(1, (Function1)object2);
                int n8 = 4;
                object2 = new zl_2(w23_02, n8);
                n7 = 2;
                object4 = new jw0_1(n7, (Function1)object2);
                object = ((g53_0)object).f((o60_0)object3, (o60_0)object4);
                object2 = w23_02.e;
                ((t30_0)object2).b((yr0_2)object);
            }
        } else {
            long l2 = this.g;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object7 > 0) {
                this.Ra().fswmdProgressView.show();
                object = this.c;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object2 = object;
                }
                long l7 = this.g;
                ((w23_0)object2).c(l7);
            }
        }
    }

    public final void u5(int n3) {
        Object object = this.f;
        if (object != null) {
            boolean bl2;
            Object object2 = ((m23_0)object).i(n3);
            object = ((Product)object2).getFnlColorVariantData();
            Object object3 = null;
            if (object != null) {
                object = ((ProductFnlColorVariantData)object).getColorGroup();
            } else {
                bl2 = false;
                object = null;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) {
                if ((object2 = ((Product)object2).getFnlColorVariantData()) != null) {
                    object2 = ((ProductFnlColorVariantData)object2).getColorGroup();
                } else {
                    n3 = 0;
                    object2 = null;
                }
            } else {
                object = ((Product)object2).getCode();
                bl2 = TextUtils.isEmpty((CharSequence)object);
                object2 = !bl2 ? ((Product)object2).getCode() : "";
            }
            if (object2 != null) {
                object = this.d;
                if (object == null) {
                    object = "sharedWithMeDetailListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object3 = object;
                }
                object3.S1((String)object2);
            }
        }
    }
}

