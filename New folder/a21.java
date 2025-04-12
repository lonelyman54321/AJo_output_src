/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.gson.Gson;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.GiftProducts;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class a21 {
    public static final a21 a;

    static {
        a21 a212;
        a = a212 = new Object();
    }

    public static void a(CartEntry cartEntry, HashMap hashMap) {
        int n3 = 1;
        if (cartEntry != null) {
            int n4;
            boolean bl2;
            Iterator iterator = cartEntry.getGiftProducts();
            iterator = iterator != null && (bl2 = (iterator = cartEntry.getGiftProducts()) == null ? true : iterator instanceof String) ? String.valueOf((String)cartEntry.getGiftProducts()) : "";
            Object object = cartEntry.isGiftProduct();
            if (object != null && (n4 = ((Boolean)(object = cartEntry.isGiftProduct())).booleanValue()) != 0) {
                int n7;
                n4 = ((String)((Object)iterator)).length();
                if (n4 > 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object = null;
                }
                if (n4 != 0 && (iterator = StringsKt.a0((CharSequence)((Object)iterator), (String[])(object = new String[]{","}), false, 0, n7 = 6)) != null) {
                    iterator = ((Iterable)((Object)iterator)).iterator();
                    while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        Object[] objectArray;
                        Serializable serializable;
                        object = (String)iterator.next();
                        n7 = (int)(hashMap.containsKey(object) ? 1 : 0);
                        if (n7 == n3) {
                            n7 = 1;
                        } else {
                            n7 = 0;
                            serializable = null;
                        }
                        if (n7 != 0) {
                            serializable = (ArrayList)hashMap.get(object);
                            if (serializable != null) {
                                objectArray = cartEntry.getProduct();
                                ((ArrayList)serializable).add(objectArray);
                            }
                            if (serializable == null) {
                                serializable = new ArrayList();
                            }
                            hashMap.put(object, serializable);
                        } else {
                            serializable = cartEntry.getProduct();
                            objectArray = new Product[n3];
                            objectArray[0] = serializable;
                            serializable = xx_2.d(objectArray);
                            hashMap.put(object, serializable);
                        }
                        object = cartEntry.getProduct();
                        serializable = cartEntry.getQuantity();
                        ((Product)object).setGwpQuantity((Integer)serializable);
                    }
                }
            }
        }
    }

    public static void b(ArrayList arrayList, CartEntry cartEntry) {
        Boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(cartEntry, "data");
        Boolean bl4 = cartEntry.isGiftProduct();
        if (bl4 == null || (bl3 = Intrinsics.areEqual(bl4 = cartEntry.isGiftProduct(), bl2 = Boolean.FALSE))) {
            arrayList.add(cartEntry);
        }
    }

    public static boolean c(ArrayList serializable) {
        h40_0 h40_02;
        boolean bl2;
        boolean bl3 = false;
        if (serializable != null && !(bl2 = serializable.isEmpty()) && (bl2 = (h40_02 = h40_0.a).f1())) {
            int n3;
            if ((serializable = a21.e((List)((Object)serializable))) != null) {
                n3 = (Integer)serializable;
            } else {
                n3 = 0;
                serializable = null;
            }
            if (n3 > 0) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static String d(int n3, String string2, String objectArray) {
        int n4 = 1;
        if (n3 > n4) {
            string2 = objectArray;
        }
        objectArray = StringCompanionObject.INSTANCE;
        if (string2 == null) {
            string2 = "";
        }
        Integer n7 = n3;
        objectArray = new Object[n4];
        objectArray[0] = n7;
        return xh2_0.a(objectArray, n4, string2, "format(...)");
    }

    public static Integer e(List object) {
        if (object != null) {
            int n3;
            object = ((Iterable)object).iterator();
            int n4 = 0;
            while ((n3 = object.hasNext()) != 0) {
                Serializable serializable = (Product)object.next();
                if (serializable != null && (serializable = ((Product)serializable).getGwpQuantity()) != null) {
                    n3 = (Integer)serializable;
                } else {
                    n3 = 0;
                    serializable = null;
                }
                n4 += n3;
            }
            object = n4;
        } else {
            object = null;
        }
        return object;
    }

    public static GiftProducts f(Object object) {
        if (object != null) {
            Gson gson;
            try {
                gson = new Gson();
            }
            catch (Exception exception) {}
            object = gson.toJson(object);
            gson = new Gson();
            Class<GiftProducts> clazz = GiftProducts.class;
            object = gson.fromJson((String)object, clazz);
            return (GiftProducts)object;
        }
        return null;
    }

    public static String g(a21$a object, List object2) {
        Object object3;
        int n3;
        int n4;
        object2 = a21.e((List)object2);
        String string2 = null;
        if (object2 != null) {
            n4 = (Integer)object2;
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object == null) {
            n3 = -1;
        } else {
            object3 = a21$b.$EnumSwitchMapping$0;
            n3 = object.ordinal();
            n3 = object3[n3];
        }
        object3 = "";
        switch (n3) {
            default: {
                break;
            }
            case 7: {
                object = h40_0.a;
                object = h40_0.D(false).getOrderReturnNeededFreebies();
                if (object == null) break;
                object3 = object;
                break;
            }
            case 6: {
                object = h40_0.a;
                object = h40_0.D(false).getOrderReturnNeededFreebies();
                string2 = h40_0.D(false).getOrderReturnNeededMoreFreebies();
                object3 = a21.d(n4, (String)object, string2);
                break;
            }
            case 5: {
                object = h40_0.a;
                object = h40_0.D(false).getOrderDetailsReturnFreebies();
                string2 = h40_0.D(false).getOrderDetailsReturnMoreFreebies();
                object3 = a21.d(n4, (String)object, string2);
                break;
            }
            case 4: {
                object = h40_0.a;
                object = h40_0.D(false).getOrderDetailsReturnFreebies();
                string2 = h40_0.D(false).getOrderDetailsReturnMoreFreebies();
                object3 = a21.d(n4, (String)object, string2);
                break;
            }
            case 3: {
                object = h40_0.a;
                object = h40_0.D(false).getOrderFreebiesWithProduct();
                string2 = h40_0.D(false).getOrderMoreFreebiesWithProduct();
                object3 = a21.d(n4, (String)object, string2);
                break;
            }
            case 2: {
                object = h40_0.a;
                object = h40_0.D(false).getOrderCancelDetailFreebies();
                string2 = h40_0.D(false).getOrderCancelDetailMoreFreebies();
                object3 = a21.d(n4, (String)object, string2);
                break;
            }
            case 1: {
                object = h40_0.a;
                object = h40_0.D(false).getOrderCancelInitFreebies();
                string2 = h40_0.D(false).getOrderCancelInitMoreFreebies();
                object3 = a21.d(n4, (String)object, string2);
            }
        }
        return object3;
    }

    public static void h(a21$a object, View object2, ArrayList arrayList, Function0 function0) {
        Intrinsics.checkNotNullParameter(object2, "view");
        int n3 = R$id.composeGiftsView;
        object2 = (ComposeView)object2.findViewById(n3);
        Intrinsics.checkNotNull(object2);
        ai0_2.B((View)object2);
        String string2 = a21.g(object, arrayList);
        a21$c a21$c = new a21$c(arrayList, (a21$a)((Object)object), string2);
        object = new u10(-1817762376, a21$c, true);
        ((ComposeView)((Object)object2)).setContent((Function2)object);
        object = new z11_0(function0, 0);
        object2.setOnClickListener((View.OnClickListener)object);
    }

    public static /* synthetic */ void i(a21 a212, a21$a a21$a, View view, ArrayList arrayList) {
        a212.getClass();
        a21.h(a21$a, view, arrayList, null);
    }

    /*
     * WARNING - void declaration
     */
    public static void j(AppCompatTextView appCompatTextView, ArrayList object, boolean bl2, boolean bl3) {
        int n3 = 1;
        boolean bl4 = a21.c((ArrayList)object);
        if (bl4) {
            if (bl2) {
                if (appCompatTextView != null) {
                    ai0_2.B((View)appCompatTextView);
                }
            } else if (appCompatTextView != null) {
                ai0_2.i((View)appCompatTextView);
            }
            if (appCompatTextView != null) {
                void var3_5;
                if (var3_5 == false) {
                    int n4 = R$string.freebiesCancel;
                    object = a21.e((List)object);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    object = hv3_0.L(n4, objectArray);
                } else {
                    int n7 = R$string.freebiesReturn;
                    object = a21.e((List)object);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    object = hv3_0.L(n7, objectArray);
                }
                appCompatTextView.setText((CharSequence)object);
            }
        }
    }
}

