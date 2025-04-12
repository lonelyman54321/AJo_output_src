/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.home.landingpage.widgets.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.home.landingpage.widgets.view.ComponentRecyclerView$a;
import com.ril.ajio.services.data.Home.BannerDetails;
import com.ril.ajio.services.data.Home.NewPageDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComponentRecyclerView
extends FrameLayout
implements r82_0 {
    public String a;
    public String b = "";
    public RecyclerView c;
    public int d;
    public int e;
    public int f;
    public Context g;
    public r82_0 h;
    public String i;
    public boolean j;
    public final ComponentRecyclerView$a k;

    public ComponentRecyclerView(Context context) {
        super(context);
        ComponentRecyclerView$a componentRecyclerView$a;
        this.k = componentRecyclerView$a = new ComponentRecyclerView$a(this);
        this.a(context);
    }

    public ComponentRecyclerView(Context context, AttributeSet object) {
        super(context, object);
        super(this);
        this.k = object;
        this.a(context);
    }

    public ComponentRecyclerView(Context context, AttributeSet object, int n3) {
        super(context, object, n3);
        super(this);
        this.k = object;
        this.a(context);
    }

    private void setLayoutParams(String string2) {
        int n3;
        string2.getClass();
        int n4 = -1;
        int n7 = string2.hashCode();
        switch (n7) {
            default: {
                break;
            }
            case 1766081718: {
                String string3 = "nativeCarousel146x200";
                n3 = (int)(string2.equals(string3) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 5;
                break;
            }
            case 1750759485: {
                String string4 = "nativeCarousel270x70";
                n3 = (int)(string2.equals(string4) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 4;
                break;
            }
            case 1737452567: {
                String string5 = "nativeCarousel136x200";
                n3 = (int)(string2.equals(string5) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 3;
                break;
            }
            case -1618293779: {
                String string6 = "nativeCarousel250x230";
                n3 = (int)(string2.equals(string6) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 2;
                break;
            }
            case -1732811152: {
                String string7 = "nativeCarousel210x196";
                n3 = (int)(string2.equals(string7) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 1;
                break;
            }
            case -2000602172: {
                String string8 = "nativeCarouselRecentlyViewed210x196";
                n3 = (int)(string2.equals(string8) ? 1 : 0);
                if (n3 == 0) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                break;
            }
            case 5: {
                this.e = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_146x200_imv_height);
                this.d = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_146x200_imv_width);
                this.f = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_146x200_imv_padding);
                break;
            }
            case 4: {
                this.e = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_270x70_imv_height);
                this.d = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_270x70_imv_width);
                this.f = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_270x70_imv_padding);
                break;
            }
            case 3: {
                this.e = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_136x200_imv_height);
                this.d = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_136x200_imv_width);
                this.f = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_136x200_imv_padding);
                break;
            }
            case 2: {
                this.e = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_250x230_imv_height);
                this.d = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_250x230_imv_width);
                this.f = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_250x230_imv_padding);
                break;
            }
            case 0: 
            case 1: {
                this.e = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_210x196_imv_height);
                this.d = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_210x196_imv_width);
                this.f = n3 = hv3_0.q(R$dimen.feature_nativeCarousel_210x196_imv_padding);
            }
        }
    }

    public final void La(hp1_2 hp1_22) {
        r82_0 r82_02 = this.h;
        if (r82_02 != null) {
            r82_02.La(hp1_22);
        }
    }

    public final void a(Context object) {
        this.g = object;
        this.j = false;
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.component_recycler_view;
        boolean bl2 = true;
        object = object.inflate(n3, (ViewGroup)this, bl2);
        n3 = R$id.component_recycler_view;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
        Context context = this.g;
        object = new LinearLayoutManager(context, 0, false);
        this.c.setLayoutManager((RecyclerView$o)object);
        this.c.setHasFixedSize(bl2);
        object = this.b;
        this.setLayoutParams((String)object);
    }

    public final void m(String string2) {
    }

    /*
     * Unable to fully structure code
     */
    public void setData(NewPageDetails var1_1) {
        var2_2 = this;
        var3_3 = -1;
        var4_4 = 0;
        var5_5 = null;
        var6_6 = 0;
        var7_7 = null;
        if (var1_1 == null) {
            this.c.setAdapter(null);
            this.c.setVisibility(8);
            return;
        }
        var8_8 = var1_1.getTypeCode();
        this.a = var8_8;
        var8_8 = this.c;
        var9_15 = this.k;
        var8_8.removeOnScrollListener(var9_15);
        this.i = var8_8 = var1_1.getTitle();
        this.c.setVisibility(0);
        var8_8 = this.b;
        var8_8.getClass();
        var10_16 = var8_8.hashCode();
        switch (var10_16) lbl-1000:
        // 4 sources

        {
            default: {
                var11_17 = -1;
                break;
            }
            case -51963681: {
                var12_18 = "nativeFeatureHeroGridCarousel";
                var11_17 = (int)var8_8.equals(var12_18);
                if (var11_17 == 0) ** GOTO lbl-1000
                var11_17 = 2;
                break;
            }
            case -373340233: {
                var12_18 = "nativeFeatureHeroList";
                var11_17 = (int)var8_8.equals(var12_18);
                if (var11_17 == 0) ** GOTO lbl-1000
                var11_17 = 1;
                break;
            }
            case -2000602172: {
                var12_18 = "nativeCarouselRecentlyViewed210x196";
                var11_17 = (int)var8_8.equals(var12_18);
                if (var11_17 == 0) ** GOTO lbl-1000
                var11_17 = 0;
                var8_8 = null;
            }
        }
        switch (var11_17) {
            default: {
                var13_19 = var1_1.getBannerImageDetails();
                var8_8 = var1_1.getImageWidth();
                if (var8_8 == null || (var8_8 = var1_1.getImageHeight()) == null) ** GOTO lbl69
                var8_8 = var1_1.getImageWidth();
                var11_17 = Integer.parseInt((String)var8_8);
                var3_3 = mz3_0.d(var11_17);
                try {
                    var8_8 = var1_1.getImageHeight();
                }
                catch (Exception var8_9) {
                    ** GOTO lbl67
                }
                var11_17 = Integer.parseInt((String)var8_8);
                var4_4 = mz3_0.d(var11_17);
                ** GOTO lbl71
                catch (Exception var8_10) {
                    var3_3 = 0;
                    var14_22 = null;
                }
lbl67:
                // 2 sources

                yn3_0.a((Exception)var8_8);
                ** GOTO lbl71
lbl69:
                // 1 sources

                var3_3 = 0;
                var14_22 = null;
lbl71:
                // 3 sources

                if (var4_4 != 0 && var3_3 != 0) {
                    var2_2.d = var3_3;
                    var2_2.e = var4_4;
                }
                var5_5 = var2_2.g;
                var6_6 = var2_2.d;
                var10_16 = var2_2.e;
                var15_26 = var2_2.f;
                var16_28 = var1_1.getTitle();
                var17_30 = var2_2.a;
                var18_31 = var2_2.b;
                var14_22 = var8_8;
                var19_32 = this;
                var8_8 = new k10_0((Context)var5_5, var6_6, var10_16, var15_26, var13_19, this, var16_28, var17_30, var18_31);
                var14_22 = var2_2.c;
                var14_22.setAdapter((RecyclerView$f)var8_8);
                break;
            }
            case 2: {
                var12_18 = new ArrayList();
                var8_8 = var1_1.getHeroBanner();
                if (var8_8 != null) {
                    var21_37 = var8_8.getImageUrl();
                    var22_38 = var8_8.getPage();
                    var23_39 = var8_8.getUId();
                    var24_40 = var8_8.getUrlLink();
                    var25_41 = var8_8.getHeadLine();
                    var26_42 = var8_8.getQuery();
                    var20_35 = new BannerDetails(var21_37, var22_38, var23_39, var24_40, var25_41, var26_42);
                    var12_18.add(var20_35);
                }
                if ((var8_8 = var1_1.getBannerImageDetails()) != null && (var8_8 = var1_1.getBannerImageDetails()) != null) {
                    var8_8 = var1_1.getBannerImageDetails();
                    var12_18.addAll(var8_8);
                }
                if ((var8_8 = var1_1.getImageWidth()) == null || (var8_8 = var1_1.getImageHeight()) == null) ** GOTO lbl126
                var8_8 = var1_1.getImageWidth();
                var11_17 = Integer.parseInt((String)var8_8);
                var15_27 = mz3_0.d(var11_17);
                try {
                    var8_8 = var1_1.getImageHeight();
                }
                catch (Exception var8_11) {
                    ** GOTO lbl124
                }
                var11_17 = Integer.parseInt((String)var8_8);
                var11_17 = mz3_0.d(var11_17);
                var4_4 = var15_27;
                ** GOTO lbl128
                catch (Exception var8_12) {
                    var15_27 = 0;
                    var20_35 = null;
                }
lbl124:
                // 2 sources

                yn3_0.a((Exception)var8_8);
                var4_4 = var15_27;
lbl126:
                // 2 sources

                var11_17 = 0;
                var8_8 = null;
lbl128:
                // 2 sources

                var13_20 = var2_2.g;
                var19_33 = var2_2.i;
                var16_29 = var2_2.a;
                var20_35 = new RecyclerView$f();
                var20_35.g = var3_3;
                var14_23 = AnalyticsManager.getInstance();
                var14_23.getNewEEcommerceEventsRevamp();
                var20_35.d = var13_20;
                var20_35.a = var12_18;
                var20_35.e = var3_3 = hv3_0.q(R$dimen.nativeFeatureHeroGridCarousel_row_imv_padding);
                var20_35.b = var2_2;
                var20_35.c = null;
                var20_35.f = var19_33;
                var20_35.h = var16_29;
                var20_35.i = var4_4;
                var20_35.j = var11_17;
                var8_8 = var2_2.c;
                var8_8.setAdapter((RecyclerView$f)var20_35);
                break;
            }
            case 1: {
                var7_7 = var1_1.getNativeFeatureHeroListDetails();
                var8_8 = var1_1.getImageWidth();
                if (var8_8 == null || (var8_8 = var1_1.getImageHeight()) == null) ** GOTO lbl177
                var8_8 = var1_1.getImageWidth();
                var11_17 = Integer.parseInt((String)var8_8);
                var3_3 = mz3_0.d(var11_17);
                try {
                    var8_8 = var1_1.getImageHeight();
                }
                catch (Exception var8_13) {
                    ** GOTO lbl171
                }
                var11_17 = Integer.parseInt((String)var8_8);
                var27_43 = var11_17 = mz3_0.d(var11_17);
                var28_44 = var3_3;
                ** GOTO lbl180
                catch (Exception var8_14) {
                    var3_3 = 0;
                    var14_24 = null;
                }
lbl171:
                // 2 sources

                yn3_0.a((Exception)var8_8);
                var28_44 = var3_3;
lbl173:
                // 2 sources

                while (true) {
                    var27_43 = 0;
                    var19_34 = null;
                    ** GOTO lbl180
                    break;
                }
lbl177:
                // 1 sources

                var28_44 = 0;
                var13_21 = null;
                ** continue;
lbl180:
                // 2 sources

                var12_18 = var2_2.i;
                var20_36 = var2_2.a;
                var14_24 = var8_8;
                var5_5 = var7_7;
                var7_7 = this;
                var8_8 = new g41_0((ArrayList)var5_5, this, (String)var12_18, var20_36, var28_44, var27_43);
                var14_24 = var2_2.c;
                var14_24.setAdapter((RecyclerView$f)var8_8);
                break;
            }
            case 0: {
                var8_8 = var1_1.getProducts();
                if (var8_8 == null || (var8_8 = var1_1.getRecentlyViewedProdPrice()) == null) break;
                var14_25 = var1_1.getProducts();
                var5_5 = var1_1.getRecentlyViewedProdPrice();
                var7_7 = var2_2.i;
                var8_8 = new if2_1((List)var14_25, (HashMap)var5_5, (String)var7_7, var2_2);
                var14_25 = var2_2.c;
                var14_25.setAdapter((RecyclerView$f)var8_8);
            }
        }
        var2_2.c.addOnScrollListener(var9_15);
    }

    public void setOnComponentClickListener(r82_0 r82_02) {
        this.h = r82_02;
    }

    public void setTransparentBackground() {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            Resources resources = this.g.getResources();
            int n3 = R$color.transparent;
            int n4 = resources.getColor(n3);
            recyclerView.setBackgroundColor(n4);
        }
    }

    public void setViewType(String string2) {
        this.b = string2;
    }
}

