/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Message
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.data.repo.NewPDPRepo;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.pdp.data.BrickBrandSizes;
import com.ril.ajio.pdp.data.SizeChartAttribute;
import com.ril.ajio.pdprefresh.data.PDPSizeChartBricks;
import com.ril.ajio.pdprefresh.models.NewPDPViewModel$getBrickBrandSizeChart$1;
import com.ril.ajio.pdprefresh.models.NewPDPViewModel$getBrickBrandSizes$1;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.FeatureData;
import com.ril.ajio.services.data.Product.FeatureValue;
import com.ril.ajio.services.data.Product.FraudEngineActionContent;
import com.ril.ajio.services.data.Product.FraudEngineCOD;
import com.ril.ajio.services.data.Product.FraudEngineEddResponse;
import com.ril.ajio.services.data.Product.FraudEngineItemDetailRequest;
import com.ril.ajio.services.data.Product.FraudEngineRequestBody;
import com.ril.ajio.services.data.Product.FraudEngineResult;
import com.ril.ajio.services.data.Product.FraudEngineReturnWindow;
import com.ril.ajio.services.data.Product.PDPPriceError;
import com.ril.ajio.services.data.Product.PrepaidOffers;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductPromotion;
import com.ril.ajio.services.data.Product.ProductSkuInfo;
import com.ril.ajio.services.data.Product.ProductUserSizeRecomResponse;
import com.ril.ajio.services.data.Product.ProductfnlProductData;
import com.ril.ajio.services.data.Product.SimilarProductWishlistDataHolder;
import com.ril.ajio.services.data.Product.SpotLight;
import com.ril.ajio.services.data.Product.Status;
import com.ril.ajio.services.data.Product.Stock;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.QueryCart;
import com.ril.ajio.services.query.QueryCodWithProductCode;
import com.ril.ajio.services.utils.JsonUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from e12
 */
