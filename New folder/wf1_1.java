/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.l;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Product.LuxePdpLinks;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.flashsale.pdp.RilfnlBreadCrumb;
import com.ril.ajio.services.data.flashsale.pdp.RilfnlBreadCrumbList;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wF1
 */
public final class wf1_1
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final View c;
    public final RecyclerView d;

    public wf1_1(View object, yi2_1 object2) {
        String string2;
        block21: {
            int n3;
            int n4;
            String string3;
            Object object3;
            block18: {
                boolean bl2;
                block19: {
                    block20: {
                        Object object4;
                        block16: {
                            block17: {
                                int n7;
                                RecyclerView recyclerView;
                                Intrinsics.checkNotNullParameter(object, "view");
                                Intrinsics.checkNotNullParameter(object2, "pdpInfoProvider");
                                super((View)object);
                                this.a = object;
                                this.b = object2;
                                Intrinsics.checkNotNullParameter(object, "itemView");
                                int n8 = R$id.pdp_bottom_links_rv;
                                this.d = recyclerView = (RecyclerView)object.findViewById(n8);
                                n8 = R$id.rv_divider;
                                object = object.findViewById(n8);
                                this.c = object;
                                object = h40_0.a;
                                object = z40_0.Companion;
                                object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                                bl2 = ((ao0_0)object).a("is_swap_similarto_and_recently_viewed_enabled");
                                n8 = 0;
                                recyclerView = null;
                                if (bl2) {
                                    object = this.c;
                                    if (object != null) {
                                        object.setVisibility(0);
                                    }
                                } else {
                                    object = this.c;
                                    if (object != null) {
                                        n7 = 8;
                                        object.setVisibility(n7);
                                    }
                                }
                                object4 = this.d;
                                object3 = null;
                                string3 = "linksRv";
                                if (object4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                                    n7 = 0;
                                    object4 = null;
                                }
                                object4 = object4.getContext();
                                n4 = 1;
                                object = new l((Context)object4, n4);
                                n7 = (int)(object2.c9() ? 1 : 0);
                                string2 = "Drawable cannot be null.";
                                if (n7 == 0) break block16;
                                n3 = R$drawable.line_divider;
                                object2 = hv3_0.r(n3);
                                Intrinsics.checkNotNull(object2);
                                if (object2 == null) break block17;
                                ((l)object).a = object2;
                                object = this.d;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                                    bl2 = false;
                                    object = null;
                                }
                                if ((object4 = this.d) == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                                    n7 = 0;
                                    object4 = null;
                                }
                                object4 = object4.getContext();
                                Intrinsics.checkNotNullExpressionValue(object4, "getContext(...)");
                                string2 = "context";
                                Intrinsics.checkNotNullParameter(object4, string2);
                                object2 = new RecyclerView$n();
                                n7 = R$drawable.line_divider;
                                object4 = hv3_0.r(n7);
                                Intrinsics.checkNotNull(object4);
                                ((xf1_2)object2).a = object4;
                                ((RecyclerView)object).addItemDecoration((RecyclerView$n)object2);
                                break block18;
                            }
                            object = new IllegalArgumentException(string2);
                            throw object;
                        }
                        n3 = (int)(Intrinsics.areEqual(object2 = object2.o5(), object4 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0);
                        if (n3 == 0) break block19;
                        n3 = R$drawable.ajiogram_line_divider;
                        object2 = hv3_0.r(n3);
                        Intrinsics.checkNotNull(object2);
                        if (object2 == null) break block20;
                        ((l)object).a = object2;
                        object = this.d;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            bl2 = false;
                            object = null;
                        }
                        object2 = new ah2_1();
                        ((RecyclerView)object).addItemDecoration((RecyclerView$n)object2);
                        break block18;
                    }
                    object = new IllegalArgumentException(string2);
                    throw object;
                }
                n3 = R$drawable.ajio_line_divider;
                object2 = hv3_0.r(n3);
                Intrinsics.checkNotNull(object2);
                if (object2 == null) break block21;
                ((l)object).a = object2;
                object = this.d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl2 = false;
                    object = null;
                }
                object2 = new ei2_2();
                ((RecyclerView)object).addItemDecoration((RecyclerView$n)object2);
            }
            object2 = this.d;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object2 = null;
            }
            object2 = object2.getContext();
            object = new LinearLayoutManager((Context)object2, n4, false);
            object2 = this.d;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object2;
            }
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object);
            return;
        }
        object = new IllegalArgumentException(string2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w() {
        int n3;
        boolean bl2;
        Object object;
        String string2;
        Object object2 = this;
        Object object3 = new ArrayList();
        Object object4 = this.b;
        Object object5 = object4.x5();
        boolean bl3 = object4.c9();
        String string3 = "linksRv";
        Object object6 = ":relevance:brand:";
        Object object7 = ":relevance:verticalcolorfamily:";
        Object object8 = ":relevance:brickstyletype:";
        Object object9 = "All ";
        String string4 = "?query=";
        String string5 = "UTF-8";
        int n4 = 2;
        if (bl3) {
            if (object5 != null) {
                Object object10;
                boolean bl4;
                boolean bl5;
                boolean bl6;
                Object object11;
                Object object12 = ((Product)object5).getRilfnlBreadCrumbList();
                if (object12 != null && (object12 = ((RilfnlBreadCrumbList)object12).getRilfnlBreadCrumb()) != null && (object12 = (RilfnlBreadCrumb)((ArrayList)object12).get(n4)) != null) {
                    object12 = ((RilfnlBreadCrumb)object12).getCategoryCode();
                } else {
                    bl3 = false;
                    object12 = null;
                }
                object12 = kp1_0.c("https://luxe.ajio.com/c/", (String)object12);
                Serializable serializable = ((Product)object5).getRilfnlBreadCrumbList();
                if (serializable != null) {
                    serializable = ((Product)object5).getRilfnlBreadCrumbList();
                    Intrinsics.checkNotNull(serializable);
                    serializable = ((RilfnlBreadCrumbList)serializable).getRilfnlBreadCrumb();
                    if (serializable != null) {
                        serializable = ((Product)object5).getRilfnlBreadCrumbList();
                        Intrinsics.checkNotNull(serializable);
                        serializable = ((RilfnlBreadCrumbList)serializable).getRilfnlBreadCrumb();
                        Intrinsics.checkNotNull(serializable);
                        int n7 = ((ArrayList)serializable).size();
                        if (n7 >= n4) {
                            serializable = ((Product)object5).getRilfnlBreadCrumbList();
                            Intrinsics.checkNotNull(serializable);
                            serializable = ((RilfnlBreadCrumbList)serializable).getRilfnlBreadCrumb();
                            Intrinsics.checkNotNull(serializable);
                            object11 = ((RilfnlBreadCrumb)((ArrayList)serializable).get(n4)).getName();
                            object9 = kp1_0.c((String)object9, (String)object11);
                            object11 = new LuxePdpLinks((String)object9, (String)object12);
                            ((ArrayList)object3).add(object11);
                        }
                    }
                }
                if (!(bl6 = TextUtils.isEmpty((CharSequence)(object9 = ((Product)object5).getStyleType())))) {
                    object9 = ((Product)object5).getStyleType();
                    object9 = kp1_0.c("Style ", (String)object9);
                    object11 = ((Product)object5).getStyleType();
                    serializable = new StringBuilder((String)object8);
                    ((StringBuilder)serializable).append((String)object11);
                    object8 = URLEncoder.encode(((StringBuilder)serializable).toString(), string5);
                    object8 = n1.a((String)object12, string4, (String)object8);
                    object11 = new LuxePdpLinks((String)object9, (String)object8);
                    ((ArrayList)object3).add(object11);
                }
                if ((object8 = ((Product)object5).getFnlColorVariantData()) != null) {
                    object8 = ((ProductFnlColorVariantData)object8).getColor();
                } else {
                    bl5 = false;
                    object8 = null;
                }
                bl5 = TextUtils.isEmpty((CharSequence)object8);
                if (!bl5) {
                    object8 = ((Product)object5).getFnlColorVariantData();
                    if (object8 != null) {
                        object8 = ((ProductFnlColorVariantData)object8).getColor();
                    } else {
                        bl5 = false;
                        object8 = null;
                    }
                    object8 = kp1_0.c("Color ", (String)object8);
                    object9 = ((Product)object5).getFnlColorVariantData();
                    if (object9 != null) {
                        object9 = ((ProductFnlColorVariantData)object9).getColor();
                    } else {
                        bl6 = false;
                        object9 = null;
                    }
                    object11 = new StringBuilder((String)object7);
                    ((StringBuilder)object11).append((String)object9);
                    object7 = URLEncoder.encode(((StringBuilder)object11).toString(), string5);
                    object7 = n1.a((String)object12, string4, (String)object7);
                    object9 = new LuxePdpLinks((String)object8, (String)object7);
                    ((ArrayList)object3).add(object9);
                }
                if ((object7 = ((Product)object5).getFnlColorVariantData()) != null) {
                    object7 = ((ProductFnlColorVariantData)object7).getBrandName();
                } else {
                    bl4 = false;
                    object7 = null;
                }
                bl4 = TextUtils.isEmpty((CharSequence)object7);
                if (!bl4) {
                    object7 = ((Product)object5).getFnlColorVariantData();
                    if (object7 != null) {
                        object7 = ((ProductFnlColorVariantData)object7).getBrandName();
                    } else {
                        bl4 = false;
                        object7 = null;
                    }
                    object8 = "Brand ";
                    object7 = kp1_0.c((String)object8, (String)object7);
                    object5 = ((Product)object5).getFnlColorVariantData();
                    if (object5 != null) {
                        object5 = ((ProductFnlColorVariantData)object5).getBrandName();
                    } else {
                        boolean bl7 = false;
                        object5 = null;
                    }
                    object8 = new StringBuilder((String)object6);
                    ((StringBuilder)object8).append((String)object5);
                    object5 = URLEncoder.encode(((StringBuilder)object8).toString(), string5);
                    object5 = n1.a((String)object12, string4, (String)object5);
                    object12 = new LuxePdpLinks((String)object7, (String)object5);
                    ((ArrayList)object3).add(object12);
                }
                object5 = new vf1_1((ArrayList)object3, (yi2_1)object4);
                object3 = ((wf1_1)object2).d;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    object10 = null;
                } else {
                    object10 = object3;
                }
                ((RecyclerView)object10).setAdapter((RecyclerView$f)object5);
            }
        } else if (object5 != null) {
            string2 = object4.o5();
            bl3 = Intrinsics.areEqual(string2, object = ld3_2.STORE_AJIOGRAM.getStoreId());
            string2 = bl3 ? "https://ajiogram.ajio.com" : UrlHelper.Companion.getInstance().getBaseUrl();
        }
        object3 = object2;
        return;
        String string6 = "blue";
        String string7 = "black";
        String string8 = "white";
        String string9 = "grey";
        object = xx_2.i("red", "green", string6, string7, string8, string9);
        Object object13 = ((Product)object5).getRilfnlBreadCrumbList();
        if (object13 != null && (object13 = ((RilfnlBreadCrumbList)object13).getRilfnlBreadCrumb()) != null && (object13 = (RilfnlBreadCrumb)((ArrayList)object13).get(n4)) != null) {
            object13 = ((RilfnlBreadCrumb)object13).getCategoryCode();
        } else {
            bl2 = false;
            object13 = null;
        }
        string2 = n1.a(string2, "/c/", (String)object13);
        Object object14 = ((Product)object5).getRilfnlBreadCrumbList();
        object14 = object14 != null && (object14 = ((RilfnlBreadCrumbList)object14).getRilfnlBreadCrumb()) != null && (object14 = (RilfnlBreadCrumb)((ArrayList)object14).get(n4)) != null ? ((RilfnlBreadCrumb)object14).getName() : null;
        object13 = ((Product)object5).getFnlColorVariantData();
        if (object13 != null) {
            object13 = ((ProductFnlColorVariantData)object13).getBrandName();
        } else {
            bl2 = false;
            object13 = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object13);
        String string10 = "More ";
        if (!bl2) {
            object13 = ((Product)object5).getBrandName();
            string8 = string3;
            string3 = UX.c(string10, (String)object14, " by ", (String)object13);
            object13 = ((Product)object5).getFnlColorVariantData();
            if (object13 != null) {
                object13 = ((ProductFnlColorVariantData)object13).getBrandName();
            } else {
                bl2 = false;
                object13 = null;
            }
            object2 = new StringBuilder((String)object6);
            ((StringBuilder)object2).append((String)object13);
            object2 = URLEncoder.encode(((StringBuilder)object2).toString(), string5);
            object2 = n1.a(string2, string4, (String)object2);
            object6 = new LuxePdpLinks(string3, (String)object2);
            ((ArrayList)object3).add(object6);
        } else {
            string8 = string3;
        }
        object2 = ((Product)object5).getFnlColorVariantData();
        if (object2 != null) {
            object2 = ((ProductFnlColorVariantData)object2).getColor();
        } else {
            n3 = 0;
            object2 = null;
        }
        n3 = TextUtils.isEmpty((CharSequence)object2);
        string3 = " ";
        if (n3 == 0) {
            object = (Iterable)object;
            object2 = ((Product)object5).getFnlColorVariantData();
            if (object2 != null && (object2 = ((ProductFnlColorVariantData)object2).getColor()) != null) {
                object6 = Locale.ROOT;
                object2 = ((String)object2).toLowerCase((Locale)object6);
                object6 = "toLowerCase(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
            } else {
                n3 = 0;
                object2 = null;
            }
            n3 = CollectionsKt.F((Iterable)object, object2);
            if (n3 != 0) {
                object2 = ((Product)object5).getFnlColorVariantData();
                if (object2 != null) {
                    object2 = ((ProductFnlColorVariantData)object2).getColor();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                object2 = UX.c(string10, (String)object2, string3, (String)object14);
                object6 = ((Product)object5).getFnlColorVariantData();
                object6 = object6 != null ? ((ProductFnlColorVariantData)object6).getColor() : null;
                object = new StringBuilder((String)object7);
                ((StringBuilder)object).append((String)object6);
                object6 = URLEncoder.encode(((StringBuilder)object).toString(), string5);
                object6 = n1.a(string2, string4, (String)object6);
                object7 = new LuxePdpLinks((String)object2, (String)object6);
                ((ArrayList)object3).add(object7);
            }
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object2 = ((Product)object5).getStyleType()))) == 0) {
            object2 = ((Product)object5).getStyleType();
            object2 = UX.c(string10, (String)object2, string3, (String)object14);
            string3 = ((Product)object5).getStyleType();
            object6 = new StringBuilder((String)object8);
            ((StringBuilder)object6).append(string3);
            string3 = URLEncoder.encode(((StringBuilder)object6).toString(), string5);
            string3 = n1.a(string2, string4, string3);
            object6 = new LuxePdpLinks((String)object2, string3);
            ((ArrayList)object3).add(object6);
        }
        if ((object2 = ((Product)object5).getRilfnlBreadCrumbList()) != null) {
            object2 = ((Product)object5).getRilfnlBreadCrumbList();
            Intrinsics.checkNotNull(object2);
            object2 = ((RilfnlBreadCrumbList)object2).getRilfnlBreadCrumb();
            if (object2 != null) {
                object2 = ((Product)object5).getRilfnlBreadCrumbList();
                Intrinsics.checkNotNull(object2);
                object2 = ((RilfnlBreadCrumbList)object2).getRilfnlBreadCrumb();
                Intrinsics.checkNotNull(object2);
                n3 = ((ArrayList)object2).size();
                int n8 = 2;
                if (n3 >= n8) {
                    object2 = kp1_0.c((String)object9, (String)object14);
                    object5 = new LuxePdpLinks((String)object2, string2);
                    ((ArrayList)object3).add(object5);
                }
            }
        }
        object2 = new vf1_1((ArrayList)object3, (yi2_1)object4);
        object3 = this;
        object4 = this.d;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string8);
            object14 = null;
        } else {
            object14 = object4;
        }
        ((RecyclerView)object14).setAdapter((RecyclerView$f)object2);
    }
}

