/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ajio.ril.core.network.model.DataError;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.database.entity.SharedWithMe;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.StatusNew;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XL
 */
public final class xl_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xl_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (SharedWithMe)object;
                object3 = (w23_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = yn3_0.a;
                String string2 = ((SharedWithMe)object).toString();
                Object object4 = new Object[n3];
                object4[0] = string2;
                ((yn3$a)object2).a("SharedWithMeViewModel prepareSharedWithMe: %s", (Object[])object4);
                object4 = ((w23_0)object3).f;
                object = DataCallback.Companion.onSuccess(object);
                ((LiveData)object4).k(object);
                return Unit.a;
            }
            case 3: {
                object = (pq$a$d)object;
                object3 = (tr1_0)object3;
                Intrinsics.checkNotNullParameter(object3, "$showShimmer");
                Intrinsics.checkNotNullParameter(object, "it");
                object = Boolean.FALSE;
                object3.setValue(object);
                return Unit.a;
            }
            case 2: {
                object = (Throwable)object;
                object3 = (wx1_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                zr1_1 zr1_12 = ((wx1_1)object3).R;
                Intrinsics.checkNotNull(object);
                object = ((wx1_1)object3).d.handleApiException((Throwable)object, "ShowWishList");
                zr1_12.k(object);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                pJ0$a pJ0$a = pj0_2.Companion;
                object3 = (pj0_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n7 != 0) {
                    object2 = ((pj0_2)object3).f;
                    n4 = 0;
                    pJ0$a = null;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                        n7 = 0;
                        object2 = null;
                    }
                    object2.stopLoader();
                    n7 = ((DataCallback)object).getStatus();
                    if (n7 == 0) {
                        object2 = z40_0.Companion;
                        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
                        Object object5 = "wishlist_state_enable";
                        n7 = (int)(((ao0_0)object2).a((String)object5) ? 1 : 0);
                        if (n7 != 0) {
                            object2 = ((pj0_2)object3).t;
                            n7 = ov3.u((RecyclerView)object2);
                            object5 = ((pj0_2)object3).y;
                            if (object5 != null) {
                                ((RecyclerView$f)object5).notifyItemChanged(n7);
                            }
                        }
                        if ((object = (SaveForLaterResponse)((DataCallback)object).getData()) != null) {
                            object2 = ((SaveForLaterResponse)object).getStatusCode();
                            if (object2 != null && (n7 = ((Integer)object2).intValue()) == 0) {
                                boolean bl2;
                                if ((object = ((SaveForLaterResponse)object).getStatus()) != null) {
                                    object = ((StatusNew)object).getMessageDescription();
                                } else {
                                    bl2 = false;
                                    object = null;
                                }
                                n7 = 3;
                                rw_1.a(n7, (String)object);
                                object = ((pj0_2)object3).Qa().h.b;
                                if (object != null) {
                                    object2 = el1_2.a;
                                    object2 = yt2_2.PLP;
                                    el1_2.c((yt2_2)((Object)object2), (Product)object);
                                }
                                if ((object = ((pj0_2)object3).Qa().h.b) != null && (object = ((Product)object).getFnlColorVariantData()) != null) {
                                    object = ((ProductFnlColorVariantData)object).getColorGroup();
                                } else {
                                    bl2 = false;
                                    object = null;
                                }
                                if (object != null && (bl2 = ((String)object).length()) && (object = ((pj0_2)object3).Qa().h.b) != null) {
                                    object2 = ((pj0_2)object3).Qa().h.b;
                                    if (object2 != null) {
                                        object2 = ((Product)object2).getFnlColorVariantData();
                                    } else {
                                        n7 = 0;
                                        object2 = null;
                                    }
                                    Intrinsics.checkNotNull(object2);
                                    object2 = ((ProductFnlColorVariantData)object2).getColorGroup();
                                    ((Product)object).setCode((String)object2);
                                }
                                if ((object = ((pj0_2)object3).j) != null) {
                                    object = ((Component)object).getSubType();
                                } else {
                                    bl2 = false;
                                    object = null;
                                }
                                bl2 = Intrinsics.areEqual(object, "SEEN-POSTS");
                                object2 = new Bundle();
                                object5 = ((pj0_2)object3).j;
                                Object object6 = "";
                                if (object5 == null || (object5 = ((Component)object5).getPostId()) == null) {
                                    object5 = object6;
                                }
                                String string3 = "post_id";
                                object2.putString(string3, (String)object5);
                                object5 = "isUnseen";
                                object = String.valueOf(bl2);
                                object2.putString((String)object5, (String)object);
                                object = ((pj0_2)object3).Qa().h.b;
                                if (object != null && (object = ((Product)object).getCode()) != null) {
                                    object6 = object;
                                }
                                object5 = "post_product_widget - add to wishlist - success";
                                pp0_0.e((String)object5, (String)object6, (Bundle)object2, "post screen");
                                object = ((pj0_2)object3).Qa().h.b;
                                if (object != null) {
                                    object = g62_0.c;
                                    object2 = ((pj0_2)object3).Qa().h.b;
                                    Intrinsics.checkNotNull(object2);
                                    object2 = DW.c((Product)object2);
                                    int n8 = 1000;
                                    ((g62_0)object).b(object2, n8);
                                    kx3_0.a = n3;
                                    kx3_0.b = null;
                                }
                            } else {
                                if ((object = ((SaveForLaterResponse)object).getStatus()) != null) {
                                    object = ((StatusNew)object).getMessageDescription();
                                } else {
                                    boolean bl3 = false;
                                    object = null;
                                }
                                n3 = 2;
                                rw_1.a(n3, (String)object);
                            }
                        } else {
                            rw_1.a(n3, null);
                        }
                        object = ((pj0_2)object3).Qa().h;
                        ((BH3)object).b = null;
                    } else {
                        int n10 = ((DataCallback)object).getStatus();
                        if (n10 == n3) {
                            rw_1.a(n3, null);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object3 = (lm_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = cp_1.Companion;
        int n14 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n14 != 0) {
            Intrinsics.checkNotNull(object);
            n14 = ((DataCallback)object).getStatus();
            if (n14 == 0) {
                ((lm_2)object3).Oa();
            } else {
                n14 = ((DataCallback)object).getStatus();
                if (n14 == n3) {
                    object = ((DataCallback)object).getError();
                    ((lm_2)object3).Va((DataError)object);
                }
            }
        }
        ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
        return Unit.a;
    }
}

