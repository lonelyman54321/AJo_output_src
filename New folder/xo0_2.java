/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.database.entity.SearchRv;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.databinding.FragmentDeleteAccountBinding;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from xo0
 */
public final class xo0_2
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ xo0_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * WARNING - void declaration
     */
    public final void onChanged(Object arrayList) {
        int n3;
        Object object = "format(...)";
        int n4 = 0;
        Object[] objectArray = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n7 = 0;
        Context context = null;
        int n8 = 1;
        int n10 = this.a;
        switch (n10) {
            default: {
                ArrayList<Serializable> arrayList2 = arrayList;
                arrayList2 = (DataCallback)((Object)arrayList);
                object3 = (vv2_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Intrinsics.checkNotNullParameter(arrayList2, "productsListDataCallback");
                object2 = cp_1.Companion;
                int n14 = nn_2.b((cp$a)object2, (DataCallback)((Object)arrayList2));
                if (n14 != 0) {
                    n14 = ((DataCallback)((Object)arrayList2)).getStatus();
                    if (n14 == 0) {
                        boolean n15 = ((Fragment)object3).isAdded();
                        if (n15) {
                            int n16;
                            Object object4;
                            Object object5;
                            Object object6;
                            int n17;
                            Object object7;
                            Object object8;
                            Object object9;
                            object = (RecentlyViewedProducts)((DataCallback)((Object)arrayList2)).getData();
                            if (object != null) {
                                object = ((RecentlyViewedProducts)object).getProducts();
                            } else {
                                boolean bl2 = false;
                                object = null;
                            }
                            object2 = ((vv2_2)object3).q0;
                            if (object != null) {
                                n10 = object.size();
                            } else {
                                n10 = 0;
                                arrayList2 = null;
                            }
                            if (n10 > 0) {
                                boolean bl3;
                                arrayList2 = new ArrayList<Serializable>();
                                object9 = ((ArrayList)object2).iterator();
                                while (bl3 = object9.hasNext()) {
                                    object8 = (SearchRv)object9.next();
                                    if (object == null) continue;
                                    object7 = object;
                                    object7 = ((Iterable)object).iterator();
                                    while ((n17 = object7.hasNext()) != 0) {
                                        object6 = (Product)object7.next();
                                        object5 = ((SearchRv)object8).getProductCode();
                                        n16 = kotlin.text.b.i((String)object5, (String)(object4 = (object4 = ((Product)object6).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object4).getColorGroup() : null), n8 != 0);
                                        if (n16 == 0) continue;
                                        arrayList2.add((Serializable)object6);
                                    }
                                }
                            } else {
                                n10 = 0;
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                boolean bl4;
                                int n18;
                                void var13_18;
                                boolean bl5 = false;
                                object = null;
                                while (var13_18 < (n18 = arrayList2.size())) {
                                    object9 = ((SearchRv)((ArrayList)object2).get((int)var13_18)).getSizeSelected();
                                    n18 = (int)(TextUtils.isEmpty(object9) ? 1 : 0);
                                    if (n18 == 0) {
                                        object9 = ((SearchRv)object2.get((int)var13_18)).getSizeSelected();
                                        object8 = (Product)arrayList2.get((int)var13_18);
                                        object7 = ((Product)object8).getVariantOptions();
                                        if (object7 != null) {
                                            object8 = ((Product)object8).getVariantOptions();
                                            Intrinsics.checkNotNull(object8);
                                            object8 = object8.iterator();
                                            while (bl4 = object8.hasNext()) {
                                                object6 = object7 = ((ProductOptionItem)object8.next()).component6();
                                                object6 = (Collection)object7;
                                                if (object6 == null || (n17 = object6.isEmpty()) != 0) continue;
                                                object7 = object7.iterator();
                                                while ((n17 = object7.hasNext()) != 0) {
                                                    object6 = (ProductOptionVariant)object7.next();
                                                    object5 = ((ProductOptionVariant)object6).getQualifier();
                                                    n16 = kotlin.text.b.i((String)object5, (String)(object4 = "size"), n8 != 0);
                                                    if (n16 == 0 || (n16 = kotlin.text.b.i((String)(object5 = ((ProductOptionVariant)object6).getValue()), (String)object9, n8 != 0)) == 0 || (n17 = ((ProductOptionVariant)object6).getStockLevel()) > 0) continue;
                                                    object6 = ((vv2_2)object3).t;
                                                    if (object6 == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                                                        n17 = 0;
                                                        object6 = null;
                                                    }
                                                    object5 = ((SearchRv)object2.get((int)var13_18)).getProductCode();
                                                    object6.getClass();
                                                    Intrinsics.checkNotNullParameter(object5, "prodCode");
                                                    object6 = md3_0.c((jD3)object6);
                                                    object4 = new rw2_0((String)object5, null);
                                                    n16 = 3;
                                                    Ae3.d((i90_0)object6, null, null, (Function2)object4, n16);
                                                    arrayList2.remove((int)var13_18);
                                                    object2.remove((int)var13_18);
                                                    var13_18 += -1;
                                                }
                                            }
                                        }
                                    }
                                    var13_18 += n8;
                                }
                                object = new ArrayList();
                                object9 = arrayList2.listIterator();
                                object8 = ((ArrayList)object2).listIterator();
                                while (true) {
                                    float f5;
                                    Object object10;
                                    Object object11;
                                    bl4 = object9.hasNext();
                                    object6 = ((vv2_2)object3).p0;
                                    if (!bl4) break;
                                    object7 = (Product)object9.next();
                                    object5 = (SearchRv)object8.next();
                                    object4 = ((Product)object7).getPrice();
                                    if (object4 != null) {
                                        object11 = ((Price)object4).getValue();
                                    } else {
                                        object10 = 0;
                                        object11 = null;
                                        f5 = 0.0f;
                                    }
                                    object10 = TextUtils.isEmpty((CharSequence)object11);
                                    if (object10 != 0) {
                                        object11 = Float.valueOf(0.0f);
                                    } else {
                                        Intrinsics.checkNotNull(object4);
                                        object11 = ((Price)object4).getValue();
                                        Intrinsics.checkNotNull(object11);
                                        object11 = Float.valueOf((String)object11);
                                    }
                                    Object object12 = ((SearchRv)object5).getPriceValue();
                                    boolean bl6 = TextUtils.isEmpty((CharSequence)object12);
                                    if (bl6) {
                                        object12 = Float.valueOf(0.0f);
                                    } else {
                                        object12 = ((SearchRv)object5).getPriceValue();
                                        Intrinsics.checkNotNull(object12);
                                        object12 = Float.valueOf((String)object12);
                                    }
                                    float f6 = ((Float)object12).floatValue();
                                    Intrinsics.checkNotNull(object11);
                                    f5 = ((Float)object11).floatValue();
                                    float f7 = (f6 -= f5) - 0.0f;
                                    object10 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                                    if (object10 <= 0) continue;
                                    ((ArrayList)object6).add(object7);
                                    ((ArrayList)object).add(object5);
                                    if (object4 != null) {
                                        object7 = ((Price)object4).getValue();
                                    } else {
                                        bl4 = false;
                                        object7 = null;
                                    }
                                    bl4 = TextUtils.isEmpty((CharSequence)object7);
                                    if (bl4) {
                                        object7 = "0";
                                    } else {
                                        Intrinsics.checkNotNull(object4);
                                        object7 = ((Price)object4).getValue();
                                        Intrinsics.checkNotNull(object7);
                                    }
                                    if (object4 != null) {
                                        object6 = ((Price)object4).getDisplayformattedValue();
                                    } else {
                                        n17 = 0;
                                        object6 = null;
                                    }
                                    n17 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
                                    if (n17 != 0) {
                                        object6 = "Rs 0.0";
                                    } else {
                                        Intrinsics.checkNotNull(object4);
                                        object6 = ((Price)object4).getDisplayformattedValue();
                                        Intrinsics.checkNotNull(object6);
                                    }
                                    object5 = ((SearchRv)object5).getProductCode();
                                    object4 = new KV2((String)object7, (String)object6, (String)object5);
                                    object7 = ((vv2_2)object3).r0;
                                    ((ArrayList)object7).add(object4);
                                    object9.remove();
                                    object8.remove();
                                    ((vv2_2)object3).Z = n8;
                                }
                                n4 = arrayList2.size();
                                while (n7 < n4) {
                                    object3 = arrayList2.get(n7);
                                    ((ArrayList)object6).add(object3);
                                    object3 = object2.get(n7);
                                    ((ArrayList)object).add(object3);
                                    n7 += n8;
                                }
                            }
                        }
                    } else {
                        n14 = ((DataCallback)((Object)arrayList2)).getStatus();
                        if (n14 == n8) {
                            object2 = StringCompanionObject.INSTANCE;
                            object2 = hv3_0.K(R$string.acc_error_message);
                            n10 = R$string.something_wrong_msg;
                            arrayList2 = hv3_0.K(n10);
                            Object[] objectArray2 = new Object[n8];
                            objectArray2[0] = arrayList2;
                            object = xh2_0.a(objectArray2, n8, (String)object2, (String)object);
                            n14 = R$string.something_wrong_msg;
                            object2 = hv3_0.K(n14);
                            context = ((r61)object3).getContext();
                            if (context != null) {
                                object3 = ((vv2_2)object3).n;
                                if (object3 == null) {
                                    object3 = "activityFragmentListener";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                } else {
                                    objectArray = object3;
                                }
                                objectArray.showToastNotification(context, (String)object2, n8, (String)object);
                            }
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        Object arrayList3 = arrayList;
        arrayList3 = (DataCallback)((Object)arrayList);
        object3 = (yo0_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = ((yo0_2)object3).a;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n3 = 0;
            object2 = null;
        }
        object2 = ((FragmentDeleteAccountBinding)object2).ajioLoaderView;
        ((AjioLoaderView)((Object)object2)).stopLoader();
        if (arrayList3 != null) {
            n3 = ((DataCallback)arrayList3).getStatus();
            if (n3 == 0) {
                v31.a();
                object = ((yo0_2)object3).b;
                if (object != null) {
                    ((hy3_0)object).q();
                }
                kx3_0.a = n8;
                kx3_0.b = null;
                kx3_0.c = n8;
                tj2_2.Companion.getClass();
                object = tj2$a_0.a();
                object.getClass();
                object2 = "pincode";
                String string2 = "";
                Intrinsics.checkNotNullParameter(string2, (String)object2);
                ((tj2_2)object).a = string2;
                object = ((yo0_2)object3).e;
                if (object != null) {
                    object2 = "LOCATION_DATA";
                    ((sw_0)object).putPreference((String)object2, string2);
                }
                if ((object = ((yo0_2)object3).b) != null) {
                    ((hy3_0)object).g();
                }
                if ((object = ((yo0_2)object3).e) != null) {
                    object2 = "closet_card_in_home";
                    ((sw_0)object).removePreference((String)object2);
                }
                if ((object = ((yo0_2)object3).f) != null) {
                    ((b52_0)object).b();
                }
                if ((object = ((yo0_2)object3).b) != null) {
                    ((hy3_0)object).e();
                }
                if ((object = ((yo0_2)object3).b) != null) {
                    ((hy3_0)object).d();
                }
                if ((object = ((yo0_2)object3).e) != null) {
                    ((jo_2)object).B();
                }
                if ((object = ((yo0_2)object3).e) != null) {
                    ((jo_2)object).q(string2);
                }
                vl0_0.a = false;
                vl0_0.b = null;
                bv1_0.a = null;
                bv1_0.b = null;
                bv1_0.c = null;
                bv1_0.d = false;
                bv1_0.h = false;
                bv1_0.e = null;
                bv1_0.f = null;
                bv1_0.g = false;
                object = ((yo0_2)object3).e;
                if (object != null) {
                    object2 = "PREFERRED_PAYMENT";
                    ((sw_0)object).putPreference((String)object2, string2);
                }
                object = new ao0_2();
                object2 = ((Fragment)object3).requireActivity().getSupportFragmentManager();
                ((DialogFragment)object).show((FragmentManager)object2, null);
            } else {
                n4 = ((DataCallback)arrayList3).getStatus();
                if (n4 == n8 && (objectArray = ((DataCallback)arrayList3).getError()) != null && (object2 = objectArray.getErrorMessage()) != null && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object2 = objectArray.getErrorMessage().getMessage())) ? 1 : 0)) == 0) {
                    objectArray = objectArray.getErrorMessage().getMessage();
                    object2 = StringCompanionObject.INSTANCE;
                    n3 = R$string.acc_alert_message;
                    object2 = hv3_0.K(n3);
                    object3 = new Object[n8];
                    object3[0] = objectArray;
                    object = xh2_0.a((Object[])object3, n8, (String)object2, object);
                    object2 = hv3_0.a;
                    Intrinsics.checkNotNull(objectArray);
                    object2.getClass();
                    hv3_0.l0((String)objectArray, (String)object);
                }
            }
        }
    }
}

