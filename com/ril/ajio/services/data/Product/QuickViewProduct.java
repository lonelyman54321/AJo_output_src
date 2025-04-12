/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.b;

public final class QuickViewProduct
implements Serializable {
    private List products;
    private int selectedIndex = -1;

    public QuickViewProduct() {
        ArrayList arrayList;
        this.products = arrayList = new ArrayList();
    }

    public final List getProducts() {
        return this.products;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final void setCartImages() {
        Object object = this.products;
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                int n3;
                Collection collection;
                Product product = (Product)object.next();
                ArrayList<Object> arrayList = new ArrayList<Object>();
                int n4 = 0;
                IntRange intRange = null;
                if (product != null) {
                    collection = product.getImages();
                } else {
                    n3 = 0;
                    collection = null;
                }
                if (collection != null) {
                    collection = product.getImages();
                    Intrinsics.checkNotNull(collection);
                    collection = collection;
                    n3 = collection.isEmpty();
                    int n7 = 1;
                    if ((n3 ^= n7) != 0) {
                        collection = product.getImages();
                        if (collection != null) {
                            intRange = xx_2.g(collection);
                        }
                        Intrinsics.checkNotNull(intRange);
                        n3 = intRange.a;
                        n4 = intRange.b;
                        if (n3 <= n4) {
                            while (true) {
                                Object object2 = product.getImages();
                                Intrinsics.checkNotNull(object2);
                                object2 = (ProductImage)object2.get(n3);
                                String string2 = ((ProductImage)object2).getFormat();
                                String string3 = "product";
                                boolean bl3 = b.i(string2, string3, n7 != 0);
                                if (bl3 && (bl3 = b.i(string2 = ((ProductImage)object2).getImageType(), string3 = "Gallery", n7 != 0))) {
                                    arrayList.add(object2);
                                }
                                if (n3 == n4) break;
                                ++n3;
                            }
                        }
                    }
                }
                if (product == null) continue;
                product.setImages(arrayList);
            }
        }
    }

    public final void setProducts(List list) {
        this.products = list;
    }

    public final void setSelectedIndex(int n3) {
        this.selectedIndex = n3;
    }
}

