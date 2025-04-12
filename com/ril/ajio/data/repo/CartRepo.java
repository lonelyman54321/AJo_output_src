/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.data.repo;

import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartInventory;
import com.ril.ajio.services.data.Cart.ServicabilityInfo;
import com.ril.ajio.services.data.Cart.UpdateCartEntry;
import com.ril.ajio.services.data.Cart.pickfromstore.ProductDetail;
import com.ril.ajio.services.data.Cart.pickfromstore.Status;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class CartRepo {
    public static final int $stable;
    public static final CartRepo INSTANCE;

    static {
        CartRepo cartRepo;
        INSTANCE = cartRepo = new CartRepo();
    }

    private CartRepo() {
    }

    public static /* synthetic */ Unit a(Ref$ObjectRef ref$ObjectRef, float f5, String string2) {
        return CartRepo.getAggregateProductRating$lambda$5(ref$ObjectRef, f5, string2);
    }

    private final String getAggregateProductRating(CartEntry object) {
        Object object2;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = object2 = "";
        boolean bl2 = og1_1.b();
        if (!bl2) {
            object2 = h40_0.a;
            bl2 = h40_0.Y1();
            if (bl2 && (bl2 = h40_0.T0())) {
                object2 = ((CartEntry)object).getAverageRating();
                object = ((CartEntry)object).getNumUserRatings();
                po_2 po_22 = new po_2(ref$ObjectRef);
                ai0_2.r(po_22, object2, object);
            }
        }
        return (String)ref$ObjectRef.element;
    }

    private static final Unit getAggregateProductRating$lambda$5(Ref$ObjectRef ref$ObjectRef, float f5, String string2) {
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$label");
        Intrinsics.checkNotNullParameter(string2, "userCount");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f5);
        String string3 = h30_0.a(stringBuilder, "|", string2);
        ref$ObjectRef.element = string3;
        return Unit.a;
    }

    private final void makeSizeValue(CartEntry object, Product product) {
        StringBuilder stringBuilder;
        Object object2;
        int n3;
        ja2_2 ja2_22 = ka2_2.a((CartEntry)object);
        int n4 = 1;
        if (product != null) {
            n3 = ja2_22.b ^ n4;
            product.setShouldShowSize(n3 != 0);
        }
        String string2 = ja2_22.a;
        boolean bl2 = false;
        if (string2 != null && (n3 = string2.length()) != 0) {
            if (product != null) {
                string2 = product.getName();
            } else {
                n3 = 0;
                string2 = null;
            }
            if (string2 != null) {
                object2 = ja2_22.a;
                stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(" | ");
                stringBuilder.append((String)object2);
                string2 = stringBuilder.toString();
                product.setName(string2);
            }
        }
        boolean bl3 = ja2_22.b;
        string2 = "";
        if (bl3) {
            if (product != null) {
                product.setSelectedSize(string2);
            }
        } else {
            int n7;
            String string3;
            int n8;
            object = ((CartEntry)object).getProduct().getBaseOptions();
            bl3 = false;
            ja2_22 = null;
            if (object != null) {
                object2 = object;
                object2 = (Collection)object;
                n8 = object2.size();
                string3 = string2;
                stringBuilder = null;
                for (n7 = 0; n7 < n8; ++n7) {
                    String string4;
                    Object object3;
                    boolean bl4;
                    Object object4 = (ProductOption)object.get(n7);
                    if (object4 == null || !(bl4 = Intrinsics.areEqual(object3 = hv3_0.K(R$string.size_variant_option), string4 = ((ProductOption)object4).getVariantType())) || (object4 = (object4 = ((ProductOption)object4).getSelected()) != null ? ((ProductOptionItem)object4).getVariantOptionQualifiers() : null) == null) continue;
                    object4 = object4.iterator();
                    while (bl4 = object4.hasNext()) {
                        String string5 = "size";
                        object3 = (ProductOptionVariant)object4.next();
                        string4 = ((ProductOptionVariant)object3).getQualifier();
                        boolean bl5 = string5.equalsIgnoreCase(string4);
                        if (!bl5 || (string3 = ((ProductOptionVariant)object3).getValue()) != null) continue;
                        string3 = string2;
                    }
                }
            } else {
                string3 = string2;
            }
            if (product != null) {
                int n10 = TextUtils.isEmpty((CharSequence)string3);
                if (n10 == 0) {
                    n10 = string3.length() - n4;
                    n3 = 0;
                    string2 = null;
                    bl2 = false;
                    while (n3 <= n10) {
                        n8 = !bl2 ? n3 : n10;
                        n8 = string3.charAt(n8);
                        n7 = 32;
                        if ((n8 = Intrinsics.compare(n8, n7)) <= 0) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            object2 = null;
                        }
                        if (!bl2) {
                            if (n8 == 0) {
                                bl2 = true;
                                continue;
                            }
                            ++n3;
                            continue;
                        }
                        if (n8 == 0) break;
                        n10 += -1;
                    }
                    object = string3.subSequence(n3, n10 += n4);
                    string2 = object.toString();
                }
                product.setSelectedSize(string2);
            }
        }
    }

    private final String setPriceInfo(CartEntry object) {
        int n3;
        float f5;
        float f6;
        int n4;
        Object object2;
        float f7;
        boolean bl2;
        Object object3 = ((CartEntry)object).getQuantity();
        if (object3 != null && (object3 = ((CartEntry)object).getProduct()) != null && (object3 = ((CartEntry)object).getProduct().getWasPriceData()) != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object3 = ((CartEntry)object).getBasePrice().getValue())))) {
            object3 = ((CartEntry)object).getBasePrice().getValue();
            if (object3 == null) {
                object3 = "0";
            }
            f7 = mz3_0.J((String)object3);
            object2 = ((CartEntry)object).getQuantity();
            Intrinsics.checkNotNull(object2);
            n4 = (Integer)object2;
            f6 = n4;
            f7 *= f6;
        } else {
            bl2 = false;
            f7 = 0.0f;
            object3 = null;
        }
        object2 = ((CartEntry)object).getVoucherPromoAmt();
        n4 = TextUtils.isEmpty((CharSequence)object2);
        if (n4 == 0) {
            object2 = ((CartEntry)object).getVoucherPromoAmt();
            f6 = mz3_0.J((String)object2);
        } else {
            n4 = 0;
            f6 = 0.0f;
            object2 = null;
        }
        String string2 = ((CartEntry)object).getMultiItemPromoAmt();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3) {
            object = ((CartEntry)object).getMultiItemPromoAmt();
            f5 = mz3_0.J((String)object);
        } else {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        }
        f7 = f7 - f6 - f5;
        float f8 = f7 - 0.0f;
        n3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (n3 <= 0) {
            n3 = R$string.free;
            object = hv3_0.K(n3);
        } else {
            object = qz2_0.u(f7);
            if (object == null) {
                object = "";
            }
        }
        return object;
    }

    public final void calculateSizeVariantData(Product iterator, zr1_1 zr1_12, zr1_1 zr1_13) {
        Object object;
        boolean bl2;
        Intrinsics.checkNotNullParameter(iterator, "product");
        Intrinsics.checkNotNullParameter(zr1_12, "cartEntryUpdateSelectedProductMLD");
        Intrinsics.checkNotNullParameter(zr1_13, "sizeProductOptionListMLD");
        Y63.i((Product)((Object)iterator));
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object2 = ((Product)((Object)iterator)).getProductOptionVariants().iterator();
        boolean bl3 = true;
        while (bl2 = object2.hasNext()) {
            object = (ProductOptionVariant)object2.next();
            arrayList.add(object);
            bl2 = ((ProductOptionVariant)object).isSelected();
            if (bl2) {
                DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
                object = dataCallback$Companion.onSuccess(object);
                zr1_12.i(object);
            }
            bl3 = false;
            object = null;
        }
        if (bl3 && (object2 = ((Product)((Object)iterator)).getVariantOptions()) != null) {
            boolean bl4;
            iterator = ((Product)((Object)iterator)).getProductOptionVariants().iterator();
            while (bl4 = iterator.hasNext()) {
                object2 = (ProductOptionVariant)iterator.next();
                arrayList.add(object2);
                bl3 = ((ProductOptionVariant)object2).isSelected();
                if (!bl3) continue;
                object = DataCallback.Companion;
                object2 = ((DataCallback$Companion)object).onSuccess(object2);
                zr1_12.i(object2);
            }
        }
        iterator = DataCallback.Companion.onSuccess(arrayList);
        zr1_13.i(iterator);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String filterCart(Cart object, ArrayList arrayList, ArrayList arrayList2, boolean bl2) {
        synchronized (this) {
            block17: {
                boolean bl3;
                Object object2;
                Object object3;
                boolean bl4;
                Iterator iterator = "oosInventoryProduct";
                try {
                    int n3;
                    Intrinsics.checkNotNullParameter(arrayList, (String)((Object)iterator));
                    iterator = "productsToBeUpdated";
                    Intrinsics.checkNotNullParameter(arrayList2, (String)((Object)iterator));
                    if (object != null && (iterator = ((Cart)object).getCartInventory()) != null) {
                        iterator = ((CartInventory)((Object)iterator)).getStatus();
                    } else {
                        n3 = 0;
                        iterator = null;
                    }
                    if (iterator == null || (iterator = ((Cart)object).getCartInventory()) == null || (iterator = ((CartInventory)((Object)iterator)).getStatus()) == null || (n3 = ((Status)((Object)iterator)).getStatusCode()) != 0) break block17;
                    arrayList.clear();
                    arrayList2.clear();
                    iterator = ((Cart)object).getEntries();
                    if (iterator == null) break block17;
                    boolean bl5 = iterator.isEmpty();
                    bl4 = true;
                    if (!(bl5 ^= bl4) || (object3 = ((Cart)object).getCartInventory()) == null || (object3 = ((CartInventory)object3).getProductDetails()) == null) break block17;
                    object2 = object3;
                    object2 = (Collection)object3;
                    bl3 = object2.isEmpty() ^ bl4;
                    if (!bl3) break block17;
                    iterator = ((ArrayList)((Object)iterator)).iterator();
                    object2 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(iterator, (String)object2);
                }
                catch (Throwable throwable) {}
                throw throwable;
                while (bl3 = iterator.hasNext()) {
                    int n4;
                    object2 = iterator.next();
                    Object object4 = ((CartEntry)(object2 = (CartEntry)object2)).isGiftProduct();
                    boolean bl6 = (Boolean)object4;
                    if (bl6) continue;
                    object4 = object3.iterator();
                    while ((n4 = object4.hasNext()) != 0) {
                        Object object5;
                        int n7;
                        String string2;
                        Object object6 = object4.next();
                        object6 = (ProductDetail)object6;
                        Object object7 = ((CartEntry)object2).getProduct();
                        int n8 = b.i((String)(object7 = ((Product)object7).getCode()), string2 = ((ProductDetail)object6).getProductCode(), bl4);
                        if (n8 == 0) continue;
                        ((CartEntry)object2).setQuantityAvailable(bl4);
                        n8 = ((ProductDetail)object6).getAvailableQuantity();
                        string2 = null;
                        if (n8 <= 0) {
                            ((CartEntry)object2).setQuantityAvailable(false);
                            arrayList.add(object2);
                            ((ProductDetail)object6).getProductCode();
                            continue;
                        }
                        n8 = ((ProductDetail)object6).getAvailableQuantity();
                        if (n8 < (n7 = ((Integer)(object5 = ((CartEntry)object2).getQuantity())).intValue())) {
                            n8 = ((ProductDetail)object6).getAvailableQuantity();
                            object7 = n8;
                            ((CartEntry)object2).setInventoryQty((Integer)object7);
                            object7 = cp_1.Companion;
                            object7.getClass();
                            object7 = cp$a.j();
                            object5 = "master_flag";
                            n8 = (int)(object7.has((String)object5) ? 1 : 0);
                            if (n8 != 0 && (n8 = (int)((object7 = cp$a.j()).getBoolean((String)object5) ? 1 : 0)) != 0) {
                                ((CartEntry)object2).setQuantityAvailable(false);
                                arrayList.add(object2);
                                ((ProductDetail)object6).getProductCode();
                                continue;
                            }
                            arrayList2.add(object2);
                            ((ProductDetail)object6).getProductCode();
                            continue;
                        }
                        object7 = ((CartEntry)object2).getServicabilityInfo();
                        if (object7 != null) {
                            n8 = ((ProductDetail)object6).getAvailableQuantity();
                            object7 = n8;
                            ((CartEntry)object2).setInventoryQty((Integer)object7);
                            object7 = ((CartEntry)object2).getServicabilityInfo();
                            if (object7 != null) {
                                object7 = ((ServicabilityInfo)object7).getServicability();
                                object5 = Boolean.FALSE;
                                n8 = (int)(Intrinsics.areEqual(object7, object5) ? 1 : 0);
                            } else {
                                n8 = 0;
                                object7 = null;
                            }
                            if (n8 != 0) {
                                ((CartEntry)object2).setProductNS(bl4);
                                ((CartEntry)object2).setProductNSForGA(bl4);
                                ((CartEntry)object2).setQuantityAvailable(false);
                                arrayList.add(object2);
                                ((ProductDetail)object6).getProductCode();
                                continue;
                            }
                            n4 = ((ProductDetail)object6).getAvailableQuantity();
                            object6 = n4;
                            ((CartEntry)object2).setInventoryQty((Integer)object6);
                            object6 = Unit.a;
                            continue;
                        }
                        n4 = ((ProductDetail)object6).getAvailableQuantity();
                        object6 = n4;
                        ((CartEntry)object2).setInventoryQty((Integer)object6);
                        object6 = Unit.a;
                    }
                }
            }
            if (!bl2) return "";
            this.sendOosEvents(arrayList);
            return this.sendRTBAndCriteoEvents((Cart)object);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isOOSimilarEnabled() {
        boolean bl2 = og1_1.b();
        if (bl2) return false;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "show_similar_items_on_cart";
        bl2 = ((ao0_0)object).a(string2);
        if (!bl2) return false;
        return true;
    }

    public final QuickViewProduct modifyQVInfo(Cart object, QuickViewProduct quickViewProduct, int n3) {
        Object object2 = "data";
        Intrinsics.checkNotNullParameter(quickViewProduct, (String)object2);
        if (object != null) {
            boolean bl2;
            object = ((Cart)object).getEntries().iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl2 = object.hasNext()) {
                boolean bl3;
                int n4;
                object2 = (CartEntry)object.next();
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry");
                Integer n7 = ((CartEntry)object2).getEntryNumber();
                int n8 = 1;
                if (n7 != null && (n4 = n7.intValue()) == n3) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    n7 = null;
                }
                String string2 = ((CartEntry)object2).getProduct().getCode();
                Object object3 = quickViewProduct.getProducts();
                Intrinsics.checkNotNull(object3);
                object3 = object3.iterator();
                int n10 = -1;
                while (bl3 = object3.hasNext()) {
                    boolean bl4;
                    Object object4;
                    Product product = (Product)object3.next();
                    n10 += n8;
                    int n14 = 0;
                    String string3 = null;
                    if (product != null) {
                        object4 = product.getCode();
                    } else {
                        bl4 = false;
                        object4 = null;
                    }
                    if (!(bl4 = b.i((String)object4, string2, n8 != 0))) continue;
                    if (product != null && (object4 = product.getPrice()) != null) {
                        String string4 = INSTANCE.setPriceInfo((CartEntry)object2);
                        ((Price)object4).setFormattedValue(string4);
                    }
                    object4 = INSTANCE;
                    super.makeSizeValue((CartEntry)object2, product);
                    if (product != null) {
                        object4 = ((CartEntry)object2).getQuantity();
                        product.setQuantity((Integer)object4);
                    }
                    if (product != null) {
                        object4 = ((CartEntry)object2).getSourceStoreId();
                        product.setSourceStoreId((String)object4);
                    }
                    if (n4 != 0) {
                        quickViewProduct.setSelectedIndex(n10);
                    }
                    if ((object4 = ((CartEntry)object2).getProduct()) != null) {
                        string3 = ((Product)object4).getBrandName();
                    }
                    if (string3 == null || (n14 = string3.length()) == 0 || product == null) continue;
                    string3 = ((CartEntry)object2).getProduct().getBrandName();
                    product.setBrandName(string3);
                }
            }
        }
        return quickViewProduct;
    }

    public final void sendCartItemRemovedEvent(CartEntry serializable) {
        if (serializable != null) {
            Object object = serializable.getProduct();
            Object object2 = INSTANCE.getAggregateProductRating((CartEntry)serializable);
            ((Product)object).setAggregateRating((String)object2);
            object = el1_2.a;
            serializable = serializable.getProduct();
            Intrinsics.checkNotNullExpressionValue(serializable, "getProduct(...)");
            object = "product";
            Intrinsics.checkNotNullParameter(serializable, (String)object);
            boolean bl2 = el1_2.j();
            if (bl2) {
                object = el1_2.b;
                object2 = new sl1_1((Product)serializable, null);
                int n3 = 3;
                Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
            }
        }
    }

    public final void sendOosEvents(List object) {
        boolean bl2;
        Object object2 = "oosProducts";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2;
            String string3;
            Object object3;
            Object object4;
            object2 = (CartEntry)object.next();
            Object object5 = ((CartEntry)object2).getProduct();
            if (object5 == null) continue;
            object5 = ((CartEntry)object2).getProduct().getBaseOptions();
            String string4 = "";
            if (object5 != null) {
                Object object6 = object5;
                object6 = (Collection)object5;
                int n3 = object6.size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    boolean bl3;
                    object4 = (ProductOption)object5.get(i3);
                    if (object4 == null || !(bl3 = Intrinsics.areEqual(object3 = hv3_0.K(R$string.size_variant_option), string3 = ((ProductOption)object4).getVariantType())) || (object4 = ((ProductOption)object4).getSelected()) == null || (object4 = ((ProductOptionItem)object4).getVariantOptionQualifiers()) == null) continue;
                    object4 = object4.iterator();
                    while (bl3 = object4.hasNext()) {
                        object3 = (ProductOptionVariant)object4.next();
                        string3 = hv3_0.K(R$string.size_variant_name);
                        boolean bl4 = Intrinsics.areEqual(string3, string2 = ((ProductOptionVariant)object3).getName());
                        if (!bl4) continue;
                        string4 = ((ProductOptionVariant)object3).getValue();
                    }
                }
            }
            string3 = string4;
            object5 = ((CartEntry)object2).getProduct();
            if (object5 == null || (object5 = ((CartEntry)object2).getProduct().getCode()) == null) continue;
            object5 = AnalyticsManager.Companion.getInstance();
            object4 = ((AnalyticsManager)object5).getGa();
            object3 = ((CartEntry)object2).getProduct();
            object2 = ((CartEntry)object2).getProduct();
            String string5 = ((Product)object2).getCode();
            Intrinsics.checkNotNull(string5);
            String string6 = "bag screen";
            string2 = "inventory";
            String string7 = "outOfStock";
            ((GoogleAnalyticsEvents)object4).pushOOSCustomDimension((Product)object3, string4, string2, string7, string5, string6);
        }
    }

    public final String sendRTBAndCriteoEvents(Cart object) {
        int n3;
        Object object2;
        if (object != null) {
            object2 = ((Cart)object).getEntries();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (n3 = object2.isEmpty()) == 0) {
            String string2;
            n3 = com.ril.mp.services.R$string.rtb_url_cart_page;
            object2 = hv3_0.K(n3);
            Intrinsics.checkNotNull(object);
            object = ((Cart)object).getEntries();
            Intrinsics.checkNotNull(object);
            object = ((ArrayList)object).iterator();
            Object object3 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            while (true) {
                int n4;
                int n7;
                int n8 = object.hasNext();
                StringBuilder stringBuilder = null;
                string2 = "substring(...)";
                if (n8 == 0) break;
                object3 = (CartEntry)object.next();
                Object object4 = ((CartEntry)object3).getProduct();
                if (object4 != null) {
                    object4 = ((Product)object4).getBaseProduct();
                } else {
                    n7 = 0;
                    object4 = null;
                }
                if (object4 == null || (n7 = ((String)object4).length()) == 0 || (object4 = ((CartEntry)object3).getBasePrice()) == null) continue;
                object4 = ((CartEntry)object3).getProduct().getBaseProduct();
                Intrinsics.checkNotNull(object4);
                char c2 = '_';
                int n10 = 6;
                n7 = StringsKt.N((CharSequence)object4, c2, 0, false, n10);
                if (n7 == (n4 = -1)) continue;
                object4 = ((CartEntry)object3).getProduct().getBaseProduct();
                Intrinsics.checkNotNull(object4);
                object3 = ((CartEntry)object3).getProduct().getBaseProduct();
                Intrinsics.checkNotNull(object3);
                n8 = StringsKt.N((CharSequence)object3, c2, 0, false, n10);
                object3 = ((String)object4).substring(0, n8);
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object2);
                stringBuilder.append((String)object3);
                stringBuilder.append(",");
                object2 = stringBuilder.toString();
            }
            int n14 = ((String)object2).length() + -1;
            object = ((String)object2).substring(0, n14);
            Intrinsics.checkNotNullExpressionValue(object, string2);
        } else {
            object = "";
        }
        return object;
    }

    public final boolean updateCartData(Cart serializable, UpdateCartEntry object, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(object, "updateCartEntry");
        Intrinsics.checkNotNullParameter(arrayList, "lowStockList");
        Intrinsics.checkNotNullParameter(arrayList2, "oosList");
        ArrayList arrayList3 = null;
        if (serializable != null) {
            boolean bl2;
            block12: {
                int n3;
                String string2;
                Object object2 = ((UpdateCartEntry)object).getStatusCode();
                boolean n4 = b.i((String)object2, string2 = "lowStock", bl2 = true);
                if (n4) {
                    object2 = ((Cart)serializable).getLowStockCartEntries();
                    boolean bl3 = ((ArrayList)object2).isEmpty();
                    if (bl3) {
                        arrayList3 = ((Cart)serializable).getLowStockCartEntries();
                        object = ((UpdateCartEntry)object).getEntry();
                        arrayList3.add(object);
                    } else {
                        object2 = ((Cart)serializable).getLowStockCartEntries();
                        int n7 = ((ArrayList)object2).size();
                        for (n3 = 0; n3 < n7; ++n3) {
                            String string3;
                            boolean bl4;
                            string2 = ((CartEntry)((Cart)serializable).getLowStockCartEntries().get(n3)).getProduct().getCode();
                            if (string2 == null || (bl4 = string2.equalsIgnoreCase(string3 = ((UpdateCartEntry)object).getEntry().getProduct().getCode())) != bl2) {
                                continue;
                            }
                            break block12;
                        }
                        arrayList3 = ((Cart)serializable).getLowStockCartEntries();
                        object = ((UpdateCartEntry)object).getEntry();
                        arrayList3.add(object);
                    }
                } else {
                    object2 = ((UpdateCartEntry)object).getStatusCode();
                    boolean bl5 = b.i((String)object2, string2 = "outOfStock", bl2);
                    if (bl5) {
                        object2 = ((Cart)serializable).getOosCartEntries();
                        boolean bl6 = ((ArrayList)object2).isEmpty();
                        if (bl6) {
                            arrayList3 = ((Cart)serializable).getOosCartEntries();
                            object = ((UpdateCartEntry)object).getEntry();
                            arrayList3.add(object);
                        } else {
                            object2 = ((Cart)serializable).getOosCartEntries();
                            int n8 = ((ArrayList)object2).size();
                            while (n3 < n8) {
                                String string4;
                                boolean bl7;
                                string2 = ((CartEntry)((Cart)serializable).getOosCartEntries().get(n3)).getProduct().getCode();
                                if (string2 == null || (bl7 = string2.equalsIgnoreCase(string4 = ((UpdateCartEntry)object).getEntry().getProduct().getCode())) != bl2) {
                                    ++n3;
                                    continue;
                                }
                                break block12;
                            }
                            arrayList3 = ((Cart)serializable).getOosCartEntries();
                            object = ((UpdateCartEntry)object).getEntry();
                            arrayList3.add(object);
                        }
                    }
                }
            }
            arrayList.clear();
            object = ((Cart)serializable).getLowStockCartEntries();
            arrayList.addAll(object);
            arrayList2.clear();
            serializable = ((Cart)serializable).getOosCartEntries();
            arrayList2.addAll(serializable);
            return bl2;
        }
        return false;
    }
}

