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
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.SaveForLaterResponse;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.StatusNew;
import com.ril.ajio.services.data.fleek.feedModel.PostData;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class L
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ L(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        byte by2 = 0;
        Object object2 = null;
        Object object3 = "this$0";
        Object object4 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (DataCallback)object;
                Object object5 = ld3_1.Companion;
                object4 = (ld3_1)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object3 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n7 != 0) {
                    object3 = ((ld3_1)object4).h;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                        n7 = 0;
                        object3 = null;
                    }
                    object3.stopLoader();
                    n7 = ((DataCallback)object).getStatus();
                    if (n7 == 0) {
                        object3 = z40_0.Companion;
                        object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
                        object5 = "wishlist_state_enable";
                        n7 = (int)(((ao0_0)object3).a((String)object5) ? 1 : 0);
                        if (n7 != 0) {
                            object3 = ((ld3_1)object4).s;
                            n7 = ov3.u((RecyclerView)object3);
                            object5 = ((ld3_1)object4).v;
                            if (object5 != null) {
                                ((RecyclerView$f)object5).notifyItemChanged(n7);
                            }
                        }
                        if ((object = (SaveForLaterResponse)((DataCallback)object).getData()) != null) {
                            object3 = ((SaveForLaterResponse)object).getStatusCode();
                            if (object3 != null && (n7 = ((Integer)object3).intValue()) == 0) {
                                int n8;
                                boolean bl2;
                                if ((object = ((SaveForLaterResponse)object).getStatus()) != null) {
                                    object = ((StatusNew)object).getMessageDescription();
                                } else {
                                    bl2 = false;
                                    object = null;
                                }
                                n7 = 3;
                                rw_1.a(n7, (String)object);
                                object = ((ld3_1)object4).Qa().h.b;
                                if (object != null) {
                                    object3 = el1_2.a;
                                    object3 = yt2_2.PLP;
                                    el1_2.c((yt2_2)((Object)object3), (Product)object);
                                }
                                if ((object = ((ld3_1)object4).Qa().h.b) != null && (object = ((Product)object).getFnlColorVariantData()) != null) {
                                    object = ((ProductFnlColorVariantData)object).getColorGroup();
                                } else {
                                    bl2 = false;
                                    object = null;
                                }
                                if (object != null && (bl2 = ((String)object).length()) && (object = ((ld3_1)object4).Qa().h.b) != null) {
                                    object3 = ((ld3_1)object4).Qa().h.b;
                                    if (object3 != null) {
                                        object3 = ((Product)object3).getFnlColorVariantData();
                                    } else {
                                        n7 = 0;
                                        object3 = null;
                                    }
                                    Intrinsics.checkNotNull(object3);
                                    object3 = ((ProductFnlColorVariantData)object3).getColorGroup();
                                    ((Product)object).setCode((String)object3);
                                }
                                if ((object = ((ld3_1)object4).j) != null) {
                                    object = ((Subcomponent)object).isSeen();
                                    object3 = Boolean.TRUE;
                                    bl2 = Intrinsics.areEqual(object, object3);
                                } else {
                                    bl2 = false;
                                    object = null;
                                }
                                object3 = new Bundle();
                                object5 = ((ld3_1)object4).Ra();
                                if (object5 != null && (object5 = (Resource)CollectionsKt.N(n8 = ((ld3_1)object4).o, (List)object5)) != null && (object5 = ((Resource)object5).getPostData()) != null) {
                                    object5 = ((PostData)object5).getPostId();
                                } else {
                                    n4 = 0;
                                    object5 = null;
                                }
                                String string2 = "story_id";
                                object3.putString(string2, (String)object5);
                                object5 = "isUnseen";
                                object = String.valueOf(bl2);
                                object3.putString((String)object5, (String)object);
                                object = ((ld3_1)object4).Qa().h.b;
                                if (object == null || (object = ((Product)object).getCode()) == null) {
                                    object = "";
                                }
                                object5 = "story screen";
                                string2 = "story_product_widget - add to wishlist - success";
                                pp0_0.e(string2, (String)object, (Bundle)object3, (String)object5);
                                object = ((ld3_1)object4).Qa().h.b;
                                if (object != null) {
                                    object = g62_0.c;
                                    object3 = ((ld3_1)object4).Qa().h.b;
                                    Intrinsics.checkNotNull(object3);
                                    object3 = DW.c((Product)object3);
                                    n4 = 1000;
                                    ((g62_0)object).b(object3, n4);
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
                        object = ((ld3_1)object4).Qa().h;
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
            case 2: {
                object = (Throwable)object;
                if (object != null) {
                    object4 = (da1_2)object4;
                    object = ((da1_2)object4).a;
                    d.b((i90_0)object, null);
                }
                return Unit.a;
            }
            case 1: {
                object = (ee_2)object;
                object2 = "buffer";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                while (true) {
                    object2 = "<this>";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    by2 = ((ee_2)object).g() ^ n3;
                    if (by2 == 0) break;
                    by2 = ((ee_2)object).readByte();
                    object2 = by2;
                    object3 = object4;
                    object3 = (Function1)object4;
                    object3.invoke(object2);
                }
                return Boolean.TRUE;
            }
            case 0: 
        }
        object2 = object;
        object2 = (Throwable)object;
        object4 = (n_0)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object = ((n_0)object4).b;
        Object object6 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object2);
        object6 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object6, (Throwable)object2, "AJIOCashBonus", false, null, null, 28, null);
        ((LiveData)object).k(object6);
        return Unit.a;
    }
}