public final class e12_0
extends Hj
implements t13_0 {
    public boolean A;
    public String A0;
    public boolean B;
    public HashMap B0;
    public final ArrayList C;
    public HashMap C0;
    public ProductOptionVariant D;
    public String D0;
    public ProductOptionVariant E;
    public PrepaidOffers E0;
    public ProductOptionItem F;
    public final HashMap F0;
    public final double G;
    public PDPPriceError G0;
    public Price H;
    public String H0;
    public Price I;
    public int I0;
    public String J;
    public SimilarProductWishlistDataHolder J0;
    public String K;
    public String K0;
    public String L;
    public final zr1_1 L0;
    public String M;
    public final zr1_1 M0;
    public String N;
    public final zr1_1 N0;
    public String O;
    public final zr1_1 O0;
    public String P;
    public final zr1_1 P0;
    public String Q;
    public final zr1_1 Q0;
    public String R;
    public final zr1_1 R0;
    public boolean S;
    public final zr1_1 S0;
    public final zr1_1 T;
    public final zr1_1 T0;
    public final zr1_1 U;
    public final zr1_1 U0;
    public final zr1_1 V0;
    public final zr1_1 W0;
    public final zr1_1 X;
    public final zr1_1 X0;
    public final zr1_1 Y;
    public final zr1_1 Y0;
    public final zr1_1 Z;
    public final zr1_1 Z0;
    public final Application a;
    public final zr1_1 a1;
    public final NewPlpRepo b;
    public final zr1_1 b1;
    public final hh3_2 c;
    public final zr1_1 c1;
    public final hh3_2 d;
    public final zr1_1 d1;
    public final t30_0 e;
    public final hh3_2 e1;
    public final NewPDPRepo f;
    public String f1;
    public final CartApiRepo g;
    public ProductUserSizeRecomResponse g1;
    public final jH2 h;
    public la0_0 h1;
    public final RtbRepo i;
    public final zr1_1 i1;
    public final NewEEcommerceEventsRevamp j;
    public final zr1_1 j1;
    public final NewCustomEventsRevamp k;
    public boolean k0;
    public final zr1_1 k1;
    public final String l;
    public final zr1_1 l1;
    public final String m;
    public final String n;
    public boolean o;
    public final BH3 p;
    public Message p0;
    public Product q;
    public final ArrayList q0;
    public final ArrayList r;
    public boolean r0;
    public SpotLight s;
    public ArrayList s0;
    public String t;
    public ArrayList t0;
    public boolean u;
    public ArrayList u0;
    public String v;
    public final ArrayList v0;
    public String w;
    public String w0;
    public boolean x;
    public String x0;
    public boolean y;
    public String y0;
    public boolean z;
    public String z0;

    public e12_0(Application object, NewPlpRepo object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "application");
        Intrinsics.checkNotNullParameter(object2, "plpRepo");
        super((Application)object);
        this.a = object;
        this.b = object2;
        object2 = new u02_0(this, 0);
        this.c = object2 = yr1_2.b((Function0)object2);
        object2 = new Object();
        this.d = object2 = yr1_2.b((Function0)object2);
        this.e = object2 = new t30_0();
        Object object3 = this.getApplication();
        this.f = object2 = new NewPDPRepo((Context)object3);
        object3 = this.getApplication();
        this.g = object2 = new CartApiRepo((Context)object3);
        object3 = this.getApplication();
        object2 = new WishListRepo((Context)object3);
        object3 = this.getApplication();
        this.h = object2 = new jH2((Context)object3);
        object3 = this.getApplication();
        this.i = object2 = new RtbRepo((Context)object3);
        object2 = AnalyticsManager.Companion;
        object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        this.j = object3;
        this.k = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        this.l = object2 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
        this.m = object2 = ((NewEEcommerceEventsRevamp)object3).getPrevScreenType();
        this.n = "dimension42";
        object3 = new WishListRepo((Context)object);
        this.p = object2 = new BH3((WishListRepo)object3);
        super();
        this.r = object;
        object = "";
        this.t = object;
        this.u = bl2 = true;
        this.x = bl2;
        this.y = bl2;
        this.C = object3 = new ArrayList();
        this.G = -1.0;
        this.K = object;
        this.M = object;
        this.N = object;
        this.O = object;
        this.T = object3 = new zr1_1();
        this.U = object3;
        this.X = object3 = new zr1_1();
        this.Y = object3 = new zr1_1();
        this.Z = object3;
        object3 = new Message();
        this.p0 = object3;
        this.q0 = object3 = new ArrayList();
        this.v0 = object3 = new ArrayList();
        this.w0 = object;
        this.x0 = object;
        this.A0 = object;
        super();
        this.F0 = object;
        this.I0 = (int)(bl2 ? 1 : 0);
        new zr1_1();
        new zr1_1();
        super();
        this.L0 = object;
        this.M0 = object;
        super();
        this.N0 = object;
        this.O0 = object;
        super();
        this.P0 = object;
        this.Q0 = object;
        super();
        this.R0 = object;
        super();
        this.S0 = object;
        this.T0 = object;
        super();
        this.U0 = object;
        this.V0 = object;
        super();
        this.W0 = object;
        this.X0 = object;
        super();
        this.Y0 = object;
        this.Z0 = object;
        super();
        this.a1 = object;
        this.b1 = object;
        super();
        this.c1 = object;
        this.d1 = object;
        super(this, 2);
        object = yr1_2.b((Function0)object);
        this.e1 = object;
        object = la0_0.BRAND_VOICE;
        this.h1 = object;
        super();
        this.i1 = object;
        this.j1 = object;
        super();
        this.k1 = object;
        this.l1 = object;
    }

    public static void C(List list, ProductOptionVariant productOptionVariant) {
        ProductOptionVariant productOptionVariant2;
        ProductOptionVariant productOptionVariant3;
        String string2;
        block5: {
            Collection collection = list;
            collection = list;
            int n3 = collection.size();
            string2 = null;
            productOptionVariant3 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2;
                String string3;
                productOptionVariant2 = (ProductOptionVariant)list.get(i3);
                String string4 = productOptionVariant2.getQualifier();
                boolean bl3 = kotlin.text.b.i(string4, string3 = "standardSize", bl2 = true);
                if (!bl3) {
                    string4 = productOptionVariant2.getQualifier();
                    bl3 = kotlin.text.b.i(string4, string3 = "size", bl2);
                    if (!bl3) continue;
                    productOptionVariant3 = productOptionVariant2;
                    continue;
                }
                break block5;
            }
            productOptionVariant2 = null;
        }
        if (productOptionVariant2 != null) {
            string2 = productOptionVariant2.getValue();
        } else if (productOptionVariant3 != null) {
            string2 = productOptionVariant3.getValue();
        }
        productOptionVariant.setSizeValue(string2);
    }

    public static String f(List object) {
        Object object2;
        Collection collection = object;
        collection = (Collection)object;
        int n3 = collection.size();
        int n4 = 0;
        while (true) {
            String string2;
            object2 = "";
            if (n4 >= n3) break;
            ProductOptionVariant productOptionVariant = (ProductOptionVariant)object.get(n4);
            String string3 = productOptionVariant.getQualifier();
            boolean bl2 = kotlin.text.b.i(string3, string2 = "imsBatchId", false);
            if (bl2) {
                object = productOptionVariant.getValue();
                if (object != null) {
                    object2 = object;
                }
                return object2;
            }
            ++n4;
        }
        return object2;
    }

    public static String g(ProductOptionVariant object, Product object2) {
        Intrinsics.checkNotNullParameter(object, "selectedProduct");
        Object object3 = "product";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n3 = hv3_0.Y();
        String string2 = "";
        if (n3 != 0) {
            String string3;
            int n4;
            object3 = ((Product)object2).getBaseOptions();
            String string4 = null;
            boolean bl2 = false;
            if (object3 != null && (object3 = (ProductOption)object3.get(0)) != null && (object3 = ((ProductOption)object3).getOptions()) != null && (object3 = (ProductOptionItem)object3.get(0)) != null) {
                object3 = ((ProductOptionItem)object3).getSizeDisplayType();
            } else {
                n3 = 0;
                object3 = null;
            }
            if (object3 == null || (n4 = ((String)object3).length()) == 0) {
                object3 = ((Product)object2).getVariantOptions();
                if (object3 != null && (object3 = (ProductOptionItem)object3.get(0)) != null) {
                    object3 = ((ProductOptionItem)object3).getSizeDisplayType();
                } else {
                    n3 = 0;
                    object3 = null;
                }
            }
            if (object3 != null && (n3 = ((String)object3).equals(string3 = "STANDARD")) == (n4 = 1)) {
                object3 = ((ProductOptionVariant)object).getBrandValue();
                Intrinsics.checkNotNull(object3);
                n3 = ((String)object3).length();
                if (n3 > 0) {
                    boolean bl3;
                    Object object4;
                    int n7;
                    object3 = ((Product)object2).getFeatureData();
                    if (object3 != null) {
                        object3 = ((Product)object2).getFeatureData();
                        Intrinsics.checkNotNull(object3);
                        object3 = object3.iterator();
                        while ((n7 = object3.hasNext()) != 0) {
                            String string5;
                            int n8;
                            object4 = (FeatureData)object3.next();
                            String string6 = ((FeatureData)object4).getName();
                            if ((string6 == null || (n8 = string6.equalsIgnoreCase(string5 = "Size Format")) != n4) && ((string6 = ((FeatureData)object4).getName()) == null || (n8 = string6.equalsIgnoreCase(string5 = "sizeFormat")) != n4)) continue;
                            object3 = ((FeatureData)object4).getFeatureValues();
                            if (object3 != null) {
                                n3 = object3.size();
                            } else {
                                n3 = 0;
                                object3 = null;
                            }
                            if (n3 <= 0) break;
                            object3 = ((FeatureData)object4).getFeatureValues();
                            if (object3 != null && (object3 = (FeatureValue)object3.get(0)) != null) {
                                string4 = ((FeatureValue)object3).getValue();
                            }
                            break;
                        }
                    } else {
                        string4 = string2;
                    }
                    if ((n3 = (int)(hv3_0.Y() ? 1 : 0)) != 0) {
                        object3 = ((Product)object2).getBaseOptions();
                        if (object3 == null || (object3 = (ProductOption)object3.get(0)) == null || (object3 = ((ProductOption)object3).getOptions()) == null || (object3 = (ProductOptionItem)object3.get(0)) == null || (object3 = ((ProductOptionItem)object3).getDisplaySizeFormat()) == null) {
                            object3 = string2;
                        }
                        if ((n7 = ((String)(object3 = Y63.e((String)object3))).length()) == 0) {
                            n7 = 1;
                        } else {
                            n7 = 0;
                            object4 = null;
                        }
                        if (n7 != 0) {
                            if ((object2 = ((Product)object2).getVariantOptions()) == null || (object2 = (ProductOptionItem)object2.get(0)) == null || (object2 = ((ProductOptionItem)object2).getDisplaySizeFormat()) == null) {
                                object2 = string2;
                            }
                            object3 = Y63.e((String)object2);
                        }
                    } else {
                        object3 = string2;
                    }
                    if ((bl3 = kotlin.text.b.i((String)(object2 = ((ProductOptionVariant)object).getValue()), (String)(object4 = ((ProductOptionVariant)object).getBrandValue()), n4 != 0)) && (bl3 = ((String)(object2 = Y63.e((String)object3))).equalsIgnoreCase((String)(object3 = Y63.e(string4))))) {
                        bl2 = true;
                    }
                    if (!bl2) {
                        object = ((ProductOptionVariant)object).getBrandValue();
                        string2 = Qj0.b(string4, (String)object);
                    }
                }
            }
        }
        return string2;
    }

    public static String i(ProductOptionItem object) {
        String string2 = "";
        if (object != null) {
            String string3;
            Price price = ((ProductOptionItem)object).getWasPriceData();
            object = ((ProductOptionItem)object).getPriceData();
            if (price != null && object != null && (string3 = price.getValue()) != null && (string3 = ((Price)object).getValue()) != null) {
                float f5;
                int n3;
                float f6;
                string3 = price.getValue();
                float f7 = 0.0f;
                if (string3 != null) {
                    f6 = Float.parseFloat(string3);
                } else {
                    n3 = 0;
                    f6 = 0.0f;
                    string3 = null;
                }
                String string4 = ((Price)object).getValue();
                if (string4 != null) {
                    f5 = Float.parseFloat(string4);
                } else {
                    f5 = 0.0f;
                    string4 = null;
                }
                n3 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
                if (n3 > 0) {
                    int n4;
                    float f8;
                    if ((object = ((Price)object).getValue()) != null) {
                        f8 = Float.parseFloat((String)object);
                    } else {
                        n4 = 0;
                        f8 = 0.0f;
                        object = null;
                    }
                    string2 = price.getValue();
                    if (string2 != null) {
                        f7 = Float.parseFloat(string2);
                    }
                    f8 = (f7 - f8) / f7;
                    int n7 = 100;
                    float f11 = n7;
                    n4 = ok1_1.b(f8 *= f11);
                    string2 = String.valueOf(n4);
                }
            }
        }
        return string2;
    }

    public static String n(List object) {
        String string2;
        Collection collection = object;
        collection = (Collection)object;
        int n3 = collection.size();
        int n4 = 0;
        while (true) {
            int n7;
            String string3;
            string2 = "size";
            if (n4 >= n3) break;
            ProductOptionVariant productOptionVariant = (ProductOptionVariant)object.get(n4);
            String string4 = productOptionVariant.getQualifier();
            int n8 = kotlin.text.b.i(string4, string3 = "standardSize", (n7 = 1) != 0);
            if (n8 != 0) {
                boolean bl2;
                object = productOptionVariant.getValue();
                if (object == null) break;
                object = productOptionVariant.getValue();
                if (object != null) {
                    n3 = ((String)object).length() - n7;
                    n4 = 0;
                    boolean bl3 = false;
                    productOptionVariant = null;
                    while (n4 <= n3) {
                        n8 = !bl3 ? n4 : n3;
                        n8 = ((String)object).charAt(n8);
                        int n10 = 32;
                        if ((n8 = Intrinsics.compare(n8, n10)) <= 0) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            string4 = null;
                        }
                        if (!bl3) {
                            if (n8 == 0) {
                                bl3 = true;
                                continue;
                            }
                            ++n4;
                            continue;
                        }
                        if (n8 == 0) break;
                        n3 += -1;
                    }
                    object = com.jio.jioads.adinterfaces.a.a(n3, n7, n4, (String)object);
                } else {
                    bl2 = false;
                    object = null;
                }
                bl2 = TextUtils.isEmpty((CharSequence)object);
                if (bl2) break;
                string2 = string3;
                break;
            }
            ++n4;
        }
        return string2;
    }

    public static String q(List object, boolean n3, String string2, String string3) {
        String string4;
        int n4;
        String string5;
        int n7;
        Object object2 = object;
        object2 = (Collection)object;
        int n8 = object2.size();
        int n10 = 0;
        String string6 = null;
        while (true) {
            block30: {
                block32: {
                    block31: {
                        n7 = 1;
                        string5 = null;
                        n4 = 32;
                        if (n10 >= n8) break;
                        ProductOptionVariant productOptionVariant = (ProductOptionVariant)object.get(n10);
                        String string7 = productOptionVariant.getQualifier();
                        boolean bl2 = kotlin.text.b.i(string7, string2, n7 != 0);
                        if (!bl2) break block30;
                        string4 = productOptionVariant.getValue();
                        if (string4 == null) break block31;
                        string4 = productOptionVariant.getValue();
                        if (string4 != null) {
                            n10 = string4.length() - n7;
                            int n14 = 0;
                            productOptionVariant = null;
                            bl2 = false;
                            string7 = null;
                            while (n14 <= n10) {
                                int n15 = !bl2 ? n14 : n10;
                                n15 = Intrinsics.compare(string4.charAt(n15), n4);
                                n15 = n15 <= 0 ? 1 : 0;
                                if (!bl2) {
                                    if (n15 == 0) {
                                        bl2 = true;
                                        continue;
                                    }
                                    ++n14;
                                    continue;
                                }
                                if (n15 == 0) break;
                                n10 += -1;
                            }
                            string4 = com.jio.jioads.adinterfaces.a.a(n10, n7, n14, string4);
                        } else {
                            n8 = 0;
                            string4 = null;
                        }
                        n8 = (int)(TextUtils.isEmpty((CharSequence)string4) ? 1 : 0);
                        if (n8 == 0) break block32;
                    }
                    string2 = string3;
                }
                string3 = string2;
                break;
            }
            ++n10;
        }
        if ((n8 = (int)(kotlin.text.b.i(string3, string2 = "size", n7 != 0) ? 1 : 0)) == 0) {
            return string3;
        }
        n8 = (int)(hv3_0.Y() ? 1 : 0);
        if (n8 != 0) {
            int n16 = (int)(kotlin.text.b.i(string3, string2, n7 != 0) ? 1 : 0);
            if (n16 != 0) {
                if (n3 == 0) {
                    string3 = e12_0.n((List)object);
                } else {
                    n3 = object2.size();
                    string2 = null;
                    for (n16 = 0; n16 < n3; ++n16) {
                        object2 = (ProductOptionVariant)object.get(n16);
                        string4 = ((ProductOptionVariant)object2).getQualifier();
                        n8 = (int)(kotlin.text.b.i(string4, string6 = "brandSize", n7 != 0) ? 1 : 0);
                        if (n8 == 0) continue;
                        object = ((ProductOptionVariant)object2).getValue();
                        if (object != null) {
                            boolean bl3;
                            object = ((ProductOptionVariant)object2).getValue();
                            if (object != null) {
                                n3 = ((String)object).length() - n7;
                                n16 = 0;
                                string2 = null;
                                boolean bl4 = false;
                                object2 = null;
                                while (n16 <= n3) {
                                    n8 = !bl4 ? n16 : n3;
                                    if ((n8 = Intrinsics.compare(((String)object).charAt(n8), n4)) <= 0) {
                                        n8 = 1;
                                    } else {
                                        n8 = 0;
                                        string4 = null;
                                    }
                                    if (!bl4) {
                                        if (n8 == 0) {
                                            bl4 = true;
                                            continue;
                                        }
                                        ++n16;
                                        continue;
                                    }
                                    if (n8 == 0) break;
                                    n3 += -1;
                                }
                                string5 = com.jio.jioads.adinterfaces.a.a(n3, n7, n16, (String)object);
                            }
                            if (!(bl3 = TextUtils.isEmpty(string5))) {
                                string3 = string6;
                            }
                        }
                        break;
                    }
                }
            }
        } else {
            n3 = kotlin.text.b.i(string3, string2, n7 != 0);
            if (n3 != 0) {
                string3 = e12_0.n((List)object);
            }
        }
        return string3;
    }

    public final void A(String string2, String string3) {
        NewCustomEventsRevamp newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Bundle bundle = new Bundle();
        Object object = this.q;
        String string4 = null;
        object = object != null ? ((Product)object).getCode() : null;
        String string5 = "product_id";
        bundle.putString(string5, (String)object);
        object = this.q;
        object = object != null ? ((Product)object).getName() : null;
        string5 = "product_name";
        bundle.putString(string5, (String)object);
        object = this.q;
        object = object != null ? ((Product)object).getBrickCategory() : null;
        string5 = "product_category";
        bundle.putString(string5, (String)object);
        object = this.q;
        if (object != null) {
            string4 = ((Product)object).getBrickName();
        }
        bundle.putString("product_brick", string4);
        newCustomEventsRevamp.newPDPInteractionsCustomEvent(string3, string2, "pdp screen", bundle);
    }

    /*
     * Unable to fully structure code
     */
    public final void B() {
        block61: {
            block60: {
                block59: {
                    var1_1 = this.q;
                    if (var1_1 == null) {
                        return;
                    }
                    var2_2 = false;
                    var3_3 = null;
                    this.F = null;
                    Intrinsics.checkNotNull(var1_1);
                    var1_1 = var1_1.getName();
                    var4_4 = TextUtils.isEmpty((CharSequence)var1_1);
                    var5_5 = "";
                    if (var4_4 || (var1_1 = this.q) == null || (var1_1 = var1_1.getName()) == null) {
                        var1_1 = var5_5;
                    }
                    var6_6 = hv3_0.a;
                    var7_7 = this.q;
                    if (var7_7 != null) {
                        var7_7 = var7_7.getFnlColorVariantData();
                    } else {
                        var8_8 = false;
                        var7_7 = null;
                    }
                    var6_6.getClass();
                    this.J = var6_6 = hv3_0.A((ProductFnlColorVariantData)var7_7);
                    var6_6 = this.q;
                    if (var6_6 != null) {
                        var6_6 = var6_6.getFnlColorVariantData();
                    } else {
                        var9_9 = 0;
                        var6_6 = null;
                    }
                    if (var6_6 != null) {
                        var6_6 = this.q;
                        if (var6_6 != null && (var6_6 = var6_6.getFnlColorVariantData()) != null) {
                            var6_6 = var6_6.getBrandName();
                        } else {
                            var9_9 = 0;
                            var6_6 = null;
                        }
                        var9_9 = TextUtils.isEmpty((CharSequence)var6_6);
                        if (var9_9 == 0 && ((var1_1 = this.q) == null || (var1_1 = var1_1.getName()) == null)) {
                            var1_1 = var5_5;
                        }
                    }
                    if ((var6_6 = this.q) != null) {
                        var6_6 = var6_6.getVariantOptions();
                    } else {
                        var9_9 = 0;
                        var6_6 = null;
                    }
                    var8_8 = false;
                    var7_7 = null;
                    if (var6_6 != null && (var6_6 = this.E) != null && (var9_9 = TextUtils.isEmpty((CharSequence)(var6_6 = var6_6.getCode()))) == 0) {
                        var6_6 = this.q;
                        if (var6_6 != null && (var6_6 = var6_6.getVariantOptions()) != null) {
                            var9_9 = var6_6.size();
                            var6_6 = var9_9;
                        } else {
                            var9_9 = 0;
                            var6_6 = null;
                        }
                        Intrinsics.checkNotNull(var6_6);
                        var9_9 = var6_6.intValue();
                        var11_11 = null;
                        for (var10_10 = 0; var10_10 < var9_9; ++var10_10) {
                            var12_12 = this.E;
                            if (var12_12 != null) {
                                var12_12 = var12_12.getCode();
                            } else {
                                var13_13 = false;
                                var12_12 = null;
                            }
                            var14_14 = this.q;
                            if (var14_14 == null || (var14_14 = var14_14.getVariantOptions()) == null || (var14_14 = (ProductOptionItem)var14_14.get(var10_10)) == null || (var14_14 = var14_14.getCode()) == null) {
                                var14_14 = var5_5;
                            }
                            if (!(var13_13 = kotlin.text.b.i((String)var12_12, (String)var14_14, var15_15 = true))) continue;
                            var5_5 = this.q;
                            if (var5_5 != null && (var5_5 = var5_5.getVariantOptions()) != null) {
                                var5_5 = (ProductOptionItem)var5_5.get(var10_10);
                            } else {
                                var16_16 = 0;
                                var5_5 = null;
                            }
                            this.F = var5_5;
                            break;
                        }
                    } else {
                        var5_5 = this.q;
                        if (var5_5 != null) {
                            var5_5 = var5_5.getVariantOptions();
                        } else {
                            var16_16 = 0;
                            var5_5 = null;
                        }
                        if (var5_5 != null) {
                            var5_5 = this.q;
                            if (var5_5 != null && (var5_5 = var5_5.getVariantOptions()) != null) {
                                var16_16 = var5_5.size();
                            } else {
                                var16_16 = 0;
                                var5_5 = null;
                            }
                            if (var16_16 > 0) {
                                var5_5 = this.q;
                                if (var5_5 != null && (var5_5 = var5_5.getVariantOptions()) != null) {
                                    var5_5 = (ProductOptionItem)var5_5.get(0);
                                } else {
                                    var16_16 = 0;
                                    var5_5 = null;
                                }
                                this.F = var5_5;
                            }
                        }
                    }
                    if ((var5_5 = this.F) != null) break block60;
                    var5_5 = this.q;
                    if (var5_5 != null) {
                        var5_5 = var5_5.getVariantOptions();
                    } else {
                        var16_16 = 0;
                        var5_5 = null;
                    }
                    if (var5_5 == null) ** GOTO lbl122
                    var5_5 = this.q;
                    if (var5_5 != null && (var5_5 = var5_5.getVariantOptions()) != null) {
                        var16_16 = var5_5.size();
                    } else {
                        var16_16 = 0;
                        var5_5 = null;
                    }
                    if (var16_16 <= 0) ** GOTO lbl122
                    var5_5 = this.q;
                    if (var5_5 != null && (var5_5 = var5_5.getVariantOptions()) != null && (var5_5 = (ProductOptionItem)var5_5.get(0)) != null) {
                        var5_5 = var5_5.getWasPriceData();
                    } else {
                        while (true) {
                            var16_16 = 0;
                            var5_5 = null;
                            break block59;
                            break;
                        }
lbl122:
                        // 2 sources

                        if ((var5_5 = this.q) == null) ** continue;
                        var5_5 = var5_5.getWasPriceData();
                    }
                }
                this.I = var5_5;
                var5_5 = this.q;
                if (var5_5 != null) {
                    var5_5 = var5_5.getPrice();
                } else {
                    var16_16 = 0;
                    var5_5 = null;
                }
                this.H = var5_5;
                break block61;
            }
            this.I = var5_5 = var5_5.getWasPriceData();
            var5_5 = this.F;
            if (var5_5 != null) {
                var5_5 = var5_5.getPriceData();
            } else {
                var16_16 = 0;
                var5_5 = null;
            }
            this.H = var5_5;
        }
        var5_5 = this.E;
        if (var5_5 == null || (var16_16 = (int)TextUtils.isEmpty((CharSequence)(var5_5 = var5_5.getCode()))) != 0) {
            var5_5 = this.q;
            if (var5_5 != null) {
                var5_5 = var5_5.getBaseOptions();
            } else {
                var16_16 = 0;
                var5_5 = null;
            }
            if (var5_5 != null) {
                var5_5 = var5_5.iterator();
                var9_9 = 0;
                var6_6 = null;
                while (var8_8 = var5_5.hasNext()) {
                    var7_7 = (ProductOption)var5_5.next();
                    var11_11 = var7_7.getVariantType();
                    var10_10 = (int)Intrinsics.areEqual(var11_11, var12_12 = "FnlColorVariant");
                    if (var10_10 == 0 || (var7_7 = var7_7.getSelected()) == null) continue;
                    var3_3 = var7_7.getPriceData();
                    var6_6 = var7_7.getWasPriceData();
                }
            } else {
                var9_9 = 0;
                var6_6 = null;
            }
            if (var3_3 != null) {
                this.H = var3_3;
            }
            if (var6_6 != null) {
                this.I = var6_6;
            }
        }
        this.K = var1_1;
        var4_4 = this.u();
        if (var4_4 && (var1_1 = this.H) != null && !(var2_2 = TextUtils.isEmpty((CharSequence)(var3_3 = var1_1.getValue())))) {
            var17_17 = this.G;
            var6_6 = var17_17;
            var7_7 = var1_1.getValue();
            var19_18 = 0.0;
            if (var7_7 != null) {
                var21_19 = Double.parseDouble((String)var7_7);
                var7_7 = var21_19;
            } else {
                var7_7 = var19_18;
            }
            var9_9 = (int)Intrinsics.areEqual(var6_6, var7_7);
            if (var9_9 == 0) {
                if ((var1_1 = var1_1.getValue()) != null) {
                    Double.parseDouble((String)var1_1);
                }
            } else {
                var3_3 = var17_17;
                var5_5 = var1_1.getValue();
                if (var5_5 != null) {
                    var23_20 = Double.parseDouble((String)var5_5);
                    var5_5 = var23_20;
                } else {
                    var5_5 = var19_18;
                }
                var2_2 = Intrinsics.areEqual(var3_3, var5_5);
                if (var2_2 && (var1_1 = var1_1.getValue()) != null) {
                    Double.parseDouble((String)var1_1);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void D() {
        block191: {
            block195: {
                block194: {
                    block193: {
                        block192: {
                            block168: {
                                block184: {
                                    block183: {
                                        block173: {
                                            var1_1 = this;
                                            var2_2 = 1;
                                            var3_3 /* !! */  = this.q;
                                            if (var3_3 /* !! */  == null) {
                                                return;
                                            }
                                            this.v = var3_3 /* !! */  = "";
                                            this.w = var3_3 /* !! */ ;
                                            var4_4 = 0;
                                            var5_5 /* !! */  = null;
                                            this.B = false;
                                            this.y = var2_2;
                                            this.x = var2_2;
                                            var6_6 = this.C;
                                            var6_6.clear();
                                            var7_7 = 0;
                                            var8_8 = 0.0f;
                                            var9_9 = null;
                                            this.E = null;
                                            this.Q = null;
                                            this.w0 = var3_3 /* !! */ ;
                                            this.x0 = var3_3 /* !! */ ;
                                            this.D0 = null;
                                            var10_10 = this.q;
                                            if (var10_10 != null) {
                                                var10_10 = var10_10.getBaseOptions();
                                            } else {
                                                var11_11 = 0;
                                                var10_10 = null;
                                            }
                                            var12_12 = var1_1.q;
                                            if (var12_12 == null || (var12_12 = var12_12.getBaseOptions()) == null || (var12_12 = (ProductOption)var12_12.get(0)) == null || (var12_12 = var12_12.getOptions()) == null || (var12_12 = (ProductOptionItem)var12_12.get(0)) == null || (var12_12 = var12_12.getSizeDisplayType()) == null) {
                                                var12_12 = var3_3 /* !! */ ;
                                            }
                                            var1_1.O = var12_12 = Y63.e((String)var12_12);
                                            var12_12 = this.o();
                                            var13_13 = var12_12.length();
                                            if (var13_13 == 0) {
                                                var12_12 = var1_1.q;
                                                if (var12_12 == null || (var12_12 = var12_12.getVariantOptions()) == null || (var12_12 = (ProductOptionItem)var12_12.get(0)) == null || (var12_12 = var12_12.getSizeDisplayType()) == null) {
                                                    var12_12 = var3_3 /* !! */ ;
                                                }
                                                var1_1.O = var12_12 = Y63.e((String)var12_12);
                                            }
                                            var12_12 = "highlightedSize";
                                            var14_14 = "autoSelected";
                                            var15_15 = "highlighted size";
                                            var16_16 = "auto select size";
                                            var17_17 = "size";
                                            var18_18 = ",";
                                            if (var10_10 == null) break block173;
                                            var19_19 = var10_10;
                                            var19_19 = ((Iterable)var10_10).iterator();
                                            var20_20 = 0;
                                            var21_21 = null;
                                            while ((var22_22 = var19_19.hasNext()) != 0) {
                                                block174: {
                                                    var23_23 = (ProductOption)var19_19.next();
                                                    var9_9 = var23_23.getVariantType();
                                                    var4_4 = Intrinsics.areEqual(var9_9, var5_5 /* !! */  = "FnlColorVariant");
                                                    if (var4_4 == 0 || (var5_5 /* !! */  = var23_23.getSelected()) == null) break block174;
                                                    var5_5 /* !! */  = var5_5 /* !! */ .getAttributes();
                                                    var9_9 = var5_5 /* !! */ ;
                                                    var9_9 = (Collection)var5_5 /* !! */ ;
                                                    if (var9_9 == null || (var7_7 = var9_9.isEmpty())) break block174;
                                                    var5_5 /* !! */  = var5_5 /* !! */ .iterator();
                                                    block23: while (var7_7 = var5_5 /* !! */ .hasNext()) {
                                                        block178: {
                                                            block176: {
                                                                block177: {
                                                                    block175: {
                                                                        var9_9 = (ProductOptionVariant)var5_5 /* !! */ .next();
                                                                        var23_23 = var9_9.getName();
                                                                        var24_24 /* !! */  = var5_5 /* !! */ ;
                                                                        var5_5 /* !! */  = "selection1";
                                                                        var4_4 = kotlin.text.b.i((String)var23_23, (String)var5_5 /* !! */ , (boolean)var2_2);
                                                                        var23_23 = "null";
                                                                        if (var4_4 == 0) break block175;
                                                                        var5_5 /* !! */  = var9_9.getValue();
                                                                        if (var5_5 /* !! */  != null && (var4_4 = var5_5 /* !! */ .length()) != 0 && (var4_4 = (int)kotlin.text.b.i((String)(var5_5 /* !! */  = var9_9.getValue()), (String)var23_23, (boolean)var2_2)) == 0) {
                                                                            var5_5 /* !! */  = var9_9.getValue();
                                                                            Intrinsics.checkNotNull(var5_5 /* !! */ );
                                                                            var1_1.w0 = var5_5 /* !! */ ;
                                                                        }
                                                                        var25_25 = var19_19;
                                                                        break block176;
                                                                    }
                                                                    var5_5 /* !! */  = var9_9.getName();
                                                                    var25_25 = var19_19;
                                                                    var19_19 = "selection2";
                                                                    var4_4 = (int)kotlin.text.b.i((String)var5_5 /* !! */ , (String)var19_19, (boolean)var2_2);
                                                                    if (var4_4 == 0) break block177;
                                                                    var5_5 /* !! */  = var9_9.getValue();
                                                                    if (var5_5 /* !! */  != null && (var4_4 = var5_5 /* !! */ .length()) != 0 && (var4_4 = (int)kotlin.text.b.i((String)(var5_5 /* !! */  = var9_9.getValue()), (String)var23_23, (boolean)var2_2)) == 0) {
                                                                        var5_5 /* !! */  = var9_9.getValue();
                                                                        Intrinsics.checkNotNull(var5_5 /* !! */ );
                                                                        var1_1.x0 = var5_5 /* !! */ ;
                                                                    }
                                                                    break block176;
                                                                }
                                                                var5_5 /* !! */  = var9_9.getName();
                                                                var4_4 = (int)kotlin.text.b.i((String)var5_5 /* !! */ , var19_19 = "skuVisibleAttributes", (boolean)var2_2);
                                                                if (var4_4 == 0) break block178;
                                                                var5_5 /* !! */  = var9_9.getValue();
                                                                if (var5_5 /* !! */  != null && (var4_4 = var5_5 /* !! */ .length()) != 0 && (var4_4 = (int)kotlin.text.b.i((String)(var5_5 /* !! */  = var9_9.getValue()), (String)var23_23, (boolean)var2_2)) == 0) {
                                                                    if (var21_21 == null) {
                                                                        var5_5 /* !! */  = new ArrayList();
                                                                        var21_21 = var5_5 /* !! */ ;
                                                                    }
                                                                    if ((var5_5 /* !! */  = var9_9.getValue()) != null) {
                                                                        var7_7 = 0;
                                                                        var8_8 = 0.0f;
                                                                        var9_9 = null;
                                                                        var26_26 = (int)StringsKt.F(var5_5 /* !! */ , var18_18, false);
                                                                        if (var26_26 != 0) {
                                                                            var19_19 = new String[]{var18_18};
                                                                            var22_22 = 6;
                                                                            var5_5 /* !! */  = StringsKt.a0((CharSequence)var5_5 /* !! */ , (String[])var19_19, false, 0, var22_22);
                                                                            var21_21.addAll(var5_5 /* !! */ );
                                                                        } else {
                                                                            var21_21.add(var5_5 /* !! */ );
                                                                        }
                                                                    }
                                                                }
                                                            }
lbl112:
                                                            // 3 sources

                                                            while (true) {
                                                                var5_5 /* !! */  = var24_24 /* !! */ ;
                                                                var19_19 = var25_25;
                                                                continue block23;
                                                                break;
                                                            }
                                                        }
                                                        var5_5 /* !! */  = var9_9.getName();
                                                        var4_4 = (int)kotlin.text.b.i((String)var5_5 /* !! */ , var19_19 = "classDesc", (boolean)var2_2);
                                                        if (var4_4 == 0) ** GOTO lbl112
                                                        var5_5 /* !! */  = var9_9.getValue();
                                                        var1_1.D0 = var5_5 /* !! */ ;
                                                        ** continue;
                                                    }
                                                }
                                                var25_25 = var19_19;
                                                var4_4 = 0;
                                                var5_5 /* !! */  = null;
                                                var7_7 = 0;
                                                var8_8 = 0.0f;
                                                var9_9 = null;
                                            }
                                            var5_5 /* !! */  = var10_10.iterator();
                                            var7_7 = 1;
                                            var8_8 = 1.4E-45f;
                                            while ((var11_11 = var5_5 /* !! */ .hasNext()) != 0) {
                                                block179: {
                                                    var10_10 = (ProductOption)var5_5 /* !! */ .next();
                                                    var19_19 = var10_10.getVariantType();
                                                    var26_26 = Intrinsics.areEqual(var19_19, var23_23 = "FnlSizeVariant");
                                                    if (var26_26 == 0) break block179;
                                                    var19_19 = var10_10.getSelected();
                                                    if ((var10_10 = var10_10.getOptions()) == null) break block179;
                                                    var10_10 = var10_10.iterator();
                                                    block26: while ((var22_22 = var10_10.hasNext()) != 0) {
                                                        block182: {
                                                            block181: {
                                                                block180: {
                                                                    var23_23 = (ProductOptionItem)var10_10.next();
                                                                    var27_27 = var23_23.getVariantOptionQualifiers();
                                                                    var25_25 = var23_23.getStock();
                                                                    if (var25_25 != null && (var25_25 = var25_25.getStockLevel()) != null) {
                                                                        var28_30 = var25_25.intValue();
                                                                        var25_25 = var5_5 /* !! */ ;
                                                                        var4_4 = var28_30;
                                                                    } else {
                                                                        var25_25 = var5_5 /* !! */ ;
                                                                        var4_4 = 0;
                                                                        var5_5 /* !! */  = null;
                                                                    }
                                                                    var29_31 = var7_7;
                                                                    var30_32 = var8_8;
                                                                    if (var4_4 > 0) {
                                                                        var7_7 = 1;
                                                                        var8_8 = 1.4E-45f;
                                                                    } else {
                                                                        var7_7 = 0;
                                                                        var8_8 = 0.0f;
                                                                        var9_9 = null;
                                                                    }
                                                                    var31_33 = var10_10;
                                                                    if (var19_19 == null) break block180;
                                                                    var10_10 = var19_19.getCode();
                                                                    var32_34 = var19_19;
                                                                    var19_19 = var23_23.getCode();
                                                                    var11_11 = (int)Intrinsics.areEqual(var10_10, var19_19);
                                                                    if (var11_11 == 0) break block181;
                                                                    var11_11 = 1;
                                                                    break block182;
                                                                }
                                                                var32_34 = var19_19;
                                                            }
                                                            var11_11 = 0;
                                                            var10_10 = null;
                                                        }
                                                        if (var27_27 != null) {
                                                            var19_19 = var27_27;
                                                            var19_19 = (Collection)var27_27;
                                                            var26_26 = var19_19.size();
                                                            var33_35 = var21_21;
                                                            var20_20 = 0;
                                                            var21_21 = null;
                                                            while (var20_20 < var26_26) {
                                                                var34_36 = var23_23.getScDisplaySize();
                                                                var35_37 = var34_36.length();
                                                                if (var35_37 > 0) {
                                                                    var35_37 = var26_26;
                                                                    var26_26 = 1;
                                                                } else {
                                                                    var35_37 = var26_26;
                                                                    var26_26 = 0;
                                                                    var19_19 = null;
                                                                }
                                                                var19_19 = e12_0.q((List)var27_27, (boolean)var26_26, (String)var17_17, (String)var17_17);
                                                                var36_38 = var27_27.get(var20_20);
                                                                var37_39 = var3_3 /* !! */ ;
                                                                var3_3 /* !! */  = var36_38;
                                                                var3_3 /* !! */  = (ProductOptionVariant)var36_38;
                                                                var36_38 = var17_17;
                                                                var17_17 = var3_3 /* !! */ .getQualifier();
                                                                var38_40 = var20_20;
                                                                var20_20 = 1;
                                                                var39_41 = kotlin.text.b.i((String)var17_17, (String)var19_19, (boolean)var20_20);
                                                                if (var39_41 != 0) {
                                                                    var3_3 /* !! */ .setStockLevel(var4_4);
                                                                    var3_3 /* !! */ .setStockAvailable((boolean)var7_7);
                                                                    var17_17 = var23_23.getCode();
                                                                    var3_3 /* !! */ .setCode((String)var17_17);
                                                                    var17_17 = var23_23.getPriceData();
                                                                    var3_3 /* !! */ .setPriceData((Price)var17_17);
                                                                    var17_17 = var23_23.getWasPriceData();
                                                                    var3_3 /* !! */ .setWasPriceData((Price)var17_17);
                                                                    var17_17 = var23_23.getCommercialType();
                                                                    var3_3 /* !! */ .setCommercialType((String)var17_17);
                                                                    var17_17 = e12_0.f((List)var27_27);
                                                                    var3_3 /* !! */ .setBatchID((String)var17_17);
                                                                    if (var11_11 != 0) {
                                                                        var39_41 = 1;
                                                                        var3_3 /* !! */ .setSelected((boolean)var39_41);
                                                                        var1_1.E = var3_3 /* !! */ ;
                                                                    }
                                                                    if (var7_7) {
                                                                        var39_41 = hv3_0.Y();
                                                                        if (var39_41 != 0 && (var39_41 = (var17_17 = var23_23.getScDisplaySize()).length()) > 0) {
                                                                            var17_17 = var1_1.w;
                                                                            var19_19 = var23_23.getScDisplaySize();
                                                                            var1_1.w = var17_17 = n1.a((String)var17_17, (String)var19_19, var18_18);
                                                                            var17_17 = var3_3 /* !! */ .getBrandValue();
                                                                            var17_17 = var17_17 != null && (var39_41 = var17_17.length()) != 0 ? var3_3 /* !! */ .getBrandValue() : var3_3 /* !! */ .getValue();
                                                                            var3_3 /* !! */ .setBrandValue((String)var17_17);
                                                                            var17_17 = var23_23.getScDisplaySize();
                                                                            var3_3 /* !! */ .setValue((String)var17_17);
                                                                        } else {
                                                                            var17_17 = var1_1.w;
                                                                            var19_19 = var3_3 /* !! */ .getValue();
                                                                            var1_1.w = var17_17 = n1.a((String)var17_17, (String)var19_19, var18_18);
                                                                        }
                                                                        e12_0.C(var27_27, (ProductOptionVariant)var3_3 /* !! */ );
                                                                    } else {
                                                                        var39_41 = hv3_0.Y();
                                                                        if (var39_41 != 0 && (var39_41 = (var17_17 = var23_23.getScDisplaySize()).length()) > 0) {
                                                                            e12_0.C((List)var27_27, (ProductOptionVariant)var3_3 /* !! */ );
                                                                            var17_17 = var1_1.v;
                                                                            var19_19 = var23_23.getScDisplaySize();
                                                                            var17_17 = n1.a((String)var17_17, (String)var19_19, var18_18);
                                                                            var1_1.v = var17_17;
                                                                            var17_17 = var3_3 /* !! */ .getBrandValue();
                                                                            var17_17 = var17_17 != null && (var39_41 = var17_17.length()) != 0 ? var3_3 /* !! */ .getBrandValue() : var3_3 /* !! */ .getValue();
                                                                            var3_3 /* !! */ .setBrandValue((String)var17_17);
                                                                            var17_17 = var23_23.getScDisplaySize();
                                                                            var3_3 /* !! */ .setValue((String)var17_17);
                                                                        } else {
                                                                            var17_17 = var1_1.v;
                                                                            var19_19 = var3_3 /* !! */ .getValue();
                                                                            var1_1.v = var17_17 = n1.a((String)var17_17, (String)var19_19, var18_18);
                                                                        }
                                                                    }
                                                                    var39_41 = (int)mz3_0.E();
                                                                    if (var39_41 != 0 && (var17_17 = var1_1.h1) == (var19_19 = la0_0.SIZE_RECOMMENDATION)) {
                                                                        var17_17 = this.o();
                                                                        var19_19 = var1_1.g1;
                                                                        var17_17 = mz3_0.q((String)var17_17, (ProductUserSizeRecomResponse)var19_19);
                                                                        var19_19 = var3_3 /* !! */ .getValue();
                                                                        var26_26 = (int)Intrinsics.areEqual(var19_19, var17_17);
                                                                        if (var26_26 != 0) {
                                                                            var19_19 = h40_0.a;
                                                                            var19_19 = h40_0.C0();
                                                                            var26_26 = (int)var19_19.optBoolean(var14_14);
                                                                            if (var26_26 != 0) {
                                                                                var1_1.E = var3_3 /* !! */ ;
                                                                                var26_26 = 1;
                                                                                var3_3 /* !! */ .setSelected((boolean)var26_26);
                                                                                var1_1.A((String)var17_17, (String)var16_16);
                                                                            } else {
                                                                                var19_19 = h40_0.C0();
                                                                                var26_26 = var19_19.optBoolean((String)var12_12);
                                                                                if (var26_26 != 0) {
                                                                                    var19_19 = var3_3 /* !! */ .getValue();
                                                                                    var26_26 = Intrinsics.areEqual(var19_19, var17_17);
                                                                                    var3_3 /* !! */ .setHighlighted((boolean)var26_26);
                                                                                    var1_1.A((String)var17_17, var15_15);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    var6_6.add(var3_3 /* !! */ );
                                                                    var40_42 = 1;
                                                                    var41_43 = 1.4E-45f;
                                                                    var29_31 = 0;
                                                                    var30_32 = 0.0f;
                                                                    var42_44 = null;
                                                                } else {
                                                                    var40_42 = 1;
                                                                    var41_43 = 1.4E-45f;
                                                                }
                                                                var20_20 = var38_40 + 1;
                                                                var26_26 = var35_37;
                                                                var17_17 = var36_38;
                                                                var3_3 /* !! */  = var37_39;
                                                            }
                                                            var5_5 /* !! */  = var25_25;
                                                            var7_7 = var29_31;
                                                            var8_8 = var30_32;
                                                            var10_10 = var31_33;
                                                            var19_19 = var32_34;
                                                            var21_21 = var33_35;
lbl300:
                                                            // 2 sources

                                                            while (true) {
                                                                var2_2 = 1;
                                                                continue block26;
                                                                break;
                                                            }
                                                        }
                                                        var5_5 /* !! */  = var25_25;
                                                        var7_7 = var29_31;
                                                        var8_8 = var30_32;
                                                        var10_10 = var31_33;
                                                        var19_19 = var32_34;
                                                        ** continue;
                                                    }
                                                    var29_31 = var7_7;
                                                    var30_32 = var8_8;
                                                    continue;
                                                }
                                                var37_39 = var3_3 /* !! */ ;
                                                var25_25 = var5_5 /* !! */ ;
                                                var36_38 = var17_17;
                                                var33_35 = var21_21;
                                                var2_2 = 1;
                                            }
                                            var37_39 = var3_3 /* !! */ ;
                                            var36_38 = var17_17;
                                            var33_35 = var21_21;
                                            break block183;
                                        }
                                        var37_39 = var3_3 /* !! */ ;
                                        var36_38 = var17_17;
                                        var7_7 = 1;
                                        var8_8 = 1.4E-45f;
                                        var20_20 = 0;
                                        var21_21 = null;
                                    }
                                    var27_27 = var1_1.q;
                                    if (var27_27 != null) {
                                        var27_27 = var27_27.getVariantOptions();
                                    } else {
                                        var2_2 = 0;
                                        var27_27 = null;
                                    }
                                    if (var27_27 == null) break block184;
                                    var27_27 = var1_1.x0;
                                    var2_2 = var27_27.length();
                                    var3_3 /* !! */  = "color";
                                    if (var2_2 == 0 && (var2_2 = (var27_27 = var1_1.w0).length()) == 0) {
                                        var1_1.w0 = var3_3 /* !! */ ;
                                        var2_2 = 1;
                                        var1_1.y = var2_2;
                                        var40_42 = 0;
                                        var41_43 = 0.0f;
                                        var3_3 /* !! */  = null;
                                        var1_1.A = false;
                                        var5_5 /* !! */  = var36_38;
                                        if (var7_7) {
                                            var1_1.x0 = var36_38;
                                            var1_1.x = var2_2;
                                            var1_1.z = false;
                                        }
                                    } else {
                                        var5_5 /* !! */  = var36_38;
                                        var2_2 = 1;
                                        var10_10 = var1_1.x0;
                                        var11_11 = var10_10.length();
                                        if (var11_11 == 0) {
                                            var1_1.y = var2_2;
                                            var10_10 = var1_1.w0;
                                            var1_1.A = var40_42 = kotlin.text.b.i(var10_10, (String)var3_3 /* !! */ , (boolean)var2_2) ^ var2_2;
                                            if (var7_7) {
                                                var1_1.x0 = var36_38;
                                                var11_11 = 0;
                                                var10_10 = null;
                                                var1_1.x = false;
                                                var1_1.z = false;
                                            }
                                        } else {
                                            var11_11 = 0;
                                            var10_10 = null;
                                            var27_27 = var1_1.w0;
                                            var2_2 = var27_27.length();
                                            if (var2_2 == 0) {
                                                var1_1.w0 = var3_3 /* !! */ ;
                                                var1_1.y = false;
                                                var1_1.A = false;
                                                if (var7_7) {
                                                    var1_1.x = var2_2 = 1;
                                                    var1_1.z = var2_2;
                                                }
                                            } else {
                                                var2_2 = 1;
                                                var1_1.y = var2_2;
                                                var10_10 = var1_1.w0;
                                                var1_1.A = var40_42 = kotlin.text.b.i((String)var10_10, (String)var3_3 /* !! */ , (boolean)var2_2) ^ var2_2;
                                                if (var7_7) {
                                                    var1_1.x = var2_2;
                                                    var1_1.z = var2_2;
                                                }
                                            }
                                        }
                                    }
                                    if ((var27_27 = var1_1.q) != null) {
                                        var27_27 = var27_27.getVariantOptions();
                                    } else {
                                        var2_2 = 0;
                                        var27_27 = null;
                                    }
                                    Intrinsics.checkNotNull(var27_27);
                                    var27_27 = var27_27.iterator();
                                    var9_9 = var37_39;
                                    var40_42 = 1;
                                    var41_43 = 1.4E-45f;
                                    block29: while ((var11_11 = (int)var27_27.hasNext()) != 0) {
                                        block185: {
                                            var10_10 = (ProductOptionItem)var27_27.next();
                                            var17_17 = var10_10.getVariantOptionQualifiers();
                                            if (var17_17 == null) break block185;
                                            var19_19 = var17_17.iterator();
                                            while ((var22_22 = var19_19.hasNext()) != 0) {
                                                block167: {
                                                    block189: {
                                                        block190: {
                                                            block188: {
                                                                block186: {
                                                                    block187: {
                                                                        block166: {
                                                                            var23_23 = (ProductOptionVariant)var19_19.next();
                                                                            var25_25 = var27_27;
                                                                            var27_27 = var1_1.x0;
                                                                            var42_44 = var10_10.getScDisplaySize();
                                                                            var29_31 = var42_44.length();
                                                                            if (var29_31 > 0) {
                                                                                var29_31 = var40_42;
                                                                                var30_32 = var41_43;
                                                                                var40_42 = 1;
                                                                                var41_43 = 1.4E-45f;
                                                                            } else {
                                                                                var29_31 = var40_42;
                                                                                var30_32 = var41_43;
                                                                                var40_42 = 0;
                                                                                var41_43 = 0.0f;
                                                                                var3_3 /* !! */  = null;
                                                                            }
                                                                            var27_27 = e12_0.q((List)var17_17, (boolean)var40_42, (String)var27_27, var5_5 /* !! */ );
                                                                            var3_3 /* !! */  = var1_1.q;
                                                                            if (var3_3 /* !! */  != null && (var3_3 /* !! */  = var3_3 /* !! */ .getVariantOptions()) != null) {
                                                                                var40_42 = var3_3 /* !! */ .size();
                                                                                var31_33 = var9_9;
                                                                            } else {
                                                                                var31_33 = var9_9;
                                                                                var40_42 = 0;
                                                                                var41_43 = 0.0f;
                                                                                var3_3 /* !! */  = null;
                                                                            }
                                                                            var9_9 = od3_2.a();
                                                                            var32_34 = ld3_2.STORE_LUXE;
                                                                            var33_35 = var19_19;
                                                                            var19_19 = var32_34.getStoreId();
                                                                            var7_7 = (int)var9_9.equals(var19_19);
                                                                            var19_19 = "standardSize";
                                                                            if (!var7_7) ** GOTO lbl-1000
                                                                            var7_7 = 1;
                                                                            var8_8 = 1.4E-45f;
                                                                            if (var40_42 == var7_7) {
                                                                                var3_3 /* !! */  = var10_10.getScDisplaySize();
                                                                                var40_42 = var3_3 /* !! */ .length();
                                                                                if (var40_42 > 0) {
                                                                                    var40_42 = 1;
                                                                                    var41_43 = 1.4E-45f;
                                                                                } else {
                                                                                    var40_42 = 0;
                                                                                    var41_43 = 0.0f;
                                                                                    var3_3 /* !! */  = null;
                                                                                }
                                                                                var9_9 = e12_0.q((List)var17_17, (boolean)var40_42, (String)var19_19, (String)var19_19);
                                                                            } else lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                var9_9 = var31_33;
                                                                            }
                                                                            var3_3 /* !! */  = var23_23.getQualifier();
                                                                            var32_34 = var6_6;
                                                                            var43_45 = 1;
                                                                            var40_42 = (int)kotlin.text.b.i((String)var3_3 /* !! */ , (String)var27_27, (boolean)var43_45);
                                                                            if (!var40_42 && !(var40_42 = (int)kotlin.text.b.i((String)(var3_3 /* !! */  = var23_23.getQualifier()), (String)var9_9, (boolean)var43_45))) {
                                                                                if (var21_21 != null && (var2_2 = CollectionsKt.F((Iterable)var21_21, var27_27 = var23_23.getQualifier())) == var43_45) {
                                                                                    var27_27 = var1_1.B0;
                                                                                    if (var27_27 == null) {
                                                                                        var27_27 = new HashMap();
                                                                                        var1_1.B0 = var27_27;
                                                                                    }
                                                                                    if ((var27_27 = var1_1.B0) != null) {
                                                                                        var3_3 /* !! */  = var10_10.getCode();
                                                                                        var27_27 = (ArrayList)var27_27.get(var3_3 /* !! */ );
                                                                                    } else {
                                                                                        var2_2 = 0;
                                                                                        var27_27 = null;
                                                                                    }
                                                                                    if (var27_27 == null) {
                                                                                        var27_27 = new ArrayList();
                                                                                    }
                                                                                    var3_3 /* !! */  = var23_23.getName();
                                                                                    var6_6 = var23_23.getValue();
                                                                                    var19_19 = new StringBuilder();
                                                                                    var19_19.append((String)var3_3 /* !! */ );
                                                                                    var19_19.append(": ");
                                                                                    var19_19.append((String)var6_6);
                                                                                    var3_3 /* !! */  = var19_19.toString();
                                                                                    var27_27.add(var3_3 /* !! */ );
                                                                                    var3_3 /* !! */  = var1_1.B0;
                                                                                    if (var3_3 /* !! */  != null) {
                                                                                        var6_6 = var10_10.getCode();
                                                                                        var27_27 = (ArrayList)var3_3 /* !! */ .put(var6_6, var27_27);
                                                                                    }
                                                                                } else {
                                                                                    var27_27 = var23_23.getQualifier();
                                                                                    var2_2 = kotlin.text.b.i((String)var27_27, (String)(var3_3 /* !! */  = "imsBatchId"), (boolean)(var43_45 = 1));
                                                                                    if (var2_2 != 0) {
                                                                                        var27_27 = var1_1.C0;
                                                                                        if (var27_27 == null) {
                                                                                            var27_27 = new HashMap();
                                                                                            var1_1.C0 = var27_27;
                                                                                        }
                                                                                        if ((var27_27 = var1_1.C0) != null) {
                                                                                            var3_3 /* !! */  = var10_10.getCode();
                                                                                            var27_27 = (ProductSkuInfo)var27_27.get(var3_3 /* !! */ );
                                                                                        } else {
                                                                                            var2_2 = 0;
                                                                                            var27_27 = null;
                                                                                        }
                                                                                        if (var27_27 != null) {
                                                                                            var3_3 /* !! */  = var23_23.getValue();
                                                                                            var27_27.setImsBatchId((String)var3_3 /* !! */ );
                                                                                            var27_27 = Unit.a;
                                                                                        } else {
                                                                                            var27_27 = new ProductSkuInfo();
                                                                                            var3_3 /* !! */  = var23_23.getValue();
                                                                                            var27_27.setImsBatchId((String)var3_3 /* !! */ );
                                                                                            var3_3 /* !! */  = var1_1.C0;
                                                                                            if (var3_3 /* !! */  != null) {
                                                                                                var6_6 = var10_10.getCode();
                                                                                                var27_27 = (ProductSkuInfo)var3_3 /* !! */ .put(var6_6, var27_27);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                var27_27 = var25_25;
                                                                                var40_42 = var29_31;
                                                                                var41_43 = var30_32;
                                                                                var6_6 = var32_34;
                                                                                var19_19 = var33_35;
                                                                                continue;
                                                                            }
                                                                            var1_1.z0 = var3_3 /* !! */  = var23_23.getName();
                                                                            var40_42 = 1;
                                                                            var41_43 = 1.4E-45f;
                                                                            var43_45 = kotlin.text.b.i((String)var27_27, (String)var5_5 /* !! */ , (boolean)var40_42);
                                                                            if (!var43_45 && !(var43_45 = kotlin.text.b.i((String)var27_27, (String)var19_19, (boolean)var40_42))) {
                                                                                block165: {
                                                                                    var6_6 = var17_17.iterator();
                                                                                    while (var44_46 = var6_6.hasNext()) {
                                                                                        var24_24 /* !! */  = var6_6.next();
                                                                                        var42_44 = var24_24 /* !! */ ;
                                                                                        var42_44 = (ProductOptionVariant)var24_24 /* !! */ ;
                                                                                        var31_33 = var6_6;
                                                                                        var6_6 = var42_44.getQualifier();
                                                                                        var34_36 = var9_9;
                                                                                        var9_9 = "uom";
                                                                                        var43_45 = (int)kotlin.text.b.i((String)var6_6, (String)var9_9, (boolean)var40_42);
                                                                                        if (var43_45) {
                                                                                            var3_3 /* !! */  = var42_44.getValue();
                                                                                            break block165;
                                                                                        }
                                                                                        var6_6 = var31_33;
                                                                                        var9_9 = var34_36;
                                                                                        var40_42 = 1;
                                                                                        var41_43 = 1.4E-45f;
                                                                                    }
                                                                                    var34_36 = var9_9;
                                                                                    var3_3 /* !! */  = var37_39;
                                                                                }
                                                                                var29_31 = 0;
                                                                                var30_32 = 0.0f;
                                                                                var42_44 = null;
                                                                            } else {
                                                                                var34_36 = var9_9;
                                                                                var40_42 = 0;
                                                                                var41_43 = 0.0f;
                                                                                var1_1.z = false;
                                                                                var3_3 /* !! */  = var37_39;
                                                                            }
                                                                            if (var3_3 /* !! */  != null && (var43_45 = var3_3 /* !! */ .length()) && (var6_6 = var23_23.getValue()) != null && (var43_45 = var6_6.length())) {
                                                                                var6_6 = var23_23.getValue();
                                                                                Intrinsics.checkNotNull(var6_6);
                                                                                var7_7 = 0;
                                                                                var8_8 = 0.0f;
                                                                                var9_9 = null;
                                                                                var43_45 = (int)kotlin.text.b.h((String)var6_6, (String)var3_3 /* !! */ , false);
                                                                                if (!var43_45) {
                                                                                    var6_6 = var23_23.getValue();
                                                                                    var9_9 = new StringBuilder();
                                                                                    var9_9.append((String)var6_6);
                                                                                    var9_9.append((String)var3_3 /* !! */ );
                                                                                    var3_3 /* !! */  = var9_9.toString();
                                                                                    var23_23.setValue((String)var3_3 /* !! */ );
                                                                                }
                                                                            }
                                                                            if ((var3_3 /* !! */  = var10_10.getStock()) != null && (var3_3 /* !! */  = var3_3 /* !! */ .getStockLevel()) != null) {
                                                                                var40_42 = var3_3 /* !! */ .intValue();
                                                                            } else {
                                                                                var40_42 = 0;
                                                                                var41_43 = 0.0f;
                                                                                var3_3 /* !! */  = null;
                                                                            }
                                                                            if (var40_42 > 0) {
                                                                                var43_45 = 1;
                                                                            } else {
                                                                                var43_45 = 0;
                                                                                var6_6 = null;
                                                                            }
                                                                            var9_9 = var23_23.getValue();
                                                                            if (var9_9 == null) break block186;
                                                                            var45_47 = var9_9.length();
                                                                            var44_46 = true;
                                                                            var46_48 = var15_15;
                                                                            var36_38 = var21_21;
                                                                            var47_49 = var45_47 += -1;
                                                                            var20_20 = 0;
                                                                            var21_21 = null;
                                                                            var45_47 = 0;
                                                                            var31_33 = null;
                                                                            block32: while (true) {
                                                                                var48_50 = var12_12;
                                                                                if (var20_20 > var47_49) break block166;
                                                                                var13_13 = var45_47 == 0 ? var20_20 : var47_49;
                                                                                var13_13 = var9_9.charAt(var13_13);
                                                                                var49_51 = var16_16;
                                                                                var50_52 = 32;
                                                                                if ((var13_13 = Intrinsics.compare(var13_13, var50_52)) <= 0) {
                                                                                    var13_13 = 1;
                                                                                } else {
                                                                                    var13_13 = 0;
                                                                                    var12_12 = null;
                                                                                }
                                                                                if (var45_47 != 0) break;
                                                                                if (var13_13 == 0) {
                                                                                    var12_12 = var48_50;
                                                                                    var16_16 = var49_51;
                                                                                    var45_47 = 1;
                                                                                    continue;
                                                                                }
                                                                                var50_52 = 1;
                                                                                var20_20 += var50_52;
lbl612:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    var12_12 = var48_50;
                                                                                    var16_16 = var49_51;
                                                                                    continue block32;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            var50_52 = 1;
                                                                            if (var13_13 != 0) {
                                                                                var47_49 += -1;
                                                                                ** continue;
                                                                            }
                                                                            break block187;
                                                                        }
                                                                        var49_51 = var16_16;
                                                                        var50_52 = 1;
                                                                    }
                                                                    var9_9 = com.jio.jioads.adinterfaces.a.a(var47_49, var50_52, var20_20, (String)var9_9);
                                                                    break block188;
                                                                }
                                                                var48_50 = var12_12;
                                                                var46_48 = var15_15;
                                                                var49_51 = var16_16;
                                                                var36_38 = var21_21;
                                                                var50_52 = 1;
                                                                var7_7 = 0;
                                                                var8_8 = 0.0f;
                                                                var9_9 = null;
                                                            }
                                                            var12_12 = var1_1.q;
                                                            if (var12_12 != null && (var12_12 = var12_12.getVariantOptions()) != null && (var13_13 = var12_12.size()) == var50_52) {
                                                                var13_13 = 1;
                                                            } else {
                                                                var13_13 = 0;
                                                                var12_12 = null;
                                                            }
                                                            var15_15 = " ";
                                                            if (var13_13 == 0 || (var20_20 = kotlin.text.b.i((String)var27_27, (String)var5_5 /* !! */ , (boolean)var50_52)) == 0 && (var2_2 = kotlin.text.b.i((String)var27_27, (String)var19_19, (boolean)var50_52)) == 0) {
                                                                var19_19 = var37_39;
                                                            } else {
                                                                var19_19 = var37_39;
                                                                if (var9_9 != null) {
                                                                    var13_13 = 0;
                                                                    var12_12 = null;
                                                                    var27_27 = kotlin.text.b.n((String)var9_9, var15_15, (String)var37_39, false);
                                                                } else {
                                                                    var2_2 = 0;
                                                                    var27_27 = null;
                                                                }
                                                                var9_9 = "FS";
                                                                var7_7 = (int)kotlin.text.b.i((String)var27_27, (String)var9_9, (boolean)var50_52);
                                                                if (!(var7_7 || (var7_7 = (int)kotlin.text.b.i((String)var27_27, (String)(var9_9 = "ONESIZE"), (boolean)var50_52)) || (var7_7 = (int)kotlin.text.b.i((String)var27_27, (String)(var9_9 = "FULLSIZE"), (boolean)var50_52)) || (var7_7 = (int)kotlin.text.b.i((String)var27_27, (String)(var9_9 = "ONESI"), (boolean)var50_52)) || (var7_7 = (int)kotlin.text.b.i((String)var27_27, (String)(var9_9 = "OS"), (boolean)var50_52)) || (var7_7 = (int)kotlin.text.b.i((String)var27_27, (String)(var9_9 = "FREESIZE"), (boolean)var50_52)) || (var7_7 = (int)kotlin.text.b.i((String)var27_27, (String)(var9_9 = "128gb"), (boolean)var50_52)) || (var7_7 = (int)kotlin.text.b.i((String)var27_27, (String)(var9_9 = "32gb"), (boolean)var50_52)) || (var7_7 = (int)kotlin.text.b.i((String)var27_27, (String)(var9_9 = "4gb"), (boolean)var50_52)) || (var2_2 = (int)kotlin.text.b.i((String)var27_27, (String)(var9_9 = "256gb"), (boolean)var50_52)) != 0)) {
                                                                    var2_2 = 0;
                                                                    var27_27 = null;
                                                                } else {
                                                                    var2_2 = 1;
                                                                }
                                                                var13_13 = var2_2;
                                                            }
                                                            var23_23.setStockLevel(var40_42);
                                                            var23_23.setStockAvailable((boolean)var43_45);
                                                            var27_27 = var10_10.getCode();
                                                            var23_23.setCode((String)var27_27);
                                                            var27_27 = var10_10.getPriceData();
                                                            var23_23.setPriceData((Price)var27_27);
                                                            var27_27 = var10_10.getWasPriceData();
                                                            var23_23.setWasPriceData((Price)var27_27);
                                                            var27_27 = var10_10.getCommercialType();
                                                            var23_23.setCommercialType((String)var27_27);
                                                            var27_27 = e12_0.f((List)var17_17);
                                                            var23_23.setBatchID((String)var27_27);
                                                            if (var43_45) {
                                                                if (var13_13 != 0 || (var27_27 = var23_23.getValue()) != null && (var40_42 = var27_27.length()) && (var3_3 /* !! */  = var1_1.H0) != null && (var40_42 = var3_3 /* !! */ .length()) && (var2_2 = (int)var27_27.equalsIgnoreCase((String)(var3_3 /* !! */  = var1_1.H0))) != 0) {
                                                                    var2_2 = 1;
                                                                    var23_23.setSelected((boolean)var2_2);
                                                                    var1_1.P = var3_3 /* !! */  = var23_23.getCode();
                                                                    var1_1.Q = var3_3 /* !! */  = var23_23.getValue();
                                                                    var1_1.E = var23_23;
                                                                    var1_1.B = var2_2;
                                                                }
                                                                e12_0.C((List)var17_17, (ProductOptionVariant)var23_23);
                                                                var2_2 = hv3_0.Y();
                                                                if (var2_2 != 0 && var29_31 && (var2_2 = (var27_27 = var10_10.getScDisplaySize()).length()) > 0) {
                                                                    var27_27 = var1_1.w;
                                                                    var3_3 /* !! */  = var10_10.getScDisplaySize();
                                                                    var1_1.w = var27_27 = n1.a((String)var27_27, (String)var3_3 /* !! */ , var18_18);
                                                                    var27_27 = var23_23.getBrandValue();
                                                                    var27_27 = var27_27 != null && (var2_2 = var27_27.length()) != 0 ? var23_23.getBrandValue() : var23_23.getValue();
                                                                    var23_23.setBrandValue((String)var27_27);
                                                                    var27_27 = var10_10.getScDisplaySize();
                                                                    var23_23.setValue((String)var27_27);
                                                                } else {
                                                                    var27_27 = var1_1.w;
                                                                    var3_3 /* !! */  = var23_23.getValue();
                                                                    var27_27 = n1.a((String)var27_27, (String)var3_3 /* !! */ , var15_15);
                                                                    var1_1.w = var27_27;
                                                                }
                                                            } else {
                                                                var2_2 = (int)hv3_0.Y();
                                                                if (var2_2 != 0 && var29_31 && (var2_2 = (var27_27 = var10_10.getScDisplaySize()).length()) > 0) {
                                                                    e12_0.C((List)var17_17, (ProductOptionVariant)var23_23);
                                                                    var27_27 = var1_1.v;
                                                                    var3_3 /* !! */  = var10_10.getScDisplaySize();
                                                                    var1_1.v = var27_27 = n1.a((String)var27_27, (String)var3_3 /* !! */ , var18_18);
                                                                    var27_27 = var23_23.getBrandValue();
                                                                    var27_27 = var27_27 != null && (var2_2 = var27_27.length()) != 0 ? var23_23.getBrandValue() : var23_23.getValue();
                                                                    var23_23.setBrandValue((String)var27_27);
                                                                    var27_27 = var10_10.getScDisplaySize();
                                                                    var23_23.setValue((String)var27_27);
                                                                } else {
                                                                    var27_27 = var1_1.v;
                                                                    var3_3 /* !! */  = var23_23.getValue();
                                                                    var1_1.v = var27_27 = n1.a((String)var27_27, (String)var3_3 /* !! */ , var15_15);
                                                                }
                                                            }
                                                            var2_2 = (int)mz3_0.E();
                                                            if (var2_2 == 0 || (var27_27 = var1_1.h1) != (var3_3 /* !! */  = la0_0.SIZE_RECOMMENDATION)) break block189;
                                                            var27_27 = this.o();
                                                            var3_3 /* !! */  = var1_1.g1;
                                                            var27_27 = mz3_0.q((String)var27_27, (ProductUserSizeRecomResponse)var3_3 /* !! */ );
                                                            var3_3 /* !! */  = var23_23.getValue();
                                                            var40_42 = (int)Intrinsics.areEqual(var3_3 /* !! */ , var27_27);
                                                            if (!var40_42) break block189;
                                                            var3_3 /* !! */  = h40_0.a;
                                                            var3_3 /* !! */  = h40_0.C0();
                                                            var40_42 = (int)var3_3 /* !! */ .optBoolean(var14_14);
                                                            if (!var40_42) break block190;
                                                            var1_1.E = var23_23;
                                                            var40_42 = 1;
                                                            var41_43 = 1.4E-45f;
                                                            var23_23.setSelected((boolean)var40_42);
                                                            var6_6 = var49_51;
                                                            var1_1.A((String)var27_27, (String)var49_51);
                                                            var27_27 = var32_34;
                                                            var15_15 = var46_48;
                                                            var12_12 = var48_50;
                                                            break block167;
                                                        }
                                                        var6_6 = var49_51;
                                                        var3_3 /* !! */  = h40_0.C0();
                                                        var12_12 = var48_50;
                                                        var40_42 = var3_3 /* !! */ .optBoolean((String)var48_50);
                                                        if (var40_42) {
                                                            var3_3 /* !! */  = var23_23.getValue();
                                                            var40_42 = Intrinsics.areEqual(var3_3 /* !! */ , var27_27);
                                                            var23_23.setHighlighted((boolean)var40_42);
                                                            var15_15 = var46_48;
                                                            var1_1.A((String)var27_27, var46_48);
lbl748:
                                                            // 3 sources

                                                            while (true) {
                                                                var27_27 = var32_34;
                                                                break block167;
                                                                break;
                                                            }
                                                        }
                                                        var15_15 = var46_48;
                                                        ** GOTO lbl748
                                                    }
                                                    var15_15 = var46_48;
                                                    var12_12 = var48_50;
                                                    var6_6 = var49_51;
                                                    ** continue;
                                                }
                                                var27_27.add(var23_23);
                                                var40_42 = (int)var1_1.x;
                                                var50_52 = 1;
                                                if (!var40_42) {
                                                    var23_23.setSelected((boolean)var50_52);
                                                    var1_1.E = var23_23;
                                                    var1_1.B = var50_52;
                                                }
                                                var16_16 = var6_6;
                                                var37_39 = var19_19;
                                                var40_42 = var29_31;
                                                var41_43 = var30_32;
                                                var19_19 = var33_35;
                                                var9_9 = var34_36;
                                                var21_21 = var36_38;
                                                var6_6 = var27_27;
                                                var27_27 = var25_25;
                                            }
                                            var25_25 = var27_27;
                                            var29_31 = var40_42;
                                            var30_32 = var41_43;
                                            var27_27 = var6_6;
                                            var31_33 = var9_9;
                                            var6_6 = var16_16;
                                            var36_38 = var21_21;
                                            var19_19 = var37_39;
                                            var50_52 = 1;
                                            var40_42 = (int)var1_1.x;
                                            if (var40_42 || (var3_3 /* !! */  = var1_1.E) == null || !(var40_42 = var1_1.B)) {
                                                var16_16 = var6_6;
                                                var37_39 = var19_19;
                                                var40_42 = var29_31;
                                                var41_43 = var30_32;
                                                var9_9 = var31_33;
                                                var21_21 = var36_38;
                                                var6_6 = var27_27;
lbl795:
                                                // 2 sources

                                                while (true) {
                                                    var27_27 = var25_25;
                                                    continue block29;
                                                    break;
                                                }
                                            }
                                            break block168;
                                        }
                                        var25_25 = var27_27;
                                        var27_27 = var6_6;
                                        ** continue;
                                    }
                                }
                                var19_19 = var37_39;
                            }
                            var2_2 = hv3_0.Y();
                            if (var2_2 == 0) break block191;
                            var27_27 = var1_1.q;
                            if (var27_27 == null || (var27_27 = var27_27.getBaseOptions()) == null) break block192;
                            var40_42 = 0;
                            var41_43 = 0.0f;
                            var3_3 /* !! */  = null;
                            if ((var27_27 = (ProductOption)var27_27.get(0)) != null && (var27_27 = var27_27.getOptions()) != null && (var27_27 = (ProductOptionItem)var27_27.get(0)) != null && (var27_27 = var27_27.getDisplaySizeFormat()) != null) break block193;
                        }
                        var27_27 = var19_19;
                    }
                    var1_1.N = var27_27 = Y63.e((String)var27_27);
                    var27_27 = this.r();
                    var2_2 = var27_27.length();
                    if (var2_2 != 0) break block191;
                    var27_27 = var1_1.q;
                    if (var27_27 == null || (var27_27 = var27_27.getVariantOptions()) == null) break block194;
                    var40_42 = 0;
                    var41_43 = 0.0f;
                    var3_3 /* !! */  = null;
                    if ((var27_27 = (ProductOptionItem)var27_27.get(0)) != null && (var27_27 = var27_27.getDisplaySizeFormat()) != null) break block195;
                }
                var27_27 = var19_19;
            }
            var1_1.N = var27_27 = Y63.e((String)var27_27);
        }
        if ((var27_27 = var1_1.q) != null && (var27_27 = var27_27.getFnlColorVariantData()) != null) {
            var27_27 = var27_27.getSizeGuideDesktop();
        } else {
            var2_2 = 0;
            var27_27 = null;
        }
        var3_3 /* !! */  = "sizechart";
        var5_5 /* !! */  = "brickBrandSizes";
        if (var27_27 != null && (var43_45 = var27_27.length())) {
            block170: {
                block169: {
                    var6_6 = new JSONObject((String)var27_27);
                    var2_2 = (int)var6_6.has((String)var3_3 /* !! */ );
                    if (var2_2 == 0) break block169;
                    var27_27 = var6_6.getJSONArray((String)var3_3 /* !! */ );
                    var43_45 = var27_27.length();
                    if (var43_45 <= 0) break block169;
                    var43_45 = 0;
                    var6_6 = null;
                    var27_27 = var27_27.get(0);
                    var27_27 = (JSONObject)var27_27;
                    if (var27_27 == null) break block169;
                    var43_45 = (int)var27_27.has((String)var5_5 /* !! */ );
                    if (!var43_45) break block169;
                    var27_27 = var27_27.getJSONArray((String)var5_5 /* !! */ );
                    try {
                        var27_27 = var27_27.toString();
                        break block170;
                    }
                    catch (JSONException var27_28) {
                        var6_6 = yn3_0.a;
                        var6_6.e(var27_28);
                    }
                }
                var27_27 = var19_19;
            }
            if (var27_27 != null && (var43_45 = var27_27.length())) {
                var6_6 = new Gson();
                var9_9 = new NewPDPViewModel$getBrickBrandSizeChart$1();
                var9_9 = var9_9.getType();
                var1_1.t0 = var27_27 = (ArrayList)var6_6.fromJson((String)var27_27, (Type)var9_9);
            }
        }
        cp_1.Companion.getClass();
        cp$a.e().getClass();
        var27_27 = z40_0.Companion;
        var27_27 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var27_27).a;
        var6_6 = "brand_size_disply_option_pdp";
        var2_2 = (int)var27_27.a((String)var6_6);
        if (var2_2 != 0 && (var2_2 = (int)og1_1.c()) == 0) {
            var27_27 = var1_1.q;
            if (var27_27 != null && (var27_27 = var27_27.getFnlColorVariantData()) != null) {
                var9_9 = var27_27.getSizeGuideDesktop();
            } else {
                var7_7 = 0;
                var8_8 = 0.0f;
                var9_9 = null;
            }
            if (var9_9 != null && (var2_2 = var9_9.length()) != 0) {
                block172: {
                    block171: {
                        var27_27 = new JSONObject((String)var9_9);
                        var43_45 = (int)var27_27.has((String)var3_3 /* !! */ );
                        if (!var43_45) break block171;
                        var27_27 = var27_27.getJSONArray((String)var3_3 /* !! */ );
                        var40_42 = var27_27.length();
                        if (var40_42 <= 0) break block171;
                        var40_42 = 0;
                        var41_43 = 0.0f;
                        var3_3 /* !! */  = null;
                        var27_27 = var27_27.get(0);
                        var27_27 = (JSONObject)var27_27;
                        if (var27_27 == null) break block171;
                        var40_42 = (int)var27_27.has(var5_5 /* !! */ );
                        if (!var40_42) break block171;
                        var27_27 = var27_27.getJSONArray(var5_5 /* !! */ );
                        try {
                            var3_3 /* !! */  = var27_27.toString();
                            break block172;
                        }
                        catch (JSONException var27_29) {
                            var3_3 /* !! */  = yn3_0.a;
                            var3_3 /* !! */ .e(var27_29);
                        }
                    }
                    var3_3 /* !! */  = var19_19;
                }
                if (var3_3 /* !! */  != null && (var2_2 = var3_3 /* !! */ .length()) != 0) {
                    var27_27 = new Gson();
                    var5_5 /* !! */  = new NewPDPViewModel$getBrickBrandSizes$1();
                    var5_5 /* !! */  = var5_5 /* !! */ .getType();
                    var1_1.s0 = var27_27 = (ArrayList)var27_27.fromJson((String)var3_3 /* !! */ , (Type)var5_5 /* !! */ );
                }
            }
            if ((var27_27 = var1_1.s0) != null && (var2_2 = var27_27.isEmpty()) == 0) {
                this.h();
            } else {
                var40_42 = 0;
                var41_43 = 0.0f;
                var3_3 /* !! */  = null;
                var1_1.u = false;
            }
        } else {
            var40_42 = 0;
            var41_43 = 0.0f;
            var3_3 /* !! */  = null;
            var1_1.u = false;
        }
    }

    public final void V1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "shareLink");
        this.R0.k(string2);
    }

    public final void b(String object, String object2, String string2, String string3) {
        Intrinsics.checkNotNullParameter(object, "productCode");
        Intrinsics.checkNotNullParameter(string3, "storeId");
        QueryCart queryCart = new QueryCart();
        queryCart.setProductCode((String)object);
        queryCart.setQuantity(1);
        queryCart.setImsBatchId(string2);
        queryCart.setCommercialType((String)object2);
        object = md3_0.c(this);
        object2 = new w02_0(this, queryCart, string3, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
    }

    /*
     * WARNING - void declaration
     */
    public final void c(EddResult eddResult) {
        int n3;
        boolean bl2;
        Object object = this.j();
        Object object2 = eddResult.getFraudEngineResponse();
        mz3_0 mz3_02 = mz3_0.a;
        int n32 = 0;
        Object object3 = null;
        boolean bl3 = true;
        boolean bl4 = false;
        if (object2 != null && (bl2 = ((FraudEngineEddResponse)(object2 = eddResult.getFraudEngineResponse())).getSuccess()) && (n3 = ((FraudEngineEddResponse)(object2 = eddResult.getFraudEngineResponse())).getStatusCode()) == 0) {
            object2 = eddResult.getFraudEngineResponse();
            if (object2 != null && (object2 = ((FraudEngineEddResponse)object2).getResult()) != null) {
                object2 = ((FraudEngineResult)object2).getReturnWindow();
            } else {
                boolean bl5 = false;
                object2 = null;
            }
            if (object2 != null) {
                void var9_15;
                void var16_51;
                void var16_48;
                boolean bl6;
                Boolean bl7;
                boolean bl8;
                Boolean bl9;
                object2 = eddResult.getFraudEngineResponse();
                if (object2 != null && (object2 = ((FraudEngineEddResponse)object2).getResult()) != null && (object2 = ((FraudEngineResult)object2).getReturnWindow()) != null) {
                    object2 = ((FraudEngineReturnWindow)object2).getActionContent();
                } else {
                    boolean bl10 = false;
                    object2 = null;
                }
                if (object2 != null && (bl9 = ((FraudEngineActionContent)object2).isReturnable()) != null) {
                    bl8 = bl9;
                } else {
                    bl8 = false;
                    bl9 = null;
                }
                if (object2 != null && (bl7 = ((FraudEngineActionContent)object2).isExchangeable()) != null) {
                    bl6 = bl7;
                } else {
                    bl6 = false;
                    bl7 = null;
                }
                if (object2 != null && (object2 = ((FraudEngineActionContent)object2).getReturnWindow()) != null) {
                    int n4 = (Integer)object2;
                } else {
                    boolean bl11 = false;
                    object2 = null;
                }
                int n7 = object != null ? ((ProductOptionItem)object).getReturnWindow() : 0;
                boolean bl12 = object != null ? ((ProductOptionItem)object).isReturnable() : false;
                if (object != null) {
                    boolean bl13 = ((ProductOptionItem)object).isExchangeable();
                } else {
                    boolean bl14 = false;
                    object = null;
                }
                if (bl8 && bl12) {
                    bl8 = true;
                } else {
                    bl8 = false;
                    bl9 = null;
                }
                eddResult.setFinalReturnable(bl8);
                if (bl6 && var16_48 != false) {
                    boolean bl15 = true;
                } else {
                    boolean bl16 = false;
                    object = null;
                }
                eddResult.setFinalExchangeable((boolean)var16_51);
                int n8 = Math.min((int)var9_15, n7);
                eddResult.setFinalReturnWindow(n8);
            } else {
                void var16_55;
                void var9_21;
                void var9_18;
                if (object != null) {
                    int n10 = ((ProductOptionItem)object).getReturnWindow();
                } else {
                    boolean bl17 = false;
                    object2 = null;
                }
                eddResult.setFinalReturnWindow((int)var9_18);
                if (object != null) {
                    boolean bl18 = ((ProductOptionItem)object).isReturnable();
                } else {
                    boolean bl19 = false;
                    object2 = null;
                }
                eddResult.setFinalReturnable((boolean)var9_21);
                if (object != null) {
                    boolean bl20 = ((ProductOptionItem)object).isExchangeable();
                } else {
                    boolean bl21 = false;
                    object = null;
                }
                eddResult.setFinalExchangeable((boolean)var16_55);
            }
            object = eddResult.getFraudEngineResponse();
            if (object != null && (object = ((FraudEngineEddResponse)object).getResult()) != null) {
                object = ((FraudEngineResult)object).getCod();
            } else {
                boolean bl22 = false;
                object = null;
            }
            if (object != null) {
                void var16_60;
                void var9_25;
                object = eddResult.getFraudEngineResponse();
                if (object != null && (object = ((FraudEngineEddResponse)object).getResult()) != null && (object = ((FraudEngineResult)object).getCod()) != null) {
                    boolean bl23 = ((FraudEngineCOD)object).getCodAllowed();
                } else {
                    boolean bl24 = false;
                    object = null;
                }
                object2 = this.q;
                if (object2 != null) {
                    object3 = ((Product)object2).getFnlProductData();
                }
                if (object3 != null && (object2 = ((ProductfnlProductData)object3).getCodAllowed()) != null) {
                    boolean bl25 = (Boolean)object2;
                } else {
                    boolean bl26 = false;
                    object2 = null;
                }
                object3 = eddResult.getStatus();
                if (object3 != null && (n32 = ((Status)object3).getStatusCode()) == 0) {
                    n32 = (int)(eddResult.isCodEligible() ? 1 : 0);
                    if (var9_25 == false || n32 == 0 || var16_60 == false) {
                        bl3 = false;
                    }
                    eddResult.setFinalCodEligible(bl3);
                } else {
                    if (var9_25 == false || var16_60 == false) {
                        bl3 = false;
                    }
                    eddResult.setFinalCodEligible(bl3);
                }
            } else {
                void var16_63;
                int n14;
                object = this.q;
                if (object != null) {
                    object3 = ((Product)object).getFnlProductData();
                }
                if (object3 != null && (object = ((ProductfnlProductData)object3).getCodAllowed()) != null) {
                    boolean bl27 = (Boolean)object;
                } else {
                    boolean bl28 = false;
                    object = null;
                }
                object2 = eddResult.getStatus();
                if (object2 != null && (n14 = ((Status)object2).getStatusCode()) == 0) {
                    boolean bl29;
                    if (var16_63 == false || !(bl29 = eddResult.isCodEligible())) {
                        bl3 = false;
                    }
                    eddResult.setFinalCodEligible(bl3);
                } else {
                    eddResult.setFinalCodEligible((boolean)var16_63);
                }
            }
            boolean bl30 = eddResult.isFinalReturnable();
            boolean bl31 = eddResult.isFinalExchangeable();
            n32 = eddResult.getFinalReturnWindow();
            object = mz3_02.l(n32, bl30, bl31);
            eddResult.setReturnLayoutMessage((String)object);
        } else {
            void var9_38;
            void var9_35;
            void var9_31;
            object2 = this.q;
            if (object2 != null) {
                object3 = ((Product)object2).getFnlProductData();
            }
            if (object3 != null && (object2 = ((ProductfnlProductData)object3).getCodAllowed()) != null) {
                boolean bl32 = (Boolean)object2;
            } else {
                boolean bl33 = false;
                object2 = null;
            }
            object3 = eddResult.getStatus();
            if (object3 != null && (n32 = ((Status)object3).getStatusCode()) == 0) {
                boolean bl34;
                if (var9_31 == false || !(bl34 = eddResult.isCodEligible())) {
                    bl3 = false;
                }
                eddResult.setFinalCodEligible(bl3);
            } else {
                eddResult.setFinalCodEligible((boolean)var9_31);
            }
            if (object != null) {
                int n15 = ((ProductOptionItem)object).getReturnWindow();
            } else {
                boolean bl35 = false;
                object2 = null;
            }
            eddResult.setFinalReturnWindow((int)var9_35);
            if (object != null) {
                boolean bl36 = ((ProductOptionItem)object).isReturnable();
            } else {
                boolean bl37 = false;
                object2 = null;
            }
            eddResult.setFinalReturnable((boolean)var9_38);
            if (object != null) {
                bl4 = ((ProductOptionItem)object).isExchangeable();
            }
            eddResult.setFinalExchangeable(bl4);
            boolean bl38 = eddResult.isFinalReturnable();
            boolean bl39 = eddResult.isFinalExchangeable();
            n32 = eddResult.getFinalReturnWindow();
            object = mz3_02.l(n32, bl38, bl39);
            eddResult.setReturnLayoutMessage((String)object);
        }
    }

    public final jo_2 d() {
        return (jo_2)this.c.getValue();
    }

    public final void e() {
        Object object = this.f.getBankOffers();
        Function1 function1 = new p02_0(this, 0);
        Q02 q02 = new Q02(function1, 0);
        function1 = new xq_1(this, 1);
        on0_0 on0_02 = new on0_0(function1);
        object = ((g53_0)object).f(q02, on0_02);
        this.e.b((yr0_2)object);
    }

    public final void h() {
        Object object = this.C;
        boolean bl2 = object.isEmpty();
        int n3 = 1;
        if (bl2 ^= n3) {
            boolean bl3;
            object = ((ArrayList)object).iterator();
            String string2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            while (bl3 = object.hasNext()) {
                String string3;
                Object object2;
                int n4;
                boolean bl4;
                Object object3;
                BrickBrandSizes brickBrandSizes;
                boolean bl5;
                CharSequence charSequence;
                Object object4;
                String string4;
                Object object5;
                block8: {
                    int n7;
                    object5 = object.next();
                    string4 = "next(...)";
                    Intrinsics.checkNotNullExpressionValue(object5, string4);
                    object5 = (ProductOptionVariant)object5;
                    object4 = this.s0;
                    charSequence = null;
                    if (object4 != null && (n7 = object4.isEmpty() ^ n3) == n3) {
                        object4 = this.s0;
                        Intrinsics.checkNotNull(object4);
                        object4 = ((ArrayList)object4).iterator();
                        Intrinsics.checkNotNullExpressionValue(object4, string2);
                        while (bl5 = object4.hasNext()) {
                            brickBrandSizes = (BrickBrandSizes)object4.next();
                            Intrinsics.checkNotNullExpressionValue(brickBrandSizes, string4);
                            object3 = (brickBrandSizes = (BrickBrandSizes)brickBrandSizes).getSizeChartAttributes();
                            if (object3 == null || (bl4 = object3.isEmpty())) continue;
                            object3 = brickBrandSizes.getSizeChartAttributes().iterator();
                            Intrinsics.checkNotNullExpressionValue(object3, string2);
                            while ((n4 = object3.hasNext()) != 0) {
                                String string5;
                                object2 = object3.next();
                                Intrinsics.checkNotNullExpressionValue(object2, string4);
                                string3 = ((SizeChartAttribute)(object2 = (SizeChartAttribute)object2)).getAttributeName();
                                boolean bl6 = kotlin.text.b.i(string3, string5 = "Universal Size_Attribute", n3 != 0);
                                if (!bl6 || (string3 = ((ProductOptionVariant)object5).getValue()) == null || (n4 = (int)(string3.equalsIgnoreCase((String)(object2 = ((SizeChartAttribute)object2).getAttributeValue())) ? 1 : 0)) != n3) continue;
                                object4 = brickBrandSizes.getSizeChartAttributes();
                                break block8;
                            }
                        }
                    }
                    n7 = 0;
                    object4 = null;
                }
                bl5 = false;
                brickBrandSizes = null;
                if (object4 != null && !(bl4 = object4.isEmpty())) {
                    int n8;
                    object4 = ((ArrayList)object4).iterator();
                    Intrinsics.checkNotNullExpressionValue(object4, string2);
                    while (bl4 = object4.hasNext()) {
                        object3 = object4.next();
                        Intrinsics.checkNotNullExpressionValue(object3, string4);
                        object2 = ((SizeChartAttribute)(object3 = (SizeChartAttribute)object3)).getAttributeName();
                        n4 = kotlin.text.b.i((String)object2, string3 = "Brand Size_attribute", n3 != 0);
                        if (n4 == 0 || (object2 = ((SizeChartAttribute)object3).getAttributeValue()) == null || (n4 = ((String)object2).length()) == 0) continue;
                        charSequence = ((SizeChartAttribute)object3).getAttributeValue();
                        break;
                    }
                    if (charSequence != null && (n8 = charSequence.length()) != 0) {
                        ((ProductOptionVariant)object5).setBrickBrandSize((String)charSequence);
                        continue;
                    }
                    this.u = false;
                    continue;
                }
                this.u = false;
            }
        }
    }

    public final ProductOptionItem j() {
        int n3;
        Object object = this.q;
        if (object != null && (object = ((Product)object).getBaseOptions()) != null) {
            n3 = object.size();
        } else {
            n3 = 0;
            object = null;
        }
        Object object2 = null;
        if (n3 > 0) {
            object = this.q;
            if (object != null && (object = ((Product)object).getBaseOptions()) != null && (object = (ProductOption)object.get(0)) != null && (object = ((ProductOption)object).getOptions()) != null) {
                n3 = object.size();
            } else {
                n3 = 0;
                object = null;
            }
            if (n3 > 0 && (object = this.q) != null && (object = ((Product)object).getBaseOptions()) != null && (object = (ProductOption)object.get(0)) != null && (object = ((ProductOption)object).getOptions()) != null) {
                object2 = object = object.get(0);
                object2 = (ProductOptionItem)object;
            }
        }
        return object2;
    }

    public final String k() {
        Object object = this.q;
        Object object2 = "";
        if (object != null) {
            List list = ((Product)object).getVariantOptions();
            if (list == null) {
                return object2;
            }
            list = null;
            int n3 = 0;
            while (true) {
                int n4;
                Object object3;
                if ((object3 = ((Product)object).getVariantOptions()) != null) {
                    n4 = object3.size();
                    object3 = n4;
                } else {
                    n4 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                n4 = (Integer)object3;
                if (n3 >= n4) break;
                object3 = ((Product)object).getVariantOptions();
                if (object3 != null && (object3 = (ProductOptionItem)object3.get(0)) != null && (object3 = ((ProductOptionItem)object3).getStock()) != null && (object3 = ((Stock)object3).getStockLevel()) != null) {
                    n4 = (Integer)object3;
                } else {
                    n4 = 0;
                    object3 = null;
                }
                if (n4 > 0) {
                    if ((object = ((Product)object).getVariantOptions()) != null && (object = (ProductOptionItem)object.get(0)) != null && (object = ((ProductOptionItem)object).getCode()) != null) {
                        object2 = object;
                    }
                    return object2;
                }
                ++n3;
            }
            if ((object = ((Product)object).getCode()) != null) {
                object2 = object;
            }
        }
        return object2;
    }

    public final void l(int n3, String object, String object2, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "pincodeValue");
        Intrinsics.checkNotNullParameter(object2, "productCode");
        QueryCodWithProductCode queryCodWithProductCode = new QueryCodWithProductCode();
        queryCodWithProductCode.setPincode((String)object);
        queryCodWithProductCode.setProductCode((String)object2);
        queryCodWithProductCode.setQuantity(n3);
        queryCodWithProductCode.setExchange(bl2);
        n3 = (int)(h40_0.Q1() ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
            queryCodWithProductCode.setPriorityDeliveryEnable(n3 != 0);
        }
        Object object3 = this.f.getProductEdd(queryCodWithProductCode);
        object = new M8(this, 2);
        bl2 = true;
        object2 = new gq_2(object, (int)(bl2 ? 1 : 0));
        object = new O8(this, (int)(bl2 ? 1 : 0));
        T02 t02 = new T02((O8)object);
        object3 = ((g53_0)object3).f((o60_0)object2, t02);
        this.e.b((yr0_2)object3);
    }

    public final void m(String string2, String string3, int n3, boolean bl2, Product product, boolean bl3) {
        Object object;
        String string4 = string2;
        Object object2 = string3;
        Intrinsics.checkNotNullParameter(string2, "pincodeValue");
        Object object3 = "productCode";
        Intrinsics.checkNotNullParameter(string3, (String)object3);
        QueryCodWithProductCode queryCodWithProductCode = new QueryCodWithProductCode();
        queryCodWithProductCode.setPincode(string2);
        queryCodWithProductCode.setProductCode(string3);
        int bl4 = n3;
        queryCodWithProductCode.setQuantity(n3);
        boolean bl5 = bl2;
        queryCodWithProductCode.setExchange(bl2);
        boolean bl6 = h40_0.Q1();
        if (bl6) {
            boolean bl7 = true;
            queryCodWithProductCode.setPriorityDeliveryEnable(bl7);
        }
        Object object4 = null;
        em0_2 em0_22 = null;
        e12$a e12$a = null;
        double d2 = 0.0;
        double d5 = 0.0;
        int n4 = 511;
        object2 = new FraudEngineItemDetailRequest(null, null, null, null, null, d2, d5, null, null, n4, null);
        object3 = product != null ? product.getBrandCode() : null;
        ((FraudEngineItemDetailRequest)object2).setBrand((String)object3);
        object3 = product != null ? product.getBrickCode() : null;
        ((FraudEngineItemDetailRequest)object2).setBrick((String)object3);
        object3 = product != null ? product.getCatalog() : null;
        ((FraudEngineItemDetailRequest)object2).setCatalogId((String)object3);
        object3 = product != null ? product.getBrickCategory() : null;
        ((FraudEngineItemDetailRequest)object2).setCategory((String)object3);
        object3 = product != null ? product.getBrickName() : null;
        ((FraudEngineItemDetailRequest)object2).setName((String)object3);
        double d7 = 0.0;
        double d9 = product != null && (object = product.getPrice()) != null && (object = ((Price)object).getValue()) != null ? Double.parseDouble((String)object) : d7;
        ((FraudEngineItemDetailRequest)object2).setSalesPrice(d9);
        if (product != null && (object = product.getWasPriceData()) != null && (object = ((Price)object).getValue()) != null) {
            d7 = Double.parseDouble((String)object);
        }
        ((FraudEngineItemDetailRequest)object2).setMrp(d7);
        object3 = product != null && (object3 = product.getRatingsResponse()) != null ? ((RatingsResponse)object3).getOptionCode() : null;
        ((FraudEngineItemDetailRequest)object2).setOptionCode((String)object3);
        object3 = product != null ? product.getBrickSubCategory() : null;
        ((FraudEngineItemDetailRequest)object2).setSubCategory((String)object3);
        e12$a = null;
        em0_22 = null;
        int n7 = 7;
        object4 = object3;
        object3 = new Object(null, null, null, n7, null);
        ((FraudEngineRequestBody)object3).setItemDetail((FraudEngineItemDetailRequest)object2);
        object2 = this.s().getCustomerUUID();
        Object object5 = "";
        boolean bl8 = ((String)object2).equals(object5);
        if (bl8) {
            boolean bl9 = false;
            object2 = null;
        } else {
            object2 = this.s().getCustomerUUID();
        }
        ((FraudEngineRequestBody)object3).setUserId((String)object2);
        ((FraudEngineRequestBody)object3).setPincode(string4);
        object2 = JsonUtils.toJson(object3);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        object3 = JsonObject.class;
        ref$ObjectRef.element = object2 = JsonUtils.fromJson((String)object2, object3);
        if (object2 == null) {
            ref$ObjectRef.element = object2 = new JsonObject();
        }
        object5 = new Ref$ObjectRef();
        ((Ref$ObjectRef)object5).element = object2 = new EddResult();
        object = new Ref$ObjectRef();
        object4 = md3_0.c(this);
        object2 = ir0_2.a;
        em0_22 = em0_2.b;
        object2 = e12$a;
        string4 = string2;
        e12$a = new e12$a(bl3, (Ref$ObjectRef)object5, (Ref$ObjectRef)object, this, queryCodWithProductCode, ref$ObjectRef, string2, null);
        Ae3.d((i90_0)object4, em0_22, null, e12$a, 2);
    }

    public final String o() {
        String string2;
        int n3 = 1;
        Object object = this.O;
        int n4 = TextUtils.isEmpty((CharSequence)object);
        if (n4 != 0) {
            string2 = "";
        } else {
            object = StringCompanionObject.INSTANCE;
            n4 = R$string.pdp_size_format;
            object = hv3_0.K(n4);
            String string3 = this.O;
            Object[] objectArray = new Object[n3];
            objectArray[0] = string3;
            string3 = "format(...)";
            string2 = xh2_0.a(objectArray, n3, (String)object, string3);
        }
        return string2;
    }

    public final void onCleared() {
        super.onCleared();
        t30_0 t30_02 = this.e;
        boolean bl2 = t30_02.b;
        if (!bl2) {
            t30_02 = this.e;
            t30_02.d();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final String p(boolean bl2) {
        block25: {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            block28: {
                block29: {
                    block26: {
                        block27: {
                            object7 = this.q;
                            boolean n4 = false;
                            object6 = null;
                            if (object7 == null) break block25;
                            object5 = z40_0.Companion;
                            object4 = this.getApplication();
                            object5.getClass();
                            object4 = z40$a.a((Context)object4).a;
                            boolean bl3 = ((ao0_0)object4).a("android_enableSizeGuideUrl");
                            object3 = "";
                            if (bl3) break block26;
                            object4 = ((Product)object7).getFnlColorVariantData();
                            if (object4 != null) {
                                object4 = ((ProductFnlColorVariantData)object4).getSizeGuideServiceUrl();
                            } else {
                                boolean bl4 = false;
                                object4 = null;
                            }
                            boolean bl5 = TextUtils.isEmpty((CharSequence)object4);
                            if (bl5) break block27;
                            object4 = UrlHelper.Companion.getInstance();
                            object2 = ((Product)object7).getFnlColorVariantData();
                            if (object2 != null) {
                                object6 = ((ProductFnlColorVariantData)object2).getSizeGuideServiceUrl();
                            }
                            if ((object6 = ((UrlHelper)object4).getCompleteUrl((String)object6)) != null) break block28;
                            break block29;
                        }
                        object4 = ((Product)object7).getFnlColorVariantData();
                        if (object4 != null) {
                            object4 = ((ProductFnlColorVariantData)object4).getSizeGuideUrl();
                        } else {
                            boolean bl6 = false;
                            object4 = null;
                        }
                        boolean bl7 = TextUtils.isEmpty((CharSequence)object4);
                        if (bl7) break block29;
                        object4 = UrlHelper.Companion.getInstance();
                        object2 = ((Product)object7).getFnlColorVariantData();
                        if (object2 != null) {
                            object6 = ((ProductFnlColorVariantData)object2).getSizeGuideUrl();
                        }
                        if ((object6 = ((UrlHelper)object4).getCompleteUrl((String)object6)) != null) break block28;
                        break block29;
                    }
                    object4 = ((Product)object7).getFnlColorVariantData();
                    if (object4 == null) break block29;
                    object4 = ((Product)object7).getFnlColorVariantData();
                    if (object4 != null) {
                        object4 = ((ProductFnlColorVariantData)object4).getSizeGuideDesktop();
                    } else {
                        boolean bl8 = false;
                        object4 = null;
                    }
                    if (object4 == null) break block29;
                    object4 = ((Product)object7).getFnlColorVariantData();
                    if (object4 != null && (object4 = ((ProductFnlColorVariantData)object4).getSizeGuideDesktop()) != null) {
                        void var3_7;
                        int n3 = ((String)object4).length();
                        if (n3 > 0) {
                            boolean bl9 = true;
                        } else {
                            boolean bl10 = false;
                            object6 = null;
                        }
                        object6 = (boolean)var3_7;
                    }
                    Intrinsics.checkNotNull(object6);
                    boolean bl11 = (Boolean)object6;
                    if (bl11 && (object6 = ((Product)object7).getNewSizeGuideURL()) != null) break block28;
                }
                object6 = object3;
            }
            object4 = "sizeRecommendVariant";
            object2 = "sizeChartRecommendationFlag";
            String string2 = "toString(...)";
            String string3 = "&sizeRecommendVariant=";
            Object object8 = "&sizeRecommendFlag=";
            String string4 = "url";
            if (bl2) {
                cp_1.Companion.getClass();
                object = cp$a.e();
                object.getClass();
                Intrinsics.checkNotNullParameter(object6, string4);
                bl2 = og1_1.c();
                if (!bl2) {
                    object = new StringBuilder((String)object6);
                    ((StringBuilder)object).append((String)object8);
                    object6 = AJIOApplication.Companion;
                    object3 = Q.a((AJIOApplication$a)object6, (z40$a)object5).a;
                    boolean bl12 = ((ao0_0)object3).a((String)object2);
                    ((StringBuilder)object).append(bl12);
                    ((StringBuilder)object).append(string3);
                    object6.getClass();
                    object6 = AJIOApplication$a.a();
                    object5.getClass();
                    int n4 = z40$a.a((Context)object6).a.g((String)object4);
                    ((StringBuilder)object).append(n4);
                    object6 = ((StringBuilder)object).toString();
                    Intrinsics.checkNotNullExpressionValue(object6, string2);
                }
            } else {
                cp_1.Companion.getClass();
                object = cp$a.e();
                object5 = this.C;
                object.getClass();
                if (object5 != null) {
                    boolean bl13;
                    object = ((ArrayList)object5).iterator();
                    object5 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object5);
                    while (bl13 = object.hasNext()) {
                        object5 = object.next();
                        String string5 = "next(...)";
                        Intrinsics.checkNotNullExpressionValue(object5, string5);
                        int n7 = ((ProductOptionVariant)(object5 = (ProductOptionVariant)object5)).isStockAvailable();
                        if (n7 == 0) continue;
                        n7 = ((String)object3).length();
                        if (n7 > 0) {
                            object5 = ((ProductOptionVariant)object5).getValue();
                            string5 = ",";
                            object5 = kp1_0.c(string5, (String)object5);
                        } else {
                            object5 = String.valueOf(((ProductOptionVariant)object5).getValue());
                        }
                        object3 = Ft2.a((String)object3, (String)object5);
                    }
                }
                cp_1.Companion.getClass();
                cp$a.e().getClass();
                Intrinsics.checkNotNullParameter(object6, string4);
                object = "availableSizes";
                Intrinsics.checkNotNullParameter(object3, (String)object);
                bl2 = og1_1.c();
                if (!bl2) {
                    object = new StringBuilder((String)object6);
                    ((StringBuilder)object).append((String)object8);
                    object6 = z40_0.Companion;
                    object5 = AJIOApplication.Companion;
                    object8 = Q.a((AJIOApplication$a)object5, (z40$a)object6).a;
                    boolean bl14 = ((ao0_0)object8).a((String)object2);
                    ((StringBuilder)object).append(bl14);
                    ((StringBuilder)object).append(string3);
                    object5.getClass();
                    object2 = AJIOApplication$a.a();
                    object6.getClass();
                    object2 = z40$a.a((Context)object2).a;
                    int n8 = ((ao0_0)object2).g((String)object4);
                    ((StringBuilder)object).append(n8);
                    object4 = "&variant=";
                    ((StringBuilder)object).append((String)object4);
                    object5.getClass();
                    object5 = AJIOApplication$a.a();
                    object6.getClass();
                    object6 = z40$a.a((Context)object5).a;
                    object5 = "sizeChartVariantFlag";
                    int n10 = ((ao0_0)object6).g((String)object5);
                    ((StringBuilder)object).append(n10);
                    ((StringBuilder)object).append("&availableSizes=");
                    ((StringBuilder)object).append((String)object3);
                    object6 = ((StringBuilder)object).toString();
                    Intrinsics.checkNotNullExpressionValue(object6, string2);
                }
            }
            object = z40_0.Companion;
            object5 = this.getApplication();
            object.getClass();
            object = z40$a.a((Context)object5).a.b("howToMeasureSizeGuidePosition");
            object = n1.a((String)object6, "&howToMeasureSizeGuidePosition=", (String)object);
            object6 = h40_0.a;
            object6 = h40_0.V();
            object6 = ((PDPSizeChartBricks)Z90.a(PDPSizeChartBricks.class, (String)object6)).isShowNewSizeGuideImage();
            object5 = Boolean.TRUE;
            boolean bl15 = Intrinsics.areEqual(object6, object5);
            if (bl15) {
                cp_1.Companion.getClass();
                object6 = cp$a.e();
                object6.getClass();
                boolean bl16 = cp_1.E((Product)object7);
                if (bl16) {
                    object7 = "&isShowNewSizeGuideImage=yes";
                    object = Ft2.a((String)object, (String)object7);
                }
            }
            return object;
        }
        return null;
    }

    public final String r() {
        String string2;
        int n3 = 1;
        Object object = this.N;
        int n4 = TextUtils.isEmpty((CharSequence)object);
        if (n4 != 0) {
            string2 = "";
        } else {
            object = StringCompanionObject.INSTANCE;
            n4 = R$string.pdp_size_format;
            object = hv3_0.K(n4);
            String string3 = this.N;
            Object[] objectArray = new Object[n3];
            objectArray[0] = string3;
            string3 = "format(...)";
            string2 = xh2_0.a(objectArray, n3, (String)object, string3);
        }
        return string2;
    }

    public final UserInformation s() {
        Object object = this.d.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }

    public final void t() {
        Object object = this.f;
        boolean bl2 = ((NewPDPRepo)object).checkValidUserID();
        if (!bl2) {
            return;
        }
        object = ((NewPDPRepo)object).getWishListCount();
        Function1 function1 = new n02_0(this, 0);
        int n3 = 1;
        bq_2 bq_22 = new bq_2(n3, function1);
        function1 = new K8(this, n3);
        S02 s02 = new S02((K8)function1);
        object = ((g53_0)object).f(bq_22, s02);
        this.e.b((yr0_2)object);
    }

    public final boolean u() {
        ArrayList arrayList = this.C;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            ProductOptionVariant productOptionVariant = (ProductOptionVariant)arrayList.get(i3);
            boolean bl2 = productOptionVariant.isStockAvailable();
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final void v(String var1_1) {
        block234: {
            block227: {
                block233: {
                    block232: {
                        block231: {
                            block222: {
                                block224: {
                                    block223: {
                                        block221: {
                                            block220: {
                                                block219: {
                                                    block218: {
                                                        block217: {
                                                            block216: {
                                                                block215: {
                                                                    block214: {
                                                                        block213: {
                                                                            block212: {
                                                                                block211: {
                                                                                    block210: {
                                                                                        block207: {
                                                                                            block209: {
                                                                                                block208: {
                                                                                                    block206: {
                                                                                                        block205: {
                                                                                                            block204: {
                                                                                                                block203: {
                                                                                                                    block202: {
                                                                                                                        block201: {
                                                                                                                            block200: {
                                                                                                                                block199: {
                                                                                                                                    block198: {
                                                                                                                                        block197: {
                                                                                                                                            block196: {
                                                                                                                                                block195: {
                                                                                                                                                    block194: {
                                                                                                                                                        block193: {
                                                                                                                                                            block192: {
                                                                                                                                                                block191: {
                                                                                                                                                                    block190: {
                                                                                                                                                                        block189: {
                                                                                                                                                                            block188: {
                                                                                                                                                                                block187: {
                                                                                                                                                                                    block186: {
                                                                                                                                                                                        block185: {
                                                                                                                                                                                            block184: {
                                                                                                                                                                                                block183: {
                                                                                                                                                                                                    block182: {
                                                                                                                                                                                                        block181: {
                                                                                                                                                                                                            block180: {
                                                                                                                                                                                                                var2_2 = this;
                                                                                                                                                                                                                var3_3 = var1_1;
                                                                                                                                                                                                                var4_4 = true;
                                                                                                                                                                                                                var5_5 = this.k;
                                                                                                                                                                                                                var6_6 = "storeId";
                                                                                                                                                                                                                Intrinsics.checkNotNullParameter(var1_1, (String)var6_6);
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    var6_6 = this.q;
                                                                                                                                                                                                                    if (var6_6 == null) ** GOTO lbl624
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (Exception v0) {
                                                                                                                                                                                                                    ** continue;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var6_6 = var6_6.getFnlColorVariantData();
                                                                                                                                                                                                                if (var6_6 == null) ** GOTO lbl624
                                                                                                                                                                                                                var6_6 = this.q;
                                                                                                                                                                                                                var7_7 = null;
                                                                                                                                                                                                                if (var6_6 == null) break block180;
                                                                                                                                                                                                                var6_6 = var6_6.getBaseOptions();
                                                                                                                                                                                                                break block181;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            var8_8 = false;
                                                                                                                                                                                                            var6_6 = null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (var6_6 == null) ** GOTO lbl624
                                                                                                                                                                                                        var6_6 = var2_2.q;
                                                                                                                                                                                                        if (var6_6 == null) break block182;
                                                                                                                                                                                                        var6_6 = var6_6.getBaseOptions();
                                                                                                                                                                                                        if (var6_6 == null) break block182;
                                                                                                                                                                                                        var8_8 = var6_6.isEmpty();
                                                                                                                                                                                                        break block183;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var8_8 = false;
                                                                                                                                                                                                    var6_6 = null;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (var8_8) ** GOTO lbl624
                                                                                                                                                                                                var9_9 = var2_2.q;
                                                                                                                                                                                                if (var9_9 == null) ** GOTO lbl624
                                                                                                                                                                                                var6_6 = new Bundle();
                                                                                                                                                                                                var10_10 = "Product_Vertical";
                                                                                                                                                                                                var11_11 = var2_2.q;
                                                                                                                                                                                                if (var11_11 == null) break block184;
                                                                                                                                                                                                var11_11 = var11_11.getVerticalColor();
                                                                                                                                                                                                break block185;
                                                                                                                                                                                            }
                                                                                                                                                                                            var12_12 = false;
                                                                                                                                                                                            var11_11 = null;
                                                                                                                                                                                        }
                                                                                                                                                                                        var6_6.putString((String)var10_10, (String)var11_11);
                                                                                                                                                                                        var10_10 = "Product_Brick";
                                                                                                                                                                                        var11_11 = var2_2.q;
                                                                                                                                                                                        if (var11_11 == null) break block186;
                                                                                                                                                                                        var11_11 = var11_11.getBrickCategory();
                                                                                                                                                                                        break block187;
                                                                                                                                                                                    }
                                                                                                                                                                                    var12_12 = false;
                                                                                                                                                                                    var11_11 = null;
                                                                                                                                                                                }
                                                                                                                                                                                var6_6.putString((String)var10_10, (String)var11_11);
                                                                                                                                                                                var10_10 = "productName";
                                                                                                                                                                                var11_11 = var2_2.q;
                                                                                                                                                                                if (var11_11 == null) break block188;
                                                                                                                                                                                var11_11 = var11_11.getName();
                                                                                                                                                                                break block189;
                                                                                                                                                                            }
                                                                                                                                                                            var12_12 = false;
                                                                                                                                                                            var11_11 = null;
                                                                                                                                                                        }
                                                                                                                                                                        var6_6.putString((String)var10_10, (String)var11_11);
                                                                                                                                                                        var10_10 = "In Stock";
                                                                                                                                                                        var12_12 = this.u();
                                                                                                                                                                        if (!var12_12) {
                                                                                                                                                                            var10_10 = "Out Of Stock";
                                                                                                                                                                        }
                                                                                                                                                                        var11_11 = "outofstock";
                                                                                                                                                                        var6_6.putString((String)var11_11, (String)var10_10);
                                                                                                                                                                        var10_10 = AnalyticsManager.Companion;
                                                                                                                                                                        var10_10 = var10_10.getInstance();
                                                                                                                                                                        var11_11 = var10_10.getGtmEvents();
                                                                                                                                                                        var13_13 = "Share_PDP_Share";
                                                                                                                                                                        var14_14 = "Share_PDP_Share_option_count:1";
                                                                                                                                                                        var15_15 = "pdp screen";
                                                                                                                                                                        var10_10 = new AnalyticsData$Builder();
                                                                                                                                                                        var6_6 = var10_10.bundle((Bundle)var6_6);
                                                                                                                                                                        var16_16 = var6_6.build();
                                                                                                                                                                        var17_17 = null;
                                                                                                                                                                        var18_18 = 16;
                                                                                                                                                                        GTMEvents.pushButtonTapEvent$default((GTMEvents)var11_11, (String)var13_13, var14_14, (String)var15_15, (AnalyticsData)var16_16, null, var18_18, null);
                                                                                                                                                                        var17_17 = new Bundle();
                                                                                                                                                                        var6_6 = var5_5.getPRODUCT_NAME();
                                                                                                                                                                        var10_10 = var2_2.q;
                                                                                                                                                                        var11_11 = "";
                                                                                                                                                                        if (var10_10 == null) break block190;
                                                                                                                                                                        var10_10 = var10_10.getName();
                                                                                                                                                                        if (var10_10 != null) break block191;
                                                                                                                                                                    }
                                                                                                                                                                    var10_10 = var11_11;
                                                                                                                                                                }
                                                                                                                                                                var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                                                                                var6_6 = var5_5.getPRODUCT_ID();
                                                                                                                                                                var10_10 = var2_2.q;
                                                                                                                                                                if (var10_10 == null) break block192;
                                                                                                                                                                var10_10 = var10_10.getCode();
                                                                                                                                                                if (var10_10 != null) break block193;
                                                                                                                                                            }
                                                                                                                                                            var10_10 = var11_11;
                                                                                                                                                        }
                                                                                                                                                        var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                                                                        var6_6 = var5_5.getPRODUCT_BRAND();
                                                                                                                                                        var10_10 = var2_2.q;
                                                                                                                                                        if (var10_10 == null) break block194;
                                                                                                                                                        var10_10 = var10_10.getBrandName();
                                                                                                                                                        if (var10_10 != null) break block195;
                                                                                                                                                    }
                                                                                                                                                    var10_10 = var11_11;
                                                                                                                                                }
                                                                                                                                                var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                                                                var6_6 = var5_5.getPRODUCT_PRICE();
                                                                                                                                                var10_10 = var2_2.q;
                                                                                                                                                if (var10_10 == null) break block196;
                                                                                                                                                var10_10 = var10_10.getPrice();
                                                                                                                                                if (var10_10 == null) break block196;
                                                                                                                                                var10_10 = var10_10.getValue();
                                                                                                                                                if (var10_10 != null) break block197;
                                                                                                                                            }
                                                                                                                                            var10_10 = var11_11;
                                                                                                                                        }
                                                                                                                                        var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                                                        var6_6 = var5_5.getPRODUCT_COLOR();
                                                                                                                                        var10_10 = var2_2.q;
                                                                                                                                        Intrinsics.checkNotNull(var10_10);
                                                                                                                                        var10_10 = hv3_0.n((Product)var10_10);
                                                                                                                                        var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                                                        var6_6 = var5_5.getPRODUCT_SIZE();
                                                                                                                                        var10_10 = var2_2.Q;
                                                                                                                                        if (var10_10 != null) break block198;
                                                                                                                                        var10_10 = var11_11;
                                                                                                                                    }
                                                                                                                                    var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                                                    var6_6 = var5_5.getPRODUCT_DISCOUNT();
                                                                                                                                    var10_10 = var2_2.F;
                                                                                                                                    var10_10 = e12_0.i((ProductOptionItem)var10_10);
                                                                                                                                    var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                                                    var6_6 = var5_5.getPRODUCT_CATEGORY();
                                                                                                                                    var10_10 = var2_2.q;
                                                                                                                                    if (var10_10 == null) break block199;
                                                                                                                                    var10_10 = var10_10.getBrickCategory();
                                                                                                                                    break block200;
                                                                                                                                }
                                                                                                                                var19_19 = 0;
                                                                                                                                var10_10 = null;
                                                                                                                                var20_20 = 0.0f;
                                                                                                                            }
                                                                                                                            var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                                            var6_6 = var5_5.getPRODUCT_BRICK();
                                                                                                                            var10_10 = var2_2.q;
                                                                                                                            if (var10_10 == null) break block201;
                                                                                                                            var10_10 = var10_10.getBrickCategory();
                                                                                                                            break block202;
                                                                                                                        }
                                                                                                                        var19_19 = 0;
                                                                                                                        var10_10 = null;
                                                                                                                        var20_20 = 0.0f;
                                                                                                                    }
                                                                                                                    var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                                    var6_6 = var5_5.getPRODUCT_MRP();
                                                                                                                    var10_10 = var2_2.q;
                                                                                                                    if (var10_10 == null) break block203;
                                                                                                                    var10_10 = var10_10.getPrice();
                                                                                                                    if (var10_10 == null) break block203;
                                                                                                                    var10_10 = var10_10.getValue();
                                                                                                                    break block204;
                                                                                                                }
                                                                                                                var19_19 = 0;
                                                                                                                var10_10 = null;
                                                                                                                var20_20 = 0.0f;
                                                                                                            }
                                                                                                            var17_17.putString((String)var6_6, (String)var10_10);
                                                                                                            var6_6 = var5_5.getPRODUCT_TAG();
                                                                                                            var10_10 = hv3_0.a;
                                                                                                            var13_13 = var2_2.q;
                                                                                                            if (var13_13 == null) break block205;
                                                                                                            var13_13 = var13_13.getFnlColorVariantData();
                                                                                                            break block206;
                                                                                                        }
                                                                                                        var13_13 = null;
                                                                                                    }
                                                                                                    var10_10.getClass();
                                                                                                    var10_10 = hv3_0.A((ProductFnlColorVariantData)var13_13);
                                                                                                    var19_19 = TextUtils.isEmpty((CharSequence)var10_10);
                                                                                                    if (var19_19 != 0) break block207;
                                                                                                    var10_10 = var2_2.q;
                                                                                                    if (var10_10 == null) break block208;
                                                                                                    var10_10 = var10_10.getFnlColorVariantData();
                                                                                                    break block209;
                                                                                                }
                                                                                                var19_19 = 0;
                                                                                                var10_10 = null;
                                                                                                var20_20 = 0.0f;
                                                                                            }
                                                                                            var11_11 = hv3_0.A((ProductFnlColorVariantData)var10_10);
                                                                                        }
                                                                                        var17_17.putString((String)var6_6, (String)var11_11);
                                                                                        var6_6 = var5_5.getEC_PRODUCT_DETAILS_INTERACTIONS();
                                                                                        var10_10 = "product share";
                                                                                        var11_11 = var2_2.q;
                                                                                        if (var11_11 == null) break block210;
                                                                                        var11_11 = var11_11.getName();
                                                                                        break block211;
                                                                                    }
                                                                                    var12_12 = false;
                                                                                    var11_11 = null;
                                                                                }
                                                                                var11_11 = String.valueOf(var11_11);
                                                                                var13_13 = "product_share";
                                                                                var14_14 = "pdp screen";
                                                                                var15_15 = "pdp screen";
                                                                                var16_16 = var2_2.l;
                                                                                var21_21 = var2_2.m;
                                                                                var22_22 = var9_9;
                                                                                var9_9 = null;
                                                                                var23_23 = 1536;
                                                                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var5_5, (String)var6_6, (String)var10_10, (String)var11_11, (String)var13_13, var14_14, (String)var15_15, (String)var16_16, var17_17, var21_21, false, null, var23_23, null);
                                                                                var5_5 = var22_22.getBaseOptions();
                                                                                if (var5_5 == null) break block212;
                                                                                var5_5 = var5_5.get(0);
                                                                                var5_5 = (ProductOption)var5_5;
                                                                                break block213;
                                                                            }
                                                                            var24_24 = false;
                                                                            var5_5 = null;
                                                                        }
                                                                        if (var5_5 != null) {
                                                                            var6_6 = var5_5.getSelected();
                                                                            if (var6_6 == null) break block214;
                                                                            var6_6 = var6_6.getUrl();
                                                                            break block215;
                                                                        }
                                                                    }
                                                                    var8_8 = false;
                                                                    var6_6 = null;
                                                                }
                                                                var8_8 = TextUtils.isEmpty((CharSequence)var6_6);
                                                                if (var8_8) ** GOTO lbl624
                                                                var6_6 = var22_22.getFnlColorVariantData();
                                                                if (var6_6 == null) break block216;
                                                                var6_6 = var6_6.getBrandName();
                                                                break block217;
                                                            }
                                                            var8_8 = false;
                                                            var6_6 = null;
                                                        }
                                                        var8_8 = TextUtils.isEmpty((CharSequence)var6_6);
                                                        if (var8_8) ** GOTO lbl624
                                                        var6_6 = var22_22.getName();
                                                        var8_8 = TextUtils.isEmpty((CharSequence)var6_6);
                                                        if (var8_8) ** GOTO lbl624
                                                        var6_6 = FirebaseEvents.Companion;
                                                        var10_10 = var6_6.getInstance();
                                                        var11_11 = "pdp_share";
                                                        var25_25 = 2;
                                                        var15_15 = null;
                                                        var26_26 = 8;
                                                        var17_17 = null;
                                                        var13_13 = var22_22;
                                                        FirebaseEvents.pushProductEvent$default((FirebaseEvents)var10_10, (String)var11_11, var22_22, var25_25, null, var26_26, null);
                                                        if (var5_5 == null) break block218;
                                                        var5_5 = var5_5.getSelected();
                                                        if (var5_5 == null) break block218;
                                                        var5_5 = var5_5.getUrl();
                                                        break block219;
                                                    }
                                                    var24_24 = false;
                                                    var5_5 = null;
                                                }
                                                var6_6 = d23_0.a((String)var5_5, var3_3);
                                                var5_5 = z40_0.Companion;
                                                var10_10 = this.getApplication();
                                                var5_5.getClass();
                                                var5_5 = z40$a.a((Context)var10_10);
                                                var5_5 = var5_5.a;
                                                if (var6_6 == null) ** GOTO lbl624
                                                var10_10 = cp_1.Companion;
                                                var10_10.getClass();
                                                var10_10 = cp$a.e();
                                                var11_11 = "android_pdp_utm_source";
                                                var11_11 = var5_5.b((String)var11_11);
                                                var13_13 = "android_pdp_utm_medium";
                                                var13_13 = var5_5.b((String)var13_13);
                                                var14_14 = "android_pdp_utm_campaign";
                                                var14_14 = var5_5.b(var14_14);
                                                var15_15 = "android_pdp_utm_term";
                                                var15_15 = var5_5.b((String)var15_15);
                                                var16_16 = "android_pdp_utm_content";
                                                var16_16 = var5_5.b((String)var16_16);
                                                var10_10.getClass();
                                                var10_10 = var11_11;
                                                var11_11 = var13_13;
                                                var13_13 = var14_14;
                                                var14_14 = var15_15;
                                                var15_15 = var16_16;
                                                var6_6 = cp_1.c((String)var6_6, (String)var10_10, (String)var11_11, (String)var13_13, var14_14, (String)var16_16);
                                                var10_10 = StringCompanionObject.INSTANCE;
                                                var10_10 = h40_0.a;
                                                var3_3 = h40_0.f0(var1_1);
                                                var10_10 = var22_22.getFnlColorVariantData();
                                                if (var10_10 == null) break block220;
                                                var10_10 = var10_10.getBrandName();
                                                break block221;
                                            }
                                            var19_19 = 0;
                                            var10_10 = null;
                                            var20_20 = 0.0f;
                                        }
                                        var11_11 = new Object[var4_4];
                                        var11_11[0] = var10_10;
                                        var10_10 = Arrays.copyOf(var11_11, (int)var4_4);
                                        var3_3 = String.format(var3_3, (Object[])var10_10);
                                        var10_10 = "format(...)";
                                        Intrinsics.checkNotNullExpressionValue(var3_3, (String)var10_10);
                                        var10_10 = "android_pdp_share_best_price_new";
                                        var19_19 = var5_5.a((String)var10_10);
                                        if (var19_19 == 0) break block222;
                                        var10_10 = var22_22.getPotentialPromotions();
                                        if (var10_10 == null) break block222;
                                        var10_10 = var22_22.getPotentialPromotions();
                                        if (var10_10 == null) break block223;
                                        var19_19 = var10_10.size();
                                        break block224;
                                    }
                                    var19_19 = 0;
                                    var20_20 = 0.0f;
                                    var10_10 = null;
                                }
                                if (var19_19 > 0) {
                                    block226: {
                                        block225: {
                                            var10_10 = var22_22.getPotentialPromotions();
                                            var12_12 = false;
                                            var11_11 = null;
                                            if (var10_10 == null) break block225;
                                            var10_10 = var10_10.get(0);
                                            var10_10 = (ProductPromotion)var10_10;
                                            if (var10_10 == null) break block225;
                                            var20_20 = var10_10.getMaxSavingPrice();
                                            break block226;
                                        }
                                        var19_19 = 0;
                                        var20_20 = 0.0f;
                                        var10_10 = null;
                                    }
                                    var19_19 = (int)((cfr_temp_0 = var20_20 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                    if (var19_19 > 0) {
                                        block230: {
                                            block229: {
                                                block228: {
                                                    var10_10 = var22_22.getPotentialPromotions();
                                                    Intrinsics.checkNotNull(var10_10);
                                                    var10_10 = var10_10.get(0);
                                                    var10_10 = (ProductPromotion)var10_10;
                                                    var20_20 = var10_10.getMaxSavingPrice();
                                                    var19_19 = ok1_1.b(var20_20);
                                                    var20_20 = var19_19;
                                                    var10_10 = Float.valueOf(var20_20);
                                                    var10_10 = qz2_0.m((Float)var10_10);
                                                    var11_11 = new StringBuilder();
                                                    var11_11.append(var3_3);
                                                    var3_3 = " @ ";
                                                    var11_11.append(var3_3);
                                                    var11_11.append((String)var10_10);
                                                    var3_3 = var11_11.toString();
                                                    var10_10 = "android_pdp_share_coupons_new";
                                                    var24_24 = var5_5.a((String)var10_10);
                                                    if (!var24_24) break block227;
                                                    var5_5 = var22_22.getPotentialPromotions();
                                                    if (var5_5 == null) break block228;
                                                    var5_5 = var5_5.get(0);
                                                    var5_5 = (ProductPromotion)var5_5;
                                                    if (var5_5 == null) break block228;
                                                    var5_5 = var5_5.getCode();
                                                    break block229;
                                                }
                                                var24_24 = false;
                                                var5_5 = null;
                                            }
                                            var24_24 = TextUtils.isEmpty((CharSequence)var5_5);
                                            if (var24_24) break block227;
                                            var5_5 = var22_22.getPotentialPromotions();
                                            if (var5_5 == null) break block230;
                                            var5_5 = var5_5.get(0);
                                            var5_5 = (ProductPromotion)var5_5;
                                            if (var5_5 == null) break block230;
                                            var7_7 = var5_5.getCode();
                                        }
                                        var5_5 = var7_7;
                                        var10_10 = new StringBuilder();
                                        var10_10.append(var3_3);
                                        var3_3 = " Apply coupon: ";
                                        var10_10.append(var3_3);
                                        var10_10.append(var7_7);
                                        var3_3 = var10_10.toString();
                                        break block227;
                                    }
                                }
                            }
                            var10_10 = "android_pdp_share_price_new";
                            var24_24 = var5_5.a((String)var10_10);
                            if (!var24_24) break block227;
                            var5_5 = var22_22.getPrice();
                            if (var5_5 == null) break block227;
                            var5_5 = var22_22.getPrice();
                            if (var5_5 == null) break block231;
                            var5_5 = var5_5.getValue();
                            break block232;
                        }
                        var24_24 = false;
                        var5_5 = null;
                    }
                    var24_24 = TextUtils.isEmpty((CharSequence)var5_5);
                    if (var24_24) break block227;
                    var5_5 = var22_22.getPrice();
                    if (var5_5 == null) break block233;
                    var7_7 = var5_5.getValue();
                }
                var5_5 = qz2_0.n(var7_7);
                var10_10 = new StringBuilder();
                var10_10.append(var3_3);
                var3_3 = " @";
                var10_10.append(var3_3);
                var10_10.append((String)var5_5);
                var3_3 = var10_10.toString();
            }
            if (var6_6 == null) ** GOTO lbl624
            var5_5 = this.getApplication();
            var5_5 = z40$a.a((Context)var5_5);
            var5_5 = var5_5.a;
            var10_10 = "android_pdp_share_url_short";
            var24_24 = var5_5.a((String)var10_10);
            if (!var24_24) break block234;
            d23_0.b(var3_3, (String)var6_6, var2_2, var4_4, false);
            ** GOTO lbl624
        }
        var27_27 = new StringBuilder();
        var27_27.append(var3_3);
        var3_3 = "\n\n";
        var27_27.append(var3_3);
        var27_27.append((String)var6_6);
        var3_3 = var27_27.toString();
        var27_27 = var2_2.R0;
        var27_27.k(var3_3);
lbl624:
        // 13 sources

    }

    public final void w(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            ArrayList arrayList = this.C;
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl3;
                Object object = ((ProductOptionVariant)arrayList.get(i3)).getCode();
                boolean bl4 = kotlin.text.b.i(string2, (String)object, bl3 = true);
                if (bl4) {
                    this.E = object = (ProductOptionVariant)arrayList.get(i3);
                    ((ProductOptionVariant)arrayList.get(i3)).setSelected(bl3);
                    this.P = string2;
                    this.Q = object = ((ProductOptionVariant)arrayList.get(i3)).getValue();
                    continue;
                }
                object = (ProductOptionVariant)arrayList.get(i3);
                ((ProductOptionVariant)object).setSelected(false);
            }
            this.B();
        }
    }

    public final void x(String object) {
        int n3;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add((String)object);
            object = md3_0.c(this);
            i12_0 i12_02 = new i12_0(arrayList, null);
            n3 = 3;
            Ae3.d((i90_0)object, null, null, i12_02, n3);
        }
    }

    public final void y() {
        boolean bl2;
        Iterator iterator = this.C.iterator();
        Object object = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(iterator, (String)object);
        while (bl2 = iterator.hasNext()) {
            object = iterator.next();
            Intrinsics.checkNotNullExpressionValue(object, "next(...)");
            object = (ProductOptionVariant)object;
            ((ProductOptionVariant)object).setSelected(false);
        }
    }

    public final void z(String string2) {
        int n3;
        e12_0 e12_02 = this;
        String string3 = string2;
        Intrinsics.checkNotNullParameter(string2, "storeId");
        Object object = this.q;
        if (object != null && (n3 = TextUtils.isEmpty((CharSequence)(object = ((Product)object).getCode()))) == 0) {
            int n4;
            object = new Bundle();
            Object object2 = this.q;
            if (object2 != null) {
                object2 = ((Product)object2).getVerticalColor();
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object3 = "Product_Vertical";
            object.putString((String)object3, (String)object2);
            object2 = e12_02.q;
            if (object2 != null) {
                object2 = ((Product)object2).getBrickCategory();
            } else {
                n4 = 0;
                object2 = null;
            }
            object3 = "Product_Brick";
            object.putString((String)object3, (String)object2);
            object2 = e12_02.q;
            if (object2 != null) {
                object2 = ((Product)object2).getName();
            } else {
                n4 = 0;
                object2 = null;
            }
            object.putString("productName", (String)object2);
            object3 = e12_02.Q;
            object.putString("product_size", (String)object3);
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            AnalyticsData analyticsData = ne_0.b((Bundle)object);
            String string4 = "pdp screen";
            String string5 = null;
            int n7 = 16;
            String string6 = null;
            GTMEvents.pushButtonTapEvent$default((GTMEvents)object3, "Add To Closet", "Add To Closet Button", string4, analyticsData, null, n7, null);
            object2 = e12_02.q;
            object = e12_02.j;
            object3 = ((NewEEcommerceEventsRevamp)object).getEE_ADD_TO_WISHLIST();
            long l2 = 1L;
            Long l3 = l2;
            String string7 = e12_02.Q;
            if (string7 == null) {
                string7 = "NA";
            }
            string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
            string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            analyticsData = null;
            String string8 = "pdp screen";
            string4 = "pdp screen";
            int n8 = 32;
            NewEEcommerceEventsRevamp.pushEEClosetAddToCart$default((NewEEcommerceEventsRevamp)object, (Product)object2, (String)object3, l3, string7, string4, false, string5, string8, string6, string2, n8, null);
            object = e12_02.X;
            object2 = Boolean.TRUE;
            ((LiveData)object).k(object2);
            object = e12_02.q;
            if (object != null && (object = ((Product)object).getCode()) != null && (n4 = ((String)object).length()) > 0) {
                object2 = md3_0.c(this);
                object3 = new e12$b(e12_02, (String)object, string3, null);
                n3 = 3;
                Ae3.d((i90_0)object2, null, null, (Function2)object3, n3);
            }
        }
    }
}

