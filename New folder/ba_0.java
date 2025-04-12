/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.GiftProducts;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from bA
 */
public final class ba_0
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public RecyclerView a;
    public RecyclerView b;
    public TextView c;
    public ConstraintLayout d;
    public TextView e;
    public CartEntry f;

    public final void onClick(View object) {
        int n3;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.close_dialog;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4) {
            this.dismissAllowingStateLoss();
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        aa_0 aa_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)aa_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.row_ajio_gwp_bottom_sheet_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.row_ajio_gwp_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Object object3;
        int n3;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.id_cart_gwp_list;
        object2 = (RecyclerView)object.findViewById(n4);
        Object object5 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.a = object2;
        n4 = R$id.id_cart_gwp_combo_list;
        object2 = (RecyclerView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.b = object2;
        n4 = R$id.close_dialog;
        object2 = (ImageView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        Object object6 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closetBottomSheet");
            n4 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n4 = R$id.id_cart_gwp_title;
        object2 = (TextView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.c = object2;
        n4 = R$id.id_combo_root_view;
        object2 = (ConstraintLayout)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.d = object2;
        n4 = R$id.id_cart_gwp_combo;
        object2 = (TextView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.e = object2;
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object2 = h40_0.a;
        n4 = 0;
        object2 = null;
        object4 = h40_0.D(false).getCartfreebiesHeaderOne();
        object5 = this.f;
        int n7 = 1;
        if (object5 != null && (object5 = ((CartEntry)object5).getGiftQuantity()) != null && (n3 = ((Number)object5).intValue()) > n7) {
            object4 = h40_0.D(false).getCartfreebiesHeaderMore();
            if (object4 != null) {
                object5 = String.valueOf(n3);
                object3 = "%x";
                object4 = kotlin.text.b.n((String)object4, (String)object3, (String)object5, false);
            } else {
                bl2 = false;
                object4 = null;
            }
        }
        if ((object5 = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartGWPTitle");
            n3 = 0;
            object5 = null;
        }
        object5.setText((CharSequence)object4);
        object4 = this.f;
        if (object4 != null) {
            object4 = ((CartEntry)object4).getGiftProducts();
        } else {
            bl2 = false;
            object4 = null;
        }
        if (object4 != null) {
            int n8;
            Object object7;
            int n10;
            object4 = a21.a;
            object5 = this.f;
            if (object5 != null) {
                object5 = ((CartEntry)object5).getGiftProducts();
            } else {
                n3 = 0;
                object5 = null;
            }
            object4.getClass();
            object4 = a21.f(object5);
            if (object4 != null) {
                object3 = ((GiftProducts)object4).getQuantities();
            } else {
                n10 = 0;
                object3 = null;
            }
            if (object4 != null && (object7 = ((GiftProducts)object4).getQuantities()) != null) {
                n8 = object7.size();
                object7 = n8;
            } else {
                n8 = 0;
                object7 = null;
            }
            object5 = new xn_2((List)object3, (Integer)object7);
            object7 = object.getContext();
            object3 = new LinearLayoutManager((Context)object7, n7, false);
            object7 = this.a;
            String string2 = "cartGWPList";
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n8 = 0;
                object7 = null;
            }
            ((RecyclerView)object7).setLayoutManager((RecyclerView$o)object3);
            object3 = this.a;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n10 = 0;
                object3 = null;
            }
            ((RecyclerView)object3).setAdapter((RecyclerView$f)object5);
            if (object4 != null && (object4 = ((GiftProducts)object4).getGwpType()) != null) {
                bl2 = Intrinsics.areEqual(object4, "CartLevelGWP");
                object5 = "idComboRootView";
                if (bl2) {
                    object4 = this.d;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        bl2 = false;
                        object4 = null;
                    }
                    ai0_2.B((View)object4);
                    object4 = this.f;
                    if (object4 != null) {
                        object4 = ((CartEntry)object4).getGiftProducts();
                    } else {
                        bl2 = false;
                        object4 = null;
                    }
                    if (object4 != null) {
                        object4 = this.f;
                        if (object4 != null) {
                            object4 = ((CartEntry)object4).getGiftProducts();
                        } else {
                            bl2 = false;
                            object4 = null;
                        }
                        object4 = a21.f(object4);
                        if (object4 != null && (object4 = ((GiftProducts)object4).getAssociatedProducts()) != null) {
                            object3 = object4;
                            object3 = (Collection)object4;
                            n10 = object3.isEmpty();
                            if ((n7 ^= n10) != 0) {
                                object5 = this.e;
                                if (object5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("cartComboPurchaseTitle");
                                    n3 = 0;
                                    object5 = null;
                                }
                                String string3 = h40_0.D(false).getCartComboProductTitle();
                                object5.setText((CharSequence)string3);
                                object5 = new yn_2((List)object4);
                                object = object.getContext();
                                object4 = new LinearLayoutManager((Context)object, 0, false);
                                object = this.b;
                                object2 = "cartGWPComboList";
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                    object = null;
                                }
                                object.setLayoutManager((RecyclerView$o)object4);
                                object = this.b;
                                if (object != null) {
                                    object6 = object;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                }
                                ((RecyclerView)object6).setAdapter((RecyclerView$f)object5);
                            } else {
                                object = this.d;
                                if (object != null) {
                                    object6 = object;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                }
                                ai0_2.i((View)object6);
                            }
                        }
                    }
                } else {
                    object = this.d;
                    if (object != null) {
                        object6 = object;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    }
                    ai0_2.i((View)object6);
                }
            }
        }
    }
}

