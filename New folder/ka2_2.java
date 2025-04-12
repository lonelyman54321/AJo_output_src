/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from KA2
 */
public final class ka2_2 {
    public static final ja2_2 a(CartEntry object) {
        int n3;
        boolean n4 = false;
        Object object2 = null;
        ja2_2 ja2_22 = new ja2_2(0);
        Object object3 = null;
        if (object != null && (object = ((CartEntry)object).getProduct()) != null) {
            object = ((Product)object).getBaseOptions();
        } else {
            n3 = 0;
            object = null;
        }
        Intrinsics.checkNotNull(object);
        if (object != null) {
            boolean bl2;
            boolean bl3;
            String string2;
            int n7;
            Object object4;
            Object object5;
            int n8;
            Object object6;
            int n10;
            Object object7;
            Object object8;
            Object object9;
            boolean bl4;
            object = ((Iterable)object).iterator();
            int n14 = 0;
            Object object10 = null;
            boolean bl5 = false;
            Object object11 = null;
            while (bl4 = object.hasNext()) {
                object9 = (ProductOption)object.next();
                object8 = hv3_0.K(R$string.size_variant_option);
                n10 = (int)(Intrinsics.areEqual(object8, object7 = ((ProductOption)object9).getVariantType()) ? 1 : 0);
                if (n10 != 0) {
                    object11 = ((ProductOption)object9).getSelected();
                    if (object11 != null) {
                        object11 = ((ProductOptionItem)object11).getVariantOptionQualifiers();
                    } else {
                        bl5 = false;
                        object11 = null;
                    }
                }
                if ((n10 = (int)(Intrinsics.areEqual(object8 = hv3_0.K(R$string.color_variant_option), object7 = ((ProductOption)object9).getVariantType()) ? 1 : 0)) == 0) continue;
                object10 = ((ProductOption)object9).getSelected();
                if (object10 != null) {
                    object10 = ((ProductOptionItem)object10).getVariantOptionQualifiers();
                    continue;
                }
                n14 = 0;
                object10 = null;
            }
            n3 = 1;
            object9 = "";
            if (object10 != null) {
                object8 = object10;
                object8 = ((Iterable)object10).iterator();
                object7 = object9;
                object6 = object9;
                while ((n8 = object8.hasNext()) != 0) {
                    String string3;
                    object5 = (ProductOptionVariant)object8.next();
                    object4 = ((ProductOptionVariant)object5).getQualifier();
                    n7 = b.i((String)object4, "selection2", n3 != 0);
                    string2 = "null";
                    if (n7 != 0 && (object4 = ((ProductOptionVariant)object5).getValue()) != null && (n7 = ((String)object4).length()) != 0 && (n7 = (int)(b.i((String)(object4 = ((ProductOptionVariant)object5).getValue()), string2, n3 != 0) ? 1 : 0)) == 0) {
                        object6 = ((ProductOptionVariant)object5).getValue();
                        Intrinsics.checkNotNull(object6);
                    }
                    if ((n7 = (int)(b.i((String)(object4 = ((ProductOptionVariant)object5).getQualifier()), string3 = "selection1", n3 != 0) ? 1 : 0)) == 0 || (object4 = ((ProductOptionVariant)object5).getValue()) == null || (n7 = ((String)object4).length()) == 0 || (n7 = (int)(b.i((String)(object4 = ((ProductOptionVariant)object5).getValue()), string2, n3 != 0) ? 1 : 0)) != 0) continue;
                    object7 = ((ProductOptionVariant)object5).getValue();
                    Intrinsics.checkNotNull(object7);
                }
            } else {
                object7 = object9;
                object6 = object9;
            }
            if ((n10 = ((String)object7).length()) > 0 && (n10 = (int)(((String)object7).equalsIgnoreCase((String)(object8 = "color")) ? 1 : 0)) == 0) {
                object8 = object7;
            } else {
                n10 = 0;
                object8 = null;
            }
            if (object8 != null && (n8 = ((String)object8).length()) != 0 && object10 != null) {
                object10 = ((Iterable)object10).iterator();
                n8 = 0;
                object5 = null;
                while ((n7 = object10.hasNext()) != 0) {
                    object4 = (ProductOptionVariant)object10.next();
                    string2 = ((ProductOptionVariant)object4).getQualifier();
                    boolean bl6 = b.i(string2, (String)object8, n3 != 0);
                    if (!bl6) continue;
                    object5 = ((ProductOptionVariant)object4).getValue();
                }
            } else {
                n8 = 0;
                object5 = null;
            }
            if ((n14 = ((String)object7).length()) == 0 && (n14 = ((String)object6).length()) == 0) {
                bl3 = true;
            }
            n14 = bl3 ^ 1;
            n10 = ((String)object6).length();
            object7 = "size";
            if (n10 == 0) {
                object6 = object7;
            } else {
                n10 = (int)(((String)object6).equalsIgnoreCase((String)object7) ? 1 : 0);
                if (n10 != 0) {
                    bl2 = true;
                }
            }
            int n15 = bl2 ^ n3;
            ja2_22.b = n15;
            if (object11 != null) {
                object11 = (Iterable)object11;
                object2 = object11.iterator();
                while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    object8 = (ProductOptionVariant)object2.next();
                    object4 = ((ProductOptionVariant)object8).getQualifier();
                    n7 = (int)(b.i((String)object4, (String)object7, n3 != 0) ? 1 : 0);
                    if (n7 == 0) continue;
                    ja2_22.c = object8 = ((ProductOptionVariant)object8).getValue();
                }
                boolean bl7 = ((String)object6).equalsIgnoreCase((String)object7);
                if (!bl7) {
                    object2 = object11.iterator();
                    while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        object8 = (ProductOptionVariant)object2.next();
                        object7 = ((ProductOptionVariant)object8).getQualifier();
                        boolean bl8 = b.i((String)object7, (String)object6, n3 != 0);
                        if (!bl8 || (object3 = ((ProductOptionVariant)object8).getValue()) != null) continue;
                        object3 = object9;
                    }
                    object2 = object11.iterator();
                    while (bl5 = object2.hasNext()) {
                        object11 = (ProductOptionVariant)object2.next();
                        object9 = ((ProductOptionVariant)object11).getQualifier();
                        bl4 = b.i((String)object9, (String)(object8 = "uom"), n3 != 0);
                        if (!bl4) continue;
                        object11 = ((ProductOptionVariant)object11).getValue();
                        object9 = " ";
                        object3 = nb0_0.a((String)object3, (String)object9, (String)object11);
                    }
                }
            }
            if (n14 != 0 && (object5 != null && (n3 = ((String)object5).length()) != 0 || object3 != null && (n3 = ((String)object3).length()) != 0)) {
                if (object5 != null && (n3 = ((String)object5).length()) != 0 && object3 != null && (n3 = ((String)object3).length()) != 0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(object5);
                    object2 = " | ";
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append(object3);
                    object5 = ((StringBuilder)object).toString();
                } else if (object5 == null || (n3 = ((String)object5).length()) == 0) {
                    object5 = object3;
                }
                ja2_22.a = object5;
            }
            if (object3 != null && (n3 = ((String)object3).length()) != 0) {
                ja2_22.c = object3;
            }
        }
        return ja2_22;
    }
}

