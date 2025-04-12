/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from RR2
 */
public final class rr2_2
implements Function0 {
    public final Object invoke() {
        kr2_2 kr2_22;
        Object object = z40_0.Companion;
        boolean bl2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("sale_enable");
        boolean bl3 = z40$a.a((Context)AJIOApplication$a.a()).a.a("sale_luxe_enable");
        boolean bl4 = z40$a.a((Context)AJIOApplication$a.a()).a.a("sale_plp_enable");
        boolean bl5 = z40$a.a((Context)AJIOApplication$a.a()).a.a("sale_pdp_enable");
        boolean bl6 = z40$a.a((Context)AJIOApplication$a.a()).a.a("sale_wishlist_enable");
        boolean bl7 = z40$a.a((Context)AJIOApplication$a.a()).a.a("sale_discount_enable");
        String string2 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_header_img_url");
        String string3 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_info_text_pdp");
        String string4 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_header_bg_color");
        String string5 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_header_text_presale");
        String string6 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_header_text_during_sale");
        String string7 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_sub_header_text_during_sale");
        String string8 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_sub_header_text_pre_click");
        String string9 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_sub_header_text_post_click");
        String string10 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_pdp_header_tag");
        object = z40$a.a((Context)AJIOApplication$a.a()).a;
        String string11 = string10;
        String string12 = ((ao0_0)object).b("sale_header_btn_text");
        String string13 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_product_img_url");
        String string14 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_presale_price_coming_soon");
        String string15 = z40$a.a((Context)AJIOApplication$a.a()).a.b("sale_price_text");
        boolean bl8 = z40$a.a((Context)AJIOApplication$a.a()).a.a("sale_home_enable");
        object = kr2_22;
        string11 = string12;
        string12 = string13;
        string13 = string14;
        string14 = string15;
        kr2_22 = new kr2_2(bl2, bl3, bl4, bl5, bl6, bl7, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string15, bl8);
        return kr2_22;
    }
}

