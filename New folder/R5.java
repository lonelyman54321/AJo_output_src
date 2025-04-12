/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ajiocash.AjioCashTransferStatus;
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class R5
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ R5(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                Object object2 = cp_1.Companion;
                n3 = (int)(nn_2.b((cp$a)object2, (DataCallback)object) ? 1 : 0);
                if (n3 != 0) {
                    int n4;
                    n3 = 1;
                    kx3_0.a = n3;
                    Object object3 = (ShopTheLookFragment)this.b;
                    j3_0 j3_02 = ((ShopTheLookFragment)object3).k;
                    boolean bl2 = false;
                    Object var7_11 = null;
                    if (j3_02 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                        n4 = 0;
                        j3_02 = null;
                    }
                    j3_02.stopLoader();
                    n4 = ((DataCallback)object).getStatus();
                    if (n4 == 0) {
                        int n7;
                        object = ((ShopTheLookFragment)object3).a;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("stlHomeRv");
                            n7 = 0;
                            object = null;
                        }
                        n7 = ShopTheLookFragment.Pa((RecyclerView)object);
                        object2 = ((ShopTheLookFragment)object3).f;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("shopTheLookBannerDetailsAdapter");
                            n3 = 0;
                            object2 = null;
                        }
                        ((RecyclerView$f)object2).notifyItemChanged(n7);
                        n7 = 4;
                        rw_1.a(n7, null);
                        object = ((ShopTheLookFragment)object3).Ra().h;
                        object2 = ((ShopTheLookFragment)object3).Ra().h.c;
                        object3 = "plp screen";
                        ((BH3)object).d((Product)object2, (String)object3);
                    } else {
                        int n8 = ((DataCallback)object).getStatus();
                        if (n8 == n3) {
                            n8 = 5;
                            rw_1.a(n8, null);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        Object object4 = (U5)this.b;
        Intrinsics.checkNotNullParameter(object4, "this$0");
        hv3_0.s0(((U5)object4).d);
        Object object5 = cp_1.Companion;
        int n10 = nn_2.b((cp$a)object5, (DataCallback)object);
        if (n10 != 0) {
            n10 = ((DataCallback)object).getStatus();
            if (n10 == 0) {
                boolean bl3;
                Object object6;
                Object object7;
                object = (AjioCashTransferStatus)((DataCallback)object).getData();
                n10 = 0;
                object5 = null;
                if (object != null) {
                    object7 = ((AjioCashTransferStatus)object).getValid();
                    object6 = Boolean.FALSE;
                    bl3 = Intrinsics.areEqual(object7, object6);
                } else {
                    bl3 = false;
                    object7 = null;
                }
                if (bl3) {
                    ((U5)object4).Pa();
                } else {
                    boolean bl4;
                    bl3 = false;
                    object7 = null;
                    if (object != null) {
                        object6 = ((AjioCashTransferStatus)object).getTransactionStatus();
                    } else {
                        bl4 = false;
                        object6 = null;
                    }
                    Object object8 = "NOT_FOUND";
                    bl4 = Intrinsics.areEqual(object6, object8);
                    if (bl4) {
                        ((U5)object4).Pa();
                    } else {
                        object6 = ((U5)object4).f;
                        if (object6 != null) {
                            int n14 = 8;
                            object6.setVisibility(n14);
                        }
                        if ((object6 = ((U5)object4).c) != null) {
                            object8 = new Object();
                            object6.setOnClickListener((View.OnClickListener)object8);
                        }
                        if ((object6 = ((U5)object4).b) != null) {
                            object6.setVisibility(0);
                        }
                        if ((object5 = ((U5)object4).b) != null) {
                            if (object != null) {
                                object6 = ((AjioCashTransferStatus)object).getMessage();
                            } else {
                                bl4 = false;
                                object6 = null;
                            }
                            object6 = hv3_0.f((String)object6);
                            object5.setText((CharSequence)object6);
                        }
                        if (object != null) {
                            object7 = ((AjioCashTransferStatus)object).getTransactionStatus();
                        }
                        object4 = ((U5)object4).e;
                        object5 = new s5_0((AjioCashTransferStatus)object);
                        ai0_2.r((Function2)object5, object7, object4);
                    }
                }
            } else {
                int n15 = ((DataCallback)object).getStatus();
                if (n15 == (n10 = 1)) {
                    ((U5)object4).Pa();
                }
            }
        }
        return Unit.a;
    }
}

