/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events;

import java.util.Map;
import kotlin.Pair;

public final class Ga4Events {
    public static final int $stable;
    public static final Ga4Events INSTANCE;
    private static final Map gav4DimensionMap;

    static {
        Pair pair;
        Object object = new Ga4Events();
        INSTANCE = object;
        object = new Pair("dimension11", "product_rating");
        Pair pair2 = new Pair("dimension16", "product_mrp");
        Pair pair3 = new Pair("dimension17", "image_search_category");
        Pair pair4 = new Pair("dimension18", "product_level_edd");
        Pair pair5 = new Pair("dimension19", "product_availability_product_deliverable");
        Pair pair6 = new Pair("dimension20", "segment_id_experiment_id");
        Pair pair7 = new Pair("dimension23", "product_size");
        Pair pair8 = new Pair("dimension24", "product_view_type");
        Pair pair9 = new Pair("dimension37", "product_level_deliveryTag");
        Pair pair10 = new Pair("dimension42", "product_tag");
        Pair pair11 = new Pair("dimension43", "product_segment");
        Pair pair12 = new Pair("dimension44", "product_portfolio");
        Pair pair13 = new Pair("dimension45", "product_vertical");
        Pair pair14 = pair = new Pair("dimension46", "product_brick");
        Pair[] pairArray = new Pair("dimension50", "return_window");
        Pair pair15 = pairArray;
        Pair pair16 = pair = new Pair("dimension91", "product_color");
        pairArray = new Pair("dimension92", "product_no_variant");
        Pair pair17 = pairArray;
        Pair pair18 = pair = new Pair("dimension110", "product_catalog_name");
        pairArray = new Pair("dimension111", "product_brand_type_name");
        Pair pair19 = pairArray;
        Pair pair20 = pair = new Pair("dimension131", "product_image_url");
        pairArray = new Pair("dimension139", "bbs_price_reveal_product");
        Pair pair21 = pairArray;
        Pair pair22 = pair = new Pair("dimension145", "product_wishlisted");
        pairArray = new Pair("dimension148", "product_store_type");
        Pair pair23 = pairArray;
        Pair pair24 = pair = new Pair("dimension161", "sticker_name");
        pairArray = new Pair("dimension162", "offer_name");
        Pair pair25 = pairArray;
        Pair pair26 = pair = new Pair("dimension166", "jio_ads_campaign_id");
        pairArray = new Pair("dimension167", "prod_jio_ads_listing");
        Pair pair27 = pairArray;
        Pair pair28 = pair = new Pair("dimension168", "jio_ads_option_code");
        pairArray = new Pair("dimension169", "wishlist_count");
        Pair pair29 = pairArray;
        pair = new Pair("dimension192", "product_trade_discount");
        Object object2 = "dimension66";
        pairArray = new Pair(object2, object2);
        Pair pair30 = pairArray;
        pairArray = "dimension67";
        Object object3 = object2 = new Pair(pairArray, pairArray);
        object2 = "dimension68";
        Pair[] pairArray2 = pairArray = new Pair(object2, object2);
        pairArray = "dimension69";
        Object object4 = object2 = new Pair(pairArray, pairArray);
        object2 = "dimension70";
        Pair[] pairArray3 = pairArray = new Pair(object2, object2);
        pairArray = "dimension71";
        object2 = new Pair(pairArray, pairArray);
        pairArray = new Pair[]{object, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair, pair30, object3, pairArray2, object4, pairArray3, object2};
        gav4DimensionMap = fh1_2.i(pairArray);
        $stable = 8;
    }

    private Ga4Events() {
    }

    public final Map getGav4DimensionMap() {
        return gav4DimensionMap;
    }
}

