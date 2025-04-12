/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.Entries;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRefundAmount;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.RtoData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bO2
 */
public final class bo2_2
extends vw_0 {
    public final HN2 a;
    public final RecyclerView b;
    public final AjioTextView c;
    public final AjioTextView d;

    public bo2_2(View object, HN2 object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = object2;
        int n3 = R$id.row_top_products;
        object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.b = object2 = (RecyclerView)object2;
        n3 = R$id.view_details;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.c = object2 = (AjioTextView)object2;
        n3 = R$id.title;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.d = object;
    }

    public final void w(Object iterator, Object object) {
        bo2_2 bo2_22 = this;
        int n3 = 1;
        if (iterator != null) {
            Object object2;
            int n4;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            boolean bl2;
            Object object8;
            Object object9 = iterator;
            object9 = (pa2_0)((Object)iterator);
            ReturnRequest returnRequest = (ReturnRequest)((pa2_0)object9).d;
            boolean bl3 = false;
            Object object10 = null;
            if (returnRequest != null) {
                object8 = returnRequest.getRefundAmountSection();
            } else {
                bl2 = false;
                object8 = null;
            }
            boolean bl4 = false;
            String string2 = null;
            AjioTextView ajioTextView = bo2_22.c;
            if (returnRequest != null) {
                if (object8 != null) {
                    object8 = ((ReturnRefundAmount)object8).isReturnCancelled();
                    object7 = Boolean.TRUE;
                    bl2 = Intrinsics.areEqual(object8, object7);
                } else {
                    bl2 = false;
                    object8 = null;
                }
                if (bl2) {
                    ai0_2.i((View)ajioTextView);
                }
            }
            if (returnRequest != null && (object8 = returnRequest.getReturnEntries()) != null && (object8 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object8)) != null && (object8 = ((OrderDetailLineItem)object8).getEntry()) != null && (object8 = ((CartEntry)object8).getProduct()) != null && (object8 = ((Product)object8).getCode()) != null) {
                int n7;
                object7 = returnRequest.getReturnEntries();
                if (object7 != null && (object7 = (OrderDetailLineItem)CollectionsKt.firstOrNull(object7)) != null && (object7 = ((OrderDetailLineItem)object7).getEntry()) != null && (n7 = (int)(((CartEntry)object7).isExchangeItem() ? 1 : 0)) == 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    object7 = null;
                }
                if (n7 != 0) {
                    n7 = ((String)object8).length();
                    if (n7 > 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        object7 = null;
                    }
                    if (n7 != 0) {
                        int n8;
                        object7 = ((pa2_0)object9).e;
                        if (object7 != null && (n8 = ((HashMap)object7).containsKey(object8)) == n3) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            object6 = null;
                        }
                        if (n8) {
                            object6 = h40_0.a;
                            object6 = h40_0.D(false).getReturnStatusToShowFreebies();
                            if (object6 != null && (n8 = object6.contains(object5 = returnRequest.getReturnStatus())) == n3) {
                                n8 = 1;
                            } else {
                                n8 = 0;
                                object6 = null;
                            }
                            object5 = "itemView";
                            if (n8) {
                                object6 = a21.a;
                                object4 = a21$a.RETURN_CREATED;
                                object3 = bo2_22.itemView;
                                Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
                                object8 = (ArrayList)((HashMap)object7).get(object8);
                                a21.i((a21)object6, (a21$a)((Object)object4), (View)object3, (ArrayList)object8);
                            } else {
                                object6 = a21.a;
                                object4 = a21$a.RETURN_REFUND;
                                object3 = bo2_22.itemView;
                                Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
                                object8 = (ArrayList)((HashMap)object7).get(object8);
                                a21.i((a21)object6, (a21$a)((Object)object4), (View)object3, (ArrayList)object8);
                            }
                        }
                    }
                }
            }
            object8 = bo2_22.b;
            ((RecyclerView)object8).setHasFixedSize(n3 != 0);
            ((RecyclerView)object8).setNestedScrollingEnabled(false);
            object6 = bo2_22.itemView.getContext();
            object7 = new LinearLayoutManager((Context)object6, 0, false);
            ((RecyclerView)object8).setLayoutManager((RecyclerView$o)object7);
            object7 = new ArrayList();
            object6 = new ArrayList();
            object5 = new ArrayList();
            object9 = ((pa2_0)object9).b;
            Intrinsics.checkNotNull(object9, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Cart.CartEntry>");
            object9 = ((ArrayList)object9).iterator();
            object4 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object9, (String)object4);
            while ((n4 = object9.hasNext()) != 0) {
                object3 = object9.next();
                String string3 = "next(...)";
                Intrinsics.checkNotNullExpressionValue(object3, string3);
                object3 = (CartEntry)object3;
                Object object11 = ((CartEntry)object3).getProduct().getImages();
                if (object11 != null) {
                    boolean bl5;
                    object11 = ((ArrayList)object11).iterator();
                    Intrinsics.checkNotNullExpressionValue(object11, (String)object4);
                    while (bl5 = object11.hasNext()) {
                        Object object12 = object11.next();
                        Intrinsics.checkNotNullExpressionValue(object12, string3);
                        object12 = (ProductImage)object12;
                        string2 = ((ProductImage)object12).getFormat();
                        object2 = "mobileProductListingImage";
                        n3 = (int)(((String)object2).equals(string2) ? 1 : 0);
                        if (n3 != 0) {
                            object2 = ((ProductImage)object12).getUrl();
                            ((ArrayList)object6).add(object2);
                            break;
                        }
                        n3 = 1;
                        bl4 = false;
                        string2 = null;
                    }
                }
                if ((object2 = ((CartEntry)object3).getProduct().getBaseProduct()) != null && (n3 = ((String)object2).length()) != 0) {
                    n3 = 0;
                    object2 = null;
                } else {
                    n3 = 1;
                }
                if (n3 == 0) {
                    object2 = ((CartEntry)object3).getProduct().getBaseProduct();
                } else {
                    object2 = ((CartEntry)object3).getCode();
                    if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                        n3 = 0;
                        object2 = null;
                    } else {
                        n3 = 1;
                    }
                    object2 = n3 == 0 ? ((CartEntry)object3).getCode() : "";
                }
                string2 = ((CartEntry)object3).getSourceStoreId();
                if (string2 == null) {
                    string2 = ld3_2.STORE_AJIO.getStoreId();
                }
                ((ArrayList)object5).add(string2);
                ((ArrayList)object7).add(object2);
                n3 = 1;
                bl4 = false;
                string2 = null;
            }
            object2 = new ArrayList();
            object9 = ((ArrayList)object6).iterator();
            Intrinsics.checkNotNullExpressionValue(object9, (String)object4);
            while (bl4 = object9.hasNext()) {
                string2 = (String)object9.next();
                n4 = 1;
                object4 = new Entries(null, string2, n4, null);
                ((ArrayList)object2).add(object4);
            }
            if (returnRequest != null) {
                string2 = returnRequest.getReturnId();
            } else {
                bl4 = false;
                string2 = null;
            }
            if (returnRequest != null) {
                object10 = returnRequest.getCreated();
            }
            object4 = new RtoData(string2, (String)object10, (ArrayList)object2);
            object9 = new RtoResponseData((RtoData)object4);
            object2 = bo2_22.a;
            if (returnRequest != null && (bl3 = returnRequest.isShowReasonPopup()) && object2 != null) {
                object2.D8((RtoResponseData)object9);
            }
            object9 = new xn2_0((ArrayList)object6, (ArrayList)object7, (HN2)object2, (ArrayList)object5);
            ((RecyclerView)object8).setAdapter((RecyclerView$f)object9);
            int n10 = 1;
            object2 = new xz2_0(bo2_22, n10);
            ajioTextView.setOnClickListener((View.OnClickListener)object2);
            if (returnRequest != null) {
                object2 = returnRequest.getReturnStatus();
                n3 = (int)("RETURN CANCELLED".equalsIgnoreCase((String)object2) ? 1 : 0);
                object10 = bo2_22.d;
                if (n3 != 0) {
                    object2 = returnRequest.getReturnRevampTopicName();
                    object10.setText((CharSequence)object2);
                } else {
                    object2 = returnRequest.getReturnStatus();
                    if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                        n3 = 0;
                        object2 = null;
                    } else {
                        n3 = 1;
                    }
                    if (n3 == 0) {
                        object2 = returnRequest.getReturnStatus();
                        object10.setText((CharSequence)object2);
                    } else {
                        n3 = 8;
                        object10.setVisibility(n3);
                    }
                }
            }
        }
    }
}

