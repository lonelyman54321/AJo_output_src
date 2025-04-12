/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
import android.widget.TextView;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class Y63 {
    public static final String a(CartEntry object) {
        Intrinsics.checkNotNullParameter(object, "cartEntry");
        object = ((CartEntry)object).getProduct().getBaseOptions();
        Object object2 = "";
        if (object != null) {
            int n3;
            boolean bl2;
            String string2;
            Object object3;
            Object object4;
            int n4;
            Iterator iterator = object;
            iterator = (Collection)object;
            int n7 = iterator.size();
            boolean bl3 = false;
            Object object5 = null;
            boolean bl4 = false;
            Object object6 = null;
            Object object7 = null;
            Object object8 = null;
            Object object9 = null;
            for (n4 = 0; n4 < n7; ++n4) {
                object4 = (ProductOption)object.get(n4);
                object3 = hv3_0.K(R$string.size_variant_option);
                bl2 = Intrinsics.areEqual(object3, string2 = ((ProductOption)object4).getVariantType());
                if (bl2) {
                    object8 = ((ProductOption)object4).getSelected();
                    object8 = object8 != null ? ((ProductOptionItem)object8).getVariantOptionQualifiers() : null;
                }
                if (!(bl2 = Intrinsics.areEqual(object3 = hv3_0.K(R$string.color_variant_option), string2 = ((ProductOption)object4).getVariantType()))) continue;
                object7 = ((ProductOption)object4).getSelected();
                object7 = object7 != null ? ((ProductOptionItem)object7).getVariantOptionQualifiers() : null;
            }
            boolean bl5 = true;
            if (object7 != null) {
                iterator = object7.iterator();
                object9 = object2;
                object4 = object2;
                while (bl2 = iterator.hasNext()) {
                    String string3;
                    object3 = (ProductOptionVariant)iterator.next();
                    string2 = ((ProductOptionVariant)object3).getQualifier();
                    n3 = b.i(string2, "selection2", bl5);
                    String string4 = "null";
                    if (n3 != 0 && (string2 = ((ProductOptionVariant)object3).getValue()) != null && (n3 = string2.length()) != 0 && (n3 = (int)(b.i(string2 = ((ProductOptionVariant)object3).getValue(), string4, bl5) ? 1 : 0)) == 0) {
                        object4 = ((ProductOptionVariant)object3).getValue();
                        Intrinsics.checkNotNull(object4);
                    }
                    if ((n3 = (int)(b.i(string2 = ((ProductOptionVariant)object3).getQualifier(), string3 = "selection1", bl5) ? 1 : 0)) == 0 || (string2 = ((ProductOptionVariant)object3).getValue()) == null || (n3 = string2.length()) == 0 || (n3 = (int)(b.i(string2 = ((ProductOptionVariant)object3).getValue(), string4, bl5) ? 1 : 0)) != 0) continue;
                    object9 = ((ProductOptionVariant)object3).getValue();
                    Intrinsics.checkNotNull(object9);
                }
            } else {
                object9 = object2;
                object4 = object2;
            }
            if ((n7 = object9.length()) > 0 && (n7 = (int)(b.i((String)object9, (String)((Object)(iterator = "color")), bl5) ? 1 : 0)) == 0) {
                object6 = object9;
            }
            if (object6 != null && (n7 = object6.length()) != 0 && object7 != null) {
                iterator = object7.iterator();
                object7 = object2;
                while (bl2 = iterator.hasNext()) {
                    object3 = (ProductOptionVariant)iterator.next();
                    string2 = ((ProductOptionVariant)object3).getQualifier();
                    n3 = (int)(b.i(string2, (String)object6, bl5) ? 1 : 0);
                    if (n3 == 0) continue;
                    object7 = ((ProductOptionVariant)object3).getValue();
                }
            } else {
                object7 = object2;
            }
            if ((n7 = object9.length()) == 0 && (n7 = object4.length()) == 0) {
                bl3 = true;
            }
            n7 = object4.length();
            object6 = "size";
            if (n7 == 0) {
                object4 = object6;
            } else {
                n7 = (int)(b.i((String)object4, (String)object6, bl5) ? 1 : 0);
                if (n7 != 0) {
                    bl3 = true;
                }
            }
            if (!bl3 && object8 != null) {
                iterator = object8.iterator();
                block3: while (true) {
                    object5 = object2;
                    while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        object9 = (ProductOptionVariant)iterator.next();
                        object3 = ((ProductOptionVariant)object9).getQualifier();
                        bl2 = b.i((String)object3, (String)object4, bl5);
                        if (!bl2 || (object5 = ((ProductOptionVariant)object9).getValue()) != null) continue;
                        continue block3;
                    }
                    break;
                }
                n7 = (int)(b.i((String)object4, (String)object6, bl5) ? 1 : 0);
                if (n7 == 0) {
                    iterator = object8.iterator();
                    while (bl4 = iterator.hasNext()) {
                        object6 = (ProductOptionVariant)iterator.next();
                        object9 = ((ProductOptionVariant)object6).getQualifier();
                        n4 = (int)(b.i((String)object9, (String)(object8 = "uom"), bl5) ? 1 : 0);
                        if (n4 == 0 || (object5 = n1.a((String)object5, (String)(object9 = " "), (String)(object6 = ((ProductOptionVariant)object6).getValue()))) != null) continue;
                        object5 = object2;
                    }
                }
            } else {
                object5 = object2;
            }
            if (object7 != null && (bl5 = object7.length()) || (bl5 = object5.length())) {
                object2 = object7 != null && (bl5 = object7.length()) && (bl5 = object5.length()) ? (object = n1.a((String)object7, " | ", (String)object5)) : (object7 != null && (bl5 = object7.length()) ? object7 : object5);
            }
        }
        return object2;
    }

    public static final String b(ProductOptionVariant object) {
        Intrinsics.checkNotNullParameter(object, "productOptionVariant");
        String string2 = Y63.e(((ProductOptionVariant)object).getBrandSizeFormat());
        int n3 = string2.length();
        if (n3 == 0) {
            return ((ProductOptionVariant)object).getBrandValue();
        }
        string2 = ((ProductOptionVariant)object).getBrandValue();
        if (string2 != null && (n3 = string2.length()) != 0) {
            string2 = ((ProductOptionVariant)object).getBrandSizeFormat();
            object = ((ProductOptionVariant)object).getBrandValue();
            return n1.a(string2, " ", (String)object);
        }
        return "";
    }

    public static final String c(ProductOptionVariant object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "productOptionVariant");
        String string2 = ((ProductOptionVariant)object).getUniversalSizeValue();
        if (string2 != null && (n3 = string2.length()) != 0) {
            string2 = Y63.e(((ProductOptionVariant)object).getUniversalSizeFormat());
            n3 = string2.length();
            if (n3 == 0) {
                return ((ProductOptionVariant)object).getUniversalSizeValue();
            }
            string2 = ((ProductOptionVariant)object).getUniversalSizeFormat();
            object = ((ProductOptionVariant)object).getUniversalSizeValue();
            return n1.a(string2, " ", (String)object);
        }
        return ((ProductOptionVariant)object).getBrandValue();
    }

    /*
     * Unable to fully structure code
     */
    public static final String d(CartEntry var0) {
        var1_1 = "cartEntry";
        Intrinsics.checkNotNullParameter(var0, (String)var1_1);
        var0 = var0.getProduct().getBaseOptions();
        if (var0 == null) ** GOTO lbl-1000
        var1_1 = var0;
        var1_1 = (Collection)var0;
        var2_2 = var1_1.size();
        var3_3 = 0;
        var4_4 = null;
        var6_6 = null;
        var7_7 = false;
        var8_8 = null;
        for (var5_5 = 0; var5_5 < var2_2; ++var5_5) {
            var9_9 = (ProductOption)var0.get(var5_5);
            var10_10 = hv3_0.K(R$string.color_variant_option);
            var12_12 = Intrinsics.areEqual(var10_10, var11_11 = var9_9.getVariantType());
            if (!var12_12) continue;
            var8_8 = var9_9.getSelected();
            if (var8_8 != null) {
                var8_8 = var8_8.getVariantOptionQualifiers();
                continue;
            }
            var7_7 = false;
            var8_8 = null;
        }
        if (var8_8 != null) {
            var0 = var8_8.iterator();
            while ((var2_2 = (int)var0.hasNext()) != 0) {
                var1_1 = (ProductOptionVariant)var0.next();
                var4_4 = var1_1.getQualifier();
                var3_3 = b.i(var4_4, var6_6 = "selection2", var7_7 = true);
                if (var3_3 == 0 || (var4_4 = var1_1.getValue()) == null || (var3_3 = var4_4.length()) == 0) continue;
                var0 = var1_1.getValue();
                Intrinsics.checkNotNull(var0);
                break;
            }
        } else lbl-1000:
        // 3 sources

        {
            var0 = "";
        }
        if (var0 == null || (var2_2 = var0.length()) == 0 || (var2_2 = (int)(var1_1 = "size").equalsIgnoreCase((String)var0)) != 0) {
            var0 = "null";
        }
        return var0;
    }

    public static final String e(String string2) {
        String string3 = "UNI";
        int n3 = b.i(string2, string3, false);
        if (n3 != 0 || string2 == null || (n3 = string2.length()) == 0) {
            string2 = "";
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String f(ProductOptionVariant object) {
        String string2 = "productOptionVariant";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = hv3_0.Y();
        int n4 = 32;
        int n7 = 0;
        String string3 = null;
        int n8 = 1;
        if (n3 != 0) {
            string2 = ((ProductOptionVariant)object).getUniversalSizeValue();
            if (string2 == null) return ((ProductOptionVariant)object).getBrandValue();
            n3 = string2.length();
            if (n3 == 0) return ((ProductOptionVariant)object).getBrandValue();
            string2 = ((ProductOptionVariant)object).getSizeDisplayType();
            if (string2 != null && (n3 = string2.length()) != 0) {
                String string4;
                string2 = ((ProductOptionVariant)object).getSizeDisplayType();
                n3 = (int)(b.i(string2, string4 = "STANDARD", false) ? 1 : 0);
                if (n3 == 0) return ((ProductOptionVariant)object).getBrandValue();
                return ((ProductOptionVariant)object).getUniversalSizeValue();
            }
            if ((object = ((ProductOptionVariant)object).getValue()) == null) return string3;
            n3 = ((String)object).length() - n8;
            n7 = 0;
            string3 = null;
            boolean bl2 = false;
            while (n7 <= n3) {
                int n10 = !bl2 ? n7 : n3;
                n10 = Intrinsics.compare(((String)object).charAt(n10), n4);
                n10 = n10 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n10 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n7;
                    continue;
                }
                if (n10 == 0) break;
                n3 += -1;
            }
            string3 = a.a(n3, n8, n7, (String)object);
            return string3;
        }
        if ((object = ((ProductOptionVariant)object).getValue()) == null) return string3;
        n3 = ((String)object).length() - n8;
        n7 = 0;
        string3 = null;
        boolean bl3 = false;
        while (n7 <= n3) {
            int n14 = !bl3 ? n7 : n3;
            n14 = Intrinsics.compare(((String)object).charAt(n14), n4);
            n14 = n14 <= 0 ? 1 : 0;
            if (!bl3) {
                if (n14 == 0) {
                    bl3 = true;
                    continue;
                }
                ++n7;
                continue;
            }
            if (n14 == 0) return a.a(n3, n8, n7, (String)object);
            n3 += -1;
        }
        return a.a(n3, n8, n7, (String)object);
    }

    /*
     * Unable to fully structure code
     */
    public static final void g(Product var0) {
        block31: {
            var1_1 = var0;
            if (var0 == null || !(var2_2 = hv3_0.Y())) break block31;
            new ArrayList<E>();
            new ArrayList<E>();
            var3_3 = var0.getBaseOptions();
            if (var3_3 == null) break block31;
            var3_3 = var3_3.iterator();
            while (var4_4 = var3_3.hasNext()) {
                block33: {
                    block32: {
                        var5_5 = (ProductOption)var3_3.next();
                        var6_6 = var5_5.getVariantType();
                        var8_8 = Intrinsics.areEqual(var6_6, var7_7 = "FnlSizeVariant");
                        if (var8_8 == 0 || (var5_5 = var5_5.getSelected()) == null || (var6_6 = var5_5.getVariantOptionQualifiers()) == null) continue;
                        new ArrayList<E>();
                        var7_7 = var6_6;
                        var7_7 = (Collection)var6_6;
                        var9_9 = var7_7.size();
                        var10_10 = "";
                        var11_11 = var10_10;
                        var12_12 = var10_10;
                        var13_13 = var10_10;
                        var14_14 = var10_10;
                        var15_15 = var10_10;
                        var16_16 = 0;
                        while (true) {
                            var17_17 = 1;
                            if (var16_16 >= var9_9) break;
                            var18_18 = (ProductOptionVariant)var6_6.get(var16_16);
                            var19_19 = var18_18.getQualifier();
                            if (var19_19 != null && (var21_21 = var19_19.equalsIgnoreCase(var20_20 = "sizeDisplayType")) == var17_17) {
                                var11_11 = var20_20 = var18_18.getValue();
                            }
                            if ((var20_20 = var18_18.getQualifier()) != null && (var21_21 = var20_20.equalsIgnoreCase(var19_19 = "sizeFormat")) == var17_17) {
                                var14_14 = var20_20 = Y63.e(var18_18.getValue());
                            }
                            if ((var20_20 = var18_18.getQualifier()) != null && (var21_21 = var20_20.equalsIgnoreCase(var19_19 = "size")) == var17_17) {
                                var10_10 = var18_18.getValue();
                            }
                            if ((var20_20 = var18_18.getQualifier()) != null && (var21_21 = var20_20.equalsIgnoreCase(var19_19 = "brandSize")) == var17_17) {
                                var13_13 = var20_20 = var18_18.getValue();
                            }
                            if ((var20_20 = var18_18.getQualifier()) != null && (var21_21 = var20_20.equalsIgnoreCase(var19_19 = "universalSize")) == var17_17) {
                                var12_12 = var20_20 = var18_18.getValue();
                            }
                            if ((var20_20 = var18_18.getQualifier()) != null && (var21_21 = var20_20.equalsIgnoreCase(var19_19 = "standardSizeFormat")) == var17_17) {
                                var15_15 = var20_20 = Y63.e(var18_18.getValue());
                            }
                            ++var16_16;
                        }
                        var6_6 = var5_5.getStock();
                        var22_22 = 0x3FFFFFF;
                        var7_7 = new ProductOptionVariant(null, null, null, null, null, null, false, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var22_22, null);
                        var7_7.setValue((String)var10_10);
                        if (var6_6 == null) ** GOTO lbl-1000
                        if ((var6_6 = var6_6.getStockLevel()) != null) {
                            var8_8 = var6_6.intValue();
                        } else {
                            var8_8 = 0;
                            var6_6 = null;
                        }
                        if (var8_8 > 0) {
                            var8_8 = 1;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var8_8 = 0;
                            var6_6 = null;
                        }
                        var7_7.setStockAvailable((boolean)var8_8);
                        var6_6 = "BRAND";
                        var8_8 = (int)b.i(var11_11, (String)var6_6, (boolean)var17_17);
                        if (var8_8 != 0) {
                            if (var13_13 != null && (var8_8 = var13_13.length()) != 0) {
                                var8_8 = 0;
                                var6_6 = null;
                            } else {
                                var8_8 = 1;
                            }
                            if (var8_8 == 0) {
                                var7_7.setBrandValue(var13_13);
                            } else {
                                var7_7.setBrandValue((String)var10_10);
                            }
                        } else {
                            var6_6 = "STANDARD";
                            var8_8 = (int)b.i(var11_11, (String)var6_6, (boolean)var17_17);
                            if (var8_8 != 0) {
                                var7_7.setUniversalSizeValue(var12_12);
                                if (var13_13 != null && (var8_8 = var13_13.length()) != 0) {
                                    var8_8 = 0;
                                    var6_6 = null;
                                } else {
                                    var8_8 = 1;
                                }
                                if (var8_8 == 0) {
                                    var7_7.setBrandValue(var13_13);
                                } else {
                                    var7_7.setBrandValue((String)var10_10);
                                }
                            } else {
                                var6_6 = var7_7.getValue();
                                var7_7.setBrandValue((String)var6_6);
                            }
                        }
                        var7_7.setSizeDisplayType(var11_11);
                        var7_7.setBrandSizeFormat(var14_14);
                        var7_7.setUniversalSizeFormat(var15_15);
                        var6_6 = var5_5.getStock();
                        if (var6_6 == null) break block32;
                        var10_10 = var6_6.getStockLevel();
                        if (var10_10 != null) {
                            var23_23 = var10_10.intValue();
                        } else {
                            var23_23 = 0;
                            var10_10 = null;
                        }
                        if (var23_23 > 0) break block33;
                    }
                    var17_17 = 0;
                }
                var7_7.setStockAvailable((boolean)var17_17);
                if (var6_6 != null && (var6_6 = var6_6.getStockLevel()) != null) {
                    var21_21 = var6_6.intValue();
                } else {
                    var21_21 = 0;
                    var20_20 = null;
                }
                var7_7.setStockLevel(var21_21);
                var6_6 = var5_5.getCode();
                var7_7.setCode((String)var6_6);
                var6_6 = var5_5.getPriceData();
                var7_7.setPriceData((Price)var6_6);
                var6_6 = var5_5.getWasPriceData();
                var7_7.setWasPriceData((Price)var6_6);
                var5_5.setVariantOptionSizeQualifier((ProductOptionVariant)var7_7);
                var1_1.setSelectedSizeVariant((ProductOptionVariant)var7_7);
            }
        }
    }

    public static final void h(TextView textView, ProductOptionVariant object) {
        String string2 = "productOptionVariant";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(textView, "sizeUnitTv");
        Intrinsics.checkNotNullParameter(object, string2);
        string2 = ((ProductOptionVariant)object).getSizeDisplayType();
        String string3 = "STANDARD";
        boolean bl2 = true;
        int n3 = b.i(string2, string3, bl2);
        object = n3 != 0 ? ((ProductOptionVariant)object).getUniversalSizeFormat() : ((ProductOptionVariant)object).getBrandSizeFormat();
        if (object != null && (n3 = object.length()) != 0) {
            textView.setText((CharSequence)object);
            boolean bl3 = false;
            object = null;
            textView.setVisibility(0);
        } else {
            int n4 = 8;
            textView.setVisibility(n4);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void i(Product var0) {
        block159: {
            block168: {
                block193: {
                    block183: {
                        block160: {
                            block167: {
                                block161: {
                                    if (var0 != null && (var1_1 = var0.getProductOptionVariants()) != null) {
                                        var1_1.clear();
                                        var1_1 = Unit.a;
                                    }
                                    if (var0 == null) break block159;
                                    var2_2 = hv3_0.Y();
                                    var3_3 = "256gb";
                                    var4_4 = "4gb";
                                    var5_5 = " ";
                                    var6_6 = "";
                                    var7_7 = "32gb";
                                    var8_8 = "128gb";
                                    var9_9 = "FREESIZE";
                                    var10_10 = "OS";
                                    var11_11 = "ONESI";
                                    var12_12 = "FULLSIZE";
                                    var13_13 = "ONESIZE";
                                    var14_14 = "FS";
                                    var15_15 = "FnlSizeVariant";
                                    var16_16 = "size";
                                    if (var2_2 == 0) break block160;
                                    var1_1 = new ArrayList();
                                    new ArrayList<E>();
                                    var17_17 = var0.getBaseOptions();
                                    var18_19 = "STANDARD";
                                    var19_20 = var3_3;
                                    var3_3 = "BRAND";
                                    var20_22 = var4_4;
                                    var4_4 = "standardSizeFormat";
                                    var21_24 = var7_7;
                                    var7_7 = "universalSize";
                                    var22_26 = var8_8;
                                    var8_8 = "brandSize";
                                    var23_28 = var9_9;
                                    var9_9 = "sizeFormat";
                                    var24_30 = var10_10;
                                    var10_10 = "sizeDisplayType";
                                    if (var17_17 == null) break block161;
                                    var17_17 = var17_17.iterator();
                                    while (var25_32 = var17_17.hasNext()) {
                                        block162: {
                                            block166: {
                                                block163: {
                                                    var26_34 = (ProductOption)var17_17.next();
                                                    var27_35 = var11_11;
                                                    var11_11 = var26_34.getVariantType();
                                                    var28_37 = Intrinsics.areEqual(var11_11, var15_15);
                                                    if (var28_37 == 0) break block162;
                                                    var11_11 = var26_34.getOptions();
                                                    var26_34 = var26_34.getSelected();
                                                    if (var11_11 == null) break block163;
                                                    var11_11 = var11_11.iterator();
                                                    while (var29_38 = var11_11.hasNext()) {
                                                        block165: {
                                                            block164: {
                                                                var30_40 /* !! */  = var11_11.next();
                                                                var31_42 = var11_11;
                                                                var11_11 = var30_40 /* !! */ ;
                                                                var11_11 = (ProductOptionItem)var30_40 /* !! */ ;
                                                                var30_40 /* !! */  = var15_15;
                                                                var15_15 = var11_11.getVariantOptionQualifiers();
                                                                if (var15_15 == null) break block164;
                                                                new ArrayList<E>();
                                                                var32_43 = var15_15;
                                                                var32_43 = (Collection)var15_15;
                                                                var33_44 = var12_12;
                                                                var34_45 = var32_43.size();
                                                                var35_47 = var1_1;
                                                                var36_48 = var5_5;
                                                                var1_1 = var6_6;
                                                                var5_5 = var6_6;
                                                                var37_49 = var6_6;
                                                                var38_50 = var6_6;
                                                                var39_51 = var6_6;
                                                                var32_43 = var13_13;
                                                                var40_52 = var14_14;
                                                                var13_13 = null;
                                                                var14_14 = var6_6;
                                                                for (var41_54 = false; var41_54 < var34_45; var41_54 += var45_59) {
                                                                    var42_56 = (ProductOptionVariant)var15_15.get((int)var41_54);
                                                                    var43_57 = var34_45;
                                                                    var12_12 = var42_56.getQualifier();
                                                                    if (var12_12 != null) {
                                                                        var34_45 = var12_12.equalsIgnoreCase((String)var10_10);
                                                                        var44_58 = var15_15;
                                                                        var45_59 = true;
                                                                        if (var34_45 == var45_59) {
                                                                            var5_5 = var42_56.getValue();
                                                                        }
                                                                    } else {
                                                                        var44_58 = var15_15;
                                                                        var45_59 = true;
                                                                    }
                                                                    if ((var12_12 = var42_56.getQualifier()) != null && (var34_45 = (boolean)var12_12.equalsIgnoreCase((String)var9_9)) == var45_59) {
                                                                        var12_12 = var42_56.getValue();
                                                                        var38_50 = Y63.e((String)var12_12);
                                                                    }
                                                                    if ((var12_12 = var42_56.getQualifier()) != null && (var34_45 = (boolean)var12_12.equalsIgnoreCase((String)var16_16)) == var45_59) {
                                                                        var14_14 = var42_56.getValue();
                                                                    }
                                                                    if ((var12_12 = var42_56.getQualifier()) != null && (var34_45 = (boolean)var12_12.equalsIgnoreCase((String)var8_8)) == var45_59) {
                                                                        var1_1 = var42_56.getValue();
                                                                    }
                                                                    if ((var12_12 = var42_56.getQualifier()) != null && (var34_45 = (boolean)var12_12.equalsIgnoreCase((String)var7_7)) == var45_59) {
                                                                        var6_6 = var42_56.getValue();
                                                                    }
                                                                    if ((var12_12 = var42_56.getQualifier()) != null && (var34_45 = (boolean)var12_12.equalsIgnoreCase((String)var4_4)) == var45_59) {
                                                                        var12_12 = var42_56.getValue();
                                                                        var39_51 = Y63.e((String)var12_12);
                                                                    }
                                                                    var12_12 = Unit.a;
                                                                    var34_45 = var43_57;
                                                                    var15_15 = var44_58;
                                                                }
                                                                var12_12 = var11_11.getStock();
                                                                var42_56 = var13_13;
                                                                var43_57 = false;
                                                                var44_58 = null;
                                                                var46_61 = 0;
                                                                var47_62 = 0x3FFFFFF;
                                                                var13_13 = new ProductOptionVariant(null, null, null, null, null, null, false, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var47_62, null);
                                                                var13_13.setValue((String)var14_14);
                                                                if (var12_12 == null) ** GOTO lbl-1000
                                                                if ((var12_12 = var12_12.getStockLevel()) != null) {
                                                                    var34_45 = var12_12.intValue();
                                                                } else {
                                                                    var34_45 = false;
                                                                    var12_12 = null;
                                                                }
                                                                if (var34_45 > false) {
                                                                    var34_45 = true;
                                                                } else lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    var34_45 = false;
                                                                    var12_12 = null;
                                                                }
                                                                var13_13.setStockAvailable(var34_45);
                                                                var34_45 = true;
                                                                var45_59 = b.i((String)var5_5, (String)var3_3, var34_45);
                                                                if (var45_59) {
                                                                    if (var1_1 != null && (var48_63 = var1_1.length()) != 0) {
                                                                        var48_63 = 0;
                                                                        var6_6 = null;
                                                                    } else {
                                                                        var48_63 = 1;
                                                                    }
                                                                    if (var48_63 == 0) {
                                                                        var13_13.setBrandValue((String)var1_1);
                                                                    } else {
                                                                        var13_13.setBrandValue((String)var14_14);
                                                                    }
                                                                } else {
                                                                    var34_45 = true;
                                                                    var45_59 = b.i((String)var5_5, (String)var18_19, var34_45);
                                                                    if (var45_59) {
                                                                        var13_13.setUniversalSizeValue((String)var6_6);
                                                                        if (var1_1 != null && (var48_63 = var1_1.length()) != 0) {
                                                                            var48_63 = 0;
                                                                            var6_6 = null;
                                                                        } else {
                                                                            var48_63 = 1;
                                                                        }
                                                                        if (var48_63 == 0) {
                                                                            var13_13.setBrandValue((String)var1_1);
                                                                        } else {
                                                                            var13_13.setBrandValue((String)var14_14);
                                                                        }
                                                                    } else {
                                                                        var13_13.setBrandValue((String)var14_14);
                                                                    }
                                                                }
                                                                var13_13.setSizeDisplayType((String)var5_5);
                                                                var6_6 = var38_50;
                                                                var13_13.setBrandSizeFormat((String)var38_50);
                                                                var6_6 = var39_51;
                                                                var13_13.setUniversalSizeFormat((String)var39_51);
                                                                var1_1 = var11_11.getStock();
                                                                if (var1_1 == null) ** GOTO lbl-1000
                                                                var5_5 = var1_1.getStockLevel();
                                                                if (var5_5 != null) {
                                                                    var49_64 = var5_5.intValue();
                                                                } else {
                                                                    var49_64 = 0;
                                                                    var5_5 = null;
                                                                }
                                                                if (var49_64 > 0) {
                                                                    var49_64 = 1;
                                                                } else lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    var49_64 = 0;
                                                                    var5_5 = null;
                                                                }
                                                                var13_13.setStockAvailable((boolean)var49_64);
                                                                if (var1_1 != null && (var5_5 = var1_1.getStockLevel()) != null) {
                                                                    var49_64 = var5_5.intValue();
                                                                } else {
                                                                    var49_64 = 0;
                                                                    var5_5 = null;
                                                                }
                                                                var13_13.setStockLevel(var49_64);
                                                                var5_5 = var11_11.getCode();
                                                                var13_13.setCode((String)var5_5);
                                                                var5_5 = var11_11.getPriceData();
                                                                var13_13.setPriceData((Price)var5_5);
                                                                var5_5 = var11_11.getWasPriceData();
                                                                var13_13.setWasPriceData((Price)var5_5);
                                                                if (var26_34 != null && (var49_64 = (int)Intrinsics.areEqual(var5_5 = var26_34.getCode(), var6_6 = var11_11.getCode())) != 0) {
                                                                    var49_64 = 1;
                                                                } else {
                                                                    var49_64 = 0;
                                                                    var5_5 = null;
                                                                }
                                                                if (var49_64 != 0) {
                                                                    if (var1_1 != null && (var1_1 = var1_1.getStockLevel()) != null) {
                                                                        var2_2 = var1_1.intValue();
                                                                    } else {
                                                                        var2_2 = 0;
                                                                        var1_1 = null;
                                                                    }
                                                                    if (var2_2 > 0) {
                                                                        var2_2 = 1;
                                                                        var13_13.setSelected((boolean)var2_2);
                                                                    }
                                                                }
                                                                var11_11.setVariantOptionSizeQualifier((ProductOptionVariant)var13_13);
                                                                var0.getProductOptionVariants().add(var13_13);
                                                                var1_1 = var0.getProductOptionItems();
                                                                if (var1_1 != null) {
                                                                    var1_1.add(var11_11);
                                                                }
                                                                break block165;
                                                            }
                                                            var35_47 = var1_1;
                                                            var36_48 = var5_5;
                                                            var37_49 = var6_6;
                                                            var33_44 = var12_12;
                                                            var32_43 = var13_13;
                                                            var40_52 = var14_14;
                                                        }
                                                        var15_15 = var30_40 /* !! */ ;
                                                        var11_11 = var31_42;
                                                        var13_13 = var32_43;
                                                        var12_12 = var33_44;
                                                        var14_14 = var40_52;
                                                        var5_5 = var36_48;
                                                        var6_6 = var37_49;
                                                        var1_1 = var35_47;
                                                    }
                                                    var35_47 = var1_1;
                                                    var36_48 = var5_5;
                                                    var37_49 = var6_6;
                                                    var33_44 = var12_12;
                                                    var32_43 = var13_13;
                                                    var40_52 = var14_14;
                                                    var30_40 /* !! */  = var15_15;
                                                    var1_1 = Unit.a;
                                                    break block166;
                                                }
                                                var35_47 = var1_1;
                                                var36_48 = var5_5;
                                                var37_49 = var6_6;
                                                var33_44 = var12_12;
                                                var32_43 = var13_13;
                                                var40_52 = var14_14;
                                                var30_40 /* !! */  = var15_15;
                                            }
                                            var11_11 = var27_35;
                                            var15_15 = var30_40 /* !! */ ;
                                            var13_13 = var32_43;
                                            var12_12 = var33_44;
                                            var14_14 = var40_52;
                                            var5_5 = var36_48;
                                            var6_6 = var37_49;
                                            var1_1 = var35_47;
                                            continue;
                                        }
                                        var11_11 = var27_35;
                                    }
                                    var35_47 = var1_1;
                                    var36_48 = var5_5;
                                    var37_49 = var6_6;
                                    var27_35 = var11_11;
                                    var33_44 = var12_12;
                                    var32_43 = var13_13;
                                    var40_52 = var14_14;
                                    var1_1 = Unit.a;
                                    break block167;
                                }
                                var35_47 = var1_1;
                                var36_48 = var5_5;
                                var37_49 = var6_6;
                                var27_35 = var11_11;
                                var33_44 = var12_12;
                                var32_43 = var13_13;
                                var40_52 = var14_14;
                            }
                            var2_2 = var35_47.isEmpty();
                            if (var2_2 == 0 || (var1_1 = var0.getVariantOptions()) == null) break block168;
                            var1_1 = var1_1.iterator();
                            var5_5 = var37_49;
                            var6_6 = var37_49;
                            var11_11 = var37_49;
                            var12_12 = var37_49;
                            var13_13 = var37_49;
                            var14_14 = var37_49;
                            while (var45_59 = var1_1.hasNext()) {
                                block182: {
                                    block169: {
                                        block181: {
                                            block171: {
                                                block180: {
                                                    block156: {
                                                        block172: {
                                                            block173: {
                                                                block174: {
                                                                    block175: {
                                                                        block176: {
                                                                            block177: {
                                                                                block178: {
                                                                                    block179: {
                                                                                        block170: {
                                                                                            block152: {
                                                                                                var15_15 = (ProductOptionItem)var1_1.next();
                                                                                                var17_17 = var1_1;
                                                                                                var1_1 = var15_15.getVariantOptionQualifiers();
                                                                                                if (var1_1 == null) break block169;
                                                                                                var26_34 = var1_1;
                                                                                                var26_34 = (Collection)var1_1;
                                                                                                var30_40 /* !! */  = var5_5;
                                                                                                var49_64 = var26_34.size();
                                                                                                var26_34 = var11_11;
                                                                                                var11_11 = null;
                                                                                                var50_66 = var5_5;
                                                                                                var30_40 /* !! */  = var6_6;
                                                                                                var6_6 = var5_5;
                                                                                                var51_68 = var13_13;
                                                                                                var13_13 = var12_12;
                                                                                                var12_12 = var14_14;
                                                                                                var14_14 = var51_68;
                                                                                                for (var28_37 = 0; var28_37 < var49_64; var28_37 += var49_64) {
                                                                                                    block151: {
                                                                                                        block150: {
                                                                                                            var31_42 = (ProductOptionVariant)var1_1.get(var28_37);
                                                                                                            var35_47 = var1_1;
                                                                                                            var1_1 = var31_42.getQualifier();
                                                                                                            if (var1_1 == null) ** GOTO lbl310
                                                                                                            var2_2 = var1_1.equalsIgnoreCase((String)var10_10);
                                                                                                            var52_69 = var49_64;
                                                                                                            var49_64 = 1;
                                                                                                            if (var2_2 == var49_64) {
                                                                                                                var2_2 = 1;
                                                                                                            } else lbl-1000:
                                                                                                            // 2 sources

                                                                                                            {
                                                                                                                while (true) {
                                                                                                                    var2_2 = 0;
                                                                                                                    var1_1 = null;
                                                                                                                    break block150;
                                                                                                                    break;
                                                                                                                }
lbl310:
                                                                                                                // 1 sources

                                                                                                                var52_69 = var49_64;
                                                                                                                ** continue;
                                                                                                            }
                                                                                                        }
                                                                                                        if (var2_2 != 0) {
                                                                                                            var6_6 = var1_1 = var31_42.getValue();
                                                                                                        }
                                                                                                        if ((var1_1 = var31_42.getQualifier()) != null && (var2_2 = (int)var1_1.equalsIgnoreCase((String)var9_9)) == (var49_64 = 1)) {
                                                                                                            var2_2 = 1;
                                                                                                        } else {
                                                                                                            var2_2 = 0;
                                                                                                            var1_1 = null;
                                                                                                        }
                                                                                                        if (var2_2 != 0) {
                                                                                                            var1_1 = Y63.e(var31_42.getValue());
                                                                                                            var30_40 /* !! */  = var1_1;
                                                                                                        }
                                                                                                        if ((var1_1 = var31_42.getQualifier()) != null && (var2_2 = (int)var1_1.equalsIgnoreCase((String)var16_16)) == (var49_64 = 1)) {
                                                                                                            var2_2 = 1;
                                                                                                        } else {
                                                                                                            var2_2 = 0;
                                                                                                            var1_1 = null;
                                                                                                        }
                                                                                                        if (var2_2 != 0) {
                                                                                                            var13_13 = var1_1 = var31_42.getValue();
                                                                                                        }
                                                                                                        if ((var1_1 = var31_42.getQualifier()) != null && (var2_2 = (int)var1_1.equalsIgnoreCase((String)var8_8)) == (var49_64 = 1)) {
                                                                                                            var2_2 = 1;
                                                                                                        } else {
                                                                                                            var2_2 = 0;
                                                                                                            var1_1 = null;
                                                                                                        }
                                                                                                        if (var2_2 != 0) {
                                                                                                            var12_12 = var1_1 = var31_42.getValue();
                                                                                                        }
                                                                                                        if ((var1_1 = var31_42.getQualifier()) != null && (var2_2 = (int)var1_1.equalsIgnoreCase((String)var7_7)) == (var49_64 = 1)) {
                                                                                                            var2_2 = 1;
                                                                                                        } else {
                                                                                                            var2_2 = 0;
                                                                                                            var1_1 = null;
                                                                                                        }
                                                                                                        if (var2_2 != 0) {
                                                                                                            var14_14 = var1_1 = var31_42.getValue();
                                                                                                        }
                                                                                                        if ((var1_1 = var31_42.getQualifier()) == null) ** GOTO lbl353
                                                                                                        var2_2 = (int)var1_1.equalsIgnoreCase((String)var4_4);
                                                                                                        if (var2_2 == (var49_64 = 1)) {
                                                                                                            var2_2 = 1;
                                                                                                        } else lbl-1000:
                                                                                                        // 2 sources

                                                                                                        {
                                                                                                            while (true) {
                                                                                                                var2_2 = 0;
                                                                                                                var1_1 = null;
                                                                                                                break block151;
                                                                                                                break;
                                                                                                            }
lbl353:
                                                                                                            // 1 sources

                                                                                                            var49_64 = 1;
                                                                                                            ** continue;
                                                                                                        }
                                                                                                    }
                                                                                                    if (var2_2 != 0) {
                                                                                                        var26_34 = var1_1 = Y63.e(var31_42.getValue());
                                                                                                    }
                                                                                                    var1_1 = Unit.a;
                                                                                                    var1_1 = var35_47;
                                                                                                    var49_64 = var52_69;
                                                                                                }
                                                                                                var1_1 = var15_15.getStock();
                                                                                                var35_47 = var5_5;
                                                                                                var52_69 = 0;
                                                                                                var39_51 = null;
                                                                                                var42_56 = null;
                                                                                                var43_57 = false;
                                                                                                var44_58 = null;
                                                                                                var46_61 = 0x3FFFFFF;
                                                                                                var5_5 = new ProductOptionVariant(null, null, null, null, null, null, false, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var46_61, null);
                                                                                                var5_5.setValue((String)var13_13);
                                                                                                var11_11 = var5_5.getValue();
                                                                                                Intrinsics.checkNotNull(var11_11);
                                                                                                var53_70 = var11_11.length();
                                                                                                var54_71 = true;
                                                                                                var35_47 = var4_4;
                                                                                                var38_50 = var7_7;
                                                                                                var55_73 = var53_70 += -1;
                                                                                                var56_75 = 0;
                                                                                                var4_4 = null;
                                                                                                var53_70 = 0;
                                                                                                var31_42 = null;
                                                                                                block7: while (true) {
                                                                                                    var39_51 = var8_8;
                                                                                                    if (var56_75 > var55_73) break block152;
                                                                                                    var57_77 = var53_70 == 0 ? var56_75 : var55_73;
                                                                                                    var57_77 = var11_11.charAt(var57_77);
                                                                                                    var42_56 = var9_9;
                                                                                                    var58_78 = 32;
                                                                                                    if ((var57_77 = Intrinsics.compare(var57_77, var58_78)) <= 0) {
                                                                                                        var57_77 = 1;
                                                                                                    } else {
                                                                                                        var57_77 = 0;
                                                                                                        var8_8 = null;
                                                                                                    }
                                                                                                    if (var53_70 != 0) break;
                                                                                                    if (var57_77 == 0) {
                                                                                                        var8_8 = var39_51;
                                                                                                        var9_9 = var42_56;
                                                                                                        var53_70 = 1;
                                                                                                        continue;
                                                                                                    }
                                                                                                    var58_78 = 1;
                                                                                                    var56_75 += var58_78;
lbl403:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        var8_8 = var39_51;
                                                                                                        var9_9 = var42_56;
                                                                                                        continue block7;
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                var58_78 = 1;
                                                                                                if (var57_77 != 0) {
                                                                                                    var55_73 += -1;
                                                                                                    ** continue;
                                                                                                }
                                                                                                break block170;
                                                                                            }
                                                                                            var42_56 = var9_9;
                                                                                            var58_78 = 1;
                                                                                        }
                                                                                        var4_4 = a.a(var55_73, var58_78, var56_75, (String)var11_11);
                                                                                        if (var1_1 == null) ** GOTO lbl-1000
                                                                                        if ((var1_1 = var1_1.getStockLevel()) != null) {
                                                                                            var2_2 = var1_1.intValue();
                                                                                        } else {
                                                                                            var2_2 = 0;
                                                                                            var1_1 = null;
                                                                                        }
                                                                                        if (var2_2 > 0) {
                                                                                            var2_2 = 1;
                                                                                        } else lbl-1000:
                                                                                        // 2 sources

                                                                                        {
                                                                                            var2_2 = 0;
                                                                                            var1_1 = null;
                                                                                        }
                                                                                        var5_5.setStockAvailable((boolean)var2_2);
                                                                                        var2_2 = 1;
                                                                                        var55_73 = (int)b.i((String)var6_6, (String)var3_3, (boolean)var2_2);
                                                                                        if (var55_73 != 0) {
                                                                                            if (var12_12 != null && (var2_2 = var12_12.length()) != 0) {
                                                                                                var2_2 = 0;
                                                                                                var1_1 = null;
                                                                                            } else {
                                                                                                var2_2 = 1;
                                                                                            }
                                                                                            if (var2_2 == 0) {
                                                                                                block153: {
                                                                                                    var5_5.setBrandValue((String)var12_12);
                                                                                                    Intrinsics.checkNotNull(var12_12);
                                                                                                    var2_2 = var12_12.length() - 1;
                                                                                                    var56_75 = 0;
                                                                                                    var4_4 = null;
                                                                                                    var55_73 = 0;
                                                                                                    var7_7 = null;
                                                                                                    while (var56_75 <= var2_2) {
                                                                                                        var57_77 = var55_73 == 0 ? var56_75 : var2_2;
                                                                                                        var57_77 = var12_12.charAt(var57_77);
                                                                                                        var58_78 = 32;
                                                                                                        if ((var57_77 = Intrinsics.compare(var57_77, var58_78)) <= 0) {
                                                                                                            var57_77 = 1;
                                                                                                        } else {
                                                                                                            var57_77 = 0;
                                                                                                            var8_8 = null;
                                                                                                        }
                                                                                                        if (var55_73 == 0) {
                                                                                                            if (var57_77 == 0) {
                                                                                                                var55_73 = 1;
                                                                                                                continue;
                                                                                                            }
                                                                                                            var58_78 = 1;
                                                                                                            var56_75 += var58_78;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var58_78 = 1;
                                                                                                        if (var57_77 != 0) {
                                                                                                            var2_2 += -1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        break block153;
                                                                                                    }
                                                                                                    var58_78 = 1;
                                                                                                }
                                                                                                var4_4 = a.a(var2_2, var58_78, var56_75, (String)var12_12);
                                                                                            } else {
                                                                                                block154: {
                                                                                                    var58_78 = 1;
                                                                                                    var5_5.setBrandValue((String)var13_13);
                                                                                                    Intrinsics.checkNotNull(var13_13);
                                                                                                    var2_2 = var13_13.length() - var58_78;
                                                                                                    var56_75 = 0;
                                                                                                    var4_4 = null;
                                                                                                    var55_73 = 0;
                                                                                                    var7_7 = null;
                                                                                                    while (var56_75 <= var2_2) {
                                                                                                        var57_77 = var55_73 == 0 ? var56_75 : var2_2;
                                                                                                        var57_77 = var13_13.charAt(var57_77);
                                                                                                        var58_78 = 32;
                                                                                                        if ((var57_77 = Intrinsics.compare(var57_77, var58_78)) <= 0) {
                                                                                                            var57_77 = 1;
                                                                                                        } else {
                                                                                                            var57_77 = 0;
                                                                                                            var8_8 = null;
                                                                                                        }
                                                                                                        if (var55_73 == 0) {
                                                                                                            if (var57_77 == 0) {
                                                                                                                var55_73 = 1;
                                                                                                                continue;
                                                                                                            }
                                                                                                            var58_78 = 1;
                                                                                                            var56_75 += var58_78;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var58_78 = 1;
                                                                                                        if (var57_77 != 0) {
                                                                                                            var2_2 += -1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        break block154;
                                                                                                    }
                                                                                                    var58_78 = 1;
                                                                                                }
                                                                                                var4_4 = a.a(var2_2, var58_78, var56_75, (String)var13_13);
                                                                                            }
                                                                                        } else {
                                                                                            var58_78 = 1;
                                                                                            var2_2 = (int)b.i((String)var6_6, (String)var18_19, (boolean)var58_78);
                                                                                            if (var2_2 != 0) {
                                                                                                block155: {
                                                                                                    var5_5.setUniversalSizeValue((String)var14_14);
                                                                                                    Intrinsics.checkNotNull(var14_14);
                                                                                                    var2_2 = var14_14.length() - var58_78;
                                                                                                    var56_75 = 0;
                                                                                                    var4_4 = null;
                                                                                                    var55_73 = 0;
                                                                                                    var7_7 = null;
                                                                                                    while (var56_75 <= var2_2) {
                                                                                                        var57_77 = var55_73 == 0 ? var56_75 : var2_2;
                                                                                                        var57_77 = var14_14.charAt(var57_77);
                                                                                                        var58_78 = 32;
                                                                                                        if ((var57_77 = Intrinsics.compare(var57_77, var58_78)) <= 0) {
                                                                                                            var57_77 = 1;
                                                                                                        } else {
                                                                                                            var57_77 = 0;
                                                                                                            var8_8 = null;
                                                                                                        }
                                                                                                        if (var55_73 == 0) {
                                                                                                            if (var57_77 == 0) {
                                                                                                                var55_73 = 1;
                                                                                                                continue;
                                                                                                            }
                                                                                                            var58_78 = 1;
                                                                                                            var56_75 += var58_78;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var58_78 = 1;
                                                                                                        if (var57_77 != 0) {
                                                                                                            var2_2 += -1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        break block155;
                                                                                                    }
                                                                                                    var58_78 = 1;
                                                                                                }
                                                                                                var4_4 = a.a(var2_2, var58_78, var56_75, (String)var14_14);
                                                                                                if (var12_12 != null && (var2_2 = var12_12.length()) != 0) {
                                                                                                    var2_2 = 0;
                                                                                                    var1_1 = null;
                                                                                                } else {
                                                                                                    var2_2 = 1;
                                                                                                }
                                                                                                if (var2_2 == 0) {
                                                                                                    var5_5.setBrandValue((String)var12_12);
                                                                                                } else {
                                                                                                    var5_5.setBrandValue((String)var13_13);
                                                                                                }
                                                                                            } else {
                                                                                                var5_5.setBrandValue((String)var13_13);
                                                                                            }
                                                                                        }
                                                                                        var5_5.setSizeDisplayType((String)var6_6);
                                                                                        var1_1 = var30_40 /* !! */ ;
                                                                                        var5_5.setBrandSizeFormat((String)var30_40 /* !! */ );
                                                                                        var11_11 = var26_34;
                                                                                        var5_5.setUniversalSizeFormat((String)var26_34);
                                                                                        var7_7 = var15_15.getStock();
                                                                                        if (var7_7 == null) ** GOTO lbl-1000
                                                                                        var8_8 = var7_7.getStockLevel();
                                                                                        if (var8_8 != null) {
                                                                                            var57_77 = var8_8.intValue();
                                                                                        } else {
                                                                                            var57_77 = 0;
                                                                                            var8_8 = null;
                                                                                        }
                                                                                        if (var57_77 > 0) {
                                                                                            var57_77 = 1;
                                                                                        } else lbl-1000:
                                                                                        // 2 sources

                                                                                        {
                                                                                            var57_77 = 0;
                                                                                            var8_8 = null;
                                                                                        }
                                                                                        var5_5.setStockAvailable((boolean)var57_77);
                                                                                        if (var7_7 != null && (var7_7 = var7_7.getStockLevel()) != null) {
                                                                                            var55_73 = var7_7.intValue();
                                                                                        } else {
                                                                                            var55_73 = 0;
                                                                                            var7_7 = null;
                                                                                        }
                                                                                        var5_5.setStockLevel(var55_73);
                                                                                        var7_7 = var15_15.getCode();
                                                                                        var5_5.setCode((String)var7_7);
                                                                                        var7_7 = var15_15.getPriceData();
                                                                                        var5_5.setPriceData((Price)var7_7);
                                                                                        var7_7 = var15_15.getWasPriceData();
                                                                                        var5_5.setWasPriceData((Price)var7_7);
                                                                                        var7_7 = var0.getVariantOptions();
                                                                                        Intrinsics.checkNotNull(var7_7);
                                                                                        var55_73 = var7_7.size();
                                                                                        var57_77 = 1;
                                                                                        if (var55_73 == var57_77) {
                                                                                            var55_73 = 1;
                                                                                        } else {
                                                                                            var55_73 = 0;
                                                                                            var7_7 = null;
                                                                                        }
                                                                                        var26_34 = var18_19;
                                                                                        if (var55_73 == 0) break block171;
                                                                                        var9_9 = var36_48;
                                                                                        var8_8 = var37_49;
                                                                                        var4_4 = b.n((String)var4_4, (String)var36_48, (String)var37_49, false);
                                                                                        var18_19 = var40_52;
                                                                                        var55_73 = 1;
                                                                                        var54_71 = b.i((String)var4_4, (String)var40_52, (boolean)var55_73);
                                                                                        var30_40 /* !! */  = var1_1;
                                                                                        if (var54_71) break block172;
                                                                                        var1_1 = var32_43;
                                                                                        var54_71 = b.i((String)var4_4, (String)var32_43, (boolean)var55_73);
                                                                                        var31_42 = var3_3;
                                                                                        if (var54_71) break block173;
                                                                                        var3_3 = var33_44;
                                                                                        var54_71 = b.i((String)var4_4, (String)var33_44, (boolean)var55_73);
                                                                                        var32_43 = var6_6;
                                                                                        var6_6 = var27_35;
                                                                                        if (var54_71) break block174;
                                                                                        var54_71 = b.i((String)var4_4, (String)var27_35, (boolean)var55_73);
                                                                                        var27_35 = var10_10;
                                                                                        var10_10 = var24_30;
                                                                                        if (var54_71) break block175;
                                                                                        var54_71 = b.i((String)var4_4, (String)var24_30, (boolean)var55_73);
                                                                                        var24_30 = var11_11;
                                                                                        var11_11 = var23_28;
                                                                                        if (var54_71) break block176;
                                                                                        var54_71 = b.i((String)var4_4, (String)var23_28, (boolean)var55_73);
                                                                                        var23_28 = var12_12;
                                                                                        var12_12 = var22_26;
                                                                                        if (var54_71) break block177;
                                                                                        var54_71 = b.i((String)var4_4, (String)var22_26, (boolean)var55_73);
                                                                                        var22_26 = var13_13;
                                                                                        var13_13 = var21_24;
                                                                                        if (var54_71) break block178;
                                                                                        var54_71 = b.i((String)var4_4, (String)var21_24, (boolean)var55_73);
                                                                                        var21_24 = var14_14;
                                                                                        if (var54_71) break block179;
                                                                                        var14_14 = var20_22;
                                                                                        var54_71 = b.i((String)var4_4, var20_22, (boolean)var55_73);
                                                                                        var14_14 = var19_20;
                                                                                        if (var54_71 || (var56_75 = b.i((String)var4_4, (String)var19_20, (boolean)var55_73)) != 0) break block156;
                                                                                        var56_75 = 0;
                                                                                        var4_4 = null;
                                                                                        break block180;
                                                                                    }
lbl634:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var14_14 = var19_20;
                                                                                        break block156;
                                                                                        break;
                                                                                    }
                                                                                }
lbl638:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    var21_24 = var14_14;
                                                                                    ** continue;
                                                                                    break;
                                                                                }
                                                                            }
lbl642:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var22_26 = var13_13;
                                                                                var13_13 = var21_24;
                                                                                ** continue;
                                                                                break;
                                                                            }
                                                                        }
lbl647:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var23_28 = var12_12;
                                                                            var12_12 = var22_26;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                    }
lbl652:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var24_30 = var11_11;
                                                                        var11_11 = var23_28;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
lbl657:
                                                                // 3 sources

                                                                while (true) {
                                                                    var27_35 = var10_10;
                                                                    var10_10 = var24_30;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
                                                            var32_43 = var6_6;
                                                            var6_6 = var27_35;
                                                            var3_3 = var33_44;
                                                            ** GOTO lbl657
                                                        }
                                                        var31_42 = var3_3;
                                                        var1_1 = var32_43;
                                                        var3_3 = var33_44;
                                                        var32_43 = var6_6;
                                                        var6_6 = var27_35;
                                                        ** continue;
                                                    }
                                                    var56_75 = 1;
                                                }
                                                var55_73 = var56_75;
                                                break block181;
                                            }
                                            var30_40 /* !! */  = var1_1;
                                            var31_42 = var3_3;
                                            var1_1 = var32_43;
                                            var3_3 = var33_44;
                                            var18_19 = var40_52;
                                            var9_9 = var36_48;
                                            var8_8 = var37_49;
                                            var32_43 = var6_6;
                                            var6_6 = var27_35;
                                            var27_35 = var10_10;
                                            var10_10 = var24_30;
                                            var24_30 = var11_11;
                                            var11_11 = var23_28;
                                            var23_28 = var12_12;
                                            var12_12 = var22_26;
                                            var22_26 = var13_13;
                                            var13_13 = var21_24;
                                            var21_24 = var14_14;
                                            var14_14 = var19_20;
                                        }
                                        if (var55_73 != 0 && (var56_75 = var5_5.getStockLevel()) > 0) {
                                            var56_75 = 1;
                                            var5_5.setSelected((boolean)var56_75);
                                        }
                                        var15_15.setVariantOptionSizeQualifier((ProductOptionVariant)var5_5);
                                        var0.getProductOptionVariants().add(var5_5);
                                        var4_4 = var0.getProductOptionItems();
                                        if (var4_4 != null) {
                                            var4_4.add(var15_15);
                                        }
                                        var15_15 = var23_28;
                                        var4_4 = var24_30;
                                        var37_49 = var30_40 /* !! */ ;
                                        var5_5 = var32_43;
                                        break block182;
                                    }
                                    var26_34 = var18_19;
                                    var31_42 = var3_3;
                                    var35_47 = var4_4;
                                    var30_40 /* !! */  = var5_5;
                                    var38_50 = var7_7;
                                    var39_51 = var8_8;
                                    var42_56 = var9_9;
                                    var4_4 = var11_11;
                                    var5_5 = var12_12;
                                    var7_7 = var13_13;
                                    var15_15 = var14_14;
                                    var14_14 = var19_20;
                                    var13_13 = var21_24;
                                    var12_12 = var22_26;
                                    var11_11 = var23_28;
                                    var1_1 = var32_43;
                                    var3_3 = var33_44;
                                    var18_19 = var40_52;
                                    var9_9 = var36_48;
                                    var8_8 = var37_49;
                                    var37_49 = var6_6;
                                    var6_6 = var27_35;
                                    var27_35 = var10_10;
                                    var10_10 = var24_30;
                                    var22_26 = var5_5;
                                    var21_24 = var7_7;
                                    var5_5 = var30_40 /* !! */ ;
                                }
                                var40_52 = var18_19;
                                var32_43 = var1_1;
                                var33_44 = var3_3;
                                var36_48 = var9_9;
                                var24_30 = var10_10;
                                var23_28 = var11_11;
                                var19_20 = var14_14;
                                var14_14 = var15_15;
                                var1_1 = var17_17;
                                var18_19 = var26_34;
                                var10_10 = var27_35;
                                var3_3 = var31_42;
                                var7_7 = var38_50;
                                var9_9 = var42_56;
                                var11_11 = var4_4;
                                var27_35 = var6_6;
                                var6_6 = var37_49;
                                var4_4 = var35_47;
                                var37_49 = var8_8;
                                var8_8 = var39_51;
                                var50_66 = var22_26;
                                var22_26 = var12_12;
                                var12_12 = var50_66;
                                var51_68 = var21_24;
                                var21_24 = var13_13;
                                var13_13 = var51_68;
                            }
                            var18_19 = Unit.a;
                            break block168;
                        }
                        var20_23 = var4_4;
                        var1_1 = var13_13;
                        var18_19 = var14_14;
                        var30_41 = var15_15;
                        var14_14 = var3_3;
                        var13_13 = var7_7;
                        var3_3 = var12_12;
                        var12_12 = var8_8;
                        var8_8 = var6_6;
                        var6_6 = var11_11;
                        var11_11 = var9_9;
                        var9_9 = var5_5;
                        var4_4 = new ArrayList();
                        new ArrayList<E>();
                        var5_5 = var0.getBaseOptions();
                        if (var5_5 == null) break block183;
                        var5_5 = var5_5.iterator();
                        while (var55_74 = var5_5.hasNext()) {
                            block184: {
                                block192: {
                                    block185: {
                                        var7_7 = (ProductOption)var5_5.next();
                                        var15_15 = var7_7.getVariantType();
                                        var17_18 = var5_5;
                                        var5_5 = var30_41;
                                        var45_60 = Intrinsics.areEqual(var15_15, var30_41);
                                        if (var45_60 == 0) break block184;
                                        var15_15 = var7_7.getOptions();
                                        var7_7 = var7_7.getSelected();
                                        if (var15_15 == null) break block185;
                                        var15_15 = var15_15.iterator();
                                        while (var59_79 = var15_15.hasNext()) {
                                            block191: {
                                                block189: {
                                                    block188: {
                                                        block187: {
                                                            block186: {
                                                                var19_21 /* !! */  = var15_15.next();
                                                                var30_41 = var5_5;
                                                                var5_5 = var19_21 /* !! */ ;
                                                                var5_5 = (ProductOptionItem)var19_21 /* !! */ ;
                                                                if (var7_7 == null) break block186;
                                                                var19_21 /* !! */  = var15_15;
                                                                var15_15 = var7_7.getCode();
                                                                var21_25 = var7_7;
                                                                var7_7 = var5_5.getCode();
                                                                var55_74 = Intrinsics.areEqual(var15_15, var7_7);
                                                                if (!var55_74) break block187;
                                                                var55_74 = true;
                                                                break block188;
                                                            }
                                                            var21_25 = var7_7;
                                                            var19_21 /* !! */  = var15_15;
                                                        }
                                                        var55_74 = false;
                                                        var7_7 = null;
                                                    }
                                                    var15_15 = var5_5.getVariantOptionQualifiers();
                                                    if (var15_15 == null) break block189;
                                                    var22_27 = var15_15;
                                                    var22_27 = (Collection)var15_15;
                                                    var23_29 = var14_14;
                                                    var60_80 = var22_27.size();
                                                    var22_27 = var13_13;
                                                    var13_13 = null;
                                                    for (var41_55 = false; var41_55 < var60_80; var41_55 += var34_46) {
                                                        block190: {
                                                            var24_31 = var15_15.get((int)var41_55);
                                                            var25_33 = var60_80;
                                                            var14_14 = var24_31;
                                                            var14_14 = (ProductOptionVariant)var24_31;
                                                            var24_31 = var15_15;
                                                            var15_15 = var14_14.getQualifier();
                                                            var27_36 = var12_12;
                                                            var34_46 = true;
                                                            var45_60 = (int)b.i((String)var15_15, (String)var16_16, var34_46);
                                                            if (var45_60 == 0) break block190;
                                                            var12_12 = var5_5.getStock();
                                                            if (var12_12 == null) ** GOTO lbl-1000
                                                            var15_15 = var12_12.getStockLevel();
                                                            if (var15_15 != null) {
                                                                var45_60 = var15_15.intValue();
                                                            } else {
                                                                var45_60 = 0;
                                                                var15_15 = null;
                                                            }
                                                            if (var45_60 > 0) {
                                                                var45_60 = 1;
                                                            } else lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var45_60 = 0;
                                                                var15_15 = null;
                                                            }
                                                            var14_14.setStockAvailable((boolean)var45_60);
                                                            if (var12_12 != null && (var12_12 = var12_12.getStockLevel()) != null) {
                                                                var34_46 = var12_12.intValue();
                                                            } else {
                                                                var34_46 = false;
                                                                var12_12 = null;
                                                            }
                                                            var14_14.setStockLevel((int)var34_46);
                                                            var12_12 = var5_5.getCode();
                                                            var14_14.setCode((String)var12_12);
                                                            var12_12 = var5_5.getPriceData();
                                                            var14_14.setPriceData((Price)var12_12);
                                                            var12_12 = var5_5.getWasPriceData();
                                                            var14_14.setWasPriceData((Price)var12_12);
                                                            if (var55_74 && (var34_46 = var14_14.getStockLevel()) > false) {
                                                                var34_46 = true;
                                                                var14_14.setSelected(var34_46);
                                                            }
                                                            var0.getProductOptionVariants().add(var14_14);
                                                            var12_12 = var0.getProductOptionItems();
                                                            if (var12_12 != null) {
                                                                var12_12.add(var5_5);
                                                            }
                                                        }
                                                        var12_12 = Unit.a;
                                                        var34_46 = true;
                                                        var15_15 = var24_31;
                                                        var60_80 = var25_33;
                                                        var12_12 = var27_36;
                                                    }
                                                    var27_36 = var12_12;
                                                    var5_5 = Unit.a;
                                                    break block191;
                                                }
                                                var27_36 = var12_12;
                                                var22_27 = var13_13;
                                                var23_29 = var14_14;
                                            }
                                            var15_15 = var19_21 /* !! */ ;
                                            var7_7 = var21_25;
                                            var13_13 = var22_27;
                                            var14_14 = var23_29;
                                            var12_12 = var27_36;
                                            var5_5 = var30_41;
                                        }
                                        var30_41 = var5_5;
                                        var27_36 = var12_12;
                                        var22_27 = var13_13;
                                        var23_29 = var14_14;
                                        var5_5 = Unit.a;
                                        break block192;
                                    }
                                    var27_36 = var12_12;
                                    var22_27 = var13_13;
                                    var23_29 = var14_14;
                                }
                                var5_5 = var17_18;
                                var13_13 = var22_27;
                                var14_14 = var23_29;
                                var12_12 = var27_36;
                                continue;
                            }
                            var5_5 = var17_18;
                        }
                        var27_36 = var12_12;
                        var22_27 = var13_13;
                        var23_29 = var14_14;
                        var5_5 = Unit.a;
                        break block193;
                    }
                    var27_36 = var12_12;
                    var22_27 = var7_7;
                    var23_29 = var14_14;
                }
                var56_76 = var4_4.isEmpty();
                if (!var56_76 || (var4_4 = var0.getVariantOptions()) == null) break block168;
                var4_4 = var4_4.iterator();
                while (var49_65 = var4_4.hasNext()) {
                    block203: {
                        block194: {
                            var5_5 = (ProductOptionItem)var4_4.next();
                            var7_7 = var5_5.getVariantOptionQualifiers();
                            if (var7_7 == null) break block194;
                            var12_12 = var7_7;
                            var12_12 = (Collection)var7_7;
                            var34_46 = var12_12.size();
                            var41_55 = false;
                            var13_13 = null;
                            while (var41_55 < var34_46) {
                                block195: {
                                    block202: {
                                        block197: {
                                            block201: {
                                                block158: {
                                                    block198: {
                                                        block199: {
                                                            block200: {
                                                                block196: {
                                                                    block157: {
                                                                        var14_14 = (ProductOptionVariant)var7_7.get((int)var41_55);
                                                                        var15_15 = var14_14.getQualifier();
                                                                        var17_18 = var4_4;
                                                                        var56_76 = true;
                                                                        var45_60 = b.i((String)var15_15, (String)var16_16, var56_76);
                                                                        if (var45_60 == 0) break block195;
                                                                        var4_4 = var5_5.getStock();
                                                                        if (var4_4 == null) ** GOTO lbl-1000
                                                                        var15_15 = var4_4.getStockLevel();
                                                                        if (var15_15 != null) {
                                                                            var45_60 = var15_15.intValue();
                                                                        } else {
                                                                            var45_60 = 0;
                                                                            var15_15 = null;
                                                                        }
                                                                        if (var45_60 > 0) {
                                                                            var45_60 = 1;
                                                                        } else lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            var45_60 = 0;
                                                                            var15_15 = null;
                                                                        }
                                                                        var14_14.setStockAvailable((boolean)var45_60);
                                                                        var15_15 = var14_14.getValue();
                                                                        Intrinsics.checkNotNull(var15_15);
                                                                        var59_79 = var15_15.length();
                                                                        var54_72 = true;
                                                                        var21_25 = var16_16;
                                                                        var24_31 = var7_7;
                                                                        var55_74 = var59_79 += -1;
                                                                        var61_81 = false;
                                                                        var16_16 = null;
                                                                        var59_79 = false;
                                                                        var19_21 /* !! */  = null;
                                                                        block23: while (true) {
                                                                            var25_33 = var34_46;
                                                                            if (var61_81 > var55_74) break block157;
                                                                            var34_46 = var59_79 == false ? var61_81 : var55_74;
                                                                            var34_46 = (boolean)var15_15.charAt((int)var34_46);
                                                                            var29_39 = var41_55;
                                                                            var41_55 = 32 != 0;
                                                                            if ((var34_46 = Intrinsics.compare((int)var34_46, (int)var41_55)) <= false) {
                                                                                var34_46 = true;
                                                                            } else {
                                                                                var34_46 = false;
                                                                                var12_12 = null;
                                                                            }
                                                                            if (var59_79) break;
                                                                            if (!var34_46) {
                                                                                var34_46 = var25_33;
                                                                                var41_55 = var29_39;
                                                                                var59_79 = true;
                                                                                continue;
                                                                            }
                                                                            var34_46 = true;
                                                                            var61_81 += var34_46;
lbl991:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var34_46 = var25_33;
                                                                                var41_55 = var29_39;
                                                                                continue block23;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        var41_55 = true;
                                                                        if (var34_46) {
                                                                            var55_74 += -1;
                                                                            ** continue;
                                                                        }
                                                                        break block196;
                                                                    }
                                                                    var29_39 = var41_55;
                                                                    var41_55 = true;
                                                                }
                                                                var16_16 = a.a((int)var55_74, (int)var41_55, (int)var61_81, (String)var15_15);
                                                                var7_7 = var0.getVariantOptions();
                                                                Intrinsics.checkNotNull(var7_7);
                                                                var55_74 = var7_7.size();
                                                                if (var55_74 == var41_55) {
                                                                    var55_74 = true;
                                                                } else {
                                                                    var55_74 = false;
                                                                    var7_7 = null;
                                                                }
                                                                if (!var55_74) break block197;
                                                                var34_46 = false;
                                                                var12_12 = null;
                                                                var55_74 = b.i((String)(var16_16 = b.n((String)var16_16, (String)var9_9, (String)var8_8, false)), (String)var18_19, var41_55);
                                                                if (var55_74 || (var55_74 = b.i((String)var16_16, (String)var1_1, var41_55)) || (var55_74 = b.i((String)var16_16, (String)var3_3, var41_55)) || (var55_74 = b.i((String)var16_16, (String)var6_6, var41_55)) || (var55_74 = b.i((String)var16_16, (String)var10_10, var41_55)) || (var55_74 = b.i((String)var16_16, (String)var11_11, var41_55))) break block198;
                                                                var15_15 = var27_36;
                                                                var55_74 = b.i((String)var16_16, (String)var27_36, var41_55);
                                                                if (var55_74) break block199;
                                                                var7_7 = var22_27;
                                                                var62_82 = b.i((String)var16_16, (String)var22_27, var41_55);
                                                                if (var62_82) break block200;
                                                                var12_12 = var20_23;
                                                                var54_72 = b.i((String)var16_16, (String)var20_23, var41_55);
                                                                var40_53 = var18_19;
                                                                var18_19 = var23_29;
                                                                if (var54_72 || (var61_81 = b.i((String)var16_16, (String)var23_29, var41_55))) break block158;
                                                                var61_81 = false;
                                                                var16_16 = null;
                                                                break block201;
                                                            }
                                                            var40_53 = var18_19;
                                                            var12_12 = var20_23;
lbl1035:
                                                            // 2 sources

                                                            while (true) {
                                                                var18_19 = var23_29;
                                                                break block158;
                                                                break;
                                                            }
                                                        }
                                                        var40_53 = var18_19;
                                                        var12_12 = var20_23;
                                                        var7_7 = var22_27;
                                                        ** continue;
                                                    }
                                                    var40_53 = var18_19;
                                                    var12_12 = var20_23;
                                                    var7_7 = var22_27;
                                                    var18_19 = var23_29;
                                                    var15_15 = var27_36;
                                                }
                                                var61_81 = true;
                                            }
                                            var50_67 = var7_7;
                                            var55_74 = var61_81;
                                            var16_16 = var7_7;
                                            break block202;
                                        }
                                        var40_53 = var18_19;
                                        var12_12 = var20_23;
                                        var16_16 = var22_27;
                                        var18_19 = var23_29;
                                        var15_15 = var27_36;
                                    }
                                    if (var4_4 != null && (var4_4 = var4_4.getStockLevel()) != null) {
                                        var56_76 = var4_4.intValue();
                                    } else {
                                        var56_76 = false;
                                        var4_4 = null;
                                    }
                                    var14_14.setStockLevel((int)var56_76);
                                    var4_4 = var5_5.getCode();
                                    var14_14.setCode((String)var4_4);
                                    var4_4 = var5_5.getPriceData();
                                    var14_14.setPriceData((Price)var4_4);
                                    var4_4 = var5_5.getWasPriceData();
                                    var14_14.setWasPriceData((Price)var4_4);
                                    if (var55_74 && (var56_76 = var14_14.getStockLevel()) > false) {
                                        var56_76 = true;
                                        var14_14.setSelected(var56_76);
                                    }
                                    var0.getProductOptionVariants().add(var14_14);
                                    var4_4 = var0.getProductOptionItems();
                                    if (var4_4 != null) {
                                        var4_4.add(var5_5);
                                    }
lbl1084:
                                    // 4 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var40_53 = var18_19;
                                var21_25 = var16_16;
                                var24_31 = var7_7;
                                var25_33 = var34_46;
                                var29_39 = var41_55;
                                var12_12 = var20_23;
                                var16_16 = var22_27;
                                var18_19 = var23_29;
                                var15_15 = var27_36;
                                ** continue;
                                var56_76 = true;
                                var41_55 = var29_39 + 1;
                                var23_29 = var18_19;
                                var22_27 = var16_16;
                                var20_23 = var12_12;
                                var27_36 = var15_15;
                                var4_4 = var17_18;
                                var16_16 = var21_25;
                                var7_7 = var24_31;
                                var34_46 = var25_33;
                                var18_19 = var40_53;
                            }
                            var40_53 = var18_19;
                            var17_18 = var4_4;
                            var21_25 = var16_16;
                            var12_12 = var20_23;
                            var16_16 = var22_27;
                            var18_19 = var23_29;
                            var15_15 = var27_36;
                            var56_76 = true;
                            var5_5 = Unit.a;
                            break block203;
                        }
                        var40_53 = var18_19;
                        var17_18 = var4_4;
                        var21_25 = var16_16;
                        var12_12 = var20_23;
                        var16_16 = var22_27;
                        var18_19 = var23_29;
                        var15_15 = var27_36;
                        var56_76 = true;
                    }
                    var23_29 = var18_19;
                    var22_27 = var16_16;
                    var20_23 = var12_12;
                    var27_36 = var15_15;
                    var4_4 = var17_18;
                    var16_16 = var21_25;
                    var18_19 = var40_53;
                }
                var18_19 = Unit.a;
            }
            var18_19 = Unit.a;
        }
    }

    public static final Boolean j(ProductOptionVariant object) {
        boolean bl2;
        String string2;
        String string3;
        boolean bl3;
        String string4;
        if (object != null && (string4 = ((ProductOptionVariant)object).getUniversalSizeValue()) != null && !(bl3 = string4.length())) {
            return Boolean.FALSE;
        }
        bl3 = false;
        string4 = null;
        if (object != null && (string3 = ((ProductOptionVariant)object).getBrandValue()) != null) {
            string2 = ((ProductOptionVariant)object).getUniversalSizeValue();
            bl2 = string3.equalsIgnoreCase(string2);
        } else {
            bl2 = false;
            string3 = null;
        }
        boolean bl4 = false;
        string2 = null;
        String string5 = object != null ? ((ProductOptionVariant)object).getBrandSizeFormat() : null;
        string5 = Y63.e(string5);
        if (object != null) {
            string2 = ((ProductOptionVariant)object).getUniversalSizeFormat();
        }
        object = Y63.e(string2);
        bl4 = true;
        boolean bl5 = b.i(string5, (String)object, bl4);
        if (!bl2 || !bl5) {
            bl3 = true;
        }
        return bl3;
    }
}

